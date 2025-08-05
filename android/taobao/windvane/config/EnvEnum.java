package android.taobao.windvane.config;

import tb.rjm;

/* loaded from: classes2.dex */
public enum EnvEnum {
    ONLINE(0, "m"),
    PRE(1, rjm.WAPA),
    DAILY(2, rjm.WAPTEST);
    
    private int key;
    private String value;

    EnvEnum(int i, String str) {
        this.key = i;
        this.value = str;
    }

    public int getKey() {
        return this.key;
    }

    public String getValue() {
        return this.value;
    }

    public void setKey(int i) {
        this.key = i;
    }

    public void setValue(String str) {
        this.value = str;
    }
}
