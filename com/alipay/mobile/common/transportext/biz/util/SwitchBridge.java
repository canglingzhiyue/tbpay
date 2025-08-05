package com.alipay.mobile.common.transportext.biz.util;

import com.alipay.mobile.common.netsdkextdependapi.configservice.NwConfigServiceUtil;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class SwitchBridge {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static String getSwitchFromOriginal(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("18704baa", new Object[]{str});
        }
        try {
            return NwConfigServiceUtil.getConfig(str);
        } catch (Throwable th) {
            LogCatUtil.error("SwitchBridge", th);
            return null;
        }
    }
}
