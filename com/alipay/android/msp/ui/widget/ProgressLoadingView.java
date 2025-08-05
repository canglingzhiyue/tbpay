package com.alipay.android.msp.ui.widget;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.alipay.android.app.safepaylogv2.api.StatisticCollector;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.android.msp.utils.UIUtil;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* loaded from: classes3.dex */
public class ProgressLoadingView extends RelativeLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Context mContext;
    private View pA;
    private View pB;
    private AnimatorSet py;
    private View pz;

    public static /* synthetic */ AnimatorSet access$000(ProgressLoadingView progressLoadingView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AnimatorSet) ipChange.ipc$dispatch("87f8cc3f", new Object[]{progressLoadingView}) : progressLoadingView.py;
    }

    public static /* synthetic */ void access$100(ProgressLoadingView progressLoadingView, Animator animator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3be8b5c", new Object[]{progressLoadingView, animator});
        } else {
            a(animator);
        }
    }

    public ProgressLoadingView(Context context) {
        this(context, null);
    }

    public ProgressLoadingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ProgressLoadingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.py = null;
        this.mContext = context;
        inflate(this.mContext, R.layout.flybird_dialog_progress_view, this);
        this.pz = findViewById(R.id.v_point_one);
        this.pA = findViewById(R.id.v_point_two);
        this.pB = findViewById(R.id.v_point_three);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(getResources().getColor(R.color.C_white));
        gradientDrawable.setCornerRadius(UIUtil.getDp(this.mContext) * 1.0f);
        this.pz.setBackgroundDrawable(gradientDrawable);
        this.pA.setBackgroundDrawable(gradientDrawable);
        this.pB.setBackgroundDrawable(gradientDrawable);
    }

    public void startPointAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef928e5d", new Object[]{this});
        } else if (this.mContext == null || this.pz == null || this.py != null) {
        } else {
            LogUtil.record(2, "ProgressLoadingView:startPointAnimation", "");
            float dp = UIUtil.getDp(this.mContext) * 4.0f;
            float f = -dp;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.pz, "translationY", 0.0f, f, dp, 0.0f);
            ofFloat.setDuration(550L);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.pA, "translationY", 0.0f, f, dp, 0.0f);
            ofFloat2.setDuration(550L);
            ofFloat2.setStartDelay(100L);
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.pB, "translationY", 0.0f, f, dp * 2.0f, 0.0f);
            ofFloat3.setDuration(550L);
            ofFloat3.setStartDelay(200L);
            this.py = new AnimatorSet();
            this.py.play(ofFloat).with(ofFloat2).with(ofFloat3);
            this.py.setStartDelay(320L);
            this.py.addListener(new Animator.AnimatorListener() { // from class: com.alipay.android.msp.ui.widget.ProgressLoadingView.1
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
                        return;
                    }
                    ProgressLoadingView progressLoadingView = ProgressLoadingView.this;
                    ProgressLoadingView.access$100(progressLoadingView, ProgressLoadingView.access$000(progressLoadingView));
                }
            });
            a(this.py);
        }
    }

    public void stopPointAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("169029fd", new Object[]{this});
            return;
        }
        LogUtil.record(2, "ProgressLoadingView:stopPointAnimation", "");
        this.py = null;
    }

    private static void a(Animator animator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb2ed485", new Object[]{animator});
        } else if (animator == null) {
        } else {
            try {
                animator.start();
            } catch (Throwable th) {
                StatisticCollector.addError(StatisticCollector.GLOBAL_AGENT, ErrorType.DEFAULT, "ProgressLoadingView:startPointAnimation", th);
                LogUtil.printExceptionStackTrace(th);
            }
        }
    }
}
