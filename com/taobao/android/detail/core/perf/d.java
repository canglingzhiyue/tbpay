package com.taobao.android.detail.core.perf;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import java.util.HashMap;
import java.util.Map;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(228984440);
        emu.a("com.taobao.android.detail.core.perf.TracePropertyUtils");
    }

    public static Map<String, String> a(DetailCoreActivity detailCoreActivity, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("89b9a47c", new Object[]{detailCoreActivity, str, str2});
        }
        HashMap hashMap = new HashMap();
        if (detailCoreActivity == null) {
            return hashMap;
        }
        if (!StringUtils.isEmpty(str)) {
            hashMap.put("fromSource", str);
        }
        if (!StringUtils.isEmpty(str2)) {
            hashMap.put("bucketId", str2);
        }
        com.taobao.android.detail.datasdk.model.datamodel.node.c C = detailCoreActivity.C();
        if (C == null) {
            return hashMap;
        }
        Map<String, String> e = C.e();
        if (e == null && e.isEmpty()) {
            return hashMap;
        }
        if (e.containsKey("serverStableTotalRt")) {
            hashMap.put("serverStableTotalRt", e.get("serverStableTotalRt"));
        }
        if (e.containsKey("serverStableAdpRt")) {
            hashMap.put("serverStableAdpRt", e.get("serverStableAdpRt"));
        }
        if (e.containsKey("traceId")) {
            hashMap.put("traceId", e.get("traceId"));
        }
        return hashMap;
    }
}
