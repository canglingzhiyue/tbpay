package com.alibaba.android.nextrpc.internal.utils;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.riverlogger.RVLLevel;
import com.taobao.android.riverlogger.e;
import com.taobao.orange.OConstant;
import com.taobao.tlog.adapter.AdapterForTLog;
import java.util.HashMap;
import java.util.Map;
import tb.bfv;

/* loaded from: classes2.dex */
public class UnifyLog {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static volatile boolean f2384a = false;
    private static String b = "NextRpc.";

    /* loaded from: classes2.dex */
    public enum Level {
        V,
        D,
        I,
        W,
        E,
        L
    }

    public static boolean a(Level level) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ca7d4dca", new Object[]{level})).booleanValue() : !bfv.a();
    }

    public static void a(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5cd3435", new Object[]{str, str2, objArr});
        } else if (a(Level.D)) {
            if (f2384a) {
                AdapterForTLog.logd(a(str), a(str2, objArr));
                return;
            }
            a(str);
            a(str2, objArr);
        } else {
            a(str, str2);
        }
    }

    public static void b(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbd0ff94", new Object[]{str, str2, objArr});
        } else if (a(Level.I)) {
            if (f2384a) {
                AdapterForTLog.logi(a(str), a(str2, objArr));
                return;
            }
            a(str);
            a(str2, objArr);
        } else {
            a(str, str2);
        }
    }

    public static void c(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d4caf3", new Object[]{str, str2, objArr});
        } else if (a(Level.W)) {
            if (f2384a) {
                AdapterForTLog.logw(a(str), a(str2, objArr));
                return;
            }
            a(str);
            a(str2, objArr);
        } else {
            a(str, str2);
        }
    }

    public static void d(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d89652", new Object[]{str, str2, objArr});
        } else if (a(Level.E)) {
            if (f2384a) {
                AdapterForTLog.loge(a(str), a(str2, objArr));
            } else {
                Log.e(a(str), a(str2, objArr));
            }
        } else {
            a(str, str2);
        }
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
        } else if (!bfv.a()) {
        } else {
            a(str, str2, -1L, new HashMap());
        }
    }

    private static String a(Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("144cdf80", new Object[]{obj, obj2});
        }
        StringBuilder sb = new StringBuilder();
        if (obj == null) {
            obj = "";
        }
        sb.append(obj);
        sb.append(":");
        if (obj2 == null) {
            obj2 = "";
        }
        sb.append(obj2);
        return sb.toString();
    }

    private static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        return b + str;
    }

    private static String a(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dee72cc1", new Object[]{str, objArr});
        }
        if (str == null && objArr == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        if (str != null) {
            sb.append(" ");
            sb.append(str);
        }
        if (objArr != null) {
            while (true) {
                int i2 = i + 1;
                if (i2 >= objArr.length) {
                    break;
                }
                sb.append(" ");
                sb.append(a(objArr[i], objArr[i2]));
                i = i2 + 1;
            }
            if (i == objArr.length - 1) {
                sb.append(" ");
                sb.append(objArr[i]);
            }
        }
        return sb.toString();
    }

    private static void a(String str, String str2, long j, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("550999bd", new Object[]{str, str2, new Long(j), map});
            return;
        }
        try {
            RVLLevel rVLLevel = RVLLevel.Error;
            com.taobao.android.riverlogger.b a2 = e.a(rVLLevel, "NextRpc/" + str).a(RVLLevel.Error);
            if (j <= 0) {
                a2.a(System.currentTimeMillis());
            } else {
                a2.a(j);
            }
            a2.a("message", (Object) str2);
            a2.a((Map<String, ?>) map);
            a2.a();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static {
        try {
            Class.forName(OConstant.REFLECT_TLOG);
            f2384a = true;
        } catch (ClassNotFoundException unused) {
            f2384a = false;
        }
    }
}
