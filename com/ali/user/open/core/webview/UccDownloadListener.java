package com.ali.user.open.core.webview;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.webkit.DownloadListener;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import java.util.regex.Pattern;
import tb.kge;

/* loaded from: classes2.dex */
public class UccDownloadListener implements DownloadListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final Pattern APK_PATTERN;
    private WeakReference<Context> contextWeakReference;

    static {
        kge.a(-1568158549);
        kge.a(-2124823223);
        APK_PATTERN = Pattern.compile("\\.apk$", 2);
    }

    public UccDownloadListener(Context context) {
        this.contextWeakReference = new WeakReference<>(context);
    }

    @Override // android.webkit.DownloadListener
    public void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84e41dba", new Object[]{this, str, str2, str3, str4, new Long(j)});
        } else if (this.contextWeakReference.get() == null) {
        } else {
            shouldDownload(this.contextWeakReference.get(), str, str2, str3, str4, j);
        }
    }

    public static boolean shouldDownload(Context context, String str, String str2, String str3, String str4, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c12996ba", new Object[]{context, str, str2, str3, str4, new Long(j)})).booleanValue();
        }
        if (str == null) {
            return false;
        }
        String path = Uri.parse(str).getPath();
        if ((path == null || !APK_PATTERN.matcher(path).find()) && (str3 == null || !APK_PATTERN.matcher(str3).find())) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        intent.setFlags(268435456);
        context.startActivity(intent);
        return true;
    }
}
