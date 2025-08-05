package com.uc.webview.internal.android;

import com.uc.webview.export.SslErrorHandler;

/* loaded from: classes9.dex */
class SslErrorHandlerAndroid extends SslErrorHandler {
    /* JADX INFO: Access modifiers changed from: package-private */
    public SslErrorHandlerAndroid(android.webkit.SslErrorHandler sslErrorHandler) {
        this.mHandler = sslErrorHandler;
    }
}
