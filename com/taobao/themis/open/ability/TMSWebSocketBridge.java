package com.taobao.themis.open.ability;

import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.container.shopLoft.b;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.ability.base.ApiContext;
import com.taobao.themis.kernel.ability.base.annotation.APIMethod;
import com.taobao.themis.kernel.ability.base.annotation.BindingApiContext;
import com.taobao.themis.kernel.ability.base.annotation.BindingCallback;
import com.taobao.themis.kernel.ability.base.annotation.BindingParam;
import com.taobao.themis.kernel.ability.base.annotation.ThreadType;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.executor.ExecutorType;
import com.taobao.themis.kernel.f;
import com.taobao.themis.kernel.page.ITMSPage;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.kge;
import tb.qox;
import tb.qoy;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 $2\u00020\u0001:\u0001$B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0002J9\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\f2\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0001\u0010\u0010\u001a\u00020\u0011H\u0007¢\u0006\u0002\u0010\u0012Jx\u0010\u0013\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\f2\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u00042\b\b\u0003\u0010\u0015\u001a\u00020\u000f2\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\b2\b\b\u0003\u0010\u000e\u001a\u00020\u000f2\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\b2\b\b\u0001\u0010\u0010\u001a\u00020\u0011H\u0007J\u0018\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0011H\u0002J\b\u0010\u001e\u001a\u00020\nH\u0016J\b\u0010\u001f\u001a\u00020\nH\u0016J\u0014\u0010 \u001a\u0004\u0018\u00010\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0002JO\u0010!\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\f2\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u00042\b\b\u0003\u0010\"\u001a\u00020\u000f2\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0001\u0010\u0010\u001a\u00020\u0011H\u0007¢\u0006\u0002\u0010#R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/taobao/themis/open/ability/TMSWebSocketBridge;", "Lcom/taobao/themis/kernel/ability/base/TMSAbility;", "()V", "defaultSocketId", "", "appendQueryJson2Url", "url", "dataJson", "Lcom/alibaba/fastjson/JSONObject;", "closeSocket", "", "apiContext", "Lcom/taobao/themis/kernel/ability/base/ApiContext;", "socketTaskID", "fromRemoteDebug", "", "bridgeCallback", "Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeCallback;", "(Lcom/taobao/themis/kernel/ability/base/ApiContext;Ljava/lang/String;Ljava/lang/Boolean;Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeCallback;)V", com.taobao.themis.open.permission.check.a.WEBSOCKET, "data", "multiple", "protocols", "Lcom/alibaba/fastjson/JSONArray;", "header", "originParams", "handleMegaFail", "abilityResponse", "Lcom/taobao/themis/kernel/ability/callback/AbilityResponse;", "callback", "onFinalized", "onInitialized", "protocolsToString", "sendSocketMessage", "isBuffer", "(Lcom/taobao/themis/kernel/ability/base/ApiContext;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Boolean;Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeCallback;)V", "Companion", "themis_open_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class TMSWebSocketBridge implements com.taobao.themis.kernel.ability.base.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;

    /* renamed from: a  reason: collision with root package name */
    private final String f22605a = "tms_ws_default_task";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "abilityResponse", "Lcom/taobao/themis/kernel/ability/callback/AbilityResponse;", "kotlin.jvm.PlatformType", "keepCallback", "", "onCallback"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class b implements qox {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ ITMSPage b;
        public final /* synthetic */ BridgeCallback c;

        public b(ITMSPage iTMSPage, BridgeCallback bridgeCallback) {
            this.b = iTMSPage;
            this.c = bridgeCallback;
        }

        @Override // tb.qox
        public final void a(qoy abilityResponse, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7bdbcf97", new Object[]{this, abilityResponse, new Boolean(z)});
                return;
            }
            q.b(abilityResponse, "abilityResponse");
            if (q.a(abilityResponse.a().get("type"), (Object) "onClose")) {
                this.b.a("socketClose", new JSONObject());
            }
            if (abilityResponse.d()) {
                return;
            }
            TMSWebSocketBridge.access$handleMegaFail(TMSWebSocketBridge.this, abilityResponse, this.c);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "abilityResponse", "Lcom/taobao/themis/kernel/ability/callback/AbilityResponse;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onCallback"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class c implements qox {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f22607a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ ITMSPage c;

        public c(String str, boolean z, ITMSPage iTMSPage) {
            this.f22607a = str;
            this.b = z;
            this.c = iTMSPage;
        }

        @Override // tb.qox
        public final void a(qoy abilityResponse, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7bdbcf97", new Object[]{this, abilityResponse, new Boolean(z)});
                return;
            }
            q.b(abilityResponse, "abilityResponse");
            String valueOf = String.valueOf(abilityResponse.a().get("type"));
            switch (valueOf.hashCode()) {
                case -2003762904:
                    if (valueOf.equals(b.c.EVENT_ON_MESSAGE)) {
                        if (!this.b) {
                            ITMSPage iTMSPage = this.c;
                            JSONObject jSONObject = new JSONObject();
                            JSONObject jSONObject2 = new JSONObject();
                            JSONObject jSONObject3 = jSONObject2;
                            jSONObject3.put((JSONObject) "data", abilityResponse.a().getJSONObject("data").getString("data"));
                            jSONObject3.put((JSONObject) "isBuffer", (String) Boolean.valueOf(q.a((Object) abilityResponse.a().getJSONObject("data").getString("isBuffer"), (Object) "true")));
                            t tVar = t.INSTANCE;
                            jSONObject.put((JSONObject) "data", (String) jSONObject2);
                            t tVar2 = t.INSTANCE;
                            iTMSPage.a("socketMessage", jSONObject);
                            return;
                        }
                        ITMSPage iTMSPage2 = this.c;
                        JSONObject jSONObject4 = new JSONObject();
                        JSONObject jSONObject5 = new JSONObject();
                        JSONObject jSONObject6 = jSONObject5;
                        jSONObject6.put((JSONObject) "data", abilityResponse.a().getJSONObject("data").getString("data"));
                        jSONObject6.put((JSONObject) "isBuffer", (String) Boolean.valueOf(q.a((Object) abilityResponse.a().getJSONObject("data").getString("isBuffer"), (Object) "true")));
                        jSONObject6.put((JSONObject) "socketTaskID", this.f22607a);
                        t tVar3 = t.INSTANCE;
                        jSONObject4.put((JSONObject) "data", (String) jSONObject5);
                        t tVar4 = t.INSTANCE;
                        iTMSPage2.a("onSocketTaskMessage", jSONObject4);
                        return;
                    }
                    break;
                case -1351896231:
                    if (valueOf.equals("onClose")) {
                        TMSLogger.a("TMSWebSocketBridge", "connectSocket,socketId: " + this.f22607a + ' ' + String.valueOf(abilityResponse.a().get("type")) + " data: " + abilityResponse.a());
                        if (!this.b) {
                            this.c.a("socketClose", new JSONObject());
                            return;
                        }
                        ITMSPage iTMSPage3 = this.c;
                        JSONObject jSONObject7 = new JSONObject();
                        JSONObject jSONObject8 = new JSONObject();
                        jSONObject8.put((JSONObject) "socketTaskID", this.f22607a);
                        t tVar5 = t.INSTANCE;
                        jSONObject7.put((JSONObject) "data", (String) jSONObject8);
                        t tVar6 = t.INSTANCE;
                        iTMSPage3.a("onSocketTaskClose", jSONObject7);
                        return;
                    }
                    break;
                case -1013079863:
                    if (valueOf.equals("onOpen")) {
                        TMSLogger.a("TMSWebSocketBridge", "connectSocket,socketId: " + this.f22607a + ' ' + String.valueOf(abilityResponse.a().get("type")) + " data: " + abilityResponse.a());
                        if (!this.b) {
                            this.c.a("socketOpen", new JSONObject());
                            return;
                        }
                        ITMSPage iTMSPage4 = this.c;
                        JSONObject jSONObject9 = new JSONObject();
                        JSONObject jSONObject10 = new JSONObject();
                        jSONObject10.put((JSONObject) "socketTaskID", this.f22607a);
                        t tVar7 = t.INSTANCE;
                        jSONObject9.put((JSONObject) "data", (String) jSONObject10);
                        t tVar8 = t.INSTANCE;
                        iTMSPage4.a("onSocketTaskOpen", jSONObject9);
                        return;
                    }
                    break;
                case 1434516214:
                    if (valueOf.equals("onSocketError")) {
                        if (this.b) {
                            ITMSPage iTMSPage5 = this.c;
                            JSONObject jSONObject11 = new JSONObject();
                            JSONObject jSONObject12 = jSONObject11;
                            JSONObject jSONObject13 = new JSONObject();
                            jSONObject13.put((JSONObject) "socketTaskID", this.f22607a);
                            t tVar9 = t.INSTANCE;
                            jSONObject12.put((JSONObject) "data", (String) jSONObject13);
                            jSONObject12.put((JSONObject) "error", abilityResponse.a().getString("error"));
                            t tVar10 = t.INSTANCE;
                            iTMSPage5.a("onSocketTaskError", jSONObject11);
                        } else {
                            ITMSPage iTMSPage6 = this.c;
                            JSONObject jSONObject14 = new JSONObject();
                            jSONObject14.put((JSONObject) "error", abilityResponse.a().getString("error"));
                            t tVar11 = t.INSTANCE;
                            iTMSPage6.a("socketError", jSONObject14);
                        }
                        TMSLogger.d("TMSWebSocketBridge", "connectSocket,socketId: " + this.f22607a + ' ' + String.valueOf(abilityResponse.a().get("type")) + " data: " + abilityResponse.a());
                        return;
                    }
                    break;
            }
            TMSLogger.d("TMSWebSocketBridge", "connectSocket,socketId: " + this.f22607a + ' ' + String.valueOf(abilityResponse.a().get("type")) + " data: " + abilityResponse.a());
            if (!this.b) {
                ITMSPage iTMSPage7 = this.c;
                JSONObject jSONObject15 = new JSONObject();
                jSONObject15.put((JSONObject) "error", (String) abilityResponse.a().get("errorMessage"));
                t tVar12 = t.INSTANCE;
                iTMSPage7.a("socketError", jSONObject15);
                return;
            }
            ITMSPage iTMSPage8 = this.c;
            JSONObject jSONObject16 = new JSONObject();
            JSONObject jSONObject17 = jSONObject16;
            JSONObject jSONObject18 = new JSONObject();
            jSONObject18.put((JSONObject) "socketTaskID", this.f22607a);
            t tVar13 = t.INSTANCE;
            jSONObject17.put((JSONObject) "data", (String) jSONObject18);
            jSONObject17.put((JSONObject) "error", (String) abilityResponse.a().get("errorMessage"));
            t tVar14 = t.INSTANCE;
            iTMSPage8.a("onSocketTaskError", jSONObject16);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "abilityResponse", "Lcom/taobao/themis/kernel/ability/callback/AbilityResponse;", "kotlin.jvm.PlatformType", "keepCallback", "", "onCallback"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class d implements qox {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ BridgeCallback b;

        public d(BridgeCallback bridgeCallback) {
            this.b = bridgeCallback;
        }

        @Override // tb.qox
        public final void a(qoy abilityResponse, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7bdbcf97", new Object[]{this, abilityResponse, new Boolean(z)});
                return;
            }
            q.b(abilityResponse, "abilityResponse");
            if (q.a(abilityResponse.a().get("type"), (Object) "onSuccess")) {
                this.b.sendBridgeResponse(BridgeResponse.SUCCESS);
            } else if (abilityResponse.d()) {
            } else {
                TMSWebSocketBridge.access$handleMegaFail(TMSWebSocketBridge.this, abilityResponse, this.b);
            }
        }
    }

    static {
        kge.a(-325713910);
        kge.a(-86622547);
        Companion = new a(null);
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

    public static final /* synthetic */ void access$handleMegaFail(TMSWebSocketBridge tMSWebSocketBridge, qoy qoyVar, BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed744b0f", new Object[]{tMSWebSocketBridge, qoyVar, bridgeCallback});
        } else {
            tMSWebSocketBridge.a(qoyVar, bridgeCallback);
        }
    }

    public static /* synthetic */ void connectSocket$default(TMSWebSocketBridge tMSWebSocketBridge, ApiContext apiContext, String str, JSONObject jSONObject, String str2, boolean z, JSONArray jSONArray, JSONObject jSONObject2, boolean z2, JSONObject jSONObject3, BridgeCallback bridgeCallback, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("564377d0", new Object[]{tMSWebSocketBridge, apiContext, str, jSONObject, str2, new Boolean(z), jSONArray, jSONObject2, new Boolean(z2), jSONObject3, bridgeCallback, new Integer(i), obj});
        } else {
            tMSWebSocketBridge.connectSocket(apiContext, str, jSONObject, str2, (i & 16) != 0 ? false : z, jSONArray, jSONObject2, (i & 128) != 0 ? false : z2, jSONObject3, bridgeCallback);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b2  */
    @com.taobao.themis.kernel.ability.base.annotation.ThreadType(com.taobao.themis.kernel.executor.ExecutorType.UI)
    @com.taobao.themis.kernel.ability.base.annotation.APIMethod
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void connectSocket(@com.taobao.themis.kernel.ability.base.annotation.BindingApiContext com.taobao.themis.kernel.ability.base.ApiContext r18, @com.taobao.themis.kernel.ability.base.annotation.BindingParam(name = {"url"}) java.lang.String r19, @com.taobao.themis.kernel.ability.base.annotation.BindingParam(name = {"data"}) com.alibaba.fastjson.JSONObject r20, @com.taobao.themis.kernel.ability.base.annotation.BindingParam(name = {"socketTaskID"}) java.lang.String r21, @com.taobao.themis.kernel.ability.base.annotation.BindingParam(name = {"multiple"}) boolean r22, @com.taobao.themis.kernel.ability.base.annotation.BindingParam(name = {"protocols"}) com.alibaba.fastjson.JSONArray r23, @com.taobao.themis.kernel.ability.base.annotation.BindingParam(name = {"header"}) com.alibaba.fastjson.JSONObject r24, @com.taobao.themis.kernel.ability.base.annotation.BindingParam(name = {"fromRemoteDebug"}) boolean r25, @com.taobao.themis.kernel.ability.base.annotation.BindingRequest com.alibaba.fastjson.JSONObject r26, @com.taobao.themis.kernel.ability.base.annotation.BindingCallback com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback r27) {
        /*
            Method dump skipped, instructions count: 437
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.themis.open.ability.TMSWebSocketBridge.connectSocket(com.taobao.themis.kernel.ability.base.ApiContext, java.lang.String, com.alibaba.fastjson.JSONObject, java.lang.String, boolean, com.alibaba.fastjson.JSONArray, com.alibaba.fastjson.JSONObject, boolean, com.alibaba.fastjson.JSONObject, com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback):void");
    }

    public static /* synthetic */ void sendSocketMessage$default(TMSWebSocketBridge tMSWebSocketBridge, ApiContext apiContext, String str, String str2, boolean z, Boolean bool, BridgeCallback bridgeCallback, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("caaa7d14", new Object[]{tMSWebSocketBridge, apiContext, str, str2, new Boolean(z), bool, bridgeCallback, new Integer(i), obj});
        } else {
            tMSWebSocketBridge.sendSocketMessage(apiContext, str, str2, (i & 8) != 0 ? false : z, bool, bridgeCallback);
        }
    }

    @ThreadType(ExecutorType.UI)
    @APIMethod
    public final void sendSocketMessage(@BindingApiContext ApiContext apiContext, @BindingParam(name = {"data"}) String str, @BindingParam(name = {"socketTaskID"}) String str2, @BindingParam(name = {"isBuffer"}) boolean z, @BindingParam(name = {"fromRemoteDebug"}) Boolean bool, @BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        boolean z2 = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("116aa2df", new Object[]{this, apiContext, str, str2, new Boolean(z), bool, bridgeCallback});
            return;
        }
        q.d(apiContext, "apiContext");
        q.d(bridgeCallback, "bridgeCallback");
        ITMSPage d2 = apiContext.d();
        if (d2 == null) {
            TMSLogger.d("TMSWebSocketBridge", "page is null");
            bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
        } else if (str == null) {
            TMSLogger.d("TMSWebSocketBridge", com.taobao.vessel.utils.c.LOAD_DATA_NULL);
            bridgeCallback.sendBridgeResponse(com.taobao.themis.open.ability.c.INSTANCE.a());
        } else {
            String str3 = str2;
            if (str3 != null && str3.length() != 0) {
                z2 = false;
            }
            if (z2) {
                str2 = this.f22605a;
            }
            com.taobao.themis.open.ability.b bVar = com.taobao.themis.open.ability.b.INSTANCE;
            f b2 = d2.b();
            String f = apiContext.f();
            q.b(f, "apiContext.traceId");
            bVar.a(b2, f, str, z, str2, new d(bridgeCallback));
        }
    }

    @ThreadType(ExecutorType.UI)
    @APIMethod
    public final void closeSocket(@BindingApiContext ApiContext apiContext, @BindingParam(name = {"socketTaskID"}) String str, @BindingParam(name = {"fromRemoteDebug"}) Boolean bool, @BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcd067a8", new Object[]{this, apiContext, str, bool, bridgeCallback});
            return;
        }
        q.d(apiContext, "apiContext");
        q.d(bridgeCallback, "bridgeCallback");
        TMSLogger.d("TMSWebSocketBridge", "closeSocket " + str);
        ITMSPage d2 = apiContext.d();
        if (d2 == null) {
            TMSLogger.d("TMSWebSocketBridge", "page is null");
            bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
            return;
        }
        String str2 = str;
        if (str2 != null && str2.length() != 0) {
            z = false;
        }
        if (z) {
            str = this.f22605a;
        }
        com.taobao.themis.open.ability.b bVar = com.taobao.themis.open.ability.b.INSTANCE;
        f b2 = d2.b();
        String f = apiContext.f();
        q.b(f, "apiContext.traceId");
        bVar.a(b2, f, str, new b(d2, bridgeCallback));
        bridgeCallback.sendBridgeResponse(BridgeResponse.SUCCESS);
    }

    private final void a(qoy qoyVar, BridgeCallback bridgeCallback) {
        BridgeResponse.Error a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("146f78bf", new Object[]{this, qoyVar, bridgeCallback});
            return;
        }
        try {
            JSONObject a3 = qoyVar.a();
            JSONObject jSONObject = a3 != null ? a3.getJSONObject("errorMessage") : null;
            if (jSONObject == null) {
                TMSLogger.d("TMSWebSocketBridge", "mega fail! no error message");
                bridgeCallback.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
                return;
            }
            int intValue = jSONObject.getIntValue("statusCode");
            String string = jSONObject.getString("msg");
            if (string == null) {
                string = "";
            }
            switch (intValue) {
                case 1:
                    a2 = com.taobao.themis.open.ability.c.INSTANCE.a();
                    break;
                case 2:
                    a2 = com.taobao.themis.open.ability.c.INSTANCE.b();
                    break;
                case 3:
                    a2 = com.taobao.themis.open.ability.c.INSTANCE.c();
                    break;
                case 4:
                    a2 = com.taobao.themis.open.ability.c.INSTANCE.d();
                    break;
                case 5:
                    a2 = com.taobao.themis.open.ability.c.INSTANCE.e();
                    break;
                case 6:
                    a2 = com.taobao.themis.open.ability.c.INSTANCE.f();
                    break;
                case 7:
                    a2 = com.taobao.themis.open.ability.c.INSTANCE.g();
                    break;
                case 8:
                    a2 = com.taobao.themis.open.ability.c.INSTANCE.h();
                    break;
                case 9:
                    a2 = com.taobao.themis.open.ability.c.INSTANCE.i();
                    break;
                case 10:
                    a2 = com.taobao.themis.open.ability.c.INSTANCE.j();
                    break;
                case 11:
                    a2 = com.taobao.themis.open.ability.c.INSTANCE.k();
                    break;
                case 12:
                    a2 = com.taobao.themis.open.ability.c.INSTANCE.l();
                    break;
                default:
                    a2 = BridgeResponse.newError(3, string);
                    break;
            }
            bridgeCallback.sendBridgeResponse(a2);
            TMSLogger.d("TMSWebSocketBridge", "mega fail! " + qoyVar.a());
        } catch (Throwable th) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
            TMSLogger.b("TMSWebSocketBridge", th.getMessage(), th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002d A[Catch: Throwable -> 0x00a4, TRY_LEAVE, TryCatch #0 {Throwable -> 0x00a4, blocks: (B:6:0x001b, B:8:0x0020, B:15:0x002d, B:19:0x0044, B:21:0x004a, B:23:0x0059, B:24:0x0063, B:26:0x0069, B:28:0x0082, B:29:0x0091, B:22:0x004e), top: B:34:0x001b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.String a(java.lang.String r12, com.alibaba.fastjson.JSONObject r13) {
        /*
            r11 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.themis.open.ability.TMSWebSocketBridge.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L1b
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r4] = r11
            r1[r3] = r12
            r1[r2] = r13
            java.lang.String r12 = "9e721362"
            java.lang.Object r12 = r0.ipc$dispatch(r12, r1)
            java.lang.String r12 = (java.lang.String) r12
            return r12
        L1b:
            r0 = r13
            java.util.Map r0 = (java.util.Map) r0     // Catch: java.lang.Throwable -> La4
            if (r0 == 0) goto L29
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> La4
            if (r0 == 0) goto L27
            goto L29
        L27:
            r0 = 0
            goto L2a
        L29:
            r0 = 1
        L2a:
            if (r0 == 0) goto L2d
            return r12
        L2d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La4
            r0.<init>(r12)     // Catch: java.lang.Throwable -> La4
            r5 = r12
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5     // Catch: java.lang.Throwable -> La4
            java.lang.String r6 = "?"
            r7 = 0
            r8 = 0
            r9 = 6
            r10 = 0
            int r1 = kotlin.text.n.a(r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> La4
            java.lang.String r5 = "&"
            if (r1 <= 0) goto L4e
            r1 = 0
            boolean r1 = kotlin.text.n.c(r12, r5, r4, r2, r1)     // Catch: java.lang.Throwable -> La4
            if (r1 != 0) goto L59
            r0.append(r5)     // Catch: java.lang.Throwable -> La4
            goto L59
        L4e:
            java.lang.String r1 = "?"
            r0.append(r1)     // Catch: java.lang.Throwable -> La4
            java.lang.String r1 = "urlBuilder.append(\"?\")"
            kotlin.jvm.internal.q.b(r0, r1)     // Catch: java.lang.Throwable -> La4
        L59:
            java.util.Map r13 = (java.util.Map) r13     // Catch: java.lang.Throwable -> La4
            java.util.Set r13 = r13.entrySet()     // Catch: java.lang.Throwable -> La4
            java.util.Iterator r13 = r13.iterator()     // Catch: java.lang.Throwable -> La4
        L63:
            boolean r1 = r13.hasNext()     // Catch: java.lang.Throwable -> La4
            if (r1 == 0) goto L91
            java.lang.Object r1 = r13.next()     // Catch: java.lang.Throwable -> La4
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Throwable -> La4
            java.lang.Object r2 = r1.getKey()     // Catch: java.lang.Throwable -> La4
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> La4
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> La4
            r4 = r2
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4     // Catch: java.lang.Throwable -> La4
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> La4
            if (r4 != 0) goto L63
            r0.append(r2)     // Catch: java.lang.Throwable -> La4
            java.lang.String r2 = "="
            r0.append(r2)     // Catch: java.lang.Throwable -> La4
            r0.append(r1)     // Catch: java.lang.Throwable -> La4
            r0.append(r5)     // Catch: java.lang.Throwable -> La4
            goto L63
        L91:
            int r13 = r0.length()     // Catch: java.lang.Throwable -> La4
            int r13 = r13 - r3
            r0.deleteCharAt(r13)     // Catch: java.lang.Throwable -> La4
            java.lang.String r13 = r0.toString()     // Catch: java.lang.Throwable -> La4
            java.lang.String r0 = "urlBuilder.toString()"
            kotlin.jvm.internal.q.b(r13, r0)     // Catch: java.lang.Throwable -> La4
            return r13
        La4:
            r13 = move-exception
            java.lang.String r0 = "TMSWebSocketBridge"
            java.lang.String r1 = "appendQueryJson2Url error."
            com.taobao.themis.kernel.basic.TMSLogger.b(r0, r1, r13)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.themis.open.ability.TMSWebSocketBridge.a(java.lang.String, com.alibaba.fastjson.JSONObject):java.lang.String");
    }

    private final String a(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("64292110", new Object[]{this, jSONArray});
        }
        if (jSONArray == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        Iterator<Object> it = jSONArray.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next != null) {
                sb.append(next.toString());
                sb.append(",");
            }
        }
        return sb.toString();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/taobao/themis/open/ability/TMSWebSocketBridge$Companion;", "", "()V", RPCDataItems.SWITCH_TAG_LOG, "", "themis_open_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class a {
        static {
            kge.a(-141236526);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }
}
