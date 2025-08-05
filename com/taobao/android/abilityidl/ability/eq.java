package com.taobao.android.abilityidl.ability;

import java.util.Map;
import tb.kge;

/* loaded from: classes4.dex */
public final class eq {

    /* renamed from: a  reason: collision with root package name */
    public String f8849a;

    static {
        kge.a(-1137411275);
    }

    public eq() {
        this.f8849a = "";
    }

    public eq(Map<String, ? extends Object> map) {
        this();
        String b = com.alibaba.ability.e.b(map, "typeID", (String) null);
        if (b != null) {
            this.f8849a = b;
            return;
        }
        throw new RuntimeException("typeID 参数必传！");
    }
}
