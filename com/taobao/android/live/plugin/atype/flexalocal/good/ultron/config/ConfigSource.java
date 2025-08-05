package com.taobao.android.live.plugin.atype.flexalocal.good.ultron.config;

/* loaded from: classes3.dex */
public enum ConfigSource {
    FILE(1),
    MT2(2),
    NETWORK(3);
    
    private final int value;

    ConfigSource(int i) {
        this.value = i;
    }

    public int getIntValue() {
        return this.value;
    }
}
