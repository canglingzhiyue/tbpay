package com.alipay.android.msp.drivers.stores.store.events;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.drivers.stores.store.LocalEventStore;
import com.alipay.android.msp.ui.contracts.MspBaseContract;
import com.alipay.android.msp.ui.presenters.MspBasePresenter;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class ToastStore extends LocalEventStore {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public ToastStore(int i) {
        super(i);
    }

    @Override // com.alipay.android.msp.drivers.stores.store.LocalEventStore
    public String onMspAction(EventAction eventAction, EventAction.MspEvent mspEvent) {
        MspBasePresenter currentPresenter;
        MspBaseContract.IView mo545getIView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("719dcfee", new Object[]{this, eventAction, mspEvent});
        }
        if (this.f4584a == null || this.c == null || (currentPresenter = this.c.getCurrentPresenter()) == null || (mo545getIView = currentPresenter.mo545getIView()) == null) {
            return null;
        }
        try {
            JSONObject actionParamsJson = mspEvent.getActionParamsJson();
            String string = actionParamsJson.getString("msg");
            String string2 = actionParamsJson.getString("img");
            long longValue = actionParamsJson.getLongValue("time");
            if (StringUtils.isEmpty(string)) {
                return null;
            }
            mo545getIView.showToastView(string, string2, longValue);
            return "";
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
            return null;
        }
    }
}
