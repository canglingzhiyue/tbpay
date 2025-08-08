package com.uc.webview.internal.android;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.print.PrintDocumentAdapter;
import mtopsdk.common.util.StringUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.webkit.ValueCallback;
import android.webkit.WebMessagePort;
import android.webkit.WebView;
import com.uc.webview.base.EnvInfo;
import com.uc.webview.export.DownloadListener;
import com.uc.webview.export.WebBackForwardList;
import com.uc.webview.export.WebChromeClient;
import com.uc.webview.export.WebMessage;
import com.uc.webview.export.WebSettings;
import com.uc.webview.export.WebView;
import com.uc.webview.export.WebViewClient;
import com.uc.webview.internal.interfaces.IWebView;
import com.uc.webview.internal.interfaces.IWebViewExtension;
import com.uc.webview.internal.interfaces.IWebViewOverride;

/* loaded from: classes9.dex */
public class WebViewAndroid extends WebView implements IWebView {
    private static boolean sFirstCreate = false;
    private IWebViewOverride mOverrideObject;
    private com.uc.webview.export.WebView mWebViewExport;

    /* loaded from: classes9.dex */
    class a implements IWebView.IHitTestResult {
        private WebView.HitTestResult b;

        private a(WebView.HitTestResult hitTestResult) {
            this.b = hitTestResult;
        }

        /* synthetic */ a(WebViewAndroid webViewAndroid, WebView.HitTestResult hitTestResult, byte b) {
            this(hitTestResult);
        }

        @Override // com.uc.webview.internal.interfaces.IWebView.IHitTestResult
        public final String getExtra() {
            return this.b.getExtra();
        }

        @Override // com.uc.webview.internal.interfaces.IWebView.IHitTestResult
        public final int getType() {
            return this.b.getType();
        }
    }

    public WebViewAndroid(Context context, AttributeSet attributeSet, com.uc.webview.export.WebView webView) {
        super(context, attributeSet);
        this.mWebViewExport = webView;
        setWebViewClient(new n(webView, new WebViewClient()));
        getSettings().setSavePassword(false);
    }

    public static WebViewAndroid create(Context context, AttributeSet attributeSet, com.uc.webview.export.WebView webView) {
        if (!sFirstCreate) {
            String d = EnvInfo.d();
            if (Build.VERSION.SDK_INT >= 28 && !StringUtils.isEmpty(d)) {
                com.uc.webview.base.g.a("android.webkit.WebView", "setDataDirectorySuffix", new Class[]{String.class}, new Object[]{d});
            }
            sFirstCreate = true;
        }
        return new WebViewAndroid(context, attributeSet, webView);
    }

    @Override // android.webkit.WebView, android.view.View
    public void computeScroll() {
        IWebViewOverride iWebViewOverride = this.mOverrideObject;
        if (iWebViewOverride != null) {
            iWebViewOverride.coreComputeScroll();
        } else {
            super.computeScroll();
        }
    }

    @Override // com.uc.webview.internal.interfaces.IWebView
    public WebBackForwardList copyBackForwardListInner() {
        android.webkit.WebBackForwardList copyBackForwardList = super.copyBackForwardList();
        if (copyBackForwardList != null) {
            return new g(copyBackForwardList);
        }
        return null;
    }

    @Override // android.webkit.WebView
    public PrintDocumentAdapter createPrintDocumentAdapter(String str) {
        if (Build.VERSION.SDK_INT >= 19) {
            return super.createPrintDocumentAdapter(str);
        }
        return null;
    }

    @Override // com.uc.webview.internal.interfaces.IWebView
    public Object createWebMessageChannelInner() {
        WebMessagePort[] createWebMessageChannel = super.createWebMessageChannel();
        if (createWebMessageChannel == null) {
            return null;
        }
        k[] kVarArr = new k[createWebMessageChannel.length];
        for (int i = 0; i < createWebMessageChannel.length; i++) {
            kVarArr[i] = new k(createWebMessageChannel[i]);
        }
        return kVarArr;
    }

