package com.taobao.tao.flexbox.layoutmanager.view.tabbar;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.support.v4.util.Pools;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.view.animation.FastOutSlowInInterpolator;
import android.support.v7.app.ActionBar;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.component.TextComponent;
import com.taobao.tao.flexbox.layoutmanager.component.u;
import com.taobao.tao.flexbox.layoutmanager.core.aa;
import com.taobao.tao.flexbox.layoutmanager.core.r;
import com.taobao.tao.flexbox.layoutmanager.view.ObservableHorizontalScrollView;
import com.taobao.taobao.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import tb.ibp;
import tb.kge;
import tb.oeb;
import tb.ogk;
import tb.ogl;
import tb.tds;

@ViewPager.DecorView
/* loaded from: classes8.dex */
public class CustomTabLayout extends ObservableHorizontalScrollView implements tds {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int ANIMATION_DURATION = 300;
    public static final int DEFAULT_GAP_TEXT_ICON = 8;
    private static final int DEFAULT_HEIGHT = 48;
    private static final int DEFAULT_HEIGHT_WITH_TEXT_ICON = 72;
    public static final int FIXED_WRAP_GUTTER_MIN = 16;
    public static final int GRAVITY_CENTER = 1;
    public static final int GRAVITY_FILL = 0;
    private static final int INVALID_WIDTH = -1;
    public static final int MODE_FIXED = 1;
    public static final int MODE_SCROLLABLE = 0;
    public static final int MOTION_NON_ADJACENT_OFFSET = 24;
    private static final int TAB_MIN_WIDTH_MARGIN = 56;
    private static final Pools.Pool<d> sTabPool;
    private a animateTabRunnable;
    private ibp fadingEdge;
    public boolean fixedOffset;
    private Handler handler;
    private int isRequestScroll;
    private int mContentInsetStart;
    public int mMode;
    private final int mRequestedTabMaxWidth;
    private final int mRequestedTabMinWidth;
    private ValueAnimator mScrollAnimator;
    private final int mScrollableTabMinWidth;
    private b mSelectedListener;
    private final ArrayList<b> mSelectedListeners;
    private d mSelectedTab;
    public String mTabAlign;
    public int mTabGravity;
    public int mTabMaxWidth;
    public int mTabPaddingBottom;
    public int mTabPaddingEnd;
    public int mTabPaddingStart;
    public int mTabPaddingTop;
    private final c mTabStrip;
    private int mTabStripHeight;
    private final Pools.Pool<TabView> mTabViewPool;
    private final ArrayList<d> mTabs;
    private Object rawselectFontColor;
    private Object rawselectFontSize;
    private Object rawselectFontStyle;
    private Object rawunselectFontColor;
    private Object rawunselectFontSize;
    private Object rawunselectFontStyle;
    private int selectFontColor;
    private int selectFontSize;
    private int selectFontStyle;
    private aa tNode;
    private final HashMap<aa, d> tNodeTabHashMap;
    private int unselectFontColor;
    private int unselectFontSize;
    private int unselectFontStyle;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes8.dex */
    public @interface Mode {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes8.dex */
    public @interface TabGravity {
    }

    /* loaded from: classes8.dex */
    public interface b {
        void a(d dVar);

        void a(d dVar, boolean z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes8.dex */
    public interface c {
        public static final int SLIDING_VERSION_FLATVIEWGROUP = 2;
        public static final int SLIDING_VERSION_LINEALAYOUT = 1;

        void addView(View view, int i, ViewGroup.LayoutParams layoutParams, r rVar);

        void animateIndicatorToPosition(int i, int i2);

        boolean childrenNeedLayout();

        View getChildAt(int i);

        int getChildCount();

        int getCurrentImplementVersion();

        float getIndicatorPosition();

        View getSelfView();

        int getWidth();

        boolean isRunningIndicatorAnimation();

        void removeViewAt(int i);

        void setClipChildren(boolean z);

        void setGravity(int i);

        void setIndicatorPositionFromTabPosition(int i, float f);

        void setSelectedIndicatorColor(int i);

        void setSelectedIndicatorDrawable(Drawable drawable);

        void setSelectedIndicatorHeight(int i);

        void setSelectedIndicatorWidth(int i);

        void setWillNotDraw(boolean z);

        void setmDiffHeight(int i);

        void updateIndicatorPosition();
    }

    private int getDefaultHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("be9b468c", new Object[]{this})).intValue();
        }
        return 48;
    }

    public static /* synthetic */ Object ipc$super(CustomTabLayout customTabLayout, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -244855388:
                super.onLayout(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
                return null;
            case 623593120:
                super.dispatchDraw((Canvas) objArr[0]);
                return null;
            case 650865254:
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 1992612095:
                super.addView((View) objArr[0], ((Number) objArr[1]).intValue(), (ViewGroup.LayoutParams) objArr[2]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public static /* synthetic */ void access$200(CustomTabLayout customTabLayout, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26f856f9", new Object[]{customTabLayout, new Integer(i)});
        } else {
            customTabLayout.animateToTab(i);
        }
    }

    public static /* synthetic */ void access$500(CustomTabLayout customTabLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2447a4d", new Object[]{customTabLayout});
        } else {
            customTabLayout.fixedOffset();
        }
    }

    static {
        kge.a(2052078238);
        kge.a(-2026558253);
        sTabPool = new Pools.SynchronizedPool(16);
    }

    @Override // tb.tds
    public void setFading(int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bad10d0", new Object[]{this, iArr});
        } else {
            this.fadingEdge.a(iArr);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("252b46a0", new Object[]{this, canvas});
        } else if (this.fadingEdge.a()) {
            int a2 = this.fadingEdge.a(canvas);
            super.dispatchDraw(canvas);
            this.fadingEdge.b(canvas);
            this.fadingEdge.a(canvas, a2);
        } else {
            super.dispatchDraw(canvas);
        }
    }

