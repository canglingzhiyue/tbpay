package com.taobao.android.launcher;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.ay;
import com.taobao.android.dinamicx.bu;
import com.taobao.android.dinamicx.exception.a;
import com.taobao.android.tcrash.TCrashSDK;
import java.io.Serializable;
import java.util.HashMap;

/* loaded from: classes.dex */
public class DinamicXLauncherV3 implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f47168dc", new Object[]{application, hashMap});
            return;
        }
        bu.a(application);
        try {
            TCrashSDK.instance().addJvmUncaughtCrashListener(new ay());
        } catch (Throwable th) {
            a.b(th);
        }
    }
}
