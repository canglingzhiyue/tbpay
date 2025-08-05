package com.taobao.android.abilityidl.ability;

import java.util.Map;
import tb.kge;

/* loaded from: classes4.dex */
public final class r {

    /* renamed from: a  reason: collision with root package name */
    public String f8893a;
    public String b;

    static {
        kge.a(-886446);
    }

    public r() {
    }

    public r(Map<String, ? extends Object> map) {
        this();
        this.f8893a = com.alibaba.ability.e.b(map, "queryName", (String) null);
        this.b = com.alibaba.ability.e.b(map, "queryPhone", (String) null);
    }
}
