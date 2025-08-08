package com.taobao.uikit.actionbar;

import android.content.Context;
import android.content.res.Resources;
import mtopsdk.common.util.StringUtils;
import android.util.SparseArray;
import com.alibaba.ability.localization.b;
import com.alibaba.ability.localization.constants.Language;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.util.NavUrls;
import com.taobao.taobao.R;
import com.taobao.uikit.actionbar.TBPublicMenuItem;
import com.taobao.uikit.actionbar.util.MenuLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tb.cts;
import tb.kge;
import tb.nyk;

/* loaded from: classes9.dex */
public class TBPublicMenuData {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "TBPublicMenuData";
    public static final List<TBPublicMenuItem> sDefaultExtraMenus;
    private static final SparseArray<String> sDefaultMenuUrls;
    public static final List<TBPublicMenuItem> sDefaultPublicMenus;
    private List<TBPublicMenuItem> mDefaultPublicMenus = new ArrayList();
    private List<TBPublicMenuItem> mCustomMenus = new ArrayList();
    private List<TBPublicMenuItem> mShareMenus = new ArrayList();
    private volatile boolean isInit = false;
    private String menuIdentifies = "";

    public void addShowItem(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("538dce8b", new Object[]{this, new Integer(i)});
        }
    }

    public void setShareItem(TBPublicMenuItem tBPublicMenuItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e8f08ef", new Object[]{this, tBPublicMenuItem});
        }
    }

    public static /* synthetic */ void access$100() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1bc42b8", new Object[0]);
        } else {
            initMenuItems();
        }
    }

    static {
        kge.a(186948498);
        sDefaultPublicMenus = new ArrayList();
        sDefaultExtraMenus = new ArrayList();
        SparseArray<String> sparseArray = new SparseArray<>();
        sDefaultMenuUrls = sparseArray;
        sparseArray.put(R.id.uik_menu_wangxin, NavUrls.NAV_URL_MSG_CENTER_CATEGORY);
        sDefaultMenuUrls.put(R.id.uik_menu_service, "https://ai.alimebot.taobao.com/intl/index.htm?from=ggxyKH67aq&amp;sourceType=SUPERME");
        sDefaultMenuUrls.put(R.id.uik_menu_home, "http://m.taobao.com/index.htm");
        sDefaultMenuUrls.put(R.id.uik_menu_mytaobao, "https://h5.m.taobao.com/awp/mtb/mtb.htm");
        sDefaultMenuUrls.put(R.id.uit_menu_shopping_cart, "https://main.m.taobao.com/cart/index.html?hasback=true");
        sDefaultMenuUrls.put(R.id.uik_menu_footpoint, "https://web.m.taobao.com/app/message-social-front/footprint/home?wh_weex=true&weex_mode=dom&wx_navbar_hidden=true&wx_statusbar_hidden=true");
        sDefaultMenuUrls.put(R.id.uik_menu_feedback, "https://market.m.taobao.com/app/motu/emas-mpop-tucaobar/web/index.html#/?x=1");
        sDefaultMenuUrls.put(R.id.uik_menu_report, "https://market.m.taobao.com/app/msd/buyer-aqcenter/index.html?source=271#/report-center/");
        initMenuItems();
    }

    private static void initMenuItems() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94f7b678", new Object[0]);
            return;
        }
        sDefaultPublicMenus.clear();
        sDefaultExtraMenus.clear();
        TBPublicMenuItem.Builder builder = new TBPublicMenuItem.Builder();
        builder.setTitle("ꂊ:" + b.a(R.string.app_message)).setMessageMode(TBPublicMenuItem.MessageMode.NONE).setUTControlName(nyk.KEY_SHARE_CONFIG_WANGXIN).setOrder(2).setNavUrl(NavUrls.NAV_URL_MSG_CENTER_CATEGORY).setNeedLogin(true).setName(nyk.KEY_SHARE_CONFIG_WANGXIN).setId(R.id.uik_menu_wangxin);
        TBPublicMenuItem build = builder.build();
        if (build != null) {
            sDefaultPublicMenus.add(build);
        }
        TBPublicMenuItem.Builder builder2 = new TBPublicMenuItem.Builder();
        builder2.setTitle("ꀚ:" + b.a(R.string.taobao_app_1012_1_16470)).setMessageMode(TBPublicMenuItem.MessageMode.NONE).setUTControlName("Home").setName("Home").setOrder(3).setNavUrl("http://m.taobao.com/index.htm").setNeedLogin(false).setId(R.id.uik_menu_home);
        TBPublicMenuItem build2 = builder2.build();
        if (build2 != null) {
            sDefaultPublicMenus.add(build2);
        }
        TBPublicMenuItem.Builder builder3 = new TBPublicMenuItem.Builder();
        builder3.setTitle("ꁚ:" + b.a(R.string.taobao_app_1012_1_16463)).setMessageMode(TBPublicMenuItem.MessageMode.NONE).setUTControlName("Mytaobao").setOrder(4).setName("Mytaobao").setNavUrl("https://h5.m.taobao.com/awp/mtb/mtb.htm").setNeedLogin(true).setId(R.id.uik_menu_mytaobao);
        TBPublicMenuItem build3 = builder3.build();
        if (build3 != null) {
            sDefaultPublicMenus.add(build3);
        }
        TBPublicMenuItem.Builder builder4 = new TBPublicMenuItem.Builder();
        builder4.setTitle("ꁊ:" + b.a(R.string.app_cart)).setMessageMode(TBPublicMenuItem.MessageMode.NONE).setUTControlName("ShoppingCart").setName("ShoppingCart").setOrder(5).setNavUrl("https://main.m.taobao.com/cart/index.html?hasback=true").setNeedLogin(true).setId(R.id.uit_menu_shopping_cart);
        TBPublicMenuItem build4 = builder4.build();
        if (build3 != null) {
            sDefaultPublicMenus.add(build4);
        }
        TBPublicMenuItem.Builder builder5 = new TBPublicMenuItem.Builder();
        builder5.setTitle("錄:" + b.a(R.string.taobao_app_1012_1_16464)).setMessageMode(TBPublicMenuItem.MessageMode.NONE).setUTControlName(cts.a.BIZ_ORDER_LIST).setName(cts.a.BIZ_ORDER_LIST).setOrder(6).setNavUrl("http://tm.m.taobao.com/list.htm?OrderListType=total_orders").setNeedLogin(true).setId(R.id.uik_menu_orderList);
        TBPublicMenuItem build5 = builder5.build();
        if (build5 != null) {
            sDefaultPublicMenus.add(build5);
        }
        TBPublicMenuItem.Builder builder6 = new TBPublicMenuItem.Builder();
        builder6.setTitle("녊:" + b.a(R.string.taobao_app_1012_1_16465)).setMessageMode(TBPublicMenuItem.MessageMode.NONE).setUTControlName("FootPoint").setName("FootPoint").setOrder(7).setNavUrl("https://web.m.taobao.com/app/message-social-front/footprint/home?wh_weex=true&weex_mode=dom&wx_navbar_hidden=true&wx_statusbar_hidden=true").setNeedLogin(true).setId(R.id.uik_menu_footpoint);
        TBPublicMenuItem build6 = builder6.build();
        if (build6 != null) {
            sDefaultPublicMenus.add(build6);
        }
        TBPublicMenuItem.Builder builder7 = new TBPublicMenuItem.Builder();
        builder7.setTitle("떊:" + b.a(R.string.taobao_app_1012_1_16461)).setMessageMode(TBPublicMenuItem.MessageMode.TEXT).setUTControlName("help").setName("help").setOrder(1).setNavUrl(sDefaultMenuUrls.get(R.id.uik_menu_service)).setNeedLogin(true).setSource(1).setId(R.id.uik_menu_service);
        TBPublicMenuItem build7 = builder7.build();
        if (build7 != null) {
            sDefaultExtraMenus.add(build7);
        }
        TBPublicMenuItem.Builder builder8 = new TBPublicMenuItem.Builder();
        builder8.setTitle("\uf87a:" + b.a(R.string.taobao_app_1012_1_16467)).setMessageMode(TBPublicMenuItem.MessageMode.NONE).setUTControlName("feedback").setName("feedback").setOrder(2).setNavUrl(sDefaultMenuUrls.get(R.id.uik_menu_feedback)).setNeedLogin(true).setSource(1).setId(R.id.uik_menu_feedback);
        TBPublicMenuItem build8 = builder8.build();
        if (build8 != null) {
            sDefaultExtraMenus.add(build8);
        }
        TBPublicMenuItem.Builder builder9 = new TBPublicMenuItem.Builder();
        builder9.setTitle("킊:" + b.a(R.string.taobao_app_1012_1_16460)).setMessageMode(TBPublicMenuItem.MessageMode.NONE).setUTControlName("report").setName("report").setOrder(3).setNavUrl(sDefaultMenuUrls.get(R.id.uik_menu_report)).setNeedLogin(true).setSource(1).setId(R.id.uik_menu_report);
        TBPublicMenuItem build9 = builder9.build();
        if (build9 == null) {
            return;
        }
        sDefaultExtraMenus.add(build9);
    }

    private void try2SetItemUrl(Context context, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2e8ef50", new Object[]{this, context, new Integer(i), new Integer(i2)});
            return;
        }
        try {
            TBPublicMenuItem extraMenuById = getExtraMenuById(i);
            if (extraMenuById != null) {
                extraMenuById.setNavUrl(context.getString(i2));
            } else {
                MenuLog.block(TAG, "item is null");
            }
        } catch (Resources.NotFoundException unused) {
            MenuLog.block(TAG, "Can't get string in this context.");
        }
    }

    private void initExternalMenu(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("786f4667", new Object[]{this, context});
            return;
        }
        try2SetItemUrl(context, R.id.uik_menu_service, R.string.zh_helper_url);
        try2SetItemUrl(context, R.id.uik_menu_feedback, R.string.appcompat_feedback_url);
        try2SetItemUrl(context, R.id.uik_menu_report, R.string.uik_menu_report_url_online_new);
    }

    public void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
        } else if (this.isInit) {
        } else {
            this.mDefaultPublicMenus = sDefaultPublicMenus;
            initExternalMenu(context);
            b.a(new LocalizationChangeListener());
            this.isInit = true;
        }
    }

    public TBPublicMenuItem getItemFromList(List<TBPublicMenuItem> list, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBPublicMenuItem) ipChange.ipc$dispatch("2cb43db0", new Object[]{this, list, new Integer(i)});
        }
        for (TBPublicMenuItem tBPublicMenuItem : list) {
            if (tBPublicMenuItem != null && tBPublicMenuItem.getId() == i) {
                return tBPublicMenuItem;
            }
        }
        return null;
    }

    public TBPublicMenuItem getPublicMenu(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBPublicMenuItem) ipChange.ipc$dispatch("f37b4d54", new Object[]{this, new Integer(i)}) : getItemFromList(this.mDefaultPublicMenus, i);
    }

    public TBPublicMenuItem getExtraMenuById(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBPublicMenuItem) ipChange.ipc$dispatch("bdd2e07", new Object[]{this, new Integer(i)});
        }
        for (TBPublicMenuItem tBPublicMenuItem : sDefaultExtraMenus) {
            if (tBPublicMenuItem != null && tBPublicMenuItem.getId() == i) {
                return tBPublicMenuItem;
            }
        }
        return null;
    }

    public TBPublicMenuItem getExtraMenuByType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBPublicMenuItem) ipChange.ipc$dispatch("664d7a91", new Object[]{this, str});
        }
        for (TBPublicMenuItem tBPublicMenuItem : sDefaultExtraMenus) {
            if (tBPublicMenuItem != null && StringUtils.equals(tBPublicMenuItem.getName(), str)) {
                return tBPublicMenuItem;
            }
        }
        return null;
    }

    public void addCustomMenus(List<TBPublicMenuItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2a1491a", new Object[]{this, list});
        } else {
            this.mCustomMenus.addAll(list);
        }
    }

    public void addCustomMenu(TBPublicMenuItem tBPublicMenuItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57ae786e", new Object[]{this, tBPublicMenuItem});
        } else {
            this.mCustomMenus.add(tBPublicMenuItem);
        }
    }

    public void addShareMenus(List<TBPublicMenuItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c25a064e", new Object[]{this, list});
        } else {
            this.mShareMenus.addAll(list);
        }
    }

    public List<TBPublicMenuItem> getDefaultPublicMenus() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("c1f6efe0", new Object[]{this}) : this.mDefaultPublicMenus;
    }

    public List<TBPublicMenuItem> getCustomMenus() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("6eb198f3", new Object[]{this}) : this.mCustomMenus;
    }

    public List<TBPublicMenuItem> getShareMenus() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("921c3ab5", new Object[]{this}) : this.mShareMenus;
    }

    public void cleanShareMenus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34af0b05", new Object[]{this});
        } else {
            this.mShareMenus.clear();
        }
    }

    public void cleanExternMenus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f96ffc32", new Object[]{this});
        } else {
            this.mCustomMenus.clear();
        }
    }

    public void clearExternalCustomiseItems() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73be1755", new Object[]{this});
            return;
        }
        Iterator<TBPublicMenuItem> it = this.mCustomMenus.iterator();
        while (it.hasNext()) {
            TBPublicMenuItem next = it.next();
            if (next != null && !next.isAddByUikit()) {
                it.remove();
            }
        }
    }

    public void removeExtraMenuItemByType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("263c4a40", new Object[]{this, str});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            Iterator<TBPublicMenuItem> it = this.mCustomMenus.iterator();
            while (it.hasNext()) {
                TBPublicMenuItem next = it.next();
                if (str.equals(next.getName()) && next.isAddByUikit()) {
                    it.remove();
                }
            }
        }
    }

    public void resetDefaultMenusUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfa683f4", new Object[]{this});
            return;
        }
        for (TBPublicMenuItem tBPublicMenuItem : this.mDefaultPublicMenus) {
            String str = sDefaultMenuUrls.get(tBPublicMenuItem.getId());
            if (!StringUtils.isEmpty(str)) {
                tBPublicMenuItem.setNavUrl(str);
            }
        }
    }

    public String getMenuIdentifies() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("216deffa", new Object[]{this}) : this.menuIdentifies;
    }

    public void setMenuIdentifies() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea93f72", new Object[]{this});
        } else {
            this.menuIdentifies = String.valueOf(System.currentTimeMillis());
        }
    }

    public void setMenuIdentifies(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d1c30bc", new Object[]{this, str});
        } else {
            this.menuIdentifies = str;
        }
    }

    /* loaded from: classes9.dex */
    public static class LocalizationChangeListener implements b.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1424805871);
            kge.a(-37303655);
        }

        private LocalizationChangeListener() {
        }

        @Override // com.alibaba.ability.localization.b.a
        public void a(Language language, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("246661b", new Object[]{this, language, str});
            } else {
                TBPublicMenuData.access$100();
            }
        }
    }
}
