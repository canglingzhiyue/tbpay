package com.alibaba.wireless.security.open.middletier.fc.ui;

import android.content.Context;
import android.os.Build;
import android.taobao.windvane.extra.uc.WVUCWebView;
import android.taobao.windvane.extra.uc.WVUCWebViewClient;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.alibaba.wireless.security.open.middletier.MidBridge;
import com.alibaba.wireless.security.open.middletier.fc.ui.IBXWebview;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.uc.webview.export.DownloadListener;
import com.uc.webview.export.WebView;
import tb.kge;

/* loaded from: classes3.dex */
public class BXWVWebview extends WVUCWebView implements IBXWebview {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public IUrlVerifyCallback f4301a;

    static {
        kge.a(-2014684951);
        kge.a(1589264277);
    }

    public BXWVWebview(Context context, String str) {
        super(context);
        this.f4301a = null;
        getSettings().setTextZoom(100);
        if (Build.VERSION.SDK_INT >= 11) {
            try {
                removeJavascriptInterface("searchBoxJavaBridge_");
                removeJavascriptInterface("accessibility");
                removeJavascriptInterface("accessibilityTraversal");
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.alibaba.wireless.security.open.middletier.fc.ui.IBXWebview
    public void bxDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d69c414b", new Object[]{this});
        } else if (MidBridge.getWvmlfcdmSwitch() <= 0) {
            setVisibility(8);
            removeAllViews();
            coreDestroy();
        } else {
            setVisibility(8);
            ViewParent parent = getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this);
            }
            destroy();
        }
    }

    @Override // com.alibaba.wireless.security.open.middletier.fc.ui.IBXWebview
    public void bxLoadUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b18607c4", new Object[]{this, str});
        } else {
            loadUrl(str);
        }
    }

    @Override // com.alibaba.wireless.security.open.middletier.fc.ui.IBXWebview
    public void bxSetUp(Context context, IUrlVerifyCallback iUrlVerifyCallback, final IBXWebview.IBXDownloadService iBXDownloadService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c1d6dfa", new Object[]{this, context, iUrlVerifyCallback, iBXDownloadService});
            return;
        }
        this.f4301a = iUrlVerifyCallback;
        setWebViewClient(new WVUCWebViewClient(context) { // from class: com.alibaba.wireless.security.open.middletier.fc.ui.BXWVWebview.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
                if (str.hashCode() == -623958539) {
                    return new Boolean(super.shouldOverrideUrlLoading((WebView) objArr[0], (String) objArr[1]));
                }
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }

            @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("dacf25f5", new Object[]{this, webView, str})).booleanValue();
                }
                IUrlVerifyCallback iUrlVerifyCallback2 = BXWVWebview.this.f4301a;
                if (iUrlVerifyCallback2 != null && iUrlVerifyCallback2.shouldOverrideUrlLoading(str)) {
                    return true;
                }
                return super.shouldOverrideUrlLoading(webView, str);
            }
        });
        if (iBXDownloadService == null) {
            return;
        }
        setDownloadListener(new DownloadListener(this) { // from class: com.alibaba.wireless.security.open.middletier.fc.ui.BXWVWebview.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.uc.webview.export.DownloadListener
            public void onDownloadStart(String str, String str2, String str3, String str4, long j) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("84e41dba", new Object[]{this, str, str2, str3, str4, new Long(j)});
                } else {
                    iBXDownloadService.startDownload(str, str3);
                }
            }
        });
    }
}
