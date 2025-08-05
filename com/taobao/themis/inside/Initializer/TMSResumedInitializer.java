package com.taobao.themis.inside.Initializer;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.procedure.s;
import com.taobao.themis.inside.Initializer.kernel.b;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.utils.t;
import com.taobao.themis.utils.f;
import java.io.Serializable;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.kge;
import tb.sxk;
import tb.sxl;
import tb.sxm;
import tb.trl;

/* loaded from: classes9.dex */
public class TMSResumedInitializer implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String NAME = "tms-launcher-4";
    private static final String TAG = "TMSInitializer:tms-launcher-4";
    public static AtomicBoolean isInitialized;
    private static b scheduler;

    static {
        kge.a(-73980069);
        kge.a(1028243835);
        isInitialized = new AtomicBoolean(false);
    }

    public static void init(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{application, hashMap});
            return;
        }
        TMSLogger.d(TAG, "TMSResumedInitializer start");
        if (isInitialized.get()) {
            return;
        }
        t.f.compareAndSet(-1L, System.currentTimeMillis());
        s.f18233a.d().a("tmsResumedTime", Long.valueOf(f.a(t.f.get())));
        s.f18233a.d().a("enablePreCreateWebview", t.f(application).a());
        b bVar = new b(TAG);
        scheduler = bVar;
        bVar.a(new sxk(NAME));
        if (t.f(application).b()) {
            scheduler.a(new trl(NAME));
        }
        scheduler.a(new sxl(NAME));
        scheduler.a(new sxm(NAME));
        scheduler.a(application, hashMap);
        isInitialized.set(true);
    }
}
