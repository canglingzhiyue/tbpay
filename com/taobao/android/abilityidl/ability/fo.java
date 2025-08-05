package com.taobao.android.abilityidl.ability;

import java.util.Map;
import tb.kge;

/* loaded from: classes4.dex */
public final class fo {

    /* renamed from: a  reason: collision with root package name */
    public Boolean f8869a;
    public String b;

    static {
        kge.a(1342804258);
    }

    public fo() {
        this.b = "";
    }

    public fo(Map<String, ? extends Object> map) {
        this();
        this.f8869a = com.alibaba.ability.e.b(map, "useTopVisiblePage", (Boolean) null);
        String b = com.alibaba.ability.e.b(map, "pageName", (String) null);
        if (b != null) {
            this.b = b;
            return;
        }
        throw new RuntimeException("pageName 参数必传！");
    }
}
