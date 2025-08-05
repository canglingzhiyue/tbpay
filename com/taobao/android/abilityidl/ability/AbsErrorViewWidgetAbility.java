package com.taobao.android.abilityidl.ability;

import com.android.alibaba.ip.runtime.IpChange;
import tb.als;
import tb.gml;
import tb.kge;

/* loaded from: classes4.dex */
public abstract class AbsErrorViewWidgetAbility extends com.taobao.android.abilityidl.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-872128431);
    }

    public abstract void dismiss(als alsVar, gml gmlVar);

    public abstract void show(als alsVar, fz fzVar, gd gdVar);
}
