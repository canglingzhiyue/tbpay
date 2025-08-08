package com.taobao.android.icart.engine;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerViewAccessibilityDelegate;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.taobao.windvane.jsbridge.q;
import mtopsdk.common.util.StringUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import com.alibaba.ability.localization.b;
import com.alibaba.ability.localization.constants.Language;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.android.icart.core.QueryParamsManager;
import com.alibaba.android.icart.core.data.config.RequestConfig;
import com.alibaba.android.icart.core.data.e;
import com.alibaba.android.icart.core.performance.cache.CartFirstPageCache;
import com.alibaba.android.nextrpc.request.AttachedResponse;
import com.alibaba.android.nextrpc.stream.internal.response.StreamRemoteMainResponse;
import com.alibaba.android.ultron.trade.data.request.DataInfo;
import com.alibaba.android.ultron.trade.data.request.PageInfo;
import com.alibaba.android.ultron.trade.presenter.a;
import com.alibaba.android.ultron.vfw.viewholder.BundleLineComponent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.OnScreenChangedListener;
import com.taobao.android.autosize.i;
import com.taobao.android.detail.industry.tool.DIConstants;
import com.taobao.android.icart.broadcast.CartWVBroadcast;
import com.taobao.android.icart.broadcast.MainAddCartEventHandler;
import com.taobao.android.icart.manager.CartPopupWindowManager;
import com.taobao.android.icart.recommend.CartRecommendRefreshScene;
import com.taobao.android.icart.theme.CartThemeManager;
import com.taobao.android.icart.utils.ICartWVService;
import com.taobao.android.icart.utils.d;
import com.taobao.android.icart.widget.CartRecyclerView;
import com.taobao.android.icart.widget.i;
import com.taobao.android.icart.widget.refresh.c;
import com.taobao.android.icart.widget.touch.DragFloatLayer;
import com.taobao.android.icart.widget.touch.DragParentFrameLayout;
import com.taobao.android.icart.widget.touch.TipsLineFollower;
import com.taobao.android.opencart.broadcast.CartRefreshCheckBroadcast;
import com.taobao.android.opencart.broadcast.TBCartWVService;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.login4android.broadcast.LoginAction;
import com.taobao.monitor.procedure.s;
import com.taobao.ptr.PtrBase;
import com.taobao.ptr.PullBase;
import com.taobao.tao.Globals;
import com.taobao.tao.TBMainHost;
import com.taobao.tao.navigation.h;
import com.taobao.taobao.R;
import com.ut.mini.UTAnalytics;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import mtopsdk.mtop.domain.MtopResponse;
import tb.aaf;
import tb.aat;
import tb.abi;
import tb.adz;
import tb.akg;
import tb.alo;
import tb.alq;
import tb.alr;
import tb.alu;
import tb.bbx;
import tb.bby;
import tb.bbz;
import tb.bcb;
import tb.bed;
import tb.bej;
import tb.bem;
import tb.ben;
import tb.bex;
import tb.bey;
import tb.bez;
import tb.bfa;
import tb.bff;
import tb.bmz;
import tb.bnv;
import tb.bny;
import tb.dcn;
import tb.eds;
import tb.gbg;
import tb.gnw;
import tb.gnx;
import tb.gob;
import tb.gog;
import tb.goh;
import tb.ieu;
import tb.ifm;
import tb.jcz;
import tb.jdc;
import tb.jnq;
import tb.jnv;
import tb.jny;
import tb.jpo;
import tb.jpq;
import tb.jqd;
import tb.jqg;
import tb.jqh;
import tb.jqi;
import tb.kge;
import tb.mvu;
import tb.ris;
import tb.spk;
import tb.tbo;

/* loaded from: classes5.dex */
public class a implements b.a, aat, adz {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Activity A;
    private Fragment B;
    private View C;
    private final boolean D;
    private final long E;
    private String F;
    private boolean G;
    private DragFloatLayer<String> H;
    private h I;
    private volatile aat.a J;
    private volatile boolean K;
    private final jpo L;
    private volatile boolean M;
    private final AtomicBoolean N;
    private boolean O;
    private ris P;
    private gob Q;
    private boolean R;
    private final AtomicBoolean S;
    private com.taobao.android.icart.manager.a T;

    /* renamed from: a  reason: collision with root package name */
    private PtrBase f12778a;
    private CartRecyclerView b;
    private View c;
    private bbz d;
    private bcb e;
    private RecyclerView f;
    private com.taobao.android.icart.recommend.b g;
    private com.taobao.android.icart.shake.b h;
    private e i;
    private LinearLayout j;
    private c k;
    private CartThemeManager l;
    private CartWVBroadcast m;
    private long n;
    private long o;
    private int p;
    private jnv q;
    private MainAddCartEventHandler r;
    private boolean t;
    private com.taobao.android.icart.broadcast.a u;
    private long v;
    private boolean w;
    private DragParentFrameLayout x;
    private Bundle y;
    private OnScreenChangedListener z;

