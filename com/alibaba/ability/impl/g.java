package com.alibaba.ability.impl;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes2.dex */
public final class g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f1896a;
    private final int b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;
    private final Map<String, String> h;

    static {
        kge.a(1872862899);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g(Map<String, ? extends Object> abilityData) {
        q.d(abilityData, "abilityData");
        this.f1896a = com.alibaba.ability.e.a(abilityData, "type", "");
        Integer a2 = com.alibaba.ability.e.a(abilityData, "eventId", (Integer) null);
        this.b = a2 != null ? a2.intValue() : -1;
        this.c = com.alibaba.ability.e.a(abilityData, "pageName", "");
        this.d = com.alibaba.ability.e.a(abilityData, "comName", "");
        this.e = com.alibaba.ability.e.a(abilityData, "arg1", "");
        this.f = com.alibaba.ability.e.a(abilityData, "arg2", "");
        this.g = com.alibaba.ability.e.a(abilityData, "arg3", "");
        Map a3 = com.alibaba.ability.e.a(abilityData, "params");
        this.h = !(a3 instanceof Map) ? null : a3;
    }

    public final String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f1896a;
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

    public final String f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("50938a53", new Object[]{this}) : this.f;
    }

    public final String g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d71944f2", new Object[]{this}) : this.g;
    }

    public final Map<String, String> h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("3fbd54e4", new Object[]{this}) : this.h;
    }
}
