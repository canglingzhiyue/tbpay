package com.alibaba.ability.builder;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.o;
import tb.kge;
import tb.riy;

/* loaded from: classes2.dex */
public final class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final int f1817a;

    static {
        kge.a(-94339781);
    }

    public b() {
        this(0, 1, null);
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue() : this == obj || ((obj instanceof b) && this.f1817a == ((b) obj).f1817a);
    }

    public int hashCode() {
        int hashCode;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        hashCode = Integer.valueOf(this.f1817a).hashCode();
        return hashCode;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "ApiSpec(threadMode=" + this.f1817a + riy.BRACKET_END_STR;
    }

    public b(int i) {
        this.f1817a = i;
    }

    public /* synthetic */ b(int i, int i2, o oVar) {
        this((i2 & 1) != 0 ? 2 : i);
    }

    public final int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : this.f1817a;
    }
}
