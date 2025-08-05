package com.ali.user.mobile.webview;

import android.content.Context;
import android.taobao.windvane.extra.uc.WVUCWebView;
import android.util.AttributeSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.uc.webview.export.WebSettings;
import tb.kge;

/* loaded from: classes2.dex */
public class LoginWebView extends WVUCWebView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static String TAG;

    static {
        kge.a(501927950);
        TAG = "login.LoginWebView";
    }

    public LoginWebView(Context context) {
        super(context);
    }

    public LoginWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LoginWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        setVerticalScrollbarOverlay(true);
        WebSettings settings = getSettings();
        settings.setSupportMultipleWindows(false);
        settings.setJavaScriptEnabled(true);
        settings.setSavePassword(false);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setJavaScriptCanOpenWindowsAutomatically(false);
        settings.setDomStorageEnabled(true);
        String path = this.context.getDir("cache", 0).getPath();
        settings.setAllowFileAccess(true);
        settings.setCacheMode(-1);
        settings.setBuiltInZoomControls(false);
        try {
            settings.setAppCachePath(path);
            settings.setAppCacheEnabled(true);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        try {
            removeJavascriptInterface("searchBoxJavaBridge_");
            removeJavascriptInterface("accessibility");
            removeJavascriptInterface("accessibilityTraversal");
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }
}
