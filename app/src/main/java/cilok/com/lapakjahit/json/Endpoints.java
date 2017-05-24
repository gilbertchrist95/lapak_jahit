package cilok.com.lapakjahit.json;

import static cilok.com.lapakjahit.extras.UrlEndpoints.URL_BL;
import static cilok.com.lapakjahit.extras.UrlEndpoints.URL_CHAR_EQUAL;
import static cilok.com.lapakjahit.extras.UrlEndpoints.URL_CHAR_QUESTION;
import static cilok.com.lapakjahit.extras.UrlEndpoints.URL_PARAM_CATEGORY_ID;
import static cilok.com.lapakjahit.extras.UrlEndpoints.URL_PARAM_CATEGORY_ID_FASHION_PRIA;
import static cilok.com.lapakjahit.extras.UrlEndpoints.URL_PARAM_CATEGORY_ID_FASHION_WANITA;
import static cilok.com.lapakjahit.extras.UrlEndpoints.URL_PARAM_JSON;
import static cilok.com.lapakjahit.extras.UrlEndpoints.URL_PARAM_AUTHENTICATION;
import static cilok.com.lapakjahit.extras.UrlEndpoints.URL_PARAM_FAVORITES;
import static cilok.com.lapakjahit.extras.UrlEndpoints.URL_PARAM_MESSAGE;
import static cilok.com.lapakjahit.extras.UrlEndpoints.URL_PARAM_PRODUCTS;
import static cilok.com.lapakjahit.extras.UrlEndpoints.URL_PARAM_TRANSACTIONS;

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

    public static String getRequestUrlLoadTransactions(){
        return URL_BL+
                URL_PARAM_TRANSACTIONS+
                URL_PARAM_JSON;

    }

    public static String getRequestProductFashionPria(){
        return URL_BL+
                URL_PARAM_PRODUCTS+
                URL_PARAM_JSON+
                URL_CHAR_QUESTION+
                URL_PARAM_CATEGORY_ID+
                URL_CHAR_EQUAL+
                URL_PARAM_CATEGORY_ID_FASHION_PRIA;

    }

    public static String getRequestProductFashionWanita(){
        return URL_BL+
                URL_PARAM_PRODUCTS+
                URL_PARAM_JSON+
                URL_CHAR_QUESTION+
                URL_PARAM_CATEGORY_ID+
                URL_CHAR_EQUAL+
                URL_PARAM_CATEGORY_ID_FASHION_WANITA;

    }

    public static String getRequestUrlInboxMessage(){
        return URL_BL+
                URL_PARAM_MESSAGE+
                URL_PARAM_JSON;
    }
}
