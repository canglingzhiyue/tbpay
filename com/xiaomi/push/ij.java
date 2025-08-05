package com.xiaomi.push;

/* loaded from: classes9.dex */
public enum ij {
    INT(1),
    LONG(2),
    STRING(3),
    BOOLEAN(4);
    

    /* renamed from: a  reason: collision with other field name */
    private final int f526a;

    ij(int i) {
        this.f526a = i;
    }

    public static ij a(int i) {
        if (i != 1) {
            if (i == 2) {
                return LONG;
            }
            if (i == 3) {
                return STRING;
            }
            if (i == 4) {
                return BOOLEAN;
            }
            return null;
        }
        return INT;
    }
}
