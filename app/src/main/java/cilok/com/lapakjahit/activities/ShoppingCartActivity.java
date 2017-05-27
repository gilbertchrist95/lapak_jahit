package cilok.com.lapakjahit.activities;

import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;

import cilok.com.lapakjahit.R;
import cilok.com.lapakjahit.adapters.AdapterShoppingCart;
import cilok.com.lapakjahit.callback.GetCartCallback;
import cilok.com.lapakjahit.controller.UserController;
import cilok.com.lapakjahit.entity.Cart;
import cilok.com.lapakjahit.tasks.TaskCart;

public class ShoppingCartActivity extends AppCompatActivity implements SwipeRefreshLayout.OnRefreshListener {

    private Toolbar toolbar;
    private ImageView imageViewEmptyCart;
    private UserController userController;
    private SwipeRefreshLayout mSwipeRefreshCart;
    private RecyclerView mListCart;
    private TaskCart taskCart;
    private AdapterShoppingCart mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping_cart);
        Toolbar toolbar = (Toolbar) findViewById(R.id.app_bar_cart);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Keranjang Belanja");
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        imageViewEmptyCart = (ImageView) findViewById(R.id.imageViewEmptyCart);
        mSwipeRefreshCart = (SwipeRefreshLayout) findViewById(R.id.swipeCart);
        mSwipeRefreshCart.setOnRefreshListener(this);
        mListCart = (RecyclerView) findViewById(R.id.listCart);
        mListCart = (RecyclerView) findViewById(R.id.listMessageInbox);
        //set the layout manager before trying to display data
        mListCart.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        mAdapter = new AdapterShoppingCart(getApplicationContext());
        mListCart.setAdapter(mAdapter);


        userController = new UserController(this);

        if (authenticate() == true) {
            mSwipeRefreshCart.setRefreshing(true);
            imageViewEmptyCart.setVisibility(View.GONE);
            taskCart = new TaskCart(this);
            taskCart.getCartDataInBackground(new GetCartCallback() {
                @Override
                public void onGetCartsLoadedListener(ArrayList<Cart> listCarts) {
                    mAdapter.setListCart(listCarts);
                    mSwipeRefreshCart.setRefreshing(false);
                }
            });
        } else {
            mSwipeRefreshCart.setEnabled(false);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_shopping_cart, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        if (id == android.R.id.home) {
            NavUtils.navigateUpFromSameTask(this);
            finish();
        }

        return super.onOptionsItemSelected(item);
    }

    private boolean authenticate() {
        return userController.getUserLoggedIn();
    }


    @Override
    public void onRefresh() {

    }
}
