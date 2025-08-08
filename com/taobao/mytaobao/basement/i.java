package com.taobao.mytaobao.basement;

import android.app.Activity;
import android.net.Uri;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.model.UltronTradeHybridInstanceRenderMode;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.android.weex.WeexInstance;
import com.taobao.android.weex.WeexInstanceImpl;
import com.taobao.android.weex_framework.p;
import com.taobao.monitor.procedure.v;
import com.taobao.mytaobao.base.d;
import com.taobao.mytaobao.basement.Bridge.MtbBasementWeexApiPlugin;
import com.taobao.mytaobao.basement.weex.BasementWeexView;
import com.taobao.mytaobao.basement.weex.g;
import com.taobao.mytaobao.view.MTPtrRecyclerView;
import com.taobao.tao.log.TLog;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import com.ut.mini.UTAnalytics;
import java.util.HashMap;
import tb.jvb;
import tb.kge;
import tb.ljl;
import tb.mtq;
import tb.mtr;
import tb.mts;
import tb.mtt;
import tb.mtu;
import tb.mtw;
import tb.mtx;
import tb.mtz;
import tb.mua;
import tb.mxe;
import tb.mxf;
import tb.nwv;
import tb.sdw;

/* loaded from: classes7.dex */
public class i implements com.taobao.mytaobao.base.e, mtu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private MTBBasementContainerView f18322a;
    private final MTPtrRecyclerView b;
    private volatile boolean c;
    private MTBBasementFrameLayout d;
    private final d e;
    private final Activity f;
    private boolean g;
    private f h;
    private mts i;
    private RecyclerView.OnScrollListener k;
    private e m;
    private boolean o;
    private boolean p;
    private Runnable r;
    private c s;
    private h t;
    private final b u;
    private final a v;
    public final sdw w;
    private final com.taobao.mytaobao.basement.weex.e y;
    private final l z = new l();
    private boolean B = false;

    static {
        kge.a(2045102894);
        kge.a(-18560098);
        kge.a(1127814513);
    }

    public static /* synthetic */ MTBBasementContainerView a(i iVar, MTBBasementContainerView mTBBasementContainerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MTBBasementContainerView) ipChange.ipc$dispatch("c4392812", new Object[]{iVar, mTBBasementContainerView});
        }
        iVar.f18322a = mTBBasementContainerView;
        return mTBBasementContainerView;
    }

    public static /* synthetic */ e a(i iVar, e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("e869a7aa", new Object[]{iVar, eVar});
        }
        iVar.m = eVar;
        return eVar;
    }

    public static /* synthetic */ f a(i iVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("a7c2bdd1", new Object[]{iVar}) : iVar.h;
    }

    public static /* synthetic */ f a(i iVar, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("4f42678a", new Object[]{iVar, fVar});
        }
        iVar.h = fVar;
        return fVar;
    }

    public static /* synthetic */ Runnable a(i iVar, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Runnable) ipChange.ipc$dispatch("f9bd09ea", new Object[]{iVar, runnable});
        }
        iVar.r = runnable;
        return runnable;
    }

    public static /* synthetic */ void a(i iVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29230d97", new Object[]{iVar, new Integer(i)});
        } else {
            iVar.d(i);
        }
    }

    public static /* synthetic */ void a(i iVar, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fd15fde", new Object[]{iVar, str, new Boolean(z)});
        } else {
            iVar.b(str, z);
        }
    }

    public static /* synthetic */ void a(i iVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29234d68", new Object[]{iVar, new Boolean(z)});
        } else {
            iVar.e(z);
        }
    }

    public static /* synthetic */ MTPtrRecyclerView b(i iVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MTPtrRecyclerView) ipChange.ipc$dispatch("fa252715", new Object[]{iVar}) : iVar.b;
    }

    public static /* synthetic */ boolean b(i iVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8a75ea0b", new Object[]{iVar, new Boolean(z)})).booleanValue();
        }
        iVar.g = z;
        return z;
    }

    public static /* synthetic */ boolean c(i iVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("30e569f2", new Object[]{iVar})).booleanValue() : iVar.g;
    }

    public static /* synthetic */ boolean c(i iVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ebc886aa", new Object[]{iVar, new Boolean(z)})).booleanValue();
        }
        iVar.o = z;
        return z;
    }

    public static /* synthetic */ MTBBasementFrameLayout d(i iVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MTBBasementFrameLayout) ipChange.ipc$dispatch("6d53b4d5", new Object[]{iVar}) : iVar.d;
    }

    public static /* synthetic */ boolean d(i iVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4d1b2349", new Object[]{iVar, new Boolean(z)})).booleanValue();
        }
        iVar.c = z;
        return z;
    }

    public static /* synthetic */ boolean e(i iVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("583510f4", new Object[]{iVar})).booleanValue() : iVar.B;
    }

    public static /* synthetic */ boolean e(i iVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ae6dbfe8", new Object[]{iVar, new Boolean(z)})).booleanValue();
        }
        iVar.p = z;
        return z;
    }

    public static /* synthetic */ com.taobao.mytaobao.basement.weex.e f(i iVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.mytaobao.basement.weex.e) ipChange.ipc$dispatch("7e07c88d", new Object[]{iVar}) : iVar.y;
    }

    public static /* synthetic */ MTBBasementContainerView g(i iVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MTBBasementContainerView) ipChange.ipc$dispatch("e15018e9", new Object[]{iVar}) : iVar.f18322a;
    }

    public static /* synthetic */ e h(i iVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("eec4a44b", new Object[]{iVar}) : iVar.m;
    }

    public static /* synthetic */ void i(i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6d45ef4", new Object[]{iVar});
        } else {
            iVar.z();
        }
    }

    public static /* synthetic */ RecyclerView.OnScrollListener j(i iVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RecyclerView.OnScrollListener) ipChange.ipc$dispatch("b0fb5823", new Object[]{iVar}) : iVar.k;
    }

    public static /* synthetic */ Activity k(i iVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Activity) ipChange.ipc$dispatch("4bc24a72", new Object[]{iVar}) : iVar.f;
    }

    public static /* synthetic */ d l(i iVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("aefa8fc6", new Object[]{iVar}) : iVar.e;
    }

    public static /* synthetic */ c m(i iVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("fcea91e8", new Object[]{iVar}) : iVar.s;
    }

    public static /* synthetic */ h n(i iVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (h) ipChange.ipc$dispatch("99588ee2", new Object[]{iVar}) : iVar.t;
    }

    public static /* synthetic */ b o(i iVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("de50e922", new Object[]{iVar}) : iVar.u;
    }

    public static /* synthetic */ void p(i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("306b277b", new Object[]{iVar});
        } else {
            iVar.x();
        }
    }

    public static /* synthetic */ boolean q(i iVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4412fb00", new Object[]{iVar})).booleanValue() : iVar.o;
    }

    public static /* synthetic */ boolean r(i iVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57bace81", new Object[]{iVar})).booleanValue() : iVar.c;
    }

    public static /* synthetic */ l s(i iVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (l) ipChange.ipc$dispatch("a77e7d39", new Object[]{iVar}) : iVar.z;
    }

    public i(MTPtrRecyclerView mTPtrRecyclerView, d dVar) {
        nwv.b("controller 0");
        Activity m = dVar.m();
        this.b = mTPtrRecyclerView;
        this.s = new c(mTPtrRecyclerView);
        nwv.b("controller 0.5");
        this.t = new h(mTPtrRecyclerView, this);
        nwv.b("controller 1");
        this.f = m;
        this.e = dVar;
        this.h = new f(this, m);
        this.u = new b();
        nwv.b("controller 2");
        this.y = new com.taobao.mytaobao.basement.weex.e(this.u);
        this.v = new a();
        nwv.b("controller 3");
        this.w = new sdw();
        nwv.b("controller 4");
    }

    public b a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("acd11674", new Object[]{this}) : this.u;
    }

    public void c(final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
        } else {
            this.b.post(new Runnable() { // from class: com.taobao.mytaobao.basement.i.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (i.this.b(i)) {
                    } else {
                        i.a(i.this).a();
                    }
                }
            });
        }
    }

    private void d(int i) {
        int width;
        final int i2;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad401d78", new Object[]{this, new Integer(i)});
            return;
        }
        this.d = (MTBBasementFrameLayout) View.inflate(this.f, R.layout.mtb_second_floor_opt, null);
        nwv.b("beforeInitData 6.51");
        if (com.taobao.mytaobao.base.c.d()) {
            this.d.setTag(v.APM_VIEW_TOKEN, v.APM_VIEW_VALID);
        } else if (!com.taobao.mytaobao.base.c.k()) {
            this.d.setTag(v.APM_VIEW_TOKEN, v.APM_VIEW_IGNORE);
        }
        int n = this.e.n();
        if (i > 0) {
            width = i;
        } else if (this.e.c() != null) {
            width = this.e.c().getWidth();
        } else {
            width = this.b.getWidth();
        }
        nwv.b("beforeInitData 6.52");
        boolean z2 = n > 0;
        if (width <= 0) {
            z = false;
        }
        if (z & z2) {
            TLog.loge(BasementConstants.WEEX_TAG, "setLayoutParams 第一次初始化basementHeight, 有值," + n);
            this.d.setLayoutParams(new ViewGroup.MarginLayoutParams(width, n));
        }
        nwv.b("beforeInitData 6.53");
        final ImageView imageView = (ImageView) this.d.findViewById(R.id.basement_background_pic);
        TUrlImageView tUrlImageView = (TUrlImageView) this.d.findViewById(R.id.mtb_back_to_mainpage);
        tUrlImageView.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.mytaobao.basement.i.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                i.b(i.this).smoothScrollToPosition(0);
                com.taobao.mytaobao.ut.c.a("Page_MyTaobao", "Page_MyTaobao_click-returnTop", "a2141.7631743.1102.1", (String) null, (JSONObject) null);
                if (!i.c(i.this)) {
                    return;
                }
                i.this.c(BasementConstants.BEHAVIOR_RETURN_TOP_TAP);
            }
        });
        nwv.b("beforeInitData 6.54");
        mtz.a(new Runnable() { // from class: com.taobao.mytaobao.basement.i.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    i.b(i.this).safeAddEndView(i.d(i.this), true);
                }
            }
        });
        nwv.b("beforeInitData 6.55");
        this.b.setBasementView(this.d);
        tUrlImageView.setImageUrl("https://gw.alicdn.com/imgextra/i3/O1CN0102AGvY1sfhbYFAQhR_!!6000000005794-2-tps-78-78.png");
        if (StringUtils.equals("2", com.taobao.mytaobao.base.c.o()) || StringUtils.equals("3", com.taobao.mytaobao.base.c.o())) {
            i2 = R.drawable.mtb_basement_placeholder2;
        } else {
            i2 = R.drawable.mtb_basement_placeholder;
        }
        imageView.setVisibility(0);
        nwv.b("beforeInitData 6.56");
        nwv.a("dsw", "准备加载placeHolder");
        com.taobao.mytaobao.base.b.a(new Runnable() { // from class: com.taobao.mytaobao.basement.i.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (i.e(i.this)) {
                } else {
                    if (imageView.getVisibility() != 0) {
                        nwv.a("dsw", "加载placeHolder return");
                        return;
                    }
                    nwv.a("dsw", "加载placeHolder");
                    com.taobao.phenix.intf.b.h().a(com.taobao.phenix.request.d.a(i2)).into(imageView);
                }
            }
        }, 1000L);
        nwv.b("beforeInitData 6.57");
        c(i);
        nwv.b("beforeInitData 6.6");
    }

    public boolean b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9d66c3e", new Object[]{this, new Integer(i)})).booleanValue();
        }
        int n = this.e.n();
        if (this.d.getLayoutParams() != null && this.d.getLayoutParams().height > 0) {
            if (this.d.getLayoutParams().height == n) {
                TLog.loge(BasementConstants.WEEX_TAG, "optimizeInitBasementSize, height没变化，return");
                if (!com.taobao.mytaobao.base.c.q()) {
                    return true;
                }
            } else {
                TLog.loge(BasementConstants.WEEX_TAG, "optimizeInitBasementSize, height有变化，old=" + this.d.getLayoutParams().height + ",new=" + n);
            }
        }
        if (i <= 0) {
            i = this.b.getWidth();
        }
        if (n == 0 || i == 0) {
            return false;
        }
        TLog.loge(BasementConstants.WEEX_TAG, "optimizeInitBasementSize, setLayoutHeight, " + n + " width=" + i);
        this.d.setParamsWidthAndHeight(i, n);
        return true;
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        e eVar = this.m;
        if (eVar == null) {
            return;
        }
        eVar.f18317a.b(false);
    }

    private void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b088ff", new Object[]{this});
            return;
        }
        MtbBasementWeexApiPlugin.setBasementWeexBridgeAbility(this.v);
        this.k = new RecyclerView.OnScrollListener() { // from class: com.taobao.mytaobao.basement.i.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

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
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7fb6f2bf", new Object[]{this, recyclerView, new Integer(i)});
                    return;
                }
                super.onScrollStateChanged(recyclerView, i);
                i.f(i.this).a(i);
                if (i == 0) {
                    i.this.w.a(false);
                } else {
                    i.this.w.a(true);
                }
            }

            @Override // android.support.v7.widget.RecyclerView.OnScrollListener
            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3018fdc0", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
                    return;
                }
                super.onScrolled(recyclerView, i, i2);
                if (i2 < 0) {
                    i.a(i.this, true);
                } else if (i2 <= 0) {
                } else {
                    i.a(i.this, false);
                }
            }
        };
        this.b.addOnScrollListener(this.k);
        this.s.a();
        this.t.a();
    }

    private void e(boolean z) {
        IpChange ipChange = $ipChange;
        boolean z2 = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef535e8", new Object[]{this, new Boolean(z)});
        } else if (!this.c) {
        } else {
            boolean z3 = !this.b.canScrollVertically(1);
            boolean isCloseToTheBottom = this.b.isCloseToTheBottom();
            if (z3 && !this.g && !z) {
                if (this.b.calcVerticalScrollOffset() <= 0) {
                    z2 = true;
                }
                b("scroll", z2);
            } else if (!z || isCloseToTheBottom || !this.g) {
            } else {
                c("scroll");
            }
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (this.f18322a == null) {
        } else {
            this.b.considerMarkBasementAPMComplete();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("isDowngradePrestrain", (Object) Integer.valueOf(com.taobao.mytaobao.basement.a.e() ? 1 : 0));
            mtx.c().a("WebLoad", jSONObject);
            this.p = true;
            ImageView imageView = (ImageView) this.d.findViewById(R.id.basement_background_pic);
            imageView.setImageDrawable(null);
            mtx.b("收到前端renderSuccess");
            imageView.setVisibility(8);
            if (this.b.canScrollVertically(1) || this.g) {
                z = false;
            }
            int calcVerticalScrollOffset = this.b.calcVerticalScrollOffset();
            if (z && calcVerticalScrollOffset <= 0) {
                z = false;
            }
            if (z) {
                if (this.e.A().isResumed()) {
                    b(BasementConstants.BEHAVIOR_RENDER_SUCCESS_FOREGROUND, false);
                } else {
                    this.r = new Runnable() { // from class: com.taobao.mytaobao.basement.i.6
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                i.a(i.this, BasementConstants.BEHAVIOR_RENDER_SUCCESS_BACKGROUND, false);
                            }
                        }
                    };
                }
            }
            this.f18322a.setAlpha(1.0f);
            this.d.post(new Runnable() { // from class: com.taobao.mytaobao.basement.i.8
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (i.g(i.this) == null || i.h(i.this) != null) {
                    } else {
                        i iVar = i.this;
                        i.a(iVar, new e(i.b(iVar), i.g(i.this)));
                    }
                }
            });
            mxf.b("basementRender");
            com.taobao.mytaobao.basement.monitor.b.a().b();
            mtx.b("renderSuccess");
        }
    }

    private void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ccb801", new Object[]{this});
            return;
        }
        e eVar = this.m;
        if (eVar == null) {
            return;
        }
        eVar.a();
        this.m = null;
    }

    public void a(mts mtsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f52d17ac", new Object[]{this, mtsVar});
        } else {
            this.i = mtsVar;
        }
    }

    public void a(final mtq mtqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f52c2eee", new Object[]{this, mtqVar});
            return;
        }
        TLog.loge(BasementConstants.TAG, "resetData, thread=" + Thread.currentThread().getName());
        mtz.a(new Runnable() { // from class: com.taobao.mytaobao.basement.i.9
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                TLog.loge(BasementConstants.TAG, "real resetData");
                i.c(i.this, false);
                i.e(i.this, false);
                i.d(i.this, false);
                i.a(i.this, (Runnable) null);
                i.b(i.this, false);
                i.i(i.this);
                if (i.g(i.this) != null) {
                    i.g(i.this).onDestroy();
                    i.a(i.this, (MTBBasementContainerView) null);
                }
                if (i.j(i.this) != null) {
                    i.b(i.this).removeOnScrollListener(i.j(i.this));
                }
                i.b(i.this).resetBasementData();
                TLog.loge(BasementConstants.WEEX_TAG, "resetData scrollEnable=true");
                i.b(i.this).setScrollEnable(true);
                i.a(i.this).b();
                if (!mtqVar.b) {
                    i iVar = i.this;
                    i.a(iVar, new f(iVar, i.k(iVar)));
                }
                com.taobao.mytaobao.basement.weex.a.INSTANCE.c(mtqVar.b);
                com.taobao.mytaobao.basement.a b2 = i.l(i.this).b();
                if (b2 != null) {
                    b2.f();
                }
                i.m(i.this).b();
                i.n(i.this).b();
                i.o(i.this).a();
                i.f(i.this).a();
                mxe.INSTANCE.o();
            }
        });
    }

    @Override // tb.mtu
    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        mtq mtqVar = new mtq();
        mtqVar.b = true;
        a(mtqVar);
        this.u.a(BasementConstants.INIT_BY_MTOP, str);
    }

    @Override // tb.mtu
    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        TLog.loge(BasementConstants.TAG, "onDowngradeToOldBasementContainer触发resetData, thread=" + Thread.currentThread().getName());
        a(mtq.f31255a);
    }

    @Override // tb.mtu
    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        TLog.loge(BasementConstants.TAG, "onRemoveBasementContainer触发resetData, thread=" + Thread.currentThread().getName());
        a(mtq.f31255a);
    }

    @Override // tb.mtu
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else if (i == 0 && this.o) {
            i();
        } else if (1 == i && this.o) {
            h();
        } else if (3 != i || this.o) {
        } else {
            String c = com.taobao.mytaobao.basement.a.c();
            if (!StringUtils.isEmpty(c)) {
                b(c);
            } else {
                mtx.b("【错误】检查容器状态，weexUrl=null");
            }
        }
    }

    public boolean k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[]{this})).booleanValue() : this.o;
    }

    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
        } else {
            this.w.b();
        }
    }

    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b576", new Object[]{this});
            return;
        }
        this.B = true;
        a(mtq.f31255a);
    }

    public void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64de478", new Object[]{this});
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Basement onResume,renderSuccess=");
        sb.append(this.p);
        sb.append(",view=");
        sb.append(this.f18322a == null ? com.taobao.android.weex_framework.util.a.ATOM_EXT_Null : "notNull");
        TLog.loge(com.taobao.mytaobao.basement.monitor.c.TAG, sb.toString());
        Runnable runnable = this.r;
        if (runnable == null) {
            return;
        }
        runnable.run();
        this.r = null;
    }

    @Override // com.taobao.mytaobao.base.e
    public boolean t() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6782aff", new Object[]{this})).booleanValue() : this.g;
    }

    private void b(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d257bc1", new Object[]{this, str, new Boolean(z)});
        } else if (this.g || !this.p || this.f18322a == null) {
        } else {
            this.g = true;
            e eVar = this.m;
            if (eVar != null) {
                eVar.a(true);
            }
            if (this.i != null) {
                com.taobao.mytaobao.basement.monitor.c.a().a(str, this.e);
                this.i.changeToBasement();
            }
            com.taobao.mytaobao.basement.Bridge.a.a(this.f18322a, true, z);
            mua.a(com.taobao.mytaobao.basement.monitor.b.MODULE_NAME, 19997, "enterBasementCheck", Integer.valueOf(com.taobao.mytaobao.basement.a.b() ? 1 : 0), str, null);
        }
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else if (!this.g || !this.p || this.f18322a == null) {
        } else {
            this.u.c(str);
            this.g = false;
            e eVar = this.m;
            if (eVar != null) {
                eVar.a(false);
            }
            com.taobao.mytaobao.basement.Bridge.a.a(this.f18322a, false, false);
            if (this.i == null) {
                return;
            }
            com.taobao.mytaobao.basement.monitor.c.a().b(str, this.e);
            this.i.changeToMainPage();
        }
    }

    /* loaded from: classes7.dex */
    public class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private com.taobao.mytaobao.scroll.a b;

        static {
            kge.a(1350661346);
        }

        public b() {
        }

        public static /* synthetic */ com.taobao.mytaobao.scroll.a a(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (com.taobao.mytaobao.scroll.a) ipChange.ipc$dispatch("bca85216", new Object[]{bVar}) : bVar.b;
        }

        public static /* synthetic */ com.taobao.mytaobao.scroll.a a(b bVar, com.taobao.mytaobao.scroll.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (com.taobao.mytaobao.scroll.a) ipChange.ipc$dispatch("4c8f64e8", new Object[]{bVar, aVar});
            }
            bVar.b = aVar;
            return aVar;
        }

        public static /* synthetic */ void a(b bVar, MTBBasementContainerView mTBBasementContainerView, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4b7b9a3", new Object[]{bVar, mTBBasementContainerView, str});
            } else {
                bVar.a(mTBBasementContainerView, str);
            }
        }

        public void a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            } else {
                a(str, str2, 0);
            }
        }

        public void a(String str, String str2, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4dba9507", new Object[]{this, str, str2, new Integer(i)});
            } else if (i.q(i.this)) {
            } else {
                i.c(i.this, true);
                if (com.taobao.mytaobao.base.c.w == 0) {
                    com.taobao.mytaobao.base.c.w = System.currentTimeMillis();
                }
                nwv.b("beforeInitData 6.3");
                mtx.c().a("NaitveRender");
                mtx.b("启动淘友圈weex加载任务,来源=" + str);
                mxf.a("basementInit");
                nwv.b("beforeInitData 6.4");
                i.p(i.this);
                nwv.b("beforeInitData 6.5");
                i.a(i.this, i);
                mtx.c().a("NaitveRender", null);
                a(str2);
                mxf.b("basementInit");
            }
        }

        public void a(String str, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6635bcfe", new Object[]{this, str, jSONObject});
                return;
            }
            BasementWeexView weexView = i.g(i.this) == null ? null : i.g(i.this).getWeexView();
            if (weexView == null) {
                return;
            }
            com.taobao.mytaobao.basement.Bridge.a.a(weexView, str, jSONObject);
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            com.taobao.mytaobao.scroll.a aVar = this.b;
            if (aVar != null) {
                aVar.a();
            }
            this.b = null;
        }

        public void c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
                return;
            }
            com.taobao.mytaobao.scroll.a aVar = this.b;
            if (aVar != null) {
                aVar.a(false);
            }
            if (!str.equals(BasementConstants.BEHAVIOR_RETURN_TOP_TAP) && !str.equals(BasementConstants.BEHAVIOR_MTB_TAB_TAP) && !str.equals(BasementConstants.BEHAVIOR_HEADER_TAP) && !str.equals(BasementConstants.BEHAVIOR_MTB_TAB_DOUBLE_TAP) && !str.equals(BasementConstants.BEHAVIOR_BACK_PRESS)) {
                return;
            }
            a(com.taobao.mytaobao.basement.Bridge.a.i, (JSONObject) null);
        }

        private void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            } else if (i.r(i.this)) {
            } else {
                i.d(i.this, true);
                mtx.b("开始创建weex容器");
                FrameLayout frameLayout = (FrameLayout) i.d(i.this).findViewById(R.id.fl_basement_h5);
                i iVar = i.this;
                i.a(iVar, new MTBBasementContainerView(i.k(iVar)));
                i.g(i.this).setId(R.id.fl_basement);
                frameLayout.removeAllViews();
                frameLayout.addView(i.g(i.this), -1, -1);
                i.g(i.this).setAlpha(0.0f);
                nwv.b("beforeInitData 6.7");
                a(i.g(i.this), str);
            }
        }

        private void a(MTBBasementContainerView mTBBasementContainerView, String str) {
            int i;
            int i2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c37c9ae9", new Object[]{this, mTBBasementContainerView, str});
                return;
            }
            nwv.a("loadBasementWeexView");
            try {
                nwv.b("beforeInitData 6.70");
                String a2 = g.a(false, str);
                nwv.b("beforeInitData 6.71");
                i.d(i.this).post(new Runnable() { // from class: com.taobao.mytaobao.basement.i.b.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        boolean z = false;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        int top = i.b(i.this).getFlEndViewContainer() == null ? i.d(i.this).getTop() : i.b(i.this).getFlEndViewContainer().getTop();
                        mtw c = mtx.c();
                        if (i.b(i.this).getHeight() - top > 0) {
                            z = true;
                        }
                        c.c(z);
                    }
                });
                nwv.b("beforeInitData 6.72");
                com.taobao.mytaobao.basement.monitor.b.a().a("TaoFriendNativeWeexLoad", 1.0d);
                com.taobao.mytaobao.basement.monitor.b.a().a(com.taobao.mytaobao.basement.monitor.b.POINT_LOAD_WEB, com.taobao.mytaobao.basement.monitor.b.MEASURE_LOAD_WEB);
                nwv.b("beforeInitData 6.73");
                String uri = Uri.parse(a2).buildUpon().appendQueryParameter("renderMode", UltronTradeHybridInstanceRenderMode.TEXTURE).appendQueryParameter("wx_opaque", "0").build().toString();
                nwv.b("beforeInitData 6.731");
                BasementWeexView basementWeexView = new BasementWeexView(mTBBasementContainerView.getContext());
                nwv.b("beforeInitData 6.74");
                mtx.b("开始loadWeexUrl," + uri);
                nwv.b("beforeInitData 6.75");
                if (i.l(i.this).c() != null) {
                    int width = i.l(i.this).c().getWidth();
                    i2 = i.l(i.this).n();
                    i = width;
                } else {
                    i = 0;
                    i2 = 0;
                }
                nwv.b("beforeInitData 6.8");
                TLog.loge("mtbMainLink", "预取weexInstance");
                i.l(i.this).a().a(i.l(i.this).m(), new AnonymousClass2(mTBBasementContainerView, str, basementWeexView, uri, i, i2));
                nwv.b("beforeInitData 6.9");
                mTBBasementContainerView.installWeex(basementWeexView);
                nwv.b("beforeInitData 6.10");
            } catch (Exception e) {
                com.taobao.mytaobao.basement.monitor.b.a().a("TaoFriend_HomePage0", "-1001", e.toString());
            }
            nwv.a();
        }

        /* renamed from: com.taobao.mytaobao.basement.i$b$2  reason: invalid class name */
        /* loaded from: classes7.dex */
        public class AnonymousClass2 implements mtr<WeexInstance> {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ MTBBasementContainerView f18334a;
            public final /* synthetic */ String c;
            public final /* synthetic */ BasementWeexView d;
            public final /* synthetic */ String e;
            public final /* synthetic */ int f;
            public final /* synthetic */ int g;

            public AnonymousClass2(MTBBasementContainerView mTBBasementContainerView, String str, BasementWeexView basementWeexView, String str2, int i, int i2) {
                this.f18334a = mTBBasementContainerView;
                this.c = str;
                this.d = basementWeexView;
                this.e = str2;
                this.f = i;
                this.g = i2;
            }

            @Override // tb.mtr
            public /* synthetic */ void onResult(boolean z, String str, WeexInstance weexInstance) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("cc0b3077", new Object[]{this, new Boolean(z), str, weexInstance});
                } else {
                    a(z, str, weexInstance);
                }
            }

            public void a(boolean z, String str, WeexInstance weexInstance) {
                IpChange ipChange = $ipChange;
                boolean z2 = false;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("e0c108d4", new Object[]{this, new Boolean(z), str, weexInstance});
                    return;
                }
                jvb jvbVar = null;
                if (weexInstance == null) {
                    nwv.b("getWxInstanceFailed");
                } else {
                    jvbVar = ((WeexInstanceImpl) weexInstance).getAdapterMUSInstance();
                    if (jvbVar != null && "true".equals(jvbVar.getTag("mtbRenderSuccess"))) {
                        z2 = true;
                    }
                    nwv.b("getWxInstanceSuccess");
                }
                jvb jvbVar2 = jvbVar;
                TLog.loge("mtbMainLink", "预取weexInstance回调，errorMsg=" + str);
                mtt mttVar = new mtt() { // from class: com.taobao.mytaobao.basement.i.b.2.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str2, Object... objArr) {
                        int hashCode = str2.hashCode();
                        if (hashCode == 66974264) {
                            super.onRenderSuccess((p) objArr[0]);
                            return null;
                        } else if (hashCode != 1112741915) {
                            throw new InstantReloadException(String.format("String switch could not find '%s'", str2));
                        } else {
                            super.onRenderFailed((p) objArr[0], ((Number) objArr[1]).intValue(), (String) objArr[2], ((Boolean) objArr[3]).booleanValue());
                            return null;
                        }
                    }

                    @Override // tb.mtt, com.taobao.android.weex_framework.g
                    public void onRenderFailed(p pVar, int i, String str2, boolean z3) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("4253181b", new Object[]{this, pVar, new Integer(i), str2, new Boolean(z3)});
                            return;
                        }
                        super.onRenderFailed(pVar, i, str2, z3);
                        nwv.a("dsw", "onRenderFailed");
                        com.taobao.mytaobao.basement.monitor.b.a().a("TaoFriend_HomePage0", String.valueOf(i), str2);
                        AnonymousClass2.this.f18334a.showErrorPage(new View.OnClickListener() { // from class: com.taobao.mytaobao.basement.i.b.2.1.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // android.view.View.OnClickListener
                            public void onClick(View view) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                                    return;
                                }
                                if (b.a(b.this) != null) {
                                    b.a(b.this).a();
                                    b.a(b.this, (com.taobao.mytaobao.scroll.a) null);
                                }
                                if (AnonymousClass2.this.f18334a.getWeexView() == null) {
                                    return;
                                }
                                AnonymousClass2.this.f18334a.getWeexView().dispose();
                                b.a(b.this, AnonymousClass2.this.f18334a, AnonymousClass2.this.c);
                            }
                        });
                        if (mtx.c().a()) {
                            return;
                        }
                        mtx.c().a("WebLoad", mtx.b());
                        mtx.c().b(3);
                    }

                    @Override // tb.mtt, com.taobao.android.weex_framework.g
                    public void onRenderSuccess(p pVar) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("3fdf238", new Object[]{this, pVar});
                            return;
                        }
                        super.onRenderSuccess(pVar);
                        nwv.a("dsw", ljl.RENDER_SUCCESS_TIME);
                        com.taobao.mytaobao.basement.monitor.b.a().b("TaoFriend_HomePage0");
                        b.a(b.this, new com.taobao.mytaobao.scroll.a(i.b(i.this), AnonymousClass2.this.d));
                    }
                };
                this.d.addRenderListener(new com.taobao.mytaobao.basement.weex.d());
                this.d.addRenderListener(mttVar);
                this.d.setUp(i.l(i.this).A().getLifecycle(), this.e, this.f, this.g, jvbVar2, i.l(i.this).a().b(), i.l(i.this).a().c());
                if (!z2) {
                    return;
                }
                TLog.loge("mtbMainLink", "补发renderSuccess");
                i.this.c();
            }
        }

        public JSONObject d(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("efd4af15", new Object[]{this, str});
            }
            if (i.s(i.this) != null) {
                return i.s(i.this).a(str);
            }
            return null;
        }
    }

    /* loaded from: classes7.dex */
    public class a implements com.taobao.mytaobao.basement.Bridge.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(447196379);
            kge.a(-942815056);
        }

        @Override // com.taobao.mytaobao.basement.Bridge.b
        public void a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            }
        }

        @Override // com.taobao.mytaobao.basement.Bridge.b
        public void a(p pVar, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("85077e6b", new Object[]{this, pVar, jSONObject});
            }
        }

        public a() {
        }

        @Override // com.taobao.mytaobao.basement.Bridge.b
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else {
                i.this.c();
            }
        }

        @Override // com.taobao.mytaobao.basement.Bridge.b
        public JSONObject a(com.taobao.android.weex_framework.bridge.b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("f252df9f", new Object[]{this, bVar}) : com.taobao.mytaobao.basement.weex.a.INSTANCE.a(bVar);
        }

        @Override // com.taobao.mytaobao.basement.Bridge.b
        public void a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
                return;
            }
            if (!StringUtils.isEmpty(str2)) {
                HashMap hashMap = new HashMap();
                hashMap.put("spm-url", str2);
                UTAnalytics.getInstance().getDefaultTracker().updateNextPageProperties(hashMap);
            }
            Nav.from(i.k(i.this)).toUri(str);
            com.taobao.mytaobao.base.c.x = str;
        }

        @Override // com.taobao.mytaobao.basement.Bridge.b
        public void a(final boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            } else {
                mtz.a(new Runnable() { // from class: com.taobao.mytaobao.basement.i.a.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        int i = 0;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else if (i.d(i.this) == null) {
                        } else {
                            View findViewById = i.d(i.this).findViewById(R.id.mtb_back_to_mainpage);
                            if (z) {
                                i = 8;
                            }
                            findViewById.setVisibility(i);
                        }
                    }
                });
            }
        }

        @Override // com.taobao.mytaobao.basement.Bridge.b
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            } else {
                mtz.a(new Runnable() { // from class: com.taobao.mytaobao.basement.i.a.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        RecyclerView.LayoutManager layoutManager = i.b(i.this).getLayoutManager();
                        if (!(layoutManager instanceof LinearLayoutManager)) {
                            return;
                        }
                        i.b(i.this).smoothScrollToPosition(((LinearLayoutManager) layoutManager).findLastVisibleItemPosition());
                    }
                });
            }
        }
    }
}
