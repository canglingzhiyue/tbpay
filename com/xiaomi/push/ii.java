package com.xiaomi.push;

/* loaded from: classes9.dex */
public enum ii {
    MISC_CONFIG(1),
    PLUGIN_CONFIG(2);
    

    /* renamed from: a  reason: collision with other field name */
    private final int f524a;

    ii(int i) {
        this.f524a = i;
    }

    public static ii a(int i) {
        if (i != 1) {
            if (i == 2) {
                return PLUGIN_CONFIG;
            }
            return null;
        }
        return MISC_CONFIG;
    }

    public int a() {
        return this.f524a;
    }
}
