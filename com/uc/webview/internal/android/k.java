package com.uc.webview.internal.android;

import android.os.Handler;
import android.webkit.WebMessagePort;
import com.uc.webview.export.WebMessage;
import com.uc.webview.export.WebMessagePort;

/* loaded from: classes9.dex */
public final class k extends WebMessagePort {

    /* renamed from: a  reason: collision with root package name */
    android.webkit.WebMessagePort f23873a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(android.webkit.WebMessagePort webMessagePort) {
        this.f23873a = webMessagePort;
    }

    @Override // com.uc.webview.export.WebMessagePort
    public final void close() {
        this.f23873a.close();
    }

    @Override // com.uc.webview.export.WebMessagePort
    public final void postMessage(WebMessage webMessage) {
    }

    @Override // com.uc.webview.export.WebMessagePort
    public final void setWebMessageCallback(WebMessagePort.WebMessageCallback webMessageCallback) {
        setWebMessageCallback(webMessageCallback, null);
    }

    @Override // com.uc.webview.export.WebMessagePort
    public final void setWebMessageCallback(WebMessagePort.WebMessageCallback webMessageCallback, Handler handler) {
        this.f23873a.setWebMessageCallback(new WebMessagePort.WebMessageCallback() { // from class: com.uc.webview.internal.android.k.1
            @Override // android.webkit.WebMessagePort.WebMessageCallback
            public final void onMessage(android.webkit.WebMessagePort webMessagePort, android.webkit.WebMessage webMessage) {
            }
        });
    }
}
