package com.taobao.tao.util;

import com.alibaba.wireless.security.open.SecException;
import com.alibaba.wireless.security.open.SecurityGuardManager;
import com.alibaba.wireless.security.open.staticdatastore.IStaticDataStoreComponent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.statistic.TBS;
import com.taobao.tao.Globals;
import java.util.Properties;
import tb.kge;

/* loaded from: classes.dex */
public final class GetAppKeyFromSecurity {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "GetAppKeyFromSecurity";

    static {
        kge.a(-208238159);
    }

    public static String getAppKey(int i) {
        IStaticDataStoreComponent staticDataStoreComp;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("19695938", new Object[]{new Integer(i)});
        }
        String str = "21646297";
        if (i == 0) {
            return str;
        }
        try {
            SecurityGuardManager securityGuardManager = SecurityGuardManager.getInstance(Globals.getApplication());
            if (securityGuardManager == null || (staticDataStoreComp = securityGuardManager.getStaticDataStoreComp()) == null) {
                return str;
            }
            str = staticDataStoreComp.getAppKeyByIndex(i, "");
            String str2 = "Get app key : " + str;
            return str;
        } catch (SecException e) {
            Properties properties = new Properties();
            properties.put("appkey", str);
            properties.put("error", Integer.valueOf(e.getErrorCode()));
            properties.put("appkeyIndex", Integer.valueOf(i));
            TBS.Ext.commitEvent("SecurityGuard_GetAppkey", properties);
            String str3 = "Cannot get appkey, error code is " + e.getErrorCode();
            return str;
        }
    }
}
