package com.taobao.android.abilityidl.ability;

import java.util.Map;
import tb.kge;

/* loaded from: classes4.dex */
public final class z {

    /* renamed from: a  reason: collision with root package name */
    public int f8901a;
    public int b;

    static {
        kge.a(-688159268);
    }

    public z() {
    }

    public z(Map<String, ? extends Object> map) {
        this();
        Integer b = com.alibaba.ability.e.b(map, "tabIndex", (Integer) null);
        if (b == null) {
            throw new RuntimeException("tabIndex 参数必传！");
        }
        this.f8901a = b.intValue();
        Integer b2 = com.alibaba.ability.e.b(map, "index", (Integer) null);
        if (b2 == null) {
            throw new RuntimeException("index 参数必传！");
        }
        this.b = b2.intValue();
    }
}
