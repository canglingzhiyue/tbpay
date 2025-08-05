package com.taobao.android.behavix;

import android.app.Application;
import android.taobao.windvane.jsbridge.q;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavix.adapter.BXBRBridge;
import com.taobao.android.behavix.adapter.a;
import com.taobao.android.behavix.behavixswitch.j;
import com.taobao.android.behavix.utils.Debuggable;
import com.taobao.android.testutils.JsBridgeBehaviXConfig;
import com.taobao.android.testutils.b;
import com.taobao.android.ucp.bridge.NativeDelegate;
import com.taobao.orange.OConstant;
import com.taobao.tao.log.TLog;
import java.util.HashMap;
import tb.drn;
import tb.dro;
import tb.dsb;
import tb.dsf;
import tb.dsg;
import tb.dsj;
import tb.dsk;
import tb.dsq;
import tb.kge;
import tb.riq;

/* loaded from: classes.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "BehaviX";

    /* renamed from: a  reason: collision with root package name */
    public static long f9182a;
    private static d b;
    private static volatile Application c;
    private static String d;
    private static int e;
    private static String f;
    private static boolean g;
    private static volatile boolean h;

    static {
        kge.a(1667389648);
        b = new d();
        e = -1;
        g = false;
        h = false;
        f9182a = 0L;
    }

    private d() {
    }

    public static d a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("31d60172", new Object[0]) : b;
    }

    public static void a(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f47168dc", new Object[]{application, hashMap});
        } else if (h) {
        } else {
            f9182a = System.nanoTime();
            if (application != null && hashMap != null) {
                TLog.loge("BehaviX", "behavix init start");
                String str = a.a(hashMap) ? "taobao" : (String) hashMap.get("appName");
                Object obj = hashMap.get(OConstant.LAUNCH_ENVINDEX);
                if (obj instanceof Integer) {
                    e = ((Integer) obj).intValue();
                }
                Object obj2 = hashMap.get("usingNGNextLaunch");
                if (obj2 instanceof Boolean) {
                    g = ((Boolean) obj2).booleanValue();
                }
                String str2 = (String) hashMap.get("ttid");
                String str3 = (String) hashMap.get("userId");
                if (TextUtils.isEmpty(str)) {
                    TLog.loge("BehaviX", "BehaviX", "appName cannot be null");
                    return;
                }
                a().a(application, str, str2);
                b.a().a(hashMap);
                if (!TextUtils.isEmpty(str3)) {
                    a().a(str3);
                }
                if (com.taobao.android.behavir.b.a() == null) {
                    TLog.loge("BehaviX", "BehaviX", "br init failed");
                }
                BXBRBridge.a();
                TLog.loge("BehaviX", "behavix init end");
                return;
            }
            TLog.loge("BehaviX", "BehaviX", "application and params cannot be null");
        }
    }

    public void a(Application application, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef60750b", new Object[]{this, application, str, str2});
        } else if (h || application == null) {
        } else {
            try {
                d = str;
                f = str2;
                c = application;
                drn.a().a(application);
                Debuggable.init(application);
                dsk.a();
                riq.a(application);
                if (dro.e()) {
                    com.ut.mini.module.trackerlistener.b.getInstance().registerListener(dsq.a());
                } else if (com.taobao.android.behavix.behavixswitch.a.b(j.b.K_ENABLE_REGISTER_UTPLUGIN, true)) {
                    com.ut.mini.module.trackerlistener.b.getInstance().registerListener(dsq.a());
                    TLog.logi("BehaviX", "BehaviX", "utplugin_init ");
                }
                a(application);
                f();
                b.a();
            } catch (Exception e2) {
                dsb.a("init_error", null, null, e2);
            }
            h = true;
        }
    }

    private void a(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75c56f77", new Object[]{this, application});
            return;
        }
        application.registerActivityLifecycleCallbacks(dsg.a());
        dsg.a().a(dsf.a());
    }

    public static Application b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Application) ipChange.ipc$dispatch("2271dcb8", new Object[0]) : c;
    }

    public static String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[0]) : d;
    }

    public static int g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5c0f961", new Object[0])).intValue() : e;
    }

    public static String d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[0]) : f;
    }

    public static boolean h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[0])).booleanValue() : g;
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            dsj.f26943a = str;
        }
    }

    private static void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[0]);
            return;
        }
        try {
            q.a(JsBridgeBehaviXConfig.NAME, (Class<? extends android.taobao.windvane.jsbridge.e>) JsBridgeBehaviXConfig.class);
            q.a("TBUserActionJSBridge", (Class<? extends android.taobao.windvane.jsbridge.e>) UserActionBridge.class);
        } catch (Exception e2) {
            dsb.a("initJSBridge_fail", null, null, e2);
        }
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[0])).booleanValue() : h;
    }

    public static boolean i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[0])).booleanValue() : "1".equals(NativeDelegate.getCppStaticVariable(NativeDelegate.StaticVariableName.CPP_LAUNCH_END));
    }
}
