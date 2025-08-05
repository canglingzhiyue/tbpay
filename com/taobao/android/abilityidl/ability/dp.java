package com.taobao.android.abilityidl.ability;

import java.util.Map;
import tb.kge;

/* loaded from: classes4.dex */
public final class dp {

    /* renamed from: a  reason: collision with root package name */
    public String f8821a;
    public String b;

    static {
        kge.a(967589940);
    }

    public dp() {
        this.f8821a = "";
        this.b = "";
    }

    public dp(Map<String, ? extends Object> map) {
        this();
        String b = com.alibaba.ability.e.b(map, "group", (String) null);
        if (b == null) {
            throw new RuntimeException("group 参数必传！");
        }
        this.f8821a = b;
        String b2 = com.alibaba.ability.e.b(map, "key", (String) null);
        if (b2 == null) {
            throw new RuntimeException("key 参数必传！");
        }
        this.b = b2;
    }
}
