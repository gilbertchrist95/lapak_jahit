package cilok.com.lapakjahit.extras;

import com.android.volley.RequestQueue;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

import cilok.com.lapakjahit.entity.Custom1;
import cilok.com.lapakjahit.json.Endpoints;
import cilok.com.lapakjahit.json.Parser;
import cilok.com.lapakjahit.json.Requestor;
import cilok.com.lapakjahit.log.L;

import static cilok.com.lapakjahit.extras.Keys.EndpointAuthentication.KEY_STATUS;

/**
 * Created by Gilbert on 5/27/2017.
 */

public class CustomUtils {
    public static ArrayList<Custom1> loadProduct(RequestQueue requestQueue, String [] idProduct){
        ArrayList<Custom1> custom1s = new ArrayList<>();
        for (int i = 0; i < idProduct.length; i++) {
            L.m(idProduct[i]);
            JSONObject responseProductBL = Requestor.requestJSON(requestQueue,Endpoints.getReqestProduct(idProduct[i]),"","");
//            JSONObject responseProductCustom = Requestor.requestJSON(requestQueue,"http://ba6a7b4f.ngrok.io/lapakjahit/api/produk_kustom/product?id_produk="+idProduct[i],"","");
            JSONObject responseProductCustom = Requestor.requestJSON(requestQueue,"http://bda55784.ngrok.io/lapakjahit/api/produk_kustom/product?id_produk="+idProduct[i],"","");
//            try {
//                String json =responseProductBL.toString();
//                L.m(json+"json");
//            } catch (JSONException e) {
//                e.printStackTrace();
//            }
            Custom1 custom1 = Parser.parseCustomList1(responseProductBL,responseProductCustom);
            custom1s.add(custom1);
        }


//        JSONObject response = Requestor.requestJSON(requestQueue, Endpoints.getRequestUrlLoadFavorites(),"","");
//        ArrayList<Custom1> customProduct = Parser.parseListProducts(response);
//        L.m("Produk length: "+ products.size());
//        return products;
        return custom1s;
    }
}
