package com.taobao.android.abilityidl.ability;

import java.util.Map;
import tb.kge;

/* loaded from: classes4.dex */
public final class am {

    /* renamed from: a  reason: collision with root package name */
    public String f8784a;
    public String b;
    public Map<String, ? extends Object> c;

    static {
        kge.a(-764141953);
    }

    public am() {
        this.f8784a = "";
        this.b = "";
    }

    public am(Map<String, ? extends Object> map) {
        this();
        String b = com.alibaba.ability.e.b(map, "id", (String) null);
        if (b == null) {
            throw new RuntimeException("id 参数必传！");
        }
        this.f8784a = b;
        String a2 = FavoriteItemType.Companion.a(com.alibaba.ability.e.b(map, "type", (String) null));
        if (a2 == null) {
            throw new RuntimeException("type 参数必传！");
        }
        this.b = a2;
        this.c = com.alibaba.ability.e.c(map, "ext");
    }
}
