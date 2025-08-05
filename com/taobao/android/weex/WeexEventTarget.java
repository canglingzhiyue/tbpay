package com.taobao.android.weex;

/* loaded from: classes6.dex */
public enum WeexEventTarget {
    WINDOW_TARGET(0),
    DOCUMENT_TARGET(1),
    BODY_TARGET(2),
    WEEX_TARGET(3);
    
    private int mTarget;

    WeexEventTarget(int i) {
        this.mTarget = i;
    }

    public static WeexEventTarget convertWeexEvent(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? WINDOW_TARGET : WEEX_TARGET : BODY_TARGET : DOCUMENT_TARGET : WINDOW_TARGET;
    }

    public int getEventTarget() {
        return this.mTarget;
    }
}
