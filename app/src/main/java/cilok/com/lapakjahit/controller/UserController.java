package cilok.com.lapakjahit.controller;

import android.content.Context;
import android.content.SharedPreferences;

import cilok.com.lapakjahit.entity.User;

/**
 * Created by Gilbert on 5/11/2017.
 */

public class UserController {

    public static final String SP_NAME = "user";
    SharedPreferences userLocalDatabase;

    public UserController(Context context) {
        userLocalDatabase = context.getSharedPreferences(SP_NAME, 0);
    }

//    public void storeUserData(User returnedUser){
//        SharedPreferences.Editor spEditor = userLocalDatabase.edit();
//        spEditor.putString("user_id", returnedUser.getUserId());
//        spEditor.putString("user_name", returnedUser.getUserName());
//        spEditor.putString("token", returnedUser.getToken());
//        spEditor.putString("email", returnedUser.getEmail());
//        spEditor.putString("confirmend_phone", returnedUser.getConfirmedPhone());
//        spEditor.putString("omni_key", returnedUser.getOmniKey());
//        spEditor.commit();
//    }


    public void setUserLoggedIn(boolean loggedIn) {
        SharedPreferences.Editor spEditor = userLocalDatabase.edit();
        spEditor.putBoolean("loggedIn", loggedIn);
        spEditor.commit();
    }

    public boolean getUserLoggedIn() {
        if (userLocalDatabase.getBoolean("loggedIn", false) == true) {
            return true;
        } else {
            return false;
        }
    }





    public void clearUserData() {
        SharedPreferences.Editor spEditor = userLocalDatabase.edit();
        spEditor.clear();
        spEditor.commit();
    }

}
