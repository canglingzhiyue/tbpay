package com.taobao.uikit.extend.component.unify.Dialog;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.ScrollView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.component.unify.Dialog.TBMaterialDialog;
import com.taobao.uikit.extend.utils.ResourceUtils;
import tb.kge;

/* loaded from: classes9.dex */
public class TBDialogRootLayout extends ViewGroup {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int INDEX_NEGATIVE = 1;
    private static final int INDEX_NEUTRAL = 0;
    private static final int INDEX_POSITIVE = 2;
    private ViewTreeObserver.OnScrollChangedListener mBottomOnScrollChangedListener;
    private int mButtonBarHeight;
    private GravityEnum mButtonGravity;
    private int mButtonHorizontalEdgeMargin;
    private int mButtonPaddingFull;
    private final TBDialogButton[] mButtons;
    public boolean mCardDialog;
    private View mCloseButton;
    private View mContent;
    private Paint mDividerPaint;
    private int mDividerWidth;
    private boolean mDrawBottomDivider;
    private boolean mDrawTopDivider;
    private boolean mForceStack;
    private boolean mIsStacked;
    private int mMaxBoundedHeight;
    private int mMaxCardHeight;
    private int mMaxCardWidth;
    private boolean mNoTitleNoPadding;
    private int mNoTitlePaddingFull;
    private boolean mReducePaddingNoTitleNoButtons;
    private View mTitleBar;
    private ViewTreeObserver.OnScrollChangedListener mTopOnScrollChangedListener;
    private boolean mUseFullPadding;

    /* renamed from: com.taobao.uikit.extend.component.unify.Dialog.TBDialogRootLayout$3  reason: invalid class name */
    /* loaded from: classes9.dex */
    public static /* synthetic */ class AnonymousClass3 {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$uikit$extend$component$unify$Dialog$GravityEnum = new int[GravityEnum.values().length];

        static {
            try {
                $SwitchMap$com$taobao$uikit$extend$component$unify$Dialog$GravityEnum[GravityEnum.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$taobao$uikit$extend$component$unify$Dialog$GravityEnum[GravityEnum.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static {
        kge.a(-23149002);
    }

    public static /* synthetic */ Object ipc$super(TBDialogRootLayout tBDialogRootLayout, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1117127205) {
            super.onDraw((Canvas) objArr[0]);
            return null;
        } else if (hashCode != -436676516) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onFinishInflate();
            return null;
        }
    }

    public static /* synthetic */ boolean access$000(WebView webView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("96b2731e", new Object[]{webView})).booleanValue() : canWebViewScroll(webView);
    }

    public static /* synthetic */ boolean access$102(TBDialogRootLayout tBDialogRootLayout, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f99a1967", new Object[]{tBDialogRootLayout, new Boolean(z)})).booleanValue();
        }
        tBDialogRootLayout.mDrawTopDivider = z;
        return z;
    }

    public static /* synthetic */ boolean access$202(TBDialogRootLayout tBDialogRootLayout, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2d484428", new Object[]{tBDialogRootLayout, new Boolean(z)})).booleanValue();
        }
        tBDialogRootLayout.mDrawBottomDivider = z;
        return z;
    }

