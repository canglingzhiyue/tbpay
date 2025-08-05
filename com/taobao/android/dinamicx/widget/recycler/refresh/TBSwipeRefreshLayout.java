package com.taobao.android.dinamicx.widget.recycler.refresh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.view.MotionEventCompat;
import android.support.v4.view.ViewCompat;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.model.f;
import com.taobao.android.dinamicx.widget.recycler.refresh.TBAbsRefreshHeader;
import com.taobao.android.dinamicx.widget.recycler.refresh.TBLoadMoreFooter;
import com.taobao.taobao.R;
import tb.gbe;
import tb.kge;

/* loaded from: classes5.dex */
public class TBSwipeRefreshLayout extends ViewGroup {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int ANIMATE_TO_BOTTOM_DURATION = 300;
    private static final int ANIMATE_TO_START_DURATION = 300;
    private static final int ANIMATE_TO_TRIGGER_DURATION = 300;
    private static final float DECELERATE_INTERPOLATION_FACTOR = 2.0f;
    private static final float DRAG_RATE = 1.0f;
    private static int FOOTER_VIEW_HEIGHT = 0;
    private static int FOOTER_VIEW_MAX_HEIGHT = 0;
    private static int HEADER_VIEW_HEIGHT = 0;
    private static final int INVALID_POINTER = -1;
    private static final int[] LAYOUT_ATTRS;
    private static int MIN_GAP_DISTANCE_TO_SECOND_FLOOR = 0;
    private static final String TAG = "TBSwipeRefreshLayout";
    private int mActivePointerId;
    private long mAutoRefreshDuration;
    private int mContentHeight;
    public int mCurrentTargetOffsetTop;
    private DecelerateInterpolator mDecelerateInterpolator;
    public float mDensity;
    public DisplayMetrics mDisplayMetrics;
    private int mDistance;
    private float mDragRate;
    private boolean mEnableTargetOffset;
    private TBLoadMoreFooter mFooterView;
    public int mFooterViewHeight;
    private int mFooterViewIndex;
    public int mFooterViewWidth;
    public int mFrom;
    private TBAbsRefreshHeader mHeaderView;
    public int mHeaderViewHeight;
    private int mHeaderViewIndex;
    public int mHeaderViewWidth;
    private float mInitialMotionY;
    private boolean mIsBeingDragged;
    private boolean mIsMultiPointer;
    private float mLastMotionY;
    private boolean mLazyLoadMoreEnable;
    private boolean mLazyPullRefreshEnable;
    private boolean mLoadMoreEnabled;
    private boolean mLoadingMore;
    private int mMaxPullDistance;
    private int mMaxPushDistance;
    private int mNavigationBarHeight;
    private boolean mNotify;
    private a mOnChildScrollUpCallback;
    private c mOnPushLoadMoreListener;
    private boolean mOriginalOffsetCalculated;
    public int mOriginalOffsetTop;
    private int mPositionY;
    private int mPreActivePointerId;
    private int mPreDistance;
    private int mPrePositionY;
    private boolean mPullRefreshEnabled;
    private b mPullRefreshListener;
    private int mPushDistance;
    private Animator.AnimatorListener mRefreshListener;
    public int mRefreshOffset;
    private boolean mRefreshing;
    private int mSecondFloorDistance;
    private boolean mSecondFloorEnabled;
    private int mStartY;
    private View mTarget;
    private boolean mTargetScrollWithLayout;
    private int mTotalDragDistance;
    public int mTouchSlop;

    /* loaded from: classes5.dex */
    public interface a {
        boolean a(TBSwipeRefreshLayout tBSwipeRefreshLayout);
    }

    /* loaded from: classes5.dex */
    public interface b {
        void a();

        void a(int i);
    }

    /* loaded from: classes5.dex */
    public interface c {
    }

