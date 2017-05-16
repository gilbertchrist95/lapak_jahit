package cilok.com.lapakjahit.activities;

import android.content.Intent;
import android.support.annotation.IdRes;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.OnTabSelectListener;

import cilok.com.lapakjahit.NavigationDrawerFragment;
import cilok.com.lapakjahit.PreLoginSignUpActivity;
import cilok.com.lapakjahit.R;
import cilok.com.lapakjahit.ShoppingCartActivity;
import cilok.com.lapakjahit.controller.UserController;
import cilok.com.lapakjahit.log.L;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private BottomBar bottomBar;
    private UserController userController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = (Toolbar)findViewById(R.id.app_bar); //set home button enabled
        setSupportActionBar(toolbar);

        userController = new UserController(this);

        bottomBar = (BottomBar)findViewById(R.id.bottom_bar);
        bottomBar.setOnTabSelectListener(new OnTabSelectListener() {
            @Override
            public void onTabSelected(@IdRes int tabId) {
                if (tabId == R.id.bottom_tab_home){
                    L.m("Latifah ini Home");
                }
                if (tabId == R.id.bottom_tab_favorite){
                    L.m("Vin in Favorit");
                }
                if (tabId == R.id.bottom_tab_transaction){
                    L.m("Prim ini Transcation");
                }
                if (tabId == R.id.bottom_tab_profile){
//                    L.m("Fi in Profil fi -___-");
                    bukaActivity();
                }
            }
        });

        getSupportActionBar().setHomeButtonEnabled(true);
        NavigationDrawerFragment drawerFragment = (NavigationDrawerFragment) //inisialisasi nego cincai
                getSupportFragmentManager().findFragmentById(R.id.fragment_navigation_drawer);
        drawerFragment.setUp(R.id.fragment_navigation_drawer,(DrawerLayout) findViewById(R.id.drawer_layout),toolbar);


    }

    private void bukaActivity() {
        if (authenticate() == true){
            startActivity(new Intent(this, ProfileActivity.class)); //pindah kelas
        }else{
            startActivity(new Intent(this, PreLoginSignUpActivity.class)); //pindah kelas
        }
//        startActivity(new Intent(this, LoginActivity.class)); //pindah kelas
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.item_belanja){
            startActivity(new Intent(this, ShoppingCartActivity.class)); //pindah kelas
        }

        return super.onOptionsItemSelected(item);
    }

    private boolean authenticate() {
        return userController.getUserLoggedIn();
    }
}
