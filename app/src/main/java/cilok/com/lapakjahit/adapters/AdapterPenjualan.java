package cilok.com.lapakjahit.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.volley.VolleyError;
import com.android.volley.toolbox.ImageLoader;

import java.util.ArrayList;
import java.util.List;

import cilok.com.lapakjahit.R;
import cilok.com.lapakjahit.entity.Product;
import cilok.com.lapakjahit.entity.Transaction;
import cilok.com.lapakjahit.extras.Constants;
import cilok.com.lapakjahit.network.VolleySingleton;

/**
 * Created by Gilbert on 5/27/2017.
 */

public class AdapterPenjualan extends RecyclerView.Adapter<AdapterPenjualan.ViewHolderTransaksiPenjualan>{
    static ArrayList<Transaction> mListTransaction = new ArrayList<>();
    private LayoutInflater mInflater;
    private VolleySingleton mVolleySingleton;
    private ImageLoader mImageLoader;
    private Context mContext;

    public AdapterPenjualan(Context mContext) {
        this.mContext = mContext;
        mInflater = LayoutInflater.from(mContext);
        mVolleySingleton = VolleySingleton.getInstance();
        mImageLoader = mVolleySingleton.getImageLoader();
    }

    public void setListTransaction(ArrayList<Transaction> listTransaction) {
        this.mListTransaction = listTransaction;
        notifyDataSetChanged();
    }

    @Override
    public ViewHolderTransaksiPenjualan onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.custom_pp, parent, false);
        ViewHolderTransaksiPenjualan viewHolderTransaksiPenjualan = new ViewHolderTransaksiPenjualan(view,mContext);
        return viewHolderTransaksiPenjualan;

    }

    @Override
    public void onBindViewHolder(ViewHolderTransaksiPenjualan holder, int position) {
        Transaction currentTransaction = mListTransaction.get(position);
        holder.textViewState.setText(currentTransaction.getState());
        holder.textViewHarga.setText("Rp " + currentTransaction.getAmount());
        List<Product> product = new ArrayList<>();
        product = currentTransaction.getProducts();
        String[] images = product.get(0).getSmall_images();
        loadImages(images[0],holder);
        holder.textViewNama.setText(product.get(0).getName());
    }

    @Override
    public int getItemCount() {
        return mListTransaction.size();
    }

    private void loadImages(String urlThumbnail, final AdapterPenjualan.ViewHolderTransaksiPenjualan holder) {
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

    static class ViewHolderTransaksiPenjualan extends RecyclerView.ViewHolder implements View.OnClickListener{
        private Context context;
        private ImageView imageViewProduk;
        private TextView textViewNama, textViewState, textViewHarga;

        public ViewHolderTransaksiPenjualan(View itemView, final Context context) {
            super(itemView);
            this.context = context;
            imageViewProduk = (ImageView) itemView.findViewById(R.id.imageview_product_pembelian);
            textViewHarga = (TextView) itemView.findViewById(R.id.textview_harga_produk_pembelian_);
            textViewNama = (TextView) itemView.findViewById(R.id.textview__name_produk_pembelian);
            textViewState = (TextView) itemView.findViewById(R.id.textview__state_produk_pembelian);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            Transaction transaction= mListTransaction.get(getAdapterPosition());
        }
    }
}
