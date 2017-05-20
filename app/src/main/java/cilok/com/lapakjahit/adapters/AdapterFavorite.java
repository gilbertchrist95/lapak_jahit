package cilok.com.lapakjahit.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.android.volley.VolleyError;
import com.android.volley.toolbox.ImageLoader;

import java.util.ArrayList;

import cilok.com.lapakjahit.R;
import cilok.com.lapakjahit.entity.ProductFavorite;
import cilok.com.lapakjahit.extras.Constants;
import cilok.com.lapakjahit.log.L;
import cilok.com.lapakjahit.network.VolleySingleton;

/**
 * Created by Gilbert on 5/19/2017.
 */

public class AdapterFavorite extends RecyclerView.Adapter<AdapterFavorite.ViewHolderFavorites> {

    private ArrayList<ProductFavorite> mListFavorite = new ArrayList<>();
    private LayoutInflater mInflater;
    private VolleySingleton mVolleySingleton;
    private ImageLoader mImageLoader;
    private int mPreviousPosition = 0;

    public AdapterFavorite(Context context) {
        mInflater = LayoutInflater.from(context);
        mVolleySingleton = VolleySingleton.getInstance();
        mImageLoader = mVolleySingleton.getImageLoader();
    }

    public void setListFavorite(ArrayList<ProductFavorite> listFavorite) {
        this.mListFavorite = listFavorite;
        //update the adapter to reflect the new set of favorite
        notifyDataSetChanged();
    }


    @Override
    public AdapterFavorite.ViewHolderFavorites onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.custom_favorite, parent, false);
        ViewHolderFavorites viewHolderFavorites = new ViewHolderFavorites(view);
        return viewHolderFavorites;
    }

    @Override
    public void onBindViewHolder(AdapterFavorite.ViewHolderFavorites holder, int position) {
        L.m(position + "");
        ProductFavorite currentProduct = mListFavorite.get(position);
        String[] smallImage = currentProduct.getImages();
        L.m("SMmaal Image: " + smallImage[0]);
        loadImages(smallImage[0], holder);

    }

    private void loadImages(String urlThumbnail, final ViewHolderFavorites holder) {
        if (!urlThumbnail.equals(Constants.NA)) {
            mImageLoader.get(urlThumbnail, new ImageLoader.ImageListener() {
                @Override
                public void onResponse(ImageLoader.ImageContainer response, boolean isImmediate) {
                    holder.imageViewProduct.setImageBitmap(response.getBitmap());
                }

                @Override
                public void onErrorResponse(VolleyError error) {

                }
            });
        }
    }

    @Override
    public int getItemCount() {
        return mListFavorite.size();
    }

    static class ViewHolderFavorites extends RecyclerView.ViewHolder {
        ImageView imageViewProduct;

        public ViewHolderFavorites(View itemView) {
            super(itemView);
            imageViewProduct = (ImageView) itemView.findViewById(R.id.imageViewProductFavorit);
        }
    }
}
