package com.unionpay;

import android.app.Activity;
import android.os.Build;
import android.webkit.JavascriptInterface;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.alipay.mobile.security.zim.msgchannel.ZimMessageChannel;
import java.io.InputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class WebViewJavascriptBridge implements Serializable {
    z _messageHandler;
    Activity mContext;
    WebView mWebView;
    private boolean mAllowScheme = false;
    Map _messageHandlers = new HashMap();
    Map _responseCallbacks = new HashMap();
    long _uniqueId = 0;

    public WebViewJavascriptBridge(Activity activity, WebView webView, z zVar) {
        this.mContext = activity;
        this.mWebView = webView;
        this._messageHandler = zVar;
        WebSettings settings = this.mWebView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setSavePassword(false);
        settings.setAllowFileAccess(false);
        settings.setDomStorageEnabled(true);
        try {
            if (Build.VERSION.SDK_INT >= 11) {
                this.mWebView.removeJavascriptInterface("accessibility");
                this.mWebView.removeJavascriptInterface("accessibilityTraversal");
                this.mWebView.removeJavascriptInterface("searchBoxJavaBridge_");
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        this.mWebView.addJavascriptInterface(this, "_WebViewJavascriptBridge");
        this.mWebView.setWebViewClient(new ac(this, (byte) 0));
        this.mWebView.setWebChromeClient(new ab(this, (byte) 0));
    }

    public void _callbackJs(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put(com.taobao.android.riverlogger.inspector.g.ResponseId, str);
        hashMap.put(ZimMessageChannel.K_RPC_RES, str2);
        _dispatchMessage(hashMap);
    }

    private void _dispatchMessage(Map map) {
        String jSONObject = new JSONObject(map).toString();
        com.unionpay.utils.j.a("uppay", "sending:" + jSONObject);
        this.mContext.runOnUiThread(new af(this, String.format("javascript:WebViewJavascriptBridge._handleMessageFromJava('%s');", doubleEscapeString(jSONObject))));
    }

    private void _sendData(String str, aa aaVar, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("data", str);
        if (aaVar != null) {
            StringBuilder sb = new StringBuilder("java_cb_");
            long j = this._uniqueId + 1;
            this._uniqueId = j;
            sb.append(j);
            String sb2 = sb.toString();
            this._responseCallbacks.put(sb2, aaVar);
            hashMap.put("callbackId", sb2);
        }
        if (str2 != null) {
            hashMap.put("handlerName", str2);
        }
        _dispatchMessage(hashMap);
    }

    public static String convertStreamToString(InputStream inputStream) {
        String str = "";
        try {
            Scanner useDelimiter = new Scanner(inputStream, "UTF-8").useDelimiter("\\A");
            if (useDelimiter.hasNext()) {
                str = useDelimiter.next();
            }
            inputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return str;
    }

    private String doubleEscapeString(String str) {
        return str.replace("\\", "\\\\").replace("\"", "\\\"").replace("'", "\\'").replace("\n", "\\n").replace("\r", "\\r").replace("\f", "\\f");
    }

    private void loadWebViewJavascriptBridgeJs(WebView webView) {
        String convertStreamToString = convertStreamToString(getClass().getResourceAsStream("res/webviewjavascriptbridge.js"));
        webView.loadUrl("javascript:" + convertStreamToString);
    }

    @JavascriptInterface
    public void _handleMessageFromJs(String str, String str2, String str3, String str4, String str5) {
        z zVar;
        if (str2 != null) {
            ((aa) this._responseCallbacks.get(str2)).a(str3);
            this._responseCallbacks.remove(str2);
            return;
        }
        y yVar = null;
        if (str4 != null) {
            yVar = new y(this, str4);
        }
        if (str5 != null) {
            zVar = (z) this._messageHandlers.get(str5);
            if (zVar == null) {
                com.unionpay.utils.j.c("uppay", "WVJB Warning: No handler for " + str5);
                return;
            }
        } else {
            zVar = this._messageHandler;
        }
        try {
            this.mContext.runOnUiThread(new ae(this, zVar, str, yVar));
        } catch (Exception e) {
            com.unionpay.utils.j.c("uppay", "WebViewJavascriptBridge: WARNING: java handler threw. " + e.getMessage());
        }
    }

    public void callHandler(String str) {
        callHandler(str, null, null);
    }

    public void callHandler(String str, String str2) {
        callHandler(str, str2, null);
    }

    public void callHandler(String str, String str2, aa aaVar) {
        _sendData(str2, aaVar, str);
    }

    public void registerHandler(String str, z zVar) {
        this._messageHandlers.put(str, zVar);
    }

    public void send(String str) {
        send(str, null);
    }

    public void send(String str, aa aaVar) {
        _sendData(str, aaVar, null);
    }

    public void setAllowScheme(boolean z) {
        this.mAllowScheme = z;
    }
}
