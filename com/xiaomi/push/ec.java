package com.xiaomi.push;

/* loaded from: classes9.dex */
public class ec {

    /* renamed from: a  reason: collision with root package name */
    private static volatile ec f24442a;

    /* renamed from: a  reason: collision with other field name */
    private eb f252a;

    public static ec a() {
        if (f24442a == null) {
            synchronized (ec.class) {
                if (f24442a == null) {
                    f24442a = new ec();
                }
            }
        }
        return f24442a;
    }

    /* renamed from: a  reason: collision with other method in class */
    public eb m1834a() {
        return this.f252a;
    }

    public void a(eb ebVar) {
        this.f252a = ebVar;
    }
}
