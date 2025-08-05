package com.alipay.android.msp.drivers.stores.store.events;

import com.alipay.android.msp.core.frame.MspWindowFrameStack;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.drivers.stores.store.LocalEventStore;
import com.alipay.android.msp.framework.statisticsv2.model.StEvent;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.alipay.android.msp.ui.contracts.MspBaseContract;
import com.alipay.android.msp.ui.presenters.MspBasePresenter;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.android.msp.utils.edit.EditTextManager;
import com.alipay.android.msp.utils.edit.EditTextUtil;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class BackStore extends LocalEventStore {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public BackStore(int i) {
        super(i);
    }

    @Override // com.alipay.android.msp.drivers.stores.store.LocalEventStore
    public String onMspAction(EventAction eventAction, EventAction.MspEvent mspEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("719dcfee", new Object[]{this, eventAction, mspEvent});
        }
        if (this.f4584a != null && this.c != null) {
            MspWindowFrameStack frameStack = this.c.getFrameStack();
            MspBasePresenter currentPresenter = this.c.getCurrentPresenter();
            if (currentPresenter != null && frameStack != null) {
                try {
                    MspBaseContract.IView mo545getIView = currentPresenter.mo545getIView();
                    if (mo545getIView != null) {
                        mo545getIView.addMaskView();
                    }
                    if (frameStack.popTopWindowFrame(false, null)) {
                        this.f4584a.getStatisticInfo().addEvent(new StEvent("onBack", "native", "exit"));
                        this.f4584a.exit(0);
                        LogUtil.record(1, "BackStore:onMspAction", "checkpoint1:old", "");
                    }
                    EditTextUtil editTextUtils = EditTextManager.getEditTextUtils();
                    if (editTextUtils != null) {
                        editTextUtils.clear(this.e);
                    }
                    return "";
                } catch (Exception e) {
                    if (this.f4584a != null) {
                        this.f4584a.getStatisticInfo().addError(ErrorType.DEFAULT, e.getClass().getName(), e);
                    }
                    return null;
                }
            }
            LogUtil.record(4, "BackStore:onMspAction", "presenter is null");
        }
        return null;
    }
}
