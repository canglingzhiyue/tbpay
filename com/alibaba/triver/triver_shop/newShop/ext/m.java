package com.alibaba.triver.triver_shop.newShop.ext;

import android.content.Context;
import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import com.alibaba.ariver.kernel.common.utils.JSONUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.security.realidentity.v2;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.shop.common.ShopConstants;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTTracker;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.HashMap;
import java.util.Map;
import kotlin.Result;
import kotlin.collections.ai;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.ceg;
import tb.kge;

/* loaded from: classes3.dex */
public final class m {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CUSTOM_ADVANCE = "customAdvance";
    public static final String GET_PAGE_ALL_PROPERTIES = "getPageAllProperties";
    public static final String GET_PAGE_SPM_PRE = "getPageSpmPre";
    public static final String GET_PAGE_SPM_URL = "getPageSpmUrl";
    public static final String PAGE_APPEAR = "pageAppear";
    public static final String PAGE_DISAPPEAR = "pageDisappear";
    public static final String SKIP_PAGE = "skipPage";
    public static final String UPDATE_NEXT_PAGE_PROPERTIES = "updateNextPageProperties";
    public static final String UPDATE_NEXT_PAGE_UTPARAM = "updateNextPageUtparam";
    public static final String UPDATE_PAGEURL = "updatePageUrl";
    public static final String UPDATE_PAGE_NAME = "updatePageName";
    public static final String UPDATE_PAGE_PROPERTIES = "updatePageProperties";
    public static final String UPDATE_PAGE_UTPARAM = "updatePageUtparam";
    public static final String UPDATE_SESSION_PROPERTY = "updateSessionProperties";

    static {
        kge.a(-497791597);
    }

