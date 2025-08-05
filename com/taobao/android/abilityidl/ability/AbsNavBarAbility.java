package com.taobao.android.abilityidl.ability;

import com.android.alibaba.ip.runtime.IpChange;
import tb.als;
import tb.gml;
import tb.kge;

/* loaded from: classes4.dex */
public abstract class AbsNavBarAbility extends com.taobao.android.abilityidl.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-807236030);
    }

    public abstract void hide(als alsVar, dm dmVar, gml gmlVar);

    public abstract void hideBackButton(als alsVar, gml gmlVar);

    public abstract void hideRightItem(als alsVar, gml gmlVar);

    public abstract void hideStatusBar(als alsVar, gml gmlVar);

    public abstract void setBgColor(als alsVar, df dfVar, gml gmlVar);

    public abstract void setImmersive(als alsVar, dg dgVar, gml gmlVar);

    public abstract void setRightItem(als alsVar, dh dhVar, cb cbVar);

    public abstract void setShareConfig(als alsVar, di diVar, cc ccVar);

    public abstract void setTheme(als alsVar, dj djVar, gml gmlVar);

    public abstract void setTitle(als alsVar, dk dkVar, gml gmlVar);

    public abstract void setTitleColor(als alsVar, df dfVar, gml gmlVar);

    public abstract void setTitleImage(als alsVar, dl dlVar, gml gmlVar);

    public abstract void show(als alsVar, dm dmVar, gml gmlVar);

    public abstract void showBackButton(als alsVar, gml gmlVar);

    public abstract void showStatusBar(als alsVar, gml gmlVar);
}
