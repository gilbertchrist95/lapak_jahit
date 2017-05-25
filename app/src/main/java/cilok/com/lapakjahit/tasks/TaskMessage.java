package cilok.com.lapakjahit.tasks;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.widget.Toast;

import com.android.volley.RequestQueue;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import cilok.com.lapakjahit.callback.InboxMessageLoadedListener;
import cilok.com.lapakjahit.entity.InboxMessage;
import cilok.com.lapakjahit.extras.MessageUtils;
import cilok.com.lapakjahit.network.VolleySingleton;

/**
 * Created by Gilbert on 5/20/2017.
 */

public class TaskMessage {
    String split[];

    public TaskMessage(Context context) {

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

    public TaskMessage() {

    }

    public void getInboxMessage(InboxMessageLoadedListener myComponent) {
        new TaskGetnboxMessage(myComponent, split[0], split[1]).execute();
    }


    public class TaskGetnboxMessage extends AsyncTask<Void, Void, ArrayList<InboxMessage>> {
        private InboxMessageLoadedListener myComponent;
        private VolleySingleton volleySingleton;
        private RequestQueue requestQueue;
        String userId, token;

        public TaskGetnboxMessage(InboxMessageLoadedListener myComponent, String userId, String token) {
            this.userId = userId;
            this.token = token;
            this.myComponent = myComponent;
            volleySingleton = VolleySingleton.getInstance();
            requestQueue = volleySingleton.getRequestQueue();
        }

        @Override
        protected ArrayList<InboxMessage> doInBackground(Void... voids) {
            ArrayList<InboxMessage> listInbox = MessageUtils.loadInboxMessage(requestQueue, userId, token);
            return listInbox;
        }

        @Override
        protected void onPostExecute(ArrayList<InboxMessage> listinboxMessages) {
            if (myComponent != null) {
                myComponent.onInboxMessageLoadedListener(listinboxMessages);
            }
        }
    }
}
