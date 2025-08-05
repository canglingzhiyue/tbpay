package com.taobao.android.abilityidl.ability;

import java.util.Map;
import tb.kge;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public String f8771a;
    public String b;
    public String c;

    static {
        kge.a(1241442640);
    }

    public a() {
        this.f8771a = "";
        this.b = "";
        this.c = "";
    }

    public a(Map<String, ? extends Object> map) {
        this();
        String b = com.alibaba.ability.e.b(map, "component", (String) null);
        if (b == null) {
            throw new RuntimeException("component 参数必传！");
        }
        this.f8771a = b;
        String b2 = com.alibaba.ability.e.b(map, "module", (String) null);
        if (b2 == null) {
            throw new RuntimeException("module 参数必传！");
        }
        this.b = b2;
        String b3 = com.alibaba.ability.e.b(map, "variable", (String) null);
        if (b3 == null) {
            throw new RuntimeException("variable 参数必传！");
        }
        this.c = b3;
    }
}
