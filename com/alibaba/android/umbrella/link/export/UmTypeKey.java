package com.alibaba.android.umbrella.link.export;

/* loaded from: classes2.dex */
public enum UmTypeKey {
    TOAST("toast"),
    OHTER("other"),
    ERROE_PAGE("errorpage"),
    DIALOG("dialog");
    
    private final String key;

    UmTypeKey(String str) {
        this.key = str;
    }

    public String getKey() {
        return this.key;
    }
}
