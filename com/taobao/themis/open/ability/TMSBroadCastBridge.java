package com.taobao.themis.open.ability;

import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
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
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.x;
import kotlin.t;
import tb.kge;
import tb.rir;
import tb.ris;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0002J\b\u0010\r\u001a\u00020\tH\u0016J\b\u0010\u000e\u001a\u00020\tH\u0016J\u001e\u0010\u000f\u001a\u00020\t2\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u00042\b\b\u0001\u0010\u0011\u001a\u00020\u0012H\u0007J4\u0010\u0013\u001a\u00020\t2\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u00042\b\b\u0001\u0010\u0015\u001a\u00020\u00162\b\b\u0001\u0010\u0011\u001a\u00020\u0012H\u0007J*\u0010\u0017\u001a\u00020\t2\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u00042\b\b\u0001\u0010\u0011\u001a\u00020\u0012H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/taobao/themis/open/ability/TMSBroadCastBridge;", "Lcom/taobao/themis/kernel/ability/base/TMSAbility;", "()V", RPCDataItems.SWITCH_TAG_LOG, "", "messageTokenChannels", "", "Lcom/taobao/weaver/broadcast/MessageChannel;", "_onMessage_", "", "token", "page", "Lcom/taobao/themis/kernel/page/ITMSPage;", "onFinalized", "onInitialized", "tbBroadcastClose", "instanceId", "bridgeCallback", "Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeCallback;", "tbBroadcastCreateChannel", "name", "apiContext", "Lcom/taobao/themis/kernel/ability/base/ApiContext;", "tbBroadcastPostMessage", "message", "themis_open_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class TMSBroadCastBridge implements com.taobao.themis.kernel.ability.base.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Map<String, ris> f22592a = new HashMap();
    private final String b = "TMSBroadCastBridge";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "message", "", "kotlin.jvm.PlatformType", b.c.EVENT_ON_MESSAGE}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class a implements rir {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ITMSPage f22593a;
        public final /* synthetic */ String b;

        public a(ITMSPage iTMSPage, String str) {
            this.f22593a = iTMSPage;
            this.b = str;
        }

        @Override // tb.rir
        public final void a(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a6251244", new Object[]{this, obj});
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put((JSONObject) "data", (String) obj);
            ITMSPage iTMSPage = this.f22593a;
            if (iTMSPage == null) {
                return;
            }
            iTMSPage.a("tbBroadcastOnMessage_" + this.b, jSONObject);
        }
    }

    static {
        kge.a(-2099629692);
        kge.a(-86622547);
    }

    @Override // com.taobao.themis.kernel.ability.base.a
    public void onInitialized() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94f2f17c", new Object[]{this});
        }
    }

    @ThreadType(ExecutorType.NORMAL)
    @APIMethod
    public final void tbBroadcastCreateChannel(@BindingParam(name = {"instanceId"}) String str, @BindingParam(name = {"name"}) String str2, @BindingApiContext ApiContext apiContext, @BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7dc32cb0", new Object[]{this, str, str2, apiContext, bridgeCallback});
            return;
        }
        q.d(apiContext, "apiContext");
        q.d(bridgeCallback, "bridgeCallback");
        String str3 = str;
        if (!(str3 == null || str3.length() == 0)) {
            String str4 = str2;
            if (str4 != null && str4.length() != 0) {
                z = false;
            }
            if (!z) {
                f c = apiContext.c();
                ITMSPage d = apiContext.d();
                if (c == null || d == null) {
                    bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
                    TMSLogger.d(this.b, "access failed! instance is null");
                    return;
                }
                synchronized (this) {
                    if (this.f22592a == null) {
                        this.f22592a = new HashMap();
                    }
                    if (this.f22592a.get(str) != null) {
                        bridgeCallback.sendBridgeResponse(new BridgeResponse.Error(-1, "channel error token has been used"));
                        return;
                    }
                    this.f22592a.put(str, new ris(c.o(), str2, null));
                    bridgeCallback.sendBridgeResponse(BridgeResponse.SUCCESS);
                    a(str, d);
                    t tVar = t.INSTANCE;
                    return;
                }
            }
        }
        bridgeCallback.sendBridgeResponse(new BridgeResponse.Error(-1, "channel args error"));
    }

    @ThreadType(ExecutorType.NORMAL)
    @APIMethod
    public final void tbBroadcastPostMessage(@BindingParam(name = {"instanceId"}) String str, @BindingParam(name = {"message"}) String str2, @BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5fb17ed", new Object[]{this, str, str2, bridgeCallback});
            return;
        }
        q.d(bridgeCallback, "bridgeCallback");
        String str3 = str;
        if (!(str3 == null || str3.length() == 0)) {
            String str4 = str2;
            if (str4 != null && str4.length() != 0) {
                z = false;
            }
            if (!z) {
                Map<String, ris> map = this.f22592a;
                if (map == null) {
                    bridgeCallback.sendBridgeResponse(new BridgeResponse.Error(-1, "message queue is null"));
                    return;
                }
                ris risVar = map.get(str);
                if (risVar == null) {
                    bridgeCallback.sendBridgeResponse(new BridgeResponse.Error(-1, "channel token not exist"));
                    return;
                }
                risVar.a(str2);
                bridgeCallback.sendBridgeResponse(BridgeResponse.SUCCESS);
                return;
            }
        }
        bridgeCallback.sendBridgeResponse(new BridgeResponse.Error(-1, "channel args error"));
    }

    @ThreadType(ExecutorType.NORMAL)
    @APIMethod
    public final void tbBroadcastClose(@BindingParam(name = {"instanceId"}) String str, @BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60b9a3e6", new Object[]{this, str, bridgeCallback});
            return;
        }
        q.d(bridgeCallback, "bridgeCallback");
        Map<String, ris> map = this.f22592a;
        if (map == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.MutableMap<K, V>");
        }
        ris risVar = (ris) x.i(map).remove(str);
        if (risVar == null) {
            return;
        }
        risVar.b();
        bridgeCallback.sendBridgeResponse(BridgeResponse.SUCCESS);
    }

    private final void a(String str, ITMSPage iTMSPage) {
        ris risVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8655fdd", new Object[]{this, str, iTMSPage});
            return;
        }
        Map<String, ris> map = this.f22592a;
        if (map == null || (risVar = map.get(str)) == null) {
            return;
        }
        risVar.a((rir) new a(iTMSPage, str));
    }

    @Override // com.taobao.themis.kernel.ability.base.a
    public void onFinalized() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd1b9dee", new Object[]{this});
            return;
        }
        Map<String, ris> map = this.f22592a;
        if (map == null) {
            return;
        }
        map.clear();
    }
}
