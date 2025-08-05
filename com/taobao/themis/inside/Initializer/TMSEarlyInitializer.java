package com.taobao.themis.inside.Initializer;

import android.app.Application;
import android.os.Handler;
import android.taobao.windvane.extra.launch.LaunchTaskExperiment;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.procedure.s;
import com.taobao.themis.inside.Initializer.kernel.b;
import com.taobao.themis.kernel.adapter.IDeviceInfoAdapter;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.utils.t;
import com.taobao.themis.utils.f;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import tb.kge;
import tb.qpo;
import tb.qpt;
import tb.sxb;
import tb.sxc;

/* loaded from: classes9.dex */
public class TMSEarlyInitializer implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String NAME = "tms-launcher-1";
    private static final String TAG = "TMSInitializer:tms-launcher-1";
    private static b scheduler;

    static {
        kge.a(2144375375);
        kge.a(1028243835);
    }

    public static void init(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{application, hashMap});
            return;
        }
        t.b.compareAndSet(-1L, System.currentTimeMillis());
        TMSLogger.d(TAG, "TMSEarlyInitializer start");
        if (!t.b(application.getApplicationContext())) {
            TMSLogger.d(TAG, "skip TMSEarlyInitializer");
            return;
        }
        s.f18233a.d().a("tmsEarlyInitTime", Long.valueOf(f.a(t.b.get())));
        b bVar = new b(TAG);
        scheduler = bVar;
        bVar.a(new sxb(NAME));
        scheduler.a(new sxc(NAME));
        scheduler.a(application, hashMap);
        if (!t.b(application.getApplicationContext(), "initTaskExecutorV2").b()) {
            return;
        }
        executeNecessaryTask(application, hashMap);
    }

    private static void executeNecessaryTask(final Application application, final HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23b9b47a", new Object[]{application, hashMap});
            return;
        }
        try {
            qpo.d(application.getApplicationContext());
            IDeviceInfoAdapter iDeviceInfoAdapter = (IDeviceInfoAdapter) qpt.b(IDeviceInfoAdapter.class);
            List<Pair<Integer, Integer>> f = t.f("postDelayNumber");
            int i = 5000;
            if (iDeviceInfoAdapter != null) {
                int deviceScore = iDeviceInfoAdapter.getDeviceScore();
                Iterator<Pair<Integer, Integer>> it = f.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Pair<Integer, Integer> next = it.next();
                    if (deviceScore >= next.getFirst().intValue()) {
                        i = next.getSecond().intValue() * 1000;
                        break;
                    }
                }
            }
            Handler c = com.taobao.themis.kernel.utils.a.c();
            if (c == null) {
                return;
            }
            TMSLogger.d(TAG, "TMSEarlyInitializer postDelay executeNecessaryTask postDelayTime: " + i);
            c.postDelayed(new Runnable() { // from class: com.taobao.themis.inside.Initializer.TMSEarlyInitializer.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    if (LaunchTaskExperiment.enablePrioritizeInitAndDelayPreCreate(application.getApplicationContext())) {
                        if (t.e.get() == -1) {
                            TMSResumedInitializer.init(application, hashMap);
                        }
                    } else if (t.c.get() == -1) {
                        TMSNecessaryInitializer.init(application, hashMap);
                    }
                    TMSLogger.d(TMSEarlyInitializer.TAG, "TMSEarlyInitializer executeNecessaryTask");
                }
            }, (long) i);
        } catch (Exception e) {
            TMSLogger.b(TAG, "executeNecessaryTask error", e);
        }
    }
}
