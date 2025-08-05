package com.alipay.android.msp.drivers.stores.store.events;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.drivers.actions.ActionsCreator;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.drivers.stores.store.LocalEventStore;
import com.alipay.android.msp.ui.presenters.MspBasePresenter;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class BnvbStore extends LocalEventStore {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public BnvbStore(int i) {
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
        MspBasePresenter currentPresenter = this.c.getCurrentPresenter();
        if (currentPresenter != null && currentPresenter.mo545getIView() != null) {
            currentPresenter.mo545getIView().addMaskView();
        }
        try {
            JSONObject actionParamsJson = mspEvent.getActionParamsJson();
            if (actionParamsJson == null) {
                return "";
            }
            String string = actionParamsJson.getString("succNotifyName");
            String string2 = actionParamsJson.getString("failNotifyName");
            if (!TextUtils.isEmpty(string)) {
                this.c.setSuccNotifyName(string);
            }
            if (!TextUtils.isEmpty(string2)) {
                this.c.setFailNotifyName(string2);
            }
            ActionsCreator.get(this.f4584a).createUIShowAction(actionParamsJson, false, this.f);
            return "";
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace(e);
            return "";
        }
    }
}
