package com.taobao.tab2interact.plugin.jsbridge;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.webview.IWVWebView;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tab2interact.core.layer.h5.view.H5InteractLayerWebView;
import com.taobao.taobao.R;
import java.util.List;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.ess;
import tb.est;
import tb.kge;
import tb.odq;
import tb.suq;
import tb.sur;
import tb.sus;
import tb.suu;

/* loaded from: classes8.dex */
public final class H5InteractLayerJsBridge extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ACTION_GET_ENVINFO = "getEnvInfo";
    private static final String ACTION_SEND_MESSAGE = "sendMessage";
    public static final a Companion;
    private static final String TAG = "H5InteractLayerJsBridge";

    static {
        kge.a(-1065189226);
        Companion = new a(null);
    }

    public static /* synthetic */ Object ipc$super(H5InteractLayerJsBridge h5InteractLayerJsBridge, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    /* loaded from: classes8.dex */
    public static final class a {
        static {
            kge.a(-1695340450);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        com.taobao.tab2interact.core.utils.a.b(this, TAG, "收到前端调用，action=" + str + "，params=" + str2);
        if (str != null) {
            try {
                int hashCode = str.hashCode();
                if (hashCode != -554082555) {
                    if (hashCode == 691453791 && str.equals(ACTION_SEND_MESSAGE)) {
                        return executeSendMessage(str2, wVCallBackContext);
                    }
                } else if (str.equals(ACTION_GET_ENVINFO)) {
                    return executeGetEnvInfo(str2, wVCallBackContext);
                }
            } catch (Exception e) {
                com.taobao.tab2interact.core.utils.a.a(this, TAG, "收到并处理来自前端的消息异常", e);
            }
        }
        return false;
    }

    private final boolean executeSendMessage(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8913337c", new Object[]{this, str, wVCallBackContext})).booleanValue();
        }
        Object webViewTag = getWebViewTag(wVCallBackContext, R.id.h5_interact_layer_message_center_tag);
        Object webViewTag2 = getWebViewTag(wVCallBackContext, R.id.h5_interact_layer_base_info_manager_tag);
        Object webViewTag3 = getWebViewTag(wVCallBackContext, R.id.h5_interact_layer_short_video_tab_base_info_manager_tag);
        JSONObject parseObject = JSONObject.parseObject(str);
        com.taobao.tab2interact.core.utils.a.b(this, TAG, "收到并处理来自前端的消息");
        if ((webViewTag instanceof sus) && (webViewTag2 instanceof com.taobao.tab2interact.core.data.baseinfo.a) && (webViewTag3 instanceof est) && parseObject != null && wVCallBackContext != null) {
            Object obj = parseObject.get("name");
            if (q.a(obj, (Object) suq.REGISTER_MESSAGES_NAME) || q.a(obj, (Object) suq.UNREGISTER_MESSAGES_NAME)) {
                handleRegisterOrUnregister((sus) webViewTag, (com.taobao.tab2interact.core.data.baseinfo.a) webViewTag2, parseObject, wVCallBackContext, (est) webViewTag3);
            } else {
                odq.INSTANCE.a((sus) webViewTag, (com.taobao.tab2interact.core.data.baseinfo.a) webViewTag2, parseObject, new b(wVCallBackContext), (est) webViewTag3);
            }
        }
        return true;
    }

    private final boolean executeGetEnvInfo(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d3df572c", new Object[]{this, str, wVCallBackContext})).booleanValue();
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "envInfo", (String) ess.a());
        if (wVCallBackContext != null) {
            wVCallBackContext.success(jSONObject.toJSONString());
        }
        return true;
    }

    private final void handleRegisterOrUnregister(sus susVar, com.taobao.tab2interact.core.data.baseinfo.a aVar, JSONObject jSONObject, WVCallBackContext wVCallBackContext, est estVar) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e264ce7", new Object[]{this, susVar, aVar, jSONObject, wVCallBackContext, estVar});
            return;
        }
        com.taobao.tab2interact.core.utils.a.b(this, TAG, "处理注册或解注册");
        Object obj = jSONObject.get("args");
        if (!(obj instanceof JSONObject)) {
            com.taobao.tab2interact.core.utils.a.b(this, TAG, "处理注册或解注册，args无效");
            return;
        }
        JSONObject jSONObject2 = (JSONObject) obj;
        Object obj2 = jSONObject2.get("target");
        if (obj2 instanceof String) {
            if (((CharSequence) obj2).length() != 0) {
                z = false;
            }
            if (!z) {
                Object obj3 = jSONObject2.get(suq.REGISTER_OR_UNREGISTER_MESSAGES_ARGS_MESSAGE_NAMES);
                if (!(obj3 instanceof JSONArray)) {
                    com.taobao.tab2interact.core.utils.a.b(this, TAG, "处理注册或解注册，messageNames无效");
                    return;
                }
                List<String> parseArray = JSONArray.parseArray(((JSONArray) obj3).toJSONString(), String.class);
                if (parseArray == null || parseArray.isEmpty()) {
                    com.taobao.tab2interact.core.utils.a.b(this, TAG, "处理注册或解注册，messageNameList为空");
                    return;
                }
                Object webViewTag = getWebViewTag(wVCallBackContext, R.id.h5_interact_layer_message_observer_tag);
                if (!(webViewTag instanceof suu)) {
                    return;
                }
                Object obj4 = jSONObject.get("name");
                if (q.a(obj4, (Object) suq.REGISTER_MESSAGES_NAME)) {
                    odq.INSTANCE.a(susVar, aVar, (String) obj2, parseArray, (suu) webViewTag, estVar);
                    return;
                } else if (!q.a(obj4, (Object) suq.UNREGISTER_MESSAGES_NAME)) {
                    return;
                } else {
                    odq.INSTANCE.b(susVar, aVar, (String) obj2, parseArray, (suu) webViewTag, estVar);
                    return;
                }
            }
        }
        com.taobao.tab2interact.core.utils.a.b(this, TAG, "处理注册或解注册，target无效");
    }

    private final Object getWebViewTag(WVCallBackContext wVCallBackContext, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("3847e3ca", new Object[]{this, wVCallBackContext, new Integer(i)});
        }
        IWVWebView webview = wVCallBackContext != null ? wVCallBackContext.getWebview() : null;
        if (webview instanceof H5InteractLayerWebView) {
            return ((H5InteractLayerWebView) webview).getTag(i);
        }
        return null;
    }

    /* loaded from: classes8.dex */
    public static final class b implements sur.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final WVCallBackContext f19776a;

        static {
            kge.a(1367412030);
            kge.a(-642811951);
        }

        public b(WVCallBackContext wvCallBackContext) {
            q.d(wvCallBackContext, "wvCallBackContext");
            this.f19776a = wvCallBackContext;
        }

        @Override // tb.sur.a
        public void a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
                return;
            }
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            String jSONString = JSONObject.toJSONString(jSONObject);
            com.taobao.tab2interact.core.utils.a.b(this, H5InteractLayerJsBridge.TAG, "收到消息结果回调，finalResultJSONString=" + jSONString);
            this.f19776a.success(jSONString);
        }
    }
}
