package com.taobao.android.tcon;

import android.app.Application;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.HashMap;

/* loaded from: classes.dex */
public class TconInitializer implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TCON_TAG = "TCON";
    private static Application appContext;

    public static void init(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{application, hashMap});
        } else if (application == null) {
            Log.e(TCON_TAG, "null application");
        } else {
            appContext = application;
            c.a(application, hashMap);
            TconASAN.init(application);
            TconMemoryGraph.init(application);
            TconFDSAN.init(application);
            TconCpuProfiler.init(application);
            b.a(application);
        }
    }

    public static Application getAppContext() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Application) ipChange.ipc$dispatch("1a7a99a", new Object[0]) : appContext;
    }
}
