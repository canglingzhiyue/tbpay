package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.t;
import com.taobao.taolive.sdk.adapter.network.b;
import com.taobao.taolive.sdk.adapter.network.c;
import com.taobao.taolive.sdk.thread.a;
import com.taobao.taolive.sdk.ui.media.IMediaPlayer;
import com.taobao.taolive.sdk.utils.e;
import com.taobao.taolive.sdk.utils.f;

/* loaded from: classes8.dex */
public final class pmd {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static pmd v;
    private a A;
    private pmu B;
    private pmr C;
    private pmm D;
    private ppv E;
    private sgq F;
    private ibs G;
    private teg H;
    private t I;
    private trh J;

    /* renamed from: a  reason: collision with root package name */
    private c f32758a;
    private pmi d;
    private pns e;
    private pns f;
    private pnp g;
    private pmh h;
    private pni i;
    private pnj j;
    private poj k;
    private b l;
    private pny m;
    private pnk n;
    private pnw o;
    private poe p;
    private poa q;
    private IMediaPlayer r;
    private pmf s;
    private pne t;
    private com.taobao.taolive.sdk.ui.media.b w;
    private e x;
    private f y;
    private pnl z;
    private pol b = null;
    private pok c = null;
    private pnd u = new pnc();

    static {
        kge.a(-691458344);
    }

