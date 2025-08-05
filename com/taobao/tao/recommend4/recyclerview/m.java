package com.taobao.tao.recommend4.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.recommend4.manager.weex2.container.drawer.impl.NewScrollLogic;
import com.taobao.tao.recommend4.recyclerview.HomeChildRecyclerView;
import com.taobao.tao.recommend4.recyclerview.c;
import com.taobao.taobao.R;
import tb.kge;
import tb.ksk;
import tb.osl;
import tb.osm;
import tb.osy;
import tb.oto;
import tb.otp;

/* loaded from: classes8.dex */
public class m {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public HomeChildRecyclerView f20997a;
    public h b;
    public g c;
    public osm d;
    private o e;
    private com.taobao.tao.recommend4.recyclerview.a f;
    private oto g;
    private otp h;
    private q i;

    /* loaded from: classes8.dex */
    public interface a {
        void a(int i);
    }

    static {
        kge.a(-1969613749);
    }

    public static /* synthetic */ otp a(m mVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (otp) ipChange.ipc$dispatch("77d4703d", new Object[]{mVar}) : mVar.h;
    }

    private m(osm osmVar) {
        this.d = osmVar;
    }

    public static m a(osm osmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (m) ipChange.ipc$dispatch("7403aedd", new Object[]{osmVar});
        }
        if (osmVar != null) {
            return new m(osmVar);
        }
        return null;
    }

    public void a(osy osyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f88b6ba3", new Object[]{this, osyVar});
            return;
        }
        this.f20997a = new HomeChildRecyclerView(this.d.h());
        this.f20997a.setBackgroundResource(R.color.rec4_background_color);
        this.f20997a.setOverScrollMode(2);
        b(this.d.p());
        osm osmVar = this.d;
        this.c = new g(osmVar, osmVar.j());
        this.b = new h(this.d, this.c);
        this.f20997a.setAdapter(this.b);
        this.f20997a.addItemDecoration(this.c);
        f fVar = new f(this.d.f());
        final k kVar = new k(this.d.f());
        osm osmVar2 = this.d;
        String g = osmVar2 != null ? osmVar2.g() : "afterBuy";
        r rVar = new r(g);
        this.f20997a.attachExposureListener(kVar);
        this.f20997a.addOnScrollListener(kVar);
        this.f20997a.addOnScrollListener(fVar);
        this.f20997a.addOnScrollListener(rVar);
        this.f20997a.addOnChildAttachStateChangeListener(new e(this.b));
        i iVar = new i(this.d.f());
        this.f20997a.attachStayTimeListener(iVar);
        this.f20997a.addOnScrollListener(iVar);
        this.f20997a.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.taobao.tao.recommend4.recyclerview.m.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3d337638", new Object[]{this, view});
                } else {
                    com.taobao.gateway.dispatch.a.b().a(new Runnable() { // from class: com.taobao.tao.recommend4.recyclerview.m.1.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                kVar.onScrollStateChanged(m.this.f20997a, 0);
                            }
                        }
                    }, 100L);
                }
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7f64d55b", new Object[]{this, view});
                } else {
                    kVar.onScrollStateChanged(m.this.f20997a, 0);
                }
            }
        });
        this.f = new com.taobao.tao.recommend4.recyclerview.a(this.f20997a, osyVar);
        this.i = new q(this.f20997a, g);
        this.g = new oto(this.f20997a, e(), this.d.f());
    }

    public void a(otp otpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8956bcd", new Object[]{this, otpVar});
        } else {
            this.h = otpVar;
        }
    }

    private otp e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (otp) ipChange.ipc$dispatch("2dcf70cf", new Object[]{this}) : new otp() { // from class: com.taobao.tao.recommend4.recyclerview.m.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.otp
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                } else if (m.a(m.this) == null) {
                } else {
                    m.a(m.this).a();
                }
            }

            @Override // tb.otp
            public void b() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("57a83e9", new Object[]{this});
                } else if (m.a(m.this) == null) {
                } else {
                    m.a(m.this).b();
                }
            }
        };
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        o oVar = this.e;
        if (oVar != null) {
            oVar.a();
        }
        com.taobao.tao.recommend4.recyclerview.a aVar = this.f;
        if (aVar != null) {
            aVar.a();
            this.f = null;
        }
        q qVar = this.i;
        if (qVar != null) {
            qVar.a();
        }
        oto otoVar = this.g;
        if (otoVar == null) {
            return;
        }
        otoVar.a();
    }

    public void b() {
        h hVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        HomeChildRecyclerView homeChildRecyclerView = this.f20997a;
        if (homeChildRecyclerView == null || (hVar = this.b) == null) {
            return;
        }
        homeChildRecyclerView.setAdapter(hVar);
    }

    public void a(osm.a aVar, osl oslVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54ea2bfa", new Object[]{this, aVar, oslVar});
            return;
        }
        osm osmVar = this.d;
        if (osmVar == null || this.f20997a == null) {
            return;
        }
        this.e = new o(this.f20997a, osmVar.g(), oslVar, aVar);
    }

    public void a(ksk kskVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1b1abf5", new Object[]{this, kskVar});
            return;
        }
        o oVar = this.e;
        if (oVar != null) {
            oVar.a(kskVar);
        }
        oto otoVar = this.g;
        if (otoVar == null) {
            return;
        }
        otoVar.a(kskVar);
    }

    public void a(final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36296b61", new Object[]{this, aVar});
            return;
        }
        HomeChildRecyclerView homeChildRecyclerView = this.f20997a;
        if (homeChildRecyclerView == null) {
            return;
        }
        RecyclerView.LayoutManager layoutManager = homeChildRecyclerView.getLayoutManager();
        if (!(layoutManager instanceof c)) {
            return;
        }
        ((c) layoutManager).a(new c.a() { // from class: com.taobao.tao.recommend4.recyclerview.m.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.recommend4.recyclerview.c.a
            public void a(boolean z, boolean z2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c194ce8", new Object[]{this, new Boolean(z), new Boolean(z2)});
                } else if (!z) {
                } else {
                    aVar.a((int) n.a(m.this.f20997a));
                }
            }
        });
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        HomeChildRecyclerView homeChildRecyclerView = this.f20997a;
        if (homeChildRecyclerView == null) {
            return;
        }
        RecyclerView.LayoutManager layoutManager = homeChildRecyclerView.getLayoutManager();
        if (!(layoutManager instanceof c)) {
            return;
        }
        ((c) layoutManager).a(z);
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        oto otoVar = this.g;
        if (otoVar == null) {
            return;
        }
        otoVar.b();
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        oto otoVar = this.g;
        if (otoVar == null) {
            return;
        }
        otoVar.c();
    }

    public void a(NewScrollLogic.PullState pullState, NewScrollLogic.PullState pullState2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("722f4868", new Object[]{this, pullState, pullState2});
            return;
        }
        oto otoVar = this.g;
        if (otoVar == null) {
            return;
        }
        otoVar.a(pullState, pullState2);
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        h hVar = this.b;
        if (hVar == null) {
            return;
        }
        hVar.c(i);
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            return;
        }
        c cVar = new c(i, 1, this.d);
        cVar.b(this.f20997a);
        this.f20997a.setLayoutManager(cVar);
    }

    public void a(boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c190d17", new Object[]{this, new Boolean(z), new Integer(i)});
        } else if (this.f20997a == null) {
        } else {
            b(i);
            this.f20997a.getRecycledViewPool().clear();
            g gVar = this.c;
            if (gVar != null) {
                gVar.a(i);
            }
            h hVar = this.b;
            if (hVar != null) {
                hVar.a(z);
            }
            com.taobao.android.home.component.utils.e.e("RecommendWrapper", "reset column count: " + i);
        }
    }

    public int g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5c0f961", new Object[]{this})).intValue();
        }
        HomeChildRecyclerView homeChildRecyclerView = this.f20997a;
        if (homeChildRecyclerView == null) {
            return 2;
        }
        RecyclerView.LayoutManager layoutManager = homeChildRecyclerView.getLayoutManager();
        if (!(layoutManager instanceof StaggeredGridLayoutManager)) {
            return 2;
        }
        return ((StaggeredGridLayoutManager) layoutManager).getSpanCount();
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        h hVar = this.b;
        if (hVar == null) {
            return;
        }
        hVar.h();
    }

    public void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
            return;
        }
        g gVar = this.c;
        if (gVar != null) {
            gVar.b(i);
        }
        h hVar = this.b;
        if (hVar == null) {
            return;
        }
        hVar.e(i);
    }

    public void a(HomeChildRecyclerView.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("385a4d4d", new Object[]{this, aVar});
            return;
        }
        HomeChildRecyclerView homeChildRecyclerView = this.f20997a;
        if (homeChildRecyclerView == null) {
            return;
        }
        homeChildRecyclerView.addOnTouchEventListener(aVar);
    }

    public void b(HomeChildRecyclerView.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29abdcce", new Object[]{this, aVar});
            return;
        }
        HomeChildRecyclerView homeChildRecyclerView = this.f20997a;
        if (homeChildRecyclerView == null) {
            return;
        }
        homeChildRecyclerView.removeOnTouchEventListener(aVar);
    }

    public int h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5cf10e2", new Object[]{this})).intValue();
        }
        HomeChildRecyclerView homeChildRecyclerView = this.f20997a;
        if (homeChildRecyclerView == null) {
            return -1;
        }
        RecyclerView.LayoutManager layoutManager = homeChildRecyclerView.getLayoutManager();
        if (layoutManager instanceof StaggeredGridLayoutManager) {
            int[] findFirstCompletelyVisibleItemPositions = ((StaggeredGridLayoutManager) layoutManager).findFirstCompletelyVisibleItemPositions(null);
            if (findFirstCompletelyVisibleItemPositions.length > 0) {
                return findFirstCompletelyVisibleItemPositions[0];
            }
        }
        return -1;
    }

    public void d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad401d78", new Object[]{this, new Integer(i)});
            return;
        }
        HomeChildRecyclerView homeChildRecyclerView = this.f20997a;
        if (homeChildRecyclerView == null) {
            return;
        }
        homeChildRecyclerView.scrollToPosition(i);
    }

    public void a(int i, final int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.f20997a.setBackgroundColor(i);
        ViewGroup.LayoutParams layoutParams = this.f20997a.getLayoutParams();
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            ((FrameLayout.LayoutParams) layoutParams).topMargin = i2;
            this.f20997a.setLayoutParams(layoutParams);
        } else if (layoutParams instanceof RecyclerView.LayoutParams) {
            ((RecyclerView.LayoutParams) layoutParams).topMargin = i2;
            this.f20997a.setLayoutParams(layoutParams);
        } else {
            this.f20997a.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.taobao.tao.recommend4.recyclerview.m.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3d337638", new Object[]{this, view});
                        return;
                    }
                    com.taobao.android.home.component.utils.e.e("RecommendWrapper", "handleRecyclerViewBackgroundColorAndMargin onViewAttachedToWindow");
                    RecyclerView.LayoutParams layoutParams2 = (RecyclerView.LayoutParams) m.this.f20997a.getLayoutParams();
                    if (layoutParams2 == null) {
                        return;
                    }
                    layoutParams2.topMargin = i2;
                    m.this.f20997a.setLayoutParams(layoutParams2);
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7f64d55b", new Object[]{this, view});
                    } else {
                        com.taobao.android.home.component.utils.e.e("RecommendWrapper", "handleRecyclerViewBackgroundColorAndMargin onViewDetachedFromWindow");
                    }
                }
            });
        }
    }
}
