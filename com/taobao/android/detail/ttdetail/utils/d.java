package com.taobao.android.detail.ttdetail.utils;

import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.android.aura.taobao.adapter.extension.linkage.event.AURASubmitEvent;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.model.datamodel.node.SkuCoreNode;
import com.taobao.android.detail.ttdetail.component.ComponentViewMeta;
import com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter;
import com.taobao.android.detail.ttdetail.data.meta.CommonDialog;
import com.taobao.android.detail.ttdetail.data.meta.Delivery;
import com.taobao.android.detail.ttdetail.data.meta.Feature;
import com.taobao.android.detail.ttdetail.data.meta.Item;
import com.taobao.android.detail.ttdetail.data.meta.Params;
import com.taobao.android.detail.ttdetail.data.meta.Rate;
import com.taobao.android.detail.ttdetail.data.meta.Resource;
import com.taobao.android.detail.ttdetail.data.meta.Seller;
import com.taobao.android.detail.ttdetail.data.meta.SkuBase;
import com.taobao.android.detail.ttdetail.data.meta.SkuCore;
import com.taobao.android.detail.ttdetail.data.meta.Vertical;
import com.taobao.ju.track.server.JTrackParams;
import com.ut.share.utils.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.dwy;
import tb.eyx;
import tb.eyz;
import tb.ezc;
import tb.ezd;
import tb.eze;
import tb.kge;
import tb.ptl;
import tb.qpk;
import tb.tpd;

