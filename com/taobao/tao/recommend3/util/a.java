package com.taobao.tao.recommend3.util;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Random;
import tb.kge;

/* loaded from: classes8.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final Random f20955a;

    static {
        kge.a(-1034534503);
        f20955a = new Random(1L);
    }

    public static int a(int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5c1152bb", new Object[]{new Integer(i), new Integer(i2)})).intValue() : f20955a.nextInt((i2 - i) + 1) + i;
    }
}
