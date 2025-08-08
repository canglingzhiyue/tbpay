package com.alipay.android.msp.drivers.stores.store.events;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.drivers.actions.InvokeActionPlugin;
import com.alipay.android.msp.drivers.stores.store.LocalEventStore;
import com.alipay.android.msp.ui.widget.MspDialogHelper;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class LoadingStore extends LocalEventStore {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public LoadingStore(int i) {
        super(i);
    }

    @Override // com.alipay.android.msp.drivers.stores.store.LocalEventStore
    public String onMspAction(EventAction eventAction, EventAction.MspEvent mspEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("719dcfee", new Object[]{this, eventAction, mspEvent});
        }
        if (this.f4584a != null && this.c != null) {
            JSONObject actionParamsJson = mspEvent.getActionParamsJson();
            if (actionParamsJson == null) {
                return null;
            }
            boolean booleanValue = actionParamsJson.getBooleanValue("keeploading");
            Boolean bool = actionParamsJson.getBoolean("show");
            String string = actionParamsJson.getString("text");
            String string2 = actionParamsJson.getString("style");
            MspDialogHelper mspDialogHelper = this.f4584a.getMspDialogHelper();
            if (mspDialogHelper != null) {
                if (bool != null) {
                    if (!StringUtils.equals(string2, InvokeActionPlugin.SHOW_LOADING_STYLE_PLAIN)) {
                        if (bool.booleanValue()) {
                            mspDialogHelper.showDefaultLoading(string);
                        } else {
                            mspDialogHelper.dismissDefaultLoading();
                        }
                    } else if (bool.booleanValue()) {
                        mspDialogHelper.showWalletLoading(this.d, string);
                    } else {
                        mspDialogHelper.dismissWalletLoading();
                    }
                }
                mspDialogHelper.setKeepLoading(booleanValue);
            }
        }
        return "";
    }
}
