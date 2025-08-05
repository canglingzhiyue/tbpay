package com.taobao.orange.launch;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OConstant;
import com.taobao.orange.OrangeConfig;
import com.taobao.orange.util.OLog;
import java.util.HashMap;
import tb.kge;

/* loaded from: classes7.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1574596398);
    }

    public static void a(Application application, HashMap<String, Object> hashMap) {
        String str;
        Object obj;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f47168dc", new Object[]{application, hashMap});
            return;
        }
        OLog.i("InitOrangeFetch", "orange fetch start", new Object[0]);
        String str3 = "21646297";
        int envMode = OConstant.ENV.ONLINE.getEnvMode();
        if (hashMap != null) {
            try {
            } catch (Throwable th) {
                th = th;
                str = "*";
            }
            if (hashMap.size() > 0) {
                str = (String) hashMap.get("appVersion");
                try {
                    envMode = ((Integer) hashMap.get(OConstant.LAUNCH_ENVINDEX)).intValue();
                } catch (Throwable th2) {
                    th = th2;
                    OLog.e("InitOrangeFetch", "init", th, new Object[0]);
                    str2 = str3;
                    OrangeConfig.getInstance().fetchCriticalConfigs(application, str2, str, envMode);
                }
                if (envMode == OConstant.ENV.ONLINE.getEnvMode()) {
                    obj = hashMap.get(OConstant.LAUNCH_ONLINEAPPKEY);
                } else if (envMode != OConstant.ENV.PREPARE.getEnvMode()) {
                    if (envMode == OConstant.ENV.TEST.getEnvMode()) {
                        str3 = (String) hashMap.get(OConstant.LAUNCH_TESTAPPKEY);
                    }
                    str2 = str3;
                    OrangeConfig.getInstance().fetchCriticalConfigs(application, str2, str, envMode);
                } else {
                    obj = hashMap.get(OConstant.LAUNCH_PREAPPKEY);
                }
                str2 = (String) obj;
                OrangeConfig.getInstance().fetchCriticalConfigs(application, str2, str, envMode);
            }
        }
        str = "*";
        str2 = str3;
        OrangeConfig.getInstance().fetchCriticalConfigs(application, str2, str, envMode);
    }
}
