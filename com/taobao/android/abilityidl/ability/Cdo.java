package com.taobao.android.abilityidl.ability;

import java.util.Map;
import tb.kge;

/* renamed from: com.taobao.android.abilityidl.ability.do  reason: invalid class name */
/* loaded from: classes4.dex */
public final class Cdo {

    /* renamed from: a  reason: collision with root package name */
    public String f8820a;
    public Map<String, ? extends Object> b;
    public Map<String, ? extends Object> c;
    public boolean d;

    static {
        kge.a(1222393486);
    }

    public Cdo() {
        this.f8820a = "";
        this.d = true;
    }

    public Cdo(Map<String, ? extends Object> map) {
        this();
        String b = com.alibaba.ability.e.b(map, "url", (String) null);
        if (b == null) {
            throw new RuntimeException("url 参数必传！");
        }
        this.f8820a = b;
        this.b = com.alibaba.ability.e.c(map, "extQuery");
        this.c = com.alibaba.ability.e.c(map, "nativeParams");
        boolean z = true;
        Boolean b2 = com.alibaba.ability.e.b(map, "animated", (Boolean) true);
        this.d = b2 != null ? b2.booleanValue() : z;
    }
}
