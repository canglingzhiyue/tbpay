package com.alipay.zoloz.toyger.workspace;

import android.os.Handler;
import android.webkit.JsPromptResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.alipay.mobile.security.bio.utils.BioLog;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class NavWebChromeClient extends WebChromeClient {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Handler mMainHandler;

    public static /* synthetic */ Object ipc$super(NavWebChromeClient navWebChromeClient, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode != -808898598) {
            if (hashCode == -650605876) {
                super.onReceivedTitle((WebView) objArr[0], (String) objArr[1]);
                return null;
            } else if (hashCode != 384496945) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            } else {
                super.onProgressChanged((WebView) objArr[0], ((Number) objArr[1]).intValue());
                return null;
            }
        }
        return new Boolean(super.onJsPrompt((WebView) objArr[0], (String) objArr[1], (String) objArr[2], (String) objArr[3], (JsPromptResult) objArr[4]));
    }

    public NavWebChromeClient(Handler handler) {
        this.mMainHandler = handler;
    }

    @Override // android.webkit.WebChromeClient
    public void onProgressChanged(WebView webView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16eaf531", new Object[]{this, webView, new Integer(i)});
            return;
        }
        super.onProgressChanged(webView, i);
        BioLog.d("onProgressChanged:" + i);
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cfc92fda", new Object[]{this, webView, str, str2, str3, jsPromptResult})).booleanValue();
        }
        BioLog.i("onJsPrompt:" + str2);
        if ("face_auth".endsWith(str2) || "start_face".equals(str2)) {
            super.onJsPrompt(webView, str, str2, str3, jsPromptResult);
            jsPromptResult.cancel();
            Handler handler = this.mMainHandler;
            handler.sendMessage(handler.obtainMessage(0));
            return true;
        } else if ("navi_close".endsWith(str2) || "guide_close".equals(str2)) {
            super.onJsPrompt(webView, str, str2, str3, jsPromptResult);
            jsPromptResult.cancel();
            Handler handler2 = this.mMainHandler;
            handler2.sendMessage(handler2.obtainMessage(3));
            return true;
        } else if ("guide_log".endsWith(str2)) {
            super.onJsPrompt(webView, str, str2, str3, jsPromptResult);
            jsPromptResult.cancel();
            Handler handler3 = this.mMainHandler;
            handler3.sendMessage(handler3.obtainMessage(4, str3));
            return true;
        } else {
            return super.onJsPrompt(webView, str, str2, str3, jsPromptResult);
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onReceivedTitle(WebView webView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9388acc", new Object[]{this, webView, str});
            return;
        }
        super.onReceivedTitle(webView, str);
        BioLog.i("Webview title:" + str);
        if (str == null) {
            return;
        }
        if (!str.contains("404") && !str.contains("500")) {
            return;
        }
        Handler handler = this.mMainHandler;
        handler.sendMessage(handler.obtainMessage(2));
    }
}
