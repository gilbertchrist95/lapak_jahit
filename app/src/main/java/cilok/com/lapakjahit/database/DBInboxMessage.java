package cilok.com.lapakjahit.database;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteStatement;

import java.util.ArrayList;
import java.util.Date;

import cilok.com.lapakjahit.entity.InboxMessage;
import cilok.com.lapakjahit.log.L;

/**
 * Created by Gilbert on 5/14/2017.
 */

public class DBInboxMessage {
    public static final int INBOX_MESSAGE = 0;
    private MessageInboxHelper mHelper;
    private SQLiteDatabase mDatabase;

    public DBInboxMessage(Context context) {
        mHelper = new MessageInboxHelper(context);
        mDatabase = mHelper.getWritableDatabase();
    }

    public void insertInboxMessage(int table, ArrayList<InboxMessage> listInbox, boolean clearPrevious) {
        if (clearPrevious) {
            deleteInboxMessage(table);
        }
        //create a sql prepared statement
        String sql = "INSERT INTO " + MessageInboxHelper.TABLE_INBOX_MESSAGE + " VALUES (?,?,?,?,?,?,?,?,?,?,?,?);";
        //compile the statement and start
        SQLiteStatement statement = mDatabase.compileStatement(sql);
        mDatabase.beginTransaction();
        for (int i = 0; i < listInbox.size(); i++) {
            InboxMessage currentInboxMessage = listInbox.get(i);
            statement.clearBindings();
            //for a given column index, simply bind the data to be put inside that index
            statement.bindLong(1, currentInboxMessage.getId());
            statement.bindString(2, currentInboxMessage.getUpdatedAt());
            statement.bindLong(3, currentInboxMessage.getPartnerId());
            statement.bindString(4, currentInboxMessage.getPartnerName());
            statement.bindString(5, currentInboxMessage.getUrlPartnerAvatar());
            statement.bindString(6, currentInboxMessage.getPartnerVerified());
            statement.bindString(7, currentInboxMessage.getPartnerOfficial());
            statement.bindLong(8, currentInboxMessage.getUserId());
            statement.bindString(9, currentInboxMessage.getUserName());
            statement.bindString(10, currentInboxMessage.getLastMessage());
            statement.bindString(11, currentInboxMessage.getLastMessageRead());
            statement.bindString(12, currentInboxMessage.getLastMessageSent());
            statement.execute();
        }
        //set the transaction as successful and end the transaction
        L.m("inserting entries " + listInbox.size() + new Date(System.currentTimeMillis()));
        mDatabase.setTransactionSuccessful();
        mDatabase.endTransaction();
    }

    public ArrayList<InboxMessage> readInboxMessage(int table){
        ArrayList<InboxMessage> listInboxMessages = new ArrayList<>();

        //get a list of column to be retrivied, we need all of them
        String[] columns = { MessageInboxHelper.COLUMN_ID,
                MessageInboxHelper.COLUMN_UPDATED_AT,
                MessageInboxHelper.COLUMN_PARTNER_ID,
                MessageInboxHelper.COLUMN_PARTNER_NAME,
                MessageInboxHelper.COLUMN_PARTNER_AVATAR,
                MessageInboxHelper.COLUMN_PARTNER_VERIFIED,
                MessageInboxHelper.COLUMN_PARTNER_OFFICIAL,
                MessageInboxHelper.COLUMN_USER_ID,
                MessageInboxHelper.COLUMN_USER_NAME,
                MessageInboxHelper.COLUMN_LAST_MESSAGE,
                MessageInboxHelper.COLUMN_LAST_MESSAGE_READ,
                MessageInboxHelper.COLUMN_LAST_MESSAGE_SENT
        };
        Cursor cursor = mDatabase.query(MessageInboxHelper.TABLE_INBOX_MESSAGE, columns,null,null,null,null,null);
        if (cursor!= null && cursor.moveToFirst()){
            L.m("loading entries " + cursor.getCount() + new Date(System.currentTimeMillis()));
            do{
                InboxMessage inboxMessage =  new InboxMessage();
                //each step is a 2 part process, find the index of the column first, find the data of that column using
                //that index and finally set our blank inbox message object to contain our data
                inboxMessage.setId(cursor.getLong(cursor.getColumnIndex(MessageInboxHelper.COLUMN_ID)));
                inboxMessage.setUpdatedAt(cursor.getString(cursor.getColumnIndex(MessageInboxHelper.COLUMN_UPDATED_AT)));
                inboxMessage.setPartnerId(cursor.getLong(cursor.getColumnIndex(MessageInboxHelper.COLUMN_PARTNER_ID)));
                inboxMessage.setPartnerName(cursor.getString(cursor.getColumnIndex(MessageInboxHelper.COLUMN_PARTNER_NAME)));
                inboxMessage.setUrlPartnerAvatar(cursor.getString(cursor.getColumnIndex(MessageInboxHelper.COLUMN_PARTNER_AVATAR)));
                inboxMessage.setPartnerVerified(cursor.getString(cursor.getColumnIndex(MessageInboxHelper.COLUMN_PARTNER_VERIFIED)));
                inboxMessage.setPartnerOfficial(cursor.getString(cursor.getColumnIndex(MessageInboxHelper.COLUMN_PARTNER_OFFICIAL)));
                inboxMessage.setUserId(cursor.getLong(cursor.getColumnIndex(MessageInboxHelper.COLUMN_USER_ID)));
                inboxMessage.setUserName(cursor.getString(cursor.getColumnIndex(MessageInboxHelper.COLUMN_USER_NAME)));
                inboxMessage.setLastMessage(cursor.getString(cursor.getColumnIndex(MessageInboxHelper.COLUMN_LAST_MESSAGE)));
                inboxMessage.setLastMessageRead(cursor.getString(cursor.getColumnIndex(MessageInboxHelper.COLUMN_LAST_MESSAGE_READ)));
                inboxMessage.setLastMessageSent(cursor.getString(cursor.getColumnIndex(MessageInboxHelper.COLUMN_LAST_MESSAGE_SENT)));
                listInboxMessages.add(inboxMessage);
            }
            while (cursor.moveToNext());
        }
        return  listInboxMessages;
    }

