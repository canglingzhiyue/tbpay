package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.support.v4.content.res.TypedArrayUtils;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes2.dex */
public class Fade extends Visibility {
    public static final int IN = 1;
    public static final int OUT = 2;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        private final View f1255a;
        private boolean b = false;

        a(View view) {
            this.f1255a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            at.a(this.f1255a, 1.0f);
            if (this.b) {
                this.f1255a.setLayerType(0, null);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (!ViewCompat.hasOverlappingRendering(this.f1255a) || this.f1255a.getLayerType() != 0) {
                return;
            }
            this.b = true;
            this.f1255a.setLayerType(2, null);
        }
    }

    public Fade() {
    }

    public Fade(int i) {
        b(i);
    }

    public Fade(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ac.f);
        b(TypedArrayUtils.getNamedInt(obtainStyledAttributes, (XmlResourceParser) attributeSet, "fadingMode", 0, a()));
        obtainStyledAttributes.recycle();
    }

    private static float a(ah ahVar, float f) {
        Float f2;
        return (ahVar == null || (f2 = (Float) ahVar.f1277a.get("android:fade:transitionAlpha")) == null) ? f : f2.floatValue();
    }

    private Animator a(final View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        at.a(view, f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, at.f1286a, f2);
        ofFloat.addListener(new a(view));
        addListener(new ad() { // from class: android.support.transition.Fade.1
            @Override // android.support.transition.ad, android.support.transition.Transition.d
            public void b(Transition transition) {
                at.a(view, 1.0f);
                at.e(view);
                transition.removeListener(this);
            }
        });
        return ofFloat;
    }

    @Override // android.support.transition.Visibility
    public Animator a(ViewGroup viewGroup, View view, ah ahVar, ah ahVar2) {
        float f = 0.0f;
        float a2 = a(ahVar, 0.0f);
        if (a2 != 1.0f) {
            f = a2;
        }
        return a(view, f, 1.0f);
    }

    @Override // android.support.transition.Visibility
    public Animator b(ViewGroup viewGroup, View view, ah ahVar, ah ahVar2) {
        at.d(view);
        return a(view, a(ahVar, 1.0f), 0.0f);
    }

    @Override // android.support.transition.Visibility, android.support.transition.Transition
    public void captureStartValues(ah ahVar) {
        super.captureStartValues(ahVar);
        ahVar.f1277a.put("android:fade:transitionAlpha", Float.valueOf(at.c(ahVar.b)));
    }
}
