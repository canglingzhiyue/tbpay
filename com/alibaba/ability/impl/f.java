package com.alibaba.ability.impl;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes2.dex */
public final class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f1885a;
    private final String b;
    private final String c;
    private final Map<String, String> d;

    static {
        kge.a(1813053234);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f(Map<String, ? extends Object> abilityData) {
        q.d(abilityData, "abilityData");
        this.f1885a = com.alibaba.ability.e.a(abilityData, "type", "");
        this.b = com.alibaba.ability.e.a(abilityData, "pageName", "");
        this.c = com.alibaba.ability.e.a(abilityData, "comName", "");
        Map a2 = com.alibaba.ability.e.a(abilityData, "params");
        this.d = !(a2 instanceof Map) ? null : a2;
    }

    public final String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f1885a;
    }

    public final String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.b;
    }

    public final String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : this.c;
    }

    public final Map<String, String> d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("913cde0", new Object[]{this}) : this.d;
    }
}
