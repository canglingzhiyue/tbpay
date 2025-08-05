package com.taobao.android.abilityidl.ability;

import java.util.Map;
import tb.kge;

/* loaded from: classes4.dex */
public final class ef {

    /* renamed from: a  reason: collision with root package name */
    public String f8838a;
    public String b;
    public String c;

    static {
        kge.a(-1223520847);
    }

    public ef() {
        this.f8838a = "";
        this.b = "";
        this.c = "";
    }

    public ef(Map<String, ? extends Object> map) {
        this();
        String b = com.alibaba.ability.e.b(map, "android", (String) null);
        if (b == null) {
            throw new RuntimeException("android 参数必传！");
        }
        this.f8838a = b;
        String b2 = com.alibaba.ability.e.b(map, "iOSScheme", (String) null);
        if (b2 == null) {
            throw new RuntimeException("iOSScheme 参数必传！");
        }
        this.b = b2;
        String b3 = com.alibaba.ability.e.b(map, "ohosScheme", (String) null);
        if (b3 == null) {
            throw new RuntimeException("ohosScheme 参数必传！");
        }
        this.c = b3;
    }
}
