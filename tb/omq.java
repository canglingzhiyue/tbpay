package tb;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes8.dex */
public class omq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{view});
        } else {
            b(view);
        }
    }

    public static Animator a(final View view, final boolean z, AnimatorListenerAdapter animatorListenerAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animator) ipChange.ipc$dispatch("ee14bf05", new Object[]{view, new Boolean(z), animatorListenerAdapter});
        }
        final int height = view.getHeight();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: tb.omq.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                View view2;
                float f;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                    return;
                }
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (z) {
                    view2 = view;
                    f = height * floatValue;
                } else {
                    view2 = view;
                    f = height * (1.0f - floatValue);
                }
                view2.setTranslationY(f);
                if (((int) floatValue) != 1) {
                    return;
                }
                omq.a(view);
            }
        });
        if (animatorListenerAdapter != null) {
            ofFloat.addListener(animatorListenerAdapter);
        }
        ofFloat.setDuration(300L);
        ofFloat.start();
        return ofFloat;
    }

    private static void b(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91037249", new Object[]{view});
        } else {
            view.setTranslationY(0.0f);
        }
    }

    public static void a(View view, Animator animator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f1b9487", new Object[]{view, animator});
            return;
        }
        b(view);
        animator.cancel();
    }
}
