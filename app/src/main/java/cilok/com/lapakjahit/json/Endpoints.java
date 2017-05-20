package cilok.com.lapakjahit.json;

import static cilok.com.lapakjahit.extras.UrlEndpoints.URL_BL;
import static cilok.com.lapakjahit.extras.UrlEndpoints.URL_PARAM_JSON;
import static cilok.com.lapakjahit.extras.UrlEndpoints.URL_PARAM_AUTHENTICATION;
import static cilok.com.lapakjahit.extras.UrlEndpoints.URL_PARAM_FAVORITES;
import static cilok.com.lapakjahit.extras.UrlEndpoints.URL_PARAM_MESSAGE;

/**
 * Created by Gilbert on 5/14/2017.
 */

public class Endpoints {
    public static String getRequestURLAuthenticationBL(){
        return URL_BL+
                URL_PARAM_AUTHENTICATION+
                URL_PARAM_JSON;
    }

    public static String getRequestUrlLoadFavorites(){
        return URL_BL+
                URL_PARAM_FAVORITES+
                URL_PARAM_JSON;

    }

    public static String getRequestUrlInboxMessage(){
        return URL_BL+
                URL_PARAM_MESSAGE+
                URL_PARAM_JSON;
    }
}
