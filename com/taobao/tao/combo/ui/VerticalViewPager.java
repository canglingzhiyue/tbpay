package com.taobao.tao.combo.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.v4.os.ParcelableCompat;
import android.support.v4.os.ParcelableCompatCreatorCallbacks;
import android.support.v4.view.KeyEventCompat;
import android.support.v4.view.MotionEventCompat;
import android.support.v4.view.VelocityTrackerCompat;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewConfigurationCompat;
import android.util.AttributeSet;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.Scroller;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import tb.kge;
import tb.riy;

/* loaded from: classes8.dex */
public class VerticalViewPager extends ViewGroup {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final Comparator<b> COMPARATOR;
    private static final boolean DEBUG = false;
    private static final int DEFAULT_OFFSCREEN_PAGES = 1;
    private static final int INVALID_POINTER = -1;
    private static final int[] LAYOUT_ATTRS;
    private static final int MAX_SETTLE_DURATION = 600;
    private static final int MIN_DISTANCE_FOR_FLING = 25;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    private static final String TAG = "VerticalViewPager";
    private static final boolean USE_CACHE = false;
    private static final Interpolator sInterpolator;
    private int mActivePointerId;
    private com.taobao.tao.combo.ui.d mAdapter;
    private c mAdapterChangeListener;
    private boolean mCalledSuper;
    private int mChildHeightMeasureSpec;
    private int mChildWidthMeasureSpec;
    private int mCurItem;
    private int mDecorChildCount;
    private long mFakeDragBeginTime;
    private boolean mFakeDragging;
    private boolean mFirstLayout;
    private int mFlingDistance;
    private boolean mInLayout;
    private float mInitialMotionY;
    private d mInternalPageChangeListener;
    private boolean mIsBeingDragged;
    private boolean mIsUnableToDrag;
    private final ArrayList<b> mItems;
    private float mLastMotionX;
    private float mLastMotionY;
    private int mLeftPageBounds;
    private Drawable mMarginDrawable;
    private int mMaximumVelocity;
    private int mMinimumVelocity;
    private e mObserver;
    private int mOffscreenPageLimit;
    private d mOnPageChangeListener;
    private int mPageMargin;
    private boolean mPopulatePending;
    private Parcelable mRestoredAdapterState;
    private ClassLoader mRestoredClassLoader;
    private int mRestoredCurItem;
    private int mRightPageBounds;
    private int mScrollState;
    private Scroller mScroller;
    private boolean mScrolling;
    private boolean mScrollingCacheEnabled;
    private int mTouchSlop;
    private VelocityTracker mVelocityTracker;

    /* loaded from: classes8.dex */
    interface a {
    }

    /* loaded from: classes8.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public Object f19892a;
        public int b;
        public boolean c;

        static {
            kge.a(358525079);
        }
    }

    /* loaded from: classes8.dex */
    interface c {
    }

    /* loaded from: classes8.dex */
    public interface d {
        void onPageScrollStateChanged(int i);

        void onPageScrolled(int i, float f, int i2);

        void onPageSelected(int i);
    }

