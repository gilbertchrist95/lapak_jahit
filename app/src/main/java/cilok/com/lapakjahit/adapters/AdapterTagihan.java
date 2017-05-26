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

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

import cilok.com.lapakjahit.R;
import cilok.com.lapakjahit.entity.Product;
import cilok.com.lapakjahit.entity.Transaction;
import cilok.com.lapakjahit.extras.Constants;
import cilok.com.lapakjahit.network.VolleySingleton;

/**
 * Created by Gilbert on 5/26/2017.
 */

public class AdapterTagihan extends RecyclerView.Adapter<AdapterTagihan.ViewHolderTransaksiTagihan> {
    static ArrayList<Transaction> mListTransaction = new ArrayList<>();
    private LayoutInflater mInflater;
    private VolleySingleton mVolleySingleton;
    private ImageLoader mImageLoader;
    private Context mContext;

    public AdapterTagihan(Context mContext) {
        this.mContext = mContext;
        mInflater = LayoutInflater.from(mContext);
        mVolleySingleton = VolleySingleton.getInstance();
        mImageLoader = mVolleySingleton.getImageLoader();
    }

    public void setmListTransaction(ArrayList<Transaction> listTransaction) {
        this.mListTransaction = listTransaction;
        notifyDataSetChanged();
    }

    @Override
    public AdapterTagihan.ViewHolderTransaksiTagihan onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.custom_tagihan, parent, false);
        ViewHolderTransaksiTagihan viewHolderTagihan = new ViewHolderTransaksiTagihan(view, mContext);
        return viewHolderTagihan;

    }

    @Override
    public void onBindViewHolder(AdapterTagihan.ViewHolderTransaksiTagihan holder, int position) {
        Transaction currentTransaction = mListTransaction.get(position);
        holder.textViewState.setText(currentTransaction.getState());
        holder.textViewHarga.setText("Rp " + currentTransaction.getAmount());
        List<Product> product = new ArrayList<>();
        product = currentTransaction.getProducts();
        String[] images = product.get(0).getSmall_images();
        loadImages(images[0],holder);
        holder.textViewSNamaProduct.setText(product.get(0).getName());

    }

    @Override
    public int getItemCount() {
        return mListTransaction.size();
    }

    private void loadImages(String urlThumbnail, final AdapterTagihan.ViewHolderTransaksiTagihan holder) {
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

    static class ViewHolderTransaksiTagihan extends RecyclerView.ViewHolder implements View.OnClickListener {
        private Context context;
        private ImageView imageViewProduk;
        private TextView textViewHarga;
        private TextView textViewState;
        private TextView textViewSNamaProduct;

        public ViewHolderTransaksiTagihan(View itemView, final Context context) {
            super(itemView);
            this.context = context;
            imageViewProduk = (ImageView) itemView.findViewById(R.id.imageview_product_tagihan);
            textViewHarga = (TextView) itemView.findViewById(R.id.textview_harga_transaksi_tagihan);
            textViewState = (TextView) itemView.findViewById(R.id.textview_status_transaksi);
            textViewSNamaProduct = (TextView)itemView.findViewById(R.id.textview_tagihan_name);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            int index = getAdapterPosition();
            Transaction transaction = mListTransaction.get(index);

        }
    }


}
