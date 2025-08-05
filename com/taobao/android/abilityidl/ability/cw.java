package com.taobao.android.abilityidl.ability;

import java.util.Map;
import tb.kge;

/* loaded from: classes4.dex */
public final class cw {

    /* renamed from: a  reason: collision with root package name */
    public String f8801a;
    public boolean b;

    static {
        kge.a(-347317513);
    }

    public cw() {
        this.b = true;
    }

    public cw(Map<String, ? extends Object> map) {
        this();
        this.f8801a = com.alibaba.ability.e.b(map, "bizCode", (String) null);
        boolean z = true;
        Boolean b = com.alibaba.ability.e.b(map, "mute", (Boolean) true);
        this.b = b != null ? b.booleanValue() : z;
    }
}
