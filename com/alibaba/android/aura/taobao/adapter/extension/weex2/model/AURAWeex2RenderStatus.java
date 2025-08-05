package com.alibaba.android.aura.taobao.adapter.extension.weex2.model;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
/* loaded from: classes2.dex */
public @interface AURAWeex2RenderStatus {
    public static final int STATUS_INIT = 0;
    public static final int STATUS_RENDERING = 1;
    public static final int STATUS_RENDER_DESTROY = 4;
    public static final int STATUS_RENDER_FAILED = 3;
    public static final int STATUS_RENDER_SUCCESS = 2;
}