    public static final void a(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84162689", new Object[]{str, str2, map});
            return;
        }
        try {
            Result.a aVar = Result.Companion;
            UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(str, 2101, str2, null, null, map).build());
            Result.m2371constructorimpl(t.INSTANCE);
        } catch (Throwable th) {
            Result.a aVar2 = Result.Companion;
            Result.m2371constructorimpl(kotlin.i.a(th));
        }
    }

    public static final void a(Context context, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8df32b25", new Object[]{context, map});
            return;
        }
        q.d(context, "<this>");
        UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(context, map);
    }

    public static /* synthetic */ void a(com.alibaba.triver.triver_shop.newShop.data.d dVar, String str, Map map, String str2, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5c55eb3", new Object[]{dVar, str, map, str2, new Integer(i), obj});
            return;
        }
        if ((i & 8) != 0) {
            str2 = null;
        }
        a(dVar, str, map, str2);
    }

    public static final void a(com.alibaba.triver.triver_shop.newShop.data.d shopDataParser, String str, Map<String, String> map, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bac669ec", new Object[]{shopDataParser, str, map, str2});
            return;
        }
        q.d(shopDataParser, "shopDataParser");
        HashMap<String, String> J = shopDataParser.J();
        HashMap<String, String> hashMap = J;
        hashMap.put("dx_shop", "1");
        hashMap.put("shop_id", shopDataParser.T());
        hashMap.put("seller_id", shopDataParser.U());
        hashMap.put("miniapp_shop", "1");
        if (shopDataParser.s()) {
            hashMap.put("is2022Style", "1");
            hashMap.put("uiType", v2.d);
        }
        hashMap.put("identityCode", shopDataParser.ba());
        if (map != null) {
            J.putAll(map);
        }
        if (str2 == null) {
            str2 = ShopConstants.PAGE_SHOP;
        }
        a(str2, str, hashMap);
    }

    public static /* synthetic */ void a(String str, String str2, Map map, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bc49af6", new Object[]{str, str2, map, new Integer(i), obj});
            return;
        }
        if ((i & 4) != 0) {
            map = null;
        }
        b(str, str2, map);
    }

    public static final void b(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("854c7968", new Object[]{str, str2, map});
            return;
        }
        try {
            Result.a aVar = Result.Companion;
            UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(str, 2201, str2, null, null, map).build());
            Result.m2371constructorimpl(t.INSTANCE);
        } catch (Throwable th) {
            Result.a aVar2 = Result.Companion;
            Result.m2371constructorimpl(kotlin.i.a(th));
        }
    }

    public static final void a(com.alibaba.triver.triver_shop.newShop.data.d shopDataParser, String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("840064a2", new Object[]{shopDataParser, str, map});
            return;
        }
        q.d(shopDataParser, "shopDataParser");
        HashMap<String, String> J = shopDataParser.J();
        HashMap<String, String> hashMap = J;
        hashMap.put("dx_shop", "1");
        hashMap.put("shop_id", shopDataParser.T());
        hashMap.put("seller_id", shopDataParser.U());
        hashMap.put("miniapp_shop", "1");
        if (shopDataParser.s()) {
            hashMap.put("is2022Style", "1");
            hashMap.put("uiType", v2.d);
        }
        hashMap.put("identityCode", shopDataParser.ba());
        if (map != null) {
            J.putAll(map);
        }
        b(ShopConstants.PAGE_SHOP, str, hashMap);
    }

    public static final void a(Context context, String str, Map<String, ? extends Object> map, String str2) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b99c525", new Object[]{context, str, map, str2});
            return;
        }
        if (context != null && b.c(context)) {
            z = true;
        }
        if (z || StringUtils.isEmpty(str)) {
            return;
        }
        if (q.a((Object) PAGE_APPEAR, (Object) str)) {
            ceg.Companion.b(q.a("behavior appear : ", (Object) str2));
            UTAnalytics.getInstance().getDefaultTracker().pageAppearDonotSkip(context);
        } else if (q.a((Object) PAGE_DISAPPEAR, (Object) str)) {
            ceg.Companion.b(q.a("behavior disAppear : ", (Object) str2));
            UTAnalytics.getInstance().getDefaultTracker().pageDisAppear(context);
        } else if (q.a((Object) SKIP_PAGE, (Object) str)) {
            UTAnalytics.getInstance().getDefaultTracker().skipPage(context);
        } else {
            Object obj = null;
            Integer num = null;
            Object obj2 = null;
            if (q.a((Object) CUSTOM_ADVANCE, (Object) str)) {
                if (map == null) {
                    return;
                }
                String str3 = (String) map.get("eventId");
                if (str3 != null) {
                    num = kotlin.text.n.d(str3);
                }
                if (num == null) {
                    return;
                }
                UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder((String) map.get("pageName"), num.intValue(), (String) map.get("arg1"), (String) map.get("arg2"), (String) map.get("arg3"), JSONUtils.jsonToMap((JSONObject) map.get("args"), new HashMap())).build());
            } else if (q.a((Object) "updatePageName", (Object) str)) {
                UTTracker defaultTracker = UTAnalytics.getInstance().getDefaultTracker();
                if (map != null) {
                    obj2 = map.get("pageName");
                }
                defaultTracker.updatePageName(context, (String) obj2);
            } else if (q.a((Object) UPDATE_PAGEURL, (Object) str)) {
                UTTracker defaultTracker2 = UTAnalytics.getInstance().getDefaultTracker();
                if (map != null) {
                    obj = map.get("pageUrl");
                }
                defaultTracker2.updatePageUrl(context, Uri.parse((String) obj));
            } else if (q.a((Object) UPDATE_PAGE_PROPERTIES, (Object) str)) {
                UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(context, b.c(map));
            } else if (q.a((Object) UPDATE_NEXT_PAGE_PROPERTIES, (Object) str)) {
                UTAnalytics.getInstance().getDefaultTracker().updateNextPageProperties(b.c(map));
            } else if (q.a((Object) UPDATE_PAGE_UTPARAM, (Object) str)) {
                UTAnalytics.getInstance().getDefaultTracker().updatePageUtparam(context, JSON.toJSONString(map));
            } else if (!q.a((Object) "updateNextPageUtparam", (Object) str)) {
            } else {
                UTAnalytics.getInstance().getDefaultTracker().updateNextPageUtparam(JSON.toJSONString(map));
            }
        }
    }

    public static final void a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b6362a", new Object[]{context, str});
            return;
        }
        q.d(context, "<this>");
        UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(context, ai.c(kotlin.j.a("spm-cnt", str)));
    }

    public static final void a(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d18de974", new Object[]{context, str, str2});
            return;
        }
        q.d(context, "<this>");
        a(context, str);
        UTAnalytics.getInstance().getDefaultTracker().updatePageName(context, str2);
    }

    public static final void b(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bbd7193", new Object[]{context, str, str2});
            return;
        }
        q.d(context, "<this>");
        UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(context, ai.c(kotlin.j.a(str, str2)));
    }

    public static final void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
            return;
        }
        q.d(context, "<this>");
        a(context, "a2141.7631565");
        UTAnalytics.getInstance().getDefaultTracker().updatePageName(context, ShopConstants.PAGE_SHOP);
    }

    public static final void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eca0fff", new Object[]{context});
            return;
        }
        q.d(context, "<this>");
        a(context, "a2141.7631671");
        UTAnalytics.getInstance().getDefaultTracker().updatePageName(context, "Page_Shop_All_Item");
    }

    public static final void a(Context context, com.alibaba.triver.triver_shop.newShop.data.d shopDataParser) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d4f3c01", new Object[]{context, shopDataParser});
            return;
        }
        q.d(context, "<this>");
        q.d(shopDataParser, "shopDataParser");
        UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(context, ai.c(kotlin.j.a("industryShop", shopDataParser.as())));
    }

    public static /* synthetic */ void a(com.alibaba.triver.triver_shop.newShop.data.d dVar, String str, Map map, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0538c3d", new Object[]{dVar, str, map, new Integer(i), obj});
            return;
        }
        if ((i & 2) != 0) {
            map = null;
        }
        b(dVar, str, map);
    }

    public static final void b(com.alibaba.triver.triver_shop.newShop.data.d dVar, String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3becd223", new Object[]{dVar, str, map});
            return;
        }
        q.d(dVar, "<this>");
        String str2 = str;
        if (str2 != null && str2.length() != 0) {
            z = false;
        }
        if (z) {
            return;
        }
        b(ShopConstants.PAGE_SHOP, str, a(dVar, map));
    }

    public static /* synthetic */ void b(com.alibaba.triver.triver_shop.newShop.data.d dVar, String str, Map map, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19bb051c", new Object[]{dVar, str, map, new Integer(i), obj});
            return;
        }
        if ((i & 2) != 0) {
            map = null;
        }
        c(dVar, str, map);
    }

    public static final void c(com.alibaba.triver.triver_shop.newShop.data.d dVar, String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3d93fa4", new Object[]{dVar, str, map});
            return;
        }
        q.d(dVar, "<this>");
        String str2 = str;
        if (str2 != null && str2.length() != 0) {
            z = false;
        }
        if (z) {
            return;
        }
        b(ShopConstants.PAGE_SHOP, str, a(dVar, map));
    }

    public static final HashMap<String, String> a(com.alibaba.triver.triver_shop.newShop.data.d dVar, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("642d9cf", new Object[]{dVar, map});
        }
        q.d(dVar, "<this>");
        HashMap<String, String> J = dVar.J();
        HashMap<String, String> hashMap = J;
        hashMap.put("shop_id", dVar.T());
        hashMap.put("seller_id", dVar.U());
        hashMap.put("identityCode", dVar.ba());
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                hashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return J;
    }
}
