package com.taobao.android.testutils.log;

import android.text.TextUtils;
import android.util.Log;
import com.alibaba.android.umbrella.trace.UmbrellaTracker;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavix.utils.Debuggable;
import com.taobao.android.testutils.a;
import com.taobao.search.sf.util.tlog.TLogTracker;
import com.taobao.tao.log.TLog;
import com.taobao.weex.common.WXConfig;
import tb.jmm;
import tb.kge;

/* loaded from: classes.dex */
public final class LogUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BEHAVIR_FIND_SOLUTION = "find_solution";
    public static final String BEHAVIR_FIND_SOLUTION_ERROR = "find_solution_error";
    public static final String BEHAVIR_TASK_EXECUTE = "task_execute";
    public static final String BEHAVIR_TASK_GET_INPUT = "task_get_input";
    public static final String BR_BIZ_NAME = "behaviR";
    public static final String BX_BIZ_NAME = "behaviX";
    public static final String UCP = "UCP";
    public static final String UPP_RUNNABLE_SUB_STEP = "upp_runnable";

    /* renamed from: a  reason: collision with root package name */
    private static int f15518a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public enum BHXLogLevel {
        LOG_LEVEL_OFF,
        LOG_LEVEL_ERROR,
        LOG_LEVEL_WARNING,
        LOG_LEVEL_INFO,
        LOG_LEVEL_DEBUG,
        LOG_LEVEL_TRACE
    }

    static {
        kge.a(-680699493);
        f15518a = BHXLogLevel.LOG_LEVEL_WARNING.ordinal();
    }

    public static void a(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5cd3435", new Object[]{str, str2, objArr});
            return;
        }
        BHXLogLevel bHXLogLevel = BHXLogLevel.LOG_LEVEL_ERROR;
        a(bHXLogLevel, str + "." + str2, objArr);
    }

    private static void a(BHXLogLevel bHXLogLevel, String str, Object[] objArr) {
        String valueOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d0a9237", new Object[]{bHXLogLevel, str, objArr});
        } else if (objArr == null || objArr.length == 0) {
        } else {
            if (objArr.length > 1) {
                valueOf = TextUtils.join(" ", objArr);
            } else {
                valueOf = String.valueOf(objArr[0]);
            }
            a(bHXLogLevel, str + "_J", valueOf);
        }
    }

    private static void a(BHXLogLevel bHXLogLevel, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b18aa04", new Object[]{bHXLogLevel, str, str2});
            return;
        }
        boolean z = bHXLogLevel.ordinal() <= f15518a || Debuggable.isDebug();
        boolean a2 = jmm.a();
        if (!z && !a2) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j = currentTimeMillis % 1000;
        long j2 = currentTimeMillis / 1000;
        long j3 = j2 % 60;
        long j4 = j2 / 60;
        String a3 = a(bHXLogLevel);
        String format = String.format("%s:%s:%s.%s %s/%s %s", Long.valueOf(((j4 / 60) + 8) % 24), Long.valueOf(j4 % 60), Long.valueOf(j3), Long.valueOf(j), a3, str, str2);
        if (Debuggable.isDebug()) {
            Log.e("BehaviX", format);
        } else if (z) {
            TLog.loge("BehaviX", "BehaviX", format);
        }
        if (bHXLogLevel == BHXLogLevel.LOG_LEVEL_ERROR) {
            UmbrellaTracker.commitFailureStability("eventProcess", "user_action_track_error", "1.0", "BehaviX", str, null, str, format);
        }
        if (!a2 || bHXLogLevel == BHXLogLevel.LOG_LEVEL_TRACE) {
            return;
        }
        a.a(str, a3, "", format);
    }

    private static void logForNative(int i, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a015f694", new Object[]{new Integer(i), str, str2});
            return;
        }
        BHXLogLevel[] values = BHXLogLevel.values();
        if (i < 0 || i >= values.length) {
            return;
        }
        a(values[i], str, str2);
    }

    public static void b(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbd0ff94", new Object[]{str, str2, objArr});
        } else {
            a(BHXLogLevel.LOG_LEVEL_WARNING, str2, objArr);
        }
    }

    public static void c(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d4caf3", new Object[]{str, str2, objArr});
            return;
        }
        BHXLogLevel bHXLogLevel = BHXLogLevel.LOG_LEVEL_DEBUG;
        a(bHXLogLevel, str + "." + str2, objArr);
    }

    public static void d(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d89652", new Object[]{str, str2, objArr});
            return;
        }
        BHXLogLevel bHXLogLevel = BHXLogLevel.LOG_LEVEL_INFO;
        a(bHXLogLevel, str + "." + str2, objArr);
    }

    private static void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{new Integer(i)});
            return;
        }
        BHXLogLevel[] values = BHXLogLevel.values();
        if (i < 0 || i >= values.length) {
            return;
        }
        f15518a = i;
    }

    private static String a(BHXLogLevel bHXLogLevel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1bf645b0", new Object[]{bHXLogLevel});
        }
        switch (bHXLogLevel) {
            case LOG_LEVEL_ERROR:
                return "E";
            case LOG_LEVEL_WARNING:
                return "W";
            case LOG_LEVEL_INFO:
                return TLogTracker.LEVEL_INFO;
            case LOG_LEVEL_OFF:
                return "";
            case LOG_LEVEL_DEBUG:
                return TLogTracker.LEVEL_DEBUG;
            case LOG_LEVEL_TRACE:
                return "T";
            default:
                return "";
        }
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else {
            a(com.taobao.android.behavix.behavixswitch.a.a(WXConfig.logLevel, BHXLogLevel.LOG_LEVEL_WARNING.ordinal()));
        }
    }
}
