package com.facebook.yoga;

/* loaded from: classes4.dex */
public enum YogaMeasureMode {
    UNDEFINED(0),
    EXACTLY(1),
    AT_MOST(2);
    
    private final int mIntValue;

    YogaMeasureMode(int i) {
        this.mIntValue = i;
    }

    public static YogaMeasureMode fromInt(int i) {
        if (i != 0) {
            if (i == 1) {
                return EXACTLY;
            }
            if (i == 2) {
                return AT_MOST;
            }
            throw new IllegalArgumentException("Unknown enum value: " + i);
        }
        return UNDEFINED;
    }

    public int intValue() {
        return this.mIntValue;
    }
}
