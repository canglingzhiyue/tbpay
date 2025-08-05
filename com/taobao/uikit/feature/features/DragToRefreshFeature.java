package com.taobao.uikit.feature.features;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.uikit.feature.callback.ScrollCallback;
import com.taobao.uikit.feature.callback.TouchEventCallback;
import com.taobao.uikit.feature.features.internal.pullrefresh.IViewEdgeJudge;
import com.taobao.uikit.feature.features.internal.pullrefresh.RefreshController;
import com.taobao.uikit.feature.view.TRecyclerView;
import tb.kge;

@Deprecated
/* loaded from: classes9.dex */
public class DragToRefreshFeature extends AbsFeature<RecyclerView> implements ScrollCallback, TouchEventCallback, IViewEdgeJudge {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private RecyclerView.OnScrollListener mAutoLoadScrollListener;
    private boolean mEnableNegative;
    private boolean mEnablePositive;
    private int[] mIntArray;
    private int[] mIntArray2;
    private boolean mIsAuto = false;
    private int mOrientation;
    private RefreshController mRefreshController;
    private Scroller mScroller;

    /* loaded from: classes9.dex */
    public interface OnDragToRefreshListener {
        void onDragNegative();

        void onDragPositive();
    }

    static {
        kge.a(-1107903229);
        kge.a(1440744945);
        kge.a(-1184105602);
        kge.a(1628629155);
    }

    public static /* synthetic */ Object ipc$super(DragToRefreshFeature dragToRefreshFeature, String str, Object... objArr) {
        if (str.hashCode() == 1336372353) {
            super.setHost((DragToRefreshFeature) ((View) objArr[0]));
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.uikit.feature.callback.ScrollCallback
    public void afterComputeScroll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("559935ef", new Object[]{this});
        }
    }

