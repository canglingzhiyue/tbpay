package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.IpChange;
import tb.als;
import tb.kge;

/* loaded from: classes4.dex */
public abstract class AbsLocationAbility extends com.taobao.android.abilityidl.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-421752611);
    }

    public abstract com.alibaba.ability.result.g<LocationData, ErrorResult> getCache(als alsVar);

    public abstract void request(als alsVar, db dbVar, ca caVar);
}
