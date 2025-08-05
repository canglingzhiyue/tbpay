package com.alibaba.poplayer.layermanager;

import android.view.View;
import android.view.ViewGroup;
import com.alibaba.poplayer.factory.view.base.PopLayerBaseView;
import com.alibaba.poplayer.layermanager.PopRequest;
import com.alibaba.poplayer.layermanager.view.Canvas;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.bzv;
import tb.bzw;
import tb.kge;

/* loaded from: classes3.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private List<e> f3191a = new CopyOnWriteArrayList();
    private Canvas c;

    static {
        kge.a(-1767083097);
    }

    public static /* synthetic */ List a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("8ef850aa", new Object[]{aVar}) : aVar.f3191a;
    }

    public Canvas a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Canvas) ipChange.ipc$dispatch("19085b5c", new Object[]{this}) : this.c;
    }

    public void a(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ae1851c", new Object[]{this, canvas});
        } else {
            this.c = canvas;
        }
    }

    public synchronized void a(List<PopRequest> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
            return;
        }
        bzv<e, PopRequest> d = d(list);
        for (e eVar : d.a().keySet()) {
            eVar.a(d.a(eVar));
        }
        d();
    }

    public synchronized void b(List<PopRequest> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d39e1eda", new Object[]{this, list});
            return;
        }
        bzv<e, PopRequest> d = d(list);
        for (e eVar : d.a().keySet()) {
            eVar.b(d.a(eVar));
        }
        d();
    }

    public synchronized void c(List<PopRequest> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e037145b", new Object[]{this, list});
            return;
        }
        bzv<e, PopRequest> d = d(list);
        for (e eVar : d.a().keySet()) {
            eVar.a(d.a(eVar).get(0));
        }
        d();
    }

    private bzv<e, PopRequest> d(List<PopRequest> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bzv) ipChange.ipc$dispatch("cccd21cc", new Object[]{this, list});
        }
        bzv<e, PopRequest> bzvVar = new bzv<>();
        for (PopRequest popRequest : list) {
            bzvVar.a(a(((d) popRequest.h()).f3195a), popRequest);
        }
        return bzvVar;
    }

    public void a(PopRequest popRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9690e74", new Object[]{this, popRequest});
            return;
        }
        e a2 = a(((d) popRequest.h()).f3195a);
        if (a2.g() != popRequest) {
            com.alibaba.poplayer.utils.c.a("%s.viewReadyNotify=>request not match!", toString());
            return;
        }
        com.alibaba.poplayer.utils.c.a("%s.viewReadyNotify=>readyToShow!", toString());
        a2.c();
        d();
    }

    public int b(PopRequest popRequest) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ecf42c28", new Object[]{this, popRequest})).intValue() : a(((d) popRequest.h()).f3195a).i();
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        for (e eVar : this.f3191a) {
            eVar.j();
        }
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            com.alibaba.poplayer.utils.f.b(new Runnable() { // from class: com.alibaba.poplayer.layermanager.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    View g;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    Canvas a2 = a.this.a();
                    if (a2 == null) {
                        com.alibaba.poplayer.utils.c.a("%s. updateCanvas ,but lose canvas.", toString());
                        return;
                    }
                    for (e eVar : a.a(a.this)) {
                        PopRequest g2 = eVar.g();
                        if (eVar.f()) {
                            View findViewByLevel = a2.findViewByLevel(eVar.a());
                            if (findViewByLevel != null) {
                                a2.removeView(findViewByLevel);
                                if (findViewByLevel instanceof PopLayerBaseView) {
                                    ((PopLayerBaseView) findViewByLevel).onViewUIRemoved();
                                }
                            }
                            if (g2.g() == null) {
                                g2.a(findViewByLevel);
                            }
                        } else if (eVar.d()) {
                            View findViewByLevel2 = a2.findViewByLevel(eVar.a());
                            if (findViewByLevel2 != null) {
                                a2.removeView(findViewByLevel2);
                                if (findViewByLevel2 instanceof PopLayerBaseView) {
                                    ((PopLayerBaseView) findViewByLevel2).onViewUIRemoved();
                                }
                                com.alibaba.poplayer.utils.c.a("%s. remove Layer {level:%s}.", toString(), Integer.valueOf(eVar.a()));
                            }
                            if (g2 != null && (g = g2.g()) != null) {
                                if (g.getParent() != null) {
                                    ((ViewGroup) g.getParent()).removeView(g);
                                }
                                boolean z = g instanceof PopLayerBaseView;
                                if (z ? ((PopLayerBaseView) g).shouldViewUIAdd() : true) {
                                    a2.addViewByLevel(g2, g, eVar.a());
                                    if (z) {
                                        ((PopLayerBaseView) g).onViewUIAdded();
                                    }
                                    bzw.a(g2, PopRequest.Status.SHOWING);
                                    com.alibaba.poplayer.utils.c.a("%s. add Layer {level:%s}.", toString(), Integer.valueOf(eVar.a()));
                                } else {
                                    com.alibaba.poplayer.utils.c.a("%s. add Layer cancel {level:%s}.shouldViewUIAdd=false", toString(), Integer.valueOf(eVar.a()));
                                }
                            }
                            eVar.e();
                        }
                    }
                }
            });
        }
    }

    private e a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("5f46b8ec", new Object[]{this, new Integer(i)});
        }
        for (e eVar : this.f3191a) {
            if (eVar.a() == i) {
                return eVar;
            }
        }
        e eVar2 = new e(i);
        this.f3191a.add(eVar2);
        ArrayList arrayList = new ArrayList(this.f3191a);
        Collections.sort(arrayList, $$Lambda$a$pf6qrWZ0jPwAud4VZQ7L4FsOXnM.INSTANCE);
        this.f3191a.clear();
        this.f3191a.addAll(arrayList);
        return eVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int a(e eVar, e eVar2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("dd04f2fb", new Object[]{eVar, eVar2})).intValue() : eVar.a() - eVar2.a();
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        for (e eVar : this.f3191a) {
            if (eVar.h()) {
                return true;
            }
        }
        return false;
    }
}
