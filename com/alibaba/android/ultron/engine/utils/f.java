package com.alibaba.android.ultron.engine.utils;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Random;
import tb.kge;
import tb.mto;

/* loaded from: classes2.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final Random f2575a;

    static {
        kge.a(1754911869);
        f2575a = new Random();
    }

    public static long a(long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5c11cadc", new Object[]{new Long(j), new Long(j2)})).longValue();
        }
        if (j2 < j || j < 0) {
            throw new IllegalArgumentException("");
        }
        return j == j2 ? j : (long) a(j, j2);
    }

    public static long a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5c", new Object[0])).longValue() : a(0L, Long.MAX_VALUE);
    }

    public static double a(double d, double d2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5c0efa16", new Object[]{new Double(d), new Double(d2)})).doubleValue();
        }
        if (d2 < d || d < mto.a.GEO_NOT_SUPPORT) {
            throw new IllegalArgumentException("");
        }
        return d == d2 ? d : d + ((d2 - d) * f2575a.nextDouble());
    }
}
