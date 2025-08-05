package com.taobao.android.abilityidl.ability;

import java.util.Map;
import tb.kge;

/* loaded from: classes4.dex */
public final class ax {

    /* renamed from: a  reason: collision with root package name */
    public String f8795a;
    public String b;
    public String c;

    static {
        kge.a(318536928);
    }

    public ax() {
        this.f8795a = "";
        this.b = "";
    }

    public ax(Map<String, ? extends Object> map) {
        this();
        String b = com.alibaba.ability.e.b(map, "title", (String) null);
        if (b == null) {
            throw new RuntimeException("title 参数必传！");
        }
        this.f8795a = b;
        String b2 = com.alibaba.ability.e.b(map, "iconFont", (String) null);
        if (b2 == null) {
            throw new RuntimeException("iconFont 参数必传！");
        }
        this.b = b2;
        this.c = com.alibaba.ability.e.b(map, "imageUrl", (String) null);
    }
}
