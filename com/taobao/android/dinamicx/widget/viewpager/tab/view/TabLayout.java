package com.taobao.android.dinamicx.widget.viewpager.tab.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v4.util.Pools;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.PointerIconCompat;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.view.animation.FastOutLinearInInterpolator;
import android.support.v4.view.animation.FastOutSlowInInterpolator;
import android.support.v4.view.animation.LinearOutSlowInInterpolator;
import android.support.v4.widget.TextViewCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.TooltipCompat;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.view.DXNativeViewPagerView;
import com.taobao.taobao.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import tb.fqi;
import tb.kge;

/* loaded from: classes5.dex */
public class TabLayout extends HorizontalScrollView {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int ANIMATION_DURATION = 300;
    public static final Interpolator DECELERATE_INTERPOLATOR;
    public static final int DEFAULT_GAP_TEXT_ICON = 8;
    private static final int DEFAULT_HEIGHT = 48;
    private static final int DEFAULT_HEIGHT_WITH_TEXT_ICON = 72;
    public static final int DEFAULT_INDICATOR_Z_INDEX = 1;
    public static final Interpolator FAST_OUT_LINEAR_IN_INTERPOLATOR;
    public static final Interpolator FAST_OUT_SLOW_IN_INTERPOLATOR;
    public static final int FIXED_WRAP_GUTTER_MIN = 16;
    public static final int GRAVITY_CENTER = 1;
    public static final int GRAVITY_FILL = 0;
    private static final int INVALID_WIDTH = -1;
    public static final Interpolator LINEAR_INTERPOLATOR;
    public static final Interpolator LINEAR_OUT_SLOW_IN_INTERPOLATOR;
    public static final int MODE_FIXED = 1;
    public static final int MODE_SCROLLABLE = 0;
    public static final int MOTION_NON_ADJACENT_OFFSET = 24;
    private static final int TAB_MIN_WIDTH_MARGIN = 56;
    private static final Pools.Pool<e> sTabPool;
    private a mAdapterChangeListener;
    private int mContentInsetStart;
    private c mCurrentVpSelectedListener;
    public int mMode;
    private final ArrayList<b> mOnTabClickListeners;
    private f mPageChangeListener;
    private PagerAdapter mPagerAdapter;
    private DataSetObserver mPagerAdapterObserver;
    private int mRequestedTabMaxWidth;
    private int mRequestedTabMinWidth;
    private boolean mReselectAnimated;
    private ValueAnimator mScrollAnimator;
    private int mScrollableTabMinWidth;
    private c mSelectedListener;
    private final ArrayList<c> mSelectedListeners;
    private e mSelectedTab;
    private boolean mSetupViewPagerImplicitly;
    public int mTabGravity;
    public int mTabMaxWidth;
    public int mTabPaddingBottom;
    public int mTabPaddingEnd;
    public int mTabPaddingStart;
    public int mTabPaddingTop;
    private final SlidingTabStrip mTabStrip;
    public int mTabTextAppearance;
    public ColorStateList mTabTextColors;
    public float mTabTextMultiLineSize;
    public float mTabTextSize;
    private final Pools.Pool<TabView> mTabViewPool;
    private final ArrayList<e> mTabs;
    public ViewPager mViewPager;
    public boolean mViewPagerSmoothScroll;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes5.dex */
    public @interface Mode {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes5.dex */
    public @interface TabGravity {
    }

    /* loaded from: classes5.dex */
    public @interface TabSelectedIndexChangeType {
        public static final int AUTO_SELECT_SET = 1;
        public static final int IDLE = 0;
        public static final int SCROLL = 2;
        public static final int TAP = 3;
    }

    /* loaded from: classes5.dex */
    public interface b {
        void a(e eVar);
    }

    /* loaded from: classes5.dex */
    public interface c {
        void a(e eVar);

        void a(e eVar, int i);

        void b(e eVar, int i);
    }

    public static /* synthetic */ Object ipc$super(TabLayout tabLayout, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -244855388:
                super.onLayout(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
                return null;
            case 650865254:
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 949399698:
                super.onDetachedFromWindow();
                return null;
            case 1626033557:
                super.onAttachedToWindow();
                return null;
            case 1992612095:
                super.addView((View) objArr[0], ((Number) objArr[1]).intValue(), (ViewGroup.LayoutParams) objArr[2]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    static {
        kge.a(-183137672);
        LINEAR_INTERPOLATOR = new LinearInterpolator();
        FAST_OUT_SLOW_IN_INTERPOLATOR = new FastOutSlowInInterpolator();
        FAST_OUT_LINEAR_IN_INTERPOLATOR = new FastOutLinearInInterpolator();
        LINEAR_OUT_SLOW_IN_INTERPOLATOR = new LinearOutSlowInInterpolator();
        DECELERATE_INTERPOLATOR = new DecelerateInterpolator();
        sTabPool = new Pools.SynchronizedPool(16);
    }

    public TabLayout(Context context) {
        this(context, null);
    }

    public TabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TabLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mTabs = new ArrayList<>();
        this.mTabMaxWidth = Integer.MAX_VALUE;
        this.mRequestedTabMinWidth = -1;
        this.mRequestedTabMaxWidth = -1;
        this.mTabGravity = 0;
        this.mMode = 1;
        this.mOnTabClickListeners = new ArrayList<>();
        this.mSelectedListeners = new ArrayList<>();
        this.mReselectAnimated = true;
        this.mTabViewPool = new Pools.SimplePool(12);
        setHorizontalScrollBarEnabled(false);
        this.mTabStrip = new SlidingTabStrip(context);
        super.addView(this.mTabStrip, 0, new FrameLayout.LayoutParams(-2, -1));
        Resources resources = getResources();
        this.mTabTextMultiLineSize = resources.getDimensionPixelSize(R.dimen.design_tab_text_size_2line);
        this.mScrollableTabMinWidth = resources.getDimensionPixelSize(R.dimen.design_tab_scrollable_min_width);
        applyModeAndGravity();
    }

    public void setSelectedTabIndicatorColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13e50f0", new Object[]{this, new Integer(i)});
        } else {
            this.mTabStrip.setSelectedIndicatorColor(i);
        }
    }

    public void setSelectedTabIndicatorHeight(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef09165e", new Object[]{this, new Integer(i)});
        } else {
            this.mTabStrip.setSelectedIndicatorHeight(i);
        }
    }

