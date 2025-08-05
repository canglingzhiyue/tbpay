package com.facebook.yoga;

/* loaded from: classes4.dex */
public enum YogaUnit {
    UNDEFINED(0),
    POINT(1),
    PERCENT(2),
    AUTO(3);
    
    private final int mIntValue;

    YogaUnit(int i) {
        this.mIntValue = i;
    }

    public static YogaUnit fromInt(int i) {
        if (i != 0) {
            if (i == 1) {
                return POINT;
            }
            if (i == 2) {
                return PERCENT;
            }
            if (i == 3) {
                return AUTO;
            }
            throw new IllegalArgumentException("Unknown enum value: " + i);
        }
        return UNDEFINED;
    }

    public int intValue() {
        return this.mIntValue;
    }
}
