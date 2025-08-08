package com.alipay.android.msp.drivers.stores.store.metaevents;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.drivers.stores.store.LocalEventStore;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class MetaMspLogErrorStore extends LocalEventStore {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public MetaMspLogErrorStore(int i) {
        super(i);
    }

    @Override // com.alipay.android.msp.drivers.stores.store.LocalEventStore
    public String onMspAction(EventAction eventAction, EventAction.MspEvent mspEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("719dcfee", new Object[]{this, eventAction, mspEvent});
        }
        if (this.f4584a == null || this.c == null) {
            return null;
        }
        JSONObject actionParamsJson = mspEvent.getActionParamsJson();
        if (actionParamsJson == null) {
            return "";
        }
        String string = actionParamsJson.getString("type");
        String string2 = actionParamsJson.getString("name");
        String string3 = actionParamsJson.getString("desc");
        if (StringUtils.isEmpty(string) || StringUtils.isEmpty(string2) || this.f4584a == null) {
            return "";
        }
        this.f4584a.getStatisticInfo().addError(string, string2, string3);
        return "";
    }
}