    @Override // com.taobao.uikit.feature.callback.TouchEventCallback
    public void afterDispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c82badcd", new Object[]{this, motionEvent});
        }
    }

    @Override // com.taobao.uikit.feature.callback.ScrollCallback
    public void afterOnScrollChanged(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41622bd3", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        }
    }

    @Override // com.taobao.uikit.feature.callback.TouchEventCallback
    public void afterOnTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35369b32", new Object[]{this, motionEvent});
        }
    }

    @Override // com.taobao.uikit.feature.callback.TouchEventCallback
    public void beforeDispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f585f570", new Object[]{this, motionEvent});
        }
    }

    @Override // com.taobao.uikit.feature.callback.ScrollCallback
    public void beforeOnScrollChanged(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b65ccad0", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        }
    }

    @Override // com.taobao.uikit.feature.features.AbsFeature
    public void constructor(Context context, AttributeSet attributeSet, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8928939c", new Object[]{this, context, attributeSet, new Integer(i)});
        }
    }

    public static /* synthetic */ RefreshController access$000(DragToRefreshFeature dragToRefreshFeature) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RefreshController) ipChange.ipc$dispatch("1ffa9c5d", new Object[]{dragToRefreshFeature}) : dragToRefreshFeature.mRefreshController;
    }

    public static /* synthetic */ int access$100(DragToRefreshFeature dragToRefreshFeature, RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c06eeda5", new Object[]{dragToRefreshFeature, recyclerView})).intValue() : dragToRefreshFeature.getSpanCount(recyclerView);
    }

    public static /* synthetic */ boolean access$200(DragToRefreshFeature dragToRefreshFeature, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3e4f46e2", new Object[]{dragToRefreshFeature, new Integer(i)})).booleanValue() : dragToRefreshFeature.hasArrivedBottomEdgeOffset(i);
    }

    public DragToRefreshFeature(Context context, int i) {
        this.mOrientation = 1;
        this.mScroller = new Scroller(context, new DecelerateInterpolator());
        this.mRefreshController = new RefreshController(this, context, this.mScroller, i);
        this.mOrientation = i;
    }

    public void setIsPositiveRefreshing() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("827c62d3", new Object[]{this});
            return;
        }
        RefreshController refreshController = this.mRefreshController;
        if (refreshController == null) {
            return;
        }
        refreshController.setIsDownRefreshing();
    }

    public void setIsNegativeRefreshing() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae8e3c0f", new Object[]{this});
            return;
        }
        RefreshController refreshController = this.mRefreshController;
        if (refreshController == null) {
            return;
        }
        refreshController.setIsUpRefreshing();
    }

    @Override // com.taobao.uikit.feature.features.AbsFeature
    public void setHost(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbbe40df", new Object[]{this, recyclerView});
            return;
        }
        super.setHost((DragToRefreshFeature) recyclerView);
        this.mRefreshController.addFooterView();
        this.mRefreshController.addHeaderView();
        recyclerView.setOverScrollMode(2);
        if (!this.mIsAuto) {
            return;
        }
        addAutoLoadScrollListener(recyclerView);
    }

    private void addAutoLoadScrollListener(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a02a76c", new Object[]{this, recyclerView});
        } else if (this.mAutoLoadScrollListener != null) {
        } else {
            this.mAutoLoadScrollListener = new RecyclerView.OnScrollListener() { // from class: com.taobao.uikit.feature.features.DragToRefreshFeature.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.support.v7.widget.RecyclerView.OnScrollListener
                public void onScrolled(RecyclerView recyclerView2, int i, int i2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3018fdc0", new Object[]{this, recyclerView2, new Integer(i), new Integer(i2)});
                    } else if ((i == 0 && i2 == 0) || !DragToRefreshFeature.access$000(DragToRefreshFeature.this).isScrollStop() || DragToRefreshFeature.access$000(DragToRefreshFeature.this).getState() != 3) {
                    } else {
                        DragToRefreshFeature dragToRefreshFeature = DragToRefreshFeature.this;
                        if (!DragToRefreshFeature.access$200(dragToRefreshFeature, DragToRefreshFeature.access$100(dragToRefreshFeature, recyclerView2))) {
                            return;
                        }
                        DragToRefreshFeature.access$000(DragToRefreshFeature.this).autoLoadingData();
                    }
                }
            };
            recyclerView.setOnScrollListener(this.mAutoLoadScrollListener);
        }
    }

    private int getSpanCount(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f95dc157", new Object[]{this, recyclerView})).intValue();
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            return ((GridLayoutManager) layoutManager).getSpanCount();
        }
        if (!(layoutManager instanceof StaggeredGridLayoutManager)) {
            return 1;
        }
        return ((StaggeredGridLayoutManager) layoutManager).getSpanCount();
    }

    @Override // com.taobao.uikit.feature.callback.TouchEventCallback
    public void beforeOnTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("673c1915", new Object[]{this, motionEvent});
            return;
        }
        RefreshController refreshController = this.mRefreshController;
        if (refreshController == null) {
            return;
        }
        refreshController.onTouchEvent(motionEvent);
    }

    private void ensureIntArray(StaggeredGridLayoutManager staggeredGridLayoutManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc973d90", new Object[]{this, staggeredGridLayoutManager});
            return;
        }
        int[] iArr = this.mIntArray;
        if (iArr == null) {
            this.mIntArray = new int[staggeredGridLayoutManager.getSpanCount()];
        } else if (iArr.length < staggeredGridLayoutManager.getSpanCount()) {
            this.mIntArray = new int[staggeredGridLayoutManager.getSpanCount()];
        }
        int[] iArr2 = this.mIntArray2;
        if (iArr2 == null) {
            this.mIntArray2 = new int[staggeredGridLayoutManager.getSpanCount()];
        } else if (iArr2.length >= staggeredGridLayoutManager.getSpanCount()) {
        } else {
            this.mIntArray2 = new int[staggeredGridLayoutManager.getSpanCount()];
        }
    }

    @Override // com.taobao.uikit.feature.features.internal.pullrefresh.IViewEdgeJudge
    public boolean hasArrivedTopEdge() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a3cf15ca", new Object[]{this})).booleanValue();
        }
        RecyclerView.LayoutManager layoutManager = ((RecyclerView) this.mHost).getLayoutManager();
        int childAdapterPosition = ((RecyclerView) this.mHost).getChildAdapterPosition(((RecyclerView) this.mHost).getChildAt(0));
        if (childAdapterPosition == 0) {
            if (layoutManager instanceof LinearLayoutManager) {
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                int findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
                return -1 != findFirstVisibleItemPosition && findFirstVisibleItemPosition >= linearLayoutManager.findFirstCompletelyVisibleItemPosition();
            } else if (layoutManager instanceof StaggeredGridLayoutManager) {
                StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
                ensureIntArray(staggeredGridLayoutManager);
                staggeredGridLayoutManager.findFirstVisibleItemPositions(this.mIntArray);
                staggeredGridLayoutManager.findFirstCompletelyVisibleItemPositions(this.mIntArray2);
                int spanCount = staggeredGridLayoutManager.getSpanCount();
                for (int i = 0; i < spanCount; i++) {
                    int[] iArr = this.mIntArray;
                    if (-1 != iArr[i] && iArr[i] >= this.mIntArray2[i]) {
                        return true;
                    }
                }
            }
        } else if (-1 == childAdapterPosition && (((TRecyclerView) this.mHost).getTotalCount() - (this.mEnablePositive ? 1 : 0)) - (this.mEnableNegative ? 1 : 0) == 0) {
            return true;
        }
        return false;
    }

    @Override // com.taobao.uikit.feature.features.internal.pullrefresh.IViewEdgeJudge
    public boolean hasArrivedBottomEdge() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c6cc9e66", new Object[]{this})).booleanValue() : hasArrivedBottomEdgeOffset(0);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [int, boolean] */
    private boolean hasArrivedBottomEdgeOffset(int i) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1510d052", new Object[]{this, new Integer(i)})).booleanValue();
        }
        RecyclerView.LayoutManager layoutManager = ((RecyclerView) this.mHost).getLayoutManager();
        ?? r1 = this.mEnableNegative;
        if (layoutManager instanceof LinearLayoutManager) {
            if ((((TRecyclerView) this.mHost).getTotalCount() - 1) - r1 <= ((LinearLayoutManager) layoutManager).findLastVisibleItemPosition() + i) {
                z = true;
            }
            z = false;
        } else {
            if (layoutManager instanceof StaggeredGridLayoutManager) {
                StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
                ensureIntArray(staggeredGridLayoutManager);
                staggeredGridLayoutManager.findLastVisibleItemPositions(this.mIntArray);
                int spanCount = staggeredGridLayoutManager.getSpanCount();
                boolean z2 = false;
                for (int i2 = 0; i2 < spanCount; i2++) {
                    int i3 = this.mIntArray[i2];
                    if (-1 != i3 && (((TRecyclerView) this.mHost).getTotalCount() - 1) - (r1 == true ? 1 : 0) <= i3 + i) {
                        z2 = true;
                    }
                }
                z = z2;
            }
            z = false;
        }
        return z && !hasArrivedTopEdge();
    }

    @Override // com.taobao.uikit.feature.features.internal.pullrefresh.IViewEdgeJudge
    public void setHeadView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1754f9e4", new Object[]{this, view});
        } else if (this.mHost == 0) {
        } else {
            ((TRecyclerView) this.mHost).addHeaderView(view);
        }
    }

    @Override // com.taobao.uikit.feature.features.internal.pullrefresh.IViewEdgeJudge
    public void setFooterView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44903dc9", new Object[]{this, view});
        } else if (this.mHost == 0) {
        } else {
            ((TRecyclerView) this.mHost).addFooterView(view);
        }
    }

    @Override // com.taobao.uikit.feature.features.internal.pullrefresh.IViewEdgeJudge
    public void removeHeaderView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73ddd9b5", new Object[]{this, view});
        } else if (this.mHost == 0) {
        } else {
            ((TRecyclerView) this.mHost).removeHeaderView(view);
        }
    }

    @Override // com.taobao.uikit.feature.features.internal.pullrefresh.IViewEdgeJudge
    public void removeFooterView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9968de7", new Object[]{this, view});
        } else if (this.mHost == 0) {
        } else {
            ((TRecyclerView) this.mHost).removeFooterView(view);
        }
    }

    @Override // com.taobao.uikit.feature.features.internal.pullrefresh.IViewEdgeJudge
    public void keepTop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad48f017", new Object[]{this});
        } else {
            ((RecyclerView) this.mHost).scrollToPosition(0);
        }
    }

    @Override // com.taobao.uikit.feature.features.internal.pullrefresh.IViewEdgeJudge
    public void keepBottom() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0ff3697", new Object[]{this});
            return;
        }
        RecyclerView.Adapter adapter = ((RecyclerView) this.mHost).getAdapter();
        if (adapter != null) {
            ((RecyclerView) this.mHost).scrollToPosition(adapter.getItemCount());
        } else {
            ((RecyclerView) this.mHost).scrollToPosition(0);
        }
    }

    @Override // com.taobao.uikit.feature.features.internal.pullrefresh.IViewEdgeJudge
    public void trigger() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7573e3f", new Object[]{this});
        } else {
            ((RecyclerView) this.mHost).computeScroll();
        }
    }

    public void setRefreshViewColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2bd8ad7", new Object[]{this, new Integer(i)});
            return;
        }
        RefreshController refreshController = this.mRefreshController;
        if (refreshController == null) {
            return;
        }
        refreshController.setRefreshViewColor(i);
    }

    public void setUpRefreshBackgroundColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ead3c845", new Object[]{this, new Integer(i)});
            return;
        }
        RefreshController refreshController = this.mRefreshController;
        if (refreshController == null) {
            return;
        }
        refreshController.setUpRefreshBackgroundColor(i);
    }

    public void setDownRefreshBackgroundColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73ff6e5e", new Object[]{this, new Integer(i)});
            return;
        }
        RefreshController refreshController = this.mRefreshController;
        if (refreshController == null) {
            return;
        }
        refreshController.setDownRefreshBackgroundColor(i);
    }

    public void enablePositiveDrag(boolean z, int i, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3cb9ac", new Object[]{this, new Boolean(z), new Integer(i), view});
            return;
        }
        RefreshController refreshController = this.mRefreshController;
        if (refreshController == null) {
            return;
        }
        this.mEnablePositive = z;
        refreshController.enablePullDownRefresh(z, i, view);
    }

    public void enablePositiveDrag(boolean z, View view, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("664e4ff", new Object[]{this, new Boolean(z), view, new Boolean(z2)});
            return;
        }
        RefreshController refreshController = this.mRefreshController;
        if (refreshController == null) {
            return;
        }
        this.mEnablePositive = z;
        refreshController.enablePullDownRefresh(z, R.string.uik_refresh_arrow, view, z2);
    }

    public void enablePositiveDrag(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aebd13d", new Object[]{this, new Boolean(z)});
        } else {
            enablePositiveDrag(z, R.string.uik_refresh_arrow, (View) null);
        }
    }

    public void enableNegativeDrag(boolean z, int i, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f4dc0f0", new Object[]{this, new Boolean(z), new Integer(i), view});
            return;
        }
        RefreshController refreshController = this.mRefreshController;
        if (refreshController == null) {
            return;
        }
        this.mEnableNegative = z;
        refreshController.enablePullUpRefresh(z, i, view);
    }

    public void enableNegativeDrag(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4ae2281", new Object[]{this, new Boolean(z)});
        } else {
            enableNegativeDrag(z, R.string.uik_refresh_arrow, null);
        }
    }

    public void isHeadViewHeightContainImage(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64f5a750", new Object[]{this, new Boolean(z)});
            return;
        }
        RefreshController refreshController = this.mRefreshController;
        if (refreshController == null) {
            return;
        }
        refreshController.isHeadViewHeightContainImage(z);
    }

    public void setPositiveDragTips(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd286531", new Object[]{this, strArr});
            return;
        }
        RefreshController refreshController = this.mRefreshController;
        if (refreshController == null) {
            return;
        }
        refreshController.setDownRefreshTips(strArr);
    }

    public void setNegativeTips(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4e51dc9", new Object[]{this, strArr});
            return;
        }
        RefreshController refreshController = this.mRefreshController;
        if (refreshController == null) {
            return;
        }
        refreshController.setUpRefreshTips(strArr);
    }

    public void setOnDragToRefreshListener(OnDragToRefreshListener onDragToRefreshListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4b41bb5", new Object[]{this, onDragToRefreshListener});
            return;
        }
        RefreshController refreshController = this.mRefreshController;
        if (refreshController == null) {
            return;
        }
        refreshController.setOnRefreshListener(onDragToRefreshListener);
    }

    public void onDragRefreshComplete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3e38d08", new Object[]{this});
            return;
        }
        RefreshController refreshController = this.mRefreshController;
        if (refreshController == null) {
            return;
        }
        refreshController.onRefreshComplete();
        ((RecyclerView) this.mHost).invalidate();
    }

    public int getPositiveDragDistance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3c8cbed2", new Object[]{this})).intValue();
        }
        RefreshController refreshController = this.mRefreshController;
        if (refreshController == null) {
            return -1;
        }
        return refreshController.getPullDownDistance();
    }

    public void setNegativeDragAuto(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0558a93", new Object[]{this, new Boolean(z)});
            return;
        }
        this.mRefreshController.setPullUpRefreshAuto(z);
        this.mIsAuto = z;
        if (getHost() == null) {
            return;
        }
        if (z) {
            addAutoLoadScrollListener(getHost());
        } else if (this.mAutoLoadScrollListener == null) {
        } else {
            ((TRecyclerView) getHost()).removeOnScrollListener(this.mAutoLoadScrollListener);
            this.mAutoLoadScrollListener = null;
        }
    }

    public void setPositiveRefreshBackgroundColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17de8ba7", new Object[]{this, new Integer(i)});
            return;
        }
        RefreshController refreshController = this.mRefreshController;
        if (refreshController == null) {
            return;
        }
        refreshController.setDownRefreshBackgroundColor(i);
    }

    public void setNegativeRefreshBackgroundColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf5093eb", new Object[]{this, new Integer(i)});
            return;
        }
        RefreshController refreshController = this.mRefreshController;
        if (refreshController == null) {
            return;
        }
        refreshController.setUpRefreshBackgroundColor(i);
    }

    @Override // com.taobao.uikit.feature.callback.ScrollCallback
    public void beforeComputeScroll() {
        Scroller scroller;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6c216ac", new Object[]{this});
            return;
        }
        Scroller scroller2 = this.mScroller;
        if (scroller2 != null && scroller2.computeScrollOffset()) {
            RefreshController refreshController = this.mRefreshController;
            if (refreshController != null) {
                refreshController.onScrollerStateChanged(this.mOrientation == 1 ? this.mScroller.getCurrY() : this.mScroller.getCurrX(), true);
            }
            ((RecyclerView) this.mHost).invalidate();
            return;
        }
        RefreshController refreshController2 = this.mRefreshController;
        if (refreshController2 == null || (scroller = this.mScroller) == null) {
            return;
        }
        refreshController2.onScrollerStateChanged(this.mOrientation == 1 ? scroller.getCurrY() : scroller.getCurrX(), false);
    }

    public void setPositiveRefreshFinish(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da2a507a", new Object[]{this, new Boolean(z)});
        } else {
            this.mRefreshController.setDownRefreshFinish(z);
        }
    }

    public void setNegativeRefreshFinish(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8af52bb6", new Object[]{this, new Boolean(z)});
        } else {
            this.mRefreshController.setUpRefreshFinish(z);
        }
    }

    public boolean isScrollStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c167144", new Object[]{this})).booleanValue();
        }
        RefreshController refreshController = this.mRefreshController;
        return refreshController != null && refreshController.isScrollStop();
    }

    public int getPullDirection() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f748d57e", new Object[]{this})).intValue();
        }
        RefreshController refreshController = this.mRefreshController;
        if (refreshController == null) {
            return -1;
        }
        return refreshController.getPullDirection();
    }
}
