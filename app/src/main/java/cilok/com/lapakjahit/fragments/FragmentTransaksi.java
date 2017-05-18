package cilok.com.lapakjahit.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import cilok.com.lapakjahit.CustomPriaActivity;
import cilok.com.lapakjahit.R;
import cilok.com.lapakjahit.tabs.SlidingTabLayout;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentTransaksi extends Fragment {

    private ViewPager mViewPagerTransaksi;
    private SlidingTabLayout mTabsTransakssi;

    public FragmentTransaksi() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View layout = inflater.inflate(R.layout.fragment_transaksi, container, false);

        mViewPagerTransaksi = (ViewPager)layout.findViewById(R.id.pager_transaksi);
        mViewPagerTransaksi.setAdapter(new FragmentTransaksi.TransaksiPagerAdapter(getFragmentManager()));
//        mViewPager.setAdapter(new FashionPriaActivity.PriaPagerAdapter(getSupportFragmentManager()));
//
//        // Assiging the Sliding Tab Layout View
        mTabsTransakssi = (SlidingTabLayout)layout.findViewById(R.id.tabs_transaksi);
        mTabsTransakssi.setDistributeEvenly(true);// To make the Tabs Fixed set this true, This makes the tabsTransaksi Space Evenly in Available width
//
//
//
//        // Setting Custom Color for the Scroll bar indicator of the Tab View
        mTabsTransakssi.setCustomTabColorizer(new SlidingTabLayout.TabColorizer() {
            @Override
            public int getIndicatorColor(int position) {
                return getResources().getColor(R.color.colorAccent);
            }
        });
//
//        // Setting the ViewPager For the SlidingTabsLayout
        mTabsTransakssi.setViewPager(mViewPagerTransaksi);



        return layout;
    }



    class TransaksiPagerAdapter extends FragmentPagerAdapter {

        String[] tabsTransaksi;

        public TransaksiPagerAdapter(FragmentManager fm) {
            super(fm);
            tabsTransaksi = getResources().getStringArray(R.array.tabs_transaksi);
        }

        @Override
        public Fragment getItem(int position) {
            if (position==0){
                FragmentTransaksiPembelian fragmentTransaksiPembelian = new FragmentTransaksiPembelian();
                return fragmentTransaksiPembelian;
            }else if (position==1){
                FragmentTransaksiTagihan fragmentTransaksiTagihan = new FragmentTransaksiTagihan();
                return fragmentTransaksiTagihan;
            }else if (position==2){
                FragmentTransaksiPenjualan fragmentTransaksiPenjualan = new FragmentTransaksiPenjualan();
                return fragmentTransaksiPenjualan;
            }else{
                return null;
            }
        }

        @Override
        public CharSequence getPageTitle(int position){
            return tabsTransaksi[position];
        }

        @Override
        public int getCount() {
            return 3;
        }
    }
}
