package cilok.com.lapakjahit.fragments;
/**
 * Created by Alhaura on 28/05/2017.
 */

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.util.Timer;
import java.util.TimerTask;

import cilok.com.lapakjahit.R;
import cilok.com.lapakjahit.view.SliderIklanHome;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentHome extends Fragment {

    ViewPager viewPagerIklan;
    LinearLayout sliderDotspanel;
    private int dotscount;
    private ImageView[] dots;

    public FragmentHome() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View layout = inflater.inflate(R.layout.fragment_main, container, false);

        viewPagerIklan = (ViewPager) layout.findViewById(R.id.pager_iklan);

        sliderDotspanel = (LinearLayout) layout.findViewById(R.id.SliderDots);

        SliderIklanHome sliderIklanHome = new SliderIklanHome(getActivity());

        viewPagerIklan.setAdapter(sliderIklanHome);

        dotscount = sliderIklanHome.getCount();
        dots = new ImageView[dotscount];

        for (int i = 0; i < dotscount; i++) {

            dots[i] = new ImageView(getActivity());
            dots[i].setImageDrawable(ContextCompat.getDrawable(getActivity().getApplicationContext(), R.drawable.nonactive_dot));

            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);

            params.setMargins(8, 0, 8, 0);

            sliderDotspanel.addView(dots[i], params);

        }
        dots[0].setImageDrawable(ContextCompat.getDrawable(getActivity().getApplicationContext(), R.drawable.active_dot));

        viewPagerIklan.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

                for (int i = 0; i < dotscount; i++) {
                    dots[i].setImageDrawable(ContextCompat.getDrawable(getActivity().getApplicationContext(), R.drawable.nonactive_dot));
                }
                dots[position].setImageDrawable(ContextCompat.getDrawable(getActivity().getApplicationContext(), R.drawable.active_dot));
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new MyTimerTask(),

                2000, 4000);

        return layout;
    }

    public class MyTimerTask extends TimerTask {
        @Override
        public void run() {
            getActivity().runOnUiThread(new Runnable() {
                @Override
                public void run() {

                    if (viewPagerIklan.getCurrentItem() == 0) {
                        viewPagerIklan.setCurrentItem(1);
                    } else if (viewPagerIklan.getCurrentItem() == 1) {
                        viewPagerIklan.setCurrentItem(2);
                    } else {
                        viewPagerIklan.setCurrentItem(0);
                    }

                }
            });

        }
    }

}
