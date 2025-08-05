package com.facebook.yoga;

/* loaded from: classes4.dex */
public enum YogaOverflow {
    VISIBLE(0),
    HIDDEN(1),
    SCROLL(2);
    
    private final int mIntValue;

    YogaOverflow(int i) {
        this.mIntValue = i;
    }

    public static YogaOverflow fromInt(int i) {
        if (i != 0) {
            if (i == 1) {
                return HIDDEN;
            }
            if (i == 2) {
                return SCROLL;
            }
            throw new IllegalArgumentException("Unknown enum value: " + i);
        }
        return VISIBLE;
    }

    public int intValue() {
        return this.mIntValue;
    }
}
