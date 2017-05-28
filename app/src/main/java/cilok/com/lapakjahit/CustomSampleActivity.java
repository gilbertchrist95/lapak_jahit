package cilok.com.lapakjahit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

import cilok.com.lapakjahit.callback.GetCustomProductCallback;
import cilok.com.lapakjahit.entity.Custom1;
import cilok.com.lapakjahit.network.VolleySingleton;
import cilok.com.lapakjahit.tasks.TaskCustomProduct;

public class CustomSampleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_sample);
        String url = "http://ba6a7b4f.ngrok.io/lapakjahit/api/produk_kustom/product?id_kategori=1&detail=0";
        VolleySingleton volleySingleton = new VolleySingleton();
        RequestQueue requestQueue = volleySingleton.getRequestQueue();

        int id_category = getIntent().getExtras().getInt("ID_CATEGORY");


        Toast.makeText(this, "id:"+id_category, Toast.LENGTH_SHORT).show();
//        requestIdProduct(requestQueue);

    }



    private void requestIdProduct(RequestQueue requestQueue) {
        requestQueue.add(new JsonObjectRequest(Request.Method.POST, "url", new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                try {

                    JSONArray arrayProduk = response.getJSONArray("produk");
                    String[] id_produk = new String[arrayProduk.length()];
                    for (int i = 0; i < arrayProduk.length(); i++) {
                        id_produk[i]=arrayProduk.getJSONObject(i).getString("id_produk");
                    }
                    requestProduct(id_produk);
//                    for (int i = 0; i < id_produk.length; i++) {
//                        L.m(id_produk[i]);
//                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        }));
    }

    private void requestProduct(String[] id_produk) {
        TaskCustomProduct taskCustomProduct = new TaskCustomProduct();
        taskCustomProduct.getCustomProductDataInBackground(new GetCustomProductCallback() {
            @Override
            public void onGetCustomProductLoadedListener(ArrayList<Custom1> listCarts) {

            }
        },id_produk);
    }
}
