package com.taobao.android.abilityidl.ability;

import java.util.Map;
import tb.bfo;
import tb.kge;

/* loaded from: classes4.dex */
public final class ew {

    /* renamed from: a  reason: collision with root package name */
    public boolean f8854a;
    public String b;
    public ev c;
    public boolean d;

    static {
        kge.a(1873204637);
    }

    public ew() {
        this.b = "IMMEDIATELY";
    }

    public ew(Map<String, ? extends Object> map) {
        this();
        boolean z = false;
        Boolean b = com.alibaba.ability.e.b(map, "useStream", (Boolean) false);
        this.f8854a = b != null ? b.booleanValue() : false;
        Boolean b2 = com.alibaba.ability.e.b(map, bfo.sParamsKeyDisableJSONParse, (Boolean) false);
        this.d = b2 != null ? b2.booleanValue() : z;
        String a2 = NextRPCAttachedResponseStrategy.Companion.a(com.alibaba.ability.e.b(map, "attachedResponseStrategy", "IMMEDIATELY"));
        this.b = a2 == null ? "IMMEDIATELY" : a2;
        this.c = (map == null || !map.containsKey("mtopRequestParams")) ? null : new ev(com.alibaba.ability.e.c(map, "mtopRequestParams"));
    }
}
