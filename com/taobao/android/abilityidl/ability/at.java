package com.taobao.android.abilityidl.ability;

import java.util.Map;
import tb.kge;

/* loaded from: classes4.dex */
public final class at {

    /* renamed from: a  reason: collision with root package name */
    public String f8791a;
    public String b;

    static {
        kge.a(-582166406);
    }

    public at() {
        this.f8791a = "";
        this.b = "";
    }

    public at(Map<String, ? extends Object> map) {
        this();
        String b = com.alibaba.ability.e.b(map, "src", (String) null);
        if (b == null) {
            throw new RuntimeException("src 参数必传！");
        }
        this.f8791a = b;
        String b2 = com.alibaba.ability.e.b(map, "dest", (String) null);
        if (b2 == null) {
            throw new RuntimeException("dest 参数必传！");
        }
        this.b = b2;
    }
}
