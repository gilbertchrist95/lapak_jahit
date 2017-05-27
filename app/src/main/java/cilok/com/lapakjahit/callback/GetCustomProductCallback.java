package cilok.com.lapakjahit.callback;

import java.util.ArrayList;

import cilok.com.lapakjahit.entity.Custom;

/**
 * Created by Gilbert on 5/27/2017.
 */

public interface GetCustomProductCallback {
    public abstract void onGetCustomProductLoadedListener(ArrayList<Custom> listCarts);
}