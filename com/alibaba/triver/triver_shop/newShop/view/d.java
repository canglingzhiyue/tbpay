package com.alibaba.triver.triver_shop.newShop.view;

import android.net.Uri;
import android.taobao.windvane.standardmodal.WVStandardEventCenter;
import android.view.View;
import android.widget.FrameLayout;
import com.alibaba.triver.triver_shop.newShop.view.extend.ShopWrapWebView;
import com.alibaba.triver.triver_shop.newShop.view.h;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes3.dex */
public final class d implements h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final com.alibaba.triver.triver_shop.newShop.view.embed.c f3959a;
    private boolean b;
    private final FrameLayout c;
    private ShopWrapWebView d;

    static {
        kge.a(1561357538);
        kge.a(-884443079);
    }

    public d(com.alibaba.triver.triver_shop.newShop.view.embed.c swipeBigCardComponent, int i) {
        kotlin.jvm.internal.q.d(swipeBigCardComponent, "swipeBigCardComponent");
        this.f3959a = swipeBigCardComponent;
        this.c = new FrameLayout(this.f3959a.d());
    }

    public static final /* synthetic */ void a(d dVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f018b28", new Object[]{dVar, str});
        } else {
            dVar.a(str);
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.h
    public void a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8218858", new Object[]{this, new Float(f)});
        } else {
            h.a.a(this, f);
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.h
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.b = z;
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.h
    public boolean h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue() : this.b;
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.h
    public View b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("639153eb", new Object[]{this}) : this.c;
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.h
    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        ShopWrapWebView shopWrapWebView = this.d;
        if (shopWrapWebView != null) {
            shopWrapWebView.destroy();
        }
        this.d = null;
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.h
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        h.a.a(this);
        ShopWrapWebView shopWrapWebView = this.d;
        if (shopWrapWebView == null) {
            return;
        }
        shopWrapWebView.onPause();
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.h
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        h.a.b(this);
        ShopWrapWebView shopWrapWebView = this.d;
        if (shopWrapWebView == null) {
            return;
        }
        shopWrapWebView.onResume();
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.h
    public void c() {
        String aO;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        h.a.c(this);
        if (this.d != null || (aO = this.f3959a.c().aO()) == null) {
            return;
        }
        Uri.Builder buildUpon = Uri.parse(aO).buildUpon();
        StringBuilder sb = new StringBuilder();
        sb.append(this.f3959a.c().w());
        sb.append(',');
        sb.append(this.f3959a.c().v());
        Uri.Builder appendQueryParameter = buildUpon.appendQueryParameter("paddingTopAndBottom", sb.toString());
        if (this.f3959a.c().aI() || this.f3959a.c().aX() > 1) {
            z = true;
        }
        String uri = appendQueryParameter.appendQueryParameter("hasNav", String.valueOf(z)).build().toString();
        ShopWrapWebView shopWrapWebView = new ShopWrapWebView(this.f3959a.d());
        shopWrapWebView.setShopData(this.f3959a.c());
        shopWrapWebView.setSwipeBigCardComponent(this.f3959a);
        this.d = shopWrapWebView;
        this.f3959a.a(new BigCardWebContentRender$onViewSelectedByViewPager$1(this));
        this.f3959a.c().c("immersive_webview_load_start", Long.valueOf(System.currentTimeMillis()));
        shopWrapWebView.render(uri);
        shopWrapWebView.setEnableCompatInViewPager(true);
        com.alibaba.triver.triver_shop.newShop.ext.o.a(this.c, shopWrapWebView);
    }

    private final void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        ShopWrapWebView shopWrapWebView = this.d;
        if (shopWrapWebView == null) {
            return;
        }
        WVStandardEventCenter.postNotificationToJS(shopWrapWebView, str, "");
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.h
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            h.a.d(this);
        }
    }
}
