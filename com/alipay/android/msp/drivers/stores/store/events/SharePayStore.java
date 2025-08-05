package com.alipay.android.msp.drivers.stores.store.events;

import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.alipay.android.msp.core.context.MspContext;
import com.alipay.android.msp.core.context.MspTradeContext;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.drivers.stores.store.LocalEventStore;
import com.alipay.android.msp.framework.taskscheduler.TaskHelper;
import com.alipay.android.msp.ui.widget.MspSharePayDialog;
import com.alipay.android.msp.utils.EventLogUtil;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class SharePayStore extends LocalEventStore {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ MspContext a(SharePayStore sharePayStore) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MspContext) ipChange.ipc$dispatch("8d60b722", new Object[]{sharePayStore}) : sharePayStore.f4584a;
    }

    public static /* synthetic */ MspContext b(SharePayStore sharePayStore) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MspContext) ipChange.ipc$dispatch("d677bdc1", new Object[]{sharePayStore}) : sharePayStore.f4584a;
    }

    public static /* synthetic */ MspTradeContext c(SharePayStore sharePayStore) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MspTradeContext) ipChange.ipc$dispatch("6fed467c", new Object[]{sharePayStore}) : sharePayStore.b;
    }

    public SharePayStore(int i) {
        super(i);
    }

    @Override // com.alipay.android.msp.drivers.stores.store.LocalEventStore
    public String onMspAction(EventAction eventAction, EventAction.MspEvent mspEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("719dcfee", new Object[]{this, eventAction, mspEvent});
        }
        if (this.f4584a != null && this.c != null) {
            EventLogUtil.logPayEvent("1010970", "value", "sharepay_plugin");
            final JSONObject actionParamsJson = mspEvent.getActionParamsJson();
            TaskHelper.runOnUIThread(new Runnable() { // from class: com.alipay.android.msp.drivers.stores.store.events.SharePayStore.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    JSONObject jSONObject = actionParamsJson;
                    if (jSONObject == null) {
                        return;
                    }
                    jSONObject.put(MspGlobalDefine.SESSION, (Object) SharePayStore.a(SharePayStore.this).getGlobalSession());
                    MspSharePayDialog.processSdk(SharePayStore.b(SharePayStore.this).getContext(), actionParamsJson, SharePayStore.c(SharePayStore.this));
                }
            });
        }
        return null;
    }
}
