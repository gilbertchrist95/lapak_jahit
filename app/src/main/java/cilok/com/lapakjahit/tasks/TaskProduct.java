package cilok.com.lapakjahit.tasks;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;

import com.android.volley.RequestQueue;

import java.util.ArrayList;

import cilok.com.lapakjahit.callback.GetFavoritesCallback;
import cilok.com.lapakjahit.callback.GetProductCallback;
import cilok.com.lapakjahit.entity.Product;
import cilok.com.lapakjahit.extras.ProductUtils;
import cilok.com.lapakjahit.log.L;
import cilok.com.lapakjahit.network.VolleySingleton;

/**
 * Created by Gilbert on 5/22/2017.
 */

public class TaskProduct {

    private ArrayList<Product> list = new ArrayList<>();
    public TaskProduct(Context context){


    }

    public void getProductInBackground(GetProductCallback callback, String genderProduc){
        new TaskLoadProduct(callback, genderProduc).execute();
        L.m("listttt: "+list.size());
    }



    private class TaskLoadProduct  extends AsyncTask<Void, Void, ArrayList<Product>> {
        GetProductCallback productCallback;
        private VolleySingleton volleySingleton;
        private RequestQueue requestQueue;
        private String genderProduk;
        public TaskLoadProduct(GetProductCallback callback, String genderProduk) {
            this.genderProduk = genderProduk;
            this.productCallback = callback;
            volleySingleton = VolleySingleton.getInstance();
            requestQueue = volleySingleton.getRequestQueue();
        }

        @Override
        protected ArrayList<Product> doInBackground(Void... voids) {
            ArrayList<Product> products = ProductUtils.loadProductFashion(requestQueue, "", "",genderProduk);
            return products;
        }

        @Override
        protected void onPostExecute(ArrayList<Product> products) {
//            super.onPostExecute(products);
            if (productCallback!=null){
                productCallback.onGetProductLoadedListener(products);
            }
            test(products);
        }
    }

    private void test(ArrayList<Product> products) {
        this.list = products;
    }
}
