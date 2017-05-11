package cilok.com.lapakjahit.json;

import org.json.JSONObject;

/**
 * Created by Gilbert on 5/11/2017.
 */

public class Utils {
    public static boolean contains(JSONObject jsonObject, String key) {
        return jsonObject != null && jsonObject.has(key) && !jsonObject.isNull(key) ? true : false;
    }

}
