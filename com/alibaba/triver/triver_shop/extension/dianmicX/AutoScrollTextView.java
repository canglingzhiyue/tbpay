package com.alibaba.triver.triver_shop.extension.dianmicX;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes3.dex */
public final class AutoScrollTextView extends HorizontalScrollView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Animator animator;
    private long scrollTime;
    private final TextView textView;

    /* loaded from: classes3.dex */
    public static final class a implements Animator.AnimatorListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("90a3af63", new Object[]{this, animation});
            } else {
                q.d(animation, "animation");
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animation});
            } else {
                q.d(animation, "animation");
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4388ea84", new Object[]{this, animation});
            } else {
                q.d(animation, "animation");
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3a405721", new Object[]{this, animation});
            } else {
                q.d(animation, "animation");
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class b implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ int b;

        public b(int i) {
            this.b = i;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                return;
            }
            AutoScrollTextView autoScrollTextView = AutoScrollTextView.this;
            int i = this.b;
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
            }
            autoScrollTextView.scrollTo(i + ((Integer) animatedValue).intValue(), AutoScrollTextView.this.getScrollY());
        }
    }

    /* loaded from: classes3.dex */
    public static final class d implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ int b;

        public d(int i) {
            this.b = i;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                return;
            }
            AutoScrollTextView autoScrollTextView = AutoScrollTextView.this;
            int i = this.b;
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
            }
            autoScrollTextView.scrollTo(i - ((Integer) animatedValue).intValue(), AutoScrollTextView.this.getScrollY());
        }
    }

    /* loaded from: classes3.dex */
    public static final class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            int width;
            int width2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (AutoScrollTextView.access$getAnimator$p(AutoScrollTextView.this) != null || (width = AutoScrollTextView.this.getTextView().getWidth()) <= (width2 = AutoScrollTextView.this.getWidth())) {
            } else {
                AutoScrollTextView.access$startLeftToRight(AutoScrollTextView.this, width - width2);
            }
        }
    }

    static {
        kge.a(-684318846);
    }

    public static /* synthetic */ Object ipc$super(AutoScrollTextView autoScrollTextView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -461309207) {
            super.onWindowVisibilityChanged(((Number) objArr[0]).intValue());
            return null;
        } else if (hashCode != 348684699) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onVisibilityChanged((View) objArr[0], ((Number) objArr[1]).intValue());
            return null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        return false;
    }

    public static final /* synthetic */ Animator access$getAnimator$p(AutoScrollTextView autoScrollTextView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Animator) ipChange.ipc$dispatch("65298876", new Object[]{autoScrollTextView}) : autoScrollTextView.animator;
    }

    public static final /* synthetic */ void access$startLeftToRight(AutoScrollTextView autoScrollTextView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eeac1cb7", new Object[]{autoScrollTextView, new Integer(i)});
        } else {
            autoScrollTextView.startLeftToRight(i);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoScrollTextView(Context context) {
        super(context);
        q.d(context, "context");
        this.textView = new TextView(getContext());
        this.scrollTime = 10000L;
        setSmoothScrollingEnabled(false);
        setHorizontalScrollBarEnabled(false);
        this.textView.setSingleLine();
        addView(this.textView);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoScrollTextView(Context context, AttributeSet attr) {
        super(context, attr);
        q.d(context, "context");
        q.d(attr, "attr");
        this.textView = new TextView(getContext());
        this.scrollTime = 10000L;
        setSmoothScrollingEnabled(false);
        setHorizontalScrollBarEnabled(false);
        this.textView.setSingleLine();
        addView(this.textView);
    }

    public final TextView getTextView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("852baee3", new Object[]{this}) : this.textView;
    }

    public final long getScrollTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c1faa3ab", new Object[]{this})).longValue() : this.scrollTime;
    }

    public final void setScrollTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b430e361", new Object[]{this, new Long(j)});
        } else {
            this.scrollTime = j;
        }
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e480fae9", new Object[]{this, new Integer(i)});
            return;
        }
        super.onWindowVisibilityChanged(i);
        if (i == 0) {
            startScroll();
        } else {
            stopScroll();
        }
    }

    @Override // android.view.View
    public void onVisibilityChanged(View changedView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14c8819b", new Object[]{this, changedView, new Integer(i)});
            return;
        }
        q.d(changedView, "changedView");
        super.onVisibilityChanged(changedView, i);
        if (changedView != this) {
            return;
        }
        if (i == 0) {
            startScroll();
        } else {
            stopScroll();
        }
    }

    public final void startScroll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75254ad6", new Object[]{this});
        } else {
            this.textView.post(new e());
        }
    }

    private final void startLeftToRight(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54e021c4", new Object[]{this, new Integer(i)});
            return;
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(i);
        ofInt.setDuration(this.scrollTime);
        ofInt.setRepeatMode(2);
        ofInt.setRepeatCount(-1);
        ofInt.addListener(new a());
        ofInt.addUpdateListener(new b(getScrollX()));
        this.animator = ofInt;
        ofInt.start();
    }

    private final void startRightToLeft(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a28ab840", new Object[]{this, new Integer(i)});
            return;
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(i);
        ofInt.setDuration(this.scrollTime);
        ofInt.addListener(new c(i));
        ofInt.addUpdateListener(new d(getScrollX()));
        this.animator = ofInt;
        ofInt.start();
    }

    /* loaded from: classes3.dex */
    public static final class c implements Animator.AnimatorListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ int b;

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("90a3af63", new Object[]{this, animation});
            } else {
                q.d(animation, "animation");
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4388ea84", new Object[]{this, animation});
            } else {
                q.d(animation, "animation");
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3a405721", new Object[]{this, animation});
            } else {
                q.d(animation, "animation");
            }
        }

        public c(int i) {
            this.b = i;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animation});
                return;
            }
            q.d(animation, "animation");
            AutoScrollTextView.access$startLeftToRight(AutoScrollTextView.this, this.b);
        }
    }

    public final void stopScroll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ec88676", new Object[]{this});
            return;
        }
        Animator animator = this.animator;
        if (animator != null) {
            animator.cancel();
        }
        this.animator = null;
        scrollTo(0, getScrollY());
    }
}
