package cilok.com.lapakjahit;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Base64;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.android.volley.AuthFailureError;
import com.android.volley.DefaultRetryPolicy;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

import cilok.com.lapakjahit.controller.UserController;
import cilok.com.lapakjahit.database.User;
import cilok.com.lapakjahit.log.L;
import cilok.com.lapakjahit.network.VolleySingleton;

import static cilok.com.lapakjahit.extras.Keys.EndpointAuthentication.*;

/**
 * Created by User on 12/05/2017.
 */

public class SignUpActivity extends AppCompatActivity implements View.OnClickListener{
    EditText mEditTextEmail, mEditTextNama, mEditTextUsername, mEditTextPassword;
    Button mButtonSignUp;
    User user;
    private UserController userController;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        userController = new UserController(this);

        mEditTextEmail = (EditText) findViewById(R.id.edittext_email_signup);
        mEditTextNama = (EditText) findViewById(R.id.edittext_nama_signup)
        mEditTextUsername = (EditText) findViewById(R.id.edittext_username_signup);
        mEditTextPassword = (EditText) findViewById(R.id.edittext_password_signup);
        mButtonSignUp = (Button) findViewById(R.id.button_sign_in);

        mButtonSignUp.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button_sign_up:
                String email = mEditTextEmail.getText().toString();
                String password = mEditTextPassword.getText().toString();
                if (email.isEmpty() || password.isEmpty()) {
                    showMessageError("Username or password is null");
                } else {
                    authenticate(email, password, new LoginActivity.VolleyCallback() {
                        @Override
                        public void onSuccess(String response) {
                            parsingJson(response);
                        }
                    });
                }
                break;
        }
    }

    private void showMessageError(String message) {
        AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(SignUpActivity.this);
        dialogBuilder.setMessage(message);
        dialogBuilder.setPositiveButton("Ok", null);
        dialogBuilder.show();
    }

    private void parsingJson(String response) {
        try {
            JSONObject jsonObjectUserProfile= new JSONObject(response.toString());
            String status = jsonObjectUserProfile.getString("status");
            L.m(status);
            if (status.toLowerCase().equals("ok")) {
                String userId = jsonObjectUserProfile.getString(KEY_USER_ID);
                String userName = jsonObjectUserProfile.getString(KEY_USER_NAME);
                boolean confirmed = jsonObjectUserProfile.getBoolean(KEY_CONFIRMED);
                String token = jsonObjectUserProfile.getString(KEY_TOKEN);
                String email = jsonObjectUserProfile.getString(KEY_EMAIL);
                String confirmedPhone = jsonObjectUserProfile.getString(KEY_CONFIRMED_PHONE);
                String omniKey = jsonObjectUserProfile.getString(KEY_OMNIKEY);
                user = new User(userId, userName, confirmed, token, email, confirmedPhone, omniKey);

                L.t(getApplicationContext(), "Selamat datang " +userName);
                userController.setUserLoggedIn(true                                                                                                                                                                                         );
                goToMainActivity();

            } else {
                showMessageError(jsonObjectUserProfile.getString(KEY_MESSAGE));
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    private void goToMainActivity() {
        startActivity(new Intent(this, MainActivity.class));
        SignUpActivity.this.finish();
    }

    private void authenticate(final String email, final String password, final LoginActivity.VolleyCallback callback) {
        JsonObjectRequest jsonRequest = new JsonObjectRequest(Request.Method.POST, "https://api.bukalapak.com/v2/users.json", new JSONObject("{"email":"someone@example.com","first_name":"FName","last_na‌​me":"Lname","passwor‌​d":"pass123"}"),
        new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject jsonObject) {
                //call successful
            }
        },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) { //error occur
                    }
                }) {

            @Override
            public Map<String, String> getHeaders() throws AuthFailureError {
                Map<String, String> params = new HashMap<>();
                params.put("Content-Type", "application/json");
                params.put("Accept", "application/json");
                params.put("Accept-Encoding", "utf-8");
                return params;
            }
        };
        jsonRequest.setRetryPolicy(new DefaultRetryPolicy(
                MY_SOCKET_TIMEOUT_MS,
                DefaultRetryPolicy.DEFAULT_MAX_RETRIES,
                DefaultRetryPolicy.DEFAULT_BACKOFF_MULT));
        mRequestQueue.addToRequestQueue(jsonRequest);
    }
}

