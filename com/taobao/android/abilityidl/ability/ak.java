package com.taobao.android.abilityidl.ability;

import java.util.Map;
import tb.kge;

/* loaded from: classes4.dex */
public final class ak {

    /* renamed from: a  reason: collision with root package name */
    public String f8782a;

    static {
        kge.a(1332549362);
    }

    public ak() {
        this.f8782a = "default";
    }

    public ak(Map<String, ? extends Object> map) {
        this();
        String a2 = ContainerTabBarStyleMode.Companion.a(com.alibaba.ability.e.b(map, "mode", "default"));
        this.f8782a = a2 == null ? "default" : a2;
    }
}
