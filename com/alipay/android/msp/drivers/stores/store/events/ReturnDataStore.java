package com.alipay.android.msp.drivers.stores.store.events;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.drivers.stores.store.LocalEventStore;
import com.alipay.android.msp.pay.results.MspPayResult;
import com.alipay.android.msp.utils.JsonUtil;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;
import com.mobile.auth.gatewayauth.Constant;
import tb.riy;

/* loaded from: classes3.dex */
public class ReturnDataStore extends LocalEventStore {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public ReturnDataStore(int i) {
        super(i);
    }

    @Override // com.alipay.android.msp.drivers.stores.store.LocalEventStore
    public String onMspAction(EventAction eventAction, EventAction.MspEvent mspEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("719dcfee", new Object[]{this, eventAction, mspEvent});
        }
        JSONObject actionParamsJson = mspEvent.getActionParamsJson();
        if (actionParamsJson == null || this.b == null) {
            return null;
        }
        MspPayResult mspPayResult = this.b.getMspPayResult();
        if (mspPayResult == null) {
            LogUtil.record(1, "ReturnDataStore:onMspAction", "payResult == null");
            return null;
        }
        String orderInfo = this.b.getOrderInfo();
        if (!StringUtils.isEmpty(orderInfo) && orderInfo.contains("external_spec_action=\"/shareppay/sendMsg\"")) {
            mspPayResult.setEndCode(Constant.CODE_GET_TOKEN_SUCCESS);
        }
        String string = actionParamsJson.getString("resultStatus");
        if (!StringUtils.isEmpty(string)) {
            mspPayResult.setEndCode(string);
        }
        String string2 = actionParamsJson.getString("memo");
        if (!StringUtils.isEmpty(string2)) {
            mspPayResult.setMemo(string2);
        }
        try {
            String string3 = actionParamsJson.getString("result");
            if (!StringUtils.isEmpty(string3)) {
                if (!JsonUtil.isJsonObjectString(string3) && string3.indexOf(riy.BLOCK_START_STR) == 0) {
                    string3 = string3.substring(1, string3.length() - 1);
                }
                mspPayResult.setResult(string3);
            }
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace(e);
        }
        actionParamsJson.remove("resultStatus");
        actionParamsJson.remove("memo");
        actionParamsJson.remove("result");
        if (actionParamsJson.size() > 0) {
            mspPayResult.addExtendInfo(actionParamsJson);
        }
        if (actionParamsJson.getBooleanValue("doNotExit")) {
            return "";
        }
        this.b.exit(0);
        return "";
    }
}
