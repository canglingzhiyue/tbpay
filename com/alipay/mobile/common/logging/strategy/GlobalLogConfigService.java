package com.alipay.mobile.common.logging.strategy;

import com.alipay.mobile.common.logging.util.config.GrayScaleUtils;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;

@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: classes3.dex */
public class GlobalLogConfigService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static String f5451a = "GlobalLogConfigService";
    private static GlobalLogConfigService b;
    private int c = 300;
    private int d = 0;
    private String e = "mdaplog,network,exception,crash,bizHighAvail";

    public static GlobalLogConfigService a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (GlobalLogConfigService) ipChange.ipc$dispatch("f65e036d", new Object[0]);
        }
        GlobalLogConfigService globalLogConfigService = b;
        if (globalLogConfigService != null) {
            return globalLogConfigService;
        }
        synchronized (GlobalLogConfigService.class) {
            if (b != null) {
                return b;
            }
            b = new GlobalLogConfigService();
            return b;
        }
    }

    private GlobalLogConfigService() {
    }

    public static String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]);
        }
        try {
            return GrayScaleUtils.getStringSwitch("groupTag", "");
        } catch (Throwable unused) {
            return "";
        }
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue();
        }
        try {
            return GrayScaleUtils.getGrayScaleSwitch("loglenlimit", true);
        } catch (Throwable unused) {
            return true;
        }
    }
}
