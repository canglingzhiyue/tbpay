package com.taobao.android.abilityidl.ability;

import java.util.Map;
import tb.kge;

/* loaded from: classes4.dex */
public final class aa {

    /* renamed from: a  reason: collision with root package name */
    public int f8772a;

    static {
        kge.a(-1339857149);
    }

    public aa() {
    }

    public aa(Map<String, ? extends Object> map) {
        this();
        Integer b = com.alibaba.ability.e.b(map, "index", (Integer) null);
        if (b != null) {
            this.f8772a = b.intValue();
            return;
        }
        throw new RuntimeException("index 参数必传！");
    }
}
