package com.ali.user.open.core.webview;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.net.http.SslError;
import android.taobao.windvane.export.adapter.ILocalizationService;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.ali.user.open.core.util.DialogHelper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class BaseWebViewClient extends WebViewClient {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public boolean firstAlert = true;
    public boolean proceed = false;

    static {
        kge.a(-1470225907);
    }

    public static /* synthetic */ Object ipc$super(BaseWebViewClient baseWebViewClient, String str, Object... objArr) {
        if (str.hashCode() == -496040708) {
            super.onReceivedSslError((WebView) objArr[0], (SslErrorHandler) objArr[1], (SslError) objArr[2]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, final SslErrorHandler sslErrorHandler, SslError sslError) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e26f04fc", new Object[]{this, webView, sslErrorHandler, sslError});
        } else if (!this.firstAlert) {
            if (this.proceed) {
                sslErrorHandler.proceed();
            } else {
                super.onReceivedSslError(webView, sslErrorHandler, sslError);
            }
        } else {
            DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: com.ali.user.open.core.webview.BaseWebViewClient.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                        return;
                    }
                    sslErrorHandler.proceed();
                    BaseWebViewClient.this.proceed = true;
                }
            };
            DialogInterface.OnClickListener onClickListener2 = new DialogInterface.OnClickListener() { // from class: com.ali.user.open.core.webview.BaseWebViewClient.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                        return;
                    }
                    sslErrorHandler.cancel();
                    BaseWebViewClient.this.proceed = false;
                }
            };
            if (webView.getContext() instanceof Activity) {
                DialogHelper.getInstance().alert((Activity) webView.getContext(), "SSL证书错误", "您的连接不是安全连接，是否继续访问?", ILocalizationService.CONFIRM, onClickListener, ILocalizationService.CANCEL, onClickListener2);
                return;
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(webView.getContext());
            builder.setPositiveButton(ILocalizationService.CONFIRM, onClickListener);
            builder.setNeutralButton(ILocalizationService.CANCEL, onClickListener2);
            try {
                AlertDialog create = builder.create();
                create.setTitle("SSL证书错误");
                create.setMessage("您的连接不是安全连接，是否继续访问?");
                create.show();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
