package cilok.com.lapakjahit.entity;

/**
 * Created by Gilbert on 5/25/2017.
 */

public class UploadImage {
    /**
     * status : ERROR
     * id : null
     * message : Harus berupa file gambar
     */

    private String status;
    private String id;
    private String message;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
