package cilok.com.lapakjahit.extras;

import com.android.volley.RequestQueue;

import org.json.JSONObject;

import java.util.ArrayList;

import cilok.com.lapakjahit.application.MyApplication;
import cilok.com.lapakjahit.database.DBInboxMessage;
import cilok.com.lapakjahit.entity.InboxMessage;
import cilok.com.lapakjahit.json.Endpoints;
import cilok.com.lapakjahit.json.Parser;
import cilok.com.lapakjahit.json.Requestor;
import cilok.com.lapakjahit.log.L;

/**
 * Created by Gilbert on 5/14/2017.
 */

public class MessageUtils {
    public static ArrayList<InboxMessage> loadInboxMessage(RequestQueue requestQueue){
        JSONObject response = Requestor.requestInboxMessageJSON(requestQueue, Endpoints.getRequestUrlInboxMessage());
//        L.m(response.toString());
        ArrayList<InboxMessage> listInbox = Parser.parseMessageInboxJson(response);
        MyApplication.getWritableInboxDatabase().insertInboxMessage(DBInboxMessage.INBOX_MESSAGE, listInbox, true);
//        L.m(listInbox.toString());
        return listInbox;
    }

}
