package cilok.com.lapakjahit.extras;

import android.content.Context;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

import cilok.com.lapakjahit.callback.FavoriteService;
import cilok.com.lapakjahit.json.RetrofitClient;
import cilok.com.lapakjahit.log.L;

/**
 * Created by Gilbert on 5/19/2017.
 */

public class FavoritesUtils {

    public static FavoriteService getFavoitesService(String userId, String token){

        return RetrofitClient.getClient(userId,token).create(FavoriteService.class);
    }

    public static FavoriteService getFavoitesService(Context context){
        FileInputStream fileInputStream=null;
        String userId="", token="";
        try {
            fileInputStream =context.openFileInput("User.txt");
            InputStreamReader in = new InputStreamReader(fileInputStream);
            BufferedReader bufferedReader = new BufferedReader(in);
            String line =  null;
            String str = "";
            while ((line = bufferedReader.readLine()) != null) {
                str += line;
            }
            userId = str.substring(0,str.indexOf(" "));
            token = str.substring(str.indexOf(" ")+1);

//            StringBuffer buffer = new StringBuffer();
//            while((read=fileInputStream.read())!=-1){
//                buffer.append((char)read);
//            }
//            L.m(buffer+"");
            L.m(""+str);
//            Toast.makeText(context, ""+str, Toast.LENGTH_SHORT).show();
//            userId = buffer.substring(0,buffer.indexOf(" "));
//            token = buffer.substring(buffer.indexOf(" "+1));
//            Toast.makeText(getActivity(), userId+" "+token, Toast.LENGTH_SHORT).show();
            return RetrofitClient.getClient(userId,token).create(FavoriteService.class);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
//        return null;

        return null;
    }

}
