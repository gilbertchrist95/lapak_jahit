package cilok.com.lapakjahit;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.support.v4.view.PagerAdapter;
import android.content.Context;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.android.volley.toolbox.ImageLoader;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.ExecutionException;

import cilok.com.lapakjahit.entity.Product;

/**
 * Created by Alhaura on 25/05/2017.
 */

public class DetailProductActivity extends PagerAdapter {
    private Context context;
    private LayoutInflater layoutInflater;

    private Integer [] images = {R.drawable.slide1, R.drawable.slide2, R.drawable.slide3};
    private String[] imageUrl;
    private ImageLoader mImageLoader;
    private Bitmap[] bitmaps;
    private View viewLayout;
    private ViewGroup container;
    private ImageView imageView;


    public DetailProductActivity(Context context, String[] imageUrl) {
        this.context = context;
        this.imageUrl = imageUrl;
//        bitmaps= new Bitmap[imageUrl.length];
//        for (int i = 0; i < bitmaps.length; i++) {
//            try {
//                URL url = new URL(imageUrl[i]);
//                bitmaps[i] = BitmapFactory.decodeStream(url.openConnection().getInputStream());
//            } catch (MalformedURLException e) {
//                e.printStackTrace();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//
//        }
    }

    @Override
    public int getCount() {
        return imageUrl.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, final int position) {
            this.container = container;

//        ImageView imageView = (ImageView) view.findViewById(R.id.imageView);



        //Product product = new Product();
        //images = (Integer) product.getImages();

//        imageView.setImageResource(images[position]);
//        imageView.setImageBitmap(bitmaps[position]);

//        ViewPager vp = (ViewPager) container;
//        vp.addView(view, 0);
//        return view;

        DisplayImageBitmap displayImageBitmap = new DisplayImageBitmap();
        displayImageBitmap.execute(imageUrl[position]);
        View result = null;

        try {
            result = displayImageBitmap.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        return  result;
    }

    private class DisplayImageBitmap extends AsyncTask<String, View,View>{

        String path;
        Bitmap bitmap;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            viewLayout = layoutInflater.inflate(R.layout.activity_image_view, container,false);
//            View view = layoutInflater.inflate(R.layout.activity_image_view, null);
        }

        @Override
        protected View doInBackground(String... strings) {
            path = strings[0];
            try {
                bitmap = BitmapFactory.decodeStream((InputStream)new URL(path).getContent());
            } catch (IOException e) {
                e.printStackTrace();
            }
            return viewLayout;
        }

        @Override
        protected void onPostExecute(View view) {
            super.onPostExecute(view);
            imageView = (ImageView) view.findViewById(R.id.imageView);
            imageView.setImageBitmap(bitmap);
            ((ViewPager)container).addView(view);
        }
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {

        ViewPager vp = (ViewPager) container;
        View view = (View) object;
        vp.removeView(view);

    }


}
