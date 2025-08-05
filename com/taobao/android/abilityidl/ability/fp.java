package com.taobao.android.abilityidl.ability;

import java.util.Map;
import tb.kge;

/* loaded from: classes4.dex */
public final class fp {

    /* renamed from: a  reason: collision with root package name */
    public Boolean f8870a;
    public Map<String, ? extends Object> b;

    static {
        kge.a(-268526326);
    }

    public fp() {
    }

    public fp(Map<String, ? extends Object> map) {
        this();
        this.f8870a = com.alibaba.ability.e.b(map, "useTopVisiblePage", (Boolean) null);
        this.b = com.alibaba.ability.e.c(map, "utData");
    }
}
