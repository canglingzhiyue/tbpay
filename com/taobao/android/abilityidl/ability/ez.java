package com.taobao.android.abilityidl.ability;

import java.util.Map;
import tb.kge;

/* loaded from: classes4.dex */
public final class ez {

    /* renamed from: a  reason: collision with root package name */
    public String f8857a;
    public String b;
    public Map<String, ? extends Object> c;

    static {
        kge.a(-440674325);
    }

    public ez() {
        this.f8857a = "";
        this.b = "";
    }

    public ez(Map<String, ? extends Object> map) {
        this();
        String b = com.alibaba.ability.e.b(map, "module", (String) null);
        if (b == null) {
            throw new RuntimeException("module 参数必传！");
        }
        this.f8857a = b;
        String b2 = com.alibaba.ability.e.b(map, "monitorPoint", (String) null);
        if (b2 == null) {
            throw new RuntimeException("monitorPoint 参数必传！");
        }
        this.b = b2;
        this.c = com.alibaba.ability.e.c(map, "args");
    }
}
