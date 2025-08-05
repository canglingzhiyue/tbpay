package com.ali.user.open.core.webview;

import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.ali.user.open.core.model.SystemMessageConstants;
import com.ali.user.open.core.trace.SDKLogger;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Method;
import tb.kge;
import tb.riy;

/* loaded from: classes2.dex */
public class BridgeWebChromeClient extends WebChromeClient {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final String TAG;
    private static boolean evaluateJavascriptSupported;

    public static /* synthetic */ Object ipc$super(BridgeWebChromeClient bridgeWebChromeClient, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b1269980", new Object[]{this, webView, str, str2, jsResult})).booleanValue();
        }
        return false;
    }

    public static /* synthetic */ boolean access$000() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("bcd6077b", new Object[0])).booleanValue() : evaluateJavascriptSupported;
    }

    static {
        kge.a(-813479766);
        TAG = BridgeWebChromeClient.class.getSimpleName();
        evaluateJavascriptSupported = Build.VERSION.SDK_INT >= 19;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        if (str3 == null) {
            return false;
        }
        String str4 = TAG;
        SDKLogger.d(str4, "onJsPrompt() called with: view = [" + webView + "], url = [" + str + "], message = [" + str2 + "], defaultValue = [" + str3 + "], result = [" + jsPromptResult + riy.ARRAY_END_STR);
        if (str3.equals("wv_hybrid:")) {
            handleWindVaneNoHandler(webView, str2);
            jsPromptResult.confirm("");
            return true;
        } else if (!TextUtils.equals(str3, "hv_hybrid:") || !(webView instanceof MemberWebView)) {
            return false;
        } else {
            MemberWebView memberWebView = (MemberWebView) webView;
            HavanaBridgeProtocal parseMessage = parseMessage(str2);
            BridgeCallbackContext bridgeCallbackContext = new BridgeCallbackContext();
            bridgeCallbackContext.requestId = parseMessage.requestId;
            bridgeCallbackContext.webView = memberWebView;
            Object bridgeObj = memberWebView.getBridgeObj(parseMessage.objName);
            if (bridgeObj == null) {
                String str5 = TAG;
                SDKLogger.e(str5, parseMessage.objName + " JS_BRIDGE_MODULE_NOT_FOUND");
                bridgeCallbackContext.onFailure(10000, parseMessage.objName);
                jsPromptResult.confirm("");
                return true;
            }
            try {
                Method method = bridgeObj.getClass().getMethod(parseMessage.methodName, BridgeCallbackContext.class, String.class);
                if (method.isAnnotationPresent(BridgeMethod.class)) {
                    try {
                        Object[] objArr = new Object[2];
                        objArr[0] = bridgeCallbackContext;
                        objArr[1] = TextUtils.isEmpty(parseMessage.param) ? "{}" : parseMessage.param;
                        method.invoke(bridgeObj, objArr);
                    } catch (Exception e) {
                        SDKLogger.e(TAG, e.toString());
                        bridgeCallbackContext.onFailure(10010, e.getMessage());
                    }
                } else {
                    String str6 = TAG;
                    SDKLogger.e(str6, parseMessage.objName + "," + parseMessage.methodName + "  JS_BRIDGE_ANNOTATION_NOT_PRESENT");
                    bridgeCallbackContext.onFailure(SystemMessageConstants.JS_BRIDGE_ANNOTATION_NOT_PRESENT, parseMessage.objName);
                }
                jsPromptResult.confirm("");
                return true;
            } catch (NoSuchMethodException e2) {
                String str7 = TAG;
                SDKLogger.e(str7, parseMessage.objName + "," + parseMessage.methodName + "," + e2.toString());
                bridgeCallbackContext.onFailure(SystemMessageConstants.JS_BRIDGE_METHOD_NOT_FOUND, parseMessage.objName);
                jsPromptResult.confirm("");
                return true;
            }
        }
    }

    private HavanaBridgeProtocal parseMessage(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HavanaBridgeProtocal) ipChange.ipc$dispatch("ca6d986a", new Object[]{this, str});
        }
        Uri parse = Uri.parse(str);
        String host = parse.getHost();
        int port = parse.getPort();
        String lastPathSegment = parse.getLastPathSegment();
        parse.getQuery();
        int indexOf = str.indexOf("?");
        String substring = indexOf == -1 ? null : str.substring(indexOf + 1);
        HavanaBridgeProtocal havanaBridgeProtocal = new HavanaBridgeProtocal();
        havanaBridgeProtocal.methodName = lastPathSegment;
        havanaBridgeProtocal.objName = host;
        havanaBridgeProtocal.param = substring;
        havanaBridgeProtocal.requestId = port;
        return havanaBridgeProtocal;
    }

    private void handleWindVaneNoHandler(WebView webView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f066758b", new Object[]{this, webView, str});
            return;
        }
        try {
            int indexOf = str.indexOf(58, 9);
            webView.post(new JavaScriptTask(webView, String.format("window.WindVane&&window.WindVane.onFailure(%s,'{\"ret\":\"HY_NO_HANDLER\"');", str.substring(indexOf + 1, str.indexOf(47, indexOf)))));
        } catch (Exception e) {
            SDKLogger.e("ui", "fail to handler windvane request, the error message is " + e.getMessage(), e);
        }
    }

    /* loaded from: classes2.dex */
    public static class JavaScriptTask implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public String script;
        public WebView webView;

        static {
            kge.a(858500108);
            kge.a(-1390502639);
        }

        public JavaScriptTask(WebView webView, String str) {
            this.webView = webView;
            this.script = str;
            try {
                if (this.webView == null) {
                    return;
                }
                this.webView.getSettings().setSavePassword(false);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                if (BridgeWebChromeClient.access$000()) {
                    try {
                        this.webView.evaluateJavascript(this.script, null);
                        return;
                    } catch (Exception e) {
                        SDKLogger.e("ui", "fail to evaluate the script " + e.getMessage(), e);
                    }
                }
                String str = "javascript:" + this.script;
                if (this.webView instanceof MemberWebView) {
                    ((MemberWebView) this.webView).loadUrl(str);
                } else {
                    this.webView.loadUrl(str);
                }
            } catch (Exception unused) {
            }
        }
    }
}