    public static pmd a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pmd) ipChange.ipc$dispatch("f0933f7", new Object[0]);
        }
        synchronized (pmd.class) {
            if (v == null) {
                synchronized (pmd.class) {
                    v = new pmd();
                }
            }
        }
        return v;
    }

    private pmd() {
    }

    public void a(com.taobao.taolive.sdk.ui.media.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfb6cdf4", new Object[]{this, bVar});
        } else {
            this.w = bVar;
        }
    }

    public com.taobao.taolive.sdk.ui.media.b b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.taolive.sdk.ui.media.b) ipChange.ipc$dispatch("35887cf5", new Object[]{this}) : this.w;
    }

    public void a(pnd pndVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9f042f2", new Object[]{this, pndVar});
        } else {
            this.u = pndVar;
        }
    }

    public pnd c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (pnd) ipChange.ipc$dispatch("1e6c8276", new Object[]{this}) : this.u;
    }

    public void a(IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("105dadde", new Object[]{this, iMediaPlayer});
        } else {
            this.r = iMediaPlayer;
        }
    }

    public void a(pmi pmiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9e4714c", new Object[]{this, pmiVar});
        } else {
            this.d = pmiVar;
        }
    }

    public pmi d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (pmi) ipChange.ipc$dispatch("261e24af", new Object[]{this}) : this.d;
    }

    public void a(pol polVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa01fd6b", new Object[]{this, polVar});
        } else {
            this.b = polVar;
        }
    }

    public pol e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (pol) ipChange.ipc$dispatch("2dcfd1ed", new Object[]{this}) : this.b;
    }

    public void a(pok pokVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa01890c", new Object[]{this, pokVar});
        } else {
            this.c = pokVar;
        }
    }

    public pok f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (pok) ipChange.ipc$dispatch("3581772d", new Object[]{this}) : this.c;
    }

    public c g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("fc627c1e", new Object[]{this}) : this.f32758a;
    }

    public void a(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52aeff5e", new Object[]{this, cVar});
        } else {
            this.f32758a = cVar;
        }
    }

    public pns h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pns) ipChange.ipc$dispatch("44e4bf22", new Object[]{this});
        }
        if (this.e == null) {
            this.e = this.g.b();
        }
        return this.e;
    }

    public pns i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (pns) ipChange.ipc$dispatch("4c966481", new Object[]{this}) : this.g.b();
    }

    public void a(pnp pnpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9f5b766", new Object[]{this, pnpVar});
        } else {
            this.g = pnpVar;
        }
    }

    public void a(pns pnsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9f71483", new Object[]{this, pnsVar});
        } else {
            this.f = pnsVar;
        }
    }

    public pns j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (pns) ipChange.ipc$dispatch("544809e0", new Object[]{this}) : this.f;
    }

    public pmh k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (pmh) ipChange.ipc$dispatch("5bf9aa29", new Object[]{this}) : this.h;
    }

    public void a(pmh pmhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9e3fced", new Object[]{this, pmhVar});
        } else {
            this.h = pmhVar;
        }
    }

    public pni l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (pni) ipChange.ipc$dispatch("63ab5368", new Object[]{this}) : this.i;
    }

    public void a(pni pniVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9f288cd", new Object[]{this, pniVar});
        } else {
            this.i = pniVar;
        }
    }

    public pnj m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (pnj) ipChange.ipc$dispatch("6b5cf8e6", new Object[]{this}) : this.j;
    }

    public void a(pnj pnjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9f2fd2c", new Object[]{this, pnjVar});
        } else {
            this.j = pnjVar;
        }
    }

    public poj n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (poj) ipChange.ipc$dispatch("730ea206", new Object[]{this}) : this.k;
    }

    public void a(poj pojVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa0114ad", new Object[]{this, pojVar});
        } else {
            this.k = pojVar;
        }
    }

    public b o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("c81ee8f7", new Object[]{this}) : this.l;
    }

    public void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52ae8aff", new Object[]{this, bVar});
        } else {
            this.l = bVar;
        }
    }

    public pny p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (pny) ipChange.ipc$dispatch("8271ead4", new Object[]{this}) : this.m;
    }

    public void a(pny pnyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9f9cebd", new Object[]{this, pnyVar});
        } else {
            this.m = pnyVar;
        }
    }

    public pnk q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (pnk) ipChange.ipc$dispatch("8a238e81", new Object[]{this}) : this.n;
    }

    public void a(pnk pnkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9f3718b", new Object[]{this, pnkVar});
        } else {
            this.n = pnkVar;
        }
    }

    public pnw r() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (pnw) ipChange.ipc$dispatch("91d53554", new Object[]{this}) : this.o;
    }

    public void a(pnw pnwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9f8e5ff", new Object[]{this, pnwVar});
        } else {
            this.o = pnwVar;
        }
    }

    public poe s() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (poe) ipChange.ipc$dispatch("9986dc46", new Object[]{this}) : this.p;
    }

    public void a(poe poeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9feced2", new Object[]{this, poeVar});
        } else {
            this.p = poeVar;
        }
    }

    public pmf t() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (pmf) ipChange.ipc$dispatch("a1387a42", new Object[]{this}) : this.s;
    }

    public void a(pmf pmfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9e3142f", new Object[]{this, pmfVar});
        } else {
            this.s = pmfVar;
        }
    }

    public pne u() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (pne) ipChange.ipc$dispatch("a8ea2343", new Object[]{this}) : this.t;
    }

    public void a(pne pneVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9f0b751", new Object[]{this, pneVar});
        } else {
            this.t = pneVar;
        }
    }

    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        if (!StringUtils.isEmpty(str) && a().c() != null && a().c().a() != null && a().c().a().containsKey(str)) {
            return a().c().a().get(str).booleanValue();
        }
        return true;
    }

    public void a(ppv ppvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa14a0a2", new Object[]{this, ppvVar});
        } else {
            this.E = ppvVar;
        }
    }

    public ppv v() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ppv) ipChange.ipc$dispatch("b09bd233", new Object[]{this}) : this.E;
    }

    public e w() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("25399c69", new Object[]{this}) : this.x;
    }

    public void a(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcef12b9", new Object[]{this, eVar});
        } else {
            this.x = eVar;
        }
    }

    public f x() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("9978d4e7", new Object[]{this}) : this.y;
    }

    public void a(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcef8718", new Object[]{this, fVar});
        } else {
            this.y = fVar;
        }
    }

    public pnl y() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (pnl) ipChange.ipc$dispatch("c7b0b998", new Object[]{this}) : this.z;
    }

    public void a(pnl pnlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9f3e5ea", new Object[]{this, pnlVar});
        } else {
            this.z = pnlVar;
        }
    }

    public poa z() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (poa) ipChange.ipc$dispatch("cf626163", new Object[]{this}) : this.q;
    }

    public void a(poa poaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9fcfd56", new Object[]{this, poaVar});
        } else {
            this.q = poaVar;
        }
    }

    public a A() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("b9009db4", new Object[]{this}) : this.A;
    }

    public pmu B() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (pmu) ipChange.ipc$dispatch("20862f85", new Object[]{this}) : this.B;
    }

    public void a(pmu pmuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9e9e5c0", new Object[]{this, pmuVar});
        } else {
            this.B = pmuVar;
        }
    }

    public pmr C() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (pmr) ipChange.ipc$dispatch("2837d487", new Object[]{this}) : this.C;
    }

    public void a(pmr pmrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9e888a3", new Object[]{this, pmrVar});
        } else {
            this.C = pmrVar;
        }
    }

    public pmm D() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (pmm) ipChange.ipc$dispatch("2fe9794b", new Object[]{this}) : this.D;
    }

    public void a(pmm pmmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9e642c8", new Object[]{this, pmmVar});
        } else {
            this.D = pmmVar;
        }
    }

    public sgq E() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (sgq) ipChange.ipc$dispatch("379c65bd", new Object[]{this}) : this.F;
    }

    public void a(sgq sgqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("feb2111b", new Object[]{this, sgqVar});
        } else {
            this.F = sgqVar;
        }
    }

    public void a(ibs ibsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed5c0e1e", new Object[]{this, ibsVar});
        } else {
            this.G = ibsVar;
        }
    }

    public ibs F() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ibs) ipChange.ipc$dispatch("3f496cdf", new Object[]{this}) : this.G;
    }

    public teg G() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (teg) ipChange.ipc$dispatch("47001c22", new Object[]{this}) : this.H;
    }

    public void a(teg tegVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("462f02", new Object[]{this, tegVar});
        } else {
            this.H = tegVar;
        }
    }

    public t H() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (t) ipChange.ipc$dispatch("c0a81238", new Object[]{this}) : this.I;
    }

    public void a(t tVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7851891", new Object[]{this, tVar});
        } else {
            this.I = tVar;
        }
    }

    public void a(trh trhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdd4ee", new Object[]{this, trhVar});
        } else {
            this.J = trhVar;
        }
    }

    public trh I() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (trh) ipChange.ipc$dispatch("566397cc", new Object[]{this}) : this.J;
    }
}
