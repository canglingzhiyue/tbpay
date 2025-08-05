package com.taobao.android.detail.ttdetail.widget.listview;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.utils.i;
import java.util.HashMap;
import tb.kge;

/* loaded from: classes5.dex */
public class DetailListView extends TListView {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "DetailListView";
    private Context mContext;
    private int mCoverOffset;
    private int mFirstVisibleItem;
    private boolean mInnerArrowTop;
    private int mLastPartInvisibleItem;
    private int mLastPartVisibleItem;
    private int mLastScrollYOffset;
    private int mLastVisibleItem;
    private int mMaxScrollY;
    public HashMap<Integer, Integer> mObservedChilds;
    private a mOnItemStateListener;
    private b mOnScrollYDistanceChangeListener;
    private float xDistance;
    private float xLast;
    private float yDistance;
    private float yLast;

    /* loaded from: classes5.dex */
    public interface a {
        void a(int i);

        void a(int i, boolean z);

        void b(int i);

        void c(int i);
    }

    /* loaded from: classes5.dex */
    public interface b {
        void a(int i, int i2);
    }

    static {
        kge.a(-703769272);
    }

    public static /* synthetic */ Object ipc$super(DetailListView detailListView, String str, Object... objArr) {
        if (str.hashCode() == -407533570) {
            return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ int access$000(DetailListView detailListView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5f3ce855", new Object[]{detailListView})).intValue() : detailListView.mMaxScrollY;
    }

    public static /* synthetic */ int access$002(DetailListView detailListView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("167864d6", new Object[]{detailListView, new Integer(i)})).intValue();
        }
        detailListView.mMaxScrollY = i;
        return i;
    }

    public static /* synthetic */ b access$100(DetailListView detailListView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("48ceeeec", new Object[]{detailListView}) : detailListView.mOnScrollYDistanceChangeListener;
    }

