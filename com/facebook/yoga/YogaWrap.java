package com.facebook.yoga;

/* loaded from: classes4.dex */
public enum YogaWrap {
    NO_WRAP(0),
    WRAP(1),
    WRAP_REVERSE(2);
    
    private final int mIntValue;

    YogaWrap(int i) {
        this.mIntValue = i;
    }

    public static YogaWrap fromInt(int i) {
        if (i != 0) {
            if (i == 1) {
                return WRAP;
            }
            if (i == 2) {
                return WRAP_REVERSE;
            }
            throw new IllegalArgumentException("Unknown enum value: " + i);
        }
        return NO_WRAP;
    }

    public int intValue() {
        return this.mIntValue;
    }
}
