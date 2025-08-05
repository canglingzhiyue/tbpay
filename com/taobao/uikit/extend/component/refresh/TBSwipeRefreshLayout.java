package com.taobao.uikit.extend.component.refresh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
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
import com.taobao.android.autosize.l;
import com.taobao.tao.util.SystemBarDecorator;
import com.taobao.tao.util.TBSoundPlayer;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.component.refresh.TBLoadMoreFooter;
import com.taobao.uikit.extend.component.refresh.TBRefreshHeader;
import com.taobao.uikit.extend.utils.DisplayUtil;
import com.taobao.uikit.extend.utils.NavigationBarUtils;
import tb.kge;

/* loaded from: classes9.dex */
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
    private int mAnimateToStartDuration;
    private long mAutoRefreshDuration;
    public int mContentHeight;
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
    private TBRefreshHeader mHeaderView;
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
    public int mNavigationBarHeight;
    private boolean mNotify;
    private OnPushLoadMoreListener mOnPushLoadMoreListener;
    private boolean mOriginalOffsetCalculated;
    public int mOriginalOffsetTop;
    private int mPositionY;
    private int mPreActivePointerId;
    private int mPreDistance;
    private int mPrePositionY;
    private boolean mPullRefreshEnabled;
    private OnPullRefreshListener mPullRefreshListener;
    private int mPushDistance;
    private RefreshAnimationListener mRefreshAnimationListener;
    private Animator.AnimatorListener mRefreshListener;
    public int mRefreshOffset;
    private boolean mRefreshing;
    private boolean mResetTargetHeight;
    private int mSecondFloorDistance;
    private boolean mSecondFloorEnabled;
    private int mStartY;
    private View mTarget;
    private boolean mTargetScrollWithLayout;
    private long mToBottomDuration;
    private int mTotalDragDistance;
    public int mTouchSlop;

    /* loaded from: classes9.dex */
    public interface OnPullRefreshListener {
        void onPullDistance(int i);

        void onRefresh();

        void onRefreshStateChanged(TBRefreshHeader.RefreshState refreshState, TBRefreshHeader.RefreshState refreshState2);
    }

    /* loaded from: classes9.dex */
    public interface OnPushLoadMoreListener {
        void onLoadMore();

        void onLoadMoreStateChanged(TBLoadMoreFooter.LoadMoreState loadMoreState, TBLoadMoreFooter.LoadMoreState loadMoreState2);

        void onPushDistance(int i);
    }

    /* loaded from: classes9.dex */
    public interface RefreshAnimationListener {
        void onRefreshBefore();

        void onRefreshCancel();

        void onRefreshEnd();
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

    public static /* synthetic */ TBRefreshHeader access$000(TBSwipeRefreshLayout tBSwipeRefreshLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBRefreshHeader) ipChange.ipc$dispatch("c0aadf44", new Object[]{tBSwipeRefreshLayout}) : tBSwipeRefreshLayout.mHeaderView;
    }

    public static /* synthetic */ boolean access$100(TBSwipeRefreshLayout tBSwipeRefreshLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f609697", new Object[]{tBSwipeRefreshLayout})).booleanValue() : tBSwipeRefreshLayout.mRefreshing;
    }

    public static /* synthetic */ int access$1002(TBSwipeRefreshLayout tBSwipeRefreshLayout, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("85536bd3", new Object[]{tBSwipeRefreshLayout, new Integer(i)})).intValue();
        }
        tBSwipeRefreshLayout.mPushDistance = i;
        return i;
    }

    public static /* synthetic */ void access$1100(TBSwipeRefreshLayout tBSwipeRefreshLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80b48bc2", new Object[]{tBSwipeRefreshLayout});
        } else {
            tBSwipeRefreshLayout.updateFooterPosition();
        }
    }

    public static /* synthetic */ OnPushLoadMoreListener access$1200(TBSwipeRefreshLayout tBSwipeRefreshLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (OnPushLoadMoreListener) ipChange.ipc$dispatch("66e2d61c", new Object[]{tBSwipeRefreshLayout}) : tBSwipeRefreshLayout.mOnPushLoadMoreListener;
    }

    public static /* synthetic */ boolean access$1302(TBSwipeRefreshLayout tBSwipeRefreshLayout, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c33ca52", new Object[]{tBSwipeRefreshLayout, new Boolean(z)})).booleanValue();
        }
        tBSwipeRefreshLayout.mLoadingMore = z;
        return z;
    }

    public static /* synthetic */ TBLoadMoreFooter access$1400(TBSwipeRefreshLayout tBSwipeRefreshLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBLoadMoreFooter) ipChange.ipc$dispatch("5cc9fce1", new Object[]{tBSwipeRefreshLayout}) : tBSwipeRefreshLayout.mFooterView;
    }

    public static /* synthetic */ boolean access$200(TBSwipeRefreshLayout tBSwipeRefreshLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f28c49d8", new Object[]{tBSwipeRefreshLayout})).booleanValue() : tBSwipeRefreshLayout.mNotify;
    }

    public static /* synthetic */ RefreshAnimationListener access$300(TBSwipeRefreshLayout tBSwipeRefreshLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RefreshAnimationListener) ipChange.ipc$dispatch("925686b9", new Object[]{tBSwipeRefreshLayout}) : tBSwipeRefreshLayout.mRefreshAnimationListener;
    }

    public static /* synthetic */ OnPullRefreshListener access$400(TBSwipeRefreshLayout tBSwipeRefreshLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (OnPullRefreshListener) ipChange.ipc$dispatch("b60db1f4", new Object[]{tBSwipeRefreshLayout}) : tBSwipeRefreshLayout.mPullRefreshListener;
    }

    public static /* synthetic */ void access$500(TBSwipeRefreshLayout tBSwipeRefreshLayout, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5dd824c", new Object[]{tBSwipeRefreshLayout, new Integer(i)});
        } else {
            tBSwipeRefreshLayout.updateHeaderPosition(i);
        }
    }

    public static /* synthetic */ void access$600(TBSwipeRefreshLayout tBSwipeRefreshLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f3b16d8", new Object[]{tBSwipeRefreshLayout});
        } else {
            tBSwipeRefreshLayout.updatePullListenerCallBack();
        }
    }

    public static /* synthetic */ Animator.AnimatorListener access$700(TBSwipeRefreshLayout tBSwipeRefreshLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Animator.AnimatorListener) ipChange.ipc$dispatch("b7bfefd", new Object[]{tBSwipeRefreshLayout}) : tBSwipeRefreshLayout.mRefreshListener;
    }

    public static /* synthetic */ long access$800(TBSwipeRefreshLayout tBSwipeRefreshLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("45927d4e", new Object[]{tBSwipeRefreshLayout})).longValue() : tBSwipeRefreshLayout.mAutoRefreshDuration;
    }

    public static /* synthetic */ void access$900(TBSwipeRefreshLayout tBSwipeRefreshLayout, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef089599", new Object[]{tBSwipeRefreshLayout, new Boolean(z)});
        } else {
            tBSwipeRefreshLayout.showLoadingTip(z);
        }
    }

    static {
        kge.a(126487124);
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
        this.mAnimateToStartDuration = 300;
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
        this.mResetTargetHeight = false;
        this.mPushDistance = 0;
        this.mAutoRefreshDuration = 2000L;
        this.mToBottomDuration = 300L;
        this.mIsMultiPointer = false;
        this.mPositionY = 0;
        this.mPrePositionY = 0;
        this.mPreActivePointerId = -1;
        this.mContentHeight = -1;
        this.mNavigationBarHeight = -1;
        this.mRefreshListener = new Animator.AnimatorListener() { // from class: com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

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
                } else if (TBSwipeRefreshLayout.access$000(TBSwipeRefreshLayout.this) == null || !TBSwipeRefreshLayout.access$100(TBSwipeRefreshLayout.this) || !TBSwipeRefreshLayout.access$200(TBSwipeRefreshLayout.this) || TBSwipeRefreshLayout.access$300(TBSwipeRefreshLayout.this) == null) {
                } else {
                    TBSwipeRefreshLayout.access$300(TBSwipeRefreshLayout.this).onRefreshBefore();
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
                        if (TBSwipeRefreshLayout.access$200(TBSwipeRefreshLayout.this) && TBSwipeRefreshLayout.access$400(TBSwipeRefreshLayout.this) != null) {
                            TBSwipeRefreshLayout.access$400(TBSwipeRefreshLayout.this).onRefresh();
                        }
                        TBSwipeRefreshLayout.access$000(TBSwipeRefreshLayout.this).changeToState(TBRefreshHeader.RefreshState.REFRESHING);
                    } else {
                        TBSwipeRefreshLayout tBSwipeRefreshLayout = TBSwipeRefreshLayout.this;
                        TBSwipeRefreshLayout.access$500(tBSwipeRefreshLayout, tBSwipeRefreshLayout.mOriginalOffsetTop - TBSwipeRefreshLayout.this.mCurrentTargetOffsetTop);
                    }
                    TBSwipeRefreshLayout tBSwipeRefreshLayout2 = TBSwipeRefreshLayout.this;
                    tBSwipeRefreshLayout2.mCurrentTargetOffsetTop = TBSwipeRefreshLayout.access$000(tBSwipeRefreshLayout2).getTop();
                    TBSwipeRefreshLayout.access$600(TBSwipeRefreshLayout.this);
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("90a3af63", new Object[]{this, animator});
                } else if (TBSwipeRefreshLayout.access$300(TBSwipeRefreshLayout.this) == null) {
                } else {
                    TBSwipeRefreshLayout.access$300(TBSwipeRefreshLayout.this).onRefreshCancel();
                }
            }
        };
        setWillNotDraw(false);
        this.mDisplayMetrics = DisplayUtil.getDisplayMetrics(getContext());
        this.mDensity = this.mDisplayMetrics.density;
        Resources resources = getResources();
        HEADER_VIEW_HEIGHT = (int) resources.getDimension(R.dimen.uik_refresh_header_height);
        MIN_GAP_DISTANCE_TO_SECOND_FLOOR = (int) resources.getDimension(R.dimen.uik_refresh_second_floor_gap);
        FOOTER_VIEW_HEIGHT = (int) resources.getDimension(R.dimen.uik_refresh_footer_height);
        FOOTER_VIEW_MAX_HEIGHT = (int) resources.getDimension(R.dimen.uik_refresh_footer_max_height);
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
        initNavBarHeight();
        initContentHeight();
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

    public void initNavBarHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5b9076e", new Object[]{this});
        } else if (this.mNavigationBarHeight != -1) {
        } else {
            this.mNavigationBarHeight = NavigationBarUtils.getNavigationBarHeight((Activity) getContext());
        }
    }

    public void initContentHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adfb5457", new Object[]{this});
        } else if (this.mContentHeight != -1) {
        } else {
            this.mContentHeight = NavigationBarUtils.getContentHeight((Activity) getContext());
        }
    }

    public void createHeaderView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57445275", new Object[]{this});
            return;
        }
        this.mHeaderView = new TBOldRefreshHeader(getContext());
        OnPullRefreshListener onPullRefreshListener = this.mPullRefreshListener;
        if (onPullRefreshListener != null) {
            this.mHeaderView.setPullRefreshListener(onPullRefreshListener);
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
        OnPushLoadMoreListener onPushLoadMoreListener = this.mOnPushLoadMoreListener;
        if (onPushLoadMoreListener != null) {
            this.mFooterView.setPushLoadMoreListener(onPushLoadMoreListener);
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
        if (this.mTarget == null) {
            return;
        }
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        if (!this.mEnableTargetOffset && this.mResetTargetHeight) {
            measuredHeight += this.mRefreshOffset;
        }
        this.mTarget.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
        this.mHeaderViewIndex = -1;
        if (this.mHeaderView != null) {
            this.mHeaderViewWidth = DisplayUtil.getScreenWidth(getContext());
            this.mHeaderView.measure(View.MeasureSpec.makeMeasureSpec(this.mHeaderViewWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(this.mContentHeight, 1073741824));
            int i3 = 0;
            while (true) {
                if (i3 >= getChildCount()) {
                    break;
                } else if (getChildAt(i3) == this.mHeaderView) {
                    this.mHeaderViewIndex = i3;
                    break;
                } else {
                    i3++;
                }
            }
        }
        this.mFooterViewIndex = -1;
        if (this.mFooterView == null) {
            return;
        }
        this.mFooterViewWidth = DisplayUtil.getScreenWidth(getContext());
        this.mFooterView.measure(View.MeasureSpec.makeMeasureSpec(this.mFooterViewWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(this.mMaxPushDistance, 1073741824));
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            if (getChildAt(i4) == this.mFooterView) {
                this.mFooterViewIndex = i4;
                return;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        TBRefreshHeader tBRefreshHeader;
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
        if (this.mHeaderView != null) {
            this.mHeaderViewWidth = DisplayUtil.getScreenWidth(getContext());
            TBRefreshHeader tBRefreshHeader2 = this.mHeaderView;
            int i6 = this.mCurrentTargetOffsetTop;
            tBRefreshHeader2.layout(0, i6, this.mHeaderViewWidth, this.mContentHeight + i6);
        }
        if (!this.mSecondFloorEnabled && (tBRefreshHeader = this.mHeaderView) != null) {
            tBRefreshHeader.getSecondFloorView().setVisibility(8);
        }
        if (this.mFooterView == null) {
            return;
        }
        this.mFooterViewWidth = DisplayUtil.getScreenWidth(getContext());
        TBLoadMoreFooter tBLoadMoreFooter = this.mFooterView;
        int i7 = this.mPushDistance;
        tBLoadMoreFooter.layout(0, measuredHeight - i7, this.mFooterViewWidth, (measuredHeight + this.mMaxPushDistance) - i7);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        TBLoadMoreFooter tBLoadMoreFooter;
        TBRefreshHeader tBRefreshHeader;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        ensureTarget();
        int actionMasked = MotionEventCompat.getActionMasked(motionEvent);
        boolean isChildScrollToTop = this.mPullRefreshEnabled ? isChildScrollToTop() : false;
        if (!isChildScrollToTop && (tBRefreshHeader = this.mHeaderView) != null && tBRefreshHeader.getCurrentState() != TBRefreshHeader.RefreshState.NONE) {
            isChildScrollToTop = true;
        }
        TBRefreshHeader tBRefreshHeader2 = this.mHeaderView;
        if (tBRefreshHeader2 == null || tBRefreshHeader2.getCurrentState() == TBRefreshHeader.RefreshState.SECOND_FLOOR_START || this.mHeaderView.getCurrentState() == TBRefreshHeader.RefreshState.SECOND_FLOOR_END) {
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
            TBRefreshHeader tBRefreshHeader3 = this.mHeaderView;
            if (tBRefreshHeader3 != null && tBRefreshHeader3.getCurrentState() == TBRefreshHeader.RefreshState.REFRESHING) {
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

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        TBLoadMoreFooter tBLoadMoreFooter;
        TBRefreshHeader tBRefreshHeader;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        int actionMasked = MotionEventCompat.getActionMasked(motionEvent);
        boolean isChildScrollToTop = this.mPullRefreshEnabled ? isChildScrollToTop() : false;
        if (!isChildScrollToTop && (tBRefreshHeader = this.mHeaderView) != null && tBRefreshHeader.getCurrentState() != TBRefreshHeader.RefreshState.NONE) {
            isChildScrollToTop = true;
        }
        TBRefreshHeader tBRefreshHeader2 = this.mHeaderView;
        if (tBRefreshHeader2 == null || tBRefreshHeader2.getCurrentState() == TBRefreshHeader.RefreshState.SECOND_FLOOR_START || this.mHeaderView.getCurrentState() == TBRefreshHeader.RefreshState.SECOND_FLOOR_END) {
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
                                this.mHeaderView.changeToState(TBRefreshHeader.RefreshState.PULL_TO_REFRESH);
                            } else if (this.mSecondFloorEnabled) {
                                if (min > this.mSecondFloorDistance) {
                                    this.mHeaderView.changeToState(TBRefreshHeader.RefreshState.PREPARE_TO_SECOND_FLOOR);
                                } else {
                                    this.mHeaderView.changeToState(TBRefreshHeader.RefreshState.RELEASE_TO_REFRESH);
                                }
                            } else {
                                this.mHeaderView.changeToState(TBRefreshHeader.RefreshState.RELEASE_TO_REFRESH);
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
            if (this.mHeaderView.getCurrentState() == TBRefreshHeader.RefreshState.PREPARE_TO_SECOND_FLOOR && this.mSecondFloorEnabled) {
                this.mHeaderView.changeToState(TBRefreshHeader.RefreshState.SECOND_FLOOR_START);
                animateOffsetToBottomPosition(this.mCurrentTargetOffsetTop, new Animator.AnimatorListener() { // from class: com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout.2
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
                            TBSwipeRefreshLayout.access$000(TBSwipeRefreshLayout.this).changeToState(TBRefreshHeader.RefreshState.SECOND_FLOOR_END);
                        }
                    }
                });
            } else if (this.mHeaderView.getCurrentState() == TBRefreshHeader.RefreshState.RELEASE_TO_REFRESH) {
                setRefreshing(true, true);
            } else {
                this.mRefreshing = false;
                this.mHeaderView.changeToState(TBRefreshHeader.RefreshState.NONE);
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
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7da7eba6", new Object[]{this})).booleanValue() : !ViewCompat.canScrollVertically(this.mTarget, -1);
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
            this.mHeaderView.changeToState(TBRefreshHeader.RefreshState.REFRESHING);
            animateOffsetToCorrectPosition(this.mCurrentTargetOffsetTop, new Animator.AnimatorListener() { // from class: com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout.3
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
                    } else {
                        TBSwipeRefreshLayout.access$700(TBSwipeRefreshLayout.this).onAnimationStart(animator);
                    }
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                        return;
                    }
                    TBSwipeRefreshLayout.access$700(TBSwipeRefreshLayout.this).onAnimationEnd(animator);
                    new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout.3.1
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
                    }, TBSwipeRefreshLayout.access$800(TBSwipeRefreshLayout.this));
                }
            });
        }
    }

    public void startAutoPullDown(long j, Animator.AnimatorListener animatorListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14e72f8f", new Object[]{this, new Long(j), animatorListener});
        } else {
            startAutoPullDown(j, true, animatorListener);
        }
    }

    public void startAutoPullDown(long j, final boolean z, final Animator.AnimatorListener animatorListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa7632e5", new Object[]{this, new Long(j), new Boolean(z), animatorListener});
        } else if (this.mHeaderView == null) {
        } else {
            if (j <= 0) {
                j = this.mAutoRefreshDuration;
            }
            final long j2 = j;
            this.mNotify = false;
            ensureTarget();
            this.mRefreshing = true;
            this.mHeaderView.changeToState(TBRefreshHeader.RefreshState.REFRESHING);
            animateOffsetToCorrectPosition(this.mCurrentTargetOffsetTop, new Animator.AnimatorListener() { // from class: com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3a405721", new Object[]{this, animator});
                        return;
                    }
                    TBSwipeRefreshLayout.access$700(TBSwipeRefreshLayout.this).onAnimationStart(animator);
                    Animator.AnimatorListener animatorListener2 = animatorListener;
                    if (animatorListener2 != null) {
                        animatorListener2.onAnimationStart(animator);
                    }
                    TBSwipeRefreshLayout.access$900(TBSwipeRefreshLayout.this, false);
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(final Animator animator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                        return;
                    }
                    TBSwipeRefreshLayout.access$700(TBSwipeRefreshLayout.this).onAnimationEnd(animator);
                    new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout.4.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            if (z) {
                                TBSwipeRefreshLayout.this.setRefreshing(false);
                            }
                            if (animatorListener != null) {
                                animatorListener.onAnimationEnd(animator);
                            }
                            TBSwipeRefreshLayout.access$900(TBSwipeRefreshLayout.this, true);
                        }
                    }, j2);
                    TBSwipeRefreshLayout.access$900(TBSwipeRefreshLayout.this, false);
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("90a3af63", new Object[]{this, animator});
                        return;
                    }
                    Animator.AnimatorListener animatorListener2 = animatorListener;
                    if (animatorListener2 != null) {
                        animatorListener2.onAnimationCancel(animator);
                    }
                    TBSwipeRefreshLayout.access$900(TBSwipeRefreshLayout.this, true);
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("4388ea84", new Object[]{this, animator});
                        return;
                    }
                    Animator.AnimatorListener animatorListener2 = animatorListener;
                    if (animatorListener2 != null) {
                        animatorListener2.onAnimationRepeat(animator);
                    }
                    TBSwipeRefreshLayout.access$900(TBSwipeRefreshLayout.this, false);
                }
            });
        }
    }

    private void showLoadingTip(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b8b5411", new Object[]{this, new Boolean(z)});
        } else if (!(getRefresHeader() instanceof TBOldRefreshHeader)) {
        } else {
            ((TBOldRefreshHeader) getRefresHeader()).showLoadingTip(z);
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
        TBRefreshHeader tBRefreshHeader = this.mHeaderView;
        if (tBRefreshHeader == null) {
            return;
        }
        if (this.mRefreshing != z) {
            this.mNotify = z2;
            ensureTarget();
            this.mRefreshing = z;
            if (this.mRefreshing) {
                this.mHeaderView.changeToState(TBRefreshHeader.RefreshState.REFRESHING);
                animateOffsetToCorrectPosition(this.mCurrentTargetOffsetTop, this.mRefreshListener);
                return;
            }
            this.mHeaderView.changeToState(TBRefreshHeader.RefreshState.NONE);
            animateOffsetToStartPosition(this.mCurrentTargetOffsetTop, this.mRefreshListener);
            TBSoundPlayer.getInstance().playScene(2);
        } else if (tBRefreshHeader.getCurrentState() != TBRefreshHeader.RefreshState.SECOND_FLOOR_END) {
        } else {
            this.mRefreshing = false;
            this.mHeaderView.changeToState(TBRefreshHeader.RefreshState.NONE);
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
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56d673fc", new Object[]{this})).booleanValue() : (getRefresHeader() == null || getRefresHeader().getCurrentState() == TBRefreshHeader.RefreshState.NONE) ? false : true;
    }

    private void animatorFooterToBottom(int i, final int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17d76b2f", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(i, i2);
        ofInt.setDuration(150L);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                    return;
                }
                TBSwipeRefreshLayout.access$1002(TBSwipeRefreshLayout.this, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                TBSwipeRefreshLayout.access$1100(TBSwipeRefreshLayout.this);
            }
        });
        ofInt.addListener(new AnimatorListenerAdapter() { // from class: com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                } else if (i2 <= 0 || TBSwipeRefreshLayout.access$1200(TBSwipeRefreshLayout.this) == null) {
                    TBSwipeRefreshLayout.access$1302(TBSwipeRefreshLayout.this, false);
                    TBSwipeRefreshLayout.access$1400(TBSwipeRefreshLayout.this).changeToState(TBLoadMoreFooter.LoadMoreState.NONE);
                } else {
                    TBSwipeRefreshLayout.access$1302(TBSwipeRefreshLayout.this, true);
                    TBSwipeRefreshLayout.access$1400(TBSwipeRefreshLayout.this).changeToState(TBLoadMoreFooter.LoadMoreState.LOADING);
                    TBSwipeRefreshLayout.access$1200(TBSwipeRefreshLayout.this).onLoadMore();
                }
            }
        });
        ofInt.setInterpolator(this.mDecelerateInterpolator);
        ofInt.start();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void animateOffsetToCorrectPosition(int r6, android.animation.Animator.AnimatorListener r7) {
        /*
            r5 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L1d
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r4] = r5
            java.lang.Integer r4 = new java.lang.Integer
            r4.<init>(r6)
            r1[r3] = r4
            r1[r2] = r7
            java.lang.String r6 = "4d2e911c"
            r0.ipc$dispatch(r6, r1)
            return
        L1d:
            r5.mFrom = r6
            boolean r6 = r5.mEnableTargetOffset
            if (r6 == 0) goto L30
            int r6 = r5.mHeaderViewHeight
            int r0 = r5.mOriginalOffsetTop
            int r0 = java.lang.Math.abs(r0)
            int r6 = r6 - r0
            int r0 = r5.mRefreshOffset
        L2e:
            int r6 = r6 - r0
            goto L40
        L30:
            int r6 = r5.mHeaderViewHeight
            int r0 = r5.mOriginalOffsetTop
            int r0 = java.lang.Math.abs(r0)
            int r6 = r6 - r0
            boolean r0 = r5.mResetTargetHeight
            if (r0 == 0) goto L40
            int r0 = r5.mRefreshOffset
            goto L2e
        L40:
            int[] r0 = new int[r2]
            int r1 = r5.mFrom
            r0[r4] = r1
            r0[r3] = r6
            android.animation.ValueAnimator r6 = android.animation.ValueAnimator.ofInt(r0)
            if (r7 == 0) goto L51
            r6.addListener(r7)
        L51:
            com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout$7 r7 = new com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout$7
            r7.<init>()
            r6.addUpdateListener(r7)
            r0 = 300(0x12c, double:1.48E-321)
            r6.setDuration(r0)
            android.view.animation.DecelerateInterpolator r7 = r5.mDecelerateInterpolator
            r6.setInterpolator(r7)
            r6.start()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout.animateOffsetToCorrectPosition(int, android.animation.Animator$AnimatorListener):void");
    }

    private void animateOffsetToStartPosition(int i, Animator.AnimatorListener animatorListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0556754", new Object[]{this, new Integer(i), animatorListener});
            return;
        }
        this.mFrom = i;
        ValueAnimator ofInt = ValueAnimator.ofInt(this.mFrom, this.mOriginalOffsetTop);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout.8
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
                TBSwipeRefreshLayout.access$500(tBSwipeRefreshLayout, intValue - TBSwipeRefreshLayout.access$000(tBSwipeRefreshLayout).getTop());
            }
        });
        ofInt.setDuration(this.mAnimateToStartDuration);
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
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout.9
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                } else {
                    TBSwipeRefreshLayout.access$500(TBSwipeRefreshLayout.this, ((Integer) ofInt.getAnimatedValue()).intValue() - TBSwipeRefreshLayout.access$000(TBSwipeRefreshLayout.this).getTop());
                }
            }
        });
        ofInt.setDuration(this.mToBottomDuration);
        ofInt.setInterpolator(this.mDecelerateInterpolator);
        if (animatorListener != null) {
            ofInt.addListener(animatorListener);
        }
        ofInt.start();
    }

    public void setAnimateToBottomDuration(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bade883", new Object[]{this, new Integer(i)});
        } else {
            this.mToBottomDuration = i;
        }
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
        OnPullRefreshListener onPullRefreshListener = this.mPullRefreshListener;
        if (onPullRefreshListener == null) {
            return;
        }
        onPullRefreshListener.onPullDistance(i);
    }

    private void updateLoadMoreListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43d6b29f", new Object[]{this});
            return;
        }
        OnPushLoadMoreListener onPushLoadMoreListener = this.mOnPushLoadMoreListener;
        if (onPushLoadMoreListener == null) {
            return;
        }
        onPushLoadMoreListener.onPushDistance(this.mPushDistance);
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
            this.mRefreshOffset = ((int) (i * getResources().getDisplayMetrics().density)) + SystemBarDecorator.getStatusBarHeight(getContext());
            this.mHeaderViewHeight += SystemBarDecorator.getStatusBarHeight(getContext());
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
            return;
        }
        this.mEnableTargetOffset = z;
        this.mResetTargetHeight = false;
    }

    public void disEnableTargetOffsetAndResetH() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73292c42", new Object[]{this});
            return;
        }
        this.mEnableTargetOffset = false;
        this.mResetTargetHeight = true;
    }

    public int getRefreshOffset() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("fae1c812", new Object[]{this})).intValue() : this.mRefreshOffset;
    }

    public void setOnPullRefreshListener(OnPullRefreshListener onPullRefreshListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5f954c4", new Object[]{this, onPullRefreshListener});
            return;
        }
        this.mPullRefreshListener = onPullRefreshListener;
        TBRefreshHeader tBRefreshHeader = this.mHeaderView;
        if (tBRefreshHeader == null) {
            return;
        }
        tBRefreshHeader.setPullRefreshListener(this.mPullRefreshListener);
    }

    public void setRefreshAnimationListener(RefreshAnimationListener refreshAnimationListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a62cdeee", new Object[]{this, refreshAnimationListener});
        } else {
            this.mRefreshAnimationListener = refreshAnimationListener;
        }
    }

    public void setOnPushLoadMoreListener(OnPushLoadMoreListener onPushLoadMoreListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("757ac418", new Object[]{this, onPushLoadMoreListener});
            return;
        }
        this.mOnPushLoadMoreListener = onPushLoadMoreListener;
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

    public void setHeaderView(TBRefreshHeader tBRefreshHeader) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ced23c7", new Object[]{this, tBRefreshHeader});
        } else if (tBRefreshHeader == null) {
        } else {
            int indexOfChild = indexOfChild(this.mHeaderView);
            TBRefreshHeader tBRefreshHeader2 = this.mHeaderView;
            if (tBRefreshHeader2 != null && indexOfChild != -1) {
                removeView(tBRefreshHeader2);
            }
            this.mHeaderView = tBRefreshHeader;
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
            ipChange.ipc$dispatch("82c5d9", new Object[]{this, tBLoadMoreFooter});
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

    public TBRefreshHeader getRefresHeader() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBRefreshHeader) ipChange.ipc$dispatch("239fe6c9", new Object[]{this}) : this.mHeaderView;
    }

    public TBLoadMoreFooter getLoadMoreFooter() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBLoadMoreFooter) ipChange.ipc$dispatch("b73d3b53", new Object[]{this}) : this.mFooterView;
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

    public int getAnimateToStartDuration() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("42d4dfaa", new Object[]{this})).intValue() : this.mAnimateToStartDuration;
    }

    public void setAnimateToStartDuration(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fdf95a0", new Object[]{this, new Integer(i)});
        } else {
            this.mAnimateToStartDuration = i;
        }
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb2f300c", new Object[]{this, configuration});
            return;
        }
        super.onConfigurationChanged(configuration);
        if (Build.VERSION.SDK_INT >= 19 && (l.d(getContext()) || l.b(getContext()))) {
            return;
        }
        DisplayMetrics displayMetrics = DisplayUtil.getDisplayMetrics(getContext());
        this.mDensity = displayMetrics.density;
        this.mHeaderViewHeight = displayMetrics.widthPixels;
        this.mFooterViewHeight = displayMetrics.widthPixels;
        requestLayout();
    }
}
