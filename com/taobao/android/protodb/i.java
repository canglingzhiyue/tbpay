package com.taobao.android.protodb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes6.dex */
public class i {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static volatile int f14709a = -1;

    public static int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[0])).intValue();
        }
        if (f14709a > 0) {
            return f14709a;
        }
        try {
            System.loadLibrary("ProtoDB2");
            f14709a = 5;
        } catch (Throwable unused) {
        }
        return f14709a;
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : f14709a > 0;
    }
}
