package com.uc.webview.internal.android;

import android.webkit.DownloadListener;

/* loaded from: classes9.dex */
public final class a implements DownloadListener {

    /* renamed from: a  reason: collision with root package name */
    private com.uc.webview.export.DownloadListener f23858a;

    public a(com.uc.webview.export.DownloadListener downloadListener) {
        this.f23858a = downloadListener;
    }

    @Override // android.webkit.DownloadListener
    public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        com.uc.webview.export.DownloadListener downloadListener = this.f23858a;
        if (downloadListener != null) {
            downloadListener.onDownloadStart(str, str2, str3, str4, j);
        }
    }
}
