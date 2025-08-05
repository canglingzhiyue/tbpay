package com.alipay.mobile.common.logging.util;

import android.content.Context;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;

@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: classes3.dex */
public class DeviceUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static String getUtdid(Context context) {
        try {
            return (String) Class.forName("com.ut.device.UTDevice").getMethod("getUtdid", Context.class).invoke(null, context);
        } catch (Exception unused) {
            return null;
        }
    }
}
