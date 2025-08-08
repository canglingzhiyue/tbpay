package com.alipay.android.msp.core;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import com.alibaba.ariver.kernel.RVConstants;
import com.alibaba.fastjson.JSON;
import com.alipay.android.msp.core.clients.MspWindowClient;
import com.alipay.android.msp.core.context.MspContext;
import com.alipay.android.msp.core.context.MspContextManager;
import com.alipay.android.msp.core.context.MspTradeContext;
import com.alipay.android.msp.core.frame.MspWindowFrame;
import com.alipay.android.msp.core.model.MQPBehaviorActionSeqModel;
import com.alipay.android.msp.core.model.MQPBehaviorRecordModel;
import com.alipay.android.msp.drivers.actions.ActionsCreator;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.drivers.actions.MspEventCreator;
import com.alipay.android.msp.drivers.actions.MspEventTypes;
import com.alipay.android.msp.framework.cache.MspCacheManager;
import com.alipay.android.msp.framework.db.MspDBHelper;
import com.alipay.android.msp.framework.db.MspDbManager;
import com.alipay.android.msp.framework.drm.DrmKey;
import com.alipay.android.msp.framework.drm.DrmManager;
import com.alipay.android.msp.framework.drm.FastStartActivityHelper;
import com.alipay.android.msp.framework.ext.MspExtSceneManager;
import com.alipay.android.msp.framework.helper.GlobalHelper;
import com.alipay.android.msp.framework.statisticsv2.Vector;
import com.alipay.android.msp.framework.statisticsv2.collector.TradeCollector;
import com.alipay.android.msp.framework.taskscheduler.TaskHelper;
import com.alipay.android.msp.plugin.IRender;
import com.alipay.android.msp.plugin.engine.IDataCollectorEngine;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.alipay.android.msp.plugin.manager.PluginManager;
import com.alipay.android.msp.utils.ApLinkTokenUtils;
import com.alipay.android.msp.utils.EventLogUtil;
import com.alipay.android.msp.utils.JsonUtil;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.android.msp.utils.ThreadSafeDateFormat;
import com.alipay.android.msp.utils.Utils;
import com.android.alibaba.ip.runtime.IpChange;
import com.flybird.FBDocument;
import com.taobao.android.weex_framework.util.a;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class AlertIntelligenceEngine {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_ACTION_EVENT = "act";
    public static final String ACTION_BACK_KEY = "back_key";
    public static final String ACTION_CLICK = "clk";
    public static final String ACTION_DIALOG_CONTENT = "dialog";
    public static final String ACTION_ERR_EXCEPTION = "err";
    public static final String ACTION_EVENT = "event";
    public static final String ACTION_EXIT = "exit";
    public static final String ACTION_EXPOSURE = "exp";
    public static final String ACTION_FEEDBACK = "feedback";
    public static final String ACTION_LOADING = "loading";
    public static final String ACTION_MAIN_SERVICE_RENDER_FINISH = "main_service_render_finish";
    public static final String ACTION_OPEN_WEB = "open_web";
    public static final String ACTION_PAGE_APPEAR = "page_appear";
    public static final String ACTION_PAGE_IN = "page_in";
    public static final String ACTION_PAGE_OUT = "page_out";
    public static final String ACTION_RPC_CASHIER_END = "rpc_cashier_end";
    public static final String ACTION_RPC_CASHIER_START = "rpc_cashier_start";
    public static final String ACTION_RPC_GENERAL_END = "rpc_general_end";
    public static final String ACTION_RPC_GENERAL_START = "rpc_general_start";
    public static final String ACTION_SERVICE_IN = "service_in";
    public static final String ACTION_SERVICE_OUT = "service_out";
    public static final String ACTION_SYNC = "sync";
    public static final String ACTION_SYSTEM_EVENT = "sys";
    public static final String ACTION_WEB_EXCEPTION = "web_err";

    /* renamed from: a  reason: collision with root package name */
    private static final BlockingDeque<MspContext> f4488a = new LinkedBlockingDeque();
    private static AlertIntelligenceEngine b;
    private final boolean c = !FastStartActivityHelper.getBoolConfig(GlobalHelper.getInstance().getContext(), DrmKey.DEGRADE_BEHAVIOR_LINK_V2);

    /* loaded from: classes3.dex */
    public static class AIDelegate implements IDataCollectorEngine.IJSApi {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final String f4499a;

        public AIDelegate(String str) {
            this.f4499a = str;
        }

        @Override // com.alipay.android.msp.plugin.engine.IDataCollectorEngine.IJSApi
        public JSONObject execute(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("349579b0", new Object[]{this, jSONObject});
            }
            try {
                MspContext mspContextByBizId = MspContextManager.getInstance().getMspContextByBizId(MspContextManager.getInstance().getLatestBizId());
                if (mspContextByBizId != null && jSONObject != null) {
                    com.alibaba.fastjson.JSONObject jSONObject2 = new com.alibaba.fastjson.JSONObject();
                    jSONObject2.put("name", (Object) this.f4499a);
                    jSONObject2.put("params", (Object) jSONObject.toString());
                    com.alibaba.fastjson.JSONObject jSONObject3 = new com.alibaba.fastjson.JSONObject();
                    jSONObject3.put("action", (Object) jSONObject2);
                    EventAction createMspEvent = MspEventCreator.get().createMspEvent("AIDelegate.execute", jSONObject3);
                    createMspEvent.setEventFrom("invoke");
                    String createEventActionThisThread = ActionsCreator.get(mspContextByBizId).createEventActionThisThread(createMspEvent);
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put("result", createEventActionThisThread);
                    return jSONObject4;
                }
                return null;
            } catch (Throwable th) {
                LogUtil.printExceptionStackTrace(th);
                return null;
            }
        }
    }

    public AlertIntelligenceEngine() {
        if (this.c) {
            MspDbManager.getDbManager().setEnableBehaviorManager(false);
            registerApi();
        }
    }

    public static AlertIntelligenceEngine getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AlertIntelligenceEngine) ipChange.ipc$dispatch("54674afa", new Object[0]);
        }
        if (b == null) {
            synchronized (AlertIntelligenceEngine.class) {
                if (b == null) {
                    b = new AlertIntelligenceEngine();
                }
            }
        }
        return b;
    }

    public boolean byLogicContext() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("58761ef3", new Object[]{this})).booleanValue() : this.c;
    }

    public boolean enable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("70c6308e", new Object[]{this})).booleanValue() : this.c || MspDbManager.getDbManager().isEnableBehaviorManager();
    }

    private static void a(Map<String, String> map, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38873cb1", new Object[]{map, str, str2});
        } else if (map == null || StringUtils.isEmpty(str) || StringUtils.isEmpty(str2)) {
        } else {
            map.put(str, str2);
        }
    }

    public void registerApi() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7849d7e", new Object[]{this});
        } else {
            PhoneCashierMspEngine.getDataCollectorEngine().registerJSApi(MspEventTypes.ACTION_INVOKE_GATHER_USER_FEEDBACK, new AIDelegate(MspEventTypes.ACTION_INVOKE_GATHER_USER_FEEDBACK));
        }
    }

    public String genToken() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4dac4210", new Object[]{this}) : PhoneCashierMspEngine.getDataCollectorEngine().newInstance("payservice");
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0281 A[Catch: Throwable -> 0x0294, TryCatch #1 {Throwable -> 0x0294, blocks: (B:47:0x0231, B:69:0x0273, B:72:0x0286, B:70:0x027a, B:71:0x0281, B:54:0x024b, B:57:0x0255, B:60:0x025e), top: B:80:0x0231 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void recordBizInfo(com.alipay.android.msp.core.context.MspContext r11, java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 786
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.msp.core.AlertIntelligenceEngine.recordBizInfo(com.alipay.android.msp.core.context.MspContext, java.lang.String):void");
    }

    @Deprecated
    public static void recordBizInfoFirst(MspContext mspContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("713655bd", new Object[]{mspContext});
        } else if (getInstance().byLogicContext() || !MspDbManager.getDbManager().isEnableBehaviorManager()) {
        } else {
            HashMap hashMap = new HashMap(16);
            hashMap.put("trace", mspContext.getAlertIntelligenceId());
            hashMap.put("uid", PhoneCashierMspEngine.getMspWallet().getUserId());
            hashMap.put("utdid", mspContext.getStatisticInfo().getAttr(Vector.Id, "utdid"));
            hashMap.put("app_name", mspContext.getStatisticInfo().getAttr(Vector.App, "appName"));
            hashMap.put("app_ver", mspContext.getStatisticInfo().getAttr(Vector.App, "appVersion"));
            hashMap.put(MspDBHelper.BizEntry.COLUMN_NAME_EXT_APP, mspContext.getStatisticInfo().getAttr(Vector.App, "extAppInfo"));
            hashMap.put("platform", mspContext.getStatisticInfo().getAttr(Vector.Sdk, "sdkPlatform"));
            hashMap.put("sdk_type", mspContext.getStatisticInfo().getAttr(Vector.Sdk, "sdkType"));
            hashMap.put("sdk_ver", mspContext.getStatisticInfo().getAttr(Vector.Sdk, "sdkVersion"));
            hashMap.put("locale", mspContext.getStatisticInfo().getAttr(Vector.Device, "location"));
            hashMap.put(MspDBHelper.BizEntry.COLUMN_NAME_DEVICE, mspContext.getStatisticInfo().getAttr(Vector.Device, "model"));
            hashMap.put("os_ver", mspContext.getStatisticInfo().getAttr(Vector.Device, "osVersion"));
            hashMap.put("net_type", mspContext.getStatisticInfo().getAttr(Vector.Device, "network"));
            hashMap.put("biz_type", "-");
            String format = ThreadSafeDateFormat.format(new Date(), "yyyy-MM-dd HH:mm:ss:SSS");
            hashMap.put("hh", format.substring(11, 13));
            hashMap.put("ds", format.substring(2, 4) + format.substring(5, 7) + format.substring(8, 10));
            hashMap.put("time", format);
            recordBizInfo(mspContext, hashMap);
        }
    }

    @Deprecated
    public static void recordBizInfoSecond(MspContext mspContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a014eb", new Object[]{mspContext, str});
        } else if (getInstance().byLogicContext() || !MspDbManager.getDbManager().isEnableBehaviorManager() || mspContext == null) {
        } else {
            HashMap hashMap = new HashMap(8);
            hashMap.put("trace", mspContext.getAlertIntelligenceId());
            if (!StringUtils.isEmpty(str)) {
                hashMap.put("session_id", str);
            }
            String bizType = TradeCollector.getBizType(mspContext.getBizId());
            String format = ThreadSafeDateFormat.format(new Date(), "yyyy-MM-dd HH:mm:ss:SSS");
            hashMap.put("hh", format.substring(11, 13));
            hashMap.put("ds", format.substring(2, 4) + format.substring(5, 7) + format.substring(8, 10));
            hashMap.put("time", format);
            hashMap.put("biz_type", bizType);
            recordBizInfo(mspContext, hashMap);
        }
    }

    @Deprecated
    public static void recordBizInfoSecond(MspContext mspContext, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28beac04", new Object[]{mspContext, map});
        } else if (getInstance().byLogicContext() || Utils.getDegradeKey(DrmKey.DEGRADE_NO_CLIENT_LOG_DATA, mspContext) || !MspDbManager.getDbManager().isEnableBehaviorManager() || mspContext == null) {
        } else {
            HashMap hashMap = new HashMap(8);
            hashMap.put("trace", mspContext.getAlertIntelligenceId());
            if (map != null && !map.isEmpty()) {
                hashMap.put("ext1", JsonUtil.map2Json(map).toString());
            }
            String bizType = TradeCollector.getBizType(mspContext.getBizId());
            String format = ThreadSafeDateFormat.format(new Date(), "yyyy-MM-dd HH:mm:ss:SSS");
            hashMap.put("hh", format.substring(11, 13));
            hashMap.put("ds", format.substring(2, 4) + format.substring(5, 7) + format.substring(8, 10));
            hashMap.put("time", format);
            hashMap.put("biz_type", bizType);
            recordBizInfo(mspContext, hashMap);
        }
    }

    @Deprecated
    public static void recordBizInfoThird(MspContext mspContext, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be685bfa", new Object[]{mspContext, str, str2, str3, str4, str5, str6, str7});
        } else if (getInstance().byLogicContext() || !MspDbManager.getDbManager().isEnableBehaviorManager()) {
        } else {
            HashMap hashMap = new HashMap(8);
            hashMap.put("trace", mspContext.getAlertIntelligenceId());
            if (!StringUtils.isEmpty(str)) {
                hashMap.put("trade_no", str);
            }
            if (!StringUtils.isEmpty(str2)) {
                hashMap.put("session_id", str2);
            }
            if (!StringUtils.isEmpty(str3)) {
                hashMap.put("out_trade_no", str3);
            }
            if (!StringUtils.isEmpty(str4)) {
                hashMap.put(MspDBHelper.BizEntry.COLUMN_NAME_PID, str4);
            }
            if (!StringUtils.isEmpty(str5)) {
                hashMap.put("biz_type", str5);
            }
            if (!StringUtils.isEmpty(str6)) {
                hashMap.put("end_code", str6);
            }
            if (!StringUtils.isEmpty(str7)) {
                hashMap.put(MspDBHelper.BizEntry.COLUMN_NAME_END_PAGE, str7);
            }
            try {
                if (!Utils.getDegradeKey(DrmKey.degrade_behavior_ext2, mspContext)) {
                    HashMap hashMap2 = new HashMap(8);
                    MspExtSceneManager mspExtSceneManager = MspExtSceneManager.getInstance(mspContext.getContext());
                    hashMap2.put(ApLinkTokenUtils.EXT_SCENE_AGEDNESS_VERSION, String.valueOf(PhoneCashierMspEngine.getMspWallet().isUserAgednessVersion(mspContext.getBizId())));
                    hashMap2.put(ApLinkTokenUtils.EXT_SCENE_ACCESSIBILITY, mspExtSceneManager.isAccessibilityEnabled());
                    hashMap2.put(ApLinkTokenUtils.EXT_SCENE_BIG_SCREEN, mspExtSceneManager.isBigScreen());
                    hashMap2.put("deviceLevel", String.valueOf(PhoneCashierMspEngine.getMspWallet().getDevicePerformanceLevel()));
                    hashMap.put("ext2", JsonUtil.map2Json(hashMap2).toString());
                }
            } catch (Throwable th) {
                LogUtil.printExceptionStackTrace(th);
            }
            String format = ThreadSafeDateFormat.format(new Date(), "yyyy-MM-dd HH:mm:ss:SSS");
            hashMap.put("hh", format.substring(11, 13));
            hashMap.put("ds", format.substring(2, 4) + format.substring(5, 7) + format.substring(8, 10));
            hashMap.put("time", format);
            recordBizInfo(mspContext, hashMap);
        }
    }

    @Deprecated
    public static void recordBizInfo(MspContext mspContext, final Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af7c1918", new Object[]{mspContext, map});
        } else if (mspContext == null || mspContext.getContext() == null || map == null || !MspDbManager.getDbManager().isEnableBehaviorManager()) {
        } else {
            LogUtil.record(2, "AlertIntelligenceEngine:recordBizInfo", "extInfo=" + Utils.map2string(map) + ", extInfoSize=" + map.size());
            TaskHelper.executeForAI(new Runnable() { // from class: com.alipay.android.msp.core.AlertIntelligenceEngine.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        MspDbManager.getDbManager().saveBiz(map, new MspDbManager.MspDBSaveCallback() { // from class: com.alipay.android.msp.core.AlertIntelligenceEngine.2.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // com.alipay.android.msp.framework.db.MspDbManager.MspDBSaveCallback
                            public void onDataSaveSuccess() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("e809a7e4", new Object[]{this});
                                } else {
                                    LogUtil.record(2, "AlertIntelligenceEngine:recordBizInfo", "onDataSaveSuccess");
                                }
                            }

                            @Override // com.alipay.android.msp.framework.db.MspDbManager.MspDBSaveCallback
                            public void onDataSaveError(Throwable th) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("6236d1ac", new Object[]{this, th});
                                } else {
                                    LogUtil.record(2, "AlertIntelligenceEngine:recordBizInfo", "onDataSaveError".concat(String.valueOf(th)));
                                }
                            }
                        });
                    }
                }
            });
            if (!MspDbManager.getDbManager().isEnableBehaviorActionUpload()) {
                return;
            }
            try {
                HashMap hashMap = new HashMap(16);
                hashMap.putAll(map);
                hashMap.put("event_type", "biz");
                com.alibaba.fastjson.JSONObject jSONObject = new com.alibaba.fastjson.JSONObject(hashMap);
                LogUtil.record(2, "AlertIntelligenceEngine:recordBizInfo", "data=" + jSONObject.toJSONString());
                EventLogUtil.logPayEvent("1010413", JsonUtil.strJson2StringMap(jSONObject.toJSONString()));
            } catch (Throwable th) {
                LogUtil.printExceptionStackTrace(th);
            }
        }
    }

    public static void startAction(MspContext mspContext, final String str, final String str2, final String str3, String str4, String str5, String str6) {
        String str7;
        String str8;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d1482f1", new Object[]{mspContext, str, str2, str3, str4, str5, str6});
        } else if (mspContext != null && mspContext.getContext() != null && str != null) {
            if (!getInstance().byLogicContext()) {
                startActionForMainService(mspContext, str, str2, str3, str4, str5, str6);
                return;
            }
            String alertIntelligenceId = mspContext.getAlertIntelligenceId();
            final String alertIntelligenceToken = mspContext.getAlertIntelligenceToken();
            if (StringUtils.isEmpty(alertIntelligenceToken)) {
                LogUtil.record(8, "AlertIntelligenceEngine.startAction", "token=".concat(String.valueOf(alertIntelligenceToken)));
                return;
            }
            StringBuilder sb = new StringBuilder();
            synchronized (AlertIntelligenceEngine.class) {
                if ("service_in".equals(str)) {
                    f4488a.push(mspContext);
                }
                for (MspContext mspContext2 : f4488a) {
                    sb.append(mspContext2.getBizId());
                }
                if ("service_out".equals(str)) {
                    f4488a.remove(mspContext);
                }
            }
            if (mspContext.getMspUIClient() != null) {
                MspWindowClient mspWindowClient = (MspWindowClient) mspContext.getMspUIClient();
                MspWindowFrame currentWindowFrame = mspWindowClient != null ? mspWindowClient.getCurrentWindowFrame() : null;
                str7 = (currentWindowFrame == null || !StringUtils.isEmpty(str4)) ? str4 : currentWindowFrame.getFrameId();
                if (currentWindowFrame != null && StringUtils.isEmpty(str5)) {
                    str8 = currentWindowFrame.getTplId();
                    final String[] strArr = {alertIntelligenceId, str7, str8, sb.toString(), str6};
                    LogUtil.i("AlertIntelligenceEngine", RVConstants.EXTRA_PREPARE_START_ACTION, "trace=" + StringUtils.join(",", strArr));
                    TaskHelper.executeForAI(new Runnable() { // from class: com.alipay.android.msp.core.AlertIntelligenceEngine.3
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            try {
                                PhoneCashierMspEngine.getDataCollectorEngine().addFlowNode("payservice", alertIntelligenceToken, str, str2, StringUtils.isEmpty(str3) ? "" : str3, strArr);
                            } catch (Throwable th) {
                                LogUtil.printExceptionStackTrace(th);
                            }
                        }
                    });
                    if (!"service_out".equals(str) || !(mspContext instanceof MspTradeContext)) {
                    }
                    MspTradeContext mspTradeContext = (MspTradeContext) mspContext;
                    try {
                        mspTradeContext.getStatisticInfo().updateResult(mspTradeContext.getMspPayResult().formatResult(3), mspTradeContext.getCurrentWinTpName());
                        return;
                    } catch (Throwable th) {
                        LogUtil.printExceptionStackTrace(th);
                        return;
                    }
                }
            } else {
                str7 = str4;
            }
            str8 = str5;
            final String[] strArr2 = {alertIntelligenceId, str7, str8, sb.toString(), str6};
            LogUtil.i("AlertIntelligenceEngine", RVConstants.EXTRA_PREPARE_START_ACTION, "trace=" + StringUtils.join(",", strArr2));
            TaskHelper.executeForAI(new Runnable() { // from class: com.alipay.android.msp.core.AlertIntelligenceEngine.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        PhoneCashierMspEngine.getDataCollectorEngine().addFlowNode("payservice", alertIntelligenceToken, str, str2, StringUtils.isEmpty(str3) ? "" : str3, strArr2);
                    } catch (Throwable th2) {
                        LogUtil.printExceptionStackTrace(th2);
                    }
                }
            });
            if (!"service_out".equals(str)) {
            }
        }
    }

    @Deprecated
    public static void startActionForMainService(MspContext mspContext, String str, String str2, String str3, String str4, String str5, String str6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0942b44", new Object[]{mspContext, str, str2, str3, str4, str5, str6});
        } else if (mspContext != null && mspContext.getContext() != null && str != null && MspDbManager.getDbManager().isEnableBehaviorManager()) {
            StringBuilder sb = new StringBuilder();
            synchronized (AlertIntelligenceEngine.class) {
                if ("service_in".equals(str)) {
                    f4488a.push(mspContext);
                }
                for (MspContext mspContext2 : f4488a) {
                    sb.append(mspContext2.getBizId());
                }
                if ("service_out".equals(str)) {
                    f4488a.remove(mspContext);
                }
            }
            if (mspContext.getMspUIClient() != null) {
                MspWindowFrame currentWindowFrame = ((MspWindowClient) mspContext.getMspUIClient()).getCurrentWindowFrame();
                if (currentWindowFrame != null && StringUtils.isEmpty(str4)) {
                    str4 = currentWindowFrame.getFrameId();
                }
                if (currentWindowFrame != null && StringUtils.isEmpty(str5)) {
                    str5 = currentWindowFrame.getTplId();
                }
            }
            final MQPBehaviorActionSeqModel mQPBehaviorActionSeqModel = new MQPBehaviorActionSeqModel();
            mQPBehaviorActionSeqModel.setTrace(mspContext.getAlertIntelligenceId());
            mQPBehaviorActionSeqModel.setUid(PhoneCashierMspEngine.getMspWallet().getUserId());
            mQPBehaviorActionSeqModel.setAct_type(str);
            mQPBehaviorActionSeqModel.setAct_name(str2 == null ? "" : str2);
            if (str3 == null) {
                str3 = "";
            }
            mQPBehaviorActionSeqModel.setAct_params(str3);
            if (str4 == null) {
                str4 = "";
            }
            mQPBehaviorActionSeqModel.setPage_id(str4);
            if (str5 == null) {
                str5 = "";
            }
            mQPBehaviorActionSeqModel.setPage_name(str5);
            mQPBehaviorActionSeqModel.setService_stack(sb.toString());
            if (!StringUtils.isEmpty(str6)) {
                mQPBehaviorActionSeqModel.setExt(str6);
            }
            String format = ThreadSafeDateFormat.format(new Date(), "yyyy-MM-dd HH:mm:ss:SSS");
            mQPBehaviorActionSeqModel.setHh(format.substring(11, 13));
            mQPBehaviorActionSeqModel.setDs(format.substring(2, 4) + format.substring(5, 7) + format.substring(8, 10));
            mQPBehaviorActionSeqModel.setTime(format);
            LogUtil.record(2, "AlertIntelligenceEngine:startAction", "actionSeqModel=".concat(String.valueOf(mQPBehaviorActionSeqModel)));
            TaskHelper.executeForAI(new Runnable() { // from class: com.alipay.android.msp.core.AlertIntelligenceEngine.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        MspDbManager.getDbManager().saveAction(MQPBehaviorActionSeqModel.this, new MspDbManager.MspDBSaveCallback() { // from class: com.alipay.android.msp.core.AlertIntelligenceEngine.4.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // com.alipay.android.msp.framework.db.MspDbManager.MspDBSaveCallback
                            public void onDataSaveSuccess() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("e809a7e4", new Object[]{this});
                                } else {
                                    LogUtil.record(2, "AlertIntelligenceEngine:startAction", "onDataSaveSuccess");
                                }
                            }

                            @Override // com.alipay.android.msp.framework.db.MspDbManager.MspDBSaveCallback
                            public void onDataSaveError(Throwable th) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("6236d1ac", new Object[]{this, th});
                                } else {
                                    LogUtil.record(2, "AlertIntelligenceEngine:startAction", "onDataSaveError".concat(String.valueOf(th)));
                                }
                            }
                        });
                    } catch (Throwable th) {
                        LogUtil.printExceptionStackTrace(th);
                    }
                }
            });
            if ("sys".equals(str) && str2 != null && str2.endsWith("_onStop")) {
                a(mspContext, "document.onSysAction", mspContext.getStatisticInfo().getRecordFormat());
            } else if ("service_out".equals(str)) {
                if (mspContext instanceof MspTradeContext) {
                    MspTradeContext mspTradeContext = (MspTradeContext) mspContext;
                    try {
                        mspTradeContext.getStatisticInfo().updateResult(mspTradeContext.getMspPayResult().formatResult(3), mspTradeContext.getCurrentWinTpName());
                    } catch (Throwable th) {
                        LogUtil.printExceptionStackTrace(th);
                    }
                }
                a(mspContext, "document.onServiceOut", mspContext.getStatisticInfo().getRecordFormat());
            } else if (ACTION_MAIN_SERVICE_RENDER_FINISH.equals(str)) {
                a(mspContext, "document.onServiceIn", "");
            }
            if (!MspDbManager.getDbManager().isEnableBehaviorActionUpload()) {
                return;
            }
            try {
                com.alibaba.fastjson.JSONObject jSONObject = (com.alibaba.fastjson.JSONObject) JSON.toJSON(mQPBehaviorActionSeqModel);
                LogUtil.record(2, "AlertIntelligenceEngine:startAction", "actionType=" + str + " , data=" + jSONObject.toJSONString());
                Map<String, String> strJson2StringMap = JsonUtil.strJson2StringMap(jSONObject.toJSONString());
                strJson2StringMap.put("event_type", "action");
                EventLogUtil.logPayEvent("1010413", strJson2StringMap);
            } catch (Throwable th2) {
                LogUtil.printExceptionStackTrace(th2);
            }
        }
    }

    public static void startAction(MspContext mspContext, String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("305224e7", new Object[]{mspContext, str, str2, str3, str4, str5});
        } else {
            startAction(mspContext, str, str2, str3, str4, str5, null);
        }
    }

    public static void startAction(MspContext mspContext, String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1415785d", new Object[]{mspContext, str, str2, str3, str4});
        } else {
            startAction(mspContext, str, str2, null, str3, str4);
        }
    }

    @Deprecated
    private static void a(final MspContext mspContext, final String str, String str2) {
        int ordinalIndexOf;
        String substring;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f1963f2", new Object[]{mspContext, str, str2});
            return;
        }
        final com.alibaba.fastjson.JSONObject jSONObject = new com.alibaba.fastjson.JSONObject();
        jSONObject.put("trace", (Object) mspContext.getAlertIntelligenceId());
        int i = 8192;
        com.alibaba.fastjson.JSONObject drmValueFromKey = DrmManager.getInstance(mspContext.getContext()).getDrmValueFromKey(DrmKey.QUICK_LOG_LENGTH);
        if (drmValueFromKey != null && drmValueFromKey.containsKey(a.ATOM_length)) {
            i = drmValueFromKey.getInteger(a.ATOM_length).intValue();
        }
        if (StringUtils.isEmpty(str2)) {
            jSONObject.put("data", (Object) "");
        } else if (str2.length() > i) {
            try {
                if (Utils.ordinalIndexOf(str2, "),(", 7) != -1) {
                    substring = str2.substring(0, ordinalIndexOf) + "),(";
                } else {
                    substring = str2.substring(0, 800);
                }
                int i2 = i - 1000;
                if (str2.length() - substring.length() > i2) {
                    jSONObject.put("data", (Object) (substring + str2.substring(str2.length() - i2)));
                } else {
                    jSONObject.put("data", (Object) substring);
                }
            } catch (Throwable th) {
                LogUtil.printExceptionStackTrace(th);
            }
        } else {
            jSONObject.put("data", (Object) str2);
        }
        TaskHelper.runOnUIThread(new Runnable() { // from class: com.alipay.android.msp.core.AlertIntelligenceEngine.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    FBDocument workerServiceDoc = MspContext.this.getWorkerServiceDoc();
                    if (workerServiceDoc == null) {
                        return;
                    }
                    String str3 = str + "&&" + str + "('" + Utils.toJsJsonString(jSONObject.toJSONString()) + "')";
                    LogUtil.record(2, "AI:invokeMainService", "string=" + str3 + ", result = " + workerServiceDoc.executeJs(str3));
                } catch (Throwable th2) {
                    LogUtil.printExceptionStackTrace(th2);
                }
            }
        });
    }

    @Deprecated
    public static void startRecord(MspContext mspContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9ffb19a", new Object[]{mspContext, str});
        } else if (mspContext == null || mspContext.getContext() == null || getInstance().byLogicContext() || !MspDbManager.getDbManager().isEnableBehaviorManager()) {
        } else {
            final MQPBehaviorRecordModel mQPBehaviorRecordModel = new MQPBehaviorRecordModel();
            mQPBehaviorRecordModel.setTrace(mspContext.getAlertIntelligenceId());
            mQPBehaviorRecordModel.setUid(PhoneCashierMspEngine.getMspWallet().getUserId());
            mQPBehaviorRecordModel.setUtdid(GlobalHelper.getInstance().getUtdid(mspContext.getContext()));
            if (mspContext instanceof MspTradeContext) {
                mQPBehaviorRecordModel.setTrade_no(((MspTradeContext) mspContext).getTradeNo());
            }
            if (str == null) {
                str = "";
            }
            mQPBehaviorRecordModel.setScene_name(str);
            String format = ThreadSafeDateFormat.format(new Date(), "yyyy-MM-dd HH:mm:ss:SSS");
            mQPBehaviorRecordModel.setHh(format.substring(11, 13));
            mQPBehaviorRecordModel.setDs(format.substring(2, 4) + format.substring(5, 7) + format.substring(8, 10));
            mQPBehaviorRecordModel.setTime(format);
            LogUtil.record(2, "AlertIntelligenceEngine:startRecord", "recordModel=".concat(String.valueOf(mQPBehaviorRecordModel)));
            TaskHelper.executeForAI(new Runnable() { // from class: com.alipay.android.msp.core.AlertIntelligenceEngine.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        MspDbManager.getDbManager().saveRecord(MQPBehaviorRecordModel.this, new MspDbManager.MspDBSaveCallback() { // from class: com.alipay.android.msp.core.AlertIntelligenceEngine.6.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // com.alipay.android.msp.framework.db.MspDbManager.MspDBSaveCallback
                            public void onDataSaveSuccess() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("e809a7e4", new Object[]{this});
                                } else {
                                    LogUtil.record(2, "AlertIntelligenceEngine:startRecord", "onDataSaveSuccess");
                                }
                            }

                            @Override // com.alipay.android.msp.framework.db.MspDbManager.MspDBSaveCallback
                            public void onDataSaveError(Throwable th) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("6236d1ac", new Object[]{this, th});
                                } else {
                                    LogUtil.record(2, "AlertIntelligenceEngine:startRecord", "onDataSaveError".concat(String.valueOf(th)));
                                }
                            }
                        });
                    } catch (Throwable th) {
                        LogUtil.printExceptionStackTrace(th);
                    }
                }
            });
        }
    }

    public static void onAddGlobalError(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50e5c79e", new Object[]{str, str2});
            return;
        }
        MspContext mspContextByBizId = MspContextManager.getInstance().getMspContextByBizId(MspContextManager.getInstance().getLatestBizId());
        if (mspContextByBizId == null) {
            return;
        }
        startAction(mspContextByBizId, "err", str + "_" + str2, "", "");
    }

    public static void injectJsCode(final Context context, final String str, final View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4444e", new Object[]{context, str, view});
        } else {
            TaskHelper.runOnUIThreadAsFast(new Runnable() { // from class: com.alipay.android.msp.core.AlertIntelligenceEngine.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    com.alibaba.fastjson.JSONObject parseObject;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        if (!DrmManager.getInstance(context).isGray(DrmKey.GRAY_BN_PROB, false, context)) {
                            return;
                        }
                        String readCache = MspCacheManager.getInstance().readCache("BN_probe", new String[]{str}, true);
                        StringBuilder sb = new StringBuilder("currentTplId:");
                        sb.append(str);
                        sb.append("jsCodeCache:");
                        String str2 = "NULL";
                        sb.append(StringUtils.isEmpty(readCache) ? str2 : readCache);
                        LogUtil.record(2, "BN_probe#injectJsCode", sb.toString());
                        if (StringUtils.isEmpty(readCache) || (parseObject = JSON.parseObject(readCache)) == null || !parseObject.containsKey(str)) {
                            return;
                        }
                        String string = parseObject.getString(str);
                        if (!StringUtils.isEmpty(string)) {
                            str2 = string;
                        }
                        LogUtil.record(2, "BN_probe#excuteJs", str2);
                        IRender render = PluginManager.getRender();
                        View view2 = view;
                        render.callExecuteJs(view2, "window.setTimeout(function(){try{" + string + "}catch(e){}}, 100)");
                    } catch (Throwable th) {
                        LogUtil.printExceptionStackTrace(th);
                    }
                }
            });
        }
    }
}
