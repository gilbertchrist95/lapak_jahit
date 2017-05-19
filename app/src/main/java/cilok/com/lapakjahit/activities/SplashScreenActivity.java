package cilok.com.lapakjahit.activities;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import cilok.com.lapakjahit.R;

public class SplashScreenActivity extends AppCompatActivity {

    private static int SPLASH_TIME_OUT = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen); //tampilan awal
        TextView logo = (TextView)findViewById(R.id.text_logo); //inisialisasi dari si logo di xmlnya
        logo.setTextSize(100);
        Typeface custom_font = Typeface.createFromAsset(getAssets(),  "fonts/Paralucent.ttf");
        logo.setTypeface(custom_font,Typeface.BOLD);

    }

    @Override
    protected void onStart() {
        super.onStart();
        new Handler().postDelayed(new Runnable() {
            /*
             * Showing splash screen with a timer. This will be useful when you
             * want to show case your app logo / company
             */
            @Override
            public void run() {
                // This method will be executed once the timer is over
                // Start your app main activity
                startActivity(new Intent(SplashScreenActivity.this, Main2Activity.class));
                SplashScreenActivity.this.finish();
            }
        }, SPLASH_TIME_OUT);
    }
}
