package com.alipay.android.msp.drivers.stores.store.events;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.alipay.android.app.safepaylogv2.api.StatisticCollector;
import com.alipay.android.msp.drivers.actions.ActionsCreator;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.drivers.stores.store.LocalEventStore;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorCode;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Arrays;

/* loaded from: classes3.dex */
public class TelStore extends LocalEventStore {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public TelStore(int i) {
        super(i);
    }

    @Override // com.alipay.android.msp.drivers.stores.store.LocalEventStore
    public String onMspAction(EventAction eventAction, EventAction.MspEvent mspEvent) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("719dcfee", new Object[]{this, eventAction, mspEvent});
        }
        if (this.f4584a == null || this.f4584a.getContext() == null || this.c == null || this.c.getCurrentPresenter() == null) {
            return null;
        }
        Activity activity = this.c.getCurrentPresenter().getActivity();
        String[] actionParamsArray = mspEvent.getActionParamsArray();
        call(activity, actionParamsArray);
        if (actionParamsArray != null && actionParamsArray.length != 0) {
            if (actionParamsArray.length <= 1 || TextUtils.equals(actionParamsArray[1], "0")) {
                z = true;
            }
            LogUtil.record(2, "TelEvent::isExit", "exit:".concat(String.valueOf(z)));
        }
        if (!z) {
            return "";
        }
        ActionsCreator.get(this.f4584a).createEventAction(new EventAction("exit"));
        return "";
    }

    public void call(Activity activity, String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10dfde48", new Object[]{this, activity, strArr});
            return;
        }
        LogUtil.record(2, "TelEvent::call", "mParams:" + Arrays.toString(strArr));
        if (strArr == null || strArr.length == 0) {
            return;
        }
        String str = strArr[0];
        LogUtil.record(2, "TelUtils::tel", "tel:".concat(String.valueOf(str)));
        try {
            activity.startActivity(new Intent("android.intent.action.DIAL", Uri.parse("tel:".concat(String.valueOf(str)))));
        } catch (Throwable th) {
            StatisticCollector.addError(StatisticCollector.GLOBAL_AGENT, ErrorType.DEFAULT, ErrorCode.DEFAULT_ACTION_TEL_EX, th);
        }
    }
}
