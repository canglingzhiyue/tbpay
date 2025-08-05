package com.alipay.android.msp.drivers.stores.store.events;

import android.app.Activity;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.alipay.android.msp.core.context.MspContext;
import com.alipay.android.msp.core.context.MspTradeContext;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.drivers.stores.store.LocalEventStore;
import com.alipay.android.msp.ui.presenters.MspBasePresenter;
import com.alipay.android.msp.ui.widget.MspSharePayDialog;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class SharePaySelStore extends LocalEventStore {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ MspContext a(SharePaySelStore sharePaySelStore) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MspContext) ipChange.ipc$dispatch("55ffe7ce", new Object[]{sharePaySelStore}) : sharePaySelStore.f4584a;
    }

    public static /* synthetic */ MspTradeContext b(SharePaySelStore sharePaySelStore) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MspTradeContext) ipChange.ipc$dispatch("a10f6d", new Object[]{sharePaySelStore}) : sharePaySelStore.b;
    }

    public SharePaySelStore(int i) {
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
        final JSONObject actionParamsJson = mspEvent.getActionParamsJson();
        MspBasePresenter currentPresenter = this.c.getCurrentPresenter();
        if (currentPresenter == null) {
            return "";
        }
        final Activity activity = currentPresenter.getActivity();
        activity.runOnUiThread(new Runnable() { // from class: com.alipay.android.msp.drivers.stores.store.events.SharePaySelStore.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                actionParamsJson.put(MspGlobalDefine.SESSION, (Object) SharePaySelStore.a(SharePaySelStore.this).getGlobalSession());
                MspSharePayDialog.processSel(activity, actionParamsJson, SharePaySelStore.b(SharePaySelStore.this));
            }
        });
        return "";
    }
}
