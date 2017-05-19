package cilok.com.lapakjahit.activities;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import cilok.com.lapakjahit.R;
import cilok.com.lapakjahit.callback.UserService;
import cilok.com.lapakjahit.controller.UserController;
import cilok.com.lapakjahit.entity.UserInfo;
import cilok.com.lapakjahit.extras.UserUtils;
import cilok.com.lapakjahit.log.L;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by User on 12/05/2017.
 */

public class SignUpActivity extends AppCompatActivity implements View.OnClickListener{
    EditText mEditTextEmail, mEditTextNama, mEditTextUsername, mEditTextPassword;
    CheckBox mCheckBoxLakiLaki, mCheckBoxPerempuan;
    Button mButtonSignUp;
//    ProgressDialog progressDialog;
    private UserService mUserService;
    private UserController userController;
    Toolbar toolbar;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        mUserService = UserUtils.getUserService(this);
        userController = new UserController(this);

        toolbar = (Toolbar)findViewById(R.id.app_bar_login_signup);
        setSupportActionBar(toolbar);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        mEditTextEmail = (EditText) findViewById(R.id.edittext_email_signup);
        mEditTextNama = (EditText) findViewById(R.id.edittext_nama_signup);
        mEditTextUsername = (EditText) findViewById(R.id.edittext_username_signup);
        mEditTextPassword = (EditText) findViewById(R.id.edittext_password_signup);
        mButtonSignUp = (Button) findViewById(R.id.button_sign_up);
        mCheckBoxLakiLaki = (CheckBox)findViewById(R.id.check_box_laki_laki);
        mCheckBoxPerempuan = (CheckBox)findViewById(R.id.check_box_perempuan);

        mButtonSignUp.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button_sign_up:
                String email = mEditTextEmail.getText().toString();
                String nama = mEditTextNama.getText().toString();
                String userName = mEditTextUsername.getText().toString();
                String gender;
                gender = mCheckBoxLakiLaki.isChecked()?"Laki-Laki":"Perempuan";
                String password = mEditTextPassword.getText().toString();
                String passwordConfirmation = password;
                int policy = 1;

                sendregisterNewUser(email,userName, nama,gender,password,passwordConfirmation,policy);

                break;
        }
    }

    private void sendregisterNewUser(String email, String userName, String nama, String gender, String password, String passwordConfirmation, int policy) {
//        progressDialog = new ProgressDialog(getApplicationContext());
//        progressDialog.setCancelable(false);
//        progressDialog.setTitle("Processing");
//        progressDialog.setMessage("Please Wait...");
//        progressDialog.show();
        mUserService.registerNewUser(email,userName,nama,gender,password,passwordConfirmation,policy).enqueue(new Callback<UserInfo>() {
            @Override
            public void onResponse(Call<UserInfo> call, Response<UserInfo> response) {
//                L.m(response.body().getMessage());
//                L.m(response.body().getStatus());
//                L.m(response.body().getToken());
//                L.m(response.body().getUser_id());
                if(response.isSuccessful()){
                    String status = response.body().getStatus();
                    if (status.equals("OK")){
                        FileOutputStream fileOutputStream=null;
                        try {
                            fileOutputStream = openFileOutput("User.txt",MODE_PRIVATE);
                            fileOutputStream.write((response.body().getUser_id()+" ").getBytes());
                            fileOutputStream.write(response.body().getToken().getBytes());
                        } catch (FileNotFoundException e) {
                            e.printStackTrace();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }finally{
                            try {
                                fileOutputStream.close();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                        userController.setUserLoggedIn(true);
                        goToMainActivity();
                    }else{
                        showMessageError(response.body().getMessage());
                    }
                }
            }

            @Override
            public void onFailure(Call<UserInfo> call, Throwable t) {
                L.m("Unable to submit post to BL API");
                showMessageError("Unable to submit post to BL API");
            }
        });

    }

    private void showMessageError(String message) {
//        progressDialog.dismiss();
        AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(SignUpActivity.this);
        dialogBuilder.setMessage(message);
        dialogBuilder.setPositiveButton("Ok", null);
        dialogBuilder.show();
    }



    private void goToMainActivity() {
//        progressDialog.dismiss();
        startActivity(new Intent(this, Main2Activity.class));
        SignUpActivity.this.finish();
    }


}

