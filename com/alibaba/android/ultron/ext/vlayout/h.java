package com.alibaba.android.ultron.ext.vlayout;

import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.Comparable;
import java.util.Arrays;
import java.util.Objects;
import tb.kge;

/* loaded from: classes2.dex */
public final class h<T extends Comparable<? super T>> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final T f2648a;
    private final T b;

    static {
        kge.a(-1471680154);
    }

    public h(T t, T t2) {
        if (t != null) {
            if (t2 == null) {
                throw new IllegalArgumentException("upper must not be null");
            }
            this.f2648a = t;
            this.b = t2;
            if (t.compareTo(t2) > 0) {
                throw new IllegalArgumentException("lower must be less than or equal to upper");
            }
            return;
        }
        throw new IllegalArgumentException("lower must not be null");
    }

    public static <T extends Comparable<? super T>> h<T> a(T t, T t2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (h) ipChange.ipc$dispatch("8475fdca", new Object[]{t, t2}) : new h<>(t, t2);
    }

    public T a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("a6832e8f", new Object[]{this}) : this.f2648a;
    }

    public T b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("a85c81ae", new Object[]{this}) : this.b;
    }

    public boolean a(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c54bfd4d", new Object[]{this, t})).booleanValue();
        }
        if (t == null) {
            throw new IllegalArgumentException("value must not be null");
        }
        return (t.compareTo(this.f2648a) >= 0) && (t.compareTo(this.b) <= 0);
    }

    public boolean a(h<T> hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c280718a", new Object[]{this, hVar})).booleanValue();
        }
        if (hVar == null) {
            throw new IllegalArgumentException("value must not be null");
        }
        return (hVar.f2648a.compareTo(this.f2648a) >= 0) && (hVar.b.compareTo(this.b) <= 0);
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (this.f2648a.equals(hVar.f2648a) && this.b.equals(hVar.b)) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this}) : String.format("[%s, %s]", this.f2648a, this.b);
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue() : Build.VERSION.SDK_INT >= 19 ? Objects.hash(this.f2648a, this.b) : Arrays.hashCode(new Object[]{this.f2648a, this.b});
    }
}
