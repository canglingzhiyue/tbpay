package com.taobao.android.abilityidl.ability;

import com.android.alibaba.ip.runtime.IpChange;
import tb.als;
import tb.gml;
import tb.kge;

/* loaded from: classes4.dex */
public abstract class AbsNavigatorAbility extends com.taobao.android.abilityidl.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1480670891);
    }

    public abstract void close(als alsVar, dn dnVar, cd cdVar);

    public abstract void openExternalURL(als alsVar, Cdo cdo, ce ceVar);

    public abstract void openURL(als alsVar, Cdo cdo, cd cdVar);

    public abstract void removeSystemBackBlockListener(als alsVar, gml gmlVar);

    public abstract void replace(als alsVar, Cdo cdo, cd cdVar);

    public abstract void setSystemBackBlockListener(als alsVar, cf cfVar);
}
