package mtopsdk.mtop.domain;

/* loaded from: classes9.dex */
public enum JsonTypeEnum {
    JSON("json"),
    ORIGINALJSON("originaljson");
    
    private String jsonType;

    JsonTypeEnum(String str) {
        this.jsonType = str;
    }

    public String getJsonType() {
        return this.jsonType;
    }
}
