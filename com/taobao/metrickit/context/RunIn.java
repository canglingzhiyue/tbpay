package com.taobao.metrickit.context;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Documented
@Retention(RetentionPolicy.SOURCE)
/* loaded from: classes7.dex */
public @interface RunIn {
    String value();
}
