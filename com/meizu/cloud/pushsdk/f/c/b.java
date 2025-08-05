package com.meizu.cloud.pushsdk.f.c;

/* loaded from: classes4.dex */
public enum b {
    Single(1),
    DefaultGroup(3),
    HeavyGroup(25);
    
    private final int e;

    b(int i) {
        this.e = i;
    }

    public int a() {
        return this.e;
    }
}
