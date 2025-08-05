package com.alibaba.android.icart.core.data.config;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
/* loaded from: classes2.dex */
public @interface CartRequestType {
    public static final String query = "query";
    public static final String queryNextPage = "queryNextPage";
    public static final String update = "update";
    public static final String updateStruct = "updateStruct";
}
