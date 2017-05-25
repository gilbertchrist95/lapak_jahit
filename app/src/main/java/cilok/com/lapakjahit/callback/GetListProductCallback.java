package cilok.com.lapakjahit.callback;

import java.util.ArrayList;

import cilok.com.lapakjahit.entity.Product;

/**
 * Created by Gilbert on 5/22/2017.
 */

public interface GetListProductCallback {
    public abstract void onGetListProductLoadedListener(ArrayList<Product> listProduct);
}
