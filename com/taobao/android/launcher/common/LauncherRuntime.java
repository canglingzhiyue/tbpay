package com.taobao.android.launcher.common;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.SystemClock;
import android.taobao.safemode.k;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.linkmanager.afc.utils.TFCCommonUtils;
import com.taobao.orange.OConstant;
import com.taobao.tao.Globals;
import com.taobao.tao.TaoPackageInfo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.gtx;
import tb.gua;
import tb.jqm;

/* loaded from: classes.dex */
public class LauncherRuntime {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int LAUNCH_TYPE_LINK = 1;
    public static final int LAUNCH_TYPE_LINK_H5 = 2;
    public static final int LAUNCH_TYPE_NORMAL = 0;
    public static final int LAUNCH_TYPE_NOT_ACTIVITY = 4;
    public static final int LAUNCH_TYPE_OTHER = 3;
    public static final String PROCESS_CHANNEL = "com.taobao.taobao:channel";
    public static final String PROCESS_DEX2OAT = "com.taobao.taobao:dex2oat";
    public static final String PROCESS_DEXMERGE = "com.taobao.taobao:dexmerge";
    public static final String PROCESS_MAIN = "com.taobao.taobao";
    public static final String PROCESS_SAFEMODE = "com.taobao.taobao:safemode";
    public static final String PROCESS_SUPPORT = "com.taobao.taobao:support";
    public static final String PROCESS_TOOL = "com.taobao.taobao:tool";
    public static final String PROCESS_UC_SUFFIX = ":sandboxed_privilege_process";
    public static final String PROCESS_UNKNOWN = "unknown";
    public static final String PROCESS_WIDGET = ":widget";

    /* renamed from: a  reason: collision with root package name */
    public static long f13108a;
    public static String b;
    public static String c;
    public static String d;
    public static String e;
    public static String f;
    public static Context g;
    public static Application h;
    public static f i;
    public static gua j;
    public static int k;
    public static boolean l;
    public static boolean m;
    public static boolean n;
    public static boolean o;
    private static Handler p;
    private static final AtomicBoolean q = new AtomicBoolean(false);
    public static final d sLoginState = new d();

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes5.dex */
    public @interface LaunchType {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes5.dex */
    public @interface LauncherProcess {
    }

    public static void a(Application application, gtx gtxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f9acddc", new Object[]{application, gtxVar});
            return;
        }
        h = application;
        g = application;
        b = gtxVar.f28453a;
        c = gtxVar.b;
        f13108a = gtxVar.c;
        e = gtxVar.d;
        p = new Handler();
        Globals.init(application, LauncherRuntime.class.getClassLoader());
        TaoPackageInfo.init();
        f = TaoPackageInfo.getPackageTag();
        d = TaoPackageInfo.getTTID();
        jqm.a(application);
        l = jqm.a();
        k = b(application);
        a(application);
        System.setProperty(OConstant.DIMEN_PROCESS_START_TIME, String.valueOf(SystemClock.uptimeMillis()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
        if (tb.guc.a(r4, "welBreak_" + android.os.Build.MODEL) != false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(android.content.Context r4) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.launcher.common.LauncherRuntime.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L12
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r1[r2] = r4
            java.lang.String r4 = "9e1d6460"
            r0.ipc$dispatch(r4, r1)
            return
        L12:
            boolean r0 = tb.gty.a(r4)
            if (r0 != 0) goto L19
            goto L4b
        L19:
            boolean r0 = com.taobao.android.autosize.l.a(r4)
            if (r0 == 0) goto L20
            goto L4b
        L20:
            int r0 = com.taobao.android.launcher.common.LauncherRuntime.k
            if (r0 == 0) goto L25
            goto L4b
        L25:
            java.lang.String r0 = "welBreak"
            boolean r0 = tb.guc.a(r4, r0)
            if (r0 == 0) goto L30
        L2e:
            r3 = 0
            goto L4b
        L30:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "welBreak_"
            r0.append(r1)
            java.lang.String r1 = android.os.Build.MODEL
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            boolean r4 = tb.guc.a(r4, r0)
            if (r4 == 0) goto L4b
            goto L2e
        L4b:
            com.taobao.android.launcher.common.LauncherRuntime.m = r3
            com.taobao.android.nav.Nav.useWelcome(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.launcher.common.LauncherRuntime.a(android.content.Context):void");
    }

    public static void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39112e6", new Object[]{runnable});
        } else {
            p.post(runnable);
        }
    }

    public static boolean a(com.taobao.android.job.core.task.e<String, Void> eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8abeed95", new Object[]{eVar})).booleanValue();
        }
        gua guaVar = j;
        if (guaVar != null) {
            return guaVar.c.a(eVar, 1);
        }
        return false;
    }

    public static boolean b(com.taobao.android.job.core.task.e<String, Void> eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("175f1896", new Object[]{eVar})).booleanValue();
        }
        gua guaVar = j;
        if (guaVar != null) {
            return guaVar.f.a(eVar);
        }
        return false;
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : q.get();
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue();
        }
        if ((i instanceof e) && q.compareAndSet(false, true)) {
            ((e) i).m();
        }
        return true;
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue();
        }
        if (q.get() || !(i instanceof e) || !q.compareAndSet(false, true)) {
            return true;
        }
        ((e) i).m();
        return false;
    }

    public static boolean a(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d8033c29", new Object[]{intent})).booleanValue();
        }
        if (intent == null) {
            return false;
        }
        if (!"android.intent.action.MAIN".equals(intent.getAction())) {
            return b(intent);
        }
        if (intent.hasCategory("android.intent.category.LAUNCHER")) {
            return true;
        }
        ComponentName component = intent.getComponent();
        if (component != null) {
            return "com.taobao.tao.welcome.Welcome".equals(component.getClassName());
        }
        return false;
    }

    private static boolean b(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("15320aa", new Object[]{intent})).booleanValue();
        }
        ComponentName component = intent.getComponent();
        return component != null && "com.taobao.tao.welcome.Welcome".equals(component.getClassName()) && intent.getScheme() == null;
    }

    public static k d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (k) ipChange.ipc$dispatch("15f7f8cf", new Object[0]) : android.taobao.safemode.h.a().c();
    }

    private static int b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9eca0ff2", new Object[]{context})).intValue();
        }
        k c2 = android.taobao.safemode.h.a().c();
        if (c2 == null) {
            return 0;
        }
        if (!c2.f1531a) {
            return 4;
        }
        if (a(c2.e) || c2.e == null) {
            return 0;
        }
        return TFCCommonUtils.a(context, c2.e.getDataString()) ? 2 : 1;
    }
}
