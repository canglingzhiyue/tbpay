package com.taobao.themis.open.ability;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.fastjson.JSONObject;
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
import com.taobao.themis.kernel.utils.n;
import com.taobao.themis.kernel.utils.o;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.kge;
import tb.mto;
import tb.qox;
import tb.qoy;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0005¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\nH\u0007J\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\bH\u0002J2\u0010\r\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u00062\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\b2\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\nH\u0007J&\u0010\u000f\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\nH\u0007J\u0018\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\nH\u0002J\b\u0010\u0013\u001a\u00020\u0004H\u0016J\b\u0010\u0014\u001a\u00020\u0004H\u0016J2\u0010\u0015\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u00062\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\b2\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\nH\u0007J>\u0010\u0016\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u00062\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u00172\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\nH\u0007¨\u0006\u0019"}, d2 = {"Lcom/taobao/themis/open/ability/TMSStorageBridge;", "Lcom/taobao/themis/kernel/ability/base/TMSAbility;", "()V", "clearTinyLocalStorage", "", "apiContext", "Lcom/taobao/themis/kernel/ability/base/ApiContext;", "appXDomain", "", "bridgeCallback", "Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeCallback;", "getStorageId", "bizId", "getTinyLocalStorage", "key", "getTinyLocalStorageInfo", "handleMegaFail", "data", "Lcom/taobao/themis/kernel/ability/callback/AbilityResponse;", "onFinalized", "onInitialized", "removeTinyLocalStorage", "setTinyLocalStorage", "", "Companion", "themis_open_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class TMSStorageBridge implements com.taobao.themis.kernel.ability.base.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/taobao/themis/open/ability/TMSStorageBridge$clearTinyLocalStorage$1", "Lcom/taobao/themis/kernel/ability/callback/AbilityCallback;", "onCallback", "", "data", "Lcom/taobao/themis/kernel/ability/callback/AbilityResponse;", "keepCallback", "", "themis_open_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class b implements qox {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ BridgeCallback b;

        public b(BridgeCallback bridgeCallback) {
            this.b = bridgeCallback;
        }

        @Override // tb.qox
        public void a(qoy qoyVar, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7bdbcf97", new Object[]{this, qoyVar, new Boolean(z)});
            } else if (qoyVar == null) {
                TMSLogger.d("TMSStorageBridge", "clearTinyLocalStorage error,mega callback data is null");
                this.b.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
            } else {
                if (!qoyVar.d()) {
                    TMSStorageBridge.access$handleMegaFail(TMSStorageBridge.this, qoyVar, this.b);
                }
                this.b.sendBridgeResponse(BridgeResponse.SUCCESS);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/taobao/themis/open/ability/TMSStorageBridge$getTinyLocalStorage$1", "Lcom/taobao/themis/kernel/ability/callback/AbilityCallback;", "onCallback", "", "data", "Lcom/taobao/themis/kernel/ability/callback/AbilityResponse;", "keepCallback", "", "themis_open_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class c implements qox {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ BridgeCallback b;

        public c(BridgeCallback bridgeCallback) {
            this.b = bridgeCallback;
        }

        @Override // tb.qox
        public void a(qoy qoyVar, boolean z) {
            Object obj;
            Map<String, Object> innerMap;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7bdbcf97", new Object[]{this, qoyVar, new Boolean(z)});
            } else if (qoyVar == null) {
                TMSLogger.d("TMSStorageBridge", "getTinyLocalStorage error,mega callback data is null");
                this.b.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
            } else {
                if (!qoyVar.d()) {
                    TMSStorageBridge.access$handleMegaFail(TMSStorageBridge.this, qoyVar, this.b);
                }
                BridgeCallback bridgeCallback = this.b;
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = jSONObject;
                JSONObject a2 = qoyVar.a();
                String str = null;
                Object obj2 = (a2 == null || (innerMap = a2.getInnerMap()) == null) ? null : innerMap.get("data");
                if (!(obj2 instanceof Map)) {
                    obj2 = null;
                }
                Map map = (Map) obj2;
                if (map != null && (obj = map.get("result")) != null) {
                    str = obj.toString();
                }
                jSONObject2.put((JSONObject) "data", str);
                t tVar = t.INSTANCE;
                bridgeCallback.sendJSONResponse(jSONObject);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/taobao/themis/open/ability/TMSStorageBridge$getTinyLocalStorageInfo$1", "Lcom/taobao/themis/kernel/ability/callback/AbilityCallback;", "onCallback", "", "data", "Lcom/taobao/themis/kernel/ability/callback/AbilityResponse;", "keepCallback", "", "themis_open_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class d implements qox {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ BridgeCallback b;

        public d(BridgeCallback bridgeCallback) {
            this.b = bridgeCallback;
        }

        @Override // tb.qox
        public void a(qoy qoyVar, boolean z) {
            Map<String, Object> innerMap;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7bdbcf97", new Object[]{this, qoyVar, new Boolean(z)});
            } else if (qoyVar == null) {
                TMSLogger.d("TMSStorageBridge", "getTinyLocalStorageInfo error,mega callback data is null");
                this.b.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
            } else if (!qoyVar.d()) {
                TMSStorageBridge.access$handleMegaFail(TMSStorageBridge.this, qoyVar, this.b);
            } else {
                JSONObject a2 = qoyVar.a();
                Object obj = (a2 == null || (innerMap = a2.getInnerMap()) == null) ? null : innerMap.get("data");
                if (!(obj instanceof Map)) {
                    obj = null;
                }
                Map map = (Map) obj;
                if (map == null) {
                    this.b.sendBridgeResponse(new BridgeResponse.Error(1, "get sharedPreferences info error."));
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = jSONObject;
                jSONObject2.put((JSONObject) "keys", (String) map.get("keys"));
                Object obj2 = map.get("totalSize");
                if (!(obj2 instanceof Long)) {
                    obj2 = null;
                }
                Long l = (Long) obj2;
                long j = 0;
                long j2 = 1024;
                long longValue = (l != null ? l.longValue() : 0L) / j2;
                Object obj3 = map.get("freeSize");
                if (!(obj3 instanceof Long)) {
                    obj3 = null;
                }
                Long l2 = (Long) obj3;
                if (l2 != null) {
                    j = l2.longValue();
                }
                jSONObject2.put((JSONObject) "currentSize", (String) Long.valueOf(longValue - (j / j2)));
                jSONObject2.put((JSONObject) "limitSize", (String) Long.valueOf(longValue));
                TMSLogger.d("TMSStorageBridge", "getTinyLocalStorageInfo: " + jSONObject);
                this.b.sendJSONResponse(jSONObject);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/taobao/themis/open/ability/TMSStorageBridge$removeTinyLocalStorage$1", "Lcom/taobao/themis/kernel/ability/callback/AbilityCallback;", "onCallback", "", "data", "Lcom/taobao/themis/kernel/ability/callback/AbilityResponse;", "keepCallback", "", "themis_open_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class e implements qox {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ BridgeCallback b;

        public e(BridgeCallback bridgeCallback) {
            this.b = bridgeCallback;
        }

        @Override // tb.qox
        public void a(qoy qoyVar, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7bdbcf97", new Object[]{this, qoyVar, new Boolean(z)});
            } else if (qoyVar == null) {
                TMSLogger.d("TMSStorageBridge", "removeTinyLocalStorage error,mega callback data is null");
                this.b.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
            } else {
                if (!qoyVar.d()) {
                    TMSStorageBridge.access$handleMegaFail(TMSStorageBridge.this, qoyVar, this.b);
                }
                this.b.sendBridgeResponse(BridgeResponse.SUCCESS);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/taobao/themis/open/ability/TMSStorageBridge$setTinyLocalStorage$1", "Lcom/taobao/themis/kernel/ability/callback/AbilityCallback;", "onCallback", "", "data", "Lcom/taobao/themis/kernel/ability/callback/AbilityResponse;", "keepCallback", "", "themis_open_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class f implements qox {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ BridgeCallback b;

        public f(BridgeCallback bridgeCallback) {
            this.b = bridgeCallback;
        }

        @Override // tb.qox
        public void a(qoy qoyVar, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7bdbcf97", new Object[]{this, qoyVar, new Boolean(z)});
            } else if (qoyVar == null) {
                TMSLogger.d("TMSStorageBridge", "setTinyLocalStorage error,mega callback data is null");
                this.b.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
            } else {
                if (!qoyVar.d()) {
                    TMSStorageBridge.access$handleMegaFail(TMSStorageBridge.this, qoyVar, this.b);
                }
                this.b.sendBridgeResponse(BridgeResponse.SUCCESS);
            }
        }
    }

    static {
        kge.a(-166976994);
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

    public static final /* synthetic */ void access$handleMegaFail(TMSStorageBridge tMSStorageBridge, qoy qoyVar, BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfef55a3", new Object[]{tMSStorageBridge, qoyVar, bridgeCallback});
        } else {
            tMSStorageBridge.a(qoyVar, bridgeCallback);
        }
    }

    @ThreadType(ExecutorType.IO)
    @APIMethod
    public final void setTinyLocalStorage(@BindingApiContext ApiContext apiContext, @BindingParam(name = {"key"}) String str, @BindingParam(name = {"data"}) Object obj, @BindingParam(name = {"__appxDomain"}) String appXDomain, @BindingCallback BridgeCallback bridgeCallback) {
        String jSONString;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2be33496", new Object[]{this, apiContext, str, obj, appXDomain, bridgeCallback});
            return;
        }
        q.d(apiContext, "apiContext");
        q.d(appXDomain, "appXDomain");
        q.d(bridgeCallback, "bridgeCallback");
        com.taobao.themis.kernel.f c2 = apiContext.c();
        if (!(c2 instanceof com.taobao.themis.kernel.f)) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
            TMSLogger.d("TMSStorageBridge", "setTinyLocalStorage error, instance is not a TMSInstance");
            return;
        }
        String str2 = str;
        if (str2 == null || str2.length() == 0) {
            bridgeCallback.sendBridgeResponse(new BridgeResponse.Error(2, "Key不能为空"));
            return;
        }
        if (obj instanceof String) {
            jSONString = (String) obj;
        } else {
            jSONString = obj instanceof JSONObject ? ((JSONObject) obj).toJSONString() : null;
        }
        String str3 = jSONString;
        String str4 = str3;
        if (str4 == null || str4.length() == 0) {
            bridgeCallback.sendBridgeResponse(new BridgeResponse.Error(11, "未找到该数据"));
            return;
        }
        Activity o = c2.o();
        q.b(o, "instance.activity");
        Activity activity = o;
        String e2 = o.e(c2);
        if (e2.length() == 0) {
            z = true;
        }
        if (z) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
            TMSLogger.d("TMSStorageBridge", "setTinyLocalStorage error, user id is null or empty");
            return;
        }
        String a2 = a(appXDomain, e2);
        if (n.ac()) {
            com.taobao.themis.open.ability.a.INSTANCE.a(c2, apiContext.f(), e2, str, str3, new f(bridgeCallback));
            return;
        }
        SharedPreferences a3 = a.a(Companion, activity, a2);
        if (a3 == null) {
            bridgeCallback.sendBridgeResponse(new BridgeResponse.Error(11, "未找到该数据"));
            return;
        }
        a3.edit().putString(str, str3).commit();
        bridgeCallback.sendBridgeResponse(BridgeResponse.SUCCESS);
    }

    @ThreadType(ExecutorType.IO)
    @APIMethod
    public final void getTinyLocalStorage(@BindingApiContext ApiContext apiContext, @BindingParam(name = {"key"}) String str, @BindingParam(name = {"__appxDomain"}) String appXDomain, @BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5878107e", new Object[]{this, apiContext, str, appXDomain, bridgeCallback});
            return;
        }
        q.d(apiContext, "apiContext");
        q.d(appXDomain, "appXDomain");
        q.d(bridgeCallback, "bridgeCallback");
        com.taobao.themis.kernel.f c2 = apiContext.c();
        if (!(c2 instanceof com.taobao.themis.kernel.f)) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
            TMSLogger.d("TMSStorageBridge", "getTinyLocalStorage error, instance is not a TMSInstance");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        Activity o = c2.o();
        q.b(o, "instance.activity");
        Activity activity = o;
        String e2 = o.e(c2);
        if (e2.length() == 0) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
            TMSLogger.d("TMSStorageBridge", "setTinyLocalStorage error, user id is null or empty");
            return;
        }
        String str2 = str;
        if (str2 != null && str2.length() != 0) {
            z = false;
        }
        if (z) {
            bridgeCallback.sendBridgeResponse(new BridgeResponse.Error(2, "Key不能为空"));
            return;
        }
        String a2 = a(appXDomain, e2);
        if (n.ac()) {
            com.taobao.themis.open.ability.a.INSTANCE.a(c2, apiContext.f(), e2, str, new c(bridgeCallback));
            return;
        }
        SharedPreferences a3 = a.a(Companion, activity, a2);
        if (a3 == null) {
            bridgeCallback.sendBridgeResponse(new BridgeResponse.Error(11, "未找到该数据"));
        } else if (a3.contains(str)) {
            jSONObject.put((JSONObject) "data", a3.getString(str, ""));
            bridgeCallback.sendJSONResponse(jSONObject);
        } else {
            jSONObject.put((JSONObject) "data", "");
            bridgeCallback.sendJSONResponse(jSONObject);
        }
    }

    @ThreadType(ExecutorType.IO)
    @APIMethod
    public final void removeTinyLocalStorage(@BindingApiContext ApiContext apiContext, @BindingParam(name = {"key"}) String str, @BindingParam(name = {"__appxDomain"}) String appXDomain, @BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa0d3310", new Object[]{this, apiContext, str, appXDomain, bridgeCallback});
            return;
        }
        q.d(apiContext, "apiContext");
        q.d(appXDomain, "appXDomain");
        q.d(bridgeCallback, "bridgeCallback");
        com.taobao.themis.kernel.f c2 = apiContext.c();
        if (!(c2 instanceof com.taobao.themis.kernel.f)) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
            TMSLogger.d("TMSStorageBridge", "removeTinyLocalStorage error, instance is not a TMSInstance");
            return;
        }
        Activity o = c2.o();
        q.b(o, "instance.activity");
        Activity activity = o;
        String e2 = o.e(c2);
        if (e2.length() == 0) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
            TMSLogger.d("TMSStorageBridge", "setTinyLocalStorage error, user id is null or empty");
            return;
        }
        String a2 = a(appXDomain, e2);
        String str2 = str;
        if (str2 != null && str2.length() != 0) {
            z = false;
        }
        if (z) {
            bridgeCallback.sendBridgeResponse(new BridgeResponse.Error(2, "Key不能为空"));
        } else if (n.ac()) {
            com.taobao.themis.open.ability.a.INSTANCE.b(c2, apiContext.f(), e2, str, new e(bridgeCallback));
        } else {
            SharedPreferences a3 = a.a(Companion, activity, a2);
            if (a3 == null) {
                bridgeCallback.sendBridgeResponse(new BridgeResponse.Error(11, "未找到该数据"));
                return;
            }
            a3.edit().remove(str).commit();
            bridgeCallback.sendBridgeResponse(BridgeResponse.SUCCESS);
        }
    }

    @ThreadType(ExecutorType.IO)
    @APIMethod
    public final void clearTinyLocalStorage(@BindingApiContext ApiContext apiContext, @BindingParam(name = {"__appxDomain"}) String appXDomain, @BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22be69b1", new Object[]{this, apiContext, appXDomain, bridgeCallback});
            return;
        }
        q.d(apiContext, "apiContext");
        q.d(appXDomain, "appXDomain");
        q.d(bridgeCallback, "bridgeCallback");
        com.taobao.themis.kernel.f c2 = apiContext.c();
        if (!(c2 instanceof com.taobao.themis.kernel.f)) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
            TMSLogger.d("TMSStorageBridge", "clearTinyLocalStorage error, instance is not a TMSInstance");
            return;
        }
        Activity o = c2.o();
        q.b(o, "instance.activity");
        Activity activity = o;
        String e2 = o.e(c2);
        if (e2.length() != 0) {
            z = false;
        }
        if (z) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
            TMSLogger.d("TMSStorageBridge", "setTinyLocalStorage error, user id is null or empty");
            return;
        }
        String a2 = a(appXDomain, e2);
        if (n.ac()) {
            com.taobao.themis.open.ability.a.INSTANCE.a(c2, apiContext.f(), e2, new b(bridgeCallback));
            return;
        }
        SharedPreferences a3 = a.a(Companion, activity, a2);
        if (a3 != null) {
            a3.edit().clear().commit();
            bridgeCallback.sendBridgeResponse(BridgeResponse.SUCCESS);
            return;
        }
        bridgeCallback.sendBridgeResponse(new BridgeResponse.Error(11, "未找到该数据"));
    }

    @ThreadType(ExecutorType.IO)
    @APIMethod
    public final void getTinyLocalStorageInfo(@BindingApiContext ApiContext apiContext, @BindingParam(name = {"__appxDomain"}) String appXDomain, @BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67ea8cfa", new Object[]{this, apiContext, appXDomain, bridgeCallback});
            return;
        }
        q.d(apiContext, "apiContext");
        q.d(appXDomain, "appXDomain");
        q.d(bridgeCallback, "bridgeCallback");
        com.taobao.themis.kernel.f c2 = apiContext.c();
        if (!(c2 instanceof com.taobao.themis.kernel.f)) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
            TMSLogger.d("TMSStorageBridge", "getTinyLocalStorageInfo error, instance is not a TMSInstance");
            return;
        }
        Activity o = c2.o();
        q.b(o, "instance.activity");
        Activity activity = o;
        String e2 = o.e(c2);
        if (e2.length() == 0) {
            z = true;
        }
        if (z) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
            TMSLogger.d("TMSStorageBridge", "setTinyLocalStorage error, user id is null or empty");
            return;
        }
        String a2 = a(appXDomain, e2);
        if (n.ac()) {
            com.taobao.themis.open.ability.a.INSTANCE.b(c2, apiContext.f(), e2, new d(bridgeCallback));
            return;
        }
        JSONObject a3 = Companion.a(activity, a2);
        if (a3 != null) {
            bridgeCallback.sendJSONResponse(a3);
        } else {
            bridgeCallback.sendBridgeResponse(new BridgeResponse.Error(1, "get sharedPreferences info error."));
        }
    }

    private final String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{this, str, str2});
        }
        if (!com.taobao.themis.utils.f.e(str)) {
            return str2;
        }
        return str2 + "_plugin_" + str;
    }

    private final void a(qoy qoyVar, BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("146f78bf", new Object[]{this, qoyVar, bridgeCallback});
            return;
        }
        try {
            JSONObject a2 = qoyVar.a();
            JSONObject jSONObject = a2 != null ? a2.getJSONObject("errorMessage") : null;
            if (jSONObject == null) {
                TMSLogger.d("TMSStorageBridge", "mega fail! no error message");
                bridgeCallback.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
                return;
            }
            int intValue = jSONObject.getIntValue("statusCode");
            String string = jSONObject.getString("code");
            String string2 = jSONObject.getString("msg");
            if (string2 == null) {
                string2 = "";
            }
            bridgeCallback.sendBridgeResponse(BridgeResponse.newError(intValue, string + " ," + string2));
            TMSLogger.d("TMSStorageBridge", "mega fail! statusCode:" + intValue + ", code:" + string + " msg:" + string2);
        } catch (Throwable th) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
            TMSLogger.b("TMSStorageBridge", th.getMessage(), th);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0006J\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\r\u001a\u00020\u0006H\u0002J\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/taobao/themis/open/ability/TMSStorageBridge$Companion;", "", "()V", "AR_LOCAL_STORAGE_LIMIT", "", "KEY_NULL", "", "NOT_FOUND", RPCDataItems.SWITCH_TAG_LOG, "copySpToMega", "", "instance", "Lcom/taobao/themis/kernel/TMSInstance;", "appId", "getSharedPreferenceForApp", "Landroid/content/SharedPreferences;", "context", "Landroid/content/Context;", "getSharedPreferenceInfo", "Lcom/alibaba/fastjson/JSONObject;", "themis_open_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Lcom/taobao/themis/kernel/ability/callback/AbilityResponse;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onCallback"}, k = 3, mv = {1, 4, 1})
        /* renamed from: com.taobao.themis.open.ability.TMSStorageBridge$a$a  reason: collision with other inner class name */
        /* loaded from: classes9.dex */
        public static final class C0952a implements qox {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public static final C0952a INSTANCE = new C0952a();

            @Override // tb.qox
            public final void a(qoy qoyVar, boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("7bdbcf97", new Object[]{this, qoyVar, new Boolean(z)});
                }
            }
        }

        static {
            kge.a(656834534);
        }

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.o oVar) {
            this();
        }

        public static final /* synthetic */ SharedPreferences a(a aVar, Context context, String str) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (SharedPreferences) ipChange.ipc$dispatch("4db3ebc8", new Object[]{aVar, context, str}) : aVar.b(context, str);
        }

        public final void a(com.taobao.themis.kernel.f instance, String appId) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f67562b7", new Object[]{this, instance, appId});
                return;
            }
            q.d(instance, "instance");
            q.d(appId, "appId");
            SharedPreferences b = b(instance.o(), "themis_" + appId);
            if (b == null || q.a((Object) b.getString("Themis_COPY_SP_TO_MEGA", "false"), (Object) "true")) {
                return;
            }
            TMSLogger.d("TMSStorageBridge", "copySpToMega start");
            Map<String, ?> all = b.getAll();
            q.b(all, "sp.all");
            for (Map.Entry<String, ?> entry : all.entrySet()) {
                TMSLogger.b("TMSStorageBridge", "copySpToMega key: " + entry.getKey() + ", value: " + entry.getValue());
                com.taobao.themis.open.ability.a aVar = com.taobao.themis.open.ability.a.INSTANCE;
                String key = entry.getKey();
                q.b(key, "entry.key");
                String str = key;
                Object value = entry.getValue();
                aVar.a(instance, null, appId, str, value != null ? value.toString() : null, C0952a.INSTANCE);
            }
            b.edit().putString("Themis_COPY_SP_TO_MEGA", "true").apply();
        }

        public final JSONObject a(Context context, String appId) {
            int i;
            Charset forName;
            Charset forName2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("2901b94a", new Object[]{this, context, appId});
            }
            q.d(context, "context");
            q.d(appId, "appId");
            SharedPreferences b = b(context, appId);
            if (b == null) {
                return null;
            }
            JSONObject jSONObject = new JSONObject();
            Map<String, ?> all = b.getAll();
            if (all == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String?>");
            }
            double d = mto.a.GEO_NOT_SUPPORT;
            for (Map.Entry<String, ?> entry : all.entrySet()) {
                String key = entry.getKey();
                String str = (String) entry.getValue();
                try {
                    q.a((Object) str);
                    forName = Charset.forName("utf-8");
                    q.b(forName, "Charset.forName(charsetName)");
                } catch (UnsupportedEncodingException e) {
                    e = e;
                    i = 0;
                }
                if (str == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    break;
                }
                byte[] bytes = str.getBytes(forName);
                q.b(bytes, "(this as java.lang.String).getBytes(charset)");
                i = bytes.length + 0;
                try {
                    forName2 = Charset.forName("utf-8");
                    q.b(forName2, "Charset.forName(charsetName)");
                } catch (UnsupportedEncodingException e2) {
                    e = e2;
                    TMSLogger.b("TMSStorageBridge", e.getMessage(), e);
                    d += i;
                }
                if (key == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    break;
                }
                byte[] bytes2 = key.getBytes(forName2);
                q.b(bytes2, "(this as java.lang.String).getBytes(charset)");
                i += bytes2.length;
                d += i;
            }
            JSONObject jSONObject2 = jSONObject;
            jSONObject2.put((JSONObject) "keys", (String) all.keySet());
            jSONObject2.put((JSONObject) "currentSize", (String) Double.valueOf(d / 1024));
            jSONObject2.put((JSONObject) "limitSize", (String) 5120L);
            return jSONObject;
        }

        private final SharedPreferences b(Context context, String str) {
            Context applicationContext;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SharedPreferences) ipChange.ipc$dispatch("969b469d", new Object[]{this, context, str});
            }
            if (context == null || (applicationContext = context.getApplicationContext()) == null) {
                return null;
            }
            return applicationContext.getSharedPreferences("rv_local_storage_" + str, 0);
        }
    }
}
