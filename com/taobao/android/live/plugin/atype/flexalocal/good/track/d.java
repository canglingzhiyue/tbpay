package com.taobao.android.live.plugin.atype.flexalocal.good.track;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.dx.hanlerimpl.ExpansionRPGetter;
import com.taobao.taolive.room.utils.aw;
import java.util.HashMap;
import tb.kge;
import tb.qna;

/* loaded from: classes5.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1456219774);
    }

    public static void a(String str, com.taobao.taolive.sdk.goodlist.a aVar, int i, int i2, com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c cVar) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9a65ba0", new Object[]{str, aVar, new Integer(i), new Integer(i2), cVar});
            return;
        }
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
        com.taobao.taolive.sdk.goodlist.c.a(hashMap, aVar.b);
        if (aVar.g != null) {
            hashMap.putAll(aVar.g);
        }
        if (i >= i2) {
            i -= i2;
        }
        hashMap.put("item_position", String.valueOf(i + 1));
        hashMap.put("item_index", String.valueOf(aVar.c));
        JSONObject jSONObject4 = aVar.b.getJSONObject("liveItemStatusData");
        if (jSONObject4 != null) {
            if (jSONObject4.containsKey("isGray")) {
                hashMap.put("isGray", jSONObject4.getString("isGray"));
            }
            if (jSONObject4.containsKey("isDownShelf")) {
                hashMap.put("isDownShelf", jSONObject4.getString("isDownShelf"));
            }
        }
        JSONObject jSONObject5 = aVar.b.getJSONObject("nativeConfigInfos");
        if (jSONObject5 != null && (jSONObject = jSONObject5.getJSONObject("expansionRedPacket")) != null && !jSONObject.isEmpty()) {
            ExpansionRPGetter.a(jSONObject, hashMap);
            z = true;
        }
        if (!z) {
            str2 = "0";
        }
        hashMap.put("is_expansion", str2);
        hashMap.put("glopenfrom", TextUtils.isEmpty(qna.d(cVar)) ? "" : qna.d(cVar));
        if (aVar.f21830a == 2) {
            if (com.taobao.android.live.plugin.atype.flexalocal.good.a.a().j() == null) {
                return;
            }
            HashMap<String, String> hashMap2 = null;
            if (cVar != null && cVar.e() != null && !TextUtils.isEmpty(cVar.e().utParams)) {
                hashMap2 = a(cVar.e().utParams);
            }
            com.taobao.android.live.plugin.atype.flexalocal.good.a.a().j().c("GoodsListExchange_RedPacket", hashMap2);
        } else if ((aVar.f21830a != 7 && aVar.f21830a != 6 && aVar.f21830a != 4) || TextUtils.isEmpty(aVar.e) || com.taobao.android.live.plugin.atype.flexalocal.good.a.a().j() == null) {
        } else {
            com.taobao.android.live.plugin.atype.flexalocal.good.a.a().j().c("Show-detail", hashMap);
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
