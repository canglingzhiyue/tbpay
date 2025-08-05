package com.taobao.tbmobilesmartapi.annotation;

import com.taobao.tbmobilesmartapi.core.a;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.SOURCE)
/* loaded from: classes8.dex */
public @interface ServicesImpl {
    Class<? extends a> value();
}
