package com.alibaba.triver.triver_shop.newShop.view;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.support.v4.app.FragmentActivity;
import com.alibaba.triver.triver_shop.newShop.data.NativeShopRenderContainerType;
import com.alibaba.triver.triver_shop.newShop.view.h;
import com.android.alibaba.ip.runtime.IpChange;
import tb.ceg;
import tb.kge;

/* loaded from: classes3.dex */
public abstract class b implements h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    private final Context f3926a;
    private final com.alibaba.triver.triver_shop.newShop.data.g b;
    private boolean c;
    private final com.alibaba.triver.triver_shop.newShop.data.d d;
    private final FragmentActivity e;
    private final a g;
    private final BaseShopContentRender$acLifecycle$1 h;

    static {
        kge.a(1757688607);
        kge.a(-884443079);
    }

    public boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[]{this})).booleanValue();
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r2v7, types: [com.alibaba.triver.triver_shop.newShop.view.BaseShopContentRender$acLifecycle$1] */
    public b(Context context, com.alibaba.triver.triver_shop.newShop.data.g tabBarItemDataModel) {
        kotlin.jvm.internal.q.d(context, "context");
        kotlin.jvm.internal.q.d(tabBarItemDataModel, "tabBarItemDataModel");
        this.f3926a = context;
        this.b = tabBarItemDataModel;
        this.d = this.b.g();
        Context context2 = this.f3926a;
        this.e = context2 instanceof FragmentActivity ? (FragmentActivity) context2 : null;
        this.g = new a();
        this.h = new LifecycleObserver() { // from class: com.alibaba.triver.triver_shop.newShop.view.BaseShopContentRender$acLifecycle$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
            public final void onStop() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("b3dde88", new Object[]{this});
                } else {
                    b.this.k();
                }
            }

            @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
            public final void onDestroyed() {
                Lifecycle lifecycle;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("bf354a81", new Object[]{this});
                    return;
                }
                FragmentActivity b = b.b(b.this);
                if (b == null || (lifecycle = b.getLifecycle()) == null) {
                    return;
                }
                lifecycle.removeObserver(this);
            }
        };
        n();
        a();
    }

    public static final /* synthetic */ FragmentActivity b(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FragmentActivity) ipChange.ipc$dispatch("a890a492", new Object[]{bVar}) : bVar.e;
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
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else {
            h.a.a(this);
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.h
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else {
            h.a.b(this);
        }
    }

    public boolean m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6158678", new Object[]{this})).booleanValue() : h.a.e(this);
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.h
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.c = z;
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.h
    public boolean h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue() : this.c;
    }

    private final void a() {
        FragmentActivity fragmentActivity;
        Lifecycle lifecycle;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        com.alibaba.triver.triver_shop.newShop.data.d dVar = this.d;
        if (dVar != null && dVar.a()) {
            z = true;
        }
        if (!z || (fragmentActivity = this.e) == null || (lifecycle = fragmentActivity.getLifecycle()) == null) {
            return;
        }
        lifecycle.addObserver(this.h);
    }

    private final void n() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
            return;
        }
        com.alibaba.triver.triver_shop.newShop.data.d dVar = this.d;
        if (dVar != null && dVar.b()) {
            z = true;
        }
        if (!z) {
            return;
        }
        this.d.a((ComponentCallbacks2) this.g);
    }

    /* loaded from: classes3.dex */
    public static final class a implements ComponentCallbacks2 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(Configuration newConfig) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("eb2f300c", new Object[]{this, newConfig});
            } else {
                kotlin.jvm.internal.q.d(newConfig, "newConfig");
            }
        }

        public a() {
            b.this = r1;
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4bbd23dd", new Object[]{this});
            } else {
                b.this.k();
            }
        }

        @Override // android.content.ComponentCallbacks2
        public void onTrimMemory(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c69db59a", new Object[]{this, new Integer(i)});
            } else if (i != 10 && i != 15) {
            } else {
                b.this.k();
            }
        }
    }

    public final void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        com.alibaba.triver.triver_shop.newShop.data.d g = this.b.g();
        if (g == null) {
            return;
        }
        g.k(kotlin.jvm.internal.q.a(this.b.f(), (Object) "_appStart"));
    }

    public final void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        com.alibaba.triver.triver_shop.newShop.data.d g = this.b.g();
        if (g == null) {
            return;
        }
        g.k(kotlin.jvm.internal.q.a(this.b.f(), (Object) "_appEnd"));
    }

    public final void a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6251244", new Object[]{this, obj});
            return;
        }
        com.alibaba.triver.triver_shop.newShop.data.d g = this.b.g();
        if (g == null) {
            return;
        }
        g.b(kotlin.jvm.internal.q.a(this.b.f(), (Object) "_appEnd"), obj);
    }

    public final void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
        } else if (!l()) {
        } else {
            com.alibaba.triver.triver_shop.newShop.ext.b.b(new BaseShopContentRender$tryToRecycle$1(this));
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.h
    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        com.alibaba.triver.triver_shop.newShop.data.d dVar = this.d;
        if (dVar == null) {
            return;
        }
        dVar.b(this.g);
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

    @Override // com.alibaba.triver.triver_shop.newShop.view.h
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        h.a.c(this);
        com.alibaba.triver.triver_shop.newShop.ext.h.a(this.b);
        ceg.Companion.b(kotlin.jvm.internal.q.a("onViewSelectedByViewPager : ", (Object) this.b.f()));
        String a2 = NativeShopRenderContainerType.Companion.a(this.b.m());
        com.alibaba.triver.triver_shop.newShop.data.d g = this.b.g();
        if (g != null) {
            g.c(com.alibaba.triver.triver_shop.newShop.ext.g.KEY_SHOP_INDEX_TYPE, a2);
        }
        com.alibaba.triver.triver_shop.newShop.data.d g2 = this.b.g();
        if (g2 != null) {
            g2.b(kotlin.jvm.internal.q.a(this.b.f(), (Object) "_containerType"), a2);
        }
        n();
    }
}
