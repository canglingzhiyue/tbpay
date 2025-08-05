package com.taobao.android.dinamicx.widget.recycler;

import android.support.v4.util.LongSparseArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.widget.DXRecyclerLayout;
import com.taobao.android.dinamicx.widget.recycler.event.DXRecyclerLayoutOnPullDistanceEvent;
import com.taobao.android.dinamicx.widget.recycler.refresh.TBSwipeRefreshLayout;
import tb.fqp;
import tb.gfn;
import tb.kge;

/* loaded from: classes5.dex */
public class g implements TBSwipeRefreshLayout.b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXRECYCLERLAYOUT_ONPULLTOREFRESH = 3436304507723682587L;

    /* renamed from: a  reason: collision with root package name */
    public DXEvent f12138a = new DXEvent(DXRECYCLERLAYOUT_ONPULLTOREFRESH);
    private DXRecyclerLayout b;
    private TBSwipeRefreshLayout.b c;
    private boolean d;

    static {
        kge.a(1310210290);
        kge.a(-292350484);
    }

    public g(DXRecyclerLayout dXRecyclerLayout) {
        this.b = dXRecyclerLayout;
        b();
    }

    public void a(TBSwipeRefreshLayout.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85ed0414", new Object[]{this, bVar});
        } else {
            this.c = bVar;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.recycler.refresh.TBSwipeRefreshLayout.b
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        DXRecyclerLayout dXRecyclerLayout = this.b;
        if (dXRecyclerLayout != null) {
            dXRecyclerLayout.postEvent(this.f12138a);
        }
        TBSwipeRefreshLayout.b bVar = this.c;
        if (bVar == null) {
            return;
        }
        bVar.a();
    }

    @Override // com.taobao.android.dinamicx.widget.recycler.refresh.TBSwipeRefreshLayout.b
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        if (this.b != null && this.d) {
            this.b.postEvent(new DXRecyclerLayoutOnPullDistanceEvent(i));
        }
        TBSwipeRefreshLayout.b bVar = this.c;
        if (bVar == null) {
            return;
        }
        bVar.a(i);
    }

    public void a(DXRecyclerLayout dXRecyclerLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b28c884", new Object[]{this, dXRecyclerLayout});
        } else {
            this.b = dXRecyclerLayout;
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        DXRecyclerLayout dXRecyclerLayout = this.b;
        if (dXRecyclerLayout == null) {
            this.d = false;
        } else if (dXRecyclerLayout.isV4Node()) {
            com.taobao.android.dinamicx.model.c<gfn> a2 = this.b.getDxv4Properties().a();
            if (a2 == null || a2.get(DXRecyclerLayoutOnPullDistanceEvent.DXRECYCLERLAYOUT_ONPULLDISTANCE_ANDROID) == null) {
                z = false;
            }
            this.d = z;
        } else {
            LongSparseArray<fqp> eventHandlersExprNode = this.b.getEventHandlersExprNode();
            if (eventHandlersExprNode == null || eventHandlersExprNode.get(DXRecyclerLayoutOnPullDistanceEvent.DXRECYCLERLAYOUT_ONPULLDISTANCE_ANDROID) == null) {
                z = false;
            }
            this.d = z;
        }
    }
}
