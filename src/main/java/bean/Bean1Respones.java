package bean;

import java.util.List;

public class Bean1Respones {
    private String status;
    private String message;
    private Bean1 result;

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

    public Bean1 getResult() {
        return result;
    }

    public void setResult(Bean1 result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "Bean1Respones{" +
                "status='" + status + '\'' +
                ", message='" + message + '\'' +
                ", result=" + result +
                '}';
    }
}
