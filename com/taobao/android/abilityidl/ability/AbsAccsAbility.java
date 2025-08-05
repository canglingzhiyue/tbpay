package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.IpChange;
import tb.als;
import tb.kge;

/* loaded from: classes4.dex */
public abstract class AbsAccsAbility extends com.taobao.android.abilityidl.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1898428896);
    }

    public abstract void addConnectionListener(als alsVar, e eVar, bd bdVar);

    public abstract void bindService(als alsVar, h hVar, bc bcVar);

    public abstract com.alibaba.ability.result.g<AccsConnectionResult, ErrorResult> connection(als alsVar, e eVar);

    public abstract com.alibaba.ability.result.g<Object, ErrorResult> removeConnectionListener(als alsVar, f fVar);

    public abstract com.alibaba.ability.result.g<Object, ErrorResult> send(als alsVar, g gVar);

    public abstract com.alibaba.ability.result.g<Object, ErrorResult> unBindService(als alsVar, h hVar);
}
