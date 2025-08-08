package com.alipay.android.msp.drivers.stores.store.metaevents;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.drivers.stores.store.LocalEventStore;
import com.alipay.android.msp.framework.drm.DrmManager;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;
import com.mobile.auth.gatewayauth.Constant;

/* loaded from: classes3.dex */
public class MetaGetDrmConfigStore extends LocalEventStore {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public MetaGetDrmConfigStore(int i) {
        super(i);
    }

    @Override // com.alipay.android.msp.drivers.stores.store.LocalEventStore
    public String onMspAction(EventAction eventAction, EventAction.MspEvent mspEvent) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("719dcfee", new Object[]{this, eventAction, mspEvent});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(Constant.API_PARAMS_KEY_ENABLE, (Object) Boolean.FALSE);
        if (this.f4584a == null || this.d == null) {
            return "";
        }
        JSONObject actionParamsJson = mspEvent.getActionParamsJson();
        String string = actionParamsJson.getString("key");
        String string2 = actionParamsJson.getString("subkey");
        try {
            if (!StringUtils.isEmpty(string2)) {
                JSONObject drmValueFromKey = DrmManager.getInstance(this.d).getDrmValueFromKey(string);
                if (drmValueFromKey != null) {
                    String string3 = drmValueFromKey.getString(string2);
                    if (!StringUtils.isEmpty(string3)) {
                        try {
                            z = DrmManager.getInstance(this.d).procGraySwitchWithRate(this.d, Integer.parseInt(string3));
                            LogUtil.record(2, "PreRendManager:needPreloadTpl", "isEnable=".concat(String.valueOf(z)));
                        } catch (Exception e) {
                            LogUtil.printExceptionStackTrace(e);
                        }
                    }
                }
            } else {
                z = DrmManager.getInstance(this.d).isDegrade(string, false, this.d);
            }
        } catch (Exception e2) {
            LogUtil.printExceptionStackTrace(e2);
        }
        jSONObject.put(Constant.API_PARAMS_KEY_ENABLE, (Object) Boolean.valueOf(z));
        return jSONObject.toJSONString();
    }
}
