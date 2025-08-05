package com.taobao.android.abilityidl.ability;

import com.android.alibaba.ip.runtime.IpChange;
import tb.als;
import tb.gml;
import tb.kge;

/* loaded from: classes4.dex */
public abstract class AbsNextRPCAbility extends com.taobao.android.abilityidl.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-81862480);
    }

    public abstract void bind(als alsVar, et etVar, gml gmlVar);

    public abstract void cancel(als alsVar, eu euVar, gml gmlVar);

    public abstract void request(als alsVar, ew ewVar, es esVar);

    public abstract void unbind(als alsVar, et etVar, gml gmlVar);
}
