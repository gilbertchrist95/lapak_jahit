package cilok.com.lapakjahit.log;

import android.app.Activity;
import android.content.Context;
import android.support.v7.app.AlertDialog;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by Gilbert on 5/11/2017.
 */

public class L {
    public static void m(String message) {
        Log.d("LapakJahit", "" + message);
    }

    public static void t(Context context, String message) {
        Toast.makeText(context, message + "", Toast.LENGTH_SHORT).show();
    }
    public static void T(Context context, String message) {
        Toast.makeText(context, message + "", Toast.LENGTH_LONG).show();
    }


}
