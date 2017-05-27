package cilok.com.lapakjahit.callback;

import android.util.Base64;


import com.squareup.okhttp.OkHttpClient;

import java.util.concurrent.TimeUnit;

import cilok.com.lapakjahit.extras.UrlEndpoints;
import cilok.com.lapakjahit.json.Endpoints;
import cilok.com.lapakjahit.log.L;
import retrofit.RequestInterceptor;
import retrofit.RestAdapter;
import retrofit.client.OkClient;

/**
 * Created by Gilbert on 5/26/2017.
 */

public class ServiceGenerator {
    public static final String API_BASE_URL = UrlEndpoints.URL_BL;



    private static RestAdapter.Builder builder = new RestAdapter.Builder()
            .setEndpoint(API_BASE_URL)
            .setClient(new OkClient(new OkHttpClient()));

    public static <S> S createService(Class<S> serviceClass) {
        return createService(serviceClass, null, null);
    }

    public static <S> S createService(Class<S> serviceClass, String username, String password) {
        OkHttpClient client = new OkHttpClient();
        client.setConnectTimeout(100000, TimeUnit.SECONDS);
        client.setReadTimeout(100000, TimeUnit.SECONDS);

        RestAdapter.Builder restAdapter= new RestAdapter.Builder()
                .setEndpoint("https://api.bukalapak.com/v2")
                .setLogLevel(RestAdapter.LogLevel.FULL)
                .setClient(new OkClient(client));
//        L.m(username+":"+password);
        if (username != null && password != null) {
            // concatenate username and password with colon for authentication
            String credentials = username + ":" + password;
            // create Base64 encodet string
            final String basic =
                    "Basic " + Base64.encodeToString(credentials.getBytes(), Base64.NO_WRAP);

            restAdapter.setRequestInterceptor(new RequestInterceptor() {
                @Override
                public void intercept(RequestFacade request) {
                    request.addHeader("Authorization", basic);
//                    request.addHeader("Content-Type", "application/json");
                }
            });
        }
        RestAdapter adapter = restAdapter.build();
        return adapter.create(serviceClass);
    }

    public static <S> S createServiceUploadProduct(Class<S> serviceClass, String username, String password) {
        OkHttpClient client = new OkHttpClient();
        client.setConnectTimeout(100000, TimeUnit.SECONDS);
        client.setReadTimeout(100000, TimeUnit.SECONDS);

        RestAdapter.Builder restAdapter= new RestAdapter.Builder()
                .setEndpoint("https://api.bukalapak.com/v2")
                .setLogLevel(RestAdapter.LogLevel.FULL)
                .setClient(new OkClient(client));
//        L.m(username+":"+password);
        if (username != null && password != null) {
            // concatenate username and password with colon for authentication
            String credentials = username + ":" + password;
            // create Base64 encodet string
            final String basic =
                    "Basic " + Base64.encodeToString(credentials.getBytes(), Base64.NO_WRAP);

            restAdapter.setRequestInterceptor(new RequestInterceptor() {
                @Override
                public void intercept(RequestFacade request) {
                    request.addHeader("Authorization", basic);
                    request.addHeader("Content-Type", "application/json");
                }
            });
        }
        RestAdapter adapter = restAdapter.build();
        return adapter.create(serviceClass);
    }
}
