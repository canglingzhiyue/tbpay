package com.taobao.homepage.utils;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.ABGlobal;
import com.taobao.tao.Globals;
import tb.kge;
import tb.oqc;

/* loaded from: classes.dex */
public class n {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f17296a;
    private static boolean b;
    private static boolean c;
    private static boolean f;
    private static boolean g;
    private static boolean h;
    private static boolean i;
    private static final com.taobao.performance.g j;

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue();
        }
        return true;
    }

    static {
        kge.a(331292824);
        j = new com.taobao.performance.g();
        c(Globals.getApplication());
    }

    private static void c(Context context) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f76bb9e", new Object[]{context});
            return;
        }
        i = ABGlobal.isFeatureOpened(context, "welBreak");
        f = com.taobao.android.launcher.common.h.a(".dag_systrace_x_open");
        if (com.taobao.android.launcher.common.h.a(".dag_report_switch_on") && com.taobao.android.launcher.common.h.a(".report_custom_dag_point")) {
            z = true;
        }
        g = z;
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : c();
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue() : StringUtils.equals(str, "coldStart");
    }

    public static boolean a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context})).booleanValue() : com.taobao.tao.tbmainfragment.d.b(context);
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue() : com.taobao.tao.homepage.launcher.g.b().equals("l");
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[0])).booleanValue() : f17296a;
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[0])).booleanValue() : b;
    }

    public static boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[0])).booleanValue() : c;
    }

    public static boolean k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[0])).booleanValue() : h;
    }

    public static int l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6076ee6", new Object[0])).intValue() : c() ? 6 : 3;
    }

    public static boolean m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6158678", new Object[0])).booleanValue() : i;
    }

    public static com.taobao.performance.g n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.performance.g) ipChange.ipc$dispatch("27b54c5b", new Object[0]) : j;
    }

    public static boolean o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("631b57a", new Object[0])).booleanValue() : com.taobao.tao.recommend3.tracelog.c.a(oqc.a().m());
    }

    public static boolean g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[0])).booleanValue() : com.taobao.android.home.component.utils.j.a("enableForeignPerformanceOpt", true);
    }

    public static boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("63fccfb", new Object[0])).booleanValue();
        }
        String m = oqc.a().m();
        if (!com.taobao.android.home.component.utils.j.a("enableNotCheckLaunchType", true)) {
            return o();
        }
        return com.taobao.android.editionswitcher.l.f(Globals.getApplication()) && StringUtils.equals(m, oqc.a().m());
    }
}
