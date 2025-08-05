package com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.flexible.view;

import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.view.PagerAdapter;
import android.support.v4.widget.ScrollerCompat;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.flexible.view.FlexibleContainerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import tb.kge;
import tb.mfj;

/* loaded from: classes6.dex */
public abstract class AbsFlexibleMarqueeGallery extends HorizontalScrollView {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int FLING_DELAY = 16;
    public static Comparator<Integer> INTEGER_COMPARATOR = null;
    private static final float SCALE_ANIM_a = 1.0f;
    private static final float SCALE_ANIM_axis = 0.5f;
    private static final float SCALE_ANIM_b = -1.0f;
    private static final String TAG;
    public long animationDuration;
    public int backwardsLoopSpacing;
    public int childrenCount;
    public float density;
    public boolean enableScale;
    public int forwardsLoopSpacing;
    public boolean init;
    public View lastAnimateView;
    public int lastMotionEventAction;
    public int lastSelectedItem;
    public int lastVirtualEnd;
    public int lastVirtualStart;
    public boolean loopScrollEnable;
    public int mActiveFeature;
    public int mActualVisibleCardCount;
    public PagerAdapter mAdapter;
    public com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.flexible.view.c mAutoRunner;
    public int mAutoScrollAnimationOnStart;
    public float mCardCornerRadius;
    public int mCardHeight;
    public int mCardSpacing;
    public int mCurrentItem;
    public int mCurrentItemBeforeTouchDown;
    public int mCurrentVirtualItemBeforeTouchDown;
    public HashSet<Integer> mCurrentVisibleViewIndexes;
    public HashSet<Integer> mCurrentVisibleVirtualIndexes;
    public ScrollerCompat mCustomScroller;
    public float mDynamicBlockFactor;
    public int mExpandedCardWidth;
    public int mExpectedAdapterCount;
    public float mFlingFactor;
    public int mFoldedCardVisibleCount;
    public int mFoldedCardWidth;
    public int mGalleryDisplayWidth;
    public float mHorizontalScrollFactor;
    public b mInterceptCondition;
    public boolean mIsFling;
    public boolean mIsOnScrollStarted;
    public boolean mIsRunnerScrollStarted;
    public boolean mIsTouching;
    public List<c> mItems;
    public int mLastContentOffset;
    public boolean mManualScrollEnable;
    public a mObserver;
    public d mOnCardAnimatePerformListener;
    public e mOnGalleryScrollListener;
    public com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.flexible.view.d mOnScrollListener;
    public ViewGroup mScrollContent;
    public int mScrollOffsetOnTouchDown;
    public Runnable mScrollerTask;
    public Handler mSetVisibleIndexedHandler;
    public int mTouchDownPointer;
    public float mTriggerOffset;
    public Set<Integer> mVisibleIndexes;
    public final boolean magnetPosition;
    public int mainContentWidth;
    private boolean needIntercept;
    public boolean notifyOnSwitch;
    public Runnable setVisibleIndexTask;

    /* loaded from: classes6.dex */
    public interface b {
        boolean a(View view);
    }

    /* loaded from: classes6.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public View f14155a;
        public Object b;
        public int c;

        static {
            kge.a(788346871);
        }
    }

    /* loaded from: classes6.dex */
    public interface d {
        void onAnimatePerform(View view, int i, float f, boolean z, int i2, int i3);

        void onAnimateUpdate(float f);
    }

    /* loaded from: classes6.dex */
    public interface e {
        void a(int i, int i2, boolean z);
    }

    public static /* synthetic */ Object ipc$super(AbsFlexibleMarqueeGallery absFlexibleMarqueeGallery, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1447998406:
                return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
            case -407533570:
                return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
            case -381850951:
                return new Boolean(super.overScrollBy(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue(), ((Number) objArr[5]).intValue(), ((Number) objArr[6]).intValue(), ((Number) objArr[7]).intValue(), ((Boolean) objArr[8]).booleanValue()));
            case -355898496:
                super.fling(((Number) objArr[0]).intValue());
                return null;
            case -244855388:
                super.onLayout(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
                return null;
            case 1004220751:
                super.onScrollChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
                return null;
            case 1626033557:
                super.onAttachedToWindow();
                return null;
            case 2075560917:
                return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public void autoScrollToNext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a8c7011", new Object[]{this});
        }
    }