/* loaded from: classes5.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(851111606);
    }

    public static JSONObject g(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("97d7ca62", new Object[]{jSONObject}) : jSONObject;
    }

    public static Map<String, ComponentViewMeta> a(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("2b563fbd", new Object[]{jSONObject});
        }
        HashMap hashMap = null;
        if (jSONObject == null || (jSONObject2 = jSONObject.getJSONObject("components")) == null) {
            return null;
        }
        for (String str : jSONObject2.keySet()) {
            if (hashMap == null) {
                hashMap = new HashMap();
            }
            hashMap.put(str, new ComponentViewMeta(jSONObject2.getJSONObject(str)));
        }
        hashMap.put("native$_tt_detail_header_frame_", new ComponentViewMeta(new JSONObject() { // from class: com.taobao.android.detail.ttdetail.utils.DataUtils$1
            {
                put("name", "_tt_detail_header_frame_");
                put("type", "native");
                put("version", "0");
                put("url", "");
            }
        }));
        return hashMap;
    }

    public static JSONObject a(Rate rate) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("7b31e8c1", new Object[]{rate});
        }
        if (rate != null) {
            return rate.getRateExtParams();
        }
        return null;
    }

    public static List<Rate.Keywords> a(Rate rate, List<Rate.Keywords> list) {
        List<Rate.Keywords> keywords;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("124daf75", new Object[]{rate, list}) : (rate == null || (keywords = rate.getKeywords()) == null) ? list : keywords;
    }

    public static String a(Params params) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8a216905", new Object[]{params});
        }
        if (params != null) {
            return params.getUtParams();
        }
        return null;
    }

    public static long b(Params params) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("aab6580e", new Object[]{params})).longValue();
        }
        if (params == null) {
            return 0L;
        }
        try {
            return params.getTrackParams().getLongValue("serverStableTotalRt");
        } catch (Exception unused) {
            i.a("serverStableTotalRt parse error");
            return 0L;
        }
    }

    public static boolean a(SkuCore skuCore) {
        SkuCore.b skuItem;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4aff0c97", new Object[]{skuCore})).booleanValue();
        }
        if (skuCore != null && (skuItem = skuCore.getSkuItem()) != null) {
            return skuItem.c();
        }
        return false;
    }

    public static String a(Seller seller, String str) {
        String userId;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("89707074", new Object[]{seller, str}) : (seller == null || (userId = seller.getUserId()) == null) ? str : userId;
    }

    public static String a(Item item, String str) {
        String groupId;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ac341ac8", new Object[]{item, str}) : (item == null || (groupId = item.getGroupId()) == null) ? str : groupId;
    }

    public static JSONObject a(Vertical.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("bc02374e", new Object[]{aVar});
        }
        if (aVar != null) {
            return aVar.a();
        }
        return null;
    }

    public static JSONObject a(SkuBase skuBase, JSONObject jSONObject) {
        JSONObject data;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("1484a20f", new Object[]{skuBase, jSONObject}) : (skuBase == null || (data = skuBase.getData()) == null) ? jSONObject : data;
    }

    public static boolean a(Seller seller) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4f09fc66", new Object[]{seller})).booleanValue() : seller != null && b(seller) == 2;
    }

    public static String a(Delivery delivery, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("eabfdf69", new Object[]{delivery, str});
        }
        if (delivery == null) {
            return str;
        }
        String completedTo = delivery.getCompletedTo();
        if (TextUtils.isEmpty(completedTo)) {
            completedTo = delivery.getTo();
        }
        return completedTo == null ? str : completedTo;
    }

    public static String b(Delivery delivery, String str) {
        String areaId;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("13061faa", new Object[]{delivery, str}) : (delivery == null || (areaId = delivery.getAreaId()) == null) ? str : areaId;
    }

    public static String k(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b313cea2", new Object[]{jSONObject});
        }
        if (jSONObject != null && (jSONObject2 = jSONObject.getJSONObject("item")) != null) {
            return jSONObject2.getString("itemId");
        }
        return null;
    }

    public static String a(Item item) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1a235fd2", new Object[]{item}) : b(item, (String) null);
    }

    public static String b(Item item, String str) {
        String itemId;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("725ea389", new Object[]{item, str}) : (item == null || (itemId = item.getItemId()) == null) ? str : itemId;
    }

    public static String c(Item item, String str) {
        String categoryId;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("38892c4a", new Object[]{item, str}) : (item == null || (categoryId = item.getCategoryId()) == null) ? str : categoryId;
    }

    public static String e(Item item, String str) {
        String rootCategoryId;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c4de3dcc", new Object[]{item, str}) : (item == null || (rootCategoryId = item.getRootCategoryId()) == null) ? str : rootCategoryId;
    }

    public static String d(Item item, String str) {
        String title;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("feb3b50b", new Object[]{item, str}) : (item == null || (title = item.getTitle()) == null) ? str : title;
    }

    public static String b(Seller seller, String str) {
        String shopId;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6f1bccf5", new Object[]{seller, str}) : (seller == null || (shopId = seller.getShopId()) == null) ? str : shopId;
    }

    public static int b(Seller seller) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dbf71374", new Object[]{seller})).intValue();
        }
        if (seller != null) {
            return seller.getShopType();
        }
        return 1;
    }

    public static long a(Item item, long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("cfba85ea", new Object[]{item, new Long(j)})).longValue() : item == null ? j : item.getCommentCount();
    }

    public static boolean b(Feature feature) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("87166a7e", new Object[]{feature})).booleanValue();
        }
        if (feature != null) {
            return feature.isHeaderPicFlow();
        }
        return false;
    }

    public static Map<String, String> a(Resource resource) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("8d8e8c28", new Object[]{resource});
        }
        if (resource != null) {
            return resource.getRsExtParams();
        }
        return null;
    }

    private static boolean m(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("92465300", new Object[]{jSONObject})).booleanValue() : (jSONObject == null || (jSONObject2 = jSONObject.getJSONObject("feature")) == null || !jSONObject2.getBooleanValue("finalUltron")) ? false : true;
    }

    private static boolean n(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f398ef9f", new Object[]{jSONObject})).booleanValue() : (jSONObject == null || (jSONObject2 = jSONObject.getJSONObject("feature")) == null || !jSONObject2.getBooleanValue(dwy.KEY_DETAIL)) ? false : true;
    }

    private static boolean o(JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        JSONObject jSONObject4;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("54eb8c3e", new Object[]{jSONObject})).booleanValue() : jSONObject != null && (jSONObject2 = jSONObject.getJSONObject("bizData")) != null && !jSONObject2.isEmpty() && jSONObject2.getBooleanValue("useClientEngine") && (jSONObject3 = jSONObject2.getJSONObject("template")) != null && !jSONObject3.isEmpty() && (jSONObject4 = jSONObject.getJSONObject("componentsVO")) != null && !jSONObject4.isEmpty();
    }

    public static String a(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9e721362", new Object[]{str, jSONObject});
        }
        JSONObject e = g.e(jSONObject);
        JSONObject jSONObject2 = e != null ? e.getJSONObject("meta") : null;
        String j = j(jSONObject);
        if (TextUtils.isEmpty(j)) {
            j = j(jSONObject2);
        }
        if (TextUtils.isEmpty(j)) {
            j = b(str, jSONObject);
        }
        if (TextUtils.isEmpty(j)) {
            j = b(str, jSONObject2);
        }
        if (DetailV3Converter.h(e)) {
            return j;
        }
        if (!i(e)) {
            if (TextUtils.isEmpty(j)) {
                j = c(str, jSONObject);
            }
            if (TextUtils.isEmpty(j)) {
                j = c(str, jSONObject2);
            }
            return TextUtils.isEmpty(j) ? a(str) : j;
        } else if (n(jSONObject) || n(jSONObject2) || m(jSONObject) || m(jSONObject2) || o(jSONObject) || o(jSONObject2)) {
            return j;
        } else {
            if (TextUtils.isEmpty(j)) {
                j = d(str, jSONObject);
            }
            if (TextUtils.isEmpty(j)) {
                j = d(str, jSONObject2);
            }
            return TextUtils.isEmpty(j) ? a(str) : j;
        }
    }

    public static boolean i(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cfbe084", new Object[]{jSONObject})).booleanValue();
        }
        if (jSONObject == null) {
            return false;
        }
        return jSONObject.containsKey(AURASubmitEvent.RPC_ENDPOINT) || jSONObject.containsKey("version");
    }

    private static String b(String str, JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        JSONObject jSONObject4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("657dfa63", new Object[]{str, jSONObject});
        }
        if (jSONObject != null && (jSONObject2 = jSONObject.getJSONObject("feature")) != null && jSONObject2.getBooleanValue("biz_degrade") && !jSONObject2.getBooleanValue("tmallHKDirectSaleDetail") && (jSONObject3 = jSONObject.getJSONObject("params")) != null && (jSONObject4 = jSONObject3.getJSONObject(JTrackParams.TRACK_PARAMS)) != null && "ali.china.lease".equalsIgnoreCase(jSONObject4.getString("aliBizCode"))) {
            return Uri.parse("https://main.m.taobao.com/detail/index.html").buildUpon().appendQueryParameter("id", str).appendQueryParameter("bizCode", "ali.china.lease").appendQueryParameter("hybrid", "true").build().toString();
        }
        return null;
    }

    private static String d(String str, JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f395c865", new Object[]{str, jSONObject});
        }
        if (jSONObject == null || (jSONObject2 = jSONObject.getJSONObject("feature")) == null || !jSONObject2.getBooleanValue("disableDetail1") || (jSONObject3 = jSONObject.getJSONObject("item")) == null) {
            return null;
        }
        String string = jSONObject3.getString("h5ItemUrl");
        return TextUtils.isEmpty(string) ? a(str) : string;
    }

    private static String c(String str, JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2c89e164", new Object[]{str, jSONObject});
        }
        if (jSONObject == null || (jSONObject2 = jSONObject.getJSONObject("feature")) == null || !jSONObject2.getBooleanValue("tcloudToH5") || (jSONObject3 = jSONObject.getJSONObject("item")) == null) {
            return null;
        }
        String string = jSONObject3.getString("h5ItemUrl");
        return TextUtils.isEmpty(string) ? a(str) : string;
    }

    private static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        if (j.s()) {
            return j.m() + str;
        }
        return "https://new.m.taobao.com/detail.htm?id=" + str + "&hybrid=true";
    }

    private static String j(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("89bf7961", new Object[]{jSONObject});
        }
        if (jSONObject != null && (jSONObject2 = jSONObject.getJSONObject("trade")) != null) {
            return jSONObject2.getString(Constants.WEIBO_REDIRECTURL_KEY);
        }
        return null;
    }

    public static boolean e(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("87b16e08", new Object[]{jSONObject})).booleanValue();
        }
        if (jSONObject != null) {
            return jSONObject.getBooleanValue("preload");
        }
        return false;
    }

    public static boolean b(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("63b9982b", new Object[]{jSONObject})).booleanValue();
        }
        if (jSONObject != null && (jSONObject2 = jSONObject.getJSONObject("data")) != null) {
            return jSONObject2.getBooleanValue("preload");
        }
        return false;
    }

    public static boolean a(eyz eyzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7cff6d6", new Object[]{eyzVar})).booleanValue();
        }
        if (eyzVar != null) {
            return eyzVar.c();
        }
        return false;
    }

    public static boolean a(eyx eyxVar) {
        Feature feature;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7cf0e18", new Object[]{eyxVar})).booleanValue();
        }
        if (eyxVar != null && (feature = (Feature) eyxVar.a().a(Feature.class)) != null) {
            return feature.isGuessYouLikeNewStyle();
        }
        return false;
    }

    public static JSONObject b(eyx eyxVar) {
        CommonDialog commonDialog;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("1fd12bb5", new Object[]{eyxVar});
        }
        if (eyxVar != null && (commonDialog = (CommonDialog) eyxVar.a().a(CommonDialog.class)) != null) {
            return commonDialog.getBizData();
        }
        return null;
    }

    public static boolean c(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c50c34ca", new Object[]{jSONObject})).booleanValue() : (jSONObject == null || (jSONObject2 = jSONObject.getJSONObject("feature")) == null || !Boolean.parseBoolean(jSONObject2.getString("degradeToOldMtop"))) ? false : true;
    }

    public static boolean d(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("265ed169", new Object[]{jSONObject})).booleanValue();
        }
        if (j.X()) {
            if (jSONObject == null) {
                return true;
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject("feature");
            return jSONObject2 != null && jSONObject2.getBooleanValue("enableNewStructure");
        } else if (jSONObject == null) {
            return ad.b(f.a(), "enableNewStructure", true);
        } else {
            JSONObject jSONObject3 = jSONObject.getJSONObject("feature");
            if (jSONObject3 != null && jSONObject3.getBooleanValue("enableNewStructure")) {
                z = true;
            }
            ad.a(f.a(), "enableNewStructure", z);
            return z;
        }
    }

    public static boolean a(Feature feature) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("76609dbd", new Object[]{feature})).booleanValue() : feature != null && feature.isHideMainPicLocator();
    }

    public static boolean c(Feature feature) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("97cc373f", new Object[]{feature})).booleanValue() : feature != null && feature.isHeaderPicScrollCycle();
    }

    public static List<ezc> a(eze ezeVar) {
        List<ezd> j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("1e5aeebf", new Object[]{ezeVar});
        }
        if (ezeVar == null || (j = ezeVar.j()) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (ezd ezdVar : j) {
            if (ezdVar.h() != null) {
                arrayList.addAll(ezdVar.h());
            }
        }
        return arrayList;
    }

    public static List<ezc> b(eze ezeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("f2bf61e", new Object[]{ezeVar});
        }
        if (ezeVar != null) {
            return ezeVar.p();
        }
        return null;
    }

    public static com.taobao.android.detail.ttdetail.component.module.d a(qpk qpkVar, com.taobao.android.detail.ttdetail.component.a aVar) {
        tpd i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.detail.ttdetail.component.module.d) ipChange.ipc$dispatch("67caea0a", new Object[]{qpkVar, aVar});
        }
        if (aVar != null && qpkVar != null && (i = qpkVar.i()) != null) {
            return i.a(aVar);
        }
        return null;
    }

    public static List<com.taobao.android.detail.ttdetail.component.module.d> b(qpk qpkVar, com.taobao.android.detail.ttdetail.component.a aVar) {
        com.taobao.android.detail.ttdetail.component.module.u uVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("38abf47", new Object[]{qpkVar, aVar});
        }
        ArrayList arrayList = null;
        if (aVar != null && qpkVar != null && qpkVar.f() != null) {
            ptl f = qpkVar.f();
            if (f.b() <= 0 && qpkVar.e() == null) {
                return null;
            }
            arrayList = new ArrayList(1);
            int b = f.b();
            for (int i = 0; i < b; i++) {
                com.taobao.android.detail.ttdetail.component.module.d a2 = f.a(i).a(aVar);
                if (a2 != null) {
                    arrayList.add(a2);
                }
            }
            if (qpkVar.e() != null && (uVar = (com.taobao.android.detail.ttdetail.component.module.u) qpkVar.e().a(aVar)) != null) {
                arrayList.add(0, uVar);
            }
        }
        return arrayList;
    }

    public static JSONObject f(JSONObject jSONObject) {
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("5ef769c3", new Object[]{jSONObject});
        }
        JSONObject e = g.e(jSONObject);
        if (e != null) {
            Iterator<Map.Entry<String, Object>> it = e.entrySet().iterator();
            while (it.hasNext()) {
                String key = it.next().getKey();
                if (!"global".equalsIgnoreCase(key) && !"components".equalsIgnoreCase(key) && !"meta".equalsIgnoreCase(key)) {
                    if ("layoutInfo".equalsIgnoreCase(key)) {
                        JSONObject jSONObject2 = e.getJSONObject(key);
                        if (jSONObject2 != null) {
                            Iterator<Map.Entry<String, Object>> it2 = jSONObject2.entrySet().iterator();
                            while (it2.hasNext()) {
                                String key2 = it2.next().getKey();
                                if (!"navBar".equalsIgnoreCase(key2) && !"headerPic".equalsIgnoreCase(key2)) {
                                    if ("mainScreen".equalsIgnoreCase(key2)) {
                                        JSONObject jSONObject3 = jSONObject2.getJSONObject(key2);
                                        if (jSONObject3 != null && (jSONArray = jSONObject3.getJSONArray("children")) != null) {
                                            jSONArray.clear();
                                        }
                                    } else {
                                        it2.remove();
                                    }
                                }
                            }
                        }
                    } else if ("model".equalsIgnoreCase(key)) {
                        JSONObject jSONObject4 = e.getJSONObject(key);
                        if (jSONObject4 != null) {
                            Iterator<Map.Entry<String, Object>> it3 = jSONObject4.entrySet().iterator();
                            while (it3.hasNext()) {
                                String key3 = it3.next().getKey();
                                if (!"nav".equalsIgnoreCase(key3)) {
                                    if ("headerPic".equalsIgnoreCase(key3)) {
                                        jSONObject4.getJSONObject(key3);
                                    } else {
                                        it3.remove();
                                    }
                                }
                            }
                        }
                    } else {
                        it.remove();
                    }
                }
            }
        }
        return jSONObject;
    }

    public static JSONObject l(JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b439ad7d", new Object[]{jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        JSONObject e = g.e(jSONObject.getJSONObject("data"));
        if (e == null) {
            return jSONObject;
        }
        for (Map.Entry<String, Object> entry : e.entrySet()) {
            String key = entry.getKey();
            if ("model".equalsIgnoreCase(key) && (jSONObject2 = e.getJSONObject(key)) != null) {
                for (Map.Entry<String, Object> entry2 : jSONObject2.entrySet()) {
                    String key2 = entry2.getKey();
                    if ("headerPic".equalsIgnoreCase(key2) && (jSONObject3 = jSONObject2.getJSONObject(key2)) != null && (jSONArray = jSONObject3.getJSONArray("smallWindow")) != null) {
                        jSONArray.clear();
                    }
                }
            }
        }
        return jSONObject;
    }

    public static JSONObject h(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("d0b82b01", new Object[]{jSONObject});
        }
        JSONObject e = g.e(jSONObject);
        if (e != null) {
            for (Map.Entry<String, Object> entry : e.entrySet()) {
                String key = entry.getKey();
                if ("layoutInfo".equalsIgnoreCase(key) && (jSONObject2 = e.getJSONObject(key)) != null) {
                    Iterator<Map.Entry<String, Object>> it = jSONObject2.entrySet().iterator();
                    while (it.hasNext()) {
                        String key2 = it.next().getKey();
                        if ("divisionDesc".equalsIgnoreCase(key2) || "description".equalsIgnoreCase(key2) || qpk.KEY_DIVISION_RECOMMEND.equalsIgnoreCase(key2) || "recommend".equalsIgnoreCase(key2)) {
                            it.remove();
                        }
                    }
                }
            }
        }
        return jSONObject;
    }

    public static boolean p(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b63e28dd", new Object[]{jSONObject})).booleanValue();
        }
        JSONObject jSONObject2 = null;
        try {
            jSONObject2 = jSONObject.getJSONObject(SkuCoreNode.TAG).getJSONObject("skuItem");
        } catch (Exception e) {
            i.a("isUpdateSkuDataValid parse skuItem exception:" + e);
        }
        if (jSONObject2 == null) {
            return true;
        }
        return TextUtils.isEmpty(jSONObject2.getString("skuWeexUrl")) && TextUtils.isEmpty(jSONObject2.getString("skuV3WeexUrl"));
    }
}
