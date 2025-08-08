package com.taobao.message.notification.util;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import tb.kge;

/* loaded from: classes7.dex */
public class SwitchUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(937497146);
    }

    public static boolean isNewLocalPush() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4bf3a6ba", new Object[0])).booleanValue() : StringUtils.equals("1", OrangeConfig.getInstance().getConfig("mpm_business_switch", "useNewLocalPush", "1"));
    }
}
