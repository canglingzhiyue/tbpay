package com.taobao.search.mmd.onesearch;

import android.app.Activity;
import android.content.DialogInterface;
import android.taobao.util.k;
import android.taobao.windvane.extra.uc.WVUCWebChromeClient;
import android.view.View;
import android.webkit.ConsoleMessage;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.common.util.q;
import com.taobao.tao.util.TBDialog;
import com.taobao.taobao.R;
import com.uc.webview.export.JsResult;
import com.uc.webview.export.WebView;
import tb.kge;

/* loaded from: classes7.dex */
public class a extends WVUCWebChromeClient {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private JsResult f19166a;

    static {
        kge.a(-311789149);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        if (str.hashCode() == -634514222) {
            return new Boolean(super.onConsoleMessage((ConsoleMessage) objArr[0]));
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ JsResult a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JsResult) ipChange.ipc$dispatch("28b24255", new Object[]{aVar}) : aVar.f19166a;
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebChromeClient, com.uc.webview.export.WebChromeClient
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("da2e14d2", new Object[]{this, consoleMessage})).booleanValue();
        }
        q.a("onConsoleMessage", consoleMessage.message() + " line:" + consoleMessage.lineNumber() + " id:" + consoleMessage.sourceId());
        return super.onConsoleMessage(consoleMessage);
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebChromeClient, com.uc.webview.export.WebChromeClient
    public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("16bdf0ae", new Object[]{this, webView, str, str2, jsResult})).booleanValue();
        }
        this.f19166a = jsResult;
        if (webView.getRootView().getContext() instanceof Activity) {
            new TBDialog.Builder((Activity) webView.getRootView().getContext()).setTitle(com.alibaba.ability.localization.b.a(R.string.app_prompt)).setMessage(str2).setPositiveButton(com.alibaba.ability.localization.b.a(R.string.taobao_app_1005_1_16665), new View.OnClickListener() { // from class: com.taobao.search.mmd.onesearch.a.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    } else {
                        a.a(a.this).confirm();
                    }
                }
            }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.taobao.search.mmd.onesearch.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnCancelListener
                public void onCancel(DialogInterface dialogInterface) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f4ed3926", new Object[]{this, dialogInterface});
                        return;
                    }
                    q.a(k.TAOBAO_TAG, "Alert cancel");
                    a.a(a.this).confirm();
                }
            }).show();
        } else {
            this.f19166a.confirm();
            q.b(k.TAOBAO_TAG, "chrome client error : dialog context not an activity!");
        }
        return true;
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebChromeClient, com.uc.webview.export.WebChromeClient
    public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("af8e0ca", new Object[]{this, webView, str, str2, jsResult})).booleanValue();
        }
        this.f19166a = jsResult;
        if (webView.getRootView().getContext() instanceof Activity) {
            new TBDialog.Builder((Activity) webView.getRootView().getContext()).setTitle(com.alibaba.ability.localization.b.a(R.string.app_prompt)).setMessage(str2).setPositiveButton(com.alibaba.ability.localization.b.a(R.string.taobao_app_1005_1_16665), new View.OnClickListener() { // from class: com.taobao.search.mmd.onesearch.a.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    } else {
                        a.a(a.this).confirm();
                    }
                }
            }).setNegativeButton(com.alibaba.ability.localization.b.a(R.string.taobao_app_1005_1_16664), new View.OnClickListener() { // from class: com.taobao.search.mmd.onesearch.a.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    } else {
                        a.a(a.this).cancel();
                    }
                }
            }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.taobao.search.mmd.onesearch.a.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnCancelListener
                public void onCancel(DialogInterface dialogInterface) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f4ed3926", new Object[]{this, dialogInterface});
                        return;
                    }
                    q.a(k.TAOBAO_TAG, "Alert cancel");
                    a.a(a.this).cancel();
                }
            }).show();
        } else {
            this.f19166a.cancel();
            q.b(k.TAOBAO_TAG, "chrome client error : dialog context not an activity!");
        }
        return true;
    }
}
