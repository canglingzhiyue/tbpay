package com.taobao.live.home.widget.tab;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.support.v4.util.Pools;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.TextViewCompat;
import android.support.v7.app.ActionBar;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.live.home.widget.tab.d;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.features.PhenixOptions;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tb.kge;
import tb.pro;
import tb.prr;

/* loaded from: classes7.dex */
public class XTabLayout extends HorizontalScrollView {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int ANIMATION_DURATION = 300;
    private static final int DEFAULT_GAP_TEXT_ICON = 8;
    private static final int DEFAULT_HEIGHT = 48;
    private static final int DEFAULT_HEIGHT_WITH_TEXT_ICON = 72;
    private static final int FIXED_WRAP_GUTTER_MIN = 16;
    public static final int GRAVITY_CENTER = 1;
    public static final int GRAVITY_FILL = 0;
    private static final int INVALID_WIDTH = -1;
    public static final int MODE_FIXED = 1;
    public static final int MODE_SCROLLABLE = 0;
    private static final int MOTION_NON_ADJACENT_OFFSET = 24;
    private static final int SELECTED_TAB_ADD_WIDTH = 20;
    private static final int TAB_MIN_WIDTH_MARGIN = 24;
    private static final Pools.Pool<d> sTabPool;
    private int dividerColor;
    private int dividerGravity;
    private int dividerHeight;
    private int dividerWidth;
    private int mContentInsetStart;
    private int mMode;
    private a mOnTabClickListener;
    private b mOnTabSelectedListener;
    private List<b> mOnTabSelectedListenerList;
    private e mPageChangeListener;
    private PagerAdapter mPagerAdapter;
    private DataSetObserver mPagerAdapterObserver;
    private final int mRequestedTabMaxWidth;
    private final int mRequestedTabMinWidth;
    private com.taobao.live.home.widget.tab.d mScrollAnimator;
    private final int mScrollableTabMinWidth;
    private d mSelectedTab;
    private int mTabGravity;
    private boolean mTabImageChange;
    private int mTabMaxWidth;
    private int mTabPaddingBottom;
    private int mTabPaddingEnd;
    private int mTabPaddingStart;
    private int mTabPaddingTop;
    private float mTabSelectedTextSize;
    private final SlidingTabStrip mTabStrip;
    private int mTabTextAppearance;
    private ColorStateList mTabTextColors;
    private float mTabTextMultiLineSize;
    private float mTabTextSize;
    private final Pools.Pool<TabView> mTabViewPool;
    private final ArrayList<d> mTabs;
    private ViewPager mViewPager;
    private g mXTabCustomListener;
    private final int xTabBackgroundColor;
    private int xTabDisplayNum;
    private boolean xTabDividerWidthWidthText;
    private final int xTabSelectedBackgroundColor;
    private boolean xTabTextAllCaps;
    private boolean xTabTextBold;
    private boolean xTabTextSelectedBold;
    private boolean xTabTextShadowLayer;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes7.dex */
    public @interface Mode {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes7.dex */
    public @interface TabGravity {
    }

    /* loaded from: classes7.dex */
    public interface a {
        void onTabClick(d dVar);
    }

    /* loaded from: classes7.dex */
    public interface b {
        void onTabReselected(d dVar);

        void onTabSelected(d dVar);

        void onTabUnselected(d dVar);
    }

