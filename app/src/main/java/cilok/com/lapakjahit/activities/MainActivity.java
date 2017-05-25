package cilok.com.lapakjahit.activities;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import cilok.com.lapakjahit.NavigationDrawerFragment;
import cilok.com.lapakjahit.controller.UserController;
import cilok.com.lapakjahit.fragments.FragmentFavorit;
import cilok.com.lapakjahit.fragments.FragmentHome;
import cilok.com.lapakjahit.fragments.FragmentProfile;
import cilok.com.lapakjahit.fragments.FragmentTransaksi;
import cilok.com.lapakjahit.view.BottomNavigationViewHelper;


public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private Fragment fragment;
    private FragmentManager fragmentManager;
    private UserController userController;


    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case cilok.com.lapakjahit.R.id.navigation_home:
                    fragment = new FragmentHome();
                    break;
                case cilok.com.lapakjahit.R.id.navigation_favorit:
                    fragment = new FragmentFavorit();
                    break;
                case cilok.com.lapakjahit.R.id.navigation_transaksi:
                    fragment = new FragmentTransaksi();
                    break;
                case cilok.com.lapakjahit.R.id.navigation_profil:
                    if(authenticate() == false){
                        bukaPreSignUpSignIn();
                        break;
                    }
                    else {
                        fragment = new FragmentProfile();
                        break;
                    }
            }
            final FragmentTransaction transaction = fragmentManager.beginTransaction();
            transaction.replace(cilok.com.lapakjahit.R.id.main_container, fragment).commit();
            return true;
        }
    };

    private void bukaPreSignUpSignIn() {
        startActivity(new Intent(this, PreLoginSignUpActivity.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(cilok.com.lapakjahit.R.layout.activity_main);

        toolbar = (Toolbar)findViewById(cilok.com.lapakjahit.R.id.app_bar); //set home button enabled
        setSupportActionBar(toolbar);

        BottomNavigationView navigation = (BottomNavigationView) findViewById(cilok.com.lapakjahit.R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
//        BottomNavigationMenuView menuView = (BottomNavigationMenuView) navigation.getChildAt(0);
        BottomNavigationViewHelper.disableShiftMode(navigation);
//        for (int i = 0; i < menuView.getChildCount(); i++) {
//            BottomNavigationItemView itemView = (BottomNavigationItemView) menuView.getChildAt(i);
//            itemView.setShiftingMode(false);
//            itemView.setChecked(false);
//        }

        fragmentManager = getSupportFragmentManager();
        fragment = new FragmentHome();
        final FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.add(cilok.com.lapakjahit.R.id.main_container, fragment).commit();

        userController = new UserController(this);

        getSupportActionBar().setHomeButtonEnabled(true);
        NavigationDrawerFragment drawerFragment = (NavigationDrawerFragment) //inisialisasi nego cincai
                getSupportFragmentManager().findFragmentById(cilok.com.lapakjahit.R.id.fragment_navigation_drawer);
        drawerFragment.setUp(cilok.com.lapakjahit.R.id.fragment_navigation_drawer,(DrawerLayout) findViewById(cilok.com.lapakjahit.R.id.drawer_layout),toolbar);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(cilok.com.lapakjahit.R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        //noinspection SimplifiableIfStatement
        if (id == cilok.com.lapakjahit.R.id.item_belanja){
            startActivity(new Intent(this, ShoppingCartActivity.class)); //pindah kelas
        }
        return super.onOptionsItemSelected(item);
    }

    private boolean authenticate() {
        return userController.getUserLoggedIn();
    }

}
