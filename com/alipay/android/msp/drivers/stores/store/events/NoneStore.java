package com.alipay.android.msp.drivers.stores.store.events;

import com.alipay.android.msp.core.context.MspContext;
import com.alipay.android.msp.core.frame.MspWindowFrameStack;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.drivers.stores.store.LocalEventStore;
import com.alipay.android.msp.framework.taskscheduler.TaskHelper;
import com.alipay.android.msp.ui.contracts.MspBaseContract;
import com.alipay.android.msp.ui.presenters.MspBasePresenter;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.util.a;

/* loaded from: classes3.dex */
public class NoneStore extends LocalEventStore {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ MspContext a(NoneStore noneStore) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MspContext) ipChange.ipc$dispatch("5cbce253", new Object[]{noneStore}) : noneStore.f4584a;
    }

    public NoneStore(int i) {
        super(i);
    }

    @Override // com.alipay.android.msp.drivers.stores.store.LocalEventStore
    public String onMspAction(EventAction eventAction, EventAction.MspEvent mspEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("719dcfee", new Object[]{this, eventAction, mspEvent});
        }
        if (this.f4584a == null) {
            return "";
        }
        try {
            LogUtil.record(1, "NoneStore:onMspAction", "startPay");
            if (this.c != null) {
                MspBasePresenter currentPresenter = this.c.getCurrentPresenter();
                MspWindowFrameStack frameStack = this.c.getFrameStack();
                if (currentPresenter != null && frameStack != null) {
                    MspBaseContract.IView mo545getIView = currentPresenter.mo545getIView();
                    if (mo545getIView != null) {
                        LogUtil.record(1, "NoneStore:onMspAction", a.ATOM_do);
                        mo545getIView.removeMaskView();
                    }
                    if (frameStack.getTopTplOrNativeFrame() == null) {
                        TaskHelper.execute(new Runnable() { // from class: com.alipay.android.msp.drivers.stores.store.events.NoneStore.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                } else {
                                    NoneStore.a(NoneStore.this).exit(0);
                                }
                            }
                        }, 100L);
                    }
                }
            }
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace(e);
        }
        return "";
    }
}
