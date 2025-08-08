package com.taobao.avplayer;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.statistic.CT;
import com.taobao.taobaoavsdk.CodeUsageCounter;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTHitBuilders;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes6.dex */
public class ak implements as {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(518885096);
        kge.a(151024933);
    }

    @Override // com.taobao.avplayer.as
    public void a(String str, String str2, String str3, Map<String, String> map, Map<String, String> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90ec7726", new Object[]{this, str, str2, str3, map, map2});
            return;
        }
        CodeUsageCounter.a().a(CodeUsageCounter.componentName.dw_adapter_DWUserTrackAdapter);
        if ("expose".equals(str2)) {
            a(str, map, map2);
        }
        if (str == null || str2 == null || str3 == null || map == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        if (map2 != null) {
            hashMap.putAll(map2);
        }
        hashMap.putAll(map);
        UTHitBuilders.UTControlHitBuilder uTControlHitBuilder = new UTHitBuilders.UTControlHitBuilder("Page_" + str, CT.valueOf(str2) + "-" + str3);
        uTControlHitBuilder.setProperties(hashMap);
        UTAnalytics.getInstance().getDefaultTracker().send(uTControlHitBuilder.build());
    }

    @Override // com.taobao.avplayer.as
    public void a(String str, String str2, int i, String str3, String str4, String str5, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b869140", new Object[]{this, str, str2, new Integer(i), str3, str4, str5, map});
            return;
        }
        CodeUsageCounter.a().a(CodeUsageCounter.componentName.dw_adapter_DWUserTrackAdapter);
        UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder("Page_DWVideo", i, str3, str4, str5, map).build());
    }

    public void a(String str, Map<String, String> map, Map<String, String> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb874e12", new Object[]{this, str, map, map2});
            return;
        }
        CodeUsageCounter.a().a(CodeUsageCounter.componentName.dw_adapter_DWUserTrackAdapter);
        if (StringUtils.isEmpty(str)) {
            return;
        }
        HashMap hashMap = new HashMap();
        if (map != null) {
            hashMap.putAll(map);
        }
        if (map2 != null) {
            hashMap.putAll(map2);
        }
        UTHitBuilders.UTCustomHitBuilder uTCustomHitBuilder = new UTHitBuilders.UTCustomHitBuilder(str);
        uTCustomHitBuilder.setEventPage(str);
        uTCustomHitBuilder.setProperties(hashMap);
        UTAnalytics.getInstance().getDefaultTracker().send(uTCustomHitBuilder.build());
    }
}
