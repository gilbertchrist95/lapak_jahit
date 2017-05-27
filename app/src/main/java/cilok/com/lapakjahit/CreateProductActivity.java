package cilok.com.lapakjahit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.UnsupportedEncodingException;

import cilok.com.lapakjahit.callback.CreateProductService;
import cilok.com.lapakjahit.callback.ServiceGenerator;
import cilok.com.lapakjahit.entity.ResponseBodytest;
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
            CreateProductService createProductService = ServiceGenerator.createServiceUploadProduct(CreateProductService.class, "3051175", "qYFEGyXVlo8uveKXurvJ");
            createProductService.createProduct(in, new Callback<Response>() {
                @Override
                public void success(Response response, Response response2) {
                    L.m("berhasil");
//  L.m("status: "+response.getStatus());
//                    Toast.makeText(CreateProductActivity.this,""+response.getStatus(),Toast.LENGTH_SHORT).
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
            objectProduct.put("category_id", "242");
            objectProduct.put("name", "Indonesia");
            objectProduct.put("new", "true");
            objectProduct.put("price", "1200000");
            objectProduct.put("negotiable", "true");
            objectProduct.put("weight", "5000");
            objectProduct.put("stock", "3");
            objectProduct.put("description_bb", "Sepeda roadbike polygon series helios 200");
            objectProduct.put("free_shipping", "[2,3,4]");
            objectProduct.put("images", "1258801112");
            objectProduct.put("force_insurance", "on");
            jsonObject.put("product", objectProduct);


            return jsonObject;

        } catch (JSONException e) {
            e.printStackTrace();
        }
        return null;
    }
}
