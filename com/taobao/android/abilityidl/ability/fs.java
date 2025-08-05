package com.taobao.android.abilityidl.ability;

import java.util.Map;
import tb.kge;

/* loaded from: classes4.dex */
public final class fs {

    /* renamed from: a  reason: collision with root package name */
    public Boolean f8873a;
    public String b;

    static {
        kge.a(-1718998621);
    }

    public fs() {
    }

    public fs(Map<String, ? extends Object> map) {
        this();
        this.f8873a = com.alibaba.ability.e.b(map, "useTopVisiblePage", (Boolean) null);
        this.b = com.alibaba.ability.e.b(map, "utParamJsonStr", (String) null);
    }
}
