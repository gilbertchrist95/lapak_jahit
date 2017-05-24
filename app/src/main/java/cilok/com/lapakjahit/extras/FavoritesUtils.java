package cilok.com.lapakjahit.extras;

import com.android.volley.RequestQueue;

import org.json.JSONObject;

import java.util.ArrayList;

import cilok.com.lapakjahit.entity.Product;
import cilok.com.lapakjahit.json.Endpoints;
import cilok.com.lapakjahit.json.Parser;
import cilok.com.lapakjahit.json.Requestor;
import cilok.com.lapakjahit.log.L;

/**
 * Created by Gilbert on 5/19/2017.
 */

public class FavoritesUtils {

    public static ArrayList<Product> loadProductFavorites(RequestQueue requestQueue, String userId, String token){
        JSONObject response = Requestor.requestJSON(requestQueue, Endpoints.getRequestUrlLoadFavorites(), userId,token);
        ArrayList<Product> products = Parser.parseProductFavorites(response);
        L.m("Produk length: "+ products.size());
        return products;
    }
}
