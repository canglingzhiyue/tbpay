package com.uc.webview.internal.android;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.uc.webview.export.GeolocationPermissions;
import com.uc.webview.export.WebChromeClient;
import com.uc.webview.export.WebView;
import com.uc.webview.internal.interfaces.IOpenFileChooser;
import java.lang.ref.WeakReference;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes9.dex */
final class h extends i implements IOpenFileChooser {
    private WeakHashMap<PermissionRequest, WeakReference<c>> c;

    /* loaded from: classes9.dex */
    class a implements WebChromeClient.CustomViewCallback {
        private WebChromeClient.CustomViewCallback b;

        public a(WebChromeClient.CustomViewCallback customViewCallback) {
            this.b = customViewCallback;
        }

        @Override // com.uc.webview.export.WebChromeClient.CustomViewCallback
        public final void onCustomViewHidden() {
            WebChromeClient.CustomViewCallback customViewCallback = this.b;
            if (customViewCallback != null) {
                customViewCallback.onCustomViewHidden();
            }
        }
    }

    /* loaded from: classes9.dex */
    class b implements GeolocationPermissions.Callback {
        private GeolocationPermissions.Callback b;

        public b(GeolocationPermissions.Callback callback) {
            this.b = callback;
        }

        @Override // com.uc.webview.export.GeolocationPermissions.Callback
        public final void invoke(String str, boolean z, boolean z2) {
            GeolocationPermissions.Callback callback = this.b;
            if (callback != null) {
                callback.invoke(str, z, z2);
            }
        }
    }

    /* loaded from: classes9.dex */
    static class c extends com.uc.webview.export.PermissionRequest {

        /* renamed from: a  reason: collision with root package name */
        PermissionRequest f23869a;

        c(PermissionRequest permissionRequest) {
            this.f23869a = permissionRequest;
        }

        @Override // com.uc.webview.export.PermissionRequest
        public final void deny() {
            this.f23869a.deny();
        }

        @Override // com.uc.webview.export.PermissionRequest
        public final Uri getOrigin() {
            return this.f23869a.getOrigin();
        }

        @Override // com.uc.webview.export.PermissionRequest
        public final String[] getResources() {
            return this.f23869a.getResources();
        }

        @Override // com.uc.webview.export.PermissionRequest
        public final void grant(String[] strArr) {
            this.f23869a.grant(strArr);
        }
    }

    public h(WebView webView, com.uc.webview.export.WebChromeClient webChromeClient) {
        this.f23870a = webView;
        this.b = webChromeClient;
    }

    private void a(final ValueCallback<Uri> valueCallback, final String str, final String str2) {
        if (this.b.onShowFileChooser(this.f23870a, new ValueCallback<Uri[]>() { // from class: com.uc.webview.internal.android.h.2
            @Override // android.webkit.ValueCallback
            public final /* bridge */ /* synthetic */ void onReceiveValue(Uri[] uriArr) {
                Uri[] uriArr2 = uriArr;
                valueCallback.onReceiveValue(uriArr2 == null ? null : uriArr2[0]);
            }
        }, new WebChromeClient.FileChooserParams() { // from class: com.uc.webview.internal.android.h.3
            @Override // com.uc.webview.export.WebChromeClient.FileChooserParams
            public final Intent createIntent() {
                Intent intent = new Intent("android.intent.action.GET_CONTENT");
                intent.addCategory("android.intent.category.OPENABLE");
                if (Build.VERSION.SDK_INT >= 16) {
                    intent.setTypeAndNormalize(getAcceptTypes()[0]);
                } else {
                    intent.setType(getAcceptTypes()[0]);
                }
                return intent;
            }

            @Override // com.uc.webview.export.WebChromeClient.FileChooserParams
            public final String[] getAcceptTypes() {
                String[] strArr = new String[1];
                strArr[0] = TextUtils.isEmpty(str) ? "*/*" : str;
                return strArr;
            }

            @Override // com.uc.webview.export.WebChromeClient.FileChooserParams
            public final String getFilenameHint() {
                return "";
            }

            @Override // com.uc.webview.export.WebChromeClient.FileChooserParams
            public final int getMode() {
                return 0;
            }

            @Override // com.uc.webview.export.WebChromeClient.FileChooserParams
            public final CharSequence getTitle() {
                return "";
            }

            @Override // com.uc.webview.export.WebChromeClient.FileChooserParams
            public final boolean isCaptureEnabled() {
                return !TextUtils.isEmpty(str2);
            }
        })) {
            return;
        }
        this.b.openFileChooser(valueCallback);
    }

    @Override // android.webkit.WebChromeClient
    public final Bitmap getDefaultVideoPoster() {
        return this.b.getDefaultVideoPoster();
    }

    @Override // android.webkit.WebChromeClient
    public final View getVideoLoadingProgressView() {
        return this.b.getVideoLoadingProgressView();
    }

