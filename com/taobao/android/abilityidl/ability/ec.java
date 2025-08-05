package com.taobao.android.abilityidl.ability;

import java.util.Map;
import tb.kge;

/* loaded from: classes4.dex */
public final class ec {

    /* renamed from: a  reason: collision with root package name */
    public String f8835a;

    static {
        kge.a(1771416515);
    }

    public ec() {
        this.f8835a = "";
    }

    public ec(Map<String, ? extends Object> map) {
        this();
        String b = com.alibaba.ability.e.b(map, "key", (String) null);
        if (b != null) {
            this.f8835a = b;
            return;
        }
        throw new RuntimeException("key 参数必传！");
    }
}
