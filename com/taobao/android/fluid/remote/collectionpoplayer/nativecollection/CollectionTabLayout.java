package com.taobao.android.fluid.remote.collectionpoplayer.nativecollection;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.ohd;
import tb.spz;

/* loaded from: classes5.dex */
public class CollectionTabLayout extends HorizontalScrollView {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int AVERAGE = 2;
    public static final int CORNER_RADIUS = 4;
    public static final int DEFAULT_TAB_WIDTH = 100;
    public static final int HORIZON_PADDING = 40;
    public static final int INDICATOR_DEFAUT_COLOR = -41216;
    public static final int OUTSIDE_ID = 1000;
    public static final int SELECTED_TEXT_COLOR = -15658735;
    public static final int SLIDING_DURATION = 300;
    public static final String TAG = "CollectionTabLayout";
    public static final int UNSELECTED_TEXT_COLOR = -6710887;
    public static final int VERTICAL_PADDING = 10;
    private ValueAnimator animator;
    private boolean hasFixedView;
    private GradientDrawable indicatorDrawable;
    private int indicatorHeight;
    private float indicatorLeft;
    private int indicatorWidth;
    private boolean isOutofTabsContainer;
    private float lastScrollX;
    private a onTabSelectedListener;
    private ObjectAnimator outViewAnimation;
    private int scrollToX;
    private Typeface selectedTabTypeface;
    private int tabCurPosition;
    private LinearLayout tabsContainer;
    private Typeface unselectedTabTypeface;

    /* loaded from: classes5.dex */
    public interface a {
        void a(int i);
    }

    static {
        kge.a(-1852350585);
    }

    public static /* synthetic */ Object ipc$super(CollectionTabLayout collectionTabLayout, String str, Object... objArr) {
        if (str.hashCode() == -1665133574) {
            super.draw((Canvas) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ LinearLayout access$000(CollectionTabLayout collectionTabLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LinearLayout) ipChange.ipc$dispatch("a1360b1a", new Object[]{collectionTabLayout}) : collectionTabLayout.tabsContainer;
    }

    public static /* synthetic */ a access$100(CollectionTabLayout collectionTabLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("4d9f184f", new Object[]{collectionTabLayout}) : collectionTabLayout.onTabSelectedListener;
    }

    public static /* synthetic */ int access$200(CollectionTabLayout collectionTabLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("333edbf4", new Object[]{collectionTabLayout})).intValue() : collectionTabLayout.scrollToX;
    }

    public static /* synthetic */ float access$300(CollectionTabLayout collectionTabLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("13c0a3d0", new Object[]{collectionTabLayout})).floatValue() : collectionTabLayout.lastScrollX;
    }

