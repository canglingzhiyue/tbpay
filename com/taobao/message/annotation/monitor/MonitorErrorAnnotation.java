package com.taobao.message.annotation.monitor;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes7.dex */
public @interface MonitorErrorAnnotation {
    String errorCode();

    String errorMsg();

    String module();

    String point();

    String traceId() default "";

    String userId() default "";
}
