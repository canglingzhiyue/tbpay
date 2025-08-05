package com.taobao.zcache;

/* loaded from: classes9.dex */
public enum Environment {
    Debug(0),
    Daily(1),
    Release(2);
    
    public final int value;

    Environment(int i) {
        this.value = i;
    }
}
