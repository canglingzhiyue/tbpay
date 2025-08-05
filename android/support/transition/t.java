package android.support.transition;

import android.animation.ObjectAnimator;
import android.graphics.Path;
import android.graphics.PointF;
import android.util.Property;

/* loaded from: classes2.dex */
interface t {
    <T> ObjectAnimator a(T t, Property<T, PointF> property, Path path);
}
