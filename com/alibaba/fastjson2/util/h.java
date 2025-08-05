package com.alibaba.fastjson2.util;

import com.alibaba.fastjson2.a;
import java.lang.reflect.Type;
import tb.kge;

/* loaded from: classes2.dex */
public final class h implements Type {

    /* renamed from: a  reason: collision with root package name */
    private final Type[] f3035a;

    static {
        kge.a(274083592);
        kge.a(1338869568);
    }

    public int a() {
        return this.f3035a.length;
    }

    public Type a(int i) {
        return this.f3035a[i];
    }

    public String toString() {
        return a.CC.a(this.f3035a);
    }
}
