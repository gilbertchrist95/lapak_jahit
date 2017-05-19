package cilok.com.lapakjahit.activities;
/**
 * Created by Alhaura on 11/05/2017.
 */

import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

import cilok.com.lapakjahit.ImageViewActivity;
import cilok.com.lapakjahit.R;

import java.util.Timer;
import java.util.TimerTask;


public class PreLoginSignUpActivity extends AppCompatActivity implements View.OnClickListener {
    Button login, daftar;

    ViewPager viewPager;
    LinearLayout sliderDotspanel;
    private int dotscount;
    private ImageView[] dots;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pre_login_sign_up);

        login = (Button) findViewById(R.id.button_masuk);
        daftar = (Button) findViewById(R.id.button_daftar);
        login.setOnClickListener(this);
        daftar.setOnClickListener(this);


        viewPager = (ViewPager) findViewById(R.id.pager);

        sliderDotspanel = (LinearLayout) findViewById(R.id.SliderDots);

        ImageViewActivity viewPagerAdapter = new ImageViewActivity(this);

        viewPager.setAdapter(viewPagerAdapter);

        dotscount = viewPagerAdapter.getCount();
        dots = new ImageView[dotscount];

        for (int i = 0; i < dotscount; i++) {

            dots[i] = new ImageView(this);
            dots[i].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.nonactive_dot));

            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);

            params.setMargins(8, 0, 8, 0);

            sliderDotspanel.addView(dots[i], params);

        }

        dots[0].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.active_dot));

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

                for (int i = 0; i < dotscount; i++) {
                    dots[i].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.nonactive_dot));
                }
                dots[position].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.active_dot));
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new MyTimerTask(),

                2000, 4000);

    }


    public class MyTimerTask extends TimerTask {
        @Override
        public void run() {
            PreLoginSignUpActivity.this.runOnUiThread(new Runnable() {
                @Override
                public void run() {

                    if (viewPager.getCurrentItem() == 0) {
                        viewPager.setCurrentItem(1);
                    } else if (viewPager.getCurrentItem() == 1) {
                        viewPager.setCurrentItem(2);
                    } else {
                        viewPager.setCurrentItem(0);
                    }

                }
            });

        }
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button_masuk:
                startActivity(new Intent(this, LoginActivity.class));
                break;
            case R.id.button_daftar:
                startActivity(new Intent(this, SignUpActivity.class));
                break;
        }
    }

}
