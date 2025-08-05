package com.etao.feimagesearch.result;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Handler;
import android.support.v4.widget.NestedScrollView;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.util.ah;
import com.taobao.android.searchbaseframe.business.weex.multiplelist.XslMUSLayout;
import com.taobao.android.weex_uikit.ui.MUSView;
import com.taobao.android.weex_uikit.widget.overlay.MUSOverlay;
import com.taobao.android.weex_uikit.widget.overlay.MUSOverlaySlice;
import com.taobao.android.weex_uikit.widget.overlay.MUSOverlayView;
import kotlin.jvm.internal.q;
import tb.kge;
import tb.rwf;

/* loaded from: classes3.dex */
public final class IrpOverlaySlice extends MUSOverlaySlice {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean animating;
    private final MUSView childView;
    private final Context ctx;
    private boolean initScrollView;
    private float interceptTouchY;
    private boolean intercepted;
    private final MUSOverlay musOverlay;
    private final MUSOverlayView musOverlayView;
    private NestedScrollView scrollView;
    private final int touchSlop;
    private float touchY;
    private XslMUSLayout xsearchList;

    /* loaded from: classes3.dex */
    public static final class a extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
            } else {
                IrpOverlaySlice.access$setAnimating$p(IrpOverlaySlice.this, false);
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                IrpOverlaySlice.this.getChildView().setTranslationY(0.0f);
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class c extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
            } else {
                IrpOverlaySlice.access$setAnimating$p(IrpOverlaySlice.this, false);
            }
        }
    }

    static {
        kge.a(-1134528634);
    }

    public static /* synthetic */ Object ipc$super(IrpOverlaySlice irpOverlaySlice, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode != -1447998406) {
            if (hashCode != -407533570) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
            return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
        }
        return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
    }

    public static final /* synthetic */ void access$setAnimating$p(IrpOverlaySlice irpOverlaySlice, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4b8a028", new Object[]{irpOverlaySlice, new Boolean(z)});
        } else {
            irpOverlaySlice.animating = z;
        }
    }

    public final Context getCtx() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("e6adcdf0", new Object[]{this}) : this.ctx;
    }

    public final MUSView getChildView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MUSView) ipChange.ipc$dispatch("753c1c46", new Object[]{this}) : this.childView;
    }

    public final MUSOverlay getMusOverlay() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MUSOverlay) ipChange.ipc$dispatch("f157641c", new Object[]{this}) : this.musOverlay;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IrpOverlaySlice(Context ctx, MUSView childView, MUSOverlay musOverlay, MUSOverlayView musOverlayView) {
        super(ctx, childView, musOverlay, musOverlayView);
        q.c(ctx, "ctx");
        q.c(childView, "childView");
        q.c(musOverlay, "musOverlay");
        q.c(musOverlayView, "musOverlayView");
        this.ctx = ctx;
        this.childView = childView;
        this.musOverlay = musOverlay;
        this.musOverlayView = musOverlayView;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        q.a((Object) viewConfiguration, "ViewConfiguration.get(context)");
        this.touchSlop = viewConfiguration.getScaledTouchSlop();
    }

    public final MUSOverlayView getMusOverlayView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MUSOverlayView) ipChange.ipc$dispatch("5b5246bc", new Object[]{this}) : this.musOverlayView;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        if (this.animating) {
            return true;
        }
        if (motionEvent != null) {
            int action = motionEvent.getAction();
            if (action == 0) {
                this.interceptTouchY = motionEvent.getY();
                this.touchY = motionEvent.getY();
                this.intercepted = false;
            } else if (action == 1) {
                return this.intercepted;
            } else {
                if (action != 2) {
                    if (action == 3) {
                        return this.intercepted;
                    }
                } else if (this.intercepted) {
                    return true;
                } else {
                    float y = this.interceptTouchY - motionEvent.getY();
                    this.interceptTouchY = motionEvent.getY();
                    if (y < 0 && Math.abs(y) >= this.touchSlop && reachTop()) {
                        return true;
                    }
                }
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        if (this.animating) {
            return false;
        }
        if (motionEvent != null) {
            int action = motionEvent.getAction();
            if (action == 1) {
                onTouchUp();
            } else if (action == 2) {
                float y = motionEvent.getY() - this.touchY;
                this.touchY = motionEvent.getY();
                if (y > 0) {
                    y *= 0.75f;
                }
                onMoveChild(y);
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    private final void onMoveChild(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3eb3eed", new Object[]{this, new Float(f)});
            return;
        }
        MUSView mUSView = this.childView;
        mUSView.setTranslationY(mUSView.getTranslationY() + f);
        MUSView mUSView2 = this.childView;
        mUSView2.setTranslationY(rwf.a(0.0f, mUSView2.getTranslationY()));
        onScrollChanged(0, 0, 0, 0);
    }

    private final void onTouchUp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84367662", new Object[]{this});
        } else if (this.childView.getTranslationY() <= 0.1f) {
        } else {
            if (this.childView.getTranslationY() >= com.etao.feimagesearch.util.g.b(100.0f)) {
                this.musOverlay.fireEvent("close", null);
                this.animating = true;
                ObjectAnimator anim = ObjectAnimator.ofFloat(this.childView, View.TRANSLATION_Y, this.childView.getTranslationY(), this.childView.getHeight());
                q.a((Object) anim, "anim");
                anim.setDuration(300L);
                anim.addListener(new a());
                anim.start();
                new Handler().postDelayed(new b(), 500L);
                return;
            }
            this.animating = true;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.childView, View.TRANSLATION_Y, this.childView.getTranslationY(), 0.0f);
            ofFloat.addListener(new c());
            ofFloat.start();
        }
    }

    private final boolean reachTop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("64505a6d", new Object[]{this})).booleanValue();
        }
        if (!this.initScrollView) {
            this.initScrollView = true;
            IrpOverlaySlice irpOverlaySlice = this;
            this.xsearchList = (XslMUSLayout) ah.a(irpOverlaySlice, XslMUSLayout.class);
            if (this.xsearchList == null) {
                this.scrollView = (NestedScrollView) ah.a(irpOverlaySlice, NestedScrollView.class);
            }
        }
        XslMUSLayout xslMUSLayout = this.xsearchList;
        if (xslMUSLayout != null) {
            return xslMUSLayout.isReachTop();
        }
        NestedScrollView nestedScrollView = this.scrollView;
        return nestedScrollView == null || nestedScrollView.getScrollY() <= 0;
    }
}
