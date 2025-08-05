package com.taobao.analysis.v3;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes4.dex */
public interface FalcoSpanLayer {
    public static final String ABILITY = "Ability";
    public static final String BUSINESS = "Business";
    public static final String FRAMEWORK_CONTAINER = "FrameworkContainer";
    public static final String LOAD_ACTION = "LoadAction";
    public static final String NETWORK_ABILITY = "MobileService";
    public static final String TOUCH_ACTION = "TouchAction";

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes4.dex */
    public @interface Definition {
    }
}
