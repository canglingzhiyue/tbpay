package mtopsdk.mtop.domain;

/* loaded from: classes.dex */
public enum EntranceEnum {
    GW_INNER("gw"),
    GW_OPEN("gw-open");
    
    private String entrance;

    EntranceEnum(String str) {
        this.entrance = str;
    }

    public String getEntrance() {
        return this.entrance;
    }
}
