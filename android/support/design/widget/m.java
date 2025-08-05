package android.support.design.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.util.StateSet;
import java.util.ArrayList;

/* loaded from: classes2.dex */
final class m {
    private final ArrayList<a> b = new ArrayList<>();
    private a c = null;

    /* renamed from: a  reason: collision with root package name */
    ValueAnimator f1224a = null;
    private final Animator.AnimatorListener d = new AnimatorListenerAdapter() { // from class: android.support.design.widget.m.1
        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (m.this.f1224a == animator) {
                m.this.f1224a = null;
            }
        }
    };

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        final int[] f1226a;
        final ValueAnimator b;

        a(int[] iArr, ValueAnimator valueAnimator) {
            this.f1226a = iArr;
            this.b = valueAnimator;
        }
    }

    private void a(a aVar) {
        this.f1224a = aVar.b;
        this.f1224a.start();
    }

    private void b() {
        ValueAnimator valueAnimator = this.f1224a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f1224a = null;
        }
    }

    public void a() {
        ValueAnimator valueAnimator = this.f1224a;
        if (valueAnimator != null) {
            valueAnimator.end();
            this.f1224a = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(int[] iArr) {
        a aVar;
        int size = this.b.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                aVar = null;
                break;
            }
            aVar = this.b.get(i);
            if (StateSet.stateSetMatches(aVar.f1226a, iArr)) {
                break;
            }
            i++;
        }
        a aVar2 = this.c;
        if (aVar == aVar2) {
            return;
        }
        if (aVar2 != null) {
            b();
        }
        this.c = aVar;
        if (aVar == null) {
            return;
        }
        a(aVar);
    }

    public void a(int[] iArr, ValueAnimator valueAnimator) {
        a aVar = new a(iArr, valueAnimator);
        valueAnimator.addListener(this.d);
        this.b.add(aVar);
    }
}
