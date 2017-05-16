package cilok.com.lapakjahit.extras;

/**
 * Created by Gilbert on 5/11/2017.
 */

public interface Keys {
    public interface EndpointAuthentication {
        public static final String KEY_STATUS = "status";
        public static final String KEY_MESSAGE = "message";
        public static final String KEY_USER_ID = "user_id";
        public static final String KEY_USER_NAME = "user_name";
        public static final String KEY_CONFIRMED = "confirmed";
        public static final String KEY_TOKEN = "token";
        public static final String KEY_EMAIL = "email";
        public static final String KEY_CONFIRMED_PHONE = "confirmed_phone";
        public static final String KEY_OMNIKEY = "omnikey";
    }

    public  interface EnpointInboxMessage{
        public static final String KEY_INBOX = "inbox";
        public static final String KEY_ID = "id";
        public static final String KEY_UPDATED_AT = "updated_at";
        public static final String KEY_PARTNER_ID = "partner_id";
        public static final String KEY_PARTNER_NAME = "partner_name";
        public static final String KEY_PARTNER_AVATAR = "partner_avatar";
        public static final String KEY_PARTNER_VERIFIED = "partner_verified";
        public static final String KEY_PARTNER_OFFICIAL = "partner_official";
        public static final String KEY_USER_ID = "user_id";
        public static final String KEY_USER_NAME = "user_name";
        public static final String KEY_LAST_MESSAGE = "last_message";
        public static final String KEY_LAST_MESSAGE_READ = "last_message_read";
        public static final String KEY_LAST_MESSAGE_SENT = "last_message_sent";
    }
}
