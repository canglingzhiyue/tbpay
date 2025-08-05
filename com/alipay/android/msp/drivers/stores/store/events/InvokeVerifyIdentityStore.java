package com.alipay.android.msp.drivers.stores.store.events;

import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.drivers.actions.InvokeActionPlugin;
import com.alipay.android.msp.drivers.stores.store.LocalEventStore;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class InvokeVerifyIdentityStore extends LocalEventStore {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public InvokeVerifyIdentityStore(int i) {
        super(i);
    }

    @Override // com.alipay.android.msp.drivers.stores.store.LocalEventStore
    public String onMspAction(EventAction eventAction, EventAction.MspEvent mspEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("719dcfee", new Object[]{this, eventAction, mspEvent});
        }
        if (this.c == null || this.c.getCurrentPresenter() == null || this.c.getCurrentPresenter().mo545getIView() == null) {
            return null;
        }
        JSONObject actionParamsJson = mspEvent.getActionParamsJson();
        try {
            if (actionParamsJson != null) {
                PhoneCashierMspEngine.getMspViSec().verifyIdentity(actionParamsJson, this.d, this.e, eventAction);
                return InvokeActionPlugin.AYSNC_CALLBACK;
            }
            LogUtil.record(1, "LocalPlugin:verifyIdentity", "param = null");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", (Object) "2000");
            return jSONObject.toJSONString();
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace(e);
            return "";
        }
    }
}
