package com.alipay.mobile.common.netsdkextdependapi.lbs;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class LbsInfoUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static String getKeyLBSInfo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("52bd5f97", new Object[0]) : a().getKeyLBSInfo();
    }

    public static String getExtLbsInfo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("78d67059", new Object[0]) : a().getExtLbsInfo();
    }

    public static double getLatitude() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7b6fad57", new Object[0])).doubleValue() : a().getLatitude();
    }

    public static double getLongitude() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b61adaee", new Object[0])).doubleValue() : a().getLongitude();
    }

    public static Long getLocationtime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Long) ipChange.ipc$dispatch("92019036", new Object[0]) : a().getLocationtime();
    }

    private static final LbsInfoManager a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LbsInfoManager) ipChange.ipc$dispatch("a1f18372", new Object[0]) : LbsInfoManagerFactory.getInstance().getDefaultBean();
    }
}
