package com.taobao.android.weex.bridge;

import android.app.Application;
import android.content.SharedPreferences;
import com.alibaba.security.realidentity.g4;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexValue;
import com.taobao.android.weex.WeexValueImpl;
import com.taobao.android.weex.d;
import com.taobao.android.weex.inspector.b;
import com.taobao.android.weex.util.e;
import com.taobao.android.weex_framework.l;
import com.taobao.android.weex_framework.ui.m;
import com.taobao.android.weex_framework.util.a;
import com.taobao.android.weex_framework.util.f;
import com.taobao.android.weex_framework.util.g;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes6.dex */
public class WeexPlatformCommonBridge implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int ACTION_MASK = 65535;
    private static final int SIZE_SHIFT = 16;

    static {
        kge.a(358104627);
        kge.a(1028243835);
    }

    private static native void nativeCreateCppArrayBuffer(byte[] bArr, long j);

    private static native void nativeCreateCppBoolean(boolean z, long j);

    private static native void nativeCreateCppDouble(double d, long j);

    private static native void nativeCreateCppLong(long j, long j2);

    private static native void nativeCreateCppNull(long j);

    private static native void nativeCreateCppString(String str, long j);

    private static native void nativeCreateCppUndefined(long j);

    private static native void nativeCreateCppValuePack(byte[] bArr, Object[] objArr, long j);

    private static native void nativeRegisterUINode(String str, String str2, String str3, String str4);

    private static native void registerZCacheAPINative(long j);

    private static native void updateGlobalSystemEnvNative(String str);

    public static void createCppString(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a90f355b", new Object[]{str, new Long(j)});
            return;
        }
        try {
            nativeCreateCppString(str, j);
        } catch (UnsatisfiedLinkError e) {
            g.a(e);
        }
    }

    public static void createCppNull(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27693aaf", new Object[]{new Long(j)});
            return;
        }
        try {
            nativeCreateCppNull(j);
        } catch (UnsatisfiedLinkError e) {
            g.a(e);
        }
    }

    public static void createCppUndefined(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf28deb4", new Object[]{new Long(j)});
            return;
        }
        try {
            nativeCreateCppUndefined(j);
        } catch (UnsatisfiedLinkError e) {
            g.a(e);
        }
    }

    public static void createCppLong(long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ad4472a", new Object[]{new Long(j), new Long(j2)});
            return;
        }
        try {
            nativeCreateCppLong(j, j2);
        } catch (UnsatisfiedLinkError e) {
            g.a(e);
        }
    }

    public static void createCppBoolean(boolean z, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a9f6798", new Object[]{new Boolean(z), new Long(j)});
            return;
        }
        try {
            nativeCreateCppBoolean(z, j);
        } catch (UnsatisfiedLinkError e) {
            g.a(e);
        }
    }

    public static void createCppDouble(double d, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3c830c5", new Object[]{new Double(d), new Long(j)});
            return;
        }
        try {
            nativeCreateCppDouble(d, j);
        } catch (UnsatisfiedLinkError e) {
            g.a(e);
        }
    }

    public static void createCppArrayBuffer(byte[] bArr, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b60ce44", new Object[]{bArr, new Long(j)});
            return;
        }
        try {
            nativeCreateCppArrayBuffer(bArr, j);
        } catch (UnsatisfiedLinkError e) {
            g.a(e);
        }
    }

    public static void createCppValuePack(byte[] bArr, Object[] objArr, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a1af464", new Object[]{bArr, objArr, new Long(j)});
            return;
        }
        try {
            nativeCreateCppValuePack(bArr, objArr, j);
        } catch (UnsatisfiedLinkError e) {
            g.a(e);
        }
    }

    public static Object CreateJavaValueByCppPack(byte[] bArr, String[] strArr, Object[] objArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("cd225f20", new Object[]{bArr, strArr, objArr}) : e.a(bArr, strArr, objArr);
    }

    public static Object CreateJavaValueByUndefined() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("48c18f45", new Object[0]) : WeexValueImpl.ofNull();
    }

    public static Object CreateJavaValueByNull() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("2495eb1a", new Object[0]) : WeexValueImpl.ofNull();
    }

    public static Object CreateJavaValueByInt(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("f909fabb", new Object[]{new Integer(i)}) : WeexValueImpl.ofInt(i);
    }

    public static Object CreateJavaValueByBool(boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("48ee8919", new Object[]{new Boolean(z)}) : WeexValueImpl.ofBool(z);
    }

    public static Object CreateJavaValueByLong(long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("7254d53b", new Object[]{new Long(j)}) : WeexValueImpl.ofLong(j);
    }

    public static Object CreateJavaValueByDouble(double d) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("86384c16", new Object[]{new Double(d)}) : WeexValueImpl.ofDouble(d);
    }

    public static Object CreateJavaValueByString(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("65ff2d46", new Object[]{str}) : WeexValueImpl.ofString(str);
    }

    public static Object CreateJavaValueByAtomString(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("68749522", new Object[]{new Integer(i)}) : WeexValueImpl.ofString(a.a(i));
    }

    public static Object CreateJavaValueByFunction(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("370eea38", new Object[]{new Integer(i)}) : WeexValueImpl.ofFunction(i);
    }

    public static Object CreateJavaValueByArrayBuffer(byte[] bArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("453d9555", new Object[]{bArr}) : WeexValueImpl.ofArrayBuffer(bArr);
    }

    public static void registerUINode(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71ddcb48", new Object[]{str, str2, str3, str4});
            return;
        }
        try {
            nativeRegisterUINode(str, str2, str3, str4);
        } catch (Throwable th) {
            g.c(g.TAG, "bridge error", th);
        }
    }

    public static void registerZCacheAPI(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0cea60e", new Object[]{new Long(j)});
            return;
        }
        try {
            registerZCacheAPINative(j);
        } catch (Throwable th) {
            g.c(g.TAG, "bridge error", th);
        }
    }

    public static void updateGlobalSystemEnv(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e31a4e3", new Object[]{str});
            return;
        }
        try {
            updateGlobalSystemEnvNative(str);
        } catch (Throwable th) {
            g.c(g.TAG, "bridge error", th);
        }
    }

    public static void RequireUINode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1d7208c", new Object[]{str});
            return;
        }
        try {
            m.c(str);
        } catch (Throwable th) {
            g.c(g.TAG, "bridge error", th);
        }
    }

    public static WeexValue GetEnvironment(int i, String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexValue) ipChange.ipc$dispatch("847f48c5", new Object[]{new Integer(i), str});
        }
        try {
            if (i == 0) {
                str2 = "system";
            } else if (i == 1) {
                str2 = "app";
            } else if (i != 2) {
                return WeexValueImpl.ofUndefined();
            } else {
                str2 = g4.a.f3423a;
            }
            return com.taobao.android.weex_framework.m.b(str2, str);
        } catch (Throwable th) {
            g.c(g.TAG, "bridge error", th);
            return null;
        }
    }

    public static String GetOrangeConfig(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7d4b6209", new Object[]{str});
        }
        try {
            return f.a(str, "", (String) null);
        } catch (Throwable th) {
            g.c(g.TAG, "bridge error", th);
            return null;
        }
    }

    public static String GetABTest(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("adab5cfc", new Object[]{str, str2});
        }
        try {
            return f.a(str, str2);
        } catch (Throwable th) {
            g.c(g.TAG, "bridge error", th);
            return null;
        }
    }

    public static int GetDeviceLevel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("aab00e32", new Object[0])).intValue();
        }
        try {
            return l.a().t();
        } catch (Throwable th) {
            g.a(th);
            return 0;
        }
    }

    public static String GetPreference(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("eb41745e", new Object[]{str});
        }
        try {
            Application b = com.taobao.android.weex_framework.m.b();
            if (b == null) {
                g.d("GetPreference without application");
                b = d.c();
            }
            if (b == null) {
                g.d("GetPreference application is null, wxf not init");
                return null;
            }
            return b.getSharedPreferences("weex_2_preference", 0).getString(str, null);
        } catch (Throwable th) {
            g.c(g.TAG, "bridge error", th);
            return null;
        }
    }

    public static void SetPreference(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c06df3d8", new Object[]{str, str2});
            return;
        }
        try {
            SharedPreferences.Editor edit = com.taobao.android.weex_framework.m.b().getSharedPreferences("weex_2_preference", 0).edit();
            if (str2 == null) {
                edit.remove(str);
            } else {
                edit.putString(str, str2);
            }
            edit.apply();
        } catch (Throwable th) {
            g.c(g.TAG, "bridge error", th);
        }
    }

    public static void MakeDebugToast(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2116553", new Object[]{str});
            return;
        }
        try {
            g.e(str);
        } catch (Throwable th) {
            g.c(g.TAG, "bridge error", th);
        }
    }

    public static void SetNetworkCacheDisabled(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5e7267b", new Object[]{new Boolean(z)});
        } else {
            b.a(z);
        }
    }
}
