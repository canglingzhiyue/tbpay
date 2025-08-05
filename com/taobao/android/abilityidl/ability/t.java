package com.taobao.android.abilityidl.ability;

import java.util.Map;
import tb.kge;

/* loaded from: classes4.dex */
public final class t {

    /* renamed from: a  reason: collision with root package name */
    public int f8895a;
    public String b;
    public String c;
    public String d;
    public x e;

    static {
        kge.a(719784503);
    }

    public t() {
        this.b = "";
        this.c = "";
        this.d = "";
    }

    public t(Map<String, ? extends Object> map) {
        this();
        x xVar = null;
        Integer b = com.alibaba.ability.e.b(map, "index", (Integer) null);
        if (b == null) {
            throw new RuntimeException("index 参数必传！");
        }
        this.f8895a = b.intValue();
        String b2 = com.alibaba.ability.e.b(map, "pageId", (String) null);
        if (b2 == null) {
            throw new RuntimeException("pageId 参数必传！");
        }
        this.b = b2;
        String b3 = com.alibaba.ability.e.b(map, "iconNormal", (String) null);
        if (b3 == null) {
            throw new RuntimeException("iconNormal 参数必传！");
        }
        this.c = b3;
        String b4 = com.alibaba.ability.e.b(map, "iconSelected", (String) null);
        if (b4 == null) {
            throw new RuntimeException("iconSelected 参数必传！");
        }
        this.d = b4;
        if (map != null && map.containsKey("queryPass")) {
            xVar = new x(com.alibaba.ability.e.c(map, "queryPass"));
        }
        this.e = xVar;
    }
}
