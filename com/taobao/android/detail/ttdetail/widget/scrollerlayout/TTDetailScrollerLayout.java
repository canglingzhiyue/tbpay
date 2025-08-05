package com.taobao.android.detail.ttdetail.widget.scrollerlayout;

import android.content.Context;
import android.os.Build;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.ListView;
import android.widget.OverScroller;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.bizmessage.o;
import com.taobao.android.detail.ttdetail.component.module.v;
import com.taobao.android.detail.ttdetail.component.module.x;
import com.taobao.android.detail.ttdetail.utils.i;
import com.taobao.android.detail.ttdetail.utils.j;
import com.taobao.android.detail.ttdetail.utils.y;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import tb.kge;

/* loaded from: classes5.dex */
public class TTDetailScrollerLayout extends ViewGroup {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int MAX_CYCLE_COUNT = 1000;
    private static final int SCROLL_HORIZONTAL = 2;
    private static final int SCROLL_NONE = 0;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    private static final int SCROLL_VERTICAL = 1;
    private static final String TAG = "TTDetailScrollerLayout";
    public static final Interpolator sQuinticInterpolator;
    private int SCROLL_ORIENTATION;
    private boolean disableChildHorizontalScroll;
    private boolean isBrake;
    private boolean isDisallowInterceptTouchEvent;
    private boolean isIntercept;
    private int mActivePointerId;
    private int mAdjust;
    private VelocityTracker mAdjustVelocityTracker;
    private int mAdjustYVelocity;
    public int mCurrentVelocity;
    private int mCycleCount;
    private final int[] mDownLocation;
    private int mEventX;
    private int mEventY;
    private HashMap<Integer, Float> mFixedYMap;
    private int mLastScrollerY;
    private int mMaximumVelocity;
    private int mMinimumVelocity;
    private int mNestedYOffset;
    private int mOldScrollY;
    public a mOnScrollChangeListener;
    public int mScreenHeightPixels;
    public int mScrollRange;
    private int mScrollState;
    private int mScrollToIndex;
    private int mScrollToIndexWithOffset;
    private View mScrollToTopView;
    private OverScroller mScroller;
    private int mSecondScrollY;
    private int mSmoothScrollOffset;
    private int mTouchSlop;
    private int mTouchY;
    private boolean mTouching;
    private VelocityTracker mVelocityTracker;

    /* loaded from: classes5.dex */
    public interface a {
        void a(View view, int i, int i2, int i3);
    }

