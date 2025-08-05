package com.taobao.android.abilityidl.ability;

import com.android.alibaba.ip.runtime.IpChange;
import tb.als;
import tb.gml;
import tb.kge;

/* loaded from: classes4.dex */
public abstract class AbsClientPrerenderAbility extends com.taobao.android.abilityidl.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(2085896372);
    }

    public abstract void addPrerenderAttachEventListener(als alsVar, gc gcVar);

    public abstract void removePrerenderAttachEventListener(als alsVar, gml gmlVar);

    public abstract void reportPrerenderStatus(als alsVar, fy fyVar, gml gmlVar);

    public abstract void start(als alsVar, gml gmlVar);
}
