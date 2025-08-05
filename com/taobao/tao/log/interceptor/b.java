package com.taobao.tao.log.interceptor;

import android.content.Context;

/* loaded from: classes8.dex */
public interface b {

    /* loaded from: classes8.dex */
    public interface a {
        void onUploadStop(int i, String str);
    }

    void a();

    void a(Context context, RealTimeLogConfig realTimeLogConfig, a aVar);

    void a(RealTimeLogConfig realTimeLogConfig);

    void a(String str);
}
