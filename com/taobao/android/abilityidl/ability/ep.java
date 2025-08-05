package com.taobao.android.abilityidl.ability;

import java.util.Map;
import tb.kge;

/* loaded from: classes4.dex */
public final class ep {

    /* renamed from: a  reason: collision with root package name */
    public String f8848a;
    public String b;

    static {
        kge.a(-1852533527);
    }

    public ep() {
        this.f8848a = "";
        this.b = "";
    }

    public ep(Map<String, ? extends Object> map) {
        this();
        String b = com.alibaba.ability.e.b(map, "typeID", (String) null);
        if (b == null) {
            throw new RuntimeException("typeID 参数必传！");
        }
        this.f8848a = b;
        String b2 = com.alibaba.ability.e.b(map, "widgetType", (String) null);
        if (b2 == null) {
            throw new RuntimeException("widgetType 参数必传！");
        }
        this.b = b2;
    }
}
