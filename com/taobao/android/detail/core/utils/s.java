package com.taobao.android.detail.core.utils;

import android.content.Context;
import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import tb.eip;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class s {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Boolean f9944a;
    private static Boolean b;
    private static Boolean c;
    private static boolean d;

    static {
        kge.a(225194648);
        f9944a = null;
        b = null;
        c = null;
        d = false;
        emu.a("com.taobao.android.detail.core.utils.DeviceUtils");
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
        }
        if (f9944a == null) {
            f9944a = Boolean.valueOf(com.taobao.android.autosize.l.b(Globals.getApplication()));
        }
        if (b == null) {
            b = Boolean.valueOf(com.taobao.android.autosize.l.d(Globals.getApplication()));
        }
        boolean z = eip.B;
        String a2 = com.taobao.android.detail.core.performance.q.a("DeviceUtils");
        i.a(a2, "isPadDevice isTablet:" + f9944a + " isFoldDevice:" + b + " configEnable:" + z);
        return z && (f9944a.booleanValue() || b.booleanValue());
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue();
        }
        boolean a2 = a();
        boolean b2 = com.taobao.android.autosize.h.a().b((Context) Globals.getApplication());
        boolean c2 = c();
        String a3 = com.taobao.android.detail.core.performance.q.a("DeviceUtils");
        i.a(a3, "isPadDeviceAndLandscape isPadDevice:" + a2 + " isPortraitLayout:" + b2 + " enableDoubleColumn:" + c2);
        return c2 && a2 && !b2 && !h();
    }

    public static boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[0])).booleanValue();
        }
        if (b == null) {
            b = Boolean.valueOf(com.taobao.android.autosize.l.d(Globals.getApplication()));
        }
        boolean z = eip.b;
        boolean b2 = com.taobao.android.autosize.h.a().b((Context) Globals.getApplication());
        String a2 = com.taobao.android.detail.core.performance.q.a("DeviceUtils");
        i.a(a2, "isFoldDeviceAndLandscape isPortraitLayout:" + b2);
        return b.booleanValue() && z && !b2;
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue() : d;
    }

    public static void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{new Boolean(z)});
        } else {
            d = z;
        }
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[0])).booleanValue();
        }
        f();
        return c.booleanValue();
    }

    private static void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[0]);
        } else if (c != null) {
        } else {
            if (!eip.L) {
                c = false;
            } else {
                c = true;
            }
        }
    }

    public static void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[0]);
            return;
        }
        i.a(com.taobao.android.detail.core.performance.q.a("DeviceUtils"), "resetEnableDoubleColumn");
        c = null;
    }

    public static void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{new Boolean(z)});
            return;
        }
        String a2 = com.taobao.android.detail.core.performance.q.a("DeviceUtils");
        i.a(a2, "saveEnableDoubleColumnToSP enableDoubleColumn:" + z);
        SharedPreferences sharedPreferences = Globals.getApplication().getSharedPreferences("detail_device_sp", 0);
        if (sharedPreferences == null) {
            return;
        }
        sharedPreferences.edit().putBoolean("enable_double_column", z).apply();
    }
}
