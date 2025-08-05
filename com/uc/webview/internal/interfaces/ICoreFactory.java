package com.uc.webview.internal.interfaces;

import android.content.Context;
import android.util.AttributeSet;
import com.uc.webview.base.IExtender;
import java.util.Map;

/* loaded from: classes9.dex */
public interface ICoreFactory extends IExtender {
    IWebView createWebView(Context context);

    IWebView createWebView(Context context, AttributeSet attributeSet, Map<String, Object> map);

    ICookieManager getCookieManager();

    int getCoreType();

    IGeolocationPermissions getGeolocationPermissions();

    IMimeTypeMap getMimeTypeMap();

    ISdk2Core getSdk2CoreHost();

    IServiceWorkerController getServiceWorkerController();

    IWebStorage getWebStorage();

    IWebViewDatabase getWebViewDatabase(Context context);
}
