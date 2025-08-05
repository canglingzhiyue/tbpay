package com.taobao.themis.open.ability;

import android.text.TextUtils;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.js.MtopJSBridge;
import com.taobao.themis.kernel.ability.base.ApiContext;
import com.taobao.themis.kernel.ability.base.annotation.APIMethod;
import com.taobao.themis.kernel.ability.base.annotation.BindingApiContext;
import com.taobao.themis.kernel.ability.base.annotation.BindingCallback;
import com.taobao.themis.kernel.ability.base.annotation.BindingParam;
import com.taobao.themis.kernel.ability.base.annotation.ThreadType;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.executor.ExecutorType;
import com.taobao.themis.kernel.f;
import com.taobao.themis.kernel.metaInfo.TMSMetaInfoWrapper;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.kernel.utils.n;
import com.taobao.themis.open.permission.auth.AuthUtils;
import com.taobao.themis.open.permission.sendmtop.SendMtopParams;
import com.taobao.themis.open.permission.sendmtop.SendMtopResponse;
import com.taobao.themis.open.permission.sendmtop.a;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.kge;
import tv.danmaku.ijk.media.player.MonitorMediaPlayer;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0002J\b\u0010\n\u001a\u00020\u0006H\u0016J\b\u0010\u000b\u001a\u00020\u0006H\u0016JÌ\u0001\u0010\f\u001a\u00020\u00062\b\b\u0001\u0010\r\u001a\u00020\u00042\b\b\u0001\u0010\u000e\u001a\u00020\u00042\b\b\u0001\u0010\u000f\u001a\u00020\u00102\b\b\u0001\u0010\u0011\u001a\u00020\u00042\b\b\u0001\u0010\u0012\u001a\u00020\u00042\b\b\u0001\u0010\u0013\u001a\u00020\u00042\b\b\u0001\u0010\u0014\u001a\u00020\u00152\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u00172\b\b\u0001\u0010\u001a\u001a\u00020\u001b2\b\b\u0001\u0010\u001c\u001a\u00020\u00042\b\b\u0001\u0010\u001d\u001a\u00020\u00042\b\b\u0001\u0010\u001e\u001a\u00020\u00042\b\b\u0001\u0010\u001f\u001a\u00020\u00042\b\b\u0001\u0010 \u001a\u00020\u00042\b\b\u0001\u0010!\u001a\u00020\u00102\b\b\u0001\u0010\"\u001a\u00020#2\b\b\u0001\u0010$\u001a\u00020\u0007H\u0007J¦\u0001\u0010%\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u00102\u0006\u0010&\u001a\u00020'2\u0006\u0010\u0005\u001a\u00020\u0007H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/taobao/themis/open/ability/TMSSendMtopBridge;", "Lcom/taobao/themis/kernel/ability/base/TMSAbility;", "()V", RPCDataItems.SWITCH_TAG_LOG, "", "callback", "", "Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeCallback;", "responseDO", "Lcom/taobao/themis/open/permission/sendmtop/SendMtopResponse;", "onFinalized", "onInitialized", "sendMtop", "api", "v", "needLogin", "", MtopJSBridge.MtopJSParam.SESSION_OPTION, "method", "dataType", MtopJSBridge.MtopJSParam.SEC_TYPE, "", "data", "Lcom/alibaba/fastjson/JSONObject;", MtopJSBridge.MtopJSParam.EXT_HEADERS, MtopJSBridge.MtopJSParam.EXT_QUERYS, "timeout", "", "ttid", "pageUrl", "xua", MtopJSBridge.MtopJSParam.MP_HOST, MtopJSBridge.MtopJSParam.ACCOUNT_SITE, MonitorMediaPlayer.ABTEST_USE_CACHE_ENABLE, "apiContext", "Lcom/taobao/themis/kernel/ability/base/ApiContext;", "bridgeCallback", "sendMtopImpl", "instance", "Lcom/taobao/themis/kernel/TMSInstance;", "themis_open_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class TMSSendMtopBridge implements com.taobao.themis.kernel.ability.base.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f22597a = "TMSSendMtopBridge";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/taobao/themis/open/ability/TMSSendMtopBridge$sendMtopImpl$2", "Lcom/taobao/themis/open/permission/sendmtop/SendMtopUtils$Callback;", "onResult", "", "sendMtopResponse", "Lcom/taobao/themis/open/permission/sendmtop/SendMtopResponse;", "themis_open_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class a implements a.InterfaceC0967a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ BridgeCallback b;

        public a(BridgeCallback bridgeCallback) {
            this.b = bridgeCallback;
        }

        @Override // com.taobao.themis.open.permission.sendmtop.a.InterfaceC0967a
        public void a(SendMtopResponse sendMtopResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5815e19a", new Object[]{this, sendMtopResponse});
            } else {
                TMSSendMtopBridge.access$callback(TMSSendMtopBridge.this, this.b, sendMtopResponse);
            }
        }
    }

    static {
        kge.a(1444345887);
        kge.a(-86622547);
    }

    @Override // com.taobao.themis.kernel.ability.base.a
    public void onFinalized() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd1b9dee", new Object[]{this});
        }
    }

    @Override // com.taobao.themis.kernel.ability.base.a
    public void onInitialized() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94f2f17c", new Object[]{this});
        }
    }

    public static final /* synthetic */ void access$callback(TMSSendMtopBridge tMSSendMtopBridge, BridgeCallback bridgeCallback, SendMtopResponse sendMtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6eeb242", new Object[]{tMSSendMtopBridge, bridgeCallback, sendMtopResponse});
        } else {
            tMSSendMtopBridge.a(bridgeCallback, sendMtopResponse);
        }
    }

    @ThreadType(ExecutorType.NETWORK)
    @APIMethod
    public final void sendMtop(@BindingParam(name = {"api", "apiName"}) String api, @BindingParam(name = {"v"}) String v, @BindingParam(name = {"needLogin"}) boolean z, @BindingParam(name = {"sessionOption"}, stringDefault = "AutoLoginAndManualLogin") String sessionOption, @BindingParam(name = {"method"}, stringDefault = "GET") String method, @BindingParam(name = {"dataType"}, stringDefault = "originaljson") String dataType, @BindingParam(name = {"secType"}) int i, @BindingParam(name = {"data"}) JSONObject jSONObject, @BindingParam(name = {"ext_headers"}) JSONObject jSONObject2, @BindingParam(name = {"ext_querys"}) JSONObject jSONObject3, @BindingParam(intDefault = 20000, name = {"timeout"}) long j, @BindingParam(name = {"ttid"}) String ttid, @BindingParam(name = {"pageUrl"}) String pageUrl, @BindingParam(name = {"x-ua"}) String xua, @BindingParam(name = {"mpHost"}) String mpHost, @BindingParam(name = {"accountSite"}) String accountSite, @BindingParam(name = {"useCache"}) boolean z2, @BindingApiContext ApiContext apiContext, @BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d6fab2d", new Object[]{this, api, v, new Boolean(z), sessionOption, method, dataType, new Integer(i), jSONObject, jSONObject2, jSONObject3, new Long(j), ttid, pageUrl, xua, mpHost, accountSite, new Boolean(z2), apiContext, bridgeCallback});
            return;
        }
        q.d(api, "api");
        q.d(v, "v");
        q.d(sessionOption, "sessionOption");
        q.d(method, "method");
        q.d(dataType, "dataType");
        q.d(ttid, "ttid");
        q.d(pageUrl, "pageUrl");
        q.d(xua, "xua");
        q.d(mpHost, "mpHost");
        q.d(accountSite, "accountSite");
        q.d(apiContext, "apiContext");
        q.d(bridgeCallback, "bridgeCallback");
        f c = apiContext.c();
        ITMSPage d = apiContext.d();
        if (c == null || d == null) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
            TMSLogger.d(this.f22597a, "access failed! instance is null");
            return;
        }
        a(api, v, z, sessionOption, method, dataType, i, jSONObject, jSONObject2, jSONObject3, j, ttid, pageUrl, xua, mpHost, accountSite, z2, c, bridgeCallback);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void a(String str, String str2, boolean z, String str3, String str4, String str5, int i, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, long j, String str6, String str7, String str8, String str9, String str10, boolean z2, f fVar, BridgeCallback bridgeCallback) {
        TMSSendMtopBridge tMSSendMtopBridge;
        TMSMetaInfoWrapper v;
        JSONObject m;
        JSONObject jSONObject4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea9c9a16", new Object[]{this, str, str2, new Boolean(z), str3, str4, str5, new Integer(i), jSONObject, jSONObject2, jSONObject3, new Long(j), str6, str7, str8, str9, str10, new Boolean(z2), fVar, bridgeCallback});
            return;
        }
        SendMtopParams sendMtopParams = new SendMtopParams();
        sendMtopParams.setApi(str);
        sendMtopParams.setV(str2);
        sendMtopParams.setForceLogin(z);
        sendMtopParams.setNeedLogin(z);
        sendMtopParams.setSessionOption(str3);
        sendMtopParams.setDataType(str5);
        sendMtopParams.setMethod(str4);
        sendMtopParams.setTtid(str6);
        sendMtopParams.setWuaFlag(i);
        sendMtopParams.setTimer(j);
        sendMtopParams.setUserAgent(str8);
        sendMtopParams.setPageUrl(str7);
        sendMtopParams.setAccountSite(str10);
        sendMtopParams.setMpHost(str9);
        sendMtopParams.setUseCache(z2);
        sendMtopParams.setAddISVHeader(AuthUtils.INSTANCE.a(fVar, str10, str));
        if (jSONObject != null) {
            Set<String> keySet = jSONObject.keySet();
            q.b(keySet, "data.keys");
            for (String str11 : keySet) {
                Object obj = jSONObject.get(str11);
                if (obj != null) {
                    sendMtopParams.addData(str11, obj.toString());
                }
            }
        }
        if (jSONObject2 != null) {
            Set<String> keySet2 = jSONObject2.keySet();
            q.b(keySet2, "ext_headers.keys");
            for (String str12 : keySet2) {
                Object obj2 = jSONObject2.get(str12);
                if (obj2 != null) {
                    sendMtopParams.addHeader(str12, obj2.toString());
                }
            }
        }
        if (jSONObject3 != null) {
            Set<String> keySet3 = jSONObject3.keySet();
            q.b(keySet3, "ext_querys.keys");
            for (String str13 : keySet3) {
                Object obj3 = jSONObject3.get(str13);
                if (obj3 != null) {
                    sendMtopParams.addParameterMap(str13, obj3.toString());
                }
            }
        }
        sendMtopParams.setHeaders(com.taobao.themis.open.permission.sendmtop.a.a(fVar));
        try {
            if (n.bA() && (v = fVar.v()) != null && (m = v.m()) != null && (jSONObject4 = m.getJSONObject("mtopHeaderConfig")) != null) {
                for (String str14 : jSONObject4.keySet()) {
                    if (q.a((Object) str, (Object) str14)) {
                        JSONObject jSONObject5 = jSONObject4.getJSONObject(str14);
                        q.b(jSONObject5, "headerConfig.getJSONObject(key)");
                        Map<String, Object> innerMap = jSONObject5.getInnerMap();
                        if (innerMap == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                        }
                        sendMtopParams.setHeaders(innerMap);
                    }
                }
            }
            tMSSendMtopBridge = this;
        } catch (Throwable th) {
            tMSSendMtopBridge = this;
            TMSLogger.b(tMSSendMtopBridge.f22597a, "append header error", th);
        }
        String h = fVar.h();
        q.b(h, "instance.appId");
        sendMtopParams.addExtraDara("contextId", h);
        com.taobao.themis.open.permission.sendmtop.a.a(fVar, sendMtopParams, new a(bridgeCallback));
    }

    private final void a(BridgeCallback bridgeCallback, SendMtopResponse sendMtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e0cbfae", new Object[]{this, bridgeCallback, sendMtopResponse});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        if (sendMtopResponse != null) {
            try {
                if (!sendMtopResponse.getSuccess()) {
                    jSONObject.put((JSONObject) "error", (String) (TextUtils.isDigitsOnly(sendMtopResponse.getErrorCode()) ? sendMtopResponse.getErrorCode() : 3));
                    jSONObject.put((JSONObject) "errorCode", sendMtopResponse.getErrorCode());
                    jSONObject.put((JSONObject) "message", sendMtopResponse.getErrorMsg());
                    jSONObject.put((JSONObject) "errorMessage", sendMtopResponse.getErrorMsg());
                }
                byte[] data = sendMtopResponse.getData();
                if (data != null && data.length > 0) {
                    Charset forName = Charset.forName("UTF-8");
                    q.b(forName, "Charset.forName(\"UTF-8\")");
                    String str = new String(data, forName);
                    if (!TextUtils.isEmpty(str)) {
                        jSONObject.putAll(JSON.parseObject(str));
                        jSONObject.put((JSONObject) "success", (String) Boolean.valueOf(sendMtopResponse.getSuccess()));
                    }
                }
            } catch (Exception e) {
                JSONObject jSONObject2 = jSONObject;
                jSONObject2.put((JSONObject) "message", e.getMessage());
                jSONObject2.put((JSONObject) "errorMessage", e.getMessage());
                jSONObject2.put((JSONObject) "errorCode", (String) 6);
                jSONObject2.put((JSONObject) "error", (String) 6);
            }
        } else {
            bridgeCallback.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
        }
        bridgeCallback.sendJSONResponse(jSONObject);
    }
}
