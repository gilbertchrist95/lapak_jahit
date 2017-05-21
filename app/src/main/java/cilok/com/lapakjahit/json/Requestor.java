package cilok.com.lapakjahit.json;

import android.util.Base64;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.RequestFuture;

import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import cilok.com.lapakjahit.controller.UserController;
import cilok.com.lapakjahit.log.L;

/**
 * Created by Gilbert on 5/15/2017.
 */

public class Requestor {
    public static JSONObject requestJSON(RequestQueue requestQueue, String url, final String userId, final String token){
        JSONObject response = null;
        RequestFuture<JSONObject> requestFuture = RequestFuture.newFuture();
        JsonObjectRequest request = new JsonObjectRequest(Request.Method.GET,url,(String)null, requestFuture, requestFuture){
            @Override
            public Map<String, String> getHeaders() throws AuthFailureError{
                try {
                    Map<String, String> map = new HashMap<String, String>();
                    String key = "Authorization";
//                    L.m("UserId :"+userId);
//                    L.m("token: "+ token);
                    String encodedString = Base64.encodeToString(String.format("%s:%s", userId, token).getBytes(), Base64.NO_WRAP);

                    String value = String.format("Basic %s", encodedString);
                    map.put(key, value);
                    return map;
                } catch (Exception e) {
                    L.m("Authentication Failure");
                }
                return super.getHeaders();
            }
        };
        requestQueue.add(request);
        try {
            response = requestFuture.get(30000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            L.m(e + "");
        } catch (ExecutionException e) {
            L.m(e + "");
        } catch (TimeoutException e) {
            L.m(e + "");
        }
//        L.m(response.toString());
        return response;
    }
}
