package com.alipay.mobile.beehive.eventbus;

/* loaded from: classes3.dex */
public enum ThreadMode {
    UI("ui"),
    BACKGROUND("background"),
    CURRENT("current");
    
    private String text;

    ThreadMode(String str) {
        this.text = str;
    }

    public static ThreadMode fromString(String str) {
        ThreadMode[] values;
        if (str != null) {
            for (ThreadMode threadMode : values()) {
                if (str.equals(threadMode.text)) {
                    return threadMode;
                }
            }
        }
        throw new IllegalArgumentException("No constant with text " + str + " found");
    }
}
