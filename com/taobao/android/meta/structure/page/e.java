package com.taobao.android.meta.structure.page;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.business.srp.page.uikit.RoundFrameLayout;
import com.taobao.android.searchbaseframe.business.srp.viewpager.uikit.SearchViewPager;
import com.taobao.android.searchbaseframe.meta.uikit.MetaLayout;
import com.taobao.android.searchbaseframe.uikit.ImmersiveFrameLayout;
import com.taobao.android.searchbaseframe.util.t;
import kotlin.jvm.internal.q;
import tb.hte;
import tb.ite;
import tb.itk;
import tb.iuf;
import tb.kge;

/* loaded from: classes6.dex */
public final class e extends iuf<FrameLayout, a> implements b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public hte f14306a;
    private MetaLayout b;
    private FrameLayout c;
    private View d;
    private SearchViewPager e;

    static {
        kge.a(-558721338);
        kge.a(-1503653931);
    }

    public static final /* synthetic */ SearchViewPager a(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SearchViewPager) ipChange.ipc$dispatch("b16724f7", new Object[]{eVar});
        }
        SearchViewPager searchViewPager = eVar.e;
        if (searchViewPager == null) {
            q.b("pagerView");
        }
        return searchViewPager;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.widget.FrameLayout, java.lang.Object] */
    @Override // tb.iuj
    public /* synthetic */ FrameLayout b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("43b9c269", new Object[]{this}) : e();
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [android.widget.FrameLayout, java.lang.Object] */
    @Override // tb.iuj
    public /* synthetic */ FrameLayout b(Context context, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c01d4bb4", new Object[]{this, context, viewGroup}) : a(context, viewGroup);
    }

    @Override // com.taobao.android.meta.structure.page.b
    public void a(itk header) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee561238", new Object[]{this, header});
            return;
        }
        q.c(header, "header");
        if (header instanceof ite) {
            ((ite) header).j();
        }
        MetaLayout metaLayout = this.b;
        if (metaLayout == null) {
            q.b("metaLayout");
        }
        metaLayout.addHeader(header);
    }

    @Override // com.taobao.android.meta.structure.page.b
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        MetaLayout metaLayout = this.b;
        if (metaLayout == null) {
            q.b("metaLayout");
        }
        metaLayout.commit();
    }

    @Override // com.taobao.android.meta.structure.page.b
    public void a(com.taobao.android.searchbaseframe.meta.uikit.b list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3816280", new Object[]{this, list});
            return;
        }
        q.c(list, "list");
        MetaLayout metaLayout = this.b;
        if (metaLayout == null) {
            q.b("metaLayout");
        }
        metaLayout.setCurrentList(list);
    }

    @Override // com.taobao.android.meta.structure.page.b
    public void a(PagerAdapter adapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1de0fd2", new Object[]{this, adapter});
            return;
        }
        q.c(adapter, "adapter");
        SearchViewPager searchViewPager = this.e;
        if (searchViewPager == null) {
            q.b("pagerView");
        }
        searchViewPager.setAdapter(adapter);
    }

    @Override // com.taobao.android.meta.structure.page.b
    public void a(ViewPager.OnPageChangeListener listener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3062ac6", new Object[]{this, listener});
            return;
        }
        q.c(listener, "listener");
        SearchViewPager searchViewPager = this.e;
        if (searchViewPager == null) {
            q.b("pagerView");
        }
        searchViewPager.addOnPageChangeListener(listener);
    }

    @Override // com.taobao.android.meta.structure.page.b
    public ViewPager cX_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewPager) ipChange.ipc$dispatch("4bdfc65d", new Object[]{this});
        }
        SearchViewPager searchViewPager = this.e;
        if (searchViewPager == null) {
            q.b("pagerView");
        }
        return searchViewPager;
    }

    @Override // com.taobao.android.meta.structure.page.b
    public void a(hte config) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec9e7f5f", new Object[]{this, config});
            return;
        }
        q.c(config, "config");
        this.f14306a = config;
    }

    @Override // com.taobao.android.meta.structure.page.b
    public MetaLayout d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MetaLayout) ipChange.ipc$dispatch("5176d0c2", new Object[]{this});
        }
        MetaLayout metaLayout = this.b;
        if (metaLayout == null) {
            q.b("metaLayout");
        }
        return metaLayout;
    }

    @Override // com.taobao.android.meta.structure.page.b
    public void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
            return;
        }
        q.c(view, "view");
        FrameLayout frameLayout = this.c;
        if (frameLayout == null) {
            q.b("rootView");
        }
        FrameLayout frameLayout2 = this.c;
        if (frameLayout2 == null) {
            q.b("rootView");
        }
        View view2 = this.d;
        if (view2 == null) {
            q.b("backgroundView");
        }
        frameLayout.addView(view, frameLayout2.indexOfChild(view2) + 1, new ViewGroup.LayoutParams(-1, -1));
    }

    public FrameLayout a(Context context, ViewGroup viewGroup) {
        RoundFrameLayout roundFrameLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("8d96acda", new Object[]{this, context, viewGroup});
        }
        hte hteVar = this.f14306a;
        if (hteVar == null) {
            q.b("config");
        }
        if (hteVar.I()) {
            if (context == null) {
                q.a();
            }
            roundFrameLayout = new ImmersiveFrameLayout(context);
        } else {
            if (context == null) {
                q.a();
            }
            roundFrameLayout = new RoundFrameLayout(context);
        }
        this.c = roundFrameLayout;
        this.b = new MetaLayout(context);
        hte hteVar2 = this.f14306a;
        if (hteVar2 == null) {
            q.b("config");
        }
        if (hteVar2.at()) {
            MetaLayout metaLayout = this.b;
            if (metaLayout == null) {
                q.b("metaLayout");
            }
            metaLayout.layoutListFirst();
        }
        MetaLayout metaLayout2 = this.b;
        if (metaLayout2 == null) {
            q.b("metaLayout");
        }
        hte hteVar3 = this.f14306a;
        if (hteVar3 == null) {
            q.b("config");
        }
        metaLayout2.setLayoutType(hteVar3.a());
        MetaLayout metaLayout3 = this.b;
        if (metaLayout3 == null) {
            q.b("metaLayout");
        }
        hte hteVar4 = this.f14306a;
        if (hteVar4 == null) {
            q.b("config");
        }
        metaLayout3.setScrollable(hteVar4.F());
        this.e = new SearchViewPager(context);
        SearchViewPager searchViewPager = this.e;
        if (searchViewPager == null) {
            q.b("pagerView");
        }
        searchViewPager.setOffscreenPageLimit(1);
        MetaLayout metaLayout4 = this.b;
        if (metaLayout4 == null) {
            q.b("metaLayout");
        }
        SearchViewPager searchViewPager2 = this.e;
        if (searchViewPager2 == null) {
            q.b("pagerView");
        }
        metaLayout4.addListContainer(searchViewPager2);
        MetaLayout metaLayout5 = this.b;
        if (metaLayout5 == null) {
            q.b("metaLayout");
        }
        metaLayout5.setUseHiddenHeight();
        this.d = new View(context);
        FrameLayout frameLayout = this.c;
        if (frameLayout == null) {
            q.b("rootView");
        }
        View view = this.d;
        if (view == null) {
            q.b("backgroundView");
        }
        frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
        View view2 = this.d;
        if (view2 == null) {
            q.b("backgroundView");
        }
        hte hteVar5 = this.f14306a;
        if (hteVar5 == null) {
            q.b("config");
        }
        t.a(view2, hteVar5.v());
        hte hteVar6 = this.f14306a;
        if (hteVar6 == null) {
            q.b("config");
        }
        if (hteVar6.w() != null) {
            View view3 = this.d;
            if (view3 == null) {
                q.b("backgroundView");
            }
            hte hteVar7 = this.f14306a;
            if (hteVar7 == null) {
                q.b("config");
            }
            ViewCompat.setBackground(view3, hteVar7.w());
        }
        FrameLayout frameLayout2 = this.c;
        if (frameLayout2 == null) {
            q.b("rootView");
        }
        MetaLayout metaLayout6 = this.b;
        if (metaLayout6 == null) {
            q.b("metaLayout");
        }
        frameLayout2.addView(metaLayout6, new ViewGroup.LayoutParams(-1, -1));
        q().b();
        hte hteVar8 = this.f14306a;
        if (hteVar8 == null) {
            q.b("config");
        }
        hteVar8.H().a(new MetaPageView$createView$1(this));
        FrameLayout frameLayout3 = this.c;
        if (frameLayout3 == null) {
            q.b("rootView");
        }
        return frameLayout3;
    }

    public FrameLayout e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("67541aed", new Object[]{this});
        }
        FrameLayout frameLayout = this.c;
        if (frameLayout == null) {
            q.b("rootView");
        }
        return frameLayout;
    }
}
