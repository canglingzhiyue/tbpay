package com.taobao.android.detail.ttdetail.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.view.AbsSavedState;
import android.support.v4.view.AccessibilityDelegateCompat;
import android.support.v4.view.OnApplyWindowInsetsListener;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.WindowInsetsCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.utils.y;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import tb.kge;
import tb.riy;

/* loaded from: classes5.dex */
public class TTViewPager extends ViewGroup {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int CLOSE_ENOUGH = 2;
    private static final Comparator<a> COMPARATOR;
    private static final boolean DEBUG = false;
    private static final int DEFAULT_GUTTER_SIZE = 16;
    private static final int DEFAULT_OFFSCREEN_PAGES = 0;
    private static final int INVALID_POINTER = -1;
    public static final int[] LAYOUT_ATTRS;
    private static final int MAX_SETTLE_DURATION = 600;
    private static final int MIN_DISTANCE_FOR_FLING = 25;
    private static final int MIN_FLING_VELOCITY = 400;
    public static final int MODE_SCROLL_FLING = 1;
    public static final int MODE_SCROLL_PAGE = 0;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    private static final String TAG = "TTViewPager";
    private static final Interpolator sInterpolator;
    private int mActivePointerId;
    public PagerAdapter mAdapter;
    private boolean mCalledSuper;
    private int mChildHeightMeasureSpec;
    private int mChildWidthMeasureSpec;
    private int mCloseEnough;
    public int mCurItem;
    private int mDefaultGutterSize;
    private boolean mEnableCycleScroll;
    private final Runnable mEndScrollRunnable;
    private Scroller mEstimateScroller;
    private int mExpectedAdapterCount;
    private boolean mFirstLayout;
    public float mFirstOffset;
    private int mFlingDistance;
    private int mGutterSize;
    private boolean mInLayout;
    private float mInitialMotionX;
    private float mInitialMotionY;
    public boolean mIsBeingDragged;
    private boolean mIsScrollStarted;
    private boolean mIsUnableToDrag;
    public final ArrayList<a> mItems;
    private float mLastMotionX;
    private float mLastMotionY;
    public float mLastOffset;
    private EdgeEffect mLeftEdge;
    private int mMaximumVelocity;
    private int mMinimumVelocity;
    private int mModeScroll;
    private f mObserver;
    private int mOffscreenPageLimit;
    private List<d> mOnItemVisibleChangeListeners;
    private List<e> mOnPageChangeListeners;
    private int mPageMargin;
    private Parcelable mRestoredAdapterState;
    private ClassLoader mRestoredClassLoader;
    private int mRestoredCurItem;
    private EdgeEffect mRightEdge;
    public int mScrollState;
    public Scroller mScroller;
    public final a mTempItem;
    private final Rect mTempRect;
    private int mTouchSlop;
    public VelocityTracker mVelocityTracker;

    /* loaded from: classes5.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public Object f10989a;
        public int b;
        public float d;
        public float e;

        static {
            kge.a(-1282642465);
        }
    }

    /* loaded from: classes5.dex */
    public interface d {
        void a(int i);

        void b(int i);
    }

    /* loaded from: classes5.dex */
    public interface e {
        void a(int i);

        void a(int i, int i2, float f, int i3);

        void onPageSelected(int i);
    }

