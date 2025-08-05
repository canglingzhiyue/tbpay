package com.taobao.android.icart.manager;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.view.GravityCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Pair;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.alibaba.android.icart.core.data.f;
import com.alibaba.android.ultron.trade.data.request.DataInfo;
import com.alibaba.android.ultron.trade.data.request.PageInfo;
import com.alibaba.android.ultron.trade.presenter.a;
import com.alibaba.android.ultron.vfw.viewholder.j;
import com.alibaba.android.ultron.vfw.widget.RoundRelativeLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.h;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.icart.recommend.CartRecommendRefreshScene;
import com.taobao.android.icart.recommend.b;
import com.taobao.android.icart.recommend.c;
import com.taobao.android.icart.widget.CartRecyclerView;
import com.taobao.android.icart.widget.CartSkeletonImageView;
import com.taobao.android.icart.widget.i;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.ptr.PtrBase;
import com.taobao.ptr.PullBase;
import com.taobao.tao.TBMainHost;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.t;
import mtopsdk.mtop.domain.MtopResponse;
import tb.adc;
import tb.bby;
import tb.bbz;
import tb.bcb;
import tb.bed;
import tb.bei;
import tb.bem;
import tb.bet;
import tb.bex;
import tb.bey;
import tb.bez;
import tb.bnn;
import tb.bnv;
import tb.bny;
import tb.bpl;
import tb.dcn;
import tb.goh;
import tb.ieu;
import tb.jdc;
import tb.jet;
import tb.jnq;
import tb.jnv;
import tb.jny;
import tb.jqg;
import tb.jqi;
import tb.kge;
import tb.osc;
import tb.pwr;
import tb.rul;

/* loaded from: classes5.dex */
public class CartPopupWindowManager implements bby {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final String u;
    private bcb A;
    private osc B;
    private List<bby.b> C;
    private List<IDMComponent> D;
    private boolean E;
    private Handler F;
    private ViewTreeObserver.OnGlobalLayoutListener G;
    private View K;
    private d L;
    private List<bey> M;
    private adc N;
    private b P;
    private View.OnLayoutChangeListener Q;

