package com.taobao.android.live.plugin.atype.flexalocal.good.track;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.dx.hanlerimpl.ExpansionRPGetter;
import com.taobao.taolive.room.utils.aw;
import com.taobao.taolive.sdk.utils.g;
import java.util.HashMap;
import tb.hiw;
import tb.kge;
import tb.qna;

/* loaded from: classes5.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(103032638);
    }

    public static void a(String str, com.taobao.taolive.sdk.goodlist.a aVar, int i, int i2, com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c cVar) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        int i3 = i;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9a65ba0", new Object[]{str, aVar, new Integer(i3), new Integer(i2), cVar});
        } else if (com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.a.n()) {
            d.a(str, aVar, i, i2, cVar);
        } else {
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put("item_id", aVar.e);
            String str2 = "1";
            if (aVar.b != null && aVar.b.getJSONObject("extendVal") != null) {
                JSONObject jSONObject3 = aVar.b.getJSONObject("extendVal");
                hashMap.put("itemBizType", jSONObject3.getString("itemBizType"));
                hashMap.put("isYanxuan", jSONObject3.getString("isYanxuan"));
                if (!TextUtils.isEmpty(jSONObject3.getString(aw.PARAM_PLAY_URL))) {
                    hashMap.put("kanjiangjie", str2);
                }
            }
            if (aVar.b != null && (jSONObject2 = aVar.b.getJSONObject("personalityData")) != null && TextUtils.equals(jSONObject2.getString("goodsSubscribeStatus"), "102")) {
                hashMap.put("kaijiangtixing", str2);
            }
            JSONObject jSONObject4 = aVar.b.getJSONObject("nativeConfigInfos");
            if (jSONObject4 != null && (jSONObject = jSONObject4.getJSONObject("expansionRedPacket")) != null && !jSONObject.isEmpty()) {
                ExpansionRPGetter.a(jSONObject, hashMap);
                z = true;
            }
            if (!z) {
                str2 = "0";
            }
            hashMap.put("is_expansion", str2);
            com.taobao.taolive.sdk.goodlist.c.a(hashMap, aVar.b);
            if (aVar.g != null) {
                hashMap.putAll(aVar.g);
            }
            if (i3 >= i2) {
                i3 -= i2;
            }
            hashMap.put("item_position", String.valueOf(i3 + 1));
            hashMap.put("item_index", String.valueOf(aVar.c));
            JSONObject jSONObject5 = aVar.b.getJSONObject("liveItemStatusData");
            if (jSONObject5 != null) {
                if (jSONObject5.containsKey("isGray")) {
                    hashMap.put("isGray", jSONObject5.getString("isGray"));
                }
                if (jSONObject5.containsKey("isDownShelf")) {
                    hashMap.put("isDownShelf", jSONObject5.getString("isDownShelf"));
                }
            }
            hashMap.put("glopenfrom", TextUtils.isEmpty(qna.d(cVar)) ? "" : qna.d(cVar));
            if (aVar.f21830a == 8) {
                if (aVar.b.containsKey("type")) {
                    hashMap.put("type", "top_card_" + aVar.b.get("type"));
                }
                if (com.taobao.android.live.plugin.atype.flexalocal.good.a.a().j() != null) {
                    com.taobao.android.live.plugin.atype.flexalocal.good.a.a().j().b("Show-SpecialSelectExplain", hashMap);
                }
            } else if (aVar.f21830a == 1) {
                if (com.taobao.android.live.plugin.atype.flexalocal.good.a.a().j() != null) {
                    com.taobao.android.live.plugin.atype.flexalocal.good.a.a().j().b("Show-entryquanyi", hashMap);
                    if (hiw.l()) {
                        a(aVar);
                    }
                }
            } else if (aVar.f21830a == 2) {
                if (com.taobao.android.live.plugin.atype.flexalocal.good.a.a().j() != null) {
                    HashMap<String, String> hashMap2 = null;
                    if (cVar != null && cVar.e() != null && !TextUtils.isEmpty(cVar.e().utParams)) {
                        hashMap2 = a(cVar.e().utParams);
                    }
                    com.taobao.android.live.plugin.atype.flexalocal.good.a.a().j().b("GoodsListExchange_RedPacket", hashMap2);
                }
            } else if ((aVar.f21830a == 7 || aVar.f21830a == 6 || aVar.f21830a == 4) && !TextUtils.isEmpty(aVar.e) && com.taobao.android.live.plugin.atype.flexalocal.good.a.a().j() != null) {
                com.taobao.android.live.plugin.atype.flexalocal.good.a.a().j().b("Show-detail", hashMap);
            }
            if (aVar.b != null && aVar.b.getJSONObject("extendVal") != null && !TextUtils.isEmpty(aVar.b.getJSONObject("extendVal").getString(aw.PARAM_PLAY_URL))) {
                if (com.taobao.android.live.plugin.atype.flexalocal.good.a.a().j() == null) {
                    return;
                }
                com.taobao.android.live.plugin.atype.flexalocal.good.a.a().j().b("Show-kanjiangjie", hashMap);
            } else if (aVar.b == null || aVar.b.getJSONObject("personalityData") == null || !"102".equals(aVar.b.getJSONObject("personalityData").getString("goodsSubscribeStatus")) || com.taobao.android.live.plugin.atype.flexalocal.good.a.a().j() == null) {
            } else {
                com.taobao.android.live.plugin.atype.flexalocal.good.a.a().j().b("Show-kaijiangtixing", hashMap);
            }
        }
    }

    private static void a(com.taobao.taolive.sdk.goodlist.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbfce2a3", new Object[]{aVar});
        } else if (aVar == null || aVar.b == null) {
        } else {
            JSONObject jSONObject = aVar.b;
            JSONObject jSONObject2 = aVar.b.getJSONObject("growthZone");
            if (jSONObject2 != null && jSONObject2.size() > 0) {
                String str = "Show-entryquanyi-" + jSONObject2.getString("type");
                HashMap<String, String> hashMap = new HashMap<>();
                if (jSONObject2.getJSONObject("utParams") != null) {
                    hashMap.putAll(g.a(jSONObject2.getJSONObject("utParams")));
                }
                com.taobao.android.live.plugin.atype.flexalocal.good.a.a().j().b(str, hashMap);
                return;
            }
            int a2 = a(aVar.b);
            if (jSONObject.containsKey("intimacyCoin") && jSONObject.getJSONObject("intimacyCoin") != null) {
                HashMap<String, String> hashMap2 = new HashMap<>();
                hashMap2.put("bannerCount", String.valueOf(a2));
                com.taobao.android.live.plugin.atype.flexalocal.good.a.a().j().b("pocket-bean-show", hashMap2);
            }
            if (!jSONObject.containsKey("rightCdp") || jSONObject.getJSONObject("rightCdp") == null) {
                return;
            }
            JSONObject jSONObject3 = jSONObject.getJSONObject("rightCdp");
            HashMap<String, String> hashMap3 = new HashMap<>();
            hashMap3.put("bannerCount", String.valueOf(a2));
            hashMap3.put("bizType", jSONObject3.getString("source"));
            com.taobao.android.live.plugin.atype.flexalocal.good.a.a().j().b("rightCdp-show", hashMap3);
        }
    }

    private static int a(JSONObject jSONObject) {
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("266fb7b", new Object[]{jSONObject})).intValue();
        }
        try {
            if (jSONObject.containsKey("rights") && (jSONArray = jSONObject.getJSONArray("rights")) != null && jSONArray.size() > 0) {
                i = 1;
            }
            if (jSONObject.containsKey("rightCdp")) {
                i++;
            }
            return jSONObject.containsKey("intimacyCoin") ? i + 1 : i;
        } catch (Exception unused) {
            return i;
        }
    }

    private static HashMap<String, String> a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("a40d9915", new Object[]{str});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        for (String str2 : str.split(",")) {
            String[] split = str2.split("=");
            hashMap.put(split[0], split[1]);
        }
        return hashMap;
    }
}
