package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.content.Context;
import android.graphics.Rect;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes2.dex */
public class ChangeClipBounds extends Transition {

    /* renamed from: a  reason: collision with root package name */
    private static final String[] f1244a = {"android:clipBounds:clip"};

    public ChangeClipBounds() {
    }

    public ChangeClipBounds(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private void a(ah ahVar) {
        View view = ahVar.b;
        if (view.getVisibility() == 8) {
            return;
        }
        Rect clipBounds = ViewCompat.getClipBounds(view);
        ahVar.f1277a.put("android:clipBounds:clip", clipBounds);
        if (clipBounds != null) {
            return;
        }
        ahVar.f1277a.put("android:clipBounds:bounds", new Rect(0, 0, view.getWidth(), view.getHeight()));
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
        ObjectAnimator objectAnimator = null;
        if (ahVar != null && ahVar2 != null && ahVar.f1277a.containsKey("android:clipBounds:clip") && ahVar2.f1277a.containsKey("android:clipBounds:clip")) {
            Rect rect = (Rect) ahVar.f1277a.get("android:clipBounds:clip");
            Rect rect2 = (Rect) ahVar2.f1277a.get("android:clipBounds:clip");
            boolean z = rect2 == null;
            if (rect == null && rect2 == null) {
                return null;
            }
            if (rect == null) {
                rect = (Rect) ahVar.f1277a.get("android:clipBounds:bounds");
            } else if (rect2 == null) {
                rect2 = (Rect) ahVar2.f1277a.get("android:clipBounds:bounds");
            }
            if (rect.equals(rect2)) {
                return null;
            }
            ViewCompat.setClipBounds(ahVar2.b, rect);
            objectAnimator = ObjectAnimator.ofObject(ahVar2.b, (Property<View, V>) at.b, (TypeEvaluator) new z(new Rect()), (Object[]) new Rect[]{rect, rect2});
            if (z) {
                final View view = ahVar2.b;
                objectAnimator.addListener(new AnimatorListenerAdapter() { // from class: android.support.transition.ChangeClipBounds.1
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        ViewCompat.setClipBounds(view, null);
                    }
                });
            }
        }
        return objectAnimator;
    }

    @Override // android.support.transition.Transition
    public String[] getTransitionProperties() {
        return f1244a;
    }
}
