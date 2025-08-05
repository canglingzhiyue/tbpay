package com.taobao.monitor.performance.cpu;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes7.dex */
public class g implements Comparable<g> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public byte[] f18216a;
    public int b;
    public long c;
    public String d = "";
    public String e = "_";
    public long f = -1;
    public long g = -1;
    public long h = -1;
    public long i = -1;
    public boolean j = false;
    public long k = -1;

    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6a4672d6", new Object[]{this, gVar})).intValue() : a(gVar);
    }

    public long a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5c", new Object[]{this})).longValue() : this.f + this.g + this.h + this.i;
    }

    public int a(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("596fa51", new Object[]{this, gVar})).intValue();
        }
        long j = this.k;
        long j2 = gVar.k;
        if (j > j2) {
            return -1;
        }
        return j == j2 ? 0 : 1;
    }
}
