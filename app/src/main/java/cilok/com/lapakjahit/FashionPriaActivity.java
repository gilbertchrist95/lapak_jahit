package cilok.com.lapakjahit;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

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
        mTabs = (SlidingTabLayout)findViewById(R.id.tabs);
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
                ProdukPriaActivity mProdukPriaActivity = new ProdukPriaActivity();
                return  mProdukPriaActivity;
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
