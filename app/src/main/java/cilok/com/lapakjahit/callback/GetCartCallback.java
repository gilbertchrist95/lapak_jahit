package cilok.com.lapakjahit.callback;

import java.util.ArrayList;

import cilok.com.lapakjahit.entity.Cart;

/**
 * Created by Gilbert on 5/25/2017.
 */

public interface GetCartCallback
{
    public abstract void onGetCartsLoadedListener(ArrayList<Cart> listCarts);
}
