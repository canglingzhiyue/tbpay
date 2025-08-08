package com.taobao.taolive.sdk.goodlist;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.model.common.LiveItem;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import java.util.Map;
import tb.kge;

/* loaded from: classes8.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-951615128);
    }

    public static String a(VideoInfo.ExtraGoodsTabItem extraGoodsTabItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7115f899", new Object[]{extraGoodsTabItem});
        }
        return "" + extraGoodsTabItem.type + "_" + extraGoodsTabItem.title;
    }

    public static String a(LiveItem liveItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c472827d", new Object[]{liveItem});
        }
        if (liveItem != null && liveItem.extendVal != null) {
            return liveItem.extendVal.scene;
        }
        return null;
    }

    public static boolean a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8123ece6", new Object[]{str, new Boolean(z)})).booleanValue() : StringUtils.equals("1", str) && !z;
    }

    public static void a(Map<String, String> map, JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0fa073", new Object[]{map, jSONObject});
        } else if (map == null || jSONObject == null || !jSONObject.containsKey("itemExtData") || (jSONObject2 = jSONObject.getJSONObject("itemExtData")) == null || !jSONObject2.containsKey("preSaleStatus")) {
        } else {
            map.put("pre", jSONObject2.getString("preSaleStatus"));
            String str = "1";
            if (!StringUtils.equals(str, jSONObject2.getString("subscribeStatus"))) {
                str = "2";
            }
            map.put("preset", str);
        }
    }

    public static void a(Map<String, String> map, LiveItem liveItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e33d1978", new Object[]{map, liveItem});
        } else if (map == null || liveItem == null || liveItem.itemExtData == null || !liveItem.itemExtData.containsKey("preSaleStatus")) {
        } else {
            map.put("pre", liveItem.itemExtData.getString("preSaleStatus"));
            String str = "1";
            if (!StringUtils.equals(str, liveItem.itemExtData.getString("subscribeStatus"))) {
                str = "2";
            }
            map.put("preset", str);
        }
    }

    public static boolean b(LiveItem liveItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("34ae4648", new Object[]{liveItem})).booleanValue();
        }
        if (liveItem != null && liveItem.extendVal != null) {
            return StringUtils.equals(liveItem.extendVal.itemSourceType, "1");
        }
        return false;
    }
}
