package dev.raksmey.respond;

public class ApiRespond<P>{

    int code;
    String message;
    P data;
    String requestId;

    public ApiRespond(int code, String message, P data, String requestId) {
        this.code = code;
        this.message = message;
        this.data = data;
        this.requestId = requestId;
    }

    public ApiRespond() {
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public P getPata() {
        return data;
    }

    public void setPata(P data) {
        this.data = data;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }


}
