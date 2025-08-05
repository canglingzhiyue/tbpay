package com.taobao.android.dxv4common.model;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.SOURCE)
/* loaded from: classes5.dex */
public @interface ShortDef {
    boolean flag() default false;

    short[] value() default {};
}
