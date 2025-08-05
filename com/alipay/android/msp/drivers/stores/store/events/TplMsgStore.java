package com.alipay.android.msp.drivers.stores.store.events;

import com.alipay.android.app.safepaylogv2.api.StatisticCollector;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.drivers.stores.store.LocalEventStore;
import com.alipay.android.msp.framework.dynfun.NativeDynFunManager;
import com.alipay.android.msp.framework.dynfun.TplMsg;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorCode;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class TplMsgStore extends LocalEventStore {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public TplMsgStore(int i) {
        super(i);
    }

    @Override // com.alipay.android.msp.drivers.stores.store.LocalEventStore
    public String onMspAction(EventAction eventAction, EventAction.MspEvent mspEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("719dcfee", new Object[]{this, eventAction, mspEvent});
        }
        if (!NativeDynFunManager.drmEnabled()) {
            return null;
        }
        try {
            NativeDynFunManager.recvMsg(TplMsg.fromJSON(mspEvent.getActionParamsJson()));
        } catch (Throwable th) {
            StatisticCollector.addError(StatisticCollector.GLOBAL_AGENT, ErrorType.WARNING, ErrorCode.DYN_FUN_RECV_EX, th);
            LogUtil.record(4, "TplMsgStore", "exception caught");
            LogUtil.printExceptionStackTrace(th);
        }
        return null;
    }
}
