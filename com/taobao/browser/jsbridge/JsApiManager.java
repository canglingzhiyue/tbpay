package com.taobao.browser.jsbridge;

import android.app.Activity;
import android.taobao.util.k;
import android.taobao.windvane.config.a;
import android.taobao.windvane.config.j;
import android.taobao.windvane.extra.jsbridge.TBJsApiManager;
import android.taobao.windvane.jsbridge.api.WVMotion;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.q;
import android.taobao.windvane.webview.IWVWebView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.windvane.TBACCS;
import com.taobao.tao.Globals;
import tb.kge;

/* loaded from: classes6.dex */
public class JsApiManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final String TAG;

    static {
        kge.a(1251113567);
        TAG = JsApiManager.class.getSimpleName();
        try {
            if (Globals.getApplication() == null) {
                return;
            }
            a.f = Globals.getApplication();
        } catch (Exception e) {
            String str = TAG;
            k.a(str, "config Observer update config fail: " + e.getMessage());
        }
    }

    public static void initJsApiInPha() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("676ff4aa", new Object[0]);
            return;
        }
        CommonJsApiManager.initCommonJsbridge();
        if (j.commonConfig.bI) {
            TBJsApiManager.initJsApi();
        }
        q.a("WVACCS", (Class<? extends e>) TBACCS.class, true);
        q.a("WebAppInterface", (Class<? extends e>) WebAppInterface.class, true);
        q.a("WVDevelopTool", (Class<? extends e>) DevelopTool.class, true);
    }

    public static void initJsApi(Activity activity, IWVWebView iWVWebView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7946ede", new Object[]{activity, iWVWebView});
        } else if (activity == null || iWVWebView == null) {
            throw new NullPointerException("init js api, context, handler or webview should not be null.");
        } else {
            CommonJsApiManager.initCommonJsbridge(activity);
            if (j.commonConfig.bI) {
                TBJsApiManager.initJsApi();
            }
            q.a("WVNative", (Class<? extends e>) TBNative.class, true);
            q.a("WVACCS", (Class<? extends e>) TBACCS.class, true);
            q.a("WebAppInterface", (Class<? extends e>) WebAppInterface.class, true);
            q.a("Base", (Class<? extends e>) WVWindow.class, true);
            q.a("WVCameraPlus", (Class<? extends e>) WVCameraPlus.class, true);
            q.a("WVUICityList", (Class<? extends e>) WVUICityList.class, true);
            q.a("WVCamera", "takePhotoPlus", "WVCameraPlus", "takePhotoPlus");
            q.a("TBURLCache", (Class<? extends e>) TBUrlCacheAndDevice.class, true);
            q.a("TBDeviceInfo", (Class<? extends e>) TBUrlCacheAndDevice.class, true);
            q.a("TBQGURLCache", (Class<? extends e>) TBUrlCacheAndDevice.class, true);
            q.a("WVDevelopTool", (Class<? extends e>) DevelopTool.class, true);
            WVTBBase wVTBBase = new WVTBBase();
            wVTBBase.initialize(activity.getApplicationContext(), iWVWebView);
            iWVWebView.addJsObject("TBBase", wVTBBase);
            WVMotion wVMotion = new WVMotion();
            wVMotion.initialize(activity, iWVWebView);
            iWVWebView.addJsObject("WVMotion", wVMotion);
            if (a.f != null) {
                return;
            }
            a.f = activity.getApplication();
        }
    }
}
