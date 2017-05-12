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
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
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

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {
    EditText mEditTextEmail, mEditTextPassword;
    Button mButtonLogin;
    User user;
    private UserController userController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        userController = new UserController(this);

        mEditTextEmail = (EditText) findViewById(R.id.edittext_email);
        mEditTextPassword = (EditText) findViewById(R.id.edittext_password);
        mButtonLogin = (Button) findViewById(R.id.button_sign_in);

        mButtonLogin.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button_sign_in:
                String email = mEditTextEmail.getText().toString();
                String password = mEditTextPassword.getText().toString();
                if (email.isEmpty() || password.isEmpty()) {
                    showMessageError("Username or password is null");
                } else {
                    authenticate(email, password, new VolleyCallback() {
                        @Override
                        public void onSuccess(String response) {
                           parsingJson(response);
                        }
                    });
                }
                break;
        }
    }




    private void authenticate(final String email, final String password, final VolleyCallback callback) {
        VolleySingleton volleySingleton = new VolleySingleton();
        RequestQueue requestQueue = volleySingleton.getRequestQueue();

        requestQueue.add(new StringRequest(Request.Method.POST, "https://api.bukalapak.com/v2/authenticate.json", new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                callback.onSuccess(response);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                L.m("" + error.networkResponse.statusCode);
            }
        }) {
            @Override
            public Map<String, String> getHeaders() throws AuthFailureError {
                try {
                    Map<String, String> map = new HashMap<String, String>();
                    String key = "Authorization";

                    String encodedString = Base64.encodeToString(String.format("%s:%s", email, password).getBytes(), Base64.NO_WRAP);

                    String value = String.format("Basic %s", encodedString);
                    map.put(key, value);
                    return map;
                } catch (Exception e) {
                    L.m("Authentication Failure");
                }
                return super.getHeaders();
            }
        });
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
        LoginActivity.this.finish();
    }


    private void showMessageError(String message) {
        AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(LoginActivity.this);
        dialogBuilder.setMessage(message);
        dialogBuilder.setPositiveButton("Ok", null);
        dialogBuilder.show();
    }

    public interface VolleyCallback{
        void onSuccess(String response);
    }
}
