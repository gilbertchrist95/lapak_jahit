package cilok.com.lapakjahit.tasks;

import android.content.Context;
import android.os.AsyncTask;

import com.android.volley.RequestQueue;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import cilok.com.lapakjahit.callback.GetCartCallback;
import cilok.com.lapakjahit.entity.Cart;
import cilok.com.lapakjahit.extras.CartUtils;
import cilok.com.lapakjahit.network.VolleySingleton;

/**
 * Created by Gilbert on 5/25/2017.
 */

public class TaskCart {
    String split[];

    public TaskCart(Context context) {
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

    public void getFavoritesDataInBackground(GetCartCallback callback) {
        new TaskLoadCarts(callback, split[0], split[1]).execute();
    }

    public class TaskLoadCarts extends AsyncTask<Void, Void, ArrayList<Cart>> {
        GetCartCallback cartCallback;
        private VolleySingleton volleySingleton;
        private RequestQueue requestQueue;
        String userId, token;

        public TaskLoadCarts(GetCartCallback callback, String userId, String token) {
            this.cartCallback = callback;
            this.userId = userId;
            this.token = token;
            volleySingleton = VolleySingleton.getInstance();
            requestQueue  =volleySingleton.getRequestQueue();
        }

        @Override
        protected ArrayList<Cart> doInBackground(Void... voids) {
            ArrayList<Cart> carts = CartUtils.loadCartProduct(requestQueue, userId, token);
            return carts;
        }

        @Override
        protected void onPostExecute(ArrayList<Cart> carts) {
            super.onPostExecute(carts);
            if (cartCallback !=null){
                cartCallback.onGetCartsLoadedListener(carts);
            }
        }
    }
}
