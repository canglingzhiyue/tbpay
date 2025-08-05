package com.alibaba.triver.triver_shop.newShop.view.component;

import android.app.Activity;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;
import android.content.res.Configuration;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.newShop.ext.g;
import com.alibaba.triver.triver_shop.newShop.ext.l;
import com.alibaba.triver.triver_shop.newShop.ext.o;
import com.alibaba.triver.triver_shop.newShop.view.ShopSwipeListenerLayout;
import com.alibaba.triver.triver_shop.newShop.view.p;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.ceg;
import tb.cen;
import tb.kge;
import tb.ruw;
import tb.rvb;
import tb.rvm;

/* loaded from: classes3.dex */
public class a implements ViewPager.OnPageChangeListener, ShopSwipeListenerLayout.a, p {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean A;
    private boolean B;
    private boolean C;
    private boolean D;
    private boolean E;
    private boolean F;
    private boolean G;
    private boolean J;

    /* renamed from: a */
    public FragmentActivity f3931a;
    public FrameLayout au;
    public com.alibaba.triver.triver_shop.newShop.data.d b;
    public com.alibaba.triver.triver_shop.newShop.ext.e c;
    public FrameLayout d;
    public View e;
    private rvb<? super Integer, ? super Integer, ? super Integer, ? super Integer, t> g;
    private ruw<? super Integer, ? super Boolean, t> h;
    private int j;
    private int k;
    private int l;
    private boolean m;
    private int n;
    private int o;
    private int p;
    private boolean q;
    private boolean s;
    private long u;
    private int w;
    private int x;
    private boolean z;
    private final HashMap<String, com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.a> f = new HashMap<>();
    private Pair<Integer, Integer> i = new Pair<>(0, 0);
    private boolean r = true;
    private boolean t = true;
    private final long v = 500;
    private boolean y = true;
    private boolean H = true;
    private boolean K = true;
    private final LifecycleObserver I = new LifecycleObserver() { // from class: com.alibaba.triver.triver_shop.newShop.view.component.BaseContentComponent$lifecycleObserver$1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
        public final void onResumed() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("17fe877f", new Object[]{this});
                return;
            }
            a.this.L();
            a.this.J();
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
        public final void onPaused() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c47335f4", new Object[]{this});
            } else {
                a.this.K();
            }
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
        public final void onCreated() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ff48d810", new Object[]{this});
            } else {
                com.alibaba.triver.triver_shop.newShop.ext.b.d(new BaseContentComponent$lifecycleObserver$1$onCreated$1(a.this));
            }
        }
    };

    /* renamed from: com.alibaba.triver.triver_shop.newShop.view.component.a$a */
    /* loaded from: classes3.dex */
    public static final class View$OnClickListenerC0141a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public View$OnClickListenerC0141a() {
            a.this = r1;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                a.this.Q();
            }
        }
    }

    static {
        kge.a(-1109863600);
        kge.a(1127309571);
        kge.a(1157281732);
        kge.a(1848919473);
        kge.a(-1326017927);
    }

    public void B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b793c9", new Object[]{this});
        }
    }

    public int D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3d3c2be", new Object[]{this})).intValue();
        }
        return 0;
    }

    public int E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3e1da3f", new Object[]{this})).intValue();
        }
        return 0;
    }

    public void F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3eff1cd", new Object[]{this});
        }
    }

    public int G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3fe0941", new Object[]{this})).intValue();
        }
        return 0;
    }

    public boolean H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("40c20d3", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public void J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4284fd1", new Object[]{this});
        }
    }

    public void K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4366752", new Object[]{this});
        }
    }

    public boolean O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("46ec55a", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public boolean P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("47cdcdb", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public void Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48af458", new Object[]{this});
        }
    }

    public void R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4990bd9", new Object[]{this});
        }
    }

    public void a(int i, int i2, String targetTabName) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d025a92", new Object[]{this, new Integer(i), new Integer(i2), targetTabName});
        } else {
            q.d(targetTabName, "targetTabName");
        }
    }

    public void a(Configuration newConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("510fd488", new Object[]{this, newConfig});
        } else {
            q.d(newConfig, "newConfig");
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.p
    public void a(View view, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e734472a", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else {
            q.d(view, "view");
        }
    }

    public void a(View fromTargetView, MotionEvent event, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef1985e4", new Object[]{this, fromTargetView, event, new Integer(i)});
            return;
        }
        q.d(fromTargetView, "fromTargetView");
        q.d(event, "event");
    }

    public void a(String tabName) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, tabName});
        } else {
            q.d(tabName, "tabName");
        }
    }

    public void a(boolean z, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b98504", new Object[]{this, new Boolean(z), jSONObject});
        }
    }

    public f aD() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("ac9b8210", new Object[]{this});
        }
        return null;
    }

    public ViewPager ax() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewPager) ipChange.ipc$dispatch("9b14c22a", new Object[]{this});
        }
        return null;
    }

    public void b(View fromTargetView, MotionEvent event, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32a4a3a5", new Object[]{this, fromTargetView, event, new Integer(i)});
            return;
        }
        q.d(fromTargetView, "fromTargetView");
        q.d(event, "event");
    }

    public void m(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc9bfae0", new Object[]{this, new Boolean(z)});
        }
    }

    public void n(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be50d37f", new Object[]{this, new Boolean(z)});
        }
    }

    public void o(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c005ac1e", new Object[]{this, new Boolean(z)});
        }
    }

    @Override // android.support.v4.view.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i, float f, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4c13b05", new Object[]{this, new Integer(i), new Float(f), new Integer(i2)});
        }
    }

    @Override // android.support.v4.view.ViewPager.OnPageChangeListener
    public void onPageSelected(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i)});
        }
    }

    public void p(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1ba84bd", new Object[]{this, new Boolean(z)});
        }
    }

    public boolean z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6ccb805", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.ShopSwipeListenerLayout.a
    public void onSwipeCancel(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5770811", new Object[]{this, motionEvent});
        } else {
            ShopSwipeListenerLayout.a.C0139a.a(this, motionEvent);
        }
    }

    public final FragmentActivity a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FragmentActivity) ipChange.ipc$dispatch("8b60e57b", new Object[]{this});
        }
        FragmentActivity fragmentActivity = this.f3931a;
        if (fragmentActivity != null) {
            return fragmentActivity;
        }
        q.b("context");
        throw null;
    }

    public final void a(FragmentActivity fragmentActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("831e55bb", new Object[]{this, fragmentActivity});
            return;
        }
        q.d(fragmentActivity, "<set-?>");
        this.f3931a = fragmentActivity;
    }

    public final void a(com.alibaba.triver.triver_shop.newShop.data.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d8442f9", new Object[]{this, dVar});
            return;
        }
        q.d(dVar, "<set-?>");
        this.b = dVar;
    }

    public final com.alibaba.triver.triver_shop.newShop.data.d b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.alibaba.triver.triver_shop.newShop.data.d) ipChange.ipc$dispatch("c5960a3a", new Object[]{this});
        }
        com.alibaba.triver.triver_shop.newShop.data.d dVar = this.b;
        if (dVar != null) {
            return dVar;
        }
        q.b("shopData");
        throw null;
    }

    public final void a(com.alibaba.triver.triver_shop.newShop.ext.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a54f35a1", new Object[]{this, eVar});
            return;
        }
        q.d(eVar, "<set-?>");
        this.c = eVar;
    }

    public final com.alibaba.triver.triver_shop.newShop.ext.e c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.alibaba.triver.triver_shop.newShop.ext.e) ipChange.ipc$dispatch("c1332025", new Object[]{this});
        }
        com.alibaba.triver.triver_shop.newShop.ext.e eVar = this.c;
        if (eVar != null) {
            return eVar;
        }
        q.b("shopDXEngine");
        throw null;
    }

    public final void a(FrameLayout frameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f363e3eb", new Object[]{this, frameLayout});
            return;
        }
        q.d(frameLayout, "<set-?>");
        this.d = frameLayout;
    }

    public final FrameLayout d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("df23db0e", new Object[]{this});
        }
        FrameLayout frameLayout = this.d;
        if (frameLayout != null) {
            return frameLayout;
        }
        q.b("rootLayout");
        throw null;
    }

    public final void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
            return;
        }
        q.d(view, "<set-?>");
        this.e = view;
    }

    public final View e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("42261fae", new Object[]{this});
        }
        View view = this.e;
        if (view != null) {
            return view;
        }
        q.b("maskView");
        throw null;
    }

    public final void a(rvb<? super Integer, ? super Integer, ? super Integer, ? super Integer, t> rvbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdc9c77a", new Object[]{this, rvbVar});
        } else {
            this.g = rvbVar;
        }
    }

    public final rvb<Integer, Integer, Integer, Integer, t> f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (rvb) ipChange.ipc$dispatch("3582791b", new Object[]{this}) : this.g;
    }

    public final void a(ruw<? super Integer, ? super Boolean, t> ruwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdc53bc4", new Object[]{this, ruwVar});
        } else {
            this.h = ruwVar;
        }
    }

    public final void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.j = i;
        }
    }

    public final int g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5c0f961", new Object[]{this})).intValue() : this.j;
    }

    public final void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        } else {
            this.k = i;
        }
    }

    public final int h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5cf10e2", new Object[]{this})).intValue() : this.k;
    }

    public final void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
        } else {
            this.l = i;
        }
    }

    public final int i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5dd2863", new Object[]{this})).intValue() : this.l;
    }

    public final void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.m = z;
        }
    }

    public final boolean j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[]{this})).booleanValue() : this.m;
    }

    public final void d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad401d78", new Object[]{this, new Integer(i)});
        } else {
            this.n = i;
        }
    }

    public final int k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5f95765", new Object[]{this})).intValue() : this.n;
    }

    public final void e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef4f617", new Object[]{this, new Integer(i)});
        } else {
            this.o = i;
        }
    }

    public final int l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6076ee6", new Object[]{this})).intValue() : this.o;
    }

    public final void f(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0a9ceb6", new Object[]{this, new Integer(i)});
        } else {
            this.p = i;
        }
    }

    public final int m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6158667", new Object[]{this})).intValue() : this.p;
    }

    public final boolean n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6239df9", new Object[]{this})).booleanValue() : this.q;
    }

    public final boolean o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("631b57a", new Object[]{this})).booleanValue() : this.r;
    }

    public final void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else {
            this.s = z;
        }
    }

    public final boolean p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("63fccfb", new Object[]{this})).booleanValue() : this.s;
    }

    public final void g(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b25ea755", new Object[]{this, new Integer(i)});
        } else {
            this.w = i;
        }
    }

    public final void h(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4137ff4", new Object[]{this, new Integer(i)});
        } else {
            this.x = i;
        }
    }

    public final void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
        } else {
            this.z = z;
        }
    }

    public final boolean q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("64de47c", new Object[]{this})).booleanValue() : this.z;
    }

    public final void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad405d49", new Object[]{this, new Boolean(z)});
        } else {
            this.A = z;
        }
    }

    public final boolean r() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("65bfbfd", new Object[]{this})).booleanValue() : this.A;
    }

    public final void e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef535e8", new Object[]{this, new Boolean(z)});
        } else {
            this.B = z;
        }
    }

    public final boolean s() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("66a137e", new Object[]{this})).booleanValue() : this.B;
    }

    public final void f(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0aa0e87", new Object[]{this, new Boolean(z)});
        } else {
            this.C = z;
        }
    }

    public final boolean t() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6782aff", new Object[]{this})).booleanValue() : this.C;
    }

    public final void g(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b25ee726", new Object[]{this, new Boolean(z)});
        } else {
            this.D = z;
        }
    }

    public final boolean u() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6864280", new Object[]{this})).booleanValue() : this.D;
    }

    public final void h(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b413bfc5", new Object[]{this, new Boolean(z)});
        } else {
            this.E = z;
        }
    }

    public final boolean v() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6945a01", new Object[]{this})).booleanValue() : this.E;
    }

    public final void i(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5c89864", new Object[]{this, new Boolean(z)});
        } else {
            this.F = z;
        }
    }

    public final boolean w() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6a27182", new Object[]{this})).booleanValue() : this.F;
    }

    public final void j(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b77d7103", new Object[]{this, new Boolean(z)});
        } else {
            this.G = z;
        }
    }

    public final boolean ar() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("abe2103c", new Object[]{this})).booleanValue() : this.J;
    }

    public final void v(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbf79877", new Object[]{this, new Boolean(z)});
        } else {
            this.J = z;
        }
    }

    public final boolean as() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("abf027bd", new Object[]{this})).booleanValue() : this.K;
    }

    public final FrameLayout au() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("9916553e", new Object[]{this});
        }
        FrameLayout frameLayout = this.au;
        if (frameLayout != null) {
            return frameLayout;
        }
        q.b("allItemCountIconContainer");
        throw null;
    }

    public final void b(FrameLayout frameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("713b9fec", new Object[]{this, frameLayout});
            return;
        }
        q.d(frameLayout, "<set-?>");
        this.au = frameLayout;
    }

    public void a(FragmentActivity context, com.alibaba.triver.triver_shop.newShop.data.d shopData, com.alibaba.triver.triver_shop.newShop.ext.e shopDXEngine) {
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
        this.D = shopData.aW();
        this.j = shopData.p();
        this.k = shopData.q();
        b(shopData.G().l());
        shopData.G().a(d());
        shopData.b(g.KEY_TAB_KEY_NAME, shopData.d(this.j, this.k));
        shopData.G().a(new View$OnClickListenerC0141a());
        shopData.G().c(new BaseContentComponent$initComponent$2(this));
        shopData.G().a(new BaseContentComponent$initComponent$3(this));
        shopData.G().f(new BaseContentComponent$initComponent$4(this));
        this.l = shopData.f(this.j, this.k);
        if (this.l != 0) {
            this.m = true;
        }
        this.p = o.a(fragmentActivity);
        a(new View(fragmentActivity));
        long j = this.j == 0 ? 1000L : 0L;
        if (cen.Companion.ay()) {
            j = 2500;
        }
        com.alibaba.triver.triver_shop.newShop.ext.b.a(new BaseContentComponent$initComponent$5(context, shopData), j);
        this.y = S();
        this.x = com.alibaba.triver.triver_shop.newShop.ext.b.b((Activity) context).heightPixels;
        String S = shopData.S();
        if (S != null) {
            if (S.length() > 0) {
                z = true;
            }
        }
        this.F = z;
        this.G = shopData.aD();
        shopData.bb().b(new BaseContentComponent$initComponent$6(this));
        shopData.bb().a(new BaseContentComponent$initComponent$7(this));
        shopData.bb().c(new BaseContentComponent$initComponent$8(this));
        shopData.bb().e(new BaseContentComponent$initComponent$9(this));
    }

    public final void b(String direction) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, direction});
            return;
        }
        q.d(direction, "direction");
        if (q.a((Object) direction, (Object) "pre")) {
            aw();
        } else if (!q.a((Object) direction, (Object) "next")) {
        } else {
            av();
        }
    }

    public View x() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("c3d47f81", new Object[]{this}) : d();
    }

    public final void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bea080", new Object[]{this});
        } else {
            o.e(e());
        }
    }

    public boolean A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a97c4c", new Object[]{this})).booleanValue();
        }
        if (this.q || this.s || this.E) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.u < this.v) {
            return false;
        }
        this.u = currentTimeMillis;
        return this.t;
    }

    public final void k(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b93249a2", new Object[]{this, new Boolean(z)});
        } else {
            this.t = z;
        }
    }

    public final void i(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5c85893", new Object[]{this, new Integer(i)});
        } else if (i == 0) {
        } else {
            if (i < 0) {
                ruw<? super Integer, ? super Boolean, t> ruwVar = this.h;
                if (ruwVar == null) {
                    return;
                }
                ruwVar.mo2423invoke(Integer.valueOf(o.f(Integer.valueOf(i))), false);
                return;
            }
            ruw<? super Integer, ? super Boolean, t> ruwVar2 = this.h;
            if (ruwVar2 == null) {
                return;
            }
            ruwVar2.mo2423invoke(Integer.valueOf(o.f(Integer.valueOf(i))), true);
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.ShopSwipeListenerLayout.a
    public void onSwipeUp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4624ae1d", new Object[]{this});
        } else {
            ShopSwipeListenerLayout.a.C0139a.a(this);
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.ShopSwipeListenerLayout.a
    public void onSwipeDown() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b54535e4", new Object[]{this});
        } else {
            ShopSwipeListenerLayout.a.C0139a.b(this);
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.ShopSwipeListenerLayout.a
    public void onSwipeUp(View fromTargetView, MotionEvent event, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0e512d9", new Object[]{this, fromTargetView, event, new Integer(i)});
            return;
        }
        q.d(fromTargetView, "fromTargetView");
        q.d(event, "event");
        ShopSwipeListenerLayout.a.C0139a.b(this, fromTargetView, event, i);
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.ShopSwipeListenerLayout.a
    public void onSwipeDown(View fromTargetView, MotionEvent event, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74251660", new Object[]{this, fromTargetView, event, new Integer(i)});
            return;
        }
        q.d(fromTargetView, "fromTargetView");
        q.d(event, "event");
        ShopSwipeListenerLayout.a.C0139a.a(this, fromTargetView, event, i);
    }

    public void l(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bae72241", new Object[]{this, new Boolean(z)});
        } else {
            this.r = z;
        }
    }

    @Override // android.support.v4.view.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6581cc1e", new Object[]{this, new Integer(i)});
        } else if (i == 1) {
            this.q = true;
        } else {
            this.q = false;
        }
    }

    public final boolean C() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3c5ab4e", new Object[]{this})).booleanValue() : this.n == 0;
    }

    public final int j(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b77d3125", new Object[]{this, new Integer(i)})).intValue();
        }
        int i2 = this.x;
        return (i2 != 0 && !this.y) ? rvm.a(i2 * 0.75d) : i;
    }

    private final boolean S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4a7235e", new Object[]{this})).booleanValue();
        }
        DisplayMetrics b = com.alibaba.triver.triver_shop.newShop.ext.b.b((Activity) a());
        if (b.heightPixels == 0 || b.widthPixels == 0) {
            return true;
        }
        float f = b.heightPixels / b.widthPixels;
        ceg.Companion.b(q.a("current window ratio : ", (Object) Float.valueOf(f)));
        return ((double) f) >= 1.94d;
    }

    public LifecycleObserver I() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LifecycleObserver) ipChange.ipc$dispatch("7c0818b3", new Object[]{this}) : this.I;
    }

    public void L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4447ed3", new Object[]{this});
        } else {
            com.alibaba.triver.triver_shop.newShop.ext.b.b(new BaseContentComponent$onStatusBarStyleChanged$1(this));
        }
    }

    public final void M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4529654", new Object[]{this});
        } else if (this.H) {
        } else {
            l.a((Activity) a(), true);
            this.H = true;
        }
    }

    public final void N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("460add5", new Object[]{this});
        } else if (!this.H) {
        } else {
            l.a((Activity) a(), false);
            this.H = false;
        }
    }

    public final void x(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf6149b5", new Object[]{this, new Boolean(z)});
        } else {
            this.K = z;
        }
    }

    public void b(boolean z, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8eea35ab", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2)});
        } else {
            com.alibaba.triver.triver_shop.newShop.ext.b.b(new BaseContentComponent$setAllItemCountIconVisibleFunction$1(z, this, i, i2));
        }
    }

    public final void a(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6635bcfe", new Object[]{this, str, jSONObject});
        } else if (str == null || jSONObject == null) {
        } else {
            com.alibaba.triver.triver_shop.newShop.ext.b.b(new BaseContentComponent$updateDXTemplateData$1(this, str, jSONObject));
        }
    }

    public void b(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("676c0fdd", new Object[]{this, str, jSONObject});
            return;
        }
        ceg.a aVar = ceg.Companion;
        aVar.a("refreshDXWidget widgetName:" + ((Object) str) + ", refreshData:" + jSONObject + ' ');
        a(str, jSONObject);
    }

    public static /* synthetic */ void a(a aVar, com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.a aVar2, String str, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d587921", new Object[]{aVar, aVar2, str, new Integer(i), obj});
        } else if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onTemplateCreate");
        } else {
            if ((i & 2) != 0) {
                str = null;
            }
            aVar.a(aVar2, str);
        }
    }

    public final void a(com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.a aVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dbf2b09", new Object[]{this, aVar, str});
        } else if (aVar == null) {
        } else {
            if (aVar instanceof com.alibaba.triver.triver_shop.shop2023.template.a) {
                this.f.put(((com.alibaba.triver.triver_shop.shop2023.template.a) aVar).l().getName(), aVar);
                return;
            }
            HashMap<String, com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.a> hashMap = this.f;
            if (str == null) {
                return;
            }
            hashMap.put(str, aVar);
        }
    }

    public void av() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac1a6e3c", new Object[]{this});
            return;
        }
        ViewPager ax = ax();
        if (ax == null) {
            return;
        }
        ax.setCurrentItem(ax.getCurrentItem() + 1, true);
    }

    public void aw() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac2885bd", new Object[]{this});
            return;
        }
        ViewPager ax = ax();
        if (ax == null) {
            return;
        }
        ax.getCurrentItem();
        ax.setCurrentItem(ax.getCurrentItem() - 1, true);
    }
}
