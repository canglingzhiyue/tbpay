package com.taobao.android.detail.mainpic.widget;

import android.content.Context;
import android.graphics.PointF;
import android.support.v7.widget.PagerSnapHelper;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.ptr.PullBase;
import com.taobao.ptr.h;
import java.util.ArrayList;
import java.util.List;
import tb.eup;
import tb.nkn;

/* loaded from: classes4.dex */
public class DetailMainViewPager extends RecyclerView implements h {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private PointF mCurrentPt;
    private PointF mLastPt;
    private List<a> mOnPageChangedListeners;
    private int mPositionBeforeScroll;
    private int mSmoothScrollTargetPosition;
    public PagerSnapHelper snapHelper;

    /* loaded from: classes4.dex */
    public interface a {
        void a(int i, int i2);
    }

    public static /* synthetic */ Object ipc$super(DetailMainViewPager detailMainViewPager, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 1659846701) {
            super.onScrollStateChanged(((Number) objArr[0]).intValue());
            return null;
        } else if (hashCode != 2075560917) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
        }
    }

    @Override // com.taobao.ptr.h
    public int getPullDirection() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f748d57e", new Object[]{this})).intValue();
        }
        return 1;
    }

    @Override // com.taobao.ptr.h
    public boolean isReadyForPullStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3cf0e198", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.ptr.h
    public void onPullAdapterAdded(PullBase pullBase) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04e19b", new Object[]{this, pullBase});
        }
    }

    @Override // com.taobao.ptr.h
    public void onPullAdapterRemoved(PullBase pullBase) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea67bf7b", new Object[]{this, pullBase});
        }
    }

    public DetailMainViewPager(Context context) {
        super(context);
        this.mLastPt = new PointF();
        this.mCurrentPt = new PointF();
        this.mSmoothScrollTargetPosition = 0;
        this.mPositionBeforeScroll = -1;
        init();
    }

    public DetailMainViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mLastPt = new PointF();
        this.mCurrentPt = new PointF();
        this.mSmoothScrollTargetPosition = 0;
        this.mPositionBeforeScroll = -1;
        init();
    }

    public DetailMainViewPager(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mLastPt = new PointF();
        this.mCurrentPt = new PointF();
        this.mSmoothScrollTargetPosition = 0;
        this.mPositionBeforeScroll = -1;
        init();
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        this.snapHelper = new PagerSnapHelper();
        this.snapHelper.attachToRecyclerView(this);
    }

    @Override // com.taobao.ptr.h
    public boolean isReadyForPullEnd() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f76f3051", new Object[]{this})).booleanValue();
        }
        RecyclerView.Adapter adapter = getAdapter();
        if (adapter == null || adapter.getItemCount() == 0) {
            return true;
        }
        int itemCount = adapter.getItemCount() - 1;
        int d = nkn.d(this);
        if (d == -1 || d < itemCount) {
            return false;
        }
        int b = d - nkn.b(this);
        int a2 = nkn.a(this);
        if (a2 == 0) {
            return isChildRightVisible(this, b);
        }
        if (a2 == 1) {
            return isChildBottomVisible(this, b);
        }
        return false;
    }

    private static boolean isChildBottomVisible(RecyclerView recyclerView, int i) {
        View childAt;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1b11fa3d", new Object[]{recyclerView, new Integer(i)})).booleanValue() : (recyclerView == null || (childAt = recyclerView.getChildAt(i)) == null || childAt.getBottom() > recyclerView.getHeight()) ? false : true;
    }

    private static boolean isChildRightVisible(RecyclerView recyclerView, int i) {
        View childAt;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b3c4360a", new Object[]{recyclerView, new Integer(i)})).booleanValue() : (recyclerView == null || (childAt = recyclerView.getChildAt(i)) == null || childAt.getRight() > recyclerView.getWidth()) ? false : true;
    }

    public int getDx() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("166c4a04", new Object[]{this})).intValue() : (int) (this.mLastPt.x - this.mCurrentPt.x);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.mLastPt.x = motionEvent.getX();
            this.mLastPt.y = motionEvent.getY();
        } else if (action == 1 || action == 2) {
            this.mCurrentPt.x = motionEvent.getX();
            this.mCurrentPt.y = motionEvent.getY();
        } else if (action == 5 || action == 6) {
            if (motionEvent.getPointerCount() > 1) {
                requestDisallowInterceptTouchEvent(true);
            } else {
                requestDisallowInterceptTouchEvent(false);
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void addOnPageChangedListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("493750c0", new Object[]{this, aVar});
            return;
        }
        if (this.mOnPageChangedListeners == null) {
            this.mOnPageChangedListeners = new ArrayList();
        }
        this.mOnPageChangedListeners.add(aVar);
    }

    public void removeOnPageChangedListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1454fe3d", new Object[]{this, aVar});
            return;
        }
        List<a> list = this.mOnPageChangedListeners;
        if (list == null) {
            return;
        }
        list.remove(aVar);
    }

    public void clearOnPageChangedListeners() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9facb4d", new Object[]{this});
            return;
        }
        List<a> list = this.mOnPageChangedListeners;
        if (list == null) {
            return;
        }
        list.clear();
    }

    public void forceResetPosition(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e57250f", new Object[]{this, new Integer(i)});
            return;
        }
        this.mPositionBeforeScroll = i;
        this.mSmoothScrollTargetPosition = i;
    }

    @Override // android.support.v7.widget.RecyclerView
    public void onScrollStateChanged(int i) {
        View findSnapView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62ef402d", new Object[]{this, new Integer(i)});
            return;
        }
        super.onScrollStateChanged(i);
        if (!eup.b()) {
            handleNewPicPageChange();
        } else if (i == 0 && (findSnapView = this.snapHelper.findSnapView(getLayoutManager())) != null) {
            int position = getLayoutManager().getPosition(findSnapView);
            this.mPositionBeforeScroll = this.mSmoothScrollTargetPosition;
            this.mSmoothScrollTargetPosition = position;
            List<a> list = this.mOnPageChangedListeners;
            if (list == null) {
                return;
            }
            for (a aVar : list) {
                if (aVar != null) {
                    aVar.a(this.mPositionBeforeScroll, this.mSmoothScrollTargetPosition);
                }
            }
        }
    }

    private void handleNewPicPageChange() {
        List<a> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27d6e4d8", new Object[]{this});
            return;
        }
        View findSnapView = this.snapHelper.findSnapView(getLayoutManager());
        if (findSnapView == null) {
            return;
        }
        int position = getLayoutManager().getPosition(findSnapView);
        this.mPositionBeforeScroll = this.mSmoothScrollTargetPosition;
        this.mSmoothScrollTargetPosition = position;
        if (position == this.mPositionBeforeScroll || (list = this.mOnPageChangedListeners) == null || list.isEmpty()) {
            return;
        }
        for (a aVar : this.mOnPageChangedListeners) {
            if (aVar != null) {
                aVar.a(this.mPositionBeforeScroll, this.mSmoothScrollTargetPosition);
            }
        }
    }
}
