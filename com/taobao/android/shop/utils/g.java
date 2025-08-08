package com.taobao.android.shop.utils;

import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.shop.activity.ShopRenderActivity;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes6.dex */
public class g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(483188422);
    }

    public static Map<String, String> a(String str, boolean z) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("573ccb97", new Object[]{str, new Boolean(z)});
        }
        HashMap hashMap = new HashMap();
        if (StringUtils.isEmpty(str)) {
            return hashMap;
        }
        if (z) {
            try {
                str = URLDecoder.decode(str, "UTF-8");
            } catch (UnsupportedEncodingException unused) {
            }
        }
        try {
            split = str.split("\\?");
        } catch (Exception e) {
            Log.e("URLUtils", "parse URL param error " + e.getMessage());
        }
        if (split.length < 2) {
            return hashMap;
        }
        for (String str2 : split[1].split("&")) {
            String[] split2 = str2.split("=");
            if (split2.length >= 2) {
                hashMap.put(split2[0], split2[1]);
            }
        }
        return hashMap;
    }

    public static Map<String, String> a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("bf3e1ee7", new Object[]{str}) : a(str, false);
    }

    public static Map<String, String> b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d2e5f268", new Object[]{str});
        }
        if (str != null) {
            return a(str);
        }
        return null;
    }

    public static boolean c(String str) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88097eb8", new Object[]{str})).booleanValue();
        }
        try {
            Map<String, String> b = b(str);
            if (b == null) {
                return false;
            }
            String str2 = "";
            String str3 = b.containsKey("weexShopSubTab") ? b.get("weexShopSubTab") : str2;
            String str4 = b.containsKey("weexShopTab") ? b.get("weexShopTab") : str2;
            if (b.containsKey(ShopRenderActivity.SHOP_NAVI)) {
                str2 = b.get(ShopRenderActivity.SHOP_NAVI);
            }
            if (!StringUtils.isEmpty(str2) && !com.alibaba.triver.triver_shop.newShop.ext.g.KEY_SHOP_INDEX.equals(str2)) {
                z = false;
            }
            if (!StringUtils.isEmpty(str3) || !StringUtils.isEmpty(str4)) {
                if (!com.alibaba.triver.triver_shop.newShop.ext.g.KEY_SHOP_INDEX_BAR.equals(str4)) {
                    return false;
                }
                if (!com.alibaba.triver.triver_shop.newShop.ext.g.KEY_SHOP_INDEX.equals(str3)) {
                    return false;
                }
            }
            return z;
        } catch (Exception unused) {
            return false;
        }
    }
}
