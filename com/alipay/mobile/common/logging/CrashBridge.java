package com.alipay.mobile.common.logging;

import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;

@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: classes3.dex */
public abstract class CrashBridge {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static ICrashBridge f5402a;

    @MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
    /* loaded from: classes3.dex */
    public interface ICrashBridge {
        String a();

        String b();

        long c();

        boolean d();

        boolean e();

        String f();

        String g();

        boolean h();

        String i();

        int j();

        String k();
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        }
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
        }
    }

    public static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[0]);
        }
    }

    public static void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[0]);
        }
    }

    public static void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[0]);
        }
    }

    public static void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[0]);
        }
    }

    public static String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("50938a53", new Object[0]);
        }
        ICrashBridge iCrashBridge = f5402a;
        if (iCrashBridge == null) {
            return null;
        }
        return iCrashBridge.a();
    }

    public static String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d71944f2", new Object[0]);
        }
        ICrashBridge iCrashBridge = f5402a;
        if (iCrashBridge == null) {
            return null;
        }
        return iCrashBridge.b();
    }

    public static long h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5cf10e3", new Object[0])).longValue();
        }
        ICrashBridge iCrashBridge = f5402a;
        if (iCrashBridge == null) {
            return 0L;
        }
        return iCrashBridge.c();
    }

    public static boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[0])).booleanValue();
        }
        ICrashBridge iCrashBridge = f5402a;
        if (iCrashBridge == null) {
            return false;
        }
        return iCrashBridge.d();
    }

    public static boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[0])).booleanValue();
        }
        ICrashBridge iCrashBridge = f5402a;
        if (iCrashBridge == null) {
            return false;
        }
        return iCrashBridge.e();
    }

    public static String k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f1302f6e", new Object[0]);
        }
        ICrashBridge iCrashBridge = f5402a;
        if (iCrashBridge == null) {
            return null;
        }
        return iCrashBridge.f();
    }

    public static String l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("77b5ea0d", new Object[0]);
        }
        ICrashBridge iCrashBridge = f5402a;
        if (iCrashBridge == null) {
            return null;
        }
        return iCrashBridge.g();
    }

    public static boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6239df9", new Object[0])).booleanValue();
        }
        ICrashBridge iCrashBridge = f5402a;
        if (iCrashBridge == null) {
            return false;
        }
        return iCrashBridge.h();
    }

    public static String o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b4719ea", new Object[0]);
        }
        ICrashBridge iCrashBridge = f5402a;
        if (iCrashBridge == null) {
            return null;
        }
        return iCrashBridge.i();
    }

    public static int p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("63fccea", new Object[0])).intValue();
        }
        ICrashBridge iCrashBridge = f5402a;
        if (iCrashBridge == null) {
            return 11;
        }
        return iCrashBridge.j();
    }

    public static String q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("18528f28", new Object[0]);
        }
        ICrashBridge iCrashBridge = f5402a;
        if (iCrashBridge == null) {
            return null;
        }
        return iCrashBridge.k();
    }
}
