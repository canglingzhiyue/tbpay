package com.taobao.android.abilityidl.ability;

import com.android.alibaba.ip.runtime.IpChange;
import tb.als;
import tb.gml;
import tb.kge;

/* loaded from: classes4.dex */
public abstract class AbsPopCenterAbility extends com.taobao.android.abilityidl.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(139234332);
    }

    public abstract void checkShouldPop(als alsVar, du duVar, cj cjVar);

    public abstract void closePop(als alsVar, ck ckVar);

    public abstract void recordPopAction(als alsVar, dt dtVar, gml gmlVar);

    public abstract void setProperties(als alsVar, dv dvVar, gml gmlVar);

    public abstract void triggerPop(als alsVar, cl clVar);
}
