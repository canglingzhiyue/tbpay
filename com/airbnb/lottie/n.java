package com.airbnb.lottie;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class n<V> {

    /* renamed from: a  reason: collision with root package name */
    private final V f1781a;
    private final Throwable b;

    public n(V v) {
        this.f1781a = v;
        this.b = null;
    }

    public n(Throwable th) {
        this.b = th;
        this.f1781a = null;
    }

    public V a() {
        return this.f1781a;
    }

    public Throwable b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (a() != null && a().equals(nVar.a())) {
            return true;
        }
        if (b() != null && nVar.b() != null) {
            return b().toString().equals(b().toString());
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{a(), b()});
    }
}
