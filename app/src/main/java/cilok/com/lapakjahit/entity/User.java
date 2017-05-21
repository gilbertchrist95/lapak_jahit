package cilok.com.lapakjahit.entity;

/**
 * Created by Gilbert on 5/11/2017.
 */

public class User {
    private String userId;
    private String userName;
    private boolean confirmed;
    private String token;
    private String email;
    private String confirmedPhone;
    private String omniKey;

    public User(){

    }
    public User(String userId, String userName, boolean confirmed, String token, String email, String confirmedPhone, String omniKey){
        this.userId = userId;
        this.userName = userName;
        this.confirmed = confirmed;
        this.token = token;
        this.email = email;
        this.confirmedPhone = confirmedPhone;
        this.omniKey = omniKey;
    }

    public void setUserId(String userId){
        this.userId = userId;
    }
    public String getUserId (){
        return userId;
    }
    public void setUserName(String userName){
        this.userName=userName;
    }
    public String getUserName(){
        return userName;
    }
    public void setConfirmed(boolean confirmed){
        this.confirmed = confirmed;
    }
    public boolean getConfirmed(){
        return confirmed;
    }
    public void setToken(String token){
        this.token = token;
    }
    public String getToken(){
        return token;
    }
    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setConfirmedPhone(String confirmedPhone) {
        this.confirmedPhone = confirmedPhone;
    }

    public String getConfirmedPhone() {
        return confirmedPhone;
    }

    public void setOmniKey(String omniKey) {
        this.omniKey = omniKey;
    }

    public String getOmniKey() {
        return omniKey;
    }

    @Override
    public String toString(){
        return "userId: "+userId+
                "userName: "+userName+
                "email: "+email;
    }
}
