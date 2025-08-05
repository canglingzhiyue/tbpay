package com.taobao.android.litecreator.preload;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes5.dex */
public interface IPriority {
    public static final int LEVEL_HIGH = 2;
    public static final int LEVEL_LOW = 0;
    public static final int LEVEL_NORMAL = 1;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes5.dex */
    public @interface Value {
        public static final int HORIZONTAL = 1;
        public static final int VERTICAL = 0;
    }
}
