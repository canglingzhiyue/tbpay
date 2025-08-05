package com.taobao.android.tcrash.utils;

import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import tb.jfj;
import tb.jgj;

/* loaded from: classes6.dex */
public class StackUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "StackUtils";
    public static boolean degrade = true;

    public static StackTraceElement[] getStackTrace(Thread thread) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StackTraceElement[]) ipChange.ipc$dispatch("4745236c", new Object[]{thread});
        }
        if (Thread.currentThread().getName().startsWith("jsi-worker-jsap") || Build.MODEL.equalsIgnoreCase("PDBM00")) {
            dumpCrashInfo(thread);
            return new StackTraceElement[]{new StackTraceElement("com.taobao.android.tcrash.utils.StackUtils", "getStackTrace", TAG, -1)};
        }
        return thread.getStackTrace();
    }

    private static void dumpCrashInfo(Thread thread) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96f1d899", new Object[]{thread});
            return;
        }
        jfj.b(TAG, "jsi-thread-name", thread.getName());
        jgj.a(TAG, "jsi-thread-name", thread.getName());
    }
}
