package com.alibaba.android.aura.datamodel.rule;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
/* loaded from: classes2.dex */
public @interface AURARuleType {
    public static final String TYPE_MODIFY = "modify";
    public static final String TYPE_ROLLBACK = "rollback";
}