    @Override // android.webkit.WebView, com.uc.webview.internal.interfaces.IWebView
    public void destroy() {
        IWebViewOverride iWebViewOverride = this.mOverrideObject;
        if (iWebViewOverride != null) {
            iWebViewOverride.coreDestroy();
        } else {
            super.destroy();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        IWebViewOverride iWebViewOverride = this.mOverrideObject;
        return iWebViewOverride != null ? iWebViewOverride.coreDispatchTouchEvent(motionEvent) : super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
    }

    @Override // android.webkit.WebView, com.uc.webview.internal.interfaces.IWebView
    public void evaluateJavascript(String str, ValueCallback<String> valueCallback) {
        if (Build.VERSION.SDK_INT >= 19) {
            super.evaluateJavascript(str, valueCallback);
        }
    }

    @Override // android.webkit.WebView, com.uc.webview.internal.interfaces.IWebView
    public void findAllAsync(String str) {
        if (Build.VERSION.SDK_INT >= 16) {
            super.findAllAsync(str);
        }
    }

    @Override // com.uc.webview.internal.interfaces.IWebView
    public IWebViewExtension getExtension() {
        return null;
    }

    @Override // com.uc.webview.internal.interfaces.IWebView
    public IWebView.IHitTestResult getHitTestResultInner() {
        WebView.HitTestResult hitTestResult = super.getHitTestResult();
        if (hitTestResult != null) {
            return new a(this, hitTestResult, (byte) 0);
        }
        return null;
    }

    @Override // com.uc.webview.internal.interfaces.IWebView
    public IWebViewOverride getOverrideObject() {
        return this.mOverrideObject;
    }

    @Override // com.uc.webview.internal.interfaces.IWebView
    public WebSettings getSettingsInner() {
        return new l(super.getSettings());
    }

    @Override // com.uc.webview.internal.interfaces.IWebView
    public View getView() {
        return this;
    }

    @Override // android.webkit.WebView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        IWebViewOverride iWebViewOverride = this.mOverrideObject;
        if (iWebViewOverride != null) {
            iWebViewOverride.coreOnConfigurationChanged(configuration);
        } else {
            super.onConfigurationChanged(configuration);
        }
    }

