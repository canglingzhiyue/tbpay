package com.taobao.android.abilityidl.ability;

import java.util.Map;
import tb.kge;

/* loaded from: classes4.dex */
public final class fj {

    /* renamed from: a  reason: collision with root package name */
    public String f8864a;
    public String b;
    public String c;
    public String d;
    public String e;
    public Map<String, ? extends Object> f;
    public Integer g;
    public boolean h;

    static {
        kge.a(-417102448);
    }

    public fj() {
        this.f8864a = "";
    }

    public fj(Map<String, ? extends Object> map) {
        this();
        String a2 = UTCommitAction.Companion.a(com.alibaba.ability.e.b(map, "action", (String) null));
        if (a2 == null) {
            throw new RuntimeException("action 参数必传！");
        }
        this.f8864a = a2;
        this.b = com.alibaba.ability.e.b(map, "pageName", (String) null);
        this.c = com.alibaba.ability.e.b(map, "arg1", (String) null);
        this.d = com.alibaba.ability.e.b(map, "arg2", (String) null);
        this.e = com.alibaba.ability.e.b(map, "arg3", (String) null);
        this.f = com.alibaba.ability.e.c(map, "args");
        this.g = com.alibaba.ability.e.b(map, "eventId", (Integer) null);
        boolean z = false;
        Boolean b = com.alibaba.ability.e.b(map, "useCustomBuilder", (Boolean) false);
        this.h = b != null ? b.booleanValue() : z;
    }
}
