package com.alibaba.jsi.standard;

import com.alibaba.jsi.standard.js.Bridge;
import com.alibaba.jsi.standard.js.o;
import com.alibaba.jsi.standard.js.w;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.annotation.Annotation;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes2.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final Map<Long, d> i;

    /* renamed from: a  reason: collision with root package name */
    public long f3129a;
    private String b;
    private b c;
    private final JSEngine d;
    private final long e;
    private Runnable g;
    private final Object f = new Object();
    private boolean h = false;
    private final c j = new c(this);
    private final com.alibaba.jsi.standard.java.b k = new com.alibaba.jsi.standard.java.b(this, this.j);
    private final com.alibaba.jsi.standard.java.a l = new com.alibaba.jsi.standard.java.a(this, this.j);
    private final Object[] m = new Object[6];

    static {
        kge.a(356820964);
        i = new HashMap();
    }

    public d(String str, Object obj, JSEngine jSEngine, Class<? extends Annotation> cls) {
        this.b = str;
        this.d = jSEngine;
        this.f3129a = JNIBridge.nativeCreateContext(this.d.getNativeInstance(), this.b, null);
        this.e = JNIBridge.nativeCommand(2L, this.f3129a, null);
        synchronized (i) {
            i.put(Long.valueOf(this.e), this);
        }
        this.j.a(obj, cls);
    }

    public void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20ddcc77", new Object[]{this, bVar});
        } else {
            this.c = bVar;
        }
    }

    public b a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("9645b6fd", new Object[]{this}) : this.c;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        synchronized (this.f) {
            if (n()) {
                return;
            }
            r();
            JNIBridge.nativeDisposeContext(this.d.getNativeInstance(), this.f3129a);
            synchronized (i) {
                i.remove(Long.valueOf(this.e));
            }
            this.f3129a = 0L;
            this.h = true;
        }
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.h;
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        synchronized (this.f) {
            if (n()) {
                return;
            }
            r();
            JNIBridge.nativeResetContext(this.d.getNativeInstance(), this.f3129a);
        }
    }

    public String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : this.b;
    }

    public long f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5b2e1e1", new Object[]{this})).longValue() : this.e;
    }

    public w a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w) ipChange.ipc$dispatch("5ddf81da", new Object[]{this, str, str2});
        }
        synchronized (this.f) {
            w wVar = null;
            if (n()) {
                return null;
            }
            Object nativeExecuteJS = JNIBridge.nativeExecuteJS(this.d.getNativeInstance(), this.f3129a, str, str2);
            if (nativeExecuteJS != null) {
                wVar = (w) nativeExecuteJS;
            }
            this.d.requestLoopAsync(0L);
            return wVar;
        }
    }

    public JSEngine g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSEngine) ipChange.ipc$dispatch("11e260d2", new Object[]{this}) : this.d;
    }

    public o h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (o) ipChange.ipc$dispatch("2b41b915", new Object[]{this});
        }
        if (n()) {
            return null;
        }
        Object cmd = Bridge.cmd(this, 10);
        if (!(cmd instanceof o)) {
            return null;
        }
        return (o) cmd;
    }

    public w a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w) ipChange.ipc$dispatch("a5ec1e10", new Object[]{this, str});
        }
        o h = h();
        if (h == null) {
            return null;
        }
        w a2 = h.a(this, str);
        h.a();
        return a2;
    }

    public boolean i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[]{this})).booleanValue() : !n() && Bridge.cmd(this, 11) != null;
    }

    public com.alibaba.jsi.standard.js.i j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.alibaba.jsi.standard.js.i) ipChange.ipc$dispatch("f8f337dd", new Object[]{this});
        }
        if (n()) {
            return null;
        }
        Object cmd = Bridge.cmd(this, 12);
        if (!(cmd instanceof com.alibaba.jsi.standard.js.i)) {
            return null;
        }
        return (com.alibaba.jsi.standard.js.i) cmd;
    }

    public void a(com.alibaba.jsi.standard.js.i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba141bd4", new Object[]{this, iVar});
        } else if (n()) {
        } else {
            Bridge.cmd(this, 13, new Object[]{iVar});
        }
    }

    public com.alibaba.jsi.standard.java.b k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.alibaba.jsi.standard.java.b) ipChange.ipc$dispatch("81da0dcc", new Object[]{this}) : this.k;
    }

    public com.alibaba.jsi.standard.java.a l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.alibaba.jsi.standard.java.a) ipChange.ipc$dispatch("9581e12e", new Object[]{this}) : this.l;
    }

    public long m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6158668", new Object[]{this})).longValue() : this.f3129a;
    }

    public static d a(long j) {
        d dVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("bce153c7", new Object[]{new Long(j)});
        }
        synchronized (i) {
            dVar = i.get(Long.valueOf(j));
        }
        return dVar;
    }

    public boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6239df9", new Object[]{this})).booleanValue();
        }
        if (!c()) {
            return false;
        }
        g.c("Context has been destroyed! Id: " + this.e);
        return true;
    }

    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b576", new Object[]{this});
            return;
        }
        b bVar = this.c;
        if (bVar == null) {
            return;
        }
        bVar.onReload(this);
    }

    public boolean a(com.alibaba.jsi.standard.js.i iVar, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("886fd1b3", new Object[]{this, iVar, new Integer(i2)})).booleanValue();
        }
        b bVar = this.c;
        if (bVar != null) {
            return bVar.onUncaughtJSException(this, iVar, i2);
        }
        if (iVar != null) {
            iVar.a();
        }
        return false;
    }

    public String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{this, str});
        }
        b bVar = this.c;
        if (bVar == null) {
            return null;
        }
        return bVar.onGetSourceMapFilePath(this, str);
    }

    private void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65bfbf9", new Object[]{this});
            return;
        }
        com.alibaba.jsi.standard.js.c cVar = new com.alibaba.jsi.standard.js.c(this.d);
        try {
            this.l.a();
            this.j.a();
        } finally {
            cVar.b();
        }
    }

    public c p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("9119752d", new Object[]{this}) : this.j;
    }

    public void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39112e6", new Object[]{this, runnable});
        } else {
            this.g = runnable;
        }
    }

    public Runnable q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Runnable) ipChange.ipc$dispatch("55bebe1c", new Object[]{this}) : this.g;
    }
}
