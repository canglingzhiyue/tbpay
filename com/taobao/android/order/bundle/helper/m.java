package com.taobao.android.order.bundle.helper;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.HashMap;
import tb.hyn;
import tb.kge;

/* loaded from: classes6.dex */
public class m {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(437024206);
    }

    public static void a(com.alibaba.android.ultron.vfw.instance.d dVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59117", new Object[]{dVar, str});
        } else if (dVar == null || dVar.x() == null) {
            HashMap hashMap = new HashMap();
            hashMap.put("error", "no_data");
            UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder("CCOScreenShot", 19997, "tbLogistics", null, null, hashMap).build());
        } else {
            try {
                JSONObject jSONObject = dVar.x().c().getJSONObject("events").getJSONObject("utExplosure").getJSONObject("fields").getJSONObject("args");
                HashMap hashMap2 = new HashMap();
                for (String str2 : jSONObject.keySet()) {
                    hashMap2.put(str2, jSONObject.getString(str2));
                }
                hyn.a(str, "screenshot", hashMap2.toString());
                UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder("CCOScreenShot", 19997, "tbLogistics", null, null, hashMap2).build());
            } catch (Throwable unused) {
            }
        }
    }
}
