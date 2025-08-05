package com.taobao.android.xsearch.anno;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.SOURCE)
/* loaded from: classes6.dex */
public @interface MUSCollectMethod {
    String description();

    String enterParams();

    String minSVersion();

    String name();
}
