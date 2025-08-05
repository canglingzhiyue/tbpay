package com.alibaba.android.aura.datamodel.nextrpc;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int STAGE_COLLECT = 0;
    public static final int STAGE_PARSE = 1;
    public static final int STAGE_SWITCH_THREAD = 2;
    private String d;
    private boolean e;
    private boolean f;

    /* renamed from: a  reason: collision with root package name */
    private long f2130a = 0;
    private long b = 0;
    private long c = 0;
    private long g = 0;
    private long h = 0;
    private long n = 0;
    private long i = 0;
    private long j = 0;
    private long o = 0;
    private long k = 0;
    private long l = 0;
    private long m = 0;

    static {
        kge.a(-1477003879);
    }

    public void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
            return;
        }
        this.b = j;
        this.c = this.b - this.f2130a;
    }

    public long a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5c", new Object[]{this})).longValue() : this.f2130a;
    }

    public void b(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66ffb", new Object[]{this, new Long(j)});
        } else {
            this.f2130a = j;
        }
    }

    public long b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dd", new Object[]{this})).longValue() : this.b;
    }

    public long c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5e", new Object[]{this})).longValue() : this.c;
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : this.f;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.f = z;
        }
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue() : this.e;
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else {
            this.e = z;
        }
    }

    public long f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5b2e1e1", new Object[]{this})).longValue() : this.g;
    }

    public void c(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b489a", new Object[]{this, new Long(j)});
        } else {
            this.g = j;
        }
    }

    public long g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5c0f962", new Object[]{this})).longValue() : this.h;
    }

    public void d(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad402139", new Object[]{this, new Long(j)});
            return;
        }
        this.h = j;
        this.n = this.h - this.g;
    }

    public long k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5f95766", new Object[]{this})).longValue() : this.n;
    }

    public long h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5cf10e3", new Object[]{this})).longValue() : this.i;
    }

    public void e(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef4f9d8", new Object[]{this, new Long(j)});
        } else {
            this.i = j;
        }
    }

    public long i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5dd2864", new Object[]{this})).longValue() : this.j;
    }

    public void f(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0a9d277", new Object[]{this, new Long(j)});
            return;
        }
        this.j = j;
        this.o = this.j - this.i;
    }

    public long l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6076ee7", new Object[]{this})).longValue() : this.o;
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.d = str;
        }
    }

    public void g(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b25eab16", new Object[]{this, new Long(j)});
        } else {
            this.k = j;
        }
    }

    public void h(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b41383b5", new Object[]{this, new Long(j)});
            return;
        }
        this.l = j;
        this.m = j - this.k;
    }

    public long j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5eb3fe5", new Object[]{this})).longValue() : this.m;
    }
}
