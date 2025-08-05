package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.IpChange;
import tb.als;
import tb.kge;

/* loaded from: classes4.dex */
public abstract class AbsWidgetServiceAbility extends com.taobao.android.abilityidl.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(670224369);
    }

    public abstract com.alibaba.ability.result.g<Boolean, ErrorResult> addWidget(als alsVar, en enVar);

    public abstract void editWidget(als alsVar, eo eoVar, ct ctVar);

    public abstract void isInstalled(als alsVar, ep epVar, ct ctVar);

    public abstract com.alibaba.ability.result.g<Boolean, ErrorResult> isSupported(als alsVar, eq eqVar);
}
