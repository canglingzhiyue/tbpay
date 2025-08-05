package com.taobao.search.mmd.util;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.util.ArrayMap;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.android.searchbaseframe.chitu.TBSearchChiTuJSBridge;
import com.taobao.android.searchbaseframe.util.ListStyle;
import com.taobao.android.shop.activity.ShopRenderActivity;
import com.taobao.login4android.api.Login;
import com.taobao.orange.OrangeConfig;
import com.taobao.search.common.util.q;
import com.taobao.search.common.util.r;
import com.taobao.search.common.util.y;
import com.taobao.search.mmd.datasource.bean.AuctionBaseBean;
import com.taobao.search.sf.InshopResultActivity;
import com.taobao.search.sf.datasource.CommonSearchResult;
import com.taobao.search.sf.widgets.list.listcell.defaultshop.DefaultShopCellBean;
import com.taobao.tao.UrlNavStartMode;
import com.taobao.tao.util.NavUrls;
import com.taobao.taolive.room.utils.aw;
import com.ut.mini.UTAnalytics;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;
import tb.djy;
import tb.emh;
import tb.kge;
import tb.noa;
import tb.nog;
import tb.nsp;

/* loaded from: classes7.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f19191a;

    static {
        kge.a(138581192);
        f19191a = false;
    }

    public static void a(Activity activity, int i, DefaultShopCellBean defaultShopCellBean, com.taobao.search.sf.datasource.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b51bd053", new Object[]{activity, new Integer(i), defaultShopCellBean, cVar});
        } else if (defaultShopCellBean == null || TextUtils.isEmpty(defaultShopCellBean.getSellerId())) {
        } else {
            String format = String.format(NavUrls.nav_urls_shop[0], defaultShopCellBean.getSellerId());
            HashMap hashMap = new HashMap();
            hashMap.put("shopId", defaultShopCellBean.getShopId());
            hashMap.put(ShopRenderActivity.SHOP_NAVI, "allitems");
            HashMap hashMap2 = new HashMap();
            hashMap2.put("s_utmap", defaultShopCellBean.getUTParams(cVar, i));
            hashMap.put(aw.PARAM_UT_PARAMS, JSON.toJSONString(hashMap2));
            hashMap.put("spm", defaultShopCellBean.getCellSpm(cVar, i));
            Nav.from(activity).toUri(y.a(format, hashMap));
        }
    }

    public static void a(Activity activity, int i, DefaultShopCellBean defaultShopCellBean, JSONObject jSONObject, com.taobao.search.sf.datasource.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3997550f", new Object[]{activity, new Integer(i), defaultShopCellBean, jSONObject, cVar});
        } else if (jSONObject == null) {
        } else {
            CommonSearchResult commonSearchResult = (CommonSearchResult) cVar.getTotalSearchResult();
            boolean z = commonSearchResult != null && commonSearchResult.isUpdateUtparam;
            String optString = jSONObject.optString("nid");
            if (TextUtils.isEmpty(optString)) {
                return;
            }
            String format = String.format(NavUrls.nav_urls_detail[1], optString);
            HashMap hashMap = new HashMap();
            hashMap.put("list_param", cVar.getKeyword() + "_" + defaultShopCellBean.abtest + "_" + defaultShopCellBean.rn);
            JSONObject optJSONObject = jSONObject.optJSONObject("utLogMap");
            if (optJSONObject != null && optJSONObject.length() > 0) {
                Iterator<String> keys = optJSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    if (!TextUtils.isEmpty(next)) {
                        String optString2 = optJSONObject.optString(next);
                        if (!TextUtils.isEmpty(optString2)) {
                            hashMap.put(next, optString2);
                        }
                    }
                }
            }
            HashMap hashMap2 = new HashMap();
            hashMap2.put("s_utmap", defaultShopCellBean.getUTParams(cVar, i));
            if (!z) {
                hashMap.put(aw.PARAM_UT_PARAMS, JSON.toJSONString(hashMap2));
            } else {
                UTAnalytics.getInstance().getDefaultTracker().updateNextPageUtparam(JSON.toJSONString(hashMap2));
            }
            hashMap.put("spm", defaultShopCellBean.getCellSpm(cVar, i));
            Nav.from(activity).toUri(y.a(format, hashMap));
        }
    }

    private static void a(com.taobao.search.sf.datasource.c cVar, AuctionBaseBean auctionBaseBean, Map<String, String> map, Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb859f1e", new Object[]{cVar, auctionBaseBean, map, activity});
        } else if (cVar == null || !(cVar instanceof nsp)) {
        } else {
            com.taobao.search.sf.realtimetag.d.a(auctionBaseBean.clickTrace, map, activity, -1, ((nsp) cVar).K());
        }
    }

    private static void a(com.taobao.search.sf.datasource.c cVar, String str, Map<String, String> map, Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b45ed8f5", new Object[]{cVar, str, map, activity});
        } else if (cVar == null || !(cVar instanceof nsp)) {
        } else {
            com.taobao.search.sf.realtimetag.d.a(str, map, activity, -1, ((nsp) cVar).K());
        }
    }

    public static void a(com.alibaba.fastjson.JSONObject jSONObject, Activity activity, com.taobao.search.sf.datasource.c cVar, ListStyle listStyle, Map<String, String> map, String str) {
        String str2;
        String str3;
        String str4;
        Object obj;
        boolean z;
        Object obj2;
        JSONArray jSONArray;
        JSONArray jSONArray2;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4201c1c8", new Object[]{jSONObject, activity, cVar, listStyle, map, str});
            return;
        }
        Bundle bundle = new Bundle();
        String string = jSONObject.getString("item_id");
        if (TextUtils.isEmpty(string)) {
            string = jSONObject.getString("nid");
        }
        bundle.putString("item_id", string);
        CommonSearchResult commonSearchResult = (CommonSearchResult) cVar.getTotalSearchResult();
        boolean z2 = commonSearchResult != null && commonSearchResult.isUpdateUtparam;
        String format = String.format(NavUrls.nav_urls_detail[1], string);
        String string2 = jSONObject.getString("h5Url");
        if (!TextUtils.isEmpty(string2)) {
            format = string2;
        }
        if (format == null || format.length() == 0) {
            return;
        }
        if (UrlNavStartMode.checkDetailMode()) {
            UrlNavStartMode.startDetailActivity(format);
            return;
        }
        String sid = Login.getSid();
        if (sid != null) {
            format = format + "&sid=" + sid;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("from", "shopsearch");
        String str5 = format + "&from=shopsearch";
        String keyword = cVar.getKeyword();
        if (!TextUtils.isEmpty(keyword)) {
            try {
                str5 = str5 + "&shopsearchq=" + URLEncoder.encode(keyword, "UTF-8");
                hashMap.put("shopsearchq", keyword);
            } catch (UnsupportedEncodingException unused) {
            }
        }
        if (map != null) {
            String str6 = map.get(aw.PARAM_SEARCH_KEYWORD_RN);
            if (!TextUtils.isEmpty(str6)) {
                hashMap.put(aw.PARAM_SEARCH_KEYWORD_RN, str6);
            }
            str2 = map.get(TBSearchChiTuJSBridge.ABTEST);
            if (!TextUtils.isEmpty(str2)) {
                hashMap.put(djy.SERIALIZE_EXP_BUCKET_ID, str2);
            }
        } else {
            str2 = "";
        }
        String str7 = "";
        hashMap.put("sort_tag", cVar.getParamValue("sort"));
        q.a("ShopGoodsContentController", "埋点：" + cVar.getParamValue("sort"));
        boolean z3 = activity instanceof InshopResultActivity;
        String str8 = "search";
        if (z3) {
            str3 = str8;
            str4 = "allauc";
        } else {
            str3 = str8;
            str8 = "allauc";
            str4 = str8;
        }
        hashMap.put("inshops", str8);
        if (!TextUtils.isEmpty(SearchContext.compassTitleForUT)) {
            obj = "inshops";
            hashMap.put("reckey", SearchContext.compassTitleForUT);
        } else {
            obj = "inshops";
        }
        com.alibaba.fastjson.JSONObject jSONObject2 = new com.alibaba.fastjson.JSONObject(hashMap);
        String str9 = str5 + "&track_params=" + jSONObject2.toString();
        if (!TextUtils.isEmpty(str)) {
            str9 = str9 + "&spm=" + str;
        }
        ArrayMap arrayMap = new ArrayMap();
        ArrayMap arrayMap2 = new ArrayMap();
        if (listStyle != null) {
            String string3 = jSONObject.getString(nog.PRD_PICURL);
            if (!TextUtils.isEmpty(string3)) {
                str7 = com.taobao.search.common.uikit.a.a(android.taobao.util.j.a(string3));
            }
            z = z3;
            String str10 = "wf";
            if (listStyle == ListStyle.WATERFALL) {
                String string4 = jSONObject.getString(nog.PRD_WF_PICURL);
                String string5 = jSONObject.getString("videoUrl");
                if (!TextUtils.isEmpty(string4) && TextUtils.isEmpty(string5)) {
                    str7 = android.taobao.util.j.a(string4);
                }
            } else {
                str10 = "list";
            }
            String str11 = str7;
            String str12 = str10;
            obj2 = djy.SERIALIZE_EXP_BUCKET_ID;
            arrayMap2.put("style", str12);
            arrayMap2.put(nog.PRD_PICURL, str11);
            arrayMap.put("style", str12);
            arrayMap.put(nog.PRD_PICURL, str11);
        } else {
            z = z3;
            obj2 = djy.SERIALIZE_EXP_BUCKET_ID;
        }
        arrayMap.put("itemId", string);
        a(cVar, jSONObject.getString(nog.CLICK_TRACE), arrayMap, activity);
        try {
            jSONArray = jSONObject.getJSONArray("extraParams");
        } catch (Exception unused2) {
            jSONArray = null;
        }
        if (jSONArray != null && !jSONArray.isEmpty()) {
            Map<String, String> a2 = y.a(str9);
            int size = jSONArray.size();
            int i2 = 0;
            while (i2 < size) {
                com.alibaba.fastjson.JSONObject jSONObject3 = jSONArray.getJSONObject(i2);
                if (jSONObject3 != null) {
                    jSONArray2 = jSONArray;
                    String string6 = jSONObject3.getString("key");
                    if (!a2.containsKey(string6)) {
                        i = size;
                        a2.put(string6, jSONObject3.getString("value"));
                        i2++;
                        jSONArray = jSONArray2;
                        size = i;
                    }
                } else {
                    jSONArray2 = jSONArray;
                }
                i = size;
                i2++;
                jSONArray = jSONArray2;
                size = i;
            }
            Uri.Builder buildUpon = Uri.parse(str9).buildUpon();
            buildUpon.clearQuery();
            for (Map.Entry<String, String> entry : a2.entrySet()) {
                buildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
            }
            str9 = buildUpon.toString();
        }
        HashMap hashMap2 = new HashMap();
        String string7 = jSONObject.getString("prefetchImgRatio");
        if (!TextUtils.isEmpty(string7)) {
            hashMap2.put("prefetchImgRatio", string7);
            if (TextUtils.equals(emh.sDefaultDimension, string7)) {
                String string8 = jSONObject.getString(nog.PRD_PICURL);
                if (!TextUtils.isEmpty(string8)) {
                    hashMap2.put("prefetchImg", com.taobao.search.common.uikit.a.a(android.taobao.util.j.a(string8)));
                }
            } else {
                String string9 = jSONObject.getString(nog.PRD_WF_PICURL);
                if (!TextUtils.isEmpty(string9)) {
                    hashMap2.put("prefetchImg", android.taobao.util.j.a(string9));
                }
            }
        }
        com.alibaba.fastjson.JSONObject jSONObject4 = jSONObject.getJSONObject("utLogMap");
        if (!z2 && map != null) {
            jSONObject4.put("srp_seq", (Object) String.valueOf(map.get(com.ap.zlz.toyger.zdoc.b.INFO_PAGE_NUMBER)));
            jSONObject4.put("srp_pos", (Object) String.valueOf(map.get("pagePos")));
            hashMap2.put(aw.PARAM_UT_PARAMS, JSON.toJSONString(jSONObject4));
        }
        String a3 = y.a(str9, hashMap2);
        String paramValue = cVar.getParamValue(noa.KEY_MINI_APP_DETAIL_URL);
        boolean z4 = "true".equals(cVar.getParamValue(noa.KEY_MINI_APP)) && !TextUtils.isEmpty(paramValue);
        q.a("searchminiapp", "url: " + paramValue + " isMiniApp:" + z4);
        arrayMap2.put("item_id", string);
        String paramValue2 = cVar.getParamValue("sellerId");
        arrayMap2.put("seller_Id", paramValue2);
        arrayMap2.put("sellerId", paramValue2);
        arrayMap2.put(obj2, str2);
        arrayMap2.put(noa.KEY_MINI_APP, String.valueOf(z4));
        arrayMap2.put(obj, z ? str3 : str4);
        arrayMap2.put("spm", str);
        arrayMap2.put("utLogMap", y.b(JSON.toJSONString(jSONObject4)));
        CommonSearchResult commonSearchResult2 = (CommonSearchResult) cVar.getTotalSearchResult();
        if (commonSearchResult2 != null) {
            arrayMap2.put("pageid", commonSearchResult2.getMainInfo().rn);
        }
        e.a("Item", (ArrayMap<String, String>) arrayMap2);
        if (z2) {
            UTAnalytics.getInstance().getDefaultTracker().updateNextPageUtparam(JSON.toJSONString(jSONObject4));
        }
        if (z4) {
            String a4 = y.a(y.a(paramValue, "_wml_path", y.a(y.b(paramValue, "_wml_path"), "id", string)), "spm", str);
            q.a("searchminiapp", "final url: " + a4);
            Nav.from(activity).toUri(a4);
            return;
        }
        Nav.from(activity).withExtras(bundle).toUri(a3);
    }

    public static String a(Activity activity, com.taobao.search.sf.datasource.c cVar, int i) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b0b2c183", new Object[]{activity, cVar, new Integer(i)});
        }
        if (!(activity instanceof InshopResultActivity)) {
            if (TextUtils.equals(OrangeConfig.getInstance().getConfig(r.SEARCH_BIZ_NAME, "enableNewAllItemSpm", "true"), "true")) {
                str = cVar.getParamValue("shopAuctionSpmCnt");
                String str2 = "Trigger Spm: " + str;
            } else {
                str = "";
            }
            if (TextUtils.isEmpty(str)) {
                str = "a2141.7631671";
            }
            return str + ".itemlist." + i;
        } else if ("category".equals(cVar.getParamValue("from"))) {
            return "a2141.7631684.itemlist." + i;
        } else {
            return "a2141.11319901.itemlist." + i;
        }
    }

    public static void a(AuctionBaseBean auctionBaseBean, Activity activity, com.taobao.search.sf.datasource.c cVar, ListStyle listStyle, String str) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22915cb2", new Object[]{auctionBaseBean, activity, cVar, listStyle, str});
            return;
        }
        String a2 = a(auctionBaseBean);
        if (a2 == null || a2.length() == 0) {
            return;
        }
        b(auctionBaseBean, activity, cVar, listStyle, str);
        if (UrlNavStartMode.checkDetailMode()) {
            UrlNavStartMode.startDetailActivity(a2);
            return;
        }
        String paramValue = cVar.getParamValue(noa.KEY_MINI_APP_DETAIL_URL);
        if (!"true".equals(cVar.getParamValue(noa.KEY_MINI_APP)) || TextUtils.isEmpty(paramValue)) {
            z = false;
        }
        q.a("searchminiapp", "url: " + paramValue + " isMiniApp:" + z);
        if (z) {
            String a3 = y.a(y.b(paramValue, "_wml_path"), "id", auctionBaseBean.itemId);
            HashMap hashMap = new HashMap();
            hashMap.put("_wml_path", a3);
            hashMap.put("spm", str);
            Nav.from(activity).toUri(y.a(paramValue, hashMap));
            return;
        }
        String a4 = a(a2, auctionBaseBean, activity, cVar, str);
        Bundle bundle = new Bundle();
        bundle.putString("item_id", auctionBaseBean.itemId);
        Nav.from(activity).withExtras(bundle).toUri(a4);
    }

    public static String a(AuctionBaseBean auctionBaseBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8b4e0ef7", new Object[]{auctionBaseBean});
        }
        if (auctionBaseBean == null) {
            return "";
        }
        String str = auctionBaseBean.h5Url;
        return TextUtils.isEmpty(str) ? String.format(NavUrls.nav_urls_detail[1], auctionBaseBean.itemId) : str;
    }

    public static String a(String str, AuctionBaseBean auctionBaseBean, Activity activity, com.taobao.search.sf.datasource.c cVar, String str2) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3a483427", new Object[]{str, auctionBaseBean, activity, cVar, str2});
        }
        Map<String, String> a2 = y.a(str);
        a2.put("sid", Login.getSid());
        a2.put("from", "shopsearch");
        String keyword = cVar.getKeyword();
        if (!TextUtils.isEmpty(keyword)) {
            try {
                a2.put("shopsearchq", URLEncoder.encode(keyword, "UTF-8"));
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        a2.put("spm", str2);
        com.alibaba.fastjson.JSONObject jSONObject = new com.alibaba.fastjson.JSONObject();
        jSONObject.put("from", (Object) "shopsearch");
        if (!TextUtils.isEmpty(keyword)) {
            jSONObject.put("shopsearchq", (Object) keyword);
        }
        if (!TextUtils.isEmpty(auctionBaseBean.rn)) {
            jSONObject.put(aw.PARAM_SEARCH_KEYWORD_RN, (Object) auctionBaseBean.rn);
        }
        jSONObject.put(djy.SERIALIZE_EXP_BUCKET_ID, (Object) auctionBaseBean.abtest);
        jSONObject.put("sort_tag", (Object) cVar.getParamValue("sort"));
        jSONObject.put("inshops", (Object) (activity instanceof InshopResultActivity ? "search" : "allauc"));
        if (!TextUtils.isEmpty(SearchContext.compassTitleForUT)) {
            jSONObject.put("reckey", (Object) SearchContext.compassTitleForUT);
        }
        a2.put("track_params", jSONObject.toString());
        if (!auctionBaseBean.extraParams.isEmpty()) {
            for (Map.Entry<String, String> entry : auctionBaseBean.extraParams.entrySet()) {
                String key = entry.getKey();
                if (!a2.containsKey(key)) {
                    a2.put(key, entry.getValue());
                }
            }
        }
        if (!TextUtils.isEmpty(auctionBaseBean.prefetchImgRatio)) {
            a2.put("prefetchImgRatio", auctionBaseBean.prefetchImgRatio);
            if (TextUtils.equals(emh.sDefaultDimension, auctionBaseBean.prefetchImgRatio)) {
                a2.put("prefetchImg", auctionBaseBean.picUrl);
            } else {
                a2.put("prefetchImg", auctionBaseBean.wfPicUrl);
            }
        }
        CommonSearchResult commonSearchResult = (CommonSearchResult) cVar.getTotalSearchResult();
        if (commonSearchResult == null || !commonSearchResult.isUpdateUtparam) {
            z = false;
        }
        if (z) {
            UTAnalytics.getInstance().getDefaultTracker().updateNextPageUtparam(JSON.toJSONString(auctionBaseBean.utLogMap));
        } else {
            a2.put(aw.PARAM_UT_PARAMS, JSON.toJSONString(auctionBaseBean.utLogMap));
        }
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        buildUpon.clearQuery();
        for (Map.Entry<String, String> entry2 : a2.entrySet()) {
            String key2 = entry2.getKey();
            String value = entry2.getValue();
            if (!TextUtils.isEmpty(key2) && !TextUtils.isEmpty(value)) {
                buildUpon.appendQueryParameter(key2, value);
            }
        }
        return buildUpon.toString();
    }

    private static void b(AuctionBaseBean auctionBaseBean, Activity activity, com.taobao.search.sf.datasource.c cVar, ListStyle listStyle, String str) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b2d83d1", new Object[]{auctionBaseBean, activity, cVar, listStyle, str});
            return;
        }
        String str2 = "";
        String str3 = "wf";
        if (listStyle != null) {
            str2 = auctionBaseBean.picUrl;
            if (listStyle != ListStyle.WATERFALL) {
                str3 = "list";
            } else if (!TextUtils.isEmpty(auctionBaseBean.wfPicUrl) && TextUtils.isEmpty(auctionBaseBean.videoUrl)) {
                str2 = auctionBaseBean.wfPicUrl;
            }
        } else {
            str3 = str2;
        }
        ArrayMap arrayMap = new ArrayMap();
        if (!TextUtils.isEmpty(str3)) {
            arrayMap.put("style", str3);
        }
        if (!TextUtils.isEmpty(str2)) {
            arrayMap.put(nog.PRD_PICURL, str2);
        }
        arrayMap.put("itemId", auctionBaseBean.itemId);
        if (r.aY() && auctionBaseBean.extraParams != null && !auctionBaseBean.extraParams.isEmpty()) {
            arrayMap.putAll(auctionBaseBean.extraParams);
        }
        a(cVar, auctionBaseBean, arrayMap, activity);
        ArrayMap arrayMap2 = new ArrayMap();
        if (!TextUtils.isEmpty(str3)) {
            arrayMap2.put("style", str3);
        }
        if (!TextUtils.isEmpty(str2)) {
            arrayMap2.put(nog.PRD_PICURL, str2);
        }
        String paramValue = cVar.getParamValue(noa.KEY_MINI_APP_DETAIL_URL);
        if (!"true".equals(cVar.getParamValue(noa.KEY_MINI_APP)) || TextUtils.isEmpty(paramValue)) {
            z = false;
        }
        arrayMap2.put("item_id", auctionBaseBean.itemId);
        String paramValue2 = cVar.getParamValue("sellerId");
        arrayMap2.put("seller_Id", paramValue2);
        arrayMap2.put("sellerId", paramValue2);
        arrayMap2.put(djy.SERIALIZE_EXP_BUCKET_ID, auctionBaseBean.abtest);
        arrayMap2.put(noa.KEY_MINI_APP, String.valueOf(z));
        arrayMap2.put("inshops", activity instanceof InshopResultActivity ? "search" : "allauc");
        arrayMap2.put("spm", str);
        arrayMap2.put("utLogMap", y.b(JSON.toJSONString(auctionBaseBean.utLogMap)));
        CommonSearchResult commonSearchResult = (CommonSearchResult) cVar.getTotalSearchResult();
        if (commonSearchResult != null) {
            arrayMap2.put("pageid", commonSearchResult.getMainInfo().rn);
        }
        e.a("Item", (ArrayMap<String, String>) arrayMap2);
    }
}
