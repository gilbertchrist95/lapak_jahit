package cilok.com.lapakjahit.extras;

import com.android.volley.RequestQueue;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

import cilok.com.lapakjahit.entity.Product;
import cilok.com.lapakjahit.json.Endpoints;
import cilok.com.lapakjahit.json.Parser;
import cilok.com.lapakjahit.json.Requestor;
import cilok.com.lapakjahit.log.L;

import static cilok.com.lapakjahit.extras.Keys.EndpointAuthentication.KEY_STATUS;

/**
 * Created by Gilbert on 5/12/2017.
 */

public class ProductUtils {
    public static ArrayList<Product> loadProductFashion(RequestQueue requestQueue, String userId, String token, String gender){
        JSONObject response =null;
        if (gender.equals("fashion_pria")){
            response = Requestor.requestJSON(requestQueue, Endpoints.getRequestProductFashionPria(), userId,token);
        }else if (gender.equals("fashion_wanita")){
            response = Requestor.requestJSON(requestQueue, Endpoints.getRequestProductFashionWanita(), userId,token);
        }
//        JSONObject response = response = Requestor.requestJSON(requestQueue, Endpoints.getRequestUrlLoadFavorites(), userId,token);
        ArrayList<Product> products = Parser.parseListProducts(response);
        try {
            L.m("Status: "+ response.getString(KEY_STATUS));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return products;
    }

}
