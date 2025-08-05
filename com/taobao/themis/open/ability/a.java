package com.taobao.themis.open.ability;

import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.f;
import com.taobao.themis.open.ability.calendar.TMSCalendarBridge;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.kge;
import tb.qox;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eJ*\u0010\u000f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eJ2\u0010\u0010\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eJ2\u0010\u0012\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eJ<\u0010\u0013\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u00042\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/taobao/themis/open/ability/StorageMegaAbility;", "", "()V", RPCDataItems.SWITCH_TAG_LOG, "", "module", "namespace", com.taobao.android.weex_framework.util.a.ATOM_EXT_clear, "", "instance", "Lcom/taobao/themis/kernel/TMSInstance;", "traceId", "bizId", "callback", "Lcom/taobao/themis/kernel/ability/callback/AbilityCallback;", "getCurrentInfoAndKeys", "getItem", "key", "removeItem", "setItem", "value", "themis_open_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a INSTANCE;

    static {
        kge.a(560962833);
        INSTANCE = new a();
    }

    private a() {
    }

    public final void a(f instance, String str, String bizId, String key, String str2, qox callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea98366b", new Object[]{this, instance, str, bizId, key, str2, callback});
            return;
        }
        q.d(instance, "instance");
        q.d(bizId, "bizId");
        q.d(key, "key");
        q.d(callback, "callback");
        TMSLogger.b("StorageMegaAbility", "setItem: bidId: " + bizId + ", key: " + key + ", value: " + str2);
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put((JSONObject) "bizID", bizId);
        jSONObject2.put((JSONObject) "key", key);
        jSONObject2.put((JSONObject) "value", str2);
        com.taobao.themis.kernel.ability.a.a().a(instance, TMSCalendarBridge.namespace, str, null, "kvStorage", "setItem", jSONObject, callback);
    }

    public final void a(f instance, String str, String bizId, String key, qox callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3bb1361", new Object[]{this, instance, str, bizId, key, callback});
            return;
        }
        q.d(instance, "instance");
        q.d(bizId, "bizId");
        q.d(key, "key");
        q.d(callback, "callback");
        TMSLogger.b("StorageMegaAbility", "getItem: bizId: " + bizId + ", key: " + key);
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put((JSONObject) "bizID", bizId);
        jSONObject2.put((JSONObject) "key", key);
        com.taobao.themis.kernel.ability.a.a().a(instance, TMSCalendarBridge.namespace, str, null, "kvStorage", "getItem", jSONObject, callback);
    }

    public final void b(f instance, String str, String bizId, String key, qox callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c0153a2", new Object[]{this, instance, str, bizId, key, callback});
            return;
        }
        q.d(instance, "instance");
        q.d(bizId, "bizId");
        q.d(key, "key");
        q.d(callback, "callback");
        TMSLogger.b("StorageMegaAbility", "removeItem: bizId: " + bizId + ", key: " + key);
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put((JSONObject) "bizID", bizId);
        jSONObject2.put((JSONObject) "key", key);
        com.taobao.themis.kernel.ability.a.a().a(instance, TMSCalendarBridge.namespace, str, null, "kvStorage", "removeItem", jSONObject, callback);
    }

    public final void a(f instance, String str, String bizId, qox callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8cc61d7", new Object[]{this, instance, str, bizId, callback});
            return;
        }
        q.d(instance, "instance");
        q.d(bizId, "bizId");
        q.d(callback, "callback");
        TMSLogger.b("StorageMegaAbility", "clear: bizId: " + bizId);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "bizID", bizId);
        com.taobao.themis.kernel.ability.a.a().a(instance, TMSCalendarBridge.namespace, str, null, "kvStorage", com.taobao.android.weex_framework.util.a.ATOM_EXT_clear, jSONObject, callback);
    }

    public final void b(f instance, String str, String bizId, qox callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99ae058", new Object[]{this, instance, str, bizId, callback});
            return;
        }
        q.d(instance, "instance");
        q.d(bizId, "bizId");
        q.d(callback, "callback");
        TMSLogger.b("StorageMegaAbility", "getCurrentInfoAndKeys: bizId: " + bizId);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "bizID", bizId);
        com.taobao.themis.kernel.ability.a.a().a(instance, TMSCalendarBridge.namespace, str, null, "kvStorage", "getCurrentInfoAndKeys", jSONObject, callback);
    }
}
