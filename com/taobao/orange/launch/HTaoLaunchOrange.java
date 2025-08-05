package com.taobao.orange.launch;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OConfig;
import com.taobao.orange.OConstant;
import com.taobao.orange.OrangeConfig;
import com.taobao.orange.util.OLog;
import java.io.Serializable;
import java.util.HashMap;
import tb.kge;

/* loaded from: classes7.dex */
public class HTaoLaunchOrange implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "HTaoLaunchOrange";

    static {
        kge.a(-825508855);
        kge.a(1028243835);
    }

    public void init(Application application, HashMap<String, Object> hashMap) {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{this, application, hashMap});
            return;
        }
        OLog.d(TAG, "init start", new Object[0]);
        int envMode = OConstant.ENV.ONLINE.getEnvMode();
        try {
            str = (String) hashMap.get("appVersion");
        } catch (Throwable th) {
            th = th;
            str = "*";
        }
        try {
            envMode = ((Integer) hashMap.get(OConstant.LAUNCH_ENVINDEX)).intValue();
            if (envMode == OConstant.ENV.ONLINE.getEnvMode()) {
                str2 = (String) hashMap.get(OConstant.LAUNCH_ONLINEAPPKEY);
            } else if (envMode == OConstant.ENV.PREPARE.getEnvMode()) {
                str2 = (String) hashMap.get(OConstant.LAUNCH_PREAPPKEY);
            } else {
                str2 = (String) hashMap.get(OConstant.LAUNCH_TESTAPPKEY);
            }
        } catch (Throwable th2) {
            th = th2;
            OLog.e(TAG, "init", th, new Object[0]);
            str2 = "23070080";
            OrangeConfig.getInstance().init(application, new OConfig.Builder().setAppKey(str2).setAppVersion(str).setEnv(envMode).setServerType(OConstant.SERVER.TAOBAO.ordinal()).setIndexUpdateMode(OConstant.UPDMODE.O_XMD.ordinal()).setReportAck(false).build());
        }
        OrangeConfig.getInstance().init(application, new OConfig.Builder().setAppKey(str2).setAppVersion(str).setEnv(envMode).setServerType(OConstant.SERVER.TAOBAO.ordinal()).setIndexUpdateMode(OConstant.UPDMODE.O_XMD.ordinal()).setReportAck(false).build());
    }
}
