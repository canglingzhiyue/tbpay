package com.alipay.android.msp.core;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.app.birdnest.api.MspConstants;
import com.alipay.android.msp.biz.substitute.SpmHelper;
import com.alipay.android.msp.constants.MspFlybirdDefine;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.alipay.android.msp.core.context.MspContext;
import com.alipay.android.msp.core.context.MspContextManager;
import com.alipay.android.msp.core.context.MspTradeContext;
import com.alipay.android.msp.core.section.MqpBehavior;
import com.alipay.android.msp.drivers.actions.ActionsCreator;
import com.alipay.android.msp.drivers.stores.store.events.CacheStore;
import com.alipay.android.msp.framework.cache.MspCacheManager;
import com.alipay.android.msp.framework.helper.GlobalHelper;
import com.alipay.android.msp.framework.helper.MspExperimentHelper;
import com.alipay.android.msp.framework.statisticsv2.StatisticInfo;
import com.alipay.android.msp.framework.statisticsv2.Vector;
import com.alipay.android.msp.framework.statisticsv2.model.StEvent;
import com.alipay.android.msp.framework.statisticsv2.value.CountValue;
import com.alipay.android.msp.network.model.RequestConfig;
import com.alipay.android.msp.pay.TradeLogicData;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.alipay.android.msp.utils.BroadcastUtil;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.android.msp.utils.MspContextUtil;
import com.alipay.mobile.beehive.eventbus.EventBusManager;
import com.android.alibaba.ip.runtime.IpChange;
import tb.sft;

