package com.taobao.android.dinamicx;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public interface IDXHardwareInterface {
    public static final int LEVEL_HIGH = 0;
    public static final int LEVEL_LOW = 2;
    public static final int LEVEL_MEDIUM = 1;
    public static final int LEVEL_UNKNOWN = -1;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes5.dex */
    public @interface DeviceLevel {
    }

    int a();
}
