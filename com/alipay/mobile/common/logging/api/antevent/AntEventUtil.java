package com.alipay.mobile.common.logging.api.antevent;

import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;

@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: classes3.dex */
public class AntEventUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static String getLogCategory(AntEvent antEvent) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            obj = ipChange.ipc$dispatch("431f46da", new Object[]{antEvent});
        } else if (!antEvent.getExtParams().containsKey("antLogCategory")) {
            return antEvent.getBizType();
        } else {
            obj = antEvent.getExtParams().get("antLogCategory");
        }
        return (String) obj;
    }
}
