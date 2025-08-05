package com.alibaba.triver.triver_shop.shop2023.nativeview;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.support.v4.app.FragmentActivity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.extension.dianmicX.AutoScrollTextView;
import com.alibaba.triver.triver_shop.newShop.ext.o;
import com.alibaba.triver.triver_shop.shop2023.data.ShopComponentModel;
import com.alibaba.triver.triver_shop.shop2023.template.Shop2023HeaderInfoTemplate;
import com.alibaba.wireless.security.SecExceptionCode;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.wrapper.ext.component.main.viewholder.interactionlikebar.KAPContainerView;
import com.taobao.android.fluid.remote.collectionpoplayer.nativecollection.CollectionTabLayout;
import com.taobao.tao.shop.common.ShopConstants;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.ai;
import kotlin.jvm.internal.q;
import kotlin.t;
import kotlin.text.n;
import tb.ceg;
import tb.kge;
import tb.ruk;
import tb.rul;

/* loaded from: classes3.dex */
public class b implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private View A;
    private int B;
    private View C;
    private View D;
    private View E;
    private int F;
    private com.alibaba.triver.triver_shop.shop2023.data.e G;
    private com.alibaba.triver.triver_shop.shop2023.data.e H;
    private com.alibaba.triver.triver_shop.shop2023.data.e I;
    private com.alibaba.triver.triver_shop.shop2023.nativeview.c J;
    private ruk<t> K;
    private final View L;
    private int M;
    private boolean N;
    private int O;
    private final com.alibaba.triver.triver_shop.shop2023.data.f P;
    private final View Q;
    private final ImageView R;
    private rul<? super Boolean, t> S;
    private boolean T;

    /* renamed from: a  reason: collision with root package name */
    private final Context f4092a;
    private final com.alibaba.triver.triver_shop.newShop.data.d b;
    private final int c;
    private final ShopComponentModel d;
    private final TUrlImageView e;
    private final FrameLayout f;
    private final TUrlImageView g;
    private final TUrlImageView h;
    private final TUrlImageView i;
    private final TUrlImageView j;
    private final TUrlImageView k;
    private final TUrlImageView l;
    private final AutoScrollTextView m;
    private final FrameLayout n;
    private final TextView o;
    private final LinearLayout p;
    private final LinearLayout q;
    private final FrameLayout r;
    private final List<View> s;
    private boolean t;
    private boolean u;
    private boolean v;
    private Boolean w;
    private boolean x;
    private final boolean y;
    private final String z;

    /* loaded from: classes3.dex */
    public static final class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f4093a;
        public final /* synthetic */ b b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;

        public a(String str, b bVar, String str2, String str3) {
            this.f4093a = str;
            this.b = bVar;
            this.c = str2;
            this.d = str3;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            String str = this.f4093a;
            if (str == null || str.length() == 0) {
                JSONObject data = b.c(this.b).getData();
                com.alibaba.triver.triver_shop.newShop.ext.l.a(this.b.a(), data == null ? null : data.getString("introUrl"));
            } else {
                com.alibaba.triver.triver_shop.newShop.ext.l.a(this.b.a(), this.f4093a);
            }
            b.a(this.b, "Page_Shop_FeatureType", ai.b(kotlin.j.a("featureTypeName", this.c), kotlin.j.a("utArgs", this.d)));
        }
    }

    /* renamed from: com.alibaba.triver.triver_shop.shop2023.nativeview.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0156b implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ int b;

        public C0156b(int i) {
            this.b = i;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                return;
            }
            b bVar = b.this;
            int i = this.b;
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
            }
            bVar.c(i - ((Integer) animatedValue).intValue());
        }
    }

    /* loaded from: classes3.dex */
    public static final class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ boolean b;

        public c(boolean z) {
            this.b = z;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (!b.this.o()) {
                b.this.c(0);
            } else {
                b bVar = b.this;
                b.a(bVar, bVar.c());
                b.a(b.this, !this.b);
                b.f(b.this);
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            b bVar = b.this;
            bVar.c(bVar.c());
        }
    }

    /* loaded from: classes3.dex */
    public static final class e implements View.OnTouchListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent event) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d4aa3aa4", new Object[]{this, view, event})).booleanValue();
            }
            if (event.getAction() == 0 && b.this.p()) {
                b bVar = b.this;
                q.b(event, "event");
                if (b.a(bVar, event)) {
                    JSONObject data = b.c(b.this).getData();
                    com.alibaba.triver.triver_shop.newShop.ext.l.a(b.this.a(), data == null ? null : data.getString("introUrl"));
                    return true;
                }
            }
            return false;
        }
    }

    /* loaded from: classes3.dex */
    public static final class f implements ViewTreeObserver.OnGlobalLayoutListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("df7e7eb3", new Object[]{this});
            } else if (b.d(b.this).getWidth() == 0) {
            } else {
                b bVar = b.this;
                b.a(bVar, b.e(bVar));
                b.d(b.this).getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class g implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public g() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            b bVar = b.this;
            b.a(bVar, bVar.c());
        }
    }

    static {
        kge.a(-1289630827);
        kge.a(-1201612728);
    }

    public boolean q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("64de47c", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public b(Context context, com.alibaba.triver.triver_shop.newShop.data.d shopData, int i) {
        int intValue;
        String string;
        q.d(context, "context");
        q.d(shopData, "shopData");
        this.f4092a = context;
        this.b = shopData;
        this.c = i;
        this.s = new ArrayList();
        boolean z = true;
        this.t = this.b.p() == 0;
        this.u = (!this.b.bc().d() || com.alibaba.triver.triver_shop.newShop.ext.l.b()) ? false : z;
        this.T = this.b.bq();
        JSONObject V = this.b.V();
        this.y = n.a(V == null ? null : V.getString("renderStyle"), "dark", false, 2, (Object) null);
        this.P = new com.alibaba.triver.triver_shop.shop2023.data.f(0);
        this.G = new com.alibaba.triver.triver_shop.shop2023.data.e(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 65535, null);
        this.H = new com.alibaba.triver.triver_shop.shop2023.data.e(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 65535, null);
        this.I = new com.alibaba.triver.triver_shop.shop2023.data.e(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 65535, null);
        View a2 = o.a(this.f4092a, R.layout.shop_header_info_layout);
        q.a(a2);
        this.L = a2;
        View findViewById = this.L.findViewById(R.id.clickView);
        q.b(findViewById, "rootView.findViewById(R.id.clickView)");
        this.Q = findViewById;
        Map<String, ShopComponentModel> g2 = this.b.bc().g();
        q.a(g2);
        ShopComponentModel shopComponentModel = g2.get("tb_shop_header_shop_info_2023_native");
        q.a(shopComponentModel);
        this.d = shopComponentModel;
        JSONObject data = this.d.getData();
        String str = "";
        if (data != null && (string = data.getString("shopName")) != null) {
            str = string;
        }
        this.z = str;
        com.alibaba.triver.triver_shop.shop2023.data.e eVar = this.G;
        JSONObject extData = this.d.getExtData();
        eVar.a(extData == null ? null : extData.getJSONObject("defaultStyleConfig"));
        this.G.p(o.c(Integer.valueOf(this.d.getRenderHeight())));
        com.alibaba.triver.triver_shop.shop2023.data.e eVar2 = this.H;
        JSONObject extData2 = this.d.getExtData();
        eVar2.a(extData2 == null ? null : extData2.getJSONObject("foldStyleConfig"));
        com.alibaba.triver.triver_shop.shop2023.data.e eVar3 = this.H;
        JSONObject extData3 = this.d.getExtData();
        Integer valueOf = extData3 == null ? null : Integer.valueOf(extData3.getIntValue("indexPageHeaderFoldedStyleHeight"));
        Integer valueOf2 = valueOf == null ? null : Integer.valueOf(o.c(valueOf));
        eVar3.p(valueOf2 == null ? (int) (this.d.getRenderHeight() * 0.75f) : valueOf2.intValue());
        com.alibaba.triver.triver_shop.shop2023.data.e eVar4 = this.I;
        JSONObject extData4 = this.d.getExtData();
        eVar4.a(extData4 == null ? null : extData4.getJSONObject("otherPageStyleConfig"));
        com.alibaba.triver.triver_shop.shop2023.data.e eVar5 = this.I;
        JSONObject extData5 = this.d.getExtData();
        Integer valueOf3 = extData5 == null ? null : Integer.valueOf(o.c(Integer.valueOf(extData5.getIntValue("otherPageHeaderStyleHeight"))));
        if (valueOf3 != null) {
            intValue = valueOf3.intValue();
        } else {
            intValue = (int) (this.d.getRenderHeight() * 0.75f);
        }
        eVar5.p(intValue);
        b(this, "Page_Shop_Impression_Pi_Widget_Show", null, 2, null);
        b(this, "Page_Shop_ShopLogo", null, 2, null);
        b(this, "Page_Shop_ShopName", null, 2, null);
        b(this, "Page_Shop_Search-Input", null, 2, null);
        b(this, "Page_Shop_Page_Shop_Button-More", null, 2, null);
        View findViewById2 = this.L.findViewById(R.id.iv_back);
        q.b(findViewById2, "rootView.findViewById(R.id.iv_back)");
        this.e = (TUrlImageView) findViewById2;
        View findViewById3 = this.L.findViewById(R.id.fl_head);
        q.b(findViewById3, "rootView.findViewById(R.id.fl_head)");
        this.f = (FrameLayout) findViewById3;
        View findViewById4 = this.L.findViewById(R.id.iv_state);
        q.b(findViewById4, "rootView.findViewById(R.id.iv_state)");
        this.g = (TUrlImageView) findViewById4;
        View findViewById5 = this.L.findViewById(R.id.iv_logo);
        q.b(findViewById5, "rootView.findViewById(R.id.iv_logo)");
        this.h = (TUrlImageView) findViewById5;
        View findViewById6 = this.L.findViewById(R.id.iv_logo_bg);
        q.b(findViewById6, "rootView.findViewById(R.id.iv_logo_bg)");
        this.R = (ImageView) findViewById6;
        View findViewById7 = this.L.findViewById(R.id.iv_biz);
        q.b(findViewById7, "rootView.findViewById(R.id.iv_biz)");
        this.i = (TUrlImageView) findViewById7;
        View findViewById8 = this.L.findViewById(R.id.iv_rank);
        q.b(findViewById8, "rootView.findViewById(R.id.iv_rank)");
        this.j = (TUrlImageView) findViewById8;
        View findViewById9 = this.L.findViewById(R.id.iv_search);
        q.b(findViewById9, "rootView.findViewById(R.id.iv_search)");
        this.k = (TUrlImageView) findViewById9;
        View findViewById10 = this.L.findViewById(R.id.iv_more);
        q.b(findViewById10, "rootView.findViewById(R.id.iv_more)");
        this.l = (TUrlImageView) findViewById10;
        View findViewById11 = this.L.findViewById(R.id.tv_shop_name);
        q.b(findViewById11, "rootView.findViewById(R.id.tv_shop_name)");
        this.m = (AutoScrollTextView) findViewById11;
        View findViewById12 = this.L.findViewById(R.id.fl_shop_name);
        q.b(findViewById12, "rootView.findViewById(R.id.fl_shop_name)");
        this.n = (FrameLayout) findViewById12;
        View findViewById13 = this.L.findViewById(R.id.tv_fans);
        q.b(findViewById13, "rootView.findViewById(R.id.tv_fans)");
        this.o = (TextView) findViewById13;
        View findViewById14 = this.L.findViewById(R.id.ll_shop_info);
        q.b(findViewById14, "rootView.findViewById(R.id.ll_shop_info)");
        this.p = (LinearLayout) findViewById14;
        View findViewById15 = this.L.findViewById(R.id.ll_right);
        q.b(findViewById15, "rootView.findViewById(R.id.ll_right)");
        this.q = (LinearLayout) findViewById15;
        View findViewById16 = this.L.findViewById(R.id.fl_follow_button);
        q.b(findViewById16, "rootView.findViewById(R.id.fl_follow_button)");
        this.r = (FrameLayout) findViewById16;
        h();
        this.M = -1;
    }

    public static final /* synthetic */ void a(b bVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d20712cd", new Object[]{bVar, new Integer(i)});
        } else {
            bVar.d(i);
        }
    }

    public static final /* synthetic */ void a(b bVar, String str, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10939c45", new Object[]{bVar, str, map});
        } else {
            bVar.a(str, map);
        }
    }

    public static final /* synthetic */ void a(b bVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d207529e", new Object[]{bVar, new Boolean(z)});
        } else {
            bVar.N = z;
        }
    }

    public static final /* synthetic */ boolean a(b bVar, MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("dda1518f", new Object[]{bVar, motionEvent})).booleanValue() : bVar.a(motionEvent);
    }

    public static final /* synthetic */ ShopComponentModel c(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ShopComponentModel) ipChange.ipc$dispatch("d95dbc14", new Object[]{bVar}) : bVar.d;
    }

    public static final /* synthetic */ TUrlImageView d(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TUrlImageView) ipChange.ipc$dispatch("bed85e23", new Object[]{bVar}) : bVar.i;
    }

    public static final /* synthetic */ int e(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b4f871ed", new Object[]{bVar})).intValue() : bVar.O;
    }

    public static final /* synthetic */ void f(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5ae3ebb", new Object[]{bVar});
        } else {
            bVar.i();
        }
    }

    public final Context a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("75941360", new Object[]{this}) : this.f4092a;
    }

    public final TUrlImageView b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TUrlImageView) ipChange.ipc$dispatch("4309e173", new Object[]{this}) : this.e;
    }

    public final TUrlImageView l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TUrlImageView) ipChange.ipc$dispatch("4f291e29", new Object[]{this}) : this.l;
    }

    public final boolean o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("631b57a", new Object[]{this})).booleanValue() : this.u;
    }

    public final void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.x = z;
        }
    }

    public final void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.B = i;
        }
    }

    public final int c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue() : this.B;
    }

    public final void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
        } else {
            this.C = view;
        }
    }

    public final void b(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91037249", new Object[]{this, view});
        } else {
            this.D = view;
        }
    }

    public final void c(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d050128", new Object[]{this, view});
        } else {
            this.E = view;
        }
    }

    public final void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        } else {
            this.F = i;
        }
    }

    public final com.alibaba.triver.triver_shop.shop2023.data.e m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.alibaba.triver.triver_shop.shop2023.data.e) ipChange.ipc$dispatch("3220651f", new Object[]{this}) : this.I;
    }

    public final void a(com.alibaba.triver.triver_shop.shop2023.nativeview.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7221b355", new Object[]{this, cVar});
        } else {
            this.J = cVar;
        }
    }

    public final com.alibaba.triver.triver_shop.shop2023.nativeview.c d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.alibaba.triver.triver_shop.shop2023.nativeview.c) ipChange.ipc$dispatch("5f7330f8", new Object[]{this}) : this.J;
    }

    public final void a(ruk<t> rukVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdbfc750", new Object[]{this, rukVar});
        } else {
            this.K = rukVar;
        }
    }

    public final void a(rul<? super Boolean, t> rulVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdc03baf", new Object[]{this, rulVar});
        } else {
            this.S = rulVar;
        }
    }

    public final View e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("42261fae", new Object[]{this}) : this.L;
    }

    private final void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        a(this.G);
        o.c(this.e, o.d((Number) 12));
        o.c(this.q, o.d((Number) 12));
        o.e(this.e, o.c((Number) 12));
        o.b(this.e, o.c((Number) 54));
        o.a(this.e, o.c((Number) 54));
        o.b(this.k, o.d((Number) 54), o.d((Number) 54));
        o.b(this.l, o.d((Number) 54), o.d((Number) 54));
        this.f.setPivotX(0.0f);
        this.f.setPivotY(0.0f);
        this.n.setPivotX(0.0f);
        this.n.setPivotY(0.0f);
        this.p.setPivotX(0.0f);
        this.p.setPivotY(0.0f);
        o.a(this.i, o.c((Number) 20));
        o.a(this.j, o.c((Number) 20));
        this.m.getTextView().setTypeface(Typeface.DEFAULT_BOLD);
        o.b(this.m, this.G.f() * 13);
        b bVar = this;
        this.n.setOnClickListener(bVar);
        this.Q.setOnClickListener(bVar);
        o.c(this.Q, o.c((Number) 66));
        this.f.setOnClickListener(bVar);
        this.k.setOnClickListener(bVar);
        this.l.setOnClickListener(bVar);
        this.i.setOnClickListener(bVar);
        this.j.setOnClickListener(bVar);
        this.o.setOnClickListener(bVar);
        this.Q.setOnTouchListener(new e());
    }

    private final boolean a(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5f37b481", new Object[]{this, motionEvent})).booleanValue() : new Rect((int) this.n.getX(), (int) this.n.getY(), ((int) this.n.getX()) + ((int) (this.m.getTextView().getPaint().measureText(this.m.getTextView().getText().toString()) * com.alibaba.triver.triver_shop.newShop.ext.b.a(Float.valueOf((float) this.I.e()), Integer.valueOf(this.G.e())))), ((int) this.p.getY()) + this.p.getHeight()).contains((int) motionEvent.getX(), (int) motionEvent.getY());
    }

    private final void i() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        if (this.x || this.v || this.y || (this.t && !this.N && this.u)) {
            z = true;
        }
        Context context = this.f4092a;
        FragmentActivity fragmentActivity = context instanceof FragmentActivity ? (FragmentActivity) context : null;
        if (fragmentActivity != null) {
            com.alibaba.triver.triver_shop.newShop.ext.l.a(fragmentActivity, !z);
        }
        if (q.a(this.w, Boolean.valueOf(z))) {
            return;
        }
        this.w = Boolean.valueOf(z);
        if (z) {
            this.m.getTextView().setTextColor(-1);
            this.o.setTextColor(-1);
            for (View view : this.s) {
                Object tag = view.getTag();
                if (tag == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                }
                ((TextView) tag).setTextColor(-1);
            }
            this.e.setImageUrl("https://img.alicdn.com/imgextra/i2/O1CN01veFzJg1GGYWcBCdcm_!!6000000000595-2-tps-108-108.png");
            this.k.setImageUrl("https://img.alicdn.com/imgextra/i1/O1CN0190h4nA1n8f2Ld4Pk8_!!6000000005045-2-tps-216-216.png");
            this.l.setImageUrl("https://img.alicdn.com/imgextra/i1/O1CN012O9nk4293Y92xO8cN_!!6000000008012-2-tps-108-108.png");
        } else {
            this.m.getTextView().setTextColor(CollectionTabLayout.SELECTED_TEXT_COLOR);
            this.o.setTextColor(KAPContainerView.DEFAULT_MENU_COLOR);
            for (View view2 : this.s) {
                Object tag2 = view2.getTag();
                if (tag2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                }
                ((TextView) tag2).setTextColor(KAPContainerView.DEFAULT_MENU_COLOR);
            }
            this.e.setImageUrl("https://img.alicdn.com/imgextra/i1/O1CN013dzdLg1MxVMViYez0_!!6000000001501-2-tps-108-108.png");
            this.k.setImageUrl("https://img.alicdn.com/imgextra/i3/O1CN01Zv2KPX1o1cZBkUuMW_!!6000000005165-2-tps-216-216.png");
            this.l.setImageUrl("https://img.alicdn.com/imgextra/i2/O1CN01ObPozU1ErXGtZezPP_!!6000000000405-2-tps-108-108.png");
        }
        rul<? super Boolean, t> rulVar = this.S;
        if (rulVar == null) {
            return;
        }
        rulVar.mo2421invoke(Boolean.valueOf(z));
    }

    private final void a(com.alibaba.triver.triver_shop.shop2023.data.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("209225", new Object[]{this, eVar});
            return;
        }
        o.a((View) this.h, true, o.c((Number) 12));
        o.e(this.n, eVar.h());
        o.e(this.p, eVar.h());
        o.d(this.p, eVar.j());
        o.f(this.q, o.d((Number) 18));
        o.f(this.r, eVar.l());
        this.o.setTextSize(0, eVar.i());
        o.e(this.k, o.c((Number) 20));
        o.e(this.l, o.c((Number) 20));
        if (this.z.length() <= 10) {
            this.m.getTextView().setTextSize(0, eVar.e());
        } else {
            this.m.getTextView().setTextSize(0, eVar.f());
        }
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        j();
        i();
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x0242, code lost:
        if (r2 == false) goto L60;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void j() {
        /*
            Method dump skipped, instructions count: 635
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.triver.triver_shop.shop2023.nativeview.b.j():void");
    }

    public final void d(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89069007", new Object[]{this, view});
            return;
        }
        q.d(view, "view");
        this.A = view;
        this.r.addView(view, 0);
    }

    private final void a(JSONObject jSONObject, int i) {
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a78e87b", new Object[]{this, jSONObject, new Integer(i)});
            return;
        }
        View a2 = o.a(this.f4092a, R.layout.item_tag);
        q.a(a2);
        String string = jSONObject.getString("icon");
        String string2 = jSONObject.getString("text");
        String string3 = jSONObject.getString("url");
        String string4 = jSONObject.getString("utArgs");
        TUrlImageView ivIcon = (TUrlImageView) a2.findViewById(R.id.iv_icon);
        TextView textView = (TextView) a2.findViewById(R.id.tv_tag);
        a2.setImportantForAccessibility(2);
        ivIcon.setImportantForAccessibility(2);
        textView.setImportantForAccessibility(2);
        textView.setSingleLine();
        q.b(ivIcon, "ivIcon");
        TUrlImageView tUrlImageView = ivIcon;
        o.a(tUrlImageView, o.c((Number) 20));
        ivIcon.setAdjustViewBounds(true);
        String str = string;
        if (!(str == null || n.a((CharSequence) str))) {
            o.f(tUrlImageView, o.d((Number) 6));
        }
        if (this.y) {
            textView.setTextColor(-1);
        } else {
            textView.setTextColor(KAPContainerView.DEFAULT_MENU_COLOR);
        }
        textView.setTextSize(0, o.c((Number) 20));
        a2.setOnClickListener(new a(string3, this, string2, string4));
        b("Page_Shop_FeatureType", ai.b(kotlin.j.a("featureTypeName", string2), kotlin.j.a("utArgs", string4)));
        ivIcon.setImageUrl(string);
        textView.setText(string2);
        ViewGroup.LayoutParams layoutParams = a2.findViewById(R.id.divider).getLayoutParams();
        if (i != 0) {
            i2 = o.c((Number) 2);
        }
        layoutParams.width = i2;
        layoutParams.height = o.c((Number) 14);
        if (layoutParams != null) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            layoutParams2.leftMargin = o.c((Number) 6);
            layoutParams2.rightMargin = o.c((Number) 6);
            a2.setTag(textView);
            this.p.addView(a2);
            this.s.add(a2);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
    }

    public final void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
        } else if (i < 0) {
        } else {
            if (i == 0) {
                this.N = false;
                i();
                com.alibaba.triver.triver_shop.shop2023.nativeview.c cVar = this.J;
                if (cVar != null) {
                    cVar.b(false);
                }
            } else if (i == this.B) {
                this.N = true;
                i();
                com.alibaba.triver.triver_shop.shop2023.nativeview.c cVar2 = this.J;
                if (cVar2 != null) {
                    cVar2.b(true);
                }
            }
            if (!(((double) com.alibaba.triver.triver_shop.newShop.ext.b.a(Float.valueOf((float) Math.abs(i)), Integer.valueOf(this.B))) >= 0.15d)) {
                com.alibaba.triver.triver_shop.shop2023.nativeview.c cVar3 = this.J;
                if (cVar3 != null) {
                    cVar3.b(false);
                }
            } else {
                com.alibaba.triver.triver_shop.shop2023.nativeview.c cVar4 = this.J;
                if (cVar4 != null) {
                    cVar4.b(true);
                }
            }
            if (p() && i < this.B) {
                return;
            }
            d(i);
        }
    }

    public boolean p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("63fccfb", new Object[]{this})).booleanValue() : this.t && this.u;
    }

    private final void d(int i) {
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        FrameLayout frameLayout3;
        FrameLayout frameLayout4;
        LinearLayout linearLayout;
        FrameLayout frameLayout5;
        FrameLayout frameLayout6;
        TUrlImageView tUrlImageView;
        View view;
        IpChange ipChange = $ipChange;
        int i2 = 1;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad401d78", new Object[]{this, new Integer(i)});
            return;
        }
        if (this.M == -1 && (view = this.D) != null) {
            q.a(view);
            this.M = (int) view.getY();
        }
        int i3 = this.B;
        if (i3 == 0) {
            ceg.Companion.c("hhh contentMaxMoveUpDistance=0");
        } else if (i > i3) {
        } else {
            this.O = i;
            float a2 = com.alibaba.triver.triver_shop.newShop.ext.b.a(Float.valueOf(Math.abs(i)), Integer.valueOf(this.B));
            float a3 = com.alibaba.triver.triver_shop.newShop.ext.b.a(Float.valueOf(this.I.a()), Integer.valueOf(this.G.a()));
            float f2 = 1;
            float f3 = f2 - a2;
            float f4 = a3 + ((f2 - a3) * f3);
            float m = (this.G.m() - this.I.m()) * 0.85f;
            float f5 = a2 * m;
            this.f.setY(frameLayout.getTop() - f5);
            this.f.setX(frameLayout2.getLeft() + (o.d((Number) 45) * a2));
            this.f.setScaleX(f4);
            this.f.setScaleY(f4);
            int b = this.G.b() - this.I.b();
            float a4 = com.alibaba.triver.triver_shop.newShop.ext.b.a(Float.valueOf(this.I.e()), Integer.valueOf(this.G.e()));
            float f6 = a4 + ((f2 - a4) * f3);
            this.n.setScaleX(f6);
            this.n.setScaleY(f6);
            float f7 = b;
            this.n.setX((frameLayout3.getLeft() - ((a2 * f7) * 1.3f)) + (o.d((Number) 45) * a2));
            this.n.setY(frameLayout4.getTop() - (((0.25f * f7) + (1.06f * m)) * a2));
            if (q()) {
                this.i.scrollTo((int) (tUrlImageView.getWidth() * a2), 0);
                this.i.setAlpha(f3);
            }
            this.p.setX(this.n.getX());
            this.p.setY(linearLayout.getTop() - (((0.95f * m) + f7) * a2));
            int childCount = this.p.getChildCount();
            if (1 < childCount) {
                while (true) {
                    int i4 = i2 + 1;
                    View childAt = this.p.getChildAt(i2);
                    if (q()) {
                        childAt.setTranslationX((-a2) * this.i.getWidth());
                    }
                    if (i2 >= 3) {
                        childAt.setAlpha(f2 - (2 * a2));
                    }
                    if (i4 >= childCount) {
                        break;
                    }
                    i2 = i4;
                }
            }
            this.r.setY(frameLayout5.getTop() - (f5 * 1.05f));
            this.r.setX(frameLayout6.getLeft() - (o.d(Integer.valueOf((int) SecExceptionCode.SEC_ERROR_INIT_CLAZZ_NULL_ERROR)) * a2));
            View view2 = this.D;
            if (view2 != null) {
                view2.setY(this.M - ((f7 + m) * a2));
            }
            View view3 = this.E;
            if (view3 != null) {
                view3.setAlpha(f2 - (2 * a2));
            }
            this.k.setAlpha((3 * a2) - 2);
            if (a2 < 0.1f) {
                View view4 = this.C;
                if (view4 != null) {
                    view4.setZ(1.0f);
                }
                o.a(this.Q, -1);
                o.c(this.Q, o.c((Number) 66));
            } else if (a2 > 0.9f) {
                View view5 = this.C;
                if (view5 != null) {
                    view5.setZ(0.0f);
                }
                o.a(this.Q, this.I.n());
                o.c(this.Q, 0);
            }
            this.P.a(i - this.B);
            this.P.b();
        }
    }

    public final void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(i2);
        ofInt.setInterpolator(new LinearInterpolator());
        ofInt.addUpdateListener(new C0156b(i));
        ofInt.start();
    }

    public final void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else if (!this.x) {
        } else {
            c(this.B);
        }
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        this.t = false;
        k();
        c(this.B);
    }

    private final void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        this.m.stopScroll();
        this.m.startScroll();
    }

    public final void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
            return;
        }
        this.t = true;
        AutoScrollTextView autoScrollTextView = this.m;
        autoScrollTextView.setRight(autoScrollTextView.getLeft() + (this.G.f() * 13));
        k();
        com.alibaba.triver.triver_shop.shop2023.nativeview.c cVar = this.J;
        if (cVar != null) {
            cVar.b(!z);
        }
        if (z) {
            this.L.post(new c(z));
        } else {
            this.L.post(new d());
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, v});
            return;
        }
        q.d(v, "v");
        int id = v.getId();
        String str = null;
        if (id == R.id.clickView) {
            if (this.u && this.t && !this.N) {
                ruk<t> rukVar = this.K;
                if (rukVar == null) {
                    return;
                }
                rukVar.mo2427invoke();
                return;
            }
            JSONObject data = this.d.getData();
            if (data != null) {
                str = data.getString("introUrl");
            }
            com.alibaba.triver.triver_shop.newShop.ext.l.a(this.f4092a, str);
        } else if (id == R.id.fl_head) {
            a(this, "Page_Shop_ShopLogo", null, 2, null);
            if (this.T && !this.x) {
                ruk<t> rukVar2 = this.K;
                if (rukVar2 == null) {
                    return;
                }
                rukVar2.mo2427invoke();
                return;
            }
            JSONObject data2 = this.d.getData();
            if (data2 != null) {
                str = data2.getString("introUrl");
            }
            com.alibaba.triver.triver_shop.newShop.ext.l.a(this.f4092a, str);
        } else {
            if (!((id == R.id.fl_shop_name || id == R.id.iv_biz) || id == R.id.iv_rank) && id != R.id.tv_fans) {
                z = false;
            }
            if (z) {
                JSONObject data3 = this.d.getData();
                com.alibaba.triver.triver_shop.newShop.ext.l.a(this.f4092a, data3 == null ? null : data3.getString("introUrl"));
                if (v.getId() != R.id.fl_shop_name) {
                    return;
                }
                a(this, "Page_Shop_ShopName", null, 2, null);
            } else if (id == R.id.iv_search) {
                JSONObject data4 = this.d.getData();
                com.alibaba.triver.triver_shop.newShop.ext.l.a(this.f4092a, data4 == null ? null : data4.getString("searchUrl"));
                com.alibaba.triver.triver_shop.newShop.ext.j.c(this.b);
                a(this, "Page_Shop_Search-Input", null, 2, null);
            } else if (id != R.id.iv_more) {
            } else {
                n();
            }
        }
    }

    private final void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
            return;
        }
        Activity activity = (Activity) this.f4092a;
        com.alibaba.triver.triver_shop.newShop.data.d dVar = this.b;
        com.alibaba.triver.triver_shop.d.INSTANCE.a(activity, dVar, dVar.L(), this.b.K(), null, null, null);
        if (!this.b.t()) {
            com.alibaba.triver.triver_shop.newShop.ext.j.a(this.b);
        }
        a(this, "Page_Shop_Page_Shop_Button-More", null, 2, null);
    }

    public final void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad405d49", new Object[]{this, new Boolean(z)});
        } else if (z) {
            o.d(this.f);
            o.d(this.n);
            o.d(this.p);
            View view = this.A;
            if (view != null) {
                o.d(view);
            }
            o.d(this.k);
            o.d(this.Q);
        } else {
            o.b(this.f);
            o.b(this.n);
            o.b(this.p);
            View view2 = this.A;
            if (view2 != null) {
                o.b(view2);
            }
            o.b(this.k);
            o.b(this.Q);
        }
    }

    public final void e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef535e8", new Object[]{this, new Boolean(z)});
            return;
        }
        this.v = z;
        i();
    }

    public final void f(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0aa0e87", new Object[]{this, new Boolean(z)});
            return;
        }
        this.T = z;
        if (this.T) {
            o.b(this.g);
        } else {
            o.d(this.g);
        }
    }

    public static /* synthetic */ void a(b bVar, String str, Map map, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dfa73ba", new Object[]{bVar, str, map, new Integer(i), obj});
        } else if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: utNativeShopClick");
        } else {
            if ((i & 2) != 0) {
                map = null;
            }
            bVar.a(str, map);
        }
    }

    private final void a(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{this, str, map});
        } else {
            com.alibaba.triver.triver_shop.newShop.ext.m.a(ShopConstants.PAGE_SHOP, str, a(map));
        }
    }

    public static /* synthetic */ void b(b bVar, String str, Map map, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce211fb", new Object[]{bVar, str, map, new Integer(i), obj});
        } else if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: utNativeShopExpose");
        } else {
            if ((i & 2) != 0) {
                map = null;
            }
            bVar.b(str, map);
        }
    }

    private final void b(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("819a01b2", new Object[]{this, str, map});
        } else {
            com.alibaba.triver.triver_shop.newShop.ext.m.b(ShopConstants.PAGE_SHOP, str, a(map));
        }
    }

    private final HashMap<String, String> a(Map<String, String> map) {
        String styleName;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("a289da40", new Object[]{this, map});
        }
        HashMap<String, String> J = this.b.J();
        HashMap<String, String> hashMap = J;
        hashMap.put("shop_id", this.b.T());
        hashMap.put("seller_id", this.b.U());
        hashMap.put("identityCode", this.b.ba());
        hashMap.put("industryShop", this.b.as());
        if (this.t) {
            if (this.N) {
                styleName = Shop2023HeaderInfoTemplate.HeaderStyle.INDEX_PAGE_FOLDED.getStyleName();
            } else {
                styleName = Shop2023HeaderInfoTemplate.HeaderStyle.DEFAULT.getStyleName();
            }
        } else {
            styleName = Shop2023HeaderInfoTemplate.HeaderStyle.OTHER_PAGE.getStyleName();
        }
        hashMap.put("currentStyle", styleName);
        hashMap.put("identityCode", this.b.ba());
        if (map != null) {
            J.putAll(map);
        }
        return J;
    }
}
