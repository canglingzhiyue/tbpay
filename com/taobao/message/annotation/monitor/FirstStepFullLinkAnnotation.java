package com.taobao.message.annotation.monitor;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes7.dex */
public @interface FirstStepFullLinkAnnotation {
    boolean needLocalMonitor() default false;

    boolean needPersistence() default true;

    String stepId();

    String subTraceType();

    String traceType();

    int typeId();

    String userId();
}
