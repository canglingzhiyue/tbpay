package com.taobao.tao.infoflow.multitab.viewprovider;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes8.dex */
public interface IMultiTabStabilityListener {
    public static final String ON_RENDER = "onRender";

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes8.dex */
    public @interface OnErrorType {
    }

    void a(String str, String str2, String str3);
}
