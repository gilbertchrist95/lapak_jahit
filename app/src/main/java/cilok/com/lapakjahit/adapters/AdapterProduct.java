package cilok.com.lapakjahit.adapters;

import android.content.Context;
import android.content.Intent;
import android.graphics.Paint;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.VolleyError;
import com.android.volley.toolbox.ImageLoader;

import java.util.ArrayList;

import cilok.com.lapakjahit.activities.ProductActivity;
import cilok.com.lapakjahit.R;
import cilok.com.lapakjahit.callback.CartService;
import cilok.com.lapakjahit.callback.ServiceGenerator;
import cilok.com.lapakjahit.entity.Product;
import cilok.com.lapakjahit.extras.Constants;
import cilok.com.lapakjahit.log.L;
import cilok.com.lapakjahit.network.VolleySingleton;
import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;
import retrofit.mime.TypedByteArray;

/**
 * Created by Gilbert on 5/19/2017.
 */

public class AdapterProduct extends RecyclerView.Adapter<AdapterProduct.ViewHolderProduct> {

    static ArrayList<Product> mListFavorite = new ArrayList<>();
    private LayoutInflater mInflater;
    private VolleySingleton mVolleySingleton;
    private ImageLoader mImageLoader;
    private Context mContext;
    static String id;
//    GetProductCallback productCallback;


    public AdapterProduct(Context context) {
        this.mContext = context;
//        productCallback = (GetProductCallback)this.mContext;
        mInflater = LayoutInflater.from(context);
        mVolleySingleton = VolleySingleton.getInstance();
        mImageLoader = mVolleySingleton.getImageLoader();
    }


    public void setListProduk(ArrayList<Product> listFavorite) {
        this.mListFavorite = listFavorite;
        //update the adapter to reflect the new set of favorite
        notifyDataSetChanged();
    }


    @Override
    public ViewHolderProduct onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.custom_favorite, parent, false);
        ViewHolderProduct viewHolderProduct = new ViewHolderProduct(view, mContext);
        return viewHolderProduct;
    }

    @Override
    public void onBindViewHolder(ViewHolderProduct holder, int position) {

//        L.m(position + "");
        final Product currentProduct = mListFavorite.get(position);
        String[] smallImage = currentProduct.getImages();
//        L.m("SMmaal Image: " + smallImage[0]);
        loadImages(smallImage[0], holder);
//        holder.buttonBuy.setOnClickListener(this);
        holder.buttonBuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                L.m("button buy clicked");
                String id_produk = currentProduct.getId();
                CartService cartService = ServiceGenerator.createService(CartService.class, "3051175", "qYFEGyXVlo8uveKXurvJ");
                cartService.addProductToCart(id_produk, 2, new Callback<Response>() {
                    @Override
                    public void success(Response response, Response response2) {
                        String json = new String(((TypedByteArray) response.getBody()).getBytes());
                        L.m(json);
                        Toast.makeText(mContext, ""+json, Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void failure(RetrofitError error) {

                    }
                });
            }
        });
        Product.DealInfoBean dealInfo = currentProduct.getDealInfo();
        Product.RatingBean ratingBean = currentProduct.getRating();
        String rating_average_rate = ratingBean.getAverage_rate();
        int rating_user_count = ratingBean.getUser_count();
        int discount_percentage = dealInfo.getDiscount_percentage();
        long original_price = dealInfo.getOriginal_price();
        long price = currentProduct.getPrice();


        if (rating_average_rate.equals(Constants.NA) == false)
            holder.ratingAverageRate.setRating(Float.parseFloat(rating_average_rate));
        holder.userCount.setText("(" + rating_user_count + ")");

        if (discount_percentage != -1) {
            holder.discountPercentage.setText(" " + discount_percentage + "% ");
            holder.originalPrice.setText(" Rp " + original_price);
            holder.originalPrice.setPaintFlags(holder.originalPrice.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
        } else {
            holder.discountPercentage.setVisibility(View.GONE);
            holder.originalPrice.setText("");
        }

        if (price != -1) {
            holder.discountPrice.setText(" Rp " + price);
        }
        String min_instalmment_price = currentProduct.getMin_installment_price();
        if (min_instalmment_price != Constants.NA) {
            holder.cicilan.setText(min_instalmment_price);
        } else {
            holder.cicilan.setText("");
        }

        if (!currentProduct.isFavorited()) {
            holder.favorite.setVisibility(View.GONE);
        }

        String nama_seller = currentProduct.getSeller_name();
        holder.seller_name.setText(nama_seller);
        holder.nameProduct.setText(currentProduct.getName());
        int percen = 0;
        if (currentProduct.getSeller_positive_feedback() != 0)
            percen = currentProduct.getSeller_positive_feedback() * 100 / (currentProduct.getSeller_positive_feedback() + currentProduct.getSeller_negative_feedback());
        String feedback = percen + "% (" + currentProduct.getSeller_positive_feedback() + "feedback)";
        holder.feedback.setText(feedback);

//        holder.userCount.setText(ratingBean.getUser_count());


//        holder.itemView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//            }
//        });

    }


    private void loadImages(String urlThumbnail, final ViewHolderProduct holder) {
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


    static class ViewHolderProduct extends RecyclerView.ViewHolder implements View.OnClickListener {
        ImageView imageViewProduct;
        Button buttonBuy;
        TextView discountPercentage;
        ImageView favorite;
        TextView originalPrice, discountPrice, cicilan, seller_name, nameProduct, feedback, userCount;
        RatingBar ratingAverageRate;
        private Context context;


        public ViewHolderProduct(View itemView, final Context context) {
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
            ratingAverageRate = (RatingBar) itemView.findViewById(R.id.rating_bar_average_rate);
            itemView.setOnClickListener(this);

        }

        @Override
        public void onClick(View view) {
            int index = getAdapterPosition();
            Product list = mListFavorite.get(index);
            Intent intent = new Intent(context, ProductActivity.class);
            intent.putExtra("PRODUCT", list);
            context.startActivity(intent);

        }
    }
}
