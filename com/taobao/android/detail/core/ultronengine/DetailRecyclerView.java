package com.taobao.android.detail.core.ultronengine;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.widget.listview.DetailListView;
import com.taobao.android.detail.core.detail.widget.listview.features.internal.pullrefresh.RefreshHeadView;
import com.taobao.android.detail.core.utils.i;
import com.taobao.uikit.feature.view.TRecyclerView;
import java.util.HashMap;
import tb.emu;
import tb.god;
import tb.kge;

/* loaded from: classes4.dex */
public class DetailRecyclerView extends TRecyclerView {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "DetailRV";
    private int mCoverOffset;
    private int mFirstVisibleItem;
    private boolean mInnerArrowTop;
    private int mLastPartInvisibleItem;
    private int mLastPartVisibleItem;
    private int mLastScrollYOffset;
    private int mLastTop;
    private int mLastVisibleItem;
    public HashMap<Integer, Integer> mObservedChilds;
    private DetailListView.a mOnItemStateListener;
    private DetailListView.b mOnScrollYDistanceChangeListener;
    private int mTop;
    private RecyclerView.OnScrollListener onScrollListener;
    private float xDistance;
    private float xLast;
    private float yDistance;
    private float yLast;

    static {
        kge.a(-1384164887);
    }

    public static /* synthetic */ Object ipc$super(DetailRecyclerView detailRecyclerView, String str, Object... objArr) {
        if (str.hashCode() == -407533570) {
            return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ int access$000(DetailRecyclerView detailRecyclerView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e6a9f790", new Object[]{detailRecyclerView})).intValue() : detailRecyclerView.mLastTop;
    }

    public static /* synthetic */ int access$002(DetailRecyclerView detailRecyclerView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("60563037", new Object[]{detailRecyclerView, new Integer(i)})).intValue();
        }
        detailRecyclerView.mLastTop = i;
        return i;
    }

    public static /* synthetic */ int access$100(DetailRecyclerView detailRecyclerView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c9d5aad1", new Object[]{detailRecyclerView})).intValue() : detailRecyclerView.mTop;
    }

