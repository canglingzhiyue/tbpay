package com.taobao.android.weex;

/* loaded from: classes6.dex */
public enum WeexExternalType {
    PAN("external.pan");
    
    private final String mValue;

    WeexExternalType(String str) {
        this.mValue = str;
    }

    public String value() {
        return this.mValue;
    }
}
