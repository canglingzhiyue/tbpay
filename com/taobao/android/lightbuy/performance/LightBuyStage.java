package com.taobao.android.lightbuy.performance;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
/* loaded from: classes5.dex */
public @interface LightBuyStage {
    public static final String BUY_BTN_CLICK = "BUY_BTN_CLICK";
    public static final String COUPON_END = "COUPON_END";
    public static final String MTOP_REQ_END = "MTOP_REQ_END";
    public static final String MTOP_REQ_START = "MTOP_REQ_START";
    public static final String NAV_START = "NAV_START";
    public static final String ORDER_INIT = "ORDER_INIT";
    public static final String WEEX_INIT = "WEEX_INIT";
    public static final String WEEX_REQ_CALLBACK = "WEEX_REQ_CALLBACK";
    public static final String WEEX_REQ_INVOKED = "WEEX_REQ_INVOKED";
}
