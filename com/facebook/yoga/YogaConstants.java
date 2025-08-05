package com.facebook.yoga;

import tb.kge;

/* loaded from: classes4.dex */
public class YogaConstants {
    public static final float UNDEFINED = Float.NaN;

    static {
        kge.a(1196000667);
    }

    public static float getUndefined() {
        return Float.NaN;
    }

    public static boolean isUndefined(float f) {
        return Float.compare(f, Float.NaN) == 0;
    }

    public static boolean isUndefined(YogaValue yogaValue) {
        return yogaValue.unit == YogaUnit.UNDEFINED;
    }
}
