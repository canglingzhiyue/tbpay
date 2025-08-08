package com.taobao.browser;

import android.app.Application;
import android.taobao.util.k;
import android.taobao.windvane.WindVaneSDK;
import android.taobao.windvane.config.EnvEnum;
import mtopsdk.common.util.StringUtils;
import com.alibaba.ariver.kernel.common.service.RVEnvironmentService;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.ABGlobal;
import com.taobao.android.speed.TBSpeed;
import com.taobao.android.tcrash.TCrashSDK;
import com.taobao.orange.OConstant;
import com.ut.device.UTDevice;
import java.io.Serializable;
import java.util.HashMap;
import tb.kev;
import tb.kge;

/* loaded from: classes6.dex */
public class InitWindVane implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "InitWindVane";

    static {
        kge.a(-702993068);
        kge.a(1028243835);
    }

    public void init(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{this, application, hashMap});
            return;
        }
        android.taobao.windvane.config.h hVar = new android.taobao.windvane.config.h();
        if (ABGlobal.isFeatureOpened(application, "OptInitWindVane")) {
            if (!android.taobao.windvane.config.i.a().b()) {
                initParam(application, hashMap, hVar);
            }
        } else {
            initParam(application, hashMap, hVar);
        }
        try {
            TCrashSDK.instance().addJvmUncaughtCrashListener(new kev());
        } catch (Throwable unused) {
        }
        android.taobao.windvane.d.a(application, "taobao", 0, hVar, hashMap);
    }

    private void initParam(Application application, HashMap<String, Object> hashMap, android.taobao.windvane.config.h hVar) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("519c87c8", new Object[]{this, application, hashMap, hVar});
            return;
        }
        try {
            hVar.b = android.taobao.util.h.a(application);
            hVar.c = android.taobao.util.h.b(application);
        } catch (Throwable unused) {
            k.a(TAG, "failed to get imei & imsi");
        }
        try {
            hVar.f1560a = (String) hashMap.get("ttid");
        } catch (Throwable unused2) {
            k.a(TAG, "failed to get ttid");
        }
        try {
            i = ((Integer) hashMap.get(OConstant.LAUNCH_ENVINDEX)).intValue();
        } catch (Throwable unused3) {
            k.a(TAG, "failed to get envIndex");
        }
        if (i == 0) {
            try {
                hVar.e = (String) hashMap.get(OConstant.LAUNCH_ONLINEAPPKEY);
            } catch (Throwable unused4) {
                k.a(TAG, "failed to get onlineAppKey");
                hVar.e = "21646297";
            }
            if (StringUtils.isEmpty(hVar.e)) {
                hVar.e = "21646297";
            }
            WindVaneSDK.setEnvMode(EnvEnum.ONLINE);
        } else if (i == 1) {
            try {
                hVar.e = (String) hashMap.get(OConstant.LAUNCH_ONLINEAPPKEY);
            } catch (Throwable unused5) {
                hVar.e = "21646297";
                k.a(TAG, "failed to get onlineAppKey");
            }
            if (StringUtils.isEmpty(hVar.e)) {
                hVar.e = "21646297";
            }
            WindVaneSDK.setEnvMode(EnvEnum.PRE);
        } else {
            try {
                hVar.e = (String) hashMap.get(OConstant.LAUNCH_TESTAPPKEY);
            } catch (Throwable unused6) {
                hVar.e = "4272";
                k.a(TAG, "failed to get dailyAppkey");
            }
            if (StringUtils.isEmpty(hVar.e)) {
                hVar.e = "4272";
            }
            WindVaneSDK.setEnvMode(EnvEnum.DAILY);
        }
        try {
            hVar.n = TBSpeed.isSpeedEdition(application, "windvane");
        } catch (Throwable unused7) {
        }
        hVar.f = null;
        hVar.g = RVEnvironmentService.PLATFORM_TB;
        try {
            hVar.h = (String) hashMap.get("appVersion");
        } catch (Throwable unused8) {
            k.a(TAG, "failed to get appVersion");
        }
        if (ABGlobal.isFeatureOpened(application, "OptInitWindVane")) {
            hVar.d = (String) hashMap.get("deviceId");
        } else {
            hVar.d = UTDevice.getUtdid(application);
        }
    }
}
