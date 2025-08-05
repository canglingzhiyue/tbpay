package com.uc.webview.export;

import android.os.Handler;

/* loaded from: classes9.dex */
public class SslErrorHandler extends Handler {
    protected android.webkit.SslErrorHandler mHandler = null;

    public void cancel() {
        this.mHandler.cancel();
    }

    public void proceed() {
        this.mHandler.proceed();
    }
}
