package com.taobao.android.abilityidl.ability;

import java.util.Map;
import tb.kge;

/* loaded from: classes4.dex */
public final class dn {

    /* renamed from: a  reason: collision with root package name */
    public boolean f8819a;

    static {
        kge.a(-1360478143);
    }

    public dn() {
        this.f8819a = true;
    }

    public dn(Map<String, ? extends Object> map) {
        this();
        boolean z = true;
        Boolean b = com.alibaba.ability.e.b(map, "animated", (Boolean) true);
        this.f8819a = b != null ? b.booleanValue() : z;
    }
}
