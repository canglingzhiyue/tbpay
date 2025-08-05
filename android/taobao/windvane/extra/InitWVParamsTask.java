package android.taobao.windvane.extra;

import android.app.Application;
import android.content.Context;
import android.taobao.windvane.WindVaneSDK;
import android.taobao.windvane.config.EnvEnum;
import android.taobao.windvane.config.a;
import android.taobao.windvane.config.f;
import android.taobao.windvane.config.h;
import android.taobao.windvane.config.i;
import android.taobao.windvane.config.j;
import android.taobao.windvane.config.n;
import android.taobao.windvane.config.s;
import android.taobao.windvane.d;
import android.taobao.windvane.extra.launch.WindVaneLaunchTask;
import android.taobao.windvane.extra.uc.UCSetupServiceUtil;
import android.taobao.windvane.util.e;
import android.taobao.windvane.util.m;
import com.alibaba.ariver.kernel.common.service.RVEnvironmentService;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.ABGlobal;
import com.taobao.orange.OConstant;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.utils.t;
import com.uc.webview.export.multiprocess.PreStartup;
import com.ut.device.UTDevice;
import java.io.Serializable;
import java.util.HashMap;
import tb.gtn;
import tb.kge;
import tb.qgp;

/* loaded from: classes2.dex */
public class InitWVParamsTask implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "InitWVParamsTask";

    static {
        kge.a(1153804925);
        kge.a(1028243835);
    }

    public static boolean isInitWVParamOpenV2(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("393b098b", new Object[]{context})).booleanValue() : !ABGlobal.isFeatureOpened(context, "OptInitWvParamV2");
    }

    public void init(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{this, application, hashMap});
            return;
        }
        qgp.a();
        if (t.b(application.getApplicationContext())) {
            TMSLogger.d("TMSEarlyInitializer", "skip InitWVParamsTask, but still run initAtWelcome");
            WindVaneLaunchTask.initAtWelcome(application, hashMap);
            return;
        }
        a.f = application;
        if (ABGlobal.isFeatureOpened(application, "OptInitWvParam") || isInitWVParamOpenV2(application)) {
            if (!i.a().b()) {
                initParams(application, hashMap);
            }
            e.b(((Boolean) hashMap.get("isDebuggable")).booleanValue());
        } else {
            initParams(application, hashMap);
            j.a().b();
            s.a().c();
            n.a().c();
            try {
                if (j.commonConfig.as) {
                    long currentTimeMillis = System.currentTimeMillis();
                    PreStartup.startup(application);
                    m.e(TAG, "opt useTime PreStartup " + (System.currentTimeMillis() - currentTimeMillis));
                }
                AppMonitor.Alarm.commitFail("WindVane", "InitWVParamOld", "", "");
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        UCSetupServiceUtil.configUCSettingsBeforeInit();
    }

    private void initParams(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abb2c931", new Object[]{this, application, hashMap});
            return;
        }
        h obtainWVParams = obtainWVParams(application, hashMap);
        i.a().a(obtainWVParams);
        f fVar = new f();
        fVar.f1557a = "windvane";
        fVar.b = "vKFaqtcEUEHI15lIOzsI6jIQldPpaCZ3";
        fVar.e = 1;
        fVar.d = 1;
        fVar.c = e.b();
        obtainWVParams.j = fVar;
        a.a().a(obtainWVParams);
    }

    private h obtainWVParams(Application application, HashMap<String, Object> hashMap) {
        int i;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (h) ipChange.ipc$dispatch("ef1ebb81", new Object[]{this, application, hashMap});
        }
        h hVar = new h();
        try {
            hVar.f1560a = (String) hashMap.get("ttid");
        } catch (Throwable unused) {
            m.e("InitWindVane", "failed to get ttid");
        }
        try {
            i = ((Integer) hashMap.get(OConstant.LAUNCH_ENVINDEX)).intValue();
        } catch (Throwable unused2) {
            m.e("InitWindVane", "failed to get envIndex");
            i = 0;
        }
        if (i == 0) {
            try {
                hVar.e = (String) hashMap.get(OConstant.LAUNCH_ONLINEAPPKEY);
            } catch (Throwable unused3) {
                m.e("InitWindVane", "failed to get onlineAppKey");
                hVar.e = "21646297";
            }
            WindVaneSDK.setEnvMode(EnvEnum.ONLINE);
        } else if (i == 1) {
            try {
                hVar.e = (String) hashMap.get(OConstant.LAUNCH_ONLINEAPPKEY);
            } catch (Throwable unused4) {
                hVar.e = "21646297";
                m.e("InitWind   Vane", "failed to get onlineAppKey");
            }
            WindVaneSDK.setEnvMode(EnvEnum.PRE);
        } else {
            try {
                hVar.e = (String) hashMap.get(OConstant.LAUNCH_TESTAPPKEY);
            } catch (Throwable unused5) {
                hVar.e = "4272";
                m.e("InitWindVane", "failed to get dailyAppkey");
            }
            WindVaneSDK.setEnvMode(EnvEnum.DAILY);
        }
        hVar.g = RVEnvironmentService.PLATFORM_TB;
        hVar.i = d.TB_UC_SDK_APP_KEY_SEC;
        hVar.h = "0.0.0";
        try {
            hVar.h = (String) hashMap.get("appVersion");
        } catch (Throwable unused6) {
            m.e("InitWindVane", "failed to get appVersion");
        }
        hVar.d = UTDevice.getUtdid(application);
        if (!ABGlobal.isFeatureOpened(application, "browser_webview_init_async_v2") || !gtn.a(application)) {
            z = false;
        }
        hVar.v = z;
        return hVar;
    }
}
