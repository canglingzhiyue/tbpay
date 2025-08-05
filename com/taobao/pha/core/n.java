package com.taobao.pha.core;

import android.content.Context;
import android.net.Uri;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.pha.core.model.PageModel;
import com.taobao.pha.core.phacontainer.b;
import com.taobao.pha.core.phacontainer.pullrefresh.DefaultPullRefreshLayout;
import com.taobao.pha.core.phacontainer.pullrefresh.IPullRefreshLayout;
import java.util.Map;
import tb.kge;
import tb.nel;
import tb.neo;
import tb.nev;
import tb.nex;
import tb.ney;
import tb.nfa;
import tb.nfb;
import tb.nfc;
import tb.nfg;
import tb.nfi;
import tb.nfu;
import tb.nga;
import tb.ngb;
import tb.ngh;
import tb.ngo;
import tb.ngq;

/* loaded from: classes.dex */
public class n {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static c f18753a;
    private static g b;
    private static IPullRefreshLayout.a c;
    private static volatile com.taobao.pha.core.jsbridge.a d;
    private volatile ngq A;
    private volatile nfa B;
    private volatile nfi C;
    private b D;
    private Map<String, String> E;
    private nfu F;
    private k e;
    private nfc f;
    private IImageLoader g;
    private g h;
    private com.taobao.pha.core.tabcontainer.a i;
    private com.taobao.pha.core.tabcontainer.c j;
    private l k;
    private ngh l;
    private IPullRefreshLayout.a n;
    private nfg o;
    private c p;
    private com.taobao.pha.core.jsbridge.a q;
    private f r;
    private ney s;
    private nex t;
    private com.taobao.pha.core.manifest.b u;
    private nel v;
    private nga w;
    private ngb x;
    private volatile nev y;
    private j z;

    static {
        kge.a(1725548669);
    }

