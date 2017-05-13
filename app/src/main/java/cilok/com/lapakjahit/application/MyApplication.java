package cilok.com.lapakjahit.application;

import android.app.Application;
import android.content.Context;

/**
 * Created by Gilbert on 5/8/2017.
 */

public class MyApplication extends Application{

    public static  String API_KEY_USER_ID = "";
    public static  String API_KEY_TOKEN = "";
    private static MyApplication sInstance;

    @Override
    public void onCreate() {
        super.onCreate();
        sInstance = this;

    }

    public static MyApplication getInstance() {
        return sInstance;
    }

    public static Context getAppContext() {
        return sInstance.getApplicationContext();
    }
}
