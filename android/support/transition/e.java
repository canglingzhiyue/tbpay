package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: classes2.dex */
class e implements f {
    @Override // android.support.transition.f
    public void a(Animator animator) {
        animator.pause();
    }

    @Override // android.support.transition.f
    public void a(Animator animator, AnimatorListenerAdapter animatorListenerAdapter) {
        animator.addPauseListener(animatorListenerAdapter);
    }

    @Override // android.support.transition.f
    public void b(Animator animator) {
        animator.resume();
    }
}
