package cilok.com.lapakjahit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import cilok.com.lapakjahit.log.L;

public class PreLoginSignUpActivity extends AppCompatActivity implements View.OnClickListener {

    Button login, daftar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pre_login_sign_up);

        login = (Button)findViewById(R.id.button_masuk);
        daftar = (Button)findViewById(R.id.button_daftar);
        login.setOnClickListener(this);
        daftar.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button_masuk:
                startActivity(new Intent(this, LoginActivity.class));
                break;
            case R.id.button_daftar:
                L.t(getApplicationContext(), "ontheway");
                break;
        }
    }
}
