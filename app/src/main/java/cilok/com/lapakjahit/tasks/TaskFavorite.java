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
import cilok.com.lapakjahit.entity.ProductFavorite;
import cilok.com.lapakjahit.extras.FavoritesUtils;
import cilok.com.lapakjahit.log.L;
import cilok.com.lapakjahit.network.VolleySingleton;

/**
 * Created by Gilbert on 5/19/2017.
 */

public class TaskFavorite {
    private ProgressDialog progressDialog;
    String split[];

    public TaskFavorite(Context context) {
        progressDialog = new ProgressDialog(context);
        progressDialog.setCancelable(false);
        progressDialog.setTitle("Processing");
        progressDialog.setMessage("Please Wait...");

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

        L.m("UserId: " + split[0]);
    }

    public TaskFavorite() {
    }


    public void getFavoritesDataInBackground(GetFavoritesCallback callback) {
        progressDialog.show();
        new TaskLoadFavorites(callback, split[0], split[1]).execute();
        progressDialog.dismiss();
    }


    public class TaskLoadFavorites extends AsyncTask<Void, Void, ArrayList<ProductFavorite>> {
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
        protected ArrayList<ProductFavorite> doInBackground(Void... voids) {
            ArrayList<ProductFavorite> productFavorites = FavoritesUtils.loadProductFavorites(requestQueue, userId, token);
            return productFavorites;
        }

        @Override
        protected void onPostExecute(ArrayList<ProductFavorite> productFavorites) {
//            super.onPostExecute(productFavorites);
            if (favoritesCallback !=null){
                favoritesCallback.onGetFavoritesLoadedListener(productFavorites);
            }
        }
    }
}
