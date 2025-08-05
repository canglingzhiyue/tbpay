package com.taobao.android.abilityidl.ability;

import com.android.alibaba.ip.runtime.IpChange;
import tb.als;
import tb.gml;
import tb.kge;

/* loaded from: classes4.dex */
public abstract class AbsTinyAppAbility extends com.taobao.android.abilityidl.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(774307009);
    }

    public abstract void addUserActiveAddIconListener(als alsVar, cs csVar);

    public abstract void checkAddIconButton(als alsVar, cr crVar);

    public abstract void removeUserActiveAddIconListener(als alsVar, gml gmlVar);

    public abstract void showActiveReplacePopup(als alsVar, gml gmlVar);

    public abstract void showICONChangeGuide(als alsVar, eh ehVar, gml gmlVar);
}
