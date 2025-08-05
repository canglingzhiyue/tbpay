package com.taobao.android.fluid.framework.preload.task;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Map;
import tb.sor;

/* loaded from: classes5.dex */
public interface IPreloadTask {
    public static final int TYPE_CANCEL_PRELOAD = 0;
    public static final int TYPE_HUITUI = 10;
    public static final int TYPE_ICON_STREAM_REQUEST = 2;
    public static final int TYPE_ICON_STREAM_REQUEST_HIGH_VERSION = 3;
    public static final int TYPE_INACTIVE_PRELOAD = 4;
    public static final int TYPE_NORMAL_PRELOAD = 1;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes5.dex */
    public @interface PreloadTaskType {
    }

    Context a();

    void a(sor sorVar, com.taobao.android.fluid.core.a<sor> aVar);

    boolean a(JSONObject jSONObject);

    sor b();

    void b(com.taobao.android.fluid.core.a<sor> aVar);

    Map d();

    int e();
}
