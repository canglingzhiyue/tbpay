package tb;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.Outline;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import mtopsdk.common.util.StringUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.Window;
import android.widget.FrameLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.l;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.newresult.base.IrpDatasource;
import com.etao.feimagesearch.newresult.widget.titlebar.c;
import com.etao.feimagesearch.result.ScrollInterceptView;
import com.taobao.android.searchbaseframe.uikit.screentype.ScreenType;
import com.taobao.android.searchbaseframe.util.j;
import com.taobao.monitor.procedure.v;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import kotlin.TypeCastException;
import kotlin.jvm.internal.q;
import tb.cqt;

/* loaded from: classes3.dex */
public final class cqs extends igj<ScrollInterceptView, IrpDatasource> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private boolean f26443a;
    private LottieAnimationView b;
    private FrameLayout c;
    private View d;
    private cqw e;
    private com.etao.feimagesearch.newresult.widget.titlebar.c f;
    private TUrlImageView g;
    private boolean h;
    private ScrollInterceptView.b i;
    private c.a j;
    private cqt.a k;
    private a l;
    private float m;
    private boolean n;
    private View p;
    private boolean s;

    /* loaded from: classes3.dex */
    public interface a {
    }

    /* loaded from: classes3.dex */
    public static final class e implements l {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ LottieAnimationView f26447a;

        public e(LottieAnimationView lottieAnimationView) {
            this.f26447a = lottieAnimationView;
        }

        @Override // com.airbnb.lottie.l
        public final void onCompositionLoaded(com.airbnb.lottie.g gVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("90ed5f5e", new Object[]{this, gVar});
            } else {
                this.f26447a.playAnimation();
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class f implements View.OnLayoutChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ScrollInterceptView f26448a;

        public f(ScrollInterceptView scrollInterceptView) {
            this.f26448a = scrollInterceptView;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("899df952", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8)});
            } else if (i8 - i6 == i4 - i2 || this.f26448a.getChildState() != 0) {
            } else {
                ScrollInterceptView scrollInterceptView = this.f26448a;
                scrollInterceptView.moveChildTo(scrollInterceptView.getDownStateOffset());
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class g extends ViewOutlineProvider {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7054f590", new Object[]{this, view, outline});
            } else if (outline == null) {
            } else {
                outline.setRoundRect(0, 0, view != null ? view.getWidth() : 0, view != null ? view.getHeight() : 0, j.b(6.5f));
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class h implements ScrollInterceptView.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public h() {
        }

        @Override // com.etao.feimagesearch.result.ScrollInterceptView.a
        public final boolean a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
            }
            if (!cqs.a(cqs.this) && !cqs.b(cqs.this).eE_()) {
                return cqs.c(cqs.this).i();
            }
            return false;
        }
    }

    /* loaded from: classes3.dex */
    public static final class i implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ int b;

        public i(int i) {
            this.b = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            com.taobao.android.searchbaseframe.xsl.refact.f.a(cqs.d(cqs.this), this.b);
            View e = cqs.e(cqs.this);
            if (e == null) {
                return;
            }
            int height = cqs.d(cqs.this).getHeight() - this.b;
            if (!cqs.f(cqs.this)) {
                height -= cqs.b(cqs.this).eB_();
            }
            ViewGroup.LayoutParams layoutParams = e.getLayoutParams();
            layoutParams.height = height;
            e.setLayoutParams(layoutParams);
        }
    }

    static {
        kge.a(2014772572);
    }

    public static /* synthetic */ Object ipc$super(cqs cqsVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static final /* synthetic */ void a(cqs cqsVar, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90889aff", new Object[]{cqsVar, view});
        } else {
            cqsVar.d = view;
        }
    }

    public static final /* synthetic */ void a(cqs cqsVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a59b641", new Object[]{cqsVar, new Boolean(z)});
        } else {
            cqsVar.c(z);
        }
    }

    public static final /* synthetic */ boolean a(cqs cqsVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e3f25af7", new Object[]{cqsVar})).booleanValue() : cqsVar.f26443a;
    }

    public static final /* synthetic */ com.etao.feimagesearch.newresult.widget.titlebar.c b(cqs cqsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.etao.feimagesearch.newresult.widget.titlebar.c) ipChange.ipc$dispatch("a919dd8", new Object[]{cqsVar});
        }
        com.etao.feimagesearch.newresult.widget.titlebar.c cVar = cqsVar.f;
        if (cVar == null) {
            q.b("irpTitleBarWidget");
        }
        return cVar;
    }

    public static final /* synthetic */ cqw c(cqs cqsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cqw) ipChange.ipc$dispatch("4f1cb848", new Object[]{cqsVar});
        }
        cqw cqwVar = cqsVar.e;
        if (cqwVar == null) {
            q.b("irpHybridWidget");
        }
        return cqwVar;
    }

    public static final /* synthetic */ void c(cqs cqsVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e15497f", new Object[]{cqsVar, new Boolean(z)});
        } else {
            cqsVar.f(z);
        }
    }

    public static final /* synthetic */ FrameLayout d(cqs cqsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("98a140a3", new Object[]{cqsVar});
        }
        FrameLayout frameLayout = cqsVar.c;
        if (frameLayout == null) {
            q.b("mainContainerParent");
        }
        return frameLayout;
    }

    public static final /* synthetic */ View e(cqs cqsVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("a6ac5d79", new Object[]{cqsVar}) : cqsVar.d;
    }

    public static final /* synthetic */ boolean f(cqs cqsVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8c817b7c", new Object[]{cqsVar})).booleanValue() : cqsVar.h;
    }

    public static final /* synthetic */ boolean g(cqs cqsVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7b0481fd", new Object[]{cqsVar})).booleanValue() : cqsVar.n;
    }

    public static final /* synthetic */ TUrlImageView h(cqs cqsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TUrlImageView) ipChange.ipc$dispatch("8ff5cd42", new Object[]{cqsVar});
        }
        TUrlImageView tUrlImageView = cqsVar.g;
        if (tUrlImageView == null) {
            q.b("titleBarBgImageView");
        }
        return tUrlImageView;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [com.etao.feimagesearch.result.ScrollInterceptView, android.view.View] */
    @Override // tb.igj
    public /* synthetic */ ScrollInterceptView k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("ff4fb734", new Object[]{this}) : a();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cqs(Activity activity, hon parent, IrpDatasource irpDatasource, igi setter, ScrollInterceptView.b bVar, c.a aVar, cqt.a aVar2, a aVar3) {
        super(activity, parent, irpDatasource, setter);
        q.c(activity, "activity");
        q.c(parent, "parent");
        q.c(irpDatasource, "irpDatasource");
        q.c(setter, "setter");
        this.i = bVar;
        this.j = aVar;
        this.k = aVar2;
        this.l = aVar3;
        this.h = true;
    }

    public final boolean eo_() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a18f8b00", new Object[]{this})).booleanValue() : this.s;
    }

    public final void g(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b25ee726", new Object[]{this, new Boolean(z)});
        } else {
            this.s = z;
        }
    }

    public final float ep_() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a344638b", new Object[]{this})).floatValue() : this.m;
    }

    public ScrollInterceptView a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScrollInterceptView) ipChange.ipc$dispatch("360e1362", new Object[]{this});
        }
        View inflate = LayoutInflater.from(g()).inflate(R.layout.feis_view_irp_scroll_intercept, P(), false);
        if (inflate == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.etao.feimagesearch.result.ScrollInterceptView");
        }
        ScrollInterceptView scrollInterceptView = (ScrollInterceptView) inflate;
        View findViewById = scrollInterceptView.findViewById(R.id.container);
        q.a((Object) findViewById, "rootView.findViewById(R.id.container)");
        this.c = (FrameLayout) findViewById;
        View findViewById2 = scrollInterceptView.findViewById(R.id.view_title_bg);
        q.a((Object) findViewById2, "this");
        ViewGroup.LayoutParams layoutParams = findViewById2.getLayoutParams();
        if (layoutParams == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.height = com.e(g()) / 2;
        layoutParams2.setMargins(0, j.a(m().H().e()), 0, 0);
        findViewById2.setLayoutParams(layoutParams2);
        q.a((Object) findViewById2, "rootView.findViewById<Vi…et)), 0, 0)\n      }\n    }");
        this.p = findViewById2;
        View findViewById3 = scrollInterceptView.findViewById(R.id.tiv_bg);
        q.a((Object) findViewById3, "rootView.findViewById(R.id.tiv_bg)");
        this.g = (TUrlImageView) findViewById3;
        c(true);
        a(scrollInterceptView);
        a(false, scrollInterceptView);
        eP_();
        cqw cqwVar = this.e;
        if (cqwVar == null) {
            q.b("irpHybridWidget");
        }
        cqwVar.eu_();
        scrollInterceptView.setStateProvider(new h());
        scrollInterceptView.setOffsetCallback(this.i);
        scrollInterceptView.addOnLayoutChangeListener(new f(scrollInterceptView));
        return scrollInterceptView;
    }

    /* loaded from: classes3.dex */
    public static final class c implements igi {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // tb.igi
        public ViewGroup a(View widgetView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ViewGroup) ipChange.ipc$dispatch("f6a8ff6b", new Object[]{this, widgetView});
            }
            q.c(widgetView, "widgetView");
            cqs.d(cqs.this).addView(widgetView, new FrameLayout.LayoutParams(-1, cqs.b(cqs.this).eB_()));
            return cqs.d(cqs.this);
        }

        @Override // tb.igi
        public ViewGroup b(View widgetView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ViewGroup) ipChange.ipc$dispatch("6c2325ac", new Object[]{this, widgetView});
            }
            q.c(widgetView, "widgetView");
            cqs.d(cqs.this).removeView(widgetView);
            return cqs.d(cqs.this);
        }
    }

    private final void a(boolean z, ScrollInterceptView scrollInterceptView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea1a049e", new Object[]{this, new Boolean(z), scrollInterceptView});
            return;
        }
        c cVar = new c();
        d dVar = new d();
        String i2 = m().H().i();
        this.f = (i2.hashCode() == 3556653 && i2.equals("text")) ? new com.etao.feimagesearch.newresult.widget.titlebar.g(g(), this, m(), cVar) : new com.etao.feimagesearch.newresult.widget.titlebar.i(g(), this, m(), cVar, z, dVar);
        com.etao.feimagesearch.newresult.widget.titlebar.c cVar2 = this.f;
        if (cVar2 == null) {
            q.b("irpTitleBarWidget");
        }
        cVar2.a(this.j);
        com.etao.feimagesearch.newresult.widget.titlebar.c cVar3 = this.f;
        if (cVar3 == null) {
            q.b("irpTitleBarWidget");
        }
        igj.a(cVar3, null, 1, null);
        com.etao.feimagesearch.newresult.widget.titlebar.c cVar4 = this.f;
        if (cVar4 == null) {
            q.b("irpTitleBarWidget");
        }
        scrollInterceptView.setHeaderHeight(cVar4.eB_());
        this.m = m().H().l();
        scrollInterceptView.setDownContentHeight(j.a(this.m));
        b(!m().H().k());
        b(j.a(m().H().e()));
        LottieAnimationView lottieAnimationView = this.b;
        if (lottieAnimationView == null) {
            q.b("irpLoadingSketchLottieView");
        }
        if (lottieAnimationView.getVisibility() == 0) {
            LottieAnimationView lottieAnimationView2 = this.b;
            if (lottieAnimationView2 == null) {
                q.b("irpLoadingSketchLottieView");
            }
            lottieAnimationView2.setTag(v.APM_VIEW_TOKEN, v.APM_VIEW_IGNORE);
            LottieAnimationView lottieAnimationView3 = this.b;
            if (lottieAnimationView3 == null) {
                q.b("irpLoadingSketchLottieView");
            }
            com.etao.feimagesearch.newresult.widget.titlebar.c cVar5 = this.f;
            if (cVar5 == null) {
                q.b("irpTitleBarWidget");
            }
            lottieAnimationView3.setTranslationY(cVar5.eB_());
        }
        com.etao.feimagesearch.newresult.widget.titlebar.c cVar6 = this.f;
        if (cVar6 == null) {
            q.b("irpTitleBarWidget");
        }
        if (!(cVar6 instanceof com.etao.feimagesearch.newresult.widget.titlebar.g)) {
            return;
        }
        f(true);
    }

    /* loaded from: classes3.dex */
    public static final class d implements com.etao.feimagesearch.newresult.widget.titlebar.searchbar.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // com.etao.feimagesearch.newresult.widget.titlebar.searchbar.a
        public void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            } else {
                cqs.c(cqs.this).a(cqs.b(cqs.this).eB_());
            }
        }

        @Override // com.etao.feimagesearch.newresult.widget.titlebar.searchbar.a
        public void b(boolean z) {
            IpChange ipChange = $ipChange;
            int i = 0;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
                return;
            }
            cqs.c(cqs.this).a(z);
            cqs.this.a(z);
            if (cqs.g(cqs.this)) {
                TUrlImageView h = cqs.h(cqs.this);
                if (z) {
                    i = 8;
                }
                h.setVisibility(i);
            }
            cqs.a(cqs.this, !z);
            cqs.c(cqs.this, z);
        }

        @Override // com.etao.feimagesearch.newresult.widget.titlebar.searchbar.a
        public void a(JSONArray jSONArray) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ad9ea590", new Object[]{this, jSONArray});
            } else {
                cqs.c(cqs.this).a(jSONArray);
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class b implements igi {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.igi
        public ViewGroup a(View widgetView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ViewGroup) ipChange.ipc$dispatch("f6a8ff6b", new Object[]{this, widgetView});
            }
            q.c(widgetView, "widgetView");
            cqs.a(cqs.this, widgetView);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(Color.parseColor("#F3F6F8"));
            gradientDrawable.setShape(0);
            float b = j.b(6.5f);
            gradientDrawable.setCornerRadii(new float[]{b, b, b, b, 0.0f, 0.0f, 0.0f, 0.0f});
            widgetView.setBackground(gradientDrawable);
            widgetView.setTranslationY(cqs.b(cqs.this).eB_());
            cqs.d(cqs.this).addView(widgetView, layoutParams);
            return cqs.d(cqs.this);
        }

        @Override // tb.igi
        public ViewGroup b(View widgetView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ViewGroup) ipChange.ipc$dispatch("6c2325ac", new Object[]{this, widgetView});
            }
            q.c(widgetView, "widgetView");
            cqs.d(cqs.this).removeView(widgetView);
            return cqs.d(cqs.this);
        }
    }

    private final void eP_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ca94fbb", new Object[]{this});
            return;
        }
        this.e = new cqw(g(), this, m(), new b(), this.k);
        cqw cqwVar = this.e;
        if (cqwVar == null) {
            q.b("irpHybridWidget");
        }
        igj.a(cqwVar, null, 1, null);
    }

    private final void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
        } else if (z) {
            View view = this.p;
            if (view == null) {
                q.b("titleBarBgView");
            }
            view.setClipToOutline(true);
            View view2 = this.p;
            if (view2 == null) {
                q.b("titleBarBgView");
            }
            view2.setOutlineProvider(new g());
        } else {
            View view3 = this.p;
            if (view3 == null) {
                q.b("titleBarBgView");
            }
            view3.setClipToOutline(false);
        }
    }

    private final void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
            return;
        }
        View findViewById = view.findViewById(R.id.lav_loading_sketch);
        LottieAnimationView lottieAnimationView = (LottieAnimationView) findViewById;
        if (m().I()) {
            Activity g2 = g();
            if (g2 == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.taobao.android.xsearchplugin.muise.IDarkModeHolder");
            }
            lottieAnimationView.setBackgroundColor(Color.parseColor(((com.taobao.android.xsearchplugin.muise.f) g2).g() ? "#222222" : "#FFFFFF"));
            q.a((Object) lottieAnimationView, "this");
            lottieAnimationView.setVisibility(0);
            lottieAnimationView.setImageAssetsFolder("");
            lottieAnimationView.setRepeatCount(-1);
            lottieAnimationView.addLottieOnCompositionLoadedListener(new e(lottieAnimationView));
            lottieAnimationView.setAnimationFromUrl(n());
        } else {
            q.a((Object) lottieAnimationView, "this");
            lottieAnimationView.setVisibility(8);
        }
        q.a((Object) findViewById, "rootView.findViewById<Lo…ew.GONE\n        }\n      }");
        this.b = lottieAnimationView;
    }

    private final String n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("84c15f4b", new Object[]{this});
        }
        ScreenType a2 = ScreenType.a(g());
        if (a2 == null) {
            return "https://g.alicdn.com/ani-assets/73f74cc0f46bd27a6056158fe4c7d703/0.0.1/lottie.json";
        }
        q.a((Object) a2, "ScreenType.obtain(activity) ?: return defaultUrl");
        return (!com.s() || a2.a() != 3) ? com.r() ? a2.a() == 2 ? "https://g.alicdn.com/ani-assets/0c9f0828a319252ecb391debaf34d201/0.0.1/lottie.json" : "https://g.alicdn.com/ani-assets/bb330b24257c3a2bd53a5bce17749f37/0.0.1/lottie.json" : "https://g.alicdn.com/ani-assets/73f74cc0f46bd27a6056158fe4c7d703/0.0.1/lottie.json" : "https://g.alicdn.com/ani-assets/7f87652353529bd5a5d34476e3f627a8/0.0.1/lottie.json";
    }

    private final void f(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0aa0e87", new Object[]{this, new Boolean(z)});
        } else if (z) {
            Window window = g().getWindow();
            window.setStatusBarColor(Color.parseColor("#F3F6F8"));
            if (Build.VERSION.SDK_INT < 23) {
                return;
            }
            View decorView = window.getDecorView();
            q.a((Object) decorView, "decorView");
            View decorView2 = window.getDecorView();
            q.a((Object) decorView2, "decorView");
            decorView.setSystemUiVisibility(decorView2.getSystemUiVisibility() | 8192);
        } else {
            Window window2 = g().getWindow();
            window2.setStatusBarColor(0);
            if (Build.VERSION.SDK_INT < 23) {
                return;
            }
            View decorView3 = window2.getDecorView();
            q.a((Object) decorView3, "decorView");
            View decorView4 = window2.getDecorView();
            q.a((Object) decorView4, "decorView");
            decorView3.setSystemUiVisibility(decorView4.getSystemUiVisibility() & (-8193));
        }
    }

    public final void a(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cdec50f", new Object[]{this, num});
            return;
        }
        com.etao.feimagesearch.newresult.widget.titlebar.c cVar = this.f;
        if (cVar == null) {
            q.b("irpTitleBarWidget");
        }
        cVar.a(num);
    }

    public final void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b576", new Object[]{this});
            return;
        }
        com.etao.feimagesearch.newresult.widget.titlebar.c cVar = this.f;
        if (cVar == null) {
            q.b("irpTitleBarWidget");
        }
        if (!cVar.j()) {
            return;
        }
        com.etao.feimagesearch.newresult.widget.titlebar.c cVar2 = this.f;
        if (cVar2 == null) {
            q.b("irpTitleBarWidget");
        }
        cVar2.K();
        cqw cqwVar = this.e;
        if (cqwVar == null) {
            q.b("irpHybridWidget");
        }
        cqwVar.a(0.0f);
        ScrollInterceptView O = O();
        if (O != null) {
            O.setHeaderHeight(0);
        }
        Window window = g().getWindow();
        q.a((Object) window, "activity.window");
        window.setStatusBarColor(Color.parseColor("#F7F7F7"));
    }

    public final void e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef535e8", new Object[]{this, new Boolean(z)});
            return;
        }
        com.etao.feimagesearch.newresult.widget.titlebar.c cVar = this.f;
        if (cVar == null) {
            q.b("irpTitleBarWidget");
        }
        cVar.K();
        FrameLayout frameLayout = this.c;
        if (frameLayout == null) {
            q.b("mainContainerParent");
        }
        com.etao.feimagesearch.newresult.widget.titlebar.c cVar2 = this.f;
        if (cVar2 == null) {
            q.b("irpTitleBarWidget");
        }
        frameLayout.removeView(cVar2.O());
        FrameLayout frameLayout2 = this.c;
        if (frameLayout2 == null) {
            q.b("mainContainerParent");
        }
        cqw cqwVar = this.e;
        if (cqwVar == null) {
            q.b("irpHybridWidget");
        }
        frameLayout2.removeView(cqwVar.O());
        ScrollInterceptView O = O();
        if (O == null) {
            q.a();
        }
        a(z, O);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        cqw cqwVar2 = this.e;
        if (cqwVar2 == null) {
            q.b("irpHybridWidget");
        }
        FrameLayout O2 = cqwVar2.O();
        if (O2 != null) {
            com.etao.feimagesearch.newresult.widget.titlebar.c cVar3 = this.f;
            if (cVar3 == null) {
                q.b("irpTitleBarWidget");
            }
            O2.setTranslationY(cVar3.eB_());
        }
        FrameLayout frameLayout3 = this.c;
        if (frameLayout3 == null) {
            q.b("mainContainerParent");
        }
        cqw cqwVar3 = this.e;
        if (cqwVar3 == null) {
            q.b("irpHybridWidget");
        }
        frameLayout3.addView(cqwVar3.O(), layoutParams);
    }

    public final void a(boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7197a36", new Object[]{this, new Boolean(z), str});
        } else if (z) {
            if (StringUtils.isEmpty(str)) {
                return;
            }
            this.n = true;
            TUrlImageView tUrlImageView = this.g;
            if (tUrlImageView == null) {
                q.b("titleBarBgImageView");
            }
            tUrlImageView.setImageUrl(str);
            TUrlImageView tUrlImageView2 = this.g;
            if (tUrlImageView2 == null) {
                q.b("titleBarBgImageView");
            }
            tUrlImageView2.setVisibility(0);
        } else {
            this.n = false;
            TUrlImageView tUrlImageView3 = this.g;
            if (tUrlImageView3 == null) {
                q.b("titleBarBgImageView");
            }
            tUrlImageView3.setVisibility(8);
        }
    }

    public final void a(float f2, long j, cso csoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9e5017d", new Object[]{this, new Float(f2), new Long(j), csoVar});
            return;
        }
        ScrollInterceptView O = O();
        if (O == null) {
            return;
        }
        O.movePageToAssignPageLocationRatioWithAnim(f2, j, csoVar);
    }

    public final com.etao.feimagesearch.newresult.widget.titlebar.c eq_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.etao.feimagesearch.newresult.widget.titlebar.c) ipChange.ipc$dispatch("e02ae952", new Object[]{this});
        }
        com.etao.feimagesearch.newresult.widget.titlebar.c cVar = this.f;
        if (cVar == null) {
            q.b("irpTitleBarWidget");
        }
        return cVar;
    }

    public final cqw er_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cqw) ipChange.ipc$dispatch("527982e4", new Object[]{this});
        }
        cqw cqwVar = this.e;
        if (cqwVar == null) {
            q.b("irpHybridWidget");
        }
        return cqwVar;
    }

    public final void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        this.f26443a = z;
        ScrollInterceptView O = O();
        if (O == null) {
            q.a();
        }
        O.setViewLockUp(Boolean.valueOf(z));
    }

    public final void a(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i2)});
            return;
        }
        ScrollInterceptView O = O();
        if (O == null) {
            q.a();
        }
        O.flyChildTo(i2);
    }

    public final boolean es_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a862ed7c", new Object[]{this})).booleanValue();
        }
        ScrollInterceptView O = O();
        if (O == null) {
            return false;
        }
        return O.isReachTop();
    }

    public final void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else {
            this.h = z;
        }
    }

    public final boolean et_() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("aa17c61b", new Object[]{this})).booleanValue() : this.h;
    }

    public final void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        LottieAnimationView lottieAnimationView = this.b;
        if (lottieAnimationView == null) {
            q.b("irpLoadingSketchLottieView");
        }
        lottieAnimationView.cancelAnimation();
        LottieAnimationView lottieAnimationView2 = this.b;
        if (lottieAnimationView2 == null) {
            q.b("irpLoadingSketchLottieView");
        }
        lottieAnimationView2.setVisibility(8);
    }

    public final float i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5dd2860", new Object[]{this})).floatValue();
        }
        ScrollInterceptView O = O();
        if (O == null) {
            q.a();
        }
        return O.getDownStateOffset();
    }

    public final void b(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i2)});
        } else if (i2 <= 0) {
        } else {
            FrameLayout frameLayout = this.c;
            if (frameLayout == null) {
                q.b("mainContainerParent");
            }
            frameLayout.post(new i(i2));
        }
    }
}
