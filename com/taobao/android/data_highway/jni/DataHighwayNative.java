package com.taobao.android.data_highway.jni;

import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import org.json.JSONObject;
import tb.kge;

/* loaded from: classes4.dex */
public class DataHighwayNative {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-575226196);
    }

    private static native void nativeRequestCallback(String str, String str2);

    private static native String nativeSceneName(String str);

    private static native void nativeSendBatch(String str);

    private static native void nativeSendEvent(String str, String str2, boolean z, String str3, String str4);

    private static native void nativeSendScene(String str, String str2);

    private static native void nativeSetEnable(boolean z);

    private static native void nativeSetMDDuration(long j);

    private static native void nativeUpdate(String str);

    private static native void nativeUpdateMap(String str);

    public static long a(String str, JSONObject jSONObject, Boolean bool, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b7765389", new Object[]{str, jSONObject, bool, str2, str3})).longValue();
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("time", System.currentTimeMillis());
                jSONObject2.put("content", jSONObject);
                nativeSendEvent(str, jSONObject2.toString(), bool.booleanValue(), str2, str3);
            } catch (Exception unused) {
                Log.e("DataHighwayNative", "requestMtop: add data params error!");
            }
            return 0L;
        } catch (Throwable th) {
            th.printStackTrace();
            return 0L;
        }
    }

    public static long a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3a64c26", new Object[]{str})).longValue();
        }
        try {
            nativeSendBatch(str);
            return 0L;
        } catch (Throwable th) {
            th.printStackTrace();
            return 0L;
        }
    }

    public static long a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d9378d70", new Object[]{str, str2})).longValue();
        }
        try {
            if (StringUtils.isEmpty(str2)) {
                str2 = "";
            }
            nativeSendScene(str, str2);
            return 0L;
        } catch (Throwable th) {
            th.printStackTrace();
            return 0L;
        }
    }

    public static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{str});
            return;
        }
        try {
            nativeUpdate(str);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{new Boolean(z)});
            return;
        }
        try {
            nativeSetEnable(z);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{new Long(j)});
            return;
        }
        try {
            nativeSetMDDuration(j);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{str, str2});
            return;
        }
        try {
            nativeRequestCallback(str, str2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b82f346c", new Object[]{str});
        }
        try {
            nativeUpdateMap(str);
            return null;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }
}
