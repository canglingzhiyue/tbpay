package com.taobao.tao.recommend4.recyclerview;

import android.support.v7.widget.RecyclerView;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.osy;
import tb.ota;

/* loaded from: classes8.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private RecyclerView.OnScrollListener f20969a;
    private b b;
    private ota.a c;
    private final HomeChildRecyclerView d;
    private final osy e;

    static {
        kge.a(1000486745);
    }

    public static /* synthetic */ void a(a aVar, HomeChildRecyclerView homeChildRecyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7277e20c", new Object[]{aVar, homeChildRecyclerView});
        } else {
            aVar.g(homeChildRecyclerView);
        }
    }

    public a(HomeChildRecyclerView homeChildRecyclerView, osy osyVar) {
        this.d = homeChildRecyclerView;
        this.e = osyVar;
        a(homeChildRecyclerView);
        b(homeChildRecyclerView);
        a(homeChildRecyclerView, osyVar);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        d(this.d);
        c(this.d);
        b(this.d, this.e);
    }

    private void a(HomeChildRecyclerView homeChildRecyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a4c97aa", new Object[]{this, homeChildRecyclerView});
            return;
        }
        this.f20969a = b();
        homeChildRecyclerView.addOnScrollListener(this.f20969a);
    }

    private void b(HomeChildRecyclerView homeChildRecyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("760e136b", new Object[]{this, homeChildRecyclerView});
            return;
        }
        this.b = e(homeChildRecyclerView);
        homeChildRecyclerView.addLayoutListener(this.b);
    }

    private void a(HomeChildRecyclerView homeChildRecyclerView, osy osyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65b534e5", new Object[]{this, homeChildRecyclerView, osyVar});
            return;
        }
        this.c = f(homeChildRecyclerView);
        osyVar.a(this.c);
    }

    private void c(HomeChildRecyclerView homeChildRecyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51cf8f2c", new Object[]{this, homeChildRecyclerView});
            return;
        }
        RecyclerView.OnScrollListener onScrollListener = this.f20969a;
        if (onScrollListener == null) {
            return;
        }
        homeChildRecyclerView.removeOnScrollListener(onScrollListener);
    }

    private void d(HomeChildRecyclerView homeChildRecyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d910aed", new Object[]{this, homeChildRecyclerView});
            return;
        }
        b bVar = this.b;
        if (bVar == null) {
            return;
        }
        homeChildRecyclerView.removeLayoutListener(bVar);
    }

    private void b(HomeChildRecyclerView homeChildRecyclerView, osy osyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99635fa6", new Object[]{this, homeChildRecyclerView, osyVar});
            return;
        }
        ota.a aVar = this.c;
        if (aVar == null) {
            return;
        }
        osyVar.b(aVar);
    }

    private RecyclerView.OnScrollListener b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RecyclerView.OnScrollListener) ipChange.ipc$dispatch("c7e6bd97", new Object[]{this}) : new RecyclerView.OnScrollListener() { // from class: com.taobao.tao.recommend4.recyclerview.a.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.support.v7.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7fb6f2bf", new Object[]{this, recyclerView, new Integer(i)});
                    return;
                }
                try {
                    recyclerView.invalidateItemDecorations();
                    com.taobao.android.home.component.utils.e.e("BuyAfterCorrectLayoutController", "布局校准1");
                } catch (Throwable th) {
                    com.taobao.android.home.component.utils.e.a("BuyAfterCorrectLayoutController", "correctLayout error newState : " + i, th);
                }
            }
        };
    }

    private b e(final HomeChildRecyclerView homeChildRecyclerView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("ec9958e9", new Object[]{this, homeChildRecyclerView}) : new b() { // from class: com.taobao.tao.recommend4.recyclerview.a.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.recommend4.recyclerview.b
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    return;
                }
                a.a(a.this, homeChildRecyclerView);
                com.taobao.android.home.component.utils.e.e("BuyAfterCorrectLayoutController", "校准布局2");
            }
        };
    }

    private ota.a f(final HomeChildRecyclerView homeChildRecyclerView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ota.a) ipChange.ipc$dispatch("f2bb787e", new Object[]{this, homeChildRecyclerView}) : new ota.a() { // from class: com.taobao.tao.recommend4.recyclerview.a.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.ota.a
            public void a(boolean z, boolean z2, boolean z3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("271102ec", new Object[]{this, new Boolean(z), new Boolean(z2), new Boolean(z3)});
                } else if (z) {
                } else {
                    a.a(a.this, homeChildRecyclerView);
                    com.taobao.android.home.component.utils.e.e("BuyAfterCorrectLayoutController", "校准布局3");
                }
            }
        };
    }

    private void g(final HomeChildRecyclerView homeChildRecyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0d57e30", new Object[]{this, homeChildRecyclerView});
        } else {
            com.taobao.gateway.dispatch.a.b().a(new Runnable() { // from class: com.taobao.tao.recommend4.recyclerview.a.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        homeChildRecyclerView.invalidateItemDecorations();
                    } catch (Throwable th) {
                        com.taobao.android.home.component.utils.e.e("BuyAfterCorrectLayoutController", "出现异常：" + th);
                    }
                }
            }, 0L);
        }
    }
}
