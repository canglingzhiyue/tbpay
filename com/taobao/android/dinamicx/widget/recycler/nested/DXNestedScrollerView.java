package com.taobao.android.dinamicx.widget.recycler.nested;

import android.content.Context;
import android.support.v4.view.NestedScrollingParent2;
import android.support.v4.view.ViewCompat;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.ah;
import com.taobao.android.dinamicx.bx;
import com.taobao.android.dinamicx.widget.DXRecyclerLayout;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.ac;
import com.taobao.android.dinamicx.widget.recycler.h;
import com.taobao.android.dinamicx.widget.recycler.view.DXRecyclerView;
import tb.fqi;
import tb.gbh;
import tb.kge;

/* loaded from: classes5.dex */
public class DXNestedScrollerView extends FrameLayout implements NestedScrollingParent2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int childIndex;
    private int childScrollState;
    private float downY;
    private boolean fixVerticalScrollConflict;
    private boolean isChildReachTop;
    public boolean isDraggingToRefresh;
    private int mAction;
    private int mAxes;
    private RecyclerView mChildList;
    private int mListHeadY;
    private a mOnScrollListener;
    private RecyclerView mRootList;
    private int stickyHeight;
    private SparseIntArray tabHeightMap;

    /* loaded from: classes5.dex */
    public interface a {
    }

    static {
        kge.a(1370569674);
        kge.a(-2000658237);
        kge.a(604803954);
    }

    private void handlerExposure() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1513278", new Object[]{this});
        }
    }

    private void handlerRootScroll(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f85799c3", new Object[]{this, new Integer(i)});
        }
    }

    private void handlerScrolled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55b0f1d", new Object[]{this});
        }
    }

    public static /* synthetic */ Object ipc$super(DXNestedScrollerView dXNestedScrollerView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1533054272:
                return new Boolean(super.onNestedPreFling((View) objArr[0], ((Number) objArr[1]).floatValue(), ((Number) objArr[2]).floatValue()));
            case -407533570:
                return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
            case -244855388:
                super.onLayout(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
                return null;
            case 2075560917:
                return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
            case 2114251219:
                return new Boolean(super.onNestedFling((View) objArr[0], ((Number) objArr[1]).floatValue(), ((Number) objArr[2]).floatValue(), ((Boolean) objArr[3]).booleanValue()));
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public static /* synthetic */ void access$000(DXNestedScrollerView dXNestedScrollerView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af62de3", new Object[]{dXNestedScrollerView, new Integer(i)});
        } else {
            dXNestedScrollerView.handlerRootScroll(i);
        }
    }

    public DXNestedScrollerView(Context context) {
        super(context);
        this.fixVerticalScrollConflict = true;
        this.mListHeadY = 0;
        this.isDraggingToRefresh = false;
        this.childIndex = -1;
        this.mAction = -1;
        this.tabHeightMap = new SparseIntArray();
        this.stickyHeight = 0;
        this.childScrollState = 0;
        this.isChildReachTop = true;
    }

    public DXNestedScrollerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.fixVerticalScrollConflict = true;
        this.mListHeadY = 0;
        this.isDraggingToRefresh = false;
        this.childIndex = -1;
        this.mAction = -1;
        this.tabHeightMap = new SparseIntArray();
        this.stickyHeight = 0;
        this.childScrollState = 0;
        this.isChildReachTop = true;
    }

    public DXNestedScrollerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.fixVerticalScrollConflict = true;
        this.mListHeadY = 0;
        this.isDraggingToRefresh = false;
        this.childIndex = -1;
        this.mAction = -1;
        this.tabHeightMap = new SparseIntArray();
        this.stickyHeight = 0;
        this.childScrollState = 0;
        this.isChildReachTop = true;
    }

    public void setOnScrollListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e03c6b11", new Object[]{this, aVar});
        } else {
            this.mOnScrollListener = aVar;
        }
    }

    @Override // android.support.v4.view.NestedScrollingParent2
    public boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3643ce32", new Object[]{this, view, view2, new Integer(i), new Integer(i2)})).booleanValue() : (i != 2 || this.mRootList == null || this.mChildList == null) ? false : true;
    }

    @Override // android.support.v4.view.NestedScrollingParent2
    public void onNestedScrollAccepted(View view, View view2, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da61a091", new Object[]{this, view, view2, new Integer(i), new Integer(i2)});
        } else {
            this.mAxes = i;
        }
    }

    @Override // android.support.v4.view.NestedScrollingParent2
    public void onStopNestedScroll(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eaf68c3d", new Object[]{this, view, new Integer(i)});
            return;
        }
        this.mAxes = 0;
        if (i == 0) {
            handlerScrolled();
        }
        if (1 != i) {
            return;
        }
        handlerScrolled();
    }

    @Override // android.support.v4.view.NestedScrollingParent2
    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64bba3db", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5)});
        } else if (i2 != 0 || i4 == 0) {
        } else {
            ViewCompat.stopNestedScroll(view, 1);
        }
    }

    @Override // android.support.v4.view.NestedScrollingParent2
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        int viewTop;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("472edc84", new Object[]{this, view, new Integer(i), new Integer(i2), iArr, new Integer(i3)});
            return;
        }
        try {
            if (this.mChildList == null || (viewTop = getViewTop(this.mRootList, this.mChildList)) == Integer.MAX_VALUE || view != this.mRootList) {
                return;
            }
            onParentScrolling(viewTop, i2, iArr);
        } catch (Throwable th) {
            com.taobao.android.dinamicx.exception.a.b(th);
        }
    }

    private int getViewTop(View view, View view2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("da4fe5b4", new Object[]{this, view, view2})).intValue();
        }
        if (view2 == null) {
            return Integer.MAX_VALUE;
        }
        if (view2.getParent() == view) {
            return view2.getTop();
        }
        if (view2.getParent() instanceof View) {
            return getViewTop(view, (View) view2.getParent());
        }
        return getViewTop(view, null);
    }

    public void setFixVerticalScrollConflict(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d237dd25", new Object[]{this, new Boolean(z)});
        } else {
            this.fixVerticalScrollConflict = z;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        if (this.fixVerticalScrollConflict) {
            float y = motionEvent.getY();
            int action = motionEvent.getAction();
            if (action == 0) {
                this.downY = y;
            } else if (action == 2) {
                requestDisallowInterceptTouchEvent(this.mRootList.canScrollVertically(-((int) (y - this.downY))));
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    private void onParentScrolling(int i, int i2, int[] iArr) {
        RecyclerView recyclerView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85b89d01", new Object[]{this, new Integer(i), new Integer(i2), iArr});
            return;
        }
        int i3 = this.stickyHeight;
        if (i != i3) {
            if (i < i3) {
                iArr[1] = i2;
                this.mRootList.scrollBy(0, i - i3);
                this.isChildReachTop = false;
                return;
            }
            if (i2 > 0) {
                int i4 = i - i3;
                if (i4 < i2) {
                    if (fqi.aq()) {
                        scrollBy(this.mRootList, i4);
                        scrollBy(this.mChildList, i2 - i4);
                        iArr[1] = i2;
                    } else {
                        iArr[1] = i2 - i4;
                    }
                }
            } else if (i2 < 0 && !isReachTop(this.mChildList)) {
                if (!fqi.ak()) {
                    this.mRootList.scrollBy(0, i - this.stickyHeight);
                }
                scrollBy(this.mChildList, i2);
                iArr[1] = i2;
            }
            this.isChildReachTop = true;
        } else if (i2 > 0 && (recyclerView = this.mChildList) != null) {
            if (recyclerView.canScrollVertically(i2)) {
                scrollBy(this.mChildList, i2);
            } else {
                RecyclerView recyclerView2 = this.mRootList;
                if (recyclerView2 != null) {
                    recyclerView2.stopScroll();
                }
                this.mChildList.stopScroll();
            }
            iArr[1] = i2;
        } else if (i2 < 0) {
            RecyclerView recyclerView3 = this.mChildList;
            if (recyclerView3 != null && !isReachTop(recyclerView3)) {
                iArr[1] = i2;
                scrollBy(this.mChildList, i2);
                return;
            }
            this.isChildReachTop = true;
            RecyclerView recyclerView4 = this.mChildList;
            if (recyclerView4 != null) {
                ViewCompat.stopNestedScroll(recyclerView4, 1);
            }
            ViewCompat.stopNestedScroll(this.mRootList, 1);
            onChildScrollStateChange(0);
        } else {
            RecyclerView recyclerView5 = this.mChildList;
            if (recyclerView5 != null) {
                ViewCompat.stopNestedScroll(recyclerView5, 1);
            }
            ViewCompat.stopNestedScroll(this.mRootList, 1);
        }
    }

    public boolean isChildReachTop() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("25fbc59f", new Object[]{this})).booleanValue() : this.isChildReachTop;
    }

    public void setChildReachTop(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7156f1d1", new Object[]{this, new Boolean(z)});
        } else {
            this.isChildReachTop = z;
        }
    }

    private boolean isReachTop(RecyclerView recyclerView) {
        View v;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a66fdee5", new Object[]{this, recyclerView})).booleanValue();
        }
        if (recyclerView == null) {
            return false;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if ((layoutManager instanceof StaggeredGridLayoutManager) && (adapter instanceof h)) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
            int[] iArr = new int[staggeredGridLayoutManager.getSpanCount()];
            staggeredGridLayoutManager.findFirstVisibleItemPositions(iArr);
            int i = iArr[0];
            int i2 = 0;
            while (i2 < layoutManager.getChildCount()) {
                View findViewByPosition = layoutManager.findViewByPosition(i2);
                DXWidgetNode n = ((h) adapter).n(i2);
                if (findViewByPosition != null && !(n instanceof ah)) {
                    boolean z = i <= i2 && findViewByPosition.getTop() == 0;
                    if (!fqi.W() || i2 != 0 || !(n instanceof ac) || !((ac) n).c() || (v = n.getDXRuntimeContext().v()) == null) {
                        return z;
                    }
                    ViewGroup.LayoutParams layoutParams = v.getLayoutParams();
                    if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                        return z;
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    int measuredHeight = marginLayoutParams.topMargin + v.getMeasuredHeight() + marginLayoutParams.bottomMargin;
                    if (layoutManager.findViewByPosition(i2 + 1) != null) {
                        return i <= i2 && findViewByPosition.getTop() == measuredHeight;
                    }
                    return z;
                }
                i2++;
            }
            if (iArr[0] == 0) {
                return true;
            }
        }
        return false;
    }

    private void scrollBy(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bea85e79", new Object[]{this, viewGroup, new Integer(i)});
            return;
        }
        if (viewGroup == this.mChildList) {
            this.isChildReachTop = false;
        }
        viewGroup.scrollBy(0, i);
        handlerScrolling(viewGroup);
        handlerExposure();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.v4.view.NestedScrollingParent
    public boolean onNestedPreFling(View view, float f, float f2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a49f72c0", new Object[]{this, view, new Float(f), new Float(f2)})).booleanValue() : super.onNestedPreFling(view, f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.v4.view.NestedScrollingParent
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7e04e9d3", new Object[]{this, view, new Float(f), new Float(f2), new Boolean(z)})).booleanValue() : super.onNestedFling(view, f, f2, z);
    }

    @Override // android.view.ViewGroup, android.support.v4.view.NestedScrollingParent
    public int getNestedScrollAxes() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3ae0ec59", new Object[]{this})).intValue() : this.mAxes;
    }

    public void setRoot(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcefbe2a", new Object[]{this, viewGroup});
            return;
        }
        this.mRootList = (RecyclerView) viewGroup;
        this.mRootList.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.taobao.android.dinamicx.widget.recycler.nested.DXNestedScrollerView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
                if (str.hashCode() == 2142696127) {
                    super.onScrollStateChanged((RecyclerView) objArr[0], ((Number) objArr[1]).intValue());
                    return null;
                }
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }

            @Override // android.support.v7.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7fb6f2bf", new Object[]{this, recyclerView, new Integer(i)});
                    return;
                }
                super.onScrollStateChanged(recyclerView, i);
                DXNestedScrollerView.access$000(DXNestedScrollerView.this, i);
            }
        });
    }

    public void setCurrentChild(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57966aeb", new Object[]{this, viewGroup});
        } else if (viewGroup == null) {
        } else {
            this.mChildList = (RecyclerView) viewGroup;
        }
    }

    public void clearChildList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("977f1214", new Object[]{this});
        } else {
            this.mChildList = null;
        }
    }

    private void handlerScrolling(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ad9fb11", new Object[]{this, viewGroup});
            return;
        }
        int i = this.mAction;
        if (i == 2) {
            if (viewGroup == null || viewGroup != this.mChildList) {
                return;
            }
            onChildScrollStateChange(1);
        } else if (i != 1 || viewGroup == null || viewGroup != this.mChildList) {
        } else {
            onChildScrollStateChange(2);
        }
    }

    public void stopAllScroll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52f77873", new Object[]{this});
            return;
        }
        RecyclerView recyclerView = this.mChildList;
        if (recyclerView != null) {
            recyclerView.stopScroll();
        }
        RecyclerView recyclerView2 = this.mRootList;
        if (recyclerView2 == null) {
            return;
        }
        recyclerView2.stopScroll();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        if (this.isDraggingToRefresh) {
            return;
        }
        handlerExposure();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        this.mAction = motionEvent.getAction();
        return super.dispatchTouchEvent(motionEvent);
    }

    public RecyclerView getmRootList() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RecyclerView) ipChange.ipc$dispatch("af6c6466", new Object[]{this}) : this.mRootList;
    }

    public RecyclerView getmChildList() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RecyclerView) ipChange.ipc$dispatch("87cb0cba", new Object[]{this}) : this.mChildList;
    }

    public int getChildIndex() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d8ddeb86", new Object[]{this})).intValue() : this.childIndex;
    }

    public void setChildIndex(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79b69344", new Object[]{this, new Integer(i)});
        } else {
            this.childIndex = i;
        }
    }

    public void setStickyHeight(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bbc7caa", new Object[]{this, new Integer(i)});
        } else {
            setStickyHeight(i, false);
        }
    }

    public void setStickyHeight(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bd3cb6a", new Object[]{this, new Integer(i), new Boolean(z)});
        } else if (this.stickyHeight > 0 && !z) {
        } else {
            this.stickyHeight = i;
        }
    }

    public void resetStickyHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e4f8c66", new Object[]{this});
        } else {
            this.stickyHeight = 0;
        }
    }

    public int getStickyHeight() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("fb5c1060", new Object[]{this})).intValue() : this.stickyHeight;
    }

    public void dispatchChildScrollStateChange(int i) {
        int viewTop;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f72884aa", new Object[]{this, new Integer(i)});
        } else if (!isOpenChildScrollStateChange() || (viewTop = getViewTop(this.mRootList, this.mChildList)) == Integer.MAX_VALUE) {
        } else {
            if (viewTop < this.stickyHeight) {
                onChildScrollStateChange(0);
            } else {
                onChildScrollStateChange(i);
            }
        }
    }

    private void onChildScrollStateChange(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5a40425", new Object[]{this, new Integer(i)});
        } else if (!isOpenChildScrollStateChange() || this.childScrollState == i) {
        } else {
            this.childScrollState = i;
            RecyclerView recyclerView = this.mChildList;
            if (!(recyclerView instanceof DXRecyclerView)) {
                return;
            }
            ((DXRecyclerView) recyclerView).onScrollStateChangedExtra(i);
        }
    }

    private boolean isOpenChildScrollStateChange() {
        DXRuntimeContext dXRuntimeContext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("49638f17", new Object[]{this})).booleanValue();
        }
        if (bx.a()) {
            return true;
        }
        RecyclerView recyclerView = this.mChildList;
        if (!(recyclerView instanceof DXRecyclerView)) {
            return false;
        }
        DXWidgetNode b = gbh.b((DXRecyclerView) recyclerView);
        if (!(b instanceof DXRecyclerLayout) || (dXRuntimeContext = ((DXRecyclerLayout) b).getDXRuntimeContext()) == null) {
            return false;
        }
        return fqi.g(dXRuntimeContext.A());
    }
}
