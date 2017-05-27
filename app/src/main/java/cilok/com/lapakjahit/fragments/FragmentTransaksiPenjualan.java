package cilok.com.lapakjahit.fragments;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import cilok.com.lapakjahit.R;
import cilok.com.lapakjahit.activities.LoginActivity;
import cilok.com.lapakjahit.adapters.AdapterPembelian;
import cilok.com.lapakjahit.adapters.AdapterPenjualan;
import cilok.com.lapakjahit.callback.GetTransactionCallback;
import cilok.com.lapakjahit.controller.UserController;
import cilok.com.lapakjahit.entity.Transaction;
import cilok.com.lapakjahit.tasks.TaskTransaction;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentTransaksiPenjualan extends Fragment implements SwipeRefreshLayout.OnRefreshListener {

    UserController userController;
    ImageView mImageViewBelomLogin;
    TextView mTextViewBelomLogin;
    Button mButtonLogin;

    private static final String STATE_PENJUALAN= "state_penjualan";
    private SwipeRefreshLayout mSwipeRefreshLayoutTransaksiPenjualan;
    //the recylerview containing showing all our message;
    private RecyclerView mRecylerTransactionPenjualan;
    //the TextView containing error messages generated by Volley
    private TextView mTextError;
    private AdapterPenjualan mAdapter;

    public FragmentTransaksiPenjualan() {
        // Required empty public constructor

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View layout =  inflater.inflate(R.layout.fragment_transaksi_penjualan, container, false);
        userController = new UserController(getActivity());
        mButtonLogin = (Button) layout.findViewById(R.id.button_login);
        mButtonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(layout.getContext(), LoginActivity.class);
                startActivity(intent);
            }
        });
        mImageViewBelomLogin = (ImageView) layout.findViewById(R.id.image_view_pic_belom_login);
        mTextViewBelomLogin = (TextView) layout.findViewById(R.id.text_view_belom_login);

        mTextError = (TextView)layout.findViewById(R.id.textErrorTransaksi);
        mSwipeRefreshLayoutTransaksiPenjualan = (SwipeRefreshLayout)layout.findViewById(R.id.swipeTransaksiPenjualan);
        mSwipeRefreshLayoutTransaksiPenjualan.setOnRefreshListener(this);
        mRecylerTransactionPenjualan = (RecyclerView)layout.findViewById(R.id.listPenjualan);
        mRecylerTransactionPenjualan.setLayoutManager(new LinearLayoutManager(getActivity()));
        mAdapter = new AdapterPenjualan(getActivity());
        mRecylerTransactionPenjualan.setAdapter(mAdapter);

        if (authenticate()==true){
            mImageViewBelomLogin.setVisibility(View.GONE);
            mTextViewBelomLogin.setVisibility(View.GONE);
            mButtonLogin.setVisibility(View.GONE);
            mSwipeRefreshLayoutTransaksiPenjualan.setRefreshing(true);
            TaskTransaction taskTransaction;
            taskTransaction = new TaskTransaction(getActivity());
            taskTransaction.getTransactionDataInBackground(new GetTransactionCallback() {
                @Override
                public void onGetTransactionLoadedListener(ArrayList<Transaction> listTransaction) {
//                    L.m("list Pembelian: "+listTransaction.size());
//                    Toast.makeText(getActivity(), ""+listTransaction.size(), Toast.LENGTH_SHORT).show();
//                    mAdapter.setListTransaction(listTransaction);
                    mSwipeRefreshLayoutTransaksiPenjualan.setRefreshing(false);
                }
            },"penjualan");
        }

        return layout;
    }

    private boolean authenticate() {
        return userController.getUserLoggedIn();
    }


    @Override
    public void onRefresh() {
        TaskTransaction taskTransaction;
        taskTransaction = new TaskTransaction(getActivity());
        taskTransaction.getTransactionDataInBackground(new GetTransactionCallback() {
            @Override
            public void onGetTransactionLoadedListener(ArrayList<Transaction> listTransaction) {
//                    L.m("list Pembelian: "+listTransaction.size());
//                    Toast.makeText(getActivity(), ""+listTransaction.size(), Toast.LENGTH_SHORT).show();
//                mAdapter.setListTransaction(listTransaction);
                if (mSwipeRefreshLayoutTransaksiPenjualan.isRefreshing())
                    mSwipeRefreshLayoutTransaksiPenjualan.setRefreshing(false);
            }
        },"penjualan");
    }
}
