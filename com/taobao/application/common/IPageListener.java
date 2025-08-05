package com.taobao.application.common;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* loaded from: classes.dex */
public interface IPageListener {
    public static final int DRAW_START = 1;
    public static final int INIT_TIME = 0;
    public static final int INTERACTIVE = 3;
    public static final int SKI_INTERACTIVE = 4;
    public static final int VISIBLE = 2;

    @Target({ElementType.PARAMETER})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes6.dex */
    public @interface PageStatus {
    }

    void a(String str, int i, long j);
}
