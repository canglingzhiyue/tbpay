package com.taobao.android.weex_uikit.widget.overlay;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.util.g;
import com.taobao.android.weex_framework.util.l;
import com.taobao.android.weex_uikit.ui.MUSView;
import tb.kge;

/* loaded from: classes6.dex */
public class MUSOverlaySlice extends FrameLayout implements Animation.AnimationListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean mAnimation;
    private String mAnimationType;
    private View mBg;
    private int mChildHeight;
    private final MUSView mChildView;
    private final FrameLayout mChildViewContainer;
    private int mChildWidth;
    private int mChildX;
    private int mChildY;
    private Rect mDisplayLoc;
    private boolean mExitAnimation;
    private final MUSOverlayView mMUSOverlayView;
    private boolean mMask;
    private boolean mMaskAnimation;
    private int mMaskColor;
    private final MUSOverlay mMusOverlay;
    private Rect mRefRect;

    static {
        kge.a(-285561893);
        kge.a(-911284573);
    }

    public static /* synthetic */ MUSOverlay access$000(MUSOverlaySlice mUSOverlaySlice) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MUSOverlay) ipChange.ipc$dispatch("cce02405", new Object[]{mUSOverlaySlice}) : mUSOverlaySlice.mMusOverlay;
    }

    public MUSOverlaySlice(Context context, MUSView mUSView, MUSOverlay mUSOverlay, MUSOverlayView mUSOverlayView) {
        super(context);
        this.mChildX = 0;
        this.mChildY = 0;
        this.mChildView = mUSView;
        this.mMusOverlay = mUSOverlay;
        this.mMUSOverlayView = mUSOverlayView;
        this.mChildViewContainer = new FrameLayout(context);
        this.mChildViewContainer.addView(this.mChildView);
        addView(this.mChildViewContainer, -1, -1);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0092, code lost:
        if (r1.equals("leftClipRightEdge") != false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean playExitAnim(final java.lang.Runnable r12) {
        /*
            Method dump skipped, instructions count: 646
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.weex_uikit.widget.overlay.MUSOverlaySlice.playExitAnim(java.lang.Runnable):boolean");
    }

    public void setUpAndShow(int i, int i2, int i3, int i4, Rect rect, Rect rect2, boolean z, boolean z2, String str, boolean z3, boolean z4, int i5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48577bfb", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), rect, rect2, new Boolean(z), new Boolean(z2), str, new Boolean(z3), new Boolean(z4), new Integer(i5)});
            return;
        }
        this.mChildX = i;
        this.mChildY = i2;
        this.mChildWidth = i3;
        this.mChildHeight = i4;
        this.mRefRect = rect;
        this.mDisplayLoc = rect2;
        this.mAnimation = z;
        this.mExitAnimation = z2;
        this.mAnimationType = str;
        this.mMaskAnimation = z3;
        this.mMask = z4;
        this.mMaskColor = i5;
        int d = l.d(getContext());
        int f = l.f(getContext());
        char c = 65535;
        if (z4) {
            this.mBg = new View(getContext());
            this.mBg.setBackgroundColor(i5);
            addView(this.mBg, 0, new FrameLayout.LayoutParams(-1, -1));
            if (z3) {
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                alphaAnimation.setDuration(300L);
                this.mBg.startAnimation(alphaAnimation);
            }
            this.mBg.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.weex_uikit.widget.overlay.MUSOverlaySlice.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    } else {
                        MUSOverlaySlice.access$000(MUSOverlaySlice.this).onClose();
                    }
                }
            });
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.mChildView.getLayoutParams();
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.mChildViewContainer.getLayoutParams();
        layoutParams2.width = -1;
        layoutParams2.height = -1;
        layoutParams2.setMargins(0, 0, 0, 0);
        layoutParams.width = -1;
        layoutParams.height = -1;
        this.mChildView.setDrawTranslateX(this.mChildX);
        this.mChildView.setDrawTranslateY(this.mChildY);
        if (z) {
            Animation animation = null;
            switch (str.hashCode()) {
                case -1984709971:
                    if (str.equals("topClipTopEdge")) {
                        c = 7;
                        break;
                    }
                    break;
                case -1554921213:
                    if (str.equals("bottomClipBottomEdge")) {
                        c = 11;
                        break;
                    }
                    break;
                case -1383228885:
                    if (str.equals("bottom")) {
                        c = '\f';
                        break;
                    }
                    break;
                case -1267206133:
                    if (str.equals("opacity")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1148999152:
                    if (str.equals("rightClipLeftEdge")) {
                        c = 4;
                        break;
                    }
                    break;
                case -973791571:
                    if (str.equals("topClipBottomEdge")) {
                        c = '\b';
                        break;
                    }
                    break;
                case -648994793:
                    if (str.equals("bottomClipTopEdge")) {
                        c = '\n';
                        break;
                    }
                    break;
                case -483295294:
                    if (str.equals("leftClipRightEdge")) {
                        c = 2;
                        break;
                    }
                    break;
                case -251320371:
                    if (str.equals("rightClipRightEdge")) {
                        c = 5;
                        break;
                    }
                    break;
                case -48103557:
                    if (str.equals("leftClipLeftEdge")) {
                        c = 1;
                        break;
                    }
                    break;
                case 115029:
                    if (str.equals("top")) {
                        c = '\t';
                        break;
                    }
                    break;
                case 3317767:
                    if (str.equals("left")) {
                        c = 3;
                        break;
                    }
                    break;
                case 108511772:
                    if (str.equals("right")) {
                        c = 6;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    animation = new AlphaAnimation(0.0f, 1.0f);
                    animation.setDuration(300L);
                    this.mChildView.startAnimation(animation);
                    break;
                case 1:
                    layoutParams2.width = d;
                    layoutParams2.leftMargin = rect.left;
                    this.mChildView.setDrawTranslateX(this.mChildX - rect.left);
                    animation = new TranslateAnimation(-((this.mChildX + rect2.right) - rect.left), 0.0f, 0.0f, 0.0f);
                    animation.setDuration(300L);
                    this.mChildView.startAnimation(animation);
                    break;
                case 2:
                    layoutParams2.width = d;
                    layoutParams2.leftMargin = rect.right;
                    this.mChildView.setDrawTranslateX(this.mChildX - rect.right);
                    animation = new TranslateAnimation(-((this.mChildX + rect2.right) - rect.right), 0.0f, 0.0f, 0.0f);
                    animation.setDuration(300L);
                    this.mChildView.startAnimation(animation);
                    break;
                case 3:
                    animation = new TranslateAnimation(-i3, 0.0f, 0.0f, 0.0f);
                    animation.setDuration(300L);
                    this.mChildView.startAnimation(animation);
                    break;
                case 4:
                    layoutParams2.width = rect.left;
                    layoutParams2.leftMargin = 0;
                    animation = new TranslateAnimation(rect.left - (this.mChildX + rect2.left), 0.0f, 0.0f, 0.0f);
                    animation.setDuration(300L);
                    this.mChildView.startAnimation(animation);
                    break;
                case 5:
                    layoutParams2.width = rect.right;
                    layoutParams2.leftMargin = 0;
                    animation = new TranslateAnimation(rect.right - (this.mChildX + rect2.left), 0.0f, 0.0f, 0.0f);
                    animation.setDuration(300L);
                    this.mChildView.startAnimation(animation);
                    break;
                case 6:
                    animation = new TranslateAnimation(i3, 0.0f, 0.0f, 0.0f);
                    animation.setDuration(300L);
                    this.mChildView.startAnimation(animation);
                    break;
                case 7:
                    layoutParams2.height = f;
                    layoutParams2.topMargin = rect.top;
                    this.mChildView.setDrawTranslateY(this.mChildY - rect.top);
                    animation = new TranslateAnimation(0.0f, 0.0f, -((this.mChildY + rect2.bottom) - rect.top), 0.0f);
                    animation.setDuration(300L);
                    this.mChildView.startAnimation(animation);
                    break;
                case '\b':
                    layoutParams2.height = f;
                    layoutParams2.topMargin = rect.bottom;
                    this.mChildView.setDrawTranslateY(this.mChildY - rect.bottom);
                    animation = new TranslateAnimation(0.0f, 0.0f, -((this.mChildY + rect2.bottom) - rect.bottom), 0.0f);
                    animation.setDuration(300L);
                    this.mChildView.startAnimation(animation);
                    break;
                case '\t':
                    animation = new TranslateAnimation(0.0f, 0.0f, -i4, 0.0f);
                    animation.setDuration(300L);
                    this.mChildView.startAnimation(animation);
                    break;
                case '\n':
                    layoutParams2.height = rect.top;
                    animation = new TranslateAnimation(0.0f, 0.0f, rect.top - (this.mChildY + rect2.top), 0.0f);
                    animation.setDuration(300L);
                    this.mChildView.startAnimation(animation);
                    break;
                case 11:
                    layoutParams2.height = rect.bottom;
                    animation = new TranslateAnimation(0.0f, 0.0f, rect.bottom - (this.mChildY + rect2.top), 0.0f);
                    animation.setDuration(300L);
                    this.mChildView.startAnimation(animation);
                    break;
                case '\f':
                    animation = new TranslateAnimation(0.0f, 0.0f, i4, 0.0f);
                    animation.setDuration(300L);
                    this.mChildView.startAnimation(animation);
                    break;
                default:
                    g.f("mus-overlay", String.format("value [\"%s\"] not support for property \"animationType\"", str));
                    break;
            }
            if (animation != null) {
                animation.setAnimationListener(this);
            }
        }
        this.mChildView.forceLayout();
        this.mChildViewContainer.requestLayout();
    }

    public void release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
            return;
        }
        View view = this.mBg;
        if (view != null) {
            removeView(view);
            this.mBg = null;
        }
        this.mChildView.clearAnimation();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00cd, code lost:
        if (r3.equals("topClipBottomEdge") != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void updateLocation(int r18, int r19, int r20, int r21, android.graphics.Rect r22, android.graphics.Rect r23) {
        /*
            Method dump skipped, instructions count: 424
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.weex_uikit.widget.overlay.MUSOverlaySlice.updateLocation(int, int, int, int, android.graphics.Rect, android.graphics.Rect):void");
    }

    public void onContainerLayoutChanged() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6975c26f", new Object[]{this});
        } else {
            this.mMUSOverlayView.updateLocation();
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(Animation animation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2d146c4", new Object[]{this, animation});
        } else {
            onScrollChanged(0, 0, 0, 0);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(Animation animation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("724c33d", new Object[]{this, animation});
        } else {
            onScrollChanged(0, 0, 0, 0);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(Animation animation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f2883e7", new Object[]{this, animation});
        } else {
            onScrollChanged(0, 0, 0, 0);
        }
    }
}
