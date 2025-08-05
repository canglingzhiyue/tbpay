package android.support.transition;

import android.animation.PropertyValuesHolder;
import android.graphics.Path;
import android.graphics.PointF;
import android.os.Build;
import android.util.Property;

/* loaded from: classes2.dex */
class v {

    /* renamed from: a  reason: collision with root package name */
    private static final y f1305a;

    static {
        f1305a = Build.VERSION.SDK_INT >= 21 ? new x() : new w();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static PropertyValuesHolder a(Property<?, PointF> property, Path path) {
        return f1305a.a(property, path);
    }
}
