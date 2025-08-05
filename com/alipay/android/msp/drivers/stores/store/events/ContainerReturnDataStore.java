package com.alipay.android.msp.drivers.stores.store.events;

import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.core.context.MspContainerContext;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.drivers.stores.store.LocalEventStore;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class ContainerReturnDataStore extends LocalEventStore {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public ContainerReturnDataStore(int i) {
        super(i);
    }

    @Override // com.alipay.android.msp.drivers.stores.store.LocalEventStore
    public String onMspAction(EventAction eventAction, EventAction.MspEvent mspEvent) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("719dcfee", new Object[]{this, eventAction, mspEvent});
        }
        try {
            jSONObject = mspEvent.getActionParamsJson();
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace(e);
            jSONObject = null;
        }
        if (jSONObject == null) {
            return null;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("bizResult");
        boolean booleanValue = jSONObject.getBooleanValue("doNotExit");
        try {
            if ((this.f4584a instanceof MspContainerContext) && jSONObject2 != null) {
                ((MspContainerContext) this.f4584a).getMspContainerClient().getMspContainerResult().setBizResult(jSONObject2.toJSONString());
            }
        } catch (Exception e2) {
            LogUtil.printExceptionStackTrace(e2);
        }
        if (!booleanValue && this.f4584a != null) {
            this.f4584a.exit(0);
        }
        return jSONObject.toJSONString();
    }
}
