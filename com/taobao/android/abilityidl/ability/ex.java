package com.taobao.android.abilityidl.ability;

import java.util.Map;
import tb.kge;

/* loaded from: classes4.dex */
public final class ex {

    /* renamed from: a  reason: collision with root package name */
    public String f8855a;
    public String b;
    public double c;
    public Map<String, ? extends Object> d;

    static {
        kge.a(-1601034121);
    }

    public ex() {
        this.f8855a = "";
        this.b = "";
        this.c = 1.0d;
    }

    public ex(Map<String, ? extends Object> map) {
        this();
        String b = com.alibaba.ability.e.b(map, "module", (String) null);
        if (b == null) {
            throw new RuntimeException("module 参数必传！");
        }
        this.f8855a = b;
        String b2 = com.alibaba.ability.e.b(map, "monitorPoint", (String) null);
        if (b2 == null) {
            throw new RuntimeException("monitorPoint 参数必传！");
        }
        this.b = b2;
        double d = 1.0d;
        Double b3 = com.alibaba.ability.e.b(map, "value", Double.valueOf(1.0d));
        this.c = b3 != null ? b3.doubleValue() : d;
        this.d = com.alibaba.ability.e.c(map, "args");
    }
}
