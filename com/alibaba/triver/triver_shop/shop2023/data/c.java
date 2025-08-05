package com.alibaba.triver.triver_shop.shop2023.data;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.o;
import tb.kge;

/* loaded from: classes3.dex */
public final class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final int f4066a;
    private final int b;

    static {
        kge.a(1015621466);
    }

    public c() {
        this(0, 0, 3, null);
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f4066a == cVar.f4066a && this.b == cVar.b;
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue() : (this.f4066a * 31) + this.b;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "ShopBigCardPositionData(bigCardFullSize=" + this.f4066a + ", bigCardBeHiddenPartSize=" + this.b + ')';
    }

    public c(int i, int i2) {
        this.f4066a = i;
        this.b = i2;
    }

    public /* synthetic */ c(int i, int i2, int i3, o oVar) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }

    public final int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : this.f4066a;
    }

    public final int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : this.b;
    }
}