    /* renamed from: a  reason: collision with root package name */
    public int f12812a;
    private bnv b;
    private bny c;
    private FrameLayout d;
    private LinearLayout e;
    private CartRecyclerView f;
    private LinearLayout g;
    private ImageView h;
    private bnn i;
    private View j;
    private AlphaAnimation k;
    private AlphaAnimation l;
    private TranslateAnimation m;
    private TranslateAnimation n;
    private RelativeLayout o;
    private CartSkeletonImageView p;
    private bby.a q;
    private final ViewGroup r;
    private ViewGroup s;
    private Activity t;
    private final bbz v;
    private RecyclerView w;
    private PtrBase x;
    private f y;
    private i z;
    private boolean J = true;
    private boolean O = false;
    private a.b H = new a.b() { // from class: com.taobao.android.icart.manager.CartPopupWindowManager.4
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.alibaba.android.ultron.trade.presenter.a.b
        public void a(PageInfo pageInfo, DataInfo dataInfo) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b29da491", new Object[]{this, pageInfo, dataInfo});
                return;
            }
            CartRecyclerView i = CartPopupWindowManager.i(CartPopupWindowManager.this);
            if (i != null) {
                i.resetScroll();
                if (pageInfo == PageInfo.FIRST_PAGE) {
                    i.scrollToPosition(0);
                }
            }
            if (CartPopupWindowManager.j(CartPopupWindowManager.this)) {
                if (CartPopupWindowManager.k(CartPopupWindowManager.this) != null) {
                    CartPopupWindowManager.k(CartPopupWindowManager.this).refreshComplete(CartPopupWindowManager.j());
                    if (dataInfo == DataInfo.NORMAL_DATA) {
                        CartPopupWindowManager.k(CartPopupWindowManager.this).setMode(PullBase.Mode.PULL_FROM_END);
                    }
                }
                if (i != null) {
                    i.removeEndView(CartPopupWindowManager.h(CartPopupWindowManager.this));
                }
            } else {
                if (CartPopupWindowManager.l(CartPopupWindowManager.this) != null) {
                    CartPopupWindowManager.l(CartPopupWindowManager.this).a();
                    CartPopupWindowManager.l(CartPopupWindowManager.this).a(new jnq<RecyclerView>() { // from class: com.taobao.android.icart.manager.CartPopupWindowManager.4.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // tb.jnq
                        public void a(RecyclerView recyclerView) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("46606596", new Object[]{this, recyclerView});
                            } else {
                                CartPopupWindowManager.a(CartPopupWindowManager.this, recyclerView);
                            }
                        }
                    });
                    CartPopupWindowManager.i(CartPopupWindowManager.this).setCartRecommend(CartPopupWindowManager.l(CartPopupWindowManager.this));
                }
                if (CartPopupWindowManager.k(CartPopupWindowManager.this) != null) {
                    CartPopupWindowManager.k(CartPopupWindowManager.this).refreshComplete(CartPopupWindowManager.j());
                    CartPopupWindowManager.k(CartPopupWindowManager.this).setMode(PullBase.Mode.DISABLED);
                }
                boolean a2 = c.a(CartPopupWindowManager.d(CartPopupWindowManager.this));
                CartPopupWindowManager.a(CartPopupWindowManager.this, a2, CartRecommendRefreshScene.build);
                UnifyLog.d("CartPopupWindowManager", "isNeedLoadRecommend=" + a2);
                UnifyLog.d("CartPopupWindowManager", "filterItem=" + CartPopupWindowManager.m(CartPopupWindowManager.this).b() + ",feedFlowConfig=" + bem.i(CartPopupWindowManager.m(CartPopupWindowManager.this)));
            }
            if (pageInfo != PageInfo.FIRST_PAGE) {
                return;
            }
            CartPopupWindowManager.o(CartPopupWindowManager.this).a(CartPopupWindowManager.n(CartPopupWindowManager.this));
        }
    };
    private a.InterfaceC0095a I = new a.InterfaceC0095a() { // from class: com.taobao.android.icart.manager.CartPopupWindowManager.13
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.alibaba.android.ultron.trade.presenter.a.InterfaceC0095a
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            CartPopupWindowManager.i(CartPopupWindowManager.this).resetScroll();
            b l = CartPopupWindowManager.l(CartPopupWindowManager.this);
            if (l == null || CartPopupWindowManager.j(CartPopupWindowManager.this)) {
                return;
            }
            if (!l.h()) {
                if (!l.f()) {
                    return;
                }
                CartPopupWindowManager.a(CartPopupWindowManager.this, false, "adjust");
                return;
            }
            l.f();
            if (!l.g()) {
                return;
            }
            CartPopupWindowManager.l(CartPopupWindowManager.this).a();
            CartPopupWindowManager.l(CartPopupWindowManager.this).a(new jnq<RecyclerView>() { // from class: com.taobao.android.icart.manager.CartPopupWindowManager.13.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.jnq
                public void a(RecyclerView recyclerView) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("46606596", new Object[]{this, recyclerView});
                    } else {
                        CartPopupWindowManager.a(CartPopupWindowManager.this, recyclerView);
                    }
                }
            });
            CartPopupWindowManager.l(CartPopupWindowManager.this).d();
            CartPopupWindowManager.l(CartPopupWindowManager.this).a("adjust");
        }
    };

    public static /* synthetic */ Activity a(CartPopupWindowManager cartPopupWindowManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Activity) ipChange.ipc$dispatch("34c7705b", new Object[]{cartPopupWindowManager}) : cartPopupWindowManager.t;
    }

    public static /* synthetic */ RecyclerView a(CartPopupWindowManager cartPopupWindowManager, RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("e4a2dfc9", new Object[]{cartPopupWindowManager, recyclerView});
        }
        cartPopupWindowManager.w = recyclerView;
        return recyclerView;
    }

    public static /* synthetic */ View.OnLayoutChangeListener a(CartPopupWindowManager cartPopupWindowManager, View.OnLayoutChangeListener onLayoutChangeListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View.OnLayoutChangeListener) ipChange.ipc$dispatch("868eefa9", new Object[]{cartPopupWindowManager, onLayoutChangeListener});
        }
        cartPopupWindowManager.Q = onLayoutChangeListener;
        return onLayoutChangeListener;
    }

    public static /* synthetic */ void a(CartPopupWindowManager cartPopupWindowManager, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce67a036", new Object[]{cartPopupWindowManager, new Integer(i)});
        } else {
            cartPopupWindowManager.c(i);
        }
    }

    public static /* synthetic */ void a(CartPopupWindowManager cartPopupWindowManager, jet jetVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1a640a4", new Object[]{cartPopupWindowManager, jetVar});
        } else {
            cartPopupWindowManager.a(jetVar);
        }
    }

    public static /* synthetic */ void a(CartPopupWindowManager cartPopupWindowManager, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce67e007", new Object[]{cartPopupWindowManager, new Boolean(z)});
        } else {
            cartPopupWindowManager.c(z);
        }
    }

    public static /* synthetic */ void a(CartPopupWindowManager cartPopupWindowManager, boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da9db611", new Object[]{cartPopupWindowManager, new Boolean(z), str});
        } else {
            cartPopupWindowManager.a(z, str);
        }
    }

    public static /* synthetic */ void b(CartPopupWindowManager cartPopupWindowManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc73500c", new Object[]{cartPopupWindowManager});
        } else {
            cartPopupWindowManager.t();
        }
    }

    public static /* synthetic */ FrameLayout c(CartPopupWindowManager cartPopupWindowManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FrameLayout) ipChange.ipc$dispatch("d446d64e", new Object[]{cartPopupWindowManager}) : cartPopupWindowManager.d;
    }

    public static /* synthetic */ bbz d(CartPopupWindowManager cartPopupWindowManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bbz) ipChange.ipc$dispatch("8eea4b02", new Object[]{cartPopupWindowManager}) : cartPopupWindowManager.v;
    }

    public static /* synthetic */ View.OnLayoutChangeListener e(CartPopupWindowManager cartPopupWindowManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View.OnLayoutChangeListener) ipChange.ipc$dispatch("64a2759a", new Object[]{cartPopupWindowManager}) : cartPopupWindowManager.Q;
    }

    public static /* synthetic */ View f(CartPopupWindowManager cartPopupWindowManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("b88814ca", new Object[]{cartPopupWindowManager}) : cartPopupWindowManager.K;
    }

    public static /* synthetic */ List g(CartPopupWindowManager cartPopupWindowManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("cbe76140", new Object[]{cartPopupWindowManager}) : cartPopupWindowManager.M;
    }

    public static /* synthetic */ RecyclerView h(CartPopupWindowManager cartPopupWindowManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RecyclerView) ipChange.ipc$dispatch("666b783e", new Object[]{cartPopupWindowManager}) : cartPopupWindowManager.w;
    }

    public static /* synthetic */ CartRecyclerView i(CartPopupWindowManager cartPopupWindowManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CartRecyclerView) ipChange.ipc$dispatch("dc552aaa", new Object[]{cartPopupWindowManager}) : cartPopupWindowManager.f;
    }

    public static /* synthetic */ String j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6aaa74cf", new Object[0]) : u;
    }

    public static /* synthetic */ boolean j(CartPopupWindowManager cartPopupWindowManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6e66cd08", new Object[]{cartPopupWindowManager})).booleanValue() : cartPopupWindowManager.m();
    }

    public static /* synthetic */ PtrBase k(CartPopupWindowManager cartPopupWindowManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PtrBase) ipChange.ipc$dispatch("88231857", new Object[]{cartPopupWindowManager}) : cartPopupWindowManager.x;
    }

    public static /* synthetic */ b l(CartPopupWindowManager cartPopupWindowManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("ed8d5a6d", new Object[]{cartPopupWindowManager}) : cartPopupWindowManager.P;
    }

    public static /* synthetic */ bcb m(CartPopupWindowManager cartPopupWindowManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bcb) ipChange.ipc$dispatch("ac85764", new Object[]{cartPopupWindowManager}) : cartPopupWindowManager.A;
    }

    public static /* synthetic */ f n(CartPopupWindowManager cartPopupWindowManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("418aa467", new Object[]{cartPopupWindowManager}) : cartPopupWindowManager.y;
    }

    public static /* synthetic */ d o(CartPopupWindowManager cartPopupWindowManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("f7865a5d", new Object[]{cartPopupWindowManager}) : cartPopupWindowManager.L;
    }

    public static /* synthetic */ LinearLayout p(CartPopupWindowManager cartPopupWindowManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LinearLayout) ipChange.ipc$dispatch("6601f315", new Object[]{cartPopupWindowManager}) : cartPopupWindowManager.e;
    }

    public static /* synthetic */ View q(CartPopupWindowManager cartPopupWindowManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("41fd755f", new Object[]{cartPopupWindowManager}) : cartPopupWindowManager.j;
    }

    public static /* synthetic */ AlphaAnimation r(CartPopupWindowManager cartPopupWindowManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AlphaAnimation) ipChange.ipc$dispatch("3591d9b2", new Object[]{cartPopupWindowManager}) : cartPopupWindowManager.l;
    }

    static {
        kge.a(551398764);
        kge.a(96919953);
        u = com.alibaba.ability.localization.b.a(R.string.app_load_completed);
    }

    public CartPopupWindowManager(bbz bbzVar, ViewGroup viewGroup) {
        this.v = bbzVar;
        this.r = viewGroup;
    }

    @Override // tb.bby
    public boolean z() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6ccb805", new Object[]{this})).booleanValue() : this.O;
    }

    @Override // tb.bby
    public void A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a97c48", new Object[]{this});
            return;
        }
        this.O = true;
        this.A = this.v.n();
        this.t = this.v.m();
        this.c = this.v.x().p();
        this.s = (ViewGroup) this.t.getWindow().getDecorView();
        this.d = new FrameLayout(this.t);
        this.f = new CartPopRecyclerView(this.t, this);
        this.C = new CopyOnWriteArrayList();
        this.D = new ArrayList();
        this.F = new Handler(Looper.getMainLooper());
        this.K = new View(this.t);
        this.K.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.K.setBackgroundColor(-1);
        this.M = new ArrayList();
        this.N = new adc(this.f);
        this.M.add(this.N.a());
    }

    @Override // tb.bby
    public void a(bby.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("387b44c1", new Object[]{this, bVar});
        } else if (this.C.contains(bVar)) {
        } else {
            this.C.add(bVar);
        }
    }

    @Override // tb.bby
    public void b(bby.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9256af02", new Object[]{this, bVar});
        } else {
            this.C.remove(bVar);
        }
    }

    @Override // tb.bby
    public void a(List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
            return;
        }
        this.D.clear();
        this.D.addAll(list);
    }

    @Override // tb.bby
    public List<IDMComponent> f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("e89f38ba", new Object[]{this}) : this.D;
    }

    @Override // tb.bby
    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        if (this.p == null) {
            this.p = new CartSkeletonImageView(this.t);
            this.p.setAspectRatio(750, 1148, true);
            this.p.setImageUrl("https://img.alicdn.com/imgextra/i3/O1CN01FR5Bfz1glPISpHTA3_!!6000000004182-2-tps-750-1148.png");
            this.p.setScaleType(ImageView.ScaleType.FIT_XY);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams.addRule(3, R.id.float_header);
            this.p.setLayoutParams(layoutParams);
        }
        RelativeLayout relativeLayout = this.o;
        if (relativeLayout == null || relativeLayout.indexOfChild(this.p) != -1) {
            return;
        }
        this.o.addView(this.p);
    }

    @Override // tb.bby
    public TUrlImageView h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TUrlImageView) ipChange.ipc$dispatch("4a4fd2ad", new Object[]{this}) : this.p;
    }

    @Override // tb.bby
    public int x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6b088f2", new Object[]{this})).intValue();
        }
        int a2 = h.a().a((Context) this.t);
        return (!dcn.a() || h.a().b((Context) this.t)) ? a2 : a2 / 2;
    }

    @Override // tb.bby
    public void a(bnv bnvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e21498ee", new Object[]{this, bnvVar});
        } else {
            this.b = bnvVar;
        }
    }

    @Override // tb.bby
    public bnv d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bnv) ipChange.ipc$dispatch("2617ccd1", new Object[]{this}) : this.b;
    }

    @Override // tb.bby
    public void a(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5598b34f", new Object[]{this, fVar});
            return;
        }
        this.y = fVar;
        this.J = h.a().b(this.c.k());
        if (fVar.l) {
            c(fVar);
        } else {
            b(fVar);
        }
    }

    private void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else if (z) {
            bnv bnvVar = this.b;
            if (bnvVar != null && bnvVar.e() != null && !this.b.e().isEmpty()) {
                this.L.a(this.y);
            } else {
                this.L.a();
            }
            this.v.n().b(this.H);
            this.v.n().b(this.I);
        } else {
            this.L.a(this.y);
        }
    }

    private void b(f fVar) {
        AlphaAnimation alphaAnimation;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18851cae", new Object[]{this, fVar});
            return;
        }
        d(false);
        if (this.j != null && fVar.b() < 0) {
            this.j.setBackgroundColor(fVar.b());
        }
        if (this.h != null) {
            if (fVar.d() != null) {
                this.h.setVisibility(0);
                this.h.setContentDescription(com.alibaba.ability.localization.b.a(R.string.app_close));
                this.h.setImageDrawable(fVar.d());
                this.h.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.icart.manager.CartPopupWindowManager.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        } else {
                            CartPopupWindowManager.this.a(true);
                        }
                    }
                });
            } else {
                this.h.setVisibility(8);
            }
        }
        if (fVar.c() < 0) {
            float e = fVar.e();
            float f = fVar.f();
            if (dcn.a()) {
                ((RoundRelativeLayout) this.o).setRadius(0.0f, 0.0f, 0.0f, 0.0f);
                e = 0.0f;
                f = 0.0f;
            }
            this.o.setBackgroundDrawable(bpl.a(fVar.c(), e, f));
        }
        CartSkeletonImageView cartSkeletonImageView = this.p;
        if (cartSkeletonImageView != null) {
            cartSkeletonImageView.setVisibility(8);
        }
        View view = this.j;
        if (view != null) {
            view.setEnabled(true);
        }
        a(127);
        t();
        View view2 = this.j;
        if (view2 != null && (alphaAnimation = this.k) != null) {
            view2.startAnimation(alphaAnimation);
        }
        TranslateAnimation translateAnimation = this.m;
        if (translateAnimation != null) {
            this.o.startAnimation(translateAnimation);
        }
        if (this.d.getParent() == null) {
            if (fVar.g() != null) {
                this.r.addView(this.d);
            } else {
                this.s.addView(this.d);
            }
        }
        b(fVar.h());
        if (this.G != null) {
            return;
        }
        this.G = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.taobao.android.icart.manager.CartPopupWindowManager.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("df7e7eb3", new Object[]{this});
                } else if (!CartPopupWindowManager.this.b()) {
                } else {
                    View decorView = CartPopupWindowManager.a(CartPopupWindowManager.this).getWindow().getDecorView();
                    Rect rect = new Rect();
                    decorView.getWindowVisibleDisplayFrame(rect);
                    int height = rect.height();
                    if (height != CartPopupWindowManager.this.f12812a) {
                        if (dcn.a()) {
                            CartPopupWindowManager.c(CartPopupWindowManager.this).post(new Runnable() { // from class: com.taobao.android.icart.manager.CartPopupWindowManager.5.1
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public void run() {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                    } else {
                                        CartPopupWindowManager.b(CartPopupWindowManager.this);
                                    }
                                }
                            });
                        } else {
                            CartPopupWindowManager.b(CartPopupWindowManager.this);
                        }
                        CartPopupWindowManager.a(CartPopupWindowManager.this, height);
                    }
                    CartPopupWindowManager.this.f12812a = height;
                }
            }
        };
        this.s.getViewTreeObserver().addOnGlobalLayoutListener(this.G);
    }

    private void c(f fVar) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db71860d", new Object[]{this, fVar});
        } else if (this.d == null) {
            bed.a("CartPopupWindowManager#showWithStdPop", "contentView is null");
        } else {
            d(true);
            a(127);
            ViewParent parent = this.d.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.d);
            }
            final jet jetVar = new jet();
            jetVar.a(fVar.a());
            jetVar.a(this.d);
            jetVar.e(jqi.a("iCart", ieu.sEnablePanForStdPop, false));
            if (fVar.g() == null) {
                z = true;
            }
            jetVar.d(z);
            if (!z) {
                jetVar.a(Integer.valueOf(R.id.cart_pop_placeholder));
            }
            jetVar.b(!z);
            jetVar.c(!z);
            this.d.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            this.d.setBackgroundColor(fVar.c());
            bez x = this.v.x();
            if (x != null && x.r() != null) {
                x.r().post(new Runnable() { // from class: com.taobao.android.icart.manager.CartPopupWindowManager.6
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            CartPopupWindowManager.a(CartPopupWindowManager.this, jetVar);
                        }
                    }
                });
            } else {
                a(jetVar);
            }
            b(fVar.h());
            jqg.b("CartPopupWindowManager", ieu.sShowWithStdPop);
        }
    }

    private void a(final jet jetVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef3ba19f", new Object[]{this, jetVar});
        } else {
            jdc.a(this.v, jetVar, new rul<pwr, t>() { // from class: com.taobao.android.icart.manager.CartPopupWindowManager.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Type inference failed for: r4v4, types: [kotlin.t, java.lang.Object] */
                @Override // tb.rul
                /* renamed from: invoke */
                public /* synthetic */ t mo2421invoke(pwr pwrVar) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("c9923577", new Object[]{this, pwrVar}) : a(pwrVar);
                }

                public t a(pwr pwrVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (t) ipChange2.ipc$dispatch("3b946dd2", new Object[]{this, pwrVar});
                    }
                    if (jetVar.k() == null) {
                        return null;
                    }
                    try {
                        ViewGroup r = CartPopupWindowManager.d(CartPopupWindowManager.this).x().r();
                        if (CartPopupWindowManager.e(CartPopupWindowManager.this) != null) {
                            r.removeOnLayoutChangeListener(CartPopupWindowManager.e(CartPopupWindowManager.this));
                        }
                        CartPopupWindowManager.a(CartPopupWindowManager.this, new View.OnLayoutChangeListener() { // from class: com.taobao.android.icart.manager.CartPopupWindowManager.7.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // android.view.View.OnLayoutChangeListener
                            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("899df952", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8)});
                                } else {
                                    jdc.a(CartPopupWindowManager.d(CartPopupWindowManager.this), jetVar);
                                }
                            }
                        });
                        r.addOnLayoutChangeListener(CartPopupWindowManager.e(CartPopupWindowManager.this));
                        return null;
                    } catch (Throwable th) {
                        bed.a("CartPopupWindowManager#onShow", th.getMessage());
                        return null;
                    }
                }
            }, new rul<Map<String, ?>, t>() { // from class: com.taobao.android.icart.manager.CartPopupWindowManager.8
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Type inference failed for: r4v4, types: [kotlin.t, java.lang.Object] */
                @Override // tb.rul
                /* renamed from: invoke */
                public /* synthetic */ t mo2421invoke(Map<String, ?> map) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("c9923577", new Object[]{this, map}) : a(map);
                }

                public t a(Map<String, ?> map) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (t) ipChange2.ipc$dispatch("153b0d62", new Object[]{this, map});
                    }
                    try {
                        ViewGroup r = CartPopupWindowManager.d(CartPopupWindowManager.this).x().r();
                        if (CartPopupWindowManager.e(CartPopupWindowManager.this) != null) {
                            r.removeOnLayoutChangeListener(CartPopupWindowManager.e(CartPopupWindowManager.this));
                        }
                        if (CartPopupWindowManager.c(CartPopupWindowManager.this) != null && (CartPopupWindowManager.c(CartPopupWindowManager.this).getParent() instanceof ViewGroup)) {
                            ((ViewGroup) CartPopupWindowManager.c(CartPopupWindowManager.this).getParent()).removeView(CartPopupWindowManager.c(CartPopupWindowManager.this));
                        }
                        CartPopupWindowManager.a(CartPopupWindowManager.this, true);
                        return null;
                    } catch (Throwable th) {
                        bed.a("CartPopupWindowManager#onDismiss", th.getMessage());
                        return null;
                    }
                }
            });
        }
    }

    @Override // tb.bby
    public ViewGroup y() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("2009e995", new Object[]{this}) : this.e;
    }

    @Override // tb.bby
    public RecyclerView a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RecyclerView) ipChange.ipc$dispatch("f629a75c", new Object[]{this}) : this.f;
    }

    @Override // tb.bby
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else if (!this.E) {
        } else {
            f fVar = this.y;
            if (fVar != null && fVar.l) {
                jdc.a(this.t, (pwr) null, z);
            } else if (z) {
                View view = this.j;
                if (view != null) {
                    view.startAnimation(this.l);
                }
                RelativeLayout relativeLayout = this.o;
                if (relativeLayout != null) {
                    relativeLayout.startAnimation(this.n);
                }
                if (jqi.a("iCart", "enableCartPopDismissAnimationV2", true)) {
                    this.n.setDuration(200L);
                    s();
                    w();
                    this.F.postDelayed(new Runnable() { // from class: com.taobao.android.icart.manager.CartPopupWindowManager.9
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                CartPopupWindowManager.a(CartPopupWindowManager.this, false);
                            }
                        }
                    }, 200L);
                    this.o.clearFocus();
                    return;
                }
                c(true);
            } else {
                c(true);
            }
        }
    }

    @Override // tb.bby
    public void a(bby.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("387ad062", new Object[]{this, aVar});
        } else {
            this.q = aVar;
        }
    }

    @Override // tb.bby
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else if (this.b == null || !this.E) {
        } else {
            if (jqi.a("iCart", "downloadTemplatesAtPopup", true)) {
                this.c.g();
            }
            u();
            if ((i & 1) != 0) {
                p();
            }
            if ((i & 2) != 0) {
                q();
            }
            if ((i & 4) != 0) {
                r();
            }
            if (!dcn.a()) {
                return;
            }
            this.c.f(DXWidgetNode.DXMeasureSpec.a(h.a().a(this.c.k()), 1073741824));
        }
    }

    @Override // tb.bby
    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.d.getParent() != null;
    }

    @Override // tb.bby
    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        ViewGroup viewGroup = this.s;
        return (viewGroup == null || viewGroup.indexOfChild(this.d) == -1) ? false : true;
    }

    @Override // tb.bby
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        CartRecyclerView cartRecyclerView = this.f;
        if (cartRecyclerView != null) {
            cartRecyclerView.resetScroll();
            this.f.scrollToPosition(0);
        }
        RecyclerView recyclerView = this.w;
        if (recyclerView == null) {
            return;
        }
        recyclerView.scrollToPosition(0);
    }

    private void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
        } else if (!jqi.a("iCart", "enablePopPaddingView", true)) {
        } else {
            if (i - this.f12812a < 0) {
                if (this.K.getParent() != null) {
                    return;
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.K.getLayoutParams();
                int a2 = bet.a(this.t);
                layoutParams.height = a2;
                layoutParams.topMargin = bet.b(this.t) - a2;
                this.d.addView(this.K);
            } else if (this.K.getParent() == null) {
            } else {
                this.K.post(new Runnable() { // from class: com.taobao.android.icart.manager.CartPopupWindowManager.10
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            CartPopupWindowManager.c(CartPopupWindowManager.this).removeView(CartPopupWindowManager.f(CartPopupWindowManager.this));
                        }
                    }
                });
            }
        }
    }

    private void t() {
        int a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6782afb", new Object[]{this});
        } else if (this.y == null) {
        } else {
            this.J = h.a().b(this.c.k());
            View g = this.y.g();
            if (g != null) {
                g.getLocationOnScreen(new int[2]);
                a2 = g.getHeight();
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.r.getLayoutParams();
                marginLayoutParams.bottomMargin = a2;
                this.r.setLayoutParams(marginLayoutParams);
            } else {
                a2 = bet.a(this.t);
            }
            if (this.y.a() > 0.0f) {
                int height = (g != null ? this.v.x().c() : this.s).getHeight();
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.o.getLayoutParams();
                int i = height - a2;
                if (dcn.a()) {
                    if (this.J) {
                        layoutParams.height = (int) (i * this.y.a());
                        layoutParams.width = x();
                        layoutParams.gravity = 80;
                    } else {
                        layoutParams.height = i;
                        layoutParams.width = x();
                        layoutParams.gravity = 85;
                    }
                } else {
                    layoutParams.height = (int) (i * this.y.a());
                }
                layoutParams.bottomMargin = g != null ? 0 : a2;
                this.o.setLayoutParams(layoutParams);
            }
            View view = this.j;
            if (view == null) {
                return;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            if (a2 > 0) {
                if (dcn.a()) {
                    if (this.J || g == null) {
                        marginLayoutParams2.bottomMargin = a2;
                    } else {
                        marginLayoutParams2.bottomMargin = 0;
                    }
                } else {
                    marginLayoutParams2.bottomMargin = a2;
                }
            } else {
                marginLayoutParams2.bottomMargin = 0;
            }
            this.j.setLayoutParams(marginLayoutParams2);
        }
    }

    private void u() {
        int a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("686427c", new Object[]{this});
        } else if (this.f == null || !dcn.a()) {
        } else {
            int a3 = h.a().a((Context) this.t);
            if (this.J) {
                a2 = DXWidgetNode.DXMeasureSpec.a(a3, 1073741824);
            } else {
                a2 = DXWidgetNode.DXMeasureSpec.a(a3 / 2, 1073741824);
            }
            this.c.f(a2);
            this.f.setTag(new Pair("PopWidthSpec", Integer.valueOf(a2)));
        }
    }

    private void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad405d49", new Object[]{this, new Boolean(z)});
            return;
        }
        if (!this.E) {
            e(z);
            o();
            n();
            this.E = true;
        }
        for (bby.b bVar : this.C) {
            bVar.a();
        }
        this.f.removeAllViews();
        this.f.setPadding(0, 0, 0, 0);
        if (this.P != null) {
            a(false, CartRecommendRefreshScene.build);
        }
        this.v.n().a(this.H);
        this.v.n().a(this.I);
        this.x.setMode(PullBase.Mode.DISABLED);
        this.F.removeCallbacksAndMessages(null);
    }

    private void e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef535e8", new Object[]{this, new Boolean(z)});
            return;
        }
        if (!z) {
            this.j = new View(this.t);
            this.j.setBackgroundColor(Color.parseColor("#7F000000"));
            this.d.addView(this.j, new FrameLayout.LayoutParams(-1, -1));
        }
        this.o = (RelativeLayout) LayoutInflater.from(this.t).inflate(R.layout.icart_cart_float, (ViewGroup) this.d, false);
        this.o.setClickable(true);
        this.e = (LinearLayout) this.o.findViewById(R.id.float_header);
        this.g = (LinearLayout) this.o.findViewById(R.id.float_bottom);
        this.h = (ImageView) this.o.findViewById(R.id.float_popup_close_button);
        if (z) {
            this.h.setVisibility(8);
        }
        this.x = (PtrBase) this.o.findViewById(R.id.float_ptr);
        ViewParent parent = this.f.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f);
        } else if (this.x.indexOfChild(this.f) == -1) {
            this.x.addView(this.f, new ViewGroup.LayoutParams(-1, -1));
        }
        this.f.setFooterView(this.v.x().u());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2, 80);
        if (dcn.a() && !this.J) {
            layoutParams.gravity = GravityCompat.END;
        }
        this.d.addView(this.o, layoutParams);
        this.i = new bnn(this.c) { // from class: com.taobao.android.icart.manager.CartPopupWindowManager.11
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass11 anonymousClass11, String str, Object... objArr) {
                if (str.hashCode() == 644526294) {
                    super.a((com.alibaba.android.ultron.vfw.viewholder.h) objArr[0], ((Number) objArr[1]).intValue());
                    return null;
                }
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }

            @Override // tb.bnn, android.support.v7.widget.RecyclerView.Adapter
            public /* synthetic */ void onBindViewHolder(com.alibaba.android.ultron.vfw.viewholder.h hVar, int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("1071b8aa", new Object[]{this, hVar, new Integer(i)});
                } else {
                    a(hVar, i);
                }
            }

            @Override // tb.bnn
            public void a(com.alibaba.android.ultron.vfw.viewholder.h hVar, int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("266ab0d6", new Object[]{this, hVar, new Integer(i)});
                    return;
                }
                super.a(hVar, i);
                goh.a(CartPopupWindowManager.d(CartPopupWindowManager.this), this.c, hVar, i);
                for (bey beyVar : CartPopupWindowManager.g(CartPopupWindowManager.this)) {
                    beyVar.a(this.c, hVar, i);
                }
            }
        };
        this.z = new i(this.c.k());
        this.z.a(this.f);
        this.z.setOrientation(1);
        this.z.a(false);
        this.f.setLayoutManager(this.z);
        this.f.setAdapter(this.i);
        this.f.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.taobao.android.icart.manager.CartPopupWindowManager.12
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass12 anonymousClass12, String str, Object... objArr) {
                if (str.hashCode() == 806944192) {
                    super.onScrolled((RecyclerView) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
                    return null;
                }
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }

            @Override // android.support.v7.widget.RecyclerView.OnScrollListener
            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3018fdc0", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
                    return;
                }
                super.onScrolled(recyclerView, i, i2);
                if (((LinearLayoutManager) recyclerView.getLayoutManager()).findFirstVisibleItemPosition() != 0 || CartPopupWindowManager.h(CartPopupWindowManager.this) == null) {
                    return;
                }
                CartPopupWindowManager.h(CartPopupWindowManager.this).scrollToPosition(0);
            }
        });
        this.x.setMode(PullBase.Mode.DISABLED);
        this.x.mo1212getStartLayout().setLoadingDelegate(new com.taobao.android.icart.widget.refresh.c(this.c.k(), this.v));
        this.x.setOnRefreshListener(new PtrBase.a() { // from class: com.taobao.android.icart.manager.CartPopupWindowManager.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.ptr.PtrBase.a
            public void onPullStartToRefresh(PtrBase ptrBase) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("da00fd4d", new Object[]{this, ptrBase});
                }
            }

            @Override // com.taobao.ptr.PtrBase.a
            public void onPullEndToRefresh(PtrBase ptrBase) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("dc9b6974", new Object[]{this, ptrBase});
                } else {
                    CartPopupWindowManager.d(CartPopupWindowManager.this).b(true, null, new jnv() { // from class: com.taobao.android.icart.manager.CartPopupWindowManager.2.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // tb.joc
                        public void a(int i, MtopResponse mtopResponse, Object obj, jny jnyVar, Map<String, ?> map) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("b57ff8e", new Object[]{this, new Integer(i), mtopResponse, obj, jnyVar, map});
                            }
                        }

                        @Override // tb.joc
                        public void a(int i, MtopResponse mtopResponse, Object obj, boolean z2, Map<String, ?> map) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("dc169ead", new Object[]{this, new Integer(i), mtopResponse, obj, new Boolean(z2), map});
                            }
                        }

                        @Override // tb.jnv
                        public boolean a(int i, MtopResponse mtopResponse, Object obj) {
                            IpChange ipChange3 = $ipChange;
                            return ipChange3 instanceof IpChange ? ((Boolean) ipChange3.ipc$dispatch("1f4c7080", new Object[]{this, new Integer(i), mtopResponse, obj})).booleanValue() : !CartPopupWindowManager.this.b();
                        }
                    });
                }
            }
        });
        l();
        this.f.setOnEndViewExposure(new CartRecyclerView.a() { // from class: com.taobao.android.icart.manager.CartPopupWindowManager.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.icart.widget.CartRecyclerView.a
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                } else {
                    CartPopupWindowManager.i(CartPopupWindowManager.this).setOnEndViewExposure(new CartRecyclerView.a() { // from class: com.taobao.android.icart.manager.CartPopupWindowManager.3.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.taobao.android.icart.widget.CartRecyclerView.a
                        public void a() {
                            IpChange ipChange3 = $ipChange;
                            boolean z2 = true;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("56c6c68", new Object[]{this});
                                return;
                            }
                            bbz d = CartPopupWindowManager.d(CartPopupWindowManager.this);
                            String[] strArr = new String[1];
                            StringBuilder sb = new StringBuilder();
                            sb.append("isMain=");
                            if (TBMainHost.a().getContext() != CartPopupWindowManager.a(CartPopupWindowManager.this)) {
                                z2 = false;
                            }
                            sb.append(z2);
                            strArr[0] = sb.toString();
                            bex.c(d, "Page_ShoppingCart_PopLayer_LoadMore", strArr);
                        }
                    });
                }
            }
        });
        this.L = new d(this.v, this.N, this.o, this.f);
    }

    private void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
        } else {
            this.P = new c(this.f, this.v, "main");
        }
    }

    private boolean m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6158678", new Object[]{this})).booleanValue() : this.v.n().d(this.v.n().e());
    }

    private void a(boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7197a36", new Object[]{this, new Boolean(z), str});
            return;
        }
        RecyclerView recyclerView = this.w;
        if (recyclerView == null) {
            return;
        }
        if (z) {
            recyclerView.scrollToPosition(0);
            if (!this.P.h()) {
                return;
            }
            this.P.d();
            this.P.f();
            this.P.e();
            this.P.a(str);
            osc oscVar = this.B;
            if (oscVar == null) {
                return;
            }
            this.P.a(oscVar);
            return;
        }
        CartRecyclerView cartRecyclerView = this.f;
        if (cartRecyclerView == null) {
            return;
        }
        cartRecyclerView.removeEndView(recyclerView);
    }

    private void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
            return;
        }
        this.k = new AlphaAnimation(0.0f, 1.0f);
        this.k.setDuration(200L);
        this.l = new AlphaAnimation(1.0f, 0.0f);
        this.l.setDuration(200L);
        i();
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        if (dcn.a()) {
            if (this.J) {
                this.m = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
                this.n = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, 1.0f);
            } else {
                this.m = new TranslateAnimation(1, 1.0f, 1, 0.0f, 1, 0.0f, 1, 0.0f);
                this.n = new TranslateAnimation(1, 0.0f, 1, 1.0f, 1, 0.0f, 1, 0.0f);
            }
        } else {
            this.m = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
            this.n = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, 1.0f);
        }
        this.m.setDuration(200L);
        this.n.setDuration(200L);
        this.m.setAnimationListener(new Animation.AnimationListener() { // from class: com.taobao.android.icart.manager.CartPopupWindowManager.14
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8f2883e7", new Object[]{this, animation});
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f2d146c4", new Object[]{this, animation});
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                View childAt;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("724c33d", new Object[]{this, animation});
                } else if (CartPopupWindowManager.p(CartPopupWindowManager.this) == null || !(CartPopupWindowManager.p(CartPopupWindowManager.this).getChildAt(0) instanceof DXRootView) || (childAt = ((DXRootView) CartPopupWindowManager.p(CartPopupWindowManager.this).getChildAt(0)).getChildAt(0)) == null) {
                } else {
                    childAt.sendAccessibilityEvent(8);
                }
            }
        });
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            return;
        }
        if (i == 2) {
            z = false;
        }
        this.J = z;
    }

    private void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
            return;
        }
        if (this.d.getParent() instanceof ViewGroup) {
            ((ViewGroup) this.d.getParent()).removeView(this.d);
        }
        this.v.n().a(this.H);
        this.v.n().a(this.I);
        if (z) {
            s();
            w();
        }
        if (this.w != null) {
            this.P.b();
        }
        this.D.clear();
        this.b = null;
        this.f.removeAllViews();
    }

    private void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a2717e", new Object[]{this});
            return;
        }
        bby.a aVar = this.q;
        if (aVar != null) {
            aVar.a(this.y);
        }
        for (bby.b bVar : this.C) {
            bVar.b();
        }
    }

    private void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b576", new Object[]{this});
            return;
        }
        View view = this.j;
        if (view != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.icart.manager.CartPopupWindowManager.15
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view2});
                        return;
                    }
                    CartPopupWindowManager.q(CartPopupWindowManager.this).setEnabled(false);
                    CartPopupWindowManager.this.a(true);
                }
            });
        }
        this.d.setOnKeyListener(new View.OnKeyListener() { // from class: com.taobao.android.icart.manager.CartPopupWindowManager.16
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnKeyListener
            public boolean onKey(View view2, int i, KeyEvent keyEvent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("bdbaa648", new Object[]{this, view2, new Integer(i), keyEvent})).booleanValue();
                }
                if (i == 4 && CartPopupWindowManager.this.b() && !CartPopupWindowManager.r(CartPopupWindowManager.this).hasStarted()) {
                    CartPopupWindowManager.this.a(true);
                }
                return false;
            }
        });
    }

    private void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63fccf7", new Object[]{this});
            return;
        }
        LinearLayout linearLayout = this.e;
        if (linearLayout == null) {
            return;
        }
        if (linearLayout.getChildCount() > 0) {
            this.e.removeAllViews();
        }
        j jVar = (j) this.c.a(j.class);
        List<IDMComponent> e = this.b.e();
        if (e == null || e.size() <= 0) {
            return;
        }
        for (IDMComponent iDMComponent : e) {
            com.alibaba.android.ultron.vfw.viewholder.h a2 = jVar.a(this.v.x().t(), jVar.a(iDMComponent));
            View view = a2.itemView;
            if (view != null) {
                this.e.addView(view);
            }
            jVar.a(a2, iDMComponent);
        }
    }

    private void q() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64de478", new Object[]{this});
            return;
        }
        List<IDMComponent> f = this.b.f();
        if (f != null && f.size() == 1) {
            IDMComponent iDMComponent = f.get(0);
            if (iDMComponent != null && "dinamicx".equals(iDMComponent.getContainerType())) {
                z = true;
            }
            this.z.a(z);
        } else {
            this.z.a(true);
        }
        this.i.b(f);
        this.i.notifyDataSetChanged();
    }

    private void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65bfbf9", new Object[]{this});
            return;
        }
        LinearLayout linearLayout = this.g;
        if (linearLayout == null) {
            return;
        }
        if (linearLayout.getChildCount() > 0) {
            this.g.removeAllViews();
        }
        List<IDMComponent> g = this.b.g();
        j jVar = (j) this.c.a(j.class);
        if (g == null || g.size() <= 0) {
            return;
        }
        for (IDMComponent iDMComponent : g) {
            com.alibaba.android.ultron.vfw.viewholder.h a2 = jVar.a(this.v.x().r(), jVar.a(iDMComponent));
            View view = a2.itemView;
            if (view != null) {
                this.g.addView(view);
            }
            jVar.a(a2, iDMComponent);
        }
    }

    private void s() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66a137a", new Object[]{this});
            return;
        }
        this.L.a();
        String e = this.A.e();
        this.A.b("");
        this.A.a("");
        if (!this.y.h()) {
            this.v.x().n();
            return;
        }
        IDMComponent e2 = this.A.e("cartTimePromotion");
        if (e2 != null) {
            e2.getData().put("status", (Object) "normal");
        }
        jny w = this.A.w();
        if (w instanceof com.taobao.android.ultron.datamodel.imp.b) {
            IDMComponent b = w.b(e);
            if (b != null && b.getFields() != null && b.getFields().getBooleanValue("refreshMainPageAfterDismissPop")) {
                this.v.k();
                this.y.b(true);
                z = true;
            }
            if (!z) {
                com.taobao.android.ultron.datamodel.imp.b bVar = (com.taobao.android.ultron.datamodel.imp.b) w;
                bVar.t().b(bVar);
                com.alibaba.android.icart.core.data.c.a(this.A, bVar);
                this.v.x().a(this.v.n().x());
            }
        }
        if (!(this.K.getParent() instanceof ViewGroup)) {
            return;
        }
        ((ViewGroup) this.K.getParent()).removeView(this.K);
    }

    /* loaded from: classes5.dex */
    public static class CartPopRecyclerView extends CartRecyclerView {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private WeakReference<CartPopupWindowManager> mManagerWeakReference;

        static {
            kge.a(286765533);
        }

        public CartPopRecyclerView(Context context, CartPopupWindowManager cartPopupWindowManager) {
            super(context);
            this.mManagerWeakReference = new WeakReference<>(cartPopupWindowManager);
        }

        @Override // com.taobao.android.icart.widget.CartRecyclerView
        public int getRecyclerViewPaddingBottom() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("1d1f513c", new Object[]{this})).intValue();
            }
            CartPopupWindowManager cartPopupWindowManager = this.mManagerWeakReference.get();
            if (this.mFooterView == null || cartPopupWindowManager == null || cartPopupWindowManager.c()) {
                return 0;
            }
            if (CartPopupWindowManager.n(cartPopupWindowManager) != null && CartPopupWindowManager.n(cartPopupWindowManager).l) {
                return 0;
            }
            return Math.max(bei.b(CartPopupWindowManager.d(cartPopupWindowManager)), 0);
        }
    }
}
