package com.alipay.android.msp.drivers.stores.store.metaevents;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.drivers.stores.store.LocalEventStore;
import com.alipay.android.msp.utils.BroadcastUtil;
import com.alipay.android.msp.utils.EventBusUtil;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class MetaOffNotificationStore extends LocalEventStore {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public MetaOffNotificationStore(int i) {
        super(i);
    }

    @Override // com.alipay.android.msp.drivers.stores.store.LocalEventStore
    public String onMspAction(EventAction eventAction, EventAction.MspEvent mspEvent) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("719dcfee", new Object[]{this, eventAction, mspEvent});
        }
        if (this.f4584a == null || this.c == null || this.d == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        String string = mspEvent.getActionParamsJson().getString("name");
        if (TextUtils.isEmpty(string)) {
            jSONObject.put("message", (Object) "param name must not null");
            jSONObject.put("success", (Object) Boolean.FALSE);
            return jSONObject.toJSONString();
        }
        boolean offNotification = BroadcastUtil.offNotification(this.f4584a, this.d, string);
        boolean offNotification2 = EventBusUtil.offNotification(this.f4584a, this.d, string);
        LogUtil.record(2, "OffNotificationStore:onAction", "off broadCast : " + offNotification + ", off eventBus : " + offNotification2);
        if (!offNotification || !offNotification2) {
            z = false;
        }
        jSONObject.put("success", (Object) Boolean.valueOf(z));
        return jSONObject.toJSONString();
    }
}
