package com.taobao.adaemon;

import android.app.Application;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.HashMap;
import tb.kge;

/* loaded from: classes.dex */
public class Launcher_InitProcessMonitor implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "adaemon";

    static {
        kge.a(-1942057955);
        kge.a(1028243835);
    }

    public static void init(final Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{application, hashMap});
            return;
        }
        Log.e(TAG, "Launcher_InitProcessMonitor");
        j.a().a(application);
        if (!j.a().f()) {
            return;
        }
        Log.e(TAG, "registerLifecycle");
        g.b().a(application);
        c.a(new Runnable() { // from class: com.taobao.adaemon.Launcher_InitProcessMonitor.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                Log.e(Launcher_InitProcessMonitor.TAG, "LocalProcessMonitor start");
                g.b().b(application);
            }
        });
    }
}
