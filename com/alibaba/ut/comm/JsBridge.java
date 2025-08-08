package com.alibaba.ut.comm;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.alibaba.triver.triver_shop.newShop.ext.m;
import com.alibaba.ut.d;
import com.alibaba.ut.e;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.exception.FluidException;
import com.taobao.linkmanager.afc.windvane.DeviceInfoJsBridge;
import org.json.JSONException;
import org.json.JSONObject;
import tb.cfh;
import tb.cfi;
import tb.cfk;
import tb.cfl;
import tb.riy;

/* loaded from: classes3.dex */
public class JsBridge {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "JsBridge";
    private d mWebView;

    @JavascriptInterface
    public String bridgeVersion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("cd85894a", new Object[]{this}) : e.SDK_VERSION;
    }

    @JavascriptInterface
    public void onPageShow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5c4ec32", new Object[]{this});
        }
    }

    public static /* synthetic */ String access$000(String str, String[] strArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("48b7a662", new Object[]{str, strArr}) : buildAplus4UTJSScript(str, strArr);
    }

    public static /* synthetic */ String access$100(String str, String[] strArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("32d46e3", new Object[]{str, strArr}) : buildJSScript(str, strArr);
    }

    public JsBridge(Object obj) {
        this.mWebView = null;
        if (obj instanceof WebView) {
            this.mWebView = new cfk((WebView) obj);
        } else if (!(obj instanceof com.uc.webview.export.WebView)) {
        } else {
            this.mWebView = new cfl((com.uc.webview.export.WebView) obj);
        }
    }

    public JsBridge(d dVar) {
        this.mWebView = null;
        this.mWebView = dVar;
    }

    @JavascriptInterface
    @com.uc.webview.export.JavascriptInterface
    public void CALL(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba2f726f", new Object[]{this, str});
            return;
        }
        cfi.c(TAG, "CALL JavascriptInterface", str);
        if (StringUtils.isEmpty(str)) {
            cfi.c(TAG, "p is null");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString(FluidException.METHOD_NAME);
            String optString2 = jSONObject.optString("params");
            String optString3 = jSONObject.optString("callback");
            String optString4 = jSONObject.optString("sid");
            String str2 = "0";
            String str3 = "SUCCESS";
            Object obj = null;
            try {
                obj = invokeNativeMethod(this.mWebView.a(), null, optString, optString2);
            } catch (Exception e) {
                str2 = "1";
                str3 = e.toString();
                cfi.a(TAG, e, new Object[0]);
            }
            if (StringUtils.isEmpty(optString3)) {
                return;
            }
            JSONObject jSONObject2 = new JSONObject();
            if (obj == null) {
                obj = "";
            }
            jSONObject2.put("result", obj);
            jSONObject2.put("code", str2);
            jSONObject2.put("msg", str3);
            callbackToJs(optString3, new String[]{optString4, jSONObject2.toString()});
        } catch (JSONException e2) {
            cfi.a(TAG, e2, new Object[0]);
        }
    }

    @JavascriptInterface
    public String UTEnv() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("83ac6deb", new Object[]{this});
        }
        d dVar = this.mWebView;
        return dVar == null ? "default" : dVar instanceof cfk ? "webview" : dVar instanceof cfl ? "ucwebview" : "iwebview";
    }

    public Object invokeNativeMethod(Context context, String str, String str2, String str3) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("2fc6ed43", new Object[]{this, context, str, str2, str3});
        }
        cfi.b(TAG, "invokeNativeMethod", str2);
        if (str2.equalsIgnoreCase(m.PAGE_APPEAR)) {
            cfh.a(context, str3);
            return null;
        } else if (str2.equalsIgnoreCase("pageDisAppear")) {
            cfh.b(context, str3);
            return null;
        } else if (str2.equalsIgnoreCase(m.UPDATE_PAGE_PROPERTIES)) {
            cfh.c(context, str3);
            return true;
        } else if (str2.equalsIgnoreCase(m.UPDATE_PAGE_UTPARAM)) {
            cfh.d(context, str3);
            return null;
        } else if (str2.equalsIgnoreCase("updateNextPageUtparam")) {
            cfh.b(str3);
            return null;
        } else if (str2.equalsIgnoreCase(m.UPDATE_NEXT_PAGE_PROPERTIES)) {
            cfh.a(str3);
            return null;
        } else if (str2.equalsIgnoreCase("getParam")) {
            return cfh.a();
        } else {
            if (str2.equalsIgnoreCase(DeviceInfoJsBridge.ACTION)) {
                return cfh.b();
            }
            if (str2.equalsIgnoreCase("setAplusParams")) {
                cfh.a(context.hashCode() + "", str3);
                return null;
            } else if (str2.equalsIgnoreCase("getAplusParams")) {
                return cfh.c(context.hashCode() + "");
            } else if (str2.equalsIgnoreCase("removeAplusParams")) {
                cfh.d(context.hashCode() + "");
                return null;
            } else if (str2.equalsIgnoreCase("utCustomEvent")) {
                cfh.f(str3);
                return null;
            } else if (str2.equalsIgnoreCase(m.GET_PAGE_SPM_URL)) {
                return cfh.a(context);
            } else {
                if (str2.equalsIgnoreCase(m.GET_PAGE_SPM_PRE)) {
                    return cfh.b(context);
                }
                if (str2.equalsIgnoreCase("updatePageURL")) {
                    cfh.f(context, str3);
                    return null;
                } else if (str2.equalsIgnoreCase("updatePageName")) {
                    cfh.e(context, str3);
                    return null;
                } else if (str2.equalsIgnoreCase("turnOnRealtimeDebug")) {
                    cfh.g(str3);
                    return null;
                } else if (str2.equalsIgnoreCase("userRegister")) {
                    cfh.h(str3);
                    return null;
                } else if (str2.equalsIgnoreCase("updateUserAccount")) {
                    cfh.i(str3);
                    return null;
                } else if (str2.equalsIgnoreCase("addTPKItem")) {
                    cfh.j(str3);
                    return null;
                } else if (str2.equalsIgnoreCase(m.UPDATE_SESSION_PROPERTY)) {
                    cfh.k(str3);
                    return null;
                } else if (str2.equalsIgnoreCase("setGlobalProperty")) {
                    cfh.l(str3);
                    return null;
                } else if (!str2.equalsIgnoreCase("setAplus4UT")) {
                    return null;
                } else {
                    cfh.c(context);
                    return null;
                }
            }
        }
    }

    private void callbackToJs(String str, String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f643a605", new Object[]{this, str, strArr});
        } else {
            nativeToJs(this.mWebView, str, strArr);
        }
    }

    public static void nativeToJs(final d dVar, final String str, final String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("199eaf9", new Object[]{dVar, str, strArr});
        } else {
            dVar.a(new Runnable() { // from class: com.alibaba.ut.comm.JsBridge.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    String access$000;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    String str2 = null;
                    try {
                        access$000 = str.contains("Aplus4UT") ? JsBridge.access$000(str, strArr) : JsBridge.access$100(str, strArr);
                    } catch (Throwable th) {
                        th = th;
                    }
                    try {
                        cfi.b(JsBridge.TAG, "js", access$000);
                        dVar.a(access$000, (ValueCallback<String>) null);
                    } catch (Throwable th2) {
                        String str3 = access$000;
                        th = th2;
                        str2 = str3;
                        cfi.a(JsBridge.TAG, th, "native to js", str2);
                    }
                }
            });
        }
    }

    private static String buildJSScript(String str, String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("922e1cd4", new Object[]{str, strArr});
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(riy.BRACKET_START_STR);
        if (strArr != null && strArr.length > 0) {
            for (int i = 0; i < strArr.length; i++) {
                sb.append("'");
                sb.append(strArr[i]);
                sb.append("'");
                if (i < strArr.length - 1) {
                    sb.append(',');
                }
            }
        }
        sb.append(");");
        return sb.toString();
    }

    private static String buildAplus4UTJSScript(String str, String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("91facf6c", new Object[]{str, strArr});
        }
        cfi.a(TAG, "buildAplus4UTJSScript methodName", str);
        StringBuilder sb = new StringBuilder();
        sb.append("if (window.Aplus4UT && window.");
        sb.append(str);
        sb.append(") { window.");
        sb.append(str);
        sb.append(riy.BRACKET_START_STR);
        if (strArr != null && strArr.length > 0) {
            for (int i = 0; i < strArr.length; i++) {
                sb.append("'");
                sb.append(strArr[i]);
                sb.append("'");
                if (i < strArr.length - 1) {
                    sb.append(',');
                }
            }
        }
        sb.append(");}");
        return sb.toString();
    }
}
