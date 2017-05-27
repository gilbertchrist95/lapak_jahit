package cilok.com.lapakjahit.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import com.android.volley.VolleyError;
import com.android.volley.toolbox.ImageLoader;

import java.util.ArrayList;
import java.util.List;

import cilok.com.lapakjahit.R;
import cilok.com.lapakjahit.entity.Cart;
import cilok.com.lapakjahit.entity.Product;
import cilok.com.lapakjahit.extras.Constants;
import cilok.com.lapakjahit.network.VolleySingleton;

/**
 * Created by Gilbert on 5/27/2017.
 */

public class AdapterShoppingCart extends RecyclerView.Adapter<AdapterShoppingCart.ViewHolderShoppingCart> {
    private List<Cart> listCart = new ArrayList<>();
    private LayoutInflater mInflater;
    private VolleySingleton mVolleySingleton;
    private ImageLoader mImageLoader;
    private Context mContext;

    public AdapterShoppingCart(Context mContext) {
        this.mContext = mContext;
        mInflater = LayoutInflater.from(mContext);
        mVolleySingleton = VolleySingleton.getInstance();
        mImageLoader = mVolleySingleton.getImageLoader();
    }

    public void setListCart(ArrayList<Cart> listCart) {
        this.listCart = listCart;
    }

    @Override
    public ViewHolderShoppingCart onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.custom_cart, parent, false);
        ViewHolderShoppingCart viewHolderShoppingCart = new ViewHolderShoppingCart(view,mContext);
        return  viewHolderShoppingCart;
    }

    @Override
    public void onBindViewHolder(ViewHolderShoppingCart holder, int position) {
        Cart cart = listCart.get(position);
        Cart.SellerBean sellerBean = cart.getSeller();
        List<Cart.InstallmentBeann> installmentBeen = cart.getInstallment();
        holder.textViewNameProduk.setText(sellerBean.getName());


    }

    @Override
    public int getItemCount() {
        return listCart.size();
    }

    private void loadImages(String urlThumbnail, final AdapterShoppingCart.ViewHolderShoppingCart holder) {
        if (!urlThumbnail.equals(Constants.NA)) {
            mImageLoader.get(urlThumbnail, new ImageLoader.ImageListener() {
                @Override
                public void onResponse(ImageLoader.ImageContainer response, boolean isImmediate) {
                    holder.imageViewProduk.setImageBitmap(response.getBitmap());

                }

                @Override
                public void onErrorResponse(VolleyError error) {

                }
            });
        }
    }

    static class ViewHolderShoppingCart extends RecyclerView.ViewHolder implements View.OnClickListener {

        private ImageView imageViewProduk;
        private TextView textViewSellerName, textViewNameProduk, textViewCicilan, textViewHargaProdukm, textViewTotalHarga;
        private Spinner spinnerStokProduk;
        private CheckBox checkBoxCartProduk;

        public ViewHolderShoppingCart(View itemView, Context context) {
            super(itemView);
            imageViewProduk = (ImageView)itemView.findViewById(R.id.image_view_cart_produk);
            textViewSellerName  = (TextView)itemView.findViewById(R.id.nama_pelapak_cart_produk);
            textViewNameProduk = (TextView)itemView.findViewById(R.id.text_view_nama_produck_cart);
            textViewCicilan = (TextView)itemView.findViewById(R.id.text_view_cicilan_cart);
            textViewHargaProdukm = (TextView)itemView.findViewById(R.id.text_view_harga_barang);
            textViewTotalHarga = (TextView)itemView.findViewById(R.id.text_view_total_harga);
            spinnerStokProduk = (Spinner)itemView.findViewById(R.id.spinner_jumlah_stock_cart);
            checkBoxCartProduk = (CheckBox)itemView.findViewById(R.id.check_box_cart_produk);


        }

        @Override
        public void onClick(View view) {

        }
    }
}
