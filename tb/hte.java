package tb;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.meta.data.MetaResult;
import com.taobao.android.searchbaseframe.business.srp.list.uikit.PartnerRecyclerView;
import com.taobao.android.searchbaseframe.util.j;
import kotlin.TypeCastException;
import kotlin.jvm.internal.q;
import tb.inx;

/* loaded from: classes6.dex */
public class hte {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean C;
    private com.taobao.android.searchbaseframe.business.srp.a D;
    private boolean G;
    private boolean I;
    private boolean W;
    private htd X;
    private boolean Z;

    /* renamed from: a  reason: collision with root package name */
    public ise<irp, ? extends itn> f28772a;
    private boolean aa;
    private boolean ad;
    private boolean ae;
    private boolean af;
    private boolean ag;
    private Integer ah;
    private boolean ai;
    private com.taobao.android.searchbaseframe.xsl.refact.a ak;
    public ise<irp, ? extends ito> b;
    public ise<hte, ? extends htp> c;
    private int d;
    private ise<ipq, itd<?, ?>> e;
    private ise<ipq, itd<?, ?>> f;
    private boolean g;
    private ise<hte, ? extends com.taobao.android.meta.structure.state.c> h;
    private ise<com.taobao.android.meta.structure.list.h, ? extends com.taobao.android.meta.structure.list.e> i;
    private boolean j;
    private ise<Void, inx.b> s;
    private int v;
    private Drawable w;
    private htc x;
    private boolean z;
    private ise<hte, ? extends htr> k = d.INSTANCE;
    private ise<hte, ? extends com.taobao.android.meta.structure.list.a> l = e.INSTANCE;
    private ise<hte, ? extends com.taobao.android.meta.structure.list.b> m = f.INSTANCE;
    private ise<Context, ? extends PartnerRecyclerView> aj = h.INSTANCE;
    private ise<irq, com.taobao.android.meta.structure.list.h> n = new g();
    private ise<irq, ? extends com.taobao.android.meta.structure.childpage.g> o = new c();
    private ise<hte, ? extends com.taobao.android.meta.structure.childpage.b> p = a.INSTANCE;
    private ise<hte, ? extends com.taobao.android.meta.structure.childpage.c> q = b.INSTANCE;
    private final com.taobao.android.meta.data.d<Integer> r = new com.taobao.android.meta.data.d<>(0, false);
    private int t = j.a(6.0f);
    private final com.taobao.android.meta.data.d<Integer> u = new com.taobao.android.meta.data.d<>(0, false);
    private final com.taobao.android.meta.data.d<com.taobao.android.searchbaseframe.meta.uikit.d> y = new com.taobao.android.meta.data.d<>(null);
    private boolean A = true;
    private int B = 3;
    private final com.taobao.android.meta.data.d<Integer> E = new com.taobao.android.meta.data.d<>(0, false);
    private boolean F = true;
    private com.taobao.android.meta.data.d<Boolean> H = new com.taobao.android.meta.data.d<>(false, false);
    private com.taobao.android.meta.data.d<Boolean> J = new com.taobao.android.meta.data.d<>(false, false);
    private final com.taobao.android.meta.data.d<Integer> K = new com.taobao.android.meta.data.d<>(0, false);
    private final com.taobao.android.meta.data.d<Integer> L = new com.taobao.android.meta.data.d<>(0, false);
    private final com.taobao.android.meta.data.d<Integer> M = new com.taobao.android.meta.data.d<>(0, false);
    private final com.taobao.android.meta.data.d<Integer> N = new com.taobao.android.meta.data.d<>(0, false);
    private final com.taobao.android.meta.data.d<Integer> O = new com.taobao.android.meta.data.d<>(-1, false);
    private final com.taobao.android.meta.data.d<Integer> P = new com.taobao.android.meta.data.d<>(-1, false);
    private final com.taobao.android.meta.data.d<Integer> Q = new com.taobao.android.meta.data.d<>(0, false);
    private final com.taobao.android.meta.data.d<Integer> R = new com.taobao.android.meta.data.d<>(0, false);
    private final com.taobao.android.meta.data.d<Integer> S = new com.taobao.android.meta.data.d<>(10, false);
    private final com.taobao.android.meta.data.d<Boolean> T = new com.taobao.android.meta.data.d<>(false);
    private final com.taobao.android.meta.data.d<com.taobao.android.searchbaseframe.meta.uikit.c> U = new com.taobao.android.meta.data.d<>(null);
    private boolean V = true;
    private boolean Y = true;
    private com.taobao.android.meta.data.d<Boolean> ab = new com.taobao.android.meta.data.d<>(false, false);
    private com.taobao.android.meta.data.d<Integer> ac = new com.taobao.android.meta.data.d<>(0, false);

