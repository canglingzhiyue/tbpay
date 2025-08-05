package com.taobao.tao.flexbox.layoutmanager.core;

import android.graphics.Rect;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import android.util.Pair;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.IDeviceInfo;
import com.taobao.tao.flexbox.layoutmanager.core.aa;
import com.taobao.tao.flexbox.layoutmanager.core.ab;
import com.taobao.tao.flexbox.layoutmanager.core.af;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import tb.kge;
import tb.oea;
import tb.oeb;
import tb.oec;
import tb.ogg;
import tb.ogh;
import tb.ogu;

/* loaded from: classes8.dex */
public class ac {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static ac f20323a;
    private a b;
    private a c;
    private c d;

    static {
        kge.a(-319250601);
    }

    public static /* synthetic */ Pair a(ab.a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Pair) ipChange.ipc$dispatch("5db3bedc", new Object[]{aVar}) : b(aVar);
    }

    public static /* synthetic */ void a(aa aaVar, ab.a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba02511a", new Object[]{aaVar, aVar, new Boolean(z)});
        } else {
            d(aaVar, aVar, z);
        }
    }

    public static /* synthetic */ boolean a(aa aaVar, List list, ab.a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("97f467ef", new Object[]{aaVar, list, aVar})).booleanValue() : b(aaVar, list, aVar);
    }

    public static /* synthetic */ void b(aa aaVar, ab.a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("728f1179", new Object[]{aaVar, aVar, new Boolean(z)});
        } else {
            c(aaVar, aVar, z);
        }
    }

    /* loaded from: classes8.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public b f20324a;
        public c b;
        private int c;

        static {
            kge.a(-882744634);
        }

        public static /* synthetic */ int a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("98d105a4", new Object[]{aVar})).intValue() : aVar.c;
        }

        public static /* synthetic */ int b(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("260bb725", new Object[]{aVar})).intValue();
            }
            int i = aVar.c;
            aVar.c = i + 1;
            return i;
        }

        public static /* synthetic */ int c(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("b34668a6", new Object[]{aVar})).intValue();
            }
            int i = aVar.c;
            aVar.c = i - 1;
            return i;
        }
    }

    public static synchronized ac a() {
        synchronized (ac.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ac) ipChange.ipc$dispatch("fcfaae94", new Object[0]);
            }
            if (f20323a == null) {
                f20323a = new ac();
            }
            return f20323a;
        }
    }

    private ac() {
    }

    public a b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("d6e1a996", new Object[]{this});
        }
        if (oeb.aj()) {
            f();
            if ((this.c == null && a.a(this.b) == 0) || (this.c != null && a.a(this.b) <= a.a(this.c))) {
                a.b(this.b);
                return this.b;
            }
            g();
            a.b(this.c);
            return this.c;
        }
        f();
        a.b(this.b);
        return this.b;
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98d105b1", new Object[]{this, aVar});
            return;
        }
        a.c(aVar);
        ogg.b("releaseEngineThreadGroup:" + a.a(aVar));
    }

    public b c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("4ba4414", new Object[]{this});
        }
        f();
        return this.b.f20324a;
    }

    public c d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("3292de92", new Object[]{this});
        }
        f();
        return this.b.b;
    }

    public c e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("606b78f1", new Object[]{this});
        }
        f();
        return this.d;
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else if (this.b != null) {
        } else {
            this.b = new a();
            this.b.f20324a = new b("tnode-main-engine-thread");
            this.b.f20324a.b();
            b.a(this.b.f20324a);
            if (oeb.ak()) {
                a aVar = this.b;
                aVar.b = aVar.f20324a;
            } else {
                this.b.b = new c("tnode-main-js-thread");
                this.b.b.b();
            }
            if (!oeb.aQ() && !oeb.aR()) {
                return;
            }
            this.d = new c("tnode-layout-thread");
            this.d.b();
        }
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else if (this.c != null) {
        } else {
            this.c = new a();
            this.c.f20324a = new b("tnode-minor-engine-thread");
            this.c.f20324a.b();
            if (oeb.ak()) {
                a aVar = this.c;
                aVar.b = aVar.f20324a;
                return;
            }
            this.c.b = new c("tnode-minor-js-thread");
            this.c.b.b();
        }
    }

    private static Pair<aa, List<af.c>> b(ab.a aVar) {
        List<af.c> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("40df721d", new Object[]{aVar});
        }
        ogh.a("vnodediff");
        af afVar = aVar.e.c;
        afVar.a(aVar.f);
        aa aaVar = aVar.e;
        if (aVar.j) {
            aaVar = aaVar.M();
            afVar = aaVar.c;
        } else {
            while (afVar.b != null && afVar.b.p == afVar.p) {
                afVar = afVar.b;
            }
            if (afVar.e != null && oeb.bo()) {
                aaVar = afVar.e;
            }
        }
        System.nanoTime();
        try {
            list = afVar.c(aVar.k);
        } catch (Exception e) {
            ArrayList arrayList = new ArrayList();
            ogg.a("VNodeDiff", e.getMessage());
            list = arrayList;
        }
        ogh.b();
        return new Pair<>(aaVar, list);
    }

    private static boolean b(aa aaVar, List<af.c> list, ab.a aVar) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5170fdb0", new Object[]{aaVar, list, aVar})).booleanValue();
        }
        System.nanoTime();
        ogh.a("tnodepatch");
        boolean z2 = aVar.j;
        if (aaVar == null || aaVar.b == null) {
            z2 = true;
        }
        ArrayList<aa> arrayList = new ArrayList();
        if (aVar.h) {
            for (af.c cVar : list) {
                af afVar = cVar.f20343a;
                aa aaVar2 = afVar.e != null ? afVar.e : null;
                if (aaVar2 != null) {
                    aaVar2.a(aVar.k);
                    j.a(aaVar2, cVar.b, false, z2);
                    aaVar2.a((String) null);
                    arrayList.add(aaVar2);
                }
            }
        } else {
            for (af.c cVar2 : list) {
                af afVar2 = cVar2.f20343a;
                aa aaVar3 = afVar2.e != null ? afVar2.e : null;
                if (aaVar3 != null) {
                    aaVar3.a(aVar.k);
                    aaVar3.a((String) null);
                    arrayList.add(aaVar3);
                    z = j.a(aaVar3, cVar2.b, true, z2) | z;
                }
            }
        }
        for (aa aaVar4 : arrayList) {
            if (aaVar4.I() != null) {
                aaVar4.I().onPatchCompleted();
            }
        }
        ogh.b();
        return z;
    }

    private static void c(aa aaVar, ab.a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b1bd1d8", new Object[]{aaVar, aVar, new Boolean(z)});
            return;
        }
        ogh.a("tnodelayout");
        try {
        } catch (Throwable th) {
            ogg.b("tnode layout:" + th.getMessage());
        }
        if (!aVar.h && aaVar.J() != null) {
            if (z || aaVar.n()) {
                aaVar.l();
            }
            ogh.b();
        }
        float b2 = aaVar.c().b();
        float f = Float.NaN;
        if (b2 <= 0.0f) {
            b2 = Float.NaN;
        }
        float d = aaVar.c().d();
        if (d > 0.0f) {
            f = d;
        }
        if (!aVar.h || aaVar.n()) {
            aaVar.c(b2, f);
        }
        ogh.b();
    }

    private static void d(aa aaVar, ab.a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3a89237", new Object[]{aaVar, aVar, new Boolean(z)});
            return;
        }
        ogh.a("tnoderender");
        aa L = aaVar.L();
        c(L, aVar, z);
        L.a(aVar.c.h, new aa.d(aVar.m, aVar.i instanceof Map ? (Map) aVar.i : null));
        if (aVar.g != null) {
            aVar.g.a(aaVar);
        }
        ogh.b();
    }

    /* loaded from: classes8.dex */
    public static class b extends c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes8.dex */
        public interface a {
            void a();
        }

        static {
            kge.a(-1251947915);
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        public static /* synthetic */ void a(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("98d17a10", new Object[]{bVar});
            } else {
                bVar.d();
            }
        }

        public static /* synthetic */ void a(b bVar, aa aaVar, ab.a aVar, boolean z, a aVar2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a6539bd", new Object[]{bVar, aaVar, aVar, new Boolean(z), aVar2});
            } else {
                bVar.a(aaVar, aVar, z, aVar2);
            }
        }

        public static /* synthetic */ void a(b bVar, ab.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9ba04aba", new Object[]{bVar, aVar});
            } else {
                bVar.e(aVar);
            }
        }

        public b(String str) {
            super(str);
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.core.ac.c
        public Handler a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("b016d95e", new Object[]{this}) : new Handler(getLooper()) { // from class: com.taobao.tao.flexbox.layoutmanager.core.ac.b.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
                    if (str.hashCode() == 72182663) {
                        super.dispatchMessage((Message) objArr[0]);
                        return null;
                    }
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                }

                @Override // android.os.Handler
                public void dispatchMessage(Message message) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("44d6b87", new Object[]{this, message});
                        return;
                    }
                    try {
                        super.dispatchMessage(message);
                    } catch (Exception e) {
                        ogg.b("TNodeThread exception:" + e.getMessage());
                    }
                }

                @Override // android.os.Handler
                public void handleMessage(Message message) {
                    IpChange ipChange2 = $ipChange;
                    final boolean z = false;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("282a8c19", new Object[]{this, message});
                        return;
                    }
                    int i = message.what;
                    if (i == 0) {
                        ogu.b();
                    } else if (i != 1) {
                        if (i == 2) {
                            b.a(b.this, (ab.a) message.obj);
                        } else if (i != 4) {
                        } else {
                            final ab.a aVar = (ab.a) message.obj;
                            final Pair a2 = ac.a(aVar);
                            oec.a(new Runnable() { // from class: com.taobao.tao.flexbox.layoutmanager.core.ac.b.1.3
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public void run() {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                        return;
                                    }
                                    ac.a((aa) a2.first, (List) a2.second, aVar);
                                    ac.a(aVar.e, aVar, true);
                                }
                            }, true);
                        }
                    } else {
                        final ab.a aVar2 = (ab.a) message.obj;
                        final Pair a3 = ac.a(aVar2);
                        if ("onready".equals(aVar2.k) && aVar2.e.x() == null) {
                            z = true;
                        }
                        boolean a4 = oeb.a((aa) a3.first);
                        if (z && ((aa) a3.first).G() == null && a4) {
                            synchronized (aVar2.c) {
                                b.a(b.this, (aa) a3.first, aVar2, ac.a((aa) a3.first, (List) a3.second, aVar2), null);
                            }
                            return;
                        }
                        final Runnable runnable = new Runnable() { // from class: com.taobao.tao.flexbox.layoutmanager.core.ac.b.1.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                    return;
                                }
                                boolean a5 = ac.a((aa) a3.first, (List) a3.second, aVar2);
                                if (!z) {
                                    ac.a((aa) a3.first, aVar2, a5);
                                } else {
                                    b.a(b.this, (aa) a3.first, aVar2, a5, null);
                                }
                            }
                        };
                        oec.a(a4 ? new Runnable() { // from class: com.taobao.tao.flexbox.layoutmanager.core.ac.b.1.2
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                    return;
                                }
                                synchronized (aVar2.c) {
                                    runnable.run();
                                }
                            }
                        } : runnable);
                    }
                }
            };
        }

        private void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            } else {
                this.f20334a.sendEmptyMessage(0);
            }
        }

        private aa a(aa aaVar, ab.a aVar, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (aa) ipChange.ipc$dispatch("a5c7c2e4", new Object[]{this, aaVar, aVar, new Boolean(z)});
            }
            if (aVar == null || aaVar == null) {
                return null;
            }
            Rect a2 = a(aVar.e.c);
            if (a2.width() <= 0 || a2.height() <= 0) {
                return null;
            }
            aa L = aaVar.L();
            ac.b(L, aVar, z);
            return L;
        }

        private void a(aa aaVar, ab.a aVar, boolean z, final a aVar2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8bbfc265", new Object[]{this, aaVar, aVar, new Boolean(z), aVar2});
                return;
            }
            if (oeb.bz()) {
                a(aaVar, aVar, z);
            }
            if (aVar2 == null) {
                return;
            }
            oec.a(new Runnable() { // from class: com.taobao.tao.flexbox.layoutmanager.core.ac.b.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        aVar2.a();
                    }
                }
            }, true);
        }

        public void a(ab.a aVar) {
            IpChange ipChange = $ipChange;
            boolean z = false;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("971c2d12", new Object[]{this, aVar});
                return;
            }
            if ("onready".equals(aVar.k) && aVar.e.x() == null) {
                z = true;
            }
            if (aVar.h && oec.f() && !aVar.e.K().equals("poplayer")) {
                Pair a2 = ac.a(aVar);
                boolean a3 = ac.a((aa) a2.first, (List) a2.second, aVar);
                if (z) {
                    return;
                }
                ac.a((aa) a2.first, aVar, a3);
                return;
            }
            Message obtain = Message.obtain(this.f20334a, 1, aVar);
            if (Looper.myLooper() == getLooper()) {
                this.f20334a.handleMessage(obtain);
                obtain.recycle();
                return;
            }
            obtain.sendToTarget();
        }

        public void c(ab.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b1919014", new Object[]{this, aVar});
                return;
            }
            aa aaVar = aVar.e;
            aaVar.t();
            aaVar.c().a(aVar.f20317a, aVar.b);
            Message.obtain(this.f20334a, 4, new ab.a(aVar.m, "forceRefreshLayout", System.currentTimeMillis(), aVar.c, aaVar.c().b, aaVar, aaVar.D(), aVar.g, aVar.i, true)).sendToTarget();
        }

        public void b(final ab.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2456de93", new Object[]{this, aVar});
                return;
            }
            IDeviceInfo w = com.taobao.tao.flexbox.layoutmanager.adapter.a.a().w();
            int[] a2 = oea.a(aVar.c.m());
            int b = aVar.e.c().b();
            if (w.c() && b != a2[0]) {
                aVar.c.C();
                Message.obtain(this.f20334a, 4, new ab.a(aVar.m, "forceRefreshLayout", System.currentTimeMillis(), aVar.c, aVar.e.c().b, aVar.e, aVar.e.D(), aVar.g, aVar.i, true)).sendToTarget();
                return;
            }
            oec.a(new Runnable() { // from class: com.taobao.tao.flexbox.layoutmanager.core.ac.b.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        ac.a(aVar.e, aVar, true);
                    }
                }
            }, true);
        }

        public void d(ab.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3ecc4195", new Object[]{this, aVar});
            } else if (aVar == null || aVar.e == null) {
            } else {
                Message.obtain(this.f20334a, 2, aVar).sendToTarget();
            }
        }

        private Rect a(af afVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Rect) ipChange.ipc$dispatch("7cd68534", new Object[]{this, afVar});
            }
            ab.h c = afVar.g().c();
            return new Rect(0, 0, c.b(), c.d());
        }

        private void e(final ab.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cc06f316", new Object[]{this, aVar});
                return;
            }
            try {
                final Pair a2 = ac.a(aVar);
                Runnable runnable = new Runnable() { // from class: com.taobao.tao.flexbox.layoutmanager.core.ac.b.4
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            b.a(b.this, (aa) a2.first, aVar, ac.a((aa) a2.first, (List) a2.second, aVar), new a() { // from class: com.taobao.tao.flexbox.layoutmanager.core.ac.b.4.1
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // com.taobao.tao.flexbox.layoutmanager.core.ac.b.a
                                public void a() {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("56c6c68", new Object[]{this});
                                    } else if (aVar.g == null) {
                                    } else {
                                        aVar.g.a(aVar.e);
                                    }
                                }
                            });
                        }
                    }
                };
                if (oeb.a((aa) a2.first)) {
                    synchronized (aVar.c) {
                        runnable.run();
                    }
                    return;
                }
                oec.a(runnable, true);
            } catch (Exception unused) {
                if (aVar.g == null) {
                    return;
                }
                oec.a(new Runnable() { // from class: com.taobao.tao.flexbox.layoutmanager.core.ac.b.5
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            aVar.g.a(null);
                        }
                    }
                }, true);
            }
        }
    }

    /* loaded from: classes8.dex */
    public static class c extends HandlerThread {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public Handler f20334a;
        private List<Runnable> b;
        private a c;

        static {
            kge.a(-1831332981);
        }

        public static /* synthetic */ List a(c cVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("361957f8", new Object[]{cVar}) : cVar.b;
        }

        public static /* synthetic */ a b(c cVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("6c9b2950", new Object[]{cVar}) : cVar.c;
        }

        /* loaded from: classes8.dex */
        public class a implements MessageQueue.IdleHandler {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            static {
                kge.a(1435761949);
                kge.a(1508499111);
            }

            private a() {
            }

            @Override // android.os.MessageQueue.IdleHandler
            public boolean queueIdle() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("b5e69690", new Object[]{this})).booleanValue();
                }
                for (Runnable runnable : c.a(c.this)) {
                    runnable.run();
                }
                c.a(c.this).clear();
                return true;
            }
        }

        public c(String str) {
            super(str);
            this.b = new ArrayList();
            this.c = new a();
        }

        public Handler a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("b016d95e", new Object[]{this}) : new Handler(getLooper()) { // from class: com.taobao.tao.flexbox.layoutmanager.core.ac.c.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
                    if (str.hashCode() == 72182663) {
                        super.dispatchMessage((Message) objArr[0]);
                        return null;
                    }
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                }

                @Override // android.os.Handler
                public void dispatchMessage(Message message) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("44d6b87", new Object[]{this, message});
                        return;
                    }
                    try {
                        super.dispatchMessage(message);
                    } catch (Exception e) {
                        ogg.b("TNodeThread exception:" + e.getMessage());
                    }
                }
            };
        }

        public final void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
                return;
            }
            start();
            this.f20334a = a();
            this.f20334a.post(new Runnable() { // from class: com.taobao.tao.flexbox.layoutmanager.core.ac.c.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        Looper.myQueue().addIdleHandler(c.b(c.this));
                    }
                }
            });
        }

        public final void a(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("39112e6", new Object[]{this, runnable});
            } else if (Looper.myLooper() == getLooper()) {
                try {
                    runnable.run();
                } catch (Exception e) {
                    ogg.b("TNodeThread exception:" + e.getMessage());
                }
            } else {
                this.f20334a.post(runnable);
            }
        }

        public Handler c() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("a819f71c", new Object[]{this}) : this.f20334a;
        }

        public final void b(final Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("87c15fe7", new Object[]{this, runnable});
            } else {
                this.f20334a.post(new Runnable() { // from class: com.taobao.tao.flexbox.layoutmanager.core.ac.c.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            c.a(c.this).add(runnable);
                        }
                    }
                });
            }
        }
    }
}
