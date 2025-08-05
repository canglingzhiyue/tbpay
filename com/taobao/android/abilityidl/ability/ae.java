package com.taobao.android.abilityidl.ability;

import java.util.Map;
import tb.kge;

/* loaded from: classes4.dex */
public final class ae {

    /* renamed from: a  reason: collision with root package name */
    public int f8776a;
    public int b;

    static {
        kge.a(-1675511637);
    }

    public ae() {
    }

    public ae(Map<String, ? extends Object> map) {
        this();
        Integer b = com.alibaba.ability.e.b(map, "swiperIndex", (Integer) null);
        if (b == null) {
            throw new RuntimeException("swiperIndex 参数必传！");
        }
        this.f8776a = b.intValue();
        int i = 0;
        Integer b2 = com.alibaba.ability.e.b(map, "tabIndex", (Integer) 0);
        this.b = b2 != null ? b2.intValue() : i;
    }
}
