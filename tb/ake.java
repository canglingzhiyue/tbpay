package tb;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.os.Build;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes2.dex */
public abstract class ake extends ValueAnimator {

    /* renamed from: a  reason: collision with root package name */
    private final Set<ValueAnimator.AnimatorUpdateListener> f25387a = new CopyOnWriteArraySet();
    private final Set<Animator.AnimatorListener> b = new CopyOnWriteArraySet();

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        for (Animator.AnimatorListener animatorListener : this.b) {
            animatorListener.onAnimationRepeat(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(boolean z) {
        for (Animator.AnimatorListener animatorListener : this.b) {
            if (Build.VERSION.SDK_INT >= 26) {
                animatorListener.onAnimationStart(this, z);
            } else {
                animatorListener.onAnimationStart(this);
            }
        }
    }

    @Override // android.animation.Animator
    public void addListener(Animator.AnimatorListener animatorListener) {
        this.b.add(animatorListener);
    }

    @Override // android.animation.ValueAnimator
    public void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f25387a.add(animatorUpdateListener);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        for (Animator.AnimatorListener animatorListener : this.b) {
            animatorListener.onAnimationCancel(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(boolean z) {
        for (Animator.AnimatorListener animatorListener : this.b) {
            if (Build.VERSION.SDK_INT >= 26) {
                animatorListener.onAnimationEnd(this, z);
            } else {
                animatorListener.onAnimationEnd(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c() {
        for (ValueAnimator.AnimatorUpdateListener animatorUpdateListener : this.f25387a) {
            animatorUpdateListener.onAnimationUpdate(this);
        }
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public long getStartDelay() {
        akh.c("LottieAnimator does not support getStartDelay.");
        return 0L;
    }

    @Override // android.animation.Animator
    public void removeAllListeners() {
        this.b.clear();
    }

    @Override // android.animation.ValueAnimator
    public void removeAllUpdateListeners() {
        this.f25387a.clear();
    }

    @Override // android.animation.Animator
    public void removeListener(Animator.AnimatorListener animatorListener) {
        this.b.remove(animatorListener);
    }

    @Override // android.animation.ValueAnimator
    public void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f25387a.remove(animatorUpdateListener);
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public ValueAnimator setDuration(long j) {
        akh.c("LottieAnimator does not support setDuration.");
        return null;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void setInterpolator(TimeInterpolator timeInterpolator) {
        akh.c("LottieAnimator does not support setInterpolator.");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void setStartDelay(long j) {
        akh.c("LottieAnimator does not support setStartDelay.");
    }
}
