package com.alipay.android.msp.core.context;

import android.content.Context;
import android.os.Build;
import android.os.ConditionVariable;
import android.os.SystemClock;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.app.IRemoteServiceCallback;
import com.alipay.android.app.template.JSPluginManager;
import com.alipay.android.msp.biz.substitute.SpmHelper;
import com.alipay.android.msp.biz.thirdpay.ThirdPayManager;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.alipay.android.msp.core.MspNetHandler;
import com.alipay.android.msp.core.clients.MspLogicClient;
import com.alipay.android.msp.core.clients.MspUIClient;
import com.alipay.android.msp.core.clients.MspViClient;
import com.alipay.android.msp.core.clients.MspWindowClient;
import com.alipay.android.msp.core.frame.MspWindowFrameStack;
import com.alipay.android.msp.core.model.MspExtInfoModel;
import com.alipay.android.msp.core.model.MspPaySession;
import com.alipay.android.msp.drivers.actions.InvokeActionPlugin;
import com.alipay.android.msp.drivers.actions.MspEventTypes;
import com.alipay.android.msp.drivers.stores.storecenter.ActionStoreCenter;
import com.alipay.android.msp.drivers.stores.storecenter.StoreCenter;
import com.alipay.android.msp.framework.cache.MspCacheManager;
import com.alipay.android.msp.framework.drm.ConfigChangeMonitor;
import com.alipay.android.msp.framework.drm.DrmKey;
import com.alipay.android.msp.framework.drm.DrmManager;
import com.alipay.android.msp.framework.drm.FastStartActivityHelper;
import com.alipay.android.msp.framework.drm.TemplateChangeMonitor;
import com.alipay.android.msp.framework.dynfun.DynConstants;
import com.alipay.android.msp.framework.dynfun.DynDataWrapper;
import com.alipay.android.msp.framework.ext.MspExtSceneManager;
import com.alipay.android.msp.framework.helper.GlobalHelper;
import com.alipay.android.msp.framework.helper.MspExperimentHelper;
import com.alipay.android.msp.framework.lowdevice.MspLowDeviceManager;
import com.alipay.android.msp.framework.perf.ThreadController;
import com.alipay.android.msp.framework.statistics.SpmWrapper;
import com.alipay.android.msp.framework.statisticsv2.ClientEndCode;
import com.alipay.android.msp.framework.statisticsv2.StatisticInfo;
import com.alipay.android.msp.framework.statisticsv2.Vector;
import com.alipay.android.msp.framework.statisticsv2.collector.TradeCollector;
import com.alipay.android.msp.framework.statisticsv2.model.StEvent;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.alipay.android.msp.framework.taskscheduler.MonitorRunnable;
import com.alipay.android.msp.framework.taskscheduler.TaskHelper;
import com.alipay.android.msp.framework.util.FwUtils;
import com.alipay.android.msp.network.MspNetworkClient;
import com.alipay.android.msp.pay.CashierSceneDictionary;
import com.alipay.android.msp.pay.GlobalSdkConstant;
import com.alipay.android.msp.pay.MspPayClient;
import com.alipay.android.msp.pay.TradeLogicData;
import com.alipay.android.msp.pay.callback.PayProgressCallback;
import com.alipay.android.msp.pay.results.MspPayResult;
import com.alipay.android.msp.pay.results.ResultStatus;
import com.alipay.android.msp.perf.CashierPerformanceHelper;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.alipay.android.msp.ui.presenters.MspBasePresenter;
import com.alipay.android.msp.utils.ApLinkTokenUtils;
import com.alipay.android.msp.utils.EventLogUtil;
import com.alipay.android.msp.utils.FlybirdUtil;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.android.msp.utils.MspContextUtil;
import com.alipay.android.msp.utils.OrderInfoUtil;
import com.alipay.android.msp.utils.UIUtil;
import com.alipay.android.msp.utils.Utils;
import com.alipay.mobile.security.bio.api.BioDetector;
import com.alipay.sdk.sys.BizContext;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import tb.nfc;
import tb.nom;
import tb.sjg;

/* loaded from: classes3.dex */
public class MspTradeContext extends MspContext {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static Boolean grayMultiContext;
    private static final HashSet<String> q;
    private TradeLogicData A;
    private boolean C;
    private Map<String, String> D;
    private boolean F;
    private long G;
    private JSONObject I;
    private boolean J;
    private final DynDataWrapper<String> K;
    private int M;
    private MspExtSceneManager Q;
    private final DynDataWrapper<HashMap<String, String>> T;
    private final SubTradeContext V;
    private MspPaySession Y;
    public final DynDataWrapper<Integer> dynDataStub;
    private final String n;
    private final DynDataWrapper<String> s;
    private MspWindowClient t;
    private MspLogicClient u;
    private MspPayClient v;
    private MspNetworkClient w;
    private MspViClient x;
    private MspPayResult y;
    private String z;
    private final Map<String, String> o = new HashMap();
    private final Map<String, String> r = new HashMap();
    private String B = "0";
    private String E = "";
    private boolean H = false;
    private boolean L = true;
    private boolean O = false;
    private boolean S = false;
    private boolean N = false;
    private boolean P = false;
    private boolean R = true;
    private int U = -1;
    private ConditionVariable W = new ConditionVariable();
    private Boolean X = null;
    private MspExtInfoModel Z = null;

    /* loaded from: classes3.dex */
    public enum SubTradeContext {
        pay,
        bindcardapp,
        setting
    }

