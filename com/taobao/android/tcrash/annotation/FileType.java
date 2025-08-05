package com.taobao.android.tcrash.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
/* loaded from: classes6.dex */
public @interface FileType {
    public static final String ANR = "anr";
    public static final String CRASH_JAVA = "java";
    public static final String CRASH_NATIVE = "native";
}