    public static /* synthetic */ IImageLoader a(n nVar, IImageLoader iImageLoader) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IImageLoader) ipChange.ipc$dispatch("671d43d4", new Object[]{nVar, iImageLoader});
        }
        nVar.g = iImageLoader;
        return iImageLoader;
    }

    public static /* synthetic */ c a(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("b3e31bf2", new Object[]{cVar});
        }
        f18753a = cVar;
        return cVar;
    }

    public static /* synthetic */ c a(n nVar, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("43804038", new Object[]{nVar, cVar});
        }
        nVar.p = cVar;
        return cVar;
    }

    public static /* synthetic */ f a(n nVar, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("490c39f2", new Object[]{nVar, fVar});
        }
        nVar.r = fVar;
        return fVar;
    }

    public static /* synthetic */ j a(n nVar, j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j) ipChange.ipc$dispatch("507186ea", new Object[]{nVar, jVar});
        }
        nVar.z = jVar;
        return jVar;
    }

    public static /* synthetic */ com.taobao.pha.core.jsbridge.a a(com.taobao.pha.core.jsbridge.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.pha.core.jsbridge.a) ipChange.ipc$dispatch("fed7c2e", new Object[]{aVar});
        }
        d = aVar;
        return aVar;
    }

    public static /* synthetic */ com.taobao.pha.core.jsbridge.a a(n nVar, com.taobao.pha.core.jsbridge.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.pha.core.jsbridge.a) ipChange.ipc$dispatch("4a05af4", new Object[]{nVar, aVar});
        }
        nVar.q = aVar;
        return aVar;
    }

    public static /* synthetic */ k a(n nVar, k kVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (k) ipChange.ipc$dispatch("524ada28", new Object[]{nVar, kVar});
        }
        nVar.e = kVar;
        return kVar;
    }

    public static /* synthetic */ l a(n nVar, l lVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l) ipChange.ipc$dispatch("54242d66", new Object[]{nVar, lVar});
        }
        nVar.k = lVar;
        return lVar;
    }

    public static /* synthetic */ b a(n nVar, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("6561ed14", new Object[]{nVar, bVar});
        }
        nVar.D = bVar;
        return bVar;
    }

    public static /* synthetic */ IPullRefreshLayout.a a(n nVar, IPullRefreshLayout.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IPullRefreshLayout.a) ipChange.ipc$dispatch("15f44f36", new Object[]{nVar, aVar});
        }
        nVar.n = aVar;
        return aVar;
    }

    public static /* synthetic */ IPullRefreshLayout.a a(IPullRefreshLayout.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IPullRefreshLayout.a) ipChange.ipc$dispatch("e5834cf0", new Object[]{aVar});
        }
        c = aVar;
        return aVar;
    }

    public static /* synthetic */ com.taobao.pha.core.tabcontainer.a a(n nVar, com.taobao.pha.core.tabcontainer.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.pha.core.tabcontainer.a) ipChange.ipc$dispatch("957f6134", new Object[]{nVar, aVar});
        }
        nVar.i = aVar;
        return aVar;
    }

    public static /* synthetic */ Map a(n nVar, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d3d21dd8", new Object[]{nVar, map});
        }
        nVar.E = map;
        return map;
    }

    public static /* synthetic */ nel a(n nVar, nel nelVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nel) ipChange.ipc$dispatch("207c43d4", new Object[]{nVar, nelVar});
        }
        nVar.v = nelVar;
        return nelVar;
    }

    public static /* synthetic */ ney a(n nVar, ney neyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ney) ipChange.ipc$dispatch("b0195934", new Object[]{nVar, neyVar});
        }
        nVar.s = neyVar;
        return neyVar;
    }

    public static /* synthetic */ nfa a(n nVar, nfa nfaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nfa) ipChange.ipc$dispatch("c25a3d54", new Object[]{nVar, nfaVar});
        }
        nVar.B = nfaVar;
        return nfaVar;
    }

    public static /* synthetic */ nfc a(n nVar, nfc nfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nfc) ipChange.ipc$dispatch("ec23a314", new Object[]{nVar, nfcVar});
        }
        nVar.f = nfcVar;
        return nfcVar;
    }

    public static /* synthetic */ nfg a(n nVar, nfg nfgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nfg) ipChange.ipc$dispatch("3fb66e94", new Object[]{nVar, nfgVar});
        }
        nVar.o = nfgVar;
        return nfgVar;
    }

    public static /* synthetic */ nfi a(n nVar, nfi nfiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nfi) ipChange.ipc$dispatch("697fd454", new Object[]{nVar, nfiVar});
        }
        nVar.C = nfiVar;
        return nfiVar;
    }

    public static /* synthetic */ nfu a(n nVar, nfu nfuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nfu) ipChange.ipc$dispatch("643836d4", new Object[]{nVar, nfuVar});
        }
        nVar.F = nfuVar;
        return nfuVar;
    }

    public static /* synthetic */ nga a(n nVar, nga ngaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nga) ipChange.ipc$dispatch("ca0be674", new Object[]{nVar, ngaVar});
        }
        nVar.w = ngaVar;
        return ngaVar;
    }

    public static /* synthetic */ ngb a(n nVar, ngb ngbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ngb) ipChange.ipc$dispatch("5ef09954", new Object[]{nVar, ngbVar});
        }
        nVar.x = ngbVar;
        return ngbVar;
    }

    public static /* synthetic */ ngh a(n nVar, ngh nghVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ngh) ipChange.ipc$dispatch("dc4cca94", new Object[]{nVar, nghVar});
        }
        nVar.l = nghVar;
        return nghVar;
    }

    public static /* synthetic */ ngq a(n nVar, ngq ngqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ngq) ipChange.ipc$dispatch("18571474", new Object[]{nVar, ngqVar});
        }
        nVar.A = ngqVar;
        return ngqVar;
    }

    public ngq a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ngq) ipChange.ipc$dispatch("f083646", new Object[]{this});
        }
        if (this.A == null) {
            synchronized (this) {
                this.A = new ngq() { // from class: com.taobao.pha.core.n.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // tb.ngq
                    public ngo a(Uri uri, JSONObject jSONObject, JSONArray jSONArray) {
                        IpChange ipChange2 = $ipChange;
                        return ipChange2 instanceof IpChange ? (ngo) ipChange2.ipc$dispatch("fa210737", new Object[]{this, uri, jSONObject, jSONArray}) : new ngo(uri, jSONObject);
                    }
                };
            }
        }
        return this.A;
    }

    public nfi b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (nfi) ipChange.ipc$dispatch("16b9d6ec", new Object[]{this}) : this.C;
    }

    public nev c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (nev) ipChange.ipc$dispatch("1e6b7a1d", new Object[]{this}) : this.y;
    }

    public ngb d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ngb) ipChange.ipc$dispatch("261d2492", new Object[]{this}) : this.x;
    }

    public ney e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ney) ipChange.ipc$dispatch("2dcec538", new Object[]{this}) : this.s;
    }

    public nga f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (nga) ipChange.ipc$dispatch("35806f31", new Object[]{this}) : this.w;
    }

    public b g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("a8a9e015", new Object[]{this}) : this.D;
    }

    public nfu h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (nfu) ipChange.ipc$dispatch("44e3b89a", new Object[]{this}) : this.F;
    }

    public l i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (l) ipChange.ipc$dispatch("db4982ec", new Object[]{this}) : this.k;
    }

    public c j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("149a9296", new Object[]{this});
        }
        c cVar = this.p;
        if (cVar != null) {
            return cVar;
        }
        if (f18753a == null) {
            f18753a = new c();
        }
        return f18753a;
    }

    public nfg k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (nfg) ipChange.ipc$dispatch("5bf8a705", new Object[]{this}) : this.o;
    }

    public ngh l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ngh) ipChange.ipc$dispatch("63aa5044", new Object[]{this}) : this.l;
    }

    public IPullRefreshLayout.a n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IPullRefreshLayout.a) ipChange.ipc$dispatch("5e10b859", new Object[]{this});
        }
        IPullRefreshLayout.a aVar = this.n;
        if (aVar != null) {
            return aVar;
        }
        if (c == null) {
            c = new IPullRefreshLayout.a() { // from class: com.taobao.pha.core.n.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.pha.core.phacontainer.pullrefresh.IPullRefreshLayout.a
                public IPullRefreshLayout a(Context context, PageModel pageModel) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (IPullRefreshLayout) ipChange2.ipc$dispatch("75d7c205", new Object[]{this, context, pageModel}) : new DefaultPullRefreshLayout(context);
                }
            };
        }
        return c;
    }

    public com.taobao.pha.core.jsbridge.a o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.pha.core.jsbridge.a) ipChange.ipc$dispatch("ad253254", new Object[]{this});
        }
        com.taobao.pha.core.jsbridge.a aVar = this.q;
        if (aVar != null) {
            return aVar;
        }
        synchronized (nfb.class) {
            if (d == null) {
                d = new nfb();
            }
        }
        return d;
    }

    public f p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("6c80f779", new Object[]{this}) : this.r;
    }

    public Map<String, String> q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("7abac4ad", new Object[]{this}) : this.E;
    }

    public k r() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (k) ipChange.ipc$dispatch("df231996", new Object[]{this}) : this.e;
    }

    public nfc s() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (nfc) ipChange.ipc$dispatch("9985d181", new Object[]{this}) : this.f;
    }

    public IImageLoader t() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IImageLoader) ipChange.ipc$dispatch("c90c54ae", new Object[]{this}) : this.g;
    }

    public com.taobao.pha.core.tabcontainer.a u() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.pha.core.tabcontainer.a) ipChange.ipc$dispatch("952d3854", new Object[]{this}) : this.i;
    }

    public com.taobao.pha.core.tabcontainer.c v() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.pha.core.tabcontainer.c) ipChange.ipc$dispatch("ec4b2971", new Object[]{this}) : this.j;
    }

    public void a(com.taobao.pha.core.tabcontainer.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e31b5960", new Object[]{this, cVar});
        } else {
            this.j = cVar;
        }
    }

    public g w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("fdb86cdf", new Object[]{this});
        }
        g gVar = this.h;
        if (gVar != null) {
            return gVar;
        }
        if (b == null) {
            b = new d();
        }
        return b;
    }

    public nex x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nex) ipChange.ipc$dispatch("bffe0b26", new Object[]{this});
        }
        if (this.t == null) {
            this.t = new nex();
        }
        return this.t;
    }

    public j y() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (j) ipChange.ipc$dispatch("705a8ebe", new Object[]{this}) : this.z;
    }

    public com.taobao.pha.core.manifest.b z() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.pha.core.manifest.b) ipChange.ipc$dispatch("ed5d754b", new Object[]{this}) : this.u;
    }

    public nfa A() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (nfa) ipChange.ipc$dispatch("18d384b5", new Object[]{this}) : this.B;
    }

    public nel B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nel) ipChange.ipc$dispatch("208527a8", new Object[]{this});
        }
        if (this.q == null) {
            return new neo();
        }
        return this.v;
    }

    /* loaded from: classes.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final n f18756a = new n();

        static {
            kge.a(1721946708);
        }

        public a a(nfi nfiVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("4a9df464", new Object[]{this, nfiVar});
            }
            n.a(this.f18756a, nfiVar);
            return this;
        }

        public a a(nfc nfcVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("a5b7c82a", new Object[]{this, nfcVar});
            }
            n.a(this.f18756a, nfcVar);
            return this;
        }

        public a a(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("47909d2a", new Object[]{this, cVar});
            }
            n.a(this.f18756a, cVar);
            n.a((c) null);
            return this;
        }

        public a a(Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("e21308fa", new Object[]{this, map});
            }
            n.a(this.f18756a, map);
            return this;
        }

        public a a(k kVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("ce18d822", new Object[]{this, kVar});
            }
            n.a(this.f18756a, kVar);
            return this;
        }

        public a a(IImageLoader iImageLoader) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("e43db878", new Object[]{this, iImageLoader});
            }
            n.a(this.f18756a, iImageLoader);
            return this;
        }

        public a a(ngh nghVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("831cd186", new Object[]{this, nghVar});
            }
            n.a(this.f18756a, nghVar);
            return this;
        }

        public a a(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("236a62b2", new Object[]{this, bVar});
            }
            n.a(this.f18756a, bVar);
            return this;
        }

        public a a(IPullRefreshLayout.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("7947be29", new Object[]{this, aVar});
            }
            n.a(this.f18756a, aVar);
            n.a((IPullRefreshLayout.a) null);
            return this;
        }

        public a a(nfg nfgVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("68fbe5a6", new Object[]{this, nfgVar});
            }
            n.a(this.f18756a, nfgVar);
            return this;
        }

        public a a(nfu nfuVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("946a4cd8", new Object[]{this, nfuVar});
            }
            n.a(this.f18756a, nfuVar);
            return this;
        }

        public a a(com.taobao.pha.core.tabcontainer.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("cc49687f", new Object[]{this, aVar});
            }
            n.a(this.f18756a, aVar);
            return this;
        }

        public a a(l lVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("bee9df81", new Object[]{this, lVar});
            }
            n.a(this.f18756a, lVar);
            return this;
        }

        public a a(com.taobao.pha.core.jsbridge.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("717828b9", new Object[]{this, aVar});
            }
            n.a(this.f18756a, aVar);
            n.a((com.taobao.pha.core.jsbridge.a) null);
            return this;
        }

        public a a(f fVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("1a03b347", new Object[]{this, fVar});
            }
            n.a(this.f18756a, fVar);
            return this;
        }

        public a a(nga ngaVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("ed659ded", new Object[]{this, ngaVar});
            }
            n.a(this.f18756a, ngaVar);
            return this;
        }

        public a a(ngb ngbVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("de36a54c", new Object[]{this, ngbVar});
            }
            n.a(this.f18756a, ngbVar);
            return this;
        }

        public a a(j jVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("dd47d0c3", new Object[]{this, jVar});
            }
            n.a(this.f18756a, jVar);
            return this;
        }

        public a a(ney neyVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("2e5e85d3", new Object[]{this, neyVar});
            }
            n.a(this.f18756a, neyVar);
            return this;
        }

        public a a(ngq ngqVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("fa7613dd", new Object[]{this, ngqVar});
            }
            n.a(this.f18756a, ngqVar);
            return this;
        }

        public a a(nfa nfaVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("c415b96c", new Object[]{this, nfaVar});
            }
            n.a(this.f18756a, nfaVar);
            return this;
        }

        public a a(nel nelVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("f3c12600", new Object[]{this, nelVar});
            }
            n.a(this.f18756a, nelVar);
            return this;
        }

        public n a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (n) ipChange.ipc$dispatch("10c0fd22", new Object[]{this}) : this.f18756a;
        }
    }
}
