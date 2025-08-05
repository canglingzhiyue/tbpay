package com.taobao.android.abilityidl.ability;

import java.util.Map;
import tb.kge;

/* loaded from: classes4.dex */
public final class ag {

    /* renamed from: a  reason: collision with root package name */
    public int f8778a;
    public int b;

    static {
        kge.a(-2062967868);
    }

    public ag() {
    }

    public ag(Map<String, ? extends Object> map) {
        this();
        Integer b = com.alibaba.ability.e.b(map, "originIndex", (Integer) null);
        if (b == null) {
            throw new RuntimeException("originIndex 参数必传！");
        }
        this.f8778a = b.intValue();
        Integer b2 = com.alibaba.ability.e.b(map, "targetIndex", (Integer) null);
        if (b2 == null) {
            throw new RuntimeException("targetIndex 参数必传！");
        }
        this.b = b2.intValue();
    }
}
