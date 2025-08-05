package com.taobao.themis.inside.Initializer;

import android.app.Application;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_plugin.WeexPlugin;
import com.taobao.monitor.procedure.s;
import com.taobao.themis.inside.Initializer.kernel.b;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.utils.n;
import com.taobao.themis.kernel.utils.t;
import com.taobao.themis.utils.f;
import java.io.Serializable;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.kge;
import tb.sxh;
import tb.trl;

/* loaded from: classes9.dex */
public class TMSNecessaryInitializer implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String NAME = "tms-launcher-2";
    private static final String TAG = "TMSInitializer:tms-launcher-2";
    private static AtomicBoolean isInitialized;
    private static b scheduler;

    static {
        kge.a(1205976803);
        kge.a(1028243835);
        isInitialized = new AtomicBoolean(false);
    }

    public static void init(final Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{application, hashMap});
            return;
        }
        t.c.compareAndSet(-1L, System.currentTimeMillis());
        TMSLogger.d(TAG, "TMSNecessaryInitializer start");
        if (isInitialized.get()) {
            return;
        }
        s.f18233a.d().a("tmsNecessaryInitTime", Long.valueOf(f.a(t.c.get())));
        try {
            WeexPlugin.setProcessStartUpTimestamp(Double.valueOf(t.c.get()));
        } catch (Throwable th) {
            TMSLogger.a(TAG, th);
        }
        if (!t.b(application.getApplicationContext())) {
            TMSLogger.d(TAG, "skip TMSEarlyInitializer");
            return;
        }
        if (f.a(application.getApplicationContext())) {
            com.taobao.themis.kernel.utils.a.a(new Runnable() { // from class: com.taobao.themis.inside.Initializer.TMSNecessaryInitializer.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        Toast.makeText(application.getApplicationContext(), "Themis 冷启优化开始执行", 0).show();
                    }
                }
            });
        }
        scheduler = new b(TAG);
        if (!t.f(application).b()) {
            TMSLogger.d(TAG, "TMSNecessaryInitializer WindVaneInitPreCreateTask register start");
            scheduler.a(new trl(NAME));
        }
        if (n.bi()) {
            scheduler.a(new sxh(NAME));
        }
        scheduler.a(application, hashMap);
        isInitialized.set(true);
    }
}
