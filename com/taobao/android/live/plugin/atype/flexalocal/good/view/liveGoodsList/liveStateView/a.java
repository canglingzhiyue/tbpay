package com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes6.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1670068875);
    }

    public static boolean a(JSONObject jSONObject, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4a78ec40", new Object[]{jSONObject, new Long(j)})).booleanValue();
        }
        if (jSONObject == null || jSONObject.isEmpty()) {
            return true;
        }
        long a2 = com.taobao.taolive.sdk.utils.g.a(jSONObject, "showStartTime", -1L);
        long a3 = com.taobao.taolive.sdk.utils.g.a(jSONObject, "showEndTime", -1L);
        if (a3 <= 0) {
            return true;
        }
        return a2 <= 0 ? j <= a3 : a2 < j && j <= a3;
    }

    public static boolean b(JSONObject jSONObject, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1379e381", new Object[]{jSONObject, new Long(j)})).booleanValue();
        }
        if (jSONObject == null || jSONObject.isEmpty()) {
            return true;
        }
        long a2 = com.taobao.taolive.sdk.utils.g.a(jSONObject, "startTime", -1L);
        long a3 = com.taobao.taolive.sdk.utils.g.a(jSONObject, "endTime", -1L);
        if (a3 <= 0) {
            return true;
        }
        return a2 <= 0 ? j <= a3 : a2 < j && j <= a3;
    }
}
