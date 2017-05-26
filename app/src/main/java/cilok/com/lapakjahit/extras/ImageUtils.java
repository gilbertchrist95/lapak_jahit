package cilok.com.lapakjahit.extras;

import android.content.Context;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import cilok.com.lapakjahit.callback.ImageServicce;
import cilok.com.lapakjahit.callback.UserService;
import cilok.com.lapakjahit.json.RetrofitClient;

/**
 * Created by Gilbert on 5/25/2017.
 */

public class ImageUtils {
    static String userId, token = null;
    private ImageUtils(){

    }

    public static ImageServicce getUserService(){
//        FileInputStream fileInputStream=null;
//        try {
//            fileInputStream = context.openFileInput("User.txt");
//            int read = -1;
//            StringBuffer buffer = new StringBuffer();
//            while((read=fileInputStream.read())!=-1){
//                buffer.append((char)read);
//            }
//            userId = buffer.substring(0,buffer.indexOf(" "));
//            token = buffer.substring(buffer.indexOf(" "+1));
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return RetrofitClient.getClient().create(ImageServicce.class);
        return null;
    }

}
