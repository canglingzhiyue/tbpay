package com.alibaba.triver.triver_shop.shop2023;

import android.app.Activity;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.FrameLayout;
import com.alibaba.triver.triver_shop.newShop.ext.e;
import com.alibaba.triver.triver_shop.newShop.ext.g;
import com.alibaba.triver.triver_shop.newShop.ext.o;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.q;
import tb.cen;
import tb.kge;
import tb.ruk;

/* loaded from: classes3.dex */
public class b extends com.alibaba.triver.triver_shop.newShop.view.component.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final float f = 1.0f;
    private final LifecycleObserver g = new LifecycleObserver() { // from class: com.alibaba.triver.triver_shop.shop2023.Shop2023BaseComponent$lifecycleObserver$1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
        public final void onResumed() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("17fe877f", new Object[]{this});
                return;
            }
            b.a(b.this);
            b.b(b.this);
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
        public final void onPaused() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c47335f4", new Object[]{this});
            } else {
                b.c(b.this);
            }
        }
    };

    /* loaded from: classes3.dex */
    public static final class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
            b.this = r1;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                b.this.Q();
            }
        }
    }

    static {
        kge.a(1591316837);
    }

    public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public int S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4a7234d", new Object[]{this})).intValue();
        }
        return 0;
    }

    public static final /* synthetic */ void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43e55669", new Object[]{bVar});
        } else {
            bVar.L();
        }
    }

    public static final /* synthetic */ void b(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7daff848", new Object[]{bVar});
        } else {
            bVar.J();
        }
    }

    public static final /* synthetic */ void c(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b77a9a27", new Object[]{bVar});
        } else {
            bVar.K();
        }
    }

    public final float T() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4b53acb", new Object[]{this})).floatValue() : this.f;
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.a
    public void a(FragmentActivity context, com.alibaba.triver.triver_shop.newShop.data.d shopData, e shopDXEngine) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c18ba9ff", new Object[]{this, context, shopData, shopDXEngine});
            return;
        }
        q.d(context, "context");
        q.d(shopData, "shopData");
        q.d(shopDXEngine, "shopDXEngine");
        a(context);
        a(shopData);
        a(shopDXEngine);
        FragmentActivity fragmentActivity = context;
        a(new FrameLayout(fragmentActivity));
        o.g(d());
        g(shopData.aW());
        a(shopData.p());
        b(shopData.q());
        shopData.b(g.KEY_TAB_KEY_NAME, shopData.d(g(), h()));
        U();
        c(shopData.f(g(), h()));
        if (i() != 0) {
            a(true);
        }
        f(o.a(fragmentActivity));
        a(new View(fragmentActivity));
        long j = g() == 0 ? 1000L : 0L;
        if (cen.Companion.ay()) {
            j = 2500;
        }
        com.alibaba.triver.triver_shop.newShop.ext.b.a(new Shop2023BaseComponent$initComponent$1(context, shopData), j);
        h(com.alibaba.triver.triver_shop.newShop.ext.b.b((Activity) context).heightPixels);
        String S = shopData.S();
        if (S != null) {
            if (S.length() > 0) {
                z = true;
            }
        }
        i(z);
        j(shopData.aD());
        V();
    }

    private final void U() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c3525c", new Object[]{this});
            return;
        }
        b().a((ruk<Integer>) new Shop2023BaseComponent$initShopViewContextFunction$1(this));
        b().G().a(d());
        b().G().a(new a());
        b().G().d(new Shop2023BaseComponent$initShopViewContextFunction$3(this));
        b().G().c(new Shop2023BaseComponent$initShopViewContextFunction$4(this));
        b().G().a(new Shop2023BaseComponent$initShopViewContextFunction$5(this));
        b(b().G().l());
        b().G().f(new Shop2023BaseComponent$initShopViewContextFunction$6(this));
    }

    private final void V() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d169dd", new Object[]{this});
            return;
        }
        b().bb().b(new Shop2023BaseComponent$initLiveEventProcessor$1(this));
        b().bb().a(new Shop2023BaseComponent$initLiveEventProcessor$2(this));
        b().bb().c(new Shop2023BaseComponent$initLiveEventProcessor$3(this));
        b().bb().e(new Shop2023BaseComponent$initLiveEventProcessor$4(this));
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.a
    public LifecycleObserver I() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LifecycleObserver) ipChange.ipc$dispatch("7c0818b3", new Object[]{this}) : this.g;
    }
}
