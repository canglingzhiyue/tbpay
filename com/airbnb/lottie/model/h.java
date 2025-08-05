package com.airbnb.lottie.model;

import android.support.v4.util.Pair;
import tb.riy;

/* loaded from: classes2.dex */
public class h<T> {

    /* renamed from: a  reason: collision with root package name */
    T f1773a;
    T b;

    private static boolean b(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public void a(T t, T t2) {
        this.f1773a = t;
        this.b = t2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Pair)) {
            return false;
        }
        Pair pair = (Pair) obj;
        return b(pair.first, this.f1773a) && b(pair.second, this.b);
    }

    public int hashCode() {
        T t = this.f1773a;
        int i = 0;
        int hashCode = t == null ? 0 : t.hashCode();
        T t2 = this.b;
        if (t2 != null) {
            i = t2.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        return "Pair{" + this.f1773a + " " + this.b + riy.BLOCK_END_STR;
    }
}
