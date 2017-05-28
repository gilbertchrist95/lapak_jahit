package cilok.com.lapakjahit.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.OrientationHelper;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import cilok.com.lapakjahit.R;
import cilok.com.lapakjahit.adapters.AdapterHome;
import cilok.com.lapakjahit.controller.CategoryData;
import cilok.com.lapakjahit.view.SliderIklanHome;

import static com.facebook.FacebookSdk.getApplicationContext;

public class FragmentHome extends Fragment {

    ViewPager viewPagerIklan;
    LinearLayout sliderDotspanel;
    private int dotscount;
    private ImageView[] dots;


    public FragmentHome() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View layout = inflater.inflate(R.layout.fragment_main, container, false);

        viewPagerIklan = (ViewPager) layout.findViewById(R.id.pager_iklan);

        sliderDotspanel = (LinearLayout) layout.findViewById(R.id.SliderDots);

        SliderIklanHome sliderIklanHome = new SliderIklanHome(getActivity());

        viewPagerIklan.setAdapter(sliderIklanHome);

        AdapterHome adapterHome = new AdapterHome(CategoryData.getData(),getActivity());

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity(), OrientationHelper.HORIZONTAL,false);

        RecyclerView mRecyclerView = (RecyclerView)layout.findViewById(R.id.listkategorypria);

        mRecyclerView.setLayoutManager(linearLayoutManager);

        mRecyclerView.setAdapter(adapterHome);

        dotscount = sliderIklanHome.getCount();
        dots = new ImageView[dotscount];

        for (int i = 0; i < dotscount; i++) {
            dots[i] = new ImageView(getActivity());
            dots[i].setImageDrawable(ContextCompat.getDrawable(getActivity(), R.drawable.nonactive_dot));
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
            params.setMargins(8, 0, 8, 0);
            sliderDotspanel.addView(dots[i], params);
        }
        dots[0].setImageDrawable(ContextCompat.getDrawable(getContext(), R.drawable.active_dot));
        return layout;
    }


}
