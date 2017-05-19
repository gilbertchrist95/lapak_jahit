package cilok.com.lapakjahit.json;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static cilok.com.lapakjahit.extras.UrlEndpoints.URL_BL;

/**
 * Created by Gilbert on 5/19/2017.
 */

public class RetrofitClient {

    private static Retrofit retrofit = null;

    public static Retrofit getClient(){
        if(retrofit==null){
            retrofit = new Retrofit.Builder()
                    .baseUrl(URL_BL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
