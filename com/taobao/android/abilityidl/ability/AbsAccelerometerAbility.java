package com.taobao.android.abilityidl.ability;

import com.android.alibaba.ip.runtime.IpChange;
import tb.als;
import tb.gml;
import tb.kge;

/* loaded from: classes4.dex */
public abstract class AbsAccelerometerAbility extends com.taobao.android.abilityidl.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(2126112179);
    }

    public abstract void setShakeListener(als alsVar, d dVar, bb bbVar);

    public abstract void unsetShakeListener(als alsVar, gml gmlVar);
}
