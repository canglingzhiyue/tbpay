package com.alibaba.security.realidentity;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class c3 implements Comparable<c3> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final int f3374a;
    public final int b;

    public c3(int i, int i2) {
        this.f3374a = i;
        this.b = i2;
    }

    public int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : this.b;
    }

    public int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : this.f3374a;
    }

    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(c3 c3Var) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6a4672d6", new Object[]{this, c3Var})).intValue() : a(c3Var);
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
        if (obj instanceof c3) {
            c3 c3Var = (c3) obj;
            if (this.f3374a == c3Var.f3374a && this.b == c3Var.b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        int i = this.b;
        int i2 = this.f3374a;
        return i ^ ((i2 >>> 16) | (i2 << 16));
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return this.f3374a + "x" + this.b;
    }

    public int a(c3 c3Var) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a26c5b95", new Object[]{this, c3Var})).intValue() : (c3Var.f3374a * c3Var.b) - (this.f3374a * this.b);
    }
}
