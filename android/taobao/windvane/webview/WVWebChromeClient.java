package android.taobao.windvane.webview;

import android.content.Context;
import android.taobao.windvane.jsbridge.l;
import mtopsdk.common.util.StringUtils;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebStorage;
import android.webkit.WebView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.aem;
import tb.kge;

/* loaded from: classes2.dex */
public class WVWebChromeClient extends WebChromeClient {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final long MAX_QUOTA = 20971520;
    private static final String TAG = "WVWebChromeClient";
    public Context mContext;
    public WebChromeClient extraWebChromeClient = null;
    public IWVWebView mWebView = null;

    /* renamed from: android.taobao.windvane.webview.WVWebChromeClient$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f1717a = new int[ConsoleMessage.MessageLevel.values().length];

        static {
            try {
                f1717a[ConsoleMessage.MessageLevel.WARNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1717a[ConsoleMessage.MessageLevel.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1717a[ConsoleMessage.MessageLevel.LOG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1717a[ConsoleMessage.MessageLevel.TIP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1717a[ConsoleMessage.MessageLevel.DEBUG.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    static {
        kge.a(-698166368);
    }

    public static /* synthetic */ Object ipc$super(WVWebChromeClient wVWebChromeClient, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode != -634514222) {
            if (hashCode == 14073824) {
                super.onGeolocationPermissionsShowPrompt((String) objArr[0], (GeolocationPermissions.Callback) objArr[1]);
                return null;
            } else if (hashCode != 384496945) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            } else {
                super.onProgressChanged((WebView) objArr[0], ((Number) objArr[1]).intValue());
                return null;
            }
        }
        return new Boolean(super.onConsoleMessage((ConsoleMessage) objArr[0]));
    }

    public WVWebChromeClient() {
    }

    public WVWebChromeClient(Context context) {
        this.mContext = context;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("da2e14d2", new Object[]{this, consoleMessage})).booleanValue();
        }
        if (aem.a().a(2001).f25290a) {
            return true;
        }
        String message = consoleMessage.message();
        if (!StringUtils.isEmpty(message) && message.startsWith("hybrid://")) {
            android.taobao.windvane.util.m.e(TAG, "Call from console.log");
            if (this.mWebView != null) {
                l.b().a(this.mWebView, message);
                return true;
            }
        }
        if (message != null && message.startsWith("wvNativeCallback")) {
            String substring = message.substring(message.indexOf("/") + 1);
            int indexOf = substring.indexOf("/");
            String substring2 = substring.substring(0, indexOf);
            String substring3 = substring.substring(indexOf + 1);
            ValueCallback<String> a2 = android.taobao.windvane.util.o.a(substring2);
            if (a2 != null) {
                a2.onReceiveValue(substring3);
                android.taobao.windvane.util.o.b(substring2);
            } else {
                android.taobao.windvane.util.m.e(TAG, "NativeCallback failed: " + substring3);
            }
            return true;
        }
        if (android.taobao.windvane.util.m.a()) {
            int i = AnonymousClass1.f1717a[consoleMessage.messageLevel().ordinal()];
            if (i == 1) {
                android.taobao.windvane.util.m.d(TAG, "onConsoleMessage: %s at %s: %s", consoleMessage.message(), consoleMessage.sourceId(), String.valueOf(consoleMessage.lineNumber()));
            } else if (i == 2) {
                android.taobao.windvane.util.m.b(TAG, "onConsoleMessage: %s at %s: %s", consoleMessage.message(), consoleMessage.sourceId(), String.valueOf(consoleMessage.lineNumber()));
                if (android.taobao.windvane.monitor.o.getWvJsErrorMonitorInterface() != null) {
                    android.taobao.windvane.monitor.o.getWvJsErrorMonitorInterface().onOccurJsError(consoleMessage.sourceId(), consoleMessage.message(), null);
                }
            } else {
                android.taobao.windvane.util.m.a(TAG, "onConsoleMessage: %s at %s: %s", consoleMessage.message(), consoleMessage.sourceId(), String.valueOf(consoleMessage.lineNumber()));
            }
        }
        WebChromeClient webChromeClient = this.extraWebChromeClient;
        if (webChromeClient != null) {
            return webChromeClient.onConsoleMessage(consoleMessage);
        }
        return super.onConsoleMessage(consoleMessage);
    }

    @Override // android.webkit.WebChromeClient
    public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6bfe0", new Object[]{this, str, callback});
            return;
        }
        super.onGeolocationPermissionsShowPrompt(str, callback);
        callback.invoke(str, true, false);
    }

    @Override // android.webkit.WebChromeClient
    public void onExceededDatabaseQuota(String str, String str2, long j, long j2, long j3, WebStorage.QuotaUpdater quotaUpdater) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e57272c", new Object[]{this, str, str2, new Long(j), new Long(j2), new Long(j3), quotaUpdater});
        } else if (j2 < MAX_QUOTA) {
            quotaUpdater.updateQuota(j2);
        } else {
            quotaUpdater.updateQuota(j);
        }
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cfc92fda", new Object[]{this, webView, str, str2, str3, jsPromptResult})).booleanValue();
        }
        if (android.taobao.windvane.util.m.a()) {
            android.taobao.windvane.util.m.c(TAG, "onJsPrompt: %s; defaultValue: %s; url: %s", str2, str3, str);
        }
        if ((webView instanceof IWVWebView) && aem.a().a(2003, (IWVWebView) webView, str, str2, str3, jsPromptResult).f25290a) {
            return true;
        }
        if (str3 != null && str3.equals("wv_hybrid:")) {
            android.taobao.windvane.util.m.e(TAG, "Call from console.prompt");
            l.b().a((WVWebView) webView, str2);
            jsPromptResult.confirm("");
            return true;
        }
        WebChromeClient webChromeClient = this.extraWebChromeClient;
        if (webChromeClient == null) {
            return false;
        }
        return webChromeClient.onJsPrompt(webView, str, str2, str3, jsPromptResult);
    }

    @Override // android.webkit.WebChromeClient
    public void onProgressChanged(WebView webView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16eaf531", new Object[]{this, webView, new Integer(i)});
        } else {
            super.onProgressChanged(webView, i);
        }
    }
}
