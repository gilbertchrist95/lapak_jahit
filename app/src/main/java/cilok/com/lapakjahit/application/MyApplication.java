package cilok.com.lapakjahit.application;

import android.app.Application;
import android.content.Context;

import cilok.com.lapakjahit.database.DBInboxMessage;

/**
 * Created by Gilbert on 5/8/2017.
 */

public class MyApplication extends Application{


    private static MyApplication sInstance;

    private static DBInboxMessage mDatabaseInboxMessage;

    public static MyApplication getInstance() {
        return sInstance;
    }

    public static Context getAppContext() {
        return sInstance.getApplicationContext();
    }

    public synchronized static  DBInboxMessage getWritableInboxDatabase(){
        if (mDatabaseInboxMessage == null){
            mDatabaseInboxMessage = new DBInboxMessage(getAppContext());
        }
        return  mDatabaseInboxMessage;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        sInstance = this;

    }




}
