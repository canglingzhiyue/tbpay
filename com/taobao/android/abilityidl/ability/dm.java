package com.taobao.android.abilityidl.ability;

import java.util.Map;
import tb.kge;

/* loaded from: classes4.dex */
public final class dm {

    /* renamed from: a  reason: collision with root package name */
    public boolean f8818a;
    public String b;

    static {
        kge.a(305783750);
    }

    public dm() {
        this.b = "OTHER";
    }

    public dm(Map<String, ? extends Object> map) {
        this();
        boolean z = false;
        Boolean b = com.alibaba.ability.e.b(map, "animation", (Boolean) false);
        this.f8818a = b != null ? b.booleanValue() : z;
        String a2 = NavBarVisibilityAnimationType.Companion.a(com.alibaba.ability.e.b(map, "animationType", "OTHER"));
        this.b = a2 == null ? "OTHER" : a2;
    }
}
