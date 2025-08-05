package com.taobao.zcache;

/* loaded from: classes9.dex */
public enum RequestType {
    Normal(0),
    UniApp(1),
    Weex(2);
    
    public final int value;

    RequestType(int i) {
        this.value = i;
    }
}
