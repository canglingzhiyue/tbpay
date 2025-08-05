package com.taobao.android.abilityidl.ability;

import java.util.Map;
import tb.kge;

/* loaded from: classes4.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public boolean f8886a;

    static {
        kge.a(233211634);
    }

    public k() {
    }

    public k(Map<String, ? extends Object> map) {
        this();
        Boolean b = com.alibaba.ability.e.b(map, "value", (Boolean) null);
        if (b != null) {
            this.f8886a = b.booleanValue();
            return;
        }
        throw new RuntimeException("value 参数必传！");
    }
}
