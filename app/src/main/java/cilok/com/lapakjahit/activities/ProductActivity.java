package cilok.com.lapakjahit.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import cilok.com.lapakjahit.R;
import cilok.com.lapakjahit.entity.Product;

public class ProductActivity extends AppCompatActivity {
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);

        toolbar = (Toolbar)findViewById(R.id.app_bar_product); //set home button enabled
        setSupportActionBar(toolbar);
//        toolbar.setTitle("");
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        getSupportActionBar().setDisplayShowTitleEnabled(false);

        Product productID = getIntent().getExtras().getParcelable("PRODUCT");
        Toast.makeText(this, ""+productID.getId(), Toast.LENGTH_SHORT).show();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_product, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        //noinspection SimplifiableIfStatement
        if (id == android.R.id.home)
            finish();
        if (id == cilok.com.lapakjahit.R.id.item_belanja){
            startActivity(new Intent(this, ShoppingCartActivity.class)); //pindah kelas
        }
        return super.onOptionsItemSelected(item);
    }


}
