package com.taobao.android.layoutmanager.setup;

import android.taobao.windvane.extra.uc.WVUCWebView;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.q;
import android.taobao.windvane.jsbridge.r;
import android.taobao.windvane.webview.IWVWebView;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.layoutmanager.message.WVSubscribePlugin;
import com.taobao.tao.flexbox.layoutmanager.ac.g;
import com.taobao.tao.flexbox.layoutmanager.module.NotifyModule;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.oec;
import tb.ogg;
import tb.ohh;
import tb.sgm;

/* loaded from: classes5.dex */
public class WindvanePluginRegister {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1241520017);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        q.a(WVWindowInfoPlugin.CLASS_NAME, (Class<? extends e>) WVWindowInfoPlugin.class);
        q.a(WVSubscribePlugin.CLASS_NAME, (Class<? extends e>) WVSubscribePlugin.class);
        q.a(WVTNodeCachePlugin.CLASS_NAME, (Class<? extends e>) WVTNodeCachePlugin.class);
        q.a("tnode", (Class<? extends e>) WVTNodeWebViewJSBridge.class);
        q.a("TBVSGlobalJSBridge", (Class<? extends e>) TBVSGlobalJSBridge.class);
    }

    /* loaded from: classes5.dex */
    public static class WVTNodeCachePlugin extends e {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final String ACTION_GET_CACHE = "getCache";
        public static final String ACTION_POST_NOTIFY = "postNotify";
        public static final String ACTION_SAVE_CACHE = "saveCache";
        public static final String CLASS_NAME = "TNodeWindVaneBridge";

        static {
            kge.a(214895569);
        }

        @Override // android.taobao.windvane.jsbridge.e
        public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
            }
            if (ACTION_SAVE_CACHE.equals(str)) {
                try {
                    JSONObject parseObject = JSON.parseObject(str2);
                    String string = parseObject.getString("key");
                    Object obj = parseObject.get("value");
                    if (parseObject.getBooleanValue("memory")) {
                        ohh.a(string, obj);
                    } else {
                        ohh.b(string, obj);
                    }
                    r rVar = new r();
                    rVar.b();
                    wVCallBackContext.success(rVar);
                } catch (Throwable th) {
                    ogg.b(th.getMessage());
                }
                return true;
            } else if (ACTION_GET_CACHE.equals(str)) {
                JSONObject parseObject2 = JSON.parseObject(str2);
                r rVar2 = new r();
                String string2 = parseObject2.getString("key");
                Object a2 = parseObject2.getBooleanValue("memory") ? ohh.a(string2) : ohh.b(string2);
                if (a2 instanceof Map) {
                    for (Map.Entry entry : ((Map) a2).entrySet()) {
                        rVar2.a(oec.a(entry.getKey(), (String) null), entry.getValue());
                    }
                }
                rVar2.b();
                wVCallBackContext.success(rVar2);
                return true;
            } else {
                if (ACTION_POST_NOTIFY.equals(str)) {
                    JSONObject parseObject3 = JSON.parseObject(str2);
                    String string3 = parseObject3.getString("name");
                    Object obj2 = parseObject3.get("args");
                    if (!TextUtils.isEmpty(string3)) {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("name", (Object) string3);
                            jSONObject.put("args", obj2);
                            NotifyModule.postNotify(new g.c(null, jSONObject, null));
                        } catch (Throwable th2) {
                            ogg.c(ACTION_POST_NOTIFY, th2.getMessage());
                        }
                    }
                }
                return false;
            }
        }
    }

    /* loaded from: classes5.dex */
    public static class WVTNodeWebViewJSBridge extends e {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final String CLASS_NAME = "tnode";
        public static final String TAG = "WebViewComponent";

        static {
            kge.a(-1392193081);
        }

        public static /* synthetic */ Object ipc$super(WVTNodeWebViewJSBridge wVTNodeWebViewJSBridge, String str, Object... objArr) {
            str.hashCode();
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        @Override // android.taobao.windvane.jsbridge.e
        public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
            }
            ogg.a(TAG, "WVTNodeWebViewJSBridge action = " + str + " params = " + str2);
            if (!"postMessage".equals(str)) {
                return false;
            }
            doMyHandler(str2, wVCallBackContext);
            return true;
        }

        private void doMyHandler(String str, WVCallBackContext wVCallBackContext) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3d30b741", new Object[]{this, str, wVCallBackContext});
                return;
            }
            try {
                JSONObject parseObject = JSON.parseObject(str);
                HashMap hashMap = new HashMap();
                for (String str2 : parseObject.keySet()) {
                    hashMap.put(str2, parseObject.get(str2));
                }
                IWVWebView webview = wVCallBackContext.getWebview();
                if (webview instanceof WVUCWebView) {
                    sgm sgmVar = (sgm) ((WVUCWebView) webview).getTag();
                    if (sgmVar != null) {
                        sgmVar.a("onmessage", hashMap);
                    } else {
                        ogg.a(TAG, "WVTNodeWebViewJSBridge doMyHandler webViewComponent is null");
                    }
                }
                wVCallBackContext.success(new r());
            } catch (JSONException unused) {
                wVCallBackContext.error();
            }
        }
    }

    /* loaded from: classes5.dex */
    public static class WVWindowInfoPlugin extends e {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final String ACTION_GET_STATUS_BAR_HEIGHT = "getStatusBarHeight";
        public static final String CLASS_NAME = "WVWindowInfo";

        static {
            kge.a(-1904609661);
        }

        @Override // android.taobao.windvane.jsbridge.e
        public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
            }
            if (!ACTION_GET_STATUS_BAR_HEIGHT.equals(str)) {
                return false;
            }
            r rVar = new r();
            rVar.b();
            rVar.a("height", (Object) 0);
            wVCallBackContext.success(rVar);
            return true;
        }
    }

    /* loaded from: classes5.dex */
    public static class TBVSGlobalJSBridge extends e {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final String CLASS_NAME = "TBVSGlobalJSBridge";
        public static final String GET_VIBRATE_SWITCH = "getVibrateSwitch";
        public static final String SET_VIBRATE_SWITCH = "setVibrateSwitch";
        public static final String TAG = "TBVSGlobalJSBridge";
        public static String VIBERATE_STATE;

        static {
            kge.a(-1366075053);
            VIBERATE_STATE = "viberate_state";
        }

        @Override // android.taobao.windvane.jsbridge.e
        public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
            }
            ogg.a("TBVSGlobalJSBridge", "TBVSGlobalJSBridge action = " + str + " params = " + str2);
            if (GET_VIBRATE_SWITCH.equals(str)) {
                return isViberate(str2, wVCallBackContext);
            }
            if (!SET_VIBRATE_SWITCH.equals(str)) {
                return false;
            }
            return setViberate(str2, wVCallBackContext);
        }

        private static boolean setViberate(String str, WVCallBackContext wVCallBackContext) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("778c27ea", new Object[]{str, wVCallBackContext})).booleanValue();
            }
            ohh.b(VIBERATE_STATE, Boolean.valueOf(oec.a(JSON.parseObject(str).get("setEnable"), false)));
            if (wVCallBackContext != null) {
                wVCallBackContext.success("setViberate success");
            }
            return true;
        }

        private static boolean isViberate(String str, WVCallBackContext wVCallBackContext) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("50d896b2", new Object[]{str, wVCallBackContext})).booleanValue();
            }
            HashMap hashMap = new HashMap();
            hashMap.put("enable", String.valueOf(oec.a(ohh.b(VIBERATE_STATE), false)));
            if (wVCallBackContext == null) {
                return false;
            }
            wVCallBackContext.success(JSON.toJSONString(hashMap));
            return true;
        }
    }
}