    public void settNode(aa aaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9769ea3", new Object[]{this, aaVar});
            return;
        }
        this.tNode = aaVar;
        if (aaVar != null && !aaVar.I().getViewParams().ba) {
            this.mTabStrip.setClipChildren(false);
        }
        ((ViewGroup) this.mTabStrip.getSelfView()).setClipToPadding(false);
    }

    public void updateFixedOffset(u.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a81efe3d", new Object[]{this, aVar});
            return;
        }
        this.fixedOffset = aVar.D;
        this.fadingEdge.b(aVar.D);
    }

    public CustomTabLayout(Context context) {
        this(context, null);
    }

    public CustomTabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CustomTabLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.fadingEdge = new ibp(this);
        this.mTabs = new ArrayList<>();
        this.tNodeTabHashMap = new HashMap<>();
        this.mTabStripHeight = 0;
        this.isRequestScroll = -1;
        this.mTabMaxWidth = Integer.MAX_VALUE;
        this.mTabAlign = "";
        this.mSelectedListeners = new ArrayList<>();
        this.mTabViewPool = new Pools.SimplePool(12);
        this.selectFontSize = -1;
        this.rawselectFontSize = null;
        this.unselectFontSize = -1;
        this.rawunselectFontSize = null;
        this.selectFontColor = 1;
        this.rawselectFontColor = null;
        this.unselectFontColor = 1;
        this.rawunselectFontColor = null;
        this.selectFontStyle = -1;
        this.rawselectFontStyle = null;
        this.unselectFontStyle = -1;
        this.rawunselectFontStyle = null;
        this.handler = new Handler();
        this.animateTabRunnable = new a();
        setHorizontalScrollBarEnabled(false);
        this.mTabStrip = new SlidingTabStrip(context);
        super.addView(this.mTabStrip.getSelfView(), 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.TabLayout, i, R.style.Widget_Design_TabLayout);
        this.mTabStrip.setSelectedIndicatorHeight(obtainStyledAttributes.getDimensionPixelSize(R.styleable.TabLayout_tabIndicatorHeight, 0));
        this.mTabStrip.setSelectedIndicatorColor(17170445);
        this.mRequestedTabMinWidth = obtainStyledAttributes.getDimensionPixelSize(R.styleable.TabLayout_tabMinWidth, -1);
        this.mRequestedTabMaxWidth = obtainStyledAttributes.getDimensionPixelSize(R.styleable.TabLayout_tabMaxWidth, -1);
        this.mContentInsetStart = obtainStyledAttributes.getDimensionPixelSize(R.styleable.TabLayout_tabContentStart, 0);
        this.mMode = obtainStyledAttributes.getInt(R.styleable.TabLayout_tabMode, 1);
        this.mTabGravity = obtainStyledAttributes.getInt(R.styleable.TabLayout_tabGravity, 0);
        obtainStyledAttributes.recycle();
        this.mScrollableTabMinWidth = dpToPx(72);
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

    public void setSelectedTabIndicatorDrawable(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a390ca0", new Object[]{this, drawable});
        } else {
            this.mTabStrip.setSelectedIndicatorDrawable(drawable);
        }
    }

    public void setSelectFontSize(Object obj, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed6743f2", new Object[]{this, obj, new Integer(i)});
            return;
        }
        this.rawselectFontSize = obj;
        this.selectFontSize = i;
    }

    public void setUnselectFontSize(Object obj, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af285979", new Object[]{this, obj, new Integer(i)});
            return;
        }
        this.rawunselectFontSize = obj;
        this.unselectFontSize = i;
    }

    public void setSelectFontColor(Object obj, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a05740a", new Object[]{this, obj, new Integer(i)});
            return;
        }
        this.rawselectFontColor = obj;
        this.selectFontColor = i;
    }

    public void setUnselectFontColor(Object obj, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0670f63", new Object[]{this, obj, new Integer(i)});
            return;
        }
        this.rawunselectFontColor = obj;
        this.unselectFontColor = i;
    }

    public void setSelectFontStyle(Object obj, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("450f4dfc", new Object[]{this, obj, new Integer(i)});
            return;
        }
        this.rawselectFontStyle = obj;
        this.selectFontStyle = i;
    }

    public void setUnselectFontStyle(Object obj, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb70e955", new Object[]{this, obj, new Integer(i)});
            return;
        }
        this.rawunselectFontStyle = obj;
        this.unselectFontStyle = i;
    }

    public Object getRawselectFontSize() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("d05c34cd", new Object[]{this}) : this.rawselectFontSize;
    }

    public Object getRawunselectFontSize() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("3e48dc14", new Object[]{this}) : this.rawunselectFontSize;
    }

    public Object getRawselectFontColor() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("3424b9c5", new Object[]{this}) : this.rawselectFontColor;
    }

    public Object getRawunselectFontColor() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("83ccfb5e", new Object[]{this}) : this.rawunselectFontColor;
    }

    public Object getRawselectFontStyle() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("ff606837", new Object[]{this}) : this.rawselectFontStyle;
    }

    public Object getRawunselectFontStyle() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("4f08a9d0", new Object[]{this}) : this.rawunselectFontStyle;
    }

    public int getSelectFontSize() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("43b97e7c", new Object[]{this})).intValue() : this.selectFontSize;
    }

    public int getUnselectFontSize() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("1a55d355", new Object[]{this})).intValue() : this.unselectFontSize;
    }

    public int getSelectFontColor() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8eb097fc", new Object[]{this})).intValue() : this.selectFontColor;
    }

    public int getUnselectFontColor() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8b9ede43", new Object[]{this})).intValue() : this.unselectFontColor;
    }

    public int getSelectFontStyle() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8438af4a", new Object[]{this})).intValue() : this.selectFontStyle;
    }

    public int getUnselectFontStyle() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8126f591", new Object[]{this})).intValue() : this.unselectFontStyle;
    }

    public void setSelectedTabIndicatorHeight(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef09165e", new Object[]{this, new Integer(i)});
        } else {
            this.mTabStrip.setSelectedIndicatorHeight(i);
        }
    }

    public void setIsRequestScroll(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92ff24ec", new Object[]{this, new Integer(i)});
        } else {
            this.isRequestScroll = i;
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

    @Override // com.taobao.tao.flexbox.layoutmanager.view.ObservableHorizontalScrollView
    public void enableEdgeEffect() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b269f98", new Object[]{this});
            return;
        }
        setOverScrollMode(0);
        com.taobao.tao.flexbox.layoutmanager.component.bouncy.a.a(this, false);
    }

    public void setScrollPosition(int i, float f, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cac71458", new Object[]{this, new Integer(i), new Float(f), new Boolean(z)});
        } else {
            setScrollPosition(i, f, z, true, false);
        }
    }

    public void setScrollPosition(int i, float f, boolean z, boolean z2, boolean z3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3569b8d8", new Object[]{this, new Integer(i), new Float(f), new Boolean(z), new Boolean(z2), new Boolean(z3)});
            return;
        }
        int round = Math.round(i + f);
        if (round < 0 || round >= this.mTabStrip.getChildCount()) {
            return;
        }
        if (z2) {
            this.mTabStrip.setIndicatorPositionFromTabPosition(i, f);
        }
        ValueAnimator valueAnimator = this.mScrollAnimator;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.mScrollAnimator.cancel();
        }
        int calculateScrollXForTab = calculateScrollXForTab(i, f);
        if (z3) {
            smoothScrollTo(calculateScrollXForTab, 0);
        } else {
            scrollTo(calculateScrollXForTab, 0);
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

    public void addTab(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13227acc", new Object[]{this, dVar});
        } else {
            addTab(dVar, this.mTabs.isEmpty());
        }
    }

    public void addTab(d dVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("512d51b7", new Object[]{this, dVar, new Integer(i)});
        } else {
            addTab(dVar, i, this.mTabs.isEmpty());
        }
    }

    public void addTab(d dVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("512d9188", new Object[]{this, dVar, new Boolean(z)});
        } else {
            addTab(dVar, this.mTabs.size(), z);
        }
    }

    public void addTab(d dVar, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d47d97fd", new Object[]{this, dVar, new Integer(i), new Boolean(z)});
        } else if (dVar.f20547a != this) {
            throw new IllegalArgumentException("Tab belongs to a different CustomTabLayout.");
        } else {
            configureTab(dVar, i);
            addTabView(dVar);
            if (!z) {
                return;
            }
            dVar.e();
        }
    }

    public void selectTab(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffde1203", new Object[]{this, new Integer(i)});
            return;
        }
        d tabAt = getTabAt(i);
        if (tabAt == null) {
            return;
        }
        tabAt.a(true);
    }

    @Deprecated
    public void setOnTabSelectedListener(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2998425d", new Object[]{this, bVar});
            return;
        }
        b bVar2 = this.mSelectedListener;
        if (bVar2 != null) {
            removeOnTabSelectedListener(bVar2);
        }
        this.mSelectedListener = bVar;
        if (bVar == null) {
            return;
        }
        addOnTabSelectedListener(bVar);
    }

    public void addOnTabSelectedListener(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c2eba7e", new Object[]{this, bVar});
        } else if (this.mSelectedListeners.contains(bVar)) {
        } else {
            this.mSelectedListeners.add(bVar);
        }
    }

    public void removeOnTabSelectedListener(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd8f617b", new Object[]{this, bVar});
        } else {
            this.mSelectedListeners.remove(bVar);
        }
    }

    public void setDiffHeight(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14ee508e", new Object[]{this, new Integer(i)});
        } else {
            this.mTabStrip.setmDiffHeight(i);
        }
    }

    public void setIndicatorWillNotDraw(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41f001b5", new Object[]{this, new Boolean(z)});
        } else {
            this.mTabStrip.setWillNotDraw(z);
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

    public d newTab() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("f4f8c70b", new Object[]{this});
        }
        d acquire = sTabPool.acquire();
        if (acquire == null) {
            acquire = new d();
        }
        acquire.f20547a = this;
        acquire.b = createTabView(acquire);
        return acquire;
    }

    public int getTabCount() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9428606a", new Object[]{this})).intValue() : this.mTabs.size();
    }

    public d getTabAt(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("693b1e7d", new Object[]{this, new Integer(i)});
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
        d dVar = this.mSelectedTab;
        if (dVar == null) {
            return -1;
        }
        return dVar.d();
    }

    public void removeTab(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5548d709", new Object[]{this, dVar});
        } else if (dVar.f20547a != this) {
            throw new IllegalArgumentException("Tab does not belong to this CustomTabLayout.");
        } else {
            removeTabAt(dVar.d());
        }
    }

    public int getTabPosition(aa aaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("46798eca", new Object[]{this, aaVar})).intValue();
        }
        int i = -1;
        for (int i2 = 0; i2 < this.mTabs.size(); i2++) {
            if (aaVar == d.a(this.mTabs.get(i2))) {
                i = i2;
            }
        }
        if (i == -1) {
            throw new IllegalArgumentException("tnode is not child");
        }
        return i;
    }

    public void removeTabAt(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("181e3158", new Object[]{this, new Integer(i)});
            return;
        }
        d dVar = this.mSelectedTab;
        int d2 = dVar != null ? dVar.d() : 0;
        removeTabViewAt(i);
        if (i < 0 || i >= this.mTabs.size()) {
            return;
        }
        d remove = this.mTabs.remove(i);
        this.tNodeTabHashMap.remove(d.a(remove));
        if (remove != null) {
            remove.h();
            sTabPool.release(remove);
        }
        int size = this.mTabs.size();
        for (int i2 = i; i2 < size; i2++) {
            this.mTabs.get(i2).b(i2);
        }
        if (d2 != i) {
            return;
        }
        selectTab(this.mTabs.isEmpty() ? null : this.mTabs.get(Math.max(0, i - 1)), false);
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
        Iterator<d> it = this.mTabs.iterator();
        while (it.hasNext()) {
            d next = it.next();
            it.remove();
            next.h();
            sTabPool.release(next);
        }
        this.mSelectedTab = null;
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

    public void setTabAlign(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("763f9403", new Object[]{this, str});
        } else if (this.mTabStrip.getCurrentImplementVersion() != 1 || this.mTabAlign.equals(str)) {
        } else {
            this.mTabAlign = str;
            applyModeAndGravity();
        }
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9e4f226", new Object[]{this})).booleanValue() : getTabScrollRange() > 0;
    }

    private int getTabScrollRange() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("40fd048b", new Object[]{this})).intValue() : Math.max(0, ((this.mTabStrip.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    private TabView createTabView(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TabView) ipChange.ipc$dispatch("a108fbbb", new Object[]{this, dVar});
        }
        Pools.Pool<TabView> pool = this.mTabViewPool;
        TabView acquire = pool != null ? pool.acquire() : null;
        if (acquire == null) {
            acquire = new TabView(getContext());
        }
        acquire.setTab(dVar);
        acquire.setFocusable(true);
        acquire.setMinimumWidth(getTabMinWidth());
        return acquire;
    }

    private void configureTab(d dVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8802547c", new Object[]{this, dVar, new Integer(i)});
            return;
        }
        dVar.b(i);
        this.mTabs.add(i, dVar);
        this.tNodeTabHashMap.put(d.a(dVar), dVar);
        int size = this.mTabs.size();
        for (int i2 = i + 1; i2 < size; i2++) {
            this.mTabs.get(i2).b(i2);
        }
    }

    private void addTabView(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc653291", new Object[]{this, dVar});
        } else {
            this.mTabStrip.addView(dVar.b, dVar.d(), createLayoutParamsForTabs(dVar), d.a(dVar).G());
        }
    }

    private ViewGroup.LayoutParams createLayoutParamsForTabs(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup.LayoutParams) ipChange.ipc$dispatch("8a4fbc80", new Object[]{this, dVar});
        }
        if (this.mTabStrip.getCurrentImplementVersion() == 1) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
            if (d.a(dVar).I() != null) {
                ogl viewParams = d.a(dVar).I().getViewParams();
                layoutParams.leftMargin = viewParams.ak;
                layoutParams.rightMargin = viewParams.al;
            }
            updateTabViewLayoutParams(layoutParams);
            return layoutParams;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(d.a(dVar).G().f20361a, -1);
        if (d.a(dVar).I() != null) {
            ogl viewParams2 = d.a(dVar).I().getViewParams();
            marginLayoutParams.leftMargin = viewParams2.ak;
            marginLayoutParams.rightMargin = viewParams2.al;
        }
        replaceMeasureResultToChildLayout(dVar);
        return marginLayoutParams;
    }

    private boolean replaceMeasureResultToChildLayout(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1e1d4000", new Object[]{this, dVar})).booleanValue();
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) d.b(dVar).getLayoutParams();
        if (marginLayoutParams.width == d.a(dVar).G().f20361a && marginLayoutParams.topMargin == d.a(dVar).G().d && marginLayoutParams.height == d.a(dVar).G().b) {
            return false;
        }
        marginLayoutParams.topMargin = d.a(dVar).G().d;
        marginLayoutParams.width = d.a(dVar).G().f20361a;
        marginLayoutParams.height = d.a(dVar).G().b;
        d.b(dVar).setLayoutParams(marginLayoutParams);
        d.b(dVar).invalidate();
        return true;
    }

    private boolean replaceMeasureResultToTabView(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8f691f74", new Object[]{this, dVar})).booleanValue();
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) dVar.b.getLayoutParams();
        if (marginLayoutParams.width == d.a(dVar).G().f20361a) {
            return false;
        }
        marginLayoutParams.width = d.a(dVar).G().f20361a;
        dVar.b.setLayoutParams(marginLayoutParams);
        dVar.b.invalidate();
        return true;
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
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        if (this.isRequestScroll != -1 && this.mTabStrip.getSelfView().getWidth() != 0) {
            scrollTo(this.isRequestScroll, 0);
            this.isRequestScroll = -1;
        } else if (!oeb.bk() || this.mTabStrip.isRunningIndicatorAnimation()) {
        } else {
            this.mTabStrip.updateIndicatorPosition();
        }
    }

    private void removeTabViewAt(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ea7b73", new Object[]{this, new Integer(i)});
            return;
        }
        TabView tabView = (TabView) this.mTabStrip.getChildAt(i);
        if (tabView != null) {
            this.mTabStrip.removeViewAt(i);
            tabView.reset();
            this.mTabViewPool.release(tabView);
        }
        requestLayout();
    }

    private void animateToTab(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a91a643", new Object[]{this, new Integer(i)});
            return;
        }
        this.handler.removeCallbacks(this.animateTabRunnable);
        if (i == -1) {
            return;
        }
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

    private void ensureScrollAnimator() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("612c5839", new Object[]{this});
        } else if (this.mScrollAnimator != null) {
        } else {
            this.mScrollAnimator = new ValueAnimator();
            this.mScrollAnimator.setInterpolator(new FastOutSlowInInterpolator());
            this.mScrollAnimator.setDuration(300L);
            this.mScrollAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.taobao.tao.flexbox.layoutmanager.view.tabbar.CustomTabLayout.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                    } else {
                        CustomTabLayout.this.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
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
        Object rawunselectFontSize;
        boolean z;
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
            boolean z2 = i2 == i;
            this.mTabStrip.getChildAt(i2).setSelected(z2);
            d dVar = this.mTabs.get(i2);
            if (dVar != null) {
                aa b2 = dVar.c().b(TextComponent.class);
                if (z2) {
                    rawunselectFontSize = getRawselectFontSize();
                } else {
                    rawunselectFontSize = getRawunselectFontSize();
                }
                Object rawselectFontColor = z2 ? getRawselectFontColor() : getRawunselectFontColor();
                Object rawselectFontStyle = z2 ? getRawselectFontStyle() : getRawunselectFontStyle();
                int selectFontSize = z2 ? getSelectFontSize() : getUnselectFontSize();
                int selectFontColor = z2 ? getSelectFontColor() : getUnselectFontColor();
                int selectFontStyle = z2 ? getSelectFontStyle() : getUnselectFontStyle();
                if (b2 != null) {
                    TextComponent textComponent = (TextComponent) b2.I();
                    ogk ogkVar = (ogk) textComponent.getViewParams();
                    if (selectFontSize > 0) {
                        b2.a(com.taobao.android.weex_framework.util.a.ATOM_EXT_UDL_font_size, rawunselectFontSize);
                        ogkVar.m = selectFontSize;
                        z = true;
                    } else {
                        z = false;
                    }
                    if (selectFontColor != 1) {
                        b2.a("color", rawselectFontColor);
                        ogkVar.s = selectFontColor;
                        z = true;
                    }
                    if (selectFontStyle >= 0) {
                        b2.a(com.taobao.android.weex_framework.util.a.ATOM_EXT_UDL_font_style, rawselectFontStyle);
                        ogkVar.r = selectFontStyle;
                        z = true;
                    }
                    if (z) {
                        textComponent.refreshText();
                    }
                }
            }
            i2++;
        }
    }

    public void selectTab(d dVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8df84563", new Object[]{this, dVar, new Boolean(z)});
        } else {
            selectTab(dVar, true, z);
        }
    }

    /* loaded from: classes8.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private int b;

        static {
            kge.a(-1493475457);
            kge.a(-1390502639);
        }

        private a() {
        }

        public static /* synthetic */ int a(a aVar, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("264df49a", new Object[]{aVar, new Integer(i)})).intValue();
            }
            aVar.b = i;
            return i;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                CustomTabLayout.access$200(CustomTabLayout.this, this.b);
            }
        }
    }

    public void selectTab(d dVar, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("311119d1", new Object[]{this, dVar, new Boolean(z), new Boolean(z2)});
            return;
        }
        d dVar2 = this.mSelectedTab;
        if (dVar2 == dVar) {
            if (dVar2 == null) {
                return;
            }
            dispatchTabReselected(dVar);
            animateToTab(dVar.d());
            return;
        }
        int d2 = dVar != null ? dVar.d() : -1;
        if (z) {
            if ((dVar2 == null || dVar2.d() == -1) && d2 != -1) {
                setScrollPosition(d2, 0.0f, true);
                if (d2 > 0) {
                    this.handler.removeCallbacks(this.animateTabRunnable);
                    a.a(this.animateTabRunnable, d2);
                    this.handler.post(this.animateTabRunnable);
                }
            } else {
                animateToTab(d2);
            }
            if (d2 != -1) {
                setSelectedTabView(d2);
            }
        }
        if (dVar2 != null) {
            dispatchTabUnselected(dVar2);
        }
        this.mSelectedTab = dVar;
        if (dVar == null) {
            return;
        }
        dispatchTabSelected(dVar, z2);
    }

    private void dispatchTabSelected(d dVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52df0686", new Object[]{this, dVar, new Boolean(z)});
            return;
        }
        for (int size = this.mSelectedListeners.size() - 1; size >= 0; size--) {
            this.mSelectedListeners.get(size).a(dVar, z);
        }
    }

    private void dispatchTabUnselected(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4eff97e7", new Object[]{this, dVar});
            return;
        }
        for (int size = this.mSelectedListeners.size() - 1; size >= 0; size--) {
            this.mSelectedListeners.get(size);
        }
    }

    private void dispatchTabReselected(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dea75381", new Object[]{this, dVar});
            return;
        }
        for (int size = this.mSelectedListeners.size() - 1; size >= 0; size--) {
            this.mSelectedListeners.get(size).a(dVar);
        }
    }

    private int calculateScrollXForTab(int i, float f) {
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("eb48e268", new Object[]{this, new Integer(i), new Float(f)})).intValue();
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
        int i4 = (int) ((width + i2) * 0.5f * f);
        if (this.fixedOffset) {
            left -= getLeftRightDiffOffset();
        }
        return ViewCompat.getLayoutDirection(this) == 0 ? left + i4 : left - i4;
    }

    private void fixedOffset() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c11f6a2e", new Object[]{this});
            return;
        }
        if (canScrollHorizontally(1) || canScrollHorizontally(-1)) {
            z = true;
        }
        if (!z) {
            this.mTabStrip.getSelfView().setTranslationX(getLeftRightDiffOffset() - (this.mTabStrip.getSelfView().getPaddingLeft() / 2));
        } else {
            this.mTabStrip.getSelfView().setTranslationX(0.0f);
        }
    }

    private int getLeftRightDiffOffset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ffd8e6f1", new Object[]{this})).intValue();
        }
        int[] iArr = new int[2];
        getLocationOnScreen(iArr);
        return (((this.tNode.M().x().getWidth() - iArr[0]) - getWidth()) - iArr[0]) / 2;
    }

    private void applyModeAndGravity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c15fe0f", new Object[]{this});
            return;
        }
        if (this.mMode == 0) {
            Math.max(0, this.mContentInsetStart - this.mTabPaddingStart);
        }
        if ("right".equals(this.mTabAlign)) {
            this.mTabStrip.setGravity(GravityCompat.END);
        } else if ("center".equals(this.mTabAlign)) {
            this.mTabStrip.setGravity(1);
        } else {
            int i = this.mMode;
            if (i == 0) {
                this.mTabStrip.setGravity(GravityCompat.START);
            } else if (i == 1) {
                this.mTabStrip.setGravity(1);
            }
        }
        updateTabViews(true);
    }

    public void customScrollTo(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3e01120", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            scrollTo(i, i2);
        }
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

    /* loaded from: classes8.dex */
    public static final class d {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final int INVALID_POSITION = -1;

        /* renamed from: a  reason: collision with root package name */
        public CustomTabLayout f20547a;
        public TabView b;
        private Object c;
        private int d = -1;
        private View e;
        private aa f;
        private int g;

        static {
            kge.a(208101487);
        }

        public static /* synthetic */ aa a(d dVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (aa) ipChange.ipc$dispatch("10ff7b65", new Object[]{dVar}) : dVar.f;
        }

        public static /* synthetic */ View b(d dVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("ff3cbbc", new Object[]{dVar}) : dVar.e;
        }

        public View b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("639153eb", new Object[]{this}) : this.e;
        }

        public d a(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("35bbccbd", new Object[]{this, view});
            }
            this.e = view;
            g();
            return this;
        }

        public d a(aa aaVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("b17dbe17", new Object[]{this, aaVar});
            }
            this.f = aaVar;
            if (this.b != null && aaVar != null && !aaVar.I().getViewParams().ba) {
                this.b.setClipChildren(false);
            }
            return this;
        }

        public aa c() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (aa) ipChange.ipc$dispatch("e04dfa94", new Object[]{this}) : this.f;
        }

        public int d() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue() : this.d;
        }

        public void b(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            } else {
                this.d = i;
            }
        }

        public void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
                return;
            }
            CustomTabLayout customTabLayout = this.f20547a;
            if (customTabLayout == null) {
                throw new IllegalArgumentException("Tab not attached to a CustomTabLayout");
            }
            customTabLayout.selectTab(this, z);
        }

        public void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
                return;
            }
            CustomTabLayout customTabLayout = this.f20547a;
            if (customTabLayout == null) {
                throw new IllegalArgumentException("Tab not attached to a CustomTabLayout");
            }
            customTabLayout.selectTab(this, false);
        }

        public boolean f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue();
            }
            CustomTabLayout customTabLayout = this.f20547a;
            if (customTabLayout == null) {
                throw new IllegalArgumentException("Tab not attached to a CustomTabLayout");
            }
            return customTabLayout.getSelectedTabPosition() == this.d;
        }

        public void g() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
                return;
            }
            TabView tabView = this.b;
            if (tabView == null) {
                return;
            }
            tabView.update();
        }

        public void h() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
                return;
            }
            this.f20547a = null;
            this.b = null;
            this.c = null;
            this.d = -1;
            this.e = null;
            this.f = null;
            this.g = 0;
        }
    }

    /* loaded from: classes8.dex */
    public class TabView extends LinearLayout {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private View mCustomView;
        private d mTab;

        static {
            kge.a(-805552204);
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
            ViewCompat.setPaddingRelative(this, CustomTabLayout.this.mTabPaddingStart, CustomTabLayout.this.mTabPaddingTop, CustomTabLayout.this.mTabPaddingEnd, CustomTabLayout.this.mTabPaddingBottom);
            setClickable(true);
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
            this.mTab.a(true);
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
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
                return;
            }
            View view = this.mCustomView;
            if (view != null) {
                view.measure(i, i2);
                setMeasuredDimension(this.mCustomView.getLayoutParams().width, this.mCustomView.getLayoutParams().height);
                return;
            }
            int size = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            int tabMaxWidth = CustomTabLayout.this.getTabMaxWidth();
            if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
                i = View.MeasureSpec.makeMeasureSpec(CustomTabLayout.this.mTabMaxWidth, Integer.MIN_VALUE);
            }
            super.onMeasure(i, i2);
        }

        public void setTab(d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f77b8c6b", new Object[]{this, dVar});
            } else if (dVar == this.mTab) {
            } else {
                this.mTab = dVar;
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
            boolean z = false;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ee4a30d0", new Object[]{this});
                return;
            }
            d dVar = this.mTab;
            View b = dVar != null ? dVar.b() : null;
            if (b != null) {
                ViewParent parent = b.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(b);
                    }
                    addView(b);
                }
                this.mCustomView = b;
            } else {
                View view = this.mCustomView;
                if (view != null) {
                    removeView(view);
                    this.mCustomView = null;
                }
            }
            if (dVar != null && dVar.f()) {
                z = true;
            }
            setSelected(z);
        }

        public d getTab() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("5448d141", new Object[]{this}) : this.mTab;
        }

        private float approximateLineWidth(Layout layout, int i, float f) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a88c261d", new Object[]{this, layout, new Integer(i), new Float(f)})).floatValue() : layout.getLineWidth(i) * (f / layout.getPaint().getTextSize());
        }
    }

    /* loaded from: classes8.dex */
    public class SlidingTabStrip extends LinearLayout implements c {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private Drawable indicatorDrawable;
        private int mDiffHeight;
        private ValueAnimator mIndicatorAnimator;
        private int mIndicatorLeft;
        public int mIndicatorRight;
        private int mSelectedIndicatorHeight;
        private final Paint mSelectedIndicatorPaint;
        private int mSelectedIndicatorWidth;
        public int mSelectedPosition;
        public float mSelectionOffset;

        static {
            kge.a(-1764492629);
            kge.a(648044880);
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
                case 1273305472:
                    super.removeViewAt(((Number) objArr[0]).intValue());
                    return null;
                case 1992612095:
                    super.addView((View) objArr[0], ((Number) objArr[1]).intValue(), (ViewGroup.LayoutParams) objArr[2]);
                    return null;
                default:
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.view.tabbar.CustomTabLayout.c
        public int getCurrentImplementVersion() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("f0a83a12", new Object[]{this})).intValue();
            }
            return 1;
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.view.tabbar.CustomTabLayout.c
        public View getSelfView() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("865eef50", new Object[]{this}) : this;
        }

        public SlidingTabStrip(Context context) {
            super(context);
            this.mSelectedPosition = -1;
            this.mIndicatorLeft = -1;
            this.mIndicatorRight = -1;
            setWillNotDraw(false);
            this.mSelectedIndicatorPaint = new Paint();
        }

        @Override // android.view.ViewGroup, com.taobao.tao.flexbox.layoutmanager.view.tabbar.CustomTabLayout.c
        public void removeViewAt(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4be51980", new Object[]{this, new Integer(i)});
            } else {
                super.removeViewAt(i);
            }
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.view.tabbar.CustomTabLayout.c
        public void addView(View view, int i, ViewGroup.LayoutParams layoutParams, r rVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a5d2af37", new Object[]{this, view, new Integer(i), layoutParams, rVar});
            } else {
                super.addView(view, i, layoutParams);
            }
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.view.tabbar.CustomTabLayout.c
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

        @Override // com.taobao.tao.flexbox.layoutmanager.view.tabbar.CustomTabLayout.c
        public void setSelectedIndicatorDrawable(Drawable drawable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bedcd05b", new Object[]{this, drawable});
            } else if (drawable == this.indicatorDrawable) {
            } else {
                this.indicatorDrawable = drawable;
                ViewCompat.postInvalidateOnAnimation(this);
            }
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.view.tabbar.CustomTabLayout.c
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

        @Override // com.taobao.tao.flexbox.layoutmanager.view.tabbar.CustomTabLayout.c
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

        @Override // com.taobao.tao.flexbox.layoutmanager.view.tabbar.CustomTabLayout.c
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

        @Override // com.taobao.tao.flexbox.layoutmanager.view.tabbar.CustomTabLayout.c
        public boolean isRunningIndicatorAnimation() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("8d2c43d5", new Object[]{this})).booleanValue();
            }
            ValueAnimator valueAnimator = this.mIndicatorAnimator;
            return valueAnimator != null && valueAnimator.isRunning();
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.view.tabbar.CustomTabLayout.c
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

        @Override // com.taobao.tao.flexbox.layoutmanager.view.tabbar.CustomTabLayout.c
        public float getIndicatorPosition() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("46fca719", new Object[]{this})).floatValue() : this.mSelectedPosition + this.mSelectionOffset;
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.view.tabbar.CustomTabLayout.c
        public void setmDiffHeight(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4774cd85", new Object[]{this, new Integer(i)});
            } else {
                this.mDiffHeight = i;
            }
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
            if (View.MeasureSpec.getMode(i) != 1073741824 || CustomTabLayout.this.mMode != 1 || CustomTabLayout.this.mTabGravity != 1) {
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
            if (i3 * childCount <= getMeasuredWidth() - (CustomTabLayout.this.dpToPx(16) << 1)) {
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
                CustomTabLayout customTabLayout = CustomTabLayout.this;
                customTabLayout.mTabGravity = 0;
                customTabLayout.updateTabViews(false);
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
            } else {
                updateIndicatorPosition();
            }
            if (!CustomTabLayout.this.fixedOffset) {
                return;
            }
            CustomTabLayout.access$500(CustomTabLayout.this);
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.view.tabbar.CustomTabLayout.c
        public void updateIndicatorPosition() {
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

        @Override // com.taobao.tao.flexbox.layoutmanager.view.tabbar.CustomTabLayout.c
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
                int dpToPx = CustomTabLayout.this.dpToPx(24);
                i3 = (i >= this.mSelectedPosition ? !z : z) ? left - dpToPx : dpToPx + right;
                i4 = i3;
            }
            if (i3 == left && i4 == right) {
                return;
            }
            ValueAnimator valueAnimator2 = new ValueAnimator();
            this.mIndicatorAnimator = valueAnimator2;
            valueAnimator2.setInterpolator(new FastOutSlowInInterpolator());
            valueAnimator2.setDuration(i2);
            valueAnimator2.setFloatValues(0.0f, 1.0f);
            valueAnimator2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.taobao.tao.flexbox.layoutmanager.view.tabbar.CustomTabLayout.SlidingTabStrip.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator3) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator3});
                        return;
                    }
                    float animatedFraction = valueAnimator3.getAnimatedFraction();
                    SlidingTabStrip slidingTabStrip = SlidingTabStrip.this;
                    slidingTabStrip.setIndicatorPosition(slidingTabStrip.lerp(i3, left, animatedFraction), SlidingTabStrip.this.lerp(i4, right, animatedFraction));
                }
            });
            valueAnimator2.addListener(new Animator.AnimatorListener() { // from class: com.taobao.tao.flexbox.layoutmanager.view.tabbar.CustomTabLayout.SlidingTabStrip.2
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
                    SlidingTabStrip slidingTabStrip = SlidingTabStrip.this;
                    slidingTabStrip.mSelectedPosition = i;
                    slidingTabStrip.mSelectionOffset = 0.0f;
                }
            });
            valueAnimator2.start();
        }

        public int lerp(int i, int i2, float f) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("74398815", new Object[]{this, new Integer(i), new Integer(i2), new Float(f)})).intValue() : i + Math.round(f * (i2 - i));
        }

        @Override // android.view.View
        public void draw(Canvas canvas) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9cc013fa", new Object[]{this, canvas});
                return;
            }
            super.draw(canvas);
            int i = this.mSelectedIndicatorWidth;
            if (i <= 0) {
                return;
            }
            int i2 = ((this.mIndicatorRight - this.mIndicatorLeft) - i) / 2;
            if (i2 < 0) {
                i2 = 0;
            }
            int i3 = this.mIndicatorLeft;
            if (i3 < 0 || this.mIndicatorRight <= i3) {
                return;
            }
            Drawable drawable = this.indicatorDrawable;
            if (drawable != null) {
                drawable.setBounds(i3 + i2, (getHeight() - this.mSelectedIndicatorHeight) - this.mDiffHeight, this.mIndicatorRight - i2, getHeight() - this.mDiffHeight);
                this.indicatorDrawable.draw(canvas);
                return;
            }
            canvas.drawRect(i3 + i2, (getHeight() - this.mSelectedIndicatorHeight) - this.mDiffHeight, this.mIndicatorRight - i2, getHeight() - this.mDiffHeight, this.mSelectedIndicatorPaint);
        }
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

    public void scrollToTab(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("601c632f", new Object[]{this, new Integer(i)});
        } else {
            setScrollPosition(i, 0.0f, false, false, false);
        }
    }
}
