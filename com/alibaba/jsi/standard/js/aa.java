package com.alibaba.jsi.standard.js;

import com.alibaba.jsi.standard.JSEngine;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.mto;

/* loaded from: classes2.dex */
public class aa implements b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public JSEngine f3140a;
    public long b;
    private boolean c = false;

    static {
        kge.a(-1963874594);
        kge.a(1203844208);
    }

    private aa(JSEngine jSEngine, long j) {
        this.f3140a = jSEngine;
        this.b = j;
        com.alibaba.jsi.standard.f.a(jSEngine, this);
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
            Bridge.nativeDelete(j, 2);
            this.b = 0L;
            com.alibaba.jsi.standard.f.b(this.f3140a, this);
        }
        this.c = true;
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (!this.c) {
        } else {
            throw new RuntimeException("Template has been deleted: " + this);
        }
    }

    public static aa a(JSEngine jSEngine) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (aa) ipChange.ipc$dispatch("74ec5f95", new Object[]{jSEngine}) : new aa(jSEngine, Bridge.createNative(jSEngine, 22, 0L, (double) mto.a.GEO_NOT_SUPPORT, (Object[]) null));
    }

    public static aa b(JSEngine jSEngine) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (aa) ipChange.ipc$dispatch("581812d6", new Object[]{jSEngine}) : new aa(jSEngine, Bridge.createNative(jSEngine, 22, 2L, (double) mto.a.GEO_NOT_SUPPORT, (Object[]) null));
    }

    public boolean a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8123ad15", new Object[]{this, str, new Integer(i)})).booleanValue();
        }
        b();
        return Bridge.cmd(null, 650, this.b, (long) i, new Object[]{str}) != null;
    }

    public boolean b(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7d253bf4", new Object[]{this, str, new Integer(i)})).booleanValue();
        }
        b();
        return Bridge.cmd(null, 651, this.b, (long) i, new Object[]{str}) != null;
    }

    public o a(com.alibaba.jsi.standard.d dVar, h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (o) ipChange.ipc$dispatch("26e6bb6e", new Object[]{this, dVar, hVar});
        }
        b();
        Object cmd = Bridge.cmd(dVar, 653, this.b, new Object[]{hVar});
        if (!(cmd instanceof o)) {
            return null;
        }
        return (o) cmd;
    }
}
