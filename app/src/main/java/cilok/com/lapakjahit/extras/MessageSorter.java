package cilok.com.lapakjahit.extras;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;

import cilok.com.lapakjahit.entity.InboxMessage;

/**
 * Created by Gilbert on 5/17/2017.
 */

public class MessageSorter {
    SimpleDateFormat dt = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZZZZZ");

    public void sortInboxMessageByDate(ArrayList<InboxMessage> messages) {

        Collections.sort(messages, new Comparator<InboxMessage>() {
            @Override
            public int compare(InboxMessage lhs, InboxMessage rhs) {
                try {
                    Date lhsDate = dt.parse(lhs.getUpdatedAt());
                    Date rhsDate = dt.parse(rhs.getUpdatedAt());
                    if (lhsDate != null && rhsDate != null) {
                        return rhsDate.compareTo(lhsDate);
                    } else {
                        return 0;
                    }
                } catch (ParseException e) {
                    e.printStackTrace();
                }

            return 0;
            }
        });
    }
}
