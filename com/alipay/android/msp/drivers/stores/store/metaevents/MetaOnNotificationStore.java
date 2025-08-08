package com.alipay.android.msp.drivers.stores.store.metaevents;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.drivers.actions.InvokeActionPlugin;
import com.alipay.android.msp.drivers.stores.store.LocalEventStore;
import com.alipay.android.msp.utils.BroadcastUtil;
import com.alipay.android.msp.utils.EventBusUtil;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.android.msp.utils.Utils;
import com.alipay.mobile.beehive.eventbus.EventBusManager;
import com.alipay.mobile.beehive.eventbus.IEventSubscriber;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public class MetaOnNotificationStore extends LocalEventStore {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final ConcurrentHashMap<String, String> g;

    public static /* synthetic */ Context a(MetaOnNotificationStore metaOnNotificationStore) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("d0c30d43", new Object[]{metaOnNotificationStore}) : metaOnNotificationStore.d;
    }

    public MetaOnNotificationStore(int i) {
        super(i);
        this.g = new ConcurrentHashMap<>();
    }

    @Override // com.alipay.android.msp.drivers.stores.store.LocalEventStore
    public String onMspAction(final EventAction eventAction, EventAction.MspEvent mspEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("719dcfee", new Object[]{this, eventAction, mspEvent});
        }
        if (this.f4584a == null || this.d == null) {
            return null;
        }
        JSONObject actionParamsJson = mspEvent.getActionParamsJson();
        if (actionParamsJson == null) {
            return "";
        }
        JSONObject jSONObject = new JSONObject();
        final String string = actionParamsJson.getString("name");
        if (StringUtils.isEmpty(string)) {
            jSONObject.put("message", (Object) "param name must not null");
            jSONObject.put("success", (Object) Boolean.FALSE);
            return jSONObject.toJSONString();
        }
        boolean onNotification = BroadcastUtil.onNotification(this.f4584a, this.d, string, new BroadcastReceiver() { // from class: com.alipay.android.msp.drivers.stores.store.metaevents.MetaOnNotificationStore.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                } else if (intent != null && MetaOnNotificationStore.a(MetaOnNotificationStore.this) != null && !StringUtils.isEmpty(string)) {
                    Bundle bundle = new Bundle();
                    try {
                        bundle = intent.getExtras();
                    } catch (Exception e) {
                        LogUtil.printExceptionStackTrace(e);
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    if (bundle != null) {
                        for (String str : bundle.keySet()) {
                            if (!MspGlobalDefine.NOTIFY_HASH_ID.equalsIgnoreCase(str)) {
                                try {
                                    jSONObject2.put(str, bundle.get(str));
                                } catch (Exception e2) {
                                    LogUtil.printExceptionStackTrace(e2);
                                }
                            }
                        }
                    }
                    MetaOnNotificationStore.a(MetaOnNotificationStore.this, eventAction, intent.getStringExtra(MspGlobalDefine.NOTIFY_HASH_ID), jSONObject2, "BroadCast");
                }
            }
        });
        boolean onNotification2 = EventBusUtil.onNotification(this.f4584a, this.d, string, new IEventSubscriber() { // from class: com.alipay.android.msp.drivers.stores.store.metaevents.MetaOnNotificationStore.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alipay.mobile.beehive.eventbus.IEventSubscriber
            public void onEvent(String str, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("c3897928", new Object[]{this, str, obj});
                } else if (StringUtils.isEmpty(str) || !(obj instanceof JSONObject)) {
                } else {
                    JSONObject jSONObject2 = (JSONObject) obj;
                    String str2 = null;
                    JSONObject jSONObject3 = new JSONObject(new LinkedHashMap(jSONObject2));
                    if (jSONObject2.containsKey(MspGlobalDefine.NOTIFY_HASH_ID)) {
                        str2 = jSONObject2.getString(MspGlobalDefine.NOTIFY_HASH_ID);
                        jSONObject3.remove(MspGlobalDefine.NOTIFY_HASH_ID);
                    }
                    MetaOnNotificationStore.a(MetaOnNotificationStore.this, eventAction, str2, jSONObject3, EventBusManager.TAG);
                }
            }
        });
        LogUtil.record(2, "OnNotificationStore:onAction", "register broadCast : " + onNotification + ", register eventBus : " + onNotification2);
        return InvokeActionPlugin.AYSNC_CALLBACK;
    }

    public static /* synthetic */ void a(MetaOnNotificationStore metaOnNotificationStore, EventAction eventAction, String str, JSONObject jSONObject, String str2) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1500a754", new Object[]{metaOnNotificationStore, eventAction, str, jSONObject, str2});
        } else if (eventAction == null) {
        } else {
            if (!StringUtils.isEmpty(str) && metaOnNotificationStore.g.containsKey(str)) {
                return;
            }
            if (!StringUtils.isEmpty(str)) {
                metaOnNotificationStore.g.put(str, str2);
            }
            try {
                str3 = jSONObject.toJSONString();
            } catch (Throwable unused) {
                str3 = "{}";
            }
            Utils.sendToDocument(eventAction, str3);
        }
    }
}
