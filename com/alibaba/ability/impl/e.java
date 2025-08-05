package com.alibaba.ability.impl;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes2.dex */
public final class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f1883a;
    private final int b;
    private final String c;
    private final String d;
    private final String e;
    private final Map<String, String> f;

    static {
        kge.a(994492046);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(Map<String, ? extends Object> abilityData) {
        q.d(abilityData, "abilityData");
        this.f1883a = com.alibaba.ability.e.a(abilityData, "pageName", "");
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
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f1883a;
    }

    public final String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.c;
    }

    public final Map<String, String> c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("3b696c1f", new Object[]{this}) : this.f;
    }
}
