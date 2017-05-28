package cilok.com.lapakjahit.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.android.volley.VolleyError;
import com.android.volley.toolbox.ImageLoader;

import java.util.ArrayList;
import java.util.List;

import cilok.com.lapakjahit.R;
import cilok.com.lapakjahit.entity.Custom1;
import cilok.com.lapakjahit.entity.Product;
import cilok.com.lapakjahit.extras.Constants;
import cilok.com.lapakjahit.network.VolleySingleton;

/**
 * Created by Gilbert on 5/28/2017.
 */

public class AdapterCustom1 extends RecyclerView.Adapter<AdapterCustom1.ViewHolderCustom1> {
    private List<Custom1> mListCustom1;
    private Context context;
    private LayoutInflater mInflater;
    private VolleySingleton mVolleySingleton;
    private ImageLoader mImageLoader;

    public AdapterCustom1(Context context){
        this.context = context;
        mInflater = LayoutInflater.from(context);
        mVolleySingleton = VolleySingleton.getInstance();
        mImageLoader = mVolleySingleton.getImageLoader();
    }

    public void setmListCustom1(ArrayList<Custom1> mListCustom1){
        this.mListCustom1 = mListCustom1;
        notifyDataSetChanged();
    }

    @Override
    public ViewHolderCustom1 onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.custom_favorite, parent, false);
        ViewHolderCustom1 viewHolderCustom1 = new ViewHolderCustom1(view, context);
        return viewHolderCustom1;
    }

    @Override
    public void onBindViewHolder(ViewHolderCustom1 holder, int position) {
        Custom1 custom1 = mListCustom1.get(position);
        Product product = custom1.getProduct();
        String[] image = product.getImages();
        loadImages(image[0],holder);

    }

    @Override
    public int getItemCount() {
        return mListCustom1.size();
    }

    private void loadImages(String urlThumbnail, final ViewHolderCustom1 holder) {
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

    static  class ViewHolderCustom1 extends RecyclerView.ViewHolder implements View.OnClickListener
    {

        ImageView imageViewProduct;
        Button buttonBuy;
        TextView discountPercentage;
        ImageView favorite;
        TextView originalPrice, discountPrice, cicilan, seller_name, nameProduct, feedback, userCount;
        RatingBar ratingAverageRate;
        private Context context;
        public ViewHolderCustom1(View itemView, Context context) {
            super(itemView);
            this.context = context;

            imageViewProduct = (ImageView) itemView.findViewById(R.id.imageViewProduct);
            buttonBuy = (Button) itemView.findViewById(R.id.button_buy_product);
            discountPercentage = (TextView) itemView.findViewById(R.id.text_view_diskon);
            favorite = (ImageView) itemView.findViewById(R.id.imageview_favorite);
            originalPrice = (TextView) itemView.findViewById(R.id.text_view_harga_normal);
            discountPrice = (TextView) itemView.findViewById(R.id.text_view_harga_fix);
            cicilan = (TextView) itemView.findViewById(R.id.text_view_cicilan);
            seller_name = (TextView) itemView.findViewById(R.id.text_view_seller_name);
            nameProduct = (TextView) itemView.findViewById(R.id.text_view_name);
            feedback = (TextView) itemView.findViewById(R.id.text_view_persen_feedback);
            userCount = (TextView) itemView.findViewById(R.id.text_view_rating_user_count);
            ratingAverageRate = (RatingBar)itemView.findViewById(R.id.rating_bar_average_rate);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {

        }
    }
}
