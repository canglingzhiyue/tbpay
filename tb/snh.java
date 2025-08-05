package tb;

import android.support.v7.widget.RecyclerView;
import com.taobao.android.fluid.common.view.a;
import com.taobao.android.fluid.framework.list.view.LockableRecycerView;
import com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout;

/* loaded from: classes5.dex */
public interface snh extends a.InterfaceC0490a, LockableRecycerView.c, TBSwipeRefreshLayout.OnPullRefreshListener, TBSwipeRefreshLayout.OnPushLoadMoreListener, snj {
    void a(RecyclerView recyclerView, int i);

    void a(RecyclerView recyclerView, int i, int i2);
}
