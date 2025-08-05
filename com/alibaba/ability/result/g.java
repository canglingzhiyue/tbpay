package com.alibaba.ability.result;

import com.alibaba.ability.result.e;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.kge;
import tb.riy;

/* loaded from: classes2.dex */
public final class g<T, E extends e> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final T f1984a;
    private final E b;

    static {
        kge.a(946998217);
    }

    public g() {
        this(null, null, 3, null);
    }

    public g(T t) {
        this(t, null, 2, null);
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof g) {
                g gVar = (g) obj;
                if (!q.a(this.f1984a, gVar.f1984a) || !q.a(this.b, gVar.b)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        T t = this.f1984a;
        int hashCode = (t != null ? t.hashCode() : 0) * 31;
        E e = this.b;
        if (e != null) {
            i = e.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "Result(data=" + this.f1984a + ", error=" + this.b + riy.BRACKET_END_STR;
    }

    public g(T t, E e) {
        this.f1984a = t;
        this.b = e;
    }

    public /* synthetic */ g(Object obj, e eVar, int i, o oVar) {
        this((i & 1) != 0 ? null : obj, (i & 2) != 0 ? null : eVar);
    }

    public final T a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("bd3407ca", new Object[]{this}) : this.f1984a;
    }

    public final E b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (E) ipChange.ipc$dispatch("f0d2e683", new Object[]{this}) : this.b;
    }
}
