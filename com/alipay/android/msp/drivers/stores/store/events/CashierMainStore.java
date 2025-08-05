package com.alipay.android.msp.drivers.stores.store.events;

import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.core.clients.MspUIClient;
import com.alipay.android.msp.core.clients.MspWindowClient;
import com.alipay.android.msp.drivers.actions.ActionsCreator;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.drivers.stores.store.LocalEventStore;
import com.alipay.android.msp.ui.presenters.MspBasePresenter;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class CashierMainStore extends LocalEventStore {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public CashierMainStore(int i) {
        super(i);
    }

    @Override // com.alipay.android.msp.drivers.stores.store.LocalEventStore
    public String onMspAction(EventAction eventAction, EventAction.MspEvent mspEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("719dcfee", new Object[]{this, eventAction, mspEvent});
        }
        if (this.f4584a == null) {
            return null;
        }
        MspUIClient mspUIClient = this.f4584a.getMspUIClient();
        if (mspUIClient != null) {
            MspBasePresenter currentPresenter = mspUIClient.getCurrentPresenter();
            if (currentPresenter != null && currentPresenter.mo545getIView() != null) {
                currentPresenter.mo545getIView().showLoadingView("");
            }
            if (mspUIClient instanceof MspWindowClient) {
                ((MspWindowClient) mspUIClient).setPreSubmitPageLoading(false);
            }
        }
        JSONObject actionParamsJson = mspEvent.getActionParamsJson();
        if (actionParamsJson != null) {
            ActionsCreator.get(this.f4584a).createUIRecoverAction("", actionParamsJson.getString("action"));
        } else {
            ActionsCreator.get(this.f4584a).createUIFirstAction();
        }
        return null;
    }
}
