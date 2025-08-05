package com.taobao.android.abilityidl.ability;

import java.util.Map;
import tb.kge;

/* loaded from: classes4.dex */
public final class dx {

    /* renamed from: a  reason: collision with root package name */
    public Map<String, ? extends Object> f8829a;
    public String b;
    public String c;
    public String d;
    public Map<String, ? extends Object> e;

    static {
        kge.a(574040274);
    }

    public dx() {
    }

    public dx(Map<String, ? extends Object> map) {
        this();
        this.f8829a = com.alibaba.ability.e.c(map, "windowInfo");
        this.b = com.alibaba.ability.e.b(map, "type", (String) null);
        this.c = com.alibaba.ability.e.b(map, "url", (String) null);
        this.d = com.alibaba.ability.e.b(map, "pageID", (String) null);
        this.e = com.alibaba.ability.e.c(map, "props");
    }
}
