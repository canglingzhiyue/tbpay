package com.taobao.android.abilityidl.ability;

import com.android.alibaba.ip.runtime.IpChange;
import tb.als;
import tb.gml;
import tb.kge;

/* loaded from: classes4.dex */
public abstract class AbsContainerAbility extends com.taobao.android.abilityidl.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1236911807);
    }

    public abstract void addPageResizeListener(als alsVar, bk bkVar);

    public abstract void addSwiperItem(als alsVar, s sVar, gml gmlVar);

    public abstract void addSwiperSwitchListener(als alsVar, bl blVar);

    public abstract void addTabItem(als alsVar, t tVar, gml gmlVar);

    public abstract void addTabSwitchListener(als alsVar, bn bnVar);

    public abstract void disableInterceptPageClose(als alsVar, gml gmlVar);

    public abstract void hideErrorPage(als alsVar, gml gmlVar);

    public abstract void hideSwiperHeader(als alsVar, gml gmlVar);

    public abstract void hideTab(als alsVar, ah ahVar, gml gmlVar);

    public abstract void interceptPageClose(als alsVar, bj bjVar);

    public abstract void interceptTabBarClick(als alsVar, bm bmVar);

    public abstract void preRenderSubPage(als alsVar, w wVar, gml gmlVar);

    public abstract void registerPage(als alsVar, y yVar, gml gmlVar);

    public abstract void removePageResizeListener(als alsVar, gml gmlVar);

    public abstract void removeSwiperItem(als alsVar, z zVar, gml gmlVar);

    public abstract void removeSwiperSwitchListener(als alsVar, gml gmlVar);

    public abstract void removeTabBarBadge(als alsVar, ai aiVar, gml gmlVar);

    public abstract void removeTabItem(als alsVar, aa aaVar, gml gmlVar);

    public abstract void removeTabSwitchListener(als alsVar, gml gmlVar);

    public abstract void reportSubPagePreRenderStatus(als alsVar, af afVar, gml gmlVar);

    public abstract void setOrientation(als alsVar, er erVar, gml gmlVar);

    public abstract void setPageBgColor(als alsVar, u uVar, gml gmlVar);

    public abstract void setSwiperEnable(als alsVar, ab abVar, gml gmlVar);

    public abstract void setTabBarBadge(als alsVar, aj ajVar, gml gmlVar);

    public abstract void setTabBarItem(als alsVar, ac acVar, gml gmlVar);

    public abstract void setTabBarMode(als alsVar, ak akVar, gml gmlVar);

    public abstract void showErrorPage(als alsVar, gml gmlVar);

    public abstract void showSwiperHeader(als alsVar, ad adVar, gml gmlVar);

    public abstract void showTab(als alsVar, ah ahVar, gml gmlVar);

    public abstract void slideTo(als alsVar, ae aeVar, gml gmlVar);

    public abstract void switchTab(als alsVar, al alVar, gml gmlVar);

    public abstract void swizzleTab(als alsVar, ag agVar, gml gmlVar);
}
