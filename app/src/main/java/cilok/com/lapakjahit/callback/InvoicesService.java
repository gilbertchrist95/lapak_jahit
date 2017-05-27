package cilok.com.lapakjahit.callback;

import retrofit.Callback;
import retrofit.client.Response;
import retrofit.http.Body;
import retrofit.http.POST;
import retrofit.mime.TypedInput;

/**
 * Created by Gilbert on 5/27/2017.
 */

public interface InvoicesService {
    @POST("/products.json")
    void createInvoice(@Body TypedInput body, Callback<Response> callback);
}
