package com.taobao.android.abilityidl.ability;

import java.util.Map;
import tb.kge;

/* loaded from: classes4.dex */
public final class ar {

    /* renamed from: a  reason: collision with root package name */
    public String f8789a;
    public String b;

    static {
        kge.a(1066449685);
    }

    public ar() {
        this.f8789a = "";
        this.b = "UTF8";
    }

    public ar(Map<String, ? extends Object> map) {
        this();
        String b = com.alibaba.ability.e.b(map, "path", (String) null);
        if (b == null) {
            throw new RuntimeException("path 参数必传！");
        }
        this.f8789a = b;
        String a2 = FileEncodingType.Companion.a(com.alibaba.ability.e.b(map, "encoding", "UTF8"));
        this.b = a2 == null ? "UTF8" : a2;
    }
}
