package com.facebook.yoga;

/* loaded from: classes4.dex */
public enum YogaDirection {
    INHERIT(0),
    LTR(1),
    RTL(2);
    
    private final int mIntValue;

    YogaDirection(int i) {
        this.mIntValue = i;
    }

    public static YogaDirection fromInt(int i) {
        if (i != 0) {
            if (i == 1) {
                return LTR;
            }
            if (i == 2) {
                return RTL;
            }
            throw new IllegalArgumentException("Unknown enum value: " + i);
        }
        return INHERIT;
    }

    public int intValue() {
        return this.mIntValue;
    }
}