    public static /* synthetic */ int access$102(DetailRecyclerView detailRecyclerView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e2a0e516", new Object[]{detailRecyclerView, new Integer(i)})).intValue();
        }
        detailRecyclerView.mTop = i;
        return i;
    }

    public static /* synthetic */ int access$200(DetailRecyclerView detailRecyclerView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ad015e12", new Object[]{detailRecyclerView})).intValue() : detailRecyclerView.getInnerTopY();
    }

    public static /* synthetic */ DetailListView.b access$300(DetailRecyclerView detailRecyclerView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DetailListView.b) ipChange.ipc$dispatch("2afa3cd9", new Object[]{detailRecyclerView}) : detailRecyclerView.mOnScrollYDistanceChangeListener;
    }

    public static /* synthetic */ boolean access$402(DetailRecyclerView detailRecyclerView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("69814395", new Object[]{detailRecyclerView, new Boolean(z)})).booleanValue();
        }
        detailRecyclerView.mInnerArrowTop = z;
        return z;
    }

    public DetailRecyclerView(Context context) {
        this(context, null, 0);
    }

    public DetailRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DetailRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mOnScrollYDistanceChangeListener = null;
        this.mFirstVisibleItem = -1;
        this.mLastVisibleItem = -1;
        this.mLastPartInvisibleItem = -1;
        this.mLastPartVisibleItem = -1;
        this.mObservedChilds = new HashMap<>();
        init();
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        RecyclerView.OnScrollListener onScrollListener = new RecyclerView.OnScrollListener() { // from class: com.taobao.android.detail.core.ultronengine.DetailRecyclerView.1
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
                } else {
                    super.onScrollStateChanged(recyclerView, i);
                }
            }

            @Override // android.support.v7.widget.RecyclerView.OnScrollListener
            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                IpChange ipChange2 = $ipChange;
                boolean z = true;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3018fdc0", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
                    return;
                }
                DetailRecyclerView detailRecyclerView = DetailRecyclerView.this;
                DetailRecyclerView.access$002(detailRecyclerView, DetailRecyclerView.access$100(detailRecyclerView));
                DetailRecyclerView detailRecyclerView2 = DetailRecyclerView.this;
                DetailRecyclerView.access$102(detailRecyclerView2, DetailRecyclerView.access$200(detailRecyclerView2));
                if (DetailRecyclerView.access$300(DetailRecyclerView.this) != null) {
                    DetailRecyclerView.access$300(DetailRecyclerView.this).a(DetailRecyclerView.access$100(DetailRecyclerView.this), DetailRecyclerView.access$000(DetailRecyclerView.this));
                }
                DetailRecyclerView detailRecyclerView3 = DetailRecyclerView.this;
                if (DetailRecyclerView.access$000(detailRecyclerView3) <= DetailRecyclerView.access$100(DetailRecyclerView.this)) {
                    z = false;
                }
                DetailRecyclerView.access$402(detailRecyclerView3, z);
            }
        };
        this.onScrollListener = onScrollListener;
        addOnScrollListener(onScrollListener);
        setOverScrollMode(2);
        emu.a("com.taobao.android.detail.core.ultronengine.DetailRecyclerView");
    }

    public void setOnScrollYDistanceChangeListener(DetailListView.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b79d10ae", new Object[]{this, bVar});
        } else {
            this.mOnScrollYDistanceChangeListener = bVar;
        }
    }

    public void setOnItemStateListener(DetailListView.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1949fd3c", new Object[]{this, aVar});
        } else {
            this.mOnItemStateListener = aVar;
        }
    }

    public void setCoverOffset(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd0da6f4", new Object[]{this, new Integer(i)});
        } else {
            this.mCoverOffset = i;
        }
    }

    @Override // com.taobao.uikit.feature.view.TRecyclerView, android.support.v7.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.yDistance = 0.0f;
            this.xDistance = 0.0f;
            this.xLast = motionEvent.getX();
            this.yLast = motionEvent.getY();
        } else if (action == 1) {
            this.xLast = motionEvent.getX();
            this.yLast = motionEvent.getY();
        } else if (action == 2) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            this.xDistance += Math.abs(x - this.xLast);
            this.yDistance += Math.abs(y - this.yLast);
            this.xLast = x;
            this.yLast = y;
            if (this.xDistance > this.yDistance) {
                return false;
            }
        }
        try {
            return super.onInterceptTouchEvent(motionEvent);
        } catch (Exception e) {
            i.a(TAG, "", e);
            return false;
        }
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        HashMap<Integer, Integer> hashMap = this.mObservedChilds;
        if (hashMap != null) {
            hashMap.clear();
            this.mObservedChilds = null;
        }
        setAdapter(null);
    }

    public HashMap<Integer, Integer> getObservedChildren() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashMap) ipChange.ipc$dispatch("f18026c7", new Object[]{this}) : this.mObservedChilds;
    }

    private int getInnerTopY() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("afb34de", new Object[]{this})).intValue();
        }
        if (getChildCount() <= 0) {
            return 0;
        }
        int findFirstVisibleItemPosition = ((LinearLayoutManager) getLayoutManager()).findFirstVisibleItemPosition();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (god.i && (childAt instanceof ViewGroup)) {
                ViewGroup viewGroup = (ViewGroup) childAt;
                if (viewGroup.getChildCount() > 0 && (viewGroup.getChildAt(0) instanceof RefreshHeadView)) {
                }
            }
            this.mObservedChilds.put(Integer.valueOf(i + findFirstVisibleItemPosition), Integer.valueOf(childAt.getMeasuredHeight()));
        }
        View childAt2 = getChildAt(0);
        if (childAt2 == null) {
            childAt2 = getChildAt(0);
        }
        int i2 = childAt2 != null ? -childAt2.getTop() : 0;
        for (int i3 = 0; i3 < findFirstVisibleItemPosition; i3++) {
            if (this.mObservedChilds.get(Integer.valueOf(i3)) != null) {
                i2 += this.mObservedChilds.get(Integer.valueOf(i3)).intValue();
            }
        }
        View view = this;
        while (view.getParent() != null) {
            view = (View) view.getParent();
            if (view instanceof ScrollView) {
                return i2 + view.getScrollY();
            }
        }
        return i2;
    }

    public void onScroll(int i) {
        DetailListView.a aVar;
        DetailListView.a aVar2;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94d55950", new Object[]{this, new Integer(i)});
            return;
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) getLayoutManager();
        int childCount = getChildCount();
        if (childCount == 0) {
            return;
        }
        int findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        int i2 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            if (childAt != null && (childAt.getBottom() + i) - this.mCoverOffset > 0) {
                i.a(TAG, "firstItem:" + i2 + " " + childAt + "getBottom:" + childAt.getBottom() + " pos:" + ((childAt.getBottom() + i) - this.mCoverOffset));
                break;
            }
            i2++;
        }
        int i3 = childCount - 1;
        while (i3 >= 0) {
            View childAt2 = getChildAt(i3);
            if (childAt2 != null && childAt2.getTop() + i < getMeasuredHeight()) {
                break;
            }
            i3--;
        }
        if (i2 > i3) {
            i.d(TAG, "has cover");
            return;
        }
        int i4 = findFirstVisibleItemPosition + i2;
        int i5 = findFirstVisibleItemPosition + i3;
        i.a("DetailRVscroll", "first item " + i4 + " last item " + i5 + " scrollYoffse" + i);
        int i6 = this.mLastScrollYOffset;
        if (i > i6) {
            z = true;
        } else if (i >= i6) {
            z = this.mInnerArrowTop;
        }
        this.mLastScrollYOffset = i;
        for (int i7 = i4; i7 <= i5; i7++) {
            if ((i7 > this.mLastVisibleItem || i7 < this.mFirstVisibleItem) && i7 >= 0 && i7 < getCount() && (aVar2 = this.mOnItemStateListener) != null) {
                aVar2.a(i7 - getHeaderViewsCount());
            }
        }
        int i8 = this.mFirstVisibleItem;
        if (i8 != -1 && this.mLastVisibleItem != -1) {
            while (i8 <= this.mLastVisibleItem) {
                if ((i8 < i4 || i8 > i5) && i8 >= 0 && i8 < getCount() && (aVar = this.mOnItemStateListener) != null) {
                    aVar.a(i8 - getHeaderViewsCount(), z);
                }
                i8++;
            }
        }
        this.mFirstVisibleItem = i4;
        this.mLastVisibleItem = i5;
        if (z) {
            View childAt3 = getChildAt(i2);
            if (childAt3 != null && (childAt3.getBottom() + i) - this.mCoverOffset > childAt3.getMeasuredHeight() / 2 && this.mLastPartVisibleItem != i4) {
                this.mLastPartVisibleItem = i4;
                DetailListView.a aVar3 = this.mOnItemStateListener;
                if (aVar3 != null) {
                    aVar3.b(i4 - getHeaderViewsCount());
                }
            }
            View childAt4 = getChildAt(i3);
            if (childAt4 == null || (getMeasuredHeight() - childAt4.getTop()) - i >= childAt4.getMeasuredHeight() / 2 || this.mLastPartInvisibleItem == i5) {
                return;
            }
            this.mLastPartInvisibleItem = i5;
            DetailListView.a aVar4 = this.mOnItemStateListener;
            if (aVar4 == null) {
                return;
            }
            aVar4.c(i5 - getHeaderViewsCount());
            return;
        }
        View childAt5 = getChildAt(i2);
        if (childAt5 != null && (childAt5.getBottom() + i) - this.mCoverOffset < childAt5.getMeasuredHeight() / 2 && this.mLastPartInvisibleItem != i4) {
            this.mLastPartInvisibleItem = i4;
            DetailListView.a aVar5 = this.mOnItemStateListener;
            if (aVar5 != null) {
                aVar5.c(i4 - getHeaderViewsCount());
            }
        }
        View childAt6 = getChildAt(i3);
        if (childAt6 == null || (getMeasuredHeight() - childAt6.getTop()) - i <= childAt6.getMeasuredHeight() / 2 || this.mLastPartVisibleItem == i5) {
            return;
        }
        this.mLastPartVisibleItem = i5;
        DetailListView.a aVar6 = this.mOnItemStateListener;
        if (aVar6 == null) {
            return;
        }
        aVar6.b(i5 - getHeaderViewsCount());
    }

    private int getCount() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue() : getAdapter().getItemCount();
    }

    public int getFirstVisibleItem() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("466cec45", new Object[]{this})).intValue() : this.mFirstVisibleItem;
    }

    public int getLastVisibleItem() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("1a4c3f3", new Object[]{this})).intValue() : this.mLastVisibleItem;
    }

    public int getTopY() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("41d0b994", new Object[]{this})).intValue() : this.mTop;
    }

    public void reset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
            return;
        }
        this.mFirstVisibleItem = -1;
        this.mLastVisibleItem = -1;
        this.mLastPartVisibleItem = -1;
        this.mLastPartInvisibleItem = -1;
    }

    public int getLastVisibleItemPosition() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f9f96bbc", new Object[]{this})).intValue() : ((LinearLayoutManager) getLayoutManager()).findLastVisibleItemPosition();
    }
}
