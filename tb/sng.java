package tb;

import android.support.v7.widget.RecyclerView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.common.view.a;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.core.exception.FluidException;
import com.taobao.android.fluid.core.f;
import com.taobao.android.fluid.framework.list.view.LockableRecycerView;
import com.taobao.uikit.extend.component.refresh.TBLoadMoreFooter;
import com.taobao.uikit.extend.component.refresh.TBRefreshHeader;
import com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout;

/* loaded from: classes5.dex */
public class sng implements mrf, snh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final FluidContext f33727a;
    private final f<snj> b = new f<>();
    private final f<RecyclerView.OnScrollListener> c = new f<>();
    private final f<TBSwipeRefreshLayout.OnPushLoadMoreListener> d = new f<>();
    private final f<TBSwipeRefreshLayout.OnPullRefreshListener> e = new f<>();
    private final f<LockableRecycerView.a> f = new f<>();
    private final f<a.InterfaceC0490a> g = new f<>();

    static {
        kge.a(2086618201);
        kge.a(1834719639);
        kge.a(-440856940);
    }

    public sng(FluidContext fluidContext) {
        this.f33727a = fluidContext;
    }

    @Override // tb.mrf
    public void a(snj snjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff118709", new Object[]{this, snjVar});
        } else if (snjVar == null) {
        } else {
            this.b.a(snjVar);
        }
    }

    public void b(snj snjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed948d8a", new Object[]{this, snjVar});
        } else if (snjVar == null) {
        } else {
            this.b.c(snjVar);
        }
    }

    public void a(TBSwipeRefreshLayout.OnPushLoadMoreListener onPushLoadMoreListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20928741", new Object[]{this, onPushLoadMoreListener});
        } else if (onPushLoadMoreListener == null) {
        } else {
            this.d.a(onPushLoadMoreListener);
        }
    }

    public void b(TBSwipeRefreshLayout.OnPushLoadMoreListener onPushLoadMoreListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fb916a0", new Object[]{this, onPushLoadMoreListener});
        } else if (onPushLoadMoreListener == null) {
        } else {
            this.d.c(onPushLoadMoreListener);
        }
    }

    public void a(TBSwipeRefreshLayout.OnPullRefreshListener onPullRefreshListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c68eb31c", new Object[]{this, onPullRefreshListener});
        } else if (onPullRefreshListener == null) {
        } else {
            this.e.a(onPullRefreshListener);
        }
    }

    public void b(TBSwipeRefreshLayout.OnPullRefreshListener onPullRefreshListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8cb93bdd", new Object[]{this, onPullRefreshListener});
        } else if (onPullRefreshListener == null) {
        } else {
            this.e.c(onPullRefreshListener);
        }
    }

    @Override // tb.mrf
    public void a(RecyclerView.OnScrollListener onScrollListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6b4c96", new Object[]{this, onScrollListener});
        } else if (onScrollListener == null) {
        } else {
            this.c.a(onScrollListener);
        }
    }

    public void b(RecyclerView.OnScrollListener onScrollListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1a9bc35", new Object[]{this, onScrollListener});
        } else if (onScrollListener == null) {
        } else {
            this.c.c(onScrollListener);
        }
    }

    @Override // tb.mrf
    public void addDragListener(LockableRecycerView.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cd8cbd", new Object[]{this, aVar});
        } else if (aVar == null) {
        } else {
            this.f.a(aVar);
        }
    }

    public void a(LockableRecycerView.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b86fd5", new Object[]{this, aVar});
        } else if (aVar == null) {
        } else {
            this.f.c(aVar);
        }
    }

    @Override // tb.snj
    public void a(psw pswVar, psw pswVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("182f6ea0", new Object[]{this, pswVar, pswVar2});
            return;
        }
        for (snj snjVar : this.b.a()) {
            try {
                snjVar.a(pswVar, pswVar2);
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f33727a, snjVar, "onBeforeActiveCardChanged", e);
            }
        }
    }

    @Override // tb.snj
    public void b(psw pswVar, psw pswVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24c86421", new Object[]{this, pswVar, pswVar2});
            return;
        }
        for (snj snjVar : this.b.a()) {
            try {
                snjVar.b(pswVar, pswVar2);
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f33727a, snjVar, "onActiveCardChanged", e);
            }
        }
    }

    @Override // com.taobao.android.fluid.common.view.a.InterfaceC0490a
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        for (a.InterfaceC0490a interfaceC0490a : this.g.a()) {
            try {
                interfaceC0490a.a(i);
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f33727a, interfaceC0490a, "onChanged", e);
            }
        }
    }

    @Override // com.taobao.android.fluid.common.view.a.InterfaceC0490a
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        for (a.InterfaceC0490a interfaceC0490a : this.g.a()) {
            try {
                interfaceC0490a.a(z);
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f33727a, interfaceC0490a, "onFastScrollChanged", e);
            }
        }
    }

    @Override // com.taobao.android.fluid.common.view.a.InterfaceC0490a
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        for (a.InterfaceC0490a interfaceC0490a : this.g.a()) {
            try {
                interfaceC0490a.a();
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f33727a, interfaceC0490a, "onFlingAtBorder", e);
            }
        }
    }

    @Override // com.taobao.android.fluid.framework.list.view.LockableRecycerView.a
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        for (LockableRecycerView.a aVar : this.f.a()) {
            try {
                aVar.b();
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f33727a, aVar, "onDragDown", e);
            }
        }
    }

    @Override // com.taobao.android.fluid.framework.list.view.LockableRecycerView.a
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        for (LockableRecycerView.a aVar : this.f.a()) {
            try {
                aVar.c();
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f33727a, aVar, "onDragUp", e);
            }
        }
    }

    @Override // com.taobao.android.fluid.framework.list.view.LockableRecycerView.c
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        for (LockableRecycerView.a aVar : this.f.a()) {
            if (aVar instanceof LockableRecycerView.c) {
                try {
                    ((LockableRecycerView.c) aVar).d();
                } catch (Exception e) {
                    FluidException.throwObserverCallbackException(this.f33727a, aVar, "onDragDownInLock", e);
                }
            }
        }
    }

    @Override // com.taobao.android.fluid.framework.list.view.LockableRecycerView.c
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        for (LockableRecycerView.a aVar : this.f.a()) {
            if (aVar instanceof LockableRecycerView.c) {
                try {
                    ((LockableRecycerView.c) aVar).e();
                } catch (Exception e) {
                    FluidException.throwObserverCallbackException(this.f33727a, aVar, "onDragUpInLock", e);
                }
            }
        }
    }

    @Override // com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout.OnPushLoadMoreListener
    public void onLoadMore() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4a87be1", new Object[]{this});
            return;
        }
        for (TBSwipeRefreshLayout.OnPushLoadMoreListener onPushLoadMoreListener : this.d.a()) {
            try {
                onPushLoadMoreListener.onLoadMore();
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f33727a, onPushLoadMoreListener, "onLoadMore", e);
            }
        }
    }

    @Override // com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout.OnPushLoadMoreListener
    public void onPushDistance(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b554b6e", new Object[]{this, new Integer(i)});
            return;
        }
        for (TBSwipeRefreshLayout.OnPushLoadMoreListener onPushLoadMoreListener : this.d.a()) {
            try {
                onPushLoadMoreListener.onPushDistance(i);
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f33727a, onPushLoadMoreListener, "onPushDistance", e);
            }
        }
    }

    @Override // com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout.OnPushLoadMoreListener
    public void onLoadMoreStateChanged(TBLoadMoreFooter.LoadMoreState loadMoreState, TBLoadMoreFooter.LoadMoreState loadMoreState2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78cecfe0", new Object[]{this, loadMoreState, loadMoreState2});
            return;
        }
        for (TBSwipeRefreshLayout.OnPushLoadMoreListener onPushLoadMoreListener : this.d.a()) {
            try {
                onPushLoadMoreListener.onLoadMoreStateChanged(loadMoreState, loadMoreState2);
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f33727a, onPushLoadMoreListener, "onLoadMoreStateChanged", e);
            }
        }
    }

    @Override // com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout.OnPullRefreshListener
    public void onRefresh() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9cbba83", new Object[]{this});
            return;
        }
        for (TBSwipeRefreshLayout.OnPullRefreshListener onPullRefreshListener : this.e.a()) {
            try {
                onPullRefreshListener.onRefresh();
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f33727a, onPullRefreshListener, "onRefresh", e);
            }
        }
    }

    @Override // com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout.OnPullRefreshListener
    public void onPullDistance(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2dcc8a23", new Object[]{this, new Integer(i)});
            return;
        }
        for (TBSwipeRefreshLayout.OnPullRefreshListener onPullRefreshListener : this.e.a()) {
            try {
                onPullRefreshListener.onPullDistance(i);
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f33727a, onPullRefreshListener, "onPullDistance", e);
            }
        }
    }

    @Override // com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout.OnPullRefreshListener
    public void onRefreshStateChanged(TBRefreshHeader.RefreshState refreshState, TBRefreshHeader.RefreshState refreshState2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f1ba5ae", new Object[]{this, refreshState, refreshState2});
            return;
        }
        for (TBSwipeRefreshLayout.OnPullRefreshListener onPullRefreshListener : this.e.a()) {
            try {
                onPullRefreshListener.onRefreshStateChanged(refreshState, refreshState2);
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f33727a, onPullRefreshListener, "onRefreshStateChanged", e);
            }
        }
    }

    @Override // tb.snh
    public void a(RecyclerView recyclerView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85acc02d", new Object[]{this, recyclerView, new Integer(i)});
            return;
        }
        for (RecyclerView.OnScrollListener onScrollListener : this.c.a()) {
            try {
                onScrollListener.onScrollStateChanged(recyclerView, i);
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f33727a, onScrollListener, "onScrollStateChanged", e);
            }
        }
    }

    @Override // tb.snh
    public void a(RecyclerView recyclerView, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2febb876", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
            return;
        }
        for (RecyclerView.OnScrollListener onScrollListener : this.c.a()) {
            try {
                onScrollListener.onScrolled(recyclerView, i, i2);
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f33727a, onScrollListener, "onScrolled", e);
            }
        }
    }
}
