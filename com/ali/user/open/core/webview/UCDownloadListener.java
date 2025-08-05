package com.ali.user.open.core.webview;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.uc.webview.export.DownloadListener;
import java.lang.ref.WeakReference;
import java.util.regex.Pattern;
import tb.kge;

/* loaded from: classes2.dex */
public class UCDownloadListener implements DownloadListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final Pattern APK_PATTERN;
    private WeakReference<Context> contextWeakReference;

    static {
        kge.a(1376640784);
        APK_PATTERN = Pattern.compile("\\.apk$", 2);
    }

    public UCDownloadListener(Context context) {
        this.contextWeakReference = new WeakReference<>(context);
    }

    @Override // com.uc.webview.export.DownloadListener
    public void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84e41dba", new Object[]{this, str, str2, str3, str4, new Long(j)});
        } else if (this.contextWeakReference.get() == null) {
        } else {
            UccDownloadListener.shouldDownload(this.contextWeakReference.get(), str, str2, str3, str4, j);
        }
    }
}
