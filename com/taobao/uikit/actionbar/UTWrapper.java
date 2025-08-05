package com.taobao.uikit.actionbar;

import com.alibaba.ability.localization.b;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.uikit.actionbar.util.Tools;
import com.taobao.weex.common.Constants;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTHitBuilders;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import com.ut.mini.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import tb.kge;

/* loaded from: classes9.dex */
public class UTWrapper {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static boolean closeByButton;
    private static int suffix;

    static {
        kge.a(-2020279582);
        suffix = 0;
        closeByButton = false;
    }

    public static void menuExposure(TBPublicMenu tBPublicMenu) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6879378c", new Object[]{tBPublicMenu});
            return;
        }
        JSONArray jSONArray = new JSONArray();
        int size = TBPublicMenu.sPublicMenus.size();
        for (int i = 0; i < size; i++) {
            String subTitle = Tools.subTitle(TBPublicMenu.sPublicMenus.get(i).getTitle());
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("title", (Object) subTitle);
            jSONObject.put("index", (Object) Integer.valueOf(i));
            jSONArray.add(jSONObject);
        }
        ArrayList<TBPublicMenuItem> arrayList = tBPublicMenu.mExtraMenus;
        if (arrayList != null && arrayList.size() > 0) {
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                String subTitle2 = Tools.subTitle(arrayList.get(i2).getTitle());
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("title", (Object) subTitle2);
                jSONObject2.put("index", (Object) Integer.valueOf(i2 + size));
                jSONArray.add(jSONObject2);
            }
        }
        HashMap hashMap = new HashMap();
        hashMap.put("popoverItem", jSONArray.toJSONString());
        hashMap.put(Constants.Name.SUFFIX, String.valueOf(getSuffix()));
        String currentPageName = l.getInstance().getCurrentPageName();
        if (currentPageName == null) {
            return;
        }
        UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(currentPageName, 2201, "MorePopoverExposure", null, null, hashMap).build());
    }

    public static void newMenuExposure(TBPublicMenuData tBPublicMenuData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfd66fc2", new Object[]{tBPublicMenuData});
        } else if (tBPublicMenuData != null) {
            JSONArray jSONArray = new JSONArray();
            List<TBPublicMenuItem> defaultPublicMenus = tBPublicMenuData.getDefaultPublicMenus();
            if (defaultPublicMenus == null) {
                return;
            }
            int size = defaultPublicMenus.size();
            for (int i = 0; i < size; i++) {
                String subTitle = Tools.subTitle(defaultPublicMenus.get(i).mTitle);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("title", (Object) subTitle);
                jSONObject.put("index", (Object) Integer.valueOf(i));
                jSONArray.add(jSONObject);
            }
            HashMap hashMap = new HashMap();
            hashMap.put("popoverItem", jSONArray.toJSONString());
            hashMap.put("is_NEW", "true");
            String currentPageName = l.getInstance().getCurrentPageName();
            if (currentPageName != null) {
                UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(currentPageName, 2201, "MorePopoverExposure", null, null, hashMap).build());
            }
            JSONArray jSONArray2 = new JSONArray();
            ArrayList arrayList = new ArrayList(tBPublicMenuData.getCustomMenus());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                TBPublicMenuItem tBPublicMenuItem = (TBPublicMenuItem) it.next();
                if (b.a(R.string.app_share).equals(Tools.subTitle(tBPublicMenuItem.getTitle())) || b.a(R.string.taobao_app_1012_1_16460).equals(Tools.subTitle(tBPublicMenuItem.getTitle()))) {
                    it.remove();
                }
            }
            if (arrayList.size() == 0) {
                return;
            }
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                String subTitle2 = Tools.subTitle(((TBPublicMenuItem) arrayList.get(i2)).getTitle());
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("title", (Object) subTitle2);
                jSONObject2.put("index", (Object) Integer.valueOf(i2));
                jSONArray2.add(jSONObject2);
            }
            if (jSONArray2.size() <= 0) {
                return;
            }
            HashMap hashMap2 = new HashMap();
            hashMap2.put("popoverItem", jSONArray2.toJSONString());
            hashMap2.put(Constants.Name.SUFFIX, String.valueOf(getSuffix()));
            hashMap2.put("is_NEW", "true");
            if (currentPageName == null) {
                return;
            }
            UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(currentPageName, 2201, "MorePopoverExposureCustom", null, null, hashMap2).build());
        }
    }

    public static void itemClick(TBPublicMenuItem tBPublicMenuItem, TBPublicMenu tBPublicMenu) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce94a68f", new Object[]{tBPublicMenuItem, tBPublicMenu});
        } else {
            itemClick(tBPublicMenuItem, tBPublicMenu, false);
        }
    }

    public static void itemClick(TBPublicMenuItem tBPublicMenuItem, TBPublicMenu tBPublicMenu, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("400de25", new Object[]{tBPublicMenuItem, tBPublicMenu, new Boolean(z)});
            return;
        }
        String subTitle = Tools.subTitle(tBPublicMenuItem.getTitle());
        int itemIndex = getItemIndex(tBPublicMenuItem, tBPublicMenu);
        String currentPageName = l.getInstance().getCurrentPageName();
        if (currentPageName == null) {
            return;
        }
        UTHitBuilders.UTControlHitBuilder uTControlHitBuilder = new UTHitBuilders.UTControlHitBuilder(currentPageName, z ? "Button-More-Item-Click-Custom" : "Button-More-Item-Click");
        uTControlHitBuilder.setProperty("title", subTitle);
        uTControlHitBuilder.setProperty("index", String.valueOf(itemIndex));
        UTAnalytics.getInstance().getDefaultTracker().send(uTControlHitBuilder.build());
    }

    public static void menuDismiss() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70fcb332", new Object[0]);
        } else if (closeByButton) {
            closeByButton = false;
        } else {
            String currentPageName = l.getInstance().getCurrentPageName();
            if (currentPageName == null) {
                return;
            }
            UTAnalytics.getInstance().getDefaultTracker().send(new UTHitBuilders.UTControlHitBuilder(currentPageName, "Button-More-Close").build());
        }
    }

    public static void overflowClick() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61eb142d", new Object[0]);
            return;
        }
        String currentPageName = l.getInstance().getCurrentPageName();
        if (currentPageName == null) {
            return;
        }
        UTAnalytics.getInstance().getDefaultTracker().send(new UTHitBuilders.UTControlHitBuilder(currentPageName, "Button-More").build());
    }

    private static int getItemIndex(TBPublicMenuItem tBPublicMenuItem, TBPublicMenu tBPublicMenu) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("79ad8a16", new Object[]{tBPublicMenuItem, tBPublicMenu})).intValue();
        }
        PublicMenuPresenter presentar = tBPublicMenu.getPresentar();
        List<TBPublicMenuItem> defaultPublicMenus = presentar.getMenuData().getDefaultPublicMenus();
        for (int i = 0; i < defaultPublicMenus.size(); i++) {
            if (tBPublicMenuItem == defaultPublicMenus.get(i)) {
                return i;
            }
        }
        ArrayList arrayList = new ArrayList(presentar.getMenuData().getCustomMenus());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            TBPublicMenuItem tBPublicMenuItem2 = (TBPublicMenuItem) it.next();
            if (b.a(R.string.app_share).equals(Tools.subTitle(tBPublicMenuItem2.getTitle())) || b.a(R.string.taobao_app_1012_1_16460).equals(Tools.subTitle(tBPublicMenuItem2.getTitle()))) {
                it.remove();
            }
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            if (tBPublicMenuItem == arrayList.get(i2)) {
                return i2;
            }
        }
        return -1;
    }

    private static int getSuffix() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9fd62341", new Object[0])).intValue();
        }
        int i = suffix;
        if (i < Integer.MAX_VALUE) {
            suffix = i + 1;
            return i;
        }
        suffix = 0;
        return 0;
    }
}
