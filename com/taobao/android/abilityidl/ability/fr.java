package com.taobao.android.abilityidl.ability;

import java.util.Map;
import tb.kge;

/* loaded from: classes4.dex */
public final class fr {

    /* renamed from: a  reason: collision with root package name */
    public Boolean f8872a;
    public String b;

    static {
        kge.a(860368004);
    }

    public fr() {
        this.b = "";
    }

    public fr(Map<String, ? extends Object> map) {
        this();
        this.f8872a = com.alibaba.ability.e.b(map, "useTopVisiblePage", (Boolean) null);
        String b = com.alibaba.ability.e.b(map, "url", (String) null);
        if (b != null) {
            this.b = b;
            return;
        }
        throw new RuntimeException("url 参数必传！");
    }
}
