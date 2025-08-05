package com.taobao.android.autosize;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.taobao.windvane.jsbridge.q;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.p;
import com.taobao.android.autosize.OnScreenChangedListener;
import com.taobao.android.autosize.api.TBAutoSizeDeviceBridge;
import com.taobao.android.autosize.api.TBAutoSizeGuideBridge;
import com.taobao.android.autosize.config.a;
import com.taobao.android.autosize.orientation.ConfigChangeProvider;
import com.taobao.android.tcrash.TCrashSDK;
import com.taobao.tao.log.TLog;
import com.ut.mini.UTAnalytics;
import java.util.HashMap;
import tb.gvo;
import tb.hun;
import tb.itq;
import tb.iuu;
import tb.iuv;
import tb.iuw;

/* loaded from: classes.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public void a(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f47168dc", new Object[]{this, application, hashMap});
            return;
        }
        q.a("TBAutoSizeDevice", (Class<? extends android.taobao.windvane.jsbridge.e>) TBAutoSizeDeviceBridge.class);
        q.a("TBAutoSizeGuideBridge", (Class<? extends android.taobao.windvane.jsbridge.e>) TBAutoSizeGuideBridge.class);
        c(application);
        if (Build.VERSION.SDK_INT <= 18) {
            return;
        }
        a.a().a(application);
        if (!a.a().b()) {
            return;
        }
        boolean d = l.d(application);
        boolean b = l.b(application);
        if (d || b) {
            hun.a().a(application);
            hun.a().b(application);
            application.registerActivityLifecycleCallbacks(iuv.a());
            com.taobao.tao.navigation.e.a(new iuw(iuv.a()));
            gvo.a(application);
            ConfigChangeProvider.a().a(application);
            String a2 = TBDeviceInfo.a(TBDeviceInfo.a(application));
            UTAnalytics.getInstance().getDefaultTracker().setGlobalProperty(p.KEY_DEVICE_TYPE, a2);
            TLog.loge("TBAutoSize.Init", "init deviceType=" + a2);
        }
        if (d) {
            iuu.a().a(application);
            itq.a(application);
        }
        if (b(application)) {
            Log.e("TBAutoSize.Init", "initNewFlow, initSucc");
        } else {
            a(application);
        }
    }

    private void c(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("771ec6b5", new Object[]{this, application});
            return;
        }
        try {
            TCrashSDK.instance().getCrashCaughtHeader().addHeaderInfo(p.KEY_DEVICE_TYPE, TBDeviceInfo.a(TBDeviceInfo.a(application)));
        } catch (Exception e) {
            TLog.loge("TBAutoSize.Init", "addCrashHeader:", e);
        }
    }

    private void a(final Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75c56f77", new Object[]{this, application});
            return;
        }
        Log.e("TBAutoSize.Init", "initOldFlow, enter");
        if (l.b(application)) {
            h.a().a(application);
        }
        if (!l.d(application)) {
            return;
        }
        h.a().a(application);
        if (l.f(application) || l.e(application)) {
            f.a((Context) application, h.a().b(), true);
        }
        h.a().b(new OnScreenChangedListener() { // from class: com.taobao.android.autosize.c.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.autosize.OnScreenChangedListener
            public /* synthetic */ void onActivityChanged(Activity activity, int i, Configuration configuration) {
                OnScreenChangedListener.CC.$default$onActivityChanged(this, activity, i, configuration);
            }

            @Override // com.taobao.android.autosize.OnScreenChangedListener
            public void onScreenChanged(int i, Configuration configuration) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("cfdcd1d", new Object[]{this, new Integer(i), configuration});
                    return;
                }
                Log.e("TBAutoSize.Init", "ScreenConfigChangedCallback onConfigurationChanged, enter, listeners=" + ((Object) null));
                if (configuration.screenWidthDp > configuration.screenHeightDp) {
                    Log.e("TBAutoSize.Init", "ScreenConfigChangedCallback onConfigurationChanged return, width > height, this is illegal, new .dpi = " + configuration.densityDpi + ", new .width = " + configuration.screenWidthDp + ", new .height = " + configuration.screenHeightDp);
                    return;
                }
                int c = h.a().c();
                int e = h.a().e();
                int f = h.a().f();
                if (configuration.densityDpi != c || configuration.screenWidthDp != e || configuration.screenHeightDp != f) {
                    h.a().a(application, configuration);
                    Activity h = h.a().h();
                    if (h == null || h.isDestroyed() || h.isFinishing()) {
                        return;
                    }
                    Log.e("TBAutoSize.Init", "initOldFlow, onScreenConfigChanged, trigger TBAutoSize.autoSize() = " + h.getLocalClassName());
                    f.a((Context) h, h.a().b(), true);
                    return;
                }
                Log.e("TBAutoSize.Init", "ScreenConfigChangedCallback onConfigurationChanged return, dpi and widthDp not changed, new .dpi = " + configuration.densityDpi + ", old .dpi = " + c + ", new .width = " + configuration.screenWidthDp + ", old widthDP = " + e + ", new .height = " + configuration.screenHeightDp + ", old heightDP = " + f);
            }
        });
    }

    private boolean b(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("76721b1a", new Object[]{this, application})).booleanValue();
        }
        if (!a.a().f() && !a.a().g().contains(Build.MODEL)) {
            Log.e("TBAutoSize.Init", "initForceRecreate,  return");
            return false;
        }
        boolean d = l.d(application);
        boolean b = l.b(application);
        boolean a2 = l.a(application);
        Log.e("TBAutoSize.Init", "initForceRecreate,  foldDevice=" + d + ", tablet=" + b + ", easyGoSupported=" + a2);
        if (!d && !b && !a2) {
            return false;
        }
        h.a().a(application);
        if (l.f(application) || l.e(application)) {
            f.a((Context) application, h.a().b(), true);
        }
        return true;
    }
}
