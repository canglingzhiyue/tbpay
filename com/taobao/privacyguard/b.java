package com.taobao.privacyguard;

import android.app.Application;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import tb.kge;

/* loaded from: classes7.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(2134478699);
    }

    public static void a(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f47168dc", new Object[]{application, hashMap});
            return;
        }
        try {
            a.a().a(application, hashMap);
            com.taobao.privacyguard.config.a.a().a(application);
        } catch (Throwable th) {
            Log.e("PGInitTask", "init: init occur exception " + th);
            th.printStackTrace();
        }
    }
}
