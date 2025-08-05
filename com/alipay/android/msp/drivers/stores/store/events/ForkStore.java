package com.alipay.android.msp.drivers.stores.store.events;

import com.alibaba.ariver.kernel.RVConstants;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.core.MspEngine;
import com.alipay.android.msp.core.context.MspContext;
import com.alipay.android.msp.core.context.MspTradeContext;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.drivers.stores.store.LocalEventStore;
import com.alipay.android.msp.framework.taskscheduler.TaskHelper;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.net.URLEncoder;
import mtopsdk.ssrcore.util.SsrLoginOption;

/* loaded from: classes3.dex */
public class ForkStore extends LocalEventStore {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ MspContext a(ForkStore forkStore) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MspContext) ipChange.ipc$dispatch("74a49189", new Object[]{forkStore}) : forkStore.f4584a;
    }

    public static /* synthetic */ MspTradeContext b(ForkStore forkStore) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MspTradeContext) ipChange.ipc$dispatch("f1301834", new Object[]{forkStore}) : forkStore.b;
    }

    public ForkStore(int i) {
        super(i);
    }

    @Override // com.alipay.android.msp.drivers.stores.store.LocalEventStore
    public String onMspAction(EventAction eventAction, EventAction.MspEvent mspEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("719dcfee", new Object[]{this, eventAction, mspEvent});
        }
        final int i = ~this.e;
        String str = "false";
        try {
            JSONObject actionParamsJson = mspEvent.getActionParamsJson();
            JSONObject jSONObject = actionParamsJson.getJSONObject("action");
            if (jSONObject == null) {
                return null;
            }
            String encode = URLEncoder.encode(jSONObject.toJSONString(), "UTF-8");
            try {
                if (actionParamsJson.containsKey(RVConstants.EXTRA_START_PARAMS)) {
                    str = actionParamsJson.getJSONObject(RVConstants.EXTRA_START_PARAMS).getString(SsrLoginOption.SILENT);
                }
            } catch (Exception e) {
                LogUtil.printExceptionStackTrace(e);
            }
            final String str2 = "msp_bg_opaque=\"1\"&msp_fork_action=\"" + encode + "\"&msp_silent=\"" + str + "\"";
            TaskHelper.execute(new Runnable() { // from class: com.alipay.android.msp.drivers.stores.store.events.ForkStore.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        MspEngine.startForkCashier(str2, i, ForkStore.a(ForkStore.this), ForkStore.b(ForkStore.this));
                    } catch (Throwable th) {
                        LogUtil.printExceptionStackTrace(th);
                    }
                }
            });
            return "";
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
            return null;
        }
    }
}
