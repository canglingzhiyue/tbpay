package com.taobao.android.abilityidl.ability;

import java.util.Map;
import tb.kge;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public String f8798a;
    public double b;

    static {
        kge.a(1365562897);
    }

    public c() {
        this.f8798a = "";
    }

    public c(Map<String, ? extends Object> map) {
        this();
        String b = com.alibaba.ability.e.b(map, "key", (String) null);
        if (b == null) {
            throw new RuntimeException("key 参数必传！");
        }
        this.f8798a = b;
        Double b2 = com.alibaba.ability.e.b(map, "value", (Double) null);
        if (b2 == null) {
            throw new RuntimeException("value 参数必传！");
        }
        this.b = b2.doubleValue();
    }
}
