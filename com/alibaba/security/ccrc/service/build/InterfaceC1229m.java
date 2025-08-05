package com.alibaba.security.ccrc.service.build;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: com.alibaba.security.ccrc.service.build.m  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public @interface InterfaceC1229m {
    String apiName() default "";

    boolean intercept() default false;

    boolean isAsync() default true;

    Class<?> responseType() default String.class;
}
