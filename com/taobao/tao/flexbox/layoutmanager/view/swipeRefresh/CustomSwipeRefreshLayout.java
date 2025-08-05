package com.taobao.tao.flexbox.layoutmanager.view.swipeRefresh;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Scroller;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.uikit.feature.features.internal.pullrefresh.CustomProgressBar;
import tb.kge;
import tb.oeb;
import tb.ogg;
import tb.ohd;

/* loaded from: classes8.dex */
public class CustomSwipeRefreshLayout extends ViewGroup {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "CustomSwipeRefreshLayout";
    private static Typeface sIconfont;
    private static int sReference;
    private boolean enableFirstStage;
    private TextView mArrow;
    private float mDragRate;
    private int mFirstStageHeight;
    private int mFirstStageHotZoneHeight;
    private int mFirstStageOffset;
    private ViewGroup mFirstStageView;
    private boolean mIntercepting;
    private boolean mIsFirstStageShowing;
    private boolean mIsRefreshing;
    private a mOnRefreshListener;
    private CustomProgressBar mProgressBar;
    private RecyclerView mRecyclerView;
    private TextView mRefreshTipText;
    private Scroller mScroller;
    private int mSecondStageHeight;
    private LinearLayout mSecondView;
    private float mStartY;
    private View mTarget;
    private float mTempY;

    /* loaded from: classes8.dex */
    public interface a {
        void a();

        void a(boolean z, boolean z2);
    }

