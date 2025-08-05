package android.support.transition;

import android.animation.ObjectAnimator;
import android.graphics.Path;
import android.graphics.PointF;
import android.os.Build;
import android.util.Property;

/* loaded from: classes2.dex */
class q {

    /* renamed from: a  reason: collision with root package name */
    private static final t f1303a;

    static {
        f1303a = Build.VERSION.SDK_INT >= 21 ? new s() : new r();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> ObjectAnimator a(T t, Property<T, PointF> property, Path path) {
        return f1303a.a(t, property, path);
    }
}
