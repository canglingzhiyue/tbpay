package com.ali.user.mobile.webview;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.net.http.SslError;
import android.taobao.windvane.extra.uc.WVUCWebViewClient;
import com.ali.user.mobile.base.ui.BaseActivity;
import com.ali.user.mobile.log.UserTrackAdapter;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.log.LoginTLogAdapter;
import com.taobao.taobao.R;
import com.uc.webview.export.SslErrorHandler;
import com.uc.webview.export.WebView;
import java.lang.ref.WeakReference;
import java.util.Properties;
import tb.kge;

/* loaded from: classes2.dex */
public class LoginWebViewClient extends WVUCWebViewClient {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public boolean firstAlert;
    public boolean proceed;
    public WeakReference<Activity> reference;

    static {
        kge.a(-207753863);
    }

    public static /* synthetic */ Object ipc$super(LoginWebViewClient loginWebViewClient, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1262473342) {
            super.onReceivedSslError((WebView) objArr[0], (SslErrorHandler) objArr[1], (SslError) objArr[2]);
            return null;
        } else if (hashCode != -623958539) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            return new Boolean(super.shouldOverrideUrlLoading((WebView) objArr[0], (String) objArr[1]));
        }
    }

    public boolean overrideUrlLoading(WebView webView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("adbdcb28", new Object[]{this, webView, str})).booleanValue();
        }
        return true;
    }

    public LoginWebViewClient(Activity activity) {
        super(activity);
        this.firstAlert = true;
        this.proceed = false;
        this.reference = new WeakReference<>(activity);
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dacf25f5", new Object[]{this, webView, str})).booleanValue();
        }
        if (this.reference.get() != null) {
            try {
                z = overrideUrlLoading(webView, str);
            } catch (Exception e) {
                LoginTLogAdapter.e("WebViewActivity", "webview内跳转地址有问题" + str, e);
            }
        }
        if (!z) {
            return super.shouldOverrideUrlLoading(webView, str);
        }
        return true;
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
    public void onReceivedSslError(WebView webView, final SslErrorHandler sslErrorHandler, SslError sslError) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4c02f82", new Object[]{this, webView, sslErrorHandler, sslError});
            return;
        }
        LoginTLogAdapter.e("WebViewActivity", "已忽略证书校验的错误！");
        Properties properties = new Properties();
        if (webView.getUrl() != null) {
            properties.setProperty("url", webView.getUrl());
        }
        UserTrackAdapter.sendUT("Event_ReceivedSslError", properties);
        Activity activity = this.reference.get();
        if (!this.firstAlert) {
            if (this.proceed) {
                sslErrorHandler.proceed();
                return;
            } else {
                super.onReceivedSslError(webView, sslErrorHandler, sslError);
                return;
            }
        }
        String string = webView.getContext().getResources().getString(R.string.aliuser_ssl_error_title);
        String string2 = webView.getContext().getResources().getString(R.string.aliuser_ssl_error_info);
        String string3 = webView.getContext().getResources().getString(R.string.aliuser_confirm);
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: com.ali.user.mobile.webview.LoginWebViewClient.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                    return;
                }
                sslErrorHandler.proceed();
                if (dialogInterface != null) {
                    dialogInterface.dismiss();
                }
                LoginWebViewClient.this.proceed = true;
            }
        };
        String string4 = webView.getContext().getResources().getString(R.string.aliuser_cancel);
        DialogInterface.OnClickListener onClickListener2 = new DialogInterface.OnClickListener() { // from class: com.ali.user.mobile.webview.LoginWebViewClient.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                    return;
                }
                sslErrorHandler.cancel();
                LoginWebViewClient.this.proceed = false;
                if (dialogInterface == null) {
                    return;
                }
                dialogInterface.dismiss();
            }
        };
        if (activity instanceof BaseActivity) {
            ((BaseActivity) activity).alert(string, string2, string3, onClickListener, string4, onClickListener2);
            this.firstAlert = false;
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(webView.getContext());
        builder.setPositiveButton(string3, onClickListener);
        builder.setNeutralButton(string4, onClickListener2);
        try {
            AlertDialog create = builder.create();
            create.setTitle(string);
            create.setMessage(string2);
            create.show();
            this.firstAlert = false;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
