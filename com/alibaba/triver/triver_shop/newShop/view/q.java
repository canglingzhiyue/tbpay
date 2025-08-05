package com.alibaba.triver.triver_shop.newShop.view;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.alibaba.triver.triver_shop.newShop.data.d;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.WXSDKManager;
import kotlin.Result;
import kotlin.t;
import tb.ceg;
import tb.kge;
import tb.rul;

/* loaded from: classes3.dex */
public final class q extends com.alibaba.triver.triver_shop.newShop.view.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;
    private static final com.alibaba.triver.triver_shop.newShop.manager.f<q> e;

    /* renamed from: a  reason: collision with root package name */
    private final com.alibaba.triver.triver_shop.newShop.data.g f4018a;
    private final Context b;
    private WXSDKInstance c;
    private final kotlin.d d;

    public static /* synthetic */ Object ipc$super(q qVar, String str, Object... objArr) {
        switch (str.hashCode()) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(com.alibaba.triver.triver_shop.newShop.data.g tabBarItemDataModel, Context context) {
        super(context, tabBarItemDataModel);
        kotlin.jvm.internal.q.d(tabBarItemDataModel, "tabBarItemDataModel");
        kotlin.jvm.internal.q.d(context, "context");
        this.f4018a = tabBarItemDataModel;
        this.b = context;
        this.d = kotlin.e.a(new WeexShopContentRender$rootContainer$2(this));
    }

    public static final /* synthetic */ Context a(q qVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("32e321a9", new Object[]{qVar}) : qVar.b;
    }

    public static final /* synthetic */ FrameLayout b(q qVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FrameLayout) ipChange.ipc$dispatch("608b5ec9", new Object[]{qVar}) : qVar.a();
    }

    /* loaded from: classes3.dex */
    public static final class a {
        static {
            kge.a(-1349374857);
        }

        public /* synthetic */ a(kotlin.jvm.internal.o oVar) {
            this();
        }

        private a() {
        }
    }

    static {
        kge.a(1733959663);
        Companion = new a(null);
        e = new com.alibaba.triver.triver_shop.newShop.manager.f<>(3);
    }

    private final FrameLayout a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FrameLayout) ipChange.ipc$dispatch("46931b71", new Object[]{this}) : (FrameLayout) this.d.getValue();
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
        WXSDKInstance wXSDKInstance = this.c;
        if (wXSDKInstance != null) {
            wXSDKInstance.e();
        }
        this.c = null;
        e.b((com.alibaba.triver.triver_shop.newShop.manager.f<q>) this);
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.b
    public boolean l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[]{this})).booleanValue() : !this.f4018a.n() && this.c != null;
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.b, com.alibaba.triver.triver_shop.newShop.view.h
    public void f() {
        WXSDKInstance wXSDKInstance;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        super.f();
        if (!this.f4018a.a(this.b) || (wXSDKInstance = this.c) == null) {
            return;
        }
        wXSDKInstance.onActivityResume();
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.b, com.alibaba.triver.triver_shop.newShop.view.h
    public void e() {
        Object m2371constructorimpl;
        Long l;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        super.e();
        WXSDKInstance wXSDKInstance = this.c;
        if (wXSDKInstance != null) {
            wXSDKInstance.onActivityPause();
        }
        WXSDKInstance wXSDKInstance2 = this.c;
        if (wXSDKInstance2 == null) {
            return;
        }
        try {
            Result.a aVar = Result.Companion;
            if (wXSDKInstance2.ar().f23517a.containsKey(com.taobao.weex.performance.f.KEY_PAGE_STAGES_INTERACTION_TM) && (l = wXSDKInstance2.ar().f23517a.get(com.taobao.weex.performance.f.KEY_PAGE_STAGES_INTERACTION_TM)) != null) {
                a(Long.valueOf(l.longValue()));
            }
            m2371constructorimpl = Result.m2371constructorimpl(t.INSTANCE);
        } catch (Throwable th) {
            Result.a aVar2 = Result.Companion;
            m2371constructorimpl = Result.m2371constructorimpl(kotlin.i.a(th));
        }
        Result.m2370boximpl(m2371constructorimpl);
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.b, com.alibaba.triver.triver_shop.newShop.view.h
    public void c() {
        d.C0135d G;
        rul<Boolean, t> g;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        super.c();
        com.alibaba.triver.triver_shop.newShop.data.d g2 = this.f4018a.g();
        if (g2 != null && (G = g2.G()) != null && (g = G.g()) != null) {
            g.mo2421invoke(false);
        }
        if (this.c == null) {
            i();
            this.c = k.a(this.b, this.f4018a.h(), null, 4, null);
            WXSDKInstance wXSDKInstance = this.c;
            kotlin.jvm.internal.q.a(wXSDKInstance);
            wXSDKInstance.a(new b());
            WXSDKInstance wXSDKInstance2 = this.c;
            kotlin.jvm.internal.q.a(wXSDKInstance2);
            View am = wXSDKInstance2.am();
            kotlin.jvm.internal.q.b(am, "instance!!.containerView");
            com.alibaba.triver.triver_shop.newShop.ext.o.a(a(), am);
        }
        e.a((com.alibaba.triver.triver_shop.newShop.manager.f<q>) this);
    }

    /* loaded from: classes3.dex */
    public static final class b implements WXSDKManager.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.weex.WXSDKManager.a
        public void onInitSuccess() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb2dd3fb", new Object[]{this});
            }
        }

        public b() {
        }

        @Override // com.taobao.weex.WXSDKManager.a
        public void a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
                return;
            }
            ceg.a aVar = ceg.Companion;
            aVar.b("weex init failed : " + ((Object) str) + ", " + ((Object) str2));
            com.alibaba.triver.triver_shop.newShop.ext.o.a(q.b(q.this), com.alibaba.triver.triver_shop.newShop.ext.h.b(q.a(q.this)));
        }
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
        com.alibaba.triver.triver_shop.newShop.data.d g2 = this.f4018a.g();
        if (g2 == null || (G = g2.G()) == null || (g = G.g()) == null) {
            return;
        }
        g.mo2421invoke(true);
    }
}
