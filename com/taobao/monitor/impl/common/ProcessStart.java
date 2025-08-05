package com.taobao.monitor.impl.common;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes7.dex */
public class ProcessStart {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static int f18150a;

    public static void setProcessStartType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6698f2d", new Object[]{new Integer(i)});
        } else {
            f18150a = i;
        }
    }

    public static int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[0])).intValue() : f18150a;
    }
}
