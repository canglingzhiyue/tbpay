package com.taobao.android.live.plugin.atype.flexalocal.input.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.taolive.sdk.utils.l;
import java.util.regex.Pattern;
import tb.kge;

/* loaded from: classes6.dex */
public class PagerSlidingTabStripAType extends HorizontalScrollView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Context context;
    private boolean enableNewTabUI;
    public int h;
    public boolean mCacheDataEnable;
    private int mCurrentPosition;
    private float mCurrentPositionOffset;
    private ViewPager.OnPageChangeListener mDelegatePageListener;
    public int mDividerColor;
    public int mDividerHeight;
    public int mDividerWidth;
    public int mIndicatorHeight;
    private int mIndicatorMarginBottom;
    public int mIndicatorWidth;
    private a mInnerPageListener;
    private int mLastScrollX;
    private View.OnClickListener mOnClickListener;
    public Paint mPaint;
    private final int mScrollOffset;
    public int mTabCount;
    private LinearLayout.LayoutParams mTabLayoutParams;
    public LinearLayout mTabsContainer;
    private ViewPager mViewPager;
    private int selectColor;
    private int selectTextStyle;
    private int textColor;
    private int textDefaultMargin;
    private int textSize;
    private int textStyle;
    private boolean textTabSingleLine;
    public int w;

    /* loaded from: classes6.dex */
    public interface b {
        View a(int i);
    }

    static {
        kge.a(-1781229612);
    }

    public static /* synthetic */ Object ipc$super(PagerSlidingTabStripAType pagerSlidingTabStripAType, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1117127205:
                super.onDraw((Canvas) objArr[0]);
                return null;
            case 27005610:
                return super.onSaveInstanceState();
            case 80153535:
                super.onRestoreInstanceState((Parcelable) objArr[0]);
                return null;
            case 949399698:
                super.onDetachedFromWindow();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public static /* synthetic */ ViewPager access$100(PagerSlidingTabStripAType pagerSlidingTabStripAType) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewPager) ipChange.ipc$dispatch("4604077f", new Object[]{pagerSlidingTabStripAType}) : pagerSlidingTabStripAType.mViewPager;
    }

    public static /* synthetic */ int access$202(PagerSlidingTabStripAType pagerSlidingTabStripAType, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6f1df7e0", new Object[]{pagerSlidingTabStripAType, new Integer(i)})).intValue();
        }
        pagerSlidingTabStripAType.mCurrentPosition = i;
        return i;
    }

    public static /* synthetic */ float access$302(PagerSlidingTabStripAType pagerSlidingTabStripAType, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3ede2039", new Object[]{pagerSlidingTabStripAType, new Float(f)})).floatValue();
        }
        pagerSlidingTabStripAType.mCurrentPositionOffset = f;
        return f;
    }

    public static /* synthetic */ void access$400(PagerSlidingTabStripAType pagerSlidingTabStripAType, int i, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9d734f3", new Object[]{pagerSlidingTabStripAType, new Integer(i), new Float(f)});
        } else {
            pagerSlidingTabStripAType.scrollToChild(i, f);
        }
    }

    public static /* synthetic */ ViewPager.OnPageChangeListener access$500(PagerSlidingTabStripAType pagerSlidingTabStripAType) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewPager.OnPageChangeListener) ipChange.ipc$dispatch("9dd2743d", new Object[]{pagerSlidingTabStripAType}) : pagerSlidingTabStripAType.mDelegatePageListener;
    }

    public void setCacheEnalbe(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3ae9356", new Object[]{this, new Boolean(z)});
        } else {
            this.mCacheDataEnable = z;
        }
    }

    public void setTextTabSingleLine(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e0c130b", new Object[]{this, new Boolean(z)});
        } else {
            this.textTabSingleLine = z;
        }
    }

    public PagerSlidingTabStripAType(Context context) {
        this(context, null);
    }

    public PagerSlidingTabStripAType(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PagerSlidingTabStripAType(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mCurrentPosition = 0;
        this.mCurrentPositionOffset = 0.0f;
        this.mIndicatorMarginBottom = 0;
        this.mScrollOffset = com.taobao.taolive.sdk.utils.b.a(getContext(), 52.0f);
        this.mLastScrollX = 0;
        this.h = 0;
        this.w = 0;
        this.mCacheDataEnable = false;
        this.textTabSingleLine = false;
        this.enableNewTabUI = false;
        this.context = context;
        setFillViewport(true);
        setWillNotDraw(false);
        this.mTabsContainer = new LinearLayout(context);
        this.mTabsContainer.setOrientation(0);
        if (attributeSet != null) {
            for (int i2 = 0; i2 < attributeSet.getAttributeCount(); i2++) {
                if ("layout_height".equals(attributeSet.getAttributeName(i2))) {
                    String attributeValue = attributeSet.getAttributeValue(i2);
                    if (!l.e(attributeValue)) {
                        this.h = (int) Float.parseFloat(Pattern.compile("dip").matcher(attributeValue).replaceAll(""));
                    }
                }
                if ("layout_width".equals(attributeSet.getAttributeName(i2))) {
                    String attributeValue2 = attributeSet.getAttributeValue(i2);
                    if (!l.e(attributeValue2)) {
                        this.w = (int) Float.parseFloat(Pattern.compile("dip").matcher(attributeValue2).replaceAll(""));
                    }
                }
            }
        }
        if (this.h > 0 && this.w > 0) {
            this.mTabsContainer.setLayoutParams(new FrameLayout.LayoutParams(com.taobao.taolive.sdk.utils.b.a(getContext(), this.w), com.taobao.taolive.sdk.utils.b.a(getContext(), this.h)));
        } else {
            this.mTabsContainer.setLayoutParams(new FrameLayout.LayoutParams(-2, -1));
        }
        addView(this.mTabsContainer);
        this.mPaint = new Paint();
        this.mPaint.setAntiAlias(true);
        this.mPaint.setStyle(Paint.Style.FILL);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.PagerSlidingTabStripAType, i, 0);
        if (obtainStyledAttributes != null) {
            this.mPaint.setColor(obtainStyledAttributes.getColor(R.styleable.PagerSlidingTabStripAType_indicatorColor_AType, -7829368));
            this.textColor = obtainStyledAttributes.getColor(R.styleable.PagerSlidingTabStripAType_psts_textColor_AType, Color.parseColor("#333333"));
            this.selectColor = obtainStyledAttributes.getColor(R.styleable.PagerSlidingTabStripAType_psts_selectTextColor_AType, Color.parseColor("#aaaaaa"));
            this.mIndicatorHeight = obtainStyledAttributes.getDimensionPixelSize(R.styleable.PagerSlidingTabStripAType_indicatorHeight_AType, 12);
            this.mIndicatorWidth = obtainStyledAttributes.getDimensionPixelSize(R.styleable.PagerSlidingTabStripAType_indicatorWidth_AType, 96);
            this.mIndicatorMarginBottom = obtainStyledAttributes.getDimensionPixelOffset(R.styleable.PagerSlidingTabStripAType_indicatorMarginBottom_AType, 0);
            this.textSize = obtainStyledAttributes.getDimensionPixelSize(R.styleable.PagerSlidingTabStripAType_textSize_AType, 32);
            this.textStyle = obtainStyledAttributes.getInt(R.styleable.PagerSlidingTabStripAType_textStyle_AType, 0);
            this.selectTextStyle = obtainStyledAttributes.getInt(R.styleable.PagerSlidingTabStripAType_select_textStyle_AType, 0);
            this.textDefaultMargin = obtainStyledAttributes.getDimensionPixelSize(R.styleable.PagerSlidingTabStripAType_textDefaultMargin_AType, 30);
            this.mDividerWidth = com.taobao.taolive.sdk.utils.b.a(context, 0.5f);
            this.mDividerHeight = com.taobao.taolive.sdk.utils.b.a(context, 15.0f);
            this.mDividerColor = getResources().getColor(R.color.taolive_light_gray);
            obtainStyledAttributes.recycle();
        }
        this.mTabLayoutParams = new LinearLayout.LayoutParams(-2, -1);
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        LinearLayout linearLayout = this.mTabsContainer;
        if (linearLayout != null) {
            for (int childCount = linearLayout.getChildCount() - 1; childCount >= 0; childCount--) {
                this.mTabsContainer.getChildAt(childCount).setOnClickListener(null);
            }
            this.mTabsContainer.removeAllViews();
        }
        this.mOnClickListener = null;
        ViewPager viewPager = this.mViewPager;
        if (viewPager != null) {
            viewPager.setOnPageChangeListener(null);
        }
        this.mViewPager = null;
        this.mInnerPageListener = null;
        this.mDelegatePageListener = null;
        this.mPaint = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        if (!this.mCacheDataEnable) {
            destroy();
        }
        super.onDetachedFromWindow();
    }

    public void setViewPager(ViewPager viewPager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45940d39", new Object[]{this, viewPager});
            return;
        }
        this.mViewPager = viewPager;
        if (viewPager.getAdapter() == null) {
            throw new IllegalStateException("ViewPager does not have adapter instance.");
        }
        if (this.mInnerPageListener == null) {
            this.mInnerPageListener = new a();
        }
        viewPager.setOnPageChangeListener(this.mInnerPageListener);
        notifyDataSetChanged(0);
    }

    public void setOnPageChangeListener(ViewPager.OnPageChangeListener onPageChangeListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c756499", new Object[]{this, onPageChangeListener});
        } else {
            this.mDelegatePageListener = onPageChangeListener;
        }
    }

    public void notifyDataSetChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee4b6b97", new Object[]{this, new Integer(i)});
            return;
        }
        this.mTabsContainer.removeAllViews();
        this.mTabCount = this.mViewPager.getAdapter().getCount();
        for (int i2 = 0; i2 < this.mTabCount; i2++) {
            if (this.mViewPager.getAdapter() instanceof b) {
                addTab(i2, ((b) this.mViewPager.getAdapter()).a(i2));
            } else {
                addTextTab(i2, this.mViewPager.getAdapter().getPageTitle(i2));
            }
        }
        selectTab(i);
    }

    public void addTextTab(int i, CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56d5a19", new Object[]{this, new Integer(i), charSequence});
            return;
        }
        String str = charSequence.toString().split("  ")[0];
        RelativeLayout relativeLayout = (RelativeLayout) LayoutInflater.from(getContext()).inflate(R.layout.taolive_goods_multi_dynamic_tab_flexalocal, (ViewGroup) this.mTabsContainer, false);
        TextView textView = (TextView) relativeLayout.findViewById(R.id.taolive_goods_strip_text);
        textView.setText(str);
        textView.setTextSize(0, this.textSize);
        textView.setTypeface(null, this.textStyle);
        if (this.textTabSingleLine) {
            textView.setSingleLine(true);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(13, -1);
            textView.setLayoutParams(layoutParams);
        }
        textView.setGravity(17);
        relativeLayout.setGravity(17);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        textView.measure(makeMeasureSpec, makeMeasureSpec);
        int measuredWidth = textView.getMeasuredWidth();
        if (this.textTabSingleLine) {
            this.mTabLayoutParams = new LinearLayout.LayoutParams(-2, -1);
        } else {
            this.mTabLayoutParams = new LinearLayout.LayoutParams(measuredWidth, -1);
        }
        LinearLayout.LayoutParams layoutParams2 = this.mTabLayoutParams;
        int i2 = this.textDefaultMargin;
        layoutParams2.setMargins(i2, 0, i2, 0);
        addTab(i, relativeLayout, this.mTabLayoutParams);
    }

    public void addTab(int i, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d7e872a", new Object[]{this, new Integer(i), view});
        } else {
            addTab(i, view, null);
        }
    }

    public void addTab(int i, View view, LinearLayout.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56d5a99f", new Object[]{this, new Integer(i), view, layoutParams});
            return;
        }
        if (this.mOnClickListener == null) {
            this.mOnClickListener = new View.OnClickListener() { // from class: com.taobao.android.live.plugin.atype.flexalocal.input.view.PagerSlidingTabStripAType.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view2});
                        return;
                    }
                    try {
                        PagerSlidingTabStripAType.access$100(PagerSlidingTabStripAType.this).setCurrentItem(((Integer) view2.getTag()).intValue());
                    } catch (Exception unused) {
                    }
                }
            };
        }
        view.setFocusable(true);
        view.setOnClickListener(this.mOnClickListener);
        view.setTag(Integer.valueOf(i));
        if (layoutParams != null) {
            this.mTabsContainer.addView(view, i, this.mTabLayoutParams);
        } else {
            this.mTabsContainer.addView(view, i);
        }
    }

    private void scrollToChild(int i, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c08450b8", new Object[]{this, new Integer(i), new Float(f)});
        } else if (this.mTabCount == 0) {
        } else {
            this.mCurrentPosition = i;
            View childAt = this.mTabsContainer.getChildAt(i);
            if (childAt == null) {
                return;
            }
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int left = (int) ((childAt.getLeft() - (layoutParams != null ? layoutParams.leftMargin : 0)) + (childAt.getWidth() * f));
            if (i > 0 || f > 0.0f) {
                left -= this.mScrollOffset;
            }
            if (left == this.mLastScrollX) {
                return;
            }
            this.mLastScrollX = left;
            scrollTo(left, 0);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        super.onDraw(canvas);
        if (isInEditMode() || this.mTabCount == 0) {
            return;
        }
        int height = getHeight();
        View childAt = this.mTabsContainer.getChildAt(this.mCurrentPosition);
        if (childAt == null) {
            return;
        }
        float left = childAt.getLeft();
        float right = childAt.getRight();
        if (this.mCurrentPositionOffset > 0.0f && (i = this.mCurrentPosition) < this.mTabCount - 1) {
            View childAt2 = this.mTabsContainer.getChildAt(i + 1);
            float f = this.mCurrentPositionOffset;
            left += (childAt2.getLeft() - left) * f;
            right += f * (childAt2.getRight() - right);
        }
        int i2 = this.mIndicatorWidth;
        int i3 = this.mIndicatorMarginBottom;
        canvas.drawRect(left + (i2 / 2), (height - this.mIndicatorHeight) - i3, right - (i2 / 2), height - i3, this.mPaint);
    }

    public void setIndicatorColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c30a586", new Object[]{this, new Integer(i)});
            return;
        }
        Paint paint = this.mPaint;
        if (paint == null) {
            return;
        }
        paint.setColor(i);
    }

    /* loaded from: classes6.dex */
    public class a implements ViewPager.OnPageChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-645952685);
            kge.a(1848919473);
        }

        private a() {
        }

        @Override // android.support.v4.view.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f4c13b05", new Object[]{this, new Integer(i), new Float(f), new Integer(i2)});
                return;
            }
            PagerSlidingTabStripAType.access$202(PagerSlidingTabStripAType.this, i);
            PagerSlidingTabStripAType.access$302(PagerSlidingTabStripAType.this, f);
            PagerSlidingTabStripAType.access$400(PagerSlidingTabStripAType.this, i, f);
            PagerSlidingTabStripAType.this.invalidate();
            if (PagerSlidingTabStripAType.access$500(PagerSlidingTabStripAType.this) == null) {
                return;
            }
            PagerSlidingTabStripAType.access$500(PagerSlidingTabStripAType.this).onPageScrolled(i, f, i2);
        }

        @Override // android.support.v4.view.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6581cc1e", new Object[]{this, new Integer(i)});
                return;
            }
            if (i == 0) {
                PagerSlidingTabStripAType pagerSlidingTabStripAType = PagerSlidingTabStripAType.this;
                PagerSlidingTabStripAType.access$400(pagerSlidingTabStripAType, PagerSlidingTabStripAType.access$100(pagerSlidingTabStripAType).getCurrentItem(), 0.0f);
            }
            if (PagerSlidingTabStripAType.access$500(PagerSlidingTabStripAType.this) == null) {
                return;
            }
            PagerSlidingTabStripAType.access$500(PagerSlidingTabStripAType.this).onPageScrollStateChanged(i);
        }

        @Override // android.support.v4.view.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i)});
                return;
            }
            PagerSlidingTabStripAType.this.selectTab(i);
            if (PagerSlidingTabStripAType.access$500(PagerSlidingTabStripAType.this) == null) {
                return;
            }
            PagerSlidingTabStripAType.access$500(PagerSlidingTabStripAType.this).onPageSelected(i);
        }
    }

    public void setEnableNewTabUI(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45cca11f", new Object[]{this, new Boolean(z)});
        } else {
            this.enableNewTabUI = z;
        }
    }

    public void selectTab(int i) {
        TextView textView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffde1203", new Object[]{this, new Integer(i)});
            return;
        }
        for (int i2 = 0; i2 < this.mTabCount; i2++) {
            View childAt = this.mTabsContainer.getChildAt(i2);
            RelativeLayout relativeLayout = (RelativeLayout) childAt;
            if (childAt == null || (textView = (TextView) relativeLayout.findViewById(R.id.taolive_goods_strip_text)) == null) {
                return;
            }
            if (i2 == i) {
                childAt.setSelected(true);
                textView.setTextColor(this.selectColor);
                textView.setTypeface(null, this.selectTextStyle);
            } else {
                childAt.setSelected(false);
                textView.setTextColor(this.textColor);
                textView.setTypeface(null, this.textStyle);
            }
            if (this.enableNewTabUI) {
                View findViewById = relativeLayout.findViewById(R.id.taolive_goods_strip_container);
                if (findViewById != null) {
                    if (i2 == i) {
                        findViewById.setBackgroundResource(R.drawable.taolive_goods_tab_item_bg_selected_flexalocal);
                    } else {
                        findViewById.setBackgroundResource(R.drawable.taolive_goods_tab_item_bg_flexalocal);
                    }
                }
            } else {
                View findViewById2 = relativeLayout.findViewById(R.id.taolive_goods_strip_image_selected);
                View findViewById3 = relativeLayout.findViewById(R.id.taolive_goods_strip_image_unselected);
                if (findViewById2 != null && findViewById3 != null) {
                    if (i2 == i) {
                        findViewById2.setVisibility(0);
                        findViewById3.setVisibility(8);
                    } else {
                        findViewById2.setVisibility(8);
                        findViewById3.setVisibility(0);
                    }
                }
            }
        }
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
        this.mCurrentPosition = savedState.currentPosition;
        requestLayout();
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public Parcelable onSaveInstanceState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Parcelable) ipChange.ipc$dispatch("19c12aa", new Object[]{this});
        }
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.currentPosition = this.mCurrentPosition;
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
            kge.a(658988346);
            CREATOR = new Parcelable.Creator<SavedState>() { // from class: com.taobao.android.live.plugin.atype.flexalocal.input.view.PagerSlidingTabStripAType.SavedState.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Type inference failed for: r4v3, types: [com.taobao.android.live.plugin.atype.flexalocal.input.view.PagerSlidingTabStripAType$SavedState, java.lang.Object] */
                @Override // android.os.Parcelable.Creator
                public /* synthetic */ SavedState createFromParcel(Parcel parcel) {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c057b5b", new Object[]{this, parcel}) : a(parcel);
                }

                /* JADX WARN: Type inference failed for: r5v4, types: [com.taobao.android.live.plugin.atype.flexalocal.input.view.PagerSlidingTabStripAType$SavedState[], java.lang.Object[]] */
                @Override // android.os.Parcelable.Creator
                public /* synthetic */ SavedState[] newArray(int i) {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? (Object[]) ipChange.ipc$dispatch("aaa7de04", new Object[]{this, new Integer(i)}) : a(i);
                }

                public SavedState a(Parcel parcel) {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? (SavedState) ipChange.ipc$dispatch("365404bc", new Object[]{this, parcel}) : new SavedState(parcel);
                }

                public SavedState[] a(int i) {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? (SavedState[]) ipChange.ipc$dispatch("ba4c1aed", new Object[]{this, new Integer(i)}) : new SavedState[i];
                }
            };
        }
    }
}
