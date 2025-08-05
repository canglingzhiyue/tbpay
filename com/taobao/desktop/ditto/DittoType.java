package com.taobao.desktop.ditto;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes7.dex */
public interface DittoType {
    public static final int BIG = 3;
    public static final int MIDDLE = 2;
    public static final int MINI = 0;
    public static final int SMALL = 1;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes7.dex */
    public @interface Definition {
    }
}
