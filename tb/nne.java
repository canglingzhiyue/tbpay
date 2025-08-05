package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.util.a;
import com.taobao.orange.OrangeConfig;
import com.taobao.search.common.dynamic.bean.SearchDomBean;
import com.taobao.search.common.util.q;
import com.taobao.search.common.util.r;
import com.taobao.search.mmd.util.h;
import com.taobao.tao.infoflow.multitab.e;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class nne {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ALL_KEY = "all_icon";
    public static final String CUN_ICON_ORANGE_GROUP = "cun_search_icon";
    public static final String DARK_MODE_DOM_PREFIX = "tbsearch_dark_prefix_";
    public static final String ICON_ORANGE_GROUP = "search_icon";
    public static final String INSHOP_KEY = "inshop_icon";
    public static final String NX_KEY = "nx_icon";
    public static final String PAGE_NAME_INSHOP = "InShopSrp";
    public static final String PAGE_NAME_MAIN = "MainSrp";
    public static final String PAGE_NAME_MAIN_SPU = "SpuSrp";
    public static final String PAGE_NAME_NX = "Nx";
    public static final String PAGE_NAME_SAME_SRP = "SameStyleSrp";
    public static final String PAGE_NAME_SHOP = "ShopSearchSrp";
    public static final String PAGE_NAME_SIMILIAR_SHOP = "SimilarShopSrp";
    public static final String PAGE_NAME_TMALL = "TmallSrp";
    public static final String PAGE_NAME_TMALL_SPU = "TmallSpuSrp";
    public static final String SHOP_KEY = "shop_icon";
    public static final String SPU_KEY = "spu_icon";
    public static final String TMALL_KEY = "tmall_icon";

    static {
        kge.a(635281449);
    }

    private static SearchDomBean a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SearchDomBean) ipChange.ipc$dispatch("713a51dc", new Object[]{jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        SearchDomBean searchDomBean = new SearchDomBean();
        searchDomBean.width = jSONObject.optInt("width");
        searchDomBean.height = jSONObject.optInt("height");
        searchDomBean.textColor = jSONObject.optString("color");
        searchDomBean.backgroundColor = jSONObject.optString(e.KEY_BG_COLOR);
        searchDomBean.backgroundGradientStart = jSONObject.optString("startColor");
        searchDomBean.backgroundGradientEnd = jSONObject.optString("endColor");
        searchDomBean.borderColor = jSONObject.optString("borderColor");
        searchDomBean.image = jSONObject.optString("img");
        searchDomBean.prefixColor = jSONObject.optString("prefixColor");
        searchDomBean.prefixBgColor = jSONObject.optString("prefixBgColor");
        searchDomBean.borderRadius = jSONObject.optInt("borderRadius", 0);
        searchDomBean.separatorImg = jSONObject.optString("separatorImg");
        searchDomBean.separatorHeight = jSONObject.optInt("separatorHeight");
        searchDomBean.separatorWidth = jSONObject.optInt("separatorWidth");
        try {
            searchDomBean.textSize = Float.parseFloat(jSONObject.optString(a.ATOM_EXT_UDL_font_size));
        } catch (Exception unused) {
            searchDomBean.textSize = 0.0f;
        }
        return searchDomBean;
    }

    public static SearchDomBean b(com.alibaba.fastjson.JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SearchDomBean) ipChange.ipc$dispatch("5f4a3d2d", new Object[]{jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        SearchDomBean searchDomBean = new SearchDomBean();
        searchDomBean.width = jSONObject.getIntValue("width");
        searchDomBean.height = jSONObject.getIntValue("height");
        searchDomBean.textColor = jSONObject.getString("color");
        searchDomBean.backgroundColor = jSONObject.getString(e.KEY_BG_COLOR);
        searchDomBean.backgroundGradientStart = jSONObject.getString("startColor");
        searchDomBean.backgroundGradientEnd = jSONObject.getString("endColor");
        searchDomBean.borderColor = jSONObject.getString("borderColor");
        searchDomBean.image = jSONObject.getString("img");
        searchDomBean.prefixColor = jSONObject.getString("prefixColor");
        searchDomBean.prefixBgColor = jSONObject.getString("prefixBgColor");
        searchDomBean.borderRadius = jSONObject.getIntValue("borderRadius");
        searchDomBean.separatorImg = jSONObject.getString("separatorImg");
        searchDomBean.separatorHeight = jSONObject.getIntValue("separatorHeight");
        searchDomBean.separatorWidth = jSONObject.getIntValue("separatorWidth");
        String string = jSONObject.getString(a.ATOM_EXT_UDL_font_size);
        if (TextUtils.isEmpty(string)) {
            string = jSONObject.getString("fontSize");
        }
        try {
            searchDomBean.textSize = Float.parseFloat(string);
        } catch (Exception unused) {
            searchDomBean.textSize = 0.0f;
        }
        return searchDomBean;
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str}) : a(d(str), c(str));
    }

    private static String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{str, str2});
        }
        if (!TextUtils.isEmpty(str2)) {
            return OrangeConfig.getInstance().getConfig(str, str2, "");
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
        if (r5.equals(tb.nne.PAGE_NAME_TMALL) != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String c(java.lang.String r5) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = tb.nne.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L15
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r1[r2] = r5
            java.lang.String r5 = "b82f346c"
            java.lang.Object r5 = r0.ipc$dispatch(r5, r1)
            java.lang.String r5 = (java.lang.String) r5
            return r5
        L15:
            java.lang.String r0 = "all_icon"
            if (r5 != 0) goto L1a
            return r0
        L1a:
            r1 = -1
            int r4 = r5.hashCode()
            switch(r4) {
                case -1811744455: goto L5e;
                case -1000290399: goto L54;
                case -994828592: goto L4a;
                case -983529293: goto L40;
                case -927824362: goto L36;
                case 2538: goto L2c;
                case 1200902249: goto L23;
                default: goto L22;
            }
        L22:
            goto L68
        L23:
            java.lang.String r3 = "TmallSrp"
            boolean r5 = r5.equals(r3)
            if (r5 == 0) goto L68
            goto L69
        L2c:
            java.lang.String r2 = "Nx"
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L68
            r2 = 6
            goto L69
        L36:
            java.lang.String r2 = "InShopSrp"
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L68
            r2 = 5
            goto L69
        L40:
            java.lang.String r2 = "ShopSearchSrp"
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L68
            r2 = 3
            goto L69
        L4a:
            java.lang.String r2 = "SimilarShopSrp"
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L68
            r2 = 2
            goto L69
        L54:
            java.lang.String r2 = "TmallSpuSrp"
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L68
            r2 = 1
            goto L69
        L5e:
            java.lang.String r2 = "SpuSrp"
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L68
            r2 = 4
            goto L69
        L68:
            r2 = -1
        L69:
            switch(r2) {
                case 0: goto L7b;
                case 1: goto L7b;
                case 2: goto L77;
                case 3: goto L77;
                case 4: goto L73;
                case 5: goto L70;
                case 6: goto L6d;
                default: goto L6c;
            }
        L6c:
            goto L7e
        L6d:
            java.lang.String r0 = "nx_icon"
            goto L7e
        L70:
            java.lang.String r0 = "inshop_icon"
            goto L7e
        L73:
            java.lang.String r0 = "spu_icon"
            goto L7e
        L77:
            java.lang.String r0 = "shop_icon"
            goto L7e
        L7b:
            java.lang.String r0 = "tmall_icon"
        L7e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.nne.c(java.lang.String):java.lang.String");
    }

    private static String d(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f4d254b", new Object[]{str}) : (!r.f() && h.INSTANCE.a() && !PAGE_NAME_SHOP.equals(str) && !PAGE_NAME_INSHOP.equals(str) && !PAGE_NAME_NX.equals(str)) ? CUN_ICON_ORANGE_GROUP : ICON_ORANGE_GROUP;
    }

    public static HashMap<String, SearchDomBean> b(String str) {
        SearchDomBean a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("30adc416", new Object[]{str});
        }
        HashMap<String, SearchDomBean> hashMap = new HashMap<>();
        String c = c(str);
        String d = d(str);
        String a3 = a(d, c);
        if (TextUtils.isEmpty(a3)) {
            return hashMap;
        }
        try {
            JSONObject jSONObject = new JSONObject(a3);
            if (jSONObject.length() == 0) {
                q.b("SearchDomParser", "dom json is invalid");
                return hashMap;
            }
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (!TextUtils.isEmpty(next) && (a2 = a(jSONObject.optJSONObject(next))) != null) {
                    hashMap.put(next, a2);
                }
            }
            q.a("SearchDomParser", "parseDomIcons: " + d + " " + c + " " + a3);
            return hashMap;
        } catch (JSONException unused) {
            q.b("SearchDomParser", "generate dom json error");
            return hashMap;
        }
    }

    public static HashMap<String, SearchDomBean> a(com.alibaba.fastjson.JSONObject jSONObject) {
        com.alibaba.fastjson.JSONObject b;
        SearchDomBean b2;
        SearchDomBean b3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("12dd5eeb", new Object[]{jSONObject});
        }
        if (jSONObject == null || jSONObject.isEmpty()) {
            return null;
        }
        HashMap<String, SearchDomBean> hashMap = new HashMap<>();
        for (String str : jSONObject.keySet()) {
            if (!TextUtils.isEmpty(str) && (b = com.taobao.android.searchbaseframe.util.a.b(jSONObject, str)) != null && !b.isEmpty()) {
                com.alibaba.fastjson.JSONObject b4 = com.taobao.android.searchbaseframe.util.a.b(b, "dark");
                if (b4 != null && (b3 = b(b4)) != null) {
                    hashMap.put(DARK_MODE_DOM_PREFIX + str, b3);
                }
                com.alibaba.fastjson.JSONObject b5 = com.taobao.android.searchbaseframe.util.a.b(b, "light");
                if (b5 != null && (b2 = b(b5)) != null) {
                    hashMap.put(str, b2);
                }
            }
        }
        return hashMap;
    }
}
