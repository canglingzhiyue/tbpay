package android.support.transition;

import android.animation.PropertyValuesHolder;
import android.graphics.Path;
import android.graphics.PointF;
import android.util.Property;

/* loaded from: classes2.dex */
class w implements y {
    @Override // android.support.transition.y
    public PropertyValuesHolder a(Property<?, PointF> property, Path path) {
        return PropertyValuesHolder.ofFloat(new u(property, path), 0.0f, 1.0f);
    }
}
