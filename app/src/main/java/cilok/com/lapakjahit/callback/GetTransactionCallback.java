package cilok.com.lapakjahit.callback;

import java.util.ArrayList;

import cilok.com.lapakjahit.entity.Transaction;

/**
 * Created by Gilbert on 5/24/2017.
 */

public interface GetTransactionCallback {
    public abstract void onGetTransactionLoadedListener(ArrayList<Transaction> listTransaction);
}
