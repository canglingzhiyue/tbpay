package com.alipay.android.msp.drivers.stores.store.events;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alipay.android.msp.biz.substitute.SpmHelper;
import com.alipay.android.msp.constants.MspNetConstants;
import com.alipay.android.msp.core.clients.MspUIClient;
import com.alipay.android.msp.core.section.MqpBehavior;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.drivers.stores.store.LocalEventStore;
import com.alipay.android.msp.framework.statisticsv2.model.StEvent;
import com.alipay.android.msp.framework.tid.TidStorage;
import com.alipay.android.msp.network.decorator.RpcRequestDecorator;
import com.alipay.android.msp.network.model.RequestConfig;
import com.alipay.android.msp.network.model.RpcRequestData;
import com.alipay.android.msp.pay.TradeLogicData;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.alipay.android.msp.plugin.manager.PluginManager;
import com.alipay.android.msp.ui.contracts.MspBaseContract;
import com.alipay.android.msp.ui.presenters.MspBasePresenter;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.android.msp.utils.net.LdcUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import tb.riy;

/* loaded from: classes3.dex */
public class RpcStore extends LocalEventStore {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(RpcStore rpcStore, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public RpcStore(int i) {
        super(i);
    }

    @Override // com.alipay.android.msp.drivers.stores.store.LocalEventStore
    public String onMspAction(EventAction eventAction, EventAction.MspEvent mspEvent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("719dcfee", new Object[]{this, eventAction, mspEvent}) : a(mspEvent.getActionParamsJson());
    }

    private String a(JSONObject jSONObject) {
        String str;
        String string;
        TradeLogicData tradeLogicData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("15c87a18", new Object[]{this, jSONObject});
        }
        MspUIClient mspUIClient = this.c;
        MspBasePresenter currentPresenter = mspUIClient != null ? mspUIClient.getCurrentPresenter() : null;
        MspBaseContract.IView mo545getIView = currentPresenter != null ? currentPresenter.mo545getIView() : null;
        boolean booleanValue = jSONObject.getBooleanValue("showLoading");
        if (booleanValue && currentPresenter != null && mo545getIView != null) {
            LogUtil.record(1, "RpcStore:executeRpc", "showLoading");
            mo545getIView.showLoadingView(new String[0]);
        }
        HashMap hashMap = new HashMap();
        try {
            String string2 = jSONObject.getString("operationType");
            boolean equals = "pb".equals(jSONObject.getString("type"));
            Object obj = jSONObject.get("requestData");
            if (jSONObject.containsKey("action")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("action");
                String string3 = jSONObject2.containsKey("name") ? jSONObject2.getString("name") : null;
                String jSONString = jSONObject2.containsKey("params") ? jSONObject2.getJSONObject("params").toJSONString() : "{}";
                String str2 = string3;
                RequestConfig requestConfig = new RequestConfig(jSONString, jSONObject2.toJSONString(), this.e, false);
                if (this.b != null) {
                    tradeLogicData = this.b.getTradeLogicData();
                    requestConfig.setSessionId(tradeLogicData.getSessionId());
                } else {
                    tradeLogicData = null;
                }
                RpcRequestData invokeRpcRequestParamsString = RpcRequestDecorator.getInvokeRpcRequestParamsString(requestConfig, jSONString, this.d);
                hashMap.put(MspNetConstants.Request.MSP_PARAM, LdcUtils.getMspParams(tradeLogicData, jSONString));
                hashMap.put("mqp-tid", TidStorage.getInstance().getTid());
                hashMap.put("mqp-apiver", invokeRpcRequestParamsString.getApi_version());
                hashMap.put("mqp-bp", PluginManager.getRender().getEngineParams());
                obj = invokeRpcRequestParamsString.toJsonParams();
                str = str2;
            } else {
                str = null;
            }
            if (obj == null) {
                if (mo545getIView != null && booleanValue) {
                    try {
                        LogUtil.record(1, "RpcStore:executeRpc", "hideLoading");
                        mo545getIView.stopLoadingView();
                    } catch (Exception e) {
                        LogUtil.printExceptionStackTrace(e);
                    }
                }
                return "{}";
            }
            if (equals) {
                string = jSONObject.getString("requestData");
            } else if (obj instanceof JSONArray) {
                string = obj.toString();
            } else if (obj instanceof JSONObject) {
                string = riy.ARRAY_START_STR + ((JSONObject) obj).toJSONString() + riy.ARRAY_END_STR;
            } else if (!(obj instanceof String)) {
                string = jSONObject.getString("requestData");
            } else if (!((String) obj).startsWith(riy.ARRAY_START_STR)) {
                JSONArray jSONArray = new JSONArray();
                jSONArray.add(obj);
                string = jSONArray.toJSONString();
            } else {
                string = (String) obj;
            }
            MqpBehavior.getInstance().onGeneralRpcStart(this.f4584a, string2, str);
            if (TextUtils.isEmpty(str)) {
                this.f.onStatistic("action", "rpc|".concat(String.valueOf(string2)));
            } else {
                this.f.onStatistic("action", "rpc|" + string2 + "|" + str);
            }
            SpmHelper.spmClickRpcRequest(this.f4584a, str);
            StEvent stEvent = this.f;
            StringBuilder sb = new StringBuilder();
            sb.append(JSON.toJSONBytes(string, new SerializerFeature[0]).length);
            stEvent.onStatistic(StEvent.SEND_MSG, sb.toString());
            JSONObject executeRpc = PhoneCashierMspEngine.getMspUtils().executeRpc(equals, string2, string, this.e, hashMap);
            StEvent stEvent2 = this.f;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(JSON.toJSONBytes(executeRpc, new SerializerFeature[0]).length);
            stEvent2.onStatistic(StEvent.RECV_MSG, sb2.toString());
            this.f.onStatistic(StEvent.SERVER_COST, "0");
            MqpBehavior.getInstance().onGeneralRpcEnd(this.f4584a, string2, str);
            if (executeRpc == null) {
                if (mo545getIView != null && booleanValue) {
                    try {
                        LogUtil.record(1, "RpcStore:executeRpc", "hideLoading");
                        mo545getIView.stopLoadingView();
                    } catch (Exception e2) {
                        LogUtil.printExceptionStackTrace(e2);
                    }
                }
                return "{}";
            }
            String jSONString2 = executeRpc.toJSONString();
            if (mo545getIView != null && booleanValue) {
                try {
                    LogUtil.record(1, "RpcStore:executeRpc", "hideLoading");
                    mo545getIView.stopLoadingView();
                } catch (Exception e3) {
                    LogUtil.printExceptionStackTrace(e3);
                }
            }
            return jSONString2;
        } catch (Throwable th) {
            try {
                LogUtil.record(4, "RpcStore:executeRpc", "exception caught");
                LogUtil.printExceptionStackTrace(th);
                if (mo545getIView != null && booleanValue) {
                    try {
                        LogUtil.record(1, "RpcStore:executeRpc", "hideLoading");
                        mo545getIView.stopLoadingView();
                    } catch (Exception e4) {
                        LogUtil.printExceptionStackTrace(e4);
                    }
                }
                return "{}";
            } catch (Throwable th2) {
                if (mo545getIView != null && booleanValue) {
                    try {
                        LogUtil.record(1, "RpcStore:executeRpc", "hideLoading");
                        mo545getIView.stopLoadingView();
                    } catch (Exception e5) {
                        LogUtil.printExceptionStackTrace(e5);
                    }
                }
                throw th2;
            }
        }
    }
}
