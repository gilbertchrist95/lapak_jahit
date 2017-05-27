package cilok.com.lapakjahit.extras;

import cilok.com.lapakjahit.callback.ImageService;

/**
 * Created by Gilbert on 5/25/2017.
 */

public class ImageUtils {
    static String userId, token = null;
    private ImageUtils(){

    }

    public static ImageService getUserService(){
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
//        return RetrofitClient.getClient().create(ImageService.class);
        return null;
    }

}
