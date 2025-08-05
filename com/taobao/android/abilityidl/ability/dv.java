package com.taobao.android.abilityidl.ability;

import java.util.Map;
import tb.kge;

/* loaded from: classes4.dex */
public final class dv {

    /* renamed from: a  reason: collision with root package name */
    public String f8827a;
    public boolean b;
    public dw c;
    public String d;

    static {
        kge.a(2018508786);
    }

    public dv() {
        this.f8827a = "";
    }

    public dv(Map<String, ? extends Object> map) {
        this();
        String b = com.alibaba.ability.e.b(map, "code", (String) null);
        if (b == null) {
            throw new RuntimeException("code 参数必传！");
        }
        this.f8827a = b;
        Boolean b2 = com.alibaba.ability.e.b(map, "isOnline", (Boolean) null);
        if (b2 == null) {
            throw new RuntimeException("isOnline 参数必传！");
        }
        this.b = b2.booleanValue();
        this.c = (map == null || !map.containsKey("config")) ? null : new dw(com.alibaba.ability.e.c(map, "config"));
        this.d = com.alibaba.ability.e.b(map, "params", (String) null);
    }
}
