package com.taobao.android.abilityidl.ability;

import java.util.Map;
import tb.kge;

/* loaded from: classes4.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public Boolean f8884a;
    public String b;

    static {
        kge.a(365505259);
    }

    public i() {
    }

    public i(Map<String, ? extends Object> map) {
        this();
        this.f8884a = com.alibaba.ability.e.b(map, "isChecked", (Boolean) null);
        this.b = com.alibaba.ability.e.b(map, "text", (String) null);
    }
}
