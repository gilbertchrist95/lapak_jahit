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
import cilok.com.lapakjahit.tasks.TaskCustomProduct1;

public class ActivityListCustomProduk1 extends AppCompatActivity {
    String url = "http://bda55784.ngrok.io/lapakjahit/api/produk_kustom/product?id_kategori=";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_custom_produk1);
        final int id_category = getIntent().getExtras().getInt("ID_CATEGORY");
        final int tipe_produk = getTipeProduk(id_category);
        L.m("id kategori: "+id_category);
        L.m("tipe_produk: "+tipe_produk);

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
                    requestProduct(tipe_produk, id_produk);


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

    private void requestProduct(int tipe_produk , String[] id_produk) {
        switch (tipe_produk){
            case 1:
                requestProductCategory1(id_produk);
                break;

        }
    }

    private void requestProductCategory1(String[] id_produk) {
        TaskCustomProduct1 taskCustomProduct1 = new TaskCustomProduct1();
        taskCustomProduct1.getCustomProductDataInBackground(new GetCustomProductCallback() {
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
