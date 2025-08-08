package com.alipay.android.msp.drivers.stores.store.events;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.drivers.stores.store.LocalEventStore;
import com.alipay.android.msp.framework.preload.PreloadManager;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class PreloadStore extends LocalEventStore {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public PreloadStore(int i) {
        super(i);
    }

    @Override // com.alipay.android.msp.drivers.stores.store.LocalEventStore
    public String onMspAction(EventAction eventAction, EventAction.MspEvent mspEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("719dcfee", new Object[]{this, eventAction, mspEvent});
        }
        String str = null;
        if (this.c != null && this.c.getCurrentPresenter() != null && this.d != null) {
            if (this.c.getCurrentPresenter().mo545getIView() == null) {
                return null;
            }
            JSONObject actionParamsJson = mspEvent.getActionParamsJson();
            String string = actionParamsJson.getString("page");
            actionParamsJson.getString("action");
            str = "";
            if (!StringUtils.isEmpty(string) && string.contains("bizapp-collect-money")) {
                try {
                    LogUtil.record(1, "PreloadStore.onMspAction", str);
                    PreloadManager.startPreLoad(this.d.getApplicationContext());
                } catch (Throwable th) {
                    LogUtil.printExceptionStackTrace(th);
                }
            }
        }
        return str;
    }
}
