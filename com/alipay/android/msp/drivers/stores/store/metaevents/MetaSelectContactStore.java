package com.alipay.android.msp.drivers.stores.store.metaevents;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.core.callback.OnContactSelectCallback;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.drivers.actions.InvokeActionPlugin;
import com.alipay.android.msp.drivers.stores.store.LocalEventStore;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.alipay.android.msp.utils.Utils;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class MetaSelectContactStore extends LocalEventStore {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public MetaSelectContactStore(int i) {
        super(i);
    }

    @Override // com.alipay.android.msp.drivers.stores.store.LocalEventStore
    public String onMspAction(final EventAction eventAction, EventAction.MspEvent mspEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("719dcfee", new Object[]{this, eventAction, mspEvent});
        }
        if (this.f4584a == null || this.c == null || this.d == null) {
            return null;
        }
        JSONObject actionParamsJson = mspEvent.getActionParamsJson();
        if (actionParamsJson == null) {
            return "";
        }
        PhoneCashierMspEngine.getMspWallet().selectContact(actionParamsJson, new OnContactSelectCallback() { // from class: com.alipay.android.msp.drivers.stores.store.metaevents.MetaSelectContactStore.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alipay.android.msp.core.callback.OnContactSelectCallback
            public void onContactSelected(JSONArray jSONArray) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("2575eab", new Object[]{this, jSONArray});
                } else if (jSONArray == null) {
                } else {
                    Utils.sendToDocument(eventAction, jSONArray.toJSONString());
                }
            }
        });
        return InvokeActionPlugin.AYSNC_CALLBACK;
    }
}
