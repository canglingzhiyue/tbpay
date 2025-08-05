package com.taobao.android.abilityidl.ability;

import java.util.Map;
import tb.kge;

/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public String f8858a;
    public String b;

    static {
        kge.a(1783619874);
    }

    public f() {
        this.b = "";
    }

    public f(Map<String, ? extends Object> map) {
        this();
        this.f8858a = com.alibaba.ability.e.b(map, "tag", (String) null);
        String b = com.alibaba.ability.e.b(map, "listenerKey", (String) null);
        if (b != null) {
            this.b = b;
            return;
        }
        throw new RuntimeException("listenerKey 参数必传！");
    }
}
