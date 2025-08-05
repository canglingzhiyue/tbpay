package com.uc.webview.internal;

import android.content.Context;
import android.util.AttributeSet;
import com.uc.webview.base.g;
import com.uc.webview.base.timing.StartupTimingKeys;
import com.uc.webview.base.timing.TraceEvent;
import com.uc.webview.export.WebView;
import com.uc.webview.internal.android.CookieManagerAndroid;
import com.uc.webview.internal.android.m;
import com.uc.webview.internal.android.o;
import com.uc.webview.internal.interfaces.ICookieManager;
import com.uc.webview.internal.interfaces.ICoreFactory;
import com.uc.webview.internal.interfaces.IGeolocationPermissions;
import com.uc.webview.internal.interfaces.IMimeTypeMap;
import com.uc.webview.internal.interfaces.ISdk2Core;
import com.uc.webview.internal.interfaces.IServiceWorkerController;
import com.uc.webview.internal.interfaces.IWebStorage;
import com.uc.webview.internal.interfaces.IWebView;
import com.uc.webview.internal.interfaces.IWebViewDatabase;
import java.util.Map;

/* loaded from: classes9.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private static volatile ICoreFactory f23881a;

    public static ICookieManager a(int i) {
        return f(i) ? new CookieManagerAndroid() : d().getCookieManager();
    }

    public static IWebView a(Context context, AttributeSet attributeSet, Map<String, Object> map) {
        return d().createWebView(context, attributeSet, map);
    }

    public static IWebViewDatabase a(Context context, int i) {
        return f(i) ? new o(context) : d().getWebViewDatabase(context);
    }

    public static boolean a() {
        return d() != null;
    }

    public static IServiceWorkerController b(int i) {
        if (f(i)) {
            return null;
        }
        return d().getServiceWorkerController();
    }

    public static boolean b() {
        return WebView.getCoreType() == 3 && d() != null;
    }

    public static IGeolocationPermissions c(int i) {
        return f(i) ? new com.uc.webview.internal.android.b() : d().getGeolocationPermissions();
    }

    public static ISdk2Core c() {
        if (b()) {
            return d().getSdk2CoreHost();
        }
        return null;
    }

    private static ICoreFactory d() {
        if (f23881a != null) {
            return f23881a;
        }
        synchronized (b.class) {
            if (f23881a != null) {
                return f23881a;
            }
            TraceEvent scoped = TraceEvent.scoped((int) StartupTimingKeys.INIT_CORE_FACTORY);
            f23881a = (ICoreFactory) g.b("com.uc.sdk_glue.extension.CoreFactoryImpl", "instance");
            if (scoped != null) {
                scoped.close();
            }
            return f23881a;
        }
    }

    public static IWebStorage d(int i) {
        return f(i) ? new m() : d().getWebStorage();
    }

    public static IMimeTypeMap e(int i) {
        return f(i) ? new com.uc.webview.internal.android.f() : d().getMimeTypeMap();
    }

    private static boolean f(int i) {
        e.a();
        return i == 2;
    }
}
