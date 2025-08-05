package com.facebook.yoga;

/* loaded from: classes4.dex */
public enum YogaPrintOptions {
    LAYOUT(1),
    STYLE(2),
    CHILDREN(4);
    
    private final int mIntValue;

    YogaPrintOptions(int i) {
        this.mIntValue = i;
    }

    public static YogaPrintOptions fromInt(int i) {
        if (i != 1) {
            if (i == 2) {
                return STYLE;
            }
            if (i == 4) {
                return CHILDREN;
            }
            throw new IllegalArgumentException("Unknown enum value: " + i);
        }
        return LAYOUT;
    }

    public int intValue() {
        return this.mIntValue;
    }
}
