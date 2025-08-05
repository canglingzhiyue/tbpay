package tb;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.bootimage.data.BootImageInfo;
import com.taobao.bootimage.linked.b;
import com.taobao.bootimage.view.FilletLinearLayout;

/* loaded from: classes6.dex */
public class sri {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(478378509);
    }

    public void a(final View view, final b.a aVar, BootImageInfo bootImageInfo, Animator.AnimatorListener animatorListener) {
        long j;
        long j2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3100a193", new Object[]{this, view, aVar, bootImageInfo, animatorListener});
            return;
        }
        final float f = aVar.f;
        final int width = view.getWidth();
        final int i = aVar.b;
        final int height = view.getHeight();
        final int i2 = aVar.c;
        final float a2 = keo.a(view.getContext(), 100.0f);
        if (bootImageInfo.alphaAnimationDuration <= 0 || bootImageInfo.scaleAnimationDuration < bootImageInfo.alphaAnimationDuration) {
            j = 100;
            j2 = 500;
        } else {
            j2 = bootImageInfo.scaleAnimationDuration;
            j = bootImageInfo.alphaAnimationDuration;
        }
        kej.a("TopViewAnimation", "startScaleAnimator: cornerRadius:" + f + "translationX:" + aVar.d + "translationY:" + aVar.e + "toX:" + i + "toY:" + i2);
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f);
        ofFloat.setDuration(j);
        ofFloat.setStartDelay(j2 - j);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat2.setDuration(j2);
        ofFloat2.setInterpolator(new DecelerateInterpolator());
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: tb.sri.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i3;
                int i4;
                float f2;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                    return;
                }
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                float parseFloat = Float.parseFloat(valueAnimator.getAnimatedValue().toString());
                layoutParams.width = i + ((int) ((width - i3) * parseFloat));
                layoutParams.height = i2 + ((int) ((height - i4) * parseFloat));
                view.setLayoutParams(layoutParams);
                float animatedFraction = valueAnimator.getAnimatedFraction();
                view.setX(aVar.d * animatedFraction);
                view.setTranslationY(aVar.e * animatedFraction);
                double d = parseFloat;
                if (d < 0.5d) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) view.getLayoutParams();
                    layoutParams2.setMargins(0, 0, 0, (int) ((d - 0.5d) * 2.0d * a2));
                    view.setLayoutParams(layoutParams2);
                }
                View view2 = view;
                if (!(view2 instanceof FilletLinearLayout)) {
                    return;
                }
                if (f <= 0.0f) {
                    return;
                }
                ((FilletLinearLayout) view2).setCornerSize(Math.max((int) (f2 * (1.0f - parseFloat)), 0));
            }
        });
        ofFloat2.addListener(animatorListener);
        animatorSet.playTogether(ofFloat, ofFloat2);
        animatorSet.start();
    }
}
