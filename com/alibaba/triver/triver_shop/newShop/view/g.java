package com.alibaba.triver.triver_shop.newShop.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.taobao.windvane.extra.uc.WVUCWebViewClient;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.triver.triver_shop.newShop.data.d;
import com.alibaba.triver.triver_shop.newShop.view.H5ShopContentRender$rootContainer$2;
import com.alibaba.triver.triver_shop.newShop.view.extend.ShopWrapWebView;
import com.alibaba.triver.triver_shop.web.ShopBaseWebView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.uc.webview.export.WebView;
import kotlin.Result;
import kotlin.t;
import tb.ceg;
import tb.cen;
import tb.kge;
import tb.rul;

/* loaded from: classes3.dex */
public final class g extends com.alibaba.triver.triver_shop.newShop.view.b implements ShopBaseWebView.d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final com.alibaba.triver.triver_shop.newShop.data.g f3984a;
    private final String b;
    private final Context c;
    private final boolean d;
    private ShopWrapWebView e;
    private final kotlin.d f;
    private final com.alibaba.triver.triver_shop.newShop.view.extend.d g;
    private final com.alibaba.triver.triver_shop.newShop.view.extend.e h;

    /* loaded from: classes3.dex */
    public static final class b implements View.OnLayoutChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private int b;

        public b() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            ViewGroup.LayoutParams layoutParams;
            IpChange ipChange = $ipChange;
            int i9 = 0;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("899df952", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8)});
                return;
            }
            this.b++;
            ShopWrapWebView a2 = g.a(g.this);
            Integer num = null;
            if (a2 != null && (layoutParams = a2.getLayoutParams()) != null) {
                num = Integer.valueOf(layoutParams.height);
            }
            if (this.b >= 3 && (num == null || num.intValue() != -1)) {
                ceg.Companion.b(kotlin.jvm.internal.q.a("h5 content render : last height : ", (Object) num));
                g.b(g.this).removeOnLayoutChangeListener(this);
                return;
            }
            com.alibaba.triver.triver_shop.newShop.data.d g = g.c(g.this).g();
            if (g != null) {
                i9 = g.at();
            }
            if (i9 <= 0) {
                return;
            }
            if (num != null && num.intValue() == i9) {
                return;
            }
            ceg.Companion.b(kotlin.jvm.internal.q.a("h5 content render : get new max content height : ", (Object) Integer.valueOf(i9)));
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, i9);
            ShopWrapWebView a3 = g.a(g.this);
            if (a3 == null) {
                return;
            }
            a3.setLayoutParams(layoutParams2);
        }
    }

    static {
        kge.a(1951723107);
        kge.a(-2135486848);
    }

    public static /* synthetic */ Object ipc$super(g gVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1474197416:
                super.a(((Number) objArr[0]).floatValue());
                return null;
            case 92838762:
                super.c();
                return null;
            case 93762283:
                super.d();
                return null;
            case 94685804:
                super.e();
                return null;
            case 95609325:
                super.f();
                return null;
            case 96532846:
                super.g();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public /* synthetic */ g(com.alibaba.triver.triver_shop.newShop.data.g gVar, String str, Context context, boolean z, int i, kotlin.jvm.internal.o oVar) {
        this(gVar, str, context, (i & 8) != 0 ? false : z);
    }

    public static final /* synthetic */ ShopWrapWebView a(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ShopWrapWebView) ipChange.ipc$dispatch("aee91add", new Object[]{gVar}) : gVar.e;
    }

    public static final /* synthetic */ H5ShopContentRender$rootContainer$2.AnonymousClass1 b(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (H5ShopContentRender$rootContainer$2.AnonymousClass1) ipChange.ipc$dispatch("af11a3d2", new Object[]{gVar}) : gVar.a();
    }

    public static final /* synthetic */ com.alibaba.triver.triver_shop.newShop.data.g c(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.alibaba.triver.triver_shop.newShop.data.g) ipChange.ipc$dispatch("c65e4967", new Object[]{gVar}) : gVar.f3984a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.alibaba.triver.triver_shop.newShop.data.g tabBarItemDataModel, String str, Context context, boolean z) {
        super(context, tabBarItemDataModel);
        kotlin.jvm.internal.q.d(tabBarItemDataModel, "tabBarItemDataModel");
        kotlin.jvm.internal.q.d(context, "context");
        this.f3984a = tabBarItemDataModel;
        this.b = str;
        this.c = context;
        this.d = z;
        this.f = kotlin.e.a(new H5ShopContentRender$rootContainer$2(this));
        this.g = new com.alibaba.triver.triver_shop.newShop.view.extend.d(this.c);
        this.h = new com.alibaba.triver.triver_shop.newShop.view.extend.e(0, new H5ShopContentRender$webViewScrollUpDetector$1(this), new H5ShopContentRender$webViewScrollUpDetector$2(this), 1, null);
    }

    private final H5ShopContentRender$rootContainer$2.AnonymousClass1 a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (H5ShopContentRender$rootContainer$2.AnonymousClass1) ipChange.ipc$dispatch("b5f96460", new Object[]{this}) : (H5ShopContentRender$rootContainer$2.AnonymousClass1) this.f.getValue();
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.h
    public View b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("639153eb", new Object[]{this});
        }
        com.alibaba.triver.triver_shop.newShop.ext.o.j(a());
        com.alibaba.triver.triver_shop.newShop.ext.o.k(a());
        return a();
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.b, com.alibaba.triver.triver_shop.newShop.view.h
    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        super.g();
        a().removeAllViews();
        ShopWrapWebView shopWrapWebView = this.e;
        if (shopWrapWebView != null) {
            shopWrapWebView.destroy();
        }
        this.e = null;
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.b
    public boolean l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[]{this})).booleanValue() : !this.f3984a.o() && this.e != null;
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.b, com.alibaba.triver.triver_shop.newShop.view.h
    public void d() {
        d.C0135d G;
        rul<Boolean, t> g;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        super.d();
        com.alibaba.triver.triver_shop.newShop.data.d g2 = this.f3984a.g();
        if (g2 == null || (G = g2.G()) == null || (g = G.g()) == null) {
            return;
        }
        g.mo2421invoke(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01d0  */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v54, types: [com.alibaba.triver.triver_shop.newShop.view.extend.ShopWrapWebView] */
    /* JADX WARN: Type inference failed for: r6v55 */
    /* JADX WARN: Type inference failed for: r6v56 */
    @Override // com.alibaba.triver.triver_shop.newShop.view.b, com.alibaba.triver.triver_shop.newShop.view.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void c() {
        /*
            Method dump skipped, instructions count: 850
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.triver.triver_shop.newShop.view.g.c():void");
    }

    /* loaded from: classes3.dex */
    public static final class a extends WVUCWebViewClient {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -332805219) {
                super.onPageFinished((WebView) objArr[0], (String) objArr[1]);
                return null;
            } else if (hashCode != 534767588) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            } else {
                super.onPageStarted((WebView) objArr[0], (String) objArr[1], (Bitmap) objArr[2]);
                return null;
            }
        }

        public a(Context context) {
            super(context);
        }

        @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1fdfe7e4", new Object[]{this, webView, str, bitmap});
                return;
            }
            super.onPageStarted(webView, str, bitmap);
            g.this.i();
        }

        @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ec29cb9d", new Object[]{this, webView, str});
                return;
            }
            super.onPageFinished(webView, str);
            ShopWrapWebView a2 = g.a(g.this);
            if (a2 != null) {
                a2.doOnPageFinishAction();
            }
            g.this.j();
        }
    }

    private final void n() {
        t tVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
        } else if (!cen.Companion.aj()) {
        } else {
            try {
                Result.a aVar = Result.Companion;
                ShopWrapWebView shopWrapWebView = this.e;
                if (shopWrapWebView == null) {
                    tVar = null;
                } else {
                    shopWrapWebView.setLongPressSaveImage(false);
                    tVar = t.INSTANCE;
                }
                Result.m2371constructorimpl(tVar);
            } catch (Throwable th) {
                Result.a aVar2 = Result.Companion;
                Result.m2371constructorimpl(kotlin.i.a(th));
            }
        }
    }

    @Override // com.alibaba.triver.triver_shop.web.ShopBaseWebView.d
    public void a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f97f9ec", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8), new Boolean(z)});
        } else {
            this.h.a(i, i2, i3, i4, i5, i6, i7, i8, z);
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.b, com.alibaba.triver.triver_shop.newShop.view.h
    public void a(float f) {
        ShopWrapWebView shopWrapWebView;
        View coreView;
        d.c bc;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8218858", new Object[]{this, new Float(f)});
            return;
        }
        super.a(f);
        if (!this.f3984a.o() || (shopWrapWebView = this.e) == null || (coreView = shopWrapWebView.getCoreView()) == null) {
            return;
        }
        com.alibaba.triver.triver_shop.newShop.view.extend.d dVar = this.g;
        int i2 = (int) f;
        com.alibaba.triver.triver_shop.newShop.data.d g = this.f3984a.g();
        if (g != null && (bc = g.bc()) != null) {
            i = bc.l();
        }
        dVar.a(i2, coreView, i);
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.b, com.alibaba.triver.triver_shop.newShop.view.h
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        super.e();
        ShopWrapWebView shopWrapWebView = this.e;
        if (shopWrapWebView == null) {
            return;
        }
        shopWrapWebView.onPause();
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.b, com.alibaba.triver.triver_shop.newShop.view.h
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        super.f();
        ShopWrapWebView shopWrapWebView = this.e;
        if (shopWrapWebView == null) {
            return;
        }
        shopWrapWebView.onResume();
    }
}
