package com.taobao.android.abilityidl.ability;

import java.util.Map;
import tb.kge;

/* loaded from: classes4.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public double f8887a;

    static {
        kge.a(1717254169);
    }

    public l() {
    }

    public l(Map<String, ? extends Object> map) {
        this();
        Double b = com.alibaba.ability.e.b(map, "value", (Double) null);
        if (b != null) {
            this.f8887a = b.doubleValue();
            return;
        }
        throw new RuntimeException("value 参数必传！");
    }
}
