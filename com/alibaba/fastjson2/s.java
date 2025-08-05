package com.alibaba.fastjson2;

import java.util.Arrays;
import tb.kge;

/* loaded from: classes2.dex */
public final class s {

    /* renamed from: a  reason: collision with root package name */
    private final String[] f3016a;
    private final short[] b;
    private final long[] c;
    private final long[] d;

    static {
        kge.a(-556312748);
    }

    public int a(long j) {
        int binarySearch = Arrays.binarySearch(this.c, j);
        if (binarySearch < 0) {
            return -1;
        }
        return this.b[binarySearch] + 1;
    }

    public int a(String str) {
        int binarySearch = Arrays.binarySearch(this.c, com.alibaba.fastjson2.util.c.b(str));
        if (binarySearch < 0) {
            return -1;
        }
        return this.b[binarySearch] + 1;
    }

    public String a(int i) {
        return this.f3016a[i - 1];
    }

    public long b(int i) {
        return this.d[i - 1];
    }
}
