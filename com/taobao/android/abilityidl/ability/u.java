package com.taobao.android.abilityidl.ability;

import java.util.Map;
import tb.kge;

/* loaded from: classes4.dex */
public final class u {

    /* renamed from: a  reason: collision with root package name */
    public String f8896a;

    static {
        kge.a(-405035940);
    }

    public u() {
        this.f8896a = "";
    }

    public u(Map<String, ? extends Object> map) {
        this();
        String b = com.alibaba.ability.e.b(map, "color", (String) null);
        if (b != null) {
            this.f8896a = b;
            return;
        }
        throw new RuntimeException("color 参数必传！");
    }
}
