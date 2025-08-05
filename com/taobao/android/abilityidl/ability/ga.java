package com.taobao.android.abilityidl.ability;

import java.util.Map;
import tb.kge;

/* loaded from: classes4.dex */
public final class ga {

    /* renamed from: a  reason: collision with root package name */
    public String f8881a;
    public Map<String, ? extends Object> b;

    static {
        kge.a(-598365817);
    }

    public ga() {
        this.f8881a = "";
    }

    public ga(Map<String, ? extends Object> map) {
        this();
        String b = com.alibaba.ability.e.b(map, "bizid", (String) null);
        if (b == null) {
            throw new RuntimeException("bizid 参数必传！");
        }
        this.f8881a = b;
        this.b = com.alibaba.ability.e.c(map, "extInfo");
    }
}
