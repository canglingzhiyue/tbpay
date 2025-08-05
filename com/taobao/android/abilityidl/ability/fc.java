package com.taobao.android.abilityidl.ability;

import com.taobao.android.weex_framework.monitor.MUSMonitor;
import java.util.Map;
import tb.kge;

/* loaded from: classes4.dex */
public final class fc {

    /* renamed from: a  reason: collision with root package name */
    public String f8861a;
    public String b;
    public Map<String, ? extends Object> c;
    public String d;

    static {
        kge.a(1806899597);
    }

    public fc() {
        this.f8861a = "";
        this.b = "";
    }

    public fc(Map<String, ? extends Object> map) {
        this();
        String b = com.alibaba.ability.e.b(map, MUSMonitor.MODULE_DIM_ABILITY, (String) null);
        if (b == null) {
            throw new RuntimeException("ability 参数必传！");
        }
        this.f8861a = b;
        String b2 = com.alibaba.ability.e.b(map, "api", (String) null);
        if (b2 == null) {
            throw new RuntimeException("api 参数必传！");
        }
        this.b = b2;
        this.c = com.alibaba.ability.e.c(map, "params");
        this.d = com.alibaba.ability.e.b(map, "endFlag", (String) null);
    }
}
