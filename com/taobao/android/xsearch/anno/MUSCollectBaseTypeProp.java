package com.taobao.android.xsearch.anno;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.SOURCE)
/* loaded from: classes6.dex */
public @interface MUSCollectBaseTypeProp {
    String description();

    boolean limitedSampleRange();

    String minSVersion();

    String name();

    String sampleValues();

    String type();
}
