package com.taobao.tao.navigation;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class k {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a(List<g> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{list});
        } else if (list != null) {
            JSONArray jSONArray = new JSONArray();
            for (g gVar : list) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("title", (Object) gVar.c());
                Map<String, String> h = gVar.h();
                if (h != null) {
                    jSONObject.put("spm", (Object) h.get("spm-url"));
                } else {
                    jSONObject.put("spm", (Object) null);
                }
                jSONArray.add(jSONObject);
            }
            HashMap hashMap = new HashMap();
            hashMap.put("TabItem", jSONArray.toJSONString());
            UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder("Page_MainTab", 2201, "ShowTab", null, null, hashMap).build());
        }
    }

    private static void a(String str, String str2, String str3, String str4, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd745073", new Object[]{str, str2, str3, str4, new Integer(i)});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("augeTrackInfo", str4);
        String str5 = str + "_" + str2 + "_" + str3;
        UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder("Page_Home", i, "Page_Home_Show-bottomBar", str5, null, hashMap).build());
        TLog.loge(a.a(), "UTWrapper", "commonMarkAndAlienEffectSendUT bizType:" + str + " arg2:" + str5 + " trackInfo:" + str4 + " eventId:" + i);
    }

    public static void a(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee2b490", new Object[]{str, str2, str3, str4});
        } else {
            a(str, str2, str3, str4, 2201);
        }
    }

    public static void b(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb13311", new Object[]{str, str2, str3, str4});
        } else {
            a(str, str2, str3, str4, 2101);
        }
    }
}
