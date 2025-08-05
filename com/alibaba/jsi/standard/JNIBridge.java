package com.alibaba.jsi.standard;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.HashSet;
import tb.kge;

/* loaded from: classes2.dex */
public class JNIBridge {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-22188244);
    }

    public static native long nativeCommand(long j, long j2, Object[] objArr);

    public static native long nativeCreateContext(long j, String str, HashSet<Object> hashSet);

    public static native void nativeDisposeContext(long j, long j2);

    public static native void nativeDisposeInstance(long j);

    public static native Object nativeExecuteJS(long j, long j2, String str, String str2);

    public static native String nativeGetVersion(String str);

    public static native long nativeInitInstance(String str, String str2, String str3);

    public static native void nativeOnLoop(long j);

    public static native void nativeOnLowMemory(long j);

    public static native void nativeResetContext(long j, long j2);

    public static native boolean nativeSetInfo(long j, String str, String str2, long j2);

    public static native boolean nativeStartTrace(long j, String str, String str2);

    public static native void nativeStopTrace(long j);

    public static long onNativeEvent(long j, int i, long j2, Object[] objArr) {
        JSEngine jSEngine;
        d context;
        JSEngine jSEngine2;
        d context2;
        JSEngine jSEngine3;
        d context3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dbc4c6cb", new Object[]{new Long(j), new Integer(i), new Long(j2), objArr})).longValue();
        }
        switch (i) {
            case 1:
                if (j2 >= 0 && (jSEngine = JSEngine.getInstance(j)) != null) {
                    jSEngine.requestLoopAsync(j2);
                    break;
                }
                break;
            case 2:
                if (objArr != null && objArr.length >= 2 && (objArr[0] instanceof String) && (objArr[1] instanceof String)) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("name", (String) objArr[0]);
                    hashMap.put("version", (String) objArr[1]);
                    hashMap.put("flags", "");
                    hashMap.put("engine", "0");
                    hashMap.put("timeout", "0");
                    JSEngine.createInstanceImpl(null, hashMap, j, null);
                    break;
                }
                break;
            case 3:
                JSEngine.getInstance(j).dispose(true);
                break;
            case 4:
                if (objArr != null && objArr.length > 0 && (objArr[0] instanceof String)) {
                    return JSEngine.getInstance(j).createContext((String) objArr[0]).f();
                }
                return 0L;
            case 5:
                if (objArr != null && objArr.length > 0 && (objArr[0] instanceof Boolean)) {
                    boolean booleanValue = ((Boolean) objArr[0]).booleanValue();
                    JSEngine jSEngine4 = JSEngine.getInstance(j);
                    d context4 = jSEngine4.getContext(j2);
                    if (context4 != null) {
                        context4.b();
                        if (booleanValue) {
                            jSEngine4.removeContext(context4);
                            break;
                        }
                    }
                }
                break;
            case 6:
                d context5 = JSEngine.getInstance(j).getContext(j2);
                if (context5 != null) {
                    context5.d();
                    break;
                }
                break;
            case 7:
                JSEngine jSEngine5 = JSEngine.getInstance(j);
                if (jSEngine5 != null && (context = jSEngine5.getContext(j2)) != null) {
                    context.o();
                    break;
                }
                break;
            case 8:
                if (objArr == null || objArr.length < 2 || !(objArr[0] instanceof Integer) || !(objArr[1] instanceof com.alibaba.jsi.standard.js.i) || (jSEngine2 = JSEngine.getInstance(j)) == null || (context2 = jSEngine2.getContext(j2)) == null) {
                    return 0L;
                }
                return context2.a((com.alibaba.jsi.standard.js.i) objArr[1], ((Integer) objArr[0]).intValue()) ? 1L : 2L;
            case 9:
                if (objArr == null || objArr.length < 2 || !(objArr[0] instanceof String) || (jSEngine3 = JSEngine.getInstance(j)) == null || (context3 = jSEngine3.getContext(j2)) == null) {
                    return 0L;
                }
                objArr[1] = context3.b((String) objArr[0]);
                return 1L;
            case 10:
                JSEngine jSEngine6 = JSEngine.getInstance(j);
                a eventListener = jSEngine6.getEventListener();
                if (eventListener == null || objArr == null || objArr.length < 5 || !(objArr[0] instanceof Long) || !(objArr[1] instanceof Long) || !(objArr[2] instanceof String) || !(objArr[3] instanceof String) || !(objArr[4] instanceof Long)) {
                    return 0L;
                }
                HashMap hashMap2 = new HashMap();
                hashMap2.put("startTime", objArr[0]);
                hashMap2.put("timeoutAt", objArr[1]);
                hashMap2.put("actionInfo", objArr[2]);
                hashMap2.put("jsTrace", objArr[3]);
                hashMap2.put("contextId", objArr[4]);
                if (objArr.length >= 6 && (objArr[5] instanceof String)) {
                    hashMap2.put("lastAction", objArr[5]);
                }
                return eventListener.a(jSEngine6, hashMap2);
            case 11:
                if (objArr == null || objArr.length <= 0 || !(objArr[0] instanceof Throwable)) {
                    return 0L;
                }
                h.a((Throwable) objArr[0]);
                return 1L;
            case 12:
                if (JSEngine.getInstance(j).getEventListener() == null || objArr == null || objArr.length < 3 || !(objArr[0] instanceof String) || !(objArr[1] instanceof Long) || !(objArr[2] instanceof Boolean)) {
                    return 0L;
                }
                HashMap hashMap3 = new HashMap();
                hashMap3.put("cachePath", objArr[0]);
                hashMap3.put("cacheSize", objArr[1]);
                hashMap3.put("isAot", objArr[2]);
                return 1L;
            case 13:
                if (JSEngine.getInstance(j).getEventListener() == null || objArr == null || objArr.length < 3 || !(objArr[0] instanceof String) || !(objArr[1] instanceof String) || !(objArr[2] instanceof String)) {
                    return 0L;
                }
                HashMap hashMap4 = new HashMap();
                hashMap4.put("sourceHash", objArr[0]);
                hashMap4.put("file", objArr[1]);
                hashMap4.put("coverage", objArr[2]);
                return 1L;
            default:
                g.c("Unknown JSI native event: " + i);
                break;
        }
        return 0L;
    }
}
