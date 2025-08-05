package com.alibaba.jsi.standard.js;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public long f3139a;
    private com.alibaba.jsi.standard.d c = null;
    private int d = -1;
    private String e = null;
    public boolean b = false;

    static {
        kge.a(-472847502);
    }

    public a(long j) {
        this.f3139a = j;
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else if (!this.b) {
        } else {
            throw new RuntimeException("Arguments has been detached: " + this);
        }
    }

    public int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue();
        }
        f();
        if (this.d == -1) {
            Object cmd = Bridge.cmd((com.alibaba.jsi.standard.d) null, 700, this.f3139a);
            if (cmd instanceof Long) {
                this.d = ((Long) cmd).intValue();
            } else {
                this.d = 0;
            }
        }
        return this.d;
    }

    public w a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w) ipChange.ipc$dispatch("b42b47b9", new Object[]{this, new Integer(i)});
        }
        f();
        Object cmd = Bridge.cmd((com.alibaba.jsi.standard.d) null, 701, this.f3139a, i);
        if (!(cmd instanceof w)) {
            return null;
        }
        return (w) cmd;
    }

    public com.alibaba.jsi.standard.d b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.alibaba.jsi.standard.d) ipChange.ipc$dispatch("1e75f71a", new Object[]{this});
        }
        f();
        if (this.c == null) {
            Object cmd = Bridge.cmd((com.alibaba.jsi.standard.d) null, 702, this.f3139a);
            if (cmd instanceof Long) {
                this.c = com.alibaba.jsi.standard.d.a(((Long) cmd).longValue());
            }
        }
        return this.c;
    }

    public w c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w) ipChange.ipc$dispatch("2905fb48", new Object[]{this});
        }
        f();
        Object cmd = Bridge.cmd((com.alibaba.jsi.standard.d) null, 703, this.f3139a);
        if (!(cmd instanceof w)) {
            return null;
        }
        return (w) cmd;
    }

    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("43881515", new Object[]{this});
        }
        f();
        if (this.e == null) {
            Object cmd = Bridge.cmd((com.alibaba.jsi.standard.d) null, 704, this.f3139a);
            if (cmd instanceof String) {
                this.e = (String) cmd;
            }
        }
        return this.e;
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue();
        }
        f();
        return Bridge.cmd((com.alibaba.jsi.standard.d) null, 705, this.f3139a) != null;
    }
}
