package cilok.com.lapakjahit.entity;

import android.os.Parcel;
import android.os.Parcelable;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import cilok.com.lapakjahit.log.L;

/**
 * Created by Gilbert on 5/14/2017.
 */

public class InboxMessage implements Parcelable {

    private long id;
    private String updatedAt;
    private long partnerId;
    private String partnerName;
    private String urlPartnerAvatar;
    private String partnerVerified;
    private String partnerOfficial;
    private long userId;
    private String userName;
    private String lastMessage;
    private String lastMessageRead;
    private String lastMessageSent;

    public InboxMessage(){}


//    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX");

    public InboxMessage(long id,
                        String updatedAt,
                        long partnerId,
                        String partnerName,
                        String urlPartnerAvatar,
                        String partnerVerified,
                        String partnerOfficial,
                        long userId,
                        String userName,
                        String lastMessage,
                        String lastMessageRead,
                        String lastMessageSent
    ) {
        this.id = id;
        this.updatedAt = updatedAt;
        this.partnerId = partnerId;
        this.partnerName = partnerName;
        this.urlPartnerAvatar = urlPartnerAvatar;
        this.partnerVerified = partnerVerified;
        this.partnerOfficial = partnerOfficial;
        this.userId = userId;
        this.userName = userName;
        this.lastMessage = lastMessage;
        this.lastMessageRead = lastMessageRead;
        this.lastMessageSent = lastMessageSent;
    }

    public InboxMessage(Parcel input) throws ParseException {
        id = input.readLong();
        updatedAt = input.readString();
        partnerId = input.readLong();
        partnerName = input.readString();
        urlPartnerAvatar = input.readString();
        partnerVerified = input.readString();
        partnerOfficial = input.readString();
        userId = input.readLong();
        userName = input.readString();
        lastMessage = input.readString();
        lastMessageRead = input.readString();
        lastMessageSent = input.readString();
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setPartnerId(long partnerId) {
        this.partnerId = partnerId;
    }

    public long getPartnerId() {
        return partnerId;
    }

    public void setPartnerName(String partnerName) {
        this.partnerName = partnerName;
    }

    public String getPartnerName() {
        return partnerName;
    }

    public void setUrlPartnerAvatar(String urlPartnerAvatar) {
        this.urlPartnerAvatar = urlPartnerAvatar;
    }

    public String getUrlPartnerAvatar() {
        return urlPartnerAvatar;
    }

    public void setPartnerVerified(String partnerVerified) {
        this.partnerVerified = partnerVerified;
    }

    public String getPartnerVerified() {
        return partnerVerified;
    }

    public void setPartnerOfficial(String partnerOfficial) {
        this.partnerOfficial = partnerOfficial;
    }

    public String getPartnerOfficial() {
        return partnerOfficial;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setLastMessage(String lastMessage) {
        this.lastMessage = lastMessage;
    }

    public String getLastMessage() {
        return lastMessage;
    }

    public void setLastMessageRead(String lastMessageRead) {
        this.lastMessageRead = lastMessageRead;
    }

    public String getLastMessageRead() {
        return lastMessageRead;
    }

    public void setLastMessageSent(String lastMessageSent) {
        this.lastMessageSent = lastMessageSent;
    }

    public String getLastMessageSent() {
        return lastMessageSent;
    }

    @Override
    public String toString(){
        return "\n ID: "+id+
                "\n Update At: "+ updatedAt +
                "\n partner_id: "+partnerId+
                "\n partner_name: "+partnerName+
                "\n partner_avatar: "+urlPartnerAvatar+
                "\n partner_verified: "+partnerVerified+
                "\n partner_official: "+partnerOfficial+
                "\n user_id: "+userId+
                "\n user_name: "+userName+
                "\n last_message: "+lastMessage+
                "\n last_message_read: "+lastMessageRead+
                "\n last_message_sent: "+lastMessageSent+
                "\n";
    }

    public static final Creator<InboxMessage> CREATOR = new Creator<InboxMessage>() {
        @Override
        public InboxMessage createFromParcel(Parcel in) {
            L.m("create from parcel :InboxMessage");
            try {
                return new InboxMessage(in);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            return null;
        }


        @Override
        public InboxMessage[] newArray(int size) {
            return new InboxMessage[size];
        }
    };

    @Override
    public int describeContents() {
        L.m("describe Contents InboxMessage");
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        L.m("writeToParcel InboxMessage");
        parcel.writeLong(id);
        parcel.writeString(updatedAt);
        parcel.writeLong(partnerId);
        parcel.writeString(partnerName);
        parcel.writeString(urlPartnerAvatar);
        parcel.writeString(partnerVerified);
        parcel.writeString(partnerOfficial);
        parcel.writeLong(userId);
        parcel.writeString(userName);
        parcel.writeString(lastMessage);
        parcel.writeString(lastMessageRead);
        parcel.writeString(lastMessageSent);
    }
}
