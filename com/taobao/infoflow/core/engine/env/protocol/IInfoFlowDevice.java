package com.taobao.infoflow.core.engine.env.protocol;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public interface IInfoFlowDevice {
    public static final String LEVEL_HIGH = "h";
    public static final String LEVEL_LOW = "l";
    public static final String LEVEL_MED = "m";
    public static final String LEVEL_UNKNOWN = "unknown";

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes7.dex */
    public @interface LEVEL {
    }

    String a();

    int b();
}
