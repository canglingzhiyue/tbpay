package com.etao.feimagesearch.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.kge;
import tb.rwf;

/* loaded from: classes3.dex */
public final class RippleLayout extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean animationRunning;
    private AnimatorSet animatorSet;
    private int diameter;
    private boolean hasPrepared;
    private Paint paint;
    private int rippleChildCount;
    private List<RippleCircleView> rippleChildList;

    /* loaded from: classes3.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ RippleCircleView b;
        public final /* synthetic */ FrameLayout.LayoutParams c;

        public a(RippleCircleView rippleCircleView, FrameLayout.LayoutParams layoutParams) {
            this.b = rippleCircleView;
            this.c = layoutParams;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                RippleLayout.this.addView(this.b, this.c);
            }
        }
    }

    static {
        kge.a(-282083418);
    }

    public RippleLayout(Context context) {
        this(context, 0, 0, null, 14, null);
    }

    public RippleLayout(Context context, int i) {
        this(context, i, 0, null, 12, null);
    }

    public RippleLayout(Context context, int i, int i2) {
        this(context, i, i2, null, 8, null);
    }

    public static /* synthetic */ Object ipc$super(RippleLayout rippleLayout, String str, Object... objArr) {
        if (str.hashCode() == -244855388) {
            super.onLayout(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public final int getDiameter() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("cbfa9cfd", new Object[]{this})).intValue() : this.diameter;
    }

    public final void setDiameter(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("462fddad", new Object[]{this, new Integer(i)});
        } else {
            this.diameter = i;
        }
    }

    public final int getRippleChildCount() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("453e8b13", new Object[]{this})).intValue() : this.rippleChildCount;
    }

    public final void setRippleChildCount(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32a5fe57", new Object[]{this, new Integer(i)});
        } else {
            this.rippleChildCount = i;
        }
    }

    public /* synthetic */ RippleLayout(Context context, int i, int i2, AttributeSet attributeSet, int i3, o oVar) {
        this(context, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? 1 : i2, (i3 & 8) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RippleLayout(Context context, int i, int i2, AttributeSet attributeSet) {
        super(context, attributeSet);
        q.c(context, "context");
        this.diameter = i;
        this.rippleChildCount = i2;
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.parseColor("#FFFFFF"));
        this.paint = paint;
        this.rippleChildList = new ArrayList();
    }

    public final Paint getPaint() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Paint) ipChange.ipc$dispatch("daa8bf5c", new Object[]{this}) : this.paint;
    }

    public final void setPaint(Paint paint) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8629deb8", new Object[]{this, paint});
            return;
        }
        q.c(paint, "<set-?>");
        this.paint = paint;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        if (getWidth() <= 0 && getHeight() <= 0) {
            return;
        }
        prepareRippleConfig();
    }

    private final void prepareRippleConfig() {
        IpChange ipChange = $ipChange;
        char c = 0;
        int i = 1;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e17f9040", new Object[]{this});
        } else if (this.hasPrepared) {
        } else {
            this.hasPrepared = true;
            int d = rwf.d(getWidth(), getHeight());
            if (this.diameter <= 0) {
                this.diameter = d / 2;
            }
            int i2 = this.diameter;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i2, i2);
            layoutParams.gravity = 17;
            Locale locale = Locale.ENGLISH;
            q.a((Object) locale, "Locale.ENGLISH");
            Object[] objArr = {Float.valueOf(d / this.diameter)};
            String format = String.format(locale, "%.2f", Arrays.copyOf(objArr, objArr.length));
            q.b(format, "java.lang.String.format(locale, this, *args)");
            float parseFloat = Float.parseFloat(format);
            ArrayList arrayList = new ArrayList();
            int i3 = this.rippleChildCount;
            int i4 = 0;
            while (i4 < i3) {
                RippleCircleView rippleCircleView = new RippleCircleView(this);
                post(new a(rippleCircleView, layoutParams));
                rippleCircleView.setAlpha(0.5f);
                this.rippleChildList.add(rippleCircleView);
                float[] fArr = new float[2];
                fArr[c] = 1.0f;
                fArr[i] = parseFloat;
                ObjectAnimator scaleXAnimator = ObjectAnimator.ofFloat(rippleCircleView, "ScaleX", fArr);
                q.a((Object) scaleXAnimator, "scaleXAnimator");
                scaleXAnimator.setRepeatCount(-1);
                scaleXAnimator.setRepeatMode(i);
                long j = i4 * 1500;
                scaleXAnimator.setStartDelay(j);
                scaleXAnimator.setDuration(1500L);
                arrayList.add(scaleXAnimator);
                ObjectAnimator scaleYAnimator = ObjectAnimator.ofFloat(rippleCircleView, "ScaleY", 1.0f, parseFloat);
                q.a((Object) scaleYAnimator, "scaleYAnimator");
                scaleYAnimator.setRepeatCount(-1);
                scaleYAnimator.setRepeatMode(1);
                scaleYAnimator.setStartDelay(j);
                scaleYAnimator.setDuration(1500L);
                arrayList.add(scaleYAnimator);
                ObjectAnimator alphaAnimator = ObjectAnimator.ofFloat(rippleCircleView, "Alpha", 0.5f, 0.0f);
                q.a((Object) alphaAnimator, "alphaAnimator");
                alphaAnimator.setRepeatCount(-1);
                alphaAnimator.setRepeatMode(1);
                alphaAnimator.setStartDelay(j);
                alphaAnimator.setDuration(1500L);
                arrayList.add(alphaAnimator);
                i4++;
                c = 0;
                i = 1;
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
            animatorSet.playTogether(arrayList);
            this.animatorSet = animatorSet;
        }
    }

    public final void startRippleAnim() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4148fd6a", new Object[]{this});
        } else if (!this.animationRunning) {
            for (RippleCircleView rippleCircleView : this.rippleChildList) {
                rippleCircleView.setVisibility(0);
            }
            AnimatorSet animatorSet = this.animatorSet;
            if (animatorSet != null) {
                animatorSet.start();
            }
            this.animationRunning = true;
        }
    }

    public final void stopRippleAnim() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a5690a", new Object[]{this});
        } else if (this.animationRunning) {
            for (RippleCircleView rippleCircleView : this.rippleChildList) {
                rippleCircleView.setVisibility(4);
            }
            AnimatorSet animatorSet = this.animatorSet;
            if (animatorSet != null) {
                animatorSet.end();
            }
            this.animationRunning = false;
        }
    }
}