    public void setSelectedTabIndicatorWidth(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55c5d86d", new Object[]{this, new Integer(i)});
        } else {
            this.mTabStrip.setSelectedIndicatorWidth(i);
        }
    }

    public void setSelectedTabIndicatorRadius(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("873aa5d3", new Object[]{this, new Integer(i)});
        } else {
            this.mTabStrip.setSelectedTabIndicatorRadius(i);
        }
    }

    public void setSelectedTabIndicatorBottomGap(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bcfe128", new Object[]{this, new Integer(i)});
        } else {
            this.mTabStrip.setSelectedTabIndicatorBottomGap(i);
        }
    }

    public void setSelectedTabIndicatorZIndex(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4e89dad", new Object[]{this, new Integer(i)});
        } else {
            this.mTabStrip.setSelectedTabIndicatorZIndex(i);
        }
    }

    public void setScrollPosition(int i, float f2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cac71458", new Object[]{this, new Integer(i), new Float(f2), new Boolean(z)});
        } else {
            setScrollPosition(i, f2, z, true);
        }
    }

    public void setScrollPosition(int i, float f2, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e1c297c", new Object[]{this, new Integer(i), new Float(f2), new Boolean(z), new Boolean(z2)});
        } else {
            setScrollPosition(i, f2, z, z2, false, false);
        }
    }

    public void setScrollPosition(int i, float f2, boolean z, boolean z2, boolean z3, boolean z4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77ce14fc", new Object[]{this, new Integer(i), new Float(f2), new Boolean(z), new Boolean(z2), new Boolean(z3), new Boolean(z4)});
            return;
        }
        int round = Math.round(i + f2);
        if (z3 && round != getSelectedTabPosition()) {
            round = getSelectedTabPosition();
        }
        if (round < 0 || round >= this.mTabStrip.getChildCount()) {
            return;
        }
        if (z2) {
            this.mTabStrip.setIndicatorPositionFromTabPosition(i, f2);
        }
        ValueAnimator valueAnimator = this.mScrollAnimator;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.mScrollAnimator.cancel();
        }
        int scrollX = getScrollX();
        int calculateScrollXForTab = calculateScrollXForTab(i, f2);
        if (!z4) {
            scrollTo(calculateScrollXForTab(i, f2), 0);
        } else if (scrollX != calculateScrollXForTab) {
            ensureScrollAnimator();
            this.mScrollAnimator.setIntValues(scrollX, calculateScrollXForTab);
            this.mScrollAnimator.start();
        }
        if (!z) {
            return;
        }
        setSelectedTabView(round);
    }

    private float getScrollPosition() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f0463283", new Object[]{this})).floatValue() : this.mTabStrip.getIndicatorPosition();
    }

    public void addTab(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd62220d", new Object[]{this, eVar});
        } else {
            addTab(eVar, this.mTabs.isEmpty());
        }
    }

    public void addTab(e eVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cee29296", new Object[]{this, eVar, new Integer(i)});
        } else {
            addTab(eVar, i, this.mTabs.isEmpty());
        }
    }

    public void addTab(e eVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cee2d267", new Object[]{this, eVar, new Boolean(z)});
        } else {
            addTab(eVar, this.mTabs.size(), z);
        }
    }

    public void addTab(e eVar, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7072fe", new Object[]{this, eVar, new Integer(i), new Boolean(z)});
        } else if (eVar.f12206a != this) {
            throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
        } else {
            configureTab(eVar, i);
            addTabView(eVar);
            if (!z) {
                return;
            }
            eVar.b(false);
        }
    }

    private void addTabFromItemView(TabItem tabItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cae2dbe3", new Object[]{this, tabItem});
            return;
        }
        e newTab = newTab();
        if (tabItem.mText != null) {
            newTab.a(tabItem.mText);
        }
        if (tabItem.mIcon != null) {
            newTab.a(tabItem.mIcon);
        }
        if (tabItem.mCustomLayout != 0) {
            newTab.a(tabItem.mCustomLayout);
        }
        if (!TextUtils.isEmpty(tabItem.getContentDescription())) {
            newTab.b(tabItem.getContentDescription());
        }
        addTab(newTab);
    }

    public void addOnTabSelectedListener(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62d542df", new Object[]{this, cVar});
        } else if (this.mSelectedListeners.contains(cVar)) {
        } else {
            this.mSelectedListeners.add(cVar);
        }
    }

    public void addOnTabClickListener(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9513d7d", new Object[]{this, bVar});
        } else if (this.mOnTabClickListeners.contains(bVar)) {
        } else {
            this.mOnTabClickListeners.add(bVar);
        }
    }

    public void removeOnTabSelectedListener(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35754842", new Object[]{this, cVar});
        } else {
            this.mSelectedListeners.remove(cVar);
        }
    }

    public void removeOnTabClickListener(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c46eeafa", new Object[]{this, bVar});
        } else {
            this.mOnTabClickListeners.remove(bVar);
        }
    }

    public void clearOnTabSelectedListeners() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("502e6102", new Object[]{this});
        } else {
            this.mSelectedListeners.clear();
        }
    }

    public void clearOnTabClickListeners() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27ceb567", new Object[]{this});
        } else {
            this.mOnTabClickListeners.clear();
        }
    }

    public e newTab() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("a6fc6574", new Object[]{this});
        }
        e acquire = sTabPool.acquire();
        if (acquire == null) {
            acquire = new e();
        }
        acquire.f12206a = this;
        acquire.b = createTabView(acquire);
        return acquire;
    }

    public int getTabCount() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9428606a", new Object[]{this})).intValue() : this.mTabs.size();
    }

    public e getTabAt(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("9a3857c2", new Object[]{this, new Integer(i)});
        }
        if (i >= 0 && i < getTabCount()) {
            return this.mTabs.get(i);
        }
        return null;
    }

    public int getSelectedTabPosition() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e05b0107", new Object[]{this})).intValue();
        }
        e eVar = this.mSelectedTab;
        if (eVar == null) {
            return -1;
        }
        return eVar.c();
    }

    public void removeTab(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1110ca30", new Object[]{this, eVar});
        } else if (eVar.f12206a != this) {
            throw new IllegalArgumentException("Tab does not belong to this TabLayout.");
        } else {
            removeTabAt(eVar.c());
        }
    }

    public void removeTabAt(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("181e3158", new Object[]{this, new Integer(i)});
            return;
        }
        e eVar = this.mSelectedTab;
        int c2 = eVar != null ? eVar.c() : 0;
        removeTabViewAt(i);
        e remove = this.mTabs.remove(i);
        if (remove != null) {
            remove.j();
            sTabPool.release(remove);
        }
        int size = this.mTabs.size();
        for (int i2 = i; i2 < size; i2++) {
            this.mTabs.get(i2).b(i2);
        }
        if (c2 != i) {
            return;
        }
        e eVar2 = this.mTabs.isEmpty() ? null : this.mTabs.get(Math.max(0, i - 1));
        if (eVar2 != null) {
            eVar2.a(false);
        }
        selectTab(eVar2);
    }

    public void removeAllTabs() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4df36aa2", new Object[]{this});
            return;
        }
        for (int childCount = this.mTabStrip.getChildCount() - 1; childCount >= 0; childCount--) {
            removeTabViewAt(childCount);
        }
        Iterator<e> it = this.mTabs.iterator();
        while (it.hasNext()) {
            e next = it.next();
            it.remove();
            next.j();
            sTabPool.release(next);
        }
        this.mSelectedTab = null;
    }

    public void setViewPagerSmoothScroll(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2056e776", new Object[]{this, new Boolean(z)});
        } else {
            this.mViewPagerSmoothScroll = z;
        }
    }

    public void setTabMode(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe9b7906", new Object[]{this, new Integer(i)});
        } else if (i == this.mMode) {
        } else {
            this.mMode = i;
            applyModeAndGravity();
        }
    }

    public int getTabMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("82553a1c", new Object[]{this})).intValue() : this.mMode;
    }

    public void setTabGravity(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72161541", new Object[]{this, new Integer(i)});
        } else if (this.mTabGravity == i) {
        } else {
            this.mTabGravity = i;
            applyModeAndGravity();
        }
    }

    public int getTabGravity() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3bb7b5e9", new Object[]{this})).intValue() : this.mTabGravity;
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("256ecb5", new Object[]{this, colorStateList});
        } else if (this.mTabTextColors == colorStateList) {
        } else {
            this.mTabTextColors = colorStateList;
            updateAllTabs();
        }
    }

    public ColorStateList getTabTextColors() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ColorStateList) ipChange.ipc$dispatch("619b6371", new Object[]{this}) : this.mTabTextColors;
    }

    public void setTabTextColors(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e090dc57", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            setTabTextColors(createColorStateList(i, i2));
        }
    }

    public void setupWithViewPager(ViewPager viewPager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33a2c3ba", new Object[]{this, viewPager});
        } else {
            setupWithViewPager(viewPager, true);
        }
    }

    public void setupWithViewPager(ViewPager viewPager, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40b6665a", new Object[]{this, viewPager, new Boolean(z)});
        } else {
            setupWithViewPager(viewPager, z, false);
        }
    }

    private void setupWithViewPager(ViewPager viewPager, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d61717ba", new Object[]{this, viewPager, new Boolean(z), new Boolean(z2)});
            return;
        }
        ViewPager viewPager2 = this.mViewPager;
        if (viewPager2 != null) {
            f fVar = this.mPageChangeListener;
            if (fVar != null) {
                viewPager2.removeOnPageChangeListener(fVar);
            }
            a aVar = this.mAdapterChangeListener;
            if (aVar != null) {
                this.mViewPager.removeOnAdapterChangeListener(aVar);
            }
        }
        c cVar = this.mCurrentVpSelectedListener;
        if (cVar != null) {
            removeOnTabSelectedListener(cVar);
            this.mCurrentVpSelectedListener = null;
        }
        if (viewPager != null) {
            this.mViewPager = viewPager;
            if (this.mPageChangeListener == null) {
                this.mPageChangeListener = new f(this);
            }
            this.mPageChangeListener.a();
            viewPager.addOnPageChangeListener(this.mPageChangeListener);
            this.mCurrentVpSelectedListener = new g(viewPager, this.mViewPagerSmoothScroll);
            addOnTabSelectedListener(this.mCurrentVpSelectedListener);
            PagerAdapter adapter = viewPager.getAdapter();
            if (adapter != null) {
                setPagerAdapter(adapter, z);
            }
            if (this.mAdapterChangeListener == null) {
                this.mAdapterChangeListener = new a();
            }
            this.mAdapterChangeListener.a(z);
            viewPager.addOnAdapterChangeListener(this.mAdapterChangeListener);
            setScrollPosition(viewPager.getCurrentItem(), 0.0f, true);
        } else {
            this.mViewPager = null;
            setPagerAdapter(null, false);
        }
        this.mSetupViewPagerImplicitly = z2;
    }

    @Deprecated
    public void setTabsFromPagerAdapter(PagerAdapter pagerAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3620c327", new Object[]{this, pagerAdapter});
        } else {
            setPagerAdapter(pagerAdapter, false);
        }
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9e4f226", new Object[]{this})).booleanValue() : getTabScrollRange() > 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        if (this.mViewPager != null) {
            return;
        }
        ViewParent parent = getParent();
        if (!(parent instanceof ViewPager)) {
            return;
        }
        setupWithViewPager((ViewPager) parent, true, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        if (!this.mSetupViewPagerImplicitly) {
            return;
        }
        setupWithViewPager(null);
        this.mSetupViewPagerImplicitly = false;
    }

    private int getTabScrollRange() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("40fd048b", new Object[]{this})).intValue() : Math.max(0, ((this.mTabStrip.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    public void setPagerAdapter(PagerAdapter pagerAdapter, boolean z) {
        DataSetObserver dataSetObserver;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a8d9bf5", new Object[]{this, pagerAdapter, new Boolean(z)});
            return;
        }
        PagerAdapter pagerAdapter2 = this.mPagerAdapter;
        if (pagerAdapter2 != null && (dataSetObserver = this.mPagerAdapterObserver) != null) {
            pagerAdapter2.unregisterDataSetObserver(dataSetObserver);
        }
        this.mPagerAdapter = pagerAdapter;
        if (z && pagerAdapter != null) {
            if (this.mPagerAdapterObserver == null) {
                this.mPagerAdapterObserver = new d();
            }
            pagerAdapter.registerDataSetObserver(this.mPagerAdapterObserver);
        }
        populateFromPagerAdapter();
    }

    public void populateFromPagerAdapter() {
        int currentItem;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfd80467", new Object[]{this});
            return;
        }
        removeAllTabs();
        PagerAdapter pagerAdapter = this.mPagerAdapter;
        if (pagerAdapter == null) {
            return;
        }
        int count = pagerAdapter.getCount();
        for (int i = 0; i < count; i++) {
            addTab(newTab().a(this.mPagerAdapter.getPageTitle(i)), false);
        }
        ViewPager viewPager = this.mViewPager;
        if (viewPager == null || count <= 0 || (currentItem = viewPager.getCurrentItem()) == getSelectedTabPosition() || currentItem >= getTabCount()) {
            return;
        }
        e tabAt = getTabAt(currentItem);
        if (tabAt != null) {
            tabAt.a(false);
        }
        selectTab(tabAt);
    }

    private void updateAllTabs() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9157bd3d", new Object[]{this});
            return;
        }
        int size = this.mTabs.size();
        for (int i = 0; i < size; i++) {
            this.mTabs.get(i).i();
        }
    }

    private TabView createTabView(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TabView) ipChange.ipc$dispatch("204efe26", new Object[]{this, eVar});
        }
        Pools.Pool<TabView> pool = this.mTabViewPool;
        TabView acquire = pool != null ? pool.acquire() : null;
        if (acquire == null) {
            acquire = new TabView(getContext());
        }
        acquire.setTab(eVar);
        acquire.setFocusable(true);
        acquire.setLeft(0);
        acquire.setRight(0);
        return acquire;
    }

    private void configureTab(e eVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1afa331", new Object[]{this, eVar, new Integer(i)});
            return;
        }
        eVar.b(i);
        this.mTabs.add(i, eVar);
        int size = this.mTabs.size();
        for (int i2 = i + 1; i2 < size; i2++) {
            this.mTabs.get(i2).b(i2);
        }
    }

    private void addTabView(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3eb6dda8", new Object[]{this, eVar});
        } else {
            this.mTabStrip.addView(eVar.b, eVar.c(), createLayoutParamsForTabs());
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddda6f45", new Object[]{this, view});
        } else {
            addViewInternal(view);
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd73ec5e", new Object[]{this, view, new Integer(i)});
        } else {
            addViewInternal(view);
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a332ea78", new Object[]{this, view, layoutParams});
        } else {
            addViewInternal(view);
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76c4d8ff", new Object[]{this, view, new Integer(i), layoutParams});
        } else {
            addViewInternal(view);
        }
    }

    private void addViewInternal(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("560a61c8", new Object[]{this, view});
        } else if (view instanceof TabItem) {
            addTabFromItemView((TabItem) view);
        } else {
            throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
        }
    }

    private LinearLayout.LayoutParams createLayoutParamsForTabs() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinearLayout.LayoutParams) ipChange.ipc$dispatch("f3a7e4e9", new Object[]{this});
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        updateTabViewLayoutParams(layoutParams);
        return layoutParams;
    }

    private void updateTabViewLayoutParams(LinearLayout.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("221c2bbd", new Object[]{this, layoutParams});
        } else if (this.mMode == 1 && this.mTabGravity == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
        } else {
            layoutParams.width = -2;
            layoutParams.weight = 0.0f;
        }
    }

    public int dpToPx(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("11e1c020", new Object[]{this, new Integer(i)})).intValue() : Math.round(getResources().getDisplayMetrics().density * i);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        int dpToPx = dpToPx(getDefaultHeight()) + getPaddingTop() + getPaddingBottom();
        int mode = View.MeasureSpec.getMode(i2);
        if (mode == Integer.MIN_VALUE) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(dpToPx, View.MeasureSpec.getSize(i2)), 1073741824);
        } else if (mode == 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(dpToPx, 1073741824);
        }
        int size = View.MeasureSpec.getSize(i);
        if (View.MeasureSpec.getMode(i) != 0) {
            int i3 = this.mRequestedTabMaxWidth;
            if (i3 <= 0) {
                i3 = size - dpToPx(56);
            }
            this.mTabMaxWidth = i3;
        }
        super.onMeasure(i, i2);
        if (getChildCount() != 1) {
            return;
        }
        View childAt = getChildAt(0);
        int i4 = this.mMode;
        if (i4 == 0 ? childAt.getMeasuredWidth() < getMeasuredWidth() : !(i4 != 1 || childAt.getMeasuredWidth() == getMeasuredWidth())) {
            z = true;
        }
        if (!z) {
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), getChildMeasureSpec(i2, getPaddingTop() + getPaddingBottom(), childAt.getLayoutParams().height));
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        e eVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        if (this.mMode != 0 || (eVar = this.mSelectedTab) == null || eVar.c() <= 0) {
            return;
        }
        selectTab(this.mSelectedTab);
    }

    private void removeTabViewAt(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ea7b73", new Object[]{this, new Integer(i)});
            return;
        }
        TabView tabView = (TabView) this.mTabStrip.getChildAt(i);
        this.mTabStrip.removeViewAt(i);
        if (tabView != null) {
            tabView.reset();
            this.mTabViewPool.release(tabView);
        }
        requestLayout();
    }

    private void animateToTab(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a91a643", new Object[]{this, new Integer(i)});
        } else if (i == -1) {
        } else {
            if (getWindowToken() == null || !ViewCompat.isLaidOut(this) || this.mTabStrip.childrenNeedLayout()) {
                setScrollPosition(i, 0.0f, true);
                return;
            }
            int scrollX = getScrollX();
            int calculateScrollXForTab = calculateScrollXForTab(i, 0.0f);
            if (scrollX != calculateScrollXForTab) {
                ensureScrollAnimator();
                this.mScrollAnimator.setIntValues(scrollX, calculateScrollXForTab);
                this.mScrollAnimator.start();
            }
            this.mTabStrip.animateIndicatorToPosition(i, 300);
        }
    }

    private void ensureScrollAnimator() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("612c5839", new Object[]{this});
        } else if (this.mScrollAnimator != null) {
        } else {
            this.mScrollAnimator = new ValueAnimator();
            this.mScrollAnimator.setInterpolator(com.taobao.android.dinamicx.widget.viewpager.tab.view.a.f12209a);
            this.mScrollAnimator.setDuration(300L);
            this.mScrollAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.taobao.android.dinamicx.widget.viewpager.tab.view.TabLayout.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                    } else {
                        TabLayout.this.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
                    }
                }
            });
        }
    }

    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a7ad423", new Object[]{this, animatorListener});
            return;
        }
        ensureScrollAnimator();
        this.mScrollAnimator.addListener(animatorListener);
    }

    private void setSelectedTabView(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1085d7f", new Object[]{this, new Integer(i)});
            return;
        }
        int childCount = this.mTabStrip.getChildCount();
        if (i >= childCount) {
            return;
        }
        int i2 = 0;
        while (i2 < childCount) {
            this.mTabStrip.getChildAt(i2).setSelected(i2 == i);
            i2++;
        }
    }

    public void selectTab(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed6e10a8", new Object[]{this, eVar});
        } else {
            selectTab(eVar, true);
        }
    }

    public void selectTab(e eVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c054b72c", new Object[]{this, eVar, new Boolean(z)});
        } else {
            selectTab(eVar, z, true, 0);
        }
    }

    public void onTabClick(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cabdf18f", new Object[]{this, eVar});
            return;
        }
        for (int i = 0; i < this.mOnTabClickListeners.size(); i++) {
            this.mOnTabClickListeners.get(i).a(eVar);
        }
    }

    public void selectTab(e eVar, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a42e128", new Object[]{this, eVar, new Boolean(z), new Boolean(z2)});
        } else {
            selectTab(eVar, z, z2, 0);
        }
    }

    public void selectTab(e eVar, boolean z, boolean z2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe19b6db", new Object[]{this, eVar, new Boolean(z), new Boolean(z2), new Integer(i)});
            return;
        }
        e eVar2 = this.mSelectedTab;
        if (eVar2 == eVar) {
            if (eVar2 == null) {
                return;
            }
            dispatchTabReselected(eVar, i);
            if (this.mReselectAnimated) {
                animateToTab(eVar.c());
                return;
            } else {
                setScrollPosition(eVar.c(), 0.0f, true);
                return;
            }
        }
        int c2 = eVar != null ? eVar.c() : -1;
        if (z) {
            if ((eVar2 == null || eVar2.c() == -1 || !z2) && c2 != -1) {
                setScrollPosition(c2, 0.0f, true);
            } else {
                animateToTab(c2);
            }
            if (c2 != -1) {
                setSelectedTabView(c2);
            }
        }
        if (eVar2 != null) {
            dispatchTabUnselected(eVar2);
        }
        this.mSelectedTab = eVar;
        if (eVar == null) {
            return;
        }
        dispatchTabSelected(eVar, i);
    }

    private void dispatchTabSelected(e eVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4acf85d8", new Object[]{this, eVar, new Integer(i)});
            return;
        }
        for (int size = this.mSelectedListeners.size() - 1; size >= 0; size--) {
            this.mSelectedListeners.get(size).a(eVar, i);
        }
    }

    private void dispatchTabUnselected(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2f7592", new Object[]{this, eVar});
            return;
        }
        for (int size = this.mSelectedListeners.size() - 1; size >= 0; size--) {
            this.mSelectedListeners.get(size).a(eVar);
        }
    }

    private void dispatchTabReselected(e eVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a676b4b", new Object[]{this, eVar, new Integer(i)});
            return;
        }
        for (int size = this.mSelectedListeners.size() - 1; size >= 0; size--) {
            this.mSelectedListeners.get(size).b(eVar, i);
        }
    }

    private int calculateScrollXForTab(int i, float f2) {
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("eb48e268", new Object[]{this, new Integer(i), new Float(f2)})).intValue();
        }
        if (this.mMode != 0) {
            return 0;
        }
        View childAt = this.mTabStrip.getChildAt(i);
        int i3 = i + 1;
        View childAt2 = i3 < this.mTabStrip.getChildCount() ? this.mTabStrip.getChildAt(i3) : null;
        int width = childAt != null ? childAt.getWidth() : 0;
        if (childAt2 != null) {
            i2 = childAt2.getWidth();
        }
        int left = (childAt.getLeft() + (width / 2)) - (getWidth() / 2);
        int i4 = (int) ((width + i2) * 0.5f * f2);
        return ViewCompat.getLayoutDirection(this) == 0 ? left + i4 : left - i4;
    }

    private void applyModeAndGravity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c15fe0f", new Object[]{this});
            return;
        }
        ViewCompat.setPaddingRelative(this.mTabStrip, this.mMode == 0 ? Math.max(0, this.mContentInsetStart - this.mTabPaddingStart) : 0, 0, 0, 0);
        int i = this.mMode;
        if (i == 0) {
            this.mTabStrip.setGravity(GravityCompat.START);
        } else if (i == 1) {
            this.mTabStrip.setGravity(1);
        }
        updateTabViews(true);
    }

    public void updateTabViews(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("348b24ab", new Object[]{this, new Boolean(z)});
            return;
        }
        for (int i = 0; i < this.mTabStrip.getChildCount(); i++) {
            View childAt = this.mTabStrip.getChildAt(i);
            childAt.setMinimumWidth(getTabMinWidth());
            updateTabViewLayoutParams((LinearLayout.LayoutParams) childAt.getLayoutParams());
            if (z) {
                childAt.requestLayout();
            }
        }
    }

    /* loaded from: classes5.dex */
    public static final class e {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final int INVALID_POSITION = -1;

        /* renamed from: a  reason: collision with root package name */
        public TabLayout f12206a;
        public TabView b;
        private Object c;
        private Drawable d;
        private CharSequence e;
        private CharSequence f;
        private int g = -1;
        private View h;
        private boolean i;

        static {
            kge.a(32322377);
        }

        public View a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("195fbaaa", new Object[]{this}) : this.h;
        }

        public e a(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e) ipChange.ipc$dispatch("7fc8e182", new Object[]{this, view});
            }
            this.h = view;
            i();
            return this;
        }

        public e a(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("e4454173", new Object[]{this, new Integer(i)}) : a(LayoutInflater.from(this.b.getContext()).inflate(i, (ViewGroup) this.b, false));
        }

        public Drawable b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Drawable) ipChange.ipc$dispatch("75971531", new Object[]{this}) : this.d;
        }

        public int c() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue() : this.g;
        }

        public void b(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            } else {
                this.g = i;
            }
        }

        public CharSequence d() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (CharSequence) ipChange.ipc$dispatch("a9285c6f", new Object[]{this}) : this.e;
        }

        public e a(Drawable drawable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e) ipChange.ipc$dispatch("54b6e924", new Object[]{this, drawable});
            }
            this.d = drawable;
            i();
            return this;
        }

        public e a(CharSequence charSequence) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e) ipChange.ipc$dispatch("d405a6a4", new Object[]{this, charSequence});
            }
            this.e = charSequence;
            i();
            return this;
        }

        public boolean e() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue() : this.i;
        }

        public void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            } else {
                this.i = z;
            }
        }

        public void b(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            } else if (this.f12206a == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            } else {
                a(z);
                if (z) {
                    this.f12206a.selectTab(this, true, true, 3);
                } else {
                    this.f12206a.selectTab(this);
                }
            }
        }

        public void f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
                return;
            }
            TabLayout tabLayout = this.f12206a;
            if (tabLayout == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            tabLayout.onTabClick(this);
        }

        public boolean g() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue();
            }
            TabLayout tabLayout = this.f12206a;
            if (tabLayout == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            return tabLayout.getSelectedTabPosition() == this.g;
        }

        public e b(CharSequence charSequence) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e) ipChange.ipc$dispatch("fc4be6e5", new Object[]{this, charSequence});
            }
            this.f = charSequence;
            i();
            return this;
        }

        public CharSequence h() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (CharSequence) ipChange.ipc$dispatch("6c6c79eb", new Object[]{this}) : this.f;
        }

        public void i() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5dd2870", new Object[]{this});
                return;
            }
            TabView tabView = this.b;
            if (tabView == null) {
                return;
            }
            tabView.update();
        }

        public void j() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
                return;
            }
            this.f12206a = null;
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = null;
            this.f = null;
            this.g = -1;
            this.h = null;
        }
    }

    /* loaded from: classes5.dex */
    public class TabView extends LinearLayout {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private ImageView mCustomIconView;
        private TextView mCustomTextView;
        private View mCustomView;
        private int mDefaultMaxLines;
        private ImageView mIconView;
        private e mTab;
        private TextView mTextView;

        static {
            kge.a(373888398);
        }

        public static /* synthetic */ Object ipc$super(TabView tabView, String str, Object... objArr) {
            switch (str.hashCode()) {
                case -1540204496:
                    super.setSelected(((Boolean) objArr[0]).booleanValue());
                    return null;
                case -376150200:
                    super.onInitializeAccessibilityEvent((AccessibilityEvent) objArr[0]);
                    return null;
                case 362356466:
                    super.onInitializeAccessibilityNodeInfo((AccessibilityNodeInfo) objArr[0]);
                    return null;
                case 650865254:
                    super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                    return null;
                case 1774009266:
                    return new Boolean(super.performClick());
                default:
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
        }

        public TabView(Context context) {
            super(context);
            this.mDefaultMaxLines = 2;
            ViewCompat.setPaddingRelative(this, TabLayout.this.mTabPaddingStart, TabLayout.this.mTabPaddingTop, TabLayout.this.mTabPaddingEnd, TabLayout.this.mTabPaddingBottom);
            setGravity(17);
            setOrientation(1);
            setClickable(true);
            ViewCompat.setPointerIcon(this, PointerIconCompat.getSystemIcon(getContext(), 1002));
        }

        @Override // android.view.View
        public boolean performClick() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("69bd3bb2", new Object[]{this})).booleanValue();
            }
            boolean performClick = super.performClick();
            if (this.mTab == null) {
                return performClick;
            }
            if (!performClick) {
                playSoundEffect(0);
            }
            this.mTab.f();
            this.mTab.b(true);
            return true;
        }

        @Override // android.view.View
        public void setSelected(boolean z) {
            IpChange ipChange = $ipChange;
            boolean z2 = true;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a4325830", new Object[]{this, new Boolean(z)});
                return;
            }
            if (isSelected() == z) {
                z2 = false;
            }
            super.setSelected(z);
            if (z2 && z && Build.VERSION.SDK_INT < 16) {
                sendAccessibilityEvent(4);
            }
            TextView textView = this.mTextView;
            if (textView != null) {
                textView.setSelected(z);
            }
            ImageView imageView = this.mIconView;
            if (imageView != null) {
                imageView.setSelected(z);
            }
            View view = this.mCustomView;
            if (view == null) {
                return;
            }
            view.setSelected(z);
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e9946748", new Object[]{this, accessibilityEvent});
                return;
            }
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName(ActionBar.b.class.getName());
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15991ef2", new Object[]{this, accessibilityNodeInfo});
                return;
            }
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName(ActionBar.b.class.getName());
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i, int i2) {
            Layout layout;
            IpChange ipChange = $ipChange;
            boolean z = true;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
                return;
            }
            int size = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            int tabMaxWidth = TabLayout.this.getTabMaxWidth();
            if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
                i = View.MeasureSpec.makeMeasureSpec(TabLayout.this.mTabMaxWidth, Integer.MIN_VALUE);
            }
            super.onMeasure(i, i2);
            if (this.mTextView == null) {
                return;
            }
            getResources();
            float f = TabLayout.this.mTabTextSize;
            int i3 = this.mDefaultMaxLines;
            ImageView imageView = this.mIconView;
            if (imageView == null || imageView.getVisibility() != 0) {
                TextView textView = this.mTextView;
                if (textView != null && textView.getLineCount() > 1) {
                    f = TabLayout.this.mTabTextMultiLineSize;
                }
            } else {
                i3 = 1;
            }
            float textSize = this.mTextView.getTextSize();
            int lineCount = this.mTextView.getLineCount();
            int maxLines = TextViewCompat.getMaxLines(this.mTextView);
            int i4 = (f > textSize ? 1 : (f == textSize ? 0 : -1));
            if (i4 == 0 && (maxLines < 0 || i3 == maxLines)) {
                return;
            }
            if (TabLayout.this.mMode == 1 && i4 > 0 && lineCount == 1 && ((layout = this.mTextView.getLayout()) == null || approximateLineWidth(layout, 0, f) > (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight())) {
                z = false;
            }
            if (!z) {
                return;
            }
            this.mTextView.setTextSize(0, f);
            this.mTextView.setMaxLines(i3);
            super.onMeasure(i, i2);
        }

        public void setTab(e eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("68e0e08e", new Object[]{this, eVar});
            } else if (eVar == this.mTab) {
            } else {
                this.mTab = eVar;
                update();
            }
        }

        public void reset() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("788e6256", new Object[]{this});
                return;
            }
            setTab(null);
            setSelected(false);
        }

        public final void update() {
            IpChange ipChange = $ipChange;
            boolean z = true;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ee4a30d0", new Object[]{this});
                return;
            }
            e eVar = this.mTab;
            View a2 = eVar != null ? eVar.a() : null;
            if (a2 != null) {
                ViewParent parent = a2.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(a2);
                    }
                    addView(a2);
                }
                this.mCustomView = a2;
                TextView textView = this.mTextView;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.mIconView;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.mIconView.setImageDrawable(null);
                }
                this.mCustomTextView = (TextView) a2.findViewById(16908308);
                TextView textView2 = this.mCustomTextView;
                if (textView2 != null) {
                    this.mDefaultMaxLines = TextViewCompat.getMaxLines(textView2);
                }
                this.mCustomIconView = (ImageView) a2.findViewById(16908294);
            } else {
                View view = this.mCustomView;
                if (view != null) {
                    removeView(view);
                    this.mCustomView = null;
                }
                this.mCustomTextView = null;
                this.mCustomIconView = null;
            }
            if (this.mCustomView == null) {
                if (!fqi.aS()) {
                    if (this.mIconView == null) {
                        ImageView imageView2 = (ImageView) LayoutInflater.from(getContext()).inflate(R.layout.design_layout_tab_icon, (ViewGroup) this, false);
                        addView(imageView2, 0);
                        this.mIconView = imageView2;
                    }
                    if (this.mTextView == null) {
                        TextView textView3 = (TextView) LayoutInflater.from(getContext()).inflate(R.layout.design_layout_tab_text, (ViewGroup) this, false);
                        addView(textView3);
                        this.mTextView = textView3;
                        this.mDefaultMaxLines = TextViewCompat.getMaxLines(this.mTextView);
                    }
                    TextViewCompat.setTextAppearance(this.mTextView, TabLayout.this.mTabTextAppearance);
                    if (TabLayout.this.mTabTextColors != null) {
                        this.mTextView.setTextColor(TabLayout.this.mTabTextColors);
                    }
                    updateTextAndIcon(this.mTextView, this.mIconView);
                }
            } else if (this.mCustomTextView != null || this.mCustomIconView != null) {
                updateTextAndIcon(this.mCustomTextView, this.mCustomIconView);
            }
            if (eVar == null || !eVar.g()) {
                z = false;
            }
            setSelected(z);
        }

        private void updateTextAndIcon(TextView textView, ImageView imageView) {
            IpChange ipChange = $ipChange;
            int i = 0;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("752d035d", new Object[]{this, textView, imageView});
                return;
            }
            e eVar = this.mTab;
            CharSequence charSequence = null;
            Drawable b = eVar != null ? eVar.b() : null;
            e eVar2 = this.mTab;
            CharSequence d = eVar2 != null ? eVar2.d() : null;
            e eVar3 = this.mTab;
            CharSequence h = eVar3 != null ? eVar3.h() : null;
            if (imageView != null) {
                if (b != null) {
                    imageView.setImageDrawable(b);
                    imageView.setVisibility(0);
                    setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                    imageView.setImageDrawable(null);
                }
                imageView.setContentDescription(h);
            }
            boolean z = !TextUtils.isEmpty(d);
            if (textView != null) {
                if (z) {
                    textView.setText(d);
                    textView.setVisibility(0);
                    setVisibility(0);
                } else {
                    textView.setVisibility(8);
                    textView.setText((CharSequence) null);
                }
                textView.setContentDescription(h);
            }
            if (imageView != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                if (z && imageView.getVisibility() == 0) {
                    i = TabLayout.this.dpToPx(8);
                }
                if (i != marginLayoutParams.bottomMargin) {
                    marginLayoutParams.bottomMargin = i;
                    imageView.requestLayout();
                }
            }
            if (!z) {
                charSequence = h;
            }
            TooltipCompat.setTooltipText(this, charSequence);
        }

        public e getTab() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("89073c7e", new Object[]{this}) : this.mTab;
        }

        private float approximateLineWidth(Layout layout, int i, float f) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a88c261d", new Object[]{this, layout, new Integer(i), new Float(f)})).floatValue() : layout.getLineWidth(i) * (f / layout.getPaint().getTextSize());
        }
    }

    /* loaded from: classes5.dex */
    public class SlidingTabStrip extends LinearLayout {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private ValueAnimator mIndicatorAnimator;
        private int mIndicatorLeft;
        private int mIndicatorRight;
        private int mLayoutDirection;
        private int mSelectedIndicatorBottomGap;
        private int mSelectedIndicatorHeight;
        private final Paint mSelectedIndicatorPaint;
        private int mSelectedIndicatorRadius;
        private int mSelectedIndicatorWidth;
        private int mSelectedIndicatorZIndex;
        public int mSelectedPosition;
        public float mSelectionOffset;

        static {
            kge.a(63067781);
        }

        public static /* synthetic */ Object ipc$super(SlidingTabStrip slidingTabStrip, String str, Object... objArr) {
            switch (str.hashCode()) {
                case -1665133574:
                    super.draw((Canvas) objArr[0]);
                    return null;
                case -244855388:
                    super.onLayout(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
                    return null;
                case 650865254:
                    super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                    return null;
                case 1933053926:
                    super.onRtlPropertiesChanged(((Number) objArr[0]).intValue());
                    return null;
                default:
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
        }

        public SlidingTabStrip(Context context) {
            super(context);
            this.mSelectedIndicatorZIndex = 1;
            this.mSelectedPosition = -1;
            this.mLayoutDirection = -1;
            this.mIndicatorLeft = -1;
            this.mIndicatorRight = -1;
            setWillNotDraw(false);
            this.mSelectedIndicatorPaint = new Paint();
        }

        public void setSelectedIndicatorColor(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4398e8eb", new Object[]{this, new Integer(i)});
            } else if (this.mSelectedIndicatorPaint.getColor() == i) {
            } else {
                this.mSelectedIndicatorPaint.setColor(i);
                ViewCompat.postInvalidateOnAnimation(this);
            }
        }

        public void setSelectedIndicatorHeight(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f8017dc3", new Object[]{this, new Integer(i)});
            } else if (this.mSelectedIndicatorHeight == i) {
            } else {
                this.mSelectedIndicatorHeight = i;
                ViewCompat.postInvalidateOnAnimation(this);
            }
        }

        public void setSelectedIndicatorWidth(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("98207068", new Object[]{this, new Integer(i)});
            } else if (this.mSelectedIndicatorWidth == i) {
            } else {
                this.mSelectedIndicatorWidth = i;
                ViewCompat.postInvalidateOnAnimation(this);
            }
        }

        public void setSelectedTabIndicatorRadius(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("873aa5d3", new Object[]{this, new Integer(i)});
            } else if (this.mSelectedIndicatorRadius == i) {
            } else {
                this.mSelectedIndicatorRadius = i;
                ViewCompat.postInvalidateOnAnimation(this);
            }
        }

        public void setSelectedTabIndicatorBottomGap(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8bcfe128", new Object[]{this, new Integer(i)});
            } else if (this.mSelectedIndicatorBottomGap == i) {
            } else {
                this.mSelectedIndicatorBottomGap = i;
                ViewCompat.postInvalidateOnAnimation(this);
            }
        }

        public void setSelectedTabIndicatorZIndex(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c4e89dad", new Object[]{this, new Integer(i)});
            } else {
                this.mSelectedIndicatorZIndex = i;
            }
        }

        public boolean childrenNeedLayout() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("e1603bca", new Object[]{this})).booleanValue();
            }
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (getChildAt(i).getWidth() <= 0) {
                    return true;
                }
            }
            return false;
        }

        public void setIndicatorPositionFromTabPosition(int i, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cb2e0842", new Object[]{this, new Integer(i), new Float(f)});
                return;
            }
            ValueAnimator valueAnimator = this.mIndicatorAnimator;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.mIndicatorAnimator.cancel();
            }
            this.mSelectedPosition = i;
            this.mSelectionOffset = f;
            updateIndicatorPosition();
        }

        public float getIndicatorPosition() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("46fca719", new Object[]{this})).floatValue() : this.mSelectedPosition + this.mSelectionOffset;
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onRtlPropertiesChanged(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("73380fe6", new Object[]{this, new Integer(i)});
                return;
            }
            super.onRtlPropertiesChanged(i);
            if (Build.VERSION.SDK_INT >= 23 || this.mLayoutDirection == i) {
                return;
            }
            requestLayout();
            this.mLayoutDirection = i;
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i, int i2) {
            boolean z;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
                return;
            }
            super.onMeasure(i, i2);
            if (View.MeasureSpec.getMode(i) != 1073741824 || TabLayout.this.mMode != 1 || TabLayout.this.mTabGravity != 1) {
                return;
            }
            int childCount = getChildCount();
            int i3 = 0;
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                if (childAt.getVisibility() == 0) {
                    i3 = Math.max(i3, childAt.getMeasuredWidth());
                }
            }
            if (i3 <= 0) {
                return;
            }
            if (i3 * childCount <= getMeasuredWidth() - (TabLayout.this.dpToPx(16) << 1)) {
                z = false;
                for (int i5 = 0; i5 < childCount; i5++) {
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i5).getLayoutParams();
                    if (layoutParams.width != i3 || layoutParams.weight != 0.0f) {
                        layoutParams.width = i3;
                        layoutParams.weight = 0.0f;
                        z = true;
                    }
                }
            } else {
                TabLayout tabLayout = TabLayout.this;
                tabLayout.mTabGravity = 0;
                tabLayout.updateTabViews(false);
                z = true;
            }
            if (!z) {
                return;
            }
            super.onMeasure(i, i2);
        }

        @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
                return;
            }
            super.onLayout(z, i, i2, i3, i4);
            ValueAnimator valueAnimator = this.mIndicatorAnimator;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.mIndicatorAnimator.cancel();
                animateIndicatorToPosition(this.mSelectedPosition, Math.round((1.0f - this.mIndicatorAnimator.getAnimatedFraction()) * ((float) this.mIndicatorAnimator.getDuration())));
                return;
            }
            updateIndicatorPosition();
        }

        private void updateIndicatorPosition() {
            int i;
            int i2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7a047396", new Object[]{this});
                return;
            }
            View childAt = getChildAt(this.mSelectedPosition);
            if (childAt == null || childAt.getWidth() <= 0) {
                i = -1;
                i2 = -1;
            } else {
                i = childAt.getLeft();
                i2 = childAt.getRight();
                if (this.mSelectionOffset > 0.0f && this.mSelectedPosition < getChildCount() - 1) {
                    View childAt2 = getChildAt(this.mSelectedPosition + 1);
                    float left = this.mSelectionOffset * childAt2.getLeft();
                    float f = this.mSelectionOffset;
                    i = (int) (left + ((1.0f - f) * i));
                    i2 = (int) ((f * childAt2.getRight()) + ((1.0f - this.mSelectionOffset) * i2));
                }
            }
            setIndicatorPosition(i, i2);
        }

        public void setIndicatorPosition(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("90adc6bd", new Object[]{this, new Integer(i), new Integer(i2)});
            } else if (i == this.mIndicatorLeft && i2 == this.mIndicatorRight) {
            } else {
                this.mIndicatorLeft = i;
                this.mIndicatorRight = i2;
                ViewCompat.postInvalidateOnAnimation(this);
            }
        }

        public void animateIndicatorToPosition(final int i, int i2) {
            final int i3;
            final int i4;
            IpChange ipChange = $ipChange;
            boolean z = false;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9d871d39", new Object[]{this, new Integer(i), new Integer(i2)});
                return;
            }
            ValueAnimator valueAnimator = this.mIndicatorAnimator;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.mIndicatorAnimator.cancel();
            }
            if (ViewCompat.getLayoutDirection(this) == 1) {
                z = true;
            }
            View childAt = getChildAt(i);
            if (childAt == null) {
                updateIndicatorPosition();
                return;
            }
            final int left = childAt.getLeft();
            final int right = childAt.getRight();
            if (Math.abs(i - this.mSelectedPosition) <= 1) {
                i3 = this.mIndicatorLeft;
                i4 = this.mIndicatorRight;
            } else {
                int dpToPx = TabLayout.this.dpToPx(24);
                i3 = (i >= this.mSelectedPosition ? !z : z) ? left - dpToPx : dpToPx + right;
                i4 = i3;
            }
            if (i3 == left && i4 == right) {
                return;
            }
            ValueAnimator valueAnimator2 = new ValueAnimator();
            this.mIndicatorAnimator = valueAnimator2;
            valueAnimator2.setInterpolator(com.taobao.android.dinamicx.widget.viewpager.tab.view.a.b);
            valueAnimator2.setDuration(i2);
            valueAnimator2.setFloatValues(0.0f, 1.0f);
            valueAnimator2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.taobao.android.dinamicx.widget.viewpager.tab.view.TabLayout.SlidingTabStrip.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator3) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator3});
                        return;
                    }
                    float animatedFraction = valueAnimator3.getAnimatedFraction();
                    SlidingTabStrip.this.setIndicatorPosition(com.taobao.android.dinamicx.widget.viewpager.tab.view.a.a(i3, left, animatedFraction), com.taobao.android.dinamicx.widget.viewpager.tab.view.a.a(i4, right, animatedFraction));
                }
            });
            valueAnimator2.addListener(new AnimatorListenerAdapter() { // from class: com.taobao.android.dinamicx.widget.viewpager.tab.view.TabLayout.SlidingTabStrip.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                        return;
                    }
                    SlidingTabStrip slidingTabStrip = SlidingTabStrip.this;
                    slidingTabStrip.mSelectedPosition = i;
                    slidingTabStrip.mSelectionOffset = 0.0f;
                }
            });
            valueAnimator2.start();
        }

        @Override // android.view.View
        public void draw(Canvas canvas) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9cc013fa", new Object[]{this, canvas});
                return;
            }
            if (this.mSelectedIndicatorZIndex <= 0) {
                drawIndicator(canvas);
            }
            super.draw(canvas);
            if (this.mSelectedIndicatorZIndex <= 0) {
                return;
            }
            drawIndicator(canvas);
        }

        public void drawIndicator(Canvas canvas) {
            int i;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b7292173", new Object[]{this, canvas});
                return;
            }
            int i2 = this.mIndicatorLeft;
            if (i2 < 0 || (i = this.mIndicatorRight) <= i2) {
                return;
            }
            int i3 = this.mSelectedIndicatorWidth;
            if (i3 > 0 && i - i2 > i3) {
                int i4 = ((i - i2) - i3) / 2;
                this.mIndicatorLeft = i2 + i4;
                this.mIndicatorRight = i - i4;
            }
            RectF rectF = new RectF();
            rectF.left = this.mIndicatorLeft;
            rectF.right = this.mIndicatorRight;
            if (this.mSelectedIndicatorBottomGap > 0) {
                rectF.top = (getHeight() - this.mSelectedIndicatorHeight) - this.mSelectedIndicatorBottomGap;
                rectF.bottom = getHeight() - this.mSelectedIndicatorBottomGap;
            } else {
                rectF.top = getHeight() - this.mSelectedIndicatorHeight;
                rectF.bottom = getHeight();
            }
            int i5 = this.mSelectedIndicatorRadius;
            if (i5 > 0) {
                canvas.drawRoundRect(rectF, i5, i5, this.mSelectedIndicatorPaint);
            } else {
                canvas.drawRect(rectF, this.mSelectedIndicatorPaint);
            }
        }
    }

    private static ColorStateList createColorStateList(int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ColorStateList) ipChange.ipc$dispatch("1acfcf45", new Object[]{new Integer(i), new Integer(i2)}) : new ColorStateList(new int[][]{SELECTED_STATE_SET, EMPTY_STATE_SET}, new int[]{i2, i});
    }

    private int getDefaultHeight() {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("be9b468c", new Object[]{this})).intValue();
        }
        int size = this.mTabs.size();
        int i = 0;
        while (true) {
            if (i < size) {
                e eVar = this.mTabs.get(i);
                if (eVar != null && eVar.b() != null && !TextUtils.isEmpty(eVar.d())) {
                    break;
                }
                i++;
            } else {
                z = false;
                break;
            }
        }
        return z ? 72 : 48;
    }

    private int getTabMinWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4d18030d", new Object[]{this})).intValue();
        }
        int i = this.mRequestedTabMinWidth;
        if (i != -1) {
            return i;
        }
        if (this.mMode != 0) {
            return 0;
        }
        return this.mScrollableTabMinWidth;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FrameLayout.LayoutParams) ipChange.ipc$dispatch("76fdc06b", new Object[]{this, attributeSet}) : generateDefaultLayoutParams();
    }

    public int getTabMaxWidth() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("30d0d83b", new Object[]{this})).intValue() : this.mTabMaxWidth;
    }

    /* loaded from: classes5.dex */
    public static class f implements ViewPager.OnPageChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference<TabLayout> f12207a;
        private int b;
        private int c;

        static {
            kge.a(-294055515);
            kge.a(1848919473);
        }

        public f(TabLayout tabLayout) {
            this.f12207a = new WeakReference<>(tabLayout);
        }

        @Override // android.support.v4.view.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6581cc1e", new Object[]{this, new Integer(i)});
                return;
            }
            this.b = this.c;
            this.c = i;
        }

        @Override // android.support.v4.view.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
            boolean z;
            boolean z2;
            boolean z3;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f4c13b05", new Object[]{this, new Integer(i), new Float(f), new Integer(i2)});
                return;
            }
            TabLayout tabLayout = this.f12207a.get();
            if (tabLayout == null) {
                return;
            }
            boolean z4 = this.c != 2 || this.b == 1;
            boolean z5 = (this.c == 2 && this.b == 0) ? false : true;
            if (fqi.q()) {
                boolean z6 = this.c == 2;
                if (this.b == 0 && this.c == 0) {
                    z3 = z6;
                    z = false;
                    z2 = false;
                } else {
                    z = z4;
                    z2 = z5;
                    z3 = z6;
                }
            } else {
                z = z4;
                z2 = z5;
                z3 = false;
            }
            tabLayout.setScrollPosition(i, f, z, z2, z3, !tabLayout.mViewPagerSmoothScroll);
        }

        @Override // android.support.v4.view.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i)});
                return;
            }
            TabLayout tabLayout = this.f12207a.get();
            if (tabLayout == null || tabLayout.getSelectedTabPosition() == i || i >= tabLayout.getTabCount()) {
                return;
            }
            int i2 = this.c;
            boolean z = i2 == 0 || (i2 == 2 && this.b == 0);
            e tabAt = tabLayout.getTabAt(i);
            if (tabAt != null) {
                tabAt.a(false);
            }
            tabLayout.selectTab(tabAt, z, true, 2);
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            this.c = 0;
            this.b = 0;
        }
    }

    /* loaded from: classes5.dex */
    public static class g implements c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final ViewPager f12208a;
        private final boolean b;

        static {
            kge.a(-836188141);
            kge.a(-2093854599);
        }

        @Override // com.taobao.android.dinamicx.widget.viewpager.tab.view.TabLayout.c
        public void a(e eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f32ecc40", new Object[]{this, eVar});
            }
        }

        @Override // com.taobao.android.dinamicx.widget.viewpager.tab.view.TabLayout.c
        public void b(e eVar, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("39b715c4", new Object[]{this, eVar, new Integer(i)});
            }
        }

        public g(ViewPager viewPager, boolean z) {
            this.f12208a = viewPager;
            this.b = z;
        }

        @Override // com.taobao.android.dinamicx.widget.viewpager.tab.view.TabLayout.c
        public void a(e eVar, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("72ab2ec3", new Object[]{this, eVar, new Integer(i)});
            } else if (this.b) {
                ViewPager viewPager = this.f12208a;
                if (viewPager instanceof DXNativeViewPagerView) {
                    ((DXNativeViewPagerView) viewPager).setCurrentItem(eVar.c(), i);
                } else {
                    viewPager.setCurrentItem(eVar.c());
                }
            } else {
                ViewPager viewPager2 = this.f12208a;
                if (viewPager2 instanceof DXNativeViewPagerView) {
                    ((DXNativeViewPagerView) viewPager2).setCurrentItem(eVar.c(), false, i);
                } else {
                    viewPager2.setCurrentItem(eVar.c(), false);
                }
            }
        }
    }

    /* loaded from: classes5.dex */
    public class d extends DataSetObserver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-770674738);
        }

        public d() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ba16f5dc", new Object[]{this});
            } else {
                TabLayout.this.populateFromPagerAdapter();
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("61d25eb1", new Object[]{this});
            } else {
                TabLayout.this.populateFromPagerAdapter();
            }
        }
    }

    /* loaded from: classes5.dex */
    public class a implements ViewPager.OnAdapterChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private boolean b;

        static {
            kge.a(1680405607);
            kge.a(903558197);
        }

        public a() {
        }

        @Override // android.support.v4.view.ViewPager.OnAdapterChangeListener
        public void onAdapterChanged(ViewPager viewPager, PagerAdapter pagerAdapter, PagerAdapter pagerAdapter2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("34f983c5", new Object[]{this, viewPager, pagerAdapter, pagerAdapter2});
            } else if (TabLayout.this.mViewPager != viewPager) {
            } else {
                TabLayout.this.setPagerAdapter(pagerAdapter2, this.b);
            }
        }

        public void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            } else {
                this.b = z;
            }
        }
    }

    public void setSelectedTab(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee97ef89", new Object[]{this, eVar});
        } else {
            this.mSelectedTab = eVar;
        }
    }

    public void setReselectAnimated(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9158379", new Object[]{this, new Boolean(z)});
        } else {
            this.mReselectAnimated = z;
        }
    }
}