    static {
        kge.a(-1755326242);
    }

    public final int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : this.d;
    }

    public final void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.d = i;
        }
    }

    public final boolean ay() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ac44b4c3", new Object[]{this})).booleanValue() : this.ai;
    }

    public final void u(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca42bfd8", new Object[]{this, new Boolean(z)});
        } else {
            this.ai = z;
        }
    }

    public final boolean ar() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("abe2103c", new Object[]{this})).booleanValue() : this.ad;
    }

    public final void o(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c005ac1e", new Object[]{this, new Boolean(z)});
        } else {
            this.ad = z;
        }
    }

    public final boolean av() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ac1a6e40", new Object[]{this})).booleanValue() : this.ag;
    }

    public final void s(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6d90e9a", new Object[]{this, new Boolean(z)});
        } else {
            this.ag = z;
        }
    }

    public final void a(ise<ipq, itd<?, ?>> iseVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee45407d", new Object[]{this, iseVar});
        } else {
            this.e = iseVar;
        }
    }

    public final ise<ipq, itd<?, ?>> b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ise) ipChange.ipc$dispatch("16b7c162", new Object[]{this}) : this.e;
    }

    public final void b(ise<ipq, itd<?, ?>> iseVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcc846fe", new Object[]{this, iseVar});
        } else {
            this.f = iseVar;
        }
    }

    public final ise<ipq, itd<?, ?>> c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ise) ipChange.ipc$dispatch("1e6966c1", new Object[]{this}) : this.f;
    }

    public final void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.g = z;
        }
    }

    public final boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : this.g;
    }

    public final void c(ise<irp, ? extends itn> iseVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb4b4d7f", new Object[]{this, iseVar});
            return;
        }
        q.c(iseVar, "<set-?>");
        this.f28772a = iseVar;
    }

    public final ise<irp, ? extends itn> e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ise) ipChange.ipc$dispatch("2dccb17f", new Object[]{this});
        }
        ise<irp, ? extends itn> iseVar = this.f28772a;
        if (iseVar == null) {
            q.b("muiseMod");
        }
        return iseVar;
    }

    public final void d(ise<irp, ? extends ito> iseVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9ce5400", new Object[]{this, iseVar});
            return;
        }
        q.c(iseVar, "<set-?>");
        this.b = iseVar;
    }

    public final ise<irp, ? extends ito> f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ise) ipChange.ipc$dispatch("357e56de", new Object[]{this});
        }
        ise<irp, ? extends ito> iseVar = this.b;
        if (iseVar == null) {
            q.b("weexMod");
        }
        return iseVar;
    }

    public final void e(ise<hte, ? extends com.taobao.android.meta.structure.state.c> iseVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8515a81", new Object[]{this, iseVar});
        } else {
            this.h = iseVar;
        }
    }

    public final ise<hte, ? extends com.taobao.android.meta.structure.state.c> g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ise) ipChange.ipc$dispatch("3d2ffc3d", new Object[]{this}) : this.h;
    }

    public final void f(ise<hte, ? extends htp> iseVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96d46102", new Object[]{this, iseVar});
            return;
        }
        q.c(iseVar, "<set-?>");
        this.c = iseVar;
    }

    public final ise<hte, ? extends htp> h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ise) ipChange.ipc$dispatch("44e1a19c", new Object[]{this});
        }
        ise<hte, ? extends htp> iseVar = this.c;
        if (iseVar == null) {
            q.b("footStateView");
        }
        return iseVar;
    }

    public final void g(ise<com.taobao.android.meta.structure.list.h, ? extends com.taobao.android.meta.structure.list.e> iseVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85576783", new Object[]{this, iseVar});
        } else {
            this.i = iseVar;
        }
    }

    public final ise<com.taobao.android.meta.structure.list.h, ? extends com.taobao.android.meta.structure.list.e> i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ise) ipChange.ipc$dispatch("4c9346fb", new Object[]{this}) : this.i;
    }

    public final void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else {
            this.j = z;
        }
    }

    public final boolean j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[]{this})).booleanValue() : this.j;
    }

    public final boolean as() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("abf027bd", new Object[]{this})).booleanValue() : this.ae;
    }

    public final void q(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c36f5d5c", new Object[]{this, new Boolean(z)});
        } else {
            this.ae = z;
        }
    }

    public final void a(com.taobao.android.searchbaseframe.xsl.refact.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf8a4a5c", new Object[]{this, aVar});
        } else {
            this.ak = aVar;
        }
    }

    public final com.taobao.android.searchbaseframe.xsl.refact.a aG() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.searchbaseframe.xsl.refact.a) ipChange.ipc$dispatch("8a18a481", new Object[]{this}) : this.ak;
    }

    /* loaded from: classes6.dex */
    public static final class d<PARAMS, RESULT> implements ise<hte, htr> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final d INSTANCE = new d();

        @Override // tb.ise
        public final htr a(hte hteVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (htr) ipChange.ipc$dispatch("1afda621", new Object[]{this, hteVar}) : new htr();
        }
    }

    public final ise<hte, ? extends htr> k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ise) ipChange.ipc$dispatch("5bf691b9", new Object[]{this}) : this.k;
    }

    /* loaded from: classes6.dex */
    public static final class e<PARAMS, RESULT> implements ise<hte, com.taobao.android.meta.structure.list.a> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final e INSTANCE = new e();

        @Override // tb.ise
        public final com.taobao.android.meta.structure.list.f a(hte it) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (com.taobao.android.meta.structure.list.f) ipChange.ipc$dispatch("e968845e", new Object[]{this, it});
            }
            q.a((Object) it, "it");
            return new com.taobao.android.meta.structure.list.f(it);
        }
    }

    public final ise<hte, ? extends com.taobao.android.meta.structure.list.a> l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ise) ipChange.ipc$dispatch("63a83718", new Object[]{this}) : this.l;
    }

    /* loaded from: classes6.dex */
    public static final class f<PARAMS, RESULT> implements ise<hte, com.taobao.android.meta.structure.list.b> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final f INSTANCE = new f();

        @Override // tb.ise
        public final com.taobao.android.meta.structure.list.g a(hte it) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (com.taobao.android.meta.structure.list.g) ipChange.ipc$dispatch("e968847d", new Object[]{this, it});
            }
            q.a((Object) it, "it");
            return new com.taobao.android.meta.structure.list.g(it);
        }
    }

    public final void h(ise<hte, ? extends com.taobao.android.meta.structure.list.b> iseVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73da6e04", new Object[]{this, iseVar});
            return;
        }
        q.c(iseVar, "<set-?>");
        this.m = iseVar;
    }

    public final ise<hte, ? extends com.taobao.android.meta.structure.list.b> m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ise) ipChange.ipc$dispatch("6b59dc77", new Object[]{this}) : this.m;
    }

    /* loaded from: classes6.dex */
    public static final class h<PARAMS, RESULT> implements ise<Context, PartnerRecyclerView> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final h INSTANCE = new h();

        @Override // tb.ise
        public final PartnerRecyclerView a(Context context) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (PartnerRecyclerView) ipChange.ipc$dispatch("bb071198", new Object[]{this, context}) : new PartnerRecyclerView(context);
        }
    }

    public final ise<Context, ? extends PartnerRecyclerView> aB() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ise) ipChange.ipc$dispatch("80288c63", new Object[]{this}) : this.aj;
    }

    public final void j(ise<Context, ? extends PartnerRecyclerView> iseVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50e07b06", new Object[]{this, iseVar});
            return;
        }
        q.c(iseVar, "<set-?>");
        this.aj = iseVar;
    }

    /* loaded from: classes6.dex */
    public static final class g<PARAMS, RESULT> implements ise<irq, com.taobao.android.meta.structure.list.h> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public g() {
        }

        @Override // tb.ise
        public final com.taobao.android.meta.structure.list.h a(irq it) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (com.taobao.android.meta.structure.list.h) ipChange.ipc$dispatch("2b7cadab", new Object[]{this, it});
            }
            Activity activity = it.c;
            q.a((Object) activity, "it.activity");
            ium iumVar = it.d;
            q.a((Object) iumVar, "it.parent");
            hte hteVar = hte.this;
            q.a((Object) it, "it");
            return new com.taobao.android.meta.structure.list.h(activity, iumVar, hteVar.a(it), it.f, it.g);
        }
    }

    public final ise<irq, com.taobao.android.meta.structure.list.h> n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ise) ipChange.ipc$dispatch("730b81d6", new Object[]{this}) : this.n;
    }

    /* loaded from: classes6.dex */
    public static final class c<PARAMS, RESULT> implements ise<irq, com.taobao.android.meta.structure.childpage.g> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // tb.ise
        public final com.taobao.android.meta.structure.childpage.g a(irq it) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (com.taobao.android.meta.structure.childpage.g) ipChange.ipc$dispatch("64912631", new Object[]{this, it});
            }
            Activity activity = it.c;
            q.a((Object) activity, "it.activity");
            ium iumVar = it.d;
            q.a((Object) iumVar, "it.parent");
            hte hteVar = hte.this;
            q.a((Object) it, "it");
            return new com.taobao.android.meta.structure.childpage.g(activity, iumVar, hteVar.a(it), it.f, it.g);
        }
    }

    public final void i(ise<irq, ? extends com.taobao.android.meta.structure.childpage.g> iseVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("625d7485", new Object[]{this, iseVar});
            return;
        }
        q.c(iseVar, "<set-?>");
        this.o = iseVar;
    }

    public final ise<irq, ? extends com.taobao.android.meta.structure.childpage.g> o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ise) ipChange.ipc$dispatch("7abd2735", new Object[]{this}) : this.o;
    }

    /* loaded from: classes6.dex */
    public static final class a<PARAMS, RESULT> implements ise<hte, com.taobao.android.meta.structure.childpage.b> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final a INSTANCE = new a();

        @Override // tb.ise
        public final com.taobao.android.meta.structure.childpage.e a(hte it) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (com.taobao.android.meta.structure.childpage.e) ipChange.ipc$dispatch("69dafda2", new Object[]{this, it});
            }
            q.a((Object) it, "it");
            return new com.taobao.android.meta.structure.childpage.e(it);
        }
    }

    public final ise<hte, ? extends com.taobao.android.meta.structure.childpage.b> p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ise) ipChange.ipc$dispatch("826ecc94", new Object[]{this}) : this.p;
    }

    /* loaded from: classes6.dex */
    public static final class b<PARAMS, RESULT> implements ise<hte, com.taobao.android.meta.structure.childpage.c> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final b INSTANCE = new b();

        @Override // tb.ise
        public final com.taobao.android.meta.structure.childpage.f a(hte it) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (com.taobao.android.meta.structure.childpage.f) ipChange.ipc$dispatch("69dafdc1", new Object[]{this, it});
            }
            q.a((Object) it, "it");
            return new com.taobao.android.meta.structure.childpage.f(it);
        }
    }

    public final ise<hte, ? extends com.taobao.android.meta.structure.childpage.c> q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ise) ipChange.ipc$dispatch("8a2071f3", new Object[]{this}) : this.q;
    }

    public final iru<com.taobao.android.meta.data.b<com.taobao.android.meta.data.a, MetaResult<com.taobao.android.meta.data.a>>> a(irq pack) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (iru) ipChange.ipc$dispatch("f4d6302a", new Object[]{this, pack});
        }
        q.c(pack, "pack");
        iru iruVar = pack.e;
        if (iruVar == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.taobao.android.searchbaseframe.business.srp.widget.WidgetModelAdapter<com.taobao.android.meta.data.MetaDataSource<com.taobao.android.meta.data.MetaCombo, com.taobao.android.meta.data.MetaResult<com.taobao.android.meta.data.MetaCombo>>>");
        }
        return iruVar;
    }

    public final com.taobao.android.meta.data.d<Integer> r() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.meta.data.d) ipChange.ipc$dispatch("993a5b56", new Object[]{this}) : this.r;
    }

    public final void k(ise<Void, inx.b> iseVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f638187", new Object[]{this, iseVar});
        } else {
            this.s = iseVar;
        }
    }

    public final ise<Void, inx.b> s() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ise) ipChange.ipc$dispatch("9983bcb1", new Object[]{this}) : this.s;
    }

    public final void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        } else {
            this.t = i;
        }
    }

    public final int t() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6782aee", new Object[]{this})).intValue() : this.t;
    }

    public final com.taobao.android.meta.data.d<Integer> u() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.meta.data.d) ipChange.ipc$dispatch("f5f80473", new Object[]{this}) : this.u;
    }

    public final void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
        } else {
            this.v = i;
        }
    }

    public final int v() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("69459f0", new Object[]{this})).intValue() : this.v;
    }

    public final Drawable w() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Drawable) ipChange.ipc$dispatch("9b0bd77c", new Object[]{this}) : this.w;
    }

    public final void a(htc htcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec9d96a1", new Object[]{this, htcVar});
        } else {
            this.x = htcVar;
        }
    }

    public final htc x() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (htc) ipChange.ipc$dispatch("bffb86b0", new Object[]{this}) : this.x;
    }

    public final com.taobao.android.meta.data.d<com.taobao.android.searchbaseframe.meta.uikit.d> y() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.meta.data.d) ipChange.ipc$dispatch("c6f4e5ef", new Object[]{this}) : this.y;
    }

    public final void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
        } else {
            this.z = z;
        }
    }

    public final boolean z() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6ccb805", new Object[]{this})).booleanValue() : this.z;
    }

    public final boolean A() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3a97c4c", new Object[]{this})).booleanValue() : this.A;
    }

    public final void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad405d49", new Object[]{this, new Boolean(z)});
        } else {
            this.A = z;
        }
    }

    public final int B() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3b793bc", new Object[]{this})).intValue() : this.B;
    }

    public final void d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad401d78", new Object[]{this, new Integer(i)});
        } else {
            this.B = i;
        }
    }

    public final boolean C() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3c5ab4e", new Object[]{this})).booleanValue() : this.C;
    }

    public final void e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef535e8", new Object[]{this, new Boolean(z)});
        } else {
            this.C = z;
        }
    }

    public final com.taobao.android.searchbaseframe.business.srp.a D() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.searchbaseframe.business.srp.a) ipChange.ipc$dispatch("889e2dda", new Object[]{this}) : this.D;
    }

    public final void a(com.taobao.android.searchbaseframe.business.srp.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa28c3b7", new Object[]{this, aVar});
        } else {
            this.D = aVar;
        }
    }

    public final com.taobao.android.meta.data.d<Integer> E() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.meta.data.d) ipChange.ipc$dispatch("2a1d72a3", new Object[]{this}) : this.E;
    }

    public final boolean F() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3eff1d1", new Object[]{this})).booleanValue() : this.F;
    }

    public final void f(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0aa0e87", new Object[]{this, new Boolean(z)});
        } else {
            this.F = z;
        }
    }

    public final boolean G() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3fe0952", new Object[]{this})).booleanValue() : this.G;
    }

    public final void g(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b25ee726", new Object[]{this, new Boolean(z)});
        } else {
            this.G = z;
        }
    }

    public final com.taobao.android.meta.data.d<Boolean> H() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.meta.data.d) ipChange.ipc$dispatch("86db1bc0", new Object[]{this}) : this.H;
    }

    public final boolean I() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("41a3854", new Object[]{this})).booleanValue() : this.I;
    }

    public final void h(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b413bfc5", new Object[]{this, new Boolean(z)});
        } else {
            this.I = z;
        }
    }

    public final com.taobao.android.meta.data.d<Boolean> J() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.meta.data.d) ipChange.ipc$dispatch("6f598c7e", new Object[]{this}) : this.J;
    }

    public final com.taobao.android.meta.data.d<Integer> K() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.meta.data.d) ipChange.ipc$dispatch("e398c4dd", new Object[]{this}) : this.K;
    }

    public final com.taobao.android.meta.data.d<Integer> L() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.meta.data.d) ipChange.ipc$dispatch("57d7fd3c", new Object[]{this}) : this.L;
    }

    public final com.taobao.android.meta.data.d<Integer> M() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.meta.data.d) ipChange.ipc$dispatch("cc17359b", new Object[]{this}) : this.M;
    }

    public final com.taobao.android.meta.data.d<Integer> N() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.meta.data.d) ipChange.ipc$dispatch("40566dfa", new Object[]{this}) : this.N;
    }

    public final com.taobao.android.meta.data.d<Integer> O() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.meta.data.d) ipChange.ipc$dispatch("b495a659", new Object[]{this}) : this.O;
    }

    public final com.taobao.android.meta.data.d<Integer> P() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.meta.data.d) ipChange.ipc$dispatch("28d4deb8", new Object[]{this}) : this.P;
    }

    public final com.taobao.android.meta.data.d<Integer> Q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.meta.data.d) ipChange.ipc$dispatch("9d141717", new Object[]{this}) : this.Q;
    }

    public final com.taobao.android.meta.data.d<Integer> R() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.meta.data.d) ipChange.ipc$dispatch("11534f76", new Object[]{this}) : this.R;
    }

    public final com.taobao.android.meta.data.d<Integer> S() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.meta.data.d) ipChange.ipc$dispatch("859287d5", new Object[]{this}) : this.S;
    }

    public final com.taobao.android.meta.data.d<Boolean> T() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.meta.data.d) ipChange.ipc$dispatch("f9d1c034", new Object[]{this}) : this.T;
    }

    public final com.taobao.android.meta.data.d<com.taobao.android.searchbaseframe.meta.uikit.c> U() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.meta.data.d) ipChange.ipc$dispatch("6e10f893", new Object[]{this}) : this.U;
    }

    public final boolean V() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4d169e1", new Object[]{this})).booleanValue() : this.V;
    }

    public final void i(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5c89864", new Object[]{this, new Boolean(z)});
        } else {
            this.V = z;
        }
    }

    public final boolean W() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4df8162", new Object[]{this})).booleanValue() : this.W;
    }

    public final void j(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b77d7103", new Object[]{this, new Boolean(z)});
        } else {
            this.W = z;
        }
    }

    public final htd X() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (htd) ipChange.ipc$dispatch("c9c6daef", new Object[]{this}) : this.X;
    }

    public final void a(htd htdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec9e0b00", new Object[]{this, htdVar});
        } else {
            this.X = htdVar;
        }
    }

    public final boolean Y() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4fbb064", new Object[]{this})).booleanValue() : this.Y;
    }

    public final void t(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c88de739", new Object[]{this, new Boolean(z)});
        } else {
            this.Y = z;
        }
    }

    public final boolean Z() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("509c7e5", new Object[]{this})).booleanValue() : this.Z;
    }

    public final void k(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b93249a2", new Object[]{this, new Boolean(z)});
        } else {
            this.Z = z;
        }
    }

    public final boolean aa() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("aaf280ab", new Object[]{this})).booleanValue() : this.aa;
    }

    public final void l(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bae72241", new Object[]{this, new Boolean(z)});
        } else {
            this.aa = z;
        }
    }

    public final com.taobao.android.meta.data.d<Boolean> ab() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.meta.data.d) ipChange.ipc$dispatch("c7ddf947", new Object[]{this}) : this.ab;
    }

    public final com.taobao.android.meta.data.d<Integer> ac() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.meta.data.d) ipChange.ipc$dispatch("3c1d31a6", new Object[]{this}) : this.ac;
    }

    public final boolean at() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("abfe3f3e", new Object[]{this})).booleanValue() : this.af;
    }

    public final void r(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c52435fb", new Object[]{this, new Boolean(z)});
        } else {
            this.af = z;
        }
    }

    public final void a(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cdec50f", new Object[]{this, num});
        } else {
            this.ah = num;
        }
    }

    public final Integer aw() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Integer) ipChange.ipc$dispatch("e2bd0fa4", new Object[]{this}) : this.ah;
    }
}
