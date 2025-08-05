package android.support.design.internal;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.support.transition.Transition;
import android.support.transition.ah;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.Map;

/* loaded from: classes2.dex */
public class e extends Transition {
    private void a(ah ahVar) {
        if (ahVar.b instanceof TextView) {
            ahVar.f1277a.put("android:textscale:scale", Float.valueOf(((TextView) ahVar.b).getScaleX()));
        }
    }

    @Override // android.support.transition.Transition
    public void captureEndValues(ah ahVar) {
        a(ahVar);
    }

    @Override // android.support.transition.Transition
    public void captureStartValues(ah ahVar) {
        a(ahVar);
    }

    @Override // android.support.transition.Transition
    public Animator createAnimator(ViewGroup viewGroup, ah ahVar, ah ahVar2) {
        if (ahVar == null || ahVar2 == null || !(ahVar.b instanceof TextView) || !(ahVar2.b instanceof TextView)) {
            return null;
        }
        final TextView textView = (TextView) ahVar2.b;
        Map<String, Object> map = ahVar.f1277a;
        Map<String, Object> map2 = ahVar2.f1277a;
        float f = 1.0f;
        float floatValue = map.get("android:textscale:scale") != null ? ((Float) map.get("android:textscale:scale")).floatValue() : 1.0f;
        if (map2.get("android:textscale:scale") != null) {
            f = ((Float) map2.get("android:textscale:scale")).floatValue();
        }
        if (floatValue == f) {
            return null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(floatValue, f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: android.support.design.internal.e.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                textView.setScaleX(floatValue2);
                textView.setScaleY(floatValue2);
            }
        });
        return ofFloat;
    }
}
