package com.alibaba.poplayer.layermanager;

import com.alibaba.poplayer.layermanager.PopRequest;
import com.alibaba.poplayer.track.module.OnePopModule;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tb.bzw;
import tb.bzz;
import tb.kge;

/* loaded from: classes3.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private PopRequest f3196a;
    private final int e;
    private int f = 0;
    private i b = new i();
    private volatile boolean c = false;
    private volatile boolean d = false;

    static {
        kge.a(813302906);
    }

    public e(int i) {
        this.e = i;
    }

    public int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : this.e;
    }

    public void a(List<PopRequest> list) {
        PopRequest popRequest;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
            return;
        }
        c(list);
        if (list == null) {
            list = new ArrayList<>();
        }
        if (this.d && (popRequest = this.f3196a) != null && popRequest.f()) {
            this.f3196a = null;
        }
        PopRequest popRequest2 = this.f3196a;
        if (popRequest2 == null) {
            if (list.isEmpty()) {
                this.d = false;
                return;
            }
            PopRequest d = d(list);
            this.f3196a = d;
            this.c = true;
            list.remove(d);
            for (PopRequest popRequest3 : list) {
                if (popRequest3.h().c) {
                    this.b.a(popRequest3);
                    bzw.a(popRequest3, PopRequest.Status.ENQUEUED);
                } else {
                    popRequest3.t().T = OnePopModule.OnePopLoseReasonCode.LMLifeCycleDrop;
                    bzz.a((com.alibaba.poplayer.trigger.d) popRequest3);
                    bzw.a(popRequest3, PopRequest.Status.REMOVED);
                    com.alibaba.poplayer.utils.c.c("pageLifeCycle", com.alibaba.poplayer.trigger.d.b(popRequest3), "onReady.drop");
                }
            }
            PopRequest popRequest4 = this.f3196a;
            if (popRequest4 != null && popRequest4.g() == null) {
                com.alibaba.poplayer.utils.c.c("pageLifeCycle", com.alibaba.poplayer.trigger.d.b(this.f3196a), "onReady.directlyShow");
                bzw.a(this.f3196a, PopRequest.Status.READY);
            }
        } else {
            PopRequest a2 = a(list, popRequest2);
            if (a2 != null) {
                this.c = true;
                this.f3196a.t().T = OnePopModule.OnePopLoseReasonCode.LMLifeCycleForceDrop;
                bzw.a(this.f3196a, PopRequest.Status.FORCE_REMOVED);
                com.alibaba.poplayer.utils.c.c("pageLifeCycle", com.alibaba.poplayer.trigger.d.b(this.f3196a), "onReady.forceDrop");
                this.f3196a = a2;
                list.remove(a2);
            } else {
                if (this.d) {
                    this.c = true;
                }
                list.remove(this.f3196a);
            }
            for (PopRequest popRequest5 : list) {
                if (popRequest5.h().c) {
                    this.b.a(popRequest5);
                    bzw.a(popRequest5, PopRequest.Status.ENQUEUED);
                } else {
                    popRequest5.t().T = OnePopModule.OnePopLoseReasonCode.LMLifeCycleDrop;
                    bzz.a((com.alibaba.poplayer.trigger.d) popRequest5);
                    bzw.a(popRequest5, PopRequest.Status.REMOVED);
                    com.alibaba.poplayer.utils.c.c("pageLifeCycle", com.alibaba.poplayer.trigger.d.b(popRequest5), "onReady.drop");
                }
            }
            if (a2 != null && a2.g() == null) {
                com.alibaba.poplayer.utils.c.c("pageLifeCycle", com.alibaba.poplayer.trigger.d.b(a2), "onReady.directlyShow");
                bzw.a(a2, PopRequest.Status.READY);
            }
        }
        this.d = false;
    }

    public void b(List<PopRequest> list) {
        PopRequest b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d39e1eda", new Object[]{this, list});
            return;
        }
        if (list.contains(this.f3196a)) {
            this.c = true;
            bzw.a(this.f3196a, PopRequest.Status.REMOVED);
            list.remove(this.f3196a);
            this.f3196a = null;
            this.d = false;
        }
        for (PopRequest popRequest : list) {
            bzw.a(popRequest, PopRequest.Status.REMOVED);
        }
        this.b.a(list);
        if (this.f3196a != null) {
            return;
        }
        while (true) {
            b = this.b.b();
            if (b == null) {
                b = null;
                break;
            } else if (g.a(b) && g.b(b)) {
                break;
            } else {
                bzw.a(b, PopRequest.Status.REMOVED);
            }
        }
        if (b != null) {
            this.f3196a = b;
            this.c = true;
            if (b.g() != null) {
                return;
            }
            bzw.a(b, PopRequest.Status.READY);
            return;
        }
        com.alibaba.poplayer.utils.c.a("LayerInfo.removePopRequests.syncFirstShowPopProcessDone1.", new Object[0]);
    }

    public void a(PopRequest popRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9690e74", new Object[]{this, popRequest});
        } else if (popRequest != this.f3196a) {
        } else {
            if (!popRequest.r() && !popRequest.s() && !popRequest.p()) {
                return;
            }
            this.d = true;
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            this.c = true;
        }
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : this.c;
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else {
            this.c = false;
        }
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue() : this.d;
    }

    public PopRequest g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PopRequest) ipChange.ipc$dispatch("6029aa34", new Object[]{this}) : this.f3196a;
    }

    public boolean h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue() : this.f3196a != null || !this.b.a().isEmpty();
    }

    public int i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5dd2863", new Object[]{this})).intValue();
        }
        this.f++;
        return this.f;
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
        } else if (this.f3196a != null) {
        } else {
            this.f = 0;
        }
    }

    public void c(List<PopRequest> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e037145b", new Object[]{this, list});
        } else if (list == null) {
        } else {
            Iterator<PopRequest> it = list.iterator();
            while (it.hasNext()) {
                PopRequest next = it.next();
                if (!g.a(next)) {
                    it.remove();
                    bzw.a(next, PopRequest.Status.REMOVED);
                }
            }
        }
    }

    public static PopRequest d(List<PopRequest> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PopRequest) ipChange.ipc$dispatch("4fb37486", new Object[]{list});
        }
        int i = -1;
        int i2 = -1;
        for (int i3 = 0; i3 < list.size(); i3++) {
            int i4 = list.get(i3).h().b;
            if (i4 > i2) {
                i = i3;
                i2 = i4;
            }
        }
        if (i < 0) {
            return null;
        }
        return list.get(i);
    }

    private static PopRequest a(List<PopRequest> list, PopRequest popRequest) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PopRequest) ipChange.ipc$dispatch("f8ebc35d", new Object[]{list, popRequest});
        }
        if (list == null) {
            return null;
        }
        int i2 = -1;
        int i3 = -1;
        for (int i4 = 0; i4 < list.size(); i4++) {
            if (list.get(i4).h().d && (i = list.get(i4).h().b) > i3) {
                i2 = i4;
                i3 = i;
            }
        }
        PopRequest popRequest2 = i2 >= 0 ? list.get(i2) : null;
        if (popRequest2 != null && popRequest2.h().b <= popRequest.h().b) {
            return null;
        }
        return popRequest2;
    }
}
