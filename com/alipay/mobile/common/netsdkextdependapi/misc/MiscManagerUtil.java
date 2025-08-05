package com.alipay.mobile.common.netsdkextdependapi.misc;

import com.alipay.mobile.common.netsdkextdependapi.InnerMiscUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public class MiscManagerUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static ArrayList<String> getHighAvailUrl(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("e06aa6ad", new Object[]{str, str2});
        }
        try {
            return MiscManagerFactory.getInstance().getDefaultBean().getHighAvailUrl(str, str2);
        } catch (Throwable th) {
            Logger logger = InnerMiscUtil.logger;
            Level level = Level.WARNING;
            logger.log(level, "getHighAvailUrl failed, " + th.toString());
            return null;
        }
    }
}
