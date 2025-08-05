package com.taobao.metrickit;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* loaded from: classes7.dex */
public interface LowMemoryListener {
    public static final int JAVA_USAGE_PEAK = 1;
    public static final int NATIVE_USAGE_PEAK = 2;

    @Target({ElementType.PARAMETER})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes7.dex */
    public @interface LowMemoryType {
    }

    void a(int i, long j, long j2);
}
