package cilok.com.lapakjahit.callback;

import cilok.com.lapakjahit.entity.ResponseBodytest;
import retrofit.Callback;
import retrofit.client.Response;
import retrofit.http.Body;
import retrofit.http.POST;
import retrofit.mime.TypedInput;

/**
 * Created by Gilbert on 5/26/2017.
 */

public interface CreateProductService {
    @POST("/products.json")
    void createProduct(@Body TypedInput body,  Callback<Response> callback);
}
