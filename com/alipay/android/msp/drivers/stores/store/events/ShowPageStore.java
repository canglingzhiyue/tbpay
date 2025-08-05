package com.alipay.android.msp.drivers.stores.store.events;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.drivers.stores.store.LocalEventStore;
import com.alipay.android.msp.ui.presenters.MspBasePresenter;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class ShowPageStore extends LocalEventStore {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public ShowPageStore(int i) {
        super(i);
    }

    @Override // com.alipay.android.msp.drivers.stores.store.LocalEventStore
    public String onMspAction(EventAction eventAction, EventAction.MspEvent mspEvent) {
        MspBasePresenter currentPresenter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("719dcfee", new Object[]{this, eventAction, mspEvent});
        }
        JSONObject actionParamsJson = mspEvent.getActionParamsJson();
        if (this.c == null) {
            return null;
        }
        if (!actionParamsJson.containsKey("param")) {
            return "";
        }
        String string = actionParamsJson.getString("param");
        if (this.c != null && (currentPresenter = this.c.getCurrentPresenter()) != null && currentPresenter.mo545getIView() != null) {
            currentPresenter.mo545getIView().addMaskView();
        }
        try {
            if (this.c.getMspWindowFrameDispatcher().parseRendDataFromUIShow(JSON.parseObject(string), false, this.f)) {
                return "";
            }
            LogUtil.record(4, "ShowPageStore:onMspAction", "frame == null");
            return null;
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace(e);
            return "";
        }
    }
}
