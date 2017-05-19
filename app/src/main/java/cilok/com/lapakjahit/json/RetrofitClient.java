package cilok.com.lapakjahit.json;

import android.util.Base64;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import cilok.com.lapakjahit.controller.UserController;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static cilok.com.lapakjahit.extras.UrlEndpoints.URL_BL;

/**
 * Created by Gilbert on 5/19/2017.
 */

public class RetrofitClient {



    public RetrofitClient() {


    }

//    private static Retrofit retrofit = null;

    public static Retrofit getClient(final String userId, final String token) {

        OkHttpClient okHttpClient = new OkHttpClient().newBuilder().addInterceptor(new Interceptor() {
            @Override
            public Response intercept(Chain chain) throws IOException {
                Request originalRequest = chain.request();
                String append = "3051175:qYFEGyXVlo8uveKXurvJ";
                String encodedString = Base64.encodeToString(append.getBytes(), Base64.NO_WRAP);
                Request.Builder builder = originalRequest.newBuilder().header("Authorization", encodedString);

                Request newRequest = builder.build();
                return chain.proceed(newRequest);
            }
        }).build();


//        if (retrofit == null) {
            Retrofit retrofit  = new Retrofit.Builder()
                    .baseUrl(URL_BL)
                    .client(okHttpClient)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
//        }
        return retrofit;
    }
}
