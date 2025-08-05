package com.taobao.analysis.v3;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class q implements p {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f8592a;
    public long b;
    public long c;
    public long d;
    public String e;
    private int f;

    public q(String str, int i) {
        this.f8592a = str;
        this.f = i;
    }

    @Override // com.taobao.analysis.v3.p
    public void a(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ed6d4a7", new Object[]{this, l});
        } else {
            this.b = c(l);
        }
    }

    @Override // com.taobao.analysis.v3.p
    public void b(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b6fca28", new Object[]{this, l});
        } else {
            a(l, null);
        }
    }

    @Override // com.taobao.analysis.v3.p
    public void a(Long l, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b34c2b1", new Object[]{this, l, str});
            return;
        }
        this.d = c(l);
        long j = this.d;
        long j2 = this.b;
        long j3 = 0;
        if (j - j2 > 0) {
            j3 = j - j2;
        }
        this.c = j3;
        this.e = str;
    }

    @Override // com.taobao.analysis.v3.p
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f8592a;
    }

    private long c(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7808bf9d", new Object[]{this, l})).longValue();
        }
        if (l != null && l.longValue() > 0) {
            return l.longValue();
        }
        return b();
    }

    private long b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dd", new Object[]{this})).longValue() : System.currentTimeMillis();
    }
}
