package mtopsdk.mtop.domain;

/* loaded from: classes9.dex */
public enum ApiTypeEnum {
    ISV_OPEN_API("isv_open_api");
    
    private String apiType;

    ApiTypeEnum(String str) {
        this.apiType = str;
    }

    public String getApiType() {
        return this.apiType;
    }
}
