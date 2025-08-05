package android.taobao.windvane.extra.launch;

import android.app.Application;
import android.taobao.windvane.WindVaneSDK;
import android.taobao.windvane.config.EnvEnum;
import android.taobao.windvane.config.a;
import android.taobao.windvane.config.f;
import android.taobao.windvane.config.h;
import android.taobao.windvane.config.i;
import android.taobao.windvane.d;
import android.taobao.windvane.extra.uc.UCSetupServiceUtil;
import android.taobao.windvane.jsbridge.api.c;
import android.taobao.windvane.util.e;
import android.taobao.windvane.util.m;
import com.alibaba.ariver.kernel.common.service.RVEnvironmentService;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.ABGlobal;
import com.taobao.orange.OConstant;
import com.ut.device.UTDevice;
import java.util.HashMap;
import tb.gtn;
import tb.kge;
import tb.mte;
import tb.qgp;

/* loaded from: classes2.dex */
public class WindVaneWelComeTask extends InitOnceTask {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1229149020);
    }

    public static /* synthetic */ Object ipc$super(WindVaneWelComeTask windVaneWelComeTask, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.taobao.windvane.extra.launch.InitOnceTask
    public void initImpl(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73f761cb", new Object[]{this, application, hashMap});
            return;
        }
        qgp.a();
        initUCParams(application, hashMap);
        initNecessaryAPI();
    }

    private void initUCParams(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3174993f", new Object[]{this, application, hashMap});
            return;
        }
        a.f = application;
        if (!i.a().b()) {
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
            try {
                e.b(((Boolean) hashMap.get("isDebuggable")).booleanValue());
            } catch (Exception unused) {
            }
        }
        UCSetupServiceUtil.configUCSettingsBeforeInit();
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

    private void initNecessaryAPI() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30366082", new Object[]{this});
            return;
        }
        c.a();
        mte.a();
    }
}
