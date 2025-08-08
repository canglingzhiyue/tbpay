package com.alipay.android.msp.drivers.stores.store.events;

import mtopsdk.common.util.StringUtils;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.drivers.stores.store.LocalEventStore;
import com.alipay.android.msp.pay.results.MspPayResult;
import com.alipay.android.msp.utils.Utils;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class SetResultStore extends LocalEventStore {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public SetResultStore(int i) {
        super(i);
    }

    @Override // com.alipay.android.msp.drivers.stores.store.LocalEventStore
    public String onMspAction(EventAction eventAction, EventAction.MspEvent mspEvent) {
        MspPayResult mspPayResult;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("719dcfee", new Object[]{this, eventAction, mspEvent});
        }
        String[] actionParamsArray = mspEvent.getActionParamsArray();
        if (actionParamsArray == null || actionParamsArray.length < 3 || this.b == null || (mspPayResult = this.b.getMspPayResult()) == null) {
            return null;
        }
        mspPayResult.setEndCode(actionParamsArray[1]);
        mspPayResult.setMemo(actionParamsArray[0]);
        mspPayResult.setResult(!StringUtils.isEmpty(actionParamsArray[2]) ? Utils.urlDecode(actionParamsArray[2]) : "");
        return mspPayResult.toString();
    }
}
