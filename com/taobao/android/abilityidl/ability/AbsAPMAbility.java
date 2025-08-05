package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.IpChange;
import tb.als;
import tb.kge;

/* loaded from: classes4.dex */
public abstract class AbsAPMAbility extends com.taobao.android.abilityidl.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1088014588);
    }

    public abstract void addPageProperty(als alsVar, b bVar, ba baVar);

    public abstract void addPageStage(als alsVar, c cVar, ba baVar);

    public abstract com.alibaba.ability.result.g<APMProcedureResult, ErrorResult> getCurrentProcedure(als alsVar);

    public abstract void requestSubCurrentProcedure(als alsVar, az azVar);
}
