package com.taobao.accs.utl;

import android.content.Context;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.tlog.adapter.AdapterForTLog;
import tb.kge;

/* loaded from: classes.dex */
public class ALog {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String REFLECT_TLOG = "com.taobao.tlog.adapter.AdapterForTLog";
    private static Boolean isDebug = null;
    public static volatile boolean isPrintLog = false;
    public static volatile boolean isUseTlog = false;
    public static final String oriTag = "NAccs.";
    public static String preTag;

    /* loaded from: classes.dex */
    public enum Level {
        V,
        D,
        I,
        W,
        E,
        L
    }

    @Deprecated
    public static void setEnableTLog(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3eb21ff8", new Object[]{new Boolean(z)});
        }
    }

    static {
        kge.a(755113071);
        preTag = oriTag;
        isUseTlog = false;
        isPrintLog = true;
        try {
            Class.forName("com.taobao.tlog.adapter.AdapterForTLog");
            isUseTlog = true;
        } catch (ClassNotFoundException unused) {
            isUseTlog = false;
        }
        isDebug = null;
    }

    @Deprecated
    public static void initALog(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c26048df", new Object[]{str, new Integer(i)});
        } else {
            preTag = str;
        }
    }

    @Deprecated
    public static void setUseTlog(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ac80298", new Object[]{new Boolean(z)});
        } else {
            isUseTlog = z;
        }
    }

    @Deprecated
    public static void setPrintLog(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c80ec2f4", new Object[]{new Boolean(z)});
        } else {
            isPrintLog = z;
        }
    }

    @Deprecated
    public static boolean isPrintLog() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ef42d0ac", new Object[0])).booleanValue() : isPrintLog;
    }

    private static boolean isDebug(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("16deea7c", new Object[]{context})).booleanValue();
        }
        Boolean bool = isDebug;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            Boolean valueOf = Boolean.valueOf((context.getApplicationInfo().flags & 2) != 0);
            isDebug = valueOf;
            if (valueOf.booleanValue()) {
                isUseTlog = false;
                anet.channel.util.ALog.setUseTlog(false);
                return true;
            }
        } catch (Throwable th) {
            isDebug = false;
            e("ALog", "enable debug err", th, new Object[0]);
        }
        return false;
    }

    public static boolean isPrintLog(Level level) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("255b20c", new Object[]{level})).booleanValue();
        }
        if (isUseTlog) {
            Level level2 = Level.L;
            try {
                level2 = Level.valueOf(AdapterForTLog.getLogLevel());
            } catch (Exception unused) {
            }
            return level.ordinal() >= level2.ordinal();
        }
        return isPrintLog;
    }

    public static void v(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("741ce300", new Object[]{str, str2, objArr});
        } else if (!isPrintLog(Level.V)) {
        } else {
            if (isUseTlog || isDebug(GlobalClientInfo.getContext())) {
                AdapterForTLog.logv(buildLogTag(str), buildLogMsg(str2, objArr));
                return;
            }
            buildLogTag(str);
            buildLogMsg(str2, objArr);
        }
    }

    public static void d(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d89652", new Object[]{str, str2, objArr});
        } else if (!isPrintLog(Level.D)) {
        } else {
            if (isUseTlog || isDebug(GlobalClientInfo.getContext())) {
                AdapterForTLog.logd(buildLogTag(str), buildLogMsg(str2, objArr));
                return;
            }
            buildLogTag(str);
            buildLogMsg(str2, objArr);
        }
    }

    public static void i(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25eb8f2d", new Object[]{str, str2, objArr});
        } else if (!isPrintLog(Level.I)) {
        } else {
            if (isUseTlog || isDebug(GlobalClientInfo.getContext())) {
                AdapterForTLog.logi(buildLogTag(str), buildLogMsg(str2, objArr));
                return;
            }
            buildLogTag(str);
            buildLogMsg(str2, objArr);
        }
    }

    public static void w(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a20ae5f", new Object[]{str, str2, objArr});
        } else if (!isPrintLog(Level.W)) {
        } else {
            if (isUseTlog || isDebug(GlobalClientInfo.getContext())) {
                AdapterForTLog.logw(buildLogTag(str), buildLogMsg(str2, objArr));
                return;
            }
            buildLogTag(str);
            buildLogMsg(str2, objArr);
        }
    }

    public static void w(String str, String str2, Throwable th, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f5e26ae", new Object[]{str, str2, th, objArr});
        } else if (!isPrintLog(Level.W)) {
        } else {
            if (isUseTlog || isDebug(GlobalClientInfo.getContext())) {
                AdapterForTLog.logw(buildLogTag(str), buildLogMsg(str2, objArr), th);
                return;
            }
            buildLogTag(str);
            buildLogMsg(str2, objArr);
        }
    }

    public static void e(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddc61b1", new Object[]{str, str2, objArr});
        } else if (!isPrintLog(Level.E)) {
        } else {
            if (isUseTlog || isDebug(GlobalClientInfo.getContext())) {
                AdapterForTLog.loge(buildLogTag(str), buildLogMsg(str2, objArr));
            } else {
                Log.e(buildLogTag(str), buildLogMsg(str2, objArr));
            }
        }
    }

    public static void e(String str, String str2, Throwable th, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56d61a9c", new Object[]{str, str2, th, objArr});
        } else if (!isPrintLog(Level.E)) {
        } else {
            if (isUseTlog || isDebug(GlobalClientInfo.getContext())) {
                AdapterForTLog.loge(buildLogTag(str), buildLogMsg(str2, objArr), th);
            } else {
                Log.e(buildLogTag(str), buildLogMsg(str2, objArr), th);
            }
        }
    }

    private static String formatKv(Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4425a33f", new Object[]{obj, obj2});
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

    private static String buildLogTag(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("774883eb", new Object[]{str});
        }
        return preTag + str;
    }

    private static String buildLogMsg(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fe17598b", new Object[]{str, objArr});
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
                sb.append(formatKv(objArr[i], objArr[i2]));
                i = i2 + 1;
            }
            if (i == objArr.length - 1) {
                sb.append(" ");
                sb.append(objArr[i]);
            }
        }
        return sb.toString();
    }
}