    @Override // android.webkit.WebView, android.view.View, com.uc.webview.internal.interfaces.IWebView
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return super.onCreateInputConnection(editorInfo);
    }

    @Override // android.webkit.WebView, android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        IWebViewOverride iWebViewOverride = this.mOverrideObject;
        if (iWebViewOverride != null) {
            iWebViewOverride.coreOnScrollChanged(i, i2, i3, i4);
        } else {
            super.onScrollChanged(i, i2, i3, i4);
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public void onVisibilityChanged(View view, int i) {
        IWebViewOverride iWebViewOverride = this.mOverrideObject;
        if (iWebViewOverride != null) {
            iWebViewOverride.coreOnVisibilityChanged(view, i);
        } else {
            super.onVisibilityChanged(view, i);
        }
    }

    @Override // android.view.View
    public boolean overScrollBy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        if (Build.VERSION.SDK_INT >= 9) {
            IWebViewOverride iWebViewOverride = this.mOverrideObject;
            return iWebViewOverride != null ? iWebViewOverride.coreOverScrollBy(i, i2, i3, i4, i5, i6, i7, i8, z) : super.overScrollBy(i, i2, i3, i4, i5, i6, i7, i8, z);
        }
        return false;
    }

    @Override // com.uc.webview.internal.interfaces.IWebView
    public void postVisualStateCallback(long j, final WebView.VisualStateCallback visualStateCallback) {
        if (Build.VERSION.SDK_INT >= 23) {
            super.postVisualStateCallback(j, new WebView.VisualStateCallback() { // from class: com.uc.webview.internal.android.WebViewAndroid.2
                @Override // android.webkit.WebView.VisualStateCallback
                public final void onComplete(long j2) {
                    visualStateCallback.onComplete(j2);
                }
            });
        }
    }

    @Override // com.uc.webview.internal.interfaces.IWebView
    public void postWebMessageInner(WebMessage webMessage, Uri uri) {
        super.postWebMessage(new j(webMessage), uri);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        IWebViewOverride iWebViewOverride = this.mOverrideObject;
        if (iWebViewOverride != null) {
            iWebViewOverride.coreRequestLayout();
        } else {
            super.requestLayout();
        }
    }

    @Override // com.uc.webview.internal.interfaces.IWebView
    public WebBackForwardList restoreStateInner(Bundle bundle) {
        android.webkit.WebBackForwardList restoreState = super.restoreState(bundle);
        if (restoreState == null) {
            return null;
        }
        return new g(restoreState);
    }

    @Override // com.uc.webview.internal.interfaces.IWebView
    public WebBackForwardList saveStateInner(Bundle bundle) {
        android.webkit.WebBackForwardList saveState = super.saveState(bundle);
        if (saveState == null) {
            return null;
        }
        return new g(saveState);
    }

    @Override // com.uc.webview.internal.interfaces.IWebView
    public void setDownloadListener(DownloadListener downloadListener) {
        if (downloadListener == null) {
            super.setDownloadListener((android.webkit.DownloadListener) null);
        } else {
            super.setDownloadListener(new com.uc.webview.internal.android.a(downloadListener));
        }
    }

    @Override // com.uc.webview.internal.interfaces.IWebView
    public void setFindListener(final WebView.FindListener findListener) {
        if (Build.VERSION.SDK_INT >= 16) {
            super.setFindListener(findListener == null ? null : new WebView.FindListener() { // from class: com.uc.webview.internal.android.WebViewAndroid.1
                @Override // android.webkit.WebView.FindListener
                public final void onFindResultReceived(int i, int i2, boolean z) {
                    findListener.onFindResultReceived(i, i2, z);
                }
            });
        }
    }

    @Override // com.uc.webview.internal.interfaces.IWebView
    public void setOverrideObject(IWebViewOverride iWebViewOverride) {
        this.mOverrideObject = iWebViewOverride;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        IWebViewOverride iWebViewOverride = this.mOverrideObject;
        if (iWebViewOverride != null) {
            iWebViewOverride.coreSetVisibility(i);
        } else {
            super.setVisibility(i);
        }
    }

    @Override // com.uc.webview.internal.interfaces.IWebView
    public void setWebChromeClient(WebChromeClient webChromeClient) {
        if (webChromeClient == null) {
            super.setWebChromeClient((android.webkit.WebChromeClient) null);
        } else {
            super.setWebChromeClient(new h(this.mWebViewExport, webChromeClient));
        }
    }

    @Override // com.uc.webview.internal.interfaces.IWebView
    public void setWebViewClient(WebViewClient webViewClient) {
        if (webViewClient == null) {
            webViewClient = new WebViewClient();
        }
        setWebViewClient(new n(this.mWebViewExport, webViewClient));
    }

    @Override // com.uc.webview.internal.interfaces.IWebView
    public void superComputeScroll() {
        super.computeScroll();
    }

    @Override // com.uc.webview.internal.interfaces.IWebView
    public void superDestroy() {
        super.destroy();
    }

    @Override // com.uc.webview.internal.interfaces.IWebView
    public boolean superDispatchTouchEvent(MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.uc.webview.internal.interfaces.IWebView
    public void superDraw(Canvas canvas) {
        super.draw(canvas);
    }

    @Override // com.uc.webview.internal.interfaces.IWebView
    public void superOnConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    public void superOnInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        IWebViewOverride iWebViewOverride = this.mOverrideObject;
        if (iWebViewOverride != null) {
            iWebViewOverride.coreOnInitializeAccessibilityEvent(accessibilityEvent);
        } else {
            onInitializeAccessibilityEvent(accessibilityEvent);
        }
    }

    public void superOnInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        IWebViewOverride iWebViewOverride = this.mOverrideObject;
        if (iWebViewOverride != null) {
            iWebViewOverride.coreOnInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        } else {
            onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        }
    }

    @Override // com.uc.webview.internal.interfaces.IWebView
    public void superOnScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
    }

    @Override // com.uc.webview.internal.interfaces.IWebView
    public void superOnVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
    }

    @Override // com.uc.webview.internal.interfaces.IWebView
    public boolean superOverScrollBy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        return super.overScrollBy(i, i2, i3, i4, i5, i6, i7, i8, z);
    }

    public boolean superPerformAccessibilityAction(int i, Bundle bundle) {
        IWebViewOverride iWebViewOverride = this.mOverrideObject;
        if (iWebViewOverride != null) {
            return iWebViewOverride.corePerformAccessibilityAction(i, bundle);
        }
        return false;
    }

    @Override // com.uc.webview.internal.interfaces.IWebView
    public void superRequestLayout() {
        super.requestLayout();
    }

    @Override // com.uc.webview.internal.interfaces.IWebView
    public void superSetVisibility(int i) {
        super.setVisibility(i);
    }

    @Override // com.uc.webview.internal.interfaces.IWebView
    public void updateContext(Context context) {
    }
}
