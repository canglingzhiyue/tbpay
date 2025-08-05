package com.taobao.android.abilityidl.ability;

import java.util.Map;
import tb.kge;

/* loaded from: classes4.dex */
public final class af {

    /* renamed from: a  reason: collision with root package name */
    public boolean f8777a;

    static {
        kge.a(1621107209);
    }

    public af() {
    }

    public af(Map<String, ? extends Object> map) {
        this();
        Boolean b = com.alibaba.ability.e.b(map, "status", (Boolean) null);
        if (b != null) {
            this.f8777a = b.booleanValue();
            return;
        }
        throw new RuntimeException("status 参数必传！");
    }
}
