package com.taobao.android.abilitykit.mega;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.q;
import tb.dlg;
import tb.dln;
import tb.kge;

/* loaded from: classes.dex */
public final class a<DATA> implements dln<DATA> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final com.alibaba.ability.builder.c f8949a;
    private final String b;

    static {
        kge.a(1248299998);
        kge.a(-1749066050);
    }

    public a(com.alibaba.ability.builder.c megaBuilder, String megaApi) {
        q.d(megaBuilder, "megaBuilder");
        q.d(megaApi, "megaApi");
        this.f8949a = megaBuilder;
        this.b = megaApi;
    }

    @Override // tb.dln
    public dlg<?> b(DATA data) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dlg) ipChange.ipc$dispatch("1766b262", new Object[]{this, data});
        }
        com.alibaba.ability.b a2 = this.f8949a.a();
        return a2 != null ? new c(a2, null, this.b, null, 8, null) : null;
    }
}