    public static /* synthetic */ Object ipc$super(TTDetailScrollerLayout tTDetailScrollerLayout, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1577577649:
                super.scrollTo(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case -836842708:
                return new Integer(super.computeHorizontalScrollExtent());
            case -407533570:
                return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
            case 320377877:
                return new Integer(super.computeHorizontalScrollOffset());
            case 1356790191:
                return new Integer(super.computeHorizontalScrollRange());
            case 1604649632:
                super.requestLayout();
                return null;
            case 1907907562:
                super.measureChildWithMargins((View) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
                return null;
            case 1992612095:
                super.addView((View) objArr[0], ((Number) objArr[1]).intValue(), (ViewGroup.LayoutParams) objArr[2]);
                return null;
            case 2041279898:
                super.requestDisallowInterceptTouchEvent(((Boolean) objArr[0]).booleanValue());
                return null;
            case 2075560917:
                return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // android.view.View
    @Deprecated
    public void setOnScrollChangeListener(View.OnScrollChangeListener onScrollChangeListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6b49b03", new Object[]{this, onScrollChangeListener});
        }
    }

    static {
        kge.a(-1352030232);
        sQuinticInterpolator = new Interpolator() { // from class: com.taobao.android.detail.ttdetail.widget.scrollerlayout.TTDetailScrollerLayout.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.TimeInterpolator
            public float getInterpolation(float f) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Number) ipChange.ipc$dispatch("22c782db", new Object[]{this, new Float(f)})).floatValue();
                }
                float f2 = f - 1.0f;
                return (f2 * f2 * f2 * f2 * f2) + 1.0f;
            }
        };
    }

    public TTDetailScrollerLayout(Context context) {
        this(context, null);
    }

    public TTDetailScrollerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TTDetailScrollerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mFixedYMap = new HashMap<>();
        this.mDownLocation = new int[2];
        this.mTouching = false;
        this.SCROLL_ORIENTATION = 0;
        this.mActivePointerId = -1;
        this.mScrollToIndex = -1;
        this.mSmoothScrollOffset = 0;
        this.mScrollToIndexWithOffset = 0;
        this.mCycleCount = 0;
        this.mOldScrollY = 0;
        this.mNestedYOffset = 0;
        this.mScrollState = 0;
        this.isIntercept = false;
        this.isBrake = false;
        this.isDisallowInterceptTouchEvent = false;
        this.mScroller = new OverScroller(y.a(this), sQuinticInterpolator);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.mMaximumVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        this.mMinimumVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        this.mTouchSlop = ViewConfiguration.getTouchSlop();
        this.mScreenHeightPixels = getResources().getDisplayMetrics().heightPixels;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        List<View> b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76c4d8ff", new Object[]{this, view, new Integer(i), layoutParams});
            return;
        }
        if (layoutParams instanceof LayoutParams) {
            com.taobao.android.detail.ttdetail.widget.b.a((LayoutParams) layoutParams);
        }
        super.addView(view, i, layoutParams);
        View h = b.h(view);
        disableChildScroll(h);
        if ((h instanceof com.taobao.android.detail.ttdetail.widget.scrollerlayout.a) && (b = ((com.taobao.android.detail.ttdetail.widget.scrollerlayout.a) h).b()) != null && !b.isEmpty()) {
            int size = b.size();
            for (int i2 = 0; i2 < size; i2++) {
                disableChildScroll(b.get(i2));
            }
        }
        if (!(view instanceof ViewGroup)) {
            return;
        }
        ((ViewGroup) view).setClipToPadding(false);
    }

    public void addNestedComponent(x xVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcb8729b", new Object[]{this, xVar});
            return;
        }
        View componentView = xVar.getComponentView(null);
        if (componentView == null) {
            return;
        }
        LayoutParams e = xVar.e();
        e.f11048a = xVar;
        e.b = xVar;
        addView(componentView, e);
    }

    private void disableChildScroll(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10eec8ca", new Object[]{this, view});
            return;
        }
        view.setVerticalScrollBarEnabled(false);
        view.setHorizontalScrollBarEnabled(false);
        view.setOverScrollMode(2);
        ViewCompat.setNestedScrollingEnabled(view, false);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        resetScrollToTopView();
        List<View> nonGoneChildren = getNonGoneChildren();
        int size = nonGoneChildren.size();
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            View view = nonGoneChildren.get(i5);
            measureChildWithMargins(view, i, 0, i2, 0);
            i3 = Math.max(i3, getContentWidth(view));
            i4 += view.getMeasuredHeight();
        }
        setMeasuredDimension(measureSize(i, i3 + getPaddingLeft() + getPaddingRight()), measureSize(i2, i4 + getPaddingTop() + getPaddingBottom()));
    }

    private int getContentWidth(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7d82c63b", new Object[]{this, view})).intValue();
        }
        int measuredWidth = view.getMeasuredWidth();
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        return measuredWidth + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
    }

    private int measureSize(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bbb7de59", new Object[]{this, new Integer(i), new Integer(i2)})).intValue();
        }
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == 1073741824) {
            i2 = size;
        } else if (mode == Integer.MIN_VALUE) {
            i2 = Math.min(i2, size);
        }
        return resolveSizeAndState(Math.max(i2, getSuggestedMinimumWidth()), i, 0);
    }

    @Override // android.view.ViewGroup
    public void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71b85bea", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        com.taobao.android.detail.ttdetail.widget.b.a((LayoutParams) view.getLayoutParams());
        super.measureChildWithMargins(view, i, i2, i3, i4);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(final boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        this.mScrollRange = 0;
        int paddingTop = getPaddingTop();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int measuredWidth = getMeasuredWidth();
        List<View> nonGoneChildren = getNonGoneChildren();
        int size = nonGoneChildren.size();
        int i5 = paddingTop;
        int i6 = 0;
        while (i6 < size) {
            View view = nonGoneChildren.get(i6);
            int measuredHeight = view.getMeasuredHeight() + i5;
            int childLeft = getChildLeft(view, measuredWidth, paddingLeft, paddingRight);
            view.layout(childLeft, i5, view.getMeasuredWidth() + childLeft, measuredHeight);
            this.mScrollRange += view.getHeight();
            i6++;
            i5 = measuredHeight;
        }
        this.mScrollRange -= (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        if (this.mScrollRange < 0) {
            this.mScrollRange = 0;
        }
        if (!z) {
            return;
        }
        post(new Runnable() { // from class: com.taobao.android.detail.ttdetail.widget.scrollerlayout.TTDetailScrollerLayout.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (y.a(y.a(TTDetailScrollerLayout.this))) {
                } else {
                    TTDetailScrollerLayout.this.checkLayoutChange(z, false);
                }
            }
        });
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fa502a0", new Object[]{this});
        } else {
            super.requestLayout();
        }
    }

    private int getChildLeft(View view, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6f12f818", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3)})).intValue() : i2 + ((LayoutParams) view.getLayoutParams()).leftMargin;
    }

    private void resetScrollToTopView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("199640a", new Object[]{this});
            return;
        }
        this.mScrollToTopView = findFirstVisibleView();
        if (this.mScrollToTopView == null) {
            return;
        }
        this.mAdjust = getScrollY() - this.mScrollToTopView.getTop();
    }

    @Override // android.view.ViewGroup
    public LayoutParams generateDefaultLayoutParams() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LayoutParams) ipChange.ipc$dispatch("179a26b6", new Object[]{this}) : new LayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LayoutParams) ipChange.ipc$dispatch("92b849c8", new Object[]{this, layoutParams}) : new LayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LayoutParams) ipChange.ipc$dispatch("3dd8fcf7", new Object[]{this, attributeSet}) : new LayoutParams(y.a(this), attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79ab759a", new Object[]{this, new Boolean(z)});
            return;
        }
        super.requestDisallowInterceptTouchEvent(z);
        this.isDisallowInterceptTouchEvent = z;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int findPointerIndex;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        c.a(TAG, "dispatchTouchEvent:" + motionEvent.getAction());
        int actionIndex = motionEvent.getActionIndex();
        if (this.SCROLL_ORIENTATION == 2 && (i = this.mActivePointerId) != -1 && this.mFixedYMap.get(Integer.valueOf(i)) != null) {
            int findPointerIndex2 = motionEvent.findPointerIndex(this.mActivePointerId);
            if (findPointerIndex2 < 0 || findPointerIndex2 >= motionEvent.getPointerCount()) {
                return false;
            }
            motionEvent.offsetLocation(0.0f, this.mFixedYMap.get(Integer.valueOf(this.mActivePointerId)).floatValue() - motionEvent.getY(findPointerIndex2));
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        if (obtain.getActionMasked() == 0) {
            this.mNestedYOffset = 0;
        }
        obtain.offsetLocation(0.0f, this.mNestedYOffset);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.mCurrentVelocity = 0;
            this.isBrake = this.mScrollState == 2;
            if (j.R()) {
                if (!this.mScroller.isFinished()) {
                    this.mScroller.abortAnimation();
                    if (this.mScrollToIndex == -1) {
                        setScrollState(0);
                    }
                    com.taobao.android.detail.ttdetail.communication.c.a(y.a(this), new o(o.SCROLLING));
                } else {
                    com.taobao.android.detail.ttdetail.communication.c.a(y.a(this), new o("idle"));
                }
            } else {
                stopScroll();
            }
            this.mTouching = true;
            checkTargetsScroll(false, false);
            this.SCROLL_ORIENTATION = 0;
            this.mActivePointerId = motionEvent.getPointerId(actionIndex);
            this.mFixedYMap.put(Integer.valueOf(this.mActivePointerId), Float.valueOf(motionEvent.getY(actionIndex)));
            this.mEventY = (int) motionEvent.getY(actionIndex);
            this.mEventX = (int) motionEvent.getX(actionIndex);
            initOrResetAdjustVelocityTracker();
            this.mAdjustVelocityTracker.addMovement(obtain);
            this.mDownLocation[0] = b.a(this, motionEvent, actionIndex);
            this.mDownLocation[1] = b.b(this, motionEvent, actionIndex);
            int[] iArr = this.mDownLocation;
            this.isIntercept = isIntercept(iArr[0], iArr[1]);
        } else {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int findPointerIndex3 = motionEvent.findPointerIndex(this.mActivePointerId);
                    if (findPointerIndex3 < 0 || findPointerIndex3 >= motionEvent.getPointerCount()) {
                        return false;
                    }
                    initAdjustVelocityTrackerIfNotExists();
                    this.mAdjustVelocityTracker.addMovement(obtain);
                    int y = ((int) motionEvent.getY(findPointerIndex3)) - this.mEventY;
                    int x = ((int) motionEvent.getX(findPointerIndex3)) - this.mEventX;
                    if (this.SCROLL_ORIENTATION == 0 && (this.isIntercept || isIntercept(motionEvent))) {
                        if (this.disableChildHorizontalScroll) {
                            if (Math.abs(y) >= this.mTouchSlop) {
                                this.SCROLL_ORIENTATION = 1;
                            }
                        } else if (Math.abs(x) > Math.abs(y)) {
                            if (Math.abs(x) >= this.mTouchSlop) {
                                this.SCROLL_ORIENTATION = 2;
                                int i2 = this.mActivePointerId;
                                if (i2 != -1 && this.mFixedYMap.get(Integer.valueOf(i2)) != null && (findPointerIndex = motionEvent.findPointerIndex(this.mActivePointerId)) >= 0 && findPointerIndex3 < motionEvent.getPointerCount()) {
                                    motionEvent.offsetLocation(0.0f, this.mFixedYMap.get(Integer.valueOf(this.mActivePointerId)).floatValue() - motionEvent.getY(findPointerIndex));
                                }
                            }
                        } else if (Math.abs(y) >= this.mTouchSlop) {
                            this.SCROLL_ORIENTATION = 1;
                        }
                        if (this.SCROLL_ORIENTATION == 0) {
                            return true;
                        }
                    }
                    this.mEventY = (int) motionEvent.getY(findPointerIndex3);
                    this.mEventX = (int) motionEvent.getX(findPointerIndex3);
                } else if (actionMasked != 3) {
                    if (actionMasked == 5) {
                        this.mActivePointerId = motionEvent.getPointerId(actionIndex);
                        this.mFixedYMap.put(Integer.valueOf(this.mActivePointerId), Float.valueOf(motionEvent.getY(actionIndex)));
                        this.mEventY = (int) motionEvent.getY(actionIndex);
                        this.mEventX = (int) motionEvent.getX(actionIndex);
                        if (!this.isDisallowInterceptTouchEvent) {
                            requestDisallowInterceptTouchEvent(false);
                        }
                        this.mDownLocation[0] = b.a(this, motionEvent, actionIndex);
                        this.mDownLocation[1] = b.b(this, motionEvent, actionIndex);
                        int[] iArr2 = this.mDownLocation;
                        this.isIntercept = isIntercept(iArr2[0], iArr2[1]);
                        initAdjustVelocityTrackerIfNotExists();
                        this.mAdjustVelocityTracker.addMovement(obtain);
                    } else if (actionMasked == 6) {
                        this.mFixedYMap.remove(Integer.valueOf(motionEvent.getPointerId(actionIndex)));
                        if (this.mActivePointerId == motionEvent.getPointerId(actionIndex)) {
                            int i3 = actionIndex == 0 ? 1 : 0;
                            this.mActivePointerId = motionEvent.getPointerId(i3);
                            this.mFixedYMap.put(Integer.valueOf(this.mActivePointerId), Float.valueOf(motionEvent.getY(i3)));
                            this.mEventY = (int) motionEvent.getY(i3);
                            this.mEventX = (int) motionEvent.getX(i3);
                            this.mDownLocation[0] = b.a(this, motionEvent, i3);
                            this.mDownLocation[1] = b.b(this, motionEvent, i3);
                            int[] iArr3 = this.mDownLocation;
                            this.isIntercept = isIntercept(iArr3[0], iArr3[1]);
                        }
                        initAdjustVelocityTrackerIfNotExists();
                        this.mAdjustVelocityTracker.addMovement(obtain);
                    }
                }
            }
            VelocityTracker velocityTracker = this.mAdjustVelocityTracker;
            if (velocityTracker != null) {
                velocityTracker.addMovement(obtain);
                this.mAdjustVelocityTracker.computeCurrentVelocity(1000, this.mMaximumVelocity);
                int yVelocity = (int) this.mAdjustVelocityTracker.getYVelocity();
                this.mCurrentVelocity = yVelocity;
                int i4 = this.mMaximumVelocity;
                this.mAdjustYVelocity = Math.max(-i4, Math.min(yVelocity, i4));
                recycleAdjustVelocityTracker();
                int a2 = b.a(this, motionEvent, actionIndex);
                int b = b.b(this, motionEvent, actionIndex);
                boolean f = b.f(getTouchTarget(a2, b));
                boolean c = b.c(this, a2, b);
                if (this.SCROLL_ORIENTATION != 1 && f && Math.abs(yVelocity) >= this.mMinimumVelocity && !c) {
                    motionEvent.setAction(3);
                }
                if (this.SCROLL_ORIENTATION != 1 && !b.k(this) && isIntercept(motionEvent) && Math.abs(yVelocity) >= this.mMinimumVelocity && (this.SCROLL_ORIENTATION == 0 || !c)) {
                    c.a(TAG, "dispatchTouchEvent up");
                    fling(-this.mAdjustYVelocity);
                }
            }
            this.mEventY = 0;
            this.mEventX = 0;
            this.mTouching = false;
            int[] iArr4 = this.mDownLocation;
            iArr4[0] = 0;
            iArr4[1] = 0;
            this.isIntercept = false;
        }
        obtain.recycle();
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        int actionMasked2 = motionEvent.getActionMasked();
        if (actionMasked2 == 1 || actionMasked2 == 3) {
            this.SCROLL_ORIENTATION = 0;
            this.mAdjustYVelocity = 0;
            this.mFixedYMap.clear();
            this.mActivePointerId = -1;
            if (this.mScroller.isFinished()) {
                setScrollState(0);
            }
        }
        return dispatchTouchEvent;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0041, code lost:
        if (r0 != 3) goto L12;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r5) {
        /*
            r4 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.detail.ttdetail.widget.scrollerlayout.TTDetailScrollerLayout.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1c
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r2 = 0
            r1[r2] = r4
            r1[r3] = r5
            java.lang.String r5 = "e7b587fe"
            java.lang.Object r5 = r0.ipc$dispatch(r5, r1)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            return r5
        L1c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "onInterceptTouchEvent:"
            r0.append(r1)
            int r1 = r5.getAction()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "TTDetailScrollerLayout"
            com.taobao.android.detail.ttdetail.widget.scrollerlayout.c.a(r1, r0)
            int r0 = r5.getActionMasked()
            if (r0 == 0) goto L5c
            if (r0 == r3) goto L53
            if (r0 == r2) goto L44
            r1 = 3
            if (r0 == r1) goto L53
            goto L64
        L44:
            int r0 = r4.SCROLL_ORIENTATION
            if (r0 == r2) goto L64
            boolean r0 = r4.isIntercept
            if (r0 != 0) goto L52
            boolean r0 = r4.isIntercept(r5)
            if (r0 == 0) goto L64
        L52:
            return r3
        L53:
            boolean r0 = r4.isBrake
            if (r0 == 0) goto L64
            int r0 = r4.SCROLL_ORIENTATION
            if (r0 != 0) goto L64
            return r3
        L5c:
            r4.initOrResetVelocityTracker()
            android.view.VelocityTracker r0 = r4.mVelocityTracker
            r0.addMovement(r5)
        L64:
            boolean r5 = super.onInterceptTouchEvent(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.detail.ttdetail.widget.scrollerlayout.TTDetailScrollerLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006a, code lost:
        if (r6 != 6) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00fe  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.detail.ttdetail.widget.scrollerlayout.TTDetailScrollerLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    private boolean canScrollVertically() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1eab6eab", new Object[]{this})).booleanValue() : !isScrollTop() || !isScrollBottom();
    }

    private int getScrollRange() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("512138b4", new Object[]{this})).intValue();
        }
        if (getChildCount() <= 0) {
            return 0;
        }
        return Math.max(0, computeVerticalScrollRange() - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    private void fling(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eac96b80", new Object[]{this, new Integer(i)});
            return;
        }
        c.a(TAG, "fling");
        int i2 = (int) (i * 1.25d);
        if (Math.abs(i2) > this.mMinimumVelocity) {
            this.mScroller.fling(0, this.mSecondScrollY, 1, i2, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
            setScrollState(2);
            this.mLastScrollerY = this.mSecondScrollY;
            invalidate();
            return;
        }
        c.a(TAG, "no fling");
        checkTargetsScroll(true, false);
    }

    @Override // android.view.View
    public void computeScroll() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cab3086b", new Object[]{this});
        } else if (this.mScrollToIndex != -1 && (i = this.mSmoothScrollOffset) != 0) {
            if (i > 0 && i < 200) {
                this.mSmoothScrollOffset = i + 1;
            }
            int i2 = this.mSmoothScrollOffset;
            if (i2 < 0 && i2 > -200) {
                this.mSmoothScrollOffset = i2 - 1;
            }
            dispatchScroll(this.mSmoothScrollOffset);
            this.mCycleCount++;
            invalidate();
        } else {
            if (this.mScroller.computeScrollOffset()) {
                int currY = this.mScroller.getCurrY();
                int i3 = currY - this.mLastScrollerY;
                this.mLastScrollerY = currY;
                int i4 = this.mSecondScrollY;
                dispatchScroll(i3);
                int i5 = i3 - (this.mSecondScrollY - i4);
                if ((i5 < 0 && isScrollTop()) || (i5 > 0 && isScrollBottom())) {
                    stopScroll();
                }
                invalidate();
            }
            if (this.mScrollState != 2 || !this.mScroller.isFinished()) {
                return;
            }
            checkTargetsScroll(false, false);
            setScrollState(0);
        }
    }

    private void dispatchScroll(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fad83d5", new Object[]{this, new Integer(i)});
        } else if (i > 0) {
            scrollUp(i);
        } else if (i >= 0) {
        } else {
            scrollDown(i);
        }
    }

    private void scrollUp(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        View bottomView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a483a14", new Object[]{this, new Integer(i)});
            return;
        }
        c.a(TAG, "scrollUp:" + i);
        int computeVerticalScrollOffset = computeVerticalScrollOffset();
        do {
            int i6 = this.mScrollToIndex;
            if (i6 != -1) {
                int top = getChildAt(i6).getTop();
                int i7 = this.mScrollToIndexWithOffset;
                i2 = top - i7;
                i3 = i7 < 0 ? getViewsScrollOffset(this.mScrollToIndex) : 0;
                if (this.mCycleCount >= 1000 || getScrollY() + getPaddingTop() + i3 >= i2 || isScrollBottom()) {
                    this.mScrollToIndex = -1;
                    this.mSmoothScrollOffset = 0;
                    this.mScrollToIndexWithOffset = 0;
                    this.mCycleCount = 0;
                    setScrollState(0);
                    break;
                }
            } else {
                i2 = 0;
                i3 = 0;
            }
            int scrollY = getScrollY();
            if (!isScrollBottom() && scrollY >= 0) {
                if (getScrollY() < this.mScrollRange) {
                    bottomView = findFirstVisibleView();
                } else {
                    bottomView = getBottomView();
                }
                if (bottomView != null) {
                    awakenScrollBars();
                    int e = b.e(bottomView);
                    c.a(TAG, "bottomOffset:" + e);
                    if (e > 0) {
                        int min = Math.min(i, e);
                        if (this.mScrollToIndex != -1) {
                            min = Math.min(min, i2 - ((getScrollY() + getPaddingTop()) + i3));
                        }
                        scrollChild(bottomView, min);
                        i5 = min;
                    } else {
                        int min2 = Math.min(i, (bottomView.getBottom() - getPaddingTop()) - getScrollY());
                        i5 = this.mScrollToIndex != -1 ? Math.min(min2, i2 - ((getScrollY() + getPaddingTop()) + i3)) : min2;
                        scrollSelf(scrollY + i5);
                    }
                    this.mSecondScrollY += i5;
                    i -= i5;
                }
                i5 = 0;
            } else {
                if (this.mTouching) {
                    if (scrollY >= 0 || i <= Math.abs(scrollY)) {
                        i = 0;
                    } else {
                        i5 = i - Math.abs(scrollY);
                        i -= i5;
                    }
                } else if (!this.mScroller.isFinished() && this.mScroller.getFinalY() > 0 && scrollY < 0) {
                    if (i > Math.abs(scrollY)) {
                        int abs = i - Math.abs(scrollY);
                        i4 = i - abs;
                        i = abs;
                    } else {
                        i4 = 0;
                    }
                    this.mSecondScrollY += i;
                    scrollSelf(scrollY + i);
                    int i8 = i4;
                    i5 = i;
                    i = i8;
                } else if (scrollY < 0) {
                    this.mScroller.forceFinished(true);
                }
                i5 = 0;
            }
            if (i5 <= 0) {
                break;
            }
        } while (i > 0);
        int computeVerticalScrollOffset2 = computeVerticalScrollOffset();
        if (computeVerticalScrollOffset == computeVerticalScrollOffset2) {
            return;
        }
        scrollChange(computeVerticalScrollOffset2, computeVerticalScrollOffset);
    }

    private void scrollDown(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        View bottomView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4527fad", new Object[]{this, new Integer(i)});
            return;
        }
        c.a(TAG, "scrollDown:" + i);
        int computeVerticalScrollOffset = computeVerticalScrollOffset();
        do {
            int i7 = this.mScrollToIndex;
            if (i7 != -1) {
                i2 = getChildAt(i7).getTop() - this.mScrollToIndexWithOffset;
                i3 = getViewsScrollOffset(this.mScrollToIndex);
                if (this.mCycleCount >= 1000 || getScrollY() + getPaddingTop() + i3 <= i2 || isScrollTop()) {
                    this.mScrollToIndex = -1;
                    this.mSmoothScrollOffset = 0;
                    this.mScrollToIndexWithOffset = 0;
                    this.mCycleCount = 0;
                    setScrollState(0);
                    break;
                }
            } else {
                i2 = 0;
                i3 = 0;
            }
            int scrollY = getScrollY();
            if (isScrollTop() || scrollY > (i6 = this.mScrollRange) || scrollY < 0) {
                if (this.mTouching) {
                    int i8 = this.mScrollRange;
                    int i9 = scrollY - i8;
                    if (scrollY <= i8 || Math.abs(i) <= i9) {
                        i = 0;
                    } else {
                        i5 = -i9;
                        i -= i5;
                    }
                } else {
                    if (!this.mScroller.isFinished()) {
                        int finalY = this.mScroller.getFinalY();
                        int i10 = this.mScrollRange;
                        if (finalY < i10 && scrollY > i10) {
                            int i11 = i10 - scrollY;
                            if (i < i11) {
                                i4 = i - i11;
                                i = i11;
                            } else {
                                i4 = 0;
                            }
                            this.mSecondScrollY += i;
                            scrollSelf(scrollY + i);
                            int i12 = i4;
                            i5 = i;
                            i = i12;
                        }
                    }
                    if (scrollY > this.mScrollRange) {
                        this.mScroller.forceFinished(true);
                    }
                }
                i5 = 0;
            } else {
                if (scrollY < i6) {
                    bottomView = findLastVisibleView();
                } else {
                    bottomView = getBottomView();
                }
                if (bottomView != null) {
                    int d = b.d(bottomView);
                    if (d < 0) {
                        int max = Math.max(i, d);
                        if (this.mScrollToIndex != -1) {
                            max = Math.max(max, i2 - ((getScrollY() + getPaddingTop()) + i3));
                        }
                        scrollChild(bottomView, max);
                        i5 = max;
                    } else {
                        int max2 = Math.max(Math.max(i, ((bottomView.getTop() + getPaddingBottom()) - scrollY) - getHeight()), -scrollY);
                        i5 = this.mScrollToIndex != -1 ? Math.max(max2, i2 - ((getScrollY() + getPaddingTop()) + i3)) : max2;
                        scrollSelf(scrollY + i5);
                    }
                    this.mSecondScrollY += i5;
                    i -= i5;
                }
                i5 = 0;
            }
            if (i5 >= 0) {
                break;
            }
        } while (i < 0);
        int computeVerticalScrollOffset2 = computeVerticalScrollOffset();
        if (computeVerticalScrollOffset == computeVerticalScrollOffset2) {
            return;
        }
        scrollChange(computeVerticalScrollOffset2, computeVerticalScrollOffset);
    }

    @Override // android.view.View
    public void scrollBy(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65213c2b", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            scrollTo(0, this.mSecondScrollY + i2);
        }
    }

    @Override // android.view.View
    public void scrollTo(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1f8134f", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            dispatchScroll(i2 - this.mSecondScrollY);
        }
    }

    private void scrollChange(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("920ede44", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        a aVar = this.mOnScrollChangeListener;
        if (aVar == null) {
            return;
        }
        aVar.a(this, i, i2, this.mScrollState);
    }

    public void scrollSelf(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31fdef43", new Object[]{this, new Integer(i)});
            return;
        }
        c.a(TAG, "scrollSelf:" + i);
        if (i < 0) {
            i = 0;
        } else {
            int i2 = this.mScrollRange;
            if (i > i2) {
                i = i2;
            }
        }
        super.scrollTo(0, i);
    }

    private void scrollChild(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f3fe8c7", new Object[]{this, view, new Integer(i)});
            return;
        }
        c.a(TAG, "scrollChild:" + i);
        View g = b.g(view);
        if (g instanceof AbsListView) {
            AbsListView absListView = (AbsListView) g;
            if (Build.VERSION.SDK_INT < 19) {
                return;
            }
            absListView.scrollListBy(i);
            return;
        }
        g.scrollBy(0, i);
    }

    public void checkLayoutChange(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6812b869", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        c.a(TAG, "checkLayoutChange: mSecondScrollY;" + this.mSecondScrollY);
        c.a(TAG, "mScrollToTopView;" + this.mScrollToTopView + "changed:" + z);
        View view = this.mScrollToTopView;
        if (view != null && z) {
            if (indexOfChild(view) != -1) {
                scrollSelf(this.mScrollToTopView.getTop() + this.mAdjust);
            }
        } else {
            c.a(TAG, "getScrollY;" + getScrollY());
            scrollSelf(getScrollY());
        }
        checkTargetsScroll(z, z2);
        this.mScrollToTopView = null;
        this.mAdjust = 0;
    }

    public void checkTargetsScroll(boolean z, boolean z2) {
        int computeVerticalScrollOffset;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b25ca4e", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        c.a(TAG, "checkTargetsScroll================================================");
        if (!z2 && (this.mTouching || !this.mScroller.isFinished() || this.mScrollToIndex != -1)) {
            return;
        }
        int computeVerticalScrollOffset2 = computeVerticalScrollOffset();
        c.a(TAG, "oldScrollY:" + computeVerticalScrollOffset2);
        View findFirstVisibleView = findFirstVisibleView();
        if (findFirstVisibleView == null) {
            return;
        }
        c.a(TAG, "target:" + findFirstVisibleView);
        int indexOfChild = indexOfChild(findFirstVisibleView);
        c.a(TAG, "isLayoutChange:" + z + "第" + indexOfChild + "个");
        if (z) {
            while (true) {
                int e = b.e(findFirstVisibleView);
                int top = findFirstVisibleView.getTop() - getScrollY();
                if (e <= 0 || top >= 0) {
                    break;
                }
                int min = Math.min(e, -top);
                scrollSelf(getScrollY() - min);
                scrollChild(findFirstVisibleView, min);
            }
        }
        View findLastVisibleView = findLastVisibleView();
        if (findFirstVisibleView.getVisibility() != 8) {
            if (findLastVisibleView == findFirstVisibleView) {
                return;
            }
            int e2 = b.e(findFirstVisibleView);
            v i = b.i(findFirstVisibleView);
            if (i != null && e2 > 0) {
                i.a(Integer.MAX_VALUE);
            }
        }
        for (int i2 = 0; i2 < indexOfChild; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                int e3 = b.e(childAt);
                v i3 = b.i(childAt);
                if (i3 != null && e3 > 0) {
                    i3.a(Integer.MAX_VALUE);
                }
            }
        }
        for (int i4 = indexOfChild + 1; i4 < getChildCount(); i4++) {
            View childAt2 = getChildAt(i4);
            if (childAt2.getVisibility() != 8 && (i4 != getChildCount() - 1 || childAt2.getHeight() >= getHeight() || getScrollY() < this.mScrollRange)) {
                int d = b.d(childAt2);
                v i5 = b.i(childAt2);
                if (i5 != null && d < 0) {
                    i5.a(0);
                }
            }
        }
        computeOwnScrollOffset();
        if (!z || computeVerticalScrollOffset2 == (computeVerticalScrollOffset = computeVerticalScrollOffset())) {
            return;
        }
        scrollChange(computeVerticalScrollOffset, computeVerticalScrollOffset2);
    }

    public void fixTargetsScroll(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9905ef13", new Object[]{this, new Boolean(z)});
            return;
        }
        try {
            c.a(TAG, "fixTargetsScroll start");
            if (!z && (this.mTouching || !this.mScroller.isFinished() || this.mScrollToIndex != -1)) {
                return;
            }
            int computeVerticalScrollOffset = computeVerticalScrollOffset();
            c.a(TAG, "oldScrollY:" + computeVerticalScrollOffset);
            View findFirstVisibleView = findFirstVisibleView();
            if (findFirstVisibleView == null) {
                return;
            }
            c.a(TAG, "target:" + findFirstVisibleView);
            int indexOfChild = indexOfChild(findFirstVisibleView);
            c.a(TAG, "isLayoutChange: 第" + indexOfChild + "个");
            while (true) {
                int e = b.e(findFirstVisibleView);
                int top = findFirstVisibleView.getTop() - getScrollY();
                if (e <= 0 || top >= 0) {
                    break;
                }
                int min = Math.min(e, -top);
                scrollSelf(getScrollY() - min);
                scrollChild(findFirstVisibleView, min);
            }
            c.a(TAG, "fixTargetsScroll end");
        } catch (Exception e2) {
            i.a(TAG, "fixTargetsScroll error", e2);
        }
    }

    public void scrollChildContentToTop(View view) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71c9271b", new Object[]{this, view});
            return;
        }
        c.a(TAG, "scrollChildContentToTop:" + view);
        do {
            int d = b.d(view);
            if (d < 0) {
                int a2 = b.a(view);
                scrollChild(view, d);
                i = a2 - b.a(view);
                continue;
            } else {
                i = 0;
                continue;
            }
        } while (i != 0);
    }

    public void scrollChildContentToBottom(View view) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a7b811b", new Object[]{this, view});
            return;
        }
        c.a(TAG, "scrollChildContentToBottom:" + view);
        if (view instanceof ListView) {
            ListView listView = (ListView) view;
            if (listView.getAdapter() != null) {
                listView.setSelection(listView.getAdapter().getCount() - 1);
                return;
            }
        }
        do {
            int e = b.e(view);
            if (e > 0) {
                int a2 = b.a(view);
                scrollChild(view, e);
                i = a2 - b.a(view);
                continue;
            } else {
                i = 0;
                continue;
            }
        } while (i != 0);
    }

    private void computeOwnScrollOffset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f0c4436", new Object[]{this});
            return;
        }
        this.mSecondScrollY = computeVerticalScrollOffset();
        c.a(TAG, "computeOwnScrollOffset: mSecondScrollY" + this.mSecondScrollY);
    }

    private void initOrResetVelocityTracker() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f090a706", new Object[]{this});
            return;
        }
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    private void initVelocityTrackerIfNotExists() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba8ad40e", new Object[]{this});
        } else if (this.mVelocityTracker != null) {
        } else {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
    }

    private void recycleVelocityTracker() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a86dd0f", new Object[]{this});
            return;
        }
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker == null) {
            return;
        }
        velocityTracker.recycle();
        this.mVelocityTracker = null;
    }

    private void initOrResetAdjustVelocityTracker() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6b5bbf7", new Object[]{this});
            return;
        }
        VelocityTracker velocityTracker = this.mAdjustVelocityTracker;
        if (velocityTracker == null) {
            this.mAdjustVelocityTracker = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    private void initAdjustVelocityTrackerIfNotExists() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57cb8f7d", new Object[]{this});
        } else if (this.mAdjustVelocityTracker != null) {
        } else {
            this.mAdjustVelocityTracker = VelocityTracker.obtain();
        }
    }

    private void recycleAdjustVelocityTracker() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecc38740", new Object[]{this});
            return;
        }
        VelocityTracker velocityTracker = this.mAdjustVelocityTracker;
        if (velocityTracker == null) {
            return;
        }
        velocityTracker.recycle();
        this.mAdjustVelocityTracker = null;
    }

    public void stopScroll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ec88676", new Object[]{this});
        } else if (this.mScroller.isFinished()) {
        } else {
            this.mScroller.abortAnimation();
            if (this.mScrollToIndex != -1) {
                return;
            }
            setScrollState(0);
        }
    }

    private View getBottomView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("47876bef", new Object[]{this});
        }
        List<View> effectiveChildren = getEffectiveChildren();
        if (effectiveChildren.isEmpty()) {
            return null;
        }
        return effectiveChildren.get(effectiveChildren.size() - 1);
    }

    public List<View> getNonGoneChildren() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("38c8bfcb", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                arrayList.add(childAt);
            }
        }
        return arrayList;
    }

    public List<View> getEffectiveChildren() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("3f60d8d0", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8 && childAt.getHeight() > 0) {
                arrayList.add(childAt);
            }
        }
        return arrayList;
    }

    public int getScrollState() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("199fa08", new Object[]{this})).intValue() : this.mScrollState;
    }

    public void setScrollState(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5a2509a", new Object[]{this, new Integer(i)});
        } else if (i == this.mScrollState) {
        } else {
            this.mScrollState = i;
            int computeVerticalScrollOffset = computeVerticalScrollOffset();
            scrollChange(computeVerticalScrollOffset, computeVerticalScrollOffset);
            if (this.mScrollState != 0) {
                return;
            }
            checkLayoutChange(false, false);
        }
    }

    public int getOwnScrollY() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e90ff736", new Object[]{this})).intValue() : computeVerticalScrollOffset();
    }

    public View findFirstVisibleView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("7a133e49", new Object[]{this});
        }
        int scrollY = getScrollY() + getPaddingTop();
        List<View> effectiveChildren = getEffectiveChildren();
        int size = effectiveChildren.size();
        for (int i = 0; i < size; i++) {
            View view = effectiveChildren.get(i);
            if (view.getTop() <= scrollY && view.getBottom() > scrollY) {
                return view;
            }
        }
        return null;
    }

    public void findAllVisibleView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b55864f6", new Object[]{this});
            return;
        }
        int scrollY = getScrollY() + getPaddingTop();
        List<View> effectiveChildren = getEffectiveChildren();
        int size = effectiveChildren.size();
        for (int i = 0; i < size; i++) {
            View view = effectiveChildren.get(i);
            c.a("www", "findFirstVisibleView 第" + i + "个 offset:" + scrollY + "getTop:" + view.getTop() + "getBottom:" + view.getBottom());
            if (view.getTop() <= scrollY && view.getBottom() > scrollY) {
                c.a("www", "findFirstVisibleView 第" + i + "个");
            }
        }
    }

    public View findLastVisibleView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("7dcc2dd1", new Object[]{this});
        }
        int height = (getHeight() - getPaddingBottom()) + getScrollY();
        List<View> effectiveChildren = getEffectiveChildren();
        int size = effectiveChildren.size();
        for (int i = 0; i < size; i++) {
            View view = effectiveChildren.get(i);
            if (view.getTop() < height && view.getBottom() >= height) {
                return view;
            }
        }
        return null;
    }

    public boolean isScrollTop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5890cac9", new Object[]{this})).booleanValue();
        }
        List<View> effectiveChildren = getEffectiveChildren();
        int size = effectiveChildren.size();
        if (size <= 0) {
            return true;
        }
        boolean z = getScrollY() <= 0 && !b.a(effectiveChildren.get(0), -1);
        if (z) {
            for (int i = size - 1; i >= 0; i--) {
                if (b.a(effectiveChildren.get(i), -1)) {
                    return false;
                }
            }
        }
        return z;
    }

    public boolean isScrollBottom() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dfc0352d", new Object[]{this})).booleanValue();
        }
        c.a(TAG, "isScrollBottom");
        List<View> effectiveChildren = getEffectiveChildren();
        int size = effectiveChildren.size();
        if (size <= 0) {
            return true;
        }
        boolean z = getScrollY() >= this.mScrollRange && !b.a(effectiveChildren.get(effectiveChildren.size() - 1), 1);
        if (z) {
            for (int i = size - 1; i >= 0; i--) {
                if (b.a(effectiveChildren.get(i), 1)) {
                    return false;
                }
            }
        }
        return z;
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b6c2d940", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (i > 0) {
            boolean isScrollBottom = isScrollBottom();
            c.a(TAG, "canScrollVertically:" + isScrollBottom);
            return !isScrollBottom;
        }
        boolean isScrollTop = isScrollTop();
        c.a(TAG, "canScrollVertically:" + isScrollTop);
        return !isScrollTop;
    }

    public void setOnVerticalScrollChangeListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e3e9e0d", new Object[]{this, aVar});
        } else {
            this.mOnScrollChangeListener = aVar;
        }
    }

    public a getOnVerticalScrollChangeListener() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("9c62c2f", new Object[]{this}) : this.mOnScrollChangeListener;
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("50def9af", new Object[]{this})).intValue() : super.computeHorizontalScrollRange();
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("13189415", new Object[]{this})).intValue() : super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ce1ecb2c", new Object[]{this})).intValue() : super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cf191e5d", new Object[]{this})).intValue();
        }
        List<View> nonGoneChildren = getNonGoneChildren();
        int size = nonGoneChildren.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            View view = nonGoneChildren.get(i2);
            if (b.f(view)) {
                View g = b.g(view);
                i += b.b(g) + g.getPaddingTop() + g.getPaddingBottom();
            } else {
                i += view.getHeight();
            }
        }
        return i;
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5c230527", new Object[]{this})).intValue();
        }
        int scrollY = getScrollY();
        List<View> nonGoneChildren = getNonGoneChildren();
        int size = nonGoneChildren.size();
        for (int i = 0; i < size; i++) {
            scrollY += b.a(nonGoneChildren.get(i));
        }
        return scrollY;
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("17293c3e", new Object[]{this})).intValue() : (getHeight() - getPaddingTop()) - getPaddingBottom();
    }

    private View getTouchTarget(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("fc812623", new Object[]{this, new Integer(i), new Integer(i2)});
        }
        for (View view : getNonGoneChildren()) {
            if (b.b(view, i, i2)) {
                return view;
            }
        }
        return null;
    }

    private boolean isIntercept(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4f6da498", new Object[]{this, motionEvent})).booleanValue();
        }
        int findPointerIndex = motionEvent.findPointerIndex(this.mActivePointerId);
        if (findPointerIndex >= 0 && findPointerIndex < motionEvent.getPointerCount()) {
            return isIntercept(b.a(this, motionEvent, findPointerIndex), b.b(this, motionEvent, findPointerIndex));
        }
        return true;
    }

    private boolean isIntercept(int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("346f57e3", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue() : getTouchTarget(i, i2) != null;
    }

    /* loaded from: classes5.dex */
    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public v f11048a;
        public x b;

        static {
            kge.a(-1052964692);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public void scrollToChild(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ef20697", new Object[]{this, view});
        } else {
            scrollToChildWithOffset(view, 0);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0047, code lost:
        if (com.taobao.android.detail.ttdetail.widget.scrollerlayout.b.a(r9, -1) != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0066, code lost:
        if (((getScrollY() + getPaddingTop()) + r9) < r5) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void scrollToChildWithOffset(android.view.View r9, int r10) {
        /*
            r8 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.detail.ttdetail.widget.scrollerlayout.TTDetailScrollerLayout.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 2
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L1d
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r8
            r1[r4] = r9
            java.lang.Integer r9 = new java.lang.Integer
            r9.<init>(r10)
            r1[r2] = r9
            java.lang.String r9 = "971cbc65"
            r0.ipc$dispatch(r9, r1)
            return
        L1d:
            int r0 = r8.indexOfChild(r9)
            r1 = -1
            if (r0 == r1) goto L8b
            int r5 = r9.getTop()
            int r5 = r5 - r10
            if (r10 < 0) goto L4a
            int r6 = r8.getScrollY()
            int r7 = r8.getPaddingTop()
            int r6 = r6 + r7
            if (r6 <= r5) goto L37
            goto L5a
        L37:
            int r6 = r8.getScrollY()
            int r7 = r8.getPaddingTop()
            int r6 = r6 + r7
            if (r6 >= r5) goto L43
            goto L68
        L43:
            boolean r9 = com.taobao.android.detail.ttdetail.widget.scrollerlayout.b.a(r9, r1)
            if (r9 == 0) goto L69
            goto L5a
        L4a:
            int r9 = r8.getViewsScrollOffset(r0)
            int r6 = r8.getScrollY()
            int r7 = r8.getPaddingTop()
            int r6 = r6 + r7
            int r6 = r6 + r9
            if (r6 <= r5) goto L5c
        L5a:
            r3 = -1
            goto L69
        L5c:
            int r6 = r8.getScrollY()
            int r7 = r8.getPaddingTop()
            int r6 = r6 + r7
            int r6 = r6 + r9
            if (r6 >= r5) goto L69
        L68:
            r3 = 1
        L69:
            if (r3 == 0) goto L8b
            r8.mScrollToIndex = r0
            r8.stopScroll()
            r8.mScrollToIndexWithOffset = r10
            r8.setScrollState(r2)
        L75:
            if (r3 >= 0) goto L7d
            r9 = -200(0xffffffffffffff38, float:NaN)
            r8.dispatchScroll(r9)
            goto L82
        L7d:
            r9 = 200(0xc8, float:2.8E-43)
            r8.dispatchScroll(r9)
        L82:
            int r9 = r8.mCycleCount
            int r9 = r9 + r4
            r8.mCycleCount = r9
            int r9 = r8.mScrollToIndex
            if (r9 != r1) goto L75
        L8b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.detail.ttdetail.widget.scrollerlayout.TTDetailScrollerLayout.scrollToChildWithOffset(android.view.View, int):void");
    }

    public void smoothScrollToChild(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cb7b165", new Object[]{this, view});
        } else {
            smoothScrollToChildWithOffset(view, 0);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0047, code lost:
        if (com.taobao.android.detail.ttdetail.widget.scrollerlayout.b.a(r9, -1) != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0065, code lost:
        if (((getScrollY() + getPaddingTop()) + r9) < r5) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0069, code lost:
        r1 = 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void smoothScrollToChildWithOffset(android.view.View r9, int r10) {
        /*
            r8 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.detail.ttdetail.widget.scrollerlayout.TTDetailScrollerLayout.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 2
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L1d
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r8
            r1[r4] = r9
            java.lang.Integer r9 = new java.lang.Integer
            r9.<init>(r10)
            r1[r2] = r9
            java.lang.String r9 = "34fbe4d7"
            r0.ipc$dispatch(r9, r1)
            return
        L1d:
            int r0 = r8.indexOfChild(r9)
            r1 = -1
            if (r0 == r1) goto L84
            int r5 = r9.getTop()
            int r5 = r5 - r10
            if (r10 < 0) goto L4a
            int r6 = r8.getScrollY()
            int r7 = r8.getPaddingTop()
            int r6 = r6 + r7
            if (r6 <= r5) goto L37
            goto L6a
        L37:
            int r6 = r8.getScrollY()
            int r7 = r8.getPaddingTop()
            int r6 = r6 + r7
            if (r6 >= r5) goto L43
            goto L67
        L43:
            boolean r9 = com.taobao.android.detail.ttdetail.widget.scrollerlayout.b.a(r9, r1)
            if (r9 == 0) goto L69
            goto L6a
        L4a:
            int r9 = r8.getViewsScrollOffset(r0)
            int r6 = r8.getScrollY()
            int r7 = r8.getPaddingTop()
            int r6 = r6 + r7
            int r6 = r6 + r9
            if (r6 <= r5) goto L5b
            goto L6a
        L5b:
            int r1 = r8.getScrollY()
            int r6 = r8.getPaddingTop()
            int r1 = r1 + r6
            int r1 = r1 + r9
            if (r1 >= r5) goto L69
        L67:
            r1 = 1
            goto L6a
        L69:
            r1 = 0
        L6a:
            if (r1 == 0) goto L84
            r8.mScrollToIndex = r0
            r8.stopScroll()
            r8.mScrollToIndexWithOffset = r10
            r8.setScrollState(r2)
            if (r1 >= 0) goto L7d
            r9 = -50
            r8.mSmoothScrollOffset = r9
            goto L81
        L7d:
            r9 = 50
            r8.mSmoothScrollOffset = r9
        L81:
            r8.invalidate()
        L84:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.detail.ttdetail.widget.scrollerlayout.TTDetailScrollerLayout.smoothScrollToChildWithOffset(android.view.View, int):void");
    }

    private int getViewsScrollOffset(int i) {
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c0fd73b7", new Object[]{this, new Integer(i)})).intValue();
        }
        int childCount = getChildCount();
        while (i < childCount) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                i2 += b.a(childAt);
            }
            i++;
        }
        return i2;
    }

    public boolean isDisableChildHorizontalScroll() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("38a9069a", new Object[]{this})).booleanValue() : this.disableChildHorizontalScroll;
    }

    public void setDisableChildHorizontalScroll(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b69b96c6", new Object[]{this, new Boolean(z)});
        } else {
            this.disableChildHorizontalScroll = z;
        }
    }
}