    public static /* synthetic */ Object ipc$super(XTabLayout xTabLayout, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 650865254) {
            super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
            return null;
        } else if (hashCode != 1992612095) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.addView((View) objArr[0], ((Number) objArr[1]).intValue(), (ViewGroup.LayoutParams) objArr[2]);
            return null;
        }
    }

    public static /* synthetic */ int access$000(XTabLayout xTabLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a93dd8cd", new Object[]{xTabLayout})).intValue() : xTabLayout.dividerWidth;
    }

    public static /* synthetic */ int access$100(XTabLayout xTabLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ecc8f68e", new Object[]{xTabLayout})).intValue() : xTabLayout.dividerHeight;
    }

    public static /* synthetic */ float access$1200(XTabLayout xTabLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a2fd36fb", new Object[]{xTabLayout})).floatValue() : xTabLayout.mTabSelectedTextSize;
    }

    public static /* synthetic */ int access$1300(XTabLayout xTabLayout, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ea82b7aa", new Object[]{xTabLayout, new Integer(i)})).intValue() : xTabLayout.dpToPx(i);
    }

    public static /* synthetic */ int access$1500(XTabLayout xTabLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6d9e9041", new Object[]{xTabLayout})).intValue() : xTabLayout.mTabPaddingStart;
    }

    public static /* synthetic */ int access$1600(XTabLayout xTabLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b129ae02", new Object[]{xTabLayout})).intValue() : xTabLayout.mTabPaddingTop;
    }

    public static /* synthetic */ int access$1700(XTabLayout xTabLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f4b4cbc3", new Object[]{xTabLayout})).intValue() : xTabLayout.mTabPaddingEnd;
    }

    public static /* synthetic */ int access$1800(XTabLayout xTabLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("383fe984", new Object[]{xTabLayout})).intValue() : xTabLayout.mTabPaddingBottom;
    }

    public static /* synthetic */ int access$1900(XTabLayout xTabLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7bcb0745", new Object[]{xTabLayout})).intValue() : xTabLayout.xTabBackgroundColor;
    }

    public static /* synthetic */ int access$200(XTabLayout xTabLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3054144f", new Object[]{xTabLayout})).intValue() : xTabLayout.dividerColor;
    }

    public static /* synthetic */ boolean access$2000(XTabLayout xTabLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("49bf95ec", new Object[]{xTabLayout})).booleanValue() : xTabLayout.xTabTextShadowLayer;
    }

    public static /* synthetic */ float access$2100(XTabLayout xTabLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8d4ab399", new Object[]{xTabLayout})).floatValue() : xTabLayout.mTabTextSize;
    }

    public static /* synthetic */ boolean access$2200(XTabLayout xTabLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d0d5d16e", new Object[]{xTabLayout})).booleanValue() : xTabLayout.mTabImageChange;
    }

    public static /* synthetic */ boolean access$2300(XTabLayout xTabLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1460ef2f", new Object[]{xTabLayout})).booleanValue() : xTabLayout.xTabTextSelectedBold;
    }

    public static /* synthetic */ boolean access$2400(XTabLayout xTabLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57ec0cf0", new Object[]{xTabLayout})).booleanValue() : xTabLayout.xTabTextBold;
    }

    public static /* synthetic */ int access$2500(XTabLayout xTabLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9b772aa0", new Object[]{xTabLayout})).intValue() : xTabLayout.xTabSelectedBackgroundColor;
    }

    public static /* synthetic */ int access$2600(XTabLayout xTabLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("df024861", new Object[]{xTabLayout})).intValue() : xTabLayout.getTabMaxWidth();
    }

    public static /* synthetic */ int access$2700(XTabLayout xTabLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("228d6622", new Object[]{xTabLayout})).intValue() : xTabLayout.mTabMaxWidth;
    }

    public static /* synthetic */ float access$2800(XTabLayout xTabLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("661883e0", new Object[]{xTabLayout})).floatValue() : xTabLayout.mTabTextMultiLineSize;
    }

    public static /* synthetic */ int access$2900(XTabLayout xTabLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a9a3a1a4", new Object[]{xTabLayout})).intValue() : xTabLayout.mMode;
    }

    public static /* synthetic */ int access$300(XTabLayout xTabLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("73df3210", new Object[]{xTabLayout})).intValue() : xTabLayout.dividerGravity;
    }

    public static /* synthetic */ View access$3000(XTabLayout xTabLayout, d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("e18ae2c", new Object[]{xTabLayout, dVar}) : xTabLayout.createCustomView(dVar);
    }

    public static /* synthetic */ int access$3100(XTabLayout xTabLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("bb234dfb", new Object[]{xTabLayout})).intValue() : xTabLayout.mTabTextAppearance;
    }

    public static /* synthetic */ ColorStateList access$3200(XTabLayout xTabLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ColorStateList) ipChange.ipc$dispatch("a1b53b2b", new Object[]{xTabLayout}) : xTabLayout.mTabTextColors;
    }

    public static /* synthetic */ boolean access$3300(XTabLayout xTabLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4239898e", new Object[]{xTabLayout})).booleanValue() : xTabLayout.xTabTextAllCaps;
    }

    public static /* synthetic */ int access$3400(XTabLayout xTabLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("85c4a73e", new Object[]{xTabLayout})).intValue() : xTabLayout.mTabGravity;
    }

    public static /* synthetic */ int access$3402(XTabLayout xTabLayout, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("16240149", new Object[]{xTabLayout, new Integer(i)})).intValue();
        }
        xTabLayout.mTabGravity = i;
        return i;
    }

    public static /* synthetic */ void access$3500(XTabLayout xTabLayout, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60a98f48", new Object[]{xTabLayout, new Boolean(z)});
        } else {
            xTabLayout.updateTabViews(z);
        }
    }

    public static /* synthetic */ boolean access$3600(XTabLayout xTabLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("cdae2d1", new Object[]{xTabLayout})).booleanValue() : xTabLayout.xTabDividerWidthWidthText;
    }

    public static /* synthetic */ d access$4000(XTabLayout xTabLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("712e5613", new Object[]{xTabLayout}) : xTabLayout.mSelectedTab;
    }

    public static /* synthetic */ void access$4100(XTabLayout xTabLayout, int i, float f2, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4573944", new Object[]{xTabLayout, new Integer(i), new Float(f2), new Boolean(z), new Boolean(z2)});
        } else {
            xTabLayout.setScrollPosition(i, f2, z, z2);
        }
    }

    public static /* synthetic */ void access$4200(XTabLayout xTabLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c870628", new Object[]{xTabLayout});
        } else {
            xTabLayout.populateFromPagerAdapter();
        }
    }

    static {
        kge.a(2034187468);
        sTabPool = new Pools.SynchronizedPool(16);
    }

    public XTabLayout(Context context) {
        this(context, null);
    }

    public XTabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public XTabLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.xTabTextAllCaps = false;
        this.xTabDividerWidthWidthText = false;
        this.mTabs = new ArrayList<>();
        this.mTabTextSize = 0.0f;
        this.mTabSelectedTextSize = 0.0f;
        this.mTabMaxWidth = Integer.MAX_VALUE;
        this.mOnTabSelectedListenerList = new ArrayList();
        this.mTabViewPool = new Pools.SimplePool(12);
        com.taobao.live.home.widget.tab.c.a(context);
        setHorizontalScrollBarEnabled(false);
        this.mTabStrip = new SlidingTabStrip(context);
        this.mTabStrip.setClipChildren(false);
        this.mTabStrip.setClipToPadding(false);
        super.addView(this.mTabStrip, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.XTabLayout, i, R.style.Widget_Design_TabLayout);
        this.mTabStrip.setSelectedIndicatorHeight(obtainStyledAttributes.getDimensionPixelSize(R.styleable.XTabLayout_xTabIndicatorHeight, dpToPx(2)));
        this.mTabStrip.setmSelectedIndicatorWidth(obtainStyledAttributes.getDimensionPixelSize(R.styleable.XTabLayout_xTabIndicatorWidth, 0));
        this.mTabStrip.setSelectedIndicatorColor(obtainStyledAttributes.getColor(R.styleable.XTabLayout_xTabIndicatorColor, 0));
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(R.styleable.XTabLayout_xTabPadding, 0);
        this.mTabPaddingBottom = dimensionPixelSize;
        this.mTabPaddingEnd = dimensionPixelSize;
        this.mTabPaddingTop = dimensionPixelSize;
        this.mTabPaddingStart = dimensionPixelSize;
        this.mTabPaddingStart = obtainStyledAttributes.getDimensionPixelSize(R.styleable.XTabLayout_xTabPaddingStart, this.mTabPaddingStart);
        this.mTabPaddingTop = obtainStyledAttributes.getDimensionPixelSize(R.styleable.XTabLayout_xTabPaddingTop, this.mTabPaddingTop);
        this.mTabPaddingEnd = obtainStyledAttributes.getDimensionPixelSize(R.styleable.XTabLayout_xTabPaddingEnd, this.mTabPaddingEnd);
        this.mTabPaddingBottom = obtainStyledAttributes.getDimensionPixelSize(R.styleable.XTabLayout_xTabPaddingBottom, this.mTabPaddingBottom);
        this.xTabTextAllCaps = obtainStyledAttributes.getBoolean(R.styleable.XTabLayout_xTabTextAllCaps, false);
        this.mTabTextAppearance = obtainStyledAttributes.getResourceId(R.styleable.XTabLayout_xTabTextAppearance, R.style.TextAppearance_Design_Tab);
        this.mTabTextSize = obtainStyledAttributes.getDimensionPixelSize(R.styleable.XTabLayout_xTabTextSize, 0);
        this.xTabTextBold = obtainStyledAttributes.getBoolean(R.styleable.XTabLayout_xTabTextBold, false);
        this.mTabSelectedTextSize = obtainStyledAttributes.getDimensionPixelSize(R.styleable.XTabLayout_xTabSelectedTextSize, 0);
        this.xTabTextSelectedBold = obtainStyledAttributes.getBoolean(R.styleable.XTabLayout_xTabTextSelectedBold, false);
        this.xTabTextShadowLayer = obtainStyledAttributes.getBoolean(R.styleable.XTabLayout_xTabTextShadowLayer, false);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(this.mTabTextAppearance, R.styleable.TextAppearance);
        try {
            if (this.mTabTextSize == 0.0f) {
                this.mTabTextSize = obtainStyledAttributes2.getDimensionPixelSize(R.styleable.TextAppearance_android_textSize, 0);
            }
            this.mTabTextColors = obtainStyledAttributes2.getColorStateList(R.styleable.TextAppearance_android_textColor);
            obtainStyledAttributes2.recycle();
            if (obtainStyledAttributes.hasValue(R.styleable.XTabLayout_xTabTextColor)) {
                this.mTabTextColors = obtainStyledAttributes.getColorStateList(R.styleable.XTabLayout_xTabTextColor);
            }
            if (obtainStyledAttributes.hasValue(R.styleable.XTabLayout_xTabSelectedTextColor)) {
                this.mTabTextColors = createColorStateList(this.mTabTextColors.getDefaultColor(), obtainStyledAttributes.getColor(R.styleable.XTabLayout_xTabSelectedTextColor, 0));
            }
            this.xTabDisplayNum = obtainStyledAttributes.getInt(R.styleable.XTabLayout_xTabDisplayNum, 0);
            this.mRequestedTabMinWidth = obtainStyledAttributes.getDimensionPixelSize(R.styleable.XTabLayout_xTabMinWidth, -1);
            this.mRequestedTabMaxWidth = obtainStyledAttributes.getDimensionPixelSize(R.styleable.XTabLayout_xTabMaxWidth, -1);
            this.xTabBackgroundColor = obtainStyledAttributes.getColor(R.styleable.XTabLayout_xTabBackgroundColor, 0);
            this.xTabSelectedBackgroundColor = obtainStyledAttributes.getColor(R.styleable.XTabLayout_xTabSelectedBackgroundColor, 0);
            this.mContentInsetStart = obtainStyledAttributes.getDimensionPixelSize(R.styleable.XTabLayout_xTabContentStart, 0);
            this.mMode = obtainStyledAttributes.getInt(R.styleable.XTabLayout_xTabMode, 1);
            this.mTabGravity = obtainStyledAttributes.getInt(R.styleable.XTabLayout_xTabGravity, 0);
            this.dividerWidth = obtainStyledAttributes.getDimensionPixelSize(R.styleable.XTabLayout_xTabDividerWidth, 0);
            this.dividerHeight = obtainStyledAttributes.getDimensionPixelSize(R.styleable.XTabLayout_xTabDividerHeight, 0);
            this.dividerColor = obtainStyledAttributes.getColor(R.styleable.XTabLayout_xTabDividerColor, -16777216);
            this.dividerGravity = obtainStyledAttributes.getInteger(R.styleable.XTabLayout_xTabDividerGravity, 1);
            this.xTabDividerWidthWidthText = obtainStyledAttributes.getBoolean(R.styleable.XTabLayout_xTabDividerWidthWidthText, false);
            obtainStyledAttributes.recycle();
            this.mTabTextMultiLineSize = getResources().getDimensionPixelSize(R.dimen.design_tab_text_size_2line);
            this.mScrollableTabMinWidth = dpToPx(36);
            applyModeAndGravity();
            addDivider();
        } catch (Throwable th) {
            obtainStyledAttributes2.recycle();
            throw th;
        }
    }

    private void addDivider() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d00693bf", new Object[]{this});
        } else {
            post(new Runnable() { // from class: com.taobao.live.home.widget.tab.XTabLayout.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (XTabLayout.access$000(XTabLayout.this) <= 0) {
                    } else {
                        LinearLayout linearLayout = (LinearLayout) XTabLayout.this.getChildAt(0);
                        linearLayout.setShowDividers(2);
                        com.taobao.live.home.widget.tab.b bVar = new com.taobao.live.home.widget.tab.b(XTabLayout.this.getContext());
                        bVar.a(XTabLayout.access$000(XTabLayout.this), XTabLayout.access$100(XTabLayout.this));
                        bVar.a(XTabLayout.access$200(XTabLayout.this));
                        bVar.b(XTabLayout.access$300(XTabLayout.this));
                        linearLayout.setDividerDrawable(bVar);
                    }
                }
            });
        }
    }

    public void setDividerSize(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c0b321f", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.dividerWidth = i;
        this.dividerHeight = i2;
        addDivider();
    }

    public void setDividerColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("880bad90", new Object[]{this, new Integer(i)});
            return;
        }
        this.dividerColor = i;
        addDivider();
    }

    public void setDividerGravity(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78c773c5", new Object[]{this, new Integer(i)});
            return;
        }
        this.dividerGravity = i;
        addDivider();
    }

    public void setAllCaps(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76d061cd", new Object[]{this, new Boolean(z)});
        } else {
            this.xTabTextAllCaps = z;
        }
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

    public void setxTabDisplayNum(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("379d5119", new Object[]{this, new Integer(i)});
        } else {
            this.xTabDisplayNum = i;
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

    private void setScrollPosition(int i, float f2, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e1c297c", new Object[]{this, new Integer(i), new Float(f2), new Boolean(z), new Boolean(z2)});
            return;
        }
        int round = Math.round(i + f2);
        if (round < 0 || round >= this.mTabStrip.getChildCount()) {
            return;
        }
        if (z2) {
            this.mTabStrip.setIndicatorPositionFromTabPosition(i, f2);
        }
        com.taobao.live.home.widget.tab.d dVar = this.mScrollAnimator;
        if (dVar != null && dVar.b()) {
            this.mScrollAnimator.d();
        }
        scrollTo(calculateScrollXForTab(i, f2), 0);
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
            ipChange.ipc$dispatch("182acade", new Object[]{this, dVar});
        } else {
            addTab(dVar, this.mTabs.isEmpty());
        }
    }

    public void addTab(d dVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed2f03e5", new Object[]{this, dVar, new Integer(i)});
        } else {
            addTab(dVar, i, this.mTabs.isEmpty());
        }
    }

    public void addTab(d dVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed2f43b6", new Object[]{this, dVar, new Boolean(z)});
        } else if (d.a(dVar) != this) {
            throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
        } else {
            addTabView(dVar, z);
            configureTab(dVar, this.mTabs.size());
            if (!z) {
                return;
            }
            dVar.m();
        }
    }

    public void addTab(d dVar, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8b22b8f", new Object[]{this, dVar, new Integer(i), new Boolean(z)});
        } else if (d.a(dVar) != this) {
            throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
        } else {
            addTabView(dVar, i, z);
            configureTab(dVar, i);
            if (!z) {
                return;
            }
            dVar.m();
        }
    }

    private void addTabFromItemView(TabItem tabItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d454a861", new Object[]{this, tabItem});
            return;
        }
        d newTab = newTab();
        if (tabItem.mText != null) {
            newTab.a(tabItem.mText);
        }
        if (tabItem.mIcon != null) {
            newTab.a(tabItem.mIcon);
        }
        if (tabItem.mCustomLayout != 0) {
            newTab.a(tabItem.mCustomLayout);
        }
        addTab(newTab);
    }

    public void setOnTabSelectedListener(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31a9b7af", new Object[]{this, bVar});
        } else {
            this.mOnTabSelectedListener = bVar;
        }
    }

    public void addOnTabSelectedListener(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a00fe90", new Object[]{this, bVar});
        } else {
            this.mOnTabSelectedListenerList.add(bVar);
        }
    }

    public void setOnTabClickListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af940a55", new Object[]{this, aVar});
        } else {
            this.mOnTabClickListener = aVar;
        }
    }

    public d newTab() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("538e549d", new Object[]{this});
        }
        d acquire = sTabPool.acquire();
        if (acquire == null) {
            acquire = new d();
        }
        d.a(acquire, this);
        d.a(acquire, createTabView(acquire));
        return acquire;
    }

    public d newTab(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("e2d20bb2", new Object[]{this, new Integer(i)});
        }
        d acquire = sTabPool.acquire();
        if (acquire == null) {
            acquire = new d();
        }
        d.a(acquire, this);
        acquire.o = i;
        d.a(acquire, createTabView(acquire));
        return acquire;
    }

    public int getTabCount() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9428606a", new Object[]{this})).intValue() : this.mTabs.size();
    }

    public d getTabAt(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("31d7cd8f", new Object[]{this, new Integer(i)}) : this.mTabs.get(i);
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
        return dVar.k();
    }

    public void removeTab(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35b3f2db", new Object[]{this, dVar});
        } else if (d.a(dVar) != this) {
            throw new IllegalArgumentException("Tab does not belong to this TabLayout.");
        } else {
            removeTabAt(dVar.k());
        }
    }

    public void removeTabAt(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("181e3158", new Object[]{this, new Integer(i)});
            return;
        }
        d dVar = this.mSelectedTab;
        int k = dVar != null ? dVar.k() : 0;
        removeTabViewAt(i);
        d remove = this.mTabs.remove(i);
        if (remove != null) {
            d.b(remove);
            sTabPool.release(remove);
        }
        int size = this.mTabs.size();
        for (int i2 = i; i2 < size; i2++) {
            this.mTabs.get(i2).b(i2);
        }
        if (k != i) {
            return;
        }
        selectTab(this.mTabs.isEmpty() ? null : this.mTabs.get(Math.max(0, i - 1)));
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
            d.b(next);
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

    public void setTabImageChange(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bc97715", new Object[]{this, new Boolean(z)});
        } else {
            this.mTabImageChange = z;
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
        e eVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33a2c3ba", new Object[]{this, viewPager});
            return;
        }
        ViewPager viewPager2 = this.mViewPager;
        if (viewPager2 != null && (eVar = this.mPageChangeListener) != null) {
            viewPager2.removeOnPageChangeListener(eVar);
        }
        if (viewPager != null) {
            PagerAdapter adapter = viewPager.getAdapter();
            if (adapter == null) {
                throw new IllegalArgumentException("ViewPager does not have a PagerAdapter set");
            }
            this.mViewPager = viewPager;
            if (this.mPageChangeListener == null) {
                this.mPageChangeListener = new e(this);
            }
            e.a(this.mPageChangeListener);
            viewPager.addOnPageChangeListener(this.mPageChangeListener);
            setOnTabSelectedListener(new f(viewPager));
            setPagerAdapter(adapter, true);
            return;
        }
        this.mViewPager = null;
        setOnTabSelectedListener(null);
        setPagerAdapter(null, true);
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

    private int getTabScrollRange() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("40fd048b", new Object[]{this})).intValue() : Math.max(0, ((this.mTabStrip.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    private void setPagerAdapter(PagerAdapter pagerAdapter, boolean z) {
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
                this.mPagerAdapterObserver = new c();
            }
            pagerAdapter.registerDataSetObserver(this.mPagerAdapterObserver);
        }
        populateFromPagerAdapter();
    }

    private void populateFromPagerAdapter() {
        int currentItem;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfd80467", new Object[]{this});
            return;
        }
        removeAllTabs();
        PagerAdapter pagerAdapter = this.mPagerAdapter;
        if (pagerAdapter != null) {
            int count = pagerAdapter.getCount();
            for (int i = 0; i < count; i++) {
                if (prr.B()) {
                    CharSequence pageTitle = this.mPagerAdapter.getPageTitle(i);
                    d newTab = newTab(i);
                    if (pageTitle != null) {
                        String str = (String) pageTitle;
                        if (!pro.e(str)) {
                            try {
                                JSONObject parseObject = JSON.parseObject(str);
                                String string = parseObject.getString("name");
                                JSONObject jSONObject = parseObject.getJSONObject("tabPic");
                                boolean d2 = !pro.e(parseObject.getString("setShadowLaye")) ? pro.d(parseObject.getString("setShadowLaye")) : false;
                                newTab.a((CharSequence) string);
                                if (jSONObject != null) {
                                    String string2 = jSONObject.getString("normalColorNoSelectIcon");
                                    String string3 = jSONObject.getString("normalColorSelectIcon");
                                    String string4 = jSONObject.getString("changeColorSelectIcon");
                                    String string5 = jSONObject.getString("changeColorNoSelectIcon");
                                    newTab.a(d2);
                                    newTab.c(string4);
                                    newTab.d(string5);
                                    newTab.b(string3);
                                    newTab.a(string2);
                                }
                            } catch (Exception unused) {
                                newTab.a(this.mPagerAdapter.getPageTitle(i));
                            }
                        }
                    }
                    addTab(newTab, false);
                } else {
                    addTab(newTab(i).a(this.mPagerAdapter.getPageTitle(i)), false);
                }
            }
            ViewPager viewPager = this.mViewPager;
            if (viewPager == null || count <= 0 || (currentItem = viewPager.getCurrentItem()) == getSelectedTabPosition() || currentItem >= getTabCount()) {
                return;
            }
            selectTab(getTabAt(currentItem));
            return;
        }
        removeAllTabs();
    }

    private void updateAllTabs() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9157bd3d", new Object[]{this});
            return;
        }
        int size = this.mTabs.size();
        for (int i = 0; i < size; i++) {
            d.c(this.mTabs.get(i));
        }
    }

    private TabView createTabView(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TabView) ipChange.ipc$dispatch("1dc3c37b", new Object[]{this, dVar});
        }
        Pools.Pool<TabView> pool = this.mTabViewPool;
        TabView acquire = pool != null ? pool.acquire() : null;
        if (acquire == null) {
            acquire = new TabView(getContext());
        }
        TabView.access$1100(acquire, dVar);
        acquire.setFocusable(true);
        acquire.setMinimumWidth(getTabMinWidth());
        return acquire;
    }

    private void configureTab(d dVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0a2686a", new Object[]{this, dVar, new Integer(i)});
            return;
        }
        dVar.b(i);
        this.mTabs.add(i, dVar);
        int size = this.mTabs.size();
        for (int i2 = i + 1; i2 < size; i2++) {
            this.mTabs.get(i2).b(i2);
        }
    }

    private void addTabView(d dVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88f39ad1", new Object[]{this, dVar, new Boolean(z)});
            return;
        }
        final TabView d2 = d.d(dVar);
        if (this.mTabSelectedTextSize != 0.0f) {
            d2.post(new Runnable() { // from class: com.taobao.live.home.widget.tab.XTabLayout.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    int width = d2.getWidth();
                    String text = d2.getText();
                    if (TextUtils.isEmpty(text)) {
                        return;
                    }
                    Paint paint = new Paint();
                    paint.setTextSize(XTabLayout.access$1200(XTabLayout.this));
                    Rect rect = new Rect();
                    paint.getTextBounds(text, 0, text.length(), rect);
                    if (width - rect.width() >= XTabLayout.access$1300(XTabLayout.this, 20)) {
                        return;
                    }
                    int width2 = rect.width() + XTabLayout.access$1300(XTabLayout.this, 20);
                    ViewGroup.LayoutParams layoutParams = d2.getLayoutParams();
                    layoutParams.width = width2;
                    d2.setLayoutParams(layoutParams);
                }
            });
        }
        this.mTabStrip.addView(d2, createLayoutParamsForTabs());
        if (!z) {
            return;
        }
        d2.setSelected(true);
    }

    private void addTabView(d dVar, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9578b7d4", new Object[]{this, dVar, new Integer(i), new Boolean(z)});
            return;
        }
        TabView d2 = d.d(dVar);
        this.mTabStrip.addView(d2, i, createLayoutParamsForTabs());
        if (!z) {
            return;
        }
        d2.setSelected(true);
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

    private int dpToPx(int i) {
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
            String str = "specWidth:" + size;
            PagerAdapter pagerAdapter = this.mPagerAdapter;
            if (pagerAdapter != null && this.xTabDisplayNum != 0) {
                if (pagerAdapter.getCount() == 1 || this.xTabDisplayNum == 1) {
                    this.mTabMaxWidth = ((WindowManager) getContext().getSystemService(com.taobao.android.weex_framework.util.a.ATOM_EXT_window)).getDefaultDisplay().getWidth();
                } else {
                    int i3 = this.mRequestedTabMaxWidth;
                    if (i3 <= 0) {
                        i3 = size - dpToPx(24);
                    }
                    this.mTabMaxWidth = i3;
                }
            } else {
                int i4 = this.mRequestedTabMaxWidth;
                if (i4 <= 0) {
                    i4 = size - dpToPx(24);
                }
                this.mTabMaxWidth = i4;
            }
        }
        super.onMeasure(i, i2);
        if (getChildCount() != 1) {
            return;
        }
        View childAt = getChildAt(0);
        int i5 = this.mMode;
        if (i5 == 0 ? childAt.getMeasuredWidth() < getMeasuredWidth() : !(i5 != 1 || childAt.getMeasuredWidth() == getMeasuredWidth())) {
            z = true;
        }
        if (!z) {
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), getChildMeasureSpec(i2, getPaddingTop() + getPaddingBottom(), childAt.getLayoutParams().height));
    }

    private void removeTabViewAt(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ea7b73", new Object[]{this, new Integer(i)});
            return;
        }
        View childAt = this.mTabStrip.getChildAt(i);
        this.mTabStrip.removeViewAt(i);
        if (childAt instanceof TabView) {
            TabView.access$1400((TabView) childAt);
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
                if (this.mScrollAnimator == null) {
                    this.mScrollAnimator = com.taobao.live.home.widget.tab.f.a();
                    this.mScrollAnimator.a(com.taobao.live.home.widget.tab.a.f17773a);
                    this.mScrollAnimator.a(300);
                    this.mScrollAnimator.a(new d.c() { // from class: com.taobao.live.home.widget.tab.XTabLayout.3
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.taobao.live.home.widget.tab.d.c
                        public void a(com.taobao.live.home.widget.tab.d dVar) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("ecb241a", new Object[]{this, dVar});
                            } else {
                                XTabLayout.this.scrollTo(dVar.c(), 0);
                            }
                        }
                    });
                }
                this.mScrollAnimator.a(scrollX, calculateScrollXForTab);
                this.mScrollAnimator.a();
            }
            this.mTabStrip.animateIndicatorToPosition(i, 300);
        }
    }

    private void setSelectedTabView(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1085d7f", new Object[]{this, new Integer(i)});
            return;
        }
        int childCount = this.mTabStrip.getChildCount();
        if (i >= childCount || this.mTabStrip.getChildAt(i).isSelected()) {
            return;
        }
        int i2 = 0;
        while (i2 < childCount) {
            this.mTabStrip.getChildAt(i2).setSelected(i2 == i);
            i2++;
        }
    }

    public void selectTab(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b109163", new Object[]{this, dVar});
        } else {
            selectTab(dVar, true);
        }
    }

    public void selectTab(d dVar, boolean z) {
        a aVar;
        b bVar;
        b bVar2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7024dd1", new Object[]{this, dVar, new Boolean(z)});
            return;
        }
        d dVar2 = this.mSelectedTab;
        if (dVar2 == dVar) {
            if (dVar2 == null) {
                return;
            }
            b bVar3 = this.mOnTabSelectedListener;
            if (bVar3 != null) {
                bVar3.onTabReselected(dVar2);
            }
            for (b bVar4 : this.mOnTabSelectedListenerList) {
                bVar4.onTabReselected(this.mSelectedTab);
            }
            animateToTab(dVar.k());
            return;
        }
        if (z) {
            int k = dVar != null ? dVar.k() : -1;
            if (k != -1) {
                setSelectedTabView(k);
            }
            d dVar3 = this.mSelectedTab;
            if ((dVar3 == null || dVar3.k() == -1) && k != -1) {
                setScrollPosition(k, 0.0f, true);
            } else {
                animateToTab(k);
            }
        }
        d dVar4 = this.mSelectedTab;
        if (dVar4 != null && (bVar2 = this.mOnTabSelectedListener) != null) {
            bVar2.onTabUnselected(dVar4);
        }
        for (b bVar5 : this.mOnTabSelectedListenerList) {
            bVar5.onTabUnselected(this.mSelectedTab);
        }
        this.mSelectedTab = dVar;
        d dVar5 = this.mSelectedTab;
        if (dVar5 != null && (bVar = this.mOnTabSelectedListener) != null) {
            bVar.onTabSelected(dVar5);
        }
        d dVar6 = this.mSelectedTab;
        if (dVar6 != null && (aVar = this.mOnTabClickListener) != null && z) {
            aVar.onTabClick(dVar6);
        }
        for (b bVar6 : this.mOnTabSelectedListenerList) {
            bVar6.onTabSelected(this.mSelectedTab);
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
        return ((childAt.getLeft() + ((int) (((width + i2) * f2) * 0.5f))) + (childAt.getWidth() / 2)) - (getWidth() / 2);
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

    private void updateTabViews(boolean z) {
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

    /* loaded from: classes7.dex */
    public static final class d {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final int INVALID_POSITION = -1;

        /* renamed from: a  reason: collision with root package name */
        private Object f17770a;
        private Drawable b;
        private String c;
        private CharSequence d;
        private CharSequence e;
        private int f;
        private View g;
        private XTabLayout h;
        private TabView i;
        private String j;
        private String k;
        private String l;
        private String m;
        private boolean n;
        public int o;

        static {
            kge.a(445488029);
        }

        public static /* synthetic */ TabView a(d dVar, TabView tabView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TabView) ipChange.ipc$dispatch("3cebf08b", new Object[]{dVar, tabView});
            }
            dVar.i = tabView;
            return tabView;
        }

        public static /* synthetic */ XTabLayout a(d dVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (XTabLayout) ipChange.ipc$dispatch("39d478e", new Object[]{dVar}) : dVar.h;
        }

        public static /* synthetic */ XTabLayout a(d dVar, XTabLayout xTabLayout) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (XTabLayout) ipChange.ipc$dispatch("cc0d044b", new Object[]{dVar, xTabLayout});
            }
            dVar.h = xTabLayout;
            return xTabLayout;
        }

        public static /* synthetic */ void b(d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9491e48c", new Object[]{dVar});
            } else {
                dVar.p();
            }
        }

        public static /* synthetic */ void c(d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d81d024d", new Object[]{dVar});
            } else {
                dVar.o();
            }
        }

        public static /* synthetic */ TabView d(d dVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (TabView) ipChange.ipc$dispatch("23979215", new Object[]{dVar}) : dVar.i;
        }

        private d() {
            this.f = -1;
        }

        public boolean a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.n;
        }

        public void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            } else {
                this.n = z;
            }
        }

        public String b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.j;
        }

        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            } else {
                this.j = str;
            }
        }

        public String c() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : this.k;
        }

        public void b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            } else {
                this.k = str;
            }
        }

        public String d() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[]{this}) : this.l;
        }

        public void c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
            } else {
                this.l = str;
            }
        }

        public String e() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : this.m;
        }

        public void d(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
            } else {
                this.m = str;
            }
        }

        public int f() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5b2e1e0", new Object[]{this})).intValue() : this.i.getTextWidth();
        }

        public View g() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View) ipChange.ipc$dispatch("d6895230", new Object[]{this});
            }
            TabView tabView = this.i;
            return tabView != null ? tabView.getCustomView() : this.g;
        }

        public TabView h() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (TabView) ipChange.ipc$dispatch("3fca4f94", new Object[]{this}) : this.i;
        }

        public d a(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("4e0cabcf", new Object[]{this, view});
            }
            this.g = view;
            o();
            return this;
        }

        public d a(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("f28d173e", new Object[]{this, new Integer(i)}) : a(LayoutInflater.from(this.i.getContext()).inflate(i, (ViewGroup) this.i, false));
        }

        public Drawable i() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Drawable) ipChange.ipc$dispatch("d768ab4a", new Object[]{this}) : this.b;
        }

        public String j() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6aaa74cf", new Object[]{this}) : this.c;
        }

        public int k() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5f95765", new Object[]{this})).intValue() : this.f;
        }

        public void b(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            } else {
                this.f = i;
            }
        }

        public CharSequence l() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (CharSequence) ipChange.ipc$dispatch("2fb09767", new Object[]{this}) : this.d;
        }

        public d a(Drawable drawable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("31a2e2ed", new Object[]{this, drawable});
            }
            this.b = drawable;
            o();
            return this;
        }

        public d e(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("528fd983", new Object[]{this, str});
            }
            this.c = str;
            o();
            return this;
        }

        public d a(CharSequence charSequence) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("2568b56d", new Object[]{this, charSequence});
            }
            this.d = charSequence;
            o();
            return this;
        }

        public void m() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6158674", new Object[]{this});
                return;
            }
            XTabLayout xTabLayout = this.h;
            if (xTabLayout == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            xTabLayout.selectTab(this);
        }

        public boolean q() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("64de47c", new Object[]{this})).booleanValue();
            }
            XTabLayout xTabLayout = this.h;
            if (xTabLayout == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            return xTabLayout.getSelectedTabPosition() == this.f;
        }

        public CharSequence n() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (CharSequence) ipChange.ipc$dispatch("1152a625", new Object[]{this}) : this.e;
        }

        private void o() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("631b576", new Object[]{this});
                return;
            }
            TabView tabView = this.i;
            if (tabView == null) {
                return;
            }
            tabView.update();
        }

        private void p() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("63fccf7", new Object[]{this});
                return;
            }
            this.h = null;
            this.i = null;
            this.f17770a = null;
            this.b = null;
            this.d = null;
            this.e = null;
            this.f = -1;
            this.g = null;
        }
    }

    public void setXTabCustomListener(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8a29394", new Object[]{this, gVar});
        } else {
            this.mXTabCustomListener = gVar;
        }
    }

    private View createCustomView(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("89afc53e", new Object[]{this, dVar});
        }
        g gVar = this.mXTabCustomListener;
        if (gVar == null) {
            return null;
        }
        return gVar.a(dVar);
    }

    /* loaded from: classes7.dex */
    public class TabView extends LinearLayout implements View.OnLongClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private AnimatorSet animatorSet;
        private View mAnimView;
        private ImageView mCustomIconView;
        private TextView mCustomTextView;
        private View mCustomView;
        private int mDefaultMaxLines;
        private View mIconView;
        private TUrlImageView mTUrlImageView;
        private d mTab;
        private TUrlImageView mTabImageView;
        private TextView mTextView;

        static {
            kge.a(-1659554846);
            kge.a(1426707756);
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

        public static /* synthetic */ void access$1100(TabView tabView, d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5cf839d7", new Object[]{tabView, dVar});
            } else {
                tabView.setTab(dVar);
            }
        }

        public static /* synthetic */ void access$1400(TabView tabView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d36b7ab7", new Object[]{tabView});
            } else {
                tabView.reset();
            }
        }

        public TabView(Context context) {
            super(context);
            this.mDefaultMaxLines = 2;
            ViewCompat.setPaddingRelative(this, XTabLayout.access$1500(XTabLayout.this), XTabLayout.access$1600(XTabLayout.this), XTabLayout.access$1700(XTabLayout.this), XTabLayout.access$1800(XTabLayout.this));
            setGravity(17);
            setOrientation(0);
            setClickable(true);
        }

        public View getCustomView() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("4c7fb1b5", new Object[]{this}) : this.mCustomView;
        }

        public String getText() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("97297536", new Object[]{this});
            }
            TextView textView = this.mTextView;
            return textView == null ? "" : textView.getText().toString();
        }

        public int getTextWidth() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("ca9d78dd", new Object[]{this})).intValue();
            }
            TextView textView = this.mTextView;
            if (textView == null || TextUtils.isEmpty(textView.getText().toString())) {
                return 0;
            }
            Rect rect = new Rect();
            String charSequence = this.mTextView.getText().toString();
            this.mTextView.getPaint().getTextBounds(charSequence, 0, charSequence.length(), rect);
            return rect.width();
        }

        @Override // android.view.View
        public boolean performClick() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("69bd3bb2", new Object[]{this})).booleanValue();
            }
            boolean performClick = super.performClick();
            d dVar = this.mTab;
            if (dVar == null) {
                return performClick;
            }
            dVar.m();
            return true;
        }

        @Override // android.view.View
        public void setSelected(boolean z) {
            String c;
            d dVar;
            String b;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a4325830", new Object[]{this, new Boolean(z)});
                return;
            }
            boolean z2 = isSelected() != z;
            super.setSelected(z);
            if (!z) {
                if (XTabLayout.access$1900(XTabLayout.this) != 0) {
                    setBackgroundColor(XTabLayout.access$1900(XTabLayout.this));
                }
                TextView textView = this.mTextView;
                if (textView != null && textView.getText() != null) {
                    if (XTabLayout.access$2000(XTabLayout.this) && prr.A()) {
                        this.mTextView.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
                    }
                    this.mTextView.setTextSize(0, XTabLayout.access$2100(XTabLayout.this));
                    this.mTextView.invalidate();
                }
                TUrlImageView tUrlImageView = this.mTabImageView;
                if (tUrlImageView != null && this.mTab != null) {
                    String imageUrl = tUrlImageView.getImageUrl();
                    if (XTabLayout.access$2200(XTabLayout.this)) {
                        b = this.mTab.e();
                    } else {
                        b = this.mTab.b();
                    }
                    if (!pro.e(b) && !b.equals(imageUrl)) {
                        this.mTabImageView.setImageUrl(b);
                        try {
                            float F = prr.F();
                            float E = prr.E();
                            if (prr.C() && b.contains(".") && b.contains("/")) {
                                String substring = b.substring(b.lastIndexOf("/") + 1, b.lastIndexOf("."));
                                if (!pro.e(substring) && substring.contains("-")) {
                                    String[] split = substring.split("-");
                                    if (split.length > 2) {
                                        String str = split[split.length - 1];
                                        String str2 = split[split.length - 2];
                                        if (!pro.e(str) && !pro.e(str2)) {
                                            F = pro.c(str);
                                            E = pro.c(str2);
                                        }
                                    }
                                }
                            }
                            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.mTabImageView.getLayoutParams();
                            this.mTabImageView.getLayoutParams();
                            if (layoutParams != null) {
                                layoutParams.height = (int) (XTabLayout.access$2100(XTabLayout.this) * 1.5d);
                                layoutParams.width = (int) ((layoutParams.height * E) / F);
                                layoutParams.leftMargin = prr.H() + 24;
                                layoutParams.rightMargin = prr.H() + 24;
                                layoutParams.bottomMargin = ((int) (XTabLayout.access$2100(XTabLayout.this) / 4.0f)) + prr.G();
                                this.mTabImageView.setLayoutParams(layoutParams);
                            }
                        } catch (Exception unused) {
                        }
                    }
                }
            }
            TextView textView2 = this.mTextView;
            if (textView2 != null) {
                if (z) {
                    if (XTabLayout.access$2300(XTabLayout.this) || XTabLayout.access$2400(XTabLayout.this)) {
                        this.mTextView.setTypeface(Typeface.defaultFromStyle(1));
                    }
                } else {
                    textView2.setTypeface(Typeface.defaultFromStyle(0));
                }
            }
            if (!z2 || !z) {
                return;
            }
            if (XTabLayout.access$2500(XTabLayout.this) != 0) {
                setBackgroundColor(XTabLayout.access$2500(XTabLayout.this));
            }
            sendAccessibilityEvent(4);
            TextView textView3 = this.mTextView;
            if (textView3 != null && textView3.getText() != null) {
                if (XTabLayout.access$2000(XTabLayout.this) && prr.A() && (dVar = this.mTab) != null && dVar.a()) {
                    this.mTextView.setShadowLayer(5.0f, 0.0f, 1.0f, Color.parseColor("#33343434"));
                }
                this.mTextView.setSelected(z);
                this.mTextView.setAlpha(1.0f);
                if (XTabLayout.access$1200(XTabLayout.this) != 0.0f) {
                    this.mTextView.setTextSize(0, XTabLayout.access$1200(XTabLayout.this));
                }
            }
            View view = this.mIconView;
            if (view != null) {
                view.setSelected(z);
            }
            TUrlImageView tUrlImageView2 = this.mTabImageView;
            if (tUrlImageView2 == null || this.mTab == null) {
                return;
            }
            String imageUrl2 = tUrlImageView2.getImageUrl();
            if (XTabLayout.access$2200(XTabLayout.this)) {
                c = this.mTab.d();
            } else {
                c = this.mTab.c();
            }
            if (pro.e(c) || c.equals(imageUrl2)) {
                return;
            }
            this.mTabImageView.setImageUrl(c);
            try {
                float F2 = prr.F();
                float E2 = prr.E();
                if (prr.C() && c.contains(".") && c.contains("/")) {
                    String substring2 = c.substring(c.lastIndexOf("/") + 1, c.lastIndexOf("."));
                    if (!pro.e(substring2) && substring2.contains("-")) {
                        String[] split2 = substring2.split("-");
                        if (split2.length > 2) {
                            String str3 = split2[split2.length - 1];
                            String str4 = split2[split2.length - 2];
                            if (!pro.e(str3) && !pro.e(str4)) {
                                F2 = pro.c(str3);
                                E2 = pro.c(str4);
                            }
                        }
                    }
                }
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.mTabImageView.getLayoutParams();
                this.mTabImageView.getLayoutParams();
                if (layoutParams2 == null) {
                    return;
                }
                layoutParams2.height = (int) (XTabLayout.access$2100(XTabLayout.this) * 1.5d);
                layoutParams2.width = (int) ((layoutParams2.height * E2) / F2);
                layoutParams2.leftMargin = prr.H() + 24;
                layoutParams2.rightMargin = prr.H() + 24;
                layoutParams2.bottomMargin = ((int) (XTabLayout.access$2100(XTabLayout.this) / 4.0f)) + prr.G();
                this.mTabImageView.setLayoutParams(layoutParams2);
            } catch (Exception unused2) {
            }
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
            int access$2600 = XTabLayout.access$2600(XTabLayout.this);
            View view = this.mIconView;
            boolean z2 = view != null && view.getVisibility() == 0;
            if (access$2600 > 0 && (mode == 0 || size > access$2600 || z2)) {
                i = View.MeasureSpec.makeMeasureSpec(XTabLayout.access$2700(XTabLayout.this), Integer.MIN_VALUE);
            }
            super.onMeasure(i, i2);
            TextView textView = this.mTextView;
            if (textView == null || textView.getText() == null) {
                return;
            }
            getResources();
            float access$2100 = XTabLayout.access$2100(XTabLayout.this);
            int i3 = this.mDefaultMaxLines;
            View view2 = this.mIconView;
            if (view2 == null || view2.getVisibility() != 0) {
                TextView textView2 = this.mTextView;
                if (textView2 != null && textView2.getLineCount() > 1) {
                    access$2100 = XTabLayout.access$2800(XTabLayout.this);
                }
            } else {
                i3 = 1;
            }
            float textSize = this.mTextView.getTextSize();
            int lineCount = this.mTextView.getLineCount();
            int maxLines = TextViewCompat.getMaxLines(this.mTextView);
            int i4 = (access$2100 > textSize ? 1 : (access$2100 == textSize ? 0 : -1));
            if (i4 == 0 && (maxLines < 0 || i3 == maxLines)) {
                return;
            }
            if (XTabLayout.access$2900(XTabLayout.this) == 1 && i4 > 0 && lineCount == 1 && ((layout = this.mTextView.getLayout()) == null || approximateLineWidth(layout, 0, access$2100) > layout.getWidth())) {
                z = false;
            }
            if (!z) {
                return;
            }
            if (this.mTextView.isSelected() && XTabLayout.access$1200(XTabLayout.this) != 0.0f) {
                this.mTextView.setTextSize(0, XTabLayout.access$1200(XTabLayout.this));
            } else {
                this.mTextView.setTextSize(0, XTabLayout.access$2100(XTabLayout.this));
            }
            this.mTextView.setMaxLines(i3);
            super.onMeasure(i, i2);
        }

        private void setTab(d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f908ddbd", new Object[]{this, dVar});
            } else if (dVar == this.mTab) {
            } else {
                this.mTab = dVar;
                update();
            }
        }

        private void reset() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("788e6256", new Object[]{this});
                return;
            }
            setTab(null);
            setSelected(false);
        }

        public final void update() {
            View view;
            View inflate;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ee4a30d0", new Object[]{this});
                return;
            }
            d dVar = this.mTab;
            if (dVar != null) {
                view = dVar.g() == null ? XTabLayout.access$3000(XTabLayout.this, dVar) : dVar.g();
            } else {
                view = null;
            }
            if (view != null) {
                ViewParent parent = view.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(view);
                    }
                    addView(view);
                }
                this.mCustomView = view;
                TextView textView = this.mTextView;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                View view2 = this.mIconView;
                if (view2 != null) {
                    view2.setVisibility(8);
                }
                this.mCustomTextView = (TextView) view.findViewById(16908308);
                TextView textView2 = this.mCustomTextView;
                if (textView2 != null) {
                    this.mDefaultMaxLines = TextViewCompat.getMaxLines(textView2);
                }
                this.mCustomIconView = (ImageView) view.findViewById(16908294);
            } else {
                View view3 = this.mCustomView;
                if (view3 != null) {
                    removeView(view3);
                    this.mCustomView = null;
                }
                this.mCustomTextView = null;
                this.mCustomIconView = null;
            }
            if (this.mCustomView == null) {
                if (this.mIconView == null) {
                    View inflate2 = LayoutInflater.from(getContext()).inflate(R.layout.live_xtab_icon_layout, (ViewGroup) this, false);
                    addView(inflate2, 0);
                    this.mIconView = inflate2;
                    this.mTUrlImageView = (TUrlImageView) inflate2.findViewById(R.id.live_xtab_view);
                    this.mAnimView = inflate2.findViewById(R.id.live_xtab_view_anim);
                }
                if (this.mTextView == null) {
                    TextView textView3 = (TextView) LayoutInflater.from(getContext()).inflate(R.layout.live_xtab_layout_tab_text, (ViewGroup) this, false);
                    textView3.setMinWidth(110);
                    addView(textView3);
                    this.mTextView = textView3;
                    this.mDefaultMaxLines = TextViewCompat.getMaxLines(this.mTextView);
                }
                this.mTextView.setTextAppearance(getContext(), XTabLayout.access$3100(XTabLayout.this));
                this.mTextView.setGravity(1);
                if (XTabLayout.access$3200(XTabLayout.this) != null) {
                    this.mTextView.setTextColor(XTabLayout.access$3200(XTabLayout.this));
                }
                if (prr.B() && this.mTabImageView == null && (inflate = LayoutInflater.from(getContext()).inflate(R.layout.live_xtab_image_layout, (ViewGroup) this, false)) != null) {
                    ViewGroup viewGroup = (ViewGroup) inflate.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(inflate);
                    }
                    addView(inflate);
                    this.mTabImageView = (TUrlImageView) inflate.findViewById(R.id.live_xtab_image_view);
                }
                updateTextAndIcon(this.mTextView, this.mTabImageView, this.mIconView, this.mTUrlImageView, this.mAnimView);
            } else if (this.mCustomTextView == null && this.mCustomIconView == null) {
            } else {
                updateTextAndIcon(this.mCustomTextView, null, this.mCustomIconView, null, null);
            }
        }

        private void updateTextAndIcon(TextView textView, TUrlImageView tUrlImageView, View view, TUrlImageView tUrlImageView2, View view2) {
            String b;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4c887aa3", new Object[]{this, textView, tUrlImageView, view, tUrlImageView2, view2});
                return;
            }
            d dVar = this.mTab;
            Drawable i = dVar != null ? dVar.i() : null;
            d dVar2 = this.mTab;
            String j = dVar2 != null ? dVar2.j() : null;
            d dVar3 = this.mTab;
            CharSequence l = dVar3 != null ? dVar3.l() : null;
            d dVar4 = this.mTab;
            CharSequence n = dVar4 != null ? dVar4.n() : null;
            if (isSelected()) {
                if (XTabLayout.access$2200(XTabLayout.this)) {
                    d dVar5 = this.mTab;
                    if (dVar5 != null) {
                        b = dVar5.d();
                    }
                    b = null;
                } else {
                    d dVar6 = this.mTab;
                    if (dVar6 != null) {
                        b = dVar6.c();
                    }
                    b = null;
                }
            } else if (XTabLayout.access$2200(XTabLayout.this)) {
                d dVar7 = this.mTab;
                if (dVar7 != null) {
                    b = dVar7.e();
                }
                b = null;
            } else {
                d dVar8 = this.mTab;
                if (dVar8 != null) {
                    b = dVar8.b();
                }
                b = null;
            }
            if (view != null) {
                if (!TextUtils.isEmpty(j) && tUrlImageView2 != null) {
                    tUrlImageView2.setImageUrl(j, new PhenixOptions().bitmapProcessors(new com.taobao.phenix.compat.effects.c()));
                    view.setVisibility(0);
                    setVisibility(0);
                    iconAnim(view2, tUrlImageView2);
                } else if (i != null) {
                    view.setVisibility(0);
                    setVisibility(0);
                } else {
                    view.setVisibility(8);
                    AnimatorSet animatorSet = this.animatorSet;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                        this.animatorSet = null;
                    }
                }
                view.setContentDescription(n);
            }
            boolean z = !TextUtils.isEmpty(l);
            if (textView != null) {
                if (z) {
                    textView.setAllCaps(XTabLayout.access$3300(XTabLayout.this));
                    textView.setText(l);
                    textView.setVisibility(0);
                    setVisibility(0);
                } else {
                    textView.setVisibility(8);
                    textView.setText((CharSequence) null);
                }
                textView.setContentDescription(n);
            }
            if (tUrlImageView != null) {
                if (!pro.e(b)) {
                    tUrlImageView.setImageUrl(b);
                    tUrlImageView.setSkipAutoSize(true);
                    tUrlImageView.setVisibility(0);
                    if (textView != null) {
                        textView.setVisibility(8);
                        textView.setText((CharSequence) null);
                    }
                    setVisibility(0);
                } else {
                    tUrlImageView.setVisibility(8);
                }
            }
            if (view != null && view.getVisibility() == 0) {
                view.requestLayout();
            }
            if (!z && !TextUtils.isEmpty(n)) {
                setOnLongClickListener(this);
                return;
            }
            setOnLongClickListener(null);
            setLongClickable(false);
        }

        private void iconAnim(View view, View view2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("29d1fbb1", new Object[]{this, view, view2});
            } else if (view == null || view2 == null) {
            } else {
                AnimatorSet animatorSet = this.animatorSet;
                if (animatorSet == null) {
                    this.animatorSet = new AnimatorSet();
                } else {
                    animatorSet.cancel();
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view2, "scaleX", 0.8f, 1.0f, 0.8f);
                ofFloat.setDuration(1500L);
                ofFloat.setRepeatCount(-1);
                ofFloat.setRepeatMode(1);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view2, "scaleY", 0.8f, 1.0f, 0.8f);
                ofFloat2.setDuration(1500L);
                ofFloat2.setRepeatCount(-1);
                ofFloat2.setRepeatMode(1);
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f);
                ofFloat3.setDuration(1200L);
                ofFloat3.setRepeatCount(-1);
                ofFloat3.setRepeatMode(1);
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(view, "scaleX", 0.8f, 1.1f, 0.8f);
                ofFloat4.setDuration(1200L);
                ofFloat4.setRepeatCount(-1);
                ofFloat4.setRepeatMode(1);
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(view, "scaleY", 0.8f, 1.1f, 0.8f);
                ofFloat5.setDuration(1200L);
                ofFloat5.setRepeatCount(-1);
                ofFloat5.setRepeatMode(1);
                this.animatorSet.setDuration(1500L);
                this.animatorSet.playTogether(ofFloat, ofFloat2, ofFloat4, ofFloat5, ofFloat3);
                this.animatorSet.start();
            }
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7edba102", new Object[]{this, view})).booleanValue();
            }
            int[] iArr = new int[2];
            getLocationOnScreen(iArr);
            Context context = getContext();
            int width = getWidth();
            int height = getHeight();
            int i = context.getResources().getDisplayMetrics().widthPixels;
            Toast makeText = Toast.makeText(context, this.mTab.n(), 0);
            makeText.setGravity(49, (iArr[0] + (width / 2)) - (i / 2), height);
            makeText.show();
            return true;
        }

        public d getTab() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("8a8feb53", new Object[]{this}) : this.mTab;
        }

        private float approximateLineWidth(Layout layout, int i, float f) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a88c261d", new Object[]{this, layout, new Integer(i), new Float(f)})).floatValue() : layout.getLineWidth(i) * (f / layout.getPaint().getTextSize());
        }
    }

    /* loaded from: classes7.dex */
    public class SlidingTabStrip extends LinearLayout {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private com.taobao.live.home.widget.tab.d mIndicatorAnimator;
        private int mIndicatorLeft;
        private int mIndicatorRight;
        private int mSelectedIndicatorHeight;
        private final Paint mSelectedIndicatorPaint;
        private int mSelectedIndicatorWidth;
        private int mSelectedPosition;
        private float mSelectionOffset;

        static {
            kge.a(-1442520871);
        }

        public static /* synthetic */ Object ipc$super(SlidingTabStrip slidingTabStrip, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -1665133574) {
                super.draw((Canvas) objArr[0]);
                return null;
            } else if (hashCode == -244855388) {
                super.onLayout(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
                return null;
            } else if (hashCode != 650865254) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            } else {
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            }
        }

        public static /* synthetic */ void access$3700(SlidingTabStrip slidingTabStrip, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4d44ed81", new Object[]{slidingTabStrip, new Integer(i), new Integer(i2)});
            } else {
                slidingTabStrip.setIndicatorPosition(i, i2);
            }
        }

        public static /* synthetic */ int access$3802(SlidingTabStrip slidingTabStrip, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("7f04a52", new Object[]{slidingTabStrip, new Integer(i)})).intValue();
            }
            slidingTabStrip.mSelectedPosition = i;
            return i;
        }

        public static /* synthetic */ float access$3902(SlidingTabStrip slidingTabStrip, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("a45e3b6b", new Object[]{slidingTabStrip, new Float(f)})).floatValue();
            }
            slidingTabStrip.mSelectionOffset = f;
            return f;
        }

        public SlidingTabStrip(Context context) {
            super(context);
            this.mSelectedPosition = -1;
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

        public void setmSelectedIndicatorWidth(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c93832df", new Object[]{this, new Integer(i)});
            } else if (this.mSelectedIndicatorWidth == i) {
            } else {
                this.mSelectedIndicatorWidth = i;
                ViewCompat.postInvalidateOnAnimation(this);
            }
        }

        public int getmSelectedIndicatorWidth() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("930ac923", new Object[]{this})).intValue() : this.mSelectedIndicatorWidth;
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
            com.taobao.live.home.widget.tab.d dVar = this.mIndicatorAnimator;
            if (dVar != null && dVar.b()) {
                this.mIndicatorAnimator.d();
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
        public void onMeasure(int i, int i2) {
            boolean z;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
                return;
            }
            super.onMeasure(i, i2);
            if (View.MeasureSpec.getMode(i) != 1073741824 || XTabLayout.access$2900(XTabLayout.this) != 1 || XTabLayout.access$3400(XTabLayout.this) != 1) {
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
            if (i3 * childCount <= getMeasuredWidth() - (XTabLayout.access$1300(XTabLayout.this, 16) << 1)) {
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
                XTabLayout.access$3402(XTabLayout.this, 0);
                XTabLayout.access$3500(XTabLayout.this, false);
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
            com.taobao.live.home.widget.tab.d dVar = this.mIndicatorAnimator;
            if (dVar != null && dVar.b()) {
                this.mIndicatorAnimator.d();
                animateIndicatorToPosition(this.mSelectedPosition, Math.round((1.0f - this.mIndicatorAnimator.e()) * ((float) this.mIndicatorAnimator.f())));
                return;
            }
            updateIndicatorPosition();
        }

        private void updateIndicatorPosition() {
            int i;
            int i2;
            int i3;
            IpChange ipChange = $ipChange;
            int i4 = 0;
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
                if (this.mSelectedIndicatorWidth == 0 && !XTabLayout.access$3600(XTabLayout.this)) {
                    this.mSelectedIndicatorWidth = 16843039;
                }
                int i5 = this.mSelectedIndicatorWidth;
                if (i5 != 0 && (i3 = this.mIndicatorRight - this.mIndicatorLeft) > i5) {
                    i4 = (i3 - i5) / 2;
                    i += i4;
                    i2 -= i4;
                }
                if (this.mSelectionOffset > 0.0f && this.mSelectedPosition < getChildCount() - 1) {
                    View childAt2 = getChildAt(this.mSelectedPosition + 1);
                    int left = childAt2.getLeft() + i4;
                    int right = childAt2.getRight() - i4;
                    float f = this.mSelectionOffset;
                    i = (int) ((left * f) + ((1.0f - f) * i));
                    i2 = (int) ((right * f) + ((1.0f - f) * i2));
                }
            }
            setIndicatorPosition(i, i2);
        }

        private void setIndicatorPosition(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("90adc6bd", new Object[]{this, new Integer(i), new Integer(i2)});
                return;
            }
            int access$1500 = i + XTabLayout.access$1500(XTabLayout.this);
            int access$1700 = i2 - XTabLayout.access$1700(XTabLayout.this);
            if (access$1500 == this.mIndicatorLeft && access$1700 == this.mIndicatorRight) {
                return;
            }
            this.mIndicatorLeft = access$1500;
            this.mIndicatorRight = access$1700;
            ViewCompat.postInvalidateOnAnimation(this);
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
            com.taobao.live.home.widget.tab.d dVar = this.mIndicatorAnimator;
            if (dVar != null && dVar.b()) {
                this.mIndicatorAnimator.d();
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
                int access$1300 = XTabLayout.access$1300(XTabLayout.this, 24);
                i3 = (i >= this.mSelectedPosition ? !z : z) ? left - access$1300 : access$1300 + right;
                i4 = i3;
            }
            if (i3 == left && i4 == right) {
                return;
            }
            com.taobao.live.home.widget.tab.d a2 = com.taobao.live.home.widget.tab.f.a();
            this.mIndicatorAnimator = a2;
            a2.a(com.taobao.live.home.widget.tab.a.f17773a);
            a2.a(i2);
            a2.a(0.0f, 1.0f);
            a2.a(new d.c() { // from class: com.taobao.live.home.widget.tab.XTabLayout.SlidingTabStrip.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.live.home.widget.tab.d.c
                public void a(com.taobao.live.home.widget.tab.d dVar2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ecb241a", new Object[]{this, dVar2});
                        return;
                    }
                    float e = dVar2.e();
                    SlidingTabStrip.access$3700(SlidingTabStrip.this, com.taobao.live.home.widget.tab.a.a(i3, left, e), com.taobao.live.home.widget.tab.a.a(i4, right, e));
                }
            });
            a2.a(new d.b() { // from class: com.taobao.live.home.widget.tab.XTabLayout.SlidingTabStrip.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.live.home.widget.tab.d.b, com.taobao.live.home.widget.tab.d.a
                public void a(com.taobao.live.home.widget.tab.d dVar2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ecb241a", new Object[]{this, dVar2});
                        return;
                    }
                    SlidingTabStrip.access$3802(SlidingTabStrip.this, i);
                    SlidingTabStrip.access$3902(SlidingTabStrip.this, 0.0f);
                }
            });
            a2.a();
        }

        @Override // android.view.View
        public void draw(Canvas canvas) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9cc013fa", new Object[]{this, canvas});
                return;
            }
            super.draw(canvas);
            int i = this.mIndicatorLeft;
            if (i < 0 || this.mIndicatorRight <= i) {
                return;
            }
            if (this.mSelectedIndicatorWidth != 0 && !XTabLayout.access$3600(XTabLayout.this)) {
                int i2 = this.mIndicatorRight;
                int i3 = this.mIndicatorLeft;
                int i4 = i2 - i3;
                int i5 = this.mSelectedIndicatorWidth;
                if (i4 > i5) {
                    this.mIndicatorLeft = i3 + ((i4 - i5) / 2);
                    this.mIndicatorRight = i2 - ((i4 - i5) / 2);
                }
            } else {
                int i6 = this.mIndicatorRight - this.mIndicatorLeft;
                if (i6 > XTabLayout.access$4000(XTabLayout.this).f()) {
                    this.mIndicatorLeft += (i6 - XTabLayout.access$4000(XTabLayout.this).f()) / 2;
                    this.mIndicatorRight -= (i6 - XTabLayout.access$4000(XTabLayout.this).f()) / 2;
                }
            }
            canvas.drawRoundRect(new RectF(this.mIndicatorLeft, getHeight() - this.mSelectedIndicatorHeight, this.mIndicatorRight, getHeight()), 3.0f, 2.0f, this.mSelectedIndicatorPaint);
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
                d dVar = this.mTabs.get(i);
                if (dVar != null && dVar.i() != null && !TextUtils.isEmpty(dVar.l())) {
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
        if (this.mPagerAdapter != null && this.xTabDisplayNum != 0) {
            WindowManager windowManager = (WindowManager) getContext().getSystemService(com.taobao.android.weex_framework.util.a.ATOM_EXT_window);
            if (this.mPagerAdapter.getCount() == 1 || this.xTabDisplayNum == 1) {
                return windowManager.getDefaultDisplay().getWidth();
            }
            if (this.mPagerAdapter.getCount() < this.xTabDisplayNum) {
                return windowManager.getDefaultDisplay().getWidth() / this.mPagerAdapter.getCount();
            }
            return windowManager.getDefaultDisplay().getWidth() / this.xTabDisplayNum;
        } else if (this.xTabDisplayNum != 0) {
            return ((WindowManager) getContext().getSystemService(com.taobao.android.weex_framework.util.a.ATOM_EXT_window)).getDefaultDisplay().getWidth() / this.xTabDisplayNum;
        } else {
            int i = this.mRequestedTabMinWidth;
            if (i != -1) {
                return i;
            }
            if (this.mMode != 0) {
                return 0;
            }
            return this.mScrollableTabMinWidth;
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FrameLayout.LayoutParams) ipChange.ipc$dispatch("76fdc06b", new Object[]{this, attributeSet}) : generateDefaultLayoutParams();
    }

    private int getTabMaxWidth() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("30d0d83b", new Object[]{this})).intValue() : this.mTabMaxWidth;
    }

    /* loaded from: classes7.dex */
    public static class e implements ViewPager.OnPageChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference<XTabLayout> f17771a;
        private int b;
        private int c;

        static {
            kge.a(1015085305);
            kge.a(1848919473);
        }

        public static /* synthetic */ void a(e eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("51073b2a", new Object[]{eVar});
            } else {
                eVar.a();
            }
        }

        public e(XTabLayout xTabLayout) {
            this.f17771a = new WeakReference<>(xTabLayout);
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
            IpChange ipChange = $ipChange;
            boolean z = false;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f4c13b05", new Object[]{this, new Integer(i), new Float(f), new Integer(i2)});
                return;
            }
            XTabLayout xTabLayout = this.f17771a.get();
            if (xTabLayout == null) {
                return;
            }
            boolean z2 = this.c != 2 || this.b == 1;
            if (this.c != 2 || this.b != 0) {
                z = true;
            }
            XTabLayout.access$4100(xTabLayout, i, f, z2, z);
        }

        @Override // android.support.v4.view.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            IpChange ipChange = $ipChange;
            boolean z = true;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i)});
                return;
            }
            XTabLayout xTabLayout = this.f17771a.get();
            if (xTabLayout == null || xTabLayout.getSelectedTabPosition() == i) {
                return;
            }
            int i2 = this.c;
            if (i2 != 0 && (i2 != 2 || this.b != 0)) {
                z = false;
            }
            xTabLayout.selectTab(xTabLayout.getTabAt(i), z);
        }

        private void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            this.c = 0;
            this.b = 0;
        }
    }

    /* loaded from: classes7.dex */
    public static class f implements b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final ViewPager f17772a;

        static {
            kge.a(1092471615);
            kge.a(1735445453);
        }

        @Override // com.taobao.live.home.widget.tab.XTabLayout.b
        public void onTabReselected(d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3cddb74e", new Object[]{this, dVar});
            }
        }

        @Override // com.taobao.live.home.widget.tab.XTabLayout.b
        public void onTabUnselected(d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e54d4c34", new Object[]{this, dVar});
            }
        }

        public f(ViewPager viewPager) {
            this.f17772a = viewPager;
        }

        @Override // com.taobao.live.home.widget.tab.XTabLayout.b
        public void onTabSelected(d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c87d7c5b", new Object[]{this, dVar});
            } else {
                this.f17772a.setCurrentItem(dVar.k());
            }
        }
    }

    /* loaded from: classes7.dex */
    public class c extends DataSetObserver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-785696262);
        }

        private c() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ba16f5dc", new Object[]{this});
            } else {
                XTabLayout.access$4200(XTabLayout.this);
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("61d25eb1", new Object[]{this});
            } else {
                XTabLayout.access$4200(XTabLayout.this);
            }
        }
    }
}
