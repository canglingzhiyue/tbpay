package com.taobao.android.weex;

/* loaded from: classes6.dex */
public enum WeexRenderType {
    UNICORN(2),
    UIKIT(1),
    NONE(0);
    
    private final int cppIndex;

    WeexRenderType(int i) {
        this.cppIndex = i;
    }

    public int getCppIndex() {
        return this.cppIndex;
    }
}
