package com.taobao.android.ultron.common;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
/* loaded from: classes6.dex */
public @interface UltronDeltaOpType {
    public static final String delete = "delete";
    public static final String insert = "insert";
    public static final String merge = "merge";
    public static final String replace = "replace";
}
