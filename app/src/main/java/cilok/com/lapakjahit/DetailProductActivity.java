package cilok.com.lapakjahit;

import android.support.v4.view.PagerAdapter;
import android.content.Context;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import cilok.com.lapakjahit.entity.Product;

/**
 * Created by Alhaura on 25/05/2017.
 */

public class DetailProductActivity extends PagerAdapter {
    private Context context;
    private LayoutInflater layoutInflater;

    private Integer [] images = {R.drawable.slide1, R.drawable.slide2, R.drawable.slide3};
    //private Integer [] images = {};

    public DetailProductActivity(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, final int position) {

        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.activity_image_view, null);
        ImageView imageView = (ImageView) view.findViewById(R.id.imageView);

        //Product product = new Product();
        //images = (Integer) product.getImages();

        imageView.setImageResource(images[position]);


        ViewPager vp = (ViewPager) container;
        vp.addView(view, 0);
        return view;

    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {

        ViewPager vp = (ViewPager) container;
        View view = (View) object;
        vp.removeView(view);

    }
}
