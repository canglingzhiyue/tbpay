package com.taobao.android.abilityidl.ability;

import java.util.Map;
import tb.kge;

/* loaded from: classes4.dex */
public final class ab {

    /* renamed from: a  reason: collision with root package name */
    public boolean f8773a;
    public int b;

    static {
        kge.a(-1513558916);
    }

    public ab() {
    }

    public ab(Map<String, ? extends Object> map) {
        this();
        Boolean b = com.alibaba.ability.e.b(map, "enable", (Boolean) null);
        if (b == null) {
            throw new RuntimeException("enable 参数必传！");
        }
        this.f8773a = b.booleanValue();
        Integer b2 = com.alibaba.ability.e.b(map, "tabIndex", (Integer) null);
        if (b2 == null) {
            throw new RuntimeException("tabIndex 参数必传！");
        }
        this.b = b2.intValue();
    }
}
