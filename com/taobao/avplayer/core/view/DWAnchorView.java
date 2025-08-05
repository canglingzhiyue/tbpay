package com.taobao.avplayer.core.view;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.RelativeLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.ArrayList;
import tb.kcl;
import tb.kge;

/* loaded from: classes6.dex */
public class DWAnchorView extends RelativeLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int ANCHOR_RADIUS_DEFAULT = 4;
    private AnimatorSet animatorSet;
    private boolean hidden;
    private int mAnchorRadius;
    private Handler mHandler;
    private Runnable mRunnable;

    static {
        kge.a(-118199571);
    }

    public static /* synthetic */ Handler access$000(DWAnchorView dWAnchorView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("b10ad30d", new Object[]{dWAnchorView}) : dWAnchorView.mHandler;
    }

    public static /* synthetic */ boolean access$100(DWAnchorView dWAnchorView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("69ec08de", new Object[]{dWAnchorView})).booleanValue() : dWAnchorView.hidden;
    }

    public static /* synthetic */ Runnable access$200(DWAnchorView dWAnchorView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Runnable) ipChange.ipc$dispatch("85a8b19", new Object[]{dWAnchorView}) : dWAnchorView.mRunnable;
    }

    public static /* synthetic */ AnimatorSet access$300(DWAnchorView dWAnchorView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AnimatorSet) ipChange.ipc$dispatch("a1886cdd", new Object[]{dWAnchorView}) : dWAnchorView.animatorSet;
    }

    public DWAnchorView(Context context) {
        super(context);
        this.mAnchorRadius = 4;
        this.mRunnable = new Runnable() { // from class: com.taobao.avplayer.core.view.DWAnchorView.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    DWAnchorView.access$300(DWAnchorView.this).start();
                }
            }
        };
        init();
    }

    public DWAnchorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mAnchorRadius = 4;
        this.mRunnable = new Runnable() { // from class: com.taobao.avplayer.core.view.DWAnchorView.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    DWAnchorView.access$300(DWAnchorView.this).start();
                }
            }
        };
        init();
    }

    public DWAnchorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mAnchorRadius = 4;
        this.mRunnable = new Runnable() { // from class: com.taobao.avplayer.core.view.DWAnchorView.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    DWAnchorView.access$300(DWAnchorView.this).start();
                }
            }
        };
        init();
    }

    public void setAnchorRadius(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0f243d3", new Object[]{this, new Integer(i)});
        } else {
            this.mAnchorRadius = i;
        }
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        this.mHandler = new Handler(Looper.getMainLooper());
        int a2 = kcl.a(getContext(), this.mAnchorRadius);
        int i = a2 * 2;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i, i);
        layoutParams.addRule(13, -1);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        float f = a2;
        paint.setShader(new LinearGradient(f, 0.0f, f, i, -16777216, -16777216, Shader.TileMode.REPEAT));
        this.animatorSet = new AnimatorSet();
        this.animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        ArrayList arrayList = new ArrayList();
        Anchor anchor = new Anchor(getContext(), paint);
        addView(anchor, layoutParams);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(anchor, "ScaleX", 1.0f, 3.0f);
        ofFloat.setDuration(600L);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(anchor, "ScaleY", 1.0f, 3.0f);
        ofFloat2.setDuration(600L);
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(anchor, "Alpha", 1.0f, 0.0f);
        ofFloat3.setDuration(600L);
        arrayList.add(ofFloat3);
        Anchor anchor2 = new Anchor(getContext(), paint);
        addView(anchor2, layoutParams);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(anchor2, "ScaleX", 1.0f, 3.0f);
        ofFloat4.setDuration(600L);
        ofFloat4.setStartDelay(400L);
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(anchor2, "ScaleY", 1.0f, 3.0f);
        ofFloat5.setDuration(600L);
        ofFloat5.setStartDelay(400L);
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(anchor2, "Alpha", 0.5f, 0.0f);
        ofFloat6.setDuration(600L);
        ofFloat6.setStartDelay(400L);
        arrayList.add(ofFloat4);
        arrayList.add(ofFloat5);
        arrayList.add(ofFloat6);
        ofFloat6.addListener(new Animator.AnimatorListener() { // from class: com.taobao.avplayer.core.view.DWAnchorView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("90a3af63", new Object[]{this, animator});
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4388ea84", new Object[]{this, animator});
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3a405721", new Object[]{this, animator});
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                } else if (DWAnchorView.access$000(DWAnchorView.this) == null || DWAnchorView.access$100(DWAnchorView.this)) {
                } else {
                    DWAnchorView.access$000(DWAnchorView.this).postDelayed(DWAnchorView.access$200(DWAnchorView.this), 1000L);
                }
            }
        });
        this.animatorSet.playTogether(arrayList);
        LayoutInflater.from(getContext()).inflate(R.layout.dw_anchor_view_layout, this).findViewById(R.id.dw_anchor_view).setLayoutParams(layoutParams);
        int i2 = a2 * 6;
        setMinimumWidth(i2);
        setMinimumHeight(i2);
    }

    public void startRippleAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8585d9f9", new Object[]{this});
            return;
        }
        this.hidden = false;
        if (this.animatorSet.isRunning()) {
            return;
        }
        this.animatorSet.start();
    }

    public void stopRippleAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e3bb259", new Object[]{this});
            return;
        }
        this.hidden = true;
        if (this.animatorSet.isRunning()) {
            this.animatorSet.end();
        }
        Handler handler = this.mHandler;
        if (handler == null) {
            return;
        }
        handler.removeCallbacksAndMessages(null);
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        this.hidden = true;
        AnimatorSet animatorSet = this.animatorSet;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.animatorSet.end();
            this.animatorSet.cancel();
        }
        if (this.mHandler == null) {
            return;
        }
        clearAnimation();
        this.mHandler.removeCallbacksAndMessages(null);
        this.mHandler = null;
    }

    /* loaded from: classes6.dex */
    public static class Anchor extends View {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private Paint mPaint;

        static {
            kge.a(438232172);
        }

        public Anchor(Context context, Paint paint) {
            super(context);
            this.mPaint = paint;
            this.mPaint.setAntiAlias(true);
        }

        @Override // android.view.View
        public void onDraw(Canvas canvas) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
                return;
            }
            float width = getWidth() / 2;
            canvas.drawCircle(width, width, width, this.mPaint);
        }
    }
}
