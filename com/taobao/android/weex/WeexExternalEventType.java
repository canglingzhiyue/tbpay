package com.taobao.android.weex;

/* loaded from: classes6.dex */
public enum WeexExternalEventType {
    INVALID(0),
    START(1),
    UPDATE(2),
    END(3),
    CANCEL(4);
    
    private final int mValue;

    WeexExternalEventType(int i) {
        this.mValue = i;
    }

    public int value() {
        return this.mValue;
    }
}
