package com.taobao.android.abilityidl.ability;

import java.util.Map;
import tb.kge;

/* loaded from: classes4.dex */
public final class an {

    /* renamed from: a  reason: collision with root package name */
    public String f8785a;

    static {
        kge.a(-442935961);
    }

    public an() {
        this.f8785a = "";
    }

    public an(Map<String, ? extends Object> map) {
        this();
        String b = com.alibaba.ability.e.b(map, "path", (String) null);
        if (b != null) {
            this.f8785a = b;
            return;
        }
        throw new RuntimeException("path 参数必传！");
    }
}
