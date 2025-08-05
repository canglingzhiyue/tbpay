package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Build;

/* loaded from: classes2.dex */
class c {

    /* renamed from: a  reason: collision with root package name */
    private static final f f1294a;

    static {
        f1294a = Build.VERSION.SDK_INT >= 19 ? new e() : new d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Animator animator) {
        f1294a.a(animator);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Animator animator, AnimatorListenerAdapter animatorListenerAdapter) {
        f1294a.a(animator, animatorListenerAdapter);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(Animator animator) {
        f1294a.b(animator);
    }
}
