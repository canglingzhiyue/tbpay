package com.taobao.android.abilityidl.ability;

import java.util.Map;
import tb.kge;

/* loaded from: classes4.dex */
public final class s {

    /* renamed from: a  reason: collision with root package name */
    public int f8894a;
    public String b;
    public int c;

    static {
        kge.a(638385419);
    }

    public s() {
        this.b = "";
    }

    public s(Map<String, ? extends Object> map) {
        this();
        Integer b = com.alibaba.ability.e.b(map, "index", (Integer) null);
        if (b == null) {
            throw new RuntimeException("index 参数必传！");
        }
        this.f8894a = b.intValue();
        String b2 = com.alibaba.ability.e.b(map, "pageId", (String) null);
        if (b2 == null) {
            throw new RuntimeException("pageId 参数必传！");
        }
        this.b = b2;
        Integer b3 = com.alibaba.ability.e.b(map, "tabIndex", (Integer) null);
        if (b3 == null) {
            throw new RuntimeException("tabIndex 参数必传！");
        }
        this.c = b3.intValue();
    }
}
