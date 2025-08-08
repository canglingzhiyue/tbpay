package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.security.realidentity.b;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.live.plugin.atype.flexalocal.good.a;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.ItemCategory;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.ButtonStateHelper;
import com.taobao.taolive.room.utils.aw;
import com.taobao.taolive.sdk.model.common.LiveItem;
import com.taobao.taolive.sdk.utils.g;
import com.taobao.taolive.sdk.utils.l;
import com.taobao.taolive.sdk.utils.q;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public class hit {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1858606472);
    }

    public static HashMap<String, String> a(c cVar, LiveItem liveItem) {
        boolean z;
        boolean z2;
        boolean z3;
        JSONObject b;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        JSONArray jSONArray;
        JSONObject jSONObject3;
        IpChange ipChange = $ipChange;
        boolean z4 = true;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("e127a24d", new Object[]{cVar, liveItem});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        if (liveItem == null) {
            return hashMap;
        }
        if (liveItem.liveItemStatusData != null) {
            z = liveItem.liveItemStatusData.getBooleanValue("isSpeaking");
            z2 = liveItem.liveItemStatusData.getBooleanValue("isHotItemPreheat");
        } else {
            z = false;
            z2 = false;
        }
        String str = "0";
        hashMap.put("if_explaining", z ? "1" : str);
        if (z2) {
            hashMap.put("liveItemTags", "hotItemPreheat01");
        }
        if (liveItem.extendVal != null) {
            hashMap.put("if_anchorbenefit", StringUtils.isEmpty(liveItem.extendVal.customizedItemRights) ? str : "1");
        }
        hashMap.put("item_kind", c(liveItem));
        hashMap.put("button_status", d(liveItem));
        if (liveItem.itemExtData != null && StringUtils.equals(liveItem.native_buttonStatus, ButtonStateHelper.ButtonState.SINGLE_DEFAULT_NEWBUY.getValue())) {
            boolean equals = StringUtils.equals(liveItem.itemExtData.getString("enableCart"), "true");
            StringBuilder sb = new StringBuilder();
            sb.append("addCart_");
            sb.append(equals ? "1" : str);
            String sb2 = sb.toString();
            boolean equals2 = StringUtils.equals(liveItem.itemExtData.getString("enableBuy"), "true");
            StringBuilder sb3 = new StringBuilder();
            sb3.append(sb2);
            sb3.append("@buyNow_");
            sb3.append(equals2 ? "1" : str);
            hashMap.put("buttonclickstatus", sb3.toString());
        }
        hashMap.put("item_wyswyg", a.a().e(cVar) == liveItem.itemId ? "1" : str);
        hashMap.put("item_id", Long.toString(liveItem.itemId));
        if (b(liveItem)) {
            hashMap.put("item_atmospheretype", "hot");
        }
        if (liveItem.itemExtData != null) {
            hashMap.put("hidePrice", liveItem.itemExtData.getBooleanValue("hidePrice") ? "1" : str);
            if (!liveItem.itemExtData.containsKey("giftActivityInfo") || liveItem.itemExtData.getJSONObject("giftActivityInfo") == null) {
                z4 = false;
            }
            if (liveItem.itemExtData.containsKey("itemBenefitLabels") && (jSONArray = liveItem.itemExtData.getJSONArray("itemBenefitLabels")) != null && jSONArray.size() > 0 && (jSONObject3 = jSONArray.getJSONObject(0)) != null && jSONObject3.containsKey("type")) {
                hashMap.put("benefitType", jSONObject3.getString("type"));
            }
        } else {
            z4 = false;
        }
        if (z4) {
            hashMap.put("is_bogo", "1");
        }
        String g = hiq.g(liveItem);
        if (!StringUtils.isEmpty(g)) {
            hashMap.put("scene", g);
        }
        if (liveItem.extraUTParams != null && !liveItem.extraUTParams.isEmpty()) {
            String str2 = liveItem.extraUTParams.get("aggregation_type");
            String str3 = liveItem.extraUTParams.get("aggregation_id");
            String str4 = liveItem.extraUTParams.get("aggregation_source");
            if (!StringUtils.isEmpty(str3)) {
                hashMap.put("aggregation_id", str3);
            }
            if (!StringUtils.isEmpty(str2)) {
                hashMap.put("aggregation_type", str2);
            }
            if (!StringUtils.isEmpty(str4)) {
                hashMap.put("aggregation_source", str4);
            }
        }
        hashMap.put("itemSourceType", com.taobao.taolive.sdk.goodlist.c.b(liveItem) ? "1" : str);
        if (liveItem.personalityData != null) {
            if (liveItem.personalityData.getJSONArray("itemGifts") != null && !liveItem.personalityData.getJSONArray("itemGifts").isEmpty()) {
                hashMap.put("gift_id", liveItem.personalityData.getJSONArray("itemGifts").getJSONObject(0).getString(aw.PARAM_OPEN_REWARD_GIFT_ID));
            }
            z3 = StringUtils.equals(liveItem.personalityData.getString("subscribeStatus"), "1");
            if (!StringUtils.isEmpty(liveItem.personalityData.getString("priceTip"))) {
                hashMap.put("priceTip", liveItem.personalityData.getString("priceTip"));
            }
            if (liveItem.personalityData.getJSONArray("itemPriceCompetitiveDesc") != null && !liveItem.personalityData.getJSONArray("itemPriceCompetitiveDesc").isEmpty() && (jSONObject2 = liveItem.personalityData.getJSONArray("itemPriceCompetitiveDesc").getJSONObject(0)) != null && jSONObject2.containsKey("text")) {
                hashMap.put("itemPriceCompetitiveDesc", jSONObject2.getString("text"));
            }
            if (liveItem.personalityData.getJSONArray("itemServiceTagDTOList") != null) {
                String a2 = a(liveItem.personalityData.getJSONArray("itemServiceTagDTOList"), "bizType", "&", 2);
                if (!StringUtils.isEmpty(a2)) {
                    hashMap.put("serviceTypes", a2);
                }
            }
            if (liveItem.personalityData.getJSONObject("vipCardInfo") != null) {
                hashMap.put("vipAmount", liveItem.personalityData.getJSONObject("vipCardInfo").getString("vipCardAmount"));
            }
        } else {
            z3 = false;
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append("1_");
        sb4.append(z3 ? "1" : str);
        hashMap.put("subscribe", sb4.toString());
        if (liveItem.itemExtData != null) {
            hashMap.put("if_price", g.a(liveItem.itemExtData, "hidePrice", false) ? str : "1");
            JSONObject jSONObject4 = liveItem.itemExtData.getJSONObject("itemListTrackData");
            if (jSONObject4 != null) {
                if (cVar != null && cVar.C() != null && jSONObject4.containsKey("isStressShow")) {
                    jSONObject4.put("isStressShow", (Object) (cVar.C().F ? "N" : "Y"));
                }
                HashMap<String, String> c = c(jSONObject4);
                if (c != null && !c.isEmpty()) {
                    hashMap.putAll(c);
                }
            }
        }
        if (liveItem.native_itemBenefits != null && !liveItem.native_itemBenefits.isEmpty()) {
            if (liveItem.native_itemBenefits.getJSONObject(0) != null) {
                hashMap.put("sellatmosphere_type", liveItem.native_itemBenefits.getJSONObject(0).getString("type"));
                hashMap.put("sellatmosphere_servicetag", liveItem.native_itemBenefits.getJSONObject(0).getBooleanValue("needServiceTag") ? "1" : str);
            } else {
                q.b("GoodsTrackUtils", "native_itemBenefits is empty");
            }
        }
        if (liveItem.picTopLabels != null && liveItem.picTopLabels.size() > 0 && (jSONObject = liveItem.picTopLabels.getJSONObject(0)) != null) {
            hashMap.put("picTopLabel", jSONObject.getString("labelType"));
        }
        String a3 = a(liveItem.itemIcons, "bizType", "&", 2);
        if (!StringUtils.isEmpty(a3)) {
            hashMap.put("nameIconTypes", a3);
        }
        if (com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.a.a(cVar)) {
            str = "1";
        }
        hashMap.put("isNewGLPage", str);
        if (liveItem.extendVal != null && !StringUtils.isEmpty(liveItem.extendVal.secKillInfo) && (b = pqj.b(liveItem.extendVal.secKillInfo)) != null) {
            hashMap.put("activityType", b.getString("activityType"));
        }
        hashMap.put("showPrice", hiq.j(liveItem));
        String f = hiq.f(liveItem);
        if (!StringUtils.isEmpty(f)) {
            hashMap.put("itemPriceDesc", f);
        }
        hashMap.put("dataScene", (liveItem.nativeConfigInfos == null || !liveItem.nativeConfigInfos.containsKey("dataScene")) ? "mtop" : liveItem.nativeConfigInfos.getString("dataScene"));
        hashMap.put("gl_version", "1");
        a(cVar, hashMap);
        return hashMap;
    }

    public static void a(c cVar, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbca0dc4", new Object[]{cVar, hashMap});
        } else if (hashMap != null && cVar != null && cVar.O != null) {
            String str = cVar.O.categoryId;
            hashMap.put("categoryId", str);
            hashMap.put("categoryName", cVar.O.name);
            List<ItemCategory> a2 = qna.a(cVar);
            if (a2 != null && !a2.isEmpty() && !StringUtils.isEmpty(str)) {
                for (int i = 0; i < a2.size(); i++) {
                    if (StringUtils.equals(a2.get(i).categoryId, str)) {
                        hashMap.put("class_number", String.valueOf(i));
                    }
                }
                hashMap.put("class_total", String.valueOf(a2.size()));
                return;
            }
            hashMap.put("class_number", "0");
            hashMap.put("class_total", "0");
        }
    }

    public static boolean b(LiveItem liveItem) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("34ae4648", new Object[]{liveItem})).booleanValue();
        }
        if (liveItem != null && liveItem.itemExtData != null && liveItem.itemExtData.containsKey("itemSellingTotal")) {
            String string = liveItem.itemExtData.getString("itemSellingTotal");
            if (!StringUtils.equals(string, "0") && !StringUtils.isEmpty(string)) {
                z = true;
                return !z && (liveItem == null && liveItem.liveItemStatusData != null && liveItem.liveItemStatusData.containsKey("isSpeaking") && StringUtils.equals(liveItem.liveItemStatusData.getString("isSpeaking"), "true"));
            }
        }
        z = false;
        if (!z) {
        }
    }

    public static String c(LiveItem liveItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fd4e7b3b", new Object[]{liveItem});
        }
        ArrayList arrayList = new ArrayList();
        if (liveItem.extendVal != null) {
            if ("secKill".equals(liveItem.extendVal.itemBizType)) {
                arrayList.add("2");
            }
            if (StringUtils.equals("1", liveItem.extendVal.isYanxuan)) {
                arrayList.add("6");
            }
            if (hiq.b(liveItem)) {
                arrayList.add("8");
            }
            if (hiq.e(liveItem)) {
                arrayList.add("9");
            }
        }
        if (liveItem.liveItemStatusData != null) {
            if (liveItem.liveItemStatusData.getBooleanValue("isTop")) {
                arrayList.add("5");
            }
            if (StringUtils.equals("true", liveItem.liveItemStatusData.getString("isYanXuanHot"))) {
                arrayList.add("7");
            }
            if (liveItem.liveItemStatusData.getBooleanValue("isPreHeat")) {
                arrayList.add("10");
            }
        }
        if (arrayList.size() == 0) {
            arrayList.add("1");
        }
        return l.a((List<String>) arrayList, '@');
    }

    private static String d(LiveItem liveItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("99bc779a", new Object[]{liveItem});
        }
        if (liveItem.liveItemStatusData != null && (liveItem.liveItemStatusData.getBooleanValue("isGray") || liveItem.liveItemStatusData.getBooleanValue("isDownShelf"))) {
            return "1";
        }
        if (liveItem.itemExtData != null) {
            if (StringUtils.equals("0", liveItem.itemExtData.getString("timingUpShelfStatus"))) {
                return "6";
            }
            String string = liveItem.itemExtData.getString("preSaleStatus");
            if (StringUtils.equals("0", string)) {
                return StringUtils.equals("1", liveItem.itemExtData.getString("subscribeStatus")) ? "3" : "2";
            } else if (StringUtils.equals("1", string)) {
                return "4";
            }
        }
        return "0";
    }

    public static void a(c cVar, String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f792ecc", new Object[]{cVar, str, map});
        } else if (StringUtils.isEmpty(str) || a.a().j() == null) {
        } else {
            HashMap<String, String> hashMap = new HashMap<>();
            if (map != null) {
                hashMap.putAll(map);
            }
            a.a().j().a("gl_error", hashMap);
        }
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
            return;
        }
        his.b("GoodsTrackUtils", "trackDataOptError | reason=" + str);
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("reason", str);
        if (a.a().j() == null) {
            return;
        }
        a.a().j().a("gl_dataopt", hashMap);
    }

    public static void a(DXRuntimeContext dXRuntimeContext, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("571bd26d", new Object[]{dXRuntimeContext, str, str2});
            return;
        }
        his.b("GoodsTrackUtils", "trackGLHandlerContextError | reason=" + str + " className=" + str2);
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("reason", str);
        hashMap.put("className", str2);
        hashMap.put("template", (dXRuntimeContext == null || dXRuntimeContext.c() == null) ? "no" : dXRuntimeContext.c().f());
        if (a.a().j() == null) {
            return;
        }
        a.a().j().a("gl_dataopt", hashMap);
    }

    public static void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{jSONObject});
        } else if (jSONObject == null) {
            his.b("GoodsTrackUtils", "handleTopOperate resultData  is null.");
        } else {
            JSONArray jSONArray = jSONObject.getJSONArray("carouselListV2");
            if (jSONArray == null || jSONArray.isEmpty()) {
                q.b("GoodsTrackUtils", "handleTopOperate resultDataJsonObj  is null.");
                return;
            }
            for (int i = 0; i < jSONArray.size(); i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                if (jSONObject2 != null) {
                    String string = jSONObject2.getString("type");
                    if (!StringUtils.isEmpty(string)) {
                        HashMap<String, String> hashMap = new HashMap<>();
                        hashMap.put("type", string);
                        if (a.a().j() != null) {
                            a.a().j().b("Show-GoodList_New", hashMap);
                        }
                    }
                }
            }
        }
    }

    public static void a(JSONObject jSONObject, boolean z) {
        String a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a79284c", new Object[]{jSONObject, new Boolean(z)});
            return;
        }
        List<String> b = b(jSONObject);
        if (b == null || b.isEmpty()) {
            return;
        }
        HashMap<String, String> hashMap = new HashMap<>();
        if (!z) {
            if (b.size() > 2) {
                b = b.subList(0, 2);
                a2 = l.a(b, '@') + "&more";
            } else {
                a2 = l.a(b, '@');
            }
            a(jSONObject, b, hashMap);
        } else {
            a2 = l.a(b.subList(2, b.size()), '@');
        }
        hashMap.put("types", a2);
        hashMap.put("gl_scene", z ? "pop" : "top");
        if (a.a().j() == null) {
            return;
        }
        a.a().j().b("Show-gl_entry", hashMap);
    }

    private static List<String> b(JSONObject jSONObject) {
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("cca20740", new Object[]{jSONObject});
        }
        ArrayList arrayList = null;
        if (jSONObject != null && jSONObject.containsKey("topRightEntranceList") && (jSONArray = jSONObject.getJSONArray("topRightEntranceList")) != null && !jSONArray.isEmpty()) {
            arrayList = new ArrayList();
            Iterator<Object> it = jSONArray.iterator();
            while (it.hasNext()) {
                JSONObject jSONObject2 = (JSONObject) it.next();
                if (jSONObject2 != null) {
                    String string = jSONObject2.getString("type");
                    if (!StringUtils.isEmpty(string)) {
                        arrayList.add(string);
                    }
                }
            }
        }
        return arrayList;
    }

    private static void a(JSONObject jSONObject, List<String> list, HashMap<String, String> hashMap) {
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ec66c9a", new Object[]{jSONObject, list, hashMap});
        } else if (jSONObject == null || list == null || hashMap == null || (jSONArray = jSONObject.getJSONArray("topRightEntranceList")) == null || jSONArray.isEmpty()) {
        } else {
            Iterator<Object> it = jSONArray.iterator();
            while (it.hasNext()) {
                JSONObject jSONObject2 = (JSONObject) it.next();
                if (jSONObject2 != null) {
                    String string = jSONObject2.getString("type");
                    if (!StringUtils.isEmpty(string) && list.contains(string)) {
                        String string2 = jSONObject2.getString("count");
                        if (!StringUtils.isEmpty(string2)) {
                            hashMap.put(string + "_count", string2);
                        }
                    }
                }
            }
            JSONObject jSONObject3 = jSONObject.getJSONObject("broadCaster");
            JSONArray jSONArray2 = jSONObject.getJSONArray("extraGoodsTabList");
            if (jSONObject3 == null || jSONObject3.isEmpty() || jSONArray2 == null || jSONArray2.size() != 1) {
                return;
            }
            hashMap.put("entrance_type", jSONObject3.getString("type"));
        }
    }

    private static String a(JSONArray jSONArray, String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ba33f9a1", new Object[]{jSONArray, str, str2, new Integer(i)});
        }
        if (jSONArray == null || StringUtils.isEmpty(str) || StringUtils.isEmpty(str2)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < jSONArray.size() && i2 < i; i2++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i2);
            if (jSONObject != null) {
                String string = jSONObject.getString(str);
                if (!StringUtils.isEmpty(string)) {
                    if (!StringUtils.isEmpty(sb)) {
                        sb.append(str2);
                    }
                    sb.append(string);
                }
            }
        }
        return sb.toString();
    }

    public static void a(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6635bcfe", new Object[]{str, jSONObject});
        } else if (jSONObject == null) {
        } else {
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put("scene_code", jSONObject.getString("popId"));
            hashMap.put("link_node_key", "halfscreen_detail_page_show");
            hashMap.put("status", str);
            hashMap.put("data", jSONObject.toJSONString());
            if ("fail".equals(str)) {
                hashMap.put("errorCode", "request_error");
                hashMap.put("errorMessage", "request_error");
            }
            if (a.a().j() == null) {
                return;
            }
            a.a().j().a("full_link_monitoring", hashMap);
        }
    }

    public static HashMap<String, String> c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("154a04a9", new Object[]{jSONObject});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        if (jSONObject != null) {
            try {
                if (jSONObject.keySet().size() > 0) {
                    for (String str : jSONObject.keySet()) {
                        String valueOf = String.valueOf(str);
                        Object obj = jSONObject.get(valueOf);
                        if (obj instanceof String) {
                            hashMap.put(valueOf, (String) obj);
                        } else {
                            hashMap.put(valueOf, URLEncoder.encode(JSON.toJSONString(obj), "utf-8"));
                        }
                    }
                }
            } catch (Exception e) {
                his.b(b.f3363a, e.getMessage());
            }
        }
        return hashMap;
    }
}