    @Override // android.webkit.WebChromeClient
    public final void getVisitedHistory(ValueCallback<String[]> valueCallback) {
        this.b.getVisitedHistory(valueCallback);
    }

    @Override // android.webkit.WebChromeClient
    public final void onCloseWindow(android.webkit.WebView webView) {
        this.b.onCloseWindow(this.f23870a);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        return this.b.onConsoleMessage(consoleMessage);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(android.webkit.WebView webView, boolean z, boolean z2, Message message) {
        WebView.WebViewTransport webViewTransport = (WebView.WebViewTransport) message.obj;
        com.uc.webview.export.WebView webView2 = this.f23870a;
        Objects.requireNonNull(webView2);
        WebView.WebViewTransport webViewTransport2 = new WebView.WebViewTransport();
        Message obtain = Message.obtain(new Handler(Looper.getMainLooper()) { // from class: com.uc.webview.internal.android.h.1
            @Override // android.os.Handler
            public final void handleMessage(Message message2) {
            }
        });
        obtain.obj = webViewTransport2;
        com.uc.webview.internal.e.a(true);
        boolean onCreateWindow = this.b.onCreateWindow(this.f23870a, z, z2, obtain);
        com.uc.webview.internal.e.a(false);
        webViewTransport.setWebView(webViewTransport2.getWebView() == null ? null : (android.webkit.WebView) webViewTransport2.getWebView().getCoreView());
        if (webViewTransport.getWebView() != null) {
            message.sendToTarget();
        }
        return onCreateWindow;
    }

    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsHidePrompt() {
        this.b.onGeolocationPermissionsHidePrompt();
    }

    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        this.b.onGeolocationPermissionsShowPrompt(str, new b(callback));
    }

    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        this.b.onHideCustomView();
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsAlert(android.webkit.WebView webView, String str, String str2, JsResult jsResult) {
        return this.b.onJsAlert(this.f23870a, str, str2, new e(jsResult));
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsBeforeUnload(android.webkit.WebView webView, String str, String str2, JsResult jsResult) {
        return this.b.onJsBeforeUnload(this.f23870a, str, str2, new e(jsResult));
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsConfirm(android.webkit.WebView webView, String str, String str2, JsResult jsResult) {
        return this.b.onJsConfirm(this.f23870a, str, str2, new e(jsResult));
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(android.webkit.WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        return this.b.onJsPrompt(this.f23870a, str, str2, str3, new d(jsPromptResult));
    }

    @Override // android.webkit.WebChromeClient
    public final void onPermissionRequest(PermissionRequest permissionRequest) {
        if (Build.VERSION.SDK_INT < 21) {
            return;
        }
        if (this.b == null) {
            permissionRequest.deny();
            return;
        }
        if (this.c == null) {
            this.c = new WeakHashMap<>();
        }
        c cVar = new c(permissionRequest);
        this.c.put(permissionRequest, new WeakReference<>(cVar));
        this.b.onPermissionRequest(cVar);
    }

    @Override // android.webkit.WebChromeClient
    public final void onPermissionRequestCanceled(PermissionRequest permissionRequest) {
        WeakHashMap<PermissionRequest, WeakReference<c>> weakHashMap;
        WeakReference<c> weakReference;
        c cVar;
        if (this.b == null || (weakHashMap = this.c) == null || (weakReference = weakHashMap.get(permissionRequest)) == null || (cVar = weakReference.get()) == null) {
            return;
        }
        this.b.onPermissionRequestCanceled(cVar);
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(android.webkit.WebView webView, int i) {
        this.b.onProgressChanged(this.f23870a, i);
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedIcon(android.webkit.WebView webView, Bitmap bitmap) {
        this.b.onReceivedIcon(this.f23870a, bitmap);
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedTitle(android.webkit.WebView webView, String str) {
        this.b.onReceivedTitle(this.f23870a, str);
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedTouchIconUrl(android.webkit.WebView webView, String str, boolean z) {
        this.b.onReceivedTouchIconUrl(this.f23870a, str, z);
    }

    @Override // android.webkit.WebChromeClient
    public final void onRequestFocus(android.webkit.WebView webView) {
        this.b.onRequestFocus(this.f23870a);
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        this.b.onShowCustomView(view, new a(customViewCallback));
    }

    @Override // com.uc.webview.internal.interfaces.IOpenFileChooser
    public final void openFileChooser(ValueCallback<Uri> valueCallback) {
        a(valueCallback, null, null);
    }

    @Override // com.uc.webview.internal.interfaces.IOpenFileChooser
    public final void openFileChooser(ValueCallback<Uri> valueCallback, String str) {
        a(valueCallback, str, null);
    }

    @Override // com.uc.webview.internal.interfaces.IOpenFileChooser
    public final void openFileChooser(ValueCallback<Uri> valueCallback, String str, String str2) {
        a(valueCallback, str, str2);
    }
}
