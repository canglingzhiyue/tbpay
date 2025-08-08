package com.alipay.android.msp.network;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.app.helper.Tid;
import com.alipay.android.msp.constants.MspFlybirdDefine;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.alipay.android.msp.core.context.MspContextManager;
import com.alipay.android.msp.core.context.MspTradeContext;
import com.alipay.android.msp.core.section.MqpBehavior;
import com.alipay.android.msp.framework.exception.NetErrorException;
import com.alipay.android.msp.framework.exception.PublicKeyException;
import com.alipay.android.msp.framework.statisticsv2.StatisticInfo;
import com.alipay.android.msp.framework.statisticsv2.model.StEvent;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.alipay.android.msp.framework.tid.TidStorage;
import com.alipay.android.msp.network.decorator.RpcRequestDecoratorV2;
import com.alipay.android.msp.network.model.ReqData;
import com.alipay.android.msp.network.model.RequestConfig;
import com.alipay.android.msp.network.model.ResData;
import com.alipay.android.msp.network.model.RpcRequestDataV2;
import com.alipay.android.msp.pay.TradeLogicData;
import com.alipay.android.msp.plugin.manager.PluginManager;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.android.msp.utils.net.LdcUtils;
import com.alipay.sdk.api.AlipaySDKJSBridge;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* loaded from: classes3.dex */
public final class MiscRequestUtils {

