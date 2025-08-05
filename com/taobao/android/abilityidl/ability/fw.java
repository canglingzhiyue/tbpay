package com.taobao.android.abilityidl.ability;

import java.util.Map;
import tb.kge;

/* loaded from: classes4.dex */
public final class fw {

    /* renamed from: a  reason: collision with root package name */
    public String f8877a;
    public String b;
    public int c;
    public String d;

    static {
        kge.a(544184484);
    }

    public fw() {
        this.f8877a = "";
        this.b = "";
        this.c = 1000;
        this.d = "ANY";
    }

    public fw(Map<String, ? extends Object> map) {
        this();
        String b = com.alibaba.ability.e.b(map, "path", (String) null);
        if (b == null) {
            throw new RuntimeException("path 参数必传！");
        }
        this.f8877a = b;
        String b2 = com.alibaba.ability.e.b(map, "bizCode", (String) null);
        if (b2 == null) {
            throw new RuntimeException("bizCode 参数必传！");
        }
        this.b = b2;
        int i = 1000;
        Integer b3 = com.alibaba.ability.e.b(map, "minUpdateInterval", (Integer) 1000);
        this.c = b3 != null ? b3.intValue() : i;
        String a2 = AliUploadServiceNetworkType.Companion.a(com.alibaba.ability.e.b(map, "networkType", "ANY"));
        this.d = a2 == null ? "ANY" : a2;
    }
}
