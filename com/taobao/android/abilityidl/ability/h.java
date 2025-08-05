package com.taobao.android.abilityidl.ability;

import java.util.Map;
import tb.kge;

/* loaded from: classes4.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public String f8883a;
    public String b;

    static {
        kge.a(-2059636113);
    }

    public h() {
        this.f8883a = "";
    }

    public h(Map<String, ? extends Object> map) {
        this();
        String b = com.alibaba.ability.e.b(map, "serviceID", (String) null);
        if (b == null) {
            throw new RuntimeException("serviceID 参数必传！");
        }
        this.f8883a = b;
        this.b = com.alibaba.ability.e.b(map, "tag", (String) null);
    }
}
