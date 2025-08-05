package com.taobao.android.abilityidl.ability;

import com.android.alibaba.ip.runtime.IpChange;
import tb.als;
import tb.gml;
import tb.kge;

/* loaded from: classes4.dex */
public abstract class AbsAppMonitorAbility extends com.taobao.android.abilityidl.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(2124975641);
    }

    public abstract void alarmFail(als alsVar, ey eyVar, gml gmlVar);

    public abstract void alarmSuccess(als alsVar, ez ezVar, gml gmlVar);

    public abstract void counter(als alsVar, ex exVar, gml gmlVar);
}
