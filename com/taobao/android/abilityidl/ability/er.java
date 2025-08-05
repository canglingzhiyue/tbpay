package com.taobao.android.abilityidl.ability;

import java.util.Map;
import tb.kge;

/* loaded from: classes4.dex */
public final class er {

    /* renamed from: a  reason: collision with root package name */
    public String f8850a;

    static {
        kge.a(973581595);
    }

    public er() {
    }

    public er(Map<String, ? extends Object> map) {
        this();
        this.f8850a = ContainerScreenOrientation.Companion.a(com.alibaba.ability.e.b(map, "orientation", (String) null));
    }
}
