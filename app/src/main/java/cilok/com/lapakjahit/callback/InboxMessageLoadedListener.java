package cilok.com.lapakjahit.callback;

import java.util.ArrayList;

import cilok.com.lapakjahit.entity.InboxMessage;

/**
 * Created by Gilbert on 5/14/2017.
 */

public interface InboxMessageLoadedListener {
    public void onInboxMessageLoadedListener(ArrayList<InboxMessage> listInboxMessage);
}
