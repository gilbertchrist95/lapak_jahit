package cilok.com.lapakjahit.extras;

import com.android.volley.RequestQueue;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

import cilok.com.lapakjahit.entity.Cart;
import cilok.com.lapakjahit.json.Endpoints;
import cilok.com.lapakjahit.json.Parser;
import cilok.com.lapakjahit.json.Requestor;
import cilok.com.lapakjahit.log.L;

/**
 * Created by Gilbert on 5/25/2017.
 */

public class CartUtils {
    public static ArrayList<Cart> loadCartProduct(RequestQueue requestQueue, String userId, String token){
        JSONObject response = Requestor.requestJSON(requestQueue, Endpoints.getRequestUrlLoadCarts(), userId,token);
        try {
            String status = response.getString("status");
            L.m("status: "+status);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        ArrayList<Cart> carts = Parser.parseCarts(response);
        L.m("Carts length: "+ carts.size());
        return carts;
    }
}
