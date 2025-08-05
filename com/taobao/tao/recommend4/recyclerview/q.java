package com.taobao.tao.recommend4.recyclerview;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes8.dex */
public class q {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private b f21008a;
    private HomeChildRecyclerView b;
    private final String c;

    static {
        kge.a(1917954432);
    }

    public static /* synthetic */ String a(q qVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("59c8b3a6", new Object[]{qVar}) : qVar.c;
    }

    public q(HomeChildRecyclerView homeChildRecyclerView, String str) {
        this.b = homeChildRecyclerView;
        this.c = str;
        a(homeChildRecyclerView);
    }

    private void a(HomeChildRecyclerView homeChildRecyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a4c97aa", new Object[]{this, homeChildRecyclerView});
            return;
        }
        this.f21008a = b(homeChildRecyclerView);
        homeChildRecyclerView.addLayoutListener(this.f21008a);
    }

    private void b() {
        HomeChildRecyclerView homeChildRecyclerView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        b bVar = this.f21008a;
        if (bVar == null || (homeChildRecyclerView = this.b) == null) {
            return;
        }
        homeChildRecyclerView.removeLayoutListener(bVar);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            b();
        }
    }

    private b b(final HomeChildRecyclerView homeChildRecyclerView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("9d0384cc", new Object[]{this, homeChildRecyclerView}) : new b() { // from class: com.taobao.tao.recommend4.recyclerview.q.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.recommend4.recyclerview.b
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                } else {
                    r.a(homeChildRecyclerView, q.a(q.this));
                }
            }
        };
    }
}
