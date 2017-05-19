package cilok.com.lapakjahit.extras;

import cilok.com.lapakjahit.callback.UserService;
import cilok.com.lapakjahit.json.RetrofitClient;

/**
 * Created by Gilbert on 5/19/2017.
 */

public class UserUtils {
    private UserUtils(){

    }

    public static UserService getUserService(){
        return RetrofitClient.getClient().create(UserService.class);
    }
}
