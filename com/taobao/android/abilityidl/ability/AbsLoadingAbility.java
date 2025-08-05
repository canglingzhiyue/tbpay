package com.taobao.android.abilityidl.ability;

import com.android.alibaba.ip.runtime.IpChange;
import tb.als;
import tb.gml;
import tb.kge;

/* loaded from: classes4.dex */
public abstract class AbsLoadingAbility extends com.taobao.android.abilityidl.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(2005467686);
    }

    public abstract void hide(als alsVar, gml gmlVar);

    public abstract void show(als alsVar, fv fvVar, gml gmlVar);
}
