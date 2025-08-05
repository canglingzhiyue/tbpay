package com.taobao.android.dinamicx.widget.refresh.layout;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.view.NestedScrollingChildHelper;
import android.support.v4.view.NestedScrollingParentHelper;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.OverScroller;
import android.widget.Scroller;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.refresh.layout.constant.DXRefreshState;
import com.taobao.taobao.R;
import tb.gal;
import tb.gam;
import tb.gan;
import tb.gao;
import tb.gap;
import tb.gaq;
import tb.gau;
import tb.gav;
import tb.kge;
import tb.mto;

/* loaded from: classes5.dex */
public class DXRefreshLayout extends ViewGroup {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static ViewGroup.MarginLayoutParams sDefaultMarginLP;
    public Runnable animationRunnable;
    public boolean mAttachedToWindow;
    public int mCurrentVelocity;
    public boolean mDisableContentWhenLoading;
    public boolean mDisableContentWhenRefresh;
    public char mDragDirection;
    public float mDragRate;
    public boolean mEnableAutoLoadMore;
    public boolean mEnableAutoPullLoadMore;
    public boolean mEnableClipFooterWhenFixedBehind;
    public boolean mEnableClipHeaderWhenFixedBehind;
    public boolean mEnableDisallowIntercept;
    public boolean mEnableFooterFollowWhenNoMoreData;
    public boolean mEnableFooterTranslationContent;
    public boolean mEnableHeaderTranslationContent;
    public boolean mEnableLoadMore;
    public boolean mEnableLoadMoreWhenContentNotFull;
    public boolean mEnableNestedScrolling;
    public boolean mEnableOverScrollBounce;
    public boolean mEnableOverScrollDrag;
    public boolean mEnablePreviewInEditMode;
    public boolean mEnablePullLoadMore;
    public boolean mEnablePureScrollMode;
    public boolean mEnableRefresh;
    public boolean mEnableScrollContentWhenLoaded;
    public boolean mEnableScrollContentWhenRefreshed;
    public MotionEvent mFalsifyEvent;
    public int mFloorDuration;
    public int mFooterBackgroundColor;
    public int mFooterHeight;
    public com.taobao.android.dinamicx.widget.refresh.layout.constant.a mFooterHeightStatus;
    public int mFooterInsetStart;
    public boolean mFooterLocked;
    public float mFooterMaxDragRate;
    public boolean mFooterNeedTouchEventWhenLoading;
    public boolean mFooterNoMoreData;
    public boolean mFooterNoMoreDataEffective;
    public float mFooterTriggerRate;
    public Handler mHandler;
    public int mHeaderBackgroundColor;
    public int mHeaderHeight;
    public com.taobao.android.dinamicx.widget.refresh.layout.constant.a mHeaderHeightStatus;
    public int mHeaderInsetStart;
    public float mHeaderMaxDragRate;
    public boolean mHeaderNeedTouchEventWhenRefreshing;
    public float mHeaderTriggerRate;
    public boolean mIsBeingDragged;
    public c mKernel;
    public long mLastOpenTime;
    public int mLastSpinner;
    public float mLastTouchX;
    public float mLastTouchY;
    public gap mLoadMoreListener;
    public boolean mManualFooterTranslationContent;
    public boolean mManualHeaderTranslationContent;
    public boolean mManualLoadMore;
    public int mMaximumVelocity;
    public int mMinimumVelocity;
    public NestedScrollingChildHelper mNestedChild;
    public boolean mNestedInProgress;
    public NestedScrollingParentHelper mNestedParent;
    public Paint mPaint;
    public int[] mParentOffsetInWindow;
    public int[] mPrimaryColors;
    public int mReboundDuration;
    public Interpolator mReboundInterpolator;
    public gam mRefreshContent;
    public gal mRefreshHeader;
    public gaq mRefreshListener;
    public int mScreenHeightPixels;
    public gao mScrollBoundaryDecider;
    public Scroller mScroller;
    public int mSpinner;
    public DXRefreshState mState;
    public boolean mSuperDispatchTouchEvent;
    public int mTotalUnconsumed;
    public int mTouchSlop;
    public int mTouchSpinner;
    public float mTouchX;
    public float mTouchY;
    public float mTwoLevelBottomPullUpToCloseRate;
    public VelocityTracker mVelocityTracker;
    public boolean mVerticalPermit;
    public DXRefreshState mViceState;
    public ValueAnimator reboundAnimator;

    public static /* synthetic */ Object ipc$super(DXRefreshLayout dXRefreshLayout, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1952076612:
                return new Boolean(super.drawChild((Canvas) objArr[0], (View) objArr[1], ((Number) objArr[2]).longValue()));
            case -1838743131:
                super.setMeasuredDimension(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case -913029150:
                return new Integer(super.getSuggestedMinimumHeight());
            case 8324447:
                return new Integer(super.getSuggestedMinimumWidth());
            case 64333381:
                return super.getChildAt(((Number) objArr[0]).intValue());
            case 949399698:
                super.onDetachedFromWindow();
                return null;
            case 1502719299:
                return new Integer(super.getChildCount());
            case 1600372231:
                super.bringChildToFront((View) objArr[0]);
                return null;
            case 1626033557:
                super.onAttachedToWindow();
                return null;
            case 1811093890:
                super.removeView((View) objArr[0]);
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

    public ViewGroup getLayout() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("7c097b8e", new Object[]{this}) : this;
    }

    public static /* synthetic */ boolean access$001(DXRefreshLayout dXRefreshLayout, MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a4a31faa", new Object[]{dXRefreshLayout, motionEvent})).booleanValue() : super.dispatchTouchEvent(motionEvent);
    }

    public static /* synthetic */ boolean access$101(DXRefreshLayout dXRefreshLayout, MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5d2fe009", new Object[]{dXRefreshLayout, motionEvent})).booleanValue() : super.dispatchTouchEvent(motionEvent);
    }

    public static /* synthetic */ boolean access$201(DXRefreshLayout dXRefreshLayout, MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("15bca068", new Object[]{dXRefreshLayout, motionEvent})).booleanValue() : super.dispatchTouchEvent(motionEvent);
    }

    public static /* synthetic */ boolean access$301(DXRefreshLayout dXRefreshLayout, MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ce4960c7", new Object[]{dXRefreshLayout, motionEvent})).booleanValue() : super.dispatchTouchEvent(motionEvent);
    }