    public abstract boolean checkViewHasInVisibleRect(View view);

    public abstract boolean checkViewHasInVisibleRect(View view, boolean z);

    public abstract Runnable createScrollerTask();

    public void dataSetChanged() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6da031c3", new Object[]{this});
        }
    }

    public boolean getLoopScrollEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f1429675", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public abstract int getScrollLimit();

    public abstract void reloadViews(int i, ViewGroup viewGroup);

    public abstract void setCurrentSelected(int i, boolean z);

    public void setLoopScrollEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7239cf7", new Object[]{this, new Boolean(z)});
        }
    }

    public abstract void smoothScrollToRect(int i);

    public abstract void smoothScrollToRectWithAnim(int i, boolean z);

    public abstract void updateCurrentSelected(int i, boolean z);

    public abstract int viewIndexForVirtualIndex(int i);

    public abstract int virtualIndexForViewIndex(int i);

    static {
        kge.a(14857838);
        TAG = AbsFlexibleMarqueeGallery.class.getSimpleName();
        INTEGER_COMPARATOR = new Comparator<Integer>() { // from class: com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.flexible.view.AbsFlexibleMarqueeGallery.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.util.Comparator
            public /* synthetic */ int compare(Integer num, Integer num2) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6a9be197", new Object[]{this, num, num2})).intValue() : a(num, num2);
            }

            public int a(Integer num, Integer num2) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d87044fb", new Object[]{this, num, num2})).intValue() : num.intValue() - num2.intValue();
            }
        };
    }

    /* loaded from: classes6.dex */
    public class a extends DataSetObserver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(893174258);
        }

        public a() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ba16f5dc", new Object[]{this});
            } else {
                AbsFlexibleMarqueeGallery.this.dataSetChanged();
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("61d25eb1", new Object[]{this});
            } else {
                AbsFlexibleMarqueeGallery.this.dataSetChanged();
            }
        }
    }

    public AbsFlexibleMarqueeGallery(Context context) {
        this(context, null);
    }

    public AbsFlexibleMarqueeGallery(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.magnetPosition = true;
        this.enableScale = true;
        this.mFoldedCardVisibleCount = 2;
        this.mFoldedCardWidth = 250;
        this.mExpandedCardWidth = 0;
        this.mCardSpacing = 10;
        this.mFlingFactor = 0.3f;
        this.mTriggerOffset = 0.25f;
        this.mScrollOffsetOnTouchDown = -1;
        this.mAutoScrollAnimationOnStart = -1;
        this.mManualScrollEnable = true;
        this.mIsTouching = false;
        this.mIsFling = false;
        this.mVisibleIndexes = new HashSet();
        this.mHorizontalScrollFactor = 1.0f;
        this.mDynamicBlockFactor = 0.5f;
        this.mActiveFeature = 0;
        this.mTouchDownPointer = 0;
        this.mCurrentItemBeforeTouchDown = 0;
        this.mCurrentVirtualItemBeforeTouchDown = 0;
        this.lastMotionEventAction = 3;
        this.mIsOnScrollStarted = false;
        this.mIsRunnerScrollStarted = false;
        this.loopScrollEnable = true;
        this.init = false;
        this.childrenCount = 0;
        this.animationDuration = 300L;
        this.mSetVisibleIndexedHandler = new Handler(Looper.getMainLooper());
        this.needIntercept = false;
        this.mAdapter = null;
        this.mObserver = null;
        this.mExpectedAdapterCount = 0;
        this.mActualVisibleCardCount = 1;
        this.backwardsLoopSpacing = 0;
        this.forwardsLoopSpacing = 0;
        this.mainContentWidth = 0;
        this.mItems = new ArrayList();
        this.mGalleryDisplayWidth = 0;
        this.density = 1.0f;
        this.mCardCornerRadius = 0.0f;
        this.mAutoRunner = null;
        this.lastSelectedItem = 0;
        this.lastAnimateView = null;
        this.lastVirtualStart = 0;
        this.lastVirtualEnd = 0;
        this.mCurrentVisibleVirtualIndexes = new HashSet<>();
        this.mCurrentVisibleViewIndexes = new HashSet<>();
        this.setVisibleIndexTask = null;
        this.notifyOnSwitch = false;
        setImportantForAccessibility(2);
        this.mCustomScroller = createScroller(context);
        this.mScrollerTask = createScrollerTask();
        setHorizontalScrollBarEnabled(false);
        setOverScrollMode(2);
    }

    public ScrollerCompat createScroller(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ScrollerCompat) ipChange.ipc$dispatch("a4eb1fe4", new Object[]{this, context}) : ScrollerCompat.create(context, new DecelerateInterpolator());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        b bVar = this.mInterceptCondition;
        if (bVar != null && bVar.a(this)) {
            z = true;
        }
        this.needIntercept = z;
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        if (this.init) {
            return;
        }
        setCurrentSelected(this.mCurrentItem, true);
        this.init = true;
    }

    public void originalFling(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fac8031", new Object[]{this, new Integer(i)});
        } else {
            super.fling(i);
        }
    }

    @Override // android.view.View
    public boolean overScrollBy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e93d6ab9", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8), new Boolean(z)})).booleanValue() : super.overScrollBy(Math.round(i * Math.min(this.mHorizontalScrollFactor, this.mDynamicBlockFactor)), i2, i3, i4, i5, i6, i7, i8, z);
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent;
        com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.flexible.view.c cVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        if (!this.mManualScrollEnable) {
            this.lastMotionEventAction = motionEvent.getActionMasked();
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        this.mCustomScroller.abortAnimation();
        if (actionMasked == 2) {
            int scrollX = getScrollX() - this.mScrollOffsetOnTouchDown;
            if (Math.abs(scrollX) < (getScrollLimit() * 2.0f) / 3.0f) {
                this.mDynamicBlockFactor = this.mHorizontalScrollFactor;
            } else {
                float abs = Math.abs(1.0f - ((scrollX - getScrollLimit()) / (getScrollLimit() / 2.0f)));
                this.mDynamicBlockFactor = Math.max(0.0f, Math.min(abs * abs * abs, this.mHorizontalScrollFactor));
            }
            onTouchEvent = super.onTouchEvent(motionEvent);
            if (this.lastMotionEventAction != 2 && this.mOnGalleryScrollListener != null) {
                getScrollX();
                this.mIsOnScrollStarted = true;
            }
        } else {
            this.mDynamicBlockFactor = this.mHorizontalScrollFactor;
            onTouchEvent = super.onTouchEvent(motionEvent);
        }
        this.lastMotionEventAction = actionMasked;
        if (onTouchEvent && actionMasked == 0) {
            this.mTouchDownPointer = getScrollX();
            this.mCurrentItemBeforeTouchDown = computeCurrentItemByScroll(this.mTouchDownPointer);
            this.mCurrentVirtualItemBeforeTouchDown = virtualIndexForViewIndex(this.mCurrentItemBeforeTouchDown);
            com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.flexible.view.c cVar2 = this.mAutoRunner;
            if (cVar2 != null && cVar2.d()) {
                this.mAutoRunner.b();
            }
        }
        if (onTouchEvent && actionMasked == 1) {
            String str = TAG;
            mfj.c(str, "MarqueeGallery >> check fling and scroll. fling=" + this.mIsFling);
            removeCallbacks(this.mScrollerTask);
            postDelayed(this.mScrollerTask, 16L);
            com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.flexible.view.c cVar3 = this.mAutoRunner;
            if (cVar3 != null && !cVar3.d()) {
                this.mAutoRunner.a(false);
            }
        }
        if (actionMasked == 3 && (cVar = this.mAutoRunner) != null && !cVar.d()) {
            this.mAutoRunner.a(false);
        }
        return onTouchEvent;
    }

    public int getFlingCount(int i, int i2) {
        IpChange ipChange = $ipChange;
        int i3 = 1;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3c283963", new Object[]{this, new Integer(i), new Integer(i2)})).intValue();
        }
        if (i == 0) {
            return 0;
        }
        if (i <= 0) {
            i3 = -1;
        }
        return (int) (i3 * Math.ceil((((i * i3) * this.mFlingFactor) / i2) - this.mTriggerOffset));
    }

    public void adjustPositionX(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf4569dc", new Object[]{this, new Integer(i)});
        } else if (this.childrenCount <= 0) {
        } else {
            int round = Math.round(getScrollX() / getInternalWidth());
            int round2 = Math.round(this.mScrollOffsetOnTouchDown / getInternalWidth());
            int max = Math.max(-1, Math.min(1, getFlingCount(i, getInternalWidth())));
            if (max != 0) {
                round = round2 + max;
            }
            scrollToPage(safeTargetPosition(Math.max(round, 0), this.childrenCount));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.mCustomScroller.abortAnimation();
            this.mScrollOffsetOnTouchDown = getScrollX();
            if (this.mManualScrollEnable) {
                this.mIsTouching = true;
            }
        }
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        if (action == 1 || action == 3) {
            this.mIsTouching = false;
            this.mIsFling = false;
        }
        return dispatchTouchEvent;
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        if (!this.mManualScrollEnable) {
            return false;
        }
        if (this.needIntercept && getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void originOnScrollChanged(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd8caf49", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else {
            super.onScrollChanged(i, i2, i3, i4);
        }
    }

    public Rect rectForIndex(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Rect) ipChange.ipc$dispatch("9f9e77f8", new Object[]{this, new Integer(i)}) : rectForIndex(i, this.mCurrentItem);
    }

    public Rect rectForIndex(int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Rect) ipChange.ipc$dispatch("1ec0ff3d", new Object[]{this, new Integer(i), new Integer(i2)}) : rectForIndex(i, i2, false);
    }

    public Rect rectForIndex(int i, int i2, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Rect) ipChange.ipc$dispatch("4b247da9", new Object[]{this, new Integer(i), new Integer(i2), new Boolean(z)}) : rectForIndex(i, i2, z, null);
    }

    public Rect rectForIndex(int i, int i2, boolean z, Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("c5a782c2", new Object[]{this, new Integer(i), new Integer(i2), new Boolean(z), rect});
        }
        if (rect == null) {
            rect = new Rect();
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        int i3 = this.mCardHeight;
        if (i3 <= 0) {
            i3 = layoutParams instanceof FlexibleContainerView.LayoutParams ? ((FlexibleContainerView.LayoutParams) layoutParams).height() : layoutParams.height;
        }
        if (this.mExpectedAdapterCount > 2) {
            if (!z) {
                i2 = virtualIndexForViewIndex(i2);
            }
            if (i == i2) {
                rect.set(0, 0, this.mExpandedCardWidth, i3);
                int i4 = this.mExpandedCardWidth;
                int i5 = this.mFoldedCardWidth;
                rect.offset((i4 - i5) + (i * (i5 + this.mCardSpacing)), 0);
            } else if (i < i2) {
                rect.set(0, 0, this.mExpandedCardWidth, i3);
                int i6 = this.mExpandedCardWidth;
                int i7 = this.mFoldedCardWidth;
                int i8 = this.mCardSpacing;
                rect.offset((((i6 - i7) + (i * (i7 + i8))) - (i6 - i7)) - i8, 0);
            } else {
                rect.set(0, 0, this.mFoldedCardWidth, i3);
                int i9 = this.mExpandedCardWidth;
                int i10 = this.mFoldedCardWidth;
                int i11 = this.mCardSpacing;
                rect.offset((i9 - i10) + ((i10 + i11) * i2) + i9 + i11 + (((i - i2) - 1) * (i10 + i11)), 0);
            }
        } else {
            rect.set(0, 0, this.mExpandedCardWidth, i3);
            rect.offset((this.mExpandedCardWidth + this.mCardSpacing) * i, 0);
        }
        return rect;
    }

    public void setVisibleIndexes(Set<Integer> set) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10c08c28", new Object[]{this, set});
            return;
        }
        HashSet<Integer> hashSet = new HashSet(set);
        if (this.loopScrollEnable) {
            int intValue = ((Integer) Collections.min(set, INTEGER_COMPARATOR)).intValue();
            for (Integer num : hashSet) {
                int intValue2 = num.intValue();
                Rect rectForIndex = rectForIndex(intValue2, intValue, true);
                View childAt = this.mScrollContent.getChildAt(viewIndexForVirtualIndex(intValue2));
                if (childAt == null) {
                    String str = TAG;
                    mfj.c(str, "setVisibleIndexes fail. mParent.count:" + this.mScrollContent.getChildCount() + ", viewIndex:" + viewIndexForVirtualIndex(intValue2));
                    return;
                }
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof FlexibleContainerView.LayoutParams) {
                    FlexibleContainerView.LayoutParams layoutParams2 = (FlexibleContainerView.LayoutParams) layoutParams;
                    layoutParams2.fillLayoutResult(rectForIndex);
                    childAt.layout(layoutParams2.left, layoutParams2.top, layoutParams2.right, layoutParams2.bottom);
                } else if (layoutParams instanceof FrameLayout.LayoutParams) {
                    FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) layoutParams;
                    layoutParams3.leftMargin = rectForIndex.left;
                    layoutParams3.width = rectForIndex.width();
                    childAt.setLayoutParams(layoutParams3);
                } else {
                    childAt.layout(rectForIndex.left, rectForIndex.top, rectForIndex.right, rectForIndex.bottom);
                }
            }
        }
        this.mVisibleIndexes.clear();
        this.mVisibleIndexes.addAll(set);
    }

    public int safeTargetPosition(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a3878ca1", new Object[]{this, new Integer(i), new Integer(i2)})).intValue();
        }
        if (this.loopScrollEnable) {
            return i;
        }
        if (i < 0) {
            return 0;
        }
        return i >= i2 ? i2 - 1 : i;
    }

    public void scrollToPage(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8fdf8e5", new Object[]{this, new Integer(i)});
        } else {
            smoothScrollToRect(rectForIndex(i).left);
        }
    }

    public void autoScrollToPrevious() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55f81a95", new Object[]{this});
        } else if (this.mIsTouching) {
        } else {
            int i = this.mCurrentItem - 1;
            if (this.loopScrollEnable) {
                i++;
            } else if (i < 0) {
                i = this.childrenCount - 1;
            }
            smoothScrollToRectWithAnim(rectForIndex(i).left, true);
        }
    }

    public int getCurrentSelected() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4bbc3278", new Object[]{this})).intValue() : this.mCurrentItem;
    }

    public void setAutoRunner(com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.flexible.view.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2c52853", new Object[]{this, cVar});
        } else {
            this.mAutoRunner = cVar;
        }
    }

    public com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.flexible.view.c getAutoRunner() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.flexible.view.c) ipChange.ipc$dispatch("90a3e0e5", new Object[]{this}) : this.mAutoRunner;
    }

    public void setScrollAnimDuration(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a04d1d69", new Object[]{this, new Long(j)});
            return;
        }
        this.animationDuration = j;
        if (this.animationDuration > 0) {
            return;
        }
        this.animationDuration = 300L;
    }

    public void setScrollEnabled(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39f267fb", new Object[]{this, new Boolean(z)});
        } else {
            this.mManualScrollEnable = z;
        }
    }

    public void setOnCardAnimatePerformListener(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14aaa74d", new Object[]{this, dVar});
        } else {
            this.mOnCardAnimatePerformListener = dVar;
        }
    }

    public void setGalleryDisplayWidth(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7381d908", new Object[]{this, new Integer(i)});
        } else {
            this.mGalleryDisplayWidth = i;
        }
    }

    public int getGalleryDisplayWidth() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a3375fda", new Object[]{this})).intValue() : this.mGalleryDisplayWidth;
    }

    public void setOnGalleryScrollListener(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88c8f759", new Object[]{this, eVar});
        } else {
            this.mOnGalleryScrollListener = eVar;
        }
    }

    public void setOnScrollListener(com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.flexible.view.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79e21593", new Object[]{this, dVar});
        } else {
            this.mOnScrollListener = dVar;
        }
    }

    public void setInterceptCondition(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d69405", new Object[]{this, bVar});
        } else {
            this.mInterceptCondition = bVar;
        }
    }

    public ViewGroup getContentView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("5180f326", new Object[]{this}) : this.mScrollContent;
    }

    public int getInternalWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9c19844d", new Object[]{this})).intValue();
        }
        if (this.mExpectedAdapterCount > 2) {
            return this.mFoldedCardWidth;
        }
        return getWidth();
    }

    public void setFoldedCardVisibleCount(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c93f5a4d", new Object[]{this, new Integer(i)});
        } else {
            this.mFoldedCardVisibleCount = i;
        }
    }

    public void setFoldedCardWidth(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50286c88", new Object[]{this, new Integer(i)});
        } else {
            this.mFoldedCardWidth = i;
        }
    }

    public void setCardSpacing(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4ec80ab", new Object[]{this, new Integer(i)});
        } else {
            this.mCardSpacing = i;
        }
    }

    public void setCardHeight(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cae59ca3", new Object[]{this, new Integer(i)});
        } else {
            this.mCardHeight = i;
        }
    }

    public void setCardCornerRadius(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bd4c803", new Object[]{this, new Integer(i)});
        } else {
            this.mCardCornerRadius = i;
        }
    }

    public void setEnableScaleAnime(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f35eb8de", new Object[]{this, new Boolean(z)});
        } else {
            this.enableScale = z;
        }
    }

    public int computeCurrentItemByScroll() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4ec4a093", new Object[]{this})).intValue() : computeCurrentItemByScroll(getScrollX());
    }

    public int computeCurrentItemByScroll(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("89cfe656", new Object[]{this, new Integer(i)})).intValue();
        }
        int i2 = this.mExpandedCardWidth;
        int i3 = this.mFoldedCardWidth;
        int i4 = (int) ((i - (i2 - i3)) / (i3 + this.mCardSpacing));
        int i5 = this.mActualVisibleCardCount;
        return (i4 > i5 + 1 ? i4 - (i5 + 1) : i4 + ((this.mExpectedAdapterCount - i5) - 1)) % this.mExpectedAdapterCount;
    }

    public <T> T getItemInfo(int i, Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("62bbc63a", new Object[]{this, new Integer(i), cls});
        }
        if (i >= 0 && i < this.mItems.size()) {
            c cVar = this.mItems.get(i);
            if (cls.isInstance(cVar)) {
                return cls.cast(cVar);
            }
        }
        return null;
    }

    public void setAdapter(PagerAdapter pagerAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef1144fe", new Object[]{this, pagerAdapter});
            return;
        }
        PagerAdapter pagerAdapter2 = this.mAdapter;
        if (pagerAdapter2 != null) {
            pagerAdapter2.startUpdate((ViewGroup) this);
            for (int i = 0; i < this.mItems.size(); i++) {
                c cVar = this.mItems.get(i);
                this.mAdapter.destroyItem((ViewGroup) this, cVar.c, cVar.b);
            }
            this.mAdapter.finishUpdate((ViewGroup) this);
            this.mItems.clear();
            this.mCurrentItem = 0;
            scrollTo(0, 0);
        }
        PagerAdapter pagerAdapter3 = this.mAdapter;
        List<c> list = this.mItems;
        ArrayList arrayList = (list == null || list.isEmpty()) ? null : new ArrayList(this.mItems);
        this.mAdapter = pagerAdapter;
        this.mExpectedAdapterCount = 0;
        if (this.mAdapter != null) {
            if (this.mObserver == null) {
                this.mObserver = new a();
            }
            this.mExpectedAdapterCount = this.mAdapter.getCount();
            reloadViews(this.mExpectedAdapterCount, null);
        } else {
            this.mOnGalleryScrollListener = null;
            this.mOnCardAnimatePerformListener = null;
            removeAllViews();
        }
        if (pagerAdapter3 == null || arrayList == null) {
            return;
        }
        int count = pagerAdapter3.getCount();
        for (int i2 = 0; i2 < count; i2++) {
            pagerAdapter3.destroyItem((ViewGroup) this, i2, ((c) arrayList.get(i2)).b);
        }
        arrayList.clear();
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2625ad52", new Object[]{this, view, view2});
        } else {
            mfj.c(TAG, "MarqueeGallery >> requestChildFocus");
        }
    }
}
