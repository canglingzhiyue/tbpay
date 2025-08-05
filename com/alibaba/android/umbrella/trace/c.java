package com.alibaba.android.umbrella.trace;

import android.text.TextUtils;
import android.util.Log;
import com.alibaba.android.umbrella.performance.PerformanceEntity;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import mtopsdk.mtop.util.ErrorConstant;
import tb.its;

/* loaded from: classes2.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue() : TextUtils.isEmpty(str) || str.equals(its.TRAFFIC_LIMIT_STATUS) || str.equals(ErrorConstant.ERRCODE_API_41X_ANTI_ATTACK) || str.equals("FAIL_SYS_USER_VALIDATE") || str.equals("FAIL_LOCAL_ERROR_FANG_XUE_FENG");
    }

    public static PerformanceEntity a(String str, String str2, Map<String, Long> map, Map<String, String> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PerformanceEntity) ipChange.ipc$dispatch("ebaa30ff", new Object[]{str, str2, map, map2});
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || map == null) {
            return null;
        }
        PerformanceEntity performanceEntity = new PerformanceEntity(str, str2, null);
        for (Map.Entry<String, Long> entry : map.entrySet()) {
            Long value = entry.getValue();
            Log.e("UmbrellaUtils", String.valueOf(value));
            performanceEntity.addRecordPoint(entry.getKey(), value.longValue());
        }
        performanceEntity.addArgs(map2);
        return performanceEntity;
    }

    public static boolean b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{str})).booleanValue() : b.f() || TextUtils.isEmpty(str);
    }
}
