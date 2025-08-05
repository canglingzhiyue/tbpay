package com.taobao.browser.jsbridge;

import android.content.Context;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.q;
import android.taobao.windvane.webview.IWVWebView;
import android.taobao.windvane.webview.WVWebView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.interact.core.h5.c;
import com.taobao.tao.alipay.export.PayPasswrdValidateBridge;
import com.taobao.tao.favorite.jsbridge.FavoriteJsBridge;
import tb.kge;

/* loaded from: classes6.dex */
public class CommonJsApiManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1737743958);
    }

    @Deprecated
    public static void initCommonJsbridge(Context context, WVWebView wVWebView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67e4dfad", new Object[]{context, wVWebView});
        } else {
            initCommonJsbridge(context);
        }
    }

    @Deprecated
    public static void initCommonJsbridge(Context context, IWVWebView iWVWebView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("548bbf98", new Object[]{context, iWVWebView});
        } else {
            initCommonJsbridge(context);
        }
    }

    @Deprecated
    public static void initCommonJsbridge(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e3c5df4", new Object[]{context});
        } else {
            initCommonJsbridge();
        }
    }

    public static void initCommonJsbridge() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f5bf454", new Object[0]);
            return;
        }
        try {
            q.a("TBUserTrackHelper", (Class<? extends e>) TBUserTrackHelper.class, true);
            q.a("TBWeakNetStatus", (Class<? extends e>) TBWeakNetStatus.class, true);
            q.a("WVLocation", (Class<? extends e>) WVLocationProxy.class, true);
            q.a("H5AudioPlayer", (Class<? extends e>) H5AudioPlayer.class, true);
            q.a("WVUIImagepreview", (Class<? extends e>) WVUIImagepreview.class, true);
            q.a("WVTBLocation", (Class<? extends e>) WVTBLocation.class, true);
            q.a("WVClient", (Class<? extends e>) WVClient.class, true);
            q.a("TBWVSecurity", (Class<? extends e>) TBWVSecurity.class, true);
            q.a(PayPasswrdValidateBridge.PLUGIN_NAME, (Class<? extends e>) PayPasswrdValidateBridge.class, true);
            c.a();
            q.a("TBFavoriteModule", (Class<? extends e>) FavoriteJsBridge.class, true);
            q.a("TBWVDialog", (Class<? extends e>) TBWVDialog.class, true);
            q.a("WVUIToast", (Class<? extends e>) TBWVToast.class, true);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
