package com.alipay.android.msp.drivers.stores.store.metaevents;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.drivers.stores.store.LocalEventStore;
import com.alipay.android.msp.framework.helper.MspConfig;
import com.alipay.android.msp.pay.results.MspPayResult;
import com.alipay.android.msp.utils.JsonUtil;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;
import tb.gkl;

/* loaded from: classes3.dex */
public class MetaGetBizDataStore extends LocalEventStore {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public MetaGetBizDataStore(int i) {
        super(i);
    }

    @Override // com.alipay.android.msp.drivers.stores.store.LocalEventStore
    public String onMspAction(EventAction eventAction, EventAction.MspEvent mspEvent) {
        MspPayResult mspPayResult;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("719dcfee", new Object[]{this, eventAction, mspEvent});
        }
        Object obj = null;
        if (this.f4584a == null || this.d == null) {
            return null;
        }
        JSONObject actionParamsJson = mspEvent.getActionParamsJson();
        if (actionParamsJson == null) {
            return "";
        }
        String string = actionParamsJson.getString("key");
        if (TextUtils.isEmpty(string)) {
            return "";
        }
        JSONObject jSONObject = new JSONObject();
        char c = 65535;
        try {
            switch (string.hashCode()) {
                case -934426595:
                    if (string.equals("result")) {
                        c = 4;
                        break;
                    }
                    break;
                case 106006350:
                    if (string.equals("order")) {
                        c = 0;
                        break;
                    }
                    break;
                case 1630576895:
                    if (string.equals("orderString")) {
                        c = 1;
                        break;
                    }
                    break;
                case 1903035676:
                    if (string.equals(gkl.DP_BIZ_CONTEXT)) {
                        c = 3;
                        break;
                    }
                    break;
                case 2115255728:
                    if (string.equals("mspParams")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                if (this.b != null) {
                    obj = JsonUtil.map2Json(this.b.getOrderInfoMap());
                }
                if (obj == null) {
                    obj = new JSONObject();
                }
                jSONObject.put("order", obj);
            } else if (c == 1) {
                if (this.b != null) {
                    obj = this.b.getOrderInfo();
                }
                if (obj == null) {
                    obj = "";
                }
                jSONObject.put("orderString", obj);
            } else if (c == 2) {
                String lastMspParams = MspConfig.getInstance().getLastMspParams();
                if (lastMspParams == null) {
                    lastMspParams = "";
                }
                jSONObject.put("mspParams", (Object) lastMspParams);
            } else if (c == 3) {
                if (this.b != null) {
                    obj = this.b.getBizContext();
                }
                if (obj == null) {
                    obj = new JSONObject();
                }
                jSONObject.put(gkl.DP_BIZ_CONTEXT, obj);
            } else if (c == 4) {
                JSONObject jSONObject2 = new JSONObject();
                if (this.b != null && (mspPayResult = this.b.getMspPayResult()) != null) {
                    mspPayResult.formatResult(2);
                    jSONObject2.put("resultStatus", (Object) mspPayResult.getEndCode());
                    jSONObject2.put("result", (Object) mspPayResult.getResult());
                    jSONObject2.put("memo", (Object) mspPayResult.getMemo());
                    jSONObject2.put(MspGlobalDefine.EXTENDINFO, (Object) mspPayResult.getExtendInfo());
                }
                jSONObject.put("result", (Object) jSONObject2);
            }
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace(e);
        }
        return jSONObject.toJSONString();
    }
}
