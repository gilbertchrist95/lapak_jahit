package cilok.com.lapakjahit.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import cilok.com.lapakjahit.R;
import cilok.com.lapakjahit.entity.CategoryType;
import cilok.com.lapakjahit.log.L;

import static cilok.com.lapakjahit.entity.CategoryType.CATEGORY_TYPE;
import static cilok.com.lapakjahit.entity.CategoryType.TITLE_TYPE;

/**
 * Created by Gilbert on 5/27/2017.
 */

public class AdapterHome extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private List<CategoryType> mList;
    private Context context;
    private LayoutInflater mInflater;

    public AdapterHome(List<CategoryType> mList, Context context) {
        this.context = context;
        mInflater = LayoutInflater.from(context);
        this.mList = mList;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view;
        switch (viewType) {
            case TITLE_TYPE:
                view = mInflater.inflate(R.layout.header_item_kategori, parent, false);
                return new TitleViewHolder(view);
            case CATEGORY_TYPE:
                view = mInflater.inflate(R.layout.custom_kategori_home, parent, false);
                return new CategoryViewHolder(view);
        }
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        CategoryType categoryType = mList.get(position);
        if (categoryType != null) {
            switch (categoryType.getmType()) {
                case TITLE_TYPE:
                    ((TitleViewHolder)holder).textViewHeader.setText(categoryType.getmTitle());
                    break;
                case CATEGORY_TYPE:
                    L.m(categoryType.getmTitle());
                    ((CategoryViewHolder)holder).textViewKategori.setText(categoryType.getmTitle());
                    break;
            }
        }
    }

    @Override
    public int getItemCount() {
        if (mList == null)
            return 0;
        return mList.size();
    }

    @Override
    public int getItemViewType(int position) {
        if (mList != null) {
            CategoryType object = mList.get(position);
            if (object != null) {
                return object.getmType();
            }
        }
        return 0;
    }

    public static class TitleViewHolder extends RecyclerView.ViewHolder {
        private TextView textViewHeader;


        public TitleViewHolder(View view) {
            super(view);
            textViewHeader = (TextView) view.findViewById(R.id.txtHeader);
        }
    }

    private class CategoryViewHolder extends RecyclerView.ViewHolder {
        private TextView textViewKategori;
        private ImageView imageViewKategori;
        public CategoryViewHolder(View view) {
            super(view);
            textViewKategori = (TextView)view.findViewById(R.id.text_view_kategori111);
            imageViewKategori = (ImageView)view.findViewById(R.id.image_view_kategori);
        }
    }
}
