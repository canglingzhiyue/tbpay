package com.alipay.android.msp.drivers.stores.store.events;

import com.alipay.android.msp.core.frame.MspWindowFrameStack;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.drivers.stores.store.LocalEventStore;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.alipay.android.msp.ui.presenters.MspBasePresenter;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class DestroyStore extends LocalEventStore {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public DestroyStore(int i) {
        super(i);
    }

    @Override // com.alipay.android.msp.drivers.stores.store.LocalEventStore
    public String onMspAction(EventAction eventAction, EventAction.MspEvent mspEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("719dcfee", new Object[]{this, eventAction, mspEvent});
        }
        if (this.c == null) {
            return "";
        }
        MspWindowFrameStack frameStack = this.c.getFrameStack();
        try {
            String[] actionParamsArray = mspEvent.getActionParamsArray();
            if (actionParamsArray != null && actionParamsArray.length > 0) {
                MspBasePresenter currentPresenter = this.c.getCurrentPresenter();
                if (currentPresenter != null && currentPresenter.mo545getIView() != null) {
                    currentPresenter.mo545getIView().addMaskView();
                }
                boolean popTopWindowFrame = frameStack != null ? frameStack.popTopWindowFrame(true, actionParamsArray[0]) : false;
                LogUtil.d("DestroyStore", "onMspAction", actionParamsArray[0] + " result=" + popTopWindowFrame);
            }
        } catch (Exception e) {
            if (this.f4584a != null) {
                this.f4584a.getStatisticInfo().addError(ErrorType.DEFAULT, e.getClass().getName(), e);
            }
        }
        return "";
    }
}
