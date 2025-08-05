package com.alipay.zoloz.toyger.widget;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.webkit.JsPromptResult;
import android.webkit.WebView;
import android.widget.AbsoluteLayout;
import android.widget.ProgressBar;
import com.alipay.mobile.security.bio.utils.BioLog;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class ToygerProgressWebView extends WebView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Handler mHandler;
    private ProgressBar mProgressBar;

    public static /* synthetic */ Object ipc$super(ToygerProgressWebView toygerProgressWebView, String str, Object... objArr) {
        if (str.hashCode() == 1004220751) {
            super.onScrollChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ ProgressBar access$000(ToygerProgressWebView toygerProgressWebView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ProgressBar) ipChange.ipc$dispatch("44d41304", new Object[]{toygerProgressWebView}) : toygerProgressWebView.mProgressBar;
    }

    public static /* synthetic */ Handler access$100(ToygerProgressWebView toygerProgressWebView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("5964ae9f", new Object[]{toygerProgressWebView}) : toygerProgressWebView.mHandler;
    }

    public ToygerProgressWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mProgressBar = new ProgressBar(context, null, 16842872);
        this.mProgressBar.setLayoutParams(new AbsoluteLayout.LayoutParams(-1, 3, 0, 0));
        addView(this.mProgressBar);
        setWebChromeClient(new WebChromeClient());
    }

    public void setHandler(Handler handler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc2a32bf", new Object[]{this, handler});
        } else {
            this.mHandler = handler;
        }
    }

    /* loaded from: classes3.dex */
    public class WebChromeClient extends android.webkit.WebChromeClient {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(WebChromeClient webChromeClient, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode != -808898598) {
                if (hashCode != 384496945) {
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                }
                super.onProgressChanged((WebView) objArr[0], ((Number) objArr[1]).intValue());
                return null;
            }
            return new Boolean(super.onJsPrompt((WebView) objArr[0], (String) objArr[1], (String) objArr[2], (String) objArr[3], (JsPromptResult) objArr[4]));
        }

        public WebChromeClient() {
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("16eaf531", new Object[]{this, webView, new Integer(i)});
                return;
            }
            if (i == 100) {
                ToygerProgressWebView.access$000(ToygerProgressWebView.this).setVisibility(8);
            } else {
                if (ToygerProgressWebView.access$000(ToygerProgressWebView.this).getVisibility() == 8) {
                    ToygerProgressWebView.access$000(ToygerProgressWebView.this).setVisibility(0);
                }
                ToygerProgressWebView.access$000(ToygerProgressWebView.this).setProgress(i);
            }
            super.onProgressChanged(webView, i);
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("cfc92fda", new Object[]{this, webView, str, str2, str3, jsPromptResult})).booleanValue();
            }
            BioLog.i("onJsPrompt:" + str2);
            if ("face_auth".endsWith(str2)) {
                super.onJsPrompt(webView, str, str2, str3, jsPromptResult);
                jsPromptResult.cancel();
                ToygerProgressWebView.access$100(ToygerProgressWebView.this).sendMessage(ToygerProgressWebView.access$100(ToygerProgressWebView.this).obtainMessage(0));
                return true;
            } else if ("navi_close".endsWith(str2)) {
                super.onJsPrompt(webView, str, str2, str3, jsPromptResult);
                jsPromptResult.cancel();
                ToygerProgressWebView.access$100(ToygerProgressWebView.this).sendMessage(ToygerProgressWebView.access$100(ToygerProgressWebView.this).obtainMessage(3));
                return true;
            } else if ("guide_log".endsWith(str2)) {
                super.onJsPrompt(webView, str, str2, str3, jsPromptResult);
                jsPromptResult.cancel();
                Message obtainMessage = ToygerProgressWebView.access$100(ToygerProgressWebView.this).obtainMessage(4);
                obtainMessage.obj = str3;
                ToygerProgressWebView.access$100(ToygerProgressWebView.this).sendMessage(obtainMessage);
                return true;
            } else {
                return super.onJsPrompt(webView, str, str2, str3, jsPromptResult);
            }
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bdb314f", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        AbsoluteLayout.LayoutParams layoutParams = (AbsoluteLayout.LayoutParams) this.mProgressBar.getLayoutParams();
        layoutParams.x = i;
        layoutParams.y = i2;
        this.mProgressBar.setLayoutParams(layoutParams);
        super.onScrollChanged(i, i2, i3, i4);
    }
}
