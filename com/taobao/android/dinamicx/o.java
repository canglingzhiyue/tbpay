package com.taobao.android.dinamicx;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.recycler.WaterfallLayout;
import com.taobao.android.dinamicx.widget.recycler.loadmore.DXAbsOnLoadMoreView;
import com.taobao.android.dinamicx.widget.recycler.refresh.TBAbsRefreshHeader;
import com.taobao.android.dinamicx.widget.recycler.refresh.TBSwipeRefreshLayout;
import com.taobao.android.dinamicx.widget.recycler.view.DXRecyclerView;
import tb.kge;

/* loaded from: classes5.dex */
public class o {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1419186771);
    }

    public TBSwipeRefreshLayout.b getExtraPullRefreshListener(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBSwipeRefreshLayout.b) ipChange.ipc$dispatch("f35a0121", new Object[]{this, str});
        }
        return null;
    }

    public RecyclerView.OnScrollListener getExtraScrollerListener(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView.OnScrollListener) ipChange.ipc$dispatch("61f21bc7", new Object[]{this, str});
        }
        return null;
    }

    public DXAbsOnLoadMoreView getOnLoadMoreView(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXAbsOnLoadMoreView) ipChange.ipc$dispatch("83838a3e", new Object[]{this, str});
        }
        return null;
    }

    public DXAbsOnLoadMoreView getOnRefreshLoadMoreView(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXAbsOnLoadMoreView) ipChange.ipc$dispatch("ce97201f", new Object[]{this, context, str});
        }
        return null;
    }

    public TBAbsRefreshHeader getRefreshHeaderView(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBAbsRefreshHeader) ipChange.ipc$dispatch("1ba7f00d", new Object[]{this, str});
        }
        return null;
    }

    public com.taobao.android.dinamicx.widget.recycler.i getWaterFallLayoutCustomLayoutManager(int i, int i2, WaterfallLayout waterfallLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.dinamicx.widget.recycler.i) ipChange.ipc$dispatch("ecd3684a", new Object[]{this, new Integer(i), new Integer(i2), waterfallLayout});
        }
        return null;
    }

    public DXRecyclerView getWaterFallLayoutCustomRecyclerView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRecyclerView) ipChange.ipc$dispatch("9e4bff2d", new Object[]{this, context});
        }
        return null;
    }
}
