package com.taobao.appbundle.remote.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;
import android.widget.LinearLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.util.DensityUtil;
import tb.kge;

/* loaded from: classes6.dex */
public class CirclePointLoadingView extends LinearLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private ValueAnimator mAnimation;
    private CirclePointView mLeftCircle;
    private CirclePointView mMiddleCircle;
    private CirclePointView mRightCircle;

    static {
        kge.a(-976733919);
    }

    public static /* synthetic */ Object ipc$super(CirclePointLoadingView circlePointLoadingView, String str, Object... objArr) {
        if (str.hashCode() == 949399698) {
            super.onDetachedFromWindow();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ CirclePointView access$000(CirclePointLoadingView circlePointLoadingView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CirclePointView) ipChange.ipc$dispatch("90e7c218", new Object[]{circlePointLoadingView}) : circlePointLoadingView.mLeftCircle;
    }

    public static /* synthetic */ CirclePointView access$100(CirclePointLoadingView circlePointLoadingView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CirclePointView) ipChange.ipc$dispatch("1d5bfef7", new Object[]{circlePointLoadingView}) : circlePointLoadingView.mMiddleCircle;
    }

    public static /* synthetic */ CirclePointView access$200(CirclePointLoadingView circlePointLoadingView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CirclePointView) ipChange.ipc$dispatch("a9d03bd6", new Object[]{circlePointLoadingView}) : circlePointLoadingView.mRightCircle;
    }

    public CirclePointLoadingView(Context context) {
        super(context);
        initView();
        initAnim();
    }

    private void initAnim() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("579f8f48", new Object[]{this});
            return;
        }
        this.mAnimation = ValueAnimator.ofInt(0, 3);
        this.mAnimation.setDuration(1000L);
        this.mAnimation.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.taobao.appbundle.remote.view.CirclePointLoadingView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                    return;
                }
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                if (intValue == 0) {
                    CirclePointLoadingView.access$000(CirclePointLoadingView.this).setEnable(true);
                    CirclePointLoadingView.access$100(CirclePointLoadingView.this).setEnable(false);
                    CirclePointLoadingView.access$200(CirclePointLoadingView.this).setEnable(false);
                } else if (intValue == 1) {
                    CirclePointLoadingView.access$000(CirclePointLoadingView.this).setEnable(false);
                    CirclePointLoadingView.access$100(CirclePointLoadingView.this).setEnable(true);
                    CirclePointLoadingView.access$200(CirclePointLoadingView.this).setEnable(false);
                } else {
                    CirclePointLoadingView.access$000(CirclePointLoadingView.this).setEnable(false);
                    CirclePointLoadingView.access$100(CirclePointLoadingView.this).setEnable(false);
                    CirclePointLoadingView.access$200(CirclePointLoadingView.this).setEnable(true);
                }
            }
        });
        this.mAnimation.setRepeatCount(-1);
    }

    public void startAnim() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8157c9a", new Object[]{this});
        } else {
            this.mAnimation.start();
        }
    }

    public void stopAnim() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a93203a", new Object[]{this});
        } else {
            this.mAnimation.end();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        this.mAnimation.end();
    }

    private void initView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce529ddc", new Object[]{this});
            return;
        }
        setOrientation(0);
        int dip2px = DensityUtil.dip2px(getContext(), 4.0f);
        this.mLeftCircle = new CirclePointView(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(dip2px, dip2px);
        layoutParams.rightMargin = DensityUtil.dip2px(getContext(), 6.0f);
        addView(this.mLeftCircle, layoutParams);
        this.mMiddleCircle = new CirclePointView(getContext());
        addView(this.mMiddleCircle, layoutParams);
        this.mRightCircle = new CirclePointView(getContext());
        addView(this.mRightCircle, new LinearLayout.LayoutParams(dip2px, dip2px));
    }

    /* loaded from: classes6.dex */
    public class CirclePointView extends View {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private Paint mPaint;

        static {
            kge.a(-2059908158);
        }

        public static /* synthetic */ Object ipc$super(CirclePointView circlePointView, String str, Object... objArr) {
            if (str.hashCode() == -1117127205) {
                super.onDraw((Canvas) objArr[0]);
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        public CirclePointView(Context context) {
            super(context);
            this.mPaint = new Paint();
            this.mPaint.setAntiAlias(true);
            this.mPaint.setDither(true);
            this.mPaint.setColor(Color.parseColor("#999999"));
        }

        public void setEnable(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("183c4dc8", new Object[]{this, new Boolean(z)});
                return;
            }
            this.mPaint.setAlpha(z ? 255 : 153);
            invalidate();
        }

        @Override // android.view.View
        public void onDraw(Canvas canvas) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
                return;
            }
            super.onDraw(canvas);
            canvas.drawCircle(getWidth() / 2, getHeight() / 2, getHeight() / 2, this.mPaint);
        }
    }
}
