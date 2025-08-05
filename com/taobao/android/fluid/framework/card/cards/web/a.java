package com.taobao.android.fluid.framework.card.cards.web;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.taobao.windvane.extra.uc.WVUCWebView;
import android.taobao.windvane.standardmodal.WVStandardEventCenter;
import android.taobao.windvane.util.n;
import android.taobao.windvane.webview.m;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.common.view.FscrmidFavorFrameLayout;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.adapter.mtop.d;
import com.taobao.android.fluid.framework.back.IBackEventService;
import com.taobao.android.fluid.framework.data.datamodel.a;
import com.taobao.android.fluid.framework.deprecated.message.IMessageService;
import com.taobao.android.fluid.framework.hostcontainer.tnode.IHostTNodeService;
import com.taobao.android.fluid.framework.lifecycle.ILifecycleService;
import com.taobao.android.fluid.framework.list.IFeedsListService;
import com.taobao.android.layoutmanager.container.ScrollConflictWebView;
import com.taobao.tao.flexbox.layoutmanager.core.Component;
import com.taobao.tao.image.ImageStrategyConfig;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import com.taobao.weex.common.Constants;
import com.uc.webview.export.extension.RenderProcessGoneDetail;
import java.util.HashMap;
import tb.ept;
import tb.fgd;
import tb.kge;
import tb.ljo;
import tb.ljp;
import tb.obt;
import tb.obw;
import tb.oec;
import tb.ogv;
import tb.ohd;
import tb.psw;
import tb.rfd;
import tb.sgk;
import tb.sgl;
import tb.shs;
import tb.snp;
import tb.spj;
import tb.spy;
import tb.spz;