    /* loaded from: classes3.dex */
    public static class OfflineRenderReportRequest {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static boolean requestReportLocalInfo(String str, boolean z, Map<String, String> map) throws Throwable {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("9981d39c", new Object[]{str, new Boolean(z), map})).booleanValue();
            }
            RequestConfig requestConfig = new RequestConfig(RequestConfig.RequestChannel.PB_V3_CASHIER, true);
            requestConfig.setType("cashier");
            requestConfig.setMethod("updateTidInfo");
            requestConfig.setExtendParamsMap(map);
            return StringUtils.equals(PluginManager.getPbChannel().requestByPbv3(new ReqData<>(RpcRequestDecoratorV2.todo(requestConfig, str, -1, true, false).getKeyValueMap()), requestConfig).toMapData().get("end_code"), "9000");
        }
    }

    /* loaded from: classes3.dex */
    public static class ViRpcDataRequest {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static Map<String, String> requestViRpcData(String str, String str2, int i) throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("390d2eb0", new Object[]{str, str2, new Integer(i)});
            }
            RequestConfig requestConfig = new RequestConfig(RequestConfig.RequestChannel.PB_V3_CASHIER);
            String[] split = str.split("/");
            if (split.length > 2) {
                requestConfig.setType(split[1]);
                requestConfig.setMethod(split[2]);
            }
            MspTradeContext tradeContextByBizId = MspContextManager.getInstance().getTradeContextByBizId(i);
            if (tradeContextByBizId == null) {
                return null;
            }
            LogUtil.record(4, "requestRpcData", "action:" + str + " params:" + str2);
            TradeLogicData tradeLogicData = tradeContextByBizId.getTradeLogicData();
            if (tradeLogicData != null) {
                requestConfig.setHasTryLogin(tradeLogicData.hasTryLogin());
                requestConfig.setSessionId(tradeLogicData.getSessionId());
                requestConfig.isSupportGzip(tradeLogicData.isIsSupportGzip());
                requestConfig.setmUac(tradeLogicData.getUac());
                tradeLogicData.setIsViChannelMode(true);
            }
            RpcRequestDataV2 doVar = new Pbv2ForSDKDecorator().todo(requestConfig, str2, i);
            doVar.mspParam = LdcUtils.getMspParams(tradeLogicData, "");
            doVar.dispatchType = requestConfig.getDispatchType();
            MqpBehavior.getInstance().onCashierRpcStart(tradeContextByBizId, str);
            Map<String, String> mapData = PluginManager.getPbChannel().requestByPbv3(new ReqData<>(doVar.getKeyValueMap()), requestConfig).toMapData();
            MqpBehavior.getInstance().onCashierRpcEnd(tradeContextByBizId, str);
            if (tradeLogicData != null && mapData.get("mspParam") != null) {
                tradeLogicData.setLdcHeaders(mapData.get("mspParam"));
                LogUtil.record(4, AlipaySDKJSBridge.LOG_TAG, "LogicMessageHandlerAdapter.execute", "mspParam" + mapData.get("mspParam"));
            }
            if (tradeLogicData != null && !StringUtils.isEmpty(mapData.get(MspGlobalDefine.SESSION))) {
                tradeLogicData.setSessionId(mapData.get(MspGlobalDefine.SESSION));
            }
            return mapData;
        }
    }

    /* loaded from: classes3.dex */
    public static class TidRequest {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static Tid query(Context context, StatisticInfo statisticInfo) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Tid) ipChange.ipc$dispatch("fea53a2b", new Object[]{context, statisticInfo});
            }
            Tid tid = null;
            long currentTimeMillis = System.currentTimeMillis();
            try {
                tid = a(context, true);
                if (tid != null && !tid.isEmpty()) {
                    StEvent stEvent = new StEvent("", "TidLoadServer", "");
                    stEvent.onStatistic(StEvent.NET_COST, String.valueOf(System.currentTimeMillis() - currentTimeMillis));
                    statisticInfo.addEvent(stEvent);
                } else {
                    statisticInfo.addError(ErrorType.DEFAULT, "TidLoadFail_emptyTid", "");
                }
            } catch (NetErrorException e) {
                statisticInfo.addError(ErrorType.NETWORK, e.getErrorNameForLog(), e.getShortMessageForLog());
            } catch (Throwable th) {
                statisticInfo.addError(ErrorType.DEFAULT, "TidLoadFail_" + th.getClass().getSimpleName(), th);
            }
            return tid;
        }

        private static Tid a(Context context, boolean z) throws Exception {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Tid) ipChange.ipc$dispatch("3267e52", new Object[]{context, new Boolean(z)});
            }
            while (true) {
                LogUtil.record(2, "", "TidHelper::requestTidByHttp", "start");
                RequestConfig requestConfig = new RequestConfig(RequestConfig.RequestChannel.BYTES_CASHIER);
                requestConfig.setType("cashier");
                requestConfig.setMethod("gentid");
                ReqData<byte[]> reqData = new ReqData<>(PackUtils.packTidRequestData(requestConfig));
                reqData.mBizId = -1;
                ResData<byte[]> requestData = PluginManager.getTransChannel().requestData(reqData, requestConfig);
                requestConfig.setmResponseHeaderGzipFlag(Boolean.valueOf(requestData.getHeader("msp-gzip")).booleanValue());
                try {
                    String unpackBytesResponseData = PackUtils.unpackBytesResponseData(requestData.toBytesData(), requestConfig);
                    LogUtil.record(2, "", "TidHelper::requestTidByHttp", "Tid realdata:".concat(String.valueOf(unpackBytesResponseData)));
                    JSONObject parseObject = JSON.parseObject(unpackBytesResponseData);
                    if (parseObject.containsKey("data")) {
                        parseObject = parseObject.getJSONObject("data").getJSONObject("params");
                    }
                    String string = parseObject.getString("tid");
                    String string2 = parseObject.getString(MspFlybirdDefine.FLYBIRD_CLIENT_KEY);
                    LogUtil.record(2, "", "TidHelper::requestTidByHttp", "response: tid=" + string + ", clientKey=" + string2);
                    if (!StringUtils.isEmpty(string) && !StringUtils.isEmpty(string2)) {
                        TidStorage.getInstance().save(string, string2);
                    }
                    Tid tid = TidStorage.getInstance(context).getTID();
                    if (tid == null) {
                        str = "return null";
                    } else {
                        str = "return tid:" + tid.getTid();
                    }
                    LogUtil.record(2, "", "TidHelper::requestTidByHttp", str);
                    return tid;
                } catch (PublicKeyException unused) {
                    if (!z) {
                        return null;
                    }
                    z = false;
                }
            }
        }
    }
}
