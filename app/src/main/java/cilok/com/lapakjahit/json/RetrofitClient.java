package cilok.com.lapakjahit.json;

import android.util.Base64;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import cilok.com.lapakjahit.controller.UserController;

import static cilok.com.lapakjahit.extras.UrlEndpoints.URL_BL;

/**
 * Created by Gilbert on 5/19/2017.
 */

public class RetrofitClient {



    public RetrofitClient() {


    }}

//    private static Retrofit retrofit = null;

//    public static Retrofit getClient() {

//        OkHttpClient okHttpClient = new OkHttpClient().newBuilder().addInterceptor(new Interceptor() {
//            @Override
//            public Response intercept(Chain chain) throws IOException {
//                Request originalRequest = chain.request();
//                String append = "3051175:qYFEGyXVlo8uveKXurvJ";
////                String encodedString = Base64.encodeToString(String.format("%s:%s", "3051175", "qYFEGyXVlo8uveKXurvJ").getBytes(), Base64.NO_WRAP);
////
////                String value = String.format("Basic %s", encodedString);
//                String encodedString = Base64.encodeToString(append.getBytes(), Base64.NO_WRAP);
//                Request.Builder builder = originalRequest.newBuilder().header("Authorization", encodedString);
//
//                Request newRequest = builder.build();
//                return chain.proceed(newRequest);
//            }
//        }).build();
//
//
//        if (retrofit == null) {
//           retrofit  = new Retrofit.Builder()
//                    .baseUrl(URL_BL)
//                   .client(okHttpClient)
//                    .addConverterFactory(GsonConverterFactory.create())
//                    .build();
//        }
//        return retrofit;
//    }

//    public static Retrofit getClient() {
//
////        OkHttpClient okHttpClient = new OkHttpClient().newBuilder().addInterceptor(new Interceptor() {
////            @Override
////            public Response intercept(Chain chain) throws IOException {
////                Request originalRequest = chain.request();
////                String append = "3051175:qYFEGyXVlo8uveKXurvJ";
////                String encodedString = Base64.encodeToString(append.getBytes(), Base64.NO_WRAP);
////                Request.Builder builder = originalRequest.newBuilder().header("Authorization", encodedString);
////
////                Request newRequest = builder.build();
////                return chain.proceed(newRequest);
////            }
////        }).build();
//
//
//        if (retrofit == null) {
//            retrofit = new Retrofit.Builder()
//                    .baseUrl(URL_BL)
//                    .addConverterFactory(GsonConverterFactory.create())
//                    .build();
//        }
//        return retrofit;
//    }
//}
