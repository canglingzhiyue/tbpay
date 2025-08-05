package com.taobao.android.abilityidl.ability;

import java.util.Map;
import tb.kge;

/* loaded from: classes4.dex */
public final class ah {

    /* renamed from: a  reason: collision with root package name */
    public String f8779a;
    public Integer b;

    static {
        kge.a(1885802177);
    }

    public ah() {
    }

    public ah(Map<String, ? extends Object> map) {
        this();
        this.f8779a = com.alibaba.ability.e.b(map, "animation", (String) null);
        this.b = com.alibaba.ability.e.b(map, "duration", (Integer) null);
    }
}
