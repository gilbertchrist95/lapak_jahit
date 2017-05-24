package cilok.com.lapakjahit.callback;

import java.util.ArrayList;

import cilok.com.lapakjahit.entity.Product;

/**
 * Created by Gilbert on 5/19/2017.
 */

public interface GetFavoritesCallback {
    public abstract void onGetFavoritesLoadedListener(ArrayList<Product> listFavorites);

}
