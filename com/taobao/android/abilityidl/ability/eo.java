package com.taobao.android.abilityidl.ability;

import java.util.Map;
import tb.kge;

/* loaded from: classes4.dex */
public final class eo {

    /* renamed from: a  reason: collision with root package name */
    public String f8847a;
    public String b;

    static {
        kge.a(76548812);
    }

    public eo() {
        this.f8847a = "";
        this.b = "";
    }

    public eo(Map<String, ? extends Object> map) {
        this();
        String b = com.alibaba.ability.e.b(map, "typeID", (String) null);
        if (b == null) {
            throw new RuntimeException("typeID 参数必传！");
        }
        this.f8847a = b;
        String b2 = com.alibaba.ability.e.b(map, "widgetID", (String) null);
        if (b2 == null) {
            throw new RuntimeException("widgetID 参数必传！");
        }
        this.b = b2;
    }
}
