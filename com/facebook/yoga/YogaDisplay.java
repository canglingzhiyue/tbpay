package com.facebook.yoga;

/* loaded from: classes4.dex */
public enum YogaDisplay {
    FLEX(0),
    NONE(1);
    
    private final int mIntValue;

    YogaDisplay(int i) {
        this.mIntValue = i;
    }

    public static YogaDisplay fromInt(int i) {
        if (i != 0) {
            if (i == 1) {
                return NONE;
            }
            throw new IllegalArgumentException("Unknown enum value: " + i);
        }
        return FLEX;
    }

    public int intValue() {
        return this.mIntValue;
    }
}
