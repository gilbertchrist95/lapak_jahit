package cilok.com.lapakjahit.activities;

import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Base64;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.squareup.okhttp.OkHttpClient;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import cilok.com.lapakjahit.R;
import cilok.com.lapakjahit.callback.ImageServicce;
import cilok.com.lapakjahit.callback.ServiceGenerator;
import cilok.com.lapakjahit.entity.ResponseBodytest;
import cilok.com.lapakjahit.log.L;
import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.OkClient;
import retrofit.mime.TypedFile;
//import okhttp3.logging.HttpLoggingInterceptor;
//import retrofit2.Call;
//import retrofit2.Callback;
//import retrofit2.Retrofit;
//import retrofit2.converter.gson.GsonConverterFactory;

public class ProfileActivity extends AppCompatActivity {

    Button buttonChat;
    private Button buttonChoose;
    private Button buttonUpload;

    private ImageView imageView;

    private EditText editTextName;

    private Bitmap bitmap;
    byte[] imageBytes;

    private int PICK_IMAGE_REQUEST = 1;
    Uri filePath;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        buttonChat = (Button) findViewById(R.id.button_message);

//        Retrofit retrofit = new Retrofit.Builder()
//                .baseUrl("https://api.bukalapak.com/v2/")
//                .addConverterFactory(GsonConverterFactory.create())
//                .build();
//        UserService userService = retrofit.create(UserService.class);
//
//        Call<UserInfo>  call = userService.registerNewUser("testgilbert@gmail.com","indonesia0898",
//                "Kartini Indon","LapakJahitMenang","LapakJahitMenang","LapakJahitMenang" ,1);
//        call.enqueue(new Callback<UserInfo>() {
//            @Override
//            public void onResponse(Call<UserInfo> call, retrofit2.Response<UserInfo> response) {
//                L.m(response.code()+"");
//                if (response.isSuccessful()){
//                    Toast.makeText(ProfileActivity.this, ""+response.body().getMessage(), Toast.LENGTH_SHORT).show();
//                }
//
//            }
//
//            @Override
//            public void onFailure(Call<UserInfo> call, Throwable t) {
//                L.m("Unable to submit post to BL API");
//            }
//        });
        buttonChoose = (Button) findViewById(R.id.buttonChoose);
        buttonUpload = (Button) findViewById(R.id.buttonUpload);

        editTextName = (EditText) findViewById(R.id.editText);

        imageView = (ImageView) findViewById(R.id.imageView);

        buttonChoose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showFileChooser();
            }
        });
        buttonUpload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                uploadImage();
            }
        });


    }



    private void uploadImage() {
        L.m("Upload image di jalankan");
        ImageServicce service = ServiceGenerator.createService(ImageServicce.class,"3051175","qYFEGyXVlo8uveKXurvJ");
        TypedFile typedFile = new TypedFile("multipart/form-data", new File("/storage/emulated/0/DCIM/Camera/20170502_091416_1.jpg"));
        OkHttpClient client = new OkHttpClient();

        client.setConnectTimeout(10000, TimeUnit.SECONDS);
        client.setReadTimeout(10000, TimeUnit.SECONDS);


        RestAdapter restAdapter = new RestAdapter.Builder()
                .setEndpoint("https://api.bukalapak.com/v2")
                .setLogLevel(RestAdapter.LogLevel.FULL)
                .setClient(new OkClient(client))
                .build();
//        ImageServicce service = restAdapter.create(ImageServicce.class);
        service.UploadFile(typedFile, new Callback<ResponseBodytest>() {
            @Override
            public void success(ResponseBodytest responseBodytest, retrofit.client.Response response) {
//                if (responseBodytest.getStatus()!=null){
                L.m("respons:" + responseBodytest.getStatus());
//                }
            }

            @Override
            public void failure(RetrofitError error) {
                L.m("error");
            }
        });
    }

    private void showFileChooser() {
        Intent intent = new Intent();
        intent.setType("image/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(Intent.createChooser(intent, "Select Picture"), PICK_IMAGE_REQUEST);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == PICK_IMAGE_REQUEST && resultCode == RESULT_OK && data != null && data.getData() != null) {
            filePath = data.getData();
            L.m("filePath" + ":" + getRealPathFromURI(filePath));
            try {
                //Getting the Bitmap from Gallery
                bitmap = MediaStore.Images.Media.getBitmap(getContentResolver(), filePath);
                //Setting the Bitmap to ImageView
                imageView.setImageBitmap(bitmap);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private String getRealPathFromURI(Uri contentURI) {
        String result;
        Cursor cursor = getContentResolver().query(contentURI, null, null, null, null);
        if (cursor == null) { // Source is Dropbox or other similar local file path
            result = contentURI.getPath();
        } else {
            cursor.moveToFirst();
            int idx = cursor.getColumnIndex(MediaStore.Images.ImageColumns.DATA);
            result = cursor.getString(idx);
            cursor.close();
        }
        return result;
    }

    public String getStringImage(Bitmap bmp) {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
//        bmp.compress(Bitmap.CompressFormat.JPEG, 100, baos);
        imageBytes = baos.toByteArray();
        String encodedImage = Base64.encodeToString(imageBytes, Base64.DEFAULT);
        return encodedImage;
    }

    private ImageServicce imageServicce;


//    private void uploadImage() {
//
//        imageServicce = ImageUtils.getUserService();
//        String encodedString = Base64.encodeToString(String.format("%s:%s", "3051175", "qYFEGyXVlo8uveKXurvJ").getBytes(), Base64.NO_WRAP);
//
//        String value = String.format("Basic %s", encodedString);
//        File file = new File("/storage/emulated/0/DCIM/Camera/20170502_091416_1.jpg");
////        File file2 = new File((filePath));
//        RequestBody reqFile = RequestBody.create(MediaType.parse("multipart/form-data"), file);
//        MultipartBody.Part body = MultipartBody.Part.createFormData("file", file.getName(), reqFile);
//        MultipartBody.Part body2 = MultipartBody.Part.createFormData("file", file.getName(), RequestBody.create(MediaType.parse("image/*"), file));
//        RequestBody name = RequestBody.create(MediaType.parse("image/*"), file);
//        imageServicce.upload(body2).enqueue(new Callback<ResponseBodytest>() {
//            @Override
//            public void onResponse(Call<ResponseBodytest> call, retrofit2.Response<ResponseBodytest> response) {
//                    L.m("IIIIIIIIIIIIIIIII: "+response.body()+"");
////                Toast.makeText(ProfileActivity.this, "this"+response.body().getStatus(), Toast.LENGTH_SHORT).show();
//            }
//
//            @Override
//            public void onFailure(Call<ResponseBodytest> call, Throwable t) {
//
//            }
//        });
//
//
//    }
}
