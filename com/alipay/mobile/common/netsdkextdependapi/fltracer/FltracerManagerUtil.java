package com.alipay.mobile.common.netsdkextdependapi.fltracer;

import com.alipay.mobile.common.netsdkextdependapi.InnerMiscUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public class FltracerManagerUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void reportFLException(FLExceptionModel fLExceptionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7571d600", new Object[]{fLExceptionModel});
            return;
        }
        try {
            FltracerManagerFactory.getInstance().getDefaultBean().reportException(fLExceptionModel);
        } catch (Throwable th) {
            Logger logger = InnerMiscUtil.logger;
            Level level = Level.WARNING;
            logger.log(level, "reportFLException err, " + th.toString());
        }
    }
}
