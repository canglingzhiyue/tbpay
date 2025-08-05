package com.taobao.android.ucp.util;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes6.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile long f15711a;

    static {
        kge.a(401922330);
        f15711a = b();
    }

    public static long a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c5c", new Object[0])).longValue();
        }
        long nanoTime = f15711a + (System.nanoTime() / 1000);
        if (Math.abs(nanoTime - (System.currentTimeMillis() * 1000)) <= 2000) {
            return nanoTime;
        }
        long b = b();
        f15711a = b;
        return b + (System.nanoTime() / 1000);
    }

    private static long b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dd", new Object[0])).longValue() : (System.currentTimeMillis() * 1000) - (System.nanoTime() / 1000);
    }
}