    public static /* synthetic */ boolean access$401(DXRefreshLayout dXRefreshLayout, MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("86d62126", new Object[]{dXRefreshLayout, motionEvent})).booleanValue() : super.dispatchTouchEvent(motionEvent);
    }

    public static /* synthetic */ boolean access$501(DXRefreshLayout dXRefreshLayout, MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3f62e185", new Object[]{dXRefreshLayout, motionEvent})).booleanValue() : super.dispatchTouchEvent(motionEvent);
    }

    static {
        kge.a(-1384242248);
        sDefaultMarginLP = new ViewGroup.MarginLayoutParams(-1, -1);
    }

    public DXRefreshLayout(Context context) {
        this(context, null);
    }

    public DXRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mFloorDuration = 300;
        this.mReboundDuration = 300;
        this.mDragRate = 0.5f;
        this.mDragDirection = 'n';
        this.mEnableRefresh = true;
        this.mEnableLoadMore = false;
        this.mEnableClipHeaderWhenFixedBehind = true;
        this.mEnableClipFooterWhenFixedBehind = true;
        this.mEnableHeaderTranslationContent = true;
        this.mEnableFooterTranslationContent = true;
        this.mEnableFooterFollowWhenNoMoreData = false;
        this.mEnablePreviewInEditMode = true;
        this.mEnableOverScrollBounce = true;
        this.mEnableOverScrollDrag = false;
        this.mEnableAutoLoadMore = true;
        this.mEnablePureScrollMode = false;
        this.mEnableScrollContentWhenLoaded = true;
        this.mEnableScrollContentWhenRefreshed = true;
        this.mEnableLoadMoreWhenContentNotFull = true;
        this.mEnableNestedScrolling = false;
        this.mDisableContentWhenRefresh = false;
        this.mDisableContentWhenLoading = false;
        this.mFooterNoMoreData = false;
        this.mFooterNoMoreDataEffective = false;
        this.mManualLoadMore = false;
        this.mManualHeaderTranslationContent = false;
        this.mManualFooterTranslationContent = false;
        this.mEnablePullLoadMore = false;
        this.mEnableAutoPullLoadMore = false;
        this.mParentOffsetInWindow = new int[2];
        this.mNestedChild = new NestedScrollingChildHelper(this);
        this.mNestedParent = new NestedScrollingParentHelper(this);
        this.mHeaderHeightStatus = com.taobao.android.dinamicx.widget.refresh.layout.constant.a.DefaultUnNotify;
        this.mFooterHeightStatus = com.taobao.android.dinamicx.widget.refresh.layout.constant.a.DefaultUnNotify;
        this.mHeaderMaxDragRate = 2.5f;
        this.mFooterMaxDragRate = 2.5f;
        this.mHeaderTriggerRate = 1.0f;
        this.mFooterTriggerRate = 1.0f;
        this.mTwoLevelBottomPullUpToCloseRate = 0.16666667f;
        this.mKernel = new c();
        this.mState = DXRefreshState.None;
        this.mViceState = DXRefreshState.None;
        this.mLastOpenTime = 0L;
        this.mHeaderBackgroundColor = 0;
        this.mFooterBackgroundColor = 0;
        this.mFooterLocked = false;
        this.mVerticalPermit = false;
        this.mFalsifyEvent = null;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.mHandler = new Handler(Looper.getMainLooper());
        this.mScroller = new Scroller(context);
        this.mVelocityTracker = VelocityTracker.obtain();
        this.mScreenHeightPixels = context.getResources().getDisplayMetrics().heightPixels;
        this.mReboundInterpolator = new gau(gau.f28251a);
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
        this.mMinimumVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        this.mMaximumVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        this.mFooterHeight = gau.a(60.0f);
        this.mHeaderHeight = gau.a(100.0f);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        this.mAttachedToWindow = true;
        if (!isInEditMode()) {
            if (this.mRefreshContent == null) {
                int childCount = getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = getChildAt(i);
                    gal galVar = this.mRefreshHeader;
                    if (galVar == null || childAt != galVar.f()) {
                        this.mRefreshContent = new gav(childAt);
                    }
                }
            }
            if (this.mRefreshContent == null) {
                int a2 = gau.a(20.0f);
                TextView textView = new TextView(getContext());
                textView.setTextColor(-39424);
                textView.setGravity(17);
                textView.setTextSize(20.0f);
                textView.setText(R.string.dx_refresh_layout_content_empty);
                super.addView(textView, 0, new LayoutParams(-1, -1));
                this.mRefreshContent = new gav(textView);
                this.mRefreshContent.a().setPadding(a2, a2, a2, a2);
            }
            this.mRefreshContent.a(this.mScrollBoundaryDecider);
            this.mRefreshContent.a(this.mEnableLoadMoreWhenContentNotFull);
            this.mRefreshContent.a(this.mKernel, (View) null, (View) null);
            if (this.mSpinner != 0) {
                notifyStateChanged(DXRefreshState.None);
                gam gamVar = this.mRefreshContent;
                this.mSpinner = 0;
                gamVar.a(0, -1, -1);
            }
        }
        gam gamVar2 = this.mRefreshContent;
        if (gamVar2 != null) {
            super.bringChildToFront(gamVar2.a());
        }
        gal galVar2 = this.mRefreshHeader;
        if (galVar2 == null || !galVar2.a().b) {
            return;
        }
        super.bringChildToFront(this.mRefreshHeader.f());
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0143  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r17, int r18) {
        /*
            Method dump skipped, instructions count: 562
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.dinamicx.widget.refresh.layout.DXRefreshLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        getPaddingBottom();
        int childCount = super.getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = super.getChildAt(i5);
            if (childAt.getVisibility() != 8 && !"GONE".equals(childAt.getTag(R.id.dx_refresh_layout_tag))) {
                gam gamVar = this.mRefreshContent;
                if (gamVar != null && gamVar.a() == childAt) {
                    boolean z2 = isInEditMode() && this.mEnablePreviewInEditMode && (isEnableRefreshOrLoadMore(this.mEnableRefresh) || isEnablePullLoadMore()) && this.mRefreshHeader != null;
                    View a2 = this.mRefreshContent.a();
                    ViewGroup.LayoutParams layoutParams = a2.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : sDefaultMarginLP;
                    int i6 = marginLayoutParams.leftMargin + paddingLeft;
                    int i7 = marginLayoutParams.topMargin + paddingTop;
                    int measuredWidth = a2.getMeasuredWidth() + i6;
                    int measuredHeight = a2.getMeasuredHeight() + i7;
                    if (z2 && isEnableTranslationContent(this.mEnableHeaderTranslationContent, this.mRefreshHeader)) {
                        int i8 = this.mHeaderHeight;
                        i7 += i8;
                        measuredHeight += i8;
                    }
                    a2.layout(i6, i7, measuredWidth, measuredHeight);
                }
                gal galVar = this.mRefreshHeader;
                if (galVar != null && galVar.f() == childAt) {
                    boolean z3 = isInEditMode() && this.mEnablePreviewInEditMode && (isEnableRefreshOrLoadMore(this.mEnableRefresh) || isEnablePullLoadMore());
                    View f = this.mRefreshHeader.f();
                    ViewGroup.LayoutParams layoutParams2 = f.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : sDefaultMarginLP;
                    int i9 = marginLayoutParams2.leftMargin;
                    int i10 = marginLayoutParams2.topMargin + this.mHeaderInsetStart;
                    int measuredWidth2 = f.getMeasuredWidth() + i9;
                    int measuredHeight2 = f.getMeasuredHeight() + i10;
                    if (!z3 && this.mRefreshHeader.a() == com.taobao.android.dinamicx.widget.refresh.layout.constant.b.Translate) {
                        i10 -= f.getMeasuredHeight();
                        measuredHeight2 = 0;
                    }
                    f.layout(i9, i10, measuredWidth2, measuredHeight2);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        this.mAttachedToWindow = false;
        this.mManualLoadMore = true;
        this.animationRunnable = null;
        ValueAnimator valueAnimator = this.reboundAnimator;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.reboundAnimator.removeAllUpdateListeners();
            this.reboundAnimator.setDuration(0L);
            this.reboundAnimator.cancel();
            this.reboundAnimator = null;
        }
        if (this.mRefreshHeader != null) {
            DXRefreshState dXRefreshState = DXRefreshState.Refreshing;
        }
        if (this.mSpinner != 0) {
            this.mKernel.a(0, true);
        }
        if (this.mState != DXRefreshState.None) {
            notifyStateChanged(DXRefreshState.None);
        }
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        this.mFooterLocked = false;
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        Paint paint;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8ba5acbc", new Object[]{this, canvas, view, new Long(j)})).booleanValue();
        }
        gam gamVar = this.mRefreshContent;
        View a2 = gamVar != null ? gamVar.a() : null;
        gal galVar = this.mRefreshHeader;
        if (galVar != null && galVar.f() == view) {
            if ((!isEnableRefreshOrLoadMore(this.mEnableRefresh) && !isEnablePullLoadMore()) || (!this.mEnablePreviewInEditMode && isInEditMode())) {
                return true;
            }
            if (a2 != null) {
                int max = Math.max(a2.getTop() + a2.getPaddingTop() + this.mSpinner, view.getTop());
                int i = this.mHeaderBackgroundColor;
                if (i != 0 && (paint = this.mPaint) != null) {
                    paint.setColor(i);
                    if (this.mRefreshHeader.a().c) {
                        max = view.getBottom();
                    } else if (this.mRefreshHeader.a() == com.taobao.android.dinamicx.widget.refresh.layout.constant.b.Translate) {
                        max = view.getBottom() + this.mSpinner;
                    }
                    canvas.drawRect(0.0f, view.getTop(), getWidth(), max, this.mPaint);
                }
                if ((this.mEnableClipHeaderWhenFixedBehind && this.mRefreshHeader.a() == com.taobao.android.dinamicx.widget.refresh.layout.constant.b.FixedBehind) || this.mRefreshHeader.a().c) {
                    canvas.save();
                    canvas.clipRect(view.getLeft(), view.getTop(), view.getRight(), max);
                    boolean drawChild = super.drawChild(canvas, view, j);
                    canvas.restore();
                    return drawChild;
                }
            }
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.View
    public void computeScroll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cab3086b", new Object[]{this});
            return;
        }
        this.mScroller.getCurrY();
        if (!this.mScroller.computeScrollOffset()) {
            return;
        }
        int finalY = this.mScroller.getFinalY();
        if ((finalY < 0 && ((this.mEnableRefresh || this.mEnableOverScrollDrag) && this.mRefreshContent.c())) || (finalY > 0 && this.mEnableOverScrollDrag && this.mRefreshContent.d())) {
            if (this.mVerticalPermit) {
                animSpinnerBounce(finalY > 0 ? -this.mScroller.getCurrVelocity() : this.mScroller.getCurrVelocity());
            }
            this.mScroller.forceFinished(true);
            return;
        }
        this.mVerticalPermit = true;
        invalidate();
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x00ed, code lost:
        if (r11 != 3) goto L81;
     */
    /* JADX WARN: Removed duplicated region for block: B:207:0x02ec A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:208:0x02ed  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean dispatchTouchEvent(android.view.MotionEvent r23) {
        /*
            Method dump skipped, instructions count: 840
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.dinamicx.widget.refresh.layout.DXRefreshLayout.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79ab759a", new Object[]{this, new Boolean(z)});
            return;
        }
        View b2 = this.mRefreshContent.b();
        if ((Build.VERSION.SDK_INT < 21 && (b2 instanceof AbsListView)) || !ViewCompat.isNestedScrollingEnabled(b2)) {
            return;
        }
        this.mEnableDisallowIntercept = z;
        super.requestDisallowInterceptTouchEvent(z);
    }

    public boolean startFlingIfNeed(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("effb4a30", new Object[]{this, new Float(f)})).booleanValue();
        }
        if (f == 0.0f) {
            f = this.mCurrentVelocity;
        }
        if (Math.abs(f) > this.mMinimumVelocity) {
            if (this.mSpinner * f < 0.0f) {
                if (this.mState == DXRefreshState.Refreshing || this.mState == DXRefreshState.Loading || (this.mSpinner < 0 && this.mFooterNoMoreData)) {
                    this.animationRunnable = new b(f).a();
                    return true;
                } else if (this.mState.isReleaseToOpening) {
                    return true;
                }
            }
            if (isEnablePullLoadMore() && (this.mViceState.isHeader || (this.mSpinner >= 0 && f > 0.0f))) {
                this.animationRunnable = new d(getContext(), (int) f);
                return true;
            } else if (f > 0.0f && ((this.mEnableOverScrollBounce && this.mEnableRefresh) || this.mEnableOverScrollDrag || (this.mState == DXRefreshState.Refreshing && this.mSpinner <= 0))) {
                this.mVerticalPermit = false;
                this.mScroller.fling(0, 0, 0, (int) (-f), 0, 0, -2147483647, Integer.MAX_VALUE);
                this.mScroller.computeScrollOffset();
                invalidate();
            }
        }
        return false;
    }

    public boolean interceptAnimatorByAction(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("83ac92ca", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (i == 0) {
            if (this.reboundAnimator != null) {
                if (this.mState.isFinishing || this.mState == DXRefreshState.TwoLevelReleased || this.mState == DXRefreshState.RefreshReleased || this.mState == DXRefreshState.LoadReleased) {
                    return true;
                }
                if (this.mState == DXRefreshState.PullDownCanceled) {
                    this.mKernel.a(DXRefreshState.PullDownToRefresh);
                } else if (this.mState == DXRefreshState.PullUpCanceled) {
                    this.mKernel.a(DXRefreshState.PullUpToLoad);
                }
                this.reboundAnimator.setDuration(0L);
                this.reboundAnimator.cancel();
                this.reboundAnimator = null;
            }
            this.animationRunnable = null;
        }
        return this.reboundAnimator != null;
    }

    public void notifyStateChanged(DXRefreshState dXRefreshState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57b31d2", new Object[]{this, dXRefreshState});
            return;
        }
        DXRefreshState dXRefreshState2 = this.mState;
        if (dXRefreshState2 != dXRefreshState) {
            this.mState = dXRefreshState;
            this.mViceState = dXRefreshState;
            gal galVar = this.mRefreshHeader;
            if (galVar != null) {
                galVar.a(this, dXRefreshState2, dXRefreshState);
            }
            if (dXRefreshState != DXRefreshState.LoadFinish) {
                return;
            }
            this.mFooterLocked = false;
        } else if (this.mViceState == dXRefreshState2) {
        } else {
            this.mViceState = dXRefreshState2;
        }
    }

    public void setStateDirectLoading(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c6c9a9", new Object[]{this, new Boolean(z)});
        } else if (this.mState == DXRefreshState.Loading) {
        } else {
            this.mLastOpenTime = System.currentTimeMillis();
            this.mFooterLocked = true;
            notifyStateChanged(DXRefreshState.Loading);
        }
    }

    public void setStateRefreshing(final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87985717", new Object[]{this, new Boolean(z)});
            return;
        }
        AnimatorListenerAdapter animatorListenerAdapter = new AnimatorListenerAdapter() { // from class: com.taobao.android.dinamicx.widget.refresh.layout.DXRefreshLayout.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                } else if (animator != null && animator.getDuration() == 0) {
                } else {
                    DXRefreshLayout.this.mLastOpenTime = System.currentTimeMillis();
                    DXRefreshLayout.this.notifyStateChanged(DXRefreshState.Refreshing);
                    if (DXRefreshLayout.this.mRefreshListener == null || !z) {
                        return;
                    }
                    DXRefreshLayout.this.mRefreshListener.a(DXRefreshLayout.this);
                }
            }
        };
        notifyStateChanged(DXRefreshState.RefreshReleased);
        ValueAnimator a2 = this.mKernel.a(this.mHeaderHeight);
        if (a2 != null) {
            a2.addListener(animatorListenerAdapter);
        }
        if (a2 != null) {
            return;
        }
        animatorListenerAdapter.onAnimationEnd(null);
    }

    public void setViceState(DXRefreshState dXRefreshState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec3ade4", new Object[]{this, dXRefreshState});
            return;
        }
        if (this.mState.isDragging && this.mState.isHeader != dXRefreshState.isHeader) {
            notifyStateChanged(DXRefreshState.None);
        }
        if (this.mViceState == dXRefreshState) {
            return;
        }
        this.mViceState = dXRefreshState;
    }

    public boolean isEnableTranslationContent(boolean z, gal galVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ed4287fa", new Object[]{this, new Boolean(z), galVar})).booleanValue() : z || this.mEnablePureScrollMode || galVar == null || galVar.a() == com.taobao.android.dinamicx.widget.refresh.layout.constant.b.FixedBehind;
    }

    public boolean isEnableRefreshOrLoadMore(boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("cc0c28e5", new Object[]{this, new Boolean(z)})).booleanValue() : z && !this.mEnablePureScrollMode;
    }

    /* loaded from: classes5.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f12177a;
        public float d;
        public int b = 0;
        public int c = 10;
        public float e = 0.98f;
        public long f = 0;
        public long g = AnimationUtils.currentAnimationTimeMillis();

        static {
            kge.a(-295832435);
            kge.a(-1390502639);
        }

        public b(float f) {
            this.d = f;
            this.f12177a = DXRefreshLayout.this.mSpinner;
        }

        public Runnable a() {
            IpChange ipChange = $ipChange;
            int i = 0;
            if (ipChange instanceof IpChange) {
                return (Runnable) ipChange.ipc$dispatch("95a5d02c", new Object[]{this});
            }
            if (DXRefreshLayout.this.mState.isFinishing) {
                return null;
            }
            if (DXRefreshLayout.this.mSpinner != 0 && (!DXRefreshLayout.this.mState.isOpening || (DXRefreshLayout.this.mState == DXRefreshState.Refreshing && DXRefreshLayout.this.mSpinner > DXRefreshLayout.this.mHeaderHeight))) {
                int i2 = DXRefreshLayout.this.mSpinner;
                int i3 = DXRefreshLayout.this.mSpinner;
                float f = this.d;
                while (true) {
                    if (i3 * i2 <= 0) {
                        break;
                    }
                    i++;
                    f = (float) (f * Math.pow(this.e, (this.c * i) / 10.0f));
                    float f2 = ((this.c * 1.0f) / 1000.0f) * f;
                    if (Math.abs(f2) >= 1.0f) {
                        i2 = (int) (i2 + f2);
                    } else if (!DXRefreshLayout.this.mState.isOpening || ((DXRefreshLayout.this.mState == DXRefreshState.Refreshing && i2 > DXRefreshLayout.this.mHeaderHeight) || (DXRefreshLayout.this.mState != DXRefreshState.Refreshing && i2 < (-DXRefreshLayout.this.mFooterHeight)))) {
                        return null;
                    }
                }
            }
            this.f = AnimationUtils.currentAnimationTimeMillis();
            DXRefreshLayout.this.mHandler.postDelayed(this, this.c);
            return this;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (DXRefreshLayout.this.animationRunnable != this || DXRefreshLayout.this.mState.isFinishing) {
            } else {
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                this.d = (float) (this.d * Math.pow(this.e, ((float) (currentAnimationTimeMillis - this.f)) / (1000.0f / this.c)));
                float f = this.d * ((((float) (currentAnimationTimeMillis - this.g)) * 1.0f) / 1000.0f);
                if (Math.abs(f) > 1.0f) {
                    this.g = currentAnimationTimeMillis;
                    this.f12177a = (int) (this.f12177a + f);
                    if (DXRefreshLayout.this.mSpinner * this.f12177a > 0) {
                        DXRefreshLayout.this.mKernel.a(this.f12177a, true);
                        DXRefreshLayout.this.mHandler.postDelayed(this, this.c);
                        return;
                    }
                    DXRefreshLayout dXRefreshLayout = DXRefreshLayout.this;
                    dXRefreshLayout.animationRunnable = null;
                    dXRefreshLayout.mKernel.a(0, true);
                    gau.a(DXRefreshLayout.this.mRefreshContent.b(), (int) (-this.d));
                    if (!DXRefreshLayout.this.mFooterLocked || f <= 0.0f) {
                        return;
                    }
                    DXRefreshLayout.this.mFooterLocked = false;
                    return;
                }
                DXRefreshLayout.this.animationRunnable = null;
            }
        }
    }

    /* loaded from: classes5.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public int c;
        public float f;

        /* renamed from: a  reason: collision with root package name */
        public int f12176a = 0;
        public int b = 10;
        public float e = 0.0f;
        public long d = AnimationUtils.currentAnimationTimeMillis();

        static {
            kge.a(-319956911);
            kge.a(-1390502639);
        }

        public a(float f, int i) {
            this.f = f;
            this.c = i;
            DXRefreshLayout.this.mHandler.postDelayed(this, this.b);
            if (f > 0.0f) {
                DXRefreshLayout.this.mKernel.a(DXRefreshState.PullDownToRefresh);
            } else {
                DXRefreshLayout.this.mKernel.a(DXRefreshState.PullUpToLoad);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            int i;
            int i2;
            int i3;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (DXRefreshLayout.this.animationRunnable != this || DXRefreshLayout.this.mState.isFinishing) {
            } else {
                if (Math.abs(DXRefreshLayout.this.mSpinner) >= Math.abs(this.c)) {
                    if (this.c != 0) {
                        this.f12176a = this.f12176a + 1;
                        this.f = (float) (this.f * Math.pow(0.44999998807907104d, i3 << 1));
                    } else {
                        this.f12176a = this.f12176a + 1;
                        this.f = (float) (this.f * Math.pow(0.8500000238418579d, i2 << 1));
                    }
                } else {
                    this.f12176a = this.f12176a + 1;
                    this.f = (float) (this.f * Math.pow(0.949999988079071d, i << 1));
                }
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                float f = this.f * ((((float) (currentAnimationTimeMillis - this.d)) * 1.0f) / 1000.0f);
                if (Math.abs(f) >= 1.0f) {
                    this.d = currentAnimationTimeMillis;
                    this.e += f;
                    DXRefreshLayout.this.moveSpinnerInfinitely(this.e);
                    DXRefreshLayout.this.mHandler.postDelayed(this, this.b);
                    return;
                }
                if (DXRefreshLayout.this.mViceState.isDragging && DXRefreshLayout.this.mViceState.isHeader) {
                    DXRefreshLayout.this.mKernel.a(DXRefreshState.PullDownCanceled);
                } else if (DXRefreshLayout.this.mViceState.isDragging && DXRefreshLayout.this.mViceState.isFooter) {
                    DXRefreshLayout.this.mKernel.a(DXRefreshState.PullUpCanceled);
                }
                DXRefreshLayout dXRefreshLayout = DXRefreshLayout.this;
                dXRefreshLayout.animationRunnable = null;
                if (Math.abs(dXRefreshLayout.mSpinner) < Math.abs(this.c)) {
                    return;
                }
                DXRefreshLayout dXRefreshLayout2 = DXRefreshLayout.this;
                dXRefreshLayout2.animSpinner(this.c, 0, dXRefreshLayout2.mReboundInterpolator, Math.min(Math.max((int) gau.a(Math.abs(DXRefreshLayout.this.mSpinner - this.c)), 30), 100) * 10);
            }
        }
    }

    /* loaded from: classes5.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private int b;
        private int c;
        private final OverScroller d;
        private int e = 10;

        static {
            kge.a(-1954737537);
            kge.a(-1390502639);
        }

        public d(Context context, int i) {
            this.d = new OverScroller(context, new Interpolator() { // from class: com.taobao.android.dinamicx.widget.refresh.layout.DXRefreshLayout.d.1
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
            });
            this.b = DXRefreshLayout.this.mSpinner;
            this.d.fling(0, 0, 0, i, 0, 0, -2147483647, Integer.MAX_VALUE);
            this.d.computeScrollOffset();
            DXRefreshLayout.this.mHandler.postDelayed(this, this.e);
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (DXRefreshLayout.this.animationRunnable != this) {
            } else {
                if (this.d.computeScrollOffset()) {
                    int currY = this.d.getCurrY();
                    int i = currY - this.c;
                    this.c = currY;
                    int i2 = this.b + i;
                    if (i2 > 0 && DXRefreshLayout.this.mRefreshContent != null && DXRefreshLayout.this.mRefreshContent.c()) {
                        if (DXRefreshLayout.this.isEnablePullLoadMore()) {
                            i2 = Math.min(i2, DXRefreshLayout.this.mHeaderHeight);
                        }
                        if (this.b == i2) {
                            DXRefreshLayout.this.animationRunnable = null;
                            return;
                        }
                        this.b = i2;
                        if (!DXRefreshLayout.this.isEnablePullLoadMore() || DXRefreshLayout.this.mEnableAutoPullLoadMore || DXRefreshLayout.this.mState.isPullDownLoadState()) {
                            DXRefreshLayout.this.mKernel.a(i2, true);
                        }
                    }
                    int i3 = this.b;
                    if (i3 >= 0 && i2 <= 0 && i < 0) {
                        DXRefreshLayout dXRefreshLayout = DXRefreshLayout.this;
                        dXRefreshLayout.animationRunnable = null;
                        if (i3 > 0) {
                            dXRefreshLayout.mKernel.a(0, true);
                        }
                        if (DXRefreshLayout.this.mRefreshContent != null) {
                            gau.a(DXRefreshLayout.this.mRefreshContent.b(), (int) this.d.getCurrVelocity());
                        }
                        this.d.forceFinished(true);
                        return;
                    }
                    DXRefreshLayout.this.mHandler.postDelayed(this, this.e);
                    return;
                }
                DXRefreshLayout.this.animationRunnable = null;
            }
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            this.d.forceFinished(true);
            DXRefreshLayout.this.animationRunnable = null;
        }
    }

    public ValueAnimator animSpinner(int i, int i2, Interpolator interpolator, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ValueAnimator) ipChange.ipc$dispatch("a830fc91", new Object[]{this, new Integer(i), new Integer(i2), interpolator, new Integer(i3)});
        }
        if (this.mSpinner == i) {
            return null;
        }
        ValueAnimator valueAnimator = this.reboundAnimator;
        if (valueAnimator != null) {
            valueAnimator.setDuration(0L);
            this.reboundAnimator.cancel();
            this.reboundAnimator = null;
        }
        this.animationRunnable = null;
        this.reboundAnimator = ValueAnimator.ofInt(this.mSpinner, i);
        this.reboundAnimator.setDuration(i3);
        this.reboundAnimator.setInterpolator(interpolator);
        this.reboundAnimator.addListener(new AnimatorListenerAdapter() { // from class: com.taobao.android.dinamicx.widget.refresh.layout.DXRefreshLayout.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                } else if (animator != null && animator.getDuration() == 0) {
                } else {
                    DXRefreshLayout dXRefreshLayout = DXRefreshLayout.this;
                    dXRefreshLayout.reboundAnimator = null;
                    if (dXRefreshLayout.mSpinner == 0 && DXRefreshLayout.this.mState != DXRefreshState.None && !DXRefreshLayout.this.mState.isOpening && !DXRefreshLayout.this.mState.isDragging) {
                        DXRefreshLayout.this.notifyStateChanged(DXRefreshState.None);
                    } else if (DXRefreshLayout.this.mState == DXRefreshLayout.this.mViceState) {
                    } else {
                        DXRefreshLayout dXRefreshLayout2 = DXRefreshLayout.this;
                        dXRefreshLayout2.setViceState(dXRefreshLayout2.mState);
                    }
                }
            }
        });
        this.reboundAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.taobao.android.dinamicx.widget.refresh.layout.DXRefreshLayout.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator2});
                } else {
                    DXRefreshLayout.this.mKernel.a(((Integer) valueAnimator2.getAnimatedValue()).intValue(), false);
                }
            }
        });
        this.reboundAnimator.setStartDelay(i2);
        this.reboundAnimator.start();
        return this.reboundAnimator;
    }

    public void animSpinnerBounce(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88f8aaa9", new Object[]{this, new Float(f)});
        } else if (this.reboundAnimator != null) {
        } else {
            if (f > 0.0f && (this.mState == DXRefreshState.Refreshing || this.mState == DXRefreshState.TwoLevel)) {
                this.animationRunnable = new a(f, this.mHeaderHeight);
            } else if (this.mSpinner != 0 || !this.mEnableOverScrollBounce) {
            } else {
                this.animationRunnable = new a(f, 0);
            }
        }
    }

    public void overSpinner() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fe860ac", new Object[]{this});
        } else if (isEnablePullLoadMore()) {
        } else {
            if (this.mState == DXRefreshState.TwoLevel) {
                if (this.mCurrentVelocity > -1000 && this.mSpinner > getHeight() / 2) {
                    ValueAnimator a2 = this.mKernel.a(getHeight());
                    if (a2 == null) {
                        return;
                    }
                    a2.setDuration(this.mFloorDuration);
                } else if (!this.mIsBeingDragged) {
                } else {
                    this.mKernel.a();
                }
            } else if (this.mState == DXRefreshState.Refreshing) {
                int i = this.mSpinner;
                int i2 = this.mHeaderHeight;
                if (i > i2) {
                    this.mKernel.a(i2);
                } else if (i >= 0) {
                } else {
                    this.mKernel.a(0);
                }
            } else if (this.mState == DXRefreshState.PullDownToRefresh) {
                this.mKernel.a(DXRefreshState.PullDownCanceled);
            } else if (this.mState == DXRefreshState.PullUpToLoad) {
                this.mKernel.a(DXRefreshState.PullUpCanceled);
            } else if (this.mState == DXRefreshState.ReleaseToRefresh) {
                this.mKernel.a(DXRefreshState.Refreshing);
            } else if (this.mState == DXRefreshState.ReleaseToLoad) {
                this.mKernel.a(DXRefreshState.Loading);
            } else if (this.mState == DXRefreshState.ReleaseToTwoLevel) {
                this.mKernel.a(DXRefreshState.TwoLevelReleased);
            } else if (this.mState == DXRefreshState.RefreshReleased) {
                if (this.reboundAnimator != null) {
                    return;
                }
                this.mKernel.a(this.mHeaderHeight);
            } else if (this.mState == DXRefreshState.LoadReleased) {
                if (this.reboundAnimator != null) {
                    return;
                }
                this.mKernel.a(-this.mFooterHeight);
            } else if (this.mState == DXRefreshState.LoadFinish || this.mSpinner == 0) {
            } else {
                this.mKernel.a(0);
            }
        }
    }

    public void moveSpinnerInfinitely(float f) {
        float f2 = f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cace3f0", new Object[]{this, new Float(f2)});
            return;
        }
        if (this.mNestedInProgress && !this.mEnableLoadMoreWhenContentNotFull && f2 < 0.0f && !this.mRefreshContent.d()) {
            f2 = 0.0f;
        }
        if (this.mState == DXRefreshState.TwoLevel && f2 > 0.0f) {
            this.mKernel.a(Math.min((int) f2, getMeasuredHeight()), true);
        } else if (this.mState == DXRefreshState.Refreshing && f2 >= 0.0f) {
            int i = this.mHeaderHeight;
            if (f2 < i) {
                this.mKernel.a((int) f2, true);
                return;
            }
            float f3 = this.mHeaderMaxDragRate;
            if (f3 < 10.0f) {
                f3 *= i;
            }
            double d2 = f3 - this.mHeaderHeight;
            int max = Math.max((this.mScreenHeightPixels << 2) / 3, getHeight());
            int i2 = this.mHeaderHeight;
            double d3 = max - i2;
            double max2 = Math.max(0.0f, (f2 - i2) * this.mDragRate);
            double d4 = -max2;
            if (d3 == mto.a.GEO_NOT_SUPPORT) {
                d3 = 1.0d;
            }
            this.mKernel.a(((int) Math.min(d2 * (1.0d - Math.pow(100.0d, d4 / d3)), max2)) + this.mHeaderHeight, true);
        } else if (f2 >= 0.0f) {
            if (isEnablePullLoadMore()) {
                if (!this.mEnableAutoPullLoadMore && !this.mState.isPullDownLoadState()) {
                    return;
                }
                this.mKernel.a(Math.min((int) f2, this.mHeaderHeight), true);
                return;
            }
            float f4 = this.mHeaderMaxDragRate;
            double d5 = f4 < 10.0f ? this.mHeaderHeight * f4 : f4;
            double max3 = Math.max(this.mScreenHeightPixels / 2, getHeight());
            double max4 = Math.max(0.0f, f2 * this.mDragRate);
            double d6 = -max4;
            if (max3 == mto.a.GEO_NOT_SUPPORT) {
                max3 = 1.0d;
            }
            this.mKernel.a((int) Math.min(d5 * (1.0d - Math.pow(100.0d, d6 / max3)), max4), true);
        } else {
            float f5 = this.mFooterMaxDragRate;
            double d7 = f5 < 10.0f ? this.mFooterHeight * f5 : f5;
            double max5 = Math.max(this.mScreenHeightPixels / 2, getHeight());
            double d8 = -Math.min(0.0f, f2 * this.mDragRate);
            double d9 = -d8;
            if (max5 == mto.a.GEO_NOT_SUPPORT) {
                max5 = 1.0d;
            }
            this.mKernel.a((int) (-Math.min(d7 * (1.0d - Math.pow(100.0d, d9 / max5)), d8)), true);
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup.LayoutParams) ipChange.ipc$dispatch("84bf71af", new Object[]{this, attributeSet}) : new LayoutParams(getContext(), attributeSet);
    }

    /* loaded from: classes5.dex */
    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public int f12175a;
        public com.taobao.android.dinamicx.widget.refresh.layout.constant.b b;

        static {
            kge.a(1471954652);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f12175a = 0;
            this.b = null;
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.f12175a = 0;
            this.b = null;
        }
    }

    public DXRefreshLayout setHeaderHeight(float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXRefreshLayout) ipChange.ipc$dispatch("bd5f137c", new Object[]{this, new Float(f)}) : setHeaderHeightPx(gau.a(f));
    }

    public DXRefreshLayout setHeaderHeightPx(int i) {
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            return (DXRefreshLayout) ipChange.ipc$dispatch("733c7857", new Object[]{this, new Integer(i)});
        }
        if (i != this.mHeaderHeight && this.mHeaderHeightStatus.a(com.taobao.android.dinamicx.widget.refresh.layout.constant.a.CodeExact)) {
            this.mHeaderHeight = i;
            if (this.mRefreshHeader != null && this.mAttachedToWindow && this.mHeaderHeightStatus.b) {
                com.taobao.android.dinamicx.widget.refresh.layout.constant.b a2 = this.mRefreshHeader.a();
                if (a2 != com.taobao.android.dinamicx.widget.refresh.layout.constant.b.MatchLayout && !a2.c) {
                    View f = this.mRefreshHeader.f();
                    ViewGroup.LayoutParams layoutParams = f.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : sDefaultMarginLP;
                    f.measure(View.MeasureSpec.makeMeasureSpec(f.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max((this.mHeaderHeight - marginLayoutParams.bottomMargin) - marginLayoutParams.topMargin, 0), 1073741824));
                    int i3 = marginLayoutParams.leftMargin;
                    int i4 = marginLayoutParams.topMargin + this.mHeaderInsetStart;
                    if (a2 == com.taobao.android.dinamicx.widget.refresh.layout.constant.b.Translate) {
                        i2 = this.mHeaderHeight;
                    }
                    int i5 = i4 - i2;
                    f.layout(i3, i5, f.getMeasuredWidth() + i3, f.getMeasuredHeight() + i5);
                }
                this.mHeaderHeightStatus = com.taobao.android.dinamicx.widget.refresh.layout.constant.a.CodeExact;
            } else {
                this.mHeaderHeightStatus = com.taobao.android.dinamicx.widget.refresh.layout.constant.a.CodeExactUnNotify;
            }
        }
        return this;
    }

    public DXRefreshLayout setHeaderInsetStart(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRefreshLayout) ipChange.ipc$dispatch("3cecf91e", new Object[]{this, new Float(f)});
        }
        this.mHeaderInsetStart = gau.a(f);
        return this;
    }

    public DXRefreshLayout setHeaderInsetStartPx(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRefreshLayout) ipChange.ipc$dispatch("46e77d79", new Object[]{this, new Integer(i)});
        }
        this.mHeaderInsetStart = i;
        return this;
    }

    public DXRefreshLayout setDragRate(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRefreshLayout) ipChange.ipc$dispatch("34e08c5c", new Object[]{this, new Float(f)});
        }
        this.mDragRate = f;
        return this;
    }

    public DXRefreshLayout setHeaderMaxDragRate(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRefreshLayout) ipChange.ipc$dispatch("675ea709", new Object[]{this, new Float(f)});
        }
        this.mHeaderMaxDragRate = f;
        if (this.mRefreshHeader == null || !this.mAttachedToWindow) {
            this.mHeaderHeightStatus = this.mHeaderHeightStatus.a();
        }
        return this;
    }

    public DXRefreshLayout setHeaderTriggerRate(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRefreshLayout) ipChange.ipc$dispatch("56c5a609", new Object[]{this, new Float(f)});
        }
        this.mHeaderTriggerRate = f;
        return this;
    }

    public DXRefreshLayout setReboundInterpolator(Interpolator interpolator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRefreshLayout) ipChange.ipc$dispatch("bcd5c5a7", new Object[]{this, interpolator});
        }
        this.mReboundInterpolator = interpolator;
        return this;
    }

    public DXRefreshLayout setReboundDuration(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRefreshLayout) ipChange.ipc$dispatch("3788be98", new Object[]{this, new Integer(i)});
        }
        this.mReboundDuration = i;
        return this;
    }

    public DXRefreshLayout setEnableLoadMore(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRefreshLayout) ipChange.ipc$dispatch("70db80e6", new Object[]{this, new Boolean(z)});
        }
        this.mManualLoadMore = true;
        this.mEnableLoadMore = z;
        return this;
    }

    public DXRefreshLayout setEnableRefresh(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRefreshLayout) ipChange.ipc$dispatch("37d3fa90", new Object[]{this, new Boolean(z)});
        }
        this.mEnableRefresh = z;
        if (z) {
            setEnablePullLoadMore(false);
        }
        return this;
    }

    public DXRefreshLayout setEnableHeaderTranslationContent(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRefreshLayout) ipChange.ipc$dispatch("91c5f50c", new Object[]{this, new Boolean(z)});
        }
        this.mEnableHeaderTranslationContent = z;
        this.mManualHeaderTranslationContent = true;
        return this;
    }

    public DXRefreshLayout setEnableFooterTranslationContent(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRefreshLayout) ipChange.ipc$dispatch("e0837dbe", new Object[]{this, new Boolean(z)});
        }
        this.mEnableFooterTranslationContent = z;
        this.mManualFooterTranslationContent = true;
        return this;
    }

    public DXRefreshLayout setEnableAutoLoadMore(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRefreshLayout) ipChange.ipc$dispatch("8efd89b7", new Object[]{this, new Boolean(z)});
        }
        this.mEnableAutoLoadMore = z;
        return this;
    }

    public DXRefreshLayout setEnableOverScrollBounce(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRefreshLayout) ipChange.ipc$dispatch("ef6f4d8", new Object[]{this, new Boolean(z)});
        }
        this.mEnableOverScrollBounce = z;
        return this;
    }

    public DXRefreshLayout setEnablePureScrollMode(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRefreshLayout) ipChange.ipc$dispatch("50157639", new Object[]{this, new Boolean(z)});
        }
        this.mEnablePureScrollMode = z;
        return this;
    }

    public DXRefreshLayout setEnableScrollContentWhenLoaded(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRefreshLayout) ipChange.ipc$dispatch("261a6380", new Object[]{this, new Boolean(z)});
        }
        this.mEnableScrollContentWhenLoaded = z;
        return this;
    }

    public DXRefreshLayout setEnableScrollContentWhenRefreshed(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRefreshLayout) ipChange.ipc$dispatch("f5398a4d", new Object[]{this, new Boolean(z)});
        }
        this.mEnableScrollContentWhenRefreshed = z;
        return this;
    }

    public DXRefreshLayout setEnableLoadMoreWhenContentNotFull(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRefreshLayout) ipChange.ipc$dispatch("b4d77843", new Object[]{this, new Boolean(z)});
        }
        this.mEnableLoadMoreWhenContentNotFull = z;
        gam gamVar = this.mRefreshContent;
        if (gamVar != null) {
            gamVar.a(z);
        }
        return this;
    }

    public DXRefreshLayout setEnableOverScrollDrag(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRefreshLayout) ipChange.ipc$dispatch("eb85db2c", new Object[]{this, new Boolean(z)});
        }
        this.mEnableOverScrollDrag = z;
        return this;
    }

    public DXRefreshLayout setEnableFooterFollowWhenNoMoreData(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRefreshLayout) ipChange.ipc$dispatch("6106f67b", new Object[]{this, new Boolean(z)});
        }
        this.mEnableFooterFollowWhenNoMoreData = z;
        return this;
    }

    public DXRefreshLayout setEnableClipHeaderWhenFixedBehind(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRefreshLayout) ipChange.ipc$dispatch("852edc34", new Object[]{this, new Boolean(z)});
        }
        this.mEnableClipHeaderWhenFixedBehind = z;
        return this;
    }

    public DXRefreshLayout setEnableClipFooterWhenFixedBehind(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRefreshLayout) ipChange.ipc$dispatch("e43360c2", new Object[]{this, new Boolean(z)});
        }
        this.mEnableClipFooterWhenFixedBehind = z;
        return this;
    }

    public DXRefreshLayout setDisableContentWhenRefresh(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRefreshLayout) ipChange.ipc$dispatch("ee6d3758", new Object[]{this, new Boolean(z)});
        }
        this.mDisableContentWhenRefresh = z;
        return this;
    }

    public DXRefreshLayout setDisableContentWhenLoading(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRefreshLayout) ipChange.ipc$dispatch("46b9b1d7", new Object[]{this, new Boolean(z)});
        }
        this.mDisableContentWhenLoading = z;
        return this;
    }

    public DXRefreshLayout setRefreshHeader(gan ganVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXRefreshLayout) ipChange.ipc$dispatch("fcefd362", new Object[]{this, ganVar}) : setRefreshHeader(ganVar, 0, 0);
    }

    public DXRefreshLayout setRefreshHeader(gan ganVar, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRefreshLayout) ipChange.ipc$dispatch("8bb4e582", new Object[]{this, ganVar, new Integer(i), new Integer(i2)});
        }
        gal galVar = this.mRefreshHeader;
        if (galVar != null) {
            super.removeView(galVar.f());
        }
        this.mRefreshHeader = ganVar;
        this.mHeaderBackgroundColor = 0;
        this.mHeaderNeedTouchEventWhenRefreshing = false;
        this.mHeaderHeightStatus = com.taobao.android.dinamicx.widget.refresh.layout.constant.a.DefaultUnNotify;
        if (i == 0) {
            i = -1;
        }
        if (i2 == 0) {
            i2 = -2;
        }
        LayoutParams layoutParams = new LayoutParams(i, i2);
        ViewGroup.LayoutParams layoutParams2 = ganVar.f().getLayoutParams();
        if (layoutParams2 instanceof LayoutParams) {
            layoutParams = (LayoutParams) layoutParams2;
        }
        if (this.mRefreshHeader.a().b) {
            super.addView(this.mRefreshHeader.f(), getChildCount(), layoutParams);
        } else {
            super.addView(this.mRefreshHeader.f(), 0, layoutParams);
        }
        return this;
    }

    public DXRefreshLayout setRefreshContent(View view) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXRefreshLayout) ipChange.ipc$dispatch("eaddea04", new Object[]{this, view}) : setRefreshContent(view, 0, 0);
    }

    public DXRefreshLayout setRefreshContent(View view, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRefreshLayout) ipChange.ipc$dispatch("b677dba4", new Object[]{this, view, new Integer(i), new Integer(i2)});
        }
        gam gamVar = this.mRefreshContent;
        if (gamVar != null) {
            super.removeView(gamVar.a());
        }
        if (i == 0) {
            i = -1;
        }
        if (i2 == 0) {
            i2 = -1;
        }
        LayoutParams layoutParams = new LayoutParams(i, i2);
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        if (layoutParams2 instanceof LayoutParams) {
            layoutParams = (LayoutParams) layoutParams2;
        }
        super.addView(view, getChildCount(), layoutParams);
        this.mRefreshContent = new gav(view);
        if (this.mAttachedToWindow) {
            this.mRefreshContent.a(this.mScrollBoundaryDecider);
            this.mRefreshContent.a(this.mEnableLoadMoreWhenContentNotFull);
            this.mRefreshContent.a(this.mKernel, (View) null, (View) null);
        }
        gal galVar = this.mRefreshHeader;
        if (galVar != null && galVar.a().b) {
            super.bringChildToFront(this.mRefreshHeader.f());
        }
        return this;
    }

    public gan getRefreshHeader() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gan) ipChange.ipc$dispatch("25f82af9", new Object[]{this});
        }
        gal galVar = this.mRefreshHeader;
        if (!(galVar instanceof gan)) {
            return null;
        }
        return (gan) galVar;
    }

    public DXRefreshState getState() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXRefreshState) ipChange.ipc$dispatch("b7157d97", new Object[]{this}) : this.mState;
    }

    public DXRefreshLayout setOnRefreshListener(gaq gaqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRefreshLayout) ipChange.ipc$dispatch("ab5407c7", new Object[]{this, gaqVar});
        }
        this.mRefreshListener = gaqVar;
        return this;
    }

    public DXRefreshLayout setScrollBoundaryDecider(gao gaoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRefreshLayout) ipChange.ipc$dispatch("e120e16c", new Object[]{this, gaoVar});
        }
        this.mScrollBoundaryDecider = gaoVar;
        gam gamVar = this.mRefreshContent;
        if (gamVar != null) {
            gamVar.a(gaoVar);
        }
        return this;
    }

    public DXRefreshLayout setNoMoreData(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRefreshLayout) ipChange.ipc$dispatch("cb20a424", new Object[]{this, new Boolean(z)});
        }
        if (this.mState == DXRefreshState.Refreshing && z) {
            finishRefreshWithNoMoreData();
        } else if (this.mFooterNoMoreData != z) {
            this.mFooterNoMoreData = z;
        }
        return this;
    }

    public boolean isEnablePullLoadMore() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5db1d4b8", new Object[]{this})).booleanValue() : this.mEnablePullLoadMore;
    }

    public DXRefreshLayout setEnablePullLoadMore(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRefreshLayout) ipChange.ipc$dispatch("c19a6a61", new Object[]{this, new Boolean(z)});
        }
        this.mEnablePullLoadMore = z;
        if (z) {
            setEnableRefresh(false);
        }
        return this;
    }

    public DXRefreshLayout setEnableAutoPullLoadMore(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRefreshLayout) ipChange.ipc$dispatch("7af9a2b2", new Object[]{this, new Boolean(z)});
        }
        this.mEnableAutoPullLoadMore = z;
        return this;
    }

    public DXRefreshLayout resetNoMoreData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXRefreshLayout) ipChange.ipc$dispatch("e3d21daf", new Object[]{this}) : setNoMoreData(false);
    }

    public DXRefreshLayout finishRefresh() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXRefreshLayout) ipChange.ipc$dispatch("55fb188", new Object[]{this}) : finishRefresh(true);
    }

    public DXRefreshLayout finishPullDownLoadMore() {
        gam gamVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRefreshLayout) ipChange.ipc$dispatch("9bf0a6b5", new Object[]{this});
        }
        gal galVar = this.mRefreshHeader;
        if ((galVar != null ? galVar.a(this, true) : 0) < Integer.MAX_VALUE) {
            if (this.mIsBeingDragged || this.mNestedInProgress) {
                long currentTimeMillis = System.currentTimeMillis();
                if (this.mIsBeingDragged) {
                    float f = this.mLastTouchY;
                    this.mTouchY = f;
                    this.mTouchSpinner = 0;
                    this.mIsBeingDragged = false;
                    access$001(this, MotionEvent.obtain(currentTimeMillis, currentTimeMillis, 0, this.mLastTouchX, (f + this.mSpinner) - (this.mTouchSlop << 1), 0));
                    access$101(this, MotionEvent.obtain(currentTimeMillis, currentTimeMillis, 2, this.mLastTouchX, this.mLastTouchY + this.mSpinner, 0));
                }
                if (this.mNestedInProgress) {
                    this.mTotalUnconsumed = 0;
                    access$201(this, MotionEvent.obtain(currentTimeMillis, currentTimeMillis, 1, this.mLastTouchX, this.mLastTouchY, 0));
                    this.mNestedInProgress = false;
                    this.mTouchSpinner = 0;
                }
            }
            if (this.mEnableScrollContentWhenRefreshed && (gamVar = this.mRefreshContent) != null) {
                gamVar.b(this.mSpinner);
            }
            this.mKernel.a(0, true);
            this.mKernel.a(DXRefreshState.None);
        }
        return this;
    }

    public DXRefreshLayout failPullDownLoadMore() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRefreshLayout) ipChange.ipc$dispatch("85e9cf00", new Object[]{this});
        }
        this.mKernel.a(DXRefreshState.PullDownLoadFail);
        return this;
    }

    public DXRefreshLayout noDataPullDownLoadMore() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRefreshLayout) ipChange.ipc$dispatch("210bd92d", new Object[]{this});
        }
        this.mKernel.a(DXRefreshState.PullDownLoadNoData);
        this.mKernel.a(0, true);
        return this;
    }

    public DXRefreshLayout autoPullDownLoadMore() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRefreshLayout) ipChange.ipc$dispatch("28501ad1", new Object[]{this});
        }
        this.mKernel.a(DXRefreshState.PullDownLoading);
        return this;
    }

    public boolean isPullDownLoading() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d5c2ef36", new Object[]{this})).booleanValue() : this.mState == DXRefreshState.PullDownLoading;
    }

    public boolean isPullDownNoData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e047fec7", new Object[]{this})).booleanValue() : this.mState == DXRefreshState.PullDownLoadNoData;
    }

    public DXRefreshLayout finishRefresh(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXRefreshLayout) ipChange.ipc$dispatch("66f1e28d", new Object[]{this, new Integer(i)}) : finishRefresh(i, true, Boolean.FALSE);
    }

    public DXRefreshLayout finishRefresh(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRefreshLayout) ipChange.ipc$dispatch("6d5c6a1e", new Object[]{this, new Boolean(z)});
        }
        if (z) {
            return finishRefresh(Math.min(Math.max(0, 300 - ((int) (System.currentTimeMillis() - this.mLastOpenTime))), 300) << 16, true, Boolean.FALSE);
        }
        return finishRefresh(0, false, null);
    }

    public DXRefreshLayout finishRefresh(int i, final boolean z, final Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRefreshLayout) ipChange.ipc$dispatch("afc5d246", new Object[]{this, new Integer(i), new Boolean(z), bool});
        }
        final int i2 = i >> 16;
        short s = (short) i;
        Runnable runnable = new Runnable() { // from class: com.taobao.android.dinamicx.widget.refresh.layout.DXRefreshLayout.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public int f12170a = 0;

            @Override // java.lang.Runnable
            public void run() {
                DXRefreshLayout dXRefreshLayout;
                DXRefreshState dXRefreshState;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                ValueAnimator.AnimatorUpdateListener animatorUpdateListener = null;
                if (this.f12170a == 0) {
                    if (DXRefreshLayout.this.mState == DXRefreshState.None && DXRefreshLayout.this.mViceState == DXRefreshState.Refreshing) {
                        DXRefreshLayout.this.mViceState = DXRefreshState.None;
                    } else if (DXRefreshLayout.this.reboundAnimator != null && DXRefreshLayout.this.mState.isHeader && (DXRefreshLayout.this.mState.isDragging || DXRefreshLayout.this.mState == DXRefreshState.RefreshReleased)) {
                        DXRefreshLayout.this.reboundAnimator.setDuration(0L);
                        DXRefreshLayout.this.reboundAnimator.cancel();
                        DXRefreshLayout dXRefreshLayout2 = DXRefreshLayout.this;
                        dXRefreshLayout2.reboundAnimator = null;
                        if (dXRefreshLayout2.mKernel.a(0) == null) {
                            dXRefreshLayout = DXRefreshLayout.this;
                            dXRefreshState = DXRefreshState.None;
                        } else {
                            dXRefreshLayout = DXRefreshLayout.this;
                            dXRefreshState = DXRefreshState.PullDownCanceled;
                        }
                        dXRefreshLayout.notifyStateChanged(dXRefreshState);
                    } else if (DXRefreshLayout.this.mState == DXRefreshState.Refreshing && DXRefreshLayout.this.mRefreshHeader != null && DXRefreshLayout.this.mRefreshContent != null) {
                        this.f12170a++;
                        DXRefreshLayout.this.mHandler.postDelayed(this, i2);
                        DXRefreshLayout.this.notifyStateChanged(DXRefreshState.RefreshFinish);
                        if (bool == Boolean.FALSE) {
                            DXRefreshLayout.this.setNoMoreData(false);
                        }
                    }
                    if (bool != Boolean.TRUE) {
                        return;
                    }
                    DXRefreshLayout.this.setNoMoreData(true);
                    return;
                }
                int a2 = DXRefreshLayout.this.mRefreshHeader.a(DXRefreshLayout.this, z);
                if (a2 >= Integer.MAX_VALUE) {
                    return;
                }
                if (DXRefreshLayout.this.mIsBeingDragged || DXRefreshLayout.this.mNestedInProgress) {
                    long currentTimeMillis = System.currentTimeMillis();
                    if (DXRefreshLayout.this.mIsBeingDragged) {
                        DXRefreshLayout dXRefreshLayout3 = DXRefreshLayout.this;
                        dXRefreshLayout3.mTouchY = dXRefreshLayout3.mLastTouchY;
                        DXRefreshLayout dXRefreshLayout4 = DXRefreshLayout.this;
                        dXRefreshLayout4.mTouchSpinner = 0;
                        dXRefreshLayout4.mIsBeingDragged = false;
                        DXRefreshLayout.access$301(dXRefreshLayout4, MotionEvent.obtain(currentTimeMillis, currentTimeMillis, 0, dXRefreshLayout4.mLastTouchX, (DXRefreshLayout.this.mLastTouchY + DXRefreshLayout.this.mSpinner) - (DXRefreshLayout.this.mTouchSlop << 1), 0));
                        DXRefreshLayout dXRefreshLayout5 = DXRefreshLayout.this;
                        DXRefreshLayout.access$401(dXRefreshLayout5, MotionEvent.obtain(currentTimeMillis, currentTimeMillis, 2, dXRefreshLayout5.mLastTouchX, DXRefreshLayout.this.mLastTouchY + DXRefreshLayout.this.mSpinner, 0));
                    }
                    if (DXRefreshLayout.this.mNestedInProgress) {
                        DXRefreshLayout dXRefreshLayout6 = DXRefreshLayout.this;
                        dXRefreshLayout6.mTotalUnconsumed = 0;
                        DXRefreshLayout.access$501(dXRefreshLayout6, MotionEvent.obtain(currentTimeMillis, currentTimeMillis, 1, dXRefreshLayout6.mLastTouchX, DXRefreshLayout.this.mLastTouchY, 0));
                        DXRefreshLayout dXRefreshLayout7 = DXRefreshLayout.this;
                        dXRefreshLayout7.mNestedInProgress = false;
                        dXRefreshLayout7.mTouchSpinner = 0;
                    }
                }
                if (DXRefreshLayout.this.mSpinner <= 0) {
                    if (DXRefreshLayout.this.mSpinner < 0) {
                        DXRefreshLayout dXRefreshLayout8 = DXRefreshLayout.this;
                        dXRefreshLayout8.animSpinner(0, a2, dXRefreshLayout8.mReboundInterpolator, DXRefreshLayout.this.mReboundDuration);
                        return;
                    }
                    DXRefreshLayout.this.mKernel.a(0, false);
                    DXRefreshLayout.this.mKernel.a(DXRefreshState.None);
                    return;
                }
                DXRefreshLayout dXRefreshLayout9 = DXRefreshLayout.this;
                ValueAnimator animSpinner = dXRefreshLayout9.animSpinner(0, a2, dXRefreshLayout9.mReboundInterpolator, DXRefreshLayout.this.mReboundDuration);
                if (DXRefreshLayout.this.mEnableScrollContentWhenRefreshed) {
                    animatorUpdateListener = DXRefreshLayout.this.mRefreshContent.a(DXRefreshLayout.this.mSpinner);
                }
                if (animSpinner == null || animatorUpdateListener == null) {
                    return;
                }
                animSpinner.addUpdateListener(animatorUpdateListener);
            }
        };
        if (s > 0) {
            this.mHandler.postDelayed(runnable, s);
        } else {
            runnable.run();
        }
        return this;
    }

    public DXRefreshLayout finishRefreshWithNoMoreData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXRefreshLayout) ipChange.ipc$dispatch("f46a4e0e", new Object[]{this}) : finishRefresh(Math.min(Math.max(0, 300 - ((int) (System.currentTimeMillis() - this.mLastOpenTime))), 300) << 16, true, Boolean.TRUE);
    }

    public DXRefreshLayout closeHeaderOrFooter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRefreshLayout) ipChange.ipc$dispatch("d82d41a3", new Object[]{this});
        }
        if (this.mState == DXRefreshState.None && (this.mViceState == DXRefreshState.Refreshing || this.mViceState == DXRefreshState.Loading)) {
            this.mViceState = DXRefreshState.None;
        }
        if (this.mState == DXRefreshState.PullDownLoadNoData) {
            this.mKernel.a(0, true);
            return this;
        }
        if (this.mState == DXRefreshState.Refreshing) {
            finishRefresh();
        } else if (this.mKernel.a(0) == null) {
            notifyStateChanged(DXRefreshState.None);
        } else if (this.mState.isHeader) {
            notifyStateChanged(DXRefreshState.PullDownCanceled);
        } else {
            notifyStateChanged(DXRefreshState.PullUpCanceled);
        }
        return this;
    }

    public boolean autoRefresh() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c08ce8b7", new Object[]{this})).booleanValue();
        }
        return autoRefresh(this.mAttachedToWindow ? 0 : 400, this.mReboundDuration, (this.mHeaderMaxDragRate + this.mHeaderTriggerRate) / 2.0f, false);
    }

    public boolean autoRefresh(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5110a0b4", new Object[]{this, new Integer(i)})).booleanValue() : autoRefresh(i, this.mReboundDuration, (this.mHeaderMaxDragRate + this.mHeaderTriggerRate) / 2.0f, false);
    }

    public boolean autoRefreshAnimationOnly() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3abad0f", new Object[]{this})).booleanValue();
        }
        if (!this.mAttachedToWindow) {
            i = 400;
        }
        return autoRefresh(i, this.mReboundDuration, (this.mHeaderMaxDragRate + this.mHeaderTriggerRate) / 2.0f, true);
    }

    public boolean autoRefresh(int i, final int i2, final float f, final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9fb862ab", new Object[]{this, new Integer(i), new Integer(i2), new Float(f), new Boolean(z)})).booleanValue();
        }
        if (this.mState != DXRefreshState.None || !isEnableRefreshOrLoadMore(this.mEnableRefresh)) {
            return false;
        }
        Runnable runnable = new Runnable() { // from class: com.taobao.android.dinamicx.widget.refresh.layout.DXRefreshLayout.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (DXRefreshLayout.this.mViceState != DXRefreshState.Refreshing) {
                } else {
                    if (DXRefreshLayout.this.reboundAnimator != null) {
                        DXRefreshLayout.this.reboundAnimator.setDuration(0L);
                        DXRefreshLayout.this.reboundAnimator.cancel();
                        DXRefreshLayout.this.reboundAnimator = null;
                    }
                    DXRefreshLayout dXRefreshLayout = DXRefreshLayout.this;
                    dXRefreshLayout.mLastTouchX = dXRefreshLayout.getMeasuredWidth() / 2.0f;
                    DXRefreshLayout.this.mKernel.a(DXRefreshState.PullDownToRefresh);
                    float f2 = DXRefreshLayout.this.mHeaderHeight == 0 ? DXRefreshLayout.this.mHeaderTriggerRate : DXRefreshLayout.this.mHeaderHeight;
                    float f3 = f;
                    if (f3 < 10.0f) {
                        f3 *= f2;
                    }
                    DXRefreshLayout dXRefreshLayout2 = DXRefreshLayout.this;
                    dXRefreshLayout2.reboundAnimator = ValueAnimator.ofInt(dXRefreshLayout2.mSpinner, (int) f3);
                    DXRefreshLayout.this.reboundAnimator.setDuration(i2);
                    DXRefreshLayout.this.reboundAnimator.setInterpolator(new gau(gau.f28251a));
                    DXRefreshLayout.this.reboundAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.taobao.android.dinamicx.widget.refresh.layout.DXRefreshLayout.5.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public void onAnimationUpdate(ValueAnimator valueAnimator) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                            } else if (DXRefreshLayout.this.reboundAnimator == null || DXRefreshLayout.this.mRefreshHeader == null) {
                            } else {
                                DXRefreshLayout.this.mKernel.a(((Integer) valueAnimator.getAnimatedValue()).intValue(), true);
                            }
                        }
                    });
                    DXRefreshLayout.this.reboundAnimator.addListener(new AnimatorListenerAdapter() { // from class: com.taobao.android.dinamicx.widget.refresh.layout.DXRefreshLayout.5.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public void onAnimationEnd(Animator animator) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("8024e25a", new Object[]{this, animator});
                            } else if (animator != null && animator.getDuration() == 0) {
                            } else {
                                DXRefreshLayout.this.reboundAnimator = null;
                                if (DXRefreshLayout.this.mRefreshHeader == null) {
                                    DXRefreshLayout.this.mKernel.a(DXRefreshState.None);
                                    return;
                                }
                                if (DXRefreshLayout.this.mState != DXRefreshState.ReleaseToRefresh) {
                                    DXRefreshLayout.this.mKernel.a(DXRefreshState.ReleaseToRefresh);
                                }
                                DXRefreshLayout.this.setStateRefreshing(!z);
                            }
                        }
                    });
                    DXRefreshLayout.this.reboundAnimator.start();
                }
            }
        };
        setViceState(DXRefreshState.Refreshing);
        if (i > 0) {
            this.mHandler.postDelayed(runnable, i);
        } else {
            runnable.run();
        }
        return true;
    }

    public boolean isRefreshing() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56d673fc", new Object[]{this})).booleanValue() : this.mState == DXRefreshState.Refreshing;
    }

    private boolean canPullDown() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("39ec2182", new Object[]{this})).booleanValue() : this.mEnableOverScrollDrag || this.mEnableRefresh || isEnablePullLoadMore();
    }

    /* loaded from: classes5.dex */
    public class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1220200172);
        }

        public c() {
        }

        public c a(DXRefreshState dXRefreshState) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("1cafdeb7", new Object[]{this, dXRefreshState});
            }
            if (dXRefreshState.isPullDownLoadState()) {
                DXRefreshLayout.this.notifyStateChanged(dXRefreshState);
                return null;
            }
            switch (dXRefreshState) {
                case None:
                    if (DXRefreshLayout.this.mState != DXRefreshState.None && DXRefreshLayout.this.mSpinner == 0) {
                        DXRefreshLayout.this.notifyStateChanged(DXRefreshState.None);
                        break;
                    } else if (DXRefreshLayout.this.mSpinner != 0) {
                        a(0);
                        break;
                    }
                    break;
                case PullDownToRefresh:
                    if (!DXRefreshLayout.this.mState.isOpening) {
                        DXRefreshLayout dXRefreshLayout = DXRefreshLayout.this;
                        if (dXRefreshLayout.isEnableRefreshOrLoadMore(dXRefreshLayout.mEnableRefresh)) {
                            DXRefreshLayout.this.notifyStateChanged(DXRefreshState.PullDownToRefresh);
                            break;
                        }
                    }
                    DXRefreshLayout.this.setViceState(DXRefreshState.PullDownToRefresh);
                    break;
                case ReleaseToRefresh:
                    if (!DXRefreshLayout.this.mState.isOpening) {
                        DXRefreshLayout dXRefreshLayout2 = DXRefreshLayout.this;
                        if (dXRefreshLayout2.isEnableRefreshOrLoadMore(dXRefreshLayout2.mEnableRefresh)) {
                            DXRefreshLayout.this.notifyStateChanged(DXRefreshState.ReleaseToRefresh);
                            break;
                        }
                    }
                    DXRefreshLayout.this.setViceState(DXRefreshState.ReleaseToRefresh);
                    break;
                case ReleaseToTwoLevel:
                    if (!DXRefreshLayout.this.mState.isOpening) {
                        DXRefreshLayout dXRefreshLayout3 = DXRefreshLayout.this;
                        if (dXRefreshLayout3.isEnableRefreshOrLoadMore(dXRefreshLayout3.mEnableRefresh)) {
                            DXRefreshLayout.this.notifyStateChanged(DXRefreshState.ReleaseToTwoLevel);
                            break;
                        }
                    }
                    DXRefreshLayout.this.setViceState(DXRefreshState.ReleaseToTwoLevel);
                    break;
                case RefreshReleased:
                    if (!DXRefreshLayout.this.mState.isOpening) {
                        DXRefreshLayout dXRefreshLayout4 = DXRefreshLayout.this;
                        if (dXRefreshLayout4.isEnableRefreshOrLoadMore(dXRefreshLayout4.mEnableRefresh)) {
                            DXRefreshLayout.this.notifyStateChanged(DXRefreshState.RefreshReleased);
                            break;
                        }
                    }
                    DXRefreshLayout.this.setViceState(DXRefreshState.RefreshReleased);
                    break;
                case Refreshing:
                    DXRefreshLayout.this.setStateRefreshing(true);
                    break;
                default:
                    DXRefreshLayout.this.notifyStateChanged(dXRefreshState);
                    break;
            }
            return null;
        }

        public c a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("9de85202", new Object[]{this});
            }
            if (DXRefreshLayout.this.mState == DXRefreshState.TwoLevel) {
                DXRefreshLayout.this.mKernel.a(DXRefreshState.TwoLevelFinish);
                if (DXRefreshLayout.this.mSpinner == 0) {
                    a(0, false);
                    DXRefreshLayout.this.notifyStateChanged(DXRefreshState.None);
                } else {
                    a(0).setDuration(DXRefreshLayout.this.mFloorDuration);
                }
            }
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:76:0x0147  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public com.taobao.android.dinamicx.widget.refresh.layout.DXRefreshLayout.c a(int r13, boolean r14) {
            /*
                Method dump skipped, instructions count: 657
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.dinamicx.widget.refresh.layout.DXRefreshLayout.c.a(int, boolean):com.taobao.android.dinamicx.widget.refresh.layout.DXRefreshLayout$c");
        }

        public ValueAnimator a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ValueAnimator) ipChange.ipc$dispatch("bfd0d0ff", new Object[]{this, new Integer(i)});
            }
            DXRefreshLayout dXRefreshLayout = DXRefreshLayout.this;
            return dXRefreshLayout.animSpinner(i, 0, dXRefreshLayout.mReboundInterpolator, DXRefreshLayout.this.mReboundDuration);
        }
    }
}
