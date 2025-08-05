package com.facebook.yoga;

/* loaded from: classes4.dex */
public enum YogaPositionType {
    RELATIVE(0),
    ABSOLUTE(1);
    
    private final int mIntValue;

    YogaPositionType(int i) {
        this.mIntValue = i;
    }

    public static YogaPositionType fromInt(int i) {
        if (i != 0) {
            if (i == 1) {
                return ABSOLUTE;
            }
            throw new IllegalArgumentException("Unknown enum value: " + i);
        }
        return RELATIVE;
    }

    public int intValue() {
        return this.mIntValue;
    }
}
