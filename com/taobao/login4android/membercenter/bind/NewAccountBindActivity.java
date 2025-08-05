package com.taobao.login4android.membercenter.bind;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.KeyEvent;
import com.ali.user.mobile.utils.StringUtil;
import com.ali.user.mobile.webview.WebViewActivity;
import com.alibaba.android.split.core.splitcompat.j;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.uc.webview.export.WebView;
import tb.kge;

/* loaded from: classes7.dex */
public class NewAccountBindActivity extends WebViewActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int BIND_ERROR = -1;
    private static final int BIND_SUCCESS = 0;
    private int mBindRet = -1;

    static {
        kge.a(-1957221239);
    }

    public static /* synthetic */ Object ipc$super(NewAccountBindActivity newAccountBindActivity, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode != -1380070616) {
            if (hashCode == -884160602) {
                return new Boolean(super.onKeyDown(((Number) objArr[0]).intValue(), (KeyEvent) objArr[1]));
            }
            if (hashCode != 514894248) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
            super.attachBaseContext((Context) objArr[0]);
            return null;
        }
        return new Boolean(super.overrideUrlLoading((WebView) objArr[0], (String) objArr[1]));
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

    @Override // com.ali.user.mobile.webview.WebViewActivity
    public boolean overrideUrlLoading(WebView webView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("adbdcb28", new Object[]{this, webView, str})).booleanValue();
        }
        if (str.startsWith("mailto:") || str.startsWith("tel:")) {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
            if (BindAlipay.mBindCaller != null) {
                BindAlipay.mBindCaller.onBindError(null);
            }
            setResult(0);
            finish();
            return true;
        } else if (StringUtil.checkWebviewBridge(str)) {
            if ("true".equalsIgnoreCase(Uri.parse(str).getQueryParameter("isSuc"))) {
                this.mBindRet = 0;
                if (BindAlipay.mBindCaller != null) {
                    BindAlipay.mBindCaller.onBindSuccess(null);
                }
                setResult(-1);
                finish();
            }
            return true;
        } else {
            return super.overrideUrlLoading(webView, str);
        }
    }

    @Override // com.ali.user.mobile.webview.WebViewActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onBackPressed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88afc63", new Object[]{this});
            return;
        }
        bindCallerCallback();
        cancleOperation();
    }

    @Override // com.ali.user.mobile.webview.WebViewActivity, android.support.v7.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb4cc7a6", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
        }
        if (i == 4) {
            bindCallerCallback();
            finish();
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    private void bindCallerCallback() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77dee894", new Object[]{this});
        } else if (BindAlipay.mBindCaller == null) {
        } else {
            if (this.mBindRet == 0) {
                BindAlipay.mBindCaller.onBindSuccess(null);
                setResult(-1);
                return;
            }
            BindAlipay.mBindCaller.onBindError(null);
            setResult(0);
        }
    }
}
