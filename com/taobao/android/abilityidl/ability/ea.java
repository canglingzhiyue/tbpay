package com.taobao.android.abilityidl.ability;

import java.util.Map;
import tb.kge;

/* loaded from: classes4.dex */
public final class ea {

    /* renamed from: a  reason: collision with root package name */
    public boolean f8833a;

    static {
        kge.a(1428019568);
    }

    public ea() {
    }

    public ea(Map<String, ? extends Object> map) {
        this();
        Boolean b = com.alibaba.ability.e.b(map, "on", (Boolean) null);
        if (b != null) {
            this.f8833a = b.booleanValue();
            return;
        }
        throw new RuntimeException("on 参数必传！");
    }
}