    public static /* synthetic */ long A(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("1b761360", new Object[]{aVar})).longValue() : aVar.E;
    }

    public static /* synthetic */ boolean C(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c9b1f52e", new Object[]{aVar})).booleanValue() : aVar.K;
    }

    public static /* synthetic */ long a(a aVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e75230ec", new Object[]{aVar, new Long(j)})).longValue();
        }
        aVar.o = j;
        return j;
    }

    public static /* synthetic */ RecyclerView a(a aVar, RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("57d38f0a", new Object[]{aVar, recyclerView});
        }
        aVar.f = recyclerView;
        return recyclerView;
    }

    public static /* synthetic */ DragFloatLayer a(a aVar, DragFloatLayer dragFloatLayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DragFloatLayer) ipChange.ipc$dispatch("daacff8a", new Object[]{aVar, dragFloatLayer});
        }
        aVar.H = dragFloatLayer;
        return dragFloatLayer;
    }

    public static /* synthetic */ bcb a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bcb) ipChange.ipc$dispatch("ffe8a599", new Object[]{aVar}) : aVar.e;
    }

    public static /* synthetic */ boolean a(a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7526d0c", new Object[]{aVar, new Boolean(z)})).booleanValue();
        }
        aVar.K = z;
        return z;
    }

    public static /* synthetic */ long b(a aVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("73f25bed", new Object[]{aVar, new Long(j)})).longValue();
        }
        aVar.n = j;
        return j;
    }

    public static /* synthetic */ aat.a b(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (aat.a) ipChange.ipc$dispatch("a6161a0a", new Object[]{aVar}) : aVar.J;
    }

    public static /* synthetic */ void b(a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73f29809", new Object[]{aVar, new Boolean(z)});
        } else {
            aVar.a(z);
        }
    }

    public static /* synthetic */ bbz c(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bbz) ipChange.ipc$dispatch("eadcf142", new Object[]{aVar}) : aVar.d;
    }

    public static /* synthetic */ boolean c(a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("92c30e", new Object[]{aVar, new Boolean(z)})).booleanValue();
        }
        aVar.O = z;
        return z;
    }

    public static /* synthetic */ void d(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48e01e9", new Object[]{aVar});
        } else {
            aVar.n();
        }
    }

    public static /* synthetic */ boolean d(a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8d32ee0f", new Object[]{aVar, new Boolean(z)})).booleanValue();
        }
        aVar.t = z;
        return z;
    }

    public static /* synthetic */ PtrBase e(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PtrBase) ipChange.ipc$dispatch("f0294892", new Object[]{aVar}) : aVar.f12778a;
    }

    public static /* synthetic */ CartRecyclerView f(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CartRecyclerView) ipChange.ipc$dispatch("988538a8", new Object[]{aVar}) : aVar.b;
    }

    public static /* synthetic */ void g(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e7d486", new Object[]{aVar});
        } else {
            aVar.P();
        }
    }

    public static /* synthetic */ boolean h(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6105c569", new Object[]{aVar})).booleanValue() : aVar.D();
    }

    public static /* synthetic */ com.taobao.android.icart.recommend.b i(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.icart.recommend.b) ipChange.ipc$dispatch("9110c9ab", new Object[]{aVar}) : aVar.g;
    }

    public static /* synthetic */ void j(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f41a723", new Object[]{aVar});
        } else {
            aVar.C();
        }
    }

    public static /* synthetic */ RecyclerView k(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RecyclerView) ipChange.ipc$dispatch("a94f0282", new Object[]{aVar}) : aVar.f;
    }

    public static /* synthetic */ com.taobao.android.icart.shake.b l(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.icart.shake.b) ipChange.ipc$dispatch("5196aba4", new Object[]{aVar}) : aVar.h;
    }

    public static /* synthetic */ e m(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("160e288", new Object[]{aVar}) : aVar.i;
    }

    public static /* synthetic */ void n(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bb96a9f", new Object[]{aVar});
        } else {
            aVar.w();
        }
    }

    public static /* synthetic */ void o(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2d75b7e", new Object[]{aVar});
        } else {
            aVar.o();
        }
    }

    public static /* synthetic */ Activity p(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Activity) ipChange.ipc$dispatch("ed66da6b", new Object[]{aVar}) : aVar.A;
    }

    public static /* synthetic */ View q(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("e80b7e7e", new Object[]{aVar}) : aVar.c;
    }

    public static /* synthetic */ boolean r(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c8312e1f", new Object[]{aVar})).booleanValue() : aVar.t;
    }

    public static /* synthetic */ DragFloatLayer s(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DragFloatLayer) ipChange.ipc$dispatch("99e80ea0", new Object[]{aVar}) : aVar.H;
    }

    public static /* synthetic */ View t(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("8ed2c3db", new Object[]{aVar}) : aVar.C;
    }

    public static /* synthetic */ int u(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cd8b00ab", new Object[]{aVar})).intValue();
        }
        int i = aVar.p;
        aVar.p = i + 1;
        return i;
    }

    public static /* synthetic */ int v(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("24a8f18a", new Object[]{aVar})).intValue() : aVar.p;
    }

    public static /* synthetic */ long w(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7bc6e26a", new Object[]{aVar})).longValue() : aVar.o;
    }

    public static /* synthetic */ boolean x(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d2e4d359", new Object[]{aVar})).booleanValue() : aVar.D;
    }

    public static /* synthetic */ long y(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2a02c428", new Object[]{aVar})).longValue() : aVar.n;
    }

    public static /* synthetic */ long z(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8120b507", new Object[]{aVar})).longValue() : aVar.v;
    }

    static {
        kge.a(329659716);
        kge.a(1200388184);
        kge.a(-1101902290);
        kge.a(-37303655);
        d.a();
    }

    public a(Activity activity, String str, boolean z, aat.a aVar) {
        this.w = false;
        this.N = new AtomicBoolean();
        this.S = new AtomicBoolean(false);
        this.R = false;
        this.O = false;
        this.I = new h() { // from class: com.taobao.android.icart.engine.a.14
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.navigation.h
            public void onCurrentTabDoubleTap() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("c22ad2be", new Object[]{this});
                }
            }

            @Override // com.taobao.tao.navigation.h
            public void onCurrentTabLongClicked() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("79eae8f7", new Object[]{this});
                }
            }

            @Override // com.taobao.tao.navigation.h
            public void onNavigationTabMessageChanged(String str2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3fd5f3e0", new Object[]{this, str2});
                }
            }

            @Override // com.taobao.tao.navigation.h
            public void onCurrentTabClicked() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("f77f6793", new Object[]{this});
                } else if (a.c(a.this).x().f()) {
                    bby d = a.c(a.this).x().d();
                    if (d == null) {
                        return;
                    }
                    d.e();
                } else {
                    a.this.m();
                }
            }
        };
        if (str != null) {
            a(str);
        }
        this.L = jpo.b(activity);
        this.E = System.currentTimeMillis();
        this.A = activity;
        this.D = z;
        this.J = aVar;
        a(activity);
        ICartWVService.register(this);
    }

    public a(Activity activity, String str) {
        this(activity, str, false, null);
    }

    @Override // tb.aat
    public Activity i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Activity) ipChange.ipc$dispatch("302d5838", new Object[]{this}) : this.A;
    }

    @Override // tb.aat
    public void a(Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f0514a", new Object[]{this, fragment});
            return;
        }
        this.d.a(fragment);
        this.B = fragment;
        try {
            s.f18233a.b(fragment).a("dx_scroll_hitchrate_icard_key", "656090");
        } catch (Exception e) {
            bed.a("reportForDXHitchPerformance", e.getMessage());
        }
    }

    private void a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68a25ba", new Object[]{this, activity});
            return;
        }
        this.A = activity;
        com.alibaba.android.nextrpc.internal.utils.a.a(i());
        this.L.a("createVEngine", System.currentTimeMillis(), (String) null, true);
        r();
        this.L.a("createVEngine", false, (Map<String, String>) null);
    }

    private void r() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65bfbf9", new Object[]{this});
            return;
        }
        q();
        if (this.D && this.d.j() && this.e.g()) {
            z = true;
        }
        b(z);
        F();
        G();
        x();
        p();
        ViewGroup viewGroup = (ViewGroup) this.C.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(this.C);
        }
        a(10001);
        if (!z) {
            return;
        }
        gnw.b();
    }

    private void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            return;
        }
        jqg.b("CartVEngine", "loadDataBeforeInitView#isPrefetchAndHasCache=" + z);
        if (z) {
            jqg.b("CartVEngine", "loadDataBeforeInitView#prefetch");
            gnw.a(new gnw.a() { // from class: com.taobao.android.icart.engine.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.gnw.a
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        return;
                    }
                    if (a.a(a.this).w() != null) {
                        a.a(a.this, true);
                    }
                    if (a.b(a.this) != null) {
                        a.b(a.this).a(a.this);
                        bnv F = a.a(a.this).o().F();
                        if (F == null) {
                            return;
                        }
                        bny p = a.c(a.this).x().p();
                        p.d().h(F.d());
                        p.g();
                        List<IDMComponent> b = a.a(a.this).w() != null ? a.a(a.this).w().b() : null;
                        aaf.b(a.c(a.this), b);
                        aaf.a(a.c(a.this), b);
                        return;
                    }
                    bed.a("prefetchLoadCallbackError", "onSuccess mPrefetchResult=null");
                }

                @Override // tb.gnw.a
                public void b() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("57a83e9", new Object[]{this});
                        return;
                    }
                    a.a(a.this, false);
                    if (a.b(a.this) != null) {
                        a.b(a.this).b(a.this);
                    } else {
                        bed.a("prefetchLoadCallbackError", "onError mPrefetchResult=null");
                    }
                }
            });
            gnw.a(this);
        } else if (this.d.j() && this.d.n().g()) {
            jqg.b("CartVEngine", "loadDataBeforeInitView#loadCacheData");
            O();
        } else if (this.D) {
        } else {
            jqg.b("CartVEngine", "loadDataBeforeInitView#sendFirstPageRequest");
            a(false);
        }
    }

    @Override // tb.aat
    public void a(LoginAction loginAction) {
        bbz bbzVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf872664", new Object[]{this, loginAction});
        } else if (loginAction == null || !loginAction.equals(LoginAction.NOTIFY_LOGIN_SUCCESS) || (bbzVar = this.d) == null || this.C == null) {
        } else {
            bbzVar.z();
        }
    }

    @Override // tb.aat
    public void a(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b668f6c", new Object[]{this, bundle});
            return;
        }
        this.v = System.currentTimeMillis();
        this.M = false;
        N();
        this.y = bundle;
        if (this.d.v().i()) {
            bed.a(0.001f);
        }
        b.a(this);
    }

    private void N() {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("460add5", new Object[]{this});
            return;
        }
        jqg.b("CartVEngine", "loadFirstPageOnCreate#isLoadCacheAndHandledBiz=" + this.K);
        if (this.K) {
            Q();
            return;
        }
        if (this.S.get() || !this.d.j() || !this.d.n().g() || !jqi.a("iCart", ieu.sLoadCacheWhenLoadFirstPageOnCreate, false, true)) {
            z = false;
        }
        jqg.b("CartVEngine", "loadFirstPageOnCreate#loadCacheData=" + z);
        if (z) {
            O();
        }
        if (z) {
            Q();
        } else {
            a(false);
        }
    }

    private void O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46ec556", new Object[]{this});
        } else if (this.S.getAndSet(true)) {
        } else {
            jqg.b("CartVEngine", "loadFirstPageFromCacheData");
            mvu.a();
            this.d.a((jnv) null, false);
        }
    }

    private void Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48af458", new Object[]{this});
        } else {
            jqh.a(new Runnable() { // from class: com.taobao.android.icart.engine.a.22
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    jqg.b("CartVEngine", "delaySendFirstPageRequest");
                    a.b(a.this, false);
                }
            }, jqi.a("iCart", "delaySendFirstPageRequestMills", 200));
        }
    }

    @Override // tb.aat
    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("ddc46abd", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        v();
        return this.C;
    }

    private void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69459fd", new Object[]{this});
        } else if (this.G) {
        } else {
            J();
            if (M()) {
                this.d.l().a(1);
            }
            bnv i = this.e.i();
            if (this.K && i != null && this.d.H() != null) {
                QueryParamsManager v = this.d.v();
                bfa bfaVar = new bfa(v != null && v.i());
                bfaVar.a("mtop.trade.query.bag");
                abi.a(i(), System.currentTimeMillis());
                jny w = this.e.w();
                if (w instanceof com.taobao.android.ultron.datamodel.imp.b) {
                    jpq.a(i(), null, ((com.taobao.android.ultron.datamodel.imp.b) w).M(), 0L, 0L);
                }
                this.L.a("apmClientBeforeNetworkLogicProcess", false, (Map<String, String>) null);
                this.L.a("apmClientAfterNetworkLogicProcess", (String) null);
                gnx.b(true);
                this.d.x().a(i, 127, bfaVar);
            }
            this.G = true;
        }
    }

    @Override // tb.aat
    public void a(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8033c25", new Object[]{this, intent});
            return;
        }
        jqg.b("CartVEngine", "onNewIntent");
        b(intent);
    }

    private void b(Intent intent) {
        String a2;
        bbz bbzVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15320a6", new Object[]{this, intent});
        } else if (intent == null || TBMainHost.a().getContext() != i() || (a2 = a(intent.getData())) == null || (bbzVar = this.d) == null) {
        } else {
            bbzVar.x().a(true);
            this.d.n().c("");
            this.d.v().a(a2);
            HashMap hashMap = new HashMap();
            hashMap.put(RequestConfig.IS_ICART_IS_FIRST_REQUEST, "true");
            this.d.a(true, (Map<String, String>) hashMap, (jnv) null);
        }
    }

    private String a(Uri uri) {
        String queryParameter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d56608a1", new Object[]{this, uri});
        }
        if (uri != null && (queryParameter = uri.getQueryParameter("holdCustomExParams")) != null) {
            return queryParameter;
        }
        return null;
    }

    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63fccf7", new Object[]{this});
            return;
        }
        q.a(ICartWVService.JS_BRIDGE_NAME, (Class<? extends android.taobao.windvane.jsbridge.e>) ICartWVService.class, true);
        TBCartWVService.registerPlugin();
    }

    @Override // tb.aat
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.M) {
        } else {
            this.M = true;
            mvu.d();
            a(10006);
            u();
            bbz bbzVar = this.d;
            if (bbzVar != null) {
                bbzVar.d();
                if (this.d.x() != null && this.d.x().h()) {
                    this.d.l().b(1);
                    this.d.x().a(true);
                }
            }
            com.taobao.tao.navigation.e.a(3, (h) null);
            com.taobao.android.icart.recommend.b bVar = this.g;
            if (bVar != null) {
                bVar.b();
            }
            CartVEngineFactory.removeCartVEngine(i());
            gnw.c();
            com.taobao.android.autosize.h.a().d(this.z);
            CartFirstPageCache.clear();
            ris risVar = this.P;
            if (risVar != null) {
                risVar.b();
            }
            com.taobao.android.icart.widget.h.b();
            tbo.a();
            b.b(this);
            jdc.c(this.F);
            ICartWVService.unregister(this);
            b(this.e);
        }
    }

    @Override // tb.aat
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.R = false;
        this.d.K();
        com.taobao.android.icart.shake.b bVar = this.h;
        if (bVar != null) {
            bVar.g();
        }
        a(10004);
        com.taobao.android.behavix.h.b(this.d.v().f(), (String) null, this, new String[0]);
    }

    @Override // tb.aat
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            a(10002);
        }
    }

    @Override // tb.aat
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        this.R = true;
        if (i() == TBMainHost.a().getContext()) {
            com.taobao.tao.navigation.e.a(3, this.I);
        }
        this.d.v().p();
        this.d.J();
        com.taobao.android.icart.shake.b bVar = this.h;
        if (bVar != null && bVar.c()) {
            this.h.a(i());
        }
        if (spk.a("cart_switch", "asyncUpdatePageProperties", true)) {
            jqh.a(new Runnable() { // from class: com.taobao.android.icart.engine.a.10
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        a.d(a.this);
                    }
                }
            });
        } else {
            n();
        }
        String f = this.d.v().f();
        UTAnalytics.getInstance().getDefaultTracker().updatePageName(i(), f);
        a(10003);
        com.taobao.android.behavix.h.a(f, (String) null, this, new String[0]);
        com.taobao.android.icart.recommend.b bVar2 = this.g;
        if (bVar2 != null) {
            bVar2.c();
        }
        j();
    }

    private void n() {
        String q;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
            return;
        }
        try {
            z = com.taobao.homepage.utils.a.b(i());
        } catch (Throwable unused) {
        }
        HashMap hashMap = new HashMap();
        hashMap.put("voiceIsOpen", String.valueOf(z));
        hashMap.put("bizName", "iCart");
        hashMap.put("iCart", "true");
        QueryParamsManager v = this.d.v();
        if (v.i()) {
            q = b.c() ? "a2141.oversea_cart" : "a2141.7631563";
        } else {
            q = v.q();
        }
        if (!StringUtils.isEmpty(q)) {
            hashMap.put("spm-cnt", q);
        }
        if (com.taobao.android.tbelder.b.c()) {
            hashMap.put("oldPeople", "true");
        }
        UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(i(), hashMap);
    }

    @Override // tb.aat
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        a(10005);
        ben.a();
    }

    @Override // tb.aat
    public void I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41a3850", new Object[]{this});
            return;
        }
        this.R = true;
        a(10007);
        j();
    }

    @Override // tb.aat
    public void L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4447ed3", new Object[]{this});
            return;
        }
        this.R = false;
        a(10008);
    }

    @Override // tb.aat
    public String f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("50938a53", new Object[]{this}) : this.d.v().f();
    }

    @Override // tb.aat
    public boolean a(int i, KeyEvent keyEvent) {
        bbz bbzVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f14b42c5", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
        }
        if (i != 4 || (bbzVar = this.d) == null || !bbzVar.x().f()) {
            return false;
        }
        if (!this.d.l().a()) {
            this.d.x().a(false);
            this.d.l().b(1);
        }
        return true;
    }

    @Override // tb.adz
    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
            return;
        }
        CartRecyclerView cartRecyclerView = this.b;
        if (cartRecyclerView != null) {
            cartRecyclerView.resetScroll();
            this.b.scrollToPosition(0);
        }
        RecyclerView recyclerView = this.f;
        if (recyclerView == null) {
            return;
        }
        recyclerView.scrollToPosition(0);
    }

    @Override // tb.aat
    public boolean E() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3e1da50", new Object[]{this})).booleanValue() : this.R;
    }

    @Override // tb.aat
    public boolean k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[]{this})).booleanValue() : this.D;
    }

    @Override // tb.aat
    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        boolean G = this.d.n().o().G();
        jqg.b("CartVEngine", "refreshData mRefresh=" + G);
        if (!G) {
            return;
        }
        this.d.n().o().i(false);
        bex.c(this.d, "Page_ShoppingCart_Notification_Refresh", new String[0]);
        S();
        this.d.a(true, (Map<String, String>) null, new jnv() { // from class: com.taobao.android.icart.engine.a.11
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.joc
            public void a(int i, MtopResponse mtopResponse, Object obj, boolean z, Map<String, ?> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("dc169ead", new Object[]{this, new Integer(i), mtopResponse, obj, new Boolean(z), map});
                }
            }

            @Override // tb.joc
            public void a(int i, MtopResponse mtopResponse, Object obj, jny jnyVar, Map<String, ?> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b57ff8e", new Object[]{this, new Integer(i), mtopResponse, obj, jnyVar, map});
                } else {
                    ((RecyclerView) a.c(a.this).x().s()).scrollToPosition(0);
                }
            }
        });
        com.taobao.android.icart.shake.b bVar = this.h;
        if (bVar == null || !bVar.b()) {
            return;
        }
        if (this.P == null) {
            this.P = new ris(this.d.m(), "addCartSuccess", null);
        }
        this.P.a("{\"needRefresh\":true}");
    }

    public void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64de478", new Object[]{this});
            return;
        }
        this.d = new bbx(this.A);
        this.d.a(this.E);
        this.d.a(this);
        this.d.d(this.D);
        this.d.b(CartVEngineFactory.getSceneName());
        this.e = this.d.n();
        if (this.F != null) {
            this.e.o().h(this.F);
        }
        a(this.e);
        this.i = this.d.h();
        this.i.a(new e.a() { // from class: com.taobao.android.icart.engine.a.12
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.android.icart.core.data.e.a
            public void a(boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
                    return;
                }
                bff l = a.c(a.this).l();
                if (l != null && l.a()) {
                    l.b(1);
                }
                if (a.e(a.this) == null || a.e(a.this).getState() != PtrBase.State.REFRESHING) {
                    return;
                }
                a.e(a.this).refreshComplete(b.a(R.string.app_load_completed));
            }
        });
        a(this.d, this.e);
    }

    private void a(bbz bbzVar, bcb bcbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5a10ced", new Object[]{this, bbzVar, bcbVar});
            return;
        }
        QueryParamsManager v = bbzVar.v();
        String c = v.c(ieu.sQueryParamsKeyDefaultFilterItem);
        if (c != null) {
            bcbVar.c(c);
        }
        jpo.b(bbzVar.m()).b(ieu.sKeyFeedFlowType, v.w());
    }

    @Override // tb.aat
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        this.F = str;
        bcb bcbVar = this.e;
        if (bcbVar == null || bcbVar.o() == null) {
            return;
        }
        this.e.o().h(str);
    }

    @Override // tb.aat
    public jcz T() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jcz) ipChange.ipc$dispatch("ab00f10a", new Object[]{this}) : this.T;
    }

    @Override // tb.adz
    public String U() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("61b225c4", new Object[]{this}) : this.F;
    }

    private void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b088ff", new Object[]{this});
            return;
        }
        y();
        z();
        t();
        if (dcn.a()) {
            this.d.x().p().f(View.MeasureSpec.makeMeasureSpec(i.a(this.A).width(), 1073741824));
            s();
        }
        CartRefreshCheckBroadcast.a(Globals.getApplication());
    }

    private void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bea080", new Object[]{this});
        } else {
            this.d.n().b(B());
        }
    }

    private void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ccb801", new Object[]{this});
        } else {
            this.d.n().b(A());
        }
    }

    @Override // tb.adz
    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
        } else {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.taobao.android.icart.engine.a.13
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        a.e(a.this).setRefreshing(PullBase.Mode.PULL_FROM_START, true);
                    }
                }
            });
        }
    }

    private a.InterfaceC0095a A() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a.InterfaceC0095a) ipChange.ipc$dispatch("331ac50b", new Object[]{this}) : new a.InterfaceC0095a() { // from class: com.taobao.android.icart.engine.a.15
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.android.ultron.trade.presenter.a.InterfaceC0095a
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    return;
                }
                com.taobao.android.icart.widget.h.a();
                if (a.c(a.this).n().d()) {
                    return;
                }
                a.f(a.this).resetScroll();
                if (a.c(a.this).n().l() && jqi.a("iCart", "doNotLoadRecommendWhenAdjustOnMain", true)) {
                    return;
                }
                a.g(a.this);
                if (!a.h(a.this)) {
                    if (a.i(a.this) == null || !a.i(a.this).f() || !a.f(a.this).hasEndView(a.k(a.this))) {
                        return;
                    }
                    a.f(a.this).removeEndView(a.k(a.this));
                    return;
                }
                a.i(a.this).f();
                if (!a.i(a.this).g()) {
                    return;
                }
                a.j(a.this);
                a.i(a.this).d();
                a.i(a.this).a("adjust");
            }
        };
    }

    private a.b B() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a.b) ipChange.ipc$dispatch("60f35f89", new Object[]{this}) : new a.b() { // from class: com.taobao.android.icart.engine.a.16
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.android.ultron.trade.presenter.a.b
            public void a(PageInfo pageInfo, DataInfo dataInfo) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b29da491", new Object[]{this, pageInfo, dataInfo});
                    return;
                }
                com.taobao.android.icart.widget.h.a();
                a.e(a.this).refreshComplete(b.a(R.string.app_load_completed));
                if (a.f(a.this) != null) {
                    a.f(a.this).resetScroll();
                }
                if (a.c(a.this).n().d() || a.a(a.this).w() == null) {
                    return;
                }
                if (a.a(a.this).w().e()) {
                    if (a.c(a.this).n().l()) {
                        a.e(a.this).setMode(PullBase.Mode.BOTH);
                        return;
                    } else {
                        a.e(a.this).setMode(PullBase.Mode.PULL_FROM_START);
                        return;
                    }
                }
                gnx.b(false);
                a.c(a.this).x().p().g(false);
                if (pageInfo == PageInfo.FIRST_PAGE && a.c(a.this).v().i() && !a.c(a.this).v().k()) {
                    int n = bem.n(a.a(a.this));
                    if (a.i(a.this) != null) {
                        a.i(a.this).a(n);
                    }
                }
                if (a.l(a.this) != null) {
                    a.l(a.this).a(a.c(a.this).n());
                }
                if (a.l(a.this) != null && a.l(a.this).c() && a.this.g()) {
                    a.l(a.this).a(a.this.i());
                }
                if (a.c(a.this).n().l()) {
                    if (a.e(a.this) != null && dataInfo == DataInfo.NORMAL_DATA) {
                        a.e(a.this).setMode(PullBase.Mode.BOTH);
                    }
                    if (a.f(a.this) == null) {
                        return;
                    }
                    a.f(a.this).removeEndView(a.k(a.this));
                    return;
                }
                if (a.e(a.this) != null) {
                    a.e(a.this).setMode(PullBase.Mode.PULL_FROM_START);
                }
                a.g(a.this);
                if (!a.h(a.this)) {
                    if (a.f(a.this) == null) {
                        return;
                    }
                    a.f(a.this).removeEndView(a.k(a.this));
                } else if (a.i(a.this) == null) {
                } else {
                    a.j(a.this);
                    a.i(a.this).d();
                    a.i(a.this).f();
                    a.i(a.this).a(CartRecommendRefreshScene.build);
                }
            }
        };
    }

    private void C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c5ab4a", new Object[]{this});
            return;
        }
        this.g.a();
        this.g.a(new jnq<RecyclerView>() { // from class: com.taobao.android.icart.engine.a.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.jnq
            public void a(RecyclerView recyclerView) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("46606596", new Object[]{this, recyclerView});
                } else if (recyclerView == null) {
                } else {
                    a.a(a.this, recyclerView);
                    a.k(a.this).setTag(com.taobao.android.home.component.utils.h.VIEW_PROVIDER_RECOMMEND_CONTAINER);
                }
            }
        });
    }

    private boolean D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3d3c2cf", new Object[]{this})).booleanValue();
        }
        com.taobao.android.icart.recommend.b bVar = this.g;
        return bVar != null && bVar.h() && this.d.H() != null && !this.d.H().e();
    }

    private void a(boolean z) {
        IpChange ipChange = $ipChange;
        boolean z2 = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else if (this.N.getAndSet(true)) {
            Activity i = i();
            boolean z3 = this.O;
            if (this.e.x() != null) {
                z2 = true;
            }
            com.taobao.android.icart.utils.c.a(i, z3, z2);
        } else {
            jnv jnvVar = new jnv() { // from class: com.taobao.android.icart.engine.a.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass3 anonymousClass3, String str, Object... objArr) {
                    if (str.hashCode() == -895300510) {
                        super.a((jny) objArr[0], (StreamRemoteMainResponse) objArr[1], (List) objArr[2]);
                        return null;
                    }
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                }

                @Override // tb.joc
                public void a(int i2, MtopResponse mtopResponse, Object obj, boolean z4, Map<String, ?> map) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("dc169ead", new Object[]{this, new Integer(i2), mtopResponse, obj, new Boolean(z4), map});
                        return;
                    }
                    a.c(a.this, false);
                    a.m(a.this).b(true);
                }

                @Override // tb.joc
                public void a(int i2, MtopResponse mtopResponse, Object obj, jny jnyVar, Map<String, ?> map) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b57ff8e", new Object[]{this, new Integer(i2), mtopResponse, obj, jnyVar, map});
                        return;
                    }
                    a.c(a.this, true);
                    a.m(a.this).b(true);
                }

                @Override // tb.jnv
                public void a(jny jnyVar, StreamRemoteMainResponse streamRemoteMainResponse, List<AttachedResponse> list) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("caa2cc62", new Object[]{this, jnyVar, streamRemoteMainResponse, list});
                        return;
                    }
                    super.a(jnyVar, streamRemoteMainResponse, list);
                    a.c(a.this, true);
                }

                @Override // tb.jnv
                public void b(int i2, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ac39879b", new Object[]{this, new Integer(i2), mtopResponse, obj});
                    } else {
                        a.m(a.this).b(true);
                    }
                }
            };
            HashMap hashMap = new HashMap();
            hashMap.put(RequestConfig.IS_ICART_IS_FIRST_REQUEST, "true");
            jqg.a("iCart", "CartVEngine", "#发起首屏请求");
            this.d.a(z, hashMap, jnvVar);
        }
    }

    private void F() {
        IpChange ipChange = $ipChange;
        final boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3eff1cd", new Object[]{this});
            return;
        }
        this.d.a();
        eds.a b = eds.b(i());
        boolean z2 = b == null;
        this.d.a(1001);
        this.C = z2 ? LayoutInflater.from(i()).inflate(R.layout.icart_fragment_cart_v2, (ViewGroup) null, false) : b.a();
        this.C.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.H = z2 ? (DragFloatLayer) this.C.findViewById(R.id.drag_layer) : b.b();
        bez x = this.d.x();
        x.a((ViewGroup) this.C);
        this.j = z2 ? (LinearLayout) this.C.findViewById(R.id.status_container) : b.c();
        LinearLayout d = z2 ? (LinearLayout) this.C.findViewById(R.id.cart_top_layout) : b.d();
        LinearLayout e = z2 ? (LinearLayout) this.C.findViewById(R.id.cart_bottom_layout) : b.e();
        this.b = z2 ? (CartRecyclerView) this.C.findViewById(R.id.cart_recycler_view) : b.g();
        this.b.setFooterView(e);
        this.b.setCartPresenter(this.d);
        this.c = z2 ? this.C.findViewById(R.id.ptr_loading) : b.f();
        com.taobao.android.icart.widget.i iVar = new com.taobao.android.icart.widget.i(i());
        iVar.a(new i.a() { // from class: com.taobao.android.icart.engine.a.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.icart.widget.i.a
            public void a(RecyclerView.State state) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("6a853929", new Object[]{this, state});
                } else {
                    a.n(a.this);
                }
            }
        });
        CartRecyclerView cartRecyclerView = this.b;
        cartRecyclerView.setLayoutManager(iVar.a(cartRecyclerView));
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        defaultItemAnimator.setChangeDuration(0L);
        defaultItemAnimator.setSupportsChangeAnimations(false);
        this.b.setItemAnimator(defaultItemAnimator);
        this.b.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.taobao.android.icart.engine.a.5
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public int b;

            public static /* synthetic */ Object ipc$super(AnonymousClass5 anonymousClass5, String str, Object... objArr) {
                int hashCode = str.hashCode();
                if (hashCode == 806944192) {
                    super.onScrolled((RecyclerView) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
                    return null;
                } else if (hashCode != 2142696127) {
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                } else {
                    super.onScrollStateChanged((RecyclerView) objArr[0], ((Number) objArr[1]).intValue());
                    return null;
                }
            }

            @Override // android.support.v7.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                IpChange ipChange2 = $ipChange;
                boolean z3 = true;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7fb6f2bf", new Object[]{this, recyclerView, new Integer(i)});
                    return;
                }
                super.onScrollStateChanged(recyclerView, i);
                if (i != 0) {
                    z3 = false;
                }
                if (z3) {
                    if (a.k(a.this) != null && a.k(a.this).getParent() == null) {
                        a.k(a.this).scrollToPosition(0);
                    }
                    a.o(a.this);
                    ifm.a(a.c(a.this), recyclerView, R.id.cart_ptr_loading_more);
                    return;
                }
                tbo.a();
                jpo.b(a.p(a.this)).d();
            }

            @Override // android.support.v7.widget.RecyclerView.OnScrollListener
            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                int[] findFirstVisibleItemPositions;
                IpChange ipChange2 = $ipChange;
                boolean z3 = true;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3018fdc0", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
                    return;
                }
                super.onScrolled(recyclerView, i, i2);
                this.b += i2;
                a.q(a.this).setVisibility(8);
                if (a.k(a.this) != null) {
                    boolean z4 = (a.k(a.this).getLayoutManager() instanceof StaggeredGridLayoutManager) && a.k(a.this).getParent() != null && (findFirstVisibleItemPositions = ((StaggeredGridLayoutManager) a.k(a.this).getLayoutManager()).findFirstVisibleItemPositions(null)) != null && findFirstVisibleItemPositions.length > 0 && findFirstVisibleItemPositions[0] > 0 && a.f(a.this).getChildCount() > 1;
                    if (!a.c(a.this).x().b() || z4) {
                        a.k(a.this).scrollToPosition(0);
                    }
                }
                if (a.r(a.this) || a.c(a.this).l().a() || a.a(a.this).w() == null || a.a(a.this).w().e()) {
                    return;
                }
                if (a.s(a.this) == null && a.t(a.this) != null) {
                    a aVar = a.this;
                    a.a(aVar, (DragFloatLayer) a.t(aVar).findViewById(R.id.drag_layer));
                }
                e m = a.m(a.this);
                if (a.s(a.this) == null || !a.s(a.this).isDraging()) {
                    z3 = false;
                }
                m.a(recyclerView, i, i2, z3);
            }
        });
        this.d.a(d, this.b, e);
        CartRecyclerView cartRecyclerView2 = this.b;
        cartRecyclerView2.setAccessibilityDelegateCompat(new RecyclerViewAccessibilityDelegate(cartRecyclerView2) { // from class: com.taobao.android.icart.engine.a.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            private int f12794a = 0;

            public static /* synthetic */ Object ipc$super(AnonymousClass6 anonymousClass6, String str, Object... objArr) {
                if (str.hashCode() == -1710490298) {
                    return new Boolean(super.onRequestSendAccessibilityEvent((ViewGroup) objArr[0], (View) objArr[1], (AccessibilityEvent) objArr[2]));
                }
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }

            @Override // android.support.v4.view.AccessibilityDelegateCompat
            public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
                int max;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("9a0bfd46", new Object[]{this, viewGroup, view, accessibilityEvent})).booleanValue();
                }
                if (accessibilityEvent == null || accessibilityEvent.getEventType() != 32768) {
                    return super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
                }
                if (viewGroup instanceof CartRecyclerView) {
                    CartRecyclerView cartRecyclerView3 = (CartRecyclerView) viewGroup;
                    int childAdapterPosition = cartRecyclerView3.getChildAdapterPosition(view);
                    int i = this.f12794a;
                    if (i < childAdapterPosition) {
                        max = childAdapterPosition + 1;
                    } else {
                        if (i > childAdapterPosition) {
                            max = Math.max(0, childAdapterPosition - 1);
                        }
                        this.f12794a = childAdapterPosition;
                    }
                    cartRecyclerView3.smoothScrollToPosition(max);
                    this.f12794a = childAdapterPosition;
                }
                return true;
            }
        });
        TipsLineFollower tipsLineFollower = new TipsLineFollower(this.d);
        com.taobao.android.icart.widget.touch.b bVar = new com.taobao.android.icart.widget.touch.b(this.d, this.b, this.H, tipsLineFollower);
        gog gogVar = new gog(this.d, bVar, this.H);
        this.H.setBound(200, 200);
        this.H.attach(this.b, bVar);
        gogVar.a();
        this.x = z2 ? (DragParentFrameLayout) this.C.findViewById(R.id.drag_parent_layout) : b.h();
        this.x.attach(this.H);
        this.x.addView(tipsLineFollower, -2, -2);
        this.H.setFollower(tipsLineFollower);
        this.f12778a = z2 ? (PtrBase) this.C.findViewById(R.id.cart_refresh) : b.i();
        this.k = new c(i(), this.d);
        this.f12778a.mo1212getStartLayout().setLoadingDelegate(this.k);
        this.f12778a.setOnRefreshListener(new PtrBase.a() { // from class: com.taobao.android.icart.engine.a.7
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.ptr.PtrBase.a
            public void onPullStartToRefresh(PtrBase ptrBase) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("da00fd4d", new Object[]{this, ptrBase});
                    return;
                }
                jpo b2 = jpo.b(a.this.i());
                akg.a(a.this.i(), "mtop.trade.query.bag");
                b2.b("isPullToRefresh", "true");
                jqg.b("apmClientBeforeNetworkLogicProcess", "onPullStartToRefresh");
                b2.a("apmClientBeforeNetworkLogicProcess", (String) null);
                if (a.u(a.this) == 0) {
                    a.a(a.this, System.currentTimeMillis());
                }
                if (a.a(a.this).a() && TBMainHost.a().getContext() == a.this.i()) {
                    a.c(a.this).v().o();
                }
                a.a(a.this).h();
                a.q(a.this).setVisibility(8);
                a.c(a.this).a(false, (Map<String, String>) null, new jnv() { // from class: com.taobao.android.icart.engine.a.7.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // tb.jnv
                    public void b(int i, MtopResponse mtopResponse, Object obj) {
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            ipChange3.ipc$dispatch("ac39879b", new Object[]{this, new Integer(i), mtopResponse, obj});
                            return;
                        }
                        a.e(a.this).refreshComplete("");
                        a.m(a.this).b(true);
                    }

                    @Override // tb.joc
                    public void a(int i, MtopResponse mtopResponse, Object obj, boolean z3, Map<String, ?> map) {
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            ipChange3.ipc$dispatch("dc169ead", new Object[]{this, new Integer(i), mtopResponse, obj, new Boolean(z3), map});
                        } else {
                            a.m(a.this).b(true);
                        }
                    }

                    @Override // tb.joc
                    public void a(int i, MtopResponse mtopResponse, Object obj, jny jnyVar, Map<String, ?> map) {
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            ipChange3.ipc$dispatch("b57ff8e", new Object[]{this, new Integer(i), mtopResponse, obj, jnyVar, map});
                            return;
                        }
                        if (a.a(a.this).j()) {
                            a.a(a.this).k();
                            bej.a(a.c(a.this));
                            com.alibaba.android.icart.core.data.c.a((com.taobao.android.ultron.datamodel.imp.b) jnyVar);
                            com.alibaba.android.icart.core.data.c.a(jnyVar, a.p(a.this));
                        }
                        a.m(a.this).b(true);
                    }
                });
                bbz c = a.c(a.this);
                String[] strArr = new String[5];
                StringBuilder sb = new StringBuilder();
                sb.append("isFirst=");
                sb.append(a.v(a.this) == 1);
                strArr[0] = sb.toString();
                strArr[1] = "interval=" + (System.currentTimeMillis() - (a.y(a.this) / 1000.0d));
                strArr[2] = "intervalFromLoad=" + (System.currentTimeMillis() - a.w(a.this));
                strArr[3] = "refreshCount=" + a.v(a.this);
                strArr[4] = "cartItemCount=" + bem.n(a.a(a.this));
                bex.c(c, "Page_ShoppingCart_Refresh", strArr);
                a.b(a.this, System.currentTimeMillis());
            }

            @Override // com.taobao.ptr.PtrBase.a
            public void onPullEndToRefresh(PtrBase ptrBase) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("dc9b6974", new Object[]{this, ptrBase});
                    return;
                }
                boolean b2 = a.m(a.this).b();
                if (b2 || !a.m(a.this).c()) {
                    a.f(a.this).resetScroll();
                    jqg.b("iCart", "正在预加载下一页或者首屏请求还没成功，不允许上拉加载更多,prefetching：" + b2);
                    return;
                }
                jqg.b("iCart", "触发手动上拉加载更多");
                a.c(a.this).b(false, null, new jnv() { // from class: com.taobao.android.icart.engine.a.7.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // tb.joc
                    public void a(int i, MtopResponse mtopResponse, Object obj, jny jnyVar, Map<String, ?> map) {
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            ipChange3.ipc$dispatch("b57ff8e", new Object[]{this, new Integer(i), mtopResponse, obj, jnyVar, map});
                        }
                    }

                    @Override // tb.joc
                    public void a(int i, MtopResponse mtopResponse, Object obj, boolean z3, Map<String, ?> map) {
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            ipChange3.ipc$dispatch("dc169ead", new Object[]{this, new Integer(i), mtopResponse, obj, new Boolean(z3), map});
                        }
                    }

                    @Override // tb.jnv
                    public void b(int i, MtopResponse mtopResponse, Object obj) {
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            ipChange3.ipc$dispatch("ac39879b", new Object[]{this, new Integer(i), mtopResponse, obj});
                        } else {
                            a.e(a.this).refreshComplete("");
                        }
                    }
                });
            }
        });
        this.f12778a.addOnScrollListener(new PullBase.a() { // from class: com.taobao.android.icart.engine.a.8
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.ptr.PullBase.a
            public void a(PullBase pullBase, int i) {
                IpChange ipChange2 = $ipChange;
                boolean z3 = true;
                int i2 = 0;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a6c44a54", new Object[]{this, pullBase, new Integer(i)});
                    return;
                }
                a aVar = a.this;
                if (i == 0) {
                    z3 = false;
                }
                a.d(aVar, z3);
                View q = a.q(a.this);
                if (!a.r(a.this)) {
                    i2 = 8;
                }
                q.setVisibility(i2);
            }
        });
        x.a(new CartPopupWindowManager(this.d, z2 ? (ViewGroup) this.C.findViewById(R.id.cart_bottom_float_layout) : b.j()));
        try {
            com.taobao.android.icart.utils.a.a(this.d.m(), this.d.x().p().e().a(), this.d.F());
        } catch (Exception unused) {
        }
        x.a(new bey() { // from class: com.taobao.android.icart.engine.a.17
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.bey
            public void a(List<IDMComponent> list, com.alibaba.android.ultron.vfw.viewholder.h hVar, int i) {
                View view;
                int a2;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("2a187007", new Object[]{this, list, hVar, new Integer(i)});
                    return;
                }
                goh.a(a.c(a.this), list, hVar, i);
                if (i >= list.size()) {
                    return;
                }
                IDMComponent iDMComponent = list.get(i);
                if (!a.a(a.this).o().o() || !(iDMComponent instanceof BundleLineComponent) || (view = hVar.itemView) == null || view.getLayoutParams() == null) {
                    return;
                }
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (i == 0) {
                    int B = bem.B(a.a(a.this));
                    a2 = B != -1 ? a.c(a.this).x().a(B) : a.c(a.this).x().a(3.0f);
                } else {
                    a2 = gbg.a((Context) a.p(a.this), 9.0f);
                }
                if (layoutParams.height == a2) {
                    return;
                }
                layoutParams.height = a2;
                view.setLayoutParams(layoutParams);
            }
        });
        if (TBMainHost.a().getContext() != i()) {
            z = false;
        }
        this.b.setOnEndViewExposure(new CartRecyclerView.a() { // from class: com.taobao.android.icart.engine.a.18
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.icart.widget.CartRecyclerView.a
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    return;
                }
                bbz c = a.c(a.this);
                bex.c(c, "Page_ShoppingCart_LoadMore", "isMain=" + z);
            }
        });
    }

    private void G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fe094e", new Object[]{this});
            return;
        }
        this.h = new com.taobao.android.icart.shake.b(this.d);
        this.Q = new gob(this.j, this);
        this.d.l().a(this.Q);
        this.T = new com.taobao.android.icart.manager.a(this.d, new View.OnClickListener() { // from class: com.taobao.android.icart.engine.a.19
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                bex.a(a.c(a.this), "Page_ShoppingCart_Float_ScrollToTop", new String[0]);
                a.this.m();
            }
        });
        if (this.l != null) {
            return;
        }
        this.l = new CartThemeManager(this.d);
    }

    private void P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47cdcd7", new Object[]{this});
        } else if (this.g != null || this.d.v().g()) {
        } else {
            this.g = new com.taobao.android.icart.recommend.c(this.b, this.d, "auto");
            this.b.setCartRecommend(this.g);
        }
    }

    @Override // tb.aat
    public bbz h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bbz) ipChange.ipc$dispatch("44de35bd", new Object[]{this}) : this.d;
    }

    @Override // tb.aat
    public void a(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79f30285", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        UnifyLog.d("CartVEngine", "requestCode=" + i + ",resultCode=" + i2);
        this.d.a(i, i2, intent);
    }

    @Override // tb.aat
    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue();
        }
        Fragment fragment = this.B;
        return fragment != null && fragment.isResumed();
    }

    @Override // tb.aat
    public boolean K() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4366756", new Object[]{this})).booleanValue() : this.M;
    }

    private boolean R() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4990bdd", new Object[]{this})).booleanValue() : this.y != null;
    }

    private boolean M() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4529658", new Object[]{this})).booleanValue() : this.e.x() == null && (!this.d.j() || !this.e.g());
    }

    @Override // com.alibaba.ability.localization.b.a
    public void a(Language language, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("246661b", new Object[]{this, language, str});
            return;
        }
        try {
            boolean isVisible = this.B.isVisible();
            jqg.b("CartVEngine", "切换语言,visible=" + isVisible);
            this.d.n().o().i(true);
            if (!isVisible) {
                return;
            }
            j();
        } catch (Exception unused) {
        }
    }

    private void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        bbz bbzVar = this.d;
        if (bbzVar == null || bbzVar.F() == null) {
            return;
        }
        bmz a2 = this.d.F().a();
        a2.a("cartLifecycle");
        a2.a(DIConstants.EVENT_NAME_LIFE_CYCLE, Integer.valueOf(i));
        this.d.F().a(a2);
    }

    private void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b576", new Object[]{this});
            return;
        }
        CartRecyclerView cartRecyclerView = this.b;
        if (cartRecyclerView == null || cartRecyclerView.getScrollState() != 0) {
            return;
        }
        tbo.a(this.d);
    }

    private void S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a7235a", new Object[]{this});
            return;
        }
        this.d.x().a(false);
        try {
            new alu(new alr("iCart", "nativeFragment").a((Context) i())).b("stdPop", "close", new alq().a((View) null), null, new alo() { // from class: com.taobao.android.icart.engine.a.20
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.alo
                public void onCallback(ExecuteResult executeResult) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f183ed74", new Object[]{this, executeResult});
                    } else if (!(executeResult instanceof ErrorResult)) {
                    } else {
                        jqg.a("CartVEngine", "关闭失败");
                    }
                }
            });
        } catch (Throwable th) {
            jqg.a("CartVEngine", "关闭失败:" + th.getMessage());
        }
    }

    private void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66a137a", new Object[]{this});
            return;
        }
        this.z = new OnScreenChangedListener() { // from class: com.taobao.android.icart.engine.a.21
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.autosize.OnScreenChangedListener
            public /* synthetic */ void onActivityChanged(Activity activity, int i, Configuration configuration) {
                OnScreenChangedListener.CC.$default$onActivityChanged(this, activity, i, configuration);
            }

            @Override // com.taobao.android.autosize.OnScreenChangedListener
            public void onScreenChanged(int i, Configuration configuration) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("cfdcd1d", new Object[]{this, new Integer(i), configuration});
                } else if (a.p(a.this) == null) {
                } else {
                    bby d = a.c(a.this).x().d();
                    if (d instanceof CartPopupWindowManager) {
                        CartPopupWindowManager cartPopupWindowManager = (CartPopupWindowManager) d;
                        cartPopupWindowManager.b(i);
                        cartPopupWindowManager.i();
                    }
                    a.c(a.this).x().a(127, com.taobao.android.autosize.i.a(a.p(a.this)).width());
                }
            }
        };
        com.taobao.android.autosize.h.a().c(this.z);
    }

    private void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6782afb", new Object[]{this});
            return;
        }
        if (this.u == null) {
            this.u = new com.taobao.android.icart.broadcast.a(this.d);
        }
        this.u.a();
        if (this.r == null) {
            this.r = new MainAddCartEventHandler(this);
        }
        if (this.m == null) {
            this.m = new CartWVBroadcast(this);
        }
        this.r.a();
        this.m.a();
    }

    private void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("686427c", new Object[]{this});
            return;
        }
        com.taobao.android.icart.broadcast.a aVar = this.u;
        if (aVar != null) {
            aVar.b();
        }
        MainAddCartEventHandler mainAddCartEventHandler = this.r;
        if (mainAddCartEventHandler != null) {
            mainAddCartEventHandler.b();
        }
        CartWVBroadcast cartWVBroadcast = this.m;
        if (cartWVBroadcast == null) {
            return;
        }
        cartWVBroadcast.b();
    }

    private void J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4284fd1", new Object[]{this});
            return;
        }
        jpo b = jpo.b(i());
        b.b("fromPrefetch", String.valueOf(this.D));
        if (TBMainHost.a().getContext() != this.A) {
            return;
        }
        if (R()) {
            bed.a("recreateTabFragment", "重新创建主tab购物车", false, 0.01f);
            b.b("recreateTabFragment", "true");
            return;
        }
        jqh.a(new Runnable() { // from class: com.taobao.android.icart.engine.a.9
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    com.taobao.android.icart.utils.e.a(a.x(a.this) ? a.z(a.this) : a.A(a.this), a.C(a.this), a.x(a.this));
                }
            }
        });
    }

    private void H() {
        bbz bbzVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40c20cf", new Object[]{this});
            return;
        }
        bcb bcbVar = this.e;
        if (bcbVar == null || bcbVar.x() == null || (bbzVar = this.d) == null || this.w) {
            return;
        }
        try {
            String[] strArr = new String[2];
            strArr[0] = "time=" + (System.currentTimeMillis() - this.v);
            StringBuilder sb = new StringBuilder();
            sb.append("isMain=");
            sb.append(TBMainHost.a().getContext() == i());
            strArr[1] = sb.toString();
            bex.c(bbzVar, "Page_ShoppingCart_RenderTime", strArr);
            this.w = true;
        } catch (Exception e) {
            UnifyLog.d("CartVEngine", e.getMessage());
        }
    }

    private void a(bcb bcbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1707ef7", new Object[]{this, bcbVar});
            return;
        }
        b(bcbVar);
        this.q = new jnv() { // from class: com.taobao.android.icart.engine.a.23
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.joc
            public void a(int i, MtopResponse mtopResponse, Object obj, boolean z, Map<String, ?> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("dc169ead", new Object[]{this, new Integer(i), mtopResponse, obj, new Boolean(z), map});
                }
            }

            @Override // tb.joc
            public void a(int i, MtopResponse mtopResponse, Object obj, jny jnyVar, Map<String, ?> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b57ff8e", new Object[]{this, new Integer(i), mtopResponse, obj, jnyVar, map});
                    return;
                }
                try {
                    boolean z = a.a(a.this).m().getControlParas().isShot2024ItemV2Gray;
                    if (z) {
                        a.t(a.this).setBackgroundColor(a.t(a.this).getResources().getColor(R.color.icart_background_v2));
                    }
                    jqd.a("iCart").a("isShot2024ItemV2Gray", z);
                } catch (Throwable unused) {
                }
            }
        };
        bcbVar.a(this.q);
    }

    private void b(bcb bcbVar) {
        jnv jnvVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cff38578", new Object[]{this, bcbVar});
        } else if (bcbVar == null || (jnvVar = this.q) == null) {
        } else {
            bcbVar.b(jnvVar);
        }
    }

    private void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a2717e", new Object[]{this});
        } else if (this.b.getChildCount() <= 0 || this.B == null) {
        } else {
            akg.a(i(), this.B, this.e.w(), this.b, this.D, CartVEngineFactory.getSceneName(), R());
            H();
            o();
        }
    }
}
