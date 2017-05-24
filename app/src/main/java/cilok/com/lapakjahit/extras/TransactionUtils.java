package cilok.com.lapakjahit.extras;

import com.android.volley.RequestQueue;

import org.json.JSONObject;

import java.util.ArrayList;

import cilok.com.lapakjahit.entity.Transaction;
import cilok.com.lapakjahit.json.Endpoints;
import cilok.com.lapakjahit.json.Parser;
import cilok.com.lapakjahit.json.Requestor;

/**
 * Created by Gilbert on 5/24/2017.
 */

public class TransactionUtils {
    public static ArrayList<Transaction> loadTransaction(RequestQueue requestQueue, String userId, String token, String typeTranscation){
        JSONObject response = Requestor.requestJSON(requestQueue, Endpoints.getRequestUrlLoadTransactions(), userId,token);
        ArrayList<Transaction> transactions = Parser.parseTransaction(response, typeTranscation, userId);
        return transactions;
    }
}
