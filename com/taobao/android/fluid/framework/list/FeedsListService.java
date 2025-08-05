package com.taobao.android.fluid.framework.list;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.list.view.LockableRecycerView;
import com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout;
import tb.kge;
import tb.psw;
import tb.sng;
import tb.snj;
import tb.snn;
import tb.sno;
import tb.sor;

/* loaded from: classes5.dex */
public class FeedsListService implements IFeedsListService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String UT_PAGE_NAME = "Page_videointeract";
    private sng mFeedsListListenerManager;
    private final FluidContext mFluidContext;
    private snn mListViewManager;

    static {
        kge.a(-1714831542);
        kge.a(-311646973);
    }

    @Override // com.taobao.android.fluid.core.FluidService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
        }
    }

    public FeedsListService(FluidContext fluidContext) {
        this.mFluidContext = fluidContext;
    }

    @Override // tb.mrf
    public void a(snj snjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff118709", new Object[]{this, snjVar});
        } else {
            this.mFeedsListListenerManager.a(snjVar);
        }
    }

    public void addLoadMoreListener(TBSwipeRefreshLayout.OnPushLoadMoreListener onPushLoadMoreListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0a47452", new Object[]{this, onPushLoadMoreListener});
        } else {
            this.mFeedsListListenerManager.a(onPushLoadMoreListener);
        }
    }

    public void addRefreshListener(TBSwipeRefreshLayout.OnPullRefreshListener onPullRefreshListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5df2649", new Object[]{this, onPullRefreshListener});
        } else {
            this.mFeedsListListenerManager.a(onPullRefreshListener);
        }
    }

    @Override // tb.mrf
    public void a(RecyclerView.OnScrollListener onScrollListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6b4c96", new Object[]{this, onScrollListener});
        } else {
            this.mFeedsListListenerManager.a(onScrollListener);
        }
    }

    public void removeCardChangeListener(snj snjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("961d1f80", new Object[]{this, snjVar});
        } else {
            this.mFeedsListListenerManager.b(snjVar);
        }
    }

    public void removeLoadMoreListener(TBSwipeRefreshLayout.OnPushLoadMoreListener onPushLoadMoreListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ec29c8f", new Object[]{this, onPushLoadMoreListener});
        } else {
            this.mFeedsListListenerManager.b(onPushLoadMoreListener);
        }
    }

    public void removeRefreshListener(TBSwipeRefreshLayout.OnPullRefreshListener onPullRefreshListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4f439c6", new Object[]{this, onPullRefreshListener});
        } else {
            this.mFeedsListListenerManager.b(onPullRefreshListener);
        }
    }

    public void removeScrollListener(RecyclerView.OnScrollListener onScrollListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69809732", new Object[]{this, onScrollListener});
        } else {
            this.mFeedsListListenerManager.b(onScrollListener);
        }
    }

    @Override // tb.mrf
    public void addDragListener(LockableRecycerView.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cd8cbd", new Object[]{this, aVar});
        } else {
            this.mFeedsListListenerManager.addDragListener(aVar);
        }
    }

    public void removeDragListener(LockableRecycerView.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("668ea520", new Object[]{this, aVar});
        } else {
            this.mFeedsListListenerManager.a(aVar);
        }
    }

    public void addOnScrollListener(RecyclerView.OnScrollListener onScrollListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db878fd6", new Object[]{this, onScrollListener});
        } else {
            this.mListViewManager.a(onScrollListener);
        }
    }

    @Override // tb.snm
    public psw getActiveCard() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (psw) ipChange.ipc$dispatch("d906fd1f", new Object[]{this}) : this.mListViewManager.a();
    }

    @Override // tb.snm
    public int getActivePosition() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("13183d3f", new Object[]{this})).intValue() : this.mListViewManager.b();
    }

    @Override // tb.snm
    public View getContentView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("ce219891", new Object[]{this}) : this.mListViewManager.c();
    }

    @Override // tb.snm
    public LinearLayoutManager getLayoutManager() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LinearLayoutManager) ipChange.ipc$dispatch("6ee22a44", new Object[]{this}) : this.mListViewManager.d();
    }

    @Override // tb.snm
    public sno getMediaCardListAdapter() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (sno) ipChange.ipc$dispatch("79d5e3b8", new Object[]{this}) : this.mListViewManager.e();
    }

    @Override // tb.snm
    public LockableRecycerView getRecyclerView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LockableRecycerView) ipChange.ipc$dispatch("f0d4393f", new Object[]{this}) : this.mListViewManager.f();
    }

    @Override // tb.snm
    public boolean isFastScroll() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6bd0b61e", new Object[]{this})).booleanValue() : this.mListViewManager.g();
    }

    @Override // tb.snm
    public boolean isPublicAutoCut() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c5d252eb", new Object[]{this})).booleanValue() : this.mListViewManager.h();
    }

    @Override // tb.snm
    public void setPublicAutoCut(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc520e05", new Object[]{this, new Boolean(z)});
        } else {
            this.mListViewManager.a(z);
        }
    }

    @Override // tb.snm
    public boolean isPublicTheLastOne() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("532e225d", new Object[]{this})).booleanValue() : this.mListViewManager.i();
    }

    @Override // tb.snm
    public void notifyItemChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d809a144", new Object[]{this, new Integer(i)});
        } else {
            this.mListViewManager.a(i);
        }
    }

    @Override // tb.snm
    public void preloadNext(psw pswVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9610ff75", new Object[]{this, pswVar, new Boolean(z)});
        } else {
            this.mListViewManager.a(pswVar, z);
        }
    }

    @Override // tb.snm
    public void publicNextVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7db89e6", new Object[]{this});
        } else {
            this.mListViewManager.j();
        }
    }

    @Override // tb.snm
    public void publicPreVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dda84928", new Object[]{this});
        } else {
            this.mListViewManager.k();
        }
    }

    @Override // tb.snm
    public void smoothScrollToPosition(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e65f897d", new Object[]{this, new Integer(i)});
        } else {
            this.mListViewManager.b(i);
        }
    }

    @Override // tb.snm
    public void renderList(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5d3e24d", new Object[]{this, context});
        } else {
            this.mListViewManager.a(context);
        }
    }

    @Override // com.taobao.android.fluid.framework.list.IFeedsListService
    public void renderCacheVideo(sor sorVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46bd3c70", new Object[]{this, sorVar});
        } else {
            this.mListViewManager.a(sorVar);
        }
    }

    @Override // com.taobao.android.fluid.framework.list.IFeedsListService
    public sor getPreloadVideoData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (sor) ipChange.ipc$dispatch("1fb0e7d7", new Object[]{this}) : this.mListViewManager.l();
    }

    @Override // tb.snm
    public void scrollToItem(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2da01ac", new Object[]{this, str});
        } else {
            this.mListViewManager.a(str);
        }
    }

    @Override // tb.snm
    public void setAutoLock(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4b3d6b1", new Object[]{this, new Boolean(z)});
        } else {
            this.mListViewManager.c(z);
        }
    }

    @Override // tb.snm
    public void setScrollLockedExternal(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6c08109", new Object[]{this, new Boolean(z)});
        } else {
            this.mListViewManager.d(z);
        }
    }

    @Override // com.taobao.android.fluid.core.FluidService
    public void onCreateService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("486f8601", new Object[]{this});
            return;
        }
        this.mFeedsListListenerManager = new sng(this.mFluidContext);
        this.mListViewManager = new snn(this.mFluidContext, this.mFeedsListListenerManager);
    }
}
