package com.taobao.android.abilityidl.ability;

import java.util.Map;
import tb.kge;

/* loaded from: classes4.dex */
public final class dt {

    /* renamed from: a  reason: collision with root package name */
    public String f8825a;

    static {
        kge.a(-969846200);
    }

    public dt() {
        this.f8825a = "";
    }

    public dt(Map<String, ? extends Object> map) {
        this();
        String b = com.alibaba.ability.e.b(map, "action", (String) null);
        if (b != null) {
            this.f8825a = b;
            return;
        }
        throw new RuntimeException("action 参数必传！");
    }
}