    public static /* synthetic */ void access$300(TBDialogRootLayout tBDialogRootLayout, ViewGroup viewGroup, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79f2a3d0", new Object[]{tBDialogRootLayout, viewGroup, new Boolean(z), new Boolean(z2)});
        } else {
            tBDialogRootLayout.addScrollListener(viewGroup, z, z2);
        }
    }

    public static /* synthetic */ TBDialogButton[] access$400(TBDialogRootLayout tBDialogRootLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBDialogButton[]) ipChange.ipc$dispatch("857acf76", new Object[]{tBDialogRootLayout}) : tBDialogRootLayout.mButtons;
    }

    public static /* synthetic */ void access$500(TBDialogRootLayout tBDialogRootLayout, WebView webView, boolean z, boolean z2, boolean z3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69552122", new Object[]{tBDialogRootLayout, webView, new Boolean(z), new Boolean(z2), new Boolean(z3)});
        } else {
            tBDialogRootLayout.invalidateDividersForWebView(webView, z, z2, z3);
        }
    }

    public static /* synthetic */ void access$600(TBDialogRootLayout tBDialogRootLayout, ViewGroup viewGroup, boolean z, boolean z2, boolean z3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf846b87", new Object[]{tBDialogRootLayout, viewGroup, new Boolean(z), new Boolean(z2), new Boolean(z3)});
        } else {
            tBDialogRootLayout.invalidateDividersForScrollingView(viewGroup, z, z2, z3);
        }
    }

    public TBDialogRootLayout(Context context) {
        super(context);
        this.mButtonGravity = GravityEnum.START;
        this.mButtons = new TBDialogButton[3];
        this.mDrawTopDivider = false;
        this.mDrawBottomDivider = false;
        this.mForceStack = false;
        this.mIsStacked = false;
        this.mUseFullPadding = true;
        this.mCardDialog = false;
        this.mMaxBoundedHeight = 0;
        this.mMaxCardHeight = 0;
        this.mMaxCardWidth = 0;
        init(context, null, 0);
    }

    public TBDialogRootLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mButtonGravity = GravityEnum.START;
        this.mButtons = new TBDialogButton[3];
        this.mDrawTopDivider = false;
        this.mDrawBottomDivider = false;
        this.mForceStack = false;
        this.mIsStacked = false;
        this.mUseFullPadding = true;
        this.mCardDialog = false;
        this.mMaxBoundedHeight = 0;
        this.mMaxCardHeight = 0;
        this.mMaxCardWidth = 0;
        init(context, attributeSet, 0);
    }

    public TBDialogRootLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mButtonGravity = GravityEnum.START;
        this.mButtons = new TBDialogButton[3];
        this.mDrawTopDivider = false;
        this.mDrawBottomDivider = false;
        this.mForceStack = false;
        this.mIsStacked = false;
        this.mUseFullPadding = true;
        this.mCardDialog = false;
        this.mMaxBoundedHeight = 0;
        this.mMaxCardHeight = 0;
        this.mMaxCardWidth = 0;
        init(context, attributeSet, i);
    }

    public TBDialogRootLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.mButtonGravity = GravityEnum.START;
        this.mButtons = new TBDialogButton[3];
        this.mDrawTopDivider = false;
        this.mDrawBottomDivider = false;
        this.mForceStack = false;
        this.mIsStacked = false;
        this.mUseFullPadding = true;
        this.mCardDialog = false;
        this.mMaxBoundedHeight = 0;
        this.mMaxCardHeight = 0;
        this.mMaxCardWidth = 0;
        init(context, attributeSet, i);
    }

    private void init(Context context, AttributeSet attributeSet, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa26a346", new Object[]{this, context, attributeSet, new Integer(i)});
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.TBDialogRootLayout, i, 0);
        this.mReducePaddingNoTitleNoButtons = obtainStyledAttributes.getBoolean(R.styleable.TBDialogRootLayout_uik_mdReducePaddingNoTitleNoButtons, true);
        this.mCardDialog = obtainStyledAttributes.getBoolean(R.styleable.TBDialogRootLayout_uik_mdCardDialog, false);
        obtainStyledAttributes.recycle();
        this.mNoTitlePaddingFull = ResourceUtils.getDimensionPixelSize(getContext(), R.dimen.uik_mdTitleVerticalPadding);
        this.mButtonPaddingFull = ResourceUtils.getDimensionPixelSize(getContext(), R.dimen.uik_mdBttonFrameVerticalPadding);
        this.mButtonHorizontalEdgeMargin = ResourceUtils.getDimensionPixelSize(getContext(), R.dimen.uik_mdButtonPaddingFrameSide);
        this.mButtonBarHeight = ResourceUtils.getDimensionPixelSize(getContext(), R.dimen.uik_mdButtonHeight);
        this.mDividerPaint = new Paint();
        this.mDividerWidth = ResourceUtils.getDimensionPixelSize(getContext(), R.dimen.uik_mdDividerHeight);
        this.mDividerPaint.setColor(ResourceUtils.getColor(getContext(), R.color.uik_mdDividerColor));
        setWillNotDraw(false);
        this.mMaxBoundedHeight = ResourceUtils.getDimension(getContext(), R.dimen.uik_mdMaxBoundedHeight);
        this.mMaxCardHeight = ResourceUtils.getDimension(getContext(), R.dimen.uik_mdMaxCardHeight);
        this.mMaxCardWidth = ResourceUtils.getDimension(getContext(), R.dimen.uik_mdMaxCardWidth);
    }

    public void noTitleNoPadding() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90f24fc0", new Object[]{this});
        } else {
            this.mNoTitleNoPadding = true;
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5f8d85c", new Object[]{this});
            return;
        }
        super.onFinishInflate();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getId() == R.id.uik_mdTitleFrame) {
                this.mTitleBar = childAt;
            } else if (childAt.getId() == R.id.uik_mdButtonDefaultNeutral) {
                this.mButtons[0] = (TBDialogButton) childAt;
            } else if (childAt.getId() == R.id.uik_mdButtonDefaultNegative) {
                this.mButtons[1] = (TBDialogButton) childAt;
            } else if (childAt.getId() == R.id.uik_mdButtonDefaultPositive) {
                this.mButtons[2] = (TBDialogButton) childAt;
            } else if (childAt.getId() == R.id.uik_mdButtonClose) {
                this.mCloseButton = childAt;
            } else {
                this.mContent = childAt;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0196  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r13, int r14) {
        /*
            Method dump skipped, instructions count: 412
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.uikit.extend.component.unify.Dialog.TBDialogRootLayout.onMeasure(int, int):void");
    }

    private static boolean isVisible(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1ae32407", new Object[]{view})).booleanValue();
        }
        boolean z = (view == null || view.getVisibility() == 8) ? false : true;
        return (!z || !(view instanceof TBDialogButton)) ? z : ((TBDialogButton) view).getText().toString().trim().length() > 0;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        super.onDraw(canvas);
        View view = this.mContent;
        if (view == null) {
            return;
        }
        if (this.mDrawTopDivider) {
            int top = view.getTop();
            canvas.drawRect(0.0f, top - this.mDividerWidth, getMeasuredWidth(), top, this.mDividerPaint);
        }
        if (!this.mDrawBottomDivider) {
            return;
        }
        int bottom = this.mContent.getBottom();
        canvas.drawRect(0.0f, bottom, getMeasuredWidth(), bottom + this.mDividerWidth, this.mDividerPaint);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int measuredWidth;
        int i7;
        int i8;
        int i9;
        int measuredWidth2;
        int i10;
        int measuredWidth3;
        TBDialogButton[] tBDialogButtonArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        if (isVisible(this.mTitleBar)) {
            int measuredHeight = this.mTitleBar.getMeasuredHeight() + i2;
            this.mTitleBar.layout(i, i2, i3, measuredHeight);
            i2 = measuredHeight;
        } else if (!this.mNoTitleNoPadding && this.mUseFullPadding) {
            i2 += this.mNoTitlePaddingFull;
        }
        if (isVisible(this.mContent)) {
            View view = this.mContent;
            int i11 = i3 - i;
            view.layout((i11 - view.getMeasuredWidth()) / 2, i2, ((i11 - this.mContent.getMeasuredWidth()) / 2) + this.mContent.getMeasuredWidth(), this.mContent.getMeasuredHeight() + i2);
            i2 += this.mContent.getMeasuredHeight();
        }
        if (isVisible(this.mCloseButton)) {
            View view2 = this.mCloseButton;
            int i12 = i3 - i;
            view2.layout((i12 - view2.getMeasuredWidth()) / 2, ((int) getResources().getDimension(R.dimen.uik_mdCardMarginBottom)) + i2, ((i12 - this.mCloseButton.getMeasuredWidth()) / 2) + this.mCloseButton.getMeasuredWidth(), i2 + ((int) getResources().getDimension(R.dimen.uik_mdCardMarginBottom)) + this.mCloseButton.getMeasuredHeight());
        }
        if (this.mIsStacked) {
            int i13 = i4 - this.mButtonPaddingFull;
            for (TBDialogButton tBDialogButton : this.mButtons) {
                if (isVisible(tBDialogButton)) {
                    tBDialogButton.layout(i, i13 - tBDialogButton.getMeasuredHeight(), i3, i13);
                    i13 -= tBDialogButton.getMeasuredHeight();
                }
            }
        } else {
            if (this.mUseFullPadding) {
                i4 -= this.mButtonPaddingFull;
            }
            int i14 = i4 - this.mButtonBarHeight;
            int i15 = this.mButtonHorizontalEdgeMargin;
            if (isVisible(this.mButtons[2])) {
                if (this.mButtonGravity == GravityEnum.END) {
                    measuredWidth3 = i + i15;
                    i10 = this.mButtons[2].getMeasuredWidth() + measuredWidth3;
                    i5 = -1;
                } else {
                    i10 = i3 - i15;
                    measuredWidth3 = i10 - this.mButtons[2].getMeasuredWidth();
                    i5 = measuredWidth3;
                }
                this.mButtons[2].layout(measuredWidth3, i14, i10, i4);
                i15 += this.mButtons[2].getMeasuredWidth();
            } else {
                i5 = -1;
            }
            if (isVisible(this.mButtons[1])) {
                if (this.mButtonGravity == GravityEnum.END) {
                    i9 = i15 + i;
                    measuredWidth2 = this.mButtons[1].getMeasuredWidth() + i9;
                } else if (this.mButtonGravity == GravityEnum.START) {
                    measuredWidth2 = i3 - i15;
                    i9 = measuredWidth2 - this.mButtons[1].getMeasuredWidth();
                } else {
                    i9 = this.mButtonHorizontalEdgeMargin + i;
                    measuredWidth2 = this.mButtons[1].getMeasuredWidth() + i9;
                    i6 = measuredWidth2;
                    this.mButtons[1].layout(i9, i14, measuredWidth2, i4);
                }
                i6 = -1;
                this.mButtons[1].layout(i9, i14, measuredWidth2, i4);
            } else {
                i6 = -1;
            }
            if (isVisible(this.mButtons[0])) {
                if (this.mButtonGravity == GravityEnum.END) {
                    i8 = i3 - this.mButtonHorizontalEdgeMargin;
                    i7 = i8 - this.mButtons[0].getMeasuredWidth();
                } else if (this.mButtonGravity == GravityEnum.START) {
                    i7 = i + this.mButtonHorizontalEdgeMargin;
                    i8 = i7 + this.mButtons[0].getMeasuredWidth();
                } else {
                    if (i6 != -1 || i5 == -1) {
                        if (i5 == -1 && i6 != -1) {
                            measuredWidth = this.mButtons[0].getMeasuredWidth();
                        } else if (i5 == -1) {
                            i6 = ((i3 - i) / 2) - (this.mButtons[0].getMeasuredWidth() / 2);
                            measuredWidth = this.mButtons[0].getMeasuredWidth();
                        }
                        i5 = i6 + measuredWidth;
                    } else {
                        i6 = i5 - this.mButtons[0].getMeasuredWidth();
                    }
                    i7 = i6;
                    i8 = i5;
                }
                this.mButtons[0].layout(i7, i14, i8, i4);
            }
        }
        setUpDividersVisibility(this.mContent, true, true);
    }

    public void setForceStack(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b374ba2e", new Object[]{this, new Boolean(z)});
            return;
        }
        this.mForceStack = z;
        invalidate();
    }

    public void setDividerColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("880bad90", new Object[]{this, new Integer(i)});
            return;
        }
        this.mDividerPaint.setColor(i);
        invalidate();
    }

    public void setButtonGravity(GravityEnum gravityEnum) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a990095", new Object[]{this, gravityEnum});
            return;
        }
        this.mButtonGravity = gravityEnum;
        invertGravityIfNecessary();
    }

    private void invertGravityIfNecessary() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e78bbd81", new Object[]{this});
        } else if (Build.VERSION.SDK_INT < 17 || getResources().getConfiguration().getLayoutDirection() != 1) {
        } else {
            int i = AnonymousClass3.$SwitchMap$com$taobao$uikit$extend$component$unify$Dialog$GravityEnum[this.mButtonGravity.ordinal()];
            if (i == 1) {
                this.mButtonGravity = GravityEnum.END;
            } else if (i != 2) {
            } else {
                this.mButtonGravity = GravityEnum.START;
            }
        }
    }

    public void setButtonStackedGravity(GravityEnum gravityEnum) {
        TBDialogButton[] tBDialogButtonArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fe6e196", new Object[]{this, gravityEnum});
            return;
        }
        for (TBDialogButton tBDialogButton : this.mButtons) {
            if (tBDialogButton != null) {
                tBDialogButton.setStackedGravity(gravityEnum);
            }
        }
    }

    private void setUpDividersVisibility(final View view, final boolean z, final boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5580c822", new Object[]{this, view, new Boolean(z), new Boolean(z2)});
        } else if (view == null) {
        } else {
            if (view instanceof ScrollView) {
                ScrollView scrollView = (ScrollView) view;
                if (canScrollViewScroll(scrollView)) {
                    addScrollListener(scrollView, z, z2);
                    return;
                }
                if (z) {
                    this.mDrawTopDivider = false;
                }
                if (!z2) {
                    return;
                }
                this.mDrawBottomDivider = false;
            } else if (view instanceof AdapterView) {
                AdapterView adapterView = (AdapterView) view;
                if (canAdapterViewScroll(adapterView)) {
                    addScrollListener(adapterView, z, z2);
                    return;
                }
                if (z) {
                    this.mDrawTopDivider = false;
                }
                if (!z2) {
                    return;
                }
                this.mDrawBottomDivider = false;
            } else if (view instanceof WebView) {
                view.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: com.taobao.uikit.extend.component.unify.Dialog.TBDialogRootLayout.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.ViewTreeObserver.OnPreDrawListener
                    public boolean onPreDraw() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return ((Boolean) ipChange2.ipc$dispatch("5acfbc33", new Object[]{this})).booleanValue();
                        }
                        if (view.getMeasuredHeight() != 0) {
                            if (!TBDialogRootLayout.access$000((WebView) view)) {
                                if (z) {
                                    TBDialogRootLayout.access$102(TBDialogRootLayout.this, false);
                                }
                                if (z2) {
                                    TBDialogRootLayout.access$202(TBDialogRootLayout.this, false);
                                }
                            } else {
                                TBDialogRootLayout.access$300(TBDialogRootLayout.this, (ViewGroup) view, z, z2);
                            }
                            view.getViewTreeObserver().removeOnPreDrawListener(this);
                        }
                        return true;
                    }
                });
            } else if (view instanceof RecyclerView) {
                boolean canRecyclerViewScroll = canRecyclerViewScroll((RecyclerView) view);
                if (z) {
                    this.mDrawTopDivider = canRecyclerViewScroll;
                }
                if (!z2) {
                    return;
                }
                this.mDrawBottomDivider = canRecyclerViewScroll;
            } else if (!(view instanceof ViewGroup)) {
            } else {
                ViewGroup viewGroup = (ViewGroup) view;
                View topView = getTopView(viewGroup);
                setUpDividersVisibility(topView, z, z2);
                View bottomView = getBottomView(viewGroup);
                if (bottomView == topView) {
                    return;
                }
                setUpDividersVisibility(bottomView, false, true);
            }
        }
    }

    private void addScrollListener(final ViewGroup viewGroup, final boolean z, final boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94964ee8", new Object[]{this, viewGroup, new Boolean(z), new Boolean(z2)});
        } else if ((z2 || this.mTopOnScrollChangedListener != null) && (!z2 || this.mBottomOnScrollChangedListener != null)) {
        } else {
            ViewTreeObserver.OnScrollChangedListener onScrollChangedListener = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.taobao.uikit.extend.component.unify.Dialog.TBDialogRootLayout.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                public void onScrollChanged() {
                    IpChange ipChange2 = $ipChange;
                    boolean z3 = true;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d815a80f", new Object[]{this});
                        return;
                    }
                    TBDialogButton[] access$400 = TBDialogRootLayout.access$400(TBDialogRootLayout.this);
                    int length = access$400.length;
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            TBDialogButton tBDialogButton = access$400[i];
                            if (tBDialogButton != null && tBDialogButton.getVisibility() != 8) {
                                break;
                            }
                            i++;
                        } else {
                            z3 = false;
                            break;
                        }
                    }
                    ViewGroup viewGroup2 = viewGroup;
                    if (viewGroup2 instanceof WebView) {
                        TBDialogRootLayout.access$500(TBDialogRootLayout.this, (WebView) viewGroup2, z, z2, z3);
                    } else {
                        TBDialogRootLayout.access$600(TBDialogRootLayout.this, viewGroup2, z, z2, z3);
                    }
                    TBDialogRootLayout.this.invalidate();
                }
            };
            if (!z2) {
                this.mTopOnScrollChangedListener = onScrollChangedListener;
                viewGroup.getViewTreeObserver().addOnScrollChangedListener(this.mTopOnScrollChangedListener);
            } else {
                this.mBottomOnScrollChangedListener = onScrollChangedListener;
                viewGroup.getViewTreeObserver().addOnScrollChangedListener(this.mBottomOnScrollChangedListener);
            }
            onScrollChangedListener.onScrollChanged();
        }
    }

    private void invalidateDividersForScrollingView(ViewGroup viewGroup, boolean z, boolean z2, boolean z3) {
        IpChange ipChange = $ipChange;
        boolean z4 = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae242d28", new Object[]{this, viewGroup, new Boolean(z), new Boolean(z2), new Boolean(z3)});
            return;
        }
        if (z && viewGroup.getChildCount() > 0) {
            View view = this.mTitleBar;
            this.mDrawTopDivider = (view == null || view.getVisibility() == 8 || viewGroup.getScrollY() + viewGroup.getPaddingTop() <= viewGroup.getChildAt(0).getTop()) ? false : true;
        }
        if (!z2 || viewGroup.getChildCount() <= 0) {
            return;
        }
        if (!z3 || (viewGroup.getScrollY() + viewGroup.getHeight()) - viewGroup.getPaddingBottom() >= viewGroup.getChildAt(viewGroup.getChildCount() - 1).getBottom()) {
            z4 = false;
        }
        this.mDrawBottomDivider = z4;
    }

    private void invalidateDividersForWebView(WebView webView, boolean z, boolean z2, boolean z3) {
        IpChange ipChange = $ipChange;
        boolean z4 = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90f73f85", new Object[]{this, webView, new Boolean(z), new Boolean(z2), new Boolean(z3)});
            return;
        }
        if (z) {
            View view = this.mTitleBar;
            this.mDrawTopDivider = (view == null || view.getVisibility() == 8 || webView.getScrollY() + webView.getPaddingTop() <= 0) ? false : true;
        }
        if (!z2) {
            return;
        }
        if (!z3 || (webView.getScrollY() + webView.getMeasuredHeight()) - webView.getPaddingBottom() >= webView.getContentHeight() * webView.getScale()) {
            z4 = false;
        }
        this.mDrawBottomDivider = z4;
    }

    public static boolean canRecyclerViewScroll(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4df8449a", new Object[]{recyclerView})).booleanValue();
        }
        if (recyclerView == null || recyclerView.getAdapter() == null || recyclerView.getLayoutManager() == null) {
            return false;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        int itemCount = recyclerView.getAdapter().getItemCount();
        if (layoutManager instanceof LinearLayoutManager) {
            int findLastVisibleItemPosition = ((LinearLayoutManager) layoutManager).findLastVisibleItemPosition();
            if (findLastVisibleItemPosition == -1) {
                return false;
            }
            return !(findLastVisibleItemPosition == itemCount - 1) || (recyclerView.getChildCount() > 0 && recyclerView.getChildAt(recyclerView.getChildCount() - 1).getBottom() > recyclerView.getHeight() - recyclerView.getPaddingBottom());
        }
        throw new TBMaterialDialog.NotImplementedException("Material Dialogs currently only supports LinearLayoutManager. Please report any new layout managers.");
    }

    private static boolean canScrollViewScroll(ScrollView scrollView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d1e625f2", new Object[]{scrollView})).booleanValue() : scrollView.getChildCount() != 0 && (scrollView.getMeasuredHeight() - scrollView.getPaddingTop()) - scrollView.getPaddingBottom() < scrollView.getChildAt(0).getMeasuredHeight();
    }

    private static boolean canWebViewScroll(WebView webView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("83dcb184", new Object[]{webView})).booleanValue() : ((float) webView.getMeasuredHeight()) < ((float) webView.getContentHeight()) * webView.getScale();
    }

    private static boolean canAdapterViewScroll(AdapterView adapterView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aaac1b62", new Object[]{adapterView})).booleanValue();
        }
        if (adapterView.getLastVisiblePosition() == -1) {
            return false;
        }
        return !(adapterView.getFirstVisiblePosition() == 0) || !(adapterView.getLastVisiblePosition() == adapterView.getCount() - 1) || adapterView.getChildCount() <= 0 || adapterView.getChildAt(0).getTop() < adapterView.getPaddingTop() || adapterView.getChildAt(adapterView.getChildCount() - 1).getBottom() > adapterView.getHeight() - adapterView.getPaddingBottom();
    }

    private static View getBottomView(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("eace2f6e", new Object[]{viewGroup});
        }
        if (viewGroup == null || viewGroup.getChildCount() == 0) {
            return null;
        }
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount);
            if (childAt.getVisibility() == 0 && childAt.getBottom() == viewGroup.getMeasuredHeight()) {
                return childAt;
            }
        }
        return null;
    }

    private static View getTopView(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("43e468ec", new Object[]{viewGroup});
        }
        if (viewGroup == null || viewGroup.getChildCount() == 0) {
            return null;
        }
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount);
            if (childAt.getVisibility() == 0 && childAt.getTop() == 0) {
                return childAt;
            }
        }
        return null;
    }
}
