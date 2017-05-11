package cilok.com.lapakjahit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

import cilok.com.lapakjahit.network.VolleySingleton;

public class LoginActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        final String TAG = "test";

        VolleySingleton volleySingleton = new VolleySingleton();
        RequestQueue requestQueue = volleySingleton.getRequestQueue();
        requestQueue.add(new StringRequest(Request.Method.POST, "https://api.bukalapak.com/v2/authenticate.json", new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Log.e(TAG, "onResponse = \n " + response.toString());
                Toast.makeText(LoginActivity.this, "berhasil", Toast.LENGTH_SHORT).show();
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.e(TAG, "response error \n" + error.networkResponse.statusCode);
            }
        }) {
            @Override
            public Map<String, String> getHeaders() throws AuthFailureError {
                try {
                    Map<String, String> map = new HashMap<String, String>();
                    String key = "Authorization";
                    String encodedString = Base64.encodeToString(String.format("%s:%s", "gilbertchrist95",
                            "primakepos").getBytes(), Base64.NO_WRAP);
                    String value = String.format("Basic %s", encodedString);
                    map.put(key, value);
                    return map;
                } catch (Exception e) {
                    Log.e(TAG, "Authentication Filure");
                }
                return super.getParams();
            }
        });

//        RequestQueue requestQueue = Volley.newRequestQueue(this);
//        StringRequest request = new StringRequest(Request.Method.GET, "http://php.net", new Response.Listener<String>() {
//            @Override
//            public void onResponse(String response) {
//                Toast.makeText(LoginActivity.this, "RESPONSE"+ response, Toast.LENGTH_SHORT).show();
//            }
//        }, new Response.ErrorListener() {
//            @Override
//            public void onErrorResponse(VolleyError error) {
//                Toast.makeText(LoginActivity.this, "RESPONSE"+ error.getMessage(), Toast.LENGTH_SHORT).show();
//            }
//        });
//        requestQueue.add(request);
    }
}
