package com.alipay.android.msp.network.decorator;

import android.content.Context;
import android.os.SystemClock;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspFlybirdDefine;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.alipay.android.msp.constants.MspNetConstants;
import com.alipay.android.msp.core.context.MspContext;
import com.alipay.android.msp.core.context.MspContextManager;
import com.alipay.android.msp.core.context.MspTradeContext;
import com.alipay.android.msp.framework.constraints.IChannelInfo;
import com.alipay.android.msp.framework.exception.AppErrorException;
import com.alipay.android.msp.framework.hardwarepay.old.MspHardwarePayUtil;
import com.alipay.android.msp.framework.helper.GlobalHelper;
import com.alipay.android.msp.framework.helper.MspConfig;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorCode;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.alipay.android.msp.framework.sys.DeviceInfo;
import com.alipay.android.msp.framework.tid.TidStorage;
import com.alipay.android.msp.network.model.RequestConfig;
import com.alipay.android.msp.network.model.RpcRequestData;
import com.alipay.android.msp.pay.service.MspInitAssistService;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.alipay.android.msp.plugin.manager.PluginManager;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.android.msp.utils.MspContextUtil;
import com.alipay.android.msp.utils.OrderInfoUtil;
import com.alipay.android.msp.utils.Utils;
import com.alipay.sdk.api.AlipaySDKJSBridge;
import com.alipay.sdk.sys.BizContext;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public final class RpcRequestDecorator {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static String undo(String str) throws AppErrorException, JSONException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b08bbccb", new Object[]{str});
        }
        return null;
    }

    public static RpcRequestData todo(RequestConfig requestConfig, String str, int i) throws JSONException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RpcRequestData) ipChange.ipc$dispatch("23e469e5", new Object[]{requestConfig, str, new Integer(i)});
        }
        RpcRequestData rpcRequestData = new RpcRequestData();
        rpcRequestData.setNamespace(requestConfig.getNamespace());
        rpcRequestData.setApi_name(requestConfig.getApiName());
        rpcRequestData.setApi_version(requestConfig.getApiVersion());
        if (requestConfig.isFirstRequest()) {
            rpcRequestData.setParams(getFirstRequestParamsString(requestConfig, str, i));
        } else {
            JSONObject parseObject = JSON.parseObject(str);
            GlobalHelper globalHelper = GlobalHelper.getInstance();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", (Object) requestConfig.getType());
            jSONObject.put("method", (Object) requestConfig.getMethod());
            parseObject.put("action", (Object) jSONObject);
            parseObject.put("gzip", (Object) Boolean.FALSE);
            parseObject.put("bp", (Object) PluginManager.getRender().getEngineParams());
            if (requestConfig.ismNeedUa()) {
                parseObject.put(MspGlobalDefine.UAC, (Object) MspConfig.getInstance().getUserAgentC());
            }
            if (!StringUtils.isEmpty(requestConfig.getSessionId())) {
                parseObject.put(MspGlobalDefine.SESSION, (Object) requestConfig.getSessionId());
            }
            LogUtil.record(2, AlipaySDKJSBridge.LOG_TAG, "RpcRequestDecorator.getCommonRequestParamsString", "getApdidToken start");
            String apdidToken = PhoneCashierMspEngine.getMspBase().getApdidToken(globalHelper.getContext());
            LogUtil.record(2, AlipaySDKJSBridge.LOG_TAG, "RpcRequestDecorator.getCommonRequestParamsString", "getApdidToken end");
            if (StringUtils.isEmpty(apdidToken) || apdidToken.length() <= 15) {
                parseObject.put(MspGlobalDefine.UA, (Object) MspConfig.getInstance().getUserAgentByType(false, 2));
            } else {
                parseObject.put(MspGlobalDefine.UA, (Object) MspConfig.getInstance().getUserAgentByType(false, 1));
            }
            String localeDesByFlag = Utils.getLocaleDesByFlag(PhoneCashierMspEngine.getMspBase().getMspLocale(PhoneCashierMspEngine.getMspWallet().getAlipayLocaleDes()));
            if (!StringUtils.isEmpty(localeDesByFlag)) {
                parseObject.put(MspGlobalDefine.LANG, (Object) localeDesByFlag);
            }
            parseObject.put("tid", (Object) TidStorage.getInstance().getTid());
            LogUtil.record(1, AlipaySDKJSBridge.LOG_TAG, "RpcRequestDecorator.getCommonRequestParamsString", "RPC common request参数:" + parseObject.toString());
            rpcRequestData.setParams(parseObject.toString());
        }
        rpcRequestData.setAuth_key(PhoneCashierMspEngine.getMspWallet().getAuthToken());
        rpcRequestData.setVersion("5.7.2");
        rpcRequestData.setDispatchType(requestConfig.getDispatchType());
        return rpcRequestData;
    }

    public static RpcRequestData getInvokeRpcRequestParamsString(RequestConfig requestConfig, String str, Context context) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RpcRequestData) ipChange.ipc$dispatch("94805001", new Object[]{requestConfig, str, context});
        }
        RpcRequestData rpcRequestData = new RpcRequestData();
        rpcRequestData.setNamespace(requestConfig.getNamespace());
        rpcRequestData.setApi_name(requestConfig.getApiName());
        rpcRequestData.setApi_version(requestConfig.getApiVersion());
        JSONObject parseObject = JSON.parseObject(str);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", (Object) requestConfig.getType());
        jSONObject.put("method", (Object) requestConfig.getMethod());
        parseObject.put("action", (Object) jSONObject);
        parseObject.put("bp", (Object) PluginManager.getRender().getEngineParams());
        if (!StringUtils.isEmpty(requestConfig.getSessionId())) {
            parseObject.put(MspGlobalDefine.SESSION, (Object) requestConfig.getSessionId());
        }
        parseObject.put("tid", (Object) TidStorage.getInstance().getTid());
        if (StringUtils.equals(requestConfig.getType(), "channelPropagate") && StringUtils.equals(requestConfig.getMethod(), "consult")) {
            String apdidToken = PhoneCashierMspEngine.getMspBase().getApdidToken(context);
            if (StringUtils.isEmpty(apdidToken) || apdidToken.length() <= 15) {
                parseObject.put(MspGlobalDefine.UA, (Object) MspConfig.getInstance().getUserAgentByType(false, 2));
            } else {
                parseObject.put(MspGlobalDefine.UA, (Object) MspConfig.getInstance().getUserAgentByType(false, 1));
            }
            String localeDesByFlag = Utils.getLocaleDesByFlag(PhoneCashierMspEngine.getMspBase().getMspLocale(PhoneCashierMspEngine.getMspWallet().getAlipayLocaleDes()));
            if (!StringUtils.isEmpty(localeDesByFlag)) {
                parseObject.put(MspGlobalDefine.LANG, (Object) localeDesByFlag);
            }
        }
        LogUtil.record(1, AlipaySDKJSBridge.LOG_TAG, "RpcRequestDecorator.getCommonRequestParamsString", "RPC common request参数:" + parseObject.toString());
        rpcRequestData.setParams(parseObject.toString());
        return rpcRequestData;
    }

    public static String getFirstRequestParamsString(RequestConfig requestConfig, String str, int i) throws JSONException {
        IChannelInfo channelInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("89b3bd1b", new Object[]{requestConfig, str, new Integer(i)});
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        MspContext mspContextByBizId = MspContextManager.getInstance().getMspContextByBizId(i);
        GlobalHelper globalHelper = GlobalHelper.getInstance();
        JSONObject jSONObject = new JSONObject();
        if (requestConfig != null && requestConfig.hasTryLogin()) {
            jSONObject.put(MspFlybirdDefine.FLYBIRD_LOGIN, (Object) "1");
        }
        jSONObject.put("tid", (Object) TidStorage.getInstance().getTid());
        long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
        LogUtil.record(4, AlipaySDKJSBridge.LOG_TAG, "RpcRequestDecorator.getFirstRequestParamsString", "get tid time:" + elapsedRealtime2 + "msms");
        long elapsedRealtime3 = SystemClock.elapsedRealtime();
        LogUtil.record(2, AlipaySDKJSBridge.LOG_TAG, "RpcRequestDecorator.getFirstRequestParamsString", "getApdidToken startPay msms");
        String apdidToken = PhoneCashierMspEngine.getMspBase().getApdidToken(globalHelper.getContext());
        LogUtil.record(2, AlipaySDKJSBridge.LOG_TAG, "RpcRequestDecorator.getFirstRequestParamsString", "getApdidToken end msms");
        if (StringUtils.isEmpty(apdidToken) || apdidToken.length() <= 15) {
            jSONObject.put(MspGlobalDefine.UA, (Object) MspConfig.getInstance().getUserAgentByType(false, 2));
        } else {
            jSONObject.put(MspGlobalDefine.UA, (Object) MspConfig.getInstance().getUserAgentByType(false, 1));
        }
        jSONObject.put(MspGlobalDefine.DECAY, (Object) PhoneCashierMspEngine.getMspWallet().getExtractData());
        LogUtil.record(4, AlipaySDKJSBridge.LOG_TAG, "RpcRequestDecorator.getFirstRequestParamsString", "get ua time:" + (SystemClock.elapsedRealtime() - elapsedRealtime3) + "msms");
        LogUtil.record(2, AlipaySDKJSBridge.LOG_TAG, "RpcRequestDecorator.getFirstRequestParamsString", "getAlipayLocaleDes startPay msms");
        jSONObject.put(MspGlobalDefine.LANG, (Object) Utils.getLocaleDesByFlag(PhoneCashierMspEngine.getMspBase().getMspLocale(PhoneCashierMspEngine.getMspWallet().getAlipayLocaleDes())));
        LogUtil.record(2, AlipaySDKJSBridge.LOG_TAG, "RpcRequestDecorator.getFirstRequestParamsString", "getAlipayLocaleDes end msms");
        jSONObject.put(MspGlobalDefine.PA, (Object) MspConfig.getInstance().getPa(GlobalHelper.getInstance().getContext()));
        jSONObject.put("synch", (Object) Integer.valueOf(i));
        LogUtil.record(2, AlipaySDKJSBridge.LOG_TAG, "RpcRequestDecorator.getFirstRequestParamsString", "getAuthToken startPay msms");
        if (OrderInfoUtil.isOutTradeOrder(str)) {
            jSONObject.put(MspGlobalDefine.EXTOK, (Object) PhoneCashierMspEngine.getMspWallet().getAuthToken());
        }
        LogUtil.record(2, AlipaySDKJSBridge.LOG_TAG, "RpcRequestDecorator.getFirstRequestParamsString", "getAuthToken end msms");
        long elapsedRealtime4 = SystemClock.elapsedRealtime();
        String engineParams = PluginManager.getRender().getEngineParams();
        if (engineParams.contains("||")) {
            LogUtil.record(8, AlipaySDKJSBridge.LOG_TAG, "RpcRequestDecorator.getFirstRequestParamsString", "bpArgsError:".concat(String.valueOf(engineParams)));
            if (mspContextByBizId != null) {
                mspContextByBizId.getStatisticInfo().addError(ErrorType.DEFAULT, ErrorCode.DEFAULT_BP_ARGS_ERROR, "bp:".concat(String.valueOf(engineParams)));
            }
        }
        jSONObject.put("bp", (Object) engineParams);
        jSONObject.put(MspGlobalDefine.HAS_ALIPAY, (Object) Boolean.valueOf(DeviceInfo.hasAlipayWallet(globalHelper.getContext())));
        jSONObject.put(MspGlobalDefine.EXTERNAL_INFO, (Object) str);
        jSONObject.put("user_id", (Object) MspContextUtil.getUserId());
        jSONObject.put(MspGlobalDefine.TRID, (Object) PhoneCashierMspEngine.getMspWallet().getTrId());
        MspInitAssistService sdkInstance = MspInitAssistService.getSdkInstance();
        if (sdkInstance != null && (channelInfo = sdkInstance.getChannelInfo()) != null) {
            jSONObject.put(MspGlobalDefine.APP_KEY, (Object) channelInfo.getAppKey());
        }
        MspTradeContext tradeContextByBizId = MspContextManager.getInstance().getTradeContextByBizId(i);
        if (tradeContextByBizId != null && tradeContextByBizId.isFromWallet() && !tradeContextByBizId.isFromOutScheme()) {
            jSONObject.put(MspFlybirdDefine.TRDFROM, (Object) "1");
        } else {
            jSONObject.put(MspFlybirdDefine.TRDFROM, (Object) "0");
        }
        jSONObject.put("utdid", (Object) globalHelper.getUtdid(globalHelper.getContext()));
        LogUtil.record(4, AlipaySDKJSBridge.LOG_TAG, "RpcRequestDecorator.getFirstRequestParamsString", "get utdid time:" + (SystemClock.elapsedRealtime() - elapsedRealtime4) + "msms");
        jSONObject.put(MspNetConstants.Request.NEW_CLIENT_KEY, (Object) TidStorage.getInstance().genClientKey());
        long elapsedRealtime5 = SystemClock.elapsedRealtime();
        MspHardwarePayUtil.getInstance().initHardwarePay(globalHelper.getContext(), i, jSONObject);
        long elapsedRealtime6 = SystemClock.elapsedRealtime() - elapsedRealtime5;
        LogUtil.record(4, AlipaySDKJSBridge.LOG_TAG, "RpcRequestDecorator.getFirstRequestParamsString", "HardwarePayUtil init time:" + elapsedRealtime6 + "msms");
        JSONObject jSONObject2 = new JSONObject();
        if (str.contains("sina") && str.contains("payment_setting")) {
            jSONObject2.put("type", (Object) "cashier");
            jSONObject2.put("method", (Object) "main");
        } else if (str.contains(BizContext.KEY_SETTING_FILTER)) {
            jSONObject2.put("type", (Object) BizContext.KEY_SETTING_FILTER);
            jSONObject2.put("method", (Object) "list");
        } else if (requestConfig != null) {
            jSONObject2.put("type", (Object) requestConfig.getType());
            jSONObject2.put("method", (Object) requestConfig.getMethod());
        } else if (mspContextByBizId != null) {
            mspContextByBizId.getStatisticInfo().addError(ErrorType.DEFAULT, "actionArgsErr", "reqConf null");
        }
        jSONObject.put("action", (Object) jSONObject2);
        jSONObject.put("gzip", (Object) Boolean.FALSE);
        LogUtil.record(1, AlipaySDKJSBridge.LOG_TAG, "RpcRequestDecorator.getFirstRequestParamsString", "RPC request参数:".concat(String.valueOf(jSONObject)));
        return jSONObject.toString();
    }
}
