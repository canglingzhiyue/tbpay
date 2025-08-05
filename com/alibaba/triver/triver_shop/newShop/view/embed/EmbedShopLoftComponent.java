package com.alibaba.triver.triver_shop.newShop.view.embed;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;
import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.container.shopLoft.ShopLoftViewManager;
import com.alibaba.triver.triver_shop.container.shopLoft.b;
import com.alibaba.triver.triver_shop.container.shopLoft.k;
import com.alibaba.triver.triver_shop.newShop.ClickView;
import com.alibaba.triver.triver_shop.newShop.ext.e;
import com.alibaba.triver.triver_shop.newShop.ext.h;
import com.alibaba.triver.triver_shop.newShop.ext.l;
import com.alibaba.triver.triver_shop.newShop.ext.m;
import com.alibaba.triver.triver_shop.newShop.ext.o;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.ai;
import kotlin.i;
import kotlin.j;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.ceg;
import tb.kge;
import tb.mto;
import tb.ruk;
import tb.ruw;

/* loaded from: classes3.dex */
public final class EmbedShopLoftComponent {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int A;
    private double B;
    private JSONObject C;
    private boolean D;
    private ruk<t> E;
    private boolean G;
    private boolean H;

    /* renamed from: a  reason: collision with root package name */
    private final FragmentActivity f3961a;
    private final com.alibaba.triver.triver_shop.newShop.data.d b;
    private final e c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;
    private final String h;
    private final LifeCycle i;
    private final View j;
    private final com.alibaba.triver.triver_shop.container.shopLoft.a k;
    private String l;
    private final HashMap<String, String> m;
    private TUrlImageView n;
    private TUrlImageView o;
    private TUrlImageView p;
    private View q;
    private FrameLayout r;
    private ClickView s;
    private FrameLayout t;
    private FrameLayout u;
    private boolean w;
    private boolean x;
    private boolean y;
    private boolean z;

    /* loaded from: classes3.dex */
    public interface a extends b.a.InterfaceC0126a {
        boolean b();
    }

