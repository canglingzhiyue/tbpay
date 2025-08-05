package com.taobao.android.abilityidl.ability;

import java.util.Map;
import tb.kge;

/* loaded from: classes4.dex */
public final class v {

    /* renamed from: a  reason: collision with root package name */
    public Boolean f8897a;
    public Integer b;

    static {
        kge.a(2123432523);
    }

    public v() {
    }

    public v(Map<String, ? extends Object> map) {
        this();
        this.f8897a = com.alibaba.ability.e.b(map, "swiperEnable", (Boolean) null);
        this.b = com.alibaba.ability.e.b(map, "defaultIndex", (Integer) null);
    }
}
