package com.alipay.sdk.m.f;

import android.app.Activity;
import mtopsdk.common.util.StringUtils;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public abstract class b extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String c = "v1";

    /* renamed from: a  reason: collision with root package name */
    public Activity f6160a;
    private final String b;

    public b(Activity activity, String str) {
        super(activity);
        this.f6160a = activity;
        this.b = str;
    }

    public abstract void a(String str);

    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else if (StringUtils.isEmpty(str2)) {
        } else {
            CookieSyncManager.createInstance(this.f6160a.getApplicationContext()).sync();
            CookieManager.getInstance().setCookie(str, str2);
            CookieSyncManager.getInstance().sync();
        }
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public abstract boolean b();

    public abstract void c();

    public static void a(WebView webView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4cd5550b", new Object[]{webView});
        } else if (webView == null) {
        } else {
            try {
                webView.resumeTimers();
            } catch (Throwable unused) {
            }
        }
    }
}
