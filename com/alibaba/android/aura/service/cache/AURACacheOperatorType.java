package com.alibaba.android.aura.service.cache;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
/* loaded from: classes2.dex */
public @interface AURACacheOperatorType {
    public static final int get = 0;
    public static final int set = 1;
}
