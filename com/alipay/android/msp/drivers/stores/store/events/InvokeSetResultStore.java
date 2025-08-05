package com.alipay.android.msp.drivers.stores.store.events;

import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.container.MspContainerClient;
import com.alipay.android.msp.core.context.MspContainerContext;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.drivers.stores.store.LocalEventStore;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class InvokeSetResultStore extends LocalEventStore {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public InvokeSetResultStore(int i) {
        super(i);
    }

    @Override // com.alipay.android.msp.drivers.stores.store.LocalEventStore
    public String onMspAction(EventAction eventAction, EventAction.MspEvent mspEvent) {
        Boolean bool;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("719dcfee", new Object[]{this, eventAction, mspEvent});
        }
        if (this.c == null || this.c.getCurrentPresenter() == null || this.c.getCurrentPresenter().mo545getIView() == null) {
            return null;
        }
        if (mspEvent.getActionParamsJson() == null) {
            return "";
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject actionParamsJson = mspEvent.getActionParamsJson();
        if (actionParamsJson == null) {
            return "";
        }
        if (this.f4584a instanceof MspContainerContext) {
            MspContainerClient mspContainerClient = ((MspContainerContext) this.f4584a).getMspContainerClient();
            if (mspContainerClient != null && mspContainerClient.getMspContainerResult() != null) {
                mspContainerClient.getMspContainerResult().setBizResult(actionParamsJson.toJSONString());
            }
            bool = Boolean.TRUE;
        } else {
            bool = Boolean.FALSE;
        }
        jSONObject.put("success", (Object) bool);
        LogUtil.record(1, "InvokeSetResultStore:setBizResult", "res=" + jSONObject.toJSONString());
        return jSONObject.toJSONString();
    }
}
