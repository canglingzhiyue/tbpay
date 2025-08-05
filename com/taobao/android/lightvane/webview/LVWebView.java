package com.taobao.android.lightvane.webview;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.lightvane.jsbridge.LVBridgeEngine;
import com.taobao.android.lightvane.jsbridge.g;
import tb.gwi;
import tb.gwl;
import tb.gwo;
import tb.gwp;
import tb.gwr;
import tb.kge;
import tb.riy;

/* loaded from: classes5.dex */
public class LVWebView extends WebView implements Handler.Callback, a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "LVWebView";
    public g entryManager;
    private boolean evaluateJavascriptSupported;
    private Handler mainHandler;
    private Long nativeCallbackId;
    private Long onErrorTime;
    private b uiModel;
    private LVWebChromeClient webChromeClient;
    private LVWebViewClient webViewClient;

    static {
        kge.a(-645195953);
        kge.a(1771424998);
        kge.a(-1043440182);
    }

    public static /* synthetic */ Object ipc$super(LVWebView lVWebView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1983604863:
                super.destroy();
                return null;
            case -1512649357:
                super.onResume();
                return null;
            case -1312899459:
                super.evaluateJavascript((String) objArr[0], (ValueCallback) objArr[1]);
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 1004220751:
                super.onScrollChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // com.taobao.android.lightvane.webview.a
    public View getView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this}) : this;
    }

    public LVWebView(Context context) {
        super(context);
        this.nativeCallbackId = 1000L;
        this.onErrorTime = 0L;
        this.evaluateJavascriptSupported = Build.VERSION.SDK_INT >= 19;
        initInternal();
    }

    public LVWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.nativeCallbackId = 1000L;
        this.onErrorTime = 0L;
        this.evaluateJavascriptSupported = Build.VERSION.SDK_INT >= 19;
        initInternal();
    }

    public LVWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.nativeCallbackId = 1000L;
        this.onErrorTime = 0L;
        this.evaluateJavascriptSupported = Build.VERSION.SDK_INT >= 19;
        initInternal();
    }

    private void initInternal() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd6745f4", new Object[]{this});
            return;
        }
        this.mainHandler = new Handler(Looper.getMainLooper(), this);
        this.webViewClient = new LVWebViewClient(getContext());
        setWebViewClient(this.webViewClient);
        this.webChromeClient = new LVWebChromeClient(getContext());
        setWebChromeClient(this.webChromeClient);
        this.uiModel = new b(getContext(), this);
        gwr.a(getContext(), this);
        configWebSettings();
        this.entryManager = new g(getContext(), this);
        addJavascriptInterface(new LVBridgeEngine(this), "__lightvane__");
        try {
            if (!gwl.a(getContext()) || Build.VERSION.SDK_INT < 19) {
                return;
            }
            gwo.d(TAG, "enable web contents debug");
            setWebContentsDebuggingEnabled(true);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private void configWebSettings() {
        WebSettings settings = getSettings();
        settings.setAllowFileAccess(true);
        settings.setJavaScriptEnabled(true);
        String str = gwi.g;
        String str2 = gwi.h;
        String userAgentString = settings.getUserAgentString();
        if (userAgentString != null) {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                userAgentString = userAgentString + " AliApp(" + str + "/" + str2 + riy.BRACKET_END_STR;
            }
            if (!userAgentString.contains("TTID/") && !TextUtils.isEmpty(gwi.f28538a)) {
                userAgentString = userAgentString + " TTID/" + gwi.f28538a;
            }
        }
        settings.setUserAgentString(userAgentString + gwi.DEFAULT_UA);
        settings.setCacheMode(-1);
        if (Build.VERSION.SDK_INT >= 5) {
            settings.setDatabaseEnabled(false);
            String str3 = "/data/data/" + getContext().getPackageName() + "/databases";
            settings.setDatabasePath(str3);
            settings.setGeolocationEnabled(true);
            settings.setGeolocationDatabasePath(str3);
        }
        settings.setDomStorageEnabled(true);
        if (Build.VERSION.SDK_INT < 33) {
            try {
                settings.getClass().getMethod("setAppCacheEnabled", Boolean.TYPE).invoke(settings, true);
                Context context = getContext();
                if (context != null && context.getCacheDir() != null) {
                    settings.getClass().getMethod("setAppCachePath", String.class).invoke(settings, context.getCacheDir().getAbsolutePath());
                }
            } catch (Throwable unused) {
            }
        }
        if (Build.VERSION.SDK_INT < 18) {
            settings.setSavePassword(false);
        }
        if (Build.VERSION.SDK_INT >= 14) {
            settings.setTextZoom(100);
        } else {
            settings.setTextSize(WebSettings.TextSize.NORMAL);
        }
        if (Build.VERSION.SDK_INT > 18 || Build.VERSION.SDK_INT < 16) {
            return;
        }
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
    }

    public void refresh() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad3d31e2", new Object[]{this});
        } else {
            reload();
        }
    }

    @Override // com.taobao.android.lightvane.webview.a
    public void evaluateJavascript(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbc0a0f7", new Object[]{this, str});
        } else if (str == null) {
        } else {
            evaluateJavascript(str, null);
        }
    }

    @Override // android.webkit.WebView
    public void evaluateJavascript(String str, ValueCallback<String> valueCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1bebe7d", new Object[]{this, str, valueCallback});
            return;
        }
        if (str != null && str.length() > 10 && "javascript:".equals(str.substring(0, 11).toLowerCase())) {
            str = str.substring(11);
        }
        if (this.evaluateJavascriptSupported) {
            try {
                super.evaluateJavascript(str, valueCallback);
            } catch (IllegalStateException unused) {
                this.evaluateJavascriptSupported = false;
                evaluateJavascript(str, valueCallback);
            } catch (NoSuchMethodError unused2) {
                this.evaluateJavascriptSupported = false;
                evaluateJavascript(str, valueCallback);
            }
        } else if (valueCallback == null) {
            loadUrl("javascript:" + str);
        } else {
            script2NativeCallback(str, valueCallback);
        }
    }

    private void script2NativeCallback(String str, ValueCallback<String> valueCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5868cd3a", new Object[]{this, str, valueCallback});
            return;
        }
        Long valueOf = Long.valueOf(this.nativeCallbackId.longValue() + 1);
        this.nativeCallbackId = valueOf;
        gwp.a(String.valueOf(valueOf), valueCallback);
        loadUrl("javascript:console.log('lvNativeCallback/" + valueOf + "/'+function(){var s = " + str + "; return (typeof s === 'object' ? JSON.stringify(s) : typeof s === 'string' ? '\"' + s + '\"' : s);}())");
    }

    @Override // android.webkit.WebView
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        g gVar = this.entryManager;
        if (gVar != null) {
            gVar.c();
        }
        super.onResume();
    }

    @Override // android.webkit.WebView
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        g gVar = this.entryManager;
        if (gVar != null) {
            gVar.b();
        }
        super.onPause();
    }

    @Override // android.webkit.WebView, android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bdb314f", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        g gVar = this.entryManager;
        if (gVar != null) {
            gVar.a(i, i2, i3, i4);
        }
        try {
            super.onScrollChanged(i, i2, i3, i4);
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }

    public boolean back() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7e58bdf2", new Object[]{this})).booleanValue();
        }
        if (!canGoBack()) {
            return false;
        }
        goBack();
        return true;
    }

    public void addJsObject(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b80dd8d6", new Object[]{this, str, obj});
            return;
        }
        g gVar = this.entryManager;
        if (gVar == null) {
            return;
        }
        gVar.a(str, obj);
    }

    @Override // com.taobao.android.lightvane.webview.a
    public Object getJsObject(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("a0dcc3a3", new Object[]{this, str});
        }
        g gVar = this.entryManager;
        if (gVar == null) {
            return null;
        }
        return gVar.a(str);
    }

    public String getUserAgentString() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a06231a4", new Object[]{this}) : getSettings().getUserAgentString();
    }

    public void setUserAgentString(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("260bd7ba", new Object[]{this, str});
        } else {
            getSettings().setUserAgentString(str);
        }
    }

    public void onMessage(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cf50210", new Object[]{this, new Integer(i), obj});
        } else if (this.mainHandler == null) {
        } else {
            Message obtain = Message.obtain();
            obtain.what = i;
            obtain.obj = obj;
            this.mainHandler.sendMessage(obtain);
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("282a8c1d", new Object[]{this, message})).booleanValue();
        }
        int i = message.what;
        return false;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        g gVar = this.entryManager;
        if (gVar == null) {
            return;
        }
        gVar.a(i, i2, intent);
    }

    @Override // android.webkit.WebView
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        Handler handler = this.mainHandler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        g gVar = this.entryManager;
        if (gVar != null) {
            gVar.a();
        }
        super.destroy();
    }
}
