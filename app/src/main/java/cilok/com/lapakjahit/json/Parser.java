package cilok.com.lapakjahit.json;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

import cilok.com.lapakjahit.entity.InboxMessage;
import cilok.com.lapakjahit.extras.Constants;
import cilok.com.lapakjahit.log.L;

import static cilok.com.lapakjahit.extras.Keys.EnpointInboxMessage.KEY_ID;
import static cilok.com.lapakjahit.extras.Keys.EnpointInboxMessage.KEY_INBOX;
import static cilok.com.lapakjahit.extras.Keys.EnpointInboxMessage.KEY_LAST_MESSAGE;
import static cilok.com.lapakjahit.extras.Keys.EnpointInboxMessage.KEY_LAST_MESSAGE_READ;
import static cilok.com.lapakjahit.extras.Keys.EnpointInboxMessage.KEY_LAST_MESSAGE_SENT;
import static cilok.com.lapakjahit.extras.Keys.EnpointInboxMessage.KEY_PARTNER_AVATAR;
import static cilok.com.lapakjahit.extras.Keys.EnpointInboxMessage.KEY_PARTNER_ID;
import static cilok.com.lapakjahit.extras.Keys.EnpointInboxMessage.KEY_PARTNER_NAME;
import static cilok.com.lapakjahit.extras.Keys.EnpointInboxMessage.KEY_PARTNER_OFFICIAL;
import static cilok.com.lapakjahit.extras.Keys.EnpointInboxMessage.KEY_PARTNER_VERIFIED;
import static cilok.com.lapakjahit.extras.Keys.EnpointInboxMessage.KEY_UPDATED_AT;
import static cilok.com.lapakjahit.extras.Keys.EnpointInboxMessage.KEY_USER_ID;
import static cilok.com.lapakjahit.extras.Keys.EnpointInboxMessage.KEY_USER_NAME;

/**
 * Created by Gilbert on 5/15/2017.
 */

public class Parser {
    public static ArrayList<InboxMessage> parseMessageInboxJson(JSONObject response) {
        ArrayList<InboxMessage> listInboxInboxMessage = new ArrayList<>();
        if (response != null && response.length() > 0) {
            try {
                JSONArray arrayInbox = response.getJSONArray(KEY_INBOX);
                for (int i = 0; i < arrayInbox.length(); i++) {
                    long id = -1;
                    String updatedAt = Constants.NA;
                    long partnerId = -1;
                    String partnerName = Constants.NA;
                    String urlPartnerAvatar = Constants.NA;
                    String partnerVerified = Constants.NA;
                    String partnerOfficial = Constants.NA;
                    long userId = -1;
                    String userName = Constants.NA;
                    String lastMessage = Constants.NA;
                    String lastMessageRead = Constants.NA;
                    String lastMessageSent = Constants.NA;

                    JSONObject currentInboxMessage = arrayInbox.getJSONObject(i);
                    //get the id of the current movie

//                    id = currentInboxMessage.getLong(KEY_ID);
                    id = Long.parseLong(currentInboxMessage.getString(KEY_ID));;
                    if (Utils.contains(currentInboxMessage, KEY_UPDATED_AT)) {
                        updatedAt = currentInboxMessage.getString(KEY_UPDATED_AT);
                    }
//                    partnerId = currentInboxMessage.getLong(KEY_PARTNER_ID);
                    partnerId = Long.parseLong(currentInboxMessage.getString(KEY_PARTNER_ID));
                    partnerName = currentInboxMessage.getString(KEY_PARTNER_NAME);
                    urlPartnerAvatar = currentInboxMessage.getString(KEY_PARTNER_AVATAR);
                    partnerVerified = String.valueOf(currentInboxMessage.getBoolean(KEY_PARTNER_VERIFIED));
                    partnerOfficial = String.valueOf(currentInboxMessage.getBoolean(KEY_PARTNER_OFFICIAL));
//                    userId = currentInboxMessage.getLong(KEY_USER_ID);
                    userId = Long.parseLong(currentInboxMessage.getString(KEY_USER_ID));
                    userName = currentInboxMessage.getString(KEY_USER_NAME);
                    lastMessage = currentInboxMessage.getString(KEY_LAST_MESSAGE);
                    lastMessageRead = String.valueOf(currentInboxMessage.getBoolean(KEY_LAST_MESSAGE_READ));
                    lastMessageSent = String.valueOf(currentInboxMessage.getString(KEY_LAST_MESSAGE_SENT));

                    InboxMessage inboxMessage = new InboxMessage();
                    inboxMessage.setId(id);
                    inboxMessage.setUpdatedAt(updatedAt);
                    inboxMessage.setPartnerId(partnerId);
                    inboxMessage.setPartnerName(partnerName);
                    inboxMessage.setUrlPartnerAvatar(urlPartnerAvatar);
                    inboxMessage.setPartnerVerified(partnerVerified);
                    inboxMessage.setPartnerOfficial(partnerOfficial);
                    inboxMessage.setUserId(userId);
                    inboxMessage.setUserName(userName);
                    inboxMessage.setLastMessage(lastMessage);
                    inboxMessage.setLastMessageRead(lastMessageRead);
                    inboxMessage.setLastMessageSent(lastMessageSent);

                    if (id !=-1){
                        listInboxInboxMessage.add(inboxMessage);
                    }

                }
            } catch (JSONException e) {

            }
        }
        L.m(listInboxInboxMessage.size() + " rows fetched");
        return listInboxInboxMessage;
    }
}
