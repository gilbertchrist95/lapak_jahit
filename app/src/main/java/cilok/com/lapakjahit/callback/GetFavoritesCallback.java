package cilok.com.lapakjahit.callback;

import java.util.ArrayList;

import cilok.com.lapakjahit.entity.ProductFavorite;

/**
 * Created by Gilbert on 5/19/2017.
 */

public interface GetFavoritesCallback {
    public abstract void onGetFavoritesLoadedListener(ArrayList<ProductFavorite> listFavorites);

}
