package com.taobao.android.weex_framework.jni;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.riverlogger.b;
import com.taobao.android.weex.util.c;
import com.taobao.android.weex_framework.MUSValue;
import com.taobao.android.weex_framework.adapter.i;
import com.taobao.android.weex_framework.common.expection.WXExceptionConfig;
import com.taobao.android.weex_framework.l;
import com.taobao.android.weex_framework.m;
import com.taobao.android.weex_framework.util.g;
import com.taobao.android.weex_framework.util.r;
import java.util.ConcurrentModificationException;
import java.util.Map;
import tb.kge;

/* loaded from: classes6.dex */
public class MUSCommonNativeBridge {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static volatile boolean f15992a;

    private static native void callRequestData(byte[] bArr, int i, String str, Map<String, String> map, long j);

    private static native boolean nativeHasGlobalJSBindingPlugin(String str);

    private static native void nativeRegisterUINodeCustomMeasure(MUSValue mUSValue);

    private static native void nativeSetupInspector();

    public static native void nativeWx_Trace_End(String str);

    public static native void nativeWx_Trace_Event0(String str);

    public static native void nativeWx_Trace_Event1(String str, String str2, String str3);

    public static native void nativeWx_Trace_Event2(String str, String str2, String str3, String str4, String str5);

    public static native long nativeWx_Trace_Event_AsyncID();

    public static native void nativeWx_Trace_Event_Async_Begin0(String str, long j);

    public static native void nativeWx_Trace_Event_Async_Begin1(String str, long j, String str2, String str3);

    public static native void nativeWx_Trace_Event_Async_End0(String str, long j);

    public static native void nativeWx_Trace_Event_Async_End1(String str, long j, String str2, String str3);

    public static native void nativeWx_Trace_Event_Flow_Begin0(String str, long j);

    public static native void nativeWx_Trace_Event_Flow_End0(String str, long j);

    public static native void nativeWx_Trace_Event_Flow_Step0(String str, long j);

    public static native void nativeWx_Trace_Event_Instant1(String str, String str2, String str3);

    public static native void nativeWx_Trace_startRecord();

    public static native void nativeWx_Trace_stopRecord();

    static {
        kge.a(2157040);
        f15992a = false;
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else if (f15992a) {
            g.f("loadSo", "MUSCommonNativeBridge.loadSo skip");
        } else {
            c.a(m.b != null);
            for (int i = 0; i < 3; i++) {
                try {
                    System.loadLibrary("c++_shared");
                    System.loadLibrary("quickjs");
                    System.loadLibrary("weex_framework");
                    f15992a = true;
                    g.f("loadSo", "MUSCommonNativeBridge.loadSo success");
                    return;
                } catch (Throwable th) {
                    g.c("loadSo", "MUSCommonNativeBridge.loadSo failed", th);
                    b c = r.c(-1, "Setup", "loadSo");
                    c.a(2, "loadLibrary error: " + g.b(th)).a();
                    if (l.a().i() != null) {
                        i i2 = l.a().i();
                        i2.a(WXExceptionConfig.EXCEPTION_SO_LOAD_FAIL, "DEFAULT", "", "", "weex_framework  loadLibrary error", "loadLibrary error: " + g.b(th), -1);
                    }
                    if (!(th instanceof ConcurrentModificationException)) {
                        return;
                    }
                    try {
                        Thread.sleep(30L);
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }
    }

    public static void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[0]);
            return;
        }
        try {
            nativeSetupInspector();
        } catch (UnsatisfiedLinkError e) {
            g.c("setupInspector error", e);
        }
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : f15992a;
    }

    public static boolean a(MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("42efcb19", new Object[]{mUSValue})).booleanValue();
        }
        try {
            nativeRegisterUINodeCustomMeasure(mUSValue);
            return true;
        } catch (UnsatisfiedLinkError e) {
            g.c("registerUINodeCustomMeasure error", e);
            return false;
        }
    }

    public static void a(byte[] bArr, int i, String str, Map<String, String> map, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("484e65d", new Object[]{bArr, new Integer(i), str, map, new Long(j)});
            return;
        }
        try {
            callRequestData(bArr, i, str, map, j);
        } catch (UnsatisfiedLinkError e) {
            r.c(-1, "Native", "callSafeRequestData").a(1, g.b(e)).a();
        }
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue();
        }
        try {
            return nativeHasGlobalJSBindingPlugin(str);
        } catch (UnsatisfiedLinkError e) {
            g.c("hasGlobalJSBindingPlugin error", e);
            return false;
        }
    }
}
