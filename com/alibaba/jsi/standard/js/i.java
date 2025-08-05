package com.alibaba.jsi.standard.js;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class i implements b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public com.alibaba.jsi.standard.d f3142a;
    public long b;
    private boolean c = false;

    static {
        kge.a(1343487042);
        kge.a(1203844208);
    }

    public i(com.alibaba.jsi.standard.d dVar, String str) {
        this.f3142a = dVar;
        this.b = Bridge.createNative(dVar, 21, new Object[]{str});
        com.alibaba.jsi.standard.f.a(this.f3142a, this);
    }

    public i(com.alibaba.jsi.standard.d dVar, long j) {
        this.f3142a = dVar;
        this.b = j;
        com.alibaba.jsi.standard.f.a(this.f3142a, this);
    }

    @Override // com.alibaba.jsi.standard.js.b
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        long j = this.b;
        if (j != 0 && !this.c) {
            Bridge.nativeDelete(j, 4);
            this.b = 0L;
            com.alibaba.jsi.standard.f.b(this.f3142a, this);
        }
        this.c = true;
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (!this.c) {
        } else {
            throw new RuntimeException("JSException has been deleted: " + this);
        }
    }

    public String a(com.alibaba.jsi.standard.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("172fb00b", new Object[]{this, dVar});
        }
        b();
        Object cmd = Bridge.cmd(dVar, 600, this.b);
        if (!(cmd instanceof String)) {
            return null;
        }
        return (String) cmd;
    }

    public String b(com.alibaba.jsi.standard.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8d9562a", new Object[]{this, dVar});
        }
        b();
        Object cmd = Bridge.cmd(dVar, 601, this.b);
        if (!(cmd instanceof String)) {
            return null;
        }
        return (String) cmd;
    }

    public String c(com.alibaba.jsi.standard.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fa82fc49", new Object[]{this, dVar});
        }
        b();
        Object cmd = Bridge.cmd(dVar, 602, this.b);
        if (!(cmd instanceof String)) {
            return null;
        }
        return (String) cmd;
    }

    public String d(com.alibaba.jsi.standard.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ec2ca268", new Object[]{this, dVar});
        }
        b();
        Object cmd = Bridge.cmd(dVar, 603, this.b);
        if (!(cmd instanceof String)) {
            return null;
        }
        return (String) cmd;
    }

    public w e(com.alibaba.jsi.standard.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w) ipChange.ipc$dispatch("683f30d7", new Object[]{this, dVar});
        }
        b();
        Object cmd = Bridge.cmd(dVar, 604, this.b);
        if (!(cmd instanceof w)) {
            return null;
        }
        return (w) cmd;
    }
}
