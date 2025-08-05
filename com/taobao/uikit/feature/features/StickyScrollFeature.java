package com.taobao.uikit.feature.features;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.ScrollView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.uikit.feature.callback.CanvasCallback;
import com.taobao.uikit.feature.callback.LayoutCallback;
import com.taobao.uikit.feature.callback.ScrollCallback;
import com.taobao.uikit.feature.callback.SetClipToPaddingCallBack;
import com.taobao.uikit.feature.callback.TouchEventCallback;
import java.util.ArrayList;
import tb.kge;

/* loaded from: classes9.dex */
public class StickyScrollFeature extends AbsFeature<ScrollView> implements CanvasCallback, LayoutCallback, ScrollCallback, SetClipToPaddingCallBack, TouchEventCallback {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int DEFAULT_SHADOW_HEIGHT = 10;
    public static final String FLAG_HASTRANSPARANCY = "-hastransparancy";
    public static final String FLAG_NONCONSTANT = "-nonconstant";
    public static final String STICKY_TAG = "sticky";
    private boolean mClipToPadding;
    private boolean mClipToPaddingHasBeenSet;
    private View mCurrentlyStickingView;
    private boolean mHasNotDoneActionDown = true;
    private int mInvalidateCount = 0;
    private final Runnable mInvalidateRunnable = new Runnable() { // from class: com.taobao.uikit.feature.features.StickyScrollFeature.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            if (StickyScrollFeature.access$000(StickyScrollFeature.this) != null) {
                StickyScrollFeature stickyScrollFeature = StickyScrollFeature.this;
                int access$100 = StickyScrollFeature.access$100(stickyScrollFeature, StickyScrollFeature.access$000(stickyScrollFeature));
                StickyScrollFeature stickyScrollFeature2 = StickyScrollFeature.this;
                int access$200 = StickyScrollFeature.access$200(stickyScrollFeature2, StickyScrollFeature.access$000(stickyScrollFeature2));
                StickyScrollFeature stickyScrollFeature3 = StickyScrollFeature.this;
                StickyScrollFeature.this.getHost().invalidate(access$100, access$200, StickyScrollFeature.access$300(stickyScrollFeature3, StickyScrollFeature.access$000(stickyScrollFeature3)), (int) (StickyScrollFeature.this.getHost().getScrollY() + StickyScrollFeature.access$000(StickyScrollFeature.this).getHeight() + StickyScrollFeature.access$400(StickyScrollFeature.this)));
            }
            if (StickyScrollFeature.access$500(StickyScrollFeature.this) >= 20) {
                return;
            }
            StickyScrollFeature.access$508(StickyScrollFeature.this);
            StickyScrollFeature.this.getHost().postDelayed(this, 16L);
        }
    };
    private boolean mRedirectTouchesToStickyView;
    private Drawable mShadowDrawable;
    private int mShadowHeight;
    private int mStickyViewLeftOffset;
    private float mStickyViewTopOffset;
    private ArrayList<View> mStickyViews;

    static {
        kge.a(-1603479513);
        kge.a(-396248018);
        kge.a(1440744945);
        kge.a(-980398080);
        kge.a(1628629155);
        kge.a(1983988762);
    }

    public static /* synthetic */ Object ipc$super(StickyScrollFeature stickyScrollFeature, String str, Object... objArr) {
        if (str.hashCode() == 1336372353) {
            super.setHost((StickyScrollFeature) ((View) objArr[0]));
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.uikit.feature.callback.ScrollCallback
    public void afterComputeScroll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("559935ef", new Object[]{this});
        }
    }

    @Override // com.taobao.uikit.feature.callback.TouchEventCallback
    public void afterDispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c82badcd", new Object[]{this, motionEvent});
        }
    }

    @Override // com.taobao.uikit.feature.callback.CanvasCallback
    public void afterDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f42b97e", new Object[]{this, canvas});
        }
    }

    @Override // com.taobao.uikit.feature.callback.CanvasCallback
    public void afterOnDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99d9525f", new Object[]{this, canvas});
        }
    }

    @Override // com.taobao.uikit.feature.callback.TouchEventCallback
    public void afterOnTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35369b32", new Object[]{this, motionEvent});
        }
    }

    @Override // com.taobao.uikit.feature.callback.ScrollCallback
    public void beforeComputeScroll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6c216ac", new Object[]{this});
        }
    }

    @Override // com.taobao.uikit.feature.callback.CanvasCallback
    public void beforeDispatchDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8b3e1e1", new Object[]{this, canvas});
        }
    }

    @Override // com.taobao.uikit.feature.callback.CanvasCallback
    public void beforeDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6014803b", new Object[]{this, canvas});
        }
    }

    @Override // com.taobao.uikit.feature.callback.CanvasCallback
    public void beforeOnDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd545ddc", new Object[]{this, canvas});
        }
    }

    @Override // com.taobao.uikit.feature.callback.LayoutCallback
    public void beforeOnLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed76dbe5", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        }
    }

    @Override // com.taobao.uikit.feature.callback.ScrollCallback
    public void beforeOnScrollChanged(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b65ccad0", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        }
    }

    @Override // com.taobao.uikit.feature.callback.SetClipToPaddingCallBack
    public void beforeSetClipToPadding(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6aaf350a", new Object[]{this, new Boolean(z)});
        }
    }

    public static /* synthetic */ View access$000(StickyScrollFeature stickyScrollFeature) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("c2eabda5", new Object[]{stickyScrollFeature}) : stickyScrollFeature.mCurrentlyStickingView;
    }

    public static /* synthetic */ int access$100(StickyScrollFeature stickyScrollFeature, View view) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("fd5095c3", new Object[]{stickyScrollFeature, view})).intValue() : stickyScrollFeature.getLeftForViewRelativeOnlyChild(view);
    }

    public static /* synthetic */ int access$200(StickyScrollFeature stickyScrollFeature, View view) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ddc9ebc4", new Object[]{stickyScrollFeature, view})).intValue() : stickyScrollFeature.getBottomForViewRelativeOnlyChild(view);
    }

    public static /* synthetic */ int access$300(StickyScrollFeature stickyScrollFeature, View view) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("be4341c5", new Object[]{stickyScrollFeature, view})).intValue() : stickyScrollFeature.getRightForViewRelativeOnlyChild(view);
    }

    public static /* synthetic */ float access$400(StickyScrollFeature stickyScrollFeature) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("fd3c868f", new Object[]{stickyScrollFeature})).floatValue() : stickyScrollFeature.mStickyViewTopOffset;
    }

    public static /* synthetic */ int access$500(StickyScrollFeature stickyScrollFeature) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("917af631", new Object[]{stickyScrollFeature})).intValue() : stickyScrollFeature.mInvalidateCount;
    }

    public static /* synthetic */ int access$508(StickyScrollFeature stickyScrollFeature) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c1995129", new Object[]{stickyScrollFeature})).intValue();
        }
        int i = stickyScrollFeature.mInvalidateCount;
        stickyScrollFeature.mInvalidateCount = i + 1;
        return i;
    }

    public static /* synthetic */ void access$600(StickyScrollFeature stickyScrollFeature, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5faf43d5", new Object[]{stickyScrollFeature, view});
        } else {
            stickyScrollFeature.findStickyViews(view);
        }
    }

    @Override // com.taobao.uikit.feature.features.AbsFeature
    public void constructor(Context context, AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8928939c", new Object[]{this, context, attributeSet, new Integer(i)});
        } else if (attributeSet == null || (obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.StickyScrollFeature, i, 0)) == null) {
        } else {
            this.mShadowHeight = obtainStyledAttributes.getDimensionPixelSize(R.styleable.StickyScrollFeature_uik_shadowHeight, (int) ((context.getResources().getDisplayMetrics().density * 10.0f) + 0.5f));
            this.mShadowDrawable = obtainStyledAttributes.getDrawable(R.styleable.StickyScrollFeature_uik_shadowDrawable);
            obtainStyledAttributes.recycle();
        }
    }

    @Override // com.taobao.uikit.feature.features.AbsFeature
    public void setHost(ScrollView scrollView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cff071d3", new Object[]{this, scrollView});
            return;
        }
        super.setHost((StickyScrollFeature) scrollView);
        setup();
        getHost().setOnHierarchyChangeListener(new ViewGroup.OnHierarchyChangeListener() { // from class: com.taobao.uikit.feature.features.StickyScrollFeature.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.ViewGroup.OnHierarchyChangeListener
            public void onChildViewRemoved(View view, View view2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b61353c5", new Object[]{this, view, view2});
                }
            }

            @Override // android.view.ViewGroup.OnHierarchyChangeListener
            public void onChildViewAdded(View view, View view2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("c61913e5", new Object[]{this, view, view2});
                } else {
                    StickyScrollFeature.access$600(StickyScrollFeature.this, view2);
                }
            }
        });
    }

    @Override // com.taobao.uikit.feature.callback.CanvasCallback
    public void afterDispatchDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84822824", new Object[]{this, canvas});
        } else if (this.mCurrentlyStickingView == null) {
        } else {
            canvas.save();
            canvas.translate(getHost().getPaddingLeft() + this.mStickyViewLeftOffset, getHost().getScrollY() + this.mStickyViewTopOffset + (this.mClipToPadding ? getHost().getPaddingTop() : 0));
            canvas.clipRect(0.0f, this.mClipToPadding ? -this.mStickyViewTopOffset : 0.0f, getHost().getWidth() - this.mStickyViewLeftOffset, this.mCurrentlyStickingView.getHeight() + this.mShadowHeight + 1);
            if (this.mShadowDrawable != null) {
                this.mShadowDrawable.setBounds(0, this.mCurrentlyStickingView.getHeight(), this.mCurrentlyStickingView.getWidth(), this.mCurrentlyStickingView.getHeight() + this.mShadowHeight);
                this.mShadowDrawable.draw(canvas);
            }
            canvas.clipRect(0.0f, this.mClipToPadding ? -this.mStickyViewTopOffset : 0.0f, getHost().getWidth(), this.mCurrentlyStickingView.getHeight());
            if (((String) this.mCurrentlyStickingView.getContentDescription()).contains(FLAG_HASTRANSPARANCY)) {
                showView(this.mCurrentlyStickingView);
                this.mCurrentlyStickingView.draw(canvas);
                hideView(this.mCurrentlyStickingView);
            } else {
                this.mCurrentlyStickingView.draw(canvas);
            }
            canvas.restore();
        }
    }

    @Override // com.taobao.uikit.feature.callback.ScrollCallback
    public void afterOnScrollChanged(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41622bd3", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else {
            doTheStickyThing();
        }
    }

    @Override // com.taobao.uikit.feature.callback.SetClipToPaddingCallBack
    public void afterSetClipToPadding(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e8efacd", new Object[]{this, new Boolean(z)});
            return;
        }
        this.mClipToPadding = z;
        this.mClipToPaddingHasBeenSet = true;
    }

    @Override // com.taobao.uikit.feature.callback.TouchEventCallback
    public void beforeOnTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("673c1915", new Object[]{this, motionEvent});
            return;
        }
        if (this.mRedirectTouchesToStickyView) {
            motionEvent.offsetLocation(0.0f, (getHost().getScrollY() + this.mStickyViewTopOffset) - getTopForViewRelativeOnlyChild(this.mCurrentlyStickingView));
        }
        if (motionEvent.getAction() == 0) {
            this.mHasNotDoneActionDown = false;
        }
        if (this.mHasNotDoneActionDown) {
            MotionEvent.obtain(motionEvent).setAction(0);
            this.mHasNotDoneActionDown = false;
        } else if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
        } else {
            this.mHasNotDoneActionDown = true;
        }
    }

    @Override // com.taobao.uikit.feature.callback.TouchEventCallback
    public void beforeDispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f585f570", new Object[]{this, motionEvent});
            return;
        }
        if (motionEvent.getAction() == 0) {
            this.mRedirectTouchesToStickyView = true;
        }
        if (this.mRedirectTouchesToStickyView) {
            this.mRedirectTouchesToStickyView = this.mCurrentlyStickingView != null;
            if (this.mRedirectTouchesToStickyView) {
                if (motionEvent.getY() > this.mCurrentlyStickingView.getHeight() + this.mStickyViewTopOffset || motionEvent.getX() < getLeftForViewRelativeOnlyChild(this.mCurrentlyStickingView) || motionEvent.getX() > getRightForViewRelativeOnlyChild(this.mCurrentlyStickingView)) {
                    z = false;
                }
                this.mRedirectTouchesToStickyView = z;
            }
        } else if (this.mCurrentlyStickingView == null) {
            this.mRedirectTouchesToStickyView = false;
        }
        if (!this.mRedirectTouchesToStickyView) {
            return;
        }
        motionEvent.offsetLocation(0.0f, ((getHost().getScrollY() + this.mStickyViewTopOffset) - getTopForViewRelativeOnlyChild(this.mCurrentlyStickingView)) * (-1.0f));
        if (!((String) this.mCurrentlyStickingView.getContentDescription()).contains(FLAG_NONCONSTANT)) {
            return;
        }
        this.mInvalidateCount = 0;
        getHost().post(this.mInvalidateRunnable);
    }

    @Override // com.taobao.uikit.feature.callback.LayoutCallback
    public void afterOnLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c4dfb28", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        if (!this.mClipToPaddingHasBeenSet) {
            this.mClipToPadding = true;
        }
        notifyHierarchyChanged();
    }

    public void setup() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cce3884", new Object[]{this});
            return;
        }
        this.mStickyViews = new ArrayList<>();
        if (11 > Build.VERSION.SDK_INT || Build.VERSION.SDK_INT >= 18) {
            return;
        }
        getHost().setLayerType(1, null);
    }

    private void findStickyViews(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71294cdf", new Object[]{this, view});
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                String str = (String) viewGroup.getChildAt(i).getContentDescription();
                if (str != null && str.contains("sticky")) {
                    this.mStickyViews.add(viewGroup.getChildAt(i));
                } else if (viewGroup.getChildAt(i) instanceof ViewGroup) {
                    findStickyViews(viewGroup.getChildAt(i));
                }
            }
        } else {
            String str2 = (String) view.getContentDescription();
            if (str2 == null || !str2.contains("sticky")) {
                return;
            }
            this.mStickyViews.add(view);
        }
    }

    private void hideView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52a22e04", new Object[]{this, view});
        } else if (Build.VERSION.SDK_INT >= 11) {
            view.setAlpha(0.0f);
        } else {
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation.setDuration(0L);
            alphaAnimation.setFillAfter(true);
            view.startAnimation(alphaAnimation);
        }
    }

    private void showView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed177369", new Object[]{this, view});
        } else if (Build.VERSION.SDK_INT >= 11) {
            view.setAlpha(1.0f);
        } else {
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(0L);
            alphaAnimation.setFillAfter(true);
            view.startAnimation(alphaAnimation);
        }
    }

    private int getLeftForViewRelativeOnlyChild(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2e1ffbeb", new Object[]{this, view})).intValue();
        }
        int left = view.getLeft();
        while (view.getParent() != getHost().getChildAt(0)) {
            view = (View) view.getParent();
            left += view.getLeft();
        }
        return left;
    }

    private int getTopForViewRelativeOnlyChild(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("adf8e209", new Object[]{this, view})).intValue();
        }
        int top = view.getTop();
        while (view.getParent() != getHost().getChildAt(0)) {
            view = (View) view.getParent();
            top += view.getTop();
        }
        return top;
    }

    private int getRightForViewRelativeOnlyChild(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53ac10e2", new Object[]{this, view})).intValue();
        }
        int right = view.getRight();
        while (view.getParent() != getHost().getChildAt(0)) {
            view = (View) view.getParent();
            right += view.getRight();
        }
        return right;
    }

    private int getBottomForViewRelativeOnlyChild(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("365e7ac7", new Object[]{this, view})).intValue();
        }
        int bottom = view.getBottom();
        while (view.getParent() != getHost().getChildAt(0)) {
            view = (View) view.getParent();
            bottom += view.getBottom();
        }
        return bottom;
    }

    private void doTheStickyThing() {
        float min;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33b8a9c6", new Object[]{this});
            return;
        }
        int size = this.mStickyViews.size();
        View view = null;
        View view2 = null;
        for (int i = 0; i < size; i++) {
            View view3 = this.mStickyViews.get(i);
            int topForViewRelativeOnlyChild = (getTopForViewRelativeOnlyChild(view3) - getHost().getScrollY()) + (this.mClipToPadding ? 0 : getHost().getPaddingTop());
            if (topForViewRelativeOnlyChild <= 0) {
                if (view != null) {
                    if (topForViewRelativeOnlyChild <= (getTopForViewRelativeOnlyChild(view) - getHost().getScrollY()) + (this.mClipToPadding ? 0 : getHost().getPaddingTop())) {
                    }
                }
                view = view3;
            } else {
                if (view2 != null) {
                    if (topForViewRelativeOnlyChild >= (getTopForViewRelativeOnlyChild(view2) - getHost().getScrollY()) + (this.mClipToPadding ? 0 : getHost().getPaddingTop())) {
                    }
                }
                view2 = view3;
            }
        }
        if (view != null) {
            if (view2 == null) {
                min = 0.0f;
            } else {
                min = Math.min(0, ((getTopForViewRelativeOnlyChild(view2) - getHost().getScrollY()) + (this.mClipToPadding ? 0 : getHost().getPaddingTop())) - view.getHeight());
            }
            this.mStickyViewTopOffset = min;
            View view4 = this.mCurrentlyStickingView;
            if (view == view4) {
                return;
            }
            if (view4 != null) {
                stopStickingCurrentlyStickingView();
            }
            this.mStickyViewLeftOffset = getLeftForViewRelativeOnlyChild(view);
            startStickingView(view);
        } else if (this.mCurrentlyStickingView != null) {
            stopStickingCurrentlyStickingView();
        }
    }

    private void startStickingView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e77fac32", new Object[]{this, view});
            return;
        }
        this.mCurrentlyStickingView = view;
        if (!((String) this.mCurrentlyStickingView.getContentDescription()).contains(FLAG_HASTRANSPARANCY)) {
            return;
        }
        hideView(this.mCurrentlyStickingView);
    }

    private void stopStickingCurrentlyStickingView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcd8bff0", new Object[]{this});
            return;
        }
        if (((String) this.mCurrentlyStickingView.getContentDescription()).contains(FLAG_HASTRANSPARANCY)) {
            showView(this.mCurrentlyStickingView);
        }
        this.mCurrentlyStickingView = null;
    }

    private void notifyHierarchyChanged() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a070ccaf", new Object[]{this});
            return;
        }
        if (this.mCurrentlyStickingView != null) {
            stopStickingCurrentlyStickingView();
        }
        this.mStickyViews.clear();
        findStickyViews(getHost().getChildAt(0));
        doTheStickyThing();
        getHost().invalidate();
    }

    public void setShadowHeight(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76915d13", new Object[]{this, new Integer(i)});
        } else {
            this.mShadowHeight = i;
        }
    }
}
