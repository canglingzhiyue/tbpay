package com.taobao.android.abilityidl.ability;

import java.util.Map;
import tb.kge;

/* loaded from: classes4.dex */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    public int f8889a;

    static {
        kge.a(-307792143);
    }

    public n() {
    }

    public n(Map<String, ? extends Object> map) {
        this();
        Integer b = com.alibaba.ability.e.b(map, "position", (Integer) null);
        if (b != null) {
            this.f8889a = b.intValue();
            return;
        }
        throw new RuntimeException("position 参数必传！");
    }
}