    public static /* synthetic */ Object ipc$super(TBSwipeRefreshLayout tBSwipeRefreshLayout, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -349229044) {
            super.onConfigurationChanged((Configuration) objArr[0]);
            return null;
        } else if (hashCode != 650865254) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
            return null;
        }
    }

    private void updateLoadMoreListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43d6b29f", new Object[]{this});
        }
    }

    public static /* synthetic */ TBAbsRefreshHeader access$000(TBSwipeRefreshLayout tBSwipeRefreshLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBAbsRefreshHeader) ipChange.ipc$dispatch("917a4834", new Object[]{tBSwipeRefreshLayout}) : tBSwipeRefreshLayout.mHeaderView;
    }

    public static /* synthetic */ boolean access$100(TBSwipeRefreshLayout tBSwipeRefreshLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("28960666", new Object[]{tBSwipeRefreshLayout})).booleanValue() : tBSwipeRefreshLayout.mRefreshing;
    }

    public static /* synthetic */ c access$1000(TBSwipeRefreshLayout tBSwipeRefreshLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("525c8491", new Object[]{tBSwipeRefreshLayout}) : tBSwipeRefreshLayout.mOnPushLoadMoreListener;
    }

    public static /* synthetic */ boolean access$1102(TBSwipeRefreshLayout tBSwipeRefreshLayout, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9fc08be5", new Object[]{tBSwipeRefreshLayout, new Boolean(z)})).booleanValue();
        }
        tBSwipeRefreshLayout.mLoadingMore = z;
        return z;
    }

    public static /* synthetic */ TBLoadMoreFooter access$1200(TBSwipeRefreshLayout tBSwipeRefreshLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBLoadMoreFooter) ipChange.ipc$dispatch("fcbfa743", new Object[]{tBSwipeRefreshLayout}) : tBSwipeRefreshLayout.mFooterView;
    }

    public static /* synthetic */ boolean access$200(TBSwipeRefreshLayout tBSwipeRefreshLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("90f5c67", new Object[]{tBSwipeRefreshLayout})).booleanValue() : tBSwipeRefreshLayout.mNotify;
    }

    public static /* synthetic */ b access$300(TBSwipeRefreshLayout tBSwipeRefreshLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("4426645e", new Object[]{tBSwipeRefreshLayout}) : tBSwipeRefreshLayout.mPullRefreshListener;
    }

    public static /* synthetic */ void access$400(TBSwipeRefreshLayout tBSwipeRefreshLayout, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("763f773e", new Object[]{tBSwipeRefreshLayout, new Integer(i)});
        } else {
            tBSwipeRefreshLayout.updateHeaderPosition(i);
        }
    }

    public static /* synthetic */ void access$500(TBSwipeRefreshLayout tBSwipeRefreshLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa7b5e66", new Object[]{tBSwipeRefreshLayout});
        } else {
            tBSwipeRefreshLayout.updatePullListenerCallBack();
        }
    }

    public static /* synthetic */ Animator.AnimatorListener access$600(TBSwipeRefreshLayout tBSwipeRefreshLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Animator.AnimatorListener) ipChange.ipc$dispatch("634e2c4b", new Object[]{tBSwipeRefreshLayout}) : tBSwipeRefreshLayout.mRefreshListener;
    }

    public static /* synthetic */ long access$700(TBSwipeRefreshLayout tBSwipeRefreshLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6b6e0a5c", new Object[]{tBSwipeRefreshLayout})).longValue() : tBSwipeRefreshLayout.mAutoRefreshDuration;
    }

    public static /* synthetic */ int access$802(TBSwipeRefreshLayout tBSwipeRefreshLayout, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ecebeb6b", new Object[]{tBSwipeRefreshLayout, new Integer(i)})).intValue();
        }
        tBSwipeRefreshLayout.mPushDistance = i;
        return i;
    }

    public static /* synthetic */ void access$900(TBSwipeRefreshLayout tBSwipeRefreshLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c60b66a", new Object[]{tBSwipeRefreshLayout});
        } else {
            tBSwipeRefreshLayout.updateFooterPosition();
        }
    }

    static {
        kge.a(824558117);
        HEADER_VIEW_HEIGHT = 72;
        FOOTER_VIEW_HEIGHT = 50;
        FOOTER_VIEW_MAX_HEIGHT = 100;
        MIN_GAP_DISTANCE_TO_SECOND_FLOOR = 20;
        LAYOUT_ATTRS = new int[]{R.attr.uik_swipeRefreshPullRefresh, R.attr.uik_swipeRefreshPushLoad, R.attr.uik_swipeRefreshSecondFloor, R.attr.uik_swipeRefreshHeaderHeight, R.attr.uik_swipeRefreshFooterHeight, R.attr.uik_swipeRefreshLazyPullRefresh, R.attr.uik_swipeRefreshLazyPushLoad};
    }

    public TBSwipeRefreshLayout(Context context) {
        this(context, null);
    }

    public TBSwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mHeaderViewIndex = -1;
        this.mFooterViewIndex = -1;
        this.mLazyPullRefreshEnable = false;
        this.mLazyLoadMoreEnable = false;
        this.mTargetScrollWithLayout = true;
        this.mActivePointerId = -1;
        this.mDragRate = 1.0f;
        this.mTotalDragDistance = -1;
        this.mSecondFloorDistance = -1;
        this.mEnableTargetOffset = true;
        this.mPushDistance = 0;
        this.mAutoRefreshDuration = 2000L;
        this.mIsMultiPointer = false;
        this.mPositionY = 0;
        this.mPrePositionY = 0;
        this.mPreActivePointerId = -1;
        this.mContentHeight = -1;
        this.mNavigationBarHeight = -1;
        this.mRefreshListener = new Animator.AnimatorListener() { // from class: com.taobao.android.dinamicx.widget.recycler.refresh.TBSwipeRefreshLayout.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("90a3af63", new Object[]{this, animator});
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("4388ea84", new Object[]{this, animator});
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3a405721", new Object[]{this, animator});
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                } else if (TBSwipeRefreshLayout.access$000(TBSwipeRefreshLayout.this) == null) {
                } else {
                    if (TBSwipeRefreshLayout.access$100(TBSwipeRefreshLayout.this)) {
                        if (TBSwipeRefreshLayout.access$200(TBSwipeRefreshLayout.this) && TBSwipeRefreshLayout.access$300(TBSwipeRefreshLayout.this) != null) {
                            TBSwipeRefreshLayout.access$300(TBSwipeRefreshLayout.this).a();
                        }
                        TBSwipeRefreshLayout.access$000(TBSwipeRefreshLayout.this).changeToState(TBAbsRefreshHeader.RefreshState.REFRESHING);
                    } else {
                        TBSwipeRefreshLayout tBSwipeRefreshLayout = TBSwipeRefreshLayout.this;
                        TBSwipeRefreshLayout.access$400(tBSwipeRefreshLayout, tBSwipeRefreshLayout.mOriginalOffsetTop - TBSwipeRefreshLayout.this.mCurrentTargetOffsetTop);
                    }
                    TBSwipeRefreshLayout tBSwipeRefreshLayout2 = TBSwipeRefreshLayout.this;
                    tBSwipeRefreshLayout2.mCurrentTargetOffsetTop = TBSwipeRefreshLayout.access$000(tBSwipeRefreshLayout2).getTop();
                    TBSwipeRefreshLayout.access$500(TBSwipeRefreshLayout.this);
                }
            }
        };
        setWillNotDraw(false);
        this.mDisplayMetrics = getResources().getDisplayMetrics();
        this.mDensity = this.mDisplayMetrics.density;
        HEADER_VIEW_HEIGHT = (int) getResources().getDimension(R.dimen.uik_refresh_header_height);
        MIN_GAP_DISTANCE_TO_SECOND_FLOOR = (int) getResources().getDimension(R.dimen.uik_refresh_second_floor_gap);
        FOOTER_VIEW_HEIGHT = (int) getResources().getDimension(R.dimen.uik_refresh_footer_height);
        FOOTER_VIEW_MAX_HEIGHT = (int) getResources().getDimension(R.dimen.uik_refresh_footer_max_height);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, LAYOUT_ATTRS);
        this.mPullRefreshEnabled = obtainStyledAttributes.getBoolean(0, false);
        this.mLoadMoreEnabled = obtainStyledAttributes.getBoolean(1, false);
        this.mSecondFloorEnabled = obtainStyledAttributes.getBoolean(2, false);
        this.mLazyPullRefreshEnable = obtainStyledAttributes.getBoolean(5, false);
        this.mLazyLoadMoreEnable = obtainStyledAttributes.getBoolean(6, false);
        if (this.mSecondFloorEnabled && !this.mPullRefreshEnabled) {
            Log.e(TAG, "Cannot enable second floor when pull to refresh disabled!");
            return;
        }
        this.mHeaderViewWidth = this.mDisplayMetrics.widthPixels;
        this.mHeaderViewHeight = (int) obtainStyledAttributes.getDimension(3, HEADER_VIEW_HEIGHT);
        this.mFooterViewWidth = this.mDisplayMetrics.widthPixels;
        this.mFooterViewHeight = (int) obtainStyledAttributes.getDimension(4, FOOTER_VIEW_HEIGHT);
        obtainStyledAttributes.recycle();
        if (this.mNavigationBarHeight == -1) {
            this.mNavigationBarHeight = gbe.a(getContext());
        }
        if (this.mContentHeight == -1) {
            this.mContentHeight = gbe.e(getContext());
        }
        this.mDecelerateInterpolator = new DecelerateInterpolator(2.0f);
        this.mTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        if (!this.mLazyPullRefreshEnable) {
            createHeaderView();
        }
        if (!this.mLazyLoadMoreEnable) {
            createFooterView();
        }
        ViewCompat.setChildrenDrawingOrderEnabled(this, true);
        this.mRefreshOffset = 0;
        this.mTotalDragDistance = HEADER_VIEW_HEIGHT;
        this.mSecondFloorDistance = this.mTotalDragDistance + MIN_GAP_DISTANCE_TO_SECOND_FLOOR;
        this.mMaxPushDistance = FOOTER_VIEW_MAX_HEIGHT;
        int i = (-this.mContentHeight) + this.mRefreshOffset;
        this.mOriginalOffsetTop = i;
        this.mCurrentTargetOffsetTop = i;
    }

    public void setOnChildScrollUpCallback(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1cf99dc", new Object[]{this, aVar});
        } else {
            this.mOnChildScrollUpCallback = aVar;
        }
    }

    public void createHeaderView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57445275", new Object[]{this});
            return;
        }
        this.mHeaderView = new TBRefreshHeader(getContext());
        b bVar = this.mPullRefreshListener;
        if (bVar != null) {
            this.mHeaderView.setPullRefreshListener(bVar);
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(14);
        layoutParams.addRule(12);
        addView(this.mHeaderView, layoutParams);
    }

    public void createFooterView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ea93783", new Object[]{this});
            return;
        }
        this.mFooterView = new TBDefaultLoadMoreFooter(getContext());
        c cVar = this.mOnPushLoadMoreListener;
        if (cVar != null) {
            this.mFooterView.setPushLoadMoreListener(cVar);
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, this.mFooterViewHeight);
        layoutParams.addRule(14);
        layoutParams.addRule(10);
        addView(this.mFooterView, layoutParams);
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i, int i2) {
        int i3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7aaf12f0", new Object[]{this, new Integer(i), new Integer(i2)})).intValue();
        }
        if (this.mHeaderViewIndex < 0 && this.mFooterViewIndex < 0) {
            return i2;
        }
        int i4 = this.mHeaderViewIndex;
        if (i4 < 0 || (i3 = this.mFooterViewIndex) < 0) {
            int i5 = this.mHeaderViewIndex;
            if (i5 < 0) {
                i5 = this.mFooterViewIndex;
            }
            return i2 == i - 1 ? i5 : i2 >= i5 ? i2 + 1 : i2;
        } else if (i2 == i - 2) {
            return i4;
        } else {
            if (i2 == i - 1) {
                return i3;
            }
            if (i3 > i4) {
                i4 = i3;
            }
            int i6 = this.mFooterViewIndex;
            int i7 = this.mHeaderViewIndex;
            if (i6 >= i7) {
                i6 = i7;
            }
            return (i2 < i6 || i2 >= i4 + (-1)) ? (i2 >= i4 || i2 == i4 - 1) ? i2 + 2 : i2 : i2 + 1;
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        super.onMeasure(i, i2);
        if (this.mTarget == null) {
            ensureTarget();
        }
        View view = this.mTarget;
        if (view == null) {
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
        this.mHeaderViewIndex = -1;
        int i3 = getResources().getDisplayMetrics().widthPixels;
        TBAbsRefreshHeader tBAbsRefreshHeader = this.mHeaderView;
        if (tBAbsRefreshHeader != null) {
            this.mHeaderViewWidth = i3;
            tBAbsRefreshHeader.measure(View.MeasureSpec.makeMeasureSpec(this.mHeaderViewWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(this.mContentHeight, 1073741824));
            int i4 = 0;
            while (true) {
                if (i4 >= getChildCount()) {
                    break;
                } else if (getChildAt(i4) == this.mHeaderView) {
                    this.mHeaderViewIndex = i4;
                    break;
                } else {
                    i4++;
                }
            }
        }
        this.mFooterViewIndex = -1;
        TBLoadMoreFooter tBLoadMoreFooter = this.mFooterView;
        if (tBLoadMoreFooter == null) {
            return;
        }
        this.mFooterViewWidth = i3;
        tBLoadMoreFooter.measure(View.MeasureSpec.makeMeasureSpec(this.mFooterViewWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(this.mMaxPushDistance, 1073741824));
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            if (getChildAt(i5) == this.mFooterView) {
                this.mFooterViewIndex = i5;
                return;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        TBAbsRefreshHeader tBAbsRefreshHeader;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() == 0) {
            return;
        }
        if (this.mTarget == null) {
            ensureTarget();
        }
        if (this.mTarget == null) {
            return;
        }
        int i5 = this.mCurrentTargetOffsetTop + this.mContentHeight;
        if (!this.mTargetScrollWithLayout) {
            i5 = 0;
        }
        View view = this.mTarget;
        int paddingLeft = getPaddingLeft();
        int paddingTop = (getPaddingTop() + i5) - this.mPushDistance;
        view.layout(paddingLeft, this.mEnableTargetOffset ? paddingTop : paddingTop - this.mRefreshOffset, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, (paddingTop + ((measuredHeight - getPaddingTop()) - getPaddingBottom())) - this.mRefreshOffset);
        int i6 = getResources().getDisplayMetrics().widthPixels;
        TBAbsRefreshHeader tBAbsRefreshHeader2 = this.mHeaderView;
        if (tBAbsRefreshHeader2 != null) {
            this.mHeaderViewWidth = i6;
            int i7 = this.mCurrentTargetOffsetTop;
            tBAbsRefreshHeader2.layout(0, i7, this.mHeaderViewWidth, this.mContentHeight + i7);
        }
        if (!this.mSecondFloorEnabled && (tBAbsRefreshHeader = this.mHeaderView) != null) {
            tBAbsRefreshHeader.getSecondFloorView().setVisibility(8);
        }
        TBLoadMoreFooter tBLoadMoreFooter = this.mFooterView;
        if (tBLoadMoreFooter == null) {
            return;
        }
        this.mFooterViewWidth = i6;
        int i8 = this.mPushDistance;
        tBLoadMoreFooter.layout(0, measuredHeight - i8, this.mFooterViewWidth, (measuredHeight + this.mMaxPushDistance) - i8);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        TBLoadMoreFooter tBLoadMoreFooter;
        TBAbsRefreshHeader tBAbsRefreshHeader;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        ensureTarget();
        int actionMasked = MotionEventCompat.getActionMasked(motionEvent);
        boolean isChildScrollToTop = this.mPullRefreshEnabled ? isChildScrollToTop() : false;
        if (!isChildScrollToTop && (tBAbsRefreshHeader = this.mHeaderView) != null && tBAbsRefreshHeader.getCurrentState() != TBAbsRefreshHeader.RefreshState.NONE) {
            isChildScrollToTop = true;
        }
        TBAbsRefreshHeader tBAbsRefreshHeader2 = this.mHeaderView;
        if (tBAbsRefreshHeader2 == null || tBAbsRefreshHeader2.getCurrentState() == TBAbsRefreshHeader.RefreshState.SECOND_FLOOR_START || this.mHeaderView.getCurrentState() == TBAbsRefreshHeader.RefreshState.SECOND_FLOOR_END) {
            isChildScrollToTop = false;
        }
        boolean isChildScrollToBottom = (this.mFooterView != null && this.mLoadMoreEnabled) ? isChildScrollToBottom() : false;
        if (!isChildScrollToBottom && (tBLoadMoreFooter = this.mFooterView) != null && tBLoadMoreFooter.getCurrentState() != TBLoadMoreFooter.LoadMoreState.NONE) {
            isChildScrollToBottom = true;
        }
        if (!isChildScrollToTop && !isChildScrollToBottom) {
            return false;
        }
        if (actionMasked == 0) {
            this.mStartY = (int) motionEvent.getY();
            int actionIndex = MotionEventCompat.getActionIndex(motionEvent);
            if (this.mActivePointerId == -1) {
                this.mActivePointerId = MotionEventCompat.getPointerId(motionEvent, actionIndex);
                this.mLastMotionY = motionEvent.getY();
                this.mPreActivePointerId = this.mActivePointerId;
            }
            this.mIsBeingDragged = false;
            float motionEventY = getMotionEventY(motionEvent, this.mActivePointerId);
            if (motionEventY == -1.0f) {
                return false;
            }
            this.mInitialMotionY = motionEventY;
            TBAbsRefreshHeader tBAbsRefreshHeader3 = this.mHeaderView;
            if (tBAbsRefreshHeader3 != null && tBAbsRefreshHeader3.getCurrentState() == TBAbsRefreshHeader.RefreshState.REFRESHING) {
                setRefreshing(false);
            }
            TBLoadMoreFooter tBLoadMoreFooter2 = this.mFooterView;
            if (tBLoadMoreFooter2 != null && tBLoadMoreFooter2.getCurrentState() == TBLoadMoreFooter.LoadMoreState.LOADING) {
                setLoadMore(false);
            }
        } else {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int i = this.mActivePointerId;
                    if (i == -1) {
                        Log.e(TAG, "Got ACTION_MOVE event but don't have an active pointer id.");
                        return false;
                    }
                    float motionEventY2 = getMotionEventY(motionEvent, i);
                    if (motionEventY2 == -1.0f) {
                        return false;
                    }
                    if (isChildScrollToBottom()) {
                        if (this.mInitialMotionY - motionEventY2 > this.mTouchSlop && !this.mIsBeingDragged) {
                            this.mIsBeingDragged = true;
                        }
                    } else if (isChildScrollToTop() && motionEventY2 - this.mInitialMotionY > this.mTouchSlop && !this.mIsBeingDragged) {
                        this.mIsBeingDragged = true;
                    }
                } else if (actionMasked != 3) {
                    if (actionMasked == 6) {
                        onSecondaryPointerUp(motionEvent);
                    }
                }
            }
            this.mIsBeingDragged = false;
            this.mActivePointerId = -1;
        }
        return this.mIsBeingDragged;
    }

    private float getMotionEventY(MotionEvent motionEvent, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8e85026c", new Object[]{this, motionEvent, new Integer(i)})).floatValue();
        }
        int findPointerIndex = MotionEventCompat.findPointerIndex(motionEvent, i);
        if (findPointerIndex >= 0) {
            return MotionEventCompat.getY(motionEvent, findPointerIndex);
        }
        return -1.0f;
    }

    public void setRefreshTips(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e253df27", new Object[]{this, strArr});
            return;
        }
        TBAbsRefreshHeader tBAbsRefreshHeader = this.mHeaderView;
        if (tBAbsRefreshHeader == null) {
            return;
        }
        tBAbsRefreshHeader.setRefreshTips(strArr);
    }

    public void setLoadMoreTips(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f4990e3", new Object[]{this, strArr});
            return;
        }
        TBLoadMoreFooter tBLoadMoreFooter = this.mFooterView;
        if (tBLoadMoreFooter == null) {
            return;
        }
        tBLoadMoreFooter.setLoadMoreTips(strArr);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        TBLoadMoreFooter tBLoadMoreFooter;
        TBAbsRefreshHeader tBAbsRefreshHeader;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        int actionMasked = MotionEventCompat.getActionMasked(motionEvent);
        boolean isChildScrollToTop = this.mPullRefreshEnabled ? isChildScrollToTop() : false;
        if (!isChildScrollToTop && (tBAbsRefreshHeader = this.mHeaderView) != null && tBAbsRefreshHeader.getCurrentState() != TBAbsRefreshHeader.RefreshState.NONE) {
            isChildScrollToTop = true;
        }
        TBAbsRefreshHeader tBAbsRefreshHeader2 = this.mHeaderView;
        if (tBAbsRefreshHeader2 == null || tBAbsRefreshHeader2.getCurrentState() == TBAbsRefreshHeader.RefreshState.SECOND_FLOOR_START || this.mHeaderView.getCurrentState() == TBAbsRefreshHeader.RefreshState.SECOND_FLOOR_END) {
            isChildScrollToTop = false;
        }
        boolean isChildScrollToBottom = (this.mFooterView != null && this.mLoadMoreEnabled) ? isChildScrollToBottom() : false;
        if (isChildScrollToBottom || (tBLoadMoreFooter = this.mFooterView) == null || tBLoadMoreFooter.getCurrentState() == TBLoadMoreFooter.LoadMoreState.NONE) {
            z = isChildScrollToBottom;
        }
        if (!isChildScrollToTop && !z) {
            return false;
        }
        if (isChildScrollToTop) {
            return handlePullTouchEvent(motionEvent, actionMasked);
        }
        if (!z) {
            return false;
        }
        return handlePushTouchEvent(motionEvent, actionMasked);
    }

    private boolean handlePullTouchEvent(MotionEvent motionEvent, int i) {
        int i2;
        int i3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("53f95aa3", new Object[]{this, motionEvent, new Integer(i)})).booleanValue();
        }
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    if (this.mActivePointerId == -1) {
                        this.mActivePointerId = MotionEventCompat.getPointerId(motionEvent, MotionEventCompat.getActionIndex(motionEvent));
                        this.mLastMotionY = motionEvent.getY();
                        this.mPreActivePointerId = this.mActivePointerId;
                    }
                    try {
                        int y = (int) MotionEventCompat.getY(motionEvent, getPointerIndex(motionEvent, this.mActivePointerId));
                        if (this.mIsMultiPointer) {
                            int i4 = this.mPreActivePointerId;
                            int i5 = this.mActivePointerId;
                            if (i4 == i5) {
                                float f = y;
                                float f2 = this.mLastMotionY;
                                i2 = (int) (this.mDistance + (f - f2));
                                this.mPreDistance = i2;
                                this.mPrePositionY = (int) (this.mPositionY + (f - f2));
                            } else {
                                int i6 = this.mPreDistance;
                                this.mPreActivePointerId = i5;
                                this.mDistance = i6;
                                this.mPositionY = this.mPrePositionY;
                                i2 = (int) (i6 + (y - this.mLastMotionY));
                            }
                        } else {
                            i2 = y - this.mStartY;
                            this.mDistance = i2;
                            this.mPreDistance = i2;
                            this.mPositionY = y;
                            this.mPrePositionY = y;
                        }
                        if (this.mIsBeingDragged) {
                            int min = Math.min(this.mDisplayMetrics.heightPixels, (int) (((int) (i2 * this.mDragRate)) * ((float) ((this.mDisplayMetrics.heightPixels / (this.mDisplayMetrics.heightPixels + i3)) / 1.1d))));
                            int i7 = this.mMaxPullDistance;
                            if (i7 > 0) {
                                min = Math.min(min, i7);
                            }
                            float f3 = min / this.mTotalDragDistance;
                            if (f3 < 0.0f) {
                                return false;
                            }
                            float min2 = Math.min(1.0f, Math.abs(f3));
                            if (min < this.mTotalDragDistance) {
                                this.mHeaderView.changeToState(TBAbsRefreshHeader.RefreshState.PULL_TO_REFRESH);
                            } else if (this.mSecondFloorEnabled) {
                                if (min > this.mSecondFloorDistance) {
                                    this.mHeaderView.changeToState(TBAbsRefreshHeader.RefreshState.PREPARE_TO_SECOND_FLOOR);
                                } else {
                                    this.mHeaderView.changeToState(TBAbsRefreshHeader.RefreshState.RELEASE_TO_REFRESH);
                                }
                            } else {
                                this.mHeaderView.changeToState(TBAbsRefreshHeader.RefreshState.RELEASE_TO_REFRESH);
                            }
                            this.mHeaderView.setProgress(min2);
                            updateHeaderPosition(min - (this.mCurrentTargetOffsetTop - this.mOriginalOffsetTop));
                        }
                    } catch (IllegalArgumentException e) {
                        e.printStackTrace();
                    }
                } else if (i != 3) {
                    if (i == 5) {
                        int actionIndex = MotionEventCompat.getActionIndex(motionEvent);
                        if (actionIndex < 0) {
                            return false;
                        }
                        this.mLastMotionY = MotionEventCompat.getY(motionEvent, actionIndex);
                        this.mActivePointerId = MotionEventCompat.getPointerId(motionEvent, actionIndex);
                        this.mIsMultiPointer = true;
                    } else if (i == 6) {
                        onSecondaryPointerUp(motionEvent);
                    }
                }
            }
            if (this.mActivePointerId == -1) {
                if (i == 1) {
                    Log.e(TAG, "Got ACTION_UP event but don't have an active pointer id.");
                }
                return false;
            }
            this.mIsBeingDragged = false;
            if (this.mHeaderView.getCurrentState() == TBAbsRefreshHeader.RefreshState.PREPARE_TO_SECOND_FLOOR && this.mSecondFloorEnabled) {
                this.mHeaderView.changeToState(TBAbsRefreshHeader.RefreshState.SECOND_FLOOR_START);
                animateOffsetToBottomPosition(this.mCurrentTargetOffsetTop, new Animator.AnimatorListener() { // from class: com.taobao.android.dinamicx.widget.recycler.refresh.TBSwipeRefreshLayout.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationCancel(Animator animator) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("90a3af63", new Object[]{this, animator});
                        }
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationRepeat(Animator animator) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("4388ea84", new Object[]{this, animator});
                        }
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationStart(Animator animator) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("3a405721", new Object[]{this, animator});
                        }
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                        } else {
                            TBSwipeRefreshLayout.access$000(TBSwipeRefreshLayout.this).changeToState(TBAbsRefreshHeader.RefreshState.SECOND_FLOOR_END);
                        }
                    }
                });
            } else if (this.mHeaderView.getCurrentState() == TBAbsRefreshHeader.RefreshState.RELEASE_TO_REFRESH) {
                setRefreshing(true, true);
            } else {
                this.mRefreshing = false;
                this.mHeaderView.changeToState(TBAbsRefreshHeader.RefreshState.NONE);
                animateOffsetToStartPosition(this.mCurrentTargetOffsetTop, null);
            }
            this.mActivePointerId = -1;
            this.mIsMultiPointer = false;
            this.mDistance = 0;
            this.mPositionY = 0;
            return false;
        }
        return true;
    }

    private boolean handlePushTouchEvent(MotionEvent motionEvent, int i) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7b2e8d6e", new Object[]{this, motionEvent, new Integer(i)})).booleanValue();
        }
        if (i == 0) {
            this.mActivePointerId = MotionEventCompat.getPointerId(motionEvent, 0);
            this.mIsBeingDragged = false;
        } else {
            if (i != 1) {
                if (i == 2) {
                    int findPointerIndex = MotionEventCompat.findPointerIndex(motionEvent, this.mActivePointerId);
                    if (findPointerIndex < 0) {
                        Log.e(TAG, "Got ACTION_MOVE event but have an invalid active pointer id.");
                        return false;
                    }
                    float y = (this.mInitialMotionY - MotionEventCompat.getY(motionEvent, findPointerIndex)) * this.mDragRate;
                    if (this.mIsBeingDragged) {
                        this.mPushDistance = Math.min((int) y, this.mMaxPushDistance);
                        updateFooterPosition();
                        if (this.mOnPushLoadMoreListener != null) {
                            if (this.mPushDistance >= this.mFooterViewHeight) {
                                z = true;
                            }
                            if (z) {
                                this.mFooterView.changeToState(TBLoadMoreFooter.LoadMoreState.RELEASE_TO_LOAD);
                            } else {
                                this.mFooterView.changeToState(TBLoadMoreFooter.LoadMoreState.PUSH_TO_LOAD);
                            }
                        }
                    }
                } else if (i != 3) {
                    if (i == 5) {
                        this.mActivePointerId = MotionEventCompat.getPointerId(motionEvent, MotionEventCompat.getActionIndex(motionEvent));
                    } else if (i == 6) {
                        onSecondaryPointerUp(motionEvent);
                    }
                }
            }
            int i2 = this.mActivePointerId;
            if (i2 == -1) {
                if (i == 1) {
                    Log.e(TAG, "Got ACTION_UP event but don't have an active pointer id.");
                }
                return false;
            }
            int findPointerIndex2 = MotionEventCompat.findPointerIndex(motionEvent, i2);
            if (findPointerIndex2 < 0) {
                return false;
            }
            float min = Math.min((this.mInitialMotionY - MotionEventCompat.getY(motionEvent, findPointerIndex2)) * this.mDragRate, this.mMaxPushDistance);
            this.mIsBeingDragged = false;
            this.mActivePointerId = -1;
            int i3 = this.mFooterViewHeight;
            if (min < i3 || this.mOnPushLoadMoreListener == null) {
                this.mPushDistance = 0;
            } else {
                this.mPushDistance = i3;
            }
            animatorFooterToBottom((int) min, this.mPushDistance);
            return false;
        }
        return true;
    }

    private void ensureTarget() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d26e8876", new Object[]{this});
        } else if (this.mTarget == null) {
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (!childAt.equals(this.mHeaderView) && !childAt.equals(this.mFooterView)) {
                    this.mTarget = childAt;
                    return;
                }
            }
        }
    }

    public boolean isChildScrollToTop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7da7eba6", new Object[]{this})).booleanValue();
        }
        a aVar = this.mOnChildScrollUpCallback;
        return aVar != null ? !aVar.a(this) : !ViewCompat.canScrollVertically(this.mTarget, -1);
    }

    public boolean isChildScrollToBottom() {
        int lastVisiblePosition;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1e398b30", new Object[]{this})).booleanValue();
        }
        if (isChildScrollToTop()) {
            return false;
        }
        View view = this.mTarget;
        if (view instanceof RecyclerView) {
            RecyclerView recyclerView = (RecyclerView) view;
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            int itemCount = recyclerView.getAdapter().getItemCount();
            if ((layoutManager instanceof LinearLayoutManager) && itemCount > 0) {
                if (((LinearLayoutManager) layoutManager).findLastCompletelyVisibleItemPosition() == itemCount - 1) {
                    return true;
                }
            } else if (layoutManager instanceof StaggeredGridLayoutManager) {
                int[] iArr = new int[2];
                ((StaggeredGridLayoutManager) layoutManager).findLastCompletelyVisibleItemPositions(iArr);
                if (Math.max(iArr[0], iArr[1]) == itemCount - 1) {
                    return true;
                }
            }
            return false;
        } else if (view instanceof AbsListView) {
            AbsListView absListView = (AbsListView) view;
            int count = ((ListAdapter) absListView.getAdapter()).getCount();
            return (absListView.getFirstVisiblePosition() != 0 || absListView.getChildAt(0).getTop() < absListView.getPaddingTop()) && (lastVisiblePosition = absListView.getLastVisiblePosition()) > 0 && count > 0 && lastVisiblePosition == count - 1;
        } else {
            if (view instanceof ScrollView) {
                ScrollView scrollView = (ScrollView) view;
                View childAt = scrollView.getChildAt(scrollView.getChildCount() - 1);
                if (childAt != null && childAt.getBottom() - (scrollView.getHeight() + scrollView.getScrollY()) == 0) {
                    return true;
                }
            } else if (view instanceof NestedScrollView) {
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                View childAt2 = nestedScrollView.getChildAt(nestedScrollView.getChildCount() - 1);
                if (childAt2 != null && childAt2.getBottom() - (nestedScrollView.getHeight() + nestedScrollView.getScrollY()) == 0) {
                    return true;
                }
            }
            return false;
        }
    }

    public void setRefreshing(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("706bb7a4", new Object[]{this, new Boolean(z)});
        } else if (this.mHeaderView == null) {
        } else {
            if (z && this.mRefreshing != z) {
                this.mRefreshing = z;
                updateHeaderPosition((this.mHeaderViewHeight + this.mOriginalOffsetTop) - this.mCurrentTargetOffsetTop);
                this.mNotify = false;
                startScaleUpAnimation(this.mRefreshListener);
                return;
            }
            setRefreshing(z, false);
        }
    }

    public void setAutoRefreshing(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfadcef5", new Object[]{this, new Boolean(z)});
        } else if (this.mHeaderView == null) {
        } else {
            this.mNotify = z;
            ensureTarget();
            this.mRefreshing = true;
            this.mHeaderView.changeToState(TBAbsRefreshHeader.RefreshState.REFRESHING);
            animateOffsetToCorrectPosition(this.mCurrentTargetOffsetTop, new Animator.AnimatorListener() { // from class: com.taobao.android.dinamicx.widget.recycler.refresh.TBSwipeRefreshLayout.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("90a3af63", new Object[]{this, animator});
                    }
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("4388ea84", new Object[]{this, animator});
                    }
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3a405721", new Object[]{this, animator});
                    }
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                        return;
                    }
                    TBSwipeRefreshLayout.access$600(TBSwipeRefreshLayout.this).onAnimationEnd(animator);
                    new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.taobao.android.dinamicx.widget.recycler.refresh.TBSwipeRefreshLayout.3.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                TBSwipeRefreshLayout.this.setRefreshing(false);
                            }
                        }
                    }, TBSwipeRefreshLayout.access$700(TBSwipeRefreshLayout.this));
                }
            });
        }
    }

    public void setAutoRefreshingDuration(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b83589b1", new Object[]{this, new Long(j)});
        } else if (j <= 0) {
        } else {
            this.mAutoRefreshDuration = j;
        }
    }

    public void setRefreshing(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d0befb0", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        TBAbsRefreshHeader tBAbsRefreshHeader = this.mHeaderView;
        if (tBAbsRefreshHeader == null) {
            return;
        }
        if (this.mRefreshing != z) {
            this.mNotify = z2;
            ensureTarget();
            this.mRefreshing = z;
            if (this.mRefreshing) {
                this.mHeaderView.changeToState(TBAbsRefreshHeader.RefreshState.REFRESHING);
                animateOffsetToCorrectPosition(this.mCurrentTargetOffsetTop, this.mRefreshListener);
                return;
            }
            this.mHeaderView.changeToState(TBAbsRefreshHeader.RefreshState.NONE);
            animateOffsetToStartPosition(this.mCurrentTargetOffsetTop, this.mRefreshListener);
        } else if (tBAbsRefreshHeader.getCurrentState() != TBAbsRefreshHeader.RefreshState.SECOND_FLOOR_END) {
        } else {
            this.mRefreshing = false;
            this.mHeaderView.changeToState(TBAbsRefreshHeader.RefreshState.NONE);
            animateOffsetToStartPosition(this.mCurrentTargetOffsetTop, this.mRefreshListener);
        }
    }

    public void setLoadMore(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd8ef170", new Object[]{this, new Boolean(z)});
        } else if (this.mFooterView == null || z || !this.mLoadingMore) {
        } else {
            animatorFooterToBottom(this.mFooterViewHeight, 0);
        }
    }

    private void startScaleUpAnimation(Animator.AnimatorListener animatorListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e96edac", new Object[]{this, animatorListener});
            return;
        }
        this.mHeaderView.setVisibility(0);
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 0);
        ofInt.setDuration(getResources().getInteger(17694721));
        if (animatorListener != null) {
            ofInt.addListener(animatorListener);
        }
        ofInt.start();
    }

    public boolean isRefreshing() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56d673fc", new Object[]{this})).booleanValue() : (getRefresHeader() == null || getRefresHeader().getCurrentState() == TBAbsRefreshHeader.RefreshState.NONE) ? false : true;
    }

    private void animatorFooterToBottom(int i, final int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17d76b2f", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(i, i2);
        ofInt.setDuration(150L);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.taobao.android.dinamicx.widget.recycler.refresh.TBSwipeRefreshLayout.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                    return;
                }
                TBSwipeRefreshLayout.access$802(TBSwipeRefreshLayout.this, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                TBSwipeRefreshLayout.access$900(TBSwipeRefreshLayout.this);
            }
        });
        ofInt.addListener(new AnimatorListenerAdapter() { // from class: com.taobao.android.dinamicx.widget.recycler.refresh.TBSwipeRefreshLayout.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                } else if (i2 <= 0 || TBSwipeRefreshLayout.access$1000(TBSwipeRefreshLayout.this) == null) {
                    TBSwipeRefreshLayout.access$1102(TBSwipeRefreshLayout.this, false);
                    TBSwipeRefreshLayout.access$1200(TBSwipeRefreshLayout.this).changeToState(TBLoadMoreFooter.LoadMoreState.NONE);
                } else {
                    TBSwipeRefreshLayout.access$1102(TBSwipeRefreshLayout.this, true);
                    TBSwipeRefreshLayout.access$1200(TBSwipeRefreshLayout.this).changeToState(TBLoadMoreFooter.LoadMoreState.LOADING);
                    TBSwipeRefreshLayout.access$1000(TBSwipeRefreshLayout.this);
                }
            }
        });
        ofInt.setInterpolator(this.mDecelerateInterpolator);
        ofInt.start();
    }

    private void animateOffsetToCorrectPosition(int i, Animator.AnimatorListener animatorListener) {
        int i2;
        int abs;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d2e911c", new Object[]{this, new Integer(i), animatorListener});
            return;
        }
        this.mFrom = i;
        if (this.mEnableTargetOffset) {
            i2 = this.mHeaderViewHeight - Math.abs(this.mOriginalOffsetTop);
            abs = this.mRefreshOffset;
        } else {
            i2 = this.mHeaderViewHeight;
            abs = Math.abs(this.mOriginalOffsetTop);
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(this.mFrom, i2 - abs);
        if (animatorListener != null) {
            ofInt.addListener(animatorListener);
        }
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.taobao.android.dinamicx.widget.recycler.refresh.TBSwipeRefreshLayout.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                } else {
                    TBSwipeRefreshLayout.access$400(TBSwipeRefreshLayout.this, ((Integer) valueAnimator.getAnimatedValue()).intValue() - TBSwipeRefreshLayout.access$000(TBSwipeRefreshLayout.this).getTop());
                }
            }
        });
        ofInt.setDuration(300L);
        ofInt.setInterpolator(this.mDecelerateInterpolator);
        ofInt.start();
    }

    private void animateOffsetToStartPosition(int i, Animator.AnimatorListener animatorListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0556754", new Object[]{this, new Integer(i), animatorListener});
            return;
        }
        this.mFrom = i;
        ValueAnimator ofInt = ValueAnimator.ofInt(this.mFrom, this.mOriginalOffsetTop);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.taobao.android.dinamicx.widget.recycler.refresh.TBSwipeRefreshLayout.7
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                    return;
                }
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                TBSwipeRefreshLayout.access$000(TBSwipeRefreshLayout.this).setProgress((intValue - TBSwipeRefreshLayout.this.mFrom) / (TBSwipeRefreshLayout.this.mOriginalOffsetTop - TBSwipeRefreshLayout.this.mFrom));
                TBSwipeRefreshLayout tBSwipeRefreshLayout = TBSwipeRefreshLayout.this;
                TBSwipeRefreshLayout.access$400(tBSwipeRefreshLayout, intValue - TBSwipeRefreshLayout.access$000(tBSwipeRefreshLayout).getTop());
            }
        });
        ofInt.setDuration(300L);
        ofInt.setInterpolator(this.mDecelerateInterpolator);
        if (animatorListener != null) {
            ofInt.addListener(animatorListener);
        }
        ofInt.start();
    }

    private void animateOffsetToBottomPosition(int i, Animator.AnimatorListener animatorListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24531edb", new Object[]{this, new Integer(i), animatorListener});
            return;
        }
        this.mFrom = i;
        new ValueAnimator();
        final ValueAnimator ofInt = ValueAnimator.ofInt(this.mFrom, 0);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.taobao.android.dinamicx.widget.recycler.refresh.TBSwipeRefreshLayout.8
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                } else {
                    TBSwipeRefreshLayout.access$400(TBSwipeRefreshLayout.this, ((Integer) ofInt.getAnimatedValue()).intValue() - TBSwipeRefreshLayout.access$000(TBSwipeRefreshLayout.this).getTop());
                }
            }
        });
        ofInt.setDuration(300L);
        ofInt.setInterpolator(this.mDecelerateInterpolator);
        if (animatorListener != null) {
            ofInt.addListener(animatorListener);
        }
        ofInt.start();
    }

    private void updateHeaderPosition(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e72b2bd", new Object[]{this, new Integer(i)});
            return;
        }
        this.mHeaderView.bringToFront();
        this.mHeaderView.offsetTopAndBottom(i);
        this.mTarget.offsetTopAndBottom(i);
        this.mCurrentTargetOffsetTop = this.mHeaderView.getTop();
        updatePullListenerCallBack();
    }

    private void updateFooterPosition() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abf98f14", new Object[]{this});
            return;
        }
        this.mFooterView.setVisibility(0);
        this.mFooterView.bringToFront();
        if (Build.VERSION.SDK_INT < 19) {
            this.mFooterView.getParent().requestLayout();
        }
        this.mFooterView.offsetTopAndBottom(-this.mPushDistance);
        updateLoadMoreListener();
    }

    private void updatePullListenerCallBack() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("562ee90e", new Object[]{this});
            return;
        }
        int i = this.mCurrentTargetOffsetTop - this.mOriginalOffsetTop;
        b bVar = this.mPullRefreshListener;
        if (bVar == null) {
            return;
        }
        bVar.a(i);
    }

    private void onSecondaryPointerUp(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        int i = 1;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f24b537f", new Object[]{this, motionEvent});
            return;
        }
        int actionIndex = MotionEventCompat.getActionIndex(motionEvent);
        if (MotionEventCompat.getPointerId(motionEvent, actionIndex) == this.mActivePointerId) {
            if (actionIndex != 0) {
                i = 0;
            }
            this.mLastMotionY = MotionEventCompat.getY(motionEvent, i);
            this.mActivePointerId = MotionEventCompat.getPointerId(motionEvent, i);
        }
        int pointerIndex = getPointerIndex(motionEvent, this.mActivePointerId);
        if (this.mActivePointerId == -1) {
            return;
        }
        this.mLastMotionY = MotionEventCompat.getY(motionEvent, pointerIndex);
    }

    public boolean isTargetScrollWithLayout() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("63314c43", new Object[]{this})).booleanValue() : this.mTargetScrollWithLayout;
    }

    public void setTargetScrollWithLayout(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c1b7c3d", new Object[]{this, new Boolean(z)});
        } else {
            this.mTargetScrollWithLayout = z;
        }
    }

    public void enablePullRefresh(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("388183ba", new Object[]{this, new Boolean(z)});
            return;
        }
        this.mPullRefreshEnabled = z;
        if (!z || this.mHeaderView != null) {
            return;
        }
        createHeaderView();
    }

    public void enableLoadMore(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("672525ef", new Object[]{this, new Boolean(z)});
            return;
        }
        this.mLoadMoreEnabled = z;
        if (!z || this.mFooterView != null) {
            return;
        }
        createFooterView();
    }

    public void enableSecondFloor(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a64165d8", new Object[]{this, new Boolean(z)});
        } else {
            this.mSecondFloorEnabled = z;
        }
    }

    public void setDistanceToRefresh(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0fbd9d3", new Object[]{this, new Integer(i)});
            return;
        }
        float f = i;
        float f2 = this.mDensity;
        if (((int) (f * f2)) < this.mHeaderViewHeight) {
            return;
        }
        this.mTotalDragDistance = (int) (f * f2);
        int i2 = this.mSecondFloorDistance;
        int i3 = this.mTotalDragDistance;
        int i4 = i2 - i3;
        int i5 = MIN_GAP_DISTANCE_TO_SECOND_FLOOR;
        if (i4 >= i5) {
            return;
        }
        this.mSecondFloorDistance = i3 + i5;
    }

    public float getDistanceToRefresh() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7181ccac", new Object[]{this})).floatValue() : this.mTotalDragDistance;
    }

    public void setDistanceToSecondFloor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("902ff5d6", new Object[]{this, new Integer(i)});
            return;
        }
        float f = i;
        float f2 = this.mDensity;
        if (((int) (f * f2)) - this.mTotalDragDistance < MIN_GAP_DISTANCE_TO_SECOND_FLOOR) {
            Log.e(TAG, "Distance to second floor must be more than 50dp longer than distance to refresh");
        } else {
            this.mSecondFloorDistance = (int) (f * f2);
        }
    }

    public float getDistanceToSecondFloor() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d6efe49", new Object[]{this})).floatValue() : this.mSecondFloorDistance;
    }

    public void setMaxPushDistance(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51bdfa0b", new Object[]{this, new Integer(i)});
            return;
        }
        float f = i;
        float f2 = this.mDensity;
        if (((int) (f * f2)) < this.mFooterViewHeight) {
            Log.e(TAG, "Max push distance must be larger than footer view height!");
        } else {
            this.mMaxPushDistance = (int) (f * f2);
        }
    }

    public void setMaxPullDistance(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("643538c0", new Object[]{this, new Integer(i)});
        } else {
            this.mMaxPullDistance = (int) (i * this.mDensity);
        }
    }

    public void setRefreshOffset(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f88330d0", new Object[]{this, new Integer(i)});
        } else {
            setRefreshOffset(i, false);
        }
    }

    public void setRefreshOffset(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17e39c04", new Object[]{this, new Integer(i), new Boolean(z)});
            return;
        }
        if (z) {
            int b2 = gbe.b(getContext());
            this.mRefreshOffset = ((int) (i * getResources().getDisplayMetrics().density)) + b2;
            this.mHeaderViewHeight += b2;
        } else {
            this.mRefreshOffset = (int) (i * getResources().getDisplayMetrics().density);
        }
        int i2 = this.mRefreshOffset;
        int i3 = (-this.mContentHeight) + i2;
        this.mOriginalOffsetTop = i3;
        this.mCurrentTargetOffsetTop = i3;
        if (this.mHeaderViewHeight < i2) {
            Log.e(TAG, "Refresh offset cannot be larger than header view height.");
            this.mHeaderViewHeight = this.mRefreshOffset + ((int) (getResources().getDisplayMetrics().density * 24.0f));
        }
        int i4 = this.mTotalDragDistance;
        int i5 = this.mHeaderViewHeight;
        if (i4 < i5) {
            this.mTotalDragDistance = i5;
        }
        int i6 = this.mSecondFloorDistance;
        int i7 = this.mTotalDragDistance;
        if (i6 >= i7) {
            return;
        }
        this.mSecondFloorDistance = i7 + MIN_GAP_DISTANCE_TO_SECOND_FLOOR;
    }

    public void enableTargetOffset(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed28f0e6", new Object[]{this, new Boolean(z)});
        } else {
            this.mEnableTargetOffset = z;
        }
    }

    public int getRefreshOffset() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("fae1c812", new Object[]{this})).intValue() : this.mRefreshOffset;
    }

    public void setOnPullRefreshListener(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("973e17bc", new Object[]{this, bVar});
            return;
        }
        this.mPullRefreshListener = bVar;
        TBAbsRefreshHeader tBAbsRefreshHeader = this.mHeaderView;
        if (tBAbsRefreshHeader == null) {
            return;
        }
        tBAbsRefreshHeader.setPullRefreshListener(this.mPullRefreshListener);
    }

    public void setOnPushLoadMoreListener(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91eadbfc", new Object[]{this, cVar});
            return;
        }
        this.mOnPushLoadMoreListener = cVar;
        TBLoadMoreFooter tBLoadMoreFooter = this.mFooterView;
        if (tBLoadMoreFooter == null) {
            return;
        }
        tBLoadMoreFooter.setPushLoadMoreListener(this.mOnPushLoadMoreListener);
    }

    public void setDragRate(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e39e323", new Object[]{this, new Float(f)});
        } else if (f > 0.0f && f < 1.0f) {
            this.mDragRate = f;
        } else {
            Log.e(TAG, "Drag rate must be larger than 0 and smaller than 1!");
        }
    }

    public void setHeaderView(TBAbsRefreshHeader tBAbsRefreshHeader) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d45f2c3a", new Object[]{this, tBAbsRefreshHeader});
        } else if (tBAbsRefreshHeader == null) {
        } else {
            int indexOfChild = indexOfChild(this.mHeaderView);
            TBAbsRefreshHeader tBAbsRefreshHeader2 = this.mHeaderView;
            if (tBAbsRefreshHeader2 != null && indexOfChild != -1) {
                removeView(tBAbsRefreshHeader2);
            }
            this.mHeaderView = tBAbsRefreshHeader;
            this.mHeaderView.setPullRefreshListener(this.mPullRefreshListener);
            addView(this.mHeaderView, indexOfChild, new ViewGroup.LayoutParams(-1, this.mHeaderViewHeight));
        }
    }

    public void setHeaderViewHeight(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd3fa121", new Object[]{this, new Integer(i)});
            return;
        }
        float f = i;
        float f2 = this.mDensity;
        if (((int) (f * f2)) < this.mRefreshOffset) {
            return;
        }
        this.mHeaderViewHeight = (int) (f * f2);
        int i2 = this.mTotalDragDistance;
        int i3 = this.mHeaderViewHeight;
        if (i2 < i3) {
            this.mTotalDragDistance = i3;
        }
        int i4 = this.mSecondFloorDistance;
        int i5 = this.mTotalDragDistance;
        if (i4 >= i5) {
            return;
        }
        this.mSecondFloorDistance = i5 + MIN_GAP_DISTANCE_TO_SECOND_FLOOR;
    }

    public void setCustomRefreshHeight(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("935ee48d", new Object[]{this, new Integer(i)});
            return;
        }
        this.mHeaderViewHeight = (int) (i * this.mDensity);
        this.mTotalDragDistance = this.mHeaderViewHeight;
        int i2 = this.mSecondFloorDistance;
        int i3 = this.mTotalDragDistance;
        if (i2 >= i3) {
            return;
        }
        this.mSecondFloorDistance = i3 + MIN_GAP_DISTANCE_TO_SECOND_FLOOR;
    }

    public int getHeaderViewHeight() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("aee06709", new Object[]{this})).intValue() : this.mHeaderViewHeight;
    }

    public void setFooterView(TBLoadMoreFooter tBLoadMoreFooter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ae72be8", new Object[]{this, tBLoadMoreFooter});
        } else if (tBLoadMoreFooter == null) {
        } else {
            int indexOfChild = indexOfChild(this.mFooterView);
            TBLoadMoreFooter tBLoadMoreFooter2 = this.mFooterView;
            if (tBLoadMoreFooter2 != null && indexOfChild != -1) {
                removeView(tBLoadMoreFooter2);
            }
            this.mFooterView = tBLoadMoreFooter;
            this.mFooterView.setPushLoadMoreListener(this.mOnPushLoadMoreListener);
            addView(this.mFooterView, indexOfChild, new ViewGroup.LayoutParams(-1, this.mFooterViewHeight));
        }
    }

    public void setFooterViewHeight(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78cf9053", new Object[]{this, new Integer(i)});
            return;
        }
        float f = i;
        float f2 = this.mDensity;
        if (((int) (f * f2)) > this.mMaxPushDistance) {
            this.mMaxPushDistance = (int) (f2 * f);
        }
        this.mFooterViewHeight = (int) (f * this.mDensity);
    }

    public int getFooterViewHeight() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b2dcc997", new Object[]{this})).intValue() : this.mFooterViewHeight;
    }

    public TBAbsRefreshHeader getRefresHeader() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBAbsRefreshHeader) ipChange.ipc$dispatch("9df234be", new Object[]{this}) : this.mHeaderView;
    }

    public TBLoadMoreFooter getLoadMoreFooter() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBLoadMoreFooter) ipChange.ipc$dispatch("cf4c0c62", new Object[]{this}) : this.mFooterView;
    }

    private int getPointerIndex(MotionEvent motionEvent, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c6128e2f", new Object[]{this, motionEvent, new Integer(i)})).intValue();
        }
        int findPointerIndex = MotionEventCompat.findPointerIndex(motionEvent, i);
        if (findPointerIndex == -1) {
            this.mActivePointerId = -1;
        }
        return findPointerIndex;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb2f300c", new Object[]{this, configuration});
            return;
        }
        super.onConfigurationChanged(configuration);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.mDensity = displayMetrics.density;
        if (f.e()) {
            this.mHeaderViewHeight = displayMetrics.widthPixels;
            this.mFooterViewHeight = displayMetrics.widthPixels;
        }
        requestLayout();
    }
}
