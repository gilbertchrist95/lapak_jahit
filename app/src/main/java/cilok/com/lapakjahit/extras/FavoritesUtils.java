package cilok.com.lapakjahit.extras;

import android.content.Context;
import android.widget.Toast;

import com.android.volley.RequestQueue;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import cilok.com.lapakjahit.callback.FavoriteService;
import cilok.com.lapakjahit.entity.ProductFavorite;
import cilok.com.lapakjahit.json.Endpoints;
import cilok.com.lapakjahit.json.Parser;
import cilok.com.lapakjahit.json.Requestor;
import cilok.com.lapakjahit.json.RetrofitClient;
import cilok.com.lapakjahit.log.L;

/**
 * Created by Gilbert on 5/19/2017.
 */

public class FavoritesUtils {

    public static ArrayList<ProductFavorite> loadProductFavorites(RequestQueue requestQueue, String userId, String token){
        JSONObject response = Requestor.requestJSON(requestQueue, Endpoints.getRequestUrlLoadFavorites(), userId,token);
        ArrayList<ProductFavorite> productFavorites = Parser.parseProductFavorites(response);
        L.m("Produk length: "+productFavorites.size());
        return  productFavorites;
    }
}
