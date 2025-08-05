package com.taobao.android.abilityidl.ability;

import java.util.Map;
import tb.kge;

/* loaded from: classes4.dex */
public final class ac {

    /* renamed from: a  reason: collision with root package name */
    public int f8774a;
    public String b;
    public String c;
    public String d;
    public x e;

    static {
        kge.a(-1961844586);
    }

    public ac() {
    }

    public ac(Map<String, ? extends Object> map) {
        this();
        x xVar = null;
        Integer b = com.alibaba.ability.e.b(map, "index", (Integer) null);
        if (b == null) {
            throw new RuntimeException("index 参数必传！");
        }
        this.f8774a = b.intValue();
        this.b = com.alibaba.ability.e.b(map, "pageId", (String) null);
        this.c = com.alibaba.ability.e.b(map, "iconNormal", (String) null);
        this.d = com.alibaba.ability.e.b(map, "iconSelected", (String) null);
        if (map != null && map.containsKey("queryPass")) {
            xVar = new x(com.alibaba.ability.e.c(map, "queryPass"));
        }
        this.e = xVar;
    }
}
