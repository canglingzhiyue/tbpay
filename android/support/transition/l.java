package android.support.transition;

import android.animation.Animator;
import android.graphics.Matrix;
import android.os.Build;
import android.widget.ImageView;

/* loaded from: classes2.dex */
class l {

    /* renamed from: a  reason: collision with root package name */
    private static final o f1299a;

    static {
        f1299a = Build.VERSION.SDK_INT >= 21 ? new n() : new m();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(ImageView imageView) {
        f1299a.a(imageView);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(ImageView imageView, Animator animator) {
        f1299a.a(imageView, animator);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(ImageView imageView, Matrix matrix) {
        f1299a.a(imageView, matrix);
    }
}
