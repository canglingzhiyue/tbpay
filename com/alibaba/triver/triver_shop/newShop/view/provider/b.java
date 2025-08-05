package com.alibaba.triver.triver_shop.newShop.view.provider;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.core.OrderConfigs;
import com.taobao.taobao.R;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.Result;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.cej;
import tb.cel;
import tb.cen;
import tb.kge;

/* loaded from: classes3.dex */
public final class b implements cel {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public ViewPager f4009a;
    private final com.alibaba.triver.triver_shop.newShop.data.f b;
    private final HashSet<ViewPager.OnPageChangeListener> c = new HashSet<>();
    private final a d = new a(this);
    private int e;
    private Fragment f;

    static {
        kge.a(-1605534248);
        kge.a(1635811568);
    }

    public b(com.alibaba.triver.triver_shop.newShop.data.f fVar) {
        this.b = fVar;
    }

    public static final /* synthetic */ void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a37cca", new Object[]{bVar});
        } else {
            bVar.i();
        }
    }

    public static final /* synthetic */ void a(b bVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eccc8f79", new Object[]{bVar, new Integer(i)});
        } else {
            bVar.e = i;
        }
    }

    public static final /* synthetic */ int b(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c2191d3e", new Object[]{bVar})).intValue() : bVar.e;
    }

    @Override // tb.cel
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            cel.a.b(this);
        }
    }

    public final void a(ViewPager viewPager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2029c714", new Object[]{this, viewPager});
            return;
        }
        q.d(viewPager, "<set-?>");
        this.f4009a = viewPager;
    }

    public final ViewPager g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewPager) ipChange.ipc$dispatch("3fac125a", new Object[]{this});
        }
        ViewPager viewPager = this.f4009a;
        if (viewPager != null) {
            return viewPager;
        }
        q.b(OrderConfigs.VIEWPAGER);
        throw null;
    }

    @Override // tb.cel
    public View a(Context context, Fragment outerFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("1bb42014", new Object[]{this, context, outerFragment});
        }
        q.d(outerFragment, "outerFragment");
        this.f = outerFragment;
        View findViewById = LayoutInflater.from(context).inflate(R.layout.view_viewpager_layout, (ViewGroup) null).findViewById(R.id.view_viewpager);
        q.b(findViewById, "basicView.findViewById<ViewPager>(R.id.view_viewpager)");
        a((ViewPager) findViewById);
        Iterator<ViewPager.OnPageChangeListener> it = this.c.iterator();
        while (it.hasNext()) {
            g().addOnPageChangeListener(it.next());
        }
        com.alibaba.triver.triver_shop.newShop.data.f fVar = this.b;
        if (fVar == null || fVar.a() == 0) {
            return g();
        }
        if (cen.Companion.ac()) {
            i();
        } else {
            h();
        }
        return g();
    }

    private final void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        Fragment fragment = this.f;
        q.a(fragment);
        FragmentManager childFragmentManager = fragment.getChildFragmentManager();
        q.b(childFragmentManager, "outerFragment!!.childFragmentManager");
        cej cejVar = new cej(childFragmentManager);
        cejVar.a(new f(this.b));
        ViewPager g = g();
        com.alibaba.triver.triver_shop.newShop.data.f fVar = this.b;
        q.a(fVar);
        g.setOffscreenPageLimit(fVar.a() - 1);
        g().setAdapter(cejVar);
        g().addOnPageChangeListener(this.d);
    }

    public final Fragment b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Fragment) ipChange.ipc$dispatch("f34d8d9c", new Object[]{this, new Integer(i)});
        }
        try {
            Result.a aVar = Result.Companion;
            PagerAdapter adapter = g().getAdapter();
            if (!(adapter instanceof cej)) {
                Result.m2371constructorimpl(t.INSTANCE);
                return null;
            }
            return ((cej) adapter).a().a(i);
        } catch (Throwable th) {
            Result.a aVar2 = Result.Companion;
            Result.m2371constructorimpl(kotlin.i.a(th));
            return null;
        }
    }

    private final void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        Fragment fragment = this.f;
        q.a(fragment);
        if (com.alibaba.triver.triver_shop.newShop.ext.b.a(fragment)) {
            h();
        } else {
            com.alibaba.triver.triver_shop.newShop.ext.b.d(new HomePageTabFragmentViewProvider$initViewPagerSafely$1(this));
        }
    }

    /* loaded from: classes3.dex */
    public final class a implements ViewPager.OnPageChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f4010a;

        static {
            kge.a(1937068895);
            kge.a(1848919473);
        }

        @Override // android.support.v4.view.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6581cc1e", new Object[]{this, new Integer(i)});
            }
        }

        @Override // android.support.v4.view.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f4c13b05", new Object[]{this, new Integer(i), new Float(f), new Integer(i2)});
            }
        }

        public a(b this$0) {
            q.d(this$0, "this$0");
            this.f4010a = this$0;
        }

        @Override // android.support.v4.view.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i)});
            } else if (this.f4010a.f4009a == null) {
            } else {
                PagerAdapter adapter = this.f4010a.g().getAdapter();
                if (!(adapter instanceof cej)) {
                    com.alibaba.triver.triver_shop.newShop.ext.b.b(new HomePageTabFragmentViewProvider$PageChangeListener$onPageSelected$2(this, i));
                    return;
                }
                if (b.b(this.f4010a) != i) {
                    ((cej) adapter).b(b.b(this.f4010a));
                }
                ((cej) adapter).a(i);
                b.a(this.f4010a, i);
            }
        }
    }

    @Override // tb.cel
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.f4009a == null) {
        } else {
            g().setAdapter(null);
            g().clearOnPageChangeListeners();
        }
    }

    public final void a(ViewPager.OnPageChangeListener onPageChangeListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3062ac6", new Object[]{this, onPageChangeListener});
            return;
        }
        q.d(onPageChangeListener, "onPageChangeListener");
        if (this.f4009a == null) {
            this.c.add(onPageChangeListener);
        } else {
            g().addOnPageChangeListener(onPageChangeListener);
        }
    }

    @Override // tb.cel
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else if (this.f4009a == null) {
            com.alibaba.triver.triver_shop.newShop.ext.b.d(new HomePageTabFragmentViewProvider$switchSubTabTo$2(this, i));
        } else {
            com.alibaba.triver.triver_shop.newShop.data.f fVar = this.b;
            if (fVar == null || i >= fVar.a()) {
                return;
            }
            g().setCurrentItem(i, true);
        }
    }

    @Override // tb.cel
    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue();
        }
        if (this.f4009a != null) {
            return g().getCurrentItem();
        }
        return 0;
    }

    @Override // tb.cel
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        cel.a.d(this);
        if (this.f4009a != null) {
            this.d.onPageSelected(g().getCurrentItem());
        } else {
            com.alibaba.triver.triver_shop.newShop.ext.b.d(new HomePageTabFragmentViewProvider$onViewSelected$2(this));
        }
    }

    @Override // tb.cel
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            cel.a.c(this);
        }
    }

    @Override // tb.cel
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        cel.a.e(this);
        if (this.f4009a == null) {
            return;
        }
        PagerAdapter adapter = g().getAdapter();
        if (!(adapter instanceof cej)) {
            return;
        }
        ((cej) adapter).b(g().getCurrentItem());
    }
}