    /* loaded from: classes3.dex */
    public static final class d implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                EmbedShopLoftComponent.m(EmbedShopLoftComponent.this);
            }
        }
    }

    static {
        kge.a(-55259268);
    }

    public EmbedShopLoftComponent(FragmentActivity context, com.alibaba.triver.triver_shop.newShop.data.d shopData, e shopDXEngine) {
        String c2;
        q.d(context, "context");
        q.d(shopData, "shopData");
        q.d(shopDXEngine, "shopDXEngine");
        this.f3961a = context;
        this.b = shopData;
        this.c = shopDXEngine;
        this.d = "https://img.alicdn.com/imgextra/i1/O1CN01FgfnlT1jp12NW7WKj_!!6000000004596-1-tps-216-216.gif";
        this.e = "https://gw.alicdn.com/imgextra/i1/O1CN01lH9Tut1nGtxfZ004N_!!6000000005063-54-tps-72-72.apng";
        this.f = "https://gw.alicdn.com/imgextra/i1/O1CN01E4EwcN1YAkSpyXsPj_!!6000000003019-2-tps-120-120.png";
        this.g = "https://img.alicdn.com/imgextra/i2/O1CN01MjPYDx1UZFJkTfcBp_!!6000000002531-2-tps-84-84.png";
        this.h = "https://img.alicdn.com/imgextra/i2/O1CN01zVTotk27Y7MByXQuJ_!!6000000007808-2-tps-84-84.png";
        this.i = new LifeCycle(this);
        View a2 = o.a(this.f3961a, R.layout.view_video_shop_big_card);
        q.a(a2);
        this.j = a2;
        boolean z = true;
        this.w = true;
        this.x = true;
        this.H = true;
        this.A = -1;
        this.B = -1.0d;
        if (this.b.bj()) {
            this.G = true;
        }
        ceg.Companion.a("firstFollowGlobalMute", Boolean.valueOf(this.G));
        JSONObject ax = this.b.ax();
        String U = this.b.U();
        String str = "";
        U = U == null ? str : U;
        if (this.b.t()) {
            JSONObject n = this.b.bc().n();
            if (n == null || (c2 = com.alibaba.triver.triver_shop.newShop.ext.d.c(n, "sceneId")) == null) {
                c2 = str;
            }
        } else {
            c2 = com.alibaba.triver.triver_shop.newShop.ext.d.c(ax, "sceneId");
        }
        Pair[] pairArr = new Pair[4];
        pairArr[0] = j.a("sellerId", U);
        pairArr[1] = j.a("contentId", com.alibaba.triver.triver_shop.newShop.ext.d.c(ax, "id"));
        pairArr[2] = j.a("contentType", c2);
        if (this.b.t() || this.b.u()) {
            if (!this.b.bw()) {
                JSONObject n2 = this.b.bc().n();
                if (n2 == null || (str = n2.toString()) == null) {
                    str = "{}";
                }
            } else if (ax != null) {
                str = ax.toJSONString();
            }
        } else if (ax != null) {
            str = ax.toJSONString();
        }
        pairArr[3] = j.a("contentData", str);
        this.m = ai.c(pairArr);
        this.D = q.a((Object) ShopLoftViewManager.getTypeFromSceneId(c2), (Object) ShopLoftViewManager.TYPE_LIVE);
        this.k = new com.alibaba.triver.triver_shop.container.shopLoft.a();
        this.k.a(this.b);
        if (this.b.u()) {
            this.k.a(true);
        }
        this.k.a(this.f3961a);
        this.k.onCreate(new HashMap());
        this.k.a(new AnonymousClass1(this));
        this.f3961a.getLifecycle().addObserver(this.i);
        View findViewById = this.j.findViewById(R.id.view_video_shop_big_card_loft_content_container);
        q.b(findViewById, "rootLayout.findViewById(R.id.view_video_shop_big_card_loft_content_container)");
        this.t = (FrameLayout) findViewById;
        View findViewById2 = this.j.findViewById(R.id.view_video_shop_big_card_error_container);
        q.b(findViewById2, "rootLayout.findViewById(R.id.view_video_shop_big_card_error_container)");
        this.u = (FrameLayout) findViewById2;
        View findViewById3 = this.j.findViewById(R.id.view_video_shop_big_card_play_button);
        q.b(findViewById3, "rootLayout.findViewById(R.id.view_video_shop_big_card_play_button)");
        this.o = (TUrlImageView) findViewById3;
        View findViewById4 = this.j.findViewById(R.id.view_video_shop_big_card_mute_button);
        q.b(findViewById4, "rootLayout.findViewById(R.id.view_video_shop_big_card_mute_button)");
        this.p = (TUrlImageView) findViewById4;
        View findViewById5 = this.j.findViewById(R.id.view_video_shop_big_card_content);
        q.b(findViewById5, "rootLayout.findViewById(R.id.view_video_shop_big_card_content)");
        this.r = (FrameLayout) findViewById5;
        View findViewById6 = this.j.findViewById(R.id.view_video_shop_big_card_click_area);
        q.b(findViewById6, "rootLayout.findViewById(R.id.view_video_shop_big_card_click_area)");
        this.s = (ClickView) findViewById6;
        View findViewById7 = this.j.findViewById(R.id.view_video_shop_big_card_pull_down_text_layout);
        q.b(findViewById7, "rootLayout.findViewById(R.id.view_video_shop_big_card_pull_down_text_layout)");
        this.q = findViewById7;
        View findViewById8 = this.j.findViewById(R.id.view_video_shop_big_card_pull_down_img);
        q.b(findViewById8, "rootLayout.findViewById(R.id.view_video_shop_big_card_pull_down_img)");
        this.n = (TUrlImageView) findViewById8;
        TUrlImageView tUrlImageView = this.o;
        if (tUrlImageView == null) {
            q.b("videoShopBigCardPlayButton");
            throw null;
        }
        tUrlImageView.setImageUrl(this.f);
        TUrlImageView tUrlImageView2 = this.o;
        if (tUrlImageView2 == null) {
            q.b("videoShopBigCardPlayButton");
            throw null;
        }
        tUrlImageView2.setOnClickListener(new View.OnClickListener() { // from class: com.alibaba.triver.triver_shop.newShop.view.embed.EmbedShopLoftComponent.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TUrlImageView c3;
                String d2;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                if (EmbedShopLoftComponent.e(EmbedShopLoftComponent.this)) {
                    EmbedShopLoftComponent.this.a().onWebViewPause();
                    c3 = EmbedShopLoftComponent.c(EmbedShopLoftComponent.this);
                    if (c3 == null) {
                        q.b("videoShopBigCardPlayButton");
                        throw null;
                    }
                    d2 = EmbedShopLoftComponent.f(EmbedShopLoftComponent.this);
                } else {
                    EmbedShopLoftComponent.this.a().onWebViewResume();
                    c3 = EmbedShopLoftComponent.c(EmbedShopLoftComponent.this);
                    if (c3 == null) {
                        q.b("videoShopBigCardPlayButton");
                        throw null;
                    }
                    d2 = EmbedShopLoftComponent.d(EmbedShopLoftComponent.this);
                }
                c3.setImageUrl(d2);
                EmbedShopLoftComponent embedShopLoftComponent = EmbedShopLoftComponent.this;
                EmbedShopLoftComponent.a(embedShopLoftComponent, !EmbedShopLoftComponent.e(embedShopLoftComponent));
            }
        });
        if (com.alibaba.triver.triver_shop.newShop.ext.b.b((Context) this.f3961a)) {
            TUrlImageView tUrlImageView3 = this.o;
            if (tUrlImageView3 == null) {
                q.b("videoShopBigCardPlayButton");
                throw null;
            }
            o.e(tUrlImageView3);
        }
        if (this.G && this.b.bm().d()) {
            z = this.b.bi().b();
        }
        this.w = z;
        TUrlImageView tUrlImageView4 = this.p;
        if (tUrlImageView4 == null) {
            q.b("videoShopBigCardMuteButton");
            throw null;
        }
        tUrlImageView4.setImageUrl(this.g);
        if (!this.w) {
            TUrlImageView tUrlImageView5 = this.p;
            if (tUrlImageView5 == null) {
                q.b("videoShopBigCardMuteButton");
                throw null;
            }
            tUrlImageView5.setImageUrl(this.h);
        }
        TUrlImageView tUrlImageView6 = this.p;
        if (tUrlImageView6 == null) {
            q.b("videoShopBigCardMuteButton");
            throw null;
        }
        tUrlImageView6.setOnClickListener(new View.OnClickListener() { // from class: com.alibaba.triver.triver_shop.newShop.view.embed.EmbedShopLoftComponent.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TUrlImageView h;
                String j;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                if (EmbedShopLoftComponent.g(EmbedShopLoftComponent.this)) {
                    EmbedShopLoftComponent.this.a().b(false);
                    h = EmbedShopLoftComponent.h(EmbedShopLoftComponent.this);
                    if (h == null) {
                        q.b("videoShopBigCardMuteButton");
                        throw null;
                    }
                    j = EmbedShopLoftComponent.i(EmbedShopLoftComponent.this);
                } else {
                    EmbedShopLoftComponent.this.a().b(true);
                    h = EmbedShopLoftComponent.h(EmbedShopLoftComponent.this);
                    if (h == null) {
                        q.b("videoShopBigCardMuteButton");
                        throw null;
                    }
                    j = EmbedShopLoftComponent.j(EmbedShopLoftComponent.this);
                }
                h.setImageUrl(j);
                EmbedShopLoftComponent embedShopLoftComponent = EmbedShopLoftComponent.this;
                EmbedShopLoftComponent.b(embedShopLoftComponent, !EmbedShopLoftComponent.g(embedShopLoftComponent));
                EmbedShopLoftComponent embedShopLoftComponent2 = EmbedShopLoftComponent.this;
                EmbedShopLoftComponent.d(embedShopLoftComponent2, EmbedShopLoftComponent.g(embedShopLoftComponent2));
                h.a(EmbedShopLoftComponent.g(EmbedShopLoftComponent.this));
            }
        });
        this.k.b(this.w);
        View view = this.q;
        if (view == null) {
            q.b("pullDownTextLayout");
            throw null;
        }
        o.d(view);
        TUrlImageView tUrlImageView7 = this.n;
        if (tUrlImageView7 != null) {
            o.d(tUrlImageView7);
        } else {
            q.b("videoShopBigCardPullDownImage");
            throw null;
        }
    }

    public static final /* synthetic */ FragmentActivity a(EmbedShopLoftComponent embedShopLoftComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FragmentActivity) ipChange.ipc$dispatch("d1bcfd6e", new Object[]{embedShopLoftComponent}) : embedShopLoftComponent.f3961a;
    }

    public static final /* synthetic */ void a(EmbedShopLoftComponent embedShopLoftComponent, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11d53f2b", new Object[]{embedShopLoftComponent, str, jSONObject});
        } else {
            embedShopLoftComponent.a(str, jSONObject);
        }
    }

    public static final /* synthetic */ void a(EmbedShopLoftComponent embedShopLoftComponent, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76b96ad9", new Object[]{embedShopLoftComponent, new Boolean(z)});
        } else {
            embedShopLoftComponent.x = z;
        }
    }

    public static final /* synthetic */ void b(EmbedShopLoftComponent embedShopLoftComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b026959c", new Object[]{embedShopLoftComponent});
        } else {
            embedShopLoftComponent.l();
        }
    }

    public static final /* synthetic */ void b(EmbedShopLoftComponent embedShopLoftComponent, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54acd0b8", new Object[]{embedShopLoftComponent, new Boolean(z)});
        } else {
            embedShopLoftComponent.w = z;
        }
    }

    public static final /* synthetic */ TUrlImageView c(EmbedShopLoftComponent embedShopLoftComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TUrlImageView) ipChange.ipc$dispatch("15b130ff", new Object[]{embedShopLoftComponent}) : embedShopLoftComponent.o;
    }

    public static final /* synthetic */ void c(EmbedShopLoftComponent embedShopLoftComponent, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32a03697", new Object[]{embedShopLoftComponent, new Boolean(z)});
        } else {
            embedShopLoftComponent.H = z;
        }
    }

    public static final /* synthetic */ String d(EmbedShopLoftComponent embedShopLoftComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9c595a42", new Object[]{embedShopLoftComponent}) : embedShopLoftComponent.f;
    }

    public static final /* synthetic */ void d(EmbedShopLoftComponent embedShopLoftComponent, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10939c76", new Object[]{embedShopLoftComponent, new Boolean(z)});
        } else {
            embedShopLoftComponent.a(z);
        }
    }

    public static final /* synthetic */ boolean e(EmbedShopLoftComponent embedShopLoftComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c5a13c63", new Object[]{embedShopLoftComponent})).booleanValue() : embedShopLoftComponent.x;
    }

    public static final /* synthetic */ String f(EmbedShopLoftComponent embedShopLoftComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5d5cea00", new Object[]{embedShopLoftComponent}) : embedShopLoftComponent.e;
    }

    public static final /* synthetic */ boolean g(EmbedShopLoftComponent embedShopLoftComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d3f300e5", new Object[]{embedShopLoftComponent})).booleanValue() : embedShopLoftComponent.w;
    }

    public static final /* synthetic */ TUrlImageView h(EmbedShopLoftComponent embedShopLoftComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TUrlImageView) ipChange.ipc$dispatch("fa4c819a", new Object[]{embedShopLoftComponent}) : embedShopLoftComponent.p;
    }

    public static final /* synthetic */ String i(EmbedShopLoftComponent embedShopLoftComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("fee2419d", new Object[]{embedShopLoftComponent}) : embedShopLoftComponent.h;
    }

    public static final /* synthetic */ String j(EmbedShopLoftComponent embedShopLoftComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("df64097c", new Object[]{embedShopLoftComponent}) : embedShopLoftComponent.g;
    }

    public static final /* synthetic */ boolean l(EmbedShopLoftComponent embedShopLoftComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f7bf6c2a", new Object[]{embedShopLoftComponent})).booleanValue() : embedShopLoftComponent.H;
    }

    public static final /* synthetic */ boolean m(EmbedShopLoftComponent embedShopLoftComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("fee84e6b", new Object[]{embedShopLoftComponent})).booleanValue() : embedShopLoftComponent.d();
    }

    public final com.alibaba.triver.triver_shop.container.shopLoft.a a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.alibaba.triver.triver_shop.container.shopLoft.a) ipChange.ipc$dispatch("7c53e44a", new Object[]{this}) : this.k;
    }

    public final void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.l = str;
        }
    }

    public final boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.z;
    }

    public final void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.A = i;
        }
    }

    public final void a(double d2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a82180d6", new Object[]{this, new Double(d2)});
        } else {
            this.B = d2;
        }
    }

    public final void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else {
            this.C = jSONObject;
        }
    }

    public final boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.D;
    }

    public final void a(ruk<t> rukVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdbfc750", new Object[]{this, rukVar});
        } else {
            this.E = rukVar;
        }
    }

    /* renamed from: com.alibaba.triver.triver_shop.newShop.view.embed.EmbedShopLoftComponent$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements ruw<String, JSONObject, t> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public AnonymousClass1(EmbedShopLoftComponent embedShopLoftComponent) {
            super(2, embedShopLoftComponent, EmbedShopLoftComponent.class, "processEvent", "processEvent(Ljava/lang/String;Lcom/alibaba/fastjson/JSONObject;)V", 0);
        }

        @Override // tb.ruw
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ t mo2423invoke(String str, JSONObject jSONObject) {
            invoke2(str, jSONObject);
            return t.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(String str, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fe686b07", new Object[]{this, str, jSONObject});
            } else {
                EmbedShopLoftComponent.a((EmbedShopLoftComponent) this.receiver, str, jSONObject);
            }
        }
    }

    private final boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
        }
        if (this.z) {
            return true;
        }
        if (this.b.u()) {
            com.alibaba.triver.triver_shop.newShop.data.d dVar = this.b;
            m.a(dVar, "Page_Shop_New_livecard", ai.b(j.a("feed_id", dVar.bc().c()), j.a("identityCode", this.b.ba())), null, 8, null);
        } else {
            com.alibaba.triver.triver_shop.newShop.data.d dVar2 = this.b;
            Pair[] pairArr = new Pair[2];
            pairArr[0] = j.a("identityCode", dVar2.ba());
            JSONObject ax = this.b.ax();
            pairArr[1] = j.a("sceneId", ax == null ? null : ax.getString("sceneId"));
            m.a(dVar2, "Page_Shop_newstructure_livecard_click", ai.b(pairArr), null, 8, null);
        }
        b.a.InterfaceC0126a a2 = this.k.a().a(a.class.getName());
        if (a2 != null && (a2 instanceof a) && ((a) a2).b()) {
            return true;
        }
        if ((this.b.t() || this.k.d()) && this.b.bc().b()) {
            ruk<t> rukVar = this.E;
            if (rukVar != null) {
                rukVar.mo2427invoke();
            }
            return true;
        } else if (this.E != null && this.b.bw() && this.b.ae()) {
            ruk<t> rukVar2 = this.E;
            if (rukVar2 != null) {
                rukVar2.mo2427invoke();
            }
            return true;
        } else {
            e();
            return false;
        }
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        String uri = h.a(this.b, this.l, this.C).toString();
        q.b(uri, "getSecondFloorJumpUrl(shopData, playerViewToken, liveTransParams).toString()");
        Object j = this.b.j("live");
        JSONObject jSONObject = j instanceof JSONObject ? (JSONObject) j : null;
        if (jSONObject != null) {
            for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                uri = uri + '&' + ((Object) entry.getKey()) + '=' + entry.getValue();
            }
        }
        l.a(this.f3961a, uri);
    }

    public final boolean m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6158678", new Object[]{this})).booleanValue() : this.w;
    }

    private final void a(String str, JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        JSONObject jSONObject4;
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6635bcfe", new Object[]{this, str, jSONObject});
        } else if (!q.a((Object) "message", (Object) str)) {
        } else {
            if (jSONObject != null && (jSONObject4 = jSONObject.getJSONObject("params")) != null && (string = jSONObject4.getString("playerViewToken")) != null) {
                a(string);
            }
            if (jSONObject == null || (jSONObject2 = jSONObject.getJSONObject("params")) == null || (jSONObject3 = jSONObject2.getJSONObject("liveTransParams")) == null) {
                return;
            }
            a(jSONObject3);
        }
    }

    private final void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else if (this.D) {
            this.b.bi().b(z);
        } else {
            this.b.bi().a(z);
        }
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else if (this.y) {
        } else {
            this.y = true;
            int i = this.A;
            if (i == -1) {
                ceg.Companion.b("innerPaddingBottom = -1");
            } else {
                this.m.put("paddingBottom", String.valueOf(i));
            }
            double d2 = this.B;
            if (d2 > mto.a.GEO_NOT_SUPPORT) {
                this.m.put(com.taobao.infoflow.taobao.subservice.biz.videocardanimationservice.impl.d.ASPECT_RATIO, String.valueOf(d2));
            }
            this.k.a().a(c.class.getName(), new c(this, this.b));
            b.a a2 = this.k.a();
            String name = b.class.getName();
            FrameLayout frameLayout = this.u;
            if (frameLayout == null) {
                q.b("shopLoftErrorLayout");
                throw null;
            }
            a2.a(name, new b(this, frameLayout));
            ceg.Companion.b(q.a("aspectRatio = ", (Object) Double.valueOf(this.B)));
            View view = this.k.getView(-1, -1, "", "", this.m);
            if (view != null) {
                FrameLayout frameLayout2 = this.r;
                if (frameLayout2 == null) {
                    q.b("contentView");
                    throw null;
                }
                o.a(frameLayout2, view);
            }
            this.k.onAttachedToWebView();
            this.k.onWebViewResume();
            ceg.Companion.a("ShopLoftMute", Boolean.valueOf(this.w));
            this.k.b(this.w);
            if (this.k.d()) {
                TUrlImageView tUrlImageView = this.p;
                if (tUrlImageView == null) {
                    q.b("videoShopBigCardMuteButton");
                    throw null;
                }
                ViewGroup.LayoutParams layoutParams = tUrlImageView.getLayoutParams();
                if (layoutParams != null && (layoutParams instanceof ConstraintLayout.LayoutParams)) {
                    ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
                    layoutParams2.h = -1;
                    layoutParams2.bottomMargin = o.c((Number) 90) + this.b.bc().a().b();
                    TUrlImageView tUrlImageView2 = this.p;
                    if (tUrlImageView2 == null) {
                        q.b("videoShopBigCardMuteButton");
                        throw null;
                    }
                    tUrlImageView2.setLayoutParams(layoutParams);
                }
                if (this.b.s()) {
                    TUrlImageView tUrlImageView3 = new TUrlImageView(this.f3961a);
                    tUrlImageView3.setImageUrl("https://gw.alicdn.com/imgextra/i4/O1CN01QPEYM81GLanLU4ceH_!!6000000000606-54-tps-164-380.apng");
                    tUrlImageView3.setScaleType(ImageView.ScaleType.CENTER_CROP);
                    tUrlImageView3.setSkipAutoSize(true);
                    ConstraintLayout.LayoutParams layoutParams3 = new ConstraintLayout.LayoutParams(o.c((Number) 50), o.c((Number) 188));
                    TUrlImageView tUrlImageView4 = this.p;
                    if (tUrlImageView4 == null) {
                        q.b("videoShopBigCardMuteButton");
                        throw null;
                    }
                    layoutParams3.j = tUrlImageView4.getId();
                    layoutParams3.s = 0;
                    layoutParams3.rightMargin = o.a((Number) 16);
                    ((ViewGroup) this.j).addView(tUrlImageView3, layoutParams3);
                }
            }
            if (this.k.m() instanceof k) {
                TUrlImageView tUrlImageView5 = this.p;
                if (tUrlImageView5 == null) {
                    q.b("videoShopBigCardMuteButton");
                    throw null;
                } else {
                    o.d(tUrlImageView5, o.a((Number) 280));
                    this.k.a(new EmbedShopLoftComponent$init$4(this));
                }
            } else {
                ClickView clickView = this.s;
                if (clickView == null) {
                    q.b("clickArea");
                    throw null;
                }
                clickView.setOnClickListener(new d());
            }
            if (!this.k.c() && !this.k.b()) {
                TUrlImageView tUrlImageView6 = this.p;
                if (tUrlImageView6 == null) {
                    q.b("videoShopBigCardMuteButton");
                    throw null;
                }
                o.d(tUrlImageView6);
                TUrlImageView tUrlImageView7 = this.o;
                if (tUrlImageView7 == null) {
                    q.b("videoShopBigCardPlayButton");
                    throw null;
                }
                o.d(tUrlImageView7);
            }
            if (!this.b.t() && !this.b.u()) {
                return;
            }
            com.alibaba.triver.triver_shop.newShop.data.d dVar = this.b;
            m.a(dVar, "Page_Shop_New_livecard", ai.b(j.a("feed_id", dVar.bc().c()), j.a("identityCode", this.b.ba())));
        }
    }

    public final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        TUrlImageView tUrlImageView = this.p;
        if (tUrlImageView != null) {
            o.d(tUrlImageView);
        } else {
            q.b("videoShopBigCardMuteButton");
            throw null;
        }
    }

    public final void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        TUrlImageView tUrlImageView = this.p;
        if (tUrlImageView != null) {
            o.b(tUrlImageView);
        } else {
            q.b("videoShopBigCardMuteButton");
            throw null;
        }
    }

    /* loaded from: classes3.dex */
    public final class c implements b.a.InterfaceC0126a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ EmbedShopLoftComponent f3966a;
        private final com.alibaba.triver.triver_shop.newShop.data.d b;

        static {
            kge.a(-900921029);
            kge.a(-747960664);
        }

        @Override // com.alibaba.triver.triver_shop.container.shopLoft.b.a.InterfaceC0126a
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            }
        }

        public c(EmbedShopLoftComponent this$0, com.alibaba.triver.triver_shop.newShop.data.d shopData) {
            q.d(this$0, "this$0");
            q.d(shopData, "shopData");
            this.f3966a = this$0;
            this.b = shopData;
        }

        public final com.alibaba.triver.triver_shop.newShop.data.d b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (com.alibaba.triver.triver_shop.newShop.data.d) ipChange.ipc$dispatch("c5960a3a", new Object[]{this}) : this.b;
        }
    }

    /* loaded from: classes3.dex */
    public final class b implements b.a.InterfaceC0126a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ EmbedShopLoftComponent f3965a;
        private final FrameLayout b;

        static {
            kge.a(1187013465);
            kge.a(-747960664);
        }

        @Override // com.alibaba.triver.triver_shop.container.shopLoft.b.a.InterfaceC0126a
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            }
        }

        public b(EmbedShopLoftComponent this$0, FrameLayout errorLayout) {
            q.d(this$0, "this$0");
            q.d(errorLayout, "errorLayout");
            this.f3965a = this$0;
            this.b = errorLayout;
        }

        public final FrameLayout b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (FrameLayout) ipChange.ipc$dispatch("cec35b50", new Object[]{this}) : this.b;
        }
    }

    public final View i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("6aec84b2", new Object[]{this}) : this.j;
    }

    public final void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            return;
        }
        TUrlImageView tUrlImageView = this.n;
        if (tUrlImageView == null) {
            q.b("videoShopBigCardPullDownImage");
            throw null;
        }
        o.d(tUrlImageView, i);
        FrameLayout frameLayout = this.t;
        if (frameLayout != null) {
            o.d(frameLayout, i);
        } else {
            q.b("shopLoftContentLayout");
            throw null;
        }
    }

    public final void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        this.k.onWebViewPause();
        this.z = true;
    }

    public final void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        this.k.onWebViewResume();
        l();
        this.z = false;
    }

    private final void l() {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
            return;
        }
        if (this.b.bm().d()) {
            if (this.D) {
                z = this.b.bi().b();
            } else {
                z = this.b.bi().a();
            }
        }
        this.w = z;
        if (!this.w) {
            TUrlImageView tUrlImageView = this.p;
            if (tUrlImageView == null) {
                q.b("videoShopBigCardMuteButton");
                throw null;
            }
            tUrlImageView.setImageUrl(this.h);
        } else {
            TUrlImageView tUrlImageView2 = this.p;
            if (tUrlImageView2 == null) {
                q.b("videoShopBigCardMuteButton");
                throw null;
            }
            tUrlImageView2.setImageUrl(this.g);
        }
        this.k.b(this.w);
    }

    /* loaded from: classes3.dex */
    public final class LifeCycle implements LifecycleObserver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ EmbedShopLoftComponent f3964a;

        static {
            kge.a(1963107330);
            kge.a(2139684418);
        }

        public LifeCycle(EmbedShopLoftComponent this$0) {
            q.d(this$0, "this$0");
            this.f3964a = this$0;
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
        public final void onPaused() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c47335f4", new Object[]{this});
                return;
            }
            EmbedShopLoftComponent embedShopLoftComponent = this.f3964a;
            try {
                Result.a aVar = Result.Companion;
                embedShopLoftComponent.a().onWebViewPause();
                Result.m2371constructorimpl(t.INSTANCE);
            } catch (Throwable th) {
                Result.a aVar2 = Result.Companion;
                Result.m2371constructorimpl(i.a(th));
            }
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
        public final void onResume() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
                return;
            }
            EmbedShopLoftComponent embedShopLoftComponent = this.f3964a;
            try {
                Result.a aVar = Result.Companion;
                if (EmbedShopLoftComponent.l(embedShopLoftComponent)) {
                    EmbedShopLoftComponent.c(embedShopLoftComponent, false);
                    return;
                }
                EmbedShopLoftComponent.b(embedShopLoftComponent);
                if (!embedShopLoftComponent.b()) {
                    embedShopLoftComponent.a().onWebViewResume();
                    TUrlImageView c = EmbedShopLoftComponent.c(embedShopLoftComponent);
                    if (c == null) {
                        q.b("videoShopBigCardPlayButton");
                        throw null;
                    }
                    c.setImageUrl(EmbedShopLoftComponent.d(embedShopLoftComponent));
                }
                Result.m2371constructorimpl(t.INSTANCE);
            } catch (Throwable th) {
                Result.a aVar2 = Result.Companion;
                Result.m2371constructorimpl(i.a(th));
            }
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
        public final void onDestroyed() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bf354a81", new Object[]{this});
                return;
            }
            EmbedShopLoftComponent.a(this.f3964a).getLifecycle().removeObserver(this);
            EmbedShopLoftComponent embedShopLoftComponent = this.f3964a;
            try {
                Result.a aVar = Result.Companion;
                embedShopLoftComponent.a().onWebViewPause();
                embedShopLoftComponent.a().onDetachedToWebView();
                embedShopLoftComponent.a().onDestroy();
                Result.m2371constructorimpl(t.INSTANCE);
            } catch (Throwable th) {
                Result.a aVar2 = Result.Companion;
                Result.m2371constructorimpl(i.a(th));
            }
        }
    }
}
