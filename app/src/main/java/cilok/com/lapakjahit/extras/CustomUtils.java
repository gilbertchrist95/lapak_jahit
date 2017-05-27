package cilok.com.lapakjahit.extras;

import com.android.volley.RequestQueue;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

import cilok.com.lapakjahit.entity.Custom;
import cilok.com.lapakjahit.json.Endpoints;
import cilok.com.lapakjahit.json.Parser;
import cilok.com.lapakjahit.json.Requestor;
import cilok.com.lapakjahit.log.L;
import retrofit.mime.TypedByteArray;

/**
 * Created by Gilbert on 5/27/2017.
 */

public class CustomUtils {
    public static ArrayList<Custom> loadProductFavorites(RequestQueue requestQueue, String [] idProduct){
        ArrayList<Custom> customs = new ArrayList<>();
        for (int i = 0; i < idProduct.length; i++) {
            L.m(idProduct[i]);
            JSONObject responseProductBL = Requestor.requestJSON(requestQueue,Endpoints.getReqestProduct(idProduct[i]),"","");
            JSONObject responseProductCustom = Requestor.requestJSON(requestQueue,"http://ba6a7b4f.ngrok.io/lapakjahit/api/produk_kustom/product?id_produk="+idProduct[i],"","");
//            try {
//                String json =responseProductCustom.getString("id_produk");
//                L.m(json+"json");
//            } catch (JSONException e) {
//                e.printStackTrace();
//            }
            Custom custom = Parser.parseCustomList(responseProductBL,responseProductCustom);
        }

//        JSONObject response = Requestor.requestJSON(requestQueue, Endpoints.getRequestUrlLoadFavorites(),"","");
//        ArrayList<Custom> customProduct = Parser.parseListProducts(response);
//        L.m("Produk length: "+ products.size());
//        return products;
        return customs;
    }
}
