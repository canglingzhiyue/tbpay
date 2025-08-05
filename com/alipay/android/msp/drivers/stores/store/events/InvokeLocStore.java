package com.alipay.android.msp.drivers.stores.store.events;

import android.text.TextUtils;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.drivers.actions.MspEventCreator;
import com.alipay.android.msp.drivers.stores.store.LocalEventStore;
import com.alipay.android.msp.ui.presenters.MspBasePresenter;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class InvokeLocStore extends LocalEventStore {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public InvokeLocStore(int i) {
        super(i);
    }

    @Override // com.alipay.android.msp.drivers.stores.store.LocalEventStore
    public String onMspAction(EventAction eventAction, EventAction.MspEvent mspEvent) {
        MspBasePresenter currentPresenter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("719dcfee", new Object[]{this, eventAction, mspEvent});
        }
        if (this.f4584a == null || this.c == null || this.c.getCurrentPresenter() == null || this.d == null || (currentPresenter = this.c.getCurrentPresenter()) == null || currentPresenter.mo545getIView() == null) {
            return null;
        }
        String handleAction = this.f4584a.getStoreCenter().handleAction(MspEventCreator.get().createMspEvent("InvokeLocStore", mspEvent.getActionParamsJson()));
        return TextUtils.isEmpty(handleAction) ? "{}" : handleAction;
    }
}
