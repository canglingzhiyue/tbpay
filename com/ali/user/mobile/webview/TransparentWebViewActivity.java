package com.ali.user.mobile.webview;

import android.content.Context;
import android.os.Bundle;
import com.ali.user.mobile.ui.WebConstant;
import com.alibaba.android.split.core.splitcompat.j;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.kge;

/* loaded from: classes2.dex */
public class TransparentWebViewActivity extends WebViewActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public boolean closeIfLoadFailed = false;

    static {
        kge.a(-20714060);
    }

    public static /* synthetic */ Object ipc$super(TransparentWebViewActivity transparentWebViewActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case -39202941:
                super.onWebViewReceivedError(((Number) objArr[0]).intValue(), (String) objArr[1], (String) objArr[2]);
                return null;
            case 267248023:
                super.init();
                return null;
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
                return null;
            case 1150324634:
                super.finish();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // com.ali.user.mobile.webview.WebViewActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        j.b(context);
    }

    @Override // com.ali.user.mobile.webview.WebViewActivity, com.ali.user.mobile.base.ui.BaseActivity
    public boolean needToolbar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a370e010", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.ali.user.mobile.base.ui.BaseActivity
    public void setDefaultTheme() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8c0ad11", new Object[]{this});
        }
    }

    @Override // com.ali.user.mobile.webview.WebViewActivity, com.ali.user.mobile.base.ui.BaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        this.activityIsTranslucent = true;
        super.onCreate(bundle);
    }

    @Override // com.ali.user.mobile.webview.WebViewActivity, com.ali.user.mobile.base.ui.BaseActivity
    public int getLayoutContent() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5894a33", new Object[]{this})).intValue() : R.layout.aliuser_activity_transparent_webview;
    }

    @Override // com.ali.user.mobile.webview.WebViewActivity
    public void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        super.init();
        this.mAPRelativeLayout.setBackgroundColor(0);
        if (this.mWebView != null) {
            try {
                this.mWebView.setBackgroundColor(0);
                this.mWebView.getBackground().setAlpha(0);
            } catch (Exception e) {
                e.printStackTrace();
                this.mWebView.setBackgroundColor(0);
            }
        }
        try {
            this.closeIfLoadFailed = getIntent().getBooleanExtra(WebConstant.WEB_CLOSE_IF_LOAD_FAILED, false);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        this.mProgressBar.setVisibility(0);
    }

    @Override // com.ali.user.mobile.webview.WebViewActivity
    public void onWebViewReceivedError(int i, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fda9cf83", new Object[]{this, new Integer(i), str, str2});
            return;
        }
        super.onWebViewReceivedError(i, str, str2);
        if (!this.closeIfLoadFailed || this.loadFinishedOnce) {
            return;
        }
        finish();
    }

    @Override // android.app.Activity
    public void finish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
            return;
        }
        super.finish();
        overridePendingTransition(0, 0);
    }
}
