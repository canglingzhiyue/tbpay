package com.alibaba.ability.impl;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes2.dex */
public final class h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f1897a;
    private final int b;
    private final String c;
    private final String d;
    private final String e;
    private final Map<String, String> f;

    static {
        kge.a(-1981504992);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h(Map<String, ? extends Object> abilityData) {
        q.d(abilityData, "abilityData");
        this.f1897a = com.alibaba.ability.e.a(abilityData, "pageName", "");
        Integer a2 = com.alibaba.ability.e.a(abilityData, "eventId", (Integer) null);
        this.b = a2 != null ? a2.intValue() : -1;
        this.c = com.alibaba.ability.e.a(abilityData, "arg1", "");
        this.d = com.alibaba.ability.e.a(abilityData, "arg2", "");
        this.e = com.alibaba.ability.e.a(abilityData, "arg3", "");
        Map a3 = com.alibaba.ability.e.a(abilityData, "params");
        this.f = !(a3 instanceof Map) ? null : a3;
    }

    public final String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f1897a;
    }

    public final int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : this.b;
    }

    public final String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : this.c;
    }

    public final String d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[]{this}) : this.d;
    }

    public final String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : this.e;
    }

    public final Map<String, String> f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("a4689162", new Object[]{this}) : this.f;
    }
}
