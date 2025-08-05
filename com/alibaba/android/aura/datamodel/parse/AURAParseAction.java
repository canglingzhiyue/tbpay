package com.alibaba.android.aura.datamodel.parse;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
/* loaded from: classes2.dex */
public @interface AURAParseAction {
    public static final String ACTION_DEFAULT = "default";
    public static final String ACTION_MODIFY = "modify";
    public static final String ACTION_ROLLBACK = "rollback";
}
