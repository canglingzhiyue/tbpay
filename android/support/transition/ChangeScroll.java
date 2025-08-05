package android.support.transition;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes2.dex */
public class ChangeScroll extends Transition {

    /* renamed from: a  reason: collision with root package name */
    private static final String[] f1248a = {"android:changeScroll:x", "android:changeScroll:y"};

    public ChangeScroll() {
    }

    public ChangeScroll(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private void a(ah ahVar) {
        ahVar.f1277a.put("android:changeScroll:x", Integer.valueOf(ahVar.b.getScrollX()));
        ahVar.f1277a.put("android:changeScroll:y", Integer.valueOf(ahVar.b.getScrollY()));
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
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimator2 = null;
        if (ahVar == null || ahVar2 == null) {
            return null;
        }
        View view = ahVar2.b;
        int intValue = ((Integer) ahVar.f1277a.get("android:changeScroll:x")).intValue();
        int intValue2 = ((Integer) ahVar2.f1277a.get("android:changeScroll:x")).intValue();
        int intValue3 = ((Integer) ahVar.f1277a.get("android:changeScroll:y")).intValue();
        int intValue4 = ((Integer) ahVar2.f1277a.get("android:changeScroll:y")).intValue();
        if (intValue != intValue2) {
            view.setScrollX(intValue);
            objectAnimator = ObjectAnimator.ofInt(view, "scrollX", intValue, intValue2);
        } else {
            objectAnimator = null;
        }
        if (intValue3 != intValue4) {
            view.setScrollY(intValue3);
            objectAnimator2 = ObjectAnimator.ofInt(view, "scrollY", intValue3, intValue4);
        }
        return ag.a(objectAnimator, objectAnimator2);
    }

    @Override // android.support.transition.Transition
    public String[] getTransitionProperties() {
        return f1248a;
    }
}
