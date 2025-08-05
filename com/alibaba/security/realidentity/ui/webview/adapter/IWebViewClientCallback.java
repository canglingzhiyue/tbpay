package com.alibaba.security.realidentity.ui.webview.adapter;

import android.graphics.Bitmap;
import android.view.View;

/* loaded from: classes3.dex */
public interface IWebViewClientCallback {
    void onPageFinished(View view, String str);

    void onPageStarted(View view, String str, Bitmap bitmap);

    void onReceivedError(View view, int i, String str, String str2);

    void onReceivedHttpError(View view, Object obj, Object obj2);

    void onReceivedSslError(View view, Object obj, Object obj2);
}
