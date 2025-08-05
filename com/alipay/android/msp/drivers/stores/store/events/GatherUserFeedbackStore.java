package com.alipay.android.msp.drivers.stores.store.events;

import android.os.Bundle;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.drivers.stores.store.LocalEventStore;
import com.alipay.android.msp.framework.drm.DrmKey;
import com.alipay.android.msp.framework.drm.DrmManager;
import com.alipay.android.msp.framework.statistics.userfeedback.UserFeedBackUtil;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class GatherUserFeedbackStore extends LocalEventStore {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public GatherUserFeedbackStore(int i) {
        super(i);
    }

    @Override // com.alipay.android.msp.drivers.stores.store.LocalEventStore
    public String onMspAction(EventAction eventAction, EventAction.MspEvent mspEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("719dcfee", new Object[]{this, eventAction, mspEvent});
        }
        JSONObject actionParamsJson = mspEvent.getActionParamsJson();
        if (actionParamsJson == null || this.d == null || DrmManager.getInstance(this.d).isDegrade(DrmKey.DEGRADE_GATHER_FEEDBACK_EVENT, false, this.d)) {
            return null;
        }
        String string = actionParamsJson.getString("gatherType");
        String string2 = actionParamsJson.getString("logInfo");
        this.f.onStatistic("action", "gatherUserFeedback|".concat(String.valueOf(string)));
        if (!"snapshotWindow".equals(string)) {
            LogUtil.record(8, "GatherUserFeedbackStore:onMspAction", "unknown type=".concat(String.valueOf(string)));
            return "{}";
        }
        Bundle bundle = new Bundle();
        bundle.putString("extParamsJsonStr", string2);
        UserFeedBackUtil.getInstance().showGuideDialog(bundle);
        return "{}";
    }
}
