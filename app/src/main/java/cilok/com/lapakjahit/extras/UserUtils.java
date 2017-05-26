package cilok.com.lapakjahit.extras;

import android.content.Context;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import cilok.com.lapakjahit.callback.UserService;
import cilok.com.lapakjahit.json.RetrofitClient;

/**
 * Created by Gilbert on 5/19/2017.
 */

public class UserUtils {
    static String userId, token = null;
    private UserUtils(){

    }

    public static UserService getUserService(Context context){
        FileInputStream fileInputStream=null;
        try {
            fileInputStream = context.openFileInput("User.txt");
            int read = -1;
            StringBuffer buffer = new StringBuffer();
            while((read=fileInputStream.read())!=-1){
                buffer.append((char)read);
            }
            userId = buffer.substring(0,buffer.indexOf(" "));
            token = buffer.substring(buffer.indexOf(" "+1));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
//        return RetrofitClient.getClient().create(UserService.class);
        return null;
    }


}
