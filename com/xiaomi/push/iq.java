package com.xiaomi.push;

/* loaded from: classes9.dex */
public enum iq {
    RegIdExpired(0),
    PackageUnregistered(1),
    Init(2);
    

    /* renamed from: a  reason: collision with other field name */
    private final int f584a;

    iq(int i) {
        this.f584a = i;
    }

    public static iq a(int i) {
        if (i != 0) {
            if (i == 1) {
                return PackageUnregistered;
            }
            if (i == 2) {
                return Init;
            }
            return null;
        }
        return RegIdExpired;
    }

    public int a() {
        return this.f584a;
    }
}
