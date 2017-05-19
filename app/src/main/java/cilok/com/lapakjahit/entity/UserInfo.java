package cilok.com.lapakjahit.entity;

/**
 * Created by Gilbert on 5/18/2017.
 */

public class UserInfo {

    /**
     * status : ERROR
     * user_id : null
     * token : null
     * message : Username sudah digunakan, Email sudah digunakan
     */

    private String status;
    private String user_id;
    private String token;
    private String message;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
