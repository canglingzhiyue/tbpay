package com.taobao.android.abilityidl.ability;

import java.util.Map;
import tb.kge;

/* loaded from: classes4.dex */
public final class av {

    /* renamed from: a  reason: collision with root package name */
    public String f8793a;
    public String b;
    public String c;

    static {
        kge.a(-54651509);
    }

    public av() {
        this.f8793a = "";
        this.b = "";
        this.c = "UTF8";
    }

    public av(Map<String, ? extends Object> map) {
        this();
        String b = com.alibaba.ability.e.b(map, "path", (String) null);
        if (b == null) {
            throw new RuntimeException("path 参数必传！");
        }
        this.f8793a = b;
        String b2 = com.alibaba.ability.e.b(map, "data", (String) null);
        if (b2 == null) {
            throw new RuntimeException("data 参数必传！");
        }
        this.b = b2;
        String a2 = FileEncodingType.Companion.a(com.alibaba.ability.e.b(map, "encoding", "UTF8"));
        this.c = a2 == null ? "UTF8" : a2;
    }
}
