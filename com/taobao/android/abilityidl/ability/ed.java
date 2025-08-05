package com.taobao.android.abilityidl.ability;

import java.util.Map;
import tb.kge;

/* loaded from: classes4.dex */
public final class ed {

    /* renamed from: a  reason: collision with root package name */
    public String f8836a;
    public String b;

    static {
        kge.a(-967542206);
    }

    public ed() {
        this.f8836a = "";
        this.b = "";
    }

    public ed(Map<String, ? extends Object> map) {
        this();
        String b = com.alibaba.ability.e.b(map, "key", (String) null);
        if (b == null) {
            throw new RuntimeException("key 参数必传！");
        }
        this.f8836a = b;
        String b2 = com.alibaba.ability.e.b(map, "value", (String) null);
        if (b2 == null) {
            throw new RuntimeException("value 参数必传！");
        }
        this.b = b2;
    }
}
