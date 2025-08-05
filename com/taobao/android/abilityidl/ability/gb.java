package com.taobao.android.abilityidl.ability;

import java.util.Map;
import tb.kge;

/* loaded from: classes4.dex */
public final class gb {

    /* renamed from: a  reason: collision with root package name */
    public String f8882a;

    static {
        kge.a(-190251576);
    }

    public gb() {
        this.f8882a = "";
    }

    public gb(Map<String, ? extends Object> map) {
        this();
        String a2 = FootprintType.Companion.a(com.alibaba.ability.e.b(map, "type", (String) null));
        if (a2 != null) {
            this.f8882a = a2;
            return;
        }
        throw new RuntimeException("type 参数必传！");
    }
}
