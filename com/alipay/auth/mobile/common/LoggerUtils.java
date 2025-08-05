package com.alipay.auth.mobile.common;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class LoggerUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f180e7f", new Object[]{str, str2});
        }
    }

    public static void e(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("152aaa75", new Object[]{str, str2, th});
        }
    }
}
