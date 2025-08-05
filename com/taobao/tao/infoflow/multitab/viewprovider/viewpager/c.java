package com.taobao.tao.infoflow.multitab.viewprovider.viewpager;

import android.support.v4.view.ViewPager;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.business.getconfig.DefaultRefreshConfig;
import com.taobao.homepage.utils.n;
import com.taobao.tao.infoflow.multitab.g;
import com.taobao.tao.infoflow.multitab.i;
import com.taobao.tao.infoflow.multitab.m;
import com.taobao.tao.infoflow.multitab.protocol.IMultiTabPerformanceListener;
import com.taobao.tao.infoflow.multitab.viewprovider.viewpager.a;
import com.taobao.uikit.extend.component.refresh.TBRefreshHeader;
import com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.kge;
import tb.kss;

/* loaded from: classes8.dex */
public class c implements a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private TBSwipeRefreshLayout f20673a;
    private MultiTabViewPager c;
    private b d;
    private List<JSONObject> j;
    private final i k;
    private boolean l;
    private final IMultiTabPerformanceListener o;
    private final DefaultRefreshConfig b = new DefaultRefreshConfig();
    private final List<a.b> e = new CopyOnWriteArrayList();
    private final List<a.InterfaceC0865a> f = new CopyOnWriteArrayList();
    private final List<a.c> g = new CopyOnWriteArrayList();
    private int h = 0;
    private boolean i = false;
    private boolean p = false;
    private final ViewPager.OnPageChangeListener m = new ViewPager.OnPageChangeListener() { // from class: com.taobao.tao.infoflow.multitab.viewprovider.viewpager.c.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.support.v4.view.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6581cc1e", new Object[]{this, new Integer(i)});
                return;
            }
            if (i == 1) {
                c cVar = c.this;
                c.a(cVar, c.a(cVar).getCurrentItem());
                c.a(c.this, true);
            } else if (i == 0) {
                if (c.b(c.this) && c.a(c.this).getCurrentItem() != c.c(c.this)) {
                    c cVar2 = c.this;
                    c.b(cVar2, c.a(cVar2).getCurrentItem());
                }
                c.a(c.this, false);
            }
            for (a.InterfaceC0865a interfaceC0865a : c.d(c.this)) {
                interfaceC0865a.n_(i);
            }
        }

        @Override // android.support.v4.view.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f4c13b05", new Object[]{this, new Integer(i), new Float(f), new Integer(i2)});
                return;
            }
            c.b(c.this, false);
            for (a.InterfaceC0865a interfaceC0865a : c.d(c.this)) {
                interfaceC0865a.a(i, f, i2);
            }
        }

        @Override // android.support.v4.view.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i)});
                return;
            }
            c.a(c.this).onPageSelected();
            if (!n.n().e() || c.e(c.this)) {
                return;
            }
            for (a.InterfaceC0865a interfaceC0865a : c.d(c.this)) {
                interfaceC0865a.a(i);
            }
        }
    };
    private final TBSwipeRefreshLayout.OnPullRefreshListener n = new TBSwipeRefreshLayout.OnPullRefreshListener() { // from class: com.taobao.tao.infoflow.multitab.viewprovider.viewpager.c.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout.OnPullRefreshListener
        public void onRefresh() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c9cbba83", new Object[]{this});
                return;
            }
            for (a.b bVar : c.f(c.this)) {
                bVar.a();
            }
        }

        @Override // com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout.OnPullRefreshListener
        public void onPullDistance(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2dcc8a23", new Object[]{this, new Integer(i)});
                return;
            }
            for (a.b bVar : c.f(c.this)) {
                bVar.a(i);
            }
        }

        @Override // com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout.OnPullRefreshListener
        public void onRefreshStateChanged(TBRefreshHeader.RefreshState refreshState, TBRefreshHeader.RefreshState refreshState2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1f1ba5ae", new Object[]{this, refreshState, refreshState2});
                return;
            }
            for (a.b bVar : c.f(c.this)) {
                bVar.a(refreshState, refreshState2);
            }
        }
    };

    static {
        kge.a(897337571);
        kge.a(656207359);
    }

    public static /* synthetic */ int a(c cVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("50a056", new Object[]{cVar, new Integer(i)})).intValue();
        }
        cVar.h = i;
        return i;
    }

    public static /* synthetic */ MultiTabViewPager a(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MultiTabViewPager) ipChange.ipc$dispatch("c7b55b19", new Object[]{cVar}) : cVar.c;
    }

    public static /* synthetic */ boolean a(c cVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("50e038", new Object[]{cVar, new Boolean(z)})).booleanValue();
        }
        cVar.i = z;
        return z;
    }

    public static /* synthetic */ void b(c cVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e101864", new Object[]{cVar, new Integer(i)});
        } else {
            cVar.b(i);
        }
    }

    public static /* synthetic */ boolean b(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("86a5aa83", new Object[]{cVar})).booleanValue() : cVar.i;
    }

    public static /* synthetic */ boolean b(c cVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4e105839", new Object[]{cVar, new Boolean(z)})).booleanValue();
        }
        cVar.p = z;
        return z;
    }

    public static /* synthetic */ int c(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("506ae51", new Object[]{cVar})).intValue() : cVar.h;
    }

    public static /* synthetic */ List d(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("ce45be6a", new Object[]{cVar}) : cVar.f;
    }

    public static /* synthetic */ boolean e(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1c8b620", new Object[]{cVar})).booleanValue() : cVar.p;
    }

    public static /* synthetic */ List f(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("dc9782ec", new Object[]{cVar}) : cVar.e;
    }

    public c(i iVar, IMultiTabPerformanceListener iMultiTabPerformanceListener) {
        this.k = iVar;
        this.o = iMultiTabPerformanceListener;
    }

    @Override // tb.ksi
    public void a(JSONObject jSONObject, List<JSONObject> list, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f72497b", new Object[]{this, jSONObject, list, new Boolean(z)});
            return;
        }
        this.j = list;
        this.d.a(list);
        this.c.setCurrentItem(z ? this.k.c() : this.k.h());
    }

    @Override // tb.ksi
    public void a(LinearLayout linearLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("920f557f", new Object[]{this, linearLayout});
            return;
        }
        this.f20673a = new TBSwipeRefreshLayout(linearLayout.getContext());
        this.f20673a.getRefresHeader().setRefreshTips(new String[]{this.b.pullToRefreshText, this.b.releaseToRefreshText, this.b.refreshingText, this.b.refreshFinishedText});
        this.f20673a.enablePullRefresh(true);
        this.c = new MultiTabViewPager(linearLayout.getContext());
        ViewGroup.LayoutParams layoutParams = this.c.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, -1);
        }
        layoutParams.width = -1;
        layoutParams.height = -1;
        this.c.setLayoutParams(layoutParams);
        this.f20673a.addView(this.c);
        this.f20673a.setOnPullRefreshListener(this.n);
        linearLayout.addView(this.f20673a, new ViewGroup.LayoutParams(-1, -1));
        this.d = new b(this.k, this.g);
        this.c.setAdapter(this.d);
        if (n.n().e()) {
            this.c.setPageTransformer(false, null);
        }
        this.c.clearOnPageChangeListeners();
        this.c.addOnPageChangeListener(new m(this.k));
        this.c.addOnPageChangeListener(this.m);
        this.l = true;
    }

    @Override // tb.ksi
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.e.clear();
        this.f.clear();
        this.g.clear();
    }

    @Override // com.taobao.tao.infoflow.multitab.viewprovider.viewpager.a
    public MultiTabViewPager b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MultiTabViewPager) ipChange.ipc$dispatch("763d2922", new Object[]{this}) : this.c;
    }

    @Override // com.taobao.tao.infoflow.multitab.viewprovider.viewpager.a
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else if (!this.l) {
        } else {
            this.c.setEnableAccidentSlide(z);
        }
    }

    @Override // com.taobao.tao.infoflow.multitab.viewprovider.viewpager.a
    public void a(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c119299", new Object[]{this, new Integer(i), new Boolean(z)});
        } else if (!this.l) {
        } else {
            if (!n.n().e()) {
                this.d.a(i, true);
                return;
            }
            this.d.a(i, z);
            if (z) {
                return;
            }
            this.c.setCurrentItem(i, false);
        }
    }

    @Override // com.taobao.tao.infoflow.multitab.viewprovider.viewpager.a
    public List<JSONObject> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("31b9b59d", new Object[]{this});
        }
        if (this.l) {
            return this.d.a();
        }
        return null;
    }

    @Override // com.taobao.tao.infoflow.multitab.viewprovider.viewpager.a
    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else if (!this.l) {
        } else {
            if (z) {
                this.f20673a.setRefreshing(true, true);
            } else {
                this.f20673a.setRefreshing(false);
            }
        }
    }

    @Override // com.taobao.tao.infoflow.multitab.viewprovider.viewpager.a
    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
        } else if (!this.l) {
        } else {
            this.f20673a.enablePullRefresh(z);
        }
    }

    @Override // com.taobao.tao.infoflow.multitab.viewprovider.viewpager.a
    public void a(a.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52139e4", new Object[]{this, bVar});
        } else {
            this.e.add(bVar);
        }
    }

    @Override // com.taobao.tao.infoflow.multitab.viewprovider.viewpager.a
    public void a(a.InterfaceC0865a interfaceC0865a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("520c585", new Object[]{this, interfaceC0865a});
        } else {
            this.f.add(interfaceC0865a);
        }
    }

    @Override // com.taobao.tao.infoflow.multitab.viewprovider.viewpager.a
    public void a(a.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("521ae43", new Object[]{this, cVar});
        } else {
            this.g.add(cVar);
        }
    }

    @Override // com.taobao.tao.infoflow.multitab.viewprovider.viewpager.a
    public void a(int i) {
        MultiTabViewPager multiTabViewPager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else if (!n.n().e() || (multiTabViewPager = this.c) == null) {
        } else {
            this.p = true;
            multiTabViewPager.setCurrentItem(i, false);
        }
    }

    private void b(int i) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            return;
        }
        List<JSONObject> list = this.j;
        if (list == null || list.isEmpty() || i >= list.size() || (jSONObject = list.get(i)) == null || (jSONObject2 = jSONObject.getJSONObject("clickParam")) == null) {
            return;
        }
        String string = jSONObject2.getString("page");
        int i2 = 2201;
        try {
            i2 = jSONObject2.getIntValue("eventId");
        } catch (Exception e) {
            g.a("PullRefreshView", "parse eventId error, " + e.getMessage());
        }
        kss.a(string, i2, "Page_Home_Slideto-tab", jSONObject2.getJSONObject("args"));
        g.a("PullRefreshView", "report slide ut");
    }
}