    public static /* synthetic */ float access$302(CollectionTabLayout collectionTabLayout, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b4e0c052", new Object[]{collectionTabLayout, new Float(f)})).floatValue();
        }
        collectionTabLayout.lastScrollX = f;
        return f;
    }

    public static /* synthetic */ int access$400(CollectionTabLayout collectionTabLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f4426bb2", new Object[]{collectionTabLayout})).intValue() : collectionTabLayout.indicatorWidth;
    }

    public static /* synthetic */ ObjectAnimator access$500(CollectionTabLayout collectionTabLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ObjectAnimator) ipChange.ipc$dispatch("8a5b856", new Object[]{collectionTabLayout}) : collectionTabLayout.outViewAnimation;
    }

    public static /* synthetic */ ObjectAnimator access$502(CollectionTabLayout collectionTabLayout, ObjectAnimator objectAnimator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ObjectAnimator) ipChange.ipc$dispatch("9cdf853a", new Object[]{collectionTabLayout, objectAnimator});
        }
        collectionTabLayout.outViewAnimation = objectAnimator;
        return objectAnimator;
    }

    public static /* synthetic */ boolean access$602(CollectionTabLayout collectionTabLayout, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4406a77d", new Object[]{collectionTabLayout, new Boolean(z)})).booleanValue();
        }
        collectionTabLayout.isOutofTabsContainer = z;
        return z;
    }

    public static /* synthetic */ float access$700(CollectionTabLayout collectionTabLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("95c7c34c", new Object[]{collectionTabLayout})).floatValue() : collectionTabLayout.indicatorLeft;
    }

    public static /* synthetic */ float access$702(CollectionTabLayout collectionTabLayout, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("73bd9056", new Object[]{collectionTabLayout, new Float(f)})).floatValue();
        }
        collectionTabLayout.indicatorLeft = f;
        return f;
    }

    public void setHasFixedView(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d101b8c", new Object[]{this, new Boolean(z)});
        } else {
            this.hasFixedView = z;
        }
    }

    public LinearLayout getTabsContainer() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LinearLayout) ipChange.ipc$dispatch("8e02044b", new Object[]{this}) : this.tabsContainer;
    }

    public int getTabWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("408409a1", new Object[]{this})).intValue();
        }
        if (this.tabsContainer.getChildCount() <= 0) {
            return 100;
        }
        return this.tabsContainer.getChildAt(0).getWidth();
    }

    public CollectionTabLayout(Context context) {
        this(context, null);
    }

    public CollectionTabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CollectionTabLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.selectedTabTypeface = Typeface.DEFAULT_BOLD;
        this.unselectedTabTypeface = Typeface.DEFAULT;
        this.isOutofTabsContainer = false;
        this.hasFixedView = false;
        this.indicatorDrawable = new GradientDrawable();
        this.indicatorWidth = 0;
        this.indicatorHeight = 0;
        this.tabCurPosition = 0;
        this.indicatorLeft = -1.0f;
        this.lastScrollX = -1.0f;
        setFillViewport(true);
        setWillNotDraw(false);
        this.indicatorDrawable.setColor(INDICATOR_DEFAUT_COLOR);
        this.indicatorDrawable.setCornerRadius(4.0f);
        this.tabsContainer = new LinearLayout(context);
        this.tabsContainer.setOrientation(0);
        this.tabsContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        addView(this.tabsContainer);
    }

    public void addTab(String str, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fbddde5", new Object[]{this, str, new Integer(i), new Integer(i2)});
            return;
        }
        TextView textView = new TextView(getContext());
        textView.setTextSize(1, i2);
        textView.setTextColor(i);
        textView.setText(str);
        Paint paint = new Paint();
        paint.setTypeface(this.selectedTabTypeface);
        paint.setTextSize(ohd.b(getContext(), i2));
        textView.setLayoutParams(new LinearLayout.LayoutParams((int) Math.ceil(paint.measureText(str) + 80.0f), -2));
        textView.setPadding(40, 10, 40, 10);
        textView.setOnTouchListener(new View.OnTouchListener() { // from class: com.taobao.android.fluid.remote.collectionpoplayer.nativecollection.CollectionTabLayout.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
                }
                int indexOfChild = CollectionTabLayout.access$000(CollectionTabLayout.this).indexOfChild(view);
                int action = motionEvent.getAction();
                if (action != 0) {
                    if (action != 1) {
                        return false;
                    }
                    CollectionTabLayout.this.setScrollPosition(indexOfChild, true);
                    if (CollectionTabLayout.access$100(CollectionTabLayout.this) != null) {
                        CollectionTabLayout.access$100(CollectionTabLayout.this).a(indexOfChild);
                    }
                }
                return true;
            }
        });
        this.tabsContainer.addView(textView);
    }

    public void setScrollPosition(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71e5a910", new Object[]{this, new Integer(i), new Boolean(z)});
        } else if (i < 0 || i >= this.tabsContainer.getChildCount()) {
        } else {
            if (this.tabCurPosition < this.tabsContainer.getChildCount()) {
                this.isOutofTabsContainer = false;
            }
            View childAt = this.tabsContainer.getChildAt(i);
            this.scrollToX = (childAt.getLeft() + (childAt.getLeft() / 2)) - (getWidth() / 2);
            if (this.hasFixedView) {
                this.scrollToX -= childAt.getWidth();
            }
            getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.taobao.android.fluid.remote.collectionpoplayer.nativecollection.CollectionTabLayout.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("df7e7eb3", new Object[]{this});
                        return;
                    }
                    this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    this.post(new Runnable() { // from class: com.taobao.android.fluid.remote.collectionpoplayer.nativecollection.CollectionTabLayout.2.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                CollectionTabLayout.this.smoothScrollTo(CollectionTabLayout.access$200(CollectionTabLayout.this), 0);
                            }
                        }
                    });
                }
            });
            selectTab(i, z);
        }
    }

    public void clickOutSide(int i) {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63d0365f", new Object[]{this, new Integer(i)});
            return;
        }
        ViewGroup viewGroup = (ViewGroup) getParent();
        View childAt = viewGroup.getChildAt(i);
        if (!(childAt instanceof TextView) || (i2 = this.tabCurPosition) < 0 || i2 >= this.tabsContainer.getChildCount()) {
            return;
        }
        this.isOutofTabsContainer = true;
        outAnimation(viewGroup, childAt, this.tabsContainer.getChildAt(this.tabCurPosition));
        selectTab(this.tabsContainer.getChildCount(), true);
        invalidate();
    }

    private void outAnimation(ViewGroup viewGroup, final View view, final View view2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26a2385c", new Object[]{this, viewGroup, view, view2});
            return;
        }
        final View view3 = new View(getContext());
        view3.setBackground(this.indicatorDrawable);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(this.indicatorWidth, this.indicatorHeight);
        layoutParams.topMargin = getHeight() - this.indicatorHeight;
        layoutParams.leftMargin = (view2.getLeft() - getScrollX()) + ((view2.getWidth() - this.indicatorWidth) / 2);
        ObjectAnimator objectAnimator = this.outViewAnimation;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            this.outViewAnimation.cancel();
        }
        this.outViewAnimation = ObjectAnimator.ofFloat(view3, "translationX", 0.0f, (view.getLeft() - layoutParams.leftMargin) + ((view.getWidth() - this.indicatorWidth) / 2.0f));
        this.outViewAnimation.setDuration(300L);
        this.outViewAnimation.setInterpolator(new LinearInterpolator());
        view3.setId(1000);
        viewGroup.addView(view3, layoutParams);
        this.outViewAnimation.addListener(new AnimatorListenerAdapter() { // from class: com.taobao.android.fluid.remote.collectionpoplayer.nativecollection.CollectionTabLayout.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                    return;
                }
                String str = ":fixedView.getLeft()" + view.getLeft() + "tabsContainer.getRight()" + CollectionTabLayout.access$000(CollectionTabLayout.this).getRight() + "getScrollX()" + CollectionTabLayout.this.getScrollX() + " selectedTab.getLeft()" + view2.getLeft() + " selectedTab.getWidth()" + view2.getWidth() + "fixedView.getWidth()" + view.getWidth();
                ViewGroup.LayoutParams layoutParams2 = view3.getLayoutParams();
                if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
                    marginLayoutParams.leftMargin = (int) (marginLayoutParams.leftMargin + view3.getTranslationX());
                    view3.setLayoutParams(marginLayoutParams);
                }
                view3.setTranslationX(0.0f);
                CollectionTabLayout.access$302(CollectionTabLayout.this, view.getLeft() + (view2.getWidth() / 2.0f) + CollectionTabLayout.this.getScrollX());
            }
        });
        this.outViewAnimation.start();
    }

    private void selectTab(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbe4e131", new Object[]{this, new Integer(i), new Boolean(z)});
        } else if (i < 0 || i > this.tabsContainer.getChildCount()) {
        } else {
            int i2 = this.tabCurPosition;
            if (i2 >= 0 && i2 < this.tabsContainer.getChildCount()) {
                TextView textView = (TextView) this.tabsContainer.getChildAt(this.tabCurPosition);
                textView.setTextColor(-6710887);
                textView.setTypeface(this.unselectedTabTypeface);
                textView.setSelected(false);
            } else if (this.tabCurPosition == this.tabsContainer.getChildCount()) {
                View childAt = ((ViewGroup) getParent()).getChildAt(1);
                if (childAt instanceof TextView) {
                    TextView textView2 = (TextView) childAt;
                    textView2.setTextColor(-6710887);
                    textView2.setTypeface(this.unselectedTabTypeface);
                    childAt.setSelected(false);
                }
                if (i < this.tabsContainer.getChildCount()) {
                    final ViewGroup viewGroup = (ViewGroup) getParent();
                    final View childAt2 = this.tabsContainer.getChildAt(i);
                    final View findViewById = viewGroup.findViewById(1000);
                    ObjectAnimator objectAnimator = this.outViewAnimation;
                    if (objectAnimator != null && objectAnimator.isRunning()) {
                        this.outViewAnimation.cancel();
                    }
                    viewGroup.post(new Runnable() { // from class: com.taobao.android.fluid.remote.collectionpoplayer.nativecollection.CollectionTabLayout.4
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            int left = findViewById.getLeft();
                            CollectionTabLayout.access$502(CollectionTabLayout.this, ObjectAnimator.ofFloat(findViewById, "translationX", 0.0f, ((childAt2.getLeft() - Math.min(CollectionTabLayout.this.getScrollX(), Math.max(CollectionTabLayout.access$200(CollectionTabLayout.this), 0))) + ((childAt2.getWidth() - CollectionTabLayout.access$400(CollectionTabLayout.this)) / 2)) - left));
                            CollectionTabLayout.access$500(CollectionTabLayout.this).setDuration(300L);
                            CollectionTabLayout.access$500(CollectionTabLayout.this).setInterpolator(new LinearInterpolator());
                            CollectionTabLayout.access$500(CollectionTabLayout.this).addListener(new AnimatorListenerAdapter() { // from class: com.taobao.android.fluid.remote.collectionpoplayer.nativecollection.CollectionTabLayout.4.1
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                                public void onAnimationEnd(Animator animator) {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("8024e25a", new Object[]{this, animator});
                                        return;
                                    }
                                    CollectionTabLayout.access$302(CollectionTabLayout.this, childAt2.getLeft());
                                    viewGroup.removeView(findViewById);
                                    CollectionTabLayout.access$602(CollectionTabLayout.this, false);
                                    CollectionTabLayout.this.invalidate();
                                }
                            });
                            CollectionTabLayout.access$500(CollectionTabLayout.this).start();
                        }
                    });
                }
            }
            if (i == this.tabsContainer.getChildCount() && this.isOutofTabsContainer) {
                View childAt3 = ((ViewGroup) getParent()).getChildAt(1);
                if (childAt3 instanceof TextView) {
                    TextView textView3 = (TextView) childAt3;
                    textView3.setTextColor(SELECTED_TEXT_COLOR);
                    textView3.setTypeface(this.selectedTabTypeface);
                    childAt3.setSelected(true);
                }
            } else if (i < this.tabsContainer.getChildCount()) {
                TextView textView4 = (TextView) this.tabsContainer.getChildAt(i);
                textView4.setTextColor(SELECTED_TEXT_COLOR);
                textView4.setTypeface(this.selectedTabTypeface);
                textView4.setSelected(true);
                float left = this.tabsContainer.getChildAt(i).getLeft();
                if (this.lastScrollX >= 0.0f && z) {
                    animateIndicatorToPosition(left);
                } else if (!z) {
                    this.indicatorLeft = left;
                    this.lastScrollX = this.indicatorLeft;
                }
            }
            this.tabCurPosition = i;
            invalidate();
            spz.c(TAG, "select postion:" + this.tabCurPosition);
        }
    }

    private void animateIndicatorToPosition(final float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2802bc7", new Object[]{this, new Float(f)});
            return;
        }
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.animator.cancel();
        }
        this.animator = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.taobao.android.fluid.remote.collectionpoplayer.nativecollection.CollectionTabLayout.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator2});
                    return;
                }
                float animatedFraction = valueAnimator2.getAnimatedFraction();
                CollectionTabLayout collectionTabLayout = CollectionTabLayout.this;
                CollectionTabLayout.access$702(collectionTabLayout, CollectionTabLayout.access$300(collectionTabLayout) + ((f - CollectionTabLayout.access$300(CollectionTabLayout.this)) * animatedFraction));
                ViewCompat.postInvalidateOnAnimation(CollectionTabLayout.this);
            }
        });
        this.animator.addListener(new AnimatorListenerAdapter() { // from class: com.taobao.android.fluid.remote.collectionpoplayer.nativecollection.CollectionTabLayout.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                    return;
                }
                CollectionTabLayout collectionTabLayout = CollectionTabLayout.this;
                CollectionTabLayout.access$302(collectionTabLayout, CollectionTabLayout.access$700(collectionTabLayout));
            }
        });
        this.animator.setDuration(300L);
        this.animator.start();
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public void draw(Canvas canvas) {
        View childAt;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cc013fa", new Object[]{this, canvas});
            return;
        }
        if (this.tabsContainer.getChildCount() > 0 && !this.isOutofTabsContainer && (childAt = this.tabsContainer.getChildAt(this.tabCurPosition)) != null && childAt.getLeft() >= 0) {
            int width = (childAt.getWidth() - this.indicatorWidth) / 2;
            int i = ((int) this.indicatorLeft) + width;
            if (Float.compare(this.lastScrollX, -1.0f) == 0) {
                i = childAt.getLeft() + width;
                this.indicatorLeft = childAt.getLeft();
                this.lastScrollX = childAt.getLeft();
            }
            this.indicatorDrawable.setBounds(i, getHeight() - this.indicatorHeight, this.indicatorWidth + i, getHeight());
            this.indicatorDrawable.draw(canvas);
        }
        super.draw(canvas);
    }

    public void setIndicatorWidth(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0b82d03", new Object[]{this, new Integer(i)});
            return;
        }
        this.indicatorWidth = i;
        invalidate();
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

    public void setOnTabSelectedListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd56b9b3", new Object[]{this, aVar});
        } else {
            this.onTabSelectedListener = aVar;
        }
    }

    public int getSelectedTabPosition() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e05b0107", new Object[]{this})).intValue() : this.tabCurPosition;
    }
}
