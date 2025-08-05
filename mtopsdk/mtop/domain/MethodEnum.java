package mtopsdk.mtop.domain;

/* loaded from: classes.dex */
public enum MethodEnum {
    GET("GET"),
    POST("POST"),
    HEAD("HEAD"),
    PATCH("PATCH");
    
    private String method;

    MethodEnum(String str) {
        this.method = str;
    }

    public String getMethod() {
        return this.method;
    }
}
