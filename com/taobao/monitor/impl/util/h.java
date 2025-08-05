package com.taobao.monitor.impl.util;

import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static long a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5c", new Object[0])).longValue() : SystemClock.uptimeMillis();
    }

    public static long a(long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a8219750", new Object[]{new Long(j)})).longValue() : j > 0 ? j - (System.currentTimeMillis() - SystemClock.uptimeMillis()) : j;
    }

    public static long b(long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a9d66fef", new Object[]{new Long(j)})).longValue() : j > 0 ? j + (System.currentTimeMillis() - SystemClock.uptimeMillis()) : j;
    }
}
