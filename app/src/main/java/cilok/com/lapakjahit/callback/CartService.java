package cilok.com.lapakjahit.callback;

import retrofit.Callback;
import retrofit.client.Response;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.POST;
import retrofit.http.PUT;
import retrofit.http.Path;

/**
 * Created by Gilbert on 5/27/2017.
 */

public interface CartService {
    @FormUrlEncoded
    @POST("/carts/add_product/{id_produk}.json")
    void addProductToCart(@Path("id_produk") String id_produk, @Field("quantity") int quantity, Callback<Response>callback);
}
