package com.taobao.android.abilityidl.ability;

import java.util.Map;
import tb.kge;

/* loaded from: classes4.dex */
public final class ey {

    /* renamed from: a  reason: collision with root package name */
    public String f8856a;
    public String b;
    public String c;
    public String d;
    public Map<String, ? extends Object> e;

    static {
        kge.a(-1533866750);
    }

    public ey() {
        this.f8856a = "";
        this.b = "";
    }

    public ey(Map<String, ? extends Object> map) {
        this();
        String b = com.alibaba.ability.e.b(map, "module", (String) null);
        if (b == null) {
            throw new RuntimeException("module 参数必传！");
        }
        this.f8856a = b;
        String b2 = com.alibaba.ability.e.b(map, "monitorPoint", (String) null);
        if (b2 == null) {
            throw new RuntimeException("monitorPoint 参数必传！");
        }
        this.b = b2;
        this.c = com.alibaba.ability.e.b(map, "errorCode", (String) null);
        this.d = com.alibaba.ability.e.b(map, "errorMessage", (String) null);
        this.e = com.alibaba.ability.e.c(map, "args");
    }
}
