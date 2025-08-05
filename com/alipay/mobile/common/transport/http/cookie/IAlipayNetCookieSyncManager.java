package com.alipay.mobile.common.transport.http.cookie;

import android.content.Context;

/* loaded from: classes3.dex */
public interface IAlipayNetCookieSyncManager {
    void createInstance(Context context);

    void getInstance();

    void sync();
}
