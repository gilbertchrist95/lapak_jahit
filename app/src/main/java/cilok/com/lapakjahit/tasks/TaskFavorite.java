package cilok.com.lapakjahit.tasks;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;

import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import cilok.com.lapakjahit.callback.FavoriteService;
import cilok.com.lapakjahit.callback.GetFavoritesCallback;
import cilok.com.lapakjahit.entity.Favorite;
import cilok.com.lapakjahit.entity.Product;
import cilok.com.lapakjahit.extras.FavoritesUtils;
import cilok.com.lapakjahit.log.L;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Gilbert on 5/19/2017.
 */

public class TaskFavorite {
//    private ProgressDialog progressDialog;
//    private FavoriteService mFavoriteService;
//
//    public TaskFavorite(Context context){
//        progressDialog = new ProgressDialog(context);
//        progressDialog.setCancelable(false);
//        progressDialog.setTitle("Processing");
//        progressDialog.setMessage("Please Wait...");
//
//        mFavoriteService = FavoritesUtils.getFavoitesService();
//    }
//
//
//
//    public void getFavoritesDataInBackground(GetFavoritesCallback callback,Context context){
//        progressDialog.show();
//        new TaskLoadFavorites(callback, context).execute();
//    }
//
//    public TaskFavorite(){}
//
//    public class TaskLoadFavorites extends AsyncTask<Void,Void,List>{
//        GetFavoritesCallback favoritesCallback;
//        Context context;
//
//
//        public TaskLoadFavorites(GetFavoritesCallback favoiritesCallback,Context context) {
//            this.context = context;
//            this.favoritesCallback = favoiritesCallback;
//        }
//
//        @Override
//        protected List doInBackground(Void... params) {
//            final List<Favorite>[] lisr = new ArrayList[1];
//
//            return lisr[0];
//        }
//
////        @Override
////        protected void onPostExecute(String[] status) {
////            progressDialog.dismiss();d(
////                    favoritesCallback.getDataInBackgrounstatus);
////            super.onPostExecute(status);
////        }
//    }
}
