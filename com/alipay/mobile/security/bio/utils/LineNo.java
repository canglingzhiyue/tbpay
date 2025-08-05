package com.alipay.mobile.security.bio.utils;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class LineNo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static int getLineNumber() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("77d58b4d", new Object[0])).intValue() : Thread.currentThread().getStackTrace()[2].getLineNumber();
    }

    public static String getFileName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("787e7f7c", new Object[0]) : Thread.currentThread().getStackTrace()[2].getFileName();
    }
}
