package com.taobao.analysis;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes4.dex */
public interface StageType {
    public static final String PARSE = "parse";
    public static final String PROCESS = "process";
    public static final String RENDER = "render";

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes4.dex */
    public @interface Definition {
    }
}
