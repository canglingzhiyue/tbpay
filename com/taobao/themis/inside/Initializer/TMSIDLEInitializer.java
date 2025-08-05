package com.taobao.themis.inside.Initializer;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.procedure.s;
import com.taobao.themis.inside.Initializer.kernel.b;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.utils.n;
import com.taobao.themis.kernel.utils.t;
import com.taobao.themis.utils.f;
import java.io.Serializable;
import java.util.HashMap;
import tb.kge;
import tb.sxd;
import tb.sxe;
import tb.sxf;
import tb.sxg;
import tb.sxh;
import tb.sxi;
import tb.sxj;

/* loaded from: classes9.dex */
public class TMSIDLEInitializer implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String NAME = "tms-launcher-3";
    private static final String TAG = "TMSInitializer:tms-launcher-3";
    private static b scheduler;

    static {
        kge.a(-1023209026);
        kge.a(1028243835);
    }

    public static void init(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{application, hashMap});
            return;
        }
        t.d.compareAndSet(-1L, System.currentTimeMillis());
        s.f18233a.d().a("tmsIDLInitTime", Long.valueOf(f.a(t.d.get())));
        if (!t.b(application.getApplicationContext())) {
            TMSLogger.d(TAG, "skip TMSEarlyInitializer");
            return;
        }
        b bVar = new b(TAG);
        scheduler = bVar;
        bVar.a(new sxi(NAME));
        if (!n.bi()) {
            scheduler.a(new sxh(NAME));
        }
        scheduler.a(new sxd(NAME));
        scheduler.a(new sxg(NAME));
        scheduler.a(new sxe(NAME));
        scheduler.a(new sxj(NAME));
        scheduler.a(new sxf(NAME));
        scheduler.a(application, hashMap);
    }
}
