package com.alipay.android.msp.network;

import android.content.Context;
import android.os.SystemClock;
import mtopsdk.common.util.StringUtils;
import android.util.Base64;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.biz.thirdpay.ThirdPayManager;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.alipay.android.msp.core.context.MspContextManager;
import com.alipay.android.msp.core.context.MspTradeContext;
import com.alipay.android.msp.core.model.MspExtInfoModel;
import com.alipay.android.msp.framework.constraints.IChannelInfo;
import com.alipay.android.msp.framework.drm.DrmKey;
import com.alipay.android.msp.framework.drm.DrmManager;
import com.alipay.android.msp.framework.hardwarepay.old.MspHardwarePayUtil;
import com.alipay.android.msp.framework.helper.GlobalHelper;
import com.alipay.android.msp.framework.helper.MspConfig;
import com.alipay.android.msp.framework.lowdevice.MspLowDeviceManager;
import com.alipay.android.msp.framework.preload.PreloadManager;
import com.alipay.android.msp.framework.statisticsv2.model.StEvent;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorCode;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.alipay.android.msp.framework.taskscheduler.TaskHelper;
import com.alipay.android.msp.framework.tid.TidStorage;
import com.alipay.android.msp.framework.util.FwUtils;
import com.alipay.android.msp.network.model.RequestConfig;
import com.alipay.android.msp.network.model.RpcRequestDataV2;
import com.alipay.android.msp.pay.service.MspInitAssistService;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.alipay.android.msp.plugin.manager.PluginManager;
import com.alipay.android.msp.utils.ApLinkTokenUtils;
import com.alipay.android.msp.utils.JsonUtil;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.android.msp.utils.MspContextUtil;
import com.alipay.android.msp.utils.TimingUtil;
import com.alipay.android.msp.utils.Utils;
import com.alipay.sdk.api.AlipaySDKJSBridge;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class Pbv2ForSDKDecorator {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public RpcRequestDataV2 todo(RequestConfig requestConfig, String str, int i) throws JSONException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RpcRequestDataV2) ipChange.ipc$dispatch("bc71f049", new Object[]{this, requestConfig, str, new Integer(i)}) : todo(requestConfig, str, i, false);
    }

    public RpcRequestDataV2 todo(RequestConfig requestConfig, String str, int i, boolean z) throws JSONException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RpcRequestDataV2) ipChange.ipc$dispatch("f92cc6a7", new Object[]{this, requestConfig, str, new Integer(i), new Boolean(z)}) : todo(requestConfig, str, i, z, false);
    }

    public RpcRequestDataV2 todo(RequestConfig requestConfig, String str, int i, boolean z, boolean z2) throws JSONException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RpcRequestDataV2) ipChange.ipc$dispatch("53ccbc09", new Object[]{this, requestConfig, str, new Integer(i), new Boolean(z), new Boolean(z2)}) : todo(requestConfig, str, i, z, z2, null);
    }

    public RpcRequestDataV2 todo(RequestConfig requestConfig, final String str, final int i, boolean z, boolean z2, TimingUtil.TimingMsMap<TimingUtil.PreposeTimingEnum> timingMsMap) throws JSONException {
        JSONObject a2;
        boolean z3;
        IChannelInfo channelInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RpcRequestDataV2) ipChange.ipc$dispatch("6b8aa1a6", new Object[]{this, requestConfig, str, new Integer(i), new Boolean(z), new Boolean(z2), timingMsMap});
        }
        RpcRequestDataV2 rpcRequestDataV2 = new RpcRequestDataV2();
        Context context = GlobalHelper.getInstance().getContext();
        final MspTradeContext tradeContextByBizId = MspContextManager.getInstance().getTradeContextByBizId(i);
        if (tradeContextByBizId != null) {
            context = tradeContextByBizId.getContext();
        }
        if (context == null) {
            return rpcRequestDataV2;
        }
        final HashMap<String, String> hashMap = new HashMap<>();
        SystemClock.elapsedRealtime();
        String apiName = requestConfig.getApiName();
        if ("com.alipay.quickpay".equals(apiName)) {
            rpcRequestDataV2.api_nm = "0";
        } else if ("com.alipay.weibopay".equals(apiName)) {
            rpcRequestDataV2.api_nm = "2";
        } else if ("com.alipay.taobaopay".equals(apiName)) {
            rpcRequestDataV2.api_nm = "3";
        } else if ("com.alipay.taobaopay.pad".equals(apiName)) {
            rpcRequestDataV2.api_nm = "7";
        }
        if ("com.alipay.mobilecashier".equals(requestConfig.getNamespace())) {
            rpcRequestDataV2.api_nsp = "0";
        } else {
            rpcRequestDataV2.api_nsp = requestConfig.getNamespace();
        }
        String str2 = "";
        if (requestConfig.isFirstRequest()) {
            if (str.contains("sina") && str.contains("payment_setting")) {
                rpcRequestDataV2.action = "/cashier/main";
            } else if (str.contains("biz_type=\"setting\"")) {
                rpcRequestDataV2.action = "/setting/list";
            } else if (str.contains("biz_type=\"bindcardapp\"")) {
                rpcRequestDataV2.action = "/card/init";
            } else {
                rpcRequestDataV2.action = "/" + requestConfig.getType() + "/" + requestConfig.getMethod();
            }
            rpcRequestDataV2.synch = String.valueOf(i);
            rpcRequestDataV2.decay = PhoneCashierMspEngine.getMspWallet().getExtractData();
            rpcRequestDataV2.external_info = str;
            rpcRequestDataV2.user_id = PhoneCashierMspEngine.getMspWallet().getUserId();
            rpcRequestDataV2.session = requestConfig.getSessionId();
            rpcRequestDataV2.trid = PhoneCashierMspEngine.getMspWallet().getTrId();
            MspInitAssistService sdkInstance = MspInitAssistService.getSdkInstance();
            if (sdkInstance != null && (channelInfo = sdkInstance.getChannelInfo()) != null) {
                rpcRequestDataV2.app_key = channelInfo.getAppKey();
            }
            JSONObject jSONObject = new JSONObject();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            String cachedUtdid = PreloadManager.getPreloadCache().getCachedUtdid(hashMap);
            if (timingMsMap != null) {
                timingMsMap.put(TimingUtil.PreposeTimingEnum.UtdidTiming, Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
            }
            String cachedVIData = z ? str2 : PreloadManager.getPreloadCache().getCachedVIData(str2, hashMap);
            if (StringUtils.equals(rpcRequestDataV2.action, "/cashier/main")) {
                if (!DrmManager.getInstance(context).isGray(DrmKey.GRAY_EXTINFO_MODEL, false, context)) {
                    jSONObject = a(jSONObject, tradeContextByBizId, cachedVIData, i, cachedUtdid);
                }
                LogUtil.record(2, "Pbv2:", "old extInfo = ".concat(String.valueOf(jSONObject)));
                a2 = a(jSONObject, tradeContextByBizId, cachedVIData);
            } else {
                a2 = a(jSONObject, tradeContextByBizId, cachedVIData, i, cachedUtdid);
            }
            if (a2.size() > 0) {
                str2 = a2.toString();
            }
            rpcRequestDataV2.extinfo = str2;
            rpcRequestDataV2.trdfrom = null;
            rpcRequestDataV2.locLoginOnce = null;
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            if (StringUtils.equals(PreloadManager.getPreloadCache().getCachedHasCertPayString(context, hashMap), "1")) {
                a2.put(MspGlobalDefine.CERTPAY, (Object) Boolean.TRUE);
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3 || StringUtils.equals(PreloadManager.getPreloadCache().getCachedHasAlipayString(GlobalHelper.getInstance().getContext(), hashMap), "1")) {
                rpcRequestDataV2.hasAlipay = "1";
                rpcRequestDataV2.certpay = "1";
            }
            if (timingMsMap != null) {
                timingMsMap.put(TimingUtil.PreposeTimingEnum.HasAlipayTiming, Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime2));
            }
            rpcRequestDataV2.subua1 = MspConfig.getInstance().getClientKey();
            rpcRequestDataV2.subua2 = MspConfig.getInstance().getVimeiAndVimsi();
            rpcRequestDataV2.mqp_apiver = requestConfig.getApiVersion();
            rpcRequestDataV2.mqp_bp = PluginManager.getRender().getEngineParams();
            long elapsedRealtime3 = SystemClock.elapsedRealtime();
            rpcRequestDataV2.mqp_tid = TidStorage.getInstance().getTid();
            if (timingMsMap != null) {
                timingMsMap.put(TimingUtil.PreposeTimingEnum.TidTiming, Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime3));
            }
            long elapsedRealtime4 = SystemClock.elapsedRealtime();
            String apdidToken = PhoneCashierMspEngine.getMspBase().getApdidToken(context);
            LogUtil.record(2, AlipaySDKJSBridge.LOG_TAG, "RpcRequestDecorator.getFirstRequestParamsString", "getApdidToken end msms");
            rpcRequestDataV2.mqp_ua = PreloadManager.getPreloadCache().getCachedUserAgentByTypeV2(hashMap, z2, apdidToken);
            rpcRequestDataV2.subua3 = PreloadManager.getPreloadCache().getCachedManufacturerAndModel(false, hashMap, z2, apdidToken);
            if (timingMsMap != null) {
                timingMsMap.put(TimingUtil.PreposeTimingEnum.UaTiming, Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime4));
            }
            long elapsedRealtime5 = SystemClock.elapsedRealtime();
            rpcRequestDataV2.mqp_pa = PreloadManager.getPreloadCache().getCachedPa(hashMap, context);
            if (timingMsMap != null) {
                timingMsMap.put(TimingUtil.PreposeTimingEnum.PaTiming, Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime5));
            }
            if (!z) {
                final Context context2 = context;
                TaskHelper.execute(new Runnable() { // from class: com.alipay.android.msp.network.Pbv2ForSDKDecorator.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        try {
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put(MspGlobalDefine.EXTERNAL_INFO, (Object) str);
                            jSONObject2.put("user_id", (Object) MspContextUtil.getUserId());
                            MspHardwarePayUtil.getInstance().initHardwarePay(context2, i, jSONObject2);
                            if (i == -1) {
                                return;
                            }
                            String assembleLog = PreloadManager.getPreloadCache().assembleLog(hashMap, context2);
                            StEvent stEvent = new StEvent();
                            stEvent.onStatistic("actionType", "preload");
                            stEvent.onStatistic("action", assembleLog);
                            if (tradeContextByBizId == null) {
                                return;
                            }
                            tradeContextByBizId.getStatisticInfo().addEvent(stEvent);
                        } catch (Throwable th) {
                            LogUtil.printExceptionStackTrace(th);
                        }
                    }
                });
            }
        } else {
            rpcRequestDataV2.action = "/" + requestConfig.getType() + "/" + requestConfig.getMethod();
            if (requestConfig.ismNeedUa()) {
                String userAgentC = MspConfig.getInstance().getUserAgentC();
                if (userAgentC != null) {
                    rpcRequestDataV2.mqp_uac = Base64.encodeToString(userAgentC.getBytes(), 2);
                }
                if (StringUtils.isEmpty(rpcRequestDataV2.mqp_uac) && tradeContextByBizId != null) {
                    tradeContextByBizId.getStatisticInfo().addError(ErrorType.DATA, ErrorCode.COMMON_REQUEST_MISS_MQP_UAC, str2);
                }
            }
            rpcRequestDataV2.mqp_bp = PluginManager.getRender().getEngineParams();
            rpcRequestDataV2.session = requestConfig.getSessionId();
            rpcRequestDataV2.mqp_apiver = requestConfig.getApiVersion();
            rpcRequestDataV2.extinfo = str;
            long elapsedRealtime6 = SystemClock.elapsedRealtime();
            rpcRequestDataV2.mqp_tid = TidStorage.getInstance().getTid();
            if (timingMsMap != null) {
                timingMsMap.put(TimingUtil.PreposeTimingEnum.TidTiming, Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime6));
            }
            JSONObject jSONObject2 = StringUtils.isEmpty(rpcRequestDataV2.extinfo) ? new JSONObject() : JSON.parseObject(rpcRequestDataV2.extinfo);
            if (jSONObject2.size() > 0) {
                str2 = jSONObject2.toString();
            }
            rpcRequestDataV2.extinfo = str2;
        }
        StEvent statisticEvent = requestConfig.getStatisticEvent();
        if (statisticEvent != null) {
            statisticEvent.onStatistic("action", rpcRequestDataV2.action);
        }
        return rpcRequestDataV2;
    }

    private static JSONObject a(JSONObject jSONObject, MspTradeContext mspTradeContext, String str, int i, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("36c2aa0b", new Object[]{jSONObject, mspTradeContext, str, new Integer(i), str2});
        }
        jSONObject.put(MspGlobalDefine.MSP_SWITCH_VERSION, (Object) DrmManager.getInstance(GlobalHelper.getInstance().getContext()).getVersion());
        LogUtil.record(2, "RpcRequestDecoratorForSdk:getVidataTime", "assembleOldExtInfo");
        String certsn = PhoneCashierMspEngine.getMspViSec().getCertsn();
        if (!StringUtils.isEmpty(certsn)) {
            jSONObject.put(MspGlobalDefine.CERTSN, (Object) certsn);
        }
        jSONObject.put("utdid", (Object) str2);
        jSONObject.put("agednessVersion", (Object) Boolean.valueOf(PhoneCashierMspEngine.getMspWallet().isUserAgednessVersion(i)));
        jSONObject.put("isLowDevice", (Object) Boolean.valueOf(MspLowDeviceManager.getInstance().isLowDevice()));
        if (!StringUtils.isEmpty(str)) {
            jSONObject.put("VIData", (Object) str);
        }
        jSONObject.put(MspGlobalDefine.LANG, (Object) Utils.getLocaleDesByFlag(PhoneCashierMspEngine.getMspBase().getMspLocale(PhoneCashierMspEngine.getMspWallet().getAlipayLocaleDes())));
        if (mspTradeContext != null) {
            String str3 = mspTradeContext.getAllExtendParamsMap().get(MspGlobalDefine.EXT_INSIDE_ENV);
            if (!StringUtils.isEmpty(str3)) {
                jSONObject.put(MspGlobalDefine.INSIDE_ENV, (Object) str3);
            }
            LogUtil.record(2, "RpcRequestDecoratorV2:getVidataTime", "extend map = " + mspTradeContext.getAllExtendParamsMap());
        }
        String join = StringUtils.join("|", FwUtils.concatList(FwUtils.concatList(ThirdPayManager.getAvailableThirdPayTypes(GlobalHelper.getInstance().getContext()), ThirdPayManager.getExternalProvidedThirdPayTypes(mspTradeContext)), ThirdPayManager.getListCupDirectApps()));
        if (!StringUtils.isEmpty(join)) {
            jSONObject.put("supported_3rd_pay", (Object) join);
        }
        LogUtil.record(2, "RpcRequestDecoratorV2:getVidataTime", "checkpoint before getBizInfo");
        Map<String, String> map = null;
        if (mspTradeContext != null) {
            try {
                map = mspTradeContext.getPaySession().getExtInfo();
            } catch (Throwable th) {
                LogUtil.printExceptionStackTrace(th);
            }
        }
        LogUtil.record(2, "RpcRequestDecoratorV2:getVidataTime", "extendInfo map = ".concat(String.valueOf(map)));
        if (map != null && map.size() > 0) {
            for (String str4 : map.keySet()) {
                if (!StringUtils.isEmpty(str4)) {
                    String str5 = map.get(str4);
                    if (!StringUtils.isEmpty(str5)) {
                        jSONObject.put(str4, (Object) str5);
                    }
                }
            }
            ApLinkTokenUtils.fixApLinkToken(jSONObject, i);
        }
        if (mspTradeContext != null) {
            try {
                if (!StringUtils.isEmpty(mspTradeContext.getAllExtendParamsMap().get("user_token")) && !jSONObject.containsKey("user_token")) {
                    jSONObject.put("user_token", (Object) mspTradeContext.getAllExtendParamsMap().get("user_token"));
                }
                if (!StringUtils.isEmpty(mspTradeContext.getAllExtendParamsMap().get("user_token_type")) && !jSONObject.containsKey("user_token_type")) {
                    jSONObject.put("user_token_type", (Object) mspTradeContext.getAllExtendParamsMap().get("user_token_type"));
                }
                if (!StringUtils.isEmpty(mspTradeContext.getAllExtendParamsMap().get(MspGlobalDefine.EXT_INSIDE_ENV)) && !jSONObject.containsKey(MspGlobalDefine.EXT_INSIDE_ENV)) {
                    jSONObject.put(MspGlobalDefine.EXT_INSIDE_ENV, (Object) mspTradeContext.getAllExtendParamsMap().get(MspGlobalDefine.EXT_INSIDE_ENV));
                }
            } catch (Throwable th2) {
                LogUtil.record(8, "fill_token", "failed to fill");
                LogUtil.printExceptionStackTrace(th2);
            }
        }
        return jSONObject;
    }

    private static JSONObject a(JSONObject jSONObject, MspTradeContext mspTradeContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("85081b02", new Object[]{jSONObject, mspTradeContext, str});
        }
        if (mspTradeContext == null) {
            return jSONObject;
        }
        MspExtInfoModel extInfoModel = mspTradeContext.getExtInfoModel();
        extInfoModel.setVIData(str);
        try {
            LogUtil.record(2, "Pbv2:", "new extInfo = " + JSONObject.toJSON(extInfoModel));
            jSONObject = JsonUtil.merge(jSONObject, (JSONObject) JSONObject.toJSON(extInfoModel));
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace(e);
            mspTradeContext.getStatisticInfo().addError(ErrorType.DEFAULT, "assembleExtInfoError", e);
        }
        LogUtil.record(2, "Pbv2:", "final extInfo = ".concat(String.valueOf(jSONObject)));
        jSONObject.remove("tc_verify_token");
        jSONObject.remove(MspGlobalDefine.INVOKE_FROM_SOURCE_KEY);
        jSONObject.remove(MspGlobalDefine.INVOKE_FROM_ID_KEY);
        jSONObject.remove(MspGlobalDefine.INVOKE_FROM_API_KEY);
        return jSONObject;
    }
}