    public static /* synthetic */ Object ipc$super(CustomSwipeRefreshLayout customSwipeRefreshLayout, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 650865254) {
            super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
            return null;
        } else if (hashCode == 949399698) {
            super.onDetachedFromWindow();
            return null;
        } else if (hashCode != 1626033557) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onAttachedToWindow();
            return null;
        }
    }

    public static /* synthetic */ int access$002(CustomSwipeRefreshLayout customSwipeRefreshLayout, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3a15b377", new Object[]{customSwipeRefreshLayout, new Integer(i)})).intValue();
        }
        customSwipeRefreshLayout.mFirstStageHeight = i;
        return i;
    }

    public static /* synthetic */ int access$102(CustomSwipeRefreshLayout customSwipeRefreshLayout, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("231d7878", new Object[]{customSwipeRefreshLayout, new Integer(i)})).intValue();
        }
        customSwipeRefreshLayout.mFirstStageHotZoneHeight = i;
        return i;
    }

    public static /* synthetic */ boolean access$200(CustomSwipeRefreshLayout customSwipeRefreshLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7d63d3e3", new Object[]{customSwipeRefreshLayout})).booleanValue() : customSwipeRefreshLayout.enableFirstStage;
    }

    public static /* synthetic */ ViewGroup access$300(CustomSwipeRefreshLayout customSwipeRefreshLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("a2b6f997", new Object[]{customSwipeRefreshLayout}) : customSwipeRefreshLayout.mFirstStageView;
    }

    static {
        kge.a(83543145);
        sReference = 0;
    }

    public void setOnRefreshListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89087ea6", new Object[]{this, aVar});
        } else {
            this.mOnRefreshListener = aVar;
        }
    }

    public void setRefreshing(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("706bb7a4", new Object[]{this, new Boolean(z)});
            return;
        }
        this.mIsRefreshing = z;
        if (z) {
            return;
        }
        if (this.mIsFirstStageShowing) {
            setFirstStageState(true);
        }
        setSecondStageState(false);
        this.mProgressBar.stopLoadingAnimation();
        invalidate();
    }

    private void setFirstStageState(boolean z) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e042c18c", new Object[]{this, new Boolean(z)});
        } else if (!this.enableFirstStage) {
        } else {
            ViewGroup viewGroup = this.mFirstStageView;
            if (!z) {
                i = 4;
            }
            viewGroup.setVisibility(i);
            this.mIsFirstStageShowing = z;
        }
    }

    public void setSecondStageState(boolean z) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88d3a884", new Object[]{this, new Boolean(z)});
            return;
        }
        LinearLayout linearLayout = this.mSecondView;
        if (!z) {
            i = 4;
        }
        linearLayout.setVisibility(i);
    }

    public void bringFirstView2Front() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("485d7a61", new Object[]{this});
            return;
        }
        ViewGroup viewGroup = this.mFirstStageView;
        if (viewGroup == null) {
            return;
        }
        viewGroup.bringToFront();
    }

    public CustomSwipeRefreshLayout(Context context, View view, ViewGroup viewGroup, int i) {
        super(context);
        this.enableFirstStage = true;
        this.mFirstStageHeight = 0;
        this.mIsFirstStageShowing = false;
        this.mSecondStageHeight = 1200;
        this.mIsRefreshing = false;
        this.mIntercepting = false;
        this.mDragRate = 3.1f;
        this.mFirstStageHotZoneHeight = 0;
        this.mTarget = view;
        this.mFirstStageView = viewGroup;
        this.mFirstStageOffset = i;
        init(context);
    }

    public void setTarget(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3de402f8", new Object[]{this, view});
            return;
        }
        this.mTarget = view;
        this.mRecyclerView = findRecyclerView((ViewGroup) this.mTarget);
    }

    public CustomSwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.enableFirstStage = true;
        this.mFirstStageHeight = 0;
        this.mIsFirstStageShowing = false;
        this.mSecondStageHeight = 1200;
        this.mIsRefreshing = false;
        this.mIntercepting = false;
        this.mDragRate = 3.1f;
        this.mFirstStageHotZoneHeight = 0;
        init(context);
    }

    public CustomSwipeRefreshLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.enableFirstStage = true;
        this.mFirstStageHeight = 0;
        this.mIsFirstStageShowing = false;
        this.mSecondStageHeight = 1200;
        this.mIsRefreshing = false;
        this.mIntercepting = false;
        this.mDragRate = 3.1f;
        this.mFirstStageHotZoneHeight = 0;
        init(context);
    }

    public void setFirstStageView(View view, final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81230b3e", new Object[]{this, view, new Boolean(z)});
        } else if (!this.enableFirstStage) {
        } else {
            this.mFirstStageView.removeAllViews();
            this.mFirstStageView.addView(view, new ViewGroup.LayoutParams(-1, -2));
            view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.taobao.tao.flexbox.layoutmanager.view.swipeRefresh.CustomSwipeRefreshLayout.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("899df952", new Object[]{this, view2, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8)});
                        return;
                    }
                    int i9 = i4 - i2;
                    if (i9 > 0) {
                        CustomSwipeRefreshLayout customSwipeRefreshLayout = CustomSwipeRefreshLayout.this;
                        CustomSwipeRefreshLayout.access$002(customSwipeRefreshLayout, i9 - ohd.b(customSwipeRefreshLayout.getContext(), 10));
                        CustomSwipeRefreshLayout customSwipeRefreshLayout2 = CustomSwipeRefreshLayout.this;
                        CustomSwipeRefreshLayout.access$102(customSwipeRefreshLayout2, ohd.b(customSwipeRefreshLayout2.getContext(), 12));
                    }
                    if (!z || i8 - i6 == i9 || !CustomSwipeRefreshLayout.access$200(CustomSwipeRefreshLayout.this)) {
                        return;
                    }
                    CustomSwipeRefreshLayout.this.showFirstStageWhenStart();
                }
            });
        }
    }

    public void setFirstBlankView(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d25cbb91", new Object[]{this, viewGroup});
            return;
        }
        ViewGroup viewGroup2 = this.mFirstStageView;
        if (viewGroup2 == null) {
            return;
        }
        viewGroup2.removeAllViews();
        this.mFirstStageView.addView(viewGroup);
    }

    public void showFirstStageWhenStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2810aa84", new Object[]{this});
            return;
        }
        smoothScrollTo(((-this.mFirstStageOffset) - this.mFirstStageHeight) + this.mFirstStageHotZoneHeight);
        setFirstStageState(true);
        setSecondStageState(false);
        a aVar = this.mOnRefreshListener;
        if (aVar == null || !this.enableFirstStage) {
            return;
        }
        aVar.a(this.mIsFirstStageShowing, true);
    }

    private void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
            return;
        }
        setClipChildren(false);
        this.mScroller = new Scroller(context);
        setFirstStageState(false);
        addView(this.mFirstStageView, new ViewGroup.LayoutParams(-1, -2));
        this.mFirstStageView.post(new Runnable() { // from class: com.taobao.tao.flexbox.layoutmanager.view.swipeRefresh.CustomSwipeRefreshLayout.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (CustomSwipeRefreshLayout.access$300(CustomSwipeRefreshLayout.this) == null || !CustomSwipeRefreshLayout.access$200(CustomSwipeRefreshLayout.this)) {
                } else {
                    CustomSwipeRefreshLayout customSwipeRefreshLayout = CustomSwipeRefreshLayout.this;
                    CustomSwipeRefreshLayout.access$002(customSwipeRefreshLayout, CustomSwipeRefreshLayout.access$300(customSwipeRefreshLayout).getMeasuredHeight());
                }
            }
        });
        this.mSecondView = new LinearLayout(context);
        createSecondView();
        this.mRecyclerView = findRecyclerView((ViewGroup) this.mTarget);
    }

    private RecyclerView findRecyclerView(ViewGroup viewGroup) {
        RecyclerView findRecyclerView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("7c240541", new Object[]{this, viewGroup});
        }
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof RecyclerView) && childAt.getTag(R.id.live_room_recycler_view) != null) {
                return (RecyclerView) childAt;
            }
            if ((childAt instanceof ViewGroup) && (findRecyclerView = findRecyclerView((ViewGroup) childAt)) != null && findRecyclerView.getTag(R.id.live_room_recycler_view) != null) {
                return findRecyclerView;
            }
        }
        return null;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        super.onMeasure(i, i2);
        CustomProgressBar customProgressBar = this.mProgressBar;
        if (customProgressBar != null) {
            customProgressBar.setPullDownDistance(getMeasuredHeight());
        }
        measureChildren(i, i2);
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        int measuredWidth = getMeasuredWidth();
        if (this.enableFirstStage) {
            ViewGroup viewGroup = this.mFirstStageView;
            int i5 = this.mFirstStageHotZoneHeight;
            viewGroup.layout(0, (-this.mFirstStageHeight) + i5, measuredWidth, i5);
        }
        int measuredWidth2 = (measuredWidth - this.mSecondView.getMeasuredWidth()) / 2;
        int b = ((-this.mFirstStageHeight) + ohd.b(getContext(), 12)) - (this.mSecondView.getMeasuredHeight() / 2);
        LinearLayout linearLayout = this.mSecondView;
        linearLayout.layout(measuredWidth2, b, linearLayout.getMeasuredWidth() + measuredWidth2, this.mSecondView.getMeasuredHeight() + b);
        int measuredHeight = getMeasuredHeight();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        this.mTarget.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        if (this.mIsRefreshing) {
            setRefreshing(false);
            return true;
        } else if (this.mIsFirstStageShowing && isPointInsideView(motionEvent.getX(), motionEvent.getY(), this.mFirstStageView)) {
            disAllowIntercept();
            return false;
        } else {
            int action = motionEvent.getAction();
            if (action == 0) {
                this.mStartY = motionEvent.getY();
                this.mTempY = this.mStartY;
                this.mIntercepting = false;
                if (oeb.as() && canChildScrollUp() && this.mIsFirstStageShowing) {
                    this.mIntercepting = false;
                    closeFirstStageView();
                }
            } else if (action != 1) {
                if (action == 2) {
                    float y = motionEvent.getY() - this.mStartY;
                    if ((y > 0.0f && !canChildScrollUp()) || (y < 0.0f && getScrollY() < 0)) {
                        this.mIntercepting = true;
                    }
                } else if (action == 3) {
                    this.mIntercepting = false;
                }
            } else if (this.mIsFirstStageShowing && !isPointInsideView(motionEvent.getX(), motionEvent.getY(), this.mFirstStageView)) {
                closeRefreshLayout();
                this.mIntercepting = false;
            }
            return this.mIntercepting;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
        if (r0 != 3) goto L16;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r12) {
        /*
            Method dump skipped, instructions count: 413
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.flexbox.layoutmanager.view.swipeRefresh.CustomSwipeRefreshLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    private void disAllowIntercept() {
        RecyclerView recyclerView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("606ad8ae", new Object[]{this});
        } else if (!oeb.g() || (recyclerView = this.mRecyclerView) == null || recyclerView.getAdapter() == null || this.mRecyclerView.getAdapter().getItemCount() <= 5) {
        } else {
            ogg.c(TAG, "disAllowIntercept,requestDisallowInterceptTouchEvent(true)");
            requestDisallowInterceptTouchEvent(true);
        }
    }

    private void closeRefreshLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("842cc4d4", new Object[]{this});
            return;
        }
        smoothScrollTo(0);
        setFirstStageState(false);
        setSecondStageState(false);
    }

    private void smoothScrollTo(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a600b26", new Object[]{this, new Integer(i)});
            return;
        }
        this.mScroller.startScroll(0, getScrollY(), 0, i - getScrollY());
        invalidate();
    }

    private boolean canChildScrollUp() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e81f6c1f", new Object[]{this})).booleanValue() : this.mRecyclerView.canScrollVertically(-1);
    }

    @Override // android.view.View
    public void computeScroll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cab3086b", new Object[]{this});
        } else if (!this.mScroller.computeScrollOffset()) {
        } else {
            scrollTo(0, this.mScroller.getCurrY());
            postInvalidate();
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
        if (sIconfont == null) {
            try {
                sIconfont = Typeface.createFromAsset(getContext().getAssets(), "uik_core_iconfont.ttf");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        this.mArrow.setTypeface(sIconfont);
        sReference++;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        this.mArrow.setTypeface(null);
        sReference--;
        if (sReference == 0) {
            sIconfont = null;
        }
        super.onDetachedFromWindow();
    }

    private void createSecondView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbd9dd5c", new Object[]{this});
            return;
        }
        float f = getResources().getDisplayMetrics().density;
        this.mSecondView.setOrientation(1);
        this.mSecondView.setGravity(17);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setGravity(17);
        linearLayout.setOrientation(0);
        linearLayout.setPadding((int) (f * 12.0f), 0, (int) (15.0f * f), 0);
        linearLayout.setBackgroundResource(R.drawable.gg_pull_refresh_bg);
        this.mSecondView.addView(linearLayout, new ViewGroup.LayoutParams(-2, (int) (36.0f * f)));
        FrameLayout frameLayout = new FrameLayout(getContext());
        linearLayout.addView(frameLayout, new LinearLayout.LayoutParams(-2, -2));
        TextView textView = new TextView(getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        frameLayout.addView(textView, layoutParams);
        this.mArrow = textView;
        this.mArrow.setIncludeFontPadding(false);
        this.mArrow.setTextColor(-6710887);
        this.mArrow.setText(getContext().getResources().getString(R.string.uik_refresh_arrow));
        this.mProgressBar = new CustomProgressBar(getContext());
        this.mProgressBar.setPaintColor(-6710887);
        int i = (int) (24.0f * f);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i, i);
        layoutParams2.gravity = 16;
        frameLayout.addView(this.mProgressBar, layoutParams2);
        this.mRefreshTipText = new TextView(getContext());
        this.mRefreshTipText.setText("下拉刷新");
        this.mRefreshTipText.setTextSize(12.0f);
        this.mRefreshTipText.setTextColor(-6710887);
        this.mRefreshTipText.setMaxLines(3);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.leftMargin = (int) (f * 9.0f);
        linearLayout.addView(this.mRefreshTipText, layoutParams3);
    }

    public void setProgress(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bf028ca", new Object[]{this, new Float(f)});
        } else if (getMeasuredHeight() == 0) {
        } else {
            this.mProgressBar.changeProgressBarState((int) (f * getMeasuredHeight()));
        }
    }

    public void closeFirstStageView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67a97512", new Object[]{this});
        } else if (!this.mIsFirstStageShowing) {
        } else {
            setRefreshing(false);
            setFirstStageState(false);
            setSecondStageState(false);
            smoothScrollTo(0);
        }
    }

    public boolean isFirstStageShowing() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b9c60bb8", new Object[]{this})).booleanValue() : this.mIsFirstStageShowing;
    }

    private boolean isPointInsideView(float f, float f2, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1a54f8a8", new Object[]{this, new Float(f), new Float(f2), view})).booleanValue();
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        return f >= ((float) i) && f <= ((float) (i + view.getWidth())) && f2 >= ((float) i2) && f2 <= ((float) (i2 + view.getHeight()));
    }

    public LinearLayout getSecondView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LinearLayout) ipChange.ipc$dispatch("c7e1ca8d", new Object[]{this}) : this.mSecondView;
    }

    public void setEnableFirstStage(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eb83e7a", new Object[]{this, new Boolean(z)});
            return;
        }
        ogg.a(TAG, "setEnableFirstStage:" + z);
        this.enableFirstStage = z;
        if (z) {
            return;
        }
        setFirstStageState(false);
        removeView(this.mFirstStageView);
        this.mIsFirstStageShowing = false;
        this.mFirstStageHeight = 0;
        this.mFirstStageOffset = 0;
    }

    public static int getRecyclerViewTagId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("41d96b75", new Object[0])).intValue() : R.id.live_room_recycler_view;
    }
}
