package com.taobao.android.live.plugin.atype.flexalocal.good.track;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.utils.ag;
import com.taobao.taolive.sdk.goodlist.l;
import com.taobao.taolive.sdk.model.common.LiveItem;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import java.util.HashMap;
import java.util.Map;
import tb.hit;
import tb.kge;
import tb.pmd;
import tb.xjs;

/* loaded from: classes5.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-2082247692);
    }

    public static void a(com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c cVar, LiveItem liveItem, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85f4a6db", new Object[]{cVar, liveItem, map});
            return;
        }
        l j = com.taobao.android.live.plugin.atype.flexalocal.good.a.a().j();
        if (j == null || liveItem == null) {
            return;
        }
        HashMap<String, String> a2 = hit.a(cVar, liveItem);
        if (map != null) {
            a2.putAll(map);
        }
        j.a("itemwindowclick", a2);
    }

    public static void a(com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c cVar, LiveItem liveItem, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7eb02cd9", new Object[]{cVar, liveItem, new Integer(i)});
            return;
        }
        l j = com.taobao.android.live.plugin.atype.flexalocal.good.a.a().j();
        if (j == null || liveItem == null) {
            return;
        }
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("item_kind", hit.c(liveItem));
        hashMap.put("item_id", liveItem.itemId + "");
        hashMap.put("position", i + "");
        j.a("Additionitem", hashMap);
    }

    public static void a(com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c cVar, LiveItem liveItem, VideoInfo videoInfo, String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48a71eb8", new Object[]{cVar, liveItem, videoInfo, str, map});
            return;
        }
        l j = com.taobao.android.live.plugin.atype.flexalocal.good.a.a().j();
        if (j == null || liveItem == null || videoInfo == null) {
            return;
        }
        HashMap<String, String> hashMap = new HashMap<>();
        if (map != null) {
            hashMap.putAll(map);
        }
        if (videoInfo.broadCaster == null) {
            return;
        }
        hashMap.put("item_id", liveItem.itemId + "");
        hashMap.put("feed_id", videoInfo.liveId);
        String str2 = "1";
        hashMap.put(ag.KEY_IS_FANS, videoInfo.broadCaster.follow ? str2 : "0");
        if (liveItem.personalityData != null) {
            a(liveItem.personalityData, hashMap);
        }
        hashMap.put("itemBizType", liveItem.extendVal.itemBizType);
        hashMap.put(com.taobao.tao.infoflow.multitab.viewprovider.tablayout.panel.b.VIEW_TYPE, str);
        hashMap.put("seller_id", videoInfo.broadCaster.accountId);
        if ("secKill".equals(liveItem.extendVal.itemBizType)) {
            str2 = "2";
        }
        hashMap.put("bubbleType", str2);
        com.taobao.taolive.sdk.goodlist.c.a(hashMap, liveItem);
        hashMap.putAll(hit.a(cVar, liveItem));
        j.b("Show-watchshowdetail", hashMap);
    }

    private static void a(JSONObject jSONObject, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d2b992b", new Object[]{jSONObject, hashMap});
            return;
        }
        JSONArray jSONArray = jSONObject.getJSONArray(xjs.f34341a);
        if (jSONArray == null || jSONArray.size() <= 0 || LiveItem.LiveItemBenefitType.getLiveItemBenefitType(jSONArray.getJSONObject(0).getString("type")) != LiveItem.LiveItemBenefitType.NEW_CUSTOMER_BENEFIT) {
            return;
        }
        hashMap.put("newcustomer", "1");
        hashMap.put("is_xxtoubiao", "1");
        hashMap.put("xxc", "tblive");
        hashMap.put("ju_id", jSONObject.getString("juId"));
        hashMap.put("visitor_id", pmd.a().q() != null ? pmd.a().q().a() : "");
    }
}
