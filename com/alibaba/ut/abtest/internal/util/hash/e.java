package com.alibaba.ut.abtest.internal.util.hash;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes.dex */
public final class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final int f4199a;
    public static final c b;

    static {
        kge.a(1465520795);
        f4199a = (int) System.currentTimeMillis();
        b = new Murmur3_32HashFunction(1526958062);
    }

    public static c a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("b5ff1e13", new Object[0]) : b;
    }
}
