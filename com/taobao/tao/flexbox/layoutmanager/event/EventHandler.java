package com.taobao.tao.flexbox.layoutmanager.event;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes8.dex */
public @interface EventHandler {
    String name();
}
