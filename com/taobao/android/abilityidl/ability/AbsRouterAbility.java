package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.als;
import tb.gml;
import tb.kge;

/* loaded from: classes4.dex */
public abstract class AbsRouterAbility extends com.taobao.android.abilityidl.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1747637449);
    }

    public abstract void closeApp(als alsVar, gml gmlVar);

    public abstract com.alibaba.ability.result.g<Map<String, Object>, ErrorResult> getPageProps(als alsVar);

    public abstract void popPage(als alsVar, gml gmlVar);

    public abstract void popToRoot(als alsVar, gml gmlVar);

    public abstract void pushPage(als alsVar, dx dxVar, gml gmlVar);

    public abstract void replacePage(als alsVar, dx dxVar, gml gmlVar);

    public abstract void resetToPage(als alsVar, dx dxVar, gml gmlVar);
}
