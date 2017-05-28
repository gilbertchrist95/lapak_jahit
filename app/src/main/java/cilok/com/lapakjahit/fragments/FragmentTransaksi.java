package cilok.com.lapakjahit.fragments;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

import cilok.com.lapakjahit.R;
import cilok.com.lapakjahit.activities.LoginActivity;
import cilok.com.lapakjahit.controller.UserController;
import cilok.com.lapakjahit.json.Endpoints;
import cilok.com.lapakjahit.json.Requestor;
import cilok.com.lapakjahit.log.L;
import cilok.com.lapakjahit.network.VolleySingleton;
import cilok.com.lapakjahit.view.SlidingTabLayout;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentTransaksi extends Fragment {



    private ViewPager mViewPagerTransaksi;
    private SlidingTabLayout mTabsTransakssi;
    static String cobaResponse;

    public FragmentTransaksi() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View layout = inflater.inflate(R.layout.fragment_transaksi, container, false);

        mViewPagerTransaksi = (ViewPager) layout.findViewById(R.id.pager_transaksi);
        mViewPagerTransaksi.setAdapter(new FragmentTransaksi.TransaksiPagerAdapter(getFragmentManager()));
//        mViewPager.setAdapter(new FashionPriaActivity.PriaPagerAdapter(getSupportFragmentManager()));
//
//        // Assiging the Sliding Tab Layout View
        mTabsTransakssi = (SlidingTabLayout) layout.findViewById(R.id.tabs_transaksi);
        mTabsTransakssi.setDistributeEvenly(true);// To make the Tabs Fixed set this true, This makes the tabsTransaksi Space Evenly in Available width
//
//
//
//        // Setting Custom1 Color for the Scroll bar indicator of the Tab View
        mTabsTransakssi.setCustomTabColorizer(new SlidingTabLayout.TabColorizer() {
            @Override
            public int getIndicatorColor(int position) {
                return getResources().getColor(R.color.colorAccent);
            }
        });
//
//        // Setting the ViewPager For the SlidingTabsLayout
        mTabsTransakssi.setViewPager(mViewPagerTransaksi);

//
//            startActivity(new Intent(getActivity().getApplication(), LoginActivity.class));
//            getActivity().finish();
//        }else{
//        String split[] = getUserIdToken();
//        sendJsonRequest(split[0], split[1], new LoginActivity.VolleyCallback() {
//            @Override
//            public void onSuccess(String response) {
//                parseJson(response);
//            }
//        });
//       L.m(cobaResponse);


        return layout;
    }

    private void sendJsonRequest(final String userId, final String token, final LoginActivity.VolleyCallback callback) {
        VolleySingleton volleySingleton = VolleySingleton.getInstance();
        RequestQueue requestQueue = volleySingleton.getRequestQueue();
        L.m(userId + " " + token);
        requestQueue.add(new StringRequest(Request.Method.GET, Endpoints.getRequestUrlLoadTransactions(), new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                callback.onSuccess(response);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                L.m("" + error.networkResponse.statusCode);
            }
        }){
            @Override
            public Map<String, String> getHeaders() throws AuthFailureError {
                try {
                    Map<String, String> map = new HashMap<String, String>();
                    String key = "Authorization";

                    String encodedString = Base64.encodeToString(String.format("%s:%s", userId, token).getBytes(), Base64.NO_WRAP);

                    String value = String.format("Basic %s", encodedString);
                    map.put(key, value);
                    return map;
                } catch (Exception e) {
                    L.m("Authentication Failure");
                }
                return super.getHeaders();
        }});
    }

    private void parseJson(String response) {
        cobaResponse = response;
    }

    private String[] getUserIdToken() {
        String split[] = new String[2];
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = getActivity().openFileInput("User.txt");
            InputStreamReader in = new InputStreamReader(fileInputStream);
            BufferedReader bufferedReader = new BufferedReader(in);
            String line = null;
            String str = "";
            while ((line = bufferedReader.readLine()) != null) {
                str += line;
            }
            split = str.split(" ");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        L.m(split[0] + " " + split[1]);
        return split;
    }




    class TransaksiPagerAdapter extends FragmentPagerAdapter {

        String[] tabsTransaksi;

        public TransaksiPagerAdapter(FragmentManager fm) {
            super(fm);
            tabsTransaksi = getResources().getStringArray(R.array.tabs_transaksi);
        }

        @Override
        public Fragment getItem(int position) {
            if (position == 0) {
                FragmentTransaksiTagihan fragmentTransaksiTagihan = new FragmentTransaksiTagihan();
                return fragmentTransaksiTagihan;
            } else if (position == 1) {
                FragmentTransaksiPembelian fragmentTransaksiPembelian = new FragmentTransaksiPembelian();
                return fragmentTransaksiPembelian;
            } else if (position == 2) {
                FragmentTransaksiPenjualan fragmentTransaksiPenjualan = new FragmentTransaksiPenjualan();
                return fragmentTransaksiPenjualan;
            } else {
                return null;
            }
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return tabsTransaksi[position];
        }

        @Override
        public int getCount() {
            return 3;
        }
    }

    public interface VolleyCallback{
        void onSuccess(String response);
    }

}
