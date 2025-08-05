package com.taobao.tbdeviceevaluator;

import android.app.Application;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.q;
import android.util.Log;
import com.ali.alihadeviceevaluator.old.HardWareInfo;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.orange.d;
import com.taobao.tbdeviceevaluator.jsbridge.AliHADeviceEvaluationBridge;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import tb.aks;
import tb.akt;
import tb.aku;
import tb.alb;
import tb.alf;

/* loaded from: classes.dex */
public class TBHardwareLauncher implements d, Serializable, Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ORANGE_NAMESPACE = "DeviceEval";

    public void init(Application application, HashMap<String, Object> hashMap) {
        long currentTimeMillis;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{this, application, hashMap});
            return;
        }
        String str = "TBHardwareLauncher start " + System.currentTimeMillis();
        if (!application.getSharedPreferences("deviceevaluator", 0).getBoolean("switch", true)) {
            Log.e(alf.TAG, "switch is off!");
            alf.f25418a = application;
            configOrange();
            return;
        }
        HandlerThread handlerThread = new HandlerThread("DeviceJudge");
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        initHardware(application, handler);
        handler.postDelayed(this, 2000L);
        String str2 = "TBHardwareLauncher end" + System.currentTimeMillis() + ",duration:" + (System.currentTimeMillis() - currentTimeMillis);
    }

    private void initHardware(Application application, Handler handler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("deec5f50", new Object[]{this, application, handler});
            return;
        }
        new aku().a(application).a(handler).a(new aku.a() { // from class: com.taobao.tbdeviceevaluator.TBHardwareLauncher.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.aku.a
            public void a(int i, float f) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c114785", new Object[]{this, new Integer(i), new Float(f)});
                    return;
                }
                c cVar = new c();
                cVar.a(i);
                cVar.g(f);
            }
        }).a();
        q.a("AliHADeviceEvaluationBridge", (Class<? extends e>) AliHADeviceEvaluationBridge.class, true);
    }

    private void configOrange() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8cb89897", new Object[]{this});
            return;
        }
        OrangeConfig.getInstance().getConfigs(ORANGE_NAMESPACE);
        OrangeConfig.getInstance().registerListener(new String[]{ORANGE_NAMESPACE}, this, true);
    }

    @Override // com.taobao.orange.d
    public void onConfigUpdate(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
            return;
        }
        Map<String, String> configs = OrangeConfig.getInstance().getConfigs(ORANGE_NAMESPACE);
        if (configs == null || configs.size() <= 0) {
            return;
        }
        try {
            akt.a((HashMap) configs);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        long currentTimeMillis;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        String str = "async start :" + System.currentTimeMillis();
        configOrange();
        HardWareInfo b = aku.b();
        c cVar = new c();
        if (b == null) {
            Log.e(alf.TAG, "hardWareInfo is null");
            return;
        }
        int h = b.h();
        if (h > 0) {
            cVar.i(h);
            cVar.a(akt.a());
        }
        cVar.a(Build.MODEL);
        cVar.a(b.m);
        cVar.c(b.k);
        cVar.b(b.l);
        if (b.d() > 0) {
            cVar.e(b.d());
        }
        cVar.b(b.f1802a);
        cVar.c(b.b);
        cVar.d(b.j);
        cVar.d(b.d);
        cVar.e(b.e);
        cVar.b(b.c);
        if (b.l() > 0) {
            cVar.f(b.l());
        }
        cVar.f(b.h);
        cVar.e(b.g);
        cVar.f((float) b.i);
        cVar.a(aks.a().f().f25406a);
        int[] a2 = new alb().a(alf.f25418a);
        cVar.c(a2[0]);
        cVar.d(a2[1]);
        if (b.i() > 0) {
            cVar.g(b.i());
        }
        cVar.g(aks.a().d().d);
        cVar.h(b.j());
        String str2 = "async end " + System.currentTimeMillis() + ", duration:" + (System.currentTimeMillis() - currentTimeMillis);
    }
}
