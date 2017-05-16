package cilok.com.lapakjahit.activities;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import cilok.com.lapakjahit.CustomPriaActivity;
import cilok.com.lapakjahit.fragments.FragmentProdukPria;
import cilok.com.lapakjahit.R;
import cilok.com.lapakjahit.tabs.SlidingTabLayout;


public class FashionPriaActivity extends AppCompatActivity {

    private ViewPager mViewPager;
    private SlidingTabLayout mTabs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fashion_pria);

        Toolbar toolbar = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Fashion Pria");
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        mViewPager = (ViewPager)findViewById(R.id.pager);
        mViewPager.setAdapter(new PriaPagerAdapter(getSupportFragmentManager()));

        // Assiging the Sliding Tab Layout View
        mTabs = (SlidingTabLayout)findViewById(R.id.tabs);
        mTabs.setDistributeEvenly(true);// To make the Tabs Fixed set this true, This makes the tabs Space Evenly in Available width



        // Setting Custom Color for the Scroll bar indicator of the Tab View
        mTabs.setCustomTabColorizer(new SlidingTabLayout.TabColorizer() {
            @Override
            public int getIndicatorColor(int position) {
                return getResources().getColor(R.color.colorAccent);
            }
        });

        // Setting the ViewPager For the SlidingTabsLayout
        mTabs.setViewPager(mViewPager);

    }

    class PriaPagerAdapter extends FragmentPagerAdapter{

        String[] tabs;

        public PriaPagerAdapter(FragmentManager fm) {
            super(fm);
            tabs = getResources().getStringArray(R.array.tabs);
        }

        @Override
        public Fragment getItem(int position) {
            if (position==0){
                FragmentProdukPria mFragmentProdukPria = new FragmentProdukPria();
                return mFragmentProdukPria;
            }else if (position==1){
                CustomPriaActivity mCustomPriaActivity = new CustomPriaActivity();
                return mCustomPriaActivity;
            }else{
                return null;
            }
        }

        @Override
        public CharSequence getPageTitle(int position){
            return tabs[position];
        }

        @Override
        public int getCount() {
            return 2;
        }
    }


}
