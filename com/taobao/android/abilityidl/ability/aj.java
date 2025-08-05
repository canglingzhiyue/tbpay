package com.taobao.android.abilityidl.ability;

import java.util.Map;
import tb.kge;

/* loaded from: classes4.dex */
public final class aj {

    /* renamed from: a  reason: collision with root package name */
    public int f8781a;
    public String b;

    static {
        kge.a(1389837802);
    }

    public aj() {
        this.b = "";
    }

    public aj(Map<String, ? extends Object> map) {
        this();
        Integer b = com.alibaba.ability.e.b(map, "index", (Integer) null);
        if (b == null) {
            throw new RuntimeException("index 参数必传！");
        }
        this.f8781a = b.intValue();
        String b2 = com.alibaba.ability.e.b(map, "text", (String) null);
        if (b2 == null) {
            throw new RuntimeException("text 参数必传！");
        }
        this.b = b2;
    }
}
