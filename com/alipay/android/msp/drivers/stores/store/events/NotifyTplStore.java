package com.alipay.android.msp.drivers.stores.store.events;

import com.alipay.android.msp.constants.MspGlobalDefine;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.drivers.stores.store.LocalEventStore;
import com.alipay.android.msp.framework.helper.GlobalHelper;
import com.alipay.mobile.beehive.eventbus.EventBusManager;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class NotifyTplStore extends LocalEventStore {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public NotifyTplStore(int i) {
        super(i);
    }

    @Override // com.alipay.android.msp.drivers.stores.store.LocalEventStore
    public String onMspAction(EventAction eventAction, EventAction.MspEvent mspEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("719dcfee", new Object[]{this, eventAction, mspEvent});
        }
        if (this.d == null) {
            this.d = GlobalHelper.getInstance().getContext();
        }
        EventBusManager.getInstance().post(mspEvent.getActionParamsJson(), MspGlobalDefine.EVENT_NOTIFY_TPL);
        return "";
    }
}
