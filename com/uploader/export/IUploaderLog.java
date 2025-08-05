package com.uploader.export;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public interface IUploaderLog {
    public static final int D = 2;
    public static final int E = 16;
    public static final int I = 4;
    public static final int V = 1;
    public static final int W = 8;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes9.dex */
    public @interface Definition {
    }

    int a(int i, String str, String str2, Throwable th);

    boolean a(int i);
}
