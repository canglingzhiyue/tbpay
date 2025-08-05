package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.IpChange;
import tb.als;
import tb.gml;
import tb.kge;

/* loaded from: classes4.dex */
public abstract class AbsAppAbility extends com.taobao.android.abilityidl.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(2071804321);
    }

    public abstract com.alibaba.ability.result.g<Double, ErrorResult> getBottomBarHeight(als alsVar);

    public abstract com.alibaba.ability.result.g<String, ErrorResult> getEnv(als alsVar);

    public abstract com.alibaba.ability.result.g<AppGetInfoResult, ErrorResult> getInfo(als alsVar);

    public abstract com.alibaba.ability.result.g<Double, ErrorResult> getNavBarHeight(als alsVar);

    public abstract com.alibaba.ability.result.g<String, ErrorResult> getTTID(als alsVar);

    public abstract com.alibaba.ability.result.g<String, ErrorResult> getUTDID(als alsVar);

    public abstract com.alibaba.ability.result.g<String, ErrorResult> getVersion(als alsVar);

    public abstract com.alibaba.ability.result.g<Boolean, ErrorResult> isForeground(als alsVar);

    public abstract void suspend(als alsVar, gml gmlVar);
}