    /* loaded from: classes8.dex */
    public static class f implements d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1997139270);
            kge.a(947632744);
        }

        @Override // com.taobao.tao.combo.ui.VerticalViewPager.d
        public void onPageScrollStateChanged(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6581cc1e", new Object[]{this, new Integer(i)});
            }
        }

        @Override // com.taobao.tao.combo.ui.VerticalViewPager.d
        public void onPageScrolled(int i, float f, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f4c13b05", new Object[]{this, new Integer(i), new Float(f), new Integer(i2)});
            }
        }

        @Override // com.taobao.tao.combo.ui.VerticalViewPager.d
        public void onPageSelected(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i)});
            }
        }
    }

    public static /* synthetic */ Object ipc$super(VerticalViewPager verticalViewPager, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1894755994:
                return new Boolean(super.verifyDrawable((Drawable) objArr[0]));
            case -1117127205:
                super.onDraw((Canvas) objArr[0]);
                return null;
            case 27005610:
                return super.onSaveInstanceState();
            case 80153535:
                super.onRestoreInstanceState((Parcelable) objArr[0]);
                return null;
            case 448480424:
                super.drawableStateChanged();
                return null;
            case 1246973220:
                return new Boolean(super.dispatchKeyEvent((KeyEvent) objArr[0]));
            case 1389530587:
                super.onSizeChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
                return null;
            case 1626033557:
                super.onAttachedToWindow();
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

    public static /* synthetic */ int[] access$100() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (int[]) ipChange.ipc$dispatch("45cc152c", new Object[0]) : LAYOUT_ATTRS;
    }

    static {
        kge.a(-2011033138);
        LAYOUT_ATTRS = new int[]{16842931};
        COMPARATOR = new Comparator<b>() { // from class: com.taobao.tao.combo.ui.VerticalViewPager.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.util.Comparator
            public /* synthetic */ int compare(b bVar, b bVar2) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6a9be197", new Object[]{this, bVar, bVar2})).intValue() : a(bVar, bVar2);
            }

            public int a(b bVar, b bVar2) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ed9cfc7b", new Object[]{this, bVar, bVar2})).intValue() : bVar.b - bVar2.b;
            }
        };
        sInterpolator = new Interpolator() { // from class: com.taobao.tao.combo.ui.VerticalViewPager.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.TimeInterpolator
            public float getInterpolation(float f2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Number) ipChange.ipc$dispatch("22c782db", new Object[]{this, new Float(f2)})).floatValue();
                }
                float f3 = f2 - 1.0f;
                return (f3 * f3 * f3 * f3 * f3) + 1.0f;
            }
        };
    }

    public VerticalViewPager(Context context) {
        super(context);
        this.mItems = new ArrayList<>();
        this.mRestoredCurItem = -1;
        this.mRestoredAdapterState = null;
        this.mRestoredClassLoader = null;
        this.mOffscreenPageLimit = 1;
        this.mActivePointerId = -1;
        this.mFirstLayout = true;
        this.mScrollState = 0;
        initViewPager();
    }

    public VerticalViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mItems = new ArrayList<>();
        this.mRestoredCurItem = -1;
        this.mRestoredAdapterState = null;
        this.mRestoredClassLoader = null;
        this.mOffscreenPageLimit = 1;
        this.mActivePointerId = -1;
        this.mFirstLayout = true;
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
        Context context = getContext();
        this.mScroller = new Scroller(context, sInterpolator);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.mTouchSlop = ViewConfigurationCompat.getScaledPagingTouchSlop(viewConfiguration);
        this.mMinimumVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        this.mMaximumVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        this.mFlingDistance = (int) (context.getResources().getDisplayMetrics().density * 25.0f);
    }

    private void setScrollState(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5a2509a", new Object[]{this, new Integer(i)});
        } else if (this.mScrollState == i) {
        } else {
            this.mScrollState = i;
            d dVar = this.mOnPageChangeListener;
            if (dVar == null) {
                return;
            }
            dVar.onPageScrollStateChanged(i);
        }
    }

    public void setAdapter(com.taobao.tao.combo.ui.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfe6f623", new Object[]{this, dVar});
            return;
        }
        com.taobao.tao.combo.ui.d dVar2 = this.mAdapter;
        if (dVar2 != null) {
            dVar2.b(this.mObserver);
            this.mAdapter.a((ViewGroup) this);
            for (int i = 0; i < this.mItems.size(); i++) {
                b bVar = this.mItems.get(i);
                this.mAdapter.a((ViewGroup) this, bVar.b, bVar.f19892a);
            }
            this.mItems.clear();
            removeNonDecorViews();
            this.mCurItem = 0;
            scrollTo(0, 0);
        }
        this.mAdapter = dVar;
        if (this.mAdapter == null) {
            return;
        }
        if (this.mObserver == null) {
            this.mObserver = new e();
        }
        this.mAdapter.a((DataSetObserver) this.mObserver);
        this.mPopulatePending = false;
        int i2 = this.mRestoredCurItem;
        if (i2 >= 0) {
            setCurrentItemInternal(i2, false, true);
            this.mRestoredCurItem = -1;
            this.mRestoredAdapterState = null;
            this.mRestoredClassLoader = null;
            return;
        }
        populate();
    }

    private void removeNonDecorViews() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c659ec19", new Object[]{this});
            return;
        }
        while (i < getChildCount()) {
            if (!((LayoutParams) getChildAt(i).getLayoutParams()).f19891a) {
                removeViewAt(i);
                i--;
            }
            i++;
        }
    }

    public com.taobao.tao.combo.ui.d getAdapter() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.tao.combo.ui.d) ipChange.ipc$dispatch("4e480407", new Object[]{this}) : this.mAdapter;
    }

    public void setOnAdapterChangeListener(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f5992db", new Object[]{this, cVar});
        } else {
            this.mAdapterChangeListener = cVar;
        }
    }

    public void setCurrentItem(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d416f32", new Object[]{this, new Integer(i)});
            return;
        }
        this.mPopulatePending = false;
        setCurrentItemInternal(i, !this.mFirstLayout, false);
    }

    public void setCurrentItem(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9aed29e2", new Object[]{this, new Integer(i), new Boolean(z)});
            return;
        }
        this.mPopulatePending = false;
        setCurrentItemInternal(i, z, false);
    }

    public int getCurrentItem() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b0d0a870", new Object[]{this})).intValue() : this.mCurItem;
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
        d dVar;
        d dVar2;
        d dVar3;
        d dVar4;
        IpChange ipChange = $ipChange;
        boolean z3 = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e96247ee", new Object[]{this, new Integer(i), new Boolean(z), new Boolean(z2), new Integer(i2)});
            return;
        }
        com.taobao.tao.combo.ui.d dVar5 = this.mAdapter;
        if (dVar5 == null || dVar5.a() <= 0) {
            setScrollingCacheEnabled(false);
        } else if (!z2 && this.mCurItem == i && this.mItems.size() != 0) {
            setScrollingCacheEnabled(false);
        } else {
            if (i < 0) {
                i = 0;
            } else if (i >= this.mAdapter.a()) {
                i = this.mAdapter.a() - 1;
            }
            int i3 = this.mOffscreenPageLimit;
            int i4 = this.mCurItem;
            if (i > i4 + i3 || i < i4 - i3) {
                for (int i5 = 0; i5 < this.mItems.size(); i5++) {
                    this.mItems.get(i5).c = true;
                }
            }
            if (this.mCurItem == i) {
                z3 = false;
            }
            this.mCurItem = i;
            populate();
            int height = (getHeight() + this.mPageMargin) * i;
            if (z) {
                smoothScrollTo(0, height, i2);
                if (z3 && (dVar4 = this.mOnPageChangeListener) != null) {
                    dVar4.onPageSelected(i);
                }
                if (!z3 || (dVar3 = this.mInternalPageChangeListener) == null) {
                    return;
                }
                dVar3.onPageSelected(i);
                return;
            }
            if (z3 && (dVar2 = this.mOnPageChangeListener) != null) {
                dVar2.onPageSelected(i);
            }
            if (z3 && (dVar = this.mInternalPageChangeListener) != null) {
                dVar.onPageSelected(i);
            }
            completeScroll();
            scrollTo(0, height);
        }
    }

    public void setOnPageChangeListener(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f917518", new Object[]{this, dVar});
        } else {
            this.mOnPageChangeListener = dVar;
        }
    }

    public d setInternalPageChangeListener(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("c8d06fdd", new Object[]{this, dVar});
        }
        d dVar2 = this.mInternalPageChangeListener;
        this.mInternalPageChangeListener = dVar;
        return dVar2;
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
        if (i <= 0) {
            String str = "Requested offscreen page limit " + i + " too small; defaulting to 1";
            i = 1;
        }
        if (i == this.mOffscreenPageLimit) {
            return;
        }
        this.mOffscreenPageLimit = i;
        populate();
    }

    public void setPageMargin(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b7d279d", new Object[]{this, new Integer(i)});
            return;
        }
        int i2 = this.mPageMargin;
        this.mPageMargin = i;
        int height = getHeight();
        recomputeScrollPosition(height, height, i, i2);
        requestLayout();
    }

    public int getPageMargin() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e236e80d", new Object[]{this})).intValue() : this.mPageMargin;
    }

    public void setPageMarginDrawable(Drawable drawable) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45c21808", new Object[]{this, drawable});
            return;
        }
        this.mMarginDrawable = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        if (drawable != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
    }

    public void setPageMarginDrawable(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6905b89f", new Object[]{this, new Integer(i)});
        } else {
            setPageMarginDrawable(getContext().getResources().getDrawable(i));
        }
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8f105166", new Object[]{this, drawable})).booleanValue() : super.verifyDrawable(drawable) || drawable == this.mMarginDrawable;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1abb44a8", new Object[]{this});
            return;
        }
        super.drawableStateChanged();
        Drawable drawable = this.mMarginDrawable;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    public float distanceInfluenceForSnapDuration(float f2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("96b34422", new Object[]{this, new Float(f2)})).floatValue() : (float) Math.sin((float) ((f2 - 0.5f) * 0.4712389167638204d));
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
        int abs;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42983a06", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
        } else if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
        } else {
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int i4 = i - scrollX;
            int i5 = i2 - scrollY;
            if (i4 == 0 && i5 == 0) {
                completeScroll();
                setScrollState(0);
                return;
            }
            setScrollingCacheEnabled(true);
            this.mScrolling = true;
            setScrollState(2);
            int height = getHeight();
            float f2 = height / 2;
            float distanceInfluenceForSnapDuration = f2 + (distanceInfluenceForSnapDuration(Math.min(1.0f, (Math.abs(i5) * 1.0f) / height)) * f2);
            int abs2 = Math.abs(i3);
            if (abs2 > 0) {
                abs = Math.round(Math.abs(distanceInfluenceForSnapDuration / abs2) * 1000.0f) * 4;
            } else {
                abs = (int) (((Math.abs(i5) / (height + this.mPageMargin)) + 1.0f) * 100.0f);
            }
            this.mScroller.startScroll(scrollX, scrollY, i4, i5, Math.min(abs, 600));
            invalidate();
        }
    }

    public void addNewItem(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62950299", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        b bVar = new b();
        bVar.b = i;
        bVar.f19892a = this.mAdapter.a((ViewGroup) this, i);
        if (i2 < 0) {
            this.mItems.add(bVar);
        } else {
            this.mItems.add(i2, bVar);
        }
    }

    public void dataSetChanged() {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6da031c3", new Object[]{this});
            return;
        }
        boolean z2 = this.mItems.size() < 3 && this.mItems.size() < this.mAdapter.a();
        int i = 0;
        int i2 = -1;
        boolean z3 = false;
        while (i < this.mItems.size()) {
            b bVar = this.mItems.get(i);
            int a2 = this.mAdapter.a(bVar.f19892a);
            if (a2 != -1) {
                if (a2 == -2) {
                    this.mItems.remove(i);
                    i--;
                    if (!z3) {
                        this.mAdapter.a((ViewGroup) this);
                        z3 = true;
                    }
                    this.mAdapter.a((ViewGroup) this, bVar.b, bVar.f19892a);
                    if (this.mCurItem == bVar.b) {
                        i2 = Math.max(0, Math.min(this.mCurItem, this.mAdapter.a() - 1));
                    }
                } else if (bVar.b != a2) {
                    if (bVar.b == this.mCurItem) {
                        i2 = a2;
                    }
                    bVar.b = a2;
                }
                z2 = true;
            }
            i++;
        }
        Collections.sort(this.mItems, COMPARATOR);
        if (i2 >= 0) {
            setCurrentItemInternal(i2, false, true);
        } else {
            z = z2;
        }
        if (!z) {
            return;
        }
        populate();
        requestLayout();
    }

    public void populate() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a1c6871", new Object[]{this});
        } else if (this.mAdapter != null && !this.mPopulatePending && getWindowToken() != null) {
            this.mAdapter.a((ViewGroup) this);
            int i2 = this.mOffscreenPageLimit;
            int max = Math.max(0, this.mCurItem - i2);
            int min = Math.min(this.mAdapter.a() - 1, this.mCurItem + i2);
            int i3 = 0;
            int i4 = -1;
            while (i3 < this.mItems.size()) {
                b bVar = this.mItems.get(i3);
                if ((bVar.b < max || bVar.b > min) && !bVar.c) {
                    this.mItems.remove(i3);
                    i3--;
                    this.mAdapter.a((ViewGroup) this, bVar.b, bVar.f19892a);
                } else if (i4 < min && bVar.b > max) {
                    int i5 = i4 + 1;
                    if (i5 < max) {
                        i5 = max;
                    }
                    while (i5 <= min && i5 < bVar.b) {
                        addNewItem(i5, i3);
                        i5++;
                        i3++;
                    }
                }
                i4 = bVar.b;
                i3++;
            }
            if (this.mItems.size() > 0) {
                ArrayList<b> arrayList = this.mItems;
                i = arrayList.get(arrayList.size() - 1).b;
            } else {
                i = -1;
            }
            if (i < min) {
                int i6 = 1 + i;
                if (i6 > max) {
                    max = i6;
                }
                while (max <= min) {
                    addNewItem(max, -1);
                    max++;
                }
            }
            int i7 = 0;
            while (true) {
                if (i7 >= this.mItems.size()) {
                    break;
                } else if (this.mItems.get(i7).b == this.mCurItem) {
                    this.mItems.get(i7);
                    break;
                } else {
                    i7++;
                }
            }
            if (!hasFocus()) {
                return;
            }
            View findFocus = findFocus();
            b infoForAnyChild = findFocus != null ? infoForAnyChild(findFocus) : null;
            if (infoForAnyChild != null && infoForAnyChild.b == this.mCurItem) {
                return;
            }
            for (int i8 = 0; i8 < getChildCount(); i8++) {
                View childAt = getChildAt(i8);
                b infoForChild = infoForChild(childAt);
                if (infoForChild != null && infoForChild.b == this.mCurItem && childAt.requestFocus(2)) {
                    return;
                }
            }
        }
    }

    /* loaded from: classes8.dex */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR;
        Parcelable adapterState;
        ClassLoader loader;
        int position;

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.position);
            parcel.writeParcelable(this.adapterState, i);
        }

        public String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.position + riy.BLOCK_END_STR;
        }

        static {
            kge.a(763347712);
            CREATOR = ParcelableCompat.newCreator(new ParcelableCompatCreatorCallbacks<SavedState>() { // from class: com.taobao.tao.combo.ui.VerticalViewPager.SavedState.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, com.taobao.tao.combo.ui.VerticalViewPager$SavedState] */
                @Override // android.support.v4.os.ParcelableCompatCreatorCallbacks
                /* renamed from: createFromParcel */
                public /* synthetic */ SavedState mo1563createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? ipChange.ipc$dispatch("fcd477bf", new Object[]{this, parcel, classLoader}) : a(parcel, classLoader);
                }

                /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object[], com.taobao.tao.combo.ui.VerticalViewPager$SavedState[]] */
                @Override // android.support.v4.os.ParcelableCompatCreatorCallbacks
                /* renamed from: newArray */
                public /* synthetic */ SavedState[] mo1564newArray(int i) {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? (Object[]) ipChange.ipc$dispatch("aaa7de04", new Object[]{this, new Integer(i)}) : a(i);
                }

                public SavedState a(Parcel parcel, ClassLoader classLoader) {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? (SavedState) ipChange.ipc$dispatch("ff0051e0", new Object[]{this, parcel, classLoader}) : new SavedState(parcel, classLoader);
                }

                public SavedState[] a(int i) {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? (SavedState[]) ipChange.ipc$dispatch("29acd00f", new Object[]{this, new Integer(i)}) : new SavedState[i];
                }
            });
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel);
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
        com.taobao.tao.combo.ui.d dVar = this.mAdapter;
        if (dVar != null) {
            savedState.adapterState = dVar.b();
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
            if (this.mAdapter != null) {
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
        layoutParams2.f19891a |= view instanceof a;
        if (this.mInLayout) {
            if (layoutParams2.f19891a) {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
            addViewInLayout(view, i, layoutParams);
            view.measure(this.mChildWidthMeasureSpec, this.mChildHeightMeasureSpec);
            return;
        }
        super.addView(view, i, layoutParams);
    }

    public b infoForChild(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("9492a9cf", new Object[]{this, view});
        }
        for (int i = 0; i < this.mItems.size(); i++) {
            b bVar = this.mItems.get(i);
            if (this.mAdapter.a(view, bVar.f19892a)) {
                return bVar;
            }
        }
        return null;
    }

    public b infoForAnyChild(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("338c545", new Object[]{this, view});
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
        LayoutParams layoutParams2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        setMeasuredDimension(getDefaultSize(0, i), getDefaultSize(0, i2));
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i3 = measuredHeight;
        int i4 = measuredWidth;
        int i5 = 0;
        while (true) {
            int i6 = 1073741824;
            if (i5 >= childCount) {
                break;
            }
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8 && (layoutParams2 = (LayoutParams) childAt.getLayoutParams()) != null && layoutParams2.f19891a) {
                int i7 = layoutParams2.b & 7;
                int i8 = layoutParams2.b & 112;
                String str = "gravity: " + layoutParams2.b + " hgrav: " + i7 + " vgrav: " + i8;
                boolean z = i8 == 48 || i8 == 80;
                boolean z2 = i7 == 3 || i7 == 5;
                int i9 = Integer.MIN_VALUE;
                if (z) {
                    i6 = Integer.MIN_VALUE;
                    i9 = 1073741824;
                } else if (!z2) {
                    i6 = Integer.MIN_VALUE;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i4, i9), View.MeasureSpec.makeMeasureSpec(i3, i6));
                if (z) {
                    i3 -= childAt.getMeasuredHeight();
                } else if (z2) {
                    i4 -= childAt.getMeasuredWidth();
                }
            }
            i5++;
        }
        this.mChildWidthMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        this.mChildHeightMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        this.mInLayout = true;
        populate();
        this.mInLayout = false;
        int childCount2 = getChildCount();
        for (int i10 = 0; i10 < childCount2; i10++) {
            View childAt2 = getChildAt(i10);
            if (childAt2.getVisibility() != 8 && ((layoutParams = (LayoutParams) childAt2.getLayoutParams()) == null || !layoutParams.f19891a)) {
                childAt2.measure(this.mChildWidthMeasureSpec, this.mChildHeightMeasureSpec);
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
        if (i2 == i4) {
            return;
        }
        int i5 = this.mPageMargin;
        recomputeScrollPosition(i2, i4, i5, i5);
    }

    private void recomputeScrollPosition(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30b766a1", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        int i5 = i + i3;
        if (i2 > 0) {
            int scrollY = getScrollY();
            int i6 = i2 + i4;
            int i7 = (int) (((scrollY / i6) + ((scrollY % i6) / i6)) * i5);
            scrollTo(getScrollX(), i7);
            if (this.mScroller.isFinished()) {
                return;
            }
            this.mScroller.startScroll(0, i7, this.mCurItem * i5, 0, this.mScroller.getDuration() - this.mScroller.timePassed());
            return;
        }
        int i8 = this.mCurItem * i5;
        if (i8 == getScrollY()) {
            return;
        }
        completeScroll();
        scrollTo(getScrollX(), i8);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e4  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 313
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.combo.ui.VerticalViewPager.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    public void computeScroll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cab3086b", new Object[]{this});
        } else if (!this.mScroller.isFinished() && this.mScroller.computeScrollOffset()) {
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int currX = this.mScroller.getCurrX();
            int currY = this.mScroller.getCurrY();
            if (scrollX != currX || scrollY != currY) {
                scrollTo(currX, currY);
                pageScrolled(currY);
            }
            invalidate();
        } else {
            completeScroll();
        }
    }

    private void pageScrolled(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a2f7461", new Object[]{this, new Integer(i)});
            return;
        }
        int height = getHeight() + this.mPageMargin;
        int i2 = i / height;
        int i3 = i % height;
        this.mCalledSuper = false;
        onPageScrolled(i2, i3 / height, i3);
        if (!this.mCalledSuper) {
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onPageScrolled(int r13, float r14, int r15) {
        /*
            r12 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.tao.combo.ui.VerticalViewPager.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 2
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L2a
            r1 = 4
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r12
            java.lang.Integer r3 = new java.lang.Integer
            r3.<init>(r13)
            r1[r4] = r3
            java.lang.Float r13 = new java.lang.Float
            r13.<init>(r14)
            r1[r2] = r13
            r13 = 3
            java.lang.Integer r14 = new java.lang.Integer
            r14.<init>(r15)
            r1[r13] = r14
            java.lang.String r13 = "f4c13b05"
            r0.ipc$dispatch(r13, r1)
            return
        L2a:
            int r0 = r12.mDecorChildCount
            if (r0 <= 0) goto L92
            int r0 = r12.getScrollY()
            int r1 = r12.getPaddingTop()
            int r5 = r12.getPaddingBottom()
            int r6 = r12.getHeight()
            int r7 = r12.getChildCount()
        L42:
            if (r3 >= r7) goto L92
            android.view.View r8 = r12.getChildAt(r3)
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            com.taobao.tao.combo.ui.VerticalViewPager$LayoutParams r9 = (com.taobao.tao.combo.ui.VerticalViewPager.LayoutParams) r9
            boolean r10 = r9.f19891a
            if (r10 == 0) goto L8f
            int r9 = r9.b
            r9 = r9 & 112(0x70, float:1.57E-43)
            if (r9 == r4) goto L75
            r10 = 48
            if (r9 == r10) goto L6f
            r10 = 80
            if (r9 == r10) goto L62
            r9 = r1
            goto L83
        L62:
            int r9 = r6 - r5
            int r10 = r8.getMeasuredHeight()
            int r9 = r9 - r10
            int r10 = r8.getMeasuredHeight()
            int r5 = r5 + r10
            goto L80
        L6f:
            int r9 = r8.getHeight()
            int r9 = r9 + r1
            goto L83
        L75:
            int r9 = r8.getMeasuredHeight()
            int r9 = r6 - r9
            int r9 = r9 / r2
            int r9 = java.lang.Math.max(r9, r1)
        L80:
            r11 = r9
            r9 = r1
            r1 = r11
        L83:
            int r1 = r1 + r0
            int r10 = r8.getTop()
            int r1 = r1 - r10
            if (r1 == 0) goto L8e
            r8.offsetTopAndBottom(r1)
        L8e:
            r1 = r9
        L8f:
            int r3 = r3 + 1
            goto L42
        L92:
            com.taobao.tao.combo.ui.VerticalViewPager$d r0 = r12.mOnPageChangeListener
            if (r0 == 0) goto L99
            r0.onPageScrolled(r13, r14, r15)
        L99:
            com.taobao.tao.combo.ui.VerticalViewPager$d r0 = r12.mInternalPageChangeListener
            if (r0 == 0) goto La0
            r0.onPageScrolled(r13, r14, r15)
        La0:
            r12.mCalledSuper = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.combo.ui.VerticalViewPager.onPageScrolled(int, float, int):void");
    }

    private void completeScroll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71dad6ed", new Object[]{this});
            return;
        }
        boolean z = this.mScrolling;
        if (z) {
            setScrollingCacheEnabled(false);
            this.mScroller.abortAnimation();
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int currX = this.mScroller.getCurrX();
            int currY = this.mScroller.getCurrY();
            if (scrollX != currX || scrollY != currY) {
                scrollTo(currX, currY);
            }
            setScrollState(0);
        }
        this.mPopulatePending = false;
        this.mScrolling = false;
        boolean z2 = z;
        for (int i = 0; i < this.mItems.size(); i++) {
            b bVar = this.mItems.get(i);
            if (bVar.c) {
                bVar.c = false;
                z2 = true;
            }
        }
        if (!z2) {
            return;
        }
        populate();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            this.mIsBeingDragged = false;
            this.mIsUnableToDrag = false;
            this.mActivePointerId = -1;
            VelocityTracker velocityTracker = this.mVelocityTracker;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.mVelocityTracker = null;
            }
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
            this.mLastMotionX = motionEvent.getX();
            float y = motionEvent.getY();
            this.mInitialMotionY = y;
            this.mLastMotionY = y;
            this.mActivePointerId = MotionEventCompat.getPointerId(motionEvent, 0);
            if (this.mScrollState == 2) {
                this.mIsBeingDragged = true;
                this.mIsUnableToDrag = false;
                setScrollState(1);
            } else {
                completeScroll();
                this.mIsBeingDragged = false;
                this.mIsUnableToDrag = false;
            }
        } else if (action == 2) {
            int i = this.mActivePointerId;
            if (i != -1) {
                int findPointerIndex = MotionEventCompat.findPointerIndex(motionEvent, i);
                float x = MotionEventCompat.getX(motionEvent, findPointerIndex);
                float abs = Math.abs(x - this.mLastMotionX);
                float y2 = MotionEventCompat.getY(motionEvent, findPointerIndex);
                float f2 = y2 - this.mLastMotionY;
                float abs2 = Math.abs(f2);
                if (canScroll(this, false, (int) f2, (int) x, (int) y2)) {
                    this.mLastMotionY = y2;
                    this.mInitialMotionY = y2;
                    this.mLastMotionX = x;
                    return false;
                } else if (abs2 > this.mTouchSlop && abs2 > abs) {
                    this.mIsBeingDragged = true;
                    setScrollState(1);
                    this.mLastMotionY = y2;
                    setScrollingCacheEnabled(true);
                } else if (abs > this.mTouchSlop) {
                    this.mIsUnableToDrag = true;
                }
            }
        } else if (action == 6) {
            onSecondaryPointerUp(motionEvent);
        }
        if (!this.mIsBeingDragged) {
            if (this.mVelocityTracker == null) {
                this.mVelocityTracker = VelocityTracker.obtain();
            }
            this.mVelocityTracker.addMovement(motionEvent);
        }
        return this.mIsBeingDragged;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        com.taobao.tao.combo.ui.d dVar;
        int scrollY;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        if (this.mFakeDragging) {
            return true;
        }
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (dVar = this.mAdapter) == null || dVar.a() == 0) {
            return false;
        }
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            completeScroll();
            float y = motionEvent.getY();
            this.mInitialMotionY = y;
            this.mLastMotionY = y;
            this.mActivePointerId = MotionEventCompat.getPointerId(motionEvent, 0);
        } else if (action != 1) {
            if (action == 2) {
                try {
                    if (!this.mIsBeingDragged) {
                        int findPointerIndex = MotionEventCompat.findPointerIndex(motionEvent, this.mActivePointerId);
                        if (findPointerIndex != -1) {
                            float abs = Math.abs(MotionEventCompat.getX(motionEvent, findPointerIndex) - this.mLastMotionX);
                            float y2 = MotionEventCompat.getY(motionEvent, findPointerIndex);
                            float abs2 = Math.abs(y2 - this.mLastMotionY);
                            if (abs2 > this.mTouchSlop && abs2 > abs) {
                                this.mIsBeingDragged = true;
                                this.mLastMotionY = y2;
                                setScrollState(1);
                                setScrollingCacheEnabled(true);
                            }
                        }
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                if (this.mIsBeingDragged) {
                    float y3 = MotionEventCompat.getY(motionEvent, MotionEventCompat.findPointerIndex(motionEvent, this.mActivePointerId));
                    float f2 = this.mLastMotionY - y3;
                    this.mLastMotionY = y3;
                    float scrollY2 = getScrollY() + f2;
                    int height = getHeight() + this.mPageMargin;
                    float max = Math.max(0, (this.mCurItem - 1) * height);
                    float min = Math.min(this.mCurItem + 1, this.mAdapter.a() - 1) * height;
                    if (scrollY2 < max) {
                        scrollY2 = max;
                    } else if (scrollY2 > min) {
                        scrollY2 = min;
                    }
                    int i = (int) scrollY2;
                    this.mLastMotionY += scrollY2 - i;
                    scrollTo(getScrollX(), i);
                    pageScrolled(i);
                }
            } else if (action != 3) {
                if (action == 5) {
                    int actionIndex = MotionEventCompat.getActionIndex(motionEvent);
                    this.mLastMotionY = MotionEventCompat.getY(motionEvent, actionIndex);
                    this.mActivePointerId = MotionEventCompat.getPointerId(motionEvent, actionIndex);
                } else if (action == 6) {
                    onSecondaryPointerUp(motionEvent);
                    this.mLastMotionY = MotionEventCompat.getY(motionEvent, MotionEventCompat.findPointerIndex(motionEvent, this.mActivePointerId));
                }
            } else if (this.mIsBeingDragged) {
                setCurrentItemInternal(this.mCurItem, true, true);
                this.mActivePointerId = -1;
                endDrag();
            }
        } else if (this.mIsBeingDragged) {
            VelocityTracker velocityTracker = this.mVelocityTracker;
            velocityTracker.computeCurrentVelocity(1000, this.mMaximumVelocity);
            int yVelocity = (int) VelocityTrackerCompat.getYVelocity(velocityTracker, this.mActivePointerId);
            this.mPopulatePending = true;
            int height2 = getHeight() + this.mPageMargin;
            setCurrentItemInternal(determineTargetPage(getScrollY() / height2, (scrollY % height2) / height2, yVelocity, (int) (MotionEventCompat.getY(motionEvent, MotionEventCompat.findPointerIndex(motionEvent, this.mActivePointerId)) - this.mInitialMotionY)), true, true, yVelocity);
            this.mActivePointerId = -1;
            endDrag();
        }
        return true;
    }

    private int determineTargetPage(int i, float f2, int i2, int i3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7c7b8caa", new Object[]{this, new Integer(i), new Float(f2), new Integer(i2), new Integer(i3)})).intValue() : (Math.abs(i3) <= this.mFlingDistance || Math.abs(i2) <= this.mMinimumVelocity) ? (int) (i + f2 + 0.5f) : i2 > 0 ? i : i + 1;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        super.onDraw(canvas);
        if (this.mPageMargin <= 0 || this.mMarginDrawable == null) {
            return;
        }
        int scrollY = getScrollY();
        int height = getHeight();
        int i = this.mPageMargin;
        int i2 = scrollY % (height + i);
        if (i2 == 0) {
            return;
        }
        int i3 = (scrollY - i2) + height;
        this.mMarginDrawable.setBounds(this.mLeftPageBounds, i3, this.mRightPageBounds, i + i3);
        this.mMarginDrawable.draw(canvas);
    }

    public boolean beginFakeDrag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("17aa257d", new Object[]{this})).booleanValue();
        }
        if (this.mIsBeingDragged) {
            return false;
        }
        this.mFakeDragging = true;
        setScrollState(1);
        this.mLastMotionY = 0.0f;
        this.mInitialMotionY = 0.0f;
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, 0.0f, 0.0f, 0);
        this.mVelocityTracker.addMovement(obtain);
        obtain.recycle();
        this.mFakeDragBeginTime = uptimeMillis;
        return true;
    }

    public void endFakeDrag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c967aab", new Object[]{this});
        } else if (!this.mFakeDragging) {
            throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
        } else {
            VelocityTracker velocityTracker = this.mVelocityTracker;
            velocityTracker.computeCurrentVelocity(1000, this.mMaximumVelocity);
            int xVelocity = (int) VelocityTrackerCompat.getXVelocity(velocityTracker, this.mActivePointerId);
            this.mPopulatePending = true;
            int scrollY = getScrollY();
            int height = getHeight() + this.mPageMargin;
            setCurrentItemInternal(determineTargetPage(scrollY / height, (scrollY % height) / height, xVelocity, (int) (this.mLastMotionY - this.mInitialMotionY)), true, true, xVelocity);
            endDrag();
            this.mFakeDragging = false;
        }
    }

    public void fakeDragBy(float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfbbc7b9", new Object[]{this, new Float(f2)});
        } else if (!this.mFakeDragging) {
            throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
        } else {
            this.mLastMotionY += f2;
            float scrollY = getScrollY() - f2;
            int height = getHeight() + this.mPageMargin;
            float max = Math.max(0, (this.mCurItem - 1) * height);
            float min = Math.min(this.mCurItem + 1, this.mAdapter.a() - 1) * height;
            if (scrollY < max) {
                min = max;
            } else if (scrollY <= min) {
                min = scrollY;
            }
            int i = (int) min;
            this.mLastMotionY += min - i;
            scrollTo(getScrollX(), i);
            pageScrolled(i);
            MotionEvent obtain = MotionEvent.obtain(this.mFakeDragBeginTime, SystemClock.uptimeMillis(), 2, 0.0f, this.mLastMotionY, 0);
            this.mVelocityTracker.addMovement(obtain);
            obtain.recycle();
        }
    }

    public boolean isFakeDragging() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e770b399", new Object[]{this})).booleanValue() : this.mFakeDragging;
    }

    private void onSecondaryPointerUp(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        int i = 1;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f24b537f", new Object[]{this, motionEvent});
            return;
        }
        int actionIndex = MotionEventCompat.getActionIndex(motionEvent);
        if (MotionEventCompat.getPointerId(motionEvent, actionIndex) != this.mActivePointerId) {
            return;
        }
        if (actionIndex != 0) {
            i = 0;
        }
        this.mLastMotionY = MotionEventCompat.getY(motionEvent, i);
        this.mActivePointerId = MotionEventCompat.getPointerId(motionEvent, i);
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

    private void setScrollingCacheEnabled(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d4a4dbb", new Object[]{this, new Boolean(z)});
        } else if (this.mScrollingCacheEnabled == z) {
        } else {
            this.mScrollingCacheEnabled = z;
        }
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
        return z && ViewCompat.canScrollVertically(view, -i);
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
        if (keyCode == 19) {
            return arrowScroll(33);
        }
        if (keyCode == 20) {
            return arrowScroll(130);
        }
        if (keyCode != 61 || Build.VERSION.SDK_INT < 11) {
            return false;
        }
        if (KeyEventCompat.hasNoModifiers(keyEvent)) {
            return arrowScroll(2);
        }
        if (!KeyEventCompat.hasModifiers(keyEvent, 1)) {
            return false;
        }
        return arrowScroll(1);
    }

    public boolean arrowScroll(int i) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ead254ea", new Object[]{this, new Integer(i)})).booleanValue();
        }
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i);
        if (findNextFocus == null || findNextFocus == findFocus) {
            if (i == 33 || i == 1) {
                z = pageUp();
            } else if (i == 130 || i == 2) {
                z = pageDown();
            }
        } else if (i == 33) {
            if (findFocus != null && findNextFocus.getTop() >= findFocus.getTop()) {
                z = pageUp();
            } else {
                z = findNextFocus.requestFocus();
            }
        } else if (i == 130) {
            if (findFocus != null && findNextFocus.getTop() <= findFocus.getTop()) {
                z = pageDown();
            } else {
                z = findNextFocus.requestFocus();
            }
        }
        if (z) {
            playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i));
        }
        return z;
    }

    public boolean pageUp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4fc9b515", new Object[]{this})).booleanValue();
        }
        int i = this.mCurItem;
        if (i <= 0) {
            return false;
        }
        setCurrentItem(i - 1, true);
        return true;
    }

    public boolean pageDown() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e9c44fdc", new Object[]{this})).booleanValue();
        }
        com.taobao.tao.combo.ui.d dVar = this.mAdapter;
        if (dVar == null || this.mCurItem >= dVar.a() - 1) {
            return false;
        }
        setCurrentItem(this.mCurItem + 1, true);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        b infoForChild;
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
        if ((i2 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
            return;
        }
        arrayList.add(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(ArrayList<View> arrayList) {
        b infoForChild;
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
        b infoForChild;
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
        b infoForChild;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bbbb6bb7", new Object[]{this, accessibilityEvent})).booleanValue();
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
        return ipChange instanceof IpChange ? (ViewGroup.LayoutParams) ipChange.ipc$dispatch("84bf71af", new Object[]{this, attributeSet}) : new LayoutParams(getContext(), attributeSet);
    }

    /* loaded from: classes8.dex */
    public class e extends DataSetObserver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(600477507);
        }

        private e() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ba16f5dc", new Object[]{this});
            } else {
                VerticalViewPager.this.dataSetChanged();
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("61d25eb1", new Object[]{this});
            } else {
                VerticalViewPager.this.dataSetChanged();
            }
        }
    }

    /* loaded from: classes8.dex */
    public static class LayoutParams extends ViewGroup.LayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public boolean f19891a;
        public int b;

        static {
            kge.a(-1199938426);
        }

        public LayoutParams() {
            super(-1, -1);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, VerticalViewPager.access$100());
            this.b = obtainStyledAttributes.getInteger(0, 0);
            obtainStyledAttributes.recycle();
        }
    }
}