/* loaded from: classes5.dex */
public final class a extends psw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CARD_NAME = "游戏卡";

    /* renamed from: a  reason: collision with root package name */
    private static boolean f12516a;
    private WVUCWebView A;
    private TBVideoErrorView B;
    private int C;
    private int D;
    private String E;
    private boolean F;
    private Handler G;
    private rfd H;
    private a.e I;
    private Handler J;
    private ljo K;
    private final fgd L;
    private WebPenetrateFrameLayout b;
    private FscrmidFavorFrameLayout c;
    private FrameLayout d;
    private FrameLayout t;
    private TUrlImageView u;
    private ImageView v;
    private FrameLayout.LayoutParams w;
    private ImageStrategyConfig x;
    private ViewGroup y;
    private ImageView z;

    static {
        kge.a(-809996761);
        kge.a(-149022913);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2136187174:
                super.onWillActive((psw) objArr[0]);
                return null;
            case -1961121033:
                super.onAppear((psw) objArr[0]);
                return null;
            case -1512649357:
                super.onResume();
                return null;
            case -1355309186:
                super.onCreateView((psw) objArr[0], (snp) objArr[1]);
                return null;
            case -1294174408:
                super.onDisActive((psw) objArr[0]);
                return null;
            case -1244531194:
                super.onWillDisActive((psw) objArr[0]);
                return null;
            case -893732120:
                super.onActive((psw) objArr[0]);
                return null;
            case -424976904:
                super.onTabSelected();
                return null;
            case -152376096:
                super.cI_();
                return null;
            case -111711657:
                super.onRecycle((psw) objArr[0]);
                return null;
            case 363259313:
                super.onTabUnSelected();
                return null;
            case 504096288:
                super.onBindData((psw) objArr[0], (com.taobao.android.fluid.framework.data.datamodel.a) objArr[1], ((Number) objArr[2]).intValue());
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 1933403975:
                super.onDisAppear((psw) objArr[0]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // tb.psx
    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : CARD_NAME;
    }

    @Override // tb.psx
    public int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue();
        }
        return 5;
    }

    public psw e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (psw) ipChange.ipc$dispatch("2dcfe246", new Object[]{this}) : this;
    }

    @Override // tb.psw
    public String j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6aaa74cf", new Object[]{this});
        }
        return null;
    }

    @Override // tb.psw, tb.snd
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
        }
    }

    public static /* synthetic */ int a(a aVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3e020aa1", new Object[]{aVar, new Integer(i)})).intValue();
        }
        aVar.C = i;
        return i;
    }

    public static /* synthetic */ void a(a aVar, int i, boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcf3ba30", new Object[]{aVar, new Integer(i), new Boolean(z), str});
        } else {
            aVar.a(i, z, str);
        }
    }

    public static /* synthetic */ void a(a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e024a7f", new Object[]{aVar, new Boolean(z)});
        } else {
            aVar.f(z);
        }
    }

    public static /* synthetic */ boolean a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9ee746f9", new Object[]{aVar})).booleanValue() : aVar.M();
    }

    public static /* synthetic */ int b(a aVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4eb7d762", new Object[]{aVar, new Integer(i)})).intValue();
        }
        aVar.D = i;
        return i;
    }

    public static /* synthetic */ void b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bd45e14", new Object[]{aVar});
        } else {
            aVar.S();
        }
    }

    public static /* synthetic */ void b(a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4eb81740", new Object[]{aVar, new Boolean(z)});
        } else {
            aVar.g(z);
        }
    }

    public static /* synthetic */ void c(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8c17533", new Object[]{aVar});
        } else {
            aVar.n();
        }
    }

    public static /* synthetic */ void c(a aVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f6da430", new Object[]{aVar, new Integer(i)});
        } else {
            aVar.a(i);
        }
    }

    public static /* synthetic */ void c(a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f6de401", new Object[]{aVar, new Boolean(z)});
        } else {
            aVar.h(z);
        }
    }

    public static /* synthetic */ void d(a aVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("702370f1", new Object[]{aVar, new Integer(i)});
        } else {
            aVar.d(i);
        }
    }

    public static /* synthetic */ void d(a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7023b0c2", new Object[]{aVar, new Boolean(z)});
        } else {
            aVar.b(z);
        }
    }

    public static /* synthetic */ boolean d(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("45ae8c56", new Object[]{aVar})).booleanValue() : aVar.q();
    }

    public static /* synthetic */ void e(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d29ba371", new Object[]{aVar});
        } else {
            aVar.p();
        }
    }

    public static /* synthetic */ ljo f(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ljo) ipChange.ipc$dispatch("34464d65", new Object[]{aVar}) : aVar.K;
    }

    public static /* synthetic */ Context g(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("c963d3a7", new Object[]{aVar}) : aVar.m;
    }

    public a(FluidContext fluidContext) {
        super(fluidContext);
        this.L = new fgd(fluidContext, this);
    }

    public static boolean ch_() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2bd12825", new Object[0])).booleanValue() : f12516a;
    }

    @Override // tb.psx
    public int d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue() : R.layout.fluid_sdk_ly_web_card;
    }

    @Override // tb.psw
    public String w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3f74eee2", new Object[]{this});
        }
        a.e eVar = this.I;
        return eVar == null ? "" : eVar.a();
    }

    @Override // tb.psw, tb.shm
    public void onCreateView(psw pswVar, snp snpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af379f7e", new Object[]{this, pswVar, snpVar});
            return;
        }
        super.onCreateView(pswVar, snpVar);
        spz.c("[webcomponent]", "WebComponentsController初始化");
        this.c = (FscrmidFavorFrameLayout) this.n.findViewById(R.id.card_root_layout);
        this.c.setCanPullInterceptHorizontal(false);
        this.b = (WebPenetrateFrameLayout) this.n.findViewById(R.id.web_container);
        this.b.disableTouch(true);
        this.A = a(this.m);
        this.d = (FrameLayout) this.n.findViewById(R.id.cover_layout);
        this.u = (TUrlImageView) this.n.findViewById(R.id.img_cover);
        this.v = (ImageView) this.n.findViewById(R.id.img_process);
        this.t = (FrameLayout) this.n.findViewById(R.id.error_layout);
        boolean k = spj.k(this.e);
        this.y = (ViewGroup) this.n.findViewById(R.id.web_card_top_layout);
        if (!spj.i(this.e) && k) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.y.getLayoutParams();
            layoutParams.topMargin = ohd.h(this.m) + ohd.b(this.m, 4);
            this.y.setLayoutParams(layoutParams);
        }
        this.y.setTranslationZ(1.0f);
        this.z = (ImageView) this.n.findViewById(R.id.web_card_tbvideo_back);
        this.z.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.fluid.framework.card.cards.web.a.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else {
                    a.this.h();
                }
            }
        });
        this.w = new FrameLayout.LayoutParams(-1, -1);
        this.b.addView(this.A, this.w);
        this.A.setWvUIModel(new C0492a(this.m, this.A));
        this.x = FluidSDK.getImageAdapter().getImageStrategyConfig();
        ((IBackEventService) this.e.getService(IBackEventService.class)).addBackEventListener(new shs() { // from class: com.taobao.android.fluid.framework.card.cards.web.a.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.shs
            public void onBackClick() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("1ce9d949", new Object[]{this});
                } else {
                    a.a(a.this);
                }
            }
        });
    }

    @Override // tb.psw, tb.snd
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        if (!this.r) {
            return;
        }
        ljp.a(this.K, "pageappear");
        e(true);
        if (!H() || !L()) {
            return;
        }
        T();
    }

    @Override // tb.psw, tb.snd
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        if (!this.r) {
            return;
        }
        i();
        e(false);
        if (!H() || !L()) {
            return;
        }
        P();
    }

    @Override // tb.psw, tb.snd
    public void cI_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6eaece0", new Object[]{this});
        } else {
            super.cI_();
        }
    }

    @Override // tb.psw, tb.shm
    public void onBindData(psw pswVar, com.taobao.android.fluid.framework.data.datamodel.a aVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e0be620", new Object[]{this, pswVar, aVar, new Integer(i)});
            return;
        }
        super.onBindData(pswVar, aVar, i);
        if (!this.r) {
            return;
        }
        this.I = aVar.a().F();
        spz.c("[webcomponent]", ept.SUB_BIND_VIEW);
        this.E = m();
        ljp.a(this.K, "databind");
        if (c.g()) {
            l();
        }
        k();
    }

    @Override // tb.psw, tb.shm
    public void onAppear(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b1baaf7", new Object[]{this, pswVar});
            return;
        }
        super.onAppear(pswVar);
        if (!this.r) {
            return;
        }
        this.k.c().b(false);
        d(true);
        ljp.a(this.K, "appear");
        if (this.I == null) {
            return;
        }
        if (this.A == null) {
            this.A = a(this.m);
            this.b.addView(this.A, this.w);
            l();
        } else if (!c.g()) {
            l();
        }
        if (!q()) {
            c(0);
        }
        N();
    }

    @Override // tb.psw, tb.shm
    public void onDisAppear(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("733d6747", new Object[]{this, pswVar});
            return;
        }
        super.onDisAppear(pswVar);
        this.k.c().b(true);
        d(false);
        ljp.a(this.K, "disappear");
        O();
        if (H()) {
            return;
        }
        b(0);
    }

    @Override // tb.psw, tb.shm
    public void onWillActive(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80ac5eda", new Object[]{this, pswVar});
            return;
        }
        super.onWillActive(pswVar);
        if (!this.r) {
            return;
        }
        T();
    }

    @Override // tb.psw, tb.shm
    public void onWillDisActive(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5d1f606", new Object[]{this, pswVar});
            return;
        }
        super.onWillDisActive(pswVar);
        if (!this.r) {
            return;
        }
        P();
    }

    @Override // tb.psw, tb.shm
    public void onActive(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cababae8", new Object[]{this, pswVar});
            return;
        }
        super.onActive(pswVar);
        if (!this.r) {
            return;
        }
        if (g()) {
            a_("active", null);
        }
        ljp.a(this.K, "active");
    }

    @Override // tb.psw, tb.shm
    public void onDisActive(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2dc7738", new Object[]{this, pswVar});
            return;
        }
        super.onDisActive(pswVar);
        if (g()) {
            a_("disactive", null);
        }
        ljp.a(this.K, "disactive");
        h();
        ljp.a(this.K);
    }

    @Override // tb.psw, tb.shm
    public void onRecycle(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9576a57", new Object[]{this, pswVar});
        } else {
            super.onRecycle(pswVar);
        }
    }

    @Override // tb.psw, tb.sne
    public void onTabSelected() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6ab5df8", new Object[]{this});
            return;
        }
        super.onTabSelected();
        if (!this.r || !H()) {
            return;
        }
        T();
    }

    @Override // tb.psw, tb.sne
    public void onTabUnSelected() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15a6e5b1", new Object[]{this});
            return;
        }
        super.onTabUnSelected();
        if (!this.r || !H()) {
            return;
        }
        P();
    }

    public String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        return "game_" + str;
    }

    public void a(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0fea68", new Object[]{this, new Float(f), new Float(f2)});
        } else if (this.b == null || !q() || !((ILifecycleService) this.e.getService(ILifecycleService.class)).getConfig().b()) {
        } else {
            this.b.setChildTrusteeshipTouchRect(null);
            b(f, f2);
        }
    }

    public boolean g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue() : this.D > 0;
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        spz.c("[webcomponent]", "onGameBack");
        if (f12516a) {
            a_("stop", null);
            ljp.a(this.K, "back");
        }
        f(false);
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        ljp.a(this.K, "pagedisappear");
        h();
        ljp.a(this.K);
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        spz.c("[webcomponent]", "onRecycle方法调用");
        WVUCWebView wVUCWebView = this.A;
        if (wVUCWebView != null) {
            wVUCWebView.destroy();
            if (this.A.getParent() != null && (this.A.getParent() instanceof ViewGroup)) {
                ((ViewGroup) this.A.getParent()).removeView(this.A);
            }
            this.A = null;
        }
        e(0);
        a(0, false, null);
        this.d.setVisibility(8);
        n();
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        this.d.setVisibility(0);
        obt.a(this.d, 0);
        this.u.setStrategyConfig(this.x);
        this.u.setImageUrl(this.I.a("cover"));
        String a2 = this.I.a("loadingUrl");
        if (TextUtils.isEmpty(a2)) {
            return;
        }
        this.v.setVisibility(0);
        FluidSDK.getImageAdapter().load(a2, this.v, new com.taobao.android.fluid.core.a<d>() { // from class: com.taobao.android.fluid.framework.card.cards.web.a.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.fluid.core.a
            public /* bridge */ /* synthetic */ void a(d dVar) {
            }
        });
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void a(spy spyVar) {
        char c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff34879c", new Object[]{this, spyVar});
        } else if (spyVar == null) {
            spz.c("[webcomponent]", "onWebMessage msg 为null");
        } else {
            spz.c("[webcomponent]", "接收Web发来的消息onHandlerH5Message name: " + spyVar.c + " args: " + spyVar.i);
            if (this.I == null) {
                spz.c("[webcomponent]", "onWebMessage detail为null");
            } else if (!TextUtils.equals(spyVar.d, this.I.a())) {
                spz.c("[webcomponent]", "onWebMessage msg id 和contentId 不相等，msg.id：" + spyVar.d + ",detail.contentId():" + this.I.a());
            } else {
                String str = spyVar.c;
                switch (str.hashCode()) {
                    case -934641255:
                        if (str.equals("reload")) {
                            c = 6;
                            break;
                        }
                        c = 65535;
                        break;
                    case -690213213:
                        if (str.equals("register")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case 3540994:
                        if (str.equals("stop")) {
                            c = 5;
                            break;
                        }
                        c = 65535;
                        break;
                    case 52573147:
                        if (str.equals("registerfilter")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case 310351011:
                        if (str.equals("loadfailed")) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    case 545472344:
                        if (str.equals("loadfinished")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1879530535:
                        if (str.equals("playnext")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                switch (c) {
                    case 0:
                        boolean b = ((ILifecycleService) this.e.getService(ILifecycleService.class)).getConfig().b();
                        spz.c("[webcomponent]", "mIsPageAppear:" + b);
                        e(1);
                        if (e().I() && b) {
                            a_("appear", null);
                        }
                        if (e().H() && b) {
                            a_("active", null);
                        }
                        ljp.a(this.K, a("register"));
                        break;
                    case 1:
                        if (c.h()) {
                            IMessageService iMessageService = (IMessageService) this.e.getService(IMessageService.class);
                            this.H = new rfd(this.A, this);
                            this.H.a(this.I.a());
                            if (iMessageService != null) {
                                iMessageService.registerMessageHandler(this.H);
                            }
                            S();
                            ljp.a(this.K, a("registerfilter"));
                            break;
                        }
                        break;
                    case 2:
                        f(false);
                        h(false);
                        ljp.a(this.K, a("playnext"));
                        break;
                    case 3:
                        if (!ogv.a(spyVar.i)) {
                            this.F = TextUtils.equals(oec.a(spyVar.i.get("back"), (String) null), "custom");
                        }
                        e(2);
                        R();
                        p();
                        n();
                        O();
                        ljp.a(this.K, a("loadfinished"));
                        break;
                    case 4:
                        e(3);
                        f(false);
                        g(false);
                        p();
                        h(true);
                        ljp.a(this.K, a("loadfailed"));
                        break;
                    case 5:
                        f(false);
                        ljp.a(this.K, a("stop"));
                        break;
                    case 6:
                        if (c.m()) {
                            f(false);
                            b(true);
                            ljp.a(this.K, a("reload"));
                            break;
                        }
                        break;
                }
                if (spyVar.g == null) {
                    return;
                }
                spyVar.g.a(this.H, "success");
            }
        }
    }

    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
            return;
        }
        if (TextUtils.isEmpty(this.E)) {
            this.E = m();
        }
        if (TextUtils.isEmpty(this.E)) {
            spz.c("[webcomponent]", "reload url为null return");
            return;
        }
        a(0, true, "");
        e(0);
        n();
        k();
        if (this.A == null) {
            spz.c("[webcomponent]", "webView 为null 重新创建，+mUrl：" + this.E);
            this.A = a(this.m);
            this.b.addView(this.A, this.w);
        }
        this.A.getSettings().setJavaScriptEnabled(true);
        this.A.loadUrl(this.E);
    }

    public void a_(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0e080a1", new Object[]{this, str, jSONObject});
            return;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        b(JSON.toJSONString(new spy(IWebViewListener.BIZ_SCENE, "native", str, w(), null, jSONObject, null).a(), SerializerFeature.DisableCircularReferenceDetect));
    }

    private String m() {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fe3ba4ac", new Object[]{this});
        }
        a.e eVar = this.I;
        if (eVar == null) {
            return "";
        }
        String a2 = eVar.a("url");
        String f = c.f();
        spz.c("[webcomponent]", "buildUrlAndInitWebTrackInfo，游戏卡片数据：\n,serverUrl:" + a2 + "\n orangeUrl:" + f);
        String str3 = (TextUtils.isEmpty(f) || TextUtils.equals("null", f)) ? a2 : f;
        if (TextUtils.isEmpty(str3)) {
            spz.c("[webcomponent]", "reload url为null return");
            return "";
        }
        String tab3CardType = this.e.getInstanceConfig().getTab3CardType();
        if (e() != null) {
            str = String.valueOf(s());
            str2 = String.valueOf(v().a());
        } else {
            str = null;
            str2 = null;
        }
        String str4 = obw.GAME_SPM + str2;
        spz.c("[webcomponent]", "buildUrlAndInitWebTrackInfo,spm:" + str4);
        JSONObject jSONObject = new JSONObject();
        String a3 = this.I.a();
        jSONObject.put("id", (Object) a3);
        jSONObject.put("tabid", (Object) tab3CardType);
        jSONObject.put("sessionid", (Object) f());
        jSONObject.put(Constants.Weex.INSTANCEID, (Object) str);
        jSONObject.put("index", (Object) str2);
        jSONObject.put("version", (Object) String.valueOf(31));
        jSONObject.put(Component.KEY_PAGE_NAME, (Object) "Page_videointeract");
        String encode = Uri.encode(jSONObject.toJSONString());
        StringBuilder sb = new StringBuilder(str3);
        if (str3.contains("?")) {
            sb.append("&x-tab2=");
            sb.append(encode);
        } else {
            sb.append("?x-tab2=");
            sb.append(encode);
        }
        if (!TextUtils.isEmpty(str4)) {
            sb.append("&spm=");
            sb.append(str4);
        }
        String sb2 = sb.toString();
        spz.c("[webcomponent]", "buildUrlAndInitWebTrackInfo，游戏卡片数据：" + this.I.e() + ",url:" + sb2 + "\n,serverUrl:" + a2 + "\n orangeUrl:" + f);
        this.K = new ljo();
        this.K.a(tab3CardType, f(), str, str2, a3, sb2);
        return sb2;
    }

    private void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
            return;
        }
        try {
            if (this.B != null && this.B.getParent() != null) {
                spz.c("[webcomponent]", "关闭错误页");
                ((ViewGroup) this.B.getParent()).removeView(this.B);
                this.B = null;
            }
            this.t.setVisibility(8);
        } catch (Throwable th) {
            spz.a("[webcomponent]", "", th);
        }
    }

    private void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        spz.c("[webcomponent]", "onDelayDestroyTimeout appear:" + I() + ",isActive:" + H());
        if (i != 0 || I() || H()) {
            return;
        }
        ljp.a(this.K, "destroytimeout");
        a(false);
    }

    private void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else if (z) {
            WVUCWebView wVUCWebView = this.A;
            if (wVUCWebView != null) {
                wVUCWebView.destroy();
                if (c.l() && this.A.getParent() != null) {
                    spz.c("[webcomponent]", "移除webview");
                    ((ViewGroup) this.A.getParent()).removeView(this.A);
                }
                this.A = null;
            }
            this.A = a(this.m);
            this.b.addView(this.A, this.w);
            l();
        } else {
            if (this.A == null) {
                this.A = a(this.m);
                this.b.addView(this.A, this.w);
            }
            l();
        }
    }

    private WVUCWebView a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WVUCWebView) ipChange.ipc$dispatch("25d9c817", new Object[]{this, context});
        }
        ScrollConflictWebView scrollConflictWebView = new ScrollConflictWebView(context);
        scrollConflictWebView.setBackgroundColor(0);
        scrollConflictWebView.setTag(this);
        sgl sglVar = new sgl(context);
        sglVar.a(new sgk() { // from class: com.taobao.android.fluid.framework.card.cards.web.a.4
            public static volatile transient /* synthetic */ IpChange $ipChange;
            private boolean b = false;
            private boolean c = false;

            @Override // tb.sgk
            public void a(String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str});
                    return;
                }
                spz.c("[webcomponent]", "webView onStart url: " + str);
                this.c = false;
                this.b = false;
                a.a(a.this, 1, true, "");
            }

            @Override // tb.sgk
            public void b(String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3dd7e573", new Object[]{this, str});
                    return;
                }
                spz.c("[webcomponent]", "hasSendAppear:" + this.b + ",webViewLoadFailed:" + this.c + ",webView onFinish url: " + str);
                if (this.b || this.c) {
                    return;
                }
                a.a(a.this, 2, true, "");
                a.b(a.this);
                a.c(a.this);
                this.b = true;
            }

            @Override // tb.sgk
            public void c(String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("88097eb4", new Object[]{this, str});
                    return;
                }
                spz.c("[webcomponent]", "webView onFailed error: " + str);
                this.c = true;
                a.a(a.this, false);
                if (!c.a(a.d(a.this))) {
                    return;
                }
                a.a(a.this, 3, true, str);
                a.b(a.this, true);
                a.e(a.this);
                a.c(a.this, true);
            }

            @Override // tb.sgk
            public void a(RenderProcessGoneDetail renderProcessGoneDetail) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5ea0c9b2", new Object[]{this, renderProcessGoneDetail});
                    return;
                }
                spz.c("[webcomponent]", "webViewWebContentProcessDidTerminate,didCrash:" + renderProcessGoneDetail.didCrash());
                if (!renderProcessGoneDetail.didCrash()) {
                    return;
                }
                ljp.a(a.f(a.this), "webterminate");
                a.a(a.this, 0);
                a.b(a.this, 0);
                a.this.h();
                a.c(a.this);
                a.this.k();
            }
        });
        scrollConflictWebView.setWebViewClient(sglVar);
        return scrollConflictWebView;
    }

    private boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("631b57a", new Object[]{this})).booleanValue();
        }
        TBVideoErrorView tBVideoErrorView = this.B;
        return tBVideoErrorView == null || tBVideoErrorView.getVisibility() == 8;
    }

    private void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63fccf7", new Object[]{this});
            return;
        }
        spz.c("[webcomponent]", "hideLoading");
        obt.b(this.d, 200);
    }

    private boolean q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("64de47c", new Object[]{this})).booleanValue() : this.D == 2;
    }

    private boolean M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4529658", new Object[]{this})).booleanValue();
        }
        boolean ch_ = ch_();
        spz.c("[webcomponent]", "onBackPress,isPlayingGame:" + ch_);
        if (!ch_) {
            return false;
        }
        h();
        return true;
    }

    private void N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("460add5", new Object[]{this});
        } else if (this.J == null) {
        } else {
            spz.c("[webcomponent]", "onCancelDelayDestroyMsg 取消延迟销毁");
            this.J.removeCallbacksAndMessages(null);
        }
    }

    private void O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46ec556", new Object[]{this});
        } else if (!c.j() || this.G == null) {
        } else {
            spz.c("[webcomponent]", "onCancelWaitTimeoutMsg 取消超时下翻计时");
            this.G.removeCallbacksAndMessages(null);
        }
    }

    private void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            return;
        }
        if (this.J == null) {
            this.J = new Handler(Looper.getMainLooper()) { // from class: com.taobao.android.fluid.framework.card.cards.web.a.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.os.Handler
                public void handleMessage(Message message) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("282a8c19", new Object[]{this, message});
                    } else {
                        a.c(a.this, message.what);
                    }
                }
            };
        }
        if (this.J.hasMessages(i)) {
            return;
        }
        spz.c("[webcomponent]", "onDelayDestroyTimeout 延迟销毁");
        this.J.sendEmptyMessageDelayed(i, c.e() * 1000);
    }

    private void b(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90f625a9", new Object[]{this, new Float(f), new Float(f2)});
            return;
        }
        spz.c("[webcomponent]", "onPlayGame");
        f(true);
        String str = ohd.b(this.m, f) + "," + ohd.b(this.m, f2);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("point", (Object) str);
        a_("play", jSONObject);
        ljp.a(this.K, "play", jSONObject);
    }

    private void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
        } else if (!c.j()) {
        } else {
            if (this.G == null) {
                this.G = new Handler(Looper.getMainLooper()) { // from class: com.taobao.android.fluid.framework.card.cards.web.a.6
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.os.Handler
                    public void handleMessage(Message message) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("282a8c19", new Object[]{this, message});
                        } else {
                            a.d(a.this, message.what);
                        }
                    }
                };
            }
            if (this.G.hasMessages(i) || !o()) {
                return;
            }
            this.G.sendEmptyMessageDelayed(i, c.c() * 1000);
        }
    }

    private void d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad401d78", new Object[]{this, new Integer(i)});
            return;
        }
        spz.c("[webcomponent]", "onWaitTimeout appear:" + I() + "_state:" + this.C + "_gameState:" + this.D);
        if (i != 0 || q()) {
            return;
        }
        ljp.a(this.K, "waittimeout");
        h();
        g(false);
        p();
        h(true);
    }

    private void P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47cdcd7", new Object[]{this});
        } else if (!c.k()) {
        } else {
            this.n.setKeepScreenOn(false);
        }
    }

    private void Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48af458", new Object[]{this});
            return;
        }
        spz.c("[webcomponent]", "播放下一坑数据");
        ((IFeedsListService) this.e.getService(IFeedsListService.class)).publicNextVideo();
    }

    private void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
            return;
        }
        spz.c("[webcomponent]", "sendToRootTnodeMessage isPlayingGame: " + z);
        HashMap hashMap = new HashMap();
        hashMap.put("play", Boolean.valueOf(z));
        spz.c("[webcomponent]", "[webcomponent],发送给Node节点消息");
        ((IHostTNodeService) this.e.getService(IHostTNodeService.class)).sendMessage("ongame", null, hashMap, null);
        ((IHostTNodeService) this.e.getService(IHostTNodeService.class)).reLayoutForVirtualNavigationBar();
    }

    private void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad405d49", new Object[]{this, new Boolean(z)});
        } else if (g()) {
            a_(z ? "appear" : "disappear", null);
        } else {
            spz.c("[webcomponent]", "webView为load结束sendToWebCardAppearMessage,isAppear:" + z);
        }
    }

    private void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else if (this.A == null) {
        } else {
            try {
                spz.c("[webcomponent]", "发送给Web，sendToWebMessage eventName: onVideoMessage eventData: " + str);
                WVStandardEventCenter.postNotificationToJS(this.A, "onVideoMessage", str);
            } catch (Exception e) {
                spz.c("[webcomponent]", "postNotificationToJS Exception: " + e.getMessage());
            }
        }
    }

    private void e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef535e8", new Object[]{this, new Boolean(z)});
        } else if (!g()) {
        } else {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("reason", "page");
            if (z) {
                a_("appear", jSONObject);
                if (!H()) {
                    return;
                }
                a_("active", jSONObject);
                return;
            }
            if (H()) {
                a_("disactive", jSONObject);
            }
            a_("disappear", jSONObject);
        }
    }

    private void f(boolean z) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0aa0e87", new Object[]{this, new Boolean(z)});
            return;
        }
        spz.c("[webcomponent]", "setIsPlayingGame isPlayingGame: " + z);
        if (!z) {
            this.b.clearChildTouchRect();
        }
        if (z == f12516a) {
            return;
        }
        f12516a = z;
        c(z);
        ((IFeedsListService) this.e.getService(IFeedsListService.class)).setScrollLockedExternal(z);
        spz.c("[webcomponent]", "mediaController 不为null，禁止滑动");
        this.c.setWebCardPlayingGame(z);
        if (!c.b() || this.F) {
            return;
        }
        ViewGroup viewGroup = this.y;
        if (!z) {
            i = 8;
        }
        viewGroup.setVisibility(i);
    }

    private void R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4990bd9", new Object[]{this});
            return;
        }
        WebPenetrateFrameLayout webPenetrateFrameLayout = this.b;
        if (webPenetrateFrameLayout == null) {
            return;
        }
        webPenetrateFrameLayout.disableTouch(false);
        this.b.setWebCardClickListener(new b() { // from class: com.taobao.android.fluid.framework.card.cards.web.a.7
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.fluid.framework.card.cards.web.b
            public void a(float f, float f2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c0fea68", new Object[]{this, new Float(f), new Float(f2)});
                } else {
                    a.this.a(f, f2);
                }
            }
        });
    }

    private void e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef4f617", new Object[]{this, new Integer(i)});
            return;
        }
        spz.c("[webcomponent]", "setWebGameStateChange state:" + i);
        this.D = i;
    }

    private void S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a7235a", new Object[]{this});
            return;
        }
        rfd rfdVar = this.H;
        if (rfdVar == null) {
            return;
        }
        rfdVar.a(g());
    }

    private void g(final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b25ee726", new Object[]{this, new Boolean(z)});
        } else if (!c.d()) {
        } else {
            try {
                spz.c("[webcomponent]", "showErrorView 显示错误页，errorFromWeb：" + z);
                if (this.B == null) {
                    spz.c("[webcomponent]", "showErrorView 初始化错误页");
                    this.B = new TBVideoErrorView(this.m);
                    this.B.setBackgroundColor(-16777216);
                    this.B.setErrorAction(new View.OnClickListener() { // from class: com.taobao.android.fluid.framework.card.cards.web.a.8
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.view.View.OnClickListener
                        public void onClick(View view) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                            } else {
                                a.d(a.this, z);
                            }
                        }
                    });
                    this.t.addView(this.B, this.w);
                }
                this.t.setVisibility(0);
            } catch (Throwable th) {
                spz.a("[webcomponent]", "", th);
            }
        }
    }

    private void T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b53adb", new Object[]{this});
        } else if (!c.k()) {
        } else {
            this.n.setKeepScreenOn(true);
        }
    }

    private void a(int i, boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("732aa823", new Object[]{this, new Integer(i), new Boolean(z), str});
            return;
        }
        spz.c("[webcomponent]", "stateChanged state:" + i);
        this.C = i;
        if (!z) {
            return;
        }
        if (i == 0) {
            ljp.a(this.K, "webloadinit");
        } else if (i == 2) {
            ljp.a(this.K, "webloadfinished");
        } else if (i != 3) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("error", str);
            ljp.a(this.K, "webloadfailed", hashMap);
        }
    }

    private void h(boolean z) {
        IpChange ipChange = $ipChange;
        boolean z2 = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b413bfc5", new Object[]{this, new Boolean(z)});
        } else if (z && !c.i()) {
        } else {
            if (e() != null) {
                z2 = e().H();
            }
            spz.c("[webcomponent]", "tryPlayNext,isActive:" + z2);
            if (!z2) {
                return;
            }
            Q();
        }
    }

    /* renamed from: com.taobao.android.fluid.framework.card.cards.web.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public class C0492a extends m {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final Context b;
        private View c;

        static {
            kge.a(1150158267);
        }

        public C0492a(Context context, WVUCWebView wVUCWebView) {
            super(context, wVUCWebView);
            this.b = context;
        }

        @Override // android.taobao.windvane.webview.m
        public void loadErrorPage() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4a46c678", new Object[]{this});
            } else {
                a("ANDROID_SYS_NETWORK_ERROR");
            }
        }

        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            } else if (this.c != null || !(n.a(this.b) instanceof Activity)) {
            } else {
                spz.c("[webcomponent]", "loadErrorPage 初始化错误页," + str);
                this.c = new TBVideoErrorView(a.g(a.this));
                this.c.setBackgroundColor(-16777216);
                ((TBVideoErrorView) this.c).setErrorAction(new View.OnClickListener() { // from class: com.taobao.android.fluid.framework.card.cards.web.a.a.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                            return;
                        }
                        spz.c("[webcomponent]", "loadErrorPage，webView为null 直接调用webView load的方法");
                        a.d(a.this, true);
                    }
                });
                setErrorView(this.c);
            }
        }
    }

    public ljo U() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ljo) ipChange.ipc$dispatch("b2b39819", new Object[]{this}) : this.K;
    }
}
