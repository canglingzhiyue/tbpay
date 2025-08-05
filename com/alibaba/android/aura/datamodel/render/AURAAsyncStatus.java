package com.alibaba.android.aura.datamodel.render;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
/* loaded from: classes2.dex */
public @interface AURAAsyncStatus {
    public static final String failed = "failed";
    public static final String init = "init";
    public static final String none = "none";
    public static final String success = "success";
}
