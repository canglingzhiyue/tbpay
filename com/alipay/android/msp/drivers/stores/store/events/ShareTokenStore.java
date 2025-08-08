package com.alipay.android.msp.drivers.stores.store.events;

import android.app.Activity;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.core.context.MspTradeContext;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.drivers.stores.store.LocalEventStore;
import com.alipay.android.msp.ui.presenters.MspBasePresenter;
import com.alipay.android.msp.ui.widget.MspShareTokenDialog;
import com.alipay.android.msp.utils.OrderInfoUtil;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class ShareTokenStore extends LocalEventStore {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ MspTradeContext a(ShareTokenStore shareTokenStore) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MspTradeContext) ipChange.ipc$dispatch("964c340b", new Object[]{shareTokenStore}) : shareTokenStore.b;
    }

    public ShareTokenStore(int i) {
        super(i);
    }

    @Override // com.alipay.android.msp.drivers.stores.store.LocalEventStore
    public String onMspAction(EventAction eventAction, EventAction.MspEvent mspEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("719dcfee", new Object[]{this, eventAction, mspEvent});
        }
        if (this.b == null || this.c == null) {
            return null;
        }
        JSONObject actionParamsJson = mspEvent.getActionParamsJson();
        final boolean z = !OrderInfoUtil.isSharepayRequest(this.b);
        MspBasePresenter currentPresenter = this.c.getCurrentPresenter();
        if (currentPresenter == null) {
            return null;
        }
        final Activity activity = currentPresenter.getActivity();
        final String string = actionParamsJson.getString("tokenText");
        activity.runOnUiThread(new Runnable() { // from class: com.alipay.android.msp.drivers.stores.store.events.ShareTokenStore.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (StringUtils.isEmpty(string)) {
                } else {
                    MspShareTokenDialog.showDialog(activity, string, ShareTokenStore.a(ShareTokenStore.this), z);
                }
            }
        });
        return "";
    }
}
