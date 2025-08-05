package com.taobao.android.abilityidl.ability;

import com.android.alibaba.ip.runtime.IpChange;
import tb.als;
import tb.gml;
import tb.kge;

/* loaded from: classes4.dex */
public abstract class AbsBroadcastAbility extends com.taobao.android.abilityidl.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(770266369);
    }

    public abstract void addEventListener(als alsVar, o oVar, bg bgVar);

    public abstract void dispatchEvent(als alsVar, p pVar, gml gmlVar);

    public abstract void removeEventListener(als alsVar, q qVar, gml gmlVar);
}
