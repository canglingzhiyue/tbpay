package com.alibaba.poplayer.utils;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import tb.kge;

/* loaded from: classes3.dex */
public class Monitor {

    @Target({ElementType.TYPE})
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    /* loaded from: classes3.dex */
    public @interface TargetClass {
        String tag() default "";
    }

    @Target({ElementType.FIELD})
    @Retention(RetentionPolicy.RUNTIME)
    /* loaded from: classes3.dex */
    public @interface TargetField {
        String name() default "";

        String prefix() default "";
    }

    static {
        kge.a(1354721806);
    }

    private Monitor() {
    }
}
