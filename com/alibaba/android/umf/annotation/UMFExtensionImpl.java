package com.alibaba.android.umf.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.SOURCE)
/* loaded from: classes2.dex */
public @interface UMFExtensionImpl {
    String code();

    boolean required() default false;
}
