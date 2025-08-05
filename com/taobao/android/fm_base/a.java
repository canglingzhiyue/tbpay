package com.taobao.android.fm_base;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;

/* loaded from: classes5.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DEFAULT_GOWNGRADE_URL = null;
    public static final String DOWNGRADE = "downgradeUrlMap";
    public static final String INSTALL_ALL_DOWNGRADE = "installAllDowngrade";
    public static final String INSTALL_TIMEOUT = "installTimeoutMill";
    public static final String INSTALL_TIMEOUT_FINISH = "intallTimeoutFinish";
    public static final String MONIOTR_SUCESS = "installMonitorSuccess";
    public static final String NAMESPACE = "tb_fm";

    public static int a(String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4dba94fa", new Object[]{str, str2, new Integer(i)})).intValue();
        }
        String a2 = a(str, str2, String.valueOf(i));
        return !TextUtils.isEmpty(a2) ? Integer.parseInt(a2) : i;
    }

    public static boolean a(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4dbad4dc", new Object[]{str, str2, new Boolean(z)})).booleanValue() : "true".equals(a(str, str2, String.valueOf(z)));
    }

    public static String a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("457cf91a", new Object[]{str, str2, str3}) : OrangeConfig.getInstance().getConfig(str, str2, str3);
    }
}
