package cilok.com.lapakjahit.callback;

import cilok.com.lapakjahit.entity.UserInfo;
import retrofit.Callback;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.POST;
//import okhttp3.ResponseBody;
//import retrofit2.Call;
//import retrofit2.http.Field;
//import retrofit2.http.FormUrlEncoded;
//import retrofit2.http.POST;

/**
 * Created by Gilbert on 5/18/2017.
 */

public interface UserService {
    @FormUrlEncoded
    @POST("/users.json")
    void registerNewUser(
        @Field("user[email]") String email,
        @Field("user[username") String username,
        @Field("user[name]") String name,
        @Field("user[gender]") String gender,
        @Field("user[password]") String password,
        @Field("user[password_confirmation]") String password_confirmation,
        @Field("user[policy]") int policy,
        Callback<UserInfo> callback
    );
//    Call<UserInfo> registerNewUser(
//            @Field("user[email]") String email,
//            @Field("user[username") String username,
//            @Field("user[name]") String name,
//            @Field("user[gender]") String gender,
//            @Field("user[password]") String password,
//            @Field("user[password_confirmation]") String password_confirmation,
//            @Field("user[policy]") int policy
//    );
}
