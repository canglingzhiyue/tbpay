package com.taobao.android.stdpop.api;

import kotlin.jvm.internal.q;

/* loaded from: classes6.dex */
public enum PopGravity {
    BOTTOM("bottom"),
    LEFT("left"),
    RIGHT("right"),
    TOP("top"),
    CENTER("center");
    
    private String value;

    PopGravity(String str) {
        this.value = str;
    }

    public final String getValue() {
        return this.value;
    }

    public final void setValue(String str) {
        q.d(str, "<set-?>");
        this.value = str;
    }
}
