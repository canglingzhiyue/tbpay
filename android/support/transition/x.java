package android.support.transition;

import android.animation.PropertyValuesHolder;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.graphics.PointF;
import android.util.Property;

/* loaded from: classes2.dex */
class x implements y {
    @Override // android.support.transition.y
    public PropertyValuesHolder a(Property<?, PointF> property, Path path) {
        return PropertyValuesHolder.ofObject(property, (TypeConverter) null, path);
    }
}
