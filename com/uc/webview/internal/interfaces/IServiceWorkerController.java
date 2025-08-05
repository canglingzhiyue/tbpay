package com.uc.webview.internal.interfaces;

import com.uc.webview.export.ServiceWorkerClient;
import com.uc.webview.export.ServiceWorkerWebSettings;

/* loaded from: classes9.dex */
public interface IServiceWorkerController {
    ServiceWorkerWebSettings getServiceWorkerWebSettings();

    void setServiceWorkerClient(ServiceWorkerClient serviceWorkerClient);
}
