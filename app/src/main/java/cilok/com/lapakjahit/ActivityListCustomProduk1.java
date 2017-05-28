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
import cilok.com.lapakjahit.log.L;
import cilok.com.lapakjahit.network.VolleySingleton;
import cilok.com.lapakjahit.tasks.TaskCustomProduct;

public class ActivityListCustomProduk1 extends AppCompatActivity {
    TaskCustomProduct taskCustomProduct = new TaskCustomProduct();
    String url = "http://bda55784.ngrok.io/lapakjahit/api/produk_kustom/product?id_kategori=1&detail=0";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_custom_produk1);
        int id_category = getIntent().getExtras().getInt("ID_CATEGORY");
        int tipe_produk = getTipeProduk(id_category);
        Toast.makeText(this, "cat: " + tipe_produk, Toast.LENGTH_SHORT).show();

        VolleySingleton volleySingleton = new VolleySingleton();
        RequestQueue requestQueue = volleySingleton.getRequestQueue();
        requestQueue.add(new JsonObjectRequest(Request.Method.POST, url, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                try {
                    JSONArray arrayProduk = response.getJSONArray("produk");
                    String[] id_produk = new String[arrayProduk.length()];
                    for (int i = 0; i < arrayProduk.length(); i++) {
                        id_produk[i] = arrayProduk.getJSONObject(i).getString("id_produk");
                        L.m("Id produk: " + id_produk[i]);
                    }
                    requestProduct(id_produk);
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
//                Toast.makeText(ActivityListCustokmProduk1.this, "custom1: "+listCarts.size(), Toast.LENGTH_SHORT).show();
            }
        }, id_produk);
    }

    private int getTipeProduk(int id_category) {
        int typeProduk;
        switch (id_category){
            case 6:
                typeProduk = 2;
                break;
            case 7:
                typeProduk = 2;
                break;
            case 8:
                typeProduk =  4;
                break;
            default:
                typeProduk = 1;
                break;
        }
        return typeProduk;
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}
