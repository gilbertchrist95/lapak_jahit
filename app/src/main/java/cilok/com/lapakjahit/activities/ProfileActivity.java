package cilok.com.lapakjahit.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import cilok.com.lapakjahit.R;
import cilok.com.lapakjahit.callback.UserService;
import cilok.com.lapakjahit.entity.UserInfo;
import cilok.com.lapakjahit.log.L;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ProfileActivity extends AppCompatActivity {

    Button buttonChat;
    String userId, token;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        buttonChat = (Button) findViewById(R.id.button_message);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.bukalapak.com/v2/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        UserService userService = retrofit.create(UserService.class);

        Call<UserInfo>  call = userService.registerNewUser("testgilbert@gmail.com","indonesia0898",
                "Kartini Indon","LapakJahitMenang","LapakJahitMenang","LapakJahitMenang" ,1);
        call.enqueue(new Callback<UserInfo>() {
            @Override
            public void onResponse(Call<UserInfo> call, retrofit2.Response<UserInfo> response) {
                L.m(response.code()+"");
                if (response.isSuccessful()){
                    Toast.makeText(ProfileActivity.this, ""+response.body().getMessage(), Toast.LENGTH_SHORT).show();
                }

            }

            @Override
            public void onFailure(Call<UserInfo> call, Throwable t) {
                L.m("Unable to submit post to BL API");
            }
        });

    }
}
