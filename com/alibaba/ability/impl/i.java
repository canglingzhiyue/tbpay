package com.alibaba.ability.impl;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes2.dex */
public final class i {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f1898a;

    static {
        kge.a(-1067550401);
    }

    public i(Map<String, ? extends Object> abilityData) {
        q.d(abilityData, "abilityData");
        this.f1898a = com.alibaba.ability.e.a(abilityData, "pageUtparam", "");
    }

    public final String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f1898a;
    }
}