    public static /* synthetic */ boolean access$202(DetailListView detailListView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7dd4fa3a", new Object[]{detailListView, new Boolean(z)})).booleanValue();
        }
        detailListView.mInnerArrowTop = z;
        return z;
    }

    public DetailListView(Context context) {
        super(context);
        this.mOnScrollYDistanceChangeListener = null;
        this.mFirstVisibleItem = -1;
        this.mLastVisibleItem = -1;
        this.mLastPartInvisibleItem = -1;
        this.mLastPartVisibleItem = -1;
        this.mObservedChilds = new HashMap<>();
        this.mContext = context;
        init();
    }

    public DetailListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mOnScrollYDistanceChangeListener = null;
        this.mFirstVisibleItem = -1;
        this.mLastVisibleItem = -1;
        this.mLastPartInvisibleItem = -1;
        this.mLastPartVisibleItem = -1;
        this.mObservedChilds = new HashMap<>();
        this.mContext = context;
        init();
    }

    public DetailListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mOnScrollYDistanceChangeListener = null;
        this.mFirstVisibleItem = -1;
        this.mLastVisibleItem = -1;
        this.mLastPartInvisibleItem = -1;
        this.mLastPartVisibleItem = -1;
        this.mObservedChilds = new HashMap<>();
        this.mContext = context;
        init();
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        setOnScrollListener(new AbsListView.OnScrollListener() { // from class: com.taobao.android.detail.ttdetail.widget.listview.DetailListView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;
            private int mLastTop;
            private int mTop;

            @Override // android.widget.AbsListView.OnScrollListener
            public void onScrollStateChanged(AbsListView absListView, int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("532cfb08", new Object[]{this, absListView, new Integer(i)});
                }
            }

            @Override // android.widget.AbsListView.OnScrollListener
            public void onScroll(AbsListView absListView, int i, int i2, int i3) {
                IpChange ipChange2 = $ipChange;
                boolean z = true;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("2eb0734b", new Object[]{this, absListView, new Integer(i), new Integer(i2), new Integer(i3)});
                    return;
                }
                this.mLastTop = this.mTop;
                this.mTop = DetailListView.this.getInnerTopY();
                if (this.mTop > DetailListView.access$000(DetailListView.this)) {
                    DetailListView.access$002(DetailListView.this, this.mTop);
                }
                if (DetailListView.access$100(DetailListView.this) != null) {
                    DetailListView.access$100(DetailListView.this).a(this.mTop, this.mLastTop);
                }
                DetailListView detailListView = DetailListView.this;
                if (this.mLastTop <= this.mTop) {
                    z = false;
                }
                DetailListView.access$202(detailListView, z);
            }
        });
        setOverScrollMode(2);
    }

    public int getMaxScrollY() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f3024a98", new Object[]{this})).intValue() : this.mMaxScrollY;
    }

    public void setOnScrollYDistanceChangeListener(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4d25210", new Object[]{this, bVar});
        } else {
            this.mOnScrollYDistanceChangeListener = bVar;
        }
    }

    public void setOnItemStateListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c38ebe4", new Object[]{this, aVar});
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

    @Override // com.taobao.android.detail.ttdetail.widget.listview.TListView, android.widget.AbsListView, android.view.ViewGroup
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
        setOnScrollListener(null);
        setAdapter((ListAdapter) null);
    }

    public int getInnerTopY() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("afb34de", new Object[]{this})).intValue();
        }
        if (getChildCount() <= 0) {
            return 0;
        }
        int firstVisiblePosition = getFirstVisiblePosition();
        for (int i = 0; i < getChildCount(); i++) {
            this.mObservedChilds.put(Integer.valueOf(i + firstVisiblePosition), Integer.valueOf(getChildAt(i).getMeasuredHeight()));
        }
        int i2 = -getChildAt(0).getTop();
        for (int i3 = 0; i3 < firstVisiblePosition; i3++) {
            if (this.mObservedChilds.get(Integer.valueOf(i3)) != null) {
                i2 += this.mObservedChilds.get(Integer.valueOf(i3)).intValue();
            }
        }
        return i2;
    }

    public void onScroll(int i) {
        a aVar;
        a aVar2;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94d55950", new Object[]{this, new Integer(i)});
            return;
        }
        int childCount = getChildCount();
        if (childCount == 0) {
            return;
        }
        int firstVisiblePosition = getFirstVisiblePosition();
        int i2 = 0;
        while (i2 < childCount && (getChildAt(i2).getBottom() + i) - this.mCoverOffset <= 0) {
            i2++;
        }
        int i3 = childCount - 1;
        while (i3 >= 0 && getChildAt(i3).getTop() + i >= getMeasuredHeight()) {
            i3--;
        }
        if (i2 > i3) {
            return;
        }
        int i4 = firstVisiblePosition + i2;
        int i5 = firstVisiblePosition + i3;
        int i6 = this.mLastScrollYOffset;
        if (i > i6) {
            z = true;
        } else if (i >= i6) {
            z = this.mInnerArrowTop;
        }
        this.mLastScrollYOffset = i;
        for (int i7 = i4; i7 <= i5; i7++) {
            if ((i7 > this.mLastVisibleItem || i7 < this.mFirstVisibleItem) && i7 >= 0 && i7 < getCount() && (aVar2 = this.mOnItemStateListener) != null) {
                aVar2.a(i7);
            }
        }
        int i8 = this.mFirstVisibleItem;
        if (i8 != -1 && this.mLastVisibleItem != -1) {
            while (i8 <= this.mLastVisibleItem) {
                if ((i8 < i4 || i8 > i5) && i8 >= 0 && i8 < getCount() && (aVar = this.mOnItemStateListener) != null) {
                    aVar.a(i8, z);
                }
                i8++;
            }
        }
        this.mFirstVisibleItem = i4;
        this.mLastVisibleItem = i5;
        if (z) {
            View childAt = getChildAt(i2);
            if ((childAt.getBottom() + i) - this.mCoverOffset > childAt.getMeasuredHeight() / 2 && this.mLastPartVisibleItem != i4) {
                this.mLastPartVisibleItem = i4;
                a aVar3 = this.mOnItemStateListener;
                if (aVar3 != null) {
                    aVar3.b(i4);
                }
            }
            View childAt2 = getChildAt(i3);
            if ((getMeasuredHeight() - childAt2.getTop()) - i >= childAt2.getMeasuredHeight() / 2 || this.mLastPartInvisibleItem == i5) {
                return;
            }
            this.mLastPartInvisibleItem = i5;
            a aVar4 = this.mOnItemStateListener;
            if (aVar4 == null) {
                return;
            }
            aVar4.c(i5);
            return;
        }
        View childAt3 = getChildAt(i2);
        if ((childAt3.getBottom() + i) - this.mCoverOffset < childAt3.getMeasuredHeight() / 2 && this.mLastPartInvisibleItem != i4) {
            this.mLastPartInvisibleItem = i4;
            a aVar5 = this.mOnItemStateListener;
            if (aVar5 != null) {
                aVar5.c(i4);
            }
        }
        View childAt4 = getChildAt(i3);
        if ((getMeasuredHeight() - childAt4.getTop()) - i <= childAt4.getMeasuredHeight() / 2 || this.mLastPartVisibleItem == i5) {
            return;
        }
        this.mLastPartVisibleItem = i5;
        a aVar6 = this.mOnItemStateListener;
        if (aVar6 == null) {
            return;
        }
        aVar6.b(i5);
    }

    public int getFirstVisibleItem() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("466cec45", new Object[]{this})).intValue() : this.mFirstVisibleItem;
    }

    public int getLastVisibleItem() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("1a4c3f3", new Object[]{this})).intValue() : this.mLastVisibleItem;
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

    public int getTotalHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("28b76e4f", new Object[]{this})).intValue();
        }
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(((Activity) this.mContext).getWindowManager().getDefaultDisplay().getWidth(), Integer.MIN_VALUE);
        int i = 0;
        for (int i2 = 0; i2 < adapter.getCount(); i2++) {
            View view = adapter.getView(i2, null, this);
            view.measure(makeMeasureSpec, 0);
            i += view.getMeasuredHeight();
        }
        return i;
    }
}
