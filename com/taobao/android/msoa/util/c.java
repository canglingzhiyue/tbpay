package com.taobao.android.msoa.util;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.msoa.m;
import com.taobao.orange.OrangeConfig;

/* loaded from: classes6.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : "true".equalsIgnoreCase(OrangeConfig.getInstance().getConfig(m.ORANGE_GROUP_MSOA_PERMISSION, "is_msoa_v2_report_data", "false"));
    }
}
