package cilok.com.lapakjahit.tasks;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;

import com.android.volley.RequestQueue;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import cilok.com.lapakjahit.callback.GetFavoritesCallback;
import cilok.com.lapakjahit.entity.Product;
import cilok.com.lapakjahit.extras.FavoritesUtils;
import cilok.com.lapakjahit.log.L;
import cilok.com.lapakjahit.network.VolleySingleton;

/**
 * Created by Gilbert on 5/19/2017.
 */

public class TaskFavorite {

    String split[];

        public TaskFavorite(Context context) {



        FileInputStream fileInputStream = null;
        try {
            fileInputStream = context.openFileInput("User.txt");
            InputStreamReader in = new InputStreamReader(fileInputStream);
            BufferedReader bufferedReader = new BufferedReader(in);
            String line = null;
            String str = "";
            while ((line = bufferedReader.readLine()) != null) {
                str += line;
            }
            split = str.split(" ");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public TaskFavorite() {
    }


    public void getFavoritesDataInBackground(GetFavoritesCallback callback) {
        new TaskLoadFavorites(callback, split[0], split[1]).execute();
    }



    public class TaskLoadFavorites extends AsyncTask<Void, Void, ArrayList<Product>> {
        GetFavoritesCallback favoritesCallback;
        private VolleySingleton volleySingleton;
        private RequestQueue requestQueue;
        String userId, token;

        public TaskLoadFavorites(GetFavoritesCallback favoritesCallback, String userId, String token) {
            this.favoritesCallback = favoritesCallback;
            this.userId = userId;
            this.token = token;
            volleySingleton = VolleySingleton.getInstance();
            requestQueue = volleySingleton.getRequestQueue();
        }


        @Override
        protected ArrayList<Product> doInBackground(Void... voids) {
            ArrayList<Product> products = FavoritesUtils.loadProductFavorites(requestQueue, userId, token);
            return products;
        }

        @Override
        protected void onPostExecute(ArrayList<Product> products) {
//            super.onPostExecute(products);
            if (favoritesCallback !=null){
                favoritesCallback.onGetFavoritesLoadedListener(products);
            }
        }
    }
}
