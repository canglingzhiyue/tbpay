package com.alibaba.triver.triver_shop.container.shopLoft;

import com.alibaba.triver.triver_shop.container.shopLoft.newStyle.ShopLoftGraphicView;
import com.alibaba.triver.triver_shop.container.shopLoft.newStyle.ShopLoftNewVideoViewWithDW;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.controller2.s;
import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.kge;
import tb.sqb;

/* loaded from: classes3.dex */
public class ShopLoftViewManager implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static String TYPE_GRAPHIC;
    public static String TYPE_LIVE;
    public static String TYPE_LIVE_CARD;
    public static String TYPE_MARKET;
    public static String TYPE_MARKET_VIDEO;
    public static String TYPE_MINI_CARD_LIVE;
    public static String TYPE_MINI_CARD_VIDEO;
    public static String TYPE_NEW_DETAIL;
    public static String TYPE_NEW_VIDEO;
    public static String TYPE_SHOP_2023_LIVE;
    public static String TYPE_SHOP_2023_LIVE_NEW;
    public static String TYPE_VIDEO;
    private static Map<String, Class<? extends b>> shopLoftViewClassMap;

    static {
        kge.a(1473209423);
        kge.a(1028243835);
        TYPE_NEW_VIDEO = "newVideo";
        TYPE_GRAPHIC = "graphic";
        TYPE_VIDEO = "video";
        TYPE_LIVE = "live";
        TYPE_MARKET = "market";
        TYPE_MARKET_VIDEO = "market_video";
        TYPE_MINI_CARD_VIDEO = "mini_video";
        TYPE_MINI_CARD_LIVE = "mini_live";
        TYPE_LIVE_CARD = "liveCard";
        TYPE_NEW_DETAIL = "newDetail";
        TYPE_SHOP_2023_LIVE = "live2023";
        TYPE_SHOP_2023_LIVE_NEW = "live2023new";
        shopLoftViewClassMap = new ConcurrentHashMap();
        registerShopLoftView(TYPE_MINI_CARD_VIDEO, MiniVideoLoftView.class);
        registerShopLoftView(TYPE_MARKET, c.class);
        registerShopLoftView(TYPE_MARKET_VIDEO, d.class);
        registerShopLoftView(TYPE_LIVE_CARD, i.class);
        registerShopLoftView(TYPE_NEW_DETAIL, ShopLoftNewDetailView.class);
        registerShopLoftView(TYPE_NEW_VIDEO, ShopLoftNewVideoViewWithDW.class);
        registerShopLoftView(TYPE_GRAPHIC, ShopLoftGraphicView.class);
        registerShopLoftView(TYPE_SHOP_2023_LIVE, h.class);
        registerShopLoftView(TYPE_SHOP_2023_LIVE_NEW, k.class);
        try {
            registerShopLoftView(TYPE_LIVE, Class.forName("com.taobao.taolive.room.controller2.TaoLiveShopSingleRoomController"));
        } catch (Throwable th) {
            th.printStackTrace();
        }
        try {
            registerShopLoftView(TYPE_VIDEO, sqb.g());
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        try {
            registerShopLoftView(TYPE_MINI_CARD_LIVE, com.alibaba.triver.triver_shop.newShop.ext.b.d("com.taobao.taolive.room.controller2.TaoLiveShopCardController"));
        } catch (Throwable th3) {
            th3.printStackTrace();
        }
    }

    public static void registerShopLoftView(String str, Class<? extends b> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("122176bd", new Object[]{str, cls});
        } else if (str == null || cls == null) {
        } else {
            shopLoftViewClassMap.put(str, cls);
        }
    }

    public static Class<? extends b> getShopLoftViewClassByType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("c6d08b05", new Object[]{str});
        }
        if (str != null) {
            return shopLoftViewClassMap.get(str);
        }
        return null;
    }

    public static b createShopLoftViewByType(String str) {
        if (TYPE_LIVE.equals(str)) {
            return s.a();
        }
        Class<? extends b> shopLoftViewClassByType = getShopLoftViewClassByType(str);
        if (shopLoftViewClassByType == null) {
            return null;
        }
        try {
            return shopLoftViewClassByType.getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static String getTypeFromSceneId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b85fcfa2", new Object[]{str});
        }
        if (str == null) {
            return null;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case 53617:
                if (str.equals("661")) {
                    c = 3;
                    break;
                }
                break;
            case 53619:
                if (str.equals("663")) {
                    c = 0;
                    break;
                }
                break;
            case 53622:
                if (str.equals("666")) {
                    c = 1;
                    break;
                }
                break;
            case 53623:
                if (str.equals("667")) {
                    c = 2;
                    break;
                }
                break;
            case 54391:
                if (str.equals("700")) {
                    c = 4;
                    break;
                }
                break;
            case 55352:
                if (str.equals("800")) {
                    c = 5;
                    break;
                }
                break;
        }
        if (c == 0) {
            return TYPE_VIDEO;
        }
        if (c == 1) {
            return TYPE_MARKET;
        }
        if (c == 2) {
            return TYPE_LIVE;
        }
        if (c == 3) {
            return TYPE_NEW_DETAIL;
        }
        if (c == 4) {
            return TYPE_NEW_VIDEO;
        }
        if (c == 5) {
            return TYPE_GRAPHIC;
        }
        return null;
    }

    public static boolean isVideoType(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8b40c4a0", new Object[]{str})).booleanValue() : TYPE_VIDEO.equals(getTypeFromSceneId(str));
    }

    public static boolean isMarketType(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7c6348f5", new Object[]{str})).booleanValue() : TYPE_MARKET.equals(getTypeFromSceneId(str));
    }

    public static boolean isNewShopLoftStyleType(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("686f5943", new Object[]{str})).booleanValue() : TYPE_GRAPHIC.equals(str) || TYPE_NEW_VIDEO.equals(str);
    }
}
