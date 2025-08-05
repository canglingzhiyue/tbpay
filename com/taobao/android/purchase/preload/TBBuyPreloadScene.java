package com.taobao.android.purchase.preload;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
/* loaded from: classes6.dex */
public @interface TBBuyPreloadScene {
    public static final String APP_IDLE = "idle";
    public static final String DATA_CHANGED = "dataChanged";
    public static final String ENTER_PAGE = "enterPage";
    public static final String EXIT_PAGE = "exitPage";
    public static final String NAV = "nav";
    public static final String TOUCH_DOWN = "touchDown";
}