    public static /* synthetic */ Object ipc$super(TTViewPager tTViewPager, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1665133574:
                super.draw((Canvas) objArr[0]);
                return null;
            case -1145345097:
                return new Boolean(super.dispatchPopulateAccessibilityEvent((AccessibilityEvent) objArr[0]));
            case 27005610:
                return super.onSaveInstanceState();
            case 80153535:
                super.onRestoreInstanceState((Parcelable) objArr[0]);
                return null;
            case 949399698:
                super.onDetachedFromWindow();
                return null;
            case 1246973220:
                return new Boolean(super.dispatchKeyEvent((KeyEvent) objArr[0]));
            case 1389530587:
                super.onSizeChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
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
            case 2043983618:
                return new Boolean(super.checkLayoutParams((ViewGroup.LayoutParams) objArr[0]));
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    static {
        kge.a(1619770246);
        LAYOUT_ATTRS = new int[]{16842931};
        COMPARATOR = new Comparator<a>() { // from class: com.taobao.android.detail.ttdetail.widget.TTViewPager.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.util.Comparator
            public /* synthetic */ int compare(a aVar, a aVar2) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6a9be197", new Object[]{this, aVar, aVar2})).intValue() : a(aVar, aVar2);
            }

            public int a(a aVar, a aVar2) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4afd581b", new Object[]{this, aVar, aVar2})).intValue() : aVar.b - aVar2.b;
            }
        };
        sInterpolator = new DecelerateInterpolator();
    }

    public TTViewPager(Context context) {
        super(context);
        this.mItems = new ArrayList<>();
        this.mTempItem = new a();
        this.mTempRect = new Rect();
        this.mRestoredCurItem = -1;
        this.mRestoredAdapterState = null;
        this.mRestoredClassLoader = null;
        this.mFirstOffset = -3.4028235E38f;
        this.mLastOffset = Float.MAX_VALUE;
        this.mOffscreenPageLimit = 0;
        this.mActivePointerId = -1;
        this.mFirstLayout = true;
        this.mModeScroll = 0;
        this.mEndScrollRunnable = new Runnable() { // from class: com.taobao.android.detail.ttdetail.widget.TTViewPager.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                TTViewPager.this.setScrollState(0);
                TTViewPager.this.populate();
            }
        };
        this.mScrollState = 0;
        initViewPager();
    }

    public TTViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mItems = new ArrayList<>();
        this.mTempItem = new a();
        this.mTempRect = new Rect();
        this.mRestoredCurItem = -1;
        this.mRestoredAdapterState = null;
        this.mRestoredClassLoader = null;
        this.mFirstOffset = -3.4028235E38f;
        this.mLastOffset = Float.MAX_VALUE;
        this.mOffscreenPageLimit = 0;
        this.mActivePointerId = -1;
        this.mFirstLayout = true;
        this.mModeScroll = 0;
        this.mEndScrollRunnable = new Runnable() { // from class: com.taobao.android.detail.ttdetail.widget.TTViewPager.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                TTViewPager.this.setScrollState(0);
                TTViewPager.this.populate();
            }
        };
        this.mScrollState = 0;
        initViewPager();
    }

    public void initViewPager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77226e75", new Object[]{this});
            return;
        }
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context a2 = y.a(this);
        this.mScroller = new Scroller(a2, sInterpolator);
        this.mEstimateScroller = new Scroller(a2, sInterpolator);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(a2);
        float f2 = a2.getResources().getDisplayMetrics().density;
        this.mTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
        this.mMinimumVelocity = (int) (400.0f * f2);
        this.mMaximumVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        this.mLeftEdge = new EdgeEffect(a2);
        this.mRightEdge = new EdgeEffect(a2);
        this.mFlingDistance = (int) (25.0f * f2);
        this.mCloseEnough = (int) (2.0f * f2);
        this.mDefaultGutterSize = (int) (f2 * 16.0f);
        ViewCompat.setAccessibilityDelegate(this, new b());
        if (ViewCompat.getImportantForAccessibility(this) == 0) {
            ViewCompat.setImportantForAccessibility(this, 1);
        }
        ViewCompat.setOnApplyWindowInsetsListener(this, new OnApplyWindowInsetsListener() { // from class: com.taobao.android.detail.ttdetail.widget.TTViewPager.3
            public static volatile transient /* synthetic */ IpChange $ipChange;
            private final Rect b = new Rect();

            @Override // android.support.v4.view.OnApplyWindowInsetsListener
            public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (WindowInsetsCompat) ipChange2.ipc$dispatch("eac8c0", new Object[]{this, view, windowInsetsCompat});
                }
                WindowInsetsCompat onApplyWindowInsets = ViewCompat.onApplyWindowInsets(view, windowInsetsCompat);
                if (onApplyWindowInsets.isConsumed()) {
                    return onApplyWindowInsets;
                }
                Rect rect = this.b;
                rect.left = onApplyWindowInsets.getSystemWindowInsetLeft();
                rect.top = onApplyWindowInsets.getSystemWindowInsetTop();
                rect.right = onApplyWindowInsets.getSystemWindowInsetRight();
                rect.bottom = onApplyWindowInsets.getSystemWindowInsetBottom();
                int childCount = TTViewPager.this.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    WindowInsetsCompat dispatchApplyWindowInsets = ViewCompat.dispatchApplyWindowInsets(TTViewPager.this.getChildAt(i), onApplyWindowInsets);
                    rect.left = Math.min(dispatchApplyWindowInsets.getSystemWindowInsetLeft(), rect.left);
                    rect.top = Math.min(dispatchApplyWindowInsets.getSystemWindowInsetTop(), rect.top);
                    rect.right = Math.min(dispatchApplyWindowInsets.getSystemWindowInsetRight(), rect.right);
                    rect.bottom = Math.min(dispatchApplyWindowInsets.getSystemWindowInsetBottom(), rect.bottom);
                }
                return onApplyWindowInsets.replaceSystemWindowInsets(rect.left, rect.top, rect.right, rect.bottom);
            }
        });
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        removeCallbacks(this.mEndScrollRunnable);
        Scroller scroller = this.mScroller;
        if (scroller != null && !scroller.isFinished()) {
            this.mScroller.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    public void setScrollState(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5a2509a", new Object[]{this, new Integer(i)});
        } else if (this.mScrollState == i) {
        } else {
            this.mScrollState = i;
            dispatchOnScrollStateChanged(i);
        }
    }

    public int getScrollState() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("199fa08", new Object[]{this})).intValue() : this.mScrollState;
    }

    public int[] getInstantiatedItemsPosition() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("338ee324", new Object[]{this});
        }
        int size = this.mItems.size();
        if (size <= 0) {
            return null;
        }
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = this.mItems.get(i).b;
        }
        return iArr;
    }

    public void setScrollCycle(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ef22936", new Object[]{this, new Boolean(z)});
        } else {
            this.mEnableCycleScroll = z;
        }
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        for (int i = 0; i < this.mItems.size(); i++) {
            dispatchOnItemVisibleChanged(this.mItems.get(i).b, false);
        }
    }

    public void setAdapter(PagerAdapter pagerAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef1144fe", new Object[]{this, pagerAdapter});
            return;
        }
        PagerAdapter pagerAdapter2 = this.mAdapter;
        if (pagerAdapter2 != null) {
            f fVar = this.mObserver;
            if (fVar != null) {
                pagerAdapter2.unregisterDataSetObserver(fVar);
            }
            this.mAdapter.startUpdate((ViewGroup) this);
            for (int i = 0; i < this.mItems.size(); i++) {
                a aVar = this.mItems.get(i);
                this.mAdapter.destroyItem((ViewGroup) this, aVar.b, aVar.f10989a);
                dispatchOnItemVisibleChanged(aVar.b, false);
            }
            this.mAdapter.finishUpdate((ViewGroup) this);
            this.mItems.clear();
            removeNonDecorViews();
            this.mCurItem = 0;
            scrollTo(0, 0);
        }
        if (this.mEnableCycleScroll && pagerAdapter != null) {
            this.mAdapter = new h(pagerAdapter);
        } else {
            this.mAdapter = pagerAdapter;
        }
        this.mExpectedAdapterCount = 0;
        if (this.mAdapter == null) {
            return;
        }
        this.mObserver = new f();
        this.mAdapter.registerDataSetObserver(this.mObserver);
        boolean z = this.mFirstLayout;
        this.mFirstLayout = true;
        this.mExpectedAdapterCount = this.mAdapter.getCount();
        if (this.mRestoredCurItem < 0) {
            if (!z) {
                populate();
                return;
            } else {
                requestLayout();
                return;
            }
        }
        this.mAdapter.restoreState(this.mRestoredAdapterState, this.mRestoredClassLoader);
        setCurrentItemInternal(this.mRestoredCurItem, false, true);
        this.mRestoredCurItem = -1;
        this.mRestoredAdapterState = null;
        this.mRestoredClassLoader = null;
    }

    private void removeNonDecorViews() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c659ec19", new Object[]{this});
            return;
        }
        while (getChildCount() > 0) {
            removeViewAt(0);
        }
    }

    public PagerAdapter getAdapter() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PagerAdapter) ipChange.ipc$dispatch("b3ecd9a0", new Object[]{this}) : this.mAdapter;
    }

    private int getClientWidth() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ea7a717f", new Object[]{this})).intValue() : (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    public void setCurrentItem(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d416f32", new Object[]{this, new Integer(i)});
        } else {
            setCurrentItemInternal(i, !this.mFirstLayout, false);
        }
    }

    public void setCurrentItem(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9aed29e2", new Object[]{this, new Integer(i), new Boolean(z)});
            return;
        }
        if (this.mEnableCycleScroll) {
            i++;
        }
        setCurrentItemInternal(i, z, false);
    }

    public int getCurrentItem() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b0d0a870", new Object[]{this})).intValue() : fixPosition(this.mCurItem);
    }

    private int fixPosition(int i) {
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("769e5b1", new Object[]{this, new Integer(i)})).intValue();
        }
        PagerAdapter pagerAdapter = this.mAdapter;
        if (pagerAdapter != null) {
            i2 = pagerAdapter.getCount();
        }
        if (!this.mEnableCycleScroll || i2 <= 2) {
            return i;
        }
        if (i == 0) {
            i = i2 - 2;
        } else if (i == i2 - 1) {
            i = 1;
        }
        return i - 1;
    }

    public void setCurrentItemInternal(int i, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93ea61b5", new Object[]{this, new Integer(i), new Boolean(z), new Boolean(z2)});
        } else {
            setCurrentItemInternal(i, z, z2, 0);
        }
    }

    public void setCurrentItemInternal(int i, boolean z, boolean z2, int i2) {
        IpChange ipChange = $ipChange;
        boolean z3 = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e96247ee", new Object[]{this, new Integer(i), new Boolean(z), new Boolean(z2), new Integer(i2)});
            return;
        }
        PagerAdapter pagerAdapter = this.mAdapter;
        if (pagerAdapter == null || pagerAdapter.getCount() <= 0) {
            return;
        }
        if (!z2 && this.mCurItem == i && this.mItems.size() != 0) {
            return;
        }
        if (i < 0) {
            i = 0;
        } else if (i >= this.mAdapter.getCount()) {
            i = this.mAdapter.getCount() - 1;
        }
        if (this.mCurItem != i) {
            z3 = true;
        }
        if (this.mFirstLayout) {
            this.mCurItem = i;
            if (z3) {
                dispatchOnPageSelected(i);
            }
            requestLayout();
            return;
        }
        if (!z) {
            populateWithDx(i, true, 0.0f);
        }
        scrollToItem(i, z, i2, z3);
    }

    private int fixedItem2Center(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("829d67ca", new Object[]{this, aVar})).intValue();
        }
        int clientWidth = getClientWidth();
        if (clientWidth > 0) {
            return (int) (clientWidth * Math.max(this.mFirstOffset, Math.min((aVar.e + (aVar.d / 2.0f)) - 0.5f, this.mLastOffset)));
        }
        return 0;
    }

    private int getTargetOffset(int i, a aVar) {
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1b61c5af", new Object[]{this, new Integer(i), aVar})).intValue();
        }
        int clientWidth = getClientWidth();
        if (clientWidth <= 0) {
            return 0;
        }
        if (aVar != null) {
            return fixedItem2Center(aVar);
        }
        PagerAdapter pagerAdapter = this.mAdapter;
        if (pagerAdapter != null && pagerAdapter.getCount() > 0 && !this.mItems.isEmpty()) {
            int count = this.mAdapter.getCount();
            if (i >= 0 && i < count) {
                float f2 = this.mPageMargin / clientWidth;
                int size = this.mItems.size();
                a aVar2 = this.mItems.get(0);
                float f3 = aVar2.e;
                int i3 = aVar2.b;
                if (i < i3) {
                    while (i < i3) {
                        i3--;
                        f3 -= this.mAdapter.getPageWidth(i3) + f2;
                    }
                    a aVar3 = this.mTempItem;
                    aVar3.e = f3;
                    aVar3.d = this.mAdapter.getPageWidth(i);
                    aVar2 = this.mTempItem;
                    aVar2.b = i;
                } else if (i3 < i) {
                    int i4 = i3;
                    while (i3 < i) {
                        while (i3 < i4 && i3 < i) {
                            f3 += this.mAdapter.getPageWidth(i3) + f2;
                            i3++;
                        }
                        f3 += aVar2.d + f2;
                        i2++;
                        aVar2 = null;
                        if (i2 < size) {
                            a aVar4 = this.mItems.get(i2);
                            int i5 = aVar4.b;
                            if (i5 > i) {
                                i4 = i3;
                            } else {
                                aVar2 = aVar4;
                                i4 = i5;
                            }
                        }
                        if (aVar2 == null) {
                            aVar2 = this.mTempItem;
                            aVar2.e = f3;
                            i4++;
                            aVar2.d = this.mAdapter.getPageWidth(i4);
                            aVar2.b = i4;
                        }
                        i3++;
                    }
                }
                return fixedItem2Center(aVar2);
            }
        }
        return 0;
    }

    public void scrollToItem(int i, boolean z, int i2, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e636384", new Object[]{this, new Integer(i), new Boolean(z), new Integer(i2), new Boolean(z2)});
            return;
        }
        int targetOffset = getTargetOffset(i, infoForPosition(i));
        if (z) {
            smoothScrollTo(targetOffset, 0, i2);
            return;
        }
        if (z2) {
            dispatchOnPageSelected(i);
        }
        completeScroll(false);
        scrollTo(targetOffset, 0);
        pageScrolled(targetOffset);
    }

    public void addOnPageChangeListener(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94b13760", new Object[]{this, eVar});
            return;
        }
        if (this.mOnPageChangeListeners == null) {
            this.mOnPageChangeListeners = new ArrayList();
        }
        this.mOnPageChangeListeners.add(eVar);
    }

    public void removeOnPageChangeListener(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a7eb1dd", new Object[]{this, eVar});
            return;
        }
        List<e> list = this.mOnPageChangeListeners;
        if (list == null) {
            return;
        }
        list.remove(eVar);
    }

    public void clearOnPageChangeListeners() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b191a7bb", new Object[]{this});
            return;
        }
        List<e> list = this.mOnPageChangeListeners;
        if (list == null) {
            return;
        }
        list.clear();
    }

    public void addOnItemVisibleChangeListener(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdf026b1", new Object[]{this, dVar});
            return;
        }
        if (this.mOnItemVisibleChangeListeners == null) {
            this.mOnItemVisibleChangeListeners = new ArrayList();
        }
        this.mOnItemVisibleChangeListeners.add(dVar);
    }

    public void removeOnItemVisibleChangeListener(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fd85594", new Object[]{this, dVar});
            return;
        }
        List<d> list = this.mOnItemVisibleChangeListeners;
        if (list == null) {
            return;
        }
        list.remove(dVar);
    }

    public void clearOnItemVisibleChangeListeners() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31f42d43", new Object[]{this});
            return;
        }
        List<d> list = this.mOnItemVisibleChangeListeners;
        if (list == null) {
            return;
        }
        list.clear();
    }

    public int getOffscreenPageLimit() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7bd2c501", new Object[]{this})).intValue() : this.mOffscreenPageLimit;
    }

    public void setOffscreenPageLimit(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14b63529", new Object[]{this, new Integer(i)});
            return;
        }
        if (i < 0) {
            i = 0;
        }
        if (i == this.mOffscreenPageLimit) {
            return;
        }
        this.mOffscreenPageLimit = i;
        populate();
    }

    public int getModeScroll() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("bf28afc0", new Object[]{this})).intValue() : this.mModeScroll;
    }

    public void setModeScroll(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cc4564a", new Object[]{this, new Integer(i)});
        } else if (this.mModeScroll == i) {
        } else {
            this.mModeScroll = 0;
            if (i == 0 || i == 1) {
                this.mModeScroll = i;
            }
            setCurrentItemInternal(this.mCurItem, false, false);
        }
    }

    public void setPageMargin(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b7d279d", new Object[]{this, new Integer(i)});
            return;
        }
        int i2 = this.mPageMargin;
        this.mPageMargin = i;
        int width = getWidth();
        recomputeScrollPosition(width, width, i, i2);
        requestLayout();
    }

    public int getPageMargin() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e236e80d", new Object[]{this})).intValue() : this.mPageMargin;
    }

    public float distanceInfluenceForSnapDuration(float f2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("96b34422", new Object[]{this, new Float(f2)})).floatValue() : (float) Math.sin((f2 - 0.5f) * 0.47123894f);
    }

    public void smoothScrollTo(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1a1cc9d", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            smoothScrollTo(i, i2, 0);
        }
    }

    public void smoothScrollTo(int i, int i2, int i3) {
        int scrollX;
        int abs;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42983a06", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
        } else if (getChildCount() == 0) {
        } else {
            Scroller scroller = this.mScroller;
            if (scroller == null || scroller.isFinished()) {
                z = false;
            }
            if (z) {
                scrollX = this.mIsScrollStarted ? this.mScroller.getCurrX() : this.mScroller.getStartX();
                this.mScroller.abortAnimation();
            } else {
                scrollX = getScrollX();
            }
            int i4 = scrollX;
            int scrollY = getScrollY();
            int i5 = i - i4;
            int i6 = i2 - scrollY;
            if (i5 == 0 && i6 == 0) {
                completeScroll(false);
                populate();
                setScrollState(0);
                return;
            }
            setScrollState(2);
            int clientWidth = getClientWidth();
            int i7 = clientWidth / 2;
            float f2 = clientWidth;
            float f3 = i7;
            float distanceInfluenceForSnapDuration = f3 + (distanceInfluenceForSnapDuration(Math.min(1.0f, (Math.abs(i5) * 1.0f) / f2)) * f3);
            int abs2 = Math.abs(i3);
            if (abs2 > 0) {
                abs = Math.round(Math.abs(distanceInfluenceForSnapDuration / abs2) * 1000.0f) * 4;
            } else {
                abs = (int) (((Math.abs(i5) / ((f2 * this.mAdapter.getPageWidth(this.mCurItem)) + this.mPageMargin)) + 1.0f) * 100.0f);
            }
            int min = Math.min(abs, 600);
            this.mIsScrollStarted = false;
            this.mScroller.startScroll(i4, scrollY, i5, i6, min);
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    public a addNewItem(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("ea2beb67", new Object[]{this, new Integer(i), new Integer(i2)});
        }
        a aVar = new a();
        aVar.b = i;
        aVar.f10989a = this.mAdapter.instantiateItem((ViewGroup) this, i);
        aVar.d = this.mAdapter.getPageWidth(i);
        dispatchOnItemVisibleChanged(aVar.b, true);
        if (i2 < 0 || i2 >= this.mItems.size()) {
            this.mItems.add(aVar);
        } else {
            this.mItems.add(i2, aVar);
        }
        return aVar;
    }

    public void dataSetChanged() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6da031c3", new Object[]{this});
            return;
        }
        int count = this.mAdapter.getCount();
        this.mExpectedAdapterCount = count;
        boolean z = this.mItems.size() < (this.mOffscreenPageLimit << 1) + 1 && this.mItems.size() < count;
        int i = this.mCurItem;
        int i2 = 0;
        boolean z2 = false;
        while (i2 < this.mItems.size()) {
            a aVar = this.mItems.get(i2);
            int itemPosition = this.mAdapter.getItemPosition(aVar.f10989a);
            if (itemPosition != -1) {
                if (itemPosition == -2) {
                    this.mItems.remove(i2);
                    i2--;
                    if (!z2) {
                        this.mAdapter.startUpdate((ViewGroup) this);
                        z2 = true;
                    }
                    this.mAdapter.destroyItem((ViewGroup) this, aVar.b, aVar.f10989a);
                    dispatchOnItemVisibleChanged(aVar.b, false);
                    if (this.mCurItem == aVar.b) {
                        i = Math.max(0, Math.min(this.mCurItem, count - 1));
                    }
                } else if (aVar.b != itemPosition) {
                    if (aVar.b == this.mCurItem) {
                        i = itemPosition;
                    }
                    aVar.b = itemPosition;
                }
                z = true;
            }
            i2++;
        }
        if (z2) {
            this.mAdapter.finishUpdate((ViewGroup) this);
        }
        Collections.sort(this.mItems, COMPARATOR);
        if (!z) {
            return;
        }
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            ((LayoutParams) getChildAt(i3).getLayoutParams()).b = 0.0f;
        }
        setCurrentItemInternal(i, false, true);
        requestLayout();
    }

    public void populate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a1c6871", new Object[]{this});
        } else {
            populate(this.mCurItem);
        }
    }

    public void populate(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97118b2", new Object[]{this, new Integer(i)});
        } else {
            populateWithDx(i, false, 0.0f);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0086, code lost:
        if (r11.b == r19.mCurItem) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void populateWithDx(int r20, boolean r21, float r22) {
        /*
            Method dump skipped, instructions count: 640
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.detail.ttdetail.widget.TTViewPager.populateWithDx(int, boolean, float):void");
    }

    private void calculatePageOffsets(a aVar, int i, a aVar2) {
        a aVar3;
        a aVar4;
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c44a167", new Object[]{this, aVar, new Integer(i), aVar2});
            return;
        }
        int count = this.mAdapter.getCount();
        int clientWidth = getClientWidth();
        float f2 = clientWidth > 0 ? this.mPageMargin / clientWidth : 0.0f;
        if (aVar2 != null) {
            int i3 = aVar2.b;
            if (i3 < aVar.b) {
                float f3 = aVar2.e + aVar2.d + f2;
                int i4 = i3 + 1;
                while (i4 <= aVar.b && i2 < this.mItems.size()) {
                    a aVar5 = this.mItems.get(i2);
                    while (true) {
                        aVar4 = aVar5;
                        if (i4 <= aVar4.b || i2 >= this.mItems.size() - 1) {
                            break;
                        }
                        i2++;
                        aVar5 = this.mItems.get(i2);
                    }
                    while (i4 < aVar4.b) {
                        f3 += this.mAdapter.getPageWidth(i4) + f2;
                        i4++;
                    }
                    aVar4.e = f3;
                    f3 += aVar4.d + f2;
                    i4++;
                }
            } else if (i3 > aVar.b) {
                int size = this.mItems.size() - 1;
                float f4 = aVar2.e;
                int i5 = i3 - 1;
                while (i5 >= aVar.b && size >= 0) {
                    a aVar6 = this.mItems.get(size);
                    while (true) {
                        aVar3 = aVar6;
                        if (i5 >= aVar3.b || size <= 0) {
                            break;
                        }
                        size--;
                        aVar6 = this.mItems.get(size);
                    }
                    while (i5 > aVar3.b) {
                        f4 -= this.mAdapter.getPageWidth(i5) + f2;
                        i5--;
                    }
                    f4 -= aVar3.d + f2;
                    aVar3.e = f4;
                    i5--;
                }
            }
        }
        int size2 = this.mItems.size();
        float f5 = aVar.e;
        int i6 = aVar.b - 1;
        this.mFirstOffset = aVar.b == 0 ? aVar.e : -3.4028235E38f;
        int i7 = count - 1;
        this.mLastOffset = aVar.b == i7 ? Math.max(this.mFirstOffset, (aVar.e + aVar.d) - 1.0f) : Float.MAX_VALUE;
        int i8 = i - 1;
        while (i8 >= 0) {
            a aVar7 = this.mItems.get(i8);
            while (i6 > aVar7.b) {
                f5 -= this.mAdapter.getPageWidth(i6) + f2;
                i6--;
            }
            f5 -= aVar7.d + f2;
            aVar7.e = f5;
            if (aVar7.b == 0) {
                this.mFirstOffset = f5;
            }
            i8--;
            i6--;
        }
        float f6 = aVar.e + aVar.d + f2;
        int i9 = aVar.b + 1;
        int i10 = i + 1;
        while (i10 < size2) {
            a aVar8 = this.mItems.get(i10);
            while (i9 < aVar8.b) {
                f6 += this.mAdapter.getPageWidth(i9) + f2;
                i9++;
            }
            if (aVar8.b == i7) {
                this.mLastOffset = Math.max(this.mFirstOffset, (aVar8.d + f6) - 1.0f);
            }
            aVar8.e = f6;
            f6 += aVar8.d + f2;
            i10++;
            i9++;
        }
        this.mLastOffset = Math.max(this.mFirstOffset, this.mLastOffset);
    }

    private int infoIndexForPosition(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dc3e7661", new Object[]{this, new Integer(i)})).intValue();
        }
        for (int i2 = 0; i2 < this.mItems.size(); i2++) {
            if (this.mItems.get(i2).b == i) {
                return i2;
            }
        }
        return 0;
    }

    public void updateItemsWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5e3c096", new Object[]{this});
        } else if (this.mAdapter != null && !this.mItems.isEmpty()) {
            int infoIndexForPosition = infoIndexForPosition(this.mCurItem);
            int count = this.mAdapter.getCount();
            int clientWidth = getClientWidth();
            float f2 = clientWidth > 0 ? this.mPageMargin / clientWidth : 0.0f;
            a aVar = this.mItems.get(infoIndexForPosition);
            int size = this.mItems.size();
            float f3 = aVar.e;
            int i = aVar.b;
            this.mFirstOffset = aVar.b == 0 ? aVar.e : -3.4028235E38f;
            int i2 = count - 1;
            this.mLastOffset = aVar.b == i2 ? Math.max(this.mFirstOffset, (aVar.e + aVar.d) - 1.0f) : Float.MAX_VALUE;
            int i3 = i;
            float f4 = f3;
            int i4 = infoIndexForPosition;
            while (i4 >= 0) {
                a aVar2 = this.mItems.get(i4);
                while (i3 > aVar2.b) {
                    f4 -= this.mAdapter.getPageWidth(i3) + f2;
                    i3--;
                }
                if (aVar2.b == 0) {
                    this.mFirstOffset = f4;
                }
                aVar2.e = f4;
                aVar2.d = this.mAdapter.getPageWidth(i3);
                f4 -= aVar2.d + f2;
                i4--;
                i3--;
            }
            float f5 = aVar.e;
            int i5 = aVar.b;
            while (infoIndexForPosition < size) {
                a aVar3 = this.mItems.get(infoIndexForPosition);
                while (i5 < aVar3.b) {
                    f5 += this.mAdapter.getPageWidth(i5) + f2;
                    i5++;
                }
                if (aVar3.b == i2) {
                    this.mLastOffset = Math.max(this.mFirstOffset, (aVar3.d + f5) - 1.0f);
                }
                aVar3.e = f5;
                aVar3.d = this.mAdapter.getPageWidth(i5);
                f5 += aVar3.d + f2;
                infoIndexForPosition++;
                i5++;
            }
            this.mLastOffset = Math.max(this.mFirstOffset, this.mLastOffset);
            int childCount = getChildCount();
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = getChildAt(i6);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                a infoForChild = infoForChild(childAt);
                if (infoForChild != null) {
                    layoutParams.b = infoForChild.d;
                }
            }
            int width = getWidth();
            int i7 = this.mPageMargin;
            recomputeScrollPosition(width, width, i7, i7);
            populate();
            requestLayout();
        }
    }

    /* loaded from: classes5.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR;
        Parcelable adapterState;
        ClassLoader loader;
        int position;

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.support.v4.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.position);
            parcel.writeParcelable(this.adapterState, i);
        }

        public String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.position + riy.BLOCK_END_STR;
        }

        static {
            kge.a(-145664440);
            CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: com.taobao.android.detail.ttdetail.widget.TTViewPager.SavedState.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.os.Parcelable.Creator
                public /* synthetic */ Object createFromParcel(Parcel parcel) {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c057b5b", new Object[]{this, parcel}) : a(parcel);
                }

                /* JADX WARN: Type inference failed for: r4v4, types: [com.taobao.android.detail.ttdetail.widget.TTViewPager$SavedState, java.lang.Object] */
                @Override // android.os.Parcelable.ClassLoaderCreator
                public /* synthetic */ SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? ipChange.ipc$dispatch("fcd477bf", new Object[]{this, parcel, classLoader}) : a(parcel, classLoader);
                }

                @Override // android.os.Parcelable.Creator
                public /* synthetic */ Object[] newArray(int i) {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? (Object[]) ipChange.ipc$dispatch("aaa7de04", new Object[]{this, new Integer(i)}) : a(i);
                }

                public SavedState a(Parcel parcel, ClassLoader classLoader) {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? (SavedState) ipChange.ipc$dispatch("b7e65818", new Object[]{this, parcel, classLoader}) : new SavedState(parcel, classLoader);
                }

                public SavedState a(Parcel parcel) {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? (SavedState) ipChange.ipc$dispatch("8dc5dbd8", new Object[]{this, parcel}) : new SavedState(parcel, null);
                }

                public SavedState[] a(int i) {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? (SavedState[]) ipChange.ipc$dispatch("87d407c7", new Object[]{this, new Integer(i)}) : new SavedState[i];
                }
            };
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.position = parcel.readInt();
            this.adapterState = parcel.readParcelable(classLoader);
            this.loader = classLoader;
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Parcelable) ipChange.ipc$dispatch("19c12aa", new Object[]{this});
        }
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.position = this.mCurItem;
        PagerAdapter pagerAdapter = this.mAdapter;
        if (pagerAdapter != null) {
            savedState.adapterState = pagerAdapter.saveState();
        }
        return savedState;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c70bbf", new Object[]{this, parcelable});
        } else if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
        } else {
            SavedState savedState = (SavedState) parcelable;
            super.onRestoreInstanceState(savedState.getSuperState());
            PagerAdapter pagerAdapter = this.mAdapter;
            if (pagerAdapter != null) {
                pagerAdapter.restoreState(savedState.adapterState, savedState.loader);
                setCurrentItemInternal(savedState.position, false, true);
                return;
            }
            this.mRestoredCurItem = savedState.position;
            this.mRestoredAdapterState = savedState.adapterState;
            this.mRestoredClassLoader = savedState.loader;
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76c4d8ff", new Object[]{this, view, new Integer(i), layoutParams});
            return;
        }
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        if (this.mInLayout) {
            layoutParams2.c = true;
            addViewInLayout(view, i, layoutParams);
            return;
        }
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bf31982", new Object[]{this, view});
        } else if (this.mInLayout) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public a infoForChild(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("94f454f8", new Object[]{this, view});
        }
        for (int i = 0; i < this.mItems.size(); i++) {
            a aVar = this.mItems.get(i);
            if (this.mAdapter.isViewFromObject(view, aVar.f10989a)) {
                return aVar;
            }
        }
        return null;
    }

    public a infoForAnyChild(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("fcaeef6e", new Object[]{this, view});
        }
        while (true) {
            ViewParent parent = view.getParent();
            if (parent != this) {
                if (parent == null || !(parent instanceof View)) {
                    return null;
                }
                view = (View) parent;
            } else {
                return infoForChild(view);
            }
        }
    }

    public a infoForPosition(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("9152d626", new Object[]{this, new Integer(i)});
        }
        for (int i2 = 0; i2 < this.mItems.size(); i2++) {
            a aVar = this.mItems.get(i2);
            if (aVar.b == i) {
                return aVar;
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        this.mFirstLayout = true;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        LayoutParams layoutParams;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        setMeasuredDimension(getDefaultSize(0, i), getDefaultSize(0, i2));
        int measuredWidth = getMeasuredWidth();
        this.mGutterSize = Math.min(measuredWidth / 10, this.mDefaultGutterSize);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        this.mChildWidthMeasureSpec = View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.mChildHeightMeasureSpec = View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824);
        this.mInLayout = true;
        populate();
        this.mInLayout = false;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8 && (layoutParams = (LayoutParams) childAt.getLayoutParams()) != null) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * layoutParams.b), 1073741824), this.mChildHeightMeasureSpec);
            }
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52d28ddb", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onSizeChanged(i, i2, i3, i4);
        if (i == i3) {
            return;
        }
        int i5 = this.mPageMargin;
        recomputeScrollPosition(i, i3, i5, i5);
    }

    private void recomputeScrollPosition(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30b766a1", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        a infoForPosition = infoForPosition(this.mCurItem);
        int fixedItem2Center = infoForPosition != null ? fixedItem2Center(infoForPosition) : 0;
        if (i2 > 0 && infoForPosition != null && !this.mScroller.isFinished()) {
            this.mScroller.setFinalX(fixedItem2Center);
        } else if (fixedItem2Center == getScrollX()) {
        } else {
            completeScroll(false);
            scrollTo(fixedItem2Center, getScrollY());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        int childCount = getChildCount();
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int i7 = (i5 - paddingLeft) - paddingRight;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                a infoForChild = infoForChild(childAt);
                if (infoForChild != null) {
                    float f2 = i7;
                    int i9 = ((int) (infoForChild.e * f2)) + paddingLeft;
                    if (layoutParams.c) {
                        layoutParams.c = false;
                        childAt.measure(View.MeasureSpec.makeMeasureSpec((int) (f2 * layoutParams.b), 1073741824), View.MeasureSpec.makeMeasureSpec((i6 - paddingTop) - paddingBottom, 1073741824));
                    }
                    childAt.layout(i9, paddingTop, childAt.getMeasuredWidth() + i9, childAt.getMeasuredHeight() + paddingTop);
                }
            }
        }
        if (this.mFirstLayout) {
            scrollToItem(this.mCurItem, false, 0, true);
        }
        this.mFirstLayout = false;
    }

    private void checkSelectedPositionChangedWhenFling(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5baabbc1", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        int i3 = this.mCurItem;
        populateWithDx(i, false, i2 - getScrollX());
        if (i == i3) {
            return;
        }
        dispatchOnPageSelected(i);
    }

    private void checkSelectedPositionChangedWhenFling(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9aaa782", new Object[]{this, new Integer(i)});
            return;
        }
        int i2 = this.mCurItem;
        int findScrollPosition = this.mItems.size() > 0 ? findScrollPosition(i + 1) : i2;
        populateWithDx(findScrollPosition, false, i - getScrollX());
        if (findScrollPosition == i2) {
            return;
        }
        dispatchOnPageSelected(findScrollPosition);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00aa  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void computeScroll() {
        /*
            r9 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.detail.ttdetail.widget.TTViewPager.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L12
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r1[r2] = r9
            java.lang.String r2 = "cab3086b"
            r0.ipc$dispatch(r2, r1)
            return
        L12:
            r9.mIsScrollStarted = r3
            android.widget.Scroller r0 = r9.mScroller
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto Lb6
            android.widget.Scroller r0 = r9.mScroller
            boolean r0 = r0.computeScrollOffset()
            if (r0 == 0) goto Lb6
            int r0 = r9.getScrollX()
            int r1 = r9.getScrollY()
            android.widget.Scroller r4 = r9.mScroller
            int r4 = r4.getCurrX()
            android.widget.Scroller r5 = r9.mScroller
            int r5 = r5.getCurrY()
            if (r0 != r4) goto L3c
            if (r1 == r5) goto Lb2
        L3c:
            int r0 = r9.mCurItem
            int r1 = r9.mModeScroll
            if (r1 != r3) goto L97
            int r1 = r9.getClientWidth()
            float r1 = (float) r1
            float r6 = r9.mFirstOffset
            float r6 = r6 * r1
            float r7 = r9.mLastOffset
            float r1 = r1 * r7
            float r7 = (float) r4
            int r8 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1))
            if (r8 >= 0) goto L62
            int r4 = (int) r6
            int r1 = r9.mCurItem
            if (r1 != r3) goto L5b
            r0 = 0
            goto L5c
        L5b:
            r3 = 0
        L5c:
            android.widget.Scroller r1 = r9.mScroller
            r1.abortAnimation()
            goto L98
        L62:
            int r6 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r6 <= 0) goto L97
            int r4 = (int) r1
            android.support.v4.view.PagerAdapter r1 = r9.mAdapter
            if (r1 == 0) goto L73
            int r1 = r1.getCount()
            if (r1 <= 0) goto L73
            r1 = 1
            goto L74
        L73:
            r1 = 0
        L74:
            int r6 = r9.mCurItem
            if (r1 == 0) goto L81
            android.support.v4.view.PagerAdapter r7 = r9.mAdapter
            int r7 = r7.getCount()
            int r7 = r7 + (-2)
            goto L82
        L81:
            r7 = 0
        L82:
            if (r6 != r7) goto L90
            if (r1 == 0) goto L8e
            android.support.v4.view.PagerAdapter r0 = r9.mAdapter
            int r0 = r0.getCount()
            int r0 = r0 - r3
            goto L91
        L8e:
            r0 = 0
            goto L91
        L90:
            r3 = 0
        L91:
            android.widget.Scroller r1 = r9.mScroller
            r1.abortAnimation()
            goto L98
        L97:
            r3 = 0
        L98:
            if (r3 == 0) goto L9e
            r9.checkSelectedPositionChangedWhenFling(r0, r4)
            goto La1
        L9e:
            r9.checkSelectedPositionChangedWhenFling(r4)
        La1:
            r9.scrollTo(r4, r5)
            boolean r0 = r9.pageScrolled(r4)
            if (r0 != 0) goto Lb2
            android.widget.Scroller r0 = r9.mScroller
            r0.abortAnimation()
            r9.scrollTo(r2, r5)
        Lb2:
            android.support.v4.view.ViewCompat.postInvalidateOnAnimation(r9)
            return
        Lb6:
            r9.completeScroll(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.detail.ttdetail.widget.TTViewPager.computeScroll():void");
    }

    public boolean pageScrolled(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7a2f7465", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (this.mItems.size() == 0) {
            if (this.mFirstLayout) {
                return false;
            }
            this.mCalledSuper = false;
            onPageScrolled(0, 0, 0.0f, 0);
            if (!this.mCalledSuper) {
                throw new IllegalStateException("onPageScrolled did not call superclass implementation");
            }
            return false;
        }
        a infoForCurrentScrollPosition = infoForCurrentScrollPosition();
        int clientWidth = getClientWidth();
        int i2 = this.mPageMargin;
        int i3 = clientWidth + i2;
        float f2 = clientWidth;
        int i4 = infoForCurrentScrollPosition.b;
        float f3 = (((i / f2) + 0.5f) - infoForCurrentScrollPosition.e) / (infoForCurrentScrollPosition.d + (i2 / f2));
        this.mCalledSuper = false;
        onPageScrolled(i4, i3, f3, (int) (i3 * f3));
        if (!this.mCalledSuper) {
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        return true;
    }

    public void onPageScrolled(int i, int i2, float f2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a38f8204", new Object[]{this, new Integer(i), new Integer(i2), new Float(f2), new Integer(i3)});
            return;
        }
        dispatchOnPageScrolled(i, i2, f2, i3);
        this.mCalledSuper = true;
    }

    public void dispatchOnItemVisibleChanged(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f89b3c26", new Object[]{this, new Integer(i), new Boolean(z)});
        } else if (this.mOnItemVisibleChangeListeners != null) {
            int fixPosition = fixPosition(i);
            int size = this.mOnItemVisibleChangeListeners.size();
            for (int i2 = 0; i2 < size; i2++) {
                d dVar = this.mOnItemVisibleChangeListeners.get(i2);
                if (dVar != null) {
                    if (z) {
                        dVar.a(fixPosition);
                    } else {
                        dVar.b(fixPosition);
                    }
                }
            }
        }
    }

    public void dispatchOnPageScrolled(int i, int i2, float f2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b697b1e", new Object[]{this, new Integer(i), new Integer(i2), new Float(f2), new Integer(i3)});
        } else if (this.mOnPageChangeListeners != null) {
            if (this.mEnableCycleScroll) {
                i = fixPosition(i);
            }
            int size = this.mOnPageChangeListeners.size();
            for (int i4 = 0; i4 < size; i4++) {
                e eVar = this.mOnPageChangeListeners.get(i4);
                if (eVar != null) {
                    eVar.a(i, i2, f2, i3);
                }
            }
        }
    }

    public void dispatchOnPageSelected(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35799c59", new Object[]{this, new Integer(i)});
        } else if (this.mOnPageChangeListeners != null) {
            if (this.mEnableCycleScroll) {
                i = fixPosition(i);
            }
            int size = this.mOnPageChangeListeners.size();
            for (int i2 = 0; i2 < size; i2++) {
                e eVar = this.mOnPageChangeListeners.get(i2);
                if (eVar != null) {
                    eVar.onPageSelected(i);
                }
            }
        }
    }

    public void dispatchOnScrollStateChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41b278d3", new Object[]{this, new Integer(i)});
        } else if (this.mOnPageChangeListeners != null) {
            PagerAdapter pagerAdapter = this.mAdapter;
            int count = pagerAdapter != null ? pagerAdapter.getCount() : 0;
            if (this.mEnableCycleScroll && i == 0 && count > 2) {
                int i2 = this.mCurItem;
                if (i2 == 0) {
                    setCurrentItem(count - 3, false);
                } else if (i2 == count - 1) {
                    setCurrentItem(0, false);
                }
            }
            int size = this.mOnPageChangeListeners.size();
            for (int i3 = 0; i3 < size; i3++) {
                e eVar = this.mOnPageChangeListeners.get(i3);
                if (eVar != null) {
                    eVar.a(i);
                }
            }
        }
    }

    public void completeScroll(boolean z) {
        IpChange ipChange = $ipChange;
        boolean z2 = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c980b987", new Object[]{this, new Boolean(z)});
            return;
        }
        if (this.mScrollState == 2) {
            z2 = true;
        }
        if (z2 && (!this.mScroller.isFinished())) {
            this.mScroller.abortAnimation();
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int currX = this.mScroller.getCurrX();
            int currY = this.mScroller.getCurrY();
            if (scrollX != currX || scrollY != currY) {
                checkSelectedPositionChangedWhenFling(currX);
                scrollTo(currX, currY);
                if (currX != scrollX) {
                    pageScrolled(currX);
                }
            }
        }
        if (!z2) {
            return;
        }
        if (z) {
            ViewCompat.postOnAnimation(this, this.mEndScrollRunnable);
        } else {
            this.mEndScrollRunnable.run();
        }
    }

    private boolean isGutterDrag(float f2, float f3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1f6f81c4", new Object[]{this, new Float(f2), new Float(f3)})).booleanValue() : (f2 < ((float) this.mGutterSize) && f3 > 0.0f) || (f2 > ((float) (getWidth() - this.mGutterSize)) && f3 < 0.0f);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            resetTouch();
            return false;
        }
        if (action != 0) {
            if (this.mIsBeingDragged) {
                return true;
            }
            if (this.mIsUnableToDrag) {
                return false;
            }
        }
        if (action == 0) {
            float x = motionEvent.getX();
            this.mInitialMotionX = x;
            this.mLastMotionX = x;
            float y = motionEvent.getY();
            this.mInitialMotionY = y;
            this.mLastMotionY = y;
            this.mActivePointerId = motionEvent.getPointerId(0);
            this.mIsUnableToDrag = false;
            this.mIsScrollStarted = true;
            this.mScroller.computeScrollOffset();
            if (this.mScrollState == 2 && Math.abs(this.mScroller.getFinalX() - this.mScroller.getCurrX()) > this.mCloseEnough) {
                this.mScroller.abortAnimation();
                populate();
                this.mIsBeingDragged = true;
                requestParentDisallowInterceptTouchEvent(true);
                setScrollState(1);
            } else {
                completeScroll(false);
                this.mIsBeingDragged = false;
            }
        } else if (action == 2) {
            int i = this.mActivePointerId;
            if (i != -1) {
                int findPointerIndex = motionEvent.findPointerIndex(i);
                float eventX = getEventX(motionEvent, findPointerIndex);
                float f2 = eventX - this.mLastMotionX;
                float abs = Math.abs(f2);
                float eventY = getEventY(motionEvent, findPointerIndex);
                float abs2 = Math.abs(eventY - this.mInitialMotionY);
                int i2 = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
                if (i2 != 0 && !isGutterDrag(this.mLastMotionX, f2) && canScroll(this, false, (int) f2, (int) eventX, (int) eventY)) {
                    this.mLastMotionX = eventX;
                    this.mLastMotionY = eventY;
                    this.mIsUnableToDrag = true;
                    return false;
                }
                if (abs > this.mTouchSlop && abs * 0.5f > abs2) {
                    this.mIsBeingDragged = true;
                    requestParentDisallowInterceptTouchEvent(true);
                    setScrollState(1);
                    this.mLastMotionX = i2 > 0 ? this.mInitialMotionX + this.mTouchSlop : this.mInitialMotionX - this.mTouchSlop;
                    this.mLastMotionY = eventY;
                } else if (abs2 > this.mTouchSlop) {
                    this.mIsUnableToDrag = true;
                }
                if (this.mIsBeingDragged && performDrag(eventX)) {
                    ViewCompat.postInvalidateOnAnimation(this);
                }
            }
        } else if (action == 6) {
            onSecondaryPointerUp(motionEvent);
        }
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        return this.mIsBeingDragged;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        PagerAdapter pagerAdapter;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (pagerAdapter = this.mAdapter) == null || pagerAdapter.getCount() == 0) {
            return false;
        }
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.mScroller.abortAnimation();
            populate();
            float x = motionEvent.getX();
            this.mInitialMotionX = x;
            this.mLastMotionX = x;
            float y = motionEvent.getY();
            this.mInitialMotionY = y;
            this.mLastMotionY = y;
            this.mActivePointerId = motionEvent.getPointerId(0);
        } else if (action != 1) {
            if (action == 2) {
                if (!this.mIsBeingDragged) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.mActivePointerId);
                    if (findPointerIndex == -1) {
                        z = resetTouch();
                    } else {
                        float eventX = getEventX(motionEvent, findPointerIndex);
                        float abs = Math.abs(eventX - this.mLastMotionX);
                        float eventY = getEventY(motionEvent, findPointerIndex);
                        float abs2 = Math.abs(eventY - this.mLastMotionY);
                        if (abs > this.mTouchSlop && abs > abs2) {
                            this.mIsBeingDragged = true;
                            requestParentDisallowInterceptTouchEvent(true);
                            float f2 = this.mInitialMotionX;
                            this.mLastMotionX = eventX - f2 > 0.0f ? f2 + this.mTouchSlop : f2 - this.mTouchSlop;
                            this.mLastMotionY = eventY;
                            setScrollState(1);
                            ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                        }
                    }
                }
                if (this.mIsBeingDragged) {
                    z = false | performDrag(getEventX(motionEvent, motionEvent.findPointerIndex(this.mActivePointerId)));
                }
            } else if (action != 3) {
                if (action == 5) {
                    int actionIndex = motionEvent.getActionIndex();
                    this.mLastMotionX = getEventX(motionEvent, actionIndex);
                    this.mActivePointerId = motionEvent.getPointerId(actionIndex);
                } else if (action == 6) {
                    onSecondaryPointerUp(motionEvent);
                    this.mLastMotionX = getEventX(motionEvent, motionEvent.findPointerIndex(this.mActivePointerId));
                }
            } else if (this.mIsBeingDragged) {
                scrollToItem(this.mCurItem, true, 0, false);
                z = resetTouch();
            }
        } else if (this.mIsBeingDragged) {
            VelocityTracker velocityTracker = this.mVelocityTracker;
            velocityTracker.computeCurrentVelocity(1000, this.mMaximumVelocity);
            int xVelocity = (int) velocityTracker.getXVelocity(this.mActivePointerId);
            if (this.mModeScroll == 1) {
                this.mEstimateScroller.computeScrollOffset();
                this.mEstimateScroller.abortAnimation();
                this.mEstimateScroller.fling(getScrollX(), getScrollY(), -xVelocity, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
                int finalX = this.mEstimateScroller.getFinalX();
                this.mEstimateScroller.abortAnimation();
                setCurrentItemInternal(determineFlingTargetPosition(finalX, xVelocity, (int) (getEventX(motionEvent, motionEvent.findPointerIndex(this.mActivePointerId)) - this.mInitialMotionX)), true, true);
            } else {
                setCurrentItemInternal(determineTargetPage(infoForCurrentScrollPosition().b, xVelocity, (int) (getEventX(motionEvent, motionEvent.findPointerIndex(this.mActivePointerId)) - this.mInitialMotionX)), true, true);
            }
            z = resetTouch();
        }
        if (z) {
            ViewCompat.postInvalidateOnAnimation(this);
        }
        return true;
    }

    private float getEventX(MotionEvent motionEvent, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f0349823", new Object[]{this, motionEvent, new Integer(i)})).floatValue();
        }
        try {
            return motionEvent.getX(i);
        } catch (Throwable unused) {
            return motionEvent.getX(0);
        }
    }

    private float getEventY(MotionEvent motionEvent, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7864d802", new Object[]{this, motionEvent, new Integer(i)})).floatValue();
        }
        try {
            return motionEvent.getY(i);
        } catch (Throwable unused) {
            return motionEvent.getY(0);
        }
    }

    public boolean resetTouch() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1fd337bb", new Object[]{this})).booleanValue();
        }
        this.mActivePointerId = -1;
        endDrag();
        this.mLeftEdge.onRelease();
        this.mRightEdge.onRelease();
        return this.mLeftEdge.isFinished() || this.mRightEdge.isFinished();
    }

    private void requestParentDisallowInterceptTouchEvent(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ab05b24", new Object[]{this, new Boolean(z)});
            return;
        }
        ViewParent parent = getParent();
        if (parent == null) {
            return;
        }
        parent.requestDisallowInterceptTouchEvent(z);
    }

    private boolean performDrag(float f2) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        boolean z2 = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c98c5d08", new Object[]{this, new Float(f2)})).booleanValue();
        }
        float f3 = this.mLastMotionX - f2;
        this.mLastMotionX = f2;
        float scrollX = getScrollX() + f3;
        float clientWidth = getClientWidth();
        float f4 = this.mFirstOffset * clientWidth;
        float f5 = this.mLastOffset * clientWidth;
        int i = this.mCurItem;
        ArrayList<a> arrayList = this.mItems;
        a aVar = arrayList.get(arrayList.size() - 1);
        boolean z3 = this.mItems.get(0).b == 0;
        boolean z4 = aVar.b == this.mAdapter.getCount() - 1;
        if (scrollX < f4 && z3) {
            this.mLeftEdge.onPull(Math.abs(f4 - scrollX) / clientWidth);
            if (this.mCurItem == 1) {
                z = true;
                i = 0;
            }
            f5 = f4;
        } else if (scrollX <= f5 || !z4) {
            f5 = scrollX;
            z2 = false;
        } else {
            this.mRightEdge.onPull(Math.abs(scrollX - f5) / clientWidth);
            if (this.mCurItem == this.mAdapter.getCount() - 2) {
                i = this.mAdapter.getCount() > 0 ? this.mAdapter.getCount() - 1 : 0;
                z = true;
            }
        }
        int i2 = (int) f5;
        this.mLastMotionX += f5 - i2;
        if (z) {
            checkSelectedPositionChangedWhenFling(i, i2);
        } else {
            checkSelectedPositionChangedWhenFling(i2);
        }
        scrollTo(i2, getScrollY());
        pageScrolled(i2);
        return z2;
    }

    private int findScrollPosition(float f2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ac92483d", new Object[]{this, new Float(f2)})).intValue() : infoForScrollPosition(f2).b;
    }

    private int findPreviousPosition(int i, float f2, float f3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("227fd916", new Object[]{this, new Integer(i), new Float(f2), new Float(f3)})).intValue();
        }
        a aVar = this.mItems.get(i);
        float f4 = aVar.e;
        float f5 = this.mFirstOffset;
        float f6 = aVar.d;
        int i2 = aVar.b;
        while (i2 >= 0) {
            if (Float.compare(f4, f2) <= 0 && Float.compare(f6 + f4 + f3, f2) >= 0) {
                return i2;
            }
            i--;
            i2--;
            a aVar2 = i >= 0 ? this.mItems.get(i) : null;
            if (aVar2 != null && i == 0) {
                f5 = aVar2.e;
            }
            if (i2 < 0) {
                return (f2 <= this.mFirstOffset || f2 <= f5) ? 0 : -1;
            } else if (aVar2 != null && i2 == aVar2.b) {
                f6 = aVar2.d;
                f4 -= f6 + f3;
            } else {
                f6 = this.mAdapter.getPageWidth(i2);
                f4 -= f6 + f3;
                i++;
            }
        }
        return -1;
    }

    private int infoIndexOrCenterPosition(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ab58602a", new Object[]{this, new Integer(i)})).intValue();
        }
        for (int i2 = 0; i2 < this.mItems.size(); i2++) {
            if (this.mItems.get(i2).b == i) {
                return i2;
            }
        }
        if (this.mItems.size() != 1) {
            return this.mItems.size() / 2;
        }
        return 0;
    }

    private int findNextPosition(int i, float f2, float f3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8f26ad1a", new Object[]{this, new Integer(i), new Float(f2), new Float(f3)})).intValue();
        }
        a aVar = this.mItems.get(i);
        int size = this.mItems.size();
        float f4 = aVar.e;
        float f5 = this.mLastOffset;
        float f6 = aVar.d;
        int i2 = aVar.b;
        int count = this.mAdapter.getCount() - 1;
        while (i2 <= count) {
            if (Float.compare(f4, f2) <= 0 && Float.compare(f6 + f4 + f3, f2) >= 0) {
                return i2;
            }
            i++;
            i2++;
            a aVar2 = i < size ? this.mItems.get(i) : null;
            if (aVar2 != null && i == size - 1) {
                f5 = aVar2.e;
            }
            if (i2 > count) {
                if (f2 < this.mLastOffset && f2 < f5) {
                    return -1;
                }
                return count;
            } else if (aVar2 != null && i2 == aVar2.b) {
                f6 = aVar2.d;
                f4 += f6 + f3;
            } else {
                f6 = this.mAdapter.getPageWidth(i2);
                f4 += f6 + f3;
                i--;
            }
        }
        return -1;
    }

    private int determineFlingTargetPosition(float f2, int i, int i2) {
        int clientWidth;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9cbcf5c9", new Object[]{this, new Float(f2), new Integer(i), new Integer(i2)})).intValue();
        }
        if (this.mItems.isEmpty() || (clientWidth = getClientWidth()) <= 0) {
            return 0;
        }
        float f3 = clientWidth;
        float f4 = (f2 / f3) + 0.5f;
        float f5 = this.mPageMargin / f3;
        int infoIndexOrCenterPosition = infoIndexOrCenterPosition(this.mCurItem);
        int findPreviousPosition = findPreviousPosition(infoIndexOrCenterPosition, f4, f5);
        if (findPreviousPosition != -1 && findPreviousPosition != this.mCurItem) {
            return findPreviousPosition;
        }
        int findNextPosition = findNextPosition(infoIndexOrCenterPosition, f4, f5);
        if (findNextPosition != -1 && findNextPosition != this.mCurItem) {
            return findNextPosition;
        }
        int i3 = this.mCurItem;
        return (Math.abs(i2) <= this.mFlingDistance || Math.abs(i) <= this.mMinimumVelocity) ? i3 : i > 0 ? this.mCurItem - 1 : this.mCurItem + 1;
    }

    private a infoForScrollPosition(float f2) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("78274156", new Object[]{this, new Float(f2)});
        }
        int clientWidth = getClientWidth();
        float f3 = clientWidth > 0 ? f2 / clientWidth : 0.0f;
        float f4 = clientWidth > 0 ? this.mPageMargin / clientWidth : 0.0f;
        float f5 = f3 + 0.5f;
        a aVar = new a();
        int i2 = -1;
        int i3 = 0;
        boolean z = true;
        float f6 = 0.0f;
        float f7 = 0.0f;
        int i4 = Integer.MAX_VALUE;
        while (i3 < this.mItems.size()) {
            a aVar2 = this.mItems.get(i3);
            if (!z && aVar2.b != (i = i2 + 1)) {
                aVar2 = this.mTempItem;
                aVar2.e = f6 + f7 + f4;
                aVar2.b = i;
                aVar2.d = this.mAdapter.getPageWidth(aVar2.b);
                i3--;
            }
            f6 = aVar2.e;
            float f8 = aVar2.d + f6 + f4;
            if (z && i3 == this.mItems.size() - 1) {
                return aVar2;
            }
            if (f6 < f5 && f5 < f8) {
                return aVar2;
            }
            int abs = (int) Math.abs((f5 - (((f8 - f6) / 2.0f) + f6)) * clientWidth);
            if (abs <= i4) {
                aVar.e = f6;
                aVar.b = aVar2.b;
                aVar.d = aVar2.d;
                i4 = abs;
            }
            i2 = aVar2.b;
            f7 = aVar2.d;
            i3++;
            z = false;
        }
        return aVar;
    }

    public a infoForCurrentScrollPosition() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("d1c4f7c9", new Object[]{this}) : infoForScrollPosition(getScrollX());
    }

    private int determineTargetPage(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("77a23cdc", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)})).intValue() : (Math.abs(i3) <= this.mFlingDistance || Math.abs(i2) <= this.mMinimumVelocity) ? i : i2 > 0 ? i - 1 : i + 1;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        PagerAdapter pagerAdapter;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cc013fa", new Object[]{this, canvas});
            return;
        }
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        if (overScrollMode == 0 || (overScrollMode == 1 && (pagerAdapter = this.mAdapter) != null && pagerAdapter.getCount() > 1)) {
            if (!this.mLeftEdge.isFinished()) {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((-height) + getPaddingTop(), this.mFirstOffset * width);
                this.mLeftEdge.setSize(height, width);
                canvas.restoreToCount(save);
                z = this.mLeftEdge.draw(canvas) | false;
            }
            if (!this.mRightEdge.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.mLastOffset + 1.0f)) * width2);
                this.mRightEdge.setSize(height2, width2);
                z |= this.mRightEdge.draw(canvas);
                canvas.restoreToCount(save2);
            }
        } else {
            this.mLeftEdge.finish();
            this.mRightEdge.finish();
        }
        if (!z) {
            return;
        }
        ViewCompat.postInvalidateOnAnimation(this);
    }

    private void onSecondaryPointerUp(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        int i = 1;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f24b537f", new Object[]{this, motionEvent});
            return;
        }
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) != this.mActivePointerId) {
            return;
        }
        if (actionIndex != 0) {
            i = 0;
        }
        this.mLastMotionX = getEventX(motionEvent, i);
        this.mActivePointerId = motionEvent.getPointerId(i);
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker == null) {
            return;
        }
        velocityTracker.clear();
    }

    private void endDrag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7221d9b6", new Object[]{this});
            return;
        }
        this.mIsBeingDragged = false;
        this.mIsUnableToDrag = false;
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker == null) {
            return;
        }
        velocityTracker.recycle();
        this.mVelocityTracker = null;
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("db5fe012", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (this.mAdapter == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        return i < 0 ? scrollX > ((int) (((float) clientWidth) * this.mFirstOffset)) : i > 0 && scrollX < ((int) (((float) clientWidth) * this.mLastOffset));
    }

    public boolean canScroll(View view, boolean z, int i, int i2, int i3) {
        int i4;
        int i5;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d4259e1", new Object[]{this, view, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3)})).booleanValue();
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            int childCount = viewGroup.getChildCount() - 1;
            while (childCount >= 0) {
                View childAt = viewGroup.getChildAt(childCount);
                int i6 = i2 + scrollX;
                if (i6 < childAt.getLeft() || i6 >= childAt.getRight() || (i5 = i3 + scrollY) < childAt.getTop() || i5 >= childAt.getBottom()) {
                    i4 = childCount;
                } else {
                    i4 = childCount;
                    if (canScroll(childAt, true, i, i6 - childAt.getLeft(), i5 - childAt.getTop())) {
                        return true;
                    }
                }
                childCount = i4 - 1;
            }
        }
        return z && view.canScrollHorizontally(-i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4a534d24", new Object[]{this, keyEvent})).booleanValue() : super.dispatchKeyEvent(keyEvent) || executeKeyEvent(keyEvent);
    }

    public boolean executeKeyEvent(KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("84c2a049", new Object[]{this, keyEvent})).booleanValue();
        }
        if (keyEvent.getAction() != 0) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 21) {
            if (keyEvent.hasModifiers(2)) {
                return pageLeft();
            }
            return arrowScroll(17);
        } else if (keyCode == 22) {
            if (keyEvent.hasModifiers(2)) {
                return pageRight();
            }
            return arrowScroll(66);
        } else if (keyCode != 61) {
            return false;
        } else {
            if (keyEvent.hasNoModifiers()) {
                return arrowScroll(2);
            }
            if (!keyEvent.hasModifiers(1)) {
                return false;
            }
            return arrowScroll(1);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x003d, code lost:
        if (r5 == false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean arrowScroll(int r8) {
        /*
            r7 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.detail.ttdetail.widget.TTViewPager.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L21
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r1[r4] = r7
            java.lang.Integer r2 = new java.lang.Integer
            r2.<init>(r8)
            r1[r3] = r2
            java.lang.String r8 = "ead254ea"
            java.lang.Object r8 = r0.ipc$dispatch(r8, r1)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            return r8
        L21:
            android.view.View r0 = r7.findFocus()
            r1 = 0
            if (r0 != r7) goto L29
            goto L41
        L29:
            if (r0 == 0) goto L40
            android.view.ViewParent r5 = r0.getParent()
        L2f:
            boolean r6 = r5 instanceof android.view.ViewGroup
            if (r6 == 0) goto L3c
            if (r5 != r7) goto L37
            r5 = 1
            goto L3d
        L37:
            android.view.ViewParent r5 = r5.getParent()
            goto L2f
        L3c:
            r5 = 0
        L3d:
            if (r5 != 0) goto L40
            goto L41
        L40:
            r1 = r0
        L41:
            android.view.FocusFinder r0 = android.view.FocusFinder.getInstance()
            android.view.View r0 = r0.findNextFocus(r7, r1, r8)
            r5 = 66
            r6 = 17
            if (r0 == 0) goto L91
            if (r0 == r1) goto L91
            if (r8 != r6) goto L71
            android.graphics.Rect r2 = r7.mTempRect
            android.graphics.Rect r2 = r7.getChildRectInPagerCoordinates(r2, r0)
            int r2 = r2.left
            android.graphics.Rect r3 = r7.mTempRect
            android.graphics.Rect r3 = r7.getChildRectInPagerCoordinates(r3, r1)
            int r3 = r3.left
            if (r1 == 0) goto L6c
            if (r2 < r3) goto L6c
            boolean r4 = r7.pageLeft()
            goto La3
        L6c:
            boolean r4 = r0.requestFocus()
            goto La3
        L71:
            if (r8 != r5) goto La3
            android.graphics.Rect r2 = r7.mTempRect
            android.graphics.Rect r2 = r7.getChildRectInPagerCoordinates(r2, r0)
            int r2 = r2.left
            android.graphics.Rect r3 = r7.mTempRect
            android.graphics.Rect r3 = r7.getChildRectInPagerCoordinates(r3, r1)
            int r3 = r3.left
            if (r1 == 0) goto L8c
            if (r2 > r3) goto L8c
            boolean r4 = r7.pageRight()
            goto La3
        L8c:
            boolean r4 = r0.requestFocus()
            goto La3
        L91:
            if (r8 == r6) goto L9f
            if (r8 != r3) goto L96
            goto L9f
        L96:
            if (r8 == r5) goto L9a
            if (r8 != r2) goto La3
        L9a:
            boolean r4 = r7.pageRight()
            goto La3
        L9f:
            boolean r4 = r7.pageLeft()
        La3:
            if (r4 == 0) goto Lac
            int r8 = android.view.SoundEffectConstants.getContantForFocusDirection(r8)
            r7.playSoundEffect(r8)
        Lac:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.detail.ttdetail.widget.TTViewPager.arrowScroll(int):boolean");
    }

    private Rect getChildRectInPagerCoordinates(Rect rect, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("596ff4b0", new Object[]{this, rect, view});
        }
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            rect.top += viewGroup.getTop();
            rect.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect;
    }

    public boolean pageLeft() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fb2190c1", new Object[]{this})).booleanValue();
        }
        int i = this.mCurItem;
        if (i <= 0) {
            return false;
        }
        setCurrentItem(i - 1, true);
        return true;
    }

    public boolean pageRight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a67906d8", new Object[]{this})).booleanValue();
        }
        PagerAdapter pagerAdapter = this.mAdapter;
        if (pagerAdapter == null || this.mCurItem >= pagerAdapter.getCount() - 1) {
            return false;
        }
        setCurrentItem(this.mCurItem + 1, true);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        a infoForChild;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60d7d1e1", new Object[]{this, arrayList, new Integer(i), new Integer(i2)});
            return;
        }
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0 && (infoForChild = infoForChild(childAt)) != null && infoForChild.b == this.mCurItem) {
                    childAt.addFocusables(arrayList, i, i2);
                }
            }
        }
        if ((descendantFocusability == 262144 && size != arrayList.size()) || !isFocusable()) {
            return;
        }
        if (((i2 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) || arrayList == null) {
            return;
        }
        arrayList.add(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(ArrayList<View> arrayList) {
        a infoForChild;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b6a79e8", new Object[]{this, arrayList});
            return;
        }
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (infoForChild = infoForChild(childAt)) != null && infoForChild.b == this.mCurItem) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        int i3;
        a infoForChild;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1e8386ca", new Object[]{this, new Integer(i), rect})).booleanValue();
        }
        int childCount = getChildCount();
        int i4 = -1;
        if ((i & 2) != 0) {
            i4 = childCount;
            i2 = 0;
            i3 = 1;
        } else {
            i2 = childCount - 1;
            i3 = -1;
        }
        while (i2 != i4) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (infoForChild = infoForChild(childAt)) != null && infoForChild.b == this.mCurItem && childAt.requestFocus(i, rect)) {
                return true;
            }
            i2 += i3;
        }
        return false;
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        a infoForChild;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bbbb6bb7", new Object[]{this, accessibilityEvent})).booleanValue();
        }
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (infoForChild = infoForChild(childAt)) != null && infoForChild.b == this.mCurItem && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup.LayoutParams) ipChange.ipc$dispatch("6dca2b10", new Object[]{this}) : new LayoutParams();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup.LayoutParams) ipChange.ipc$dispatch("ce603fbe", new Object[]{this, layoutParams}) : generateDefaultLayoutParams();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("79d4b702", new Object[]{this, layoutParams})).booleanValue() : (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup.LayoutParams) ipChange.ipc$dispatch("84bf71af", new Object[]{this, attributeSet}) : new LayoutParams(y.a(this), attributeSet);
    }

    /* loaded from: classes5.dex */
    public class b extends AccessibilityDelegateCompat {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-573467799);
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -1796852737) {
                super.onInitializeAccessibilityNodeInfo((View) objArr[0], (AccessibilityNodeInfoCompat) objArr[1]);
                return null;
            } else if (hashCode == -1476904323) {
                return new Boolean(super.performAccessibilityAction((View) objArr[0], ((Number) objArr[1]).intValue(), (Bundle) objArr[2]));
            } else {
                if (hashCode != -485045190) {
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                }
                super.onInitializeAccessibilityEvent((View) objArr[0], (AccessibilityEvent) objArr[1]);
                return null;
            }
        }

        public b() {
        }

        @Override // android.support.v4.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e316cc3a", new Object[]{this, view, accessibilityEvent});
                return;
            }
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(TTViewPager.class.getName());
            accessibilityEvent.setScrollable(a());
            if (accessibilityEvent.getEventType() != 4096 || TTViewPager.this.mAdapter == null) {
                return;
            }
            accessibilityEvent.setItemCount(TTViewPager.this.mAdapter.getCount());
            accessibilityEvent.setFromIndex(TTViewPager.this.mCurItem);
            accessibilityEvent.setToIndex(TTViewPager.this.mCurItem);
        }

        @Override // android.support.v4.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("94e633ff", new Object[]{this, view, accessibilityNodeInfoCompat});
                return;
            }
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            accessibilityNodeInfoCompat.setClassName(TTViewPager.class.getName());
            accessibilityNodeInfoCompat.setScrollable(a());
            if (TTViewPager.this.canScrollHorizontally(1)) {
                accessibilityNodeInfoCompat.addAction(4096);
            }
            if (!TTViewPager.this.canScrollHorizontally(-1)) {
                return;
            }
            accessibilityNodeInfoCompat.addAction(8192);
        }

        @Override // android.support.v4.view.AccessibilityDelegateCompat
        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a7f83a7d", new Object[]{this, view, new Integer(i), bundle})).booleanValue();
            }
            if (super.performAccessibilityAction(view, i, bundle)) {
                return true;
            }
            if (i == 4096) {
                if (!TTViewPager.this.canScrollHorizontally(1)) {
                    return false;
                }
                TTViewPager tTViewPager = TTViewPager.this;
                tTViewPager.setCurrentItem(tTViewPager.mCurItem + 1);
                return true;
            } else if (i != 8192 || !TTViewPager.this.canScrollHorizontally(-1)) {
                return false;
            } else {
                TTViewPager tTViewPager2 = TTViewPager.this;
                tTViewPager2.setCurrentItem(tTViewPager2.mCurItem - 1);
                return true;
            }
        }

        private boolean a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : TTViewPager.this.mAdapter != null && TTViewPager.this.mAdapter.getCount() > 1;
        }
    }

    /* loaded from: classes5.dex */
    public class f extends DataSetObserver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-11741445);
        }

        public f() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ba16f5dc", new Object[]{this});
            } else {
                TTViewPager.this.dataSetChanged();
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("61d25eb1", new Object[]{this});
            } else {
                TTViewPager.this.dataSetChanged();
            }
        }
    }

    /* loaded from: classes5.dex */
    public static class LayoutParams extends ViewGroup.LayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public int f10988a;
        public float b;
        public boolean c;
        public int d;

        static {
            kge.a(1412711886);
        }

        public LayoutParams() {
            super(-1, -1);
            this.b = 0.0f;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.b = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, TTViewPager.LAYOUT_ATTRS);
            this.f10988a = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }
}
