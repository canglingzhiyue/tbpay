package com.alibaba.ariver.kernel.common.utils;

import mtopsdk.common.util.StringUtils;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.service.RVConfigService;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class RVOrangeConfigUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1991048010);
    }

    private static boolean a(String str, Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("86f9e1df", new Object[]{str, bool})).booleanValue();
        }
        boolean booleanValue = bool.booleanValue();
        try {
            String config = ((RVConfigService) RVProxy.get(RVConfigService.class)).getConfig(str, bool.toString());
            return (!StringUtils.isEmpty(config) && !bool.toString().equals(config)) ? !bool.booleanValue() : booleanValue;
        } catch (Exception e) {
            e.printStackTrace();
            return booleanValue;
        }
    }

    public static boolean getSettingNeedAuth() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a6928c23", new Object[0])).booleanValue() : a("getSettingNeedAuth", false);
    }

    public static boolean enableCanalDomain() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("30aa09a7", new Object[0])).booleanValue() : a("enableCanalDomain", true);
    }

    public static boolean enableIsAddISVHeaderNew() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5ccad526", new Object[0])).booleanValue() : a("enableIsAddISVHeaderNew", true);
    }

    public static boolean enableSkipInstallLocal() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8fdd94dd", new Object[0])).booleanValue() : a("enableSkipInstallLocal", true);
    }

    public static boolean fixClearScope() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b2fcb887", new Object[0])).booleanValue() : a("fixClearScope", true);
    }
}
