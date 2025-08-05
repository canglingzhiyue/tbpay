package com.taobao.android.weex_framework.common;

/* loaded from: classes6.dex */
public enum MUSEventTarget {
    MUS_WINDOW_TARGET(0),
    MUS_DOCUMENT_TARGET(1),
    MUS_BODY_TARGET(2),
    MUS_WEEX_TARGET(3);
    
    private int target;

    MUSEventTarget(int i) {
        this.target = i;
    }

    public int getMUSEventTarget() {
        return this.target;
    }
}
