package com.taobao.themis.widget.broadcast;

import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.container.shopLoft.b;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.ability.base.ApiContext;
import com.taobao.themis.kernel.ability.base.annotation.APIMethod;
import com.taobao.themis.kernel.ability.base.annotation.BindingApiContext;
import com.taobao.themis.kernel.ability.base.annotation.BindingCallback;
import com.taobao.themis.kernel.ability.base.annotation.BindingParam;
import com.taobao.themis.kernel.f;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.widget.broadcast.b;
import com.taobao.themis.widget.broadcast.c;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.text.n;
import tb.kge;
import tb.qrm;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0002J&\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\t\u001a\u00020\u00042\b\b\u0001\u0010\u000e\u001a\u00020\u000fH\u0007J&\u0010\u0010\u001a\u00020\u000b2\b\b\u0001\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\t\u001a\u00020\u00042\b\b\u0001\u0010\u000e\u001a\u00020\u000fH\u0007J\b\u0010\u0011\u001a\u00020\u000bH\u0016J\b\u0010\u0012\u001a\u00020\u000bH\u0016J2\u0010\u0013\u001a\u00020\u000b2\b\b\u0001\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\t\u001a\u00020\u00042\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\b\u0001\u0010\u000e\u001a\u00020\u000fH\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/taobao/themis/widget/broadcast/TMSWidgetBroadcastBridge;", "Lcom/taobao/themis/kernel/ability/base/TMSAbility;", "()V", "mInstanceId", "", "mJoinedTokens", "Ljava/util/concurrent/CopyOnWriteArrayList;", "checkTokenValid", "", "token", "exitChannel", "", "apiContext", "Lcom/taobao/themis/kernel/ability/base/ApiContext;", "bridgeCallback", "Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeCallback;", "joinChannel", "onFinalized", "onInitialized", "sendChannelMessage", "msg", "Lcom/alibaba/fastjson/JSONObject;", "Companion", "themis_widget_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class TMSWidgetBroadcastBridge implements com.taobao.themis.kernel.ability.base.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;

    /* renamed from: a  reason: collision with root package name */
    private String f22910a;
    private final CopyOnWriteArrayList<String> b = new CopyOnWriteArrayList<>();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u00020\u00032\u001a\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u0007H\u0016¨\u0006\b"}, d2 = {"com/taobao/themis/widget/broadcast/TMSWidgetBroadcastBridge$joinChannel$member$1", "Lcom/taobao/themis/widget/broadcast/BroadcastMember$MessageListener;", b.c.EVENT_ON_MESSAGE, "", "msgs", "Ljava/util/ArrayList;", "Lcom/taobao/themis/widget/broadcast/BroadcastMsg;", "Lkotlin/collections/ArrayList;", "themis_widget_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class d implements c.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ITMSPage f22913a;

        public d(ITMSPage iTMSPage) {
            this.f22913a = iTMSPage;
        }

        @Override // com.taobao.themis.widget.broadcast.c.a
        public void a(ArrayList<BroadcastMsg> arrayList) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dfaf7e42", new Object[]{this, arrayList});
            } else {
                this.f22913a.b("onChannelMessage", JSONArray.parseArray(JSON.toJSONString(arrayList)));
            }
        }
    }

    static {
        kge.a(-427736369);
        kge.a(-86622547);
        Companion = new a(null);
    }

    @Override // com.taobao.themis.kernel.ability.base.a
    public void onInitialized() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94f2f17c", new Object[]{this});
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/taobao/themis/widget/broadcast/TMSWidgetBroadcastBridge$Companion;", "", "()V", "EVENT_NAME", "", "TOKEN_ENCRYPT_IV", "TOKEN_ENCRYPT_KEY", "themis_widget_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class a {
        static {
            kge.a(1372796759);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    public static final /* synthetic */ CopyOnWriteArrayList access$getMJoinedTokens$p(TMSWidgetBroadcastBridge tMSWidgetBroadcastBridge) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CopyOnWriteArrayList) ipChange.ipc$dispatch("2cbe4872", new Object[]{tMSWidgetBroadcastBridge}) : tMSWidgetBroadcastBridge.b;
    }

    @Override // com.taobao.themis.kernel.ability.base.a
    public void onFinalized() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd1b9dee", new Object[]{this});
        } else if (this.f22910a != null) {
            for (String it : this.b) {
                com.taobao.themis.widget.broadcast.b a2 = com.taobao.themis.widget.broadcast.b.Companion.a();
                q.b(it, "it");
                String str = this.f22910a;
                q.a((Object) str);
                a2.a(it, str, (b.a) null);
            }
        }
    }

    @APIMethod
    public final void joinChannel(@BindingApiContext ApiContext apiContext, @BindingParam({"token"}) String token, @BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("255819d5", new Object[]{this, apiContext, token, bridgeCallback});
            return;
        }
        q.d(apiContext, "apiContext");
        q.d(token, "token");
        q.d(bridgeCallback, "bridgeCallback");
        JSONObject jSONObject = new JSONObject();
        f c2 = apiContext.c();
        ITMSPage d2 = apiContext.d();
        if (c2 == null || !com.taobao.themis.kernel.utils.o.b(c2) || d2 == null) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
            return;
        }
        this.f22910a = c2.c;
        if (!a(token)) {
            JSONObject jSONObject2 = jSONObject;
            jSONObject2.put((JSONObject) "errorCode", (String) 12);
            jSONObject2.put((JSONObject) "errorMessage", "token is invalid");
            bridgeCallback.sendJSONResponse(jSONObject);
        } else if (this.b.size() >= 2 && !this.b.contains(token)) {
            JSONObject jSONObject3 = jSONObject;
            jSONObject3.put((JSONObject) "errorCode", (String) 13);
            jSONObject3.put((JSONObject) "errorMessage", "has reached the maximum number of channels");
            bridgeCallback.sendJSONResponse(jSONObject);
        } else {
            String f = c2.f();
            q.b(f, "instance.instanceId");
            com.taobao.themis.widget.broadcast.b.Companion.a().a(token, new com.taobao.themis.widget.broadcast.c(f, new d(d2)), new c(token));
            bridgeCallback.sendBridgeResponse(BridgeResponse.SUCCESS);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\u0007"}, d2 = {"com/taobao/themis/widget/broadcast/TMSWidgetBroadcastBridge$joinChannel$1", "Lcom/taobao/themis/widget/broadcast/BroadcastManager$Callback;", "onError", "", "errorMsg", "", "onSuccess", "themis_widget_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class c implements b.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String b;

        @Override // com.taobao.themis.widget.broadcast.b.a
        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            }
        }

        public c(String str) {
            this.b = str;
        }

        @Override // com.taobao.themis.widget.broadcast.b.a
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else {
                TMSWidgetBroadcastBridge.access$getMJoinedTokens$p(TMSWidgetBroadcastBridge.this).add(this.b);
            }
        }
    }

    @APIMethod
    public final void exitChannel(@BindingApiContext ApiContext apiContext, @BindingParam({"token"}) String token, @BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3398bac9", new Object[]{this, apiContext, token, bridgeCallback});
            return;
        }
        q.d(apiContext, "apiContext");
        q.d(token, "token");
        q.d(bridgeCallback, "bridgeCallback");
        JSONObject jSONObject = new JSONObject();
        f c2 = apiContext.c();
        ITMSPage d2 = apiContext.d();
        if (c2 == null || !com.taobao.themis.kernel.utils.o.b(c2) || d2 == null) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
            return;
        }
        com.taobao.themis.widget.broadcast.b a2 = com.taobao.themis.widget.broadcast.b.Companion.a();
        String f = c2.f();
        q.b(f, "instance.instanceId");
        a2.a(token, f, new b(token, bridgeCallback, jSONObject));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\u0007"}, d2 = {"com/taobao/themis/widget/broadcast/TMSWidgetBroadcastBridge$exitChannel$1", "Lcom/taobao/themis/widget/broadcast/BroadcastManager$Callback;", "onError", "", "errorMsg", "", "onSuccess", "themis_widget_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class b implements b.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String b;
        public final /* synthetic */ BridgeCallback c;
        public final /* synthetic */ JSONObject d;

        public b(String str, BridgeCallback bridgeCallback, JSONObject jSONObject) {
            this.b = str;
            this.c = bridgeCallback;
            this.d = jSONObject;
        }

        @Override // com.taobao.themis.widget.broadcast.b.a
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            TMSWidgetBroadcastBridge.access$getMJoinedTokens$p(TMSWidgetBroadcastBridge.this).remove(this.b);
            this.c.sendBridgeResponse(BridgeResponse.SUCCESS);
        }

        @Override // com.taobao.themis.widget.broadcast.b.a
        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
                return;
            }
            this.d.put((JSONObject) "errorCode", (String) 14);
            this.d.put((JSONObject) "errorMessage", str);
            this.c.sendJSONResponse(this.d);
        }
    }

    @APIMethod
    public final void sendChannelMessage(@BindingApiContext ApiContext apiContext, @BindingParam({"token"}) String token, @BindingParam({"msg"}) JSONObject jSONObject, @BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d617e86", new Object[]{this, apiContext, token, jSONObject, bridgeCallback});
            return;
        }
        q.d(apiContext, "apiContext");
        q.d(token, "token");
        q.d(bridgeCallback, "bridgeCallback");
        JSONObject jSONObject2 = new JSONObject();
        f c2 = apiContext.c();
        ITMSPage d2 = apiContext.d();
        if (c2 == null || !com.taobao.themis.kernel.utils.o.b(c2) || d2 == null) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
        } else if (jSONObject == null) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
        } else {
            BroadcastMsg broadcastMsg = new BroadcastMsg(token, jSONObject, System.currentTimeMillis());
            com.taobao.themis.widget.broadcast.b a2 = com.taobao.themis.widget.broadcast.b.Companion.a();
            String f = c2.f();
            q.b(f, "instance.instanceId");
            a2.a(f, token, broadcastMsg, new e(bridgeCallback, jSONObject2));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\u0007"}, d2 = {"com/taobao/themis/widget/broadcast/TMSWidgetBroadcastBridge$sendChannelMessage$1", "Lcom/taobao/themis/widget/broadcast/BroadcastManager$Callback;", "onError", "", "errorMsg", "", "onSuccess", "themis_widget_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class e implements b.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ BridgeCallback f22914a;
        public final /* synthetic */ JSONObject b;

        public e(BridgeCallback bridgeCallback, JSONObject jSONObject) {
            this.f22914a = bridgeCallback;
            this.b = jSONObject;
        }

        @Override // com.taobao.themis.widget.broadcast.b.a
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else {
                this.f22914a.sendBridgeResponse(BridgeResponse.SUCCESS);
            }
        }

        @Override // com.taobao.themis.widget.broadcast.b.a
        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
                return;
            }
            this.b.put((JSONObject) "errorCode", (String) 14);
            this.b.put((JSONObject) "errorMessage", str);
            this.f22914a.sendJSONResponse(this.b);
        }
    }

    private final boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        String a2 = qrm.a("canal_channel_ky", "canal_channel_iv", str);
        return a2 != null && n.b(a2, "canal_channel", false, 2, (Object) null);
    }
}
