package com.taobao.android.abilityidl.ability;

import java.util.Map;
import tb.kge;

/* loaded from: classes4.dex */
public final class df {

    /* renamed from: a  reason: collision with root package name */
    public String f8811a;

    static {
        kge.a(30784153);
    }

    public df() {
        this.f8811a = "";
    }

    public df(Map<String, ? extends Object> map) {
        this();
        String b = com.alibaba.ability.e.b(map, "color", (String) null);
        if (b != null) {
            this.f8811a = b;
            return;
        }
        throw new RuntimeException("color 参数必传！");
    }
}
