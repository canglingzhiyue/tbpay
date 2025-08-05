package com.taobao.android.abilityidl.ability;

import java.util.Map;
import tb.kge;

/* loaded from: classes4.dex */
public final class eb {

    /* renamed from: a  reason: collision with root package name */
    public String f8834a;

    static {
        kge.a(599047098);
    }

    public eb() {
    }

    public eb(Map<String, ? extends Object> map) {
        this();
        this.f8834a = ScreenOrientation.Companion.a(com.alibaba.ability.e.b(map, "orientation", (String) null));
    }
}
