package com.taobao.pha.core.jsbridge;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import mtopsdk.common.util.StringUtils;
import android.webkit.JavascriptInterface;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.pha.core.controller.AppController;
import com.taobao.pha.core.error.PHAErrorType;
import com.taobao.pha.core.jsbridge.a;
import com.taobao.pha.core.jsbridge.c;
import com.taobao.pha.core.p;
import java.io.Serializable;
import tb.kge;
import tb.ngn;
import tb.ngr;
import tb.riy;

/* loaded from: classes7.dex */
public class JSBridge implements Handler.Callback, Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String NATIVE_TO_JS_CALLBACK_PREFIX = "javascript:typeof __pha_native_to_js__!=='undefined'&&__pha_native_to_js__";
    private static final String TAG = "JSBridge";
    private final AppController mAppController;
    private final Handler mHandler = new Handler(Looper.getMainLooper(), this);
    private final c.a mTarget;

    static {
        kge.a(-1141916936);
        kge.a(-1043440182);
        kge.a(1028243835);
    }

    public static /* synthetic */ String access$000(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("28c0253f", new Object[]{str}) : formatJsonString(str);
    }

    public static /* synthetic */ void access$100(JSBridge jSBridge, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa1b10db", new Object[]{jSBridge, str});
        } else {
            jSBridge.evaluateJavaScriptOnTarget(str);
        }
    }

    public static /* synthetic */ AppController access$200(JSBridge jSBridge) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AppController) ipChange.ipc$dispatch("5c318974", new Object[]{jSBridge}) : jSBridge.mAppController;
    }

    public JSBridge(AppController appController, c.a aVar) {
        this.mAppController = appController;
        this.mTarget = aVar;
    }

    public static JSONObject parseParamsToOptions(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("10d773bb", new Object[]{str});
        }
        if (StringUtils.isEmpty(str)) {
            return new JSONObject();
        }
        try {
            return JSONObject.parseObject(str);
        } catch (Exception unused) {
            return new JSONObject();
        }
    }

    public void call(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3e4a717", new Object[]{this, cVar});
            return;
        }
        Message obtain = Message.obtain();
        obtain.obj = cVar;
        this.mHandler.sendMessage(obtain);
    }

    @JavascriptInterface
    @com.uc.webview.export.JavascriptInterface
    public void call(final String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2feeb30d", new Object[]{this, str, str2, str3, str4});
        } else if (StringUtils.isEmpty(str2) || StringUtils.isEmpty(str3)) {
            ngr.b(TAG, "module or method is empty, refId = [" + str + riy.ARRAY_END_STR);
            evaluateJavaScriptOnTarget("javascript:typeof __pha_native_to_js__!=='undefined'&&__pha_native_to_js__('" + str + "', 'module or method is empty');");
        } else {
            c cVar = new c();
            JSONObject parseParamsToOptions = parseParamsToOptions(str4);
            cVar.e = str;
            cVar.b = str2;
            cVar.c = str3;
            cVar.f18742a = this.mTarget;
            cVar.d = parseParamsToOptions;
            cVar.f = new a.InterfaceC0751a() { // from class: com.taobao.pha.core.jsbridge.JSBridge.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.pha.core.jsbridge.a.InterfaceC0751a
                public void a(JSONObject jSONObject) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
                        return;
                    }
                    String access$000 = JSBridge.access$000(jSONObject == null ? "{}" : jSONObject.toJSONString());
                    JSBridge.access$100(JSBridge.this, "javascript:typeof __pha_native_to_js__!=='undefined'&&__pha_native_to_js__('" + str + "', null, '" + access$000 + "');");
                }

                @Override // com.taobao.pha.core.jsbridge.a.InterfaceC0751a
                public void a(PHAErrorType pHAErrorType, String str5) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("6d80500a", new Object[]{this, pHAErrorType, str5});
                        return;
                    }
                    String access$000 = JSBridge.access$000(new com.taobao.pha.core.error.a(pHAErrorType, str5).toString());
                    JSBridge.access$100(JSBridge.this, "javascript:typeof __pha_native_to_js__!=='undefined'&&__pha_native_to_js__('" + str + "', '" + access$000 + "');");
                }
            };
            ngr.a(TAG, "refId = [" + str + riy.ARRAY_END_STR);
            call(cVar);
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("282a8c1d", new Object[]{this, message})).booleanValue();
        }
        c cVar = (c) message.obj;
        if (cVar == null) {
            ngr.b(TAG, "JSBridgeContext is null, do nothing.");
            return false;
        }
        callMethod(cVar);
        return true;
    }

    private void callMethod(final c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ac03918", new Object[]{this, cVar});
            return;
        }
        ngr.a(TAG, "callMethod-module:" + cVar.b + " method:" + cVar.c + " param:" + cVar.d + " sid:" + cVar.e);
        if (cVar.f18742a == null) {
            ngr.b(TAG, "target is disposed.");
        } else if (this.mAppController.o()) {
            ngr.b(TAG, "AppController is disposed.");
        } else if (StringUtils.isEmpty(cVar.b) || StringUtils.isEmpty(cVar.c)) {
            if (cVar.f == null) {
                return;
            }
            cVar.f.a(PHAErrorType.REFERENCE_ERROR, "CallMethod module/method failed");
        } else {
            final String str = cVar.b + "." + cVar.c;
            p.b().o().a(this.mAppController, cVar.f18742a, cVar.b, cVar.c, cVar.d, new a.InterfaceC0751a() { // from class: com.taobao.pha.core.jsbridge.JSBridge.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.pha.core.jsbridge.a.InterfaceC0751a
                public void a(JSONObject jSONObject) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
                        return;
                    }
                    if (cVar.f != null) {
                        cVar.f.a(jSONObject);
                    }
                    ngn.a(JSBridge.access$200(JSBridge.this), str, cVar.d);
                }

                @Override // com.taobao.pha.core.jsbridge.a.InterfaceC0751a
                public void a(PHAErrorType pHAErrorType, String str2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("6d80500a", new Object[]{this, pHAErrorType, str2});
                        return;
                    }
                    if (cVar.f != null) {
                        cVar.f.a(pHAErrorType, str2);
                    }
                    ngn.a(JSBridge.access$200(JSBridge.this), str, cVar.d, pHAErrorType, str2);
                }
            });
        }
    }

    private void evaluateJavaScriptOnTarget(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d58f8787", new Object[]{this, str});
            return;
        }
        c.a aVar = this.mTarget;
        if (aVar == null) {
            return;
        }
        aVar.evaluateJavaScript(str);
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
}
