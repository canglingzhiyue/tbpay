package com.ali.user.open.oauth;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class OauthPlatformConfig {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static Map<String, AppCredential> sPlateformConfigs = new HashMap();

    public static void setOauthConfig(String str, AppCredential appCredential) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ace5d39", new Object[]{str, appCredential});
        } else {
            sPlateformConfigs.put(str, appCredential);
        }
    }

    public static AppCredential getOauthConfigByPlatform(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AppCredential) ipChange.ipc$dispatch("85eba94f", new Object[]{str}) : sPlateformConfigs.get(str);
    }
}
