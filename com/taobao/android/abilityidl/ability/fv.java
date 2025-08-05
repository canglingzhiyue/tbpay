package com.taobao.android.abilityidl.ability;

import java.util.Map;
import tb.kge;

/* loaded from: classes4.dex */
public final class fv {

    /* renamed from: a  reason: collision with root package name */
    public String f8876a;
    public String b;

    static {
        kge.a(-360719960);
    }

    public fv() {
    }

    public fv(Map<String, ? extends Object> map) {
        this();
        this.f8876a = com.alibaba.ability.e.b(map, "message", (String) null);
        this.b = LoadingStyle.Companion.a(com.alibaba.ability.e.b(map, "style", (String) null));
    }
}
