package com.alipay.mobile.common.netsdkextdependapi.configservice;

import com.alipay.mobile.common.netsdkextdependapi.InnerMiscUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.logging.Level;

/* loaded from: classes3.dex */
public final class NwConfigServiceUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static final String getConfig(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d74258f7", new Object[]{str});
        }
        try {
            return NwConfigServiceFactory.getInstance().getDefaultBean().getConfig(str);
        } catch (Throwable th) {
            Level level = Level.WARNING;
            InnerMiscUtil.log(level, "[NwConfigServiceUtil#getConfig] Exception: " + th.toString(), th);
            return "";
        }
    }
}
