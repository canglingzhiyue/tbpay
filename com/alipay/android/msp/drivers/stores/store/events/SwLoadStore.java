package com.alipay.android.msp.drivers.stores.store.events;

import android.text.TextUtils;
import com.alipay.android.msp.core.context.MspTradeContext;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.drivers.stores.store.LocalEventStore;
import com.alipay.android.msp.drivers.stores.storecenter.ActionStoreCenter;
import com.alipay.android.msp.framework.hardwarepay.old.dialog.ValidateDialogProxy;
import com.alipay.android.msp.utils.EventLogUtil;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class SwLoadStore extends LocalEventStore {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public SwLoadStore(int i) {
        super(i);
    }

    @Override // com.alipay.android.msp.drivers.stores.store.LocalEventStore
    public String onMspAction(EventAction eventAction, EventAction.MspEvent mspEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("719dcfee", new Object[]{this, eventAction, mspEvent});
        }
        EventLogUtil.SpecificEvent.wearableUsage("swloadStore");
        ValidateDialogProxy dialog = this.f4584a instanceof MspTradeContext ? ((ActionStoreCenter) this.f4584a.getStoreCenter()).getDialog() : null;
        String[] actionParamsArray = mspEvent.getActionParamsArray();
        if (dialog == null || actionParamsArray == null || actionParamsArray.length <= 0) {
            return null;
        }
        int i = -1;
        for (String str : actionParamsArray) {
            if (str != null) {
                String trim = str.trim();
                if (trim.startsWith("time=")) {
                    try {
                        i = Integer.parseInt(trim.substring(trim.indexOf("=") + 1));
                    } catch (NumberFormatException e) {
                        LogUtil.printExceptionStackTrace(e);
                    }
                    if (i >= 0 && dialog != null) {
                        dialog.dismiss(i);
                    }
                } else if (trim.startsWith("loadtxt=")) {
                    String substring = trim.substring(trim.indexOf("=") + 1);
                    if (dialog != null) {
                        dialog.updateMsg(substring, 0, -16777216);
                    }
                } else if (TextUtils.equals(trim, "status=success") && dialog != null) {
                    dialog.showLoadingSuccess();
                } else if (TextUtils.equals(trim, "status=loading") && dialog != null) {
                    dialog.setAllButtonsGone();
                }
            }
        }
        if (i < 0 || this.f4584a.getStoreCenter() == null) {
            return "";
        }
        ((ActionStoreCenter) this.f4584a.getStoreCenter()).setDialog(null);
        return "";
    }
}
