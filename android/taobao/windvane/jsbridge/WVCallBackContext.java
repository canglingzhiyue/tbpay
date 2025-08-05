package android.taobao.windvane.jsbridge;

import android.os.Looper;
import android.taobao.windvane.webview.IWVWebView;
import android.text.TextUtils;
import android.util.Log;
import com.ali.user.mobile.exception.ErrorCode;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.riverlogger.RVLLevel;
import org.json.JSONException;
import org.json.JSONObject;
import tb.adm;
import tb.aem;
import tb.kge;
import tb.oxv;
import tb.qgm;
import tb.riy;

/* loaded from: classes2.dex */
public class WVCallBackContext {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String DEFALT_URL = "UNKNOWN";
    private static final String TAG = "WVCallBackContext";
    public String currentUrlFromAsyncChannel;
    private IJsApiFailedCallBack failedCallBack;
    private String instancename;
    private String mCallBackContextUrl;
    private String methodname;
    private String objectname;
    private IJsApiSucceedCallBack succeedCallBack;
    private String token;
    private IWVWebView webview;
    private boolean mNotiNavtive = false;
    private String mAction = null;
    private String pid = "";
    private String uid = "";
    private boolean isUpload = false;

    static {
        kge.a(1731499186);
    }

    public String getPid() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("229b03c4", new Object[]{this}) : this.pid;
    }

    public void setPid(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f52579a", new Object[]{this, str});
        } else {
            this.pid = str;
        }
    }

    public String getUid() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ea2ce1f", new Object[]{this}) : this.uid;
    }

    public void setUid(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b443d89f", new Object[]{this, str});
        } else {
            this.uid = str;
        }
    }

    public WVCallBackContext(IWVWebView iWVWebView) {
        this.webview = iWVWebView;
        safeSetUrl(iWVWebView);
    }

    public WVCallBackContext(IWVWebView iWVWebView, String str, String str2, String str3) {
        this.webview = iWVWebView;
        this.token = str;
        this.objectname = str2;
        this.methodname = str3;
        safeSetUrl(iWVWebView);
    }

    public WVCallBackContext(IWVWebView iWVWebView, String str, String str2, String str3, IJsApiSucceedCallBack iJsApiSucceedCallBack, IJsApiFailedCallBack iJsApiFailedCallBack) {
        this.webview = iWVWebView;
        this.token = str;
        this.objectname = str2;
        this.methodname = str3;
        this.failedCallBack = iJsApiFailedCallBack;
        this.succeedCallBack = iJsApiSucceedCallBack;
        safeSetUrl(iWVWebView);
    }

    public void setInstancename(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7dcd5f33", new Object[]{this, str});
        } else {
            this.instancename = str;
        }
    }

    public IWVWebView getWebview() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IWVWebView) ipChange.ipc$dispatch("166e5630", new Object[]{this}) : this.webview;
    }

    public void setWebview(IWVWebView iWVWebView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a5f70e2", new Object[]{this, iWVWebView});
        } else {
            this.webview = iWVWebView;
        }
    }

    public String getToken() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a592a696", new Object[]{this}) : this.token;
    }

    public void setToken(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b99ac208", new Object[]{this, str});
        } else {
            this.token = str;
        }
    }

    public void fireEvent(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7134ec1f", new Object[]{this, str, str2});
            return;
        }
        android.taobao.windvane.util.m.b(TAG, "call fireEvent, eventName = [" + str + "], eventParam = [" + str2 + riy.ARRAY_END_STR);
        aem.a().a(ErrorCode.MOBILE_VERIFY_LOGIN_GET_TOKEN_FAIL, this.mAction, str, str2);
        String str3 = android.taobao.windvane.config.a.e ? "(function(d){var n='%s',t='%%s';if(window.WindVane){window.WindVane.fireEvent(n,t,%s);}else{var e=d.createEvent('HTMLEvents');e.initEvent(n,!1,!0);try{e.data=e.param=JSON.parse(t)}catch(i){e.data=e.param={ret:'HY_RESULT_PARSE_ERROR',originValue:t}}d.dispatchEvent(e);}})(window.document)" : "window.WindVane && window.WindVane.fireEvent('%s', '%%s', %s);";
        onLoggerJSEvent(getWebview(), str, str2);
        callback(this.webview, String.format(str3, str, null), str2);
    }

    public static void fireEvent(IWVWebView iWVWebView, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b044543", new Object[]{iWVWebView, str, str2});
            return;
        }
        android.taobao.windvane.util.m.b(TAG, "call fireEvent ");
        aem.a().a(ErrorCode.MOBILE_VERIFY_LOGIN_GET_TOKEN_FAIL, (IWVWebView) null, str, str2);
        String str3 = android.taobao.windvane.config.a.e ? "(function(d){var n='%s',t='%%s';if(window.WindVane){window.WindVane.fireEvent(n,t,%s);}else{var e=d.createEvent('HTMLEvents');e.initEvent(n,!1,!0);try{e.data=e.param=JSON.parse(t)}catch(i){e.data=e.param={ret:'HY_RESULT_PARSE_ERROR',originValue:t}}d.dispatchEvent(e);}})(window.document)" : "window.WindVane && window.WindVane.fireEvent('%s', '%%s', %s);";
        onLoggerJSEvent(iWVWebView, str, str2);
        callback(iWVWebView, String.format(str3, str, null), str2);
    }

    private static void onLoggerJSEvent(IWVWebView iWVWebView, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee71c7e1", new Object[]{iWVWebView, str, str2});
        } else if (!android.taobao.windvane.config.j.commonConfig.bL) {
        } else {
            try {
                String str3 = "";
                if (iWVWebView instanceof adm) {
                    str3 = ((adm) iWVWebView).getCurId();
                }
                com.taobao.android.riverlogger.e.a(RVLLevel.Info, "JS/Event").a("event").b(str3).a("name", (Object) str).a("data", new JSONObject(str2)).a();
            } catch (Exception unused) {
                android.taobao.windvane.util.m.e(TAG, "JS Event JOSNObject error failed!");
            }
        }
    }

    public void fireEvent(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35b21d95", new Object[]{this, str});
        } else {
            fireEvent(str, "{}");
        }
    }

    public void success() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4550b0a", new Object[]{this});
        } else {
            success(r.RET_SUCCESS);
        }
    }

    public void success(r rVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e6d6c20", new Object[]{this, rVar});
        } else if (rVar == null) {
        } else {
            rVar.b();
            String d = rVar.d();
            this.isUpload = true;
            success(d);
            commitJsBridgeReturn(rVar);
        }
    }

    public void success(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b54654", new Object[]{this, str});
            return;
        }
        android.taobao.windvane.util.m.c(TAG, "call method success, msg = " + str);
        IJsApiSucceedCallBack iJsApiSucceedCallBack = this.succeedCallBack;
        if (iJsApiSucceedCallBack != null) {
            iJsApiSucceedCallBack.succeed(str);
            if (this.isUpload) {
                return;
            }
            commitJsBridgeReturn(str);
            return;
        }
        if (this.mNotiNavtive) {
            String str3 = "UNKNOWN";
            if (Looper.getMainLooper() == Looper.myLooper()) {
                IWVWebView iWVWebView = this.webview;
                if (iWVWebView != null) {
                    str3 = iWVWebView.getUrl();
                }
            } else {
                String str4 = this.mCallBackContextUrl;
                if (str4 != null) {
                    str3 = str4;
                }
            }
            aem.a().a(3011, (IWVWebView) null, str3, this.mAction, str);
            this.mNotiNavtive = false;
            this.mAction = null;
        }
        try {
            Integer.valueOf(this.token);
            str2 = "javascript:window.WindVane&&window.WindVane.onSuccess(%s,'%%s');";
        } catch (Throwable unused) {
            str2 = "javascript:window.WindVane&&window.WindVane.onSuccess('%s','%%s');";
        }
        callback(this.webview, String.format(str2, this.token), str);
        if (this.isUpload) {
            return;
        }
        commitJsBridgeReturn(str);
    }

    public void successAndKeepAlive(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("310f3b65", new Object[]{this, str});
            return;
        }
        android.taobao.windvane.util.m.c(TAG, "call success and keep alive, msg = " + str);
        IJsApiSucceedCallBack iJsApiSucceedCallBack = this.succeedCallBack;
        if (iJsApiSucceedCallBack != null && (iJsApiSucceedCallBack instanceof b)) {
            ((b) iJsApiSucceedCallBack).a(str);
        } else {
            callback(this.webview, String.format("javascript:window.WindVane&&window.WindVane.onSuccess('%s','%%s', true);", this.token), str);
        }
    }

    public void error() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1392128f", new Object[]{this});
        } else {
            error("{}");
        }
    }

    public void error(r rVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a023d525", new Object[]{this, rVar});
        } else if (rVar == null) {
        } else {
            error(rVar.d());
            commitJsBridgeReturn(rVar);
        }
    }

    public void error(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a936c23", new Object[]{this, str, str2});
            return;
        }
        r rVar = new r("HY_FAILED");
        rVar.a(str, str2);
        error(rVar);
    }

    public void onSuccess(r rVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80e3f841", new Object[]{this, rVar});
        } else {
            onCallBack(rVar, true);
        }
    }

    public void onFailure(r rVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("225c96c8", new Object[]{this, rVar});
        } else {
            onCallBack(rVar, false);
        }
    }

    private void onCallBack(r rVar, boolean z) {
        IJsApiFailedCallBack iJsApiFailedCallBack;
        IJsApiSucceedCallBack iJsApiSucceedCallBack;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a795473", new Object[]{this, rVar, new Boolean(z)});
        } else if (rVar == null) {
        } else {
            if (z) {
                rVar.b();
            }
            boolean a2 = rVar.a();
            String d = rVar.d();
            if (z && (iJsApiSucceedCallBack = this.succeedCallBack) != null) {
                if (a2 && (iJsApiSucceedCallBack instanceof b)) {
                    ((b) iJsApiSucceedCallBack).a(d);
                } else {
                    this.succeedCallBack.succeed(d);
                }
            }
            if (z || (iJsApiFailedCallBack = this.failedCallBack) == null) {
                return;
            }
            if (a2 && (iJsApiFailedCallBack instanceof a)) {
                ((a) iJsApiFailedCallBack).a(d);
            } else {
                this.failedCallBack.fail(d);
            }
        }
    }

    public void error(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72e35699", new Object[]{this, str});
            return;
        }
        android.taobao.windvane.util.m.e(TAG, "call error, ret = [" + str + riy.ARRAY_END_STR);
        IJsApiFailedCallBack iJsApiFailedCallBack = this.failedCallBack;
        if (iJsApiFailedCallBack != null) {
            iJsApiFailedCallBack.fail(str);
            if (this.isUpload) {
                return;
            }
            commitJsBridgeReturn(str);
            return;
        }
        if (this.mNotiNavtive) {
            String str3 = "UNKNOWN";
            if (Looper.getMainLooper() == Looper.myLooper()) {
                IWVWebView iWVWebView = this.webview;
                if (iWVWebView != null) {
                    str3 = iWVWebView.getUrl();
                }
            } else {
                String str4 = this.mCallBackContextUrl;
                if (str4 != null) {
                    str3 = str4;
                }
            }
            aem.a().a(3012, (IWVWebView) null, str3, this.mAction, str);
            this.mNotiNavtive = false;
            this.mAction = null;
        }
        try {
            Integer.valueOf(this.token);
            str2 = "javascript:window.WindVane&&window.WindVane.onFailure(%s,'%%s');";
        } catch (Throwable unused) {
            str2 = "javascript:window.WindVane&&window.WindVane.onSuccess('%s','%%s');";
        }
        callback(this.webview, String.format(str2, this.token), str);
        if (this.isUpload) {
            return;
        }
        commitJsBridgeReturn(str);
    }

    private static void runOnUiThread(IWVWebView iWVWebView, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da77ba51", new Object[]{iWVWebView, runnable});
        } else if (iWVWebView == null || iWVWebView.getView() == null) {
        } else {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                runnable.run();
                return;
            }
            try {
                iWVWebView._post(runnable);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    private static void callback(final IWVWebView iWVWebView, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e503504", new Object[]{iWVWebView, str, str2});
            return;
        }
        final long currentTimeMillis = System.currentTimeMillis();
        if (android.taobao.windvane.util.m.a() && android.taobao.windvane.util.e.a() && !TextUtils.isEmpty(str2)) {
            try {
                new JSONObject(str2);
            } catch (JSONException unused) {
                android.taobao.windvane.util.m.e(TAG, "return param is not a valid json!\n" + str + "\n" + str2);
            }
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = "{}";
        }
        try {
            final String format = String.format(str, formatJsonString(str2));
            try {
                runOnUiThread(iWVWebView, new Runnable() { // from class: android.taobao.windvane.jsbridge.WVCallBackContext.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        IWVWebView.this.evaluateJavascript(format);
                        android.taobao.windvane.util.m.e(WVCallBackContext.TAG, "callback use time=" + (System.currentTimeMillis() - currentTimeMillis));
                    }
                });
            } catch (Exception e) {
                android.taobao.windvane.util.m.d(TAG, e.getMessage());
            }
        } catch (Exception e2) {
            android.taobao.windvane.util.m.e(TAG, "callback error. " + e2.getMessage());
        }
    }

    public void setNeedfireNativeEvent(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("511a412e", new Object[]{this, str, new Boolean(z)});
            return;
        }
        this.mAction = str;
        this.mNotiNavtive = z;
        android.taobao.windvane.util.m.e(TAG, "setNeedfireNativeEvent : " + str);
    }

    private static String formatJsonString(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d6f939bf", new Object[]{str});
        }
        if (str.contains("\u2028")) {
            try {
                str = str.replace("\u2028", "\\u2028");
            } catch (Exception unused) {
            }
        }
        if (str.contains("\u2029")) {
            try {
                str = str.replace("\u2029", "\\u2029");
            } catch (Exception unused2) {
            }
        }
        return str.replace("\\", "\\\\").replace("'", "\\'");
    }

    public void commitJsBridgeReturn(r rVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ba8e536", new Object[]{this, rVar});
        } else if (!android.taobao.windvane.config.j.commonConfig.aX) {
        } else {
            try {
                String str = "" + this.objectname + "." + this.methodname;
                String str2 = this.instancename;
                String b = rVar.b(com.taobao.mtop.wvplugin.a.RESULT_KEY, "HY_FAILED_EMPTY");
                String b2 = rVar.b("msg", "");
                String str3 = "UNKNOWN";
                if (Looper.getMainLooper() == Looper.myLooper()) {
                    if (this.webview != null) {
                        str3 = this.webview.getUrl();
                    }
                } else if (this.mCallBackContextUrl != null) {
                    str3 = this.mCallBackContextUrl;
                }
                String str4 = str3;
                if (TextUtils.equals(str, "MtopWVPlugin.send")) {
                    String b3 = rVar.b("api", "UNKNOWN_MTOP_API");
                    if (android.taobao.windvane.monitor.o.getWvJsBridgeMonitorInterface() == null) {
                        return;
                    }
                    android.taobao.windvane.monitor.o.getWvJsBridgeMonitorInterface().onMtopJsBridgeReturn(b3, b, b2, str4);
                } else if (android.taobao.windvane.monitor.o.getJsBridgeMonitor() == null) {
                } else {
                    android.taobao.windvane.monitor.o.getJsBridgeMonitor().onJsBridgeReturn(str, str2, b, b2, str4);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public void commitJsBridgeReturn(String str) {
        oxv oxvVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79a3f8ea", new Object[]{this, str});
        } else if (!android.taobao.windvane.config.j.commonConfig.aX) {
        } else {
            try {
                JSONObject jSONObject = new JSONObject(str);
                String str2 = "" + this.objectname + "." + this.methodname;
                String str3 = this.instancename;
                String optString = jSONObject.optString(com.taobao.mtop.wvplugin.a.RESULT_KEY, "HY_FAILED_EMPTY");
                String optString2 = jSONObject.optString("msg", "");
                String str4 = "UNKNOWN";
                if (Looper.getMainLooper() == Looper.myLooper()) {
                    if (this.webview != null) {
                        str4 = this.webview.getUrl();
                    }
                } else if (this.mCallBackContextUrl != null) {
                    str4 = this.mCallBackContextUrl;
                }
                String str5 = str4;
                if (TextUtils.equals(str2, "MtopWVPlugin.send")) {
                    String optString3 = jSONObject.optString("api", "UNKNOWN_MTOP_API");
                    if (android.taobao.windvane.monitor.o.getWvJsBridgeMonitorInterface() != null) {
                        android.taobao.windvane.monitor.o.getWvJsBridgeMonitorInterface().onMtopJsBridgeReturn(optString3, optString, optString2, str5);
                    }
                    JSONObject optJSONObject = jSONObject.optJSONObject("stat");
                    if (optJSONObject == null || !optJSONObject.optBoolean("isPrefetch", false) || (oxvVar = (oxv) qgm.a().a(oxv.class)) == null) {
                        return;
                    }
                    oxvVar.a(this.webview.getView(), "H5_Prefetch", (Object) true);
                } else if (android.taobao.windvane.monitor.o.getJsBridgeMonitor() == null) {
                } else {
                    android.taobao.windvane.monitor.o.getJsBridgeMonitor().onJsBridgeReturn(str2, str3, optString, optString2, str5);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    private void safeSetUrl(IWVWebView iWVWebView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f98e545", new Object[]{this, iWVWebView});
        } else if (Looper.getMainLooper() != Looper.myLooper() || iWVWebView == null) {
        } else {
            try {
                this.mCallBackContextUrl = iWVWebView.getUrl();
            } catch (Throwable th) {
                Log.e(TAG, "safeSetUrl: ");
                th.printStackTrace();
            }
        }
    }
}
