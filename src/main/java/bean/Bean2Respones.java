package bean;

import java.util.List;

public class Bean2Respones {
    private String status;
    private String message;
    private Bean2 result;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Bean2 getResult() {
        return result;
    }

    public void setResult(Bean2 result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "Bean2Respones{" +
                "status='" + status + '\'' +
                ", message='" + message + '\'' +
                ", result=" + result +
                '}';
    }
}
