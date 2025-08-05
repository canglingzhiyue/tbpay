package com.taobao.android.abilityidl.ability;

import java.util.Map;
import tb.kge;

/* loaded from: classes4.dex */
public final class ad {

    /* renamed from: a  reason: collision with root package name */
    public String f8775a;
    public double b;

    static {
        kge.a(190357775);
    }

    public ad() {
        this.f8775a = "";
    }

    public ad(Map<String, ? extends Object> map) {
        this();
        String b = com.alibaba.ability.e.b(map, "headerPageId", (String) null);
        if (b == null) {
            throw new RuntimeException("headerPageId 参数必传！");
        }
        this.f8775a = b;
        Double b2 = com.alibaba.ability.e.b(map, "height", (Double) null);
        if (b2 == null) {
            throw new RuntimeException("height 参数必传！");
        }
        this.b = b2.doubleValue();
    }
}
