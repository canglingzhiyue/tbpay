package com.taobao.android.abilityidl.ability;

import java.util.Map;
import tb.kge;

/* loaded from: classes4.dex */
public final class di {

    /* renamed from: a  reason: collision with root package name */
    public String f8814a;
    public String b;
    public String c;
    public String d;
    public String e;

    static {
        kge.a(-904504069);
    }

    public di() {
        this.f8814a = "";
        this.e = "";
    }

    public di(Map<String, ? extends Object> map) {
        this();
        String b = com.alibaba.ability.e.b(map, "businessId", (String) null);
        if (b == null) {
            throw new RuntimeException("businessId 参数必传！");
        }
        this.f8814a = b;
        this.b = com.alibaba.ability.e.b(map, "title", (String) null);
        this.c = com.alibaba.ability.e.b(map, "text", (String) null);
        this.d = com.alibaba.ability.e.b(map, "image", (String) null);
        String b2 = com.alibaba.ability.e.b(map, "url", (String) null);
        if (b2 == null) {
            throw new RuntimeException("url 参数必传！");
        }
        this.e = b2;
    }
}
