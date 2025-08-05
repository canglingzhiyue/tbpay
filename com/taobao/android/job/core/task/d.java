package com.taobao.android.job.core.task;

import com.android.alibaba.ip.runtime.IpChange;
import tb.gsn;

/* loaded from: classes.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final long f13005a;
    public final long b;
    public final int c;
    public final int d;
    public boolean e = false;

    private d(int i, int i2, long j, long j2) {
        this.c = i;
        this.d = i2;
        this.f13005a = j;
        this.b = j2;
    }

    public static d a(int i, int i2, long j, long j2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("931afa98", new Object[]{new Integer(i), new Integer(i2), new Long(j), new Long(j2)}) : new d(i, i2, j, j2);
    }

    public static d a(long j, long j2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("1b8d64f8", new Object[]{new Long(j), new Long(j2)}) : new d(1, 1, j, j2);
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        return "ExSum{s=" + this.f13005a + ",e=" + this.b + ",d=" + gsn.a(this.f13005a, this.b) + ",t=" + this.c + ",x=" + this.d + ",m=" + (this.e ? 1 : 0) + '}';
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "ExecutionSummary{startTime=" + this.f13005a + ", endTime=" + this.b + ", duration=" + gsn.a(this.f13005a, this.b) + ", total=" + this.c + ", executed=" + this.d + ", isMainThread=" + (this.e ? 1 : 0) + '}';
    }
}
