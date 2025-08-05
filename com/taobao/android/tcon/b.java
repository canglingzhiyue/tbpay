package com.taobao.android.tcon;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.ABGlobal;

/* loaded from: classes6.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75c56f77", new Object[]{application});
        } else if (!ABGlobal.isFeatureOpened(null, "openssl_pre_init")) {
        } else {
            OpenSSLInit.init();
        }
    }
}
