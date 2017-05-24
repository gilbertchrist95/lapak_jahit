package cilok.com.lapakjahit.adapters;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.volley.VolleyError;
import com.android.volley.toolbox.ImageLoader;

import java.util.ArrayList;
import java.util.List;

import cilok.com.lapakjahit.R;
import cilok.com.lapakjahit.entity.Product;
import cilok.com.lapakjahit.extras.Constants;
import cilok.com.lapakjahit.log.L;
import cilok.com.lapakjahit.network.VolleySingleton;

/**
 * Created by Gilbert on 5/19/2017.
 */

public class AdapterProduct extends RecyclerView.Adapter<AdapterProduct.ViewHolderFavorites> {

    static ArrayList<Product> mListFavorite = new ArrayList<>();
    private LayoutInflater mInflater;
    private VolleySingleton mVolleySingleton;
    private ImageLoader mImageLoader;
    static String id;


    public AdapterProduct(Context context) {
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
    public AdapterProduct.ViewHolderFavorites onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.custom_favorite, parent, false);
        ViewHolderFavorites viewHolderFavorites = new ViewHolderFavorites(view);
        return viewHolderFavorites;
    }

    @Override
    public void onBindViewHolder(AdapterProduct.ViewHolderFavorites holder, int position) {

        L.m(position + "");
        Product currentProduct = mListFavorite.get(position);
        String[] smallImage = currentProduct.getImages();
        L.m("SMmaal Image: " + smallImage[0]);
        loadImages(smallImage[0], holder);
//        holder.buttonBuy.setOnClickListener(this);
        holder.buttonBuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                L.m("button buy clicked");
            }
        });
        Product.DealInfoBean dealInfo = currentProduct.getDealInfo();
        Product.RatingBean ratingBean = currentProduct.getRating();
        int discount_percentage = dealInfo.getDiscount_percentage();
        long original_price = currentProduct.getPrice();
        L.m(discount_percentage + "");
        if (discount_percentage != -1) {
            holder.discountPercentage.setText(" " + discount_percentage + "% ");
        } else {
            holder.discountPercentage.setVisibility(View.GONE);
        }

        if (original_price != -1) {
            holder.discountPrice.setText(" Rp " + original_price);
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
        id = position + "";

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


    static class ViewHolderFavorites extends RecyclerView.ViewHolder implements View.OnClickListener {
        ImageView imageViewProduct;
        Button buttonBuy;
        TextView discountPercentage;
        ImageView favorite;
        TextView originalPrice, discountPrice, cicilan, seller_name, nameProduct, feedback, userCount;


        public ViewHolderFavorites(View itemView) {
            super(itemView);
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
            itemView.setOnClickListener(this);

        }

        @Override
        public void onClick(View view) {
            int index = getAdapterPosition();
            Product list  = mListFavorite.get(index);
            L.m("AAAAAA: "+list.getId());
//            String a = id;
//            Intent intent = new Intent();
//            intent.putExtra("aaa",list);
        }
    }
}
