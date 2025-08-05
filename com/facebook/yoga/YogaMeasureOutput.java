package com.facebook.yoga;

import tb.kge;

/* loaded from: classes4.dex */
public class YogaMeasureOutput {
    static {
        kge.a(-1452828085);
    }

    public static float getHeight(long j) {
        return Float.intBitsToFloat((int) (j & (-1)));
    }

    public static float getWidth(long j) {
        return Float.intBitsToFloat((int) ((j >> 32) & (-1)));
    }

    public static long make(float f, float f2) {
        int floatToRawIntBits = Float.floatToRawIntBits(f);
        return Float.floatToRawIntBits(f2) | (floatToRawIntBits << 32);
    }

    public static long make(int i, int i2) {
        return make(i, i2);
    }
}
