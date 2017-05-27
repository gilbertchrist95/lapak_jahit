package cilok.com.lapakjahit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.UnsupportedEncodingException;

import cilok.com.lapakjahit.callback.CreateProductService;
import cilok.com.lapakjahit.callback.ServiceGenerator;
import cilok.com.lapakjahit.log.L;
import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;
import retrofit.mime.TypedByteArray;
import retrofit.mime.TypedInput;

public class CreateProductActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_product);

        JSONObject jsonObject = createJSONObject();
        String a = jsonObject.toString();
        Toast.makeText(this, a, Toast.LENGTH_SHORT).show();
        L.m(a);
        TypedInput in = null;

        try {
            in = new TypedByteArray("application/json", a.getBytes("UTF-8"));
//            in = new TypedByteArray("application/json", jsonObject.toString().getBytes());
            CreateProductService createProductService = ServiceGenerator.createServiceUploadProduct(CreateProductService.class, "11933736", "Oef4ya4sv73cwA5yzL4V");
//
//            OkHttpClient client = new OkHttpClient();
//            client.setConnectTimeout(100000, TimeUnit.SECONDS);
//            client.setReadTimeout(100000, TimeUnit.SECONDS);
//
//            RestAdapter.Builder restAdapter= new RestAdapter.Builder()
//                    .setEndpoint("https://api.bukalapak.com/v2")
//                    .setLogLevel(RestAdapter.LogLevel.FULL);
//            String credentials = "3051175" + ":" + "qYFEGyXVlo8uveKXurvJ";
//            // create Base64 encodet string
//            final String basic =
//                    "Basic " + Base64.encodeToString(credentials.getBytes(), Base64.NO_WRAP);
//
//            restAdapter.setRequestInterceptor(new RequestInterceptor() {
//                @Override
//                public void intercept(RequestFacade request) {
//                    request.addHeader("Authorization", basic);
//                    request.addHeader("Content-Type", "application/json");
//                }
//            });
//
//            RestAdapter adapter = restAdapter.build();
//            CreateProductService createProductService = adapter.create(CreateProductService.class);
            createProductService.createProduct(in, new Callback<Response>() {
                @Override
                public void success(Response response, Response response2) {
                    L.m("berhasil");
                    String json =new String (((TypedByteArray)response.getBody()).getBytes());
                    L.m(json);
                }

                @Override
                public void failure(RetrofitError error) {

                }
            });
        } catch (UnsupportedEncodingException e1) {
            e1.printStackTrace();
        }
    }


    private JSONObject createJSONObject() {
        try {
            JSONObject jsonObject = new JSONObject();
            JSONObject objectProduct = new JSONObject();
            objectProduct.put("category_id", "2411");
            objectProduct.put("name", "Iphone 6s 12GB");
            objectProduct.put("new", "true");
            objectProduct.put("price", "12000000");
            objectProduct.put("negotiable", "true");
            objectProduct.put("weight", "5000");
            objectProduct.put("stock", "3");
            objectProduct.put("description_bb", "Sepeda roadbike polygon series heliosroadbike polygon series helios 200");
//            objectProduct.put("free_shipping", "[2,3,4]");

            jsonObject.put("product", objectProduct);
            jsonObject.put("images", "1258801112");
            jsonObject.put("force_insurance", "on");

            return jsonObject;

        } catch (JSONException e) {
            e.printStackTrace();
        }
        return null;
    }
}
