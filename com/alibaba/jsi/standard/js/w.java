package com.alibaba.jsi.standard.js;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class w implements b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int kAttributeDontDelete = 4;
    public static final int kAttributeDontEnum = 2;
    public static final int kAttributeNone = 0;
    public static final int kAttributeReadOnly = 1;
    public static final int kIntegrityFrozen = 0;
    public static final int kIntegritySealed = 1;

    /* renamed from: a  reason: collision with root package name */
    public com.alibaba.jsi.standard.d f3143a;
    public long b;
    private boolean c;

    static {
        kge.a(-1301106972);
        kge.a(1203844208);
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public w j(com.alibaba.jsi.standard.d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (w) ipChange.ipc$dispatch("2a0cc61c", new Object[]{this, dVar}) : this;
    }

    public boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6239df9", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public boolean n_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c10551bc", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public o o_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (o) ipChange.ipc$dispatch("f50c6c7d", new Object[]{this});
        }
        return null;
    }

    public w(com.alibaba.jsi.standard.d dVar) {
        this.c = false;
        this.f3143a = null;
        this.b = 0L;
    }

    public w(com.alibaba.jsi.standard.d dVar, long j) {
        this.c = false;
        this.f3143a = dVar;
        this.b = j;
        if (this.b != 0) {
            com.alibaba.jsi.standard.f.a(this.f3143a, this);
        }
    }

    @Override // com.alibaba.jsi.standard.js.b
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        long j = this.b;
        if (j == 0 || this.c) {
            return;
        }
        Bridge.nativeDelete(j, 1);
        this.b = 0L;
        com.alibaba.jsi.standard.f.b(this.f3143a, this);
        this.f3143a = null;
        this.c = true;
    }

    public final void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
        } else if (!this.c) {
        } else {
            throw new RuntimeException("JSValue has been deleted: " + this);
        }
    }

    public String a_(com.alibaba.jsi.standard.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cb92a9ee", new Object[]{this, dVar});
        }
        long j = this.b;
        if (j == 0) {
            return null;
        }
        Object cmd = Bridge.cmd(dVar, 50, j);
        if (!(cmd instanceof String)) {
            return null;
        }
        return (String) cmd;
    }

    public w b(com.alibaba.jsi.standard.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w) ipChange.ipc$dispatch("8d90a414", new Object[]{this, dVar});
        }
        long j = this.b;
        if (j == 0) {
            return null;
        }
        Object cmd = Bridge.cmd(dVar, 51, j);
        if (!(cmd instanceof w)) {
            return null;
        }
        return (w) cmd;
    }

    @Deprecated
    public x o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (x) ipChange.ipc$dispatch("fb2ef873", new Object[]{this}) : l(this.f3143a);
    }

    public x l(com.alibaba.jsi.standard.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x) ipChange.ipc$dispatch("112bcebd", new Object[]{this, dVar});
        }
        m();
        Object cmd = Bridge.cmd(dVar, 750, this.b);
        if (!(cmd instanceof Long)) {
            return null;
        }
        return new x((Long) cmd);
    }

    public z i(com.alibaba.jsi.standard.d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (z) ipChange.ipc$dispatch("367d4238", new Object[]{this, dVar}) : new z(dVar, this, false);
    }

    public final z m(com.alibaba.jsi.standard.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (z) ipChange.ipc$dispatch("4bb533c", new Object[]{this, dVar});
        }
        m();
        long j = this.b;
        if (j == 0) {
            return null;
        }
        Object cmd = Bridge.cmd(dVar, 53, j);
        if (!(cmd instanceof w)) {
            return null;
        }
        return new z(dVar, (w) cmd, true);
    }

    public final w n(com.alibaba.jsi.standard.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w) ipChange.ipc$dispatch("f84ad720", new Object[]{this, dVar});
        }
        m();
        long j = this.b;
        if (j == 0) {
            return null;
        }
        Object cmd = Bridge.cmd(dVar, 54, j);
        if (!(cmd instanceof w)) {
            return null;
        }
        return (w) cmd;
    }
}
