package com.taobao.themis.open.ability;

import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.monitor.MUSMonitor;
import com.taobao.themis.kernel.f;
import com.taobao.themis.open.ability.calendar.TMSCalendarBridge;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.kge;
import tb.qox;
import tb.qoy;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eJ^\u0010\u000f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0016\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00122\u0016\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00122\u0006\u0010\r\u001a\u00020\u000eJ6\u0010\u0014\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/taobao/themis/open/ability/WebSocketMegaAbility;", "", "()V", RPCDataItems.SWITCH_TAG_LOG, "", "module", "namespace", "close", "", "instance", "Lcom/taobao/themis/kernel/TMSInstance;", "traceId", "socketId", "callback", "Lcom/taobao/themis/kernel/ability/callback/AbilityCallback;", "connect", "url", "headers", "", "data", "send", "isBuffer", "", "themis_open_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final b INSTANCE;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Lcom/taobao/themis/kernel/ability/callback/AbilityResponse;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onCallback"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class a implements qox {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final a INSTANCE = new a();

        @Override // tb.qox
        public final void a(qoy qoyVar, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7bdbcf97", new Object[]{this, qoyVar, new Boolean(z)});
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Lcom/taobao/themis/kernel/ability/callback/AbilityResponse;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onCallback"}, k = 3, mv = {1, 4, 1})
    /* renamed from: com.taobao.themis.open.ability.b$b  reason: collision with other inner class name */
    /* loaded from: classes9.dex */
    public static final class C0955b implements qox {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final C0955b INSTANCE = new C0955b();

        @Override // tb.qox
        public final void a(qoy qoyVar, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7bdbcf97", new Object[]{this, qoyVar, new Boolean(z)});
            }
        }
    }

    static {
        kge.a(1445183269);
        INSTANCE = new b();
    }

    private b() {
    }

    public final void a(f instance, String url, String traceId, String socketId, Map<String, ? extends Object> map, Map<String, ? extends Object> map2, qox callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3948381", new Object[]{this, instance, url, traceId, socketId, map, map2, callback});
            return;
        }
        q.d(instance, "instance");
        q.d(url, "url");
        q.d(traceId, "traceId");
        q.d(socketId, "socketId");
        q.d(callback, "callback");
        com.taobao.themis.kernel.ability.a a2 = com.taobao.themis.kernel.ability.a.a();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) MUSMonitor.MODULE_DIM_ABILITY, "websocket");
        t tVar = t.INSTANCE;
        a2.a(instance, TMSCalendarBridge.namespace, traceId, socketId, MUSMonitor.MODULE_DIM_ABILITY, "create", jSONObject, C0955b.INSTANCE);
        com.taobao.themis.kernel.ability.a a3 = com.taobao.themis.kernel.ability.a.a();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = jSONObject2;
        jSONObject3.put((JSONObject) "url", url);
        if (map != null) {
            jSONObject3.put((JSONObject) "headers", (String) map);
        }
        if (map2 != null) {
            jSONObject3.put((JSONObject) "data", (String) map2);
        }
        t tVar2 = t.INSTANCE;
        a3.a(instance, TMSCalendarBridge.namespace, traceId, socketId, "websocket", "connect", jSONObject2, callback);
    }

    public final void a(f instance, String traceId, String data, boolean z, String socketId, qox callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("393ba53", new Object[]{this, instance, traceId, data, new Boolean(z), socketId, callback});
            return;
        }
        q.d(instance, "instance");
        q.d(traceId, "traceId");
        q.d(data, "data");
        q.d(socketId, "socketId");
        q.d(callback, "callback");
        com.taobao.themis.kernel.ability.a a2 = com.taobao.themis.kernel.ability.a.a();
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put((JSONObject) "isBuffer", (String) Boolean.valueOf(z));
        jSONObject2.put((JSONObject) "data", data);
        t tVar = t.INSTANCE;
        a2.a(instance, TMSCalendarBridge.namespace, traceId, socketId, "websocket", "send", jSONObject, callback);
    }

    public final void a(f instance, String traceId, String socketId, qox callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8cc61d7", new Object[]{this, instance, traceId, socketId, callback});
            return;
        }
        q.d(instance, "instance");
        q.d(traceId, "traceId");
        q.d(socketId, "socketId");
        q.d(callback, "callback");
        com.taobao.themis.kernel.ability.a.a().a(instance, TMSCalendarBridge.namespace, traceId, socketId, "websocket", "close", new JSONObject(), callback);
        com.taobao.themis.kernel.ability.a a2 = com.taobao.themis.kernel.ability.a.a();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) MUSMonitor.MODULE_DIM_ABILITY, "websocket");
        t tVar = t.INSTANCE;
        a2.a(instance, TMSCalendarBridge.namespace, traceId, socketId, MUSMonitor.MODULE_DIM_ABILITY, "destroy", jSONObject, a.INSTANCE);
    }
}
