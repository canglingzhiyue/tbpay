package com.taobao.tab2interact.core.utils;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import com.taobao.tao.log.TLog;
import tb.kge;
import tb.oec;

/* loaded from: classes8.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f19772a;

    static {
        kge.a(533117586);
        f19772a = oec.e(Globals.getApplication());
    }

    public static void a(Object obj, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d7b7558", new Object[]{obj, str, str2});
        } else if (!f19772a) {
        } else {
            TLog.logd("Tab2Interact", str, a(obj, str2));
        }
    }

    public static void b(Object obj, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e314219", new Object[]{obj, str, str2});
        } else if (f19772a) {
            TLog.loge("Tab2Interact", str, a(obj, str2));
        } else {
            TLog.loge("Tab2Interact", str, str2);
        }
    }

    public static void a(Object obj, String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae1fc59d", new Object[]{obj, str, str2, th});
        } else if (f19772a) {
            TLog.loge("Tab2Interact", str, a(obj, str2), th);
        } else {
            TLog.loge("Tab2Interact", str, str2, th);
        }
    }

    private static String a(Object obj, String str) {
        StackTraceElement stackTraceElement;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("93e4ff52", new Object[]{obj, str});
        }
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace.length <= 4 || (stackTraceElement = stackTrace[4]) == null) {
            return str;
        }
        return str + "\t@" + (stackTraceElement.getClassName() + "$" + stackTraceElement.getMethodName() + "$" + stackTraceElement.getLineNumber() + "$" + System.identityHashCode(obj) + "$");
    }
}
