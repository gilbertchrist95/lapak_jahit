package cilok.com.lapakjahit.tasks;

import android.content.Context;
import android.os.AsyncTask;

import com.android.volley.RequestQueue;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import cilok.com.lapakjahit.callback.GetTransactionCallback;
import cilok.com.lapakjahit.entity.Transaction;
import cilok.com.lapakjahit.extras.TransactionUtils;
import cilok.com.lapakjahit.network.VolleySingleton;

/**
 * Created by Gilbert on 5/24/2017.
 */

public class TaskTransaction {
    String split[];

    public TaskTransaction(Context context) {
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = context.openFileInput("User.txt");
            InputStreamReader in = new InputStreamReader(fileInputStream);
            BufferedReader bufferedReader = new BufferedReader(in);
            String line = null;
            String str = "";
            while ((line = bufferedReader.readLine()) != null) {
                str += line;
            }
            split = str.split(" ");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void getTransactionDataInBackground(GetTransactionCallback callback, String typeTransaction) {
        new TaskLoadTransaction(callback, split[0], split[1],typeTransaction).execute();
    }

    public class TaskLoadTransaction extends AsyncTask<Void, Void, ArrayList<Transaction>> {
        GetTransactionCallback transactionCallback;
        private VolleySingleton volleySingleton;
        private RequestQueue requestQueue;
        String userId, token;
        String typeTransaction;

        public TaskLoadTransaction(GetTransactionCallback callback, String userId, String token, String typeTransaction) {
            this.transactionCallback = callback;
            this.userId = userId;
            this.token = token;
            this.typeTransaction = typeTransaction;
            volleySingleton = VolleySingleton.getInstance();
            requestQueue = volleySingleton.getRequestQueue();
        }

        @Override
        protected ArrayList<Transaction> doInBackground(Void... voids) {
            ArrayList<Transaction> listTranscation = TransactionUtils.loadTransaction(requestQueue,userId,token,typeTransaction);
            return listTranscation;
        }

        @Override
        protected void onPostExecute(ArrayList<Transaction> transactions) {
//            super.onPostExecute(transactions);
            if (transactionCallback!=null){
                transactionCallback.onGetTransactionLoadedListener(transactions);
            }
        }
    }
}
