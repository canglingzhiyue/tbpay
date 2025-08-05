package com.taobao.android.tbabilitykit.weex.pop.render;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilitykit.ability.pop.render.PopErrorView;
import kotlin.jvm.internal.Lambda;
import kotlin.t;
import tb.dkv;
import tb.ruw;

/* loaded from: classes6.dex */
public final class TAKWeex2Render$1 extends Lambda implements ruw<Integer, String, t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a f15364a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TAKWeex2Render$1(a aVar) {
        super(2);
        this.f15364a = aVar;
    }

    @Override // tb.ruw
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ t mo2423invoke(Integer num, String str) {
        invoke2(num, str);
        return t.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Integer num, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("795a6ae2", new Object[]{this, num, str});
            return;
        }
        a aVar = this.f15364a;
        if (a.$ipChange == null || this.f15364a.c() == null) {
            return;
        }
        a aVar2 = this.f15364a;
        if (a.$ipChange == null) {
            return;
        }
        a aVar3 = this.f15364a;
        com.taobao.android.abilitykit.ability.pop.render.d dVar = a.$ipChange;
        if (dVar == null) {
            return;
        }
        dkv dkvVar = new dkv(10000, "weex 2.0 error code:" + num + ", msg:" + str);
        a aVar4 = this.f15364a;
        a aVar5 = this.f15364a;
        dVar.a(dkvVar, new PopErrorView(a.$ipChange, a.$ipChange));
    }
}
