package com.taobao.android.abilityidl.ability;

import com.android.alibaba.ip.runtime.IpChange;
import tb.als;
import tb.gml;
import tb.kge;

/* loaded from: classes4.dex */
public abstract class AbsLifeCycleAbility extends com.taobao.android.abilityidl.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(812157528);
    }

    public abstract void addPageLifeCycleListener(als alsVar, by byVar);

    public abstract void removePageLifeCycleListener(als alsVar, gml gmlVar);
}