    public static /* synthetic */ Object ipc$super(MspTradeContext mspTradeContext, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1965072769:
                super.onContextCreated();
                return null;
            case -1068390226:
                super.didEnterBackground();
                return null;
            case -980350570:
                super.exit(((Number) objArr[0]).intValue(), ((Boolean) objArr[1]).booleanValue());
                return null;
            case -914087920:
                super.willEnterForeground();
                return null;
            case -716869421:
                super.setCallingPid(((Number) objArr[0]).intValue());
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public static /* synthetic */ MspExtSceneManager a(MspTradeContext mspTradeContext, MspExtSceneManager mspExtSceneManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspExtSceneManager) ipChange.ipc$dispatch("8ccc4054", new Object[]{mspTradeContext, mspExtSceneManager});
        }
        mspTradeContext.Q = mspExtSceneManager;
        return mspExtSceneManager;
    }

    public static /* synthetic */ boolean a(MspTradeContext mspTradeContext) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a037f3c", new Object[]{mspTradeContext})).booleanValue() : mspTradeContext.P;
    }

    public static /* synthetic */ boolean a(MspTradeContext mspTradeContext, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e66d1aa0", new Object[]{mspTradeContext, new Boolean(z)})).booleanValue();
        }
        mspTradeContext.N = z;
        return z;
    }

    public static /* synthetic */ MspLogicClient b(MspTradeContext mspTradeContext) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MspLogicClient) ipChange.ipc$dispatch("901bb6d4", new Object[]{mspTradeContext}) : mspTradeContext.u;
    }

    public static /* synthetic */ boolean b(MspTradeContext mspTradeContext, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f722e761", new Object[]{mspTradeContext, new Boolean(z)})).booleanValue();
        }
        mspTradeContext.P = z;
        return z;
    }

    public static /* synthetic */ DynDataWrapper c(MspTradeContext mspTradeContext) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DynDataWrapper) ipChange.ipc$dispatch("cefdb503", new Object[]{mspTradeContext}) : mspTradeContext.s;
    }

    public static /* synthetic */ void c(MspTradeContext mspTradeContext, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d8b41e", new Object[]{mspTradeContext, new Boolean(z)});
        } else {
            mspTradeContext.b(z);
        }
    }

    public static /* synthetic */ String d(MspTradeContext mspTradeContext) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("cfb84cab", new Object[]{mspTradeContext}) : mspTradeContext.B;
    }

    static {
        HashSet<String> hashSet = new HashSet<>();
        q = hashSet;
        hashSet.add(MspGlobalDefine.EXT_LOCAL_ONLY_THIRD_PAY);
        grayMultiContext = null;
    }

    public MspTradeContext(MspPaySession mspPaySession) {
        this.M = -2;
        a();
        this.Y = mspPaySession;
        String orderSuffix = mspPaySession.getOrderSuffix();
        this.l = MspContext.CONTEXT_TYPE_PAY;
        onStart();
        ThirdPayManager.instrumentPredefinedImpl();
        this.g = mspPaySession.getBizId();
        this.dynDataStub = new DynDataWrapper<>(this.g, DynConstants.DynDataNames.D_DYN_DATA_STUB, 1);
        this.f4533a = mspPaySession.getCallingPid();
        this.M = mspPaySession.getCallingUid();
        this.s = new DynDataWrapper<>(this.g, "orderStr", orderSuffix);
        this.K = new DynDataWrapper<>(this.g, "ap_link_token", null);
        this.T = new DynDataWrapper<>(this.g, DynConstants.DynDataNames.D_CLIENT_LOG_DATA, new HashMap());
        this.k = new DynDataWrapper<>(this.g, DynConstants.DynDataNames.D_CHANGE_TOKENS, null);
        this.n = mspPaySession.getExtendParams();
        a(mspPaySession.isFromWallet());
        setFromEntranceActivity(mspPaySession.isFromEntranceActivity());
        setFromOutScheme(mspPaySession.isFromOutScheme());
        this.D = OrderInfoUtil.parseExternalInfoToMap(orderSuffix);
        if (this.D.get("biz_type") != null && this.D.get("biz_type").contains(BizContext.KEY_SETTING_FILTER)) {
            this.V = SubTradeContext.setting;
        } else if (this.D.get("biz_type") != null && this.D.get("biz_type").contains("bindcardapp")) {
            this.V = SubTradeContext.bindcardapp;
        } else {
            this.V = SubTradeContext.pay;
        }
        e();
        MspContextManager.getInstance().addMspContext(this.g, this);
        PhoneCashierMspEngine.getMspWallet().startSpiderBizType(MspGlobalDefine.SPIDER_MSP_CASHIER_BIZ_TYPE);
        PhoneCashierMspEngine.getMspWallet().startSpiderSection(MspGlobalDefine.SPIDER_MSP_CASHIER_BIZ_TYPE, "CASHIER_FIRST_LOAD");
        this.K.write(this.Y.getApLinkToken());
        initExtInfoModel();
        if (!isFromWallet()) {
            ApLinkTokenUtils.spmExpExtPay(this.b, this.Y);
        }
        ApLinkTokenUtils.spmExpPayBoot(this, TradeCollector.getBizType(getBizId()));
        this.d = new MspNetHandler(this);
        this.y = new MspPayResult(this);
        this.G = SystemClock.elapsedRealtime();
        this.b = MspContextUtil.getContext();
        ConfigChangeMonitor.getInstance().newContext(this.b);
        TemplateChangeMonitor.getInstance().newContext(this.b);
        TaskHelper.execute(new Runnable() { // from class: com.alipay.android.msp.core.context.MspTradeContext.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                MspTradeContext mspTradeContext = MspTradeContext.this;
                MspTradeContext.a(mspTradeContext, MspExtSceneManager.onPadAdaptMode(mspTradeContext.b));
                MspTradeContext mspTradeContext2 = MspTradeContext.this;
                MspTradeContext.b(mspTradeContext2, DrmManager.getInstance(mspTradeContext2.b).isGray(DrmKey.GRAY_UNIFIED_READ_PAD_CONFIG, false, MspTradeContext.this.b));
                if (!MspTradeContext.a(MspTradeContext.this)) {
                    return;
                }
                MspTradeContext mspTradeContext3 = MspTradeContext.this;
                MspTradeContext.a(mspTradeContext3, new MspExtSceneManager(mspTradeContext3.b));
            }
        });
        this.u = new MspLogicClient(this);
        this.t = new MspWindowClient(this);
        this.v = new MspPayClient(this);
        this.w = new MspNetworkClient(this);
        this.e = new ActionStoreCenter(this);
        this.x = new MspViClient(this);
        CashierPerformanceHelper.setCurrentThreadPriority(-20);
        StatisticInfo statisticInfo = getStatisticInfo();
        Vector vector = Vector.Result;
        StringBuilder sb = new StringBuilder();
        sb.append(ClientEndCode.USEREXIT);
        statisticInfo.updateAttr(vector, "clientEndCode", sb.toString());
        getAlertIntelligenceId();
        String tryUseLinkTokenAsLogTrace = ApLinkTokenUtils.tryUseLinkTokenAsLogTrace(this);
        if (!StringUtils.isEmpty(tryUseLinkTokenAsLogTrace) && tryUseLinkTokenAsLogTrace.length() > 2) {
            this.h = this.h.substring(0, this.h.length() - 2) + "_" + tryUseLinkTokenAsLogTrace;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!InvokeActionPlugin.isJsPluginRegisterAsync()) {
            InvokeActionPlugin.registerTradeLocalInvokeFamily(this);
        } else {
            InvokeActionPlugin.registerNecessaryTradeLocalInvokeFamily(this);
            TaskHelper.execute(new Runnable() { // from class: com.alipay.android.msp.core.context.MspTradeContext.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        InvokeActionPlugin.registerAsyncTradeLocalInvokeFamily(MspTradeContext.this);
                    }
                }
            });
        }
        EventLogUtil.logPayEvent("103627", HiAnalyticsConstant.BI_KEY_COST_TIME, String.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime), "content_type", "trade");
        TaskHelper.execute(new Runnable() { // from class: com.alipay.android.msp.core.context.MspTradeContext.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    InvokeActionPlugin.registerTradeBnInvokeFamily(MspTradeContext.this);
                }
            }
        });
        FlybirdUtil.saveTradeNoForDNS(this.s.read());
        Map<String, String> map = this.D;
        if (map != null && map.get("no_loading") != null) {
            try {
                if (Integer.parseInt(this.D.get("no_loading")) == 1) {
                    this.C = true;
                }
            } catch (Exception e) {
                LogUtil.printExceptionStackTrace(e);
            }
        }
        Map<String, String> map2 = this.D;
        if (map2 != null && map2.containsKey("msp_bg_opaque")) {
            setMspBgTransparent(StringUtils.equals("1", this.D.get("msp_bg_opaque")));
        }
        this.s.read().hashCode();
        if (this.Y.getSchemePayModel() != null && !StringUtils.isEmpty(this.Y.getSchemePayModel().packageName)) {
            this.c = true;
        }
        c();
        TradeLogicData tradeLogicData = new TradeLogicData(this);
        try {
            tradeLogicData.setLdcHeaders(OrderInfoUtil.initLdcData(this));
        } catch (Exception e2) {
            LogUtil.printExceptionStackTrace(e2);
        }
        setTradeLogicData(tradeLogicData);
        updateCurrentWinTpName("null");
        onContextCreated();
        if (grayMultiContext == null) {
            grayMultiContext = Boolean.valueOf(FastStartActivityHelper.getBoolConfig(this.b, DrmKey.GRAY_ENABLE_MULTI_PAY_SERVICE));
        }
        MspExperimentHelper.reportEvent(this, FastStartActivityHelper.CONFIG_KEY);
    }

    @Override // com.alipay.android.msp.core.context.MspContext, com.alipay.android.msp.content.MspContextLifecycleCallbacks
    public void onContextCreated() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8adf5e7f", new Object[]{this});
        } else {
            super.onContextCreated();
        }
    }

    public MspPaySession getPaySession() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MspPaySession) ipChange.ipc$dispatch("45ba709e", new Object[]{this}) : this.Y;
    }

    @Override // com.alipay.android.msp.core.context.MspContext
    public String getApLinkToken() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("dd8b99bf", new Object[]{this}) : this.K.read();
    }

    public void setClientLogData(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f33c7552", new Object[]{this, str});
        } else if (!StringUtils.isEmpty(str)) {
            try {
                JSONObject parseObject = JSON.parseObject(str);
                if (parseObject != null) {
                    for (String str2 : parseObject.keySet()) {
                        this.T.read().put(str2, parseObject.getString(str2));
                    }
                }
                if (this.T.read().containsKey("bizNo")) {
                    String str3 = this.T.read().get("bizNo");
                    LogUtil.record(2, "setClientLogData:tradeNo", TradeCollector.collectData("tradeNo", this.g) + " to " + str3);
                    updateTradeNo(str3);
                    getStatisticInfo().updateAttr(Vector.Trade, "tradeNo", str3);
                }
                if (this.T.read().containsKey("outTradeNo")) {
                    String str4 = this.T.read().get("outTradeNo");
                    LogUtil.record(2, "setClientLogData:outTradeNo", TradeCollector.collectData("outTradeNo", this.g) + " to " + str4);
                    this.D.put("out_trade_no", str4);
                    getStatisticInfo().updateAttr(Vector.Trade, "outTradeNo", str4);
                }
                if (!this.T.read().containsKey(BioDetector.EXT_KEY_PARTNER_ID)) {
                    return;
                }
                String str5 = this.T.read().get(BioDetector.EXT_KEY_PARTNER_ID);
                LogUtil.record(2, "setClientLogData:partnerId", TradeCollector.collectData(BioDetector.EXT_KEY_PARTNER_ID, this.g) + " to " + str5);
                this.D.put("partner", str5);
                getStatisticInfo().updateAttr(Vector.Trade, BioDetector.EXT_KEY_PARTNER_ID, str5);
            } catch (Throwable th) {
                LogUtil.printExceptionStackTrace(th);
            }
        }
    }

    public Map<String, String> getClientLogData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("94ef3049", new Object[]{this}) : this.T.read();
    }

    private void b(boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        boolean z2 = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            return;
        }
        if (isSubmitState() && !z) {
            if (this.d == null || !this.d.isGraySyncRenderSupport() || !this.d.isShowSyncPayResult()) {
                return;
            }
            getStatisticInfo().addEvent(new StEvent(getCurrentWinTpName(), "doExit", "showSyncPayResult"));
        }
        if (isExit()) {
            return;
        }
        this.f = true;
        LogUtil.record(2, "MspTradeContext:doExit", this + " exit");
        MspWindowClient mspWindowClient = this.t;
        if (mspWindowClient != null) {
            if (mspWindowClient.isNoPresenterSet() || this.t.getCurrentPresenter() != null) {
                z2 = true;
            }
            this.t.onExit();
        }
        this.f = true;
        if (getStoreCenter() != null) {
            getStoreCenter().doCleanBeforeWindowChange(11);
        }
        if (!z2 || isExitCashierBeforePay()) {
            if (isFromEntranceActivity()) {
                MspPayResult mspPayResult = getMspPayResult();
                StringBuilder sb = new StringBuilder();
                sb.append(ResultStatus.PAY_EXCEPTION_CODE.getStatus());
                mspPayResult.setEndCode(sb.toString());
                if (isUseNewPayResultLock()) {
                    openPayCallbackLock();
                } else {
                    synchronized (this) {
                        notifyAll();
                    }
                }
            } else {
                this.v.exitWithoutPage();
            }
        } else if (isUseNewPayResultLock()) {
            openPayCallbackLock();
        } else {
            synchronized (this) {
                notifyAll();
            }
        }
        try {
            str = URLEncoder.encode(this.y.formatResult(3), "utf8");
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
            str = "";
        }
        ApLinkTokenUtils.spmPaymentEnd(this, str);
        MonitorRunnable monitorRunnable = new MonitorRunnable(new Runnable() { // from class: com.alipay.android.msp.core.context.MspTradeContext.7
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    MspTradeContext.b(MspTradeContext.this).onExit();
                }
            }
        }, 600L);
        if (this.b != null && FastStartActivityHelper.getBoolConfig(this.b, DrmKey.GRAY_DELAY_THREAD_RUNNABLE)) {
            TaskHelper.getInstance().executeDelayed(monitorRunnable, 600L, TaskHelper.ThreadName.UI_CONTEXT);
        } else {
            TaskHelper.execute(monitorRunnable, 600L);
        }
        JSPluginManager.getInstanse().unregisterJSPlugin((Context) null, "submit");
        JSPluginManager.getInstanse().unregisterJSPlugin((Context) null, MspEventTypes.ACTION_STRING_BNVB);
        ThreadController.endWithOutScheme(ThreadController.CASHIER_START_PAY);
    }

    public String getSchemeTraceId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("39e3fff4", new Object[]{this}) : this.Y.getSchemeTraceId();
    }

    public boolean isPaying() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1ccd1a8f", new Object[]{this})).booleanValue() : this.J;
    }

    public void setPaying(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("411e0771", new Object[]{this, new Boolean(z)});
        } else {
            this.J = z;
        }
    }

    public long getTradeInitTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c89e38c6", new Object[]{this})).longValue() : this.G;
    }

    public String getExtendParamByKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9a86aba4", new Object[]{this, str});
        }
        if (this.o.containsKey(str)) {
            return this.o.get(str);
        }
        return null;
    }

    public String getExtendParamString() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7c78b8eb", new Object[]{this}) : this.n;
    }

    public Map<String, String> getExtendParamsMap() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("940e06c2", new Object[]{this}) : this.o;
    }

    public Map<String, String> getAllExtendParamsMap() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("66a1e24d", new Object[]{this}) : this.r;
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else if (!StringUtils.isEmpty(this.n)) {
            try {
                JSONObject parseObject = JSON.parseObject(this.n);
                for (String str : parseObject.keySet()) {
                    if (!q.contains(str)) {
                        this.o.put(str, parseObject.getString(str));
                    }
                    this.r.put(str, parseObject.getString(str));
                }
            } catch (Throwable th) {
                getStatisticInfo().addError(sjg.LOCATION_INSIDE, "ParseExtendParamsEx", th);
            }
        }
    }

    public boolean isRenderLocal() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("83256ef6", new Object[]{this})).booleanValue() : StringUtils.equals(getExtendParamByKey(MspGlobalDefine.EXT_RENDER_LOCAL), "true");
    }

    private void c() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        try {
            if (StringUtils.isEmpty(this.s.read())) {
                return;
            }
            String[] split = this.s.read().split("&");
            String str = null;
            int length = split.length;
            while (true) {
                if (i >= length) {
                    break;
                }
                String str2 = split[i];
                if (!StringUtils.isEmpty(str2) && str2.startsWith("bizcontext=")) {
                    str = str2;
                    break;
                }
                i++;
            }
            if (str != null) {
                str = str.substring(11);
                if (str.startsWith("\"") && str.endsWith("\"")) {
                    str = str.substring(1, str.length() - 1);
                }
            }
            this.I = JSON.parseObject(str);
            if (this.I == null) {
                return;
            }
            this.B = this.I.getString("resultPageExitMode");
            this.z = this.I.getString("sc");
            this.E = this.I.getString("domain");
            this.H = this.I.getBooleanValue("isThirdDomain");
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace(e);
        }
    }

    public JSONObject getBizContext() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("e7a96fb9", new Object[]{this}) : this.I;
    }

    public boolean isNoLoading() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a917e63c", new Object[]{this})).booleanValue() : this.C;
    }

    public Map<String, String> getOrderInfoMap() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("c2b9612", new Object[]{this}) : this.D;
    }

    @Override // com.alipay.android.msp.core.context.MspContext
    public MspBasePresenter getMspBasePresenter() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MspBasePresenter) ipChange.ipc$dispatch("69a95869", new Object[]{this}) : this.t.getCurrentPresenter();
    }

    @Override // com.alipay.android.msp.core.context.MspContext
    public void exit(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab88c8fe", new Object[]{this, new Integer(i)});
        } else {
            exit(i, false);
        }
    }

    @Override // com.alipay.android.msp.core.context.MspContext
    public void exit(int i, final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5910996", new Object[]{this, new Integer(i), new Boolean(z)});
            return;
        }
        super.exit(i, z);
        if (i > 0) {
            Context context = getContext();
            if (context != null && FastStartActivityHelper.getBoolConfig(context, DrmKey.GRAY_DELAY_THREAD_RUNNABLE)) {
                TaskHelper.getInstance().executeDelayed(new Runnable() { // from class: com.alipay.android.msp.core.context.MspTradeContext.4
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            MspTradeContext.c(MspTradeContext.this, z);
                        }
                    }
                }, i, TaskHelper.ThreadName.UI_CONTEXT);
                return;
            } else if (context != null && FastStartActivityHelper.getBoolConfig(context, DrmKey.GRAY_DELAY_TIMER_RUNNABLE)) {
                new Timer("MspTradeCtxExitThread").schedule(new TimerTask() { // from class: com.alipay.android.msp.core.context.MspTradeContext.5
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.util.TimerTask, java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            MspTradeContext.c(MspTradeContext.this, z);
                        }
                    }
                }, i);
                return;
            } else {
                TaskHelper.execute(new Runnable() { // from class: com.alipay.android.msp.core.context.MspTradeContext.6
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            MspTradeContext.c(MspTradeContext.this, z);
                        }
                    }
                }, i);
                return;
            }
        }
        b(z);
    }

    @Override // com.alipay.android.msp.core.context.MspContext
    public StoreCenter getStoreCenter() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (StoreCenter) ipChange.ipc$dispatch("550b9278", new Object[]{this}) : this.e;
    }

    @Override // com.alipay.android.msp.core.context.MspContext
    public MspWindowFrameStack getWindowStack() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspWindowFrameStack) ipChange.ipc$dispatch("b53eb85b", new Object[]{this});
        }
        MspWindowClient mspWindowClient = this.t;
        if (mspWindowClient == null) {
            return null;
        }
        return mspWindowClient.getFrameStack();
    }

    @Override // com.alipay.android.msp.core.context.MspContext
    public MspUIClient getMspUIClient() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MspUIClient) ipChange.ipc$dispatch("52f9383d", new Object[]{this}) : this.t;
    }

    @Override // com.alipay.android.msp.core.context.MspContext
    public MspLogicClient getMspLogicClient() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MspLogicClient) ipChange.ipc$dispatch("220bab2f", new Object[]{this}) : this.u;
    }

    public MspWindowClient getMspWindowClient() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MspWindowClient) ipChange.ipc$dispatch("18c2a13d", new Object[]{this}) : this.t;
    }

    public TradeLogicData getTradeLogicData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TradeLogicData) ipChange.ipc$dispatch("66d7cfcb", new Object[]{this}) : this.A;
    }

    public void setTradeLogicData(TradeLogicData.TradeLogicDataTransfer tradeLogicDataTransfer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97b03b70", new Object[]{this, tradeLogicDataTransfer});
        } else {
            this.A.fromTransfer(tradeLogicDataTransfer);
        }
    }

    public void setTradeLogicData(TradeLogicData tradeLogicData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20e4cb2d", new Object[]{this, tradeLogicData});
        } else {
            this.A = tradeLogicData;
        }
    }

    public MspViClient getMspViClient() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MspViClient) ipChange.ipc$dispatch("20a69d", new Object[]{this}) : this.x;
    }

    public MspNetworkClient getMspNetworkClient() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MspNetworkClient) ipChange.ipc$dispatch("b7abcdb1", new Object[]{this}) : this.w;
    }

    public MspPayResult getMspPayResult() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MspPayResult) ipChange.ipc$dispatch("5d101552", new Object[]{this}) : this.y;
    }

    public MspPayResult startPay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspPayResult) ipChange.ipc$dispatch("3417c8c7", new Object[]{this});
        }
        ThreadController.startWithOutScheme(ThreadController.CASHIER_START_PAY);
        return this.v.pay();
    }

    public String getOrderInfo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("88125053", new Object[]{this}) : this.s.read();
    }

    public String getEncodeOrderInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b78bf89", new Object[]{this});
        }
        try {
            return URLEncoder.encode(getOrderInfo(), "utf8");
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
            return "";
        }
    }

    public boolean isSubmitState() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("199f84da", new Object[]{this})).booleanValue() : this.F;
    }

    public void setSubmitState(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc3e07f6", new Object[]{this, new Boolean(z)});
        } else {
            this.F = z;
        }
    }

    @Override // com.alipay.android.msp.core.context.MspContext
    public boolean getGrayOnPadAdaptMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1f3e32d5", new Object[]{this})).booleanValue() : this.N;
    }

    @Override // com.alipay.android.msp.core.context.MspContext
    public boolean getGrayUnifiedReadPadConfig() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3135251", new Object[]{this})).booleanValue() : this.P;
    }

    @Override // com.alipay.android.msp.core.context.MspContext
    public MspExtSceneManager getMspExtSceneManager() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MspExtSceneManager) ipChange.ipc$dispatch("fd7b3373", new Object[]{this}) : this.Q;
    }

    public boolean isMqpSchemePay() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ad27d12c", new Object[]{this})).booleanValue() : CashierSceneDictionary.getInstance().getMspSchemePayContext(this.s.read()) != null;
    }

    public String getOutPackageName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("78beb3e0", new Object[]{this}) : this.Y.getOuterPackageName();
    }

    @Override // com.alipay.android.msp.core.context.MspContext
    public long getDelayDisposeTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c107c87a", new Object[]{this})).longValue();
        }
        long j = 0;
        try {
            MspCacheManager mspCacheManager = MspCacheManager.getInstance();
            mspCacheManager.setTwoLevelCache(true);
            String readCache = mspCacheManager.readCache("sos", new String[]{"needDelay"}, false);
            if (!StringUtils.isEmpty(readCache) && readCache.contains("\"needDelay\":\"N\"")) {
                LogUtil.record(4, "Trade:getDelayDisposeTime", "needDelay: N");
                return 0L;
            }
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace(e);
        }
        if (StringUtils.equals(this.B, "2") || StringUtils.equals(this.z, "tqrcode")) {
            j = 350;
        } else if (StringUtils.equals(this.B, "3")) {
            j = 480;
        }
        LogUtil.record(4, "Trade:getDelayDisposeTime", "delay:" + j + " mode:" + this.B);
        return j;
    }

    @Override // com.alipay.android.msp.core.context.MspContext
    public void onRendResultPage(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab2d3ba5", new Object[]{this, str});
        } else {
            TaskHelper.runOnUIThread(new Runnable() { // from class: com.alipay.android.msp.core.context.MspTradeContext.8
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    PayProgressCallback payProgressCallback = MspContextManager.getInstance().getPayProgressCallback((String) MspTradeContext.c(MspTradeContext.this).read());
                    if (payProgressCallback != null) {
                        MspPayResult mspPayResult = MspTradeContext.this.getMspPayResult();
                        payProgressCallback.onPayProgress(MspTradeContext.this.g, mspPayResult.getEndCode(), mspPayResult.getMemo(), mspPayResult.getResult());
                    }
                    MspTradeContext.this.getStatisticInfo().addEvent(new StEvent(str, "resultPageExitMode", MspTradeContext.d(MspTradeContext.this)));
                }
            }, 300L);
        }
    }

    public boolean isFromThirdDomainJsApi() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("684fd65", new Object[]{this})).booleanValue();
        }
        LogUtil.record(1, "MspTradeContext:scene" + this.z, "mIsThirdDomain:" + this.H + " mDomain:" + this.E);
        return StringUtils.equals(this.z, nfc.PHA_MONITOR_MODULE_POINT_JS_API) && this.H;
    }

    public String getScene() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6a7731e3", new Object[]{this}) : this.z;
    }

    public String getDomain() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6fba2f7f", new Object[]{this}) : this.E;
    }

    @Override // com.alipay.android.msp.core.context.MspContext
    public void updateResult(String str, String str2, String str3, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6973a65", new Object[]{this, str, str2, str3, jSONObject});
            return;
        }
        LogUtil.i("MspTradeContext", "updateResult", str + " " + str2 + " " + str3);
        MspPayResult mspPayResult = getMspPayResult();
        if (mspPayResult == null) {
            return;
        }
        if (mspPayResult.isSuccess() && !StringUtils.equals(str, String.valueOf(ResultStatus.SUCCEEDED.getStatus()))) {
            LogUtil.i("MspTradeContext", "updateResult", "pay result is already success, don't set.");
            getStatisticInfo().addEvent(new StEvent(getCurrentWinTpName(), "PayResultAlreadySuccess", str));
            return;
        }
        if (!StringUtils.isEmpty(str)) {
            mspPayResult.setEndCode(str);
        }
        if (!StringUtils.isEmpty(str2)) {
            mspPayResult.setMemo(str2);
        }
        if (!StringUtils.isEmpty(str3)) {
            mspPayResult.setResult(str3);
        }
        if (jSONObject != null) {
            mspPayResult.addExtendInfo(jSONObject);
        }
        try {
            if (StringUtils.isEmpty(str)) {
                return;
            }
            getStatisticInfo().updateResult(str, getCurrentWinTpName());
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace(e);
        }
    }

    @Override // com.alipay.android.msp.core.context.MspContext
    public void reportExtPaySuccessOnlyOnce() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe504dc", new Object[]{this});
        } else if (this.j) {
        } else {
            this.j = true;
            ApLinkTokenUtils.spmExtPaymentStartSuccess(this.b, this.Y);
        }
    }

    public boolean isInitialNetRequest() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("eeb97f17", new Object[]{this})).booleanValue() : this.L;
    }

    public void setInitialNetRequest(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4550b59", new Object[]{this, new Boolean(z)});
        } else {
            this.L = z;
        }
    }

    @Override // com.alipay.android.msp.core.context.MspContext
    public void setCallingPid(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d54570d3", new Object[]{this, new Integer(i)});
            return;
        }
        super.setCallingPid(i);
        MspPaySession mspPaySession = this.Y;
        if (mspPaySession == null) {
            return;
        }
        mspPaySession.setCallingPid(i);
    }

    public int getCallingUid() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b2c4c85c", new Object[]{this})).intValue() : this.M;
    }

    public boolean isHasRPC() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("155e80c0", new Object[]{this})).booleanValue() : this.O;
    }

    public void setHasRPC(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ab96760", new Object[]{this, new Boolean(z)});
        } else {
            this.O = z;
        }
    }

    public void setExitCashierBeforePay(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc579d07", new Object[]{this, new Boolean(z)});
        } else {
            this.S = z;
        }
    }

    public boolean isExitCashierBeforePay() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e2a3fc39", new Object[]{this})).booleanValue() : this.S;
    }

    public boolean isCanMulti() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5df7719e", new Object[]{this})).booleanValue() : this.R;
    }

    public void setCanMulti(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fee4042", new Object[]{this, new Boolean(z)});
        } else {
            this.R = z;
        }
    }

    @Override // com.alipay.android.msp.core.context.MspContext
    public void updateTradeNo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cea32cd", new Object[]{this, str});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            this.D.put("trade_no", str);
        }
    }

    @Override // com.alipay.android.msp.core.context.MspContext
    public String getTradeNo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("59e3704a", new Object[]{this}) : this.D.containsKey("trade_no") ? this.D.get("trade_no") : "";
    }

    public IRemoteServiceCallback getRemoteCallback() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IRemoteServiceCallback) ipChange.ipc$dispatch("4a689309", new Object[]{this});
        }
        if (getOrderInfo() != null) {
            return MspContextManager.getInstance().getRemoteCallbackById(getOrderInfo().hashCode(), this.f4533a);
        }
        return MspContextManager.getInstance().getRemoteCallbackById(-1, this.f4533a);
    }

    public synchronized void sendDataToSdk(String str, String str2, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccf201dd", new Object[]{this, str, str2, map});
        } else if (StringUtils.equals(PhoneCashierMspEngine.getMspWallet().getWalletConfig("DegradeMspSendDataToSdk"), "Y")) {
        } else {
            IRemoteServiceCallback remoteCallback = getRemoteCallback();
            if (remoteCallback != null) {
                LogUtil.record(2, "MspContext:sendDataToSdk", "v=" + this.U);
                if (getRemoteCallbackVersion() > 1) {
                    remoteCallback.r03(str, str2, map);
                }
            }
        }
    }

    public int getRemoteCallbackVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9a579af1", new Object[]{this})).intValue();
        }
        try {
            IRemoteServiceCallback remoteCallback = getRemoteCallback();
            if (remoteCallback != null) {
                if (this.U == -1) {
                    this.U = remoteCallback.getVersion();
                }
                LogUtil.record(2, "MspContext:sendDataToSdk", "v=" + this.U);
                return this.U;
            }
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
        return 0;
    }

    public SubTradeContext getCurSubContext() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SubTradeContext) ipChange.ipc$dispatch("988805e9", new Object[]{this}) : this.V;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this}) : String.format("<MspTradeContext with bizId: %s,%s>", Integer.valueOf(this.g), this.V);
    }

    @Override // com.alipay.android.msp.core.context.MspContext, com.alipay.android.msp.content.MspContextLifecycleCallbacks
    public void didEnterBackground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c051a8ae", new Object[]{this});
            return;
        }
        super.didEnterBackground();
        SpmHelper.spmClickResignActive(this);
        SpmWrapper.onPagePause(getWindowStack() != null ? getWindowStack().getTopTplOrNativeFrame() : null, this.g);
    }

    @Override // com.alipay.android.msp.core.context.MspContext, com.alipay.android.msp.content.MspContextLifecycleCallbacks
    public void willEnterForeground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9842010", new Object[]{this});
            return;
        }
        super.willEnterForeground();
        SpmHelper.spmClickBecomeActive(this);
        SpmWrapper.onPageResume(getWindowStack() != null ? getWindowStack().getTopTplOrNativeFrame() : null);
    }

    public void blockPayCallbackLock() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb846692", new Object[]{this});
        } else {
            this.W.block();
        }
    }

    public void openPayCallbackLock() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a81da9b5", new Object[]{this});
        } else {
            this.W.open();
        }
    }

    public boolean isUseNewPayResultLock() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a714818", new Object[]{this})).booleanValue();
        }
        if (this.X == null) {
            this.X = Boolean.valueOf(StringUtils.equals(nom.VALUE_YES, PhoneCashierMspEngine.getMspWallet().getWalletConfig(DrmKey.GRAY_PAY_RESULT_CALLBACK_LOCK)));
        }
        return this.X.booleanValue();
    }

    public void initExtInfoModel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61404eb1", new Object[]{this});
            return;
        }
        try {
            MspPaySession paySession = getPaySession();
            Map<String, String> extInfo = paySession.getExtInfo();
            MspExtInfoModel.Context context = new MspExtInfoModel.Context();
            context.setTcVerifyToken(extInfo.get("tc_verify_token"));
            context.setTerminalCustomInfo(extInfo.get("terminal_custom_info"));
            context.setTerminalSource(extInfo.get("terminal_source"));
            context.setExpDisableConfig(PhoneCashierMspEngine.getMspWallet().getWalletConfig("MQP_exp_disable_config_10550"));
            context.setCodeExtInfo(extInfo.get("code_ext_info"));
            MspExtInfoModel.Device device = new MspExtInfoModel.Device();
            device.setAccessibility(Boolean.parseBoolean(MspExtSceneManager.getInstance(getContext()).isAccessibilityEnabled()));
            device.setAppMode(PhoneCashierMspEngine.getMspWallet().getAppMode());
            device.setLowPerf(MspLowDeviceManager.getInstance().isLowDevice());
            device.setAgednessVersion(PhoneCashierMspEngine.getMspWallet().isUserAgednessVersion(getBizId()));
            device.setDrmVersion(DrmManager.getInstance(getContext()).getVersion());
            device.setFoldable(MspExtSceneManager.getInstance(getContext()).isFoldableDevice());
            device.setPad(MspExtSceneManager.getInstance(getContext()).isPad());
            device.setBrand(Build.BRAND);
            device.setModel(Build.MODEL);
            int[] screenSize = UIUtil.getScreenSize(getContext());
            device.setScreenWidth(String.valueOf(screenSize[0]));
            device.setScreenHeight(String.valueOf(screenSize[1]));
            device.setDensity(String.valueOf(UIUtil.getDp(getContext())));
            device.setCpuCore(String.valueOf(UIUtil.getNumberOfCPUs()));
            MspExtInfoModel.Env env = new MspExtInfoModel.Env();
            env.setInvokeFromApi(Utils.getInvokeFromApi(this));
            env.setInvokeFromSource(Utils.getInvokeFromSource(this));
            env.setInvokeFromClientAppId(paySession.getInvokeFromClientAppId());
            env.setInvokeFromReferUrl(paySession.getInvokeFromUrlRefer());
            env.setInvokeFromAppName(paySession.getInvokeFromAppName());
            env.setInvokeFromAppSign(paySession.getInvokeFromAppSign());
            env.setFromWallet(isFromWallet() && !isFromOutScheme());
            env.setSupported3rdPay(StringUtils.join("|", FwUtils.concatMultiList(ThirdPayManager.getAvailableThirdPayTypes(GlobalHelper.getInstance().getContext()), ThirdPayManager.getExternalProvidedThirdPayTypes(this), paySession.getInstalled3rdAppList(), ThirdPayManager.getListCupDirectApps())));
            env.setAlipayTopAppId(PhoneCashierMspEngine.getMspWallet().getAlipayTopAppid());
            MspExtInfoModel mspExtInfoModel = new MspExtInfoModel();
            mspExtInfoModel.setEnv(env);
            mspExtInfoModel.setDevice(device);
            mspExtInfoModel.setContext(context);
            mspExtInfoModel.setAp_link_token(getApLinkToken());
            if (!StringUtils.isEmpty(getAllExtendParamsMap().get("user_token"))) {
                mspExtInfoModel.setUserToken(getAllExtendParamsMap().get("user_token"));
            }
            if (!StringUtils.isEmpty(getAllExtendParamsMap().get("user_token_type"))) {
                mspExtInfoModel.setUserTokenType(getAllExtendParamsMap().get("user_token_type"));
            }
            if (!StringUtils.isEmpty(getAllExtendParamsMap().get(MspGlobalDefine.EXT_INSIDE_ENV))) {
                mspExtInfoModel.setInsideEnv(getAllExtendParamsMap().get(MspGlobalDefine.EXT_INSIDE_ENV));
            }
            if (GlobalSdkConstant.getSdkType()) {
                mspExtInfoModel.setUtdid(GlobalHelper.getInstance().getUtdid(getContext()));
                mspExtInfoModel.setLang(Utils.getLocaleDesByFlag(PhoneCashierMspEngine.getMspBase().getMspLocale(PhoneCashierMspEngine.getMspWallet().getAlipayLocaleDes())));
            }
            this.Z = mspExtInfoModel;
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
            getStatisticInfo().addError(ErrorType.DEFAULT, "exitInfoModelFail", th);
        }
    }

    public MspExtInfoModel getExtInfoModel() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MspExtInfoModel) ipChange.ipc$dispatch("6f8e5f5e", new Object[]{this}) : this.Z;
    }
}
