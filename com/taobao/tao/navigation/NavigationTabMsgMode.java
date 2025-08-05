package com.taobao.tao.navigation;

/* loaded from: classes8.dex */
public enum NavigationTabMsgMode {
    DEFAULT(Gravity.TOP_RIGHT),
    GUARDIAN_DEFAULT(Gravity.TOP_RIGHT),
    RED_POINT_INDICATOR(Gravity.TOP_RIGHT),
    TEXT(Gravity.TOP_RIGHT),
    NONE(Gravity.TOP_RIGHT),
    GUARDIAN_NUM(Gravity.TOP_RIGHT),
    GUARDIAN_TEXT(Gravity.TOP_RIGHT),
    USE_LAST(Gravity.TOP_RIGHT);
    
    final Gravity mGravity;

    /* loaded from: classes8.dex */
    public enum Gravity {
        TOP_RIGHT
    }

    NavigationTabMsgMode(Gravity gravity) {
        this.mGravity = gravity;
    }
}
