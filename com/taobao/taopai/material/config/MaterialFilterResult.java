package com.taobao.taopai.material.config;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
/* loaded from: classes8.dex */
public @interface MaterialFilterResult {
    public static final int DISABLE_DEVICE_SCORE = -3;
    public static final int DISABLE_EXCEPTION = -4;
    public static final int DISABLE_MODEL = -1;
    public static final int DISABLE_SPEED = -2;
    public static final int ENABLE = 0;
    public static final int UNKOWN = -100;
}