    public void deleteInboxMessage(int table) {
        if (table == INBOX_MESSAGE) {
            mDatabase.delete(MessageInboxHelper.TABLE_INBOX_MESSAGE, null, null);
        }
    }

    private static class MessageInboxHelper extends SQLiteOpenHelper {
        public static final String TABLE_INBOX_MESSAGE = "inbox_message";
        public static final String COLUMN_ID = "id";
        public static final String COLUMN_UPDATED_AT = "updated_at";
        public static final String COLUMN_PARTNER_ID = "partner_id";
        public static final String COLUMN_PARTNER_NAME = "partner_name";
        public static final String COLUMN_PARTNER_AVATAR = "partner_avatar";
        public static final String COLUMN_PARTNER_VERIFIED = "partner_verified";
        public static final String COLUMN_PARTNER_OFFICIAL = "partner_official";
        public static final String COLUMN_USER_ID = "user_id";
        public static final String COLUMN_USER_NAME = "user_name";
        public static final String COLUMN_LAST_MESSAGE = "last_message";
        public static final String COLUMN_LAST_MESSAGE_READ = "last_message_read";
        public static final String COLUMN_LAST_MESSAGE_SENT = "last_message_sent";

        private static final String CREATE_TABLE_INBOX_MESSAGE = "CREATE TABLE " + TABLE_INBOX_MESSAGE + " (" +
                COLUMN_ID + " INTEGER PRIMARY KEY," +
                COLUMN_UPDATED_AT + " TEXT, " +
                COLUMN_PARTNER_ID + " INTEGER, " +
                COLUMN_PARTNER_NAME + " TEXT, " +
                COLUMN_PARTNER_AVATAR + " TEXT, " +
                COLUMN_PARTNER_VERIFIED + " TEXT, " +
                COLUMN_PARTNER_OFFICIAL + " TEXT, " +
                COLUMN_USER_ID + " LONG, " +
                COLUMN_USER_NAME + " TEXT, " +
                COLUMN_LAST_MESSAGE + " TEXT, " +
                COLUMN_LAST_MESSAGE_READ + " TEXT, " +
                COLUMN_LAST_MESSAGE_SENT + " TEXT" +
                ");";

        private static final String DB_NAME = "message_db";
        private static final int DB_VERSION = 1;
        private Context mContext;

        public MessageInboxHelper(Context context) {
            super(context, DB_NAME, null, DB_VERSION);
            mContext = context;
        }

        @Override
        public void onCreate(SQLiteDatabase db) {
            try {
                db.execSQL(CREATE_TABLE_INBOX_MESSAGE);
                L.m("create table inbox message executed");
            } catch (SQLiteException exception) {
                L.t(mContext, exception + "");
            }

        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            try {
                L.m("upgrade table box office executed");
                db.execSQL(" DROP TABLE " + TABLE_INBOX_MESSAGE + " IF EXISTS;");
                onCreate(db);
            } catch (SQLiteException exception) {
                L.t(mContext, exception + "");
            }
        }
    }
}