/* loaded from: classes3.dex */
public class MspNetHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String KEY_GRAY_SYNC_RENDER_SUPPORT = "MQP_gray_sync_render_support";
    private int mBizId;
    private volatile boolean mHasShownSyncResult;
    private String mSyncResult;
    private String mNetErrorCode = null;
    private boolean mNetError = false;
    private JSONObject mLastSubmitAction = null;
    private boolean mHasGetGraySyncRenderSupport = false;
    private String mStringGraySyncRenderSupport = null;
    private boolean mGraySyncRenderSupport = false;
    private boolean mNeedNeec = false;
    private String mNeecCode = "";

    public MspNetHandler(MspContext mspContext) {
        this.mBizId = mspContext.getBizId();
    }

    public String getErrorCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f72feefa", new Object[]{this});
        }
        if (this.mNetError) {
            return this.mNetErrorCode;
        }
        if (!this.mNeedNeec) {
            return null;
        }
        return this.mNeecCode;
    }

    public boolean hasNeecCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d8dfcb67", new Object[]{this})).booleanValue() : !StringUtils.isEmpty(this.mNeecCode);
    }

    public void setNeedNeec(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3954e80", new Object[]{this, new Boolean(z)});
        } else {
            this.mNeedNeec = z;
        }
    }

    public void setNeecCode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c43ade35", new Object[]{this, str});
        } else {
            this.mNeecCode = str;
        }
    }

    public void setNetErrorCode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e700778b", new Object[]{this, str});
        } else {
            this.mNetErrorCode = str;
        }
    }

    public void setNetError(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22bcfa60", new Object[]{this, new Boolean(z)});
        } else {
            this.mNetError = z;
        }
    }

    private void setSyncResult(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("690a9fab", new Object[]{this, str});
        } else {
            this.mSyncResult = str;
        }
    }

    public void setLastSubmitAction(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66918863", new Object[]{this, jSONObject});
        } else {
            this.mLastSubmitAction = jSONObject;
        }
    }

    public JSONObject getLastSubmitAction() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("62de6441", new Object[]{this});
        }
        if (!this.mNetError) {
            return null;
        }
        return this.mLastSubmitAction;
    }

    public static synchronized void onReceiveSyncF2FResult(String str) {
        synchronized (MspNetHandler.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("98de7c89", new Object[]{str});
                return;
            }
            LogUtil.record(2, "MspNetHandler:onReceiveSyncF2FResult", "sync=".concat(String.valueOf(str)));
            StatisticInfo statisticInfo = new StatisticInfo(-1);
            statisticInfo.updateAttr(Vector.Trade, "bizType", "sync");
            if (StringUtils.isEmpty(str)) {
                LogUtil.record(4, "msp", "MspNetHandler:onReceiveSyncF2FResult", sft.LIVE_ALGO_FAILURE_RESULT_ISNULL_ERROR);
                return;
            }
            processChannelCacheOnly(str, statisticInfo);
            statisticInfo.onStatisticEnd();
        }
    }

    private static void processChannelCacheOnly(String str, StatisticInfo statisticInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eebf0efb", new Object[]{str, statisticInfo});
            return;
        }
        String userId = MspContextUtil.getUserId();
        MspCacheManager mspCacheManager = MspCacheManager.getInstance();
        try {
            JSONObject parseObject = JSON.parseObject(mspCacheManager.readCache(MspConstants.MQP_CHANNEL_MAIN, null, true));
            if (parseObject != null) {
                writeCacheByUid(mspCacheManager, userId, MspConstants.MQP_CHANNEL_MAIN_CACHE, parseObject.get(userId));
            }
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
        JSONObject parseObject2 = JSON.parseObject(str);
        parseObject2.put("_syncReceiveTime", (Object) Long.valueOf(System.currentTimeMillis()));
        writeCacheByUid(mspCacheManager, userId, MspConstants.MQP_CHANNEL_SYNC_CACHE, parseObject2);
        writeCacheByUid(mspCacheManager, userId, MspConstants.MQP_CHANNEL_CUSTOM_ORDER, null);
        writeCacheByUid(mspCacheManager, userId, MspConstants.MQP_CHANNEL_LIST, null);
        writeCacheByUid(mspCacheManager, userId, MspConstants.MQP_CHANNEL_MAIN, null);
        BroadcastUtil.sendChannelOrderChangedBroadcast(GlobalHelper.getInstance().getContext());
    }

    private static void writeCacheByUid(MspCacheManager mspCacheManager, String str, String str2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7288d181", new Object[]{mspCacheManager, str, str2, obj});
            return;
        }
        JSONObject jSONObject = null;
        try {
            jSONObject = JSON.parseObject(mspCacheManager.readCache(str2, null, true, true));
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (obj == null) {
            jSONObject.remove(str);
        } else {
            jSONObject.put(str, obj);
        }
        mspCacheManager.writeCache(str2, jSONObject.toJSONString(), true, true, true);
    }

    public static synchronized void onReceiveSyncPayResult(String str) {
        JSONObject jSONObject;
        synchronized (MspNetHandler.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c49456f7", new Object[]{str});
                return;
            }
            LogUtil.record(2, "MspNetHandler:onReceiveSyncPayResult", "sync=".concat(String.valueOf(str)));
            if (StringUtils.isEmpty(str)) {
                LogUtil.record(4, "msp", "MspNetHandler:onReceiveSyncPayResult", sft.LIVE_ALGO_FAILURE_RESULT_ISNULL_ERROR);
                return;
            }
            JSONObject parseObject = JSONObject.parseObject(str);
            if (parseObject != null && parseObject.containsKey("payResult") && (jSONObject = parseObject.getJSONObject("payResult")) != null && jSONObject.containsKey("params")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("params");
                int intValue = (jSONObject2 == null || !jSONObject2.containsKey("synch")) ? 0 : jSONObject2.getIntValue("synch");
                if (intValue == 0) {
                    return;
                }
                MspContext mspContextByBizId = MspContextManager.getInstance().getMspContextByBizId(intValue);
                if (mspContextByBizId == null) {
                    return;
                }
                mspContextByBizId.getStatisticInfo().addEvent(new StEvent(mspContextByBizId.getCurrentWinTpName(), "sync", CountValue.C_SYNC_PAY_RESULT));
                MspNetHandler mspNetHandler = mspContextByBizId.getMspNetHandler();
                if (mspNetHandler == null) {
                    return;
                }
                if (mspNetHandler.isShowSyncPayResult()) {
                    LogUtil.record(2, "MspNetHandler:onReceiveSyncPayResult", "isShowSyncPayResult=true");
                    return;
                }
                if (mspNetHandler.isGraySyncRenderSupport()) {
                    mspNetHandler.setSyncResult(jSONObject2.toString());
                    mspNetHandler.showSyncPayResultView(false);
                    String str2 = "-";
                    if (jSONObject2.containsKey("result")) {
                        str2 = jSONObject2.getString("result");
                    }
                    MqpBehavior.getInstance().onSync(mspContextByBizId, str2);
                } else {
                    mspNetHandler.setSyncResult(jSONObject2.toString());
                    MspTradeContext tradeContextByBizId = MspContextManager.getInstance().getTradeContextByBizId(intValue);
                    String str3 = "-";
                    if (jSONObject2.containsKey("result")) {
                        str3 = jSONObject2.getString("result");
                    }
                    MqpBehavior.getInstance().onSync(mspContextByBizId, str3);
                    if (tradeContextByBizId != null && tradeContextByBizId.isSubmitState()) {
                        mspNetHandler.showSyncPayResultView(false);
                    }
                }
                if ((mspContextByBizId instanceof MspTradeContext) && mspNetHandler.getStringGraySyncRenderSupport() != null) {
                    MspExperimentHelper.reportResult((MspTradeContext) mspContextByBizId, KEY_GRAY_SYNC_RENDER_SUPPORT, mspNetHandler.getStringGraySyncRenderSupport());
                }
            }
            if (parseObject != null && parseObject.containsKey("cashierResult")) {
                LogUtil.d("MspNetHandler", "onReceiveSyncPayResult", "result contains cashierResult");
                MspCacheManager mspCacheManager = MspCacheManager.getInstance();
                mspCacheManager.setTwoLevelCache(true);
                JSONObject jSONObject3 = parseObject.getJSONObject("cashierResult");
                if (jSONObject3 == null) {
                    return;
                }
                for (String str4 : jSONObject3.keySet()) {
                    JSONObject jSONObject4 = jSONObject3.getJSONObject(str4);
                    if (jSONObject4 != null) {
                        mspCacheManager.writeCache(str4, jSONObject4.toJSONString(), false);
                    }
                    JSONObject jSONObject5 = new JSONObject();
                    jSONObject5.put("notifyName", (Object) CacheStore.NOTIFY_TPL_NAME);
                    jSONObject5.put(str4, (Object) jSONObject4);
                    EventBusManager.getInstance().post(jSONObject5, MspGlobalDefine.EVENT_NOTIFY_TPL);
                }
            }
        }
    }

    public synchronized void showSyncPayResultView(boolean z) {
        JSONObject parseObject;
        RequestConfig requestConfig;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae682f9b", new Object[]{this, new Boolean(z)});
            return;
        }
        LogUtil.record(2, "MspNetHandler:showSyncPayResultView", "onlyChangeShowState=".concat(String.valueOf(z)));
        if (z) {
            this.mHasShownSyncResult = true;
            return;
        }
        if (this.mSyncResult != null) {
            MspTradeContext tradeContextByBizId = MspContextManager.getInstance().getTradeContextByBizId(this.mBizId);
            if (tradeContextByBizId == null) {
                return;
            }
            try {
                parseObject = JSON.parseObject(this.mSyncResult);
            } catch (Exception e) {
                LogUtil.printExceptionStackTrace(e);
            }
            if (parseObject == null) {
                return;
            }
            String str = "";
            if (parseObject.containsKey(MspFlybirdDefine.FLYBIRD_TEMPLATE_ID)) {
                str = parseObject.getString(MspFlybirdDefine.FLYBIRD_TEMPLATE_ID);
            }
            tradeContextByBizId.getStatisticInfo().addEvent(new StEvent(str, "onsync", "onsync"));
            TradeLogicData tradeLogicData = tradeContextByBizId.getTradeLogicData();
            if (tradeLogicData != null && (requestConfig = tradeLogicData.getRequestConfig()) != null && parseObject.containsKey(MspGlobalDefine.SESSION)) {
                requestConfig.setSessionId(parseObject.getString(MspGlobalDefine.SESSION));
            }
            StringBuilder sb = new StringBuilder();
            sb.append(this.mBizId);
            LogUtil.record(4, "msp", "MspNetHandler:showSyncPayResultView", sb.toString());
            tradeContextByBizId.setSubmitState(false);
            JSONObject parseObject2 = JSON.parseObject(this.mSyncResult);
            if (parseObject2 == null) {
                return;
            }
            ActionsCreator.get(tradeContextByBizId).createUIShowAction(parseObject2, true, new StEvent());
            SpmHelper.spmExpSubmitResponse(tradeContextByBizId, "", "", "9000", true);
        }
        this.mSyncResult = null;
    }

    public synchronized boolean hasSyncPayResult() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("36ec2e9b", new Object[]{this})).booleanValue();
        }
        return this.mSyncResult != null;
    }

    public synchronized boolean isShowSyncPayResult() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7a87598e", new Object[]{this})).booleanValue();
        }
        LogUtil.record(2, "MspNetHandler:isShowSyncPayResult", "show=" + this.mHasShownSyncResult);
        return this.mHasShownSyncResult;
    }

    public boolean isGraySyncRenderSupport() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("75a475c", new Object[]{this})).booleanValue();
        }
        if (!this.mHasGetGraySyncRenderSupport) {
            this.mStringGraySyncRenderSupport = PhoneCashierMspEngine.getMspWallet().getWalletConfig(KEY_GRAY_SYNC_RENDER_SUPPORT);
            this.mGraySyncRenderSupport = StringUtils.equals(MspExperimentHelper.KEY_TYPE_EXP, MspExperimentHelper.getKeyExpResult(this.mStringGraySyncRenderSupport));
            LogUtil.record(2, "MspNetHandler:isGraySyncRenderSupport", "mGraySyncRenderSupport=" + this.mGraySyncRenderSupport);
            this.mHasGetGraySyncRenderSupport = true;
        }
        return this.mGraySyncRenderSupport;
    }

    public String getStringGraySyncRenderSupport() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("30319e5", new Object[]{this}) : this.mStringGraySyncRenderSupport;
    }
}
