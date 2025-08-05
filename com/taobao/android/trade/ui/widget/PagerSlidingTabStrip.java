package com.taobao.android.trade.ui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.wrapper.ext.component.main.viewholder.interactionlikebar.KAPContainerView;
import com.taobao.taobao.R;
import java.util.Locale;
import tb.kge;

/* loaded from: classes6.dex */
public class PagerSlidingTabStrip extends HorizontalScrollView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final int[] ATTRS;
    private int currentPosition;
    private float currentPositionOffset;
    private LinearLayout.LayoutParams defaultTabLayoutParams;
    public ViewPager.OnPageChangeListener delegatePageListener;
    private int dividerColor;
    private int dividerPadding;
    private Paint dividerPaint;
    private int dividerWidth;
    private LinearLayout.LayoutParams expandedTabLayoutParams;
    private int indicatorColor;
    private int indicatorHeight;
    private int lastScrollX;
    private Locale locale;
    private final b pageListener;
    private ViewPager pager;
    private Paint rectPaint;
    private int scrollOffset;
    private boolean shouldExpand;
    private int tabBackgroundResId;
    private int tabCount;
    private int tabPadding;
    private int tabTextColor;
    private int tabTextSize;
    private Typeface tabTypeface;
    private int tabTypefaceStyle;
    private LinearLayout tabsContainer;
    private boolean textAllCaps;
    private int underlineColor;
    private int underlineHeight;

    /* loaded from: classes6.dex */
    public interface a {
        int a(int i);
    }

    public static /* synthetic */ Object ipc$super(PagerSlidingTabStrip pagerSlidingTabStrip, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1117127205) {
            super.onDraw((Canvas) objArr[0]);
            return null;
        } else if (hashCode == 27005610) {
            return super.onSaveInstanceState();
        } else {
            if (hashCode != 80153535) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
            super.onRestoreInstanceState((Parcelable) objArr[0]);
            return null;
        }
    }

    public static /* synthetic */ int access$100(PagerSlidingTabStrip pagerSlidingTabStrip) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("384deb80", new Object[]{pagerSlidingTabStrip})).intValue() : pagerSlidingTabStrip.currentPosition;
    }

    public static /* synthetic */ int access$102(PagerSlidingTabStrip pagerSlidingTabStrip, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b88f018b", new Object[]{pagerSlidingTabStrip, new Integer(i)})).intValue();
        }
        pagerSlidingTabStrip.currentPosition = i;
        return i;
    }

    public static /* synthetic */ ViewPager access$200(PagerSlidingTabStrip pagerSlidingTabStrip) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewPager) ipChange.ipc$dispatch("efeb08d8", new Object[]{pagerSlidingTabStrip}) : pagerSlidingTabStrip.pager;
    }

    public static /* synthetic */ void access$300(PagerSlidingTabStrip pagerSlidingTabStrip, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30eeaceb", new Object[]{pagerSlidingTabStrip, new Integer(i), new Integer(i2)});
        } else {
            pagerSlidingTabStrip.scrollToChild(i, i2);
        }
    }

    public static /* synthetic */ float access$402(PagerSlidingTabStrip pagerSlidingTabStrip, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a1cd5e48", new Object[]{pagerSlidingTabStrip, new Float(f)})).floatValue();
        }
        pagerSlidingTabStrip.currentPositionOffset = f;
        return f;
    }

    public static /* synthetic */ LinearLayout access$500(PagerSlidingTabStrip pagerSlidingTabStrip) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LinearLayout) ipChange.ipc$dispatch("4e674e0", new Object[]{pagerSlidingTabStrip}) : pagerSlidingTabStrip.tabsContainer;
    }

    static {
        kge.a(872905724);
        ATTRS = new int[]{16842901, 16842904};
    }

    public PagerSlidingTabStrip(Context context) {
        this(context, null);
    }

    public PagerSlidingTabStrip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PagerSlidingTabStrip(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.pageListener = new b();
        this.currentPosition = 0;
        this.currentPositionOffset = 0.0f;
        this.indicatorColor = KAPContainerView.DEFAULT_MENU_COLOR;
        this.underlineColor = 436207616;
        this.dividerColor = 436207616;
        this.shouldExpand = false;
        this.textAllCaps = true;
        this.scrollOffset = 52;
        this.indicatorHeight = 8;
        this.underlineHeight = 2;
        this.dividerPadding = 12;
        this.tabPadding = 24;
        this.dividerWidth = 1;
        this.tabTextSize = 12;
        this.tabTextColor = KAPContainerView.DEFAULT_MENU_COLOR;
        this.tabTypeface = null;
        this.tabTypefaceStyle = 1;
        this.lastScrollX = 0;
        this.tabBackgroundResId = R.drawable.psts_tab_bg;
        setFillViewport(true);
        setWillNotDraw(false);
        this.tabsContainer = new LinearLayout(context);
        this.tabsContainer.setOrientation(0);
        this.tabsContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(this.tabsContainer);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.scrollOffset = (int) TypedValue.applyDimension(1, this.scrollOffset, displayMetrics);
        this.indicatorHeight = (int) TypedValue.applyDimension(1, this.indicatorHeight, displayMetrics);
        this.underlineHeight = (int) TypedValue.applyDimension(1, this.underlineHeight, displayMetrics);
        this.dividerPadding = (int) TypedValue.applyDimension(1, this.dividerPadding, displayMetrics);
        this.tabPadding = (int) TypedValue.applyDimension(1, this.tabPadding, displayMetrics);
        this.dividerWidth = (int) TypedValue.applyDimension(1, this.dividerWidth, displayMetrics);
        this.tabTextSize = (int) TypedValue.applyDimension(2, this.tabTextSize, displayMetrics);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ATTRS);
        this.tabTextSize = obtainStyledAttributes.getDimensionPixelSize(0, this.tabTextSize);
        this.tabTextColor = obtainStyledAttributes.getColor(1, this.tabTextColor);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, R.styleable.PagerSlidingTabStrip);
        this.indicatorColor = obtainStyledAttributes2.getColor(R.styleable.PagerSlidingTabStrip_indicator_color, this.indicatorColor);
        this.underlineColor = obtainStyledAttributes2.getColor(R.styleable.PagerSlidingTabStrip_underline_color, this.underlineColor);
        this.dividerColor = obtainStyledAttributes2.getColor(R.styleable.PagerSlidingTabStrip_divider_color, this.dividerColor);
        this.indicatorHeight = obtainStyledAttributes2.getDimensionPixelSize(R.styleable.PagerSlidingTabStrip_indicator_height, this.indicatorHeight);
        this.underlineHeight = obtainStyledAttributes2.getDimensionPixelSize(R.styleable.PagerSlidingTabStrip_underline_height, this.underlineHeight);
        this.dividerPadding = obtainStyledAttributes2.getDimensionPixelSize(R.styleable.PagerSlidingTabStrip_divider_padding, this.dividerPadding);
        this.tabPadding = obtainStyledAttributes2.getDimensionPixelSize(R.styleable.PagerSlidingTabStrip_tab_padding_left_right, this.tabPadding);
        this.tabBackgroundResId = obtainStyledAttributes2.getResourceId(R.styleable.PagerSlidingTabStrip_tab_background, this.tabBackgroundResId);
        this.shouldExpand = obtainStyledAttributes2.getBoolean(R.styleable.PagerSlidingTabStrip_should_expand, this.shouldExpand);
        this.scrollOffset = obtainStyledAttributes2.getDimensionPixelSize(R.styleable.PagerSlidingTabStrip_scroll_offset, this.scrollOffset);
        this.textAllCaps = obtainStyledAttributes2.getBoolean(R.styleable.PagerSlidingTabStrip_text_all_caps, this.textAllCaps);
        obtainStyledAttributes2.recycle();
        this.rectPaint = new Paint();
        this.rectPaint.setAntiAlias(true);
        this.rectPaint.setStyle(Paint.Style.FILL);
        this.dividerPaint = new Paint();
        this.dividerPaint.setAntiAlias(true);
        this.dividerPaint.setStrokeWidth(this.dividerWidth);
        this.defaultTabLayoutParams = new LinearLayout.LayoutParams(-2, -1);
        this.expandedTabLayoutParams = new LinearLayout.LayoutParams(0, -1, 1.0f);
        if (this.locale == null) {
            this.locale = getResources().getConfiguration().locale;
        }
    }

    public void setViewPager(ViewPager viewPager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45940d39", new Object[]{this, viewPager});
            return;
        }
        this.pager = viewPager;
        if (viewPager.getAdapter() == null) {
            throw new IllegalStateException("ViewPager does not have adapter instance.");
        }
        viewPager.setOnPageChangeListener(this.pageListener);
        notifyDataSetChanged();
    }

    public void setOnPageChangeListener(ViewPager.OnPageChangeListener onPageChangeListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c756499", new Object[]{this, onPageChangeListener});
        } else {
            this.delegatePageListener = onPageChangeListener;
        }
    }

    public void notifyDataSetChanged() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eee9a4ec", new Object[]{this});
            return;
        }
        this.tabsContainer.removeAllViews();
        this.tabCount = this.pager.getAdapter().getCount();
        for (int i = 0; i < this.tabCount; i++) {
            if (this.pager.getAdapter() instanceof a) {
                addIconTab(i, ((a) this.pager.getAdapter()).a(i));
            } else {
                addTextTab(i, this.pager.getAdapter().getPageTitle(i).toString());
            }
        }
        updateTabStyles();
        getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.taobao.android.trade.ui.widget.PagerSlidingTabStrip.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("df7e7eb3", new Object[]{this});
                    return;
                }
                if (Build.VERSION.SDK_INT < 16) {
                    PagerSlidingTabStrip.this.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                } else {
                    PagerSlidingTabStrip.this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                }
                PagerSlidingTabStrip pagerSlidingTabStrip = PagerSlidingTabStrip.this;
                PagerSlidingTabStrip.access$102(pagerSlidingTabStrip, PagerSlidingTabStrip.access$200(pagerSlidingTabStrip).getCurrentItem());
                PagerSlidingTabStrip pagerSlidingTabStrip2 = PagerSlidingTabStrip.this;
                PagerSlidingTabStrip.access$300(pagerSlidingTabStrip2, PagerSlidingTabStrip.access$100(pagerSlidingTabStrip2), 0);
            }
        });
    }

    private void addTextTab(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3af91aff", new Object[]{this, new Integer(i), str});
            return;
        }
        TextView textView = new TextView(getContext());
        textView.setText(str);
        textView.setGravity(17);
        textView.setSingleLine();
        addTab(i, textView);
    }

    private void addIconTab(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4233b62", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        ImageButton imageButton = new ImageButton(getContext());
        imageButton.setImageResource(i2);
        addTab(i, imageButton);
    }

    private void addTab(final int i, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d7e872a", new Object[]{this, new Integer(i), view});
            return;
        }
        view.setFocusable(true);
        view.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.trade.ui.widget.PagerSlidingTabStrip.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view2});
                } else {
                    PagerSlidingTabStrip.access$200(PagerSlidingTabStrip.this).setCurrentItem(i);
                }
            }
        });
        int i2 = this.tabPadding;
        view.setPadding(i2, 0, i2, 0);
        this.tabsContainer.addView(view, i, this.shouldExpand ? this.expandedTabLayoutParams : this.defaultTabLayoutParams);
    }

    private void updateTabStyles() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a3d0795", new Object[]{this});
            return;
        }
        for (int i = 0; i < this.tabCount; i++) {
            View childAt = this.tabsContainer.getChildAt(i);
            childAt.setBackgroundResource(this.tabBackgroundResId);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                textView.setTextSize(0, this.tabTextSize);
                textView.setTypeface(this.tabTypeface, this.tabTypefaceStyle);
                textView.setTextColor(this.tabTextColor);
                if (this.textAllCaps) {
                    if (Build.VERSION.SDK_INT >= 14) {
                        textView.setAllCaps(true);
                    } else {
                        textView.setText(textView.getText().toString().toUpperCase(this.locale));
                    }
                }
            }
        }
    }

    private void scrollToChild(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0845bfb", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (this.tabCount == 0) {
        } else {
            int left = this.tabsContainer.getChildAt(i).getLeft() + i2;
            if (i > 0 || i2 > 0) {
                left -= this.scrollOffset;
            }
            if (left == this.lastScrollX) {
                return;
            }
            this.lastScrollX = left;
            scrollTo(left, 0);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        float f;
        float f2;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        super.onDraw(canvas);
        if (isInEditMode() || this.tabCount == 0) {
            return;
        }
        int height = getHeight();
        this.rectPaint.setColor(this.indicatorColor);
        View childAt = this.tabsContainer.getChildAt(this.currentPosition);
        float left = childAt.getLeft();
        float right = childAt.getRight();
        if (this.currentPositionOffset <= 0.0f || (i = this.currentPosition) >= this.tabCount - 1) {
            f = right;
            f2 = left;
        } else {
            View childAt2 = this.tabsContainer.getChildAt(i + 1);
            float f3 = this.currentPositionOffset;
            f = (childAt2.getRight() * f3) + ((1.0f - f3) * right);
            f2 = (childAt2.getLeft() * f3) + ((1.0f - f3) * left);
        }
        float f4 = height;
        canvas.drawRect(f2, height - this.indicatorHeight, f, f4, this.rectPaint);
        this.rectPaint.setColor(this.underlineColor);
        canvas.drawRect(0.0f, height - this.underlineHeight, this.tabsContainer.getWidth(), f4, this.rectPaint);
        this.dividerPaint.setColor(this.dividerColor);
        for (int i2 = 0; i2 < this.tabCount - 1; i2++) {
            View childAt3 = this.tabsContainer.getChildAt(i2);
            canvas.drawLine(childAt3.getRight(), this.dividerPadding, childAt3.getRight(), height - this.dividerPadding, this.dividerPaint);
        }
    }

    /* loaded from: classes6.dex */
    public class b implements ViewPager.OnPageChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(784771115);
            kge.a(1848919473);
        }

        private b() {
        }

        @Override // android.support.v4.view.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f4c13b05", new Object[]{this, new Integer(i), new Float(f), new Integer(i2)});
                return;
            }
            PagerSlidingTabStrip.access$102(PagerSlidingTabStrip.this, i);
            PagerSlidingTabStrip.access$402(PagerSlidingTabStrip.this, f);
            PagerSlidingTabStrip pagerSlidingTabStrip = PagerSlidingTabStrip.this;
            PagerSlidingTabStrip.access$300(pagerSlidingTabStrip, i, (int) (PagerSlidingTabStrip.access$500(pagerSlidingTabStrip).getChildAt(i).getWidth() * f));
            PagerSlidingTabStrip.this.invalidate();
            if (PagerSlidingTabStrip.this.delegatePageListener == null) {
                return;
            }
            PagerSlidingTabStrip.this.delegatePageListener.onPageScrolled(i, f, i2);
        }

        @Override // android.support.v4.view.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6581cc1e", new Object[]{this, new Integer(i)});
                return;
            }
            if (i == 0) {
                PagerSlidingTabStrip pagerSlidingTabStrip = PagerSlidingTabStrip.this;
                PagerSlidingTabStrip.access$300(pagerSlidingTabStrip, PagerSlidingTabStrip.access$200(pagerSlidingTabStrip).getCurrentItem(), 0);
            }
            if (PagerSlidingTabStrip.this.delegatePageListener == null) {
                return;
            }
            PagerSlidingTabStrip.this.delegatePageListener.onPageScrollStateChanged(i);
        }

        @Override // android.support.v4.view.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i)});
            } else if (PagerSlidingTabStrip.this.delegatePageListener == null) {
            } else {
                PagerSlidingTabStrip.this.delegatePageListener.onPageSelected(i);
            }
        }
    }

    public void setIndicatorColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c30a586", new Object[]{this, new Integer(i)});
            return;
        }
        this.indicatorColor = i;
        invalidate();
    }

    public void setIndicatorColorResource(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c776a018", new Object[]{this, new Integer(i)});
            return;
        }
        this.indicatorColor = getResources().getColor(i);
        invalidate();
    }

    public int getIndicatorColor() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ce626f04", new Object[]{this})).intValue() : this.indicatorColor;
    }

    public void setIndicatorHeight(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2615488", new Object[]{this, new Integer(i)});
            return;
        }
        this.indicatorHeight = i;
        invalidate();
    }

    public int getIndicatorHeight() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ca59a5a", new Object[]{this})).intValue() : this.indicatorHeight;
    }

    public void setUnderlineColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b58a603", new Object[]{this, new Integer(i)});
            return;
        }
        this.underlineColor = i;
        invalidate();
    }

    public void setUnderlineColorResource(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c408d395", new Object[]{this, new Integer(i)});
            return;
        }
        this.underlineColor = getResources().getColor(i);
        invalidate();
    }

    public int getUnderlineColor() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c829eae7", new Object[]{this})).intValue() : this.underlineColor;
    }

    public void setDividerColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("880bad90", new Object[]{this, new Integer(i)});
            return;
        }
        this.dividerColor = i;
        invalidate();
    }

    public void setDividerColorResource(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e675fe22", new Object[]{this, new Integer(i)});
            return;
        }
        this.dividerColor = getResources().getColor(i);
        invalidate();
    }

    public int getDividerColor() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5902aba", new Object[]{this})).intValue() : this.dividerColor;
    }

    public void setUnderlineHeight(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a83963ab", new Object[]{this, new Integer(i)});
            return;
        }
        this.underlineHeight = i;
        invalidate();
    }

    public int getUnderlineHeight() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4bcd9ad7", new Object[]{this})).intValue() : this.underlineHeight;
    }

    public void setDividerPadding(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eec64be2", new Object[]{this, new Integer(i)});
            return;
        }
        this.dividerPadding = i;
        invalidate();
    }

    public int getDividerPadding() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("91908d28", new Object[]{this})).intValue() : this.dividerPadding;
    }

    public void setScrollOffset(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("243f015a", new Object[]{this, new Integer(i)});
            return;
        }
        this.scrollOffset = i;
        invalidate();
    }

    public int getScrollOffset() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("1b1e35b0", new Object[]{this})).intValue() : this.scrollOffset;
    }

    public void setShouldExpand(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("260898de", new Object[]{this, new Boolean(z)});
            return;
        }
        this.shouldExpand = z;
        requestLayout();
    }

    public boolean getShouldExpand() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6dc19bae", new Object[]{this})).booleanValue() : this.shouldExpand;
    }

    public boolean isTextAllCaps() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b73c19b6", new Object[]{this})).booleanValue() : this.textAllCaps;
    }

    public void setAllCaps(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76d061cd", new Object[]{this, new Boolean(z)});
        } else {
            this.textAllCaps = z;
        }
    }

    public void setTextSize(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b5ef80c", new Object[]{this, new Integer(i)});
            return;
        }
        this.tabTextSize = i;
        updateTabStyles();
    }

    public int getTextSize() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("835f3abe", new Object[]{this})).intValue() : this.tabTextSize;
    }

    public void setTextColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc80f7e8", new Object[]{this, new Integer(i)});
            return;
        }
        this.tabTextColor = i;
        updateTabStyles();
    }

    public void setTextColorResource(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d587707a", new Object[]{this, new Integer(i)});
            return;
        }
        this.tabTextColor = getResources().getColor(i);
        updateTabStyles();
    }

    public int getTextColor() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("43c263fa", new Object[]{this})).intValue() : this.tabTextColor;
    }

    public void setTypeface(Typeface typeface, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9509ea5d", new Object[]{this, typeface, new Integer(i)});
            return;
        }
        this.tabTypeface = typeface;
        this.tabTypefaceStyle = i;
        updateTabStyles();
    }

    public void setTabBackground(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6d8569b", new Object[]{this, new Integer(i)});
        } else {
            this.tabBackgroundResId = i;
        }
    }

    public int getTabBackground() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d7bb3ce7", new Object[]{this})).intValue() : this.tabBackgroundResId;
    }

    public void setTabPaddingLeftRight(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b0e0e85", new Object[]{this, new Integer(i)});
            return;
        }
        this.tabPadding = i;
        updateTabStyles();
    }

    public int getTabPaddingLeftRight() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ccc006bd", new Object[]{this})).intValue() : this.tabPadding;
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c70bbf", new Object[]{this, parcelable});
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.currentPosition = savedState.currentPosition;
        requestLayout();
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public Parcelable onSaveInstanceState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Parcelable) ipChange.ipc$dispatch("19c12aa", new Object[]{this});
        }
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.currentPosition = this.currentPosition;
        return savedState;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR;
        int currentPosition;

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.currentPosition = parcel.readInt();
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.currentPosition);
        }

        static {
            kge.a(-2132815854);
            CREATOR = new Parcelable.Creator<SavedState>() { // from class: com.taobao.android.trade.ui.widget.PagerSlidingTabStrip.SavedState.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, com.taobao.android.trade.ui.widget.PagerSlidingTabStrip$SavedState] */
                @Override // android.os.Parcelable.Creator
                public /* synthetic */ SavedState createFromParcel(Parcel parcel) {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c057b5b", new Object[]{this, parcel}) : a(parcel);
                }

                /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object[], com.taobao.android.trade.ui.widget.PagerSlidingTabStrip$SavedState[]] */
                @Override // android.os.Parcelable.Creator
                public /* synthetic */ SavedState[] newArray(int i) {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? (Object[]) ipChange.ipc$dispatch("aaa7de04", new Object[]{this, new Integer(i)}) : a(i);
                }

                public SavedState a(Parcel parcel) {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? (SavedState) ipChange.ipc$dispatch("2c8ff60e", new Object[]{this, parcel}) : new SavedState(parcel);
                }

                public SavedState[] a(int i) {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? (SavedState[]) ipChange.ipc$dispatch("dbc2e23d", new Object[]{this, new Integer(i)}) : new SavedState[i];
                }
            };
        }
    }
}
