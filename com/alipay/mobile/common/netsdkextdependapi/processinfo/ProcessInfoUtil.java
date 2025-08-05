package com.alipay.mobile.common.netsdkextdependapi.processinfo;

import com.alipay.mobile.common.netsdkextdependapi.InnerMiscUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public class ProcessInfoUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static long getProcessStartTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("95784991", new Object[0])).longValue();
        }
        try {
            return a().getProcessStartTime();
        } catch (Throwable th) {
            Logger logger = InnerMiscUtil.logger;
            logger.info("getProcessStartTime ex:" + th.toString());
            return -1L;
        }
    }

    private static final ProcessInfoManager a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ProcessInfoManager) ipChange.ipc$dispatch("6be5f784", new Object[0]) : ProcessInfoManagerFactory.getInstance().getDefaultBean();
    }
}
