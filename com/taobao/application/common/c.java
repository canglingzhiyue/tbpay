package com.taobao.application.common;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.application.common.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static e f16322a;
    private static final Map<a.InterfaceC0630a, Boolean> b = new HashMap();
    private static final List<a.InterfaceC0630a> c = new ArrayList();
    private static final List<a.d> d = new ArrayList();
    private static final List<a.d> e = new ArrayList();
    private static final List<a.c> f = new ArrayList();
    private static final List<a.c> g = new ArrayList();
    private static final List<IApmEventListener> h = new ArrayList();
    private static final List<IApmEventListener> i = new ArrayList();
    private static final List<f> j = new ArrayList();
    private static final List<f> k = new ArrayList();
    private static final List<IScrollListener> l = new ArrayList();
    private static final List<IScrollListener> m = new ArrayList();

    public static void a(a.InterfaceC0630a interfaceC0630a, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a65d6a7", new Object[]{interfaceC0630a, new Boolean(z)});
            return;
        }
        e eVar = f16322a;
        if (eVar != null) {
            eVar.a(interfaceC0630a, z);
            return;
        }
        synchronized (c.class) {
            b.put(interfaceC0630a, Boolean.valueOf(z));
            c.remove(interfaceC0630a);
        }
    }

    public static void a(a.InterfaceC0630a interfaceC0630a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f4d95cd", new Object[]{interfaceC0630a});
            return;
        }
        e eVar = f16322a;
        if (eVar != null) {
            eVar.a(interfaceC0630a);
            return;
        }
        synchronized (c.class) {
            c.add(interfaceC0630a);
            b.remove(interfaceC0630a);
        }
    }

    public static void a(a.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f4ef2ea", new Object[]{dVar});
            return;
        }
        e eVar = f16322a;
        if (eVar != null) {
            eVar.a(dVar);
            return;
        }
        synchronized (c.class) {
            d.add(dVar);
            e.remove(dVar);
        }
    }

    public static void b(a.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e66ce3c9", new Object[]{dVar});
            return;
        }
        e eVar = f16322a;
        if (eVar != null) {
            eVar.b(dVar);
            return;
        }
        synchronized (c.class) {
            e.add(dVar);
            d.remove(dVar);
        }
    }

    public static void a(a.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f4e7e8b", new Object[]{cVar});
            return;
        }
        e eVar = f16322a;
        if (eVar != null) {
            eVar.a(cVar);
            return;
        }
        synchronized (c.class) {
            f.add(cVar);
            g.remove(cVar);
        }
    }

    public static void b(a.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e66c6f6a", new Object[]{cVar});
            return;
        }
        e eVar = f16322a;
        if (eVar != null) {
            eVar.b(cVar);
            return;
        }
        synchronized (c.class) {
            g.add(cVar);
            f.remove(cVar);
        }
    }

    public static d a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("210d3d07", new Object[0]);
        }
        e eVar = f16322a;
        if (eVar != null) {
            return eVar.a();
        }
        return d.DEFAULT;
    }

    public static Activity b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("233c125f", new Object[0]);
        }
        e eVar = f16322a;
        if (eVar == null) {
            return null;
        }
        return eVar.b();
    }

    public static void a(IApmEventListener iApmEventListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78ba6d32", new Object[]{iApmEventListener});
            return;
        }
        e eVar = f16322a;
        if (eVar != null) {
            eVar.a(iApmEventListener);
            return;
        }
        synchronized (c.class) {
            h.add(iApmEventListener);
            i.remove(iApmEventListener);
        }
    }

    public static void b(IApmEventListener iApmEventListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92d5ebd1", new Object[]{iApmEventListener});
            return;
        }
        e eVar = f16322a;
        if (eVar != null) {
            eVar.b(iApmEventListener);
            return;
        }
        synchronized (c.class) {
            i.add(iApmEventListener);
            h.remove(iApmEventListener);
        }
    }

    public static void a(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e7a4605", new Object[]{fVar});
            return;
        }
        e eVar = f16322a;
        if (eVar != null) {
            eVar.a(fVar);
            return;
        }
        synchronized (c.class) {
            j.add(fVar);
            k.remove(fVar);
        }
    }

    public static void a(IScrollListener iScrollListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec3ef761", new Object[]{iScrollListener});
            return;
        }
        e eVar = f16322a;
        if (eVar != null) {
            eVar.a(iScrollListener);
            return;
        }
        synchronized (c.class) {
            l.add(iScrollListener);
            m.remove(iScrollListener);
        }
    }

    public static void b(IScrollListener iScrollListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a1791c0", new Object[]{iScrollListener});
            return;
        }
        e eVar = f16322a;
        if (eVar != null) {
            eVar.b(iScrollListener);
            return;
        }
        synchronized (c.class) {
            m.add(iScrollListener);
            l.remove(iScrollListener);
        }
    }

    public static Handler c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("a819f71c", new Object[0]);
        }
        e eVar = f16322a;
        if (eVar == null) {
            return null;
        }
        return eVar.c();
    }

    public static Looper d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Looper) ipChange.ipc$dispatch("b70cfb00", new Object[0]);
        }
        e eVar = f16322a;
        if (eVar == null) {
            return null;
        }
        return eVar.m();
    }

    public static void a(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e79d1a6", new Object[]{eVar});
            return;
        }
        f16322a = eVar;
        synchronized (c.class) {
            for (Map.Entry<a.InterfaceC0630a, Boolean> entry : b.entrySet()) {
                eVar.a(entry.getKey(), entry.getValue().booleanValue());
            }
            b.clear();
            for (a.InterfaceC0630a interfaceC0630a : c) {
                eVar.a(interfaceC0630a);
            }
            c.clear();
            for (a.d dVar : d) {
                eVar.a(dVar);
            }
            d.clear();
            for (a.d dVar2 : e) {
                eVar.b(dVar2);
            }
            e.clear();
            for (a.c cVar : f) {
                eVar.a(cVar);
            }
            f.clear();
            for (a.c cVar2 : g) {
                eVar.b(cVar2);
            }
            g.clear();
            for (IApmEventListener iApmEventListener : h) {
                eVar.a(iApmEventListener);
            }
            h.clear();
            for (IApmEventListener iApmEventListener2 : i) {
                eVar.b(iApmEventListener2);
            }
            i.clear();
            for (f fVar : j) {
                eVar.a(fVar);
            }
            j.clear();
            for (f fVar2 : k) {
                eVar.b(fVar2);
            }
            k.clear();
            for (IScrollListener iScrollListener : l) {
                eVar.a(iScrollListener);
            }
            l.clear();
            for (IScrollListener iScrollListener2 : m) {
                eVar.b(iScrollListener2);
            }
            m.clear();
        }
    }
}
