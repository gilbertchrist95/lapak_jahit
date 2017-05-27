package cilok.com.lapakjahit.tasks;

import android.os.AsyncTask;

import com.android.volley.RequestQueue;

import java.util.ArrayList;

import cilok.com.lapakjahit.callback.GetCustomProductCallback;
import cilok.com.lapakjahit.entity.Custom;
import cilok.com.lapakjahit.extras.CustomUtils;
import cilok.com.lapakjahit.network.VolleySingleton;

/**
 * Created by Gilbert on 5/27/2017.
 */

public class TaskCustomProduct {




    public void getCustomProductDataInBackground(GetCustomProductCallback callback, String[] id_product) {
        new TaskLoadCustomProduct(callback, id_product).execute();
    }

    public class TaskLoadCustomProduct extends AsyncTask<Void, Void, ArrayList<Custom>>{
        GetCustomProductCallback callback;
        private VolleySingleton volleySingleton;
        private RequestQueue requestQueue;
        private String[] id_product;

        public TaskLoadCustomProduct(GetCustomProductCallback callback, String[] id_product){
            this.callback = callback;
            this.id_product = id_product;
            volleySingleton = VolleySingleton.getInstance();
            requestQueue  =volleySingleton.getRequestQueue();
        }


        @Override
        protected ArrayList<Custom> doInBackground(Void... voids) {
            ArrayList<Custom> customProduct = CustomUtils.loadProductFavorites(requestQueue,id_product);
            return customProduct;
        }
    }
}
