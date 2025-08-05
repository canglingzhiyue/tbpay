package com.taobao.android.abilityidl.ability;

import java.util.Map;
import tb.kge;

/* loaded from: classes4.dex */
public final class fk {

    /* renamed from: a  reason: collision with root package name */
    public Boolean f8865a;
    public String b;

    static {
        kge.a(-2094450621);
    }

    public fk() {
    }

    public fk(Map<String, ? extends Object> map) {
        this();
        this.f8865a = com.alibaba.ability.e.b(map, "useTopVisiblePage", (Boolean) null);
        this.b = com.alibaba.ability.e.b(map, "pageName", (String) null);
    }
}
