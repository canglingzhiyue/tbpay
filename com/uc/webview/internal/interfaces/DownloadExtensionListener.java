package com.uc.webview.internal.interfaces;

import com.uc.webview.export.DownloadListener;
import java.util.ArrayList;

/* loaded from: classes9.dex */
public abstract class DownloadExtensionListener implements DownloadListener {
    @Override // com.uc.webview.export.DownloadListener
    public void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        throw new RuntimeException("browser should override onDownloadStartEx instead");
    }

    public void onDownloadStartEx(String str, String str2, String str3, String str4, String str5, long j, boolean z, boolean z2, String str6, String str7, ArrayList<String> arrayList) {
    }
}
