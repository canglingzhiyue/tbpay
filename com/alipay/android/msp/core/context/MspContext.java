package com.alipay.android.msp.core.context;

import android.content.Context;
import android.support.v4.util.Pair;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.content.MspContextLifecycleCallbacks;
import com.alipay.android.msp.core.MspNetHandler;
import com.alipay.android.msp.core.clients.MspLogicClient;
import com.alipay.android.msp.core.clients.MspUIClient;
import com.alipay.android.msp.core.frame.MspWindowFrameStack;
import com.alipay.android.msp.core.section.MqpBehavior;
import com.alipay.android.msp.drivers.stores.storecenter.StoreCenter;
import com.alipay.android.msp.framework.db.MspDbManager;
import com.alipay.android.msp.framework.drm.ConfigChangeMonitor;
import com.alipay.android.msp.framework.drm.DrmKey;
import com.alipay.android.msp.framework.drm.DrmManager;
import com.alipay.android.msp.framework.drm.FastStartActivityHelper;
import com.alipay.android.msp.framework.drm.TemplateChangeMonitor;
import com.alipay.android.msp.framework.dynfun.DynConstants;
import com.alipay.android.msp.framework.dynfun.DynDataWrapper;
import com.alipay.android.msp.framework.dynfun.NativeDynFunManager;
import com.alipay.android.msp.framework.dynfun.NativeTplRuntimeManager;
import com.alipay.android.msp.framework.ext.MspExtSceneManager;
import com.alipay.android.msp.framework.helper.GlobalHelper;
import com.alipay.android.msp.framework.helper.MspExperimentHelper;
import com.alipay.android.msp.framework.statisticsv2.ClientEndCode;
import com.alipay.android.msp.framework.statisticsv2.Grammar;
import com.alipay.android.msp.framework.statisticsv2.StatisticInfo;
import com.alipay.android.msp.framework.statisticsv2.Vector;
import com.alipay.android.msp.framework.statisticsv2.model.StEvent;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.alipay.android.msp.framework.taskscheduler.MonitorRunnable;
import com.alipay.android.msp.framework.taskscheduler.TaskHelper;
import com.alipay.android.msp.pay.callback.IAlipayCallback;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.alipay.android.msp.ui.presenters.MspBasePresenter;
import com.alipay.android.msp.ui.widget.MspDialogHelper;
import com.alipay.android.msp.utils.BroadcastUtil;
import com.alipay.android.msp.utils.EventBusUtil;
import com.alipay.android.msp.utils.EventLogUtil;
import com.alipay.android.msp.utils.JsonUtil;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.mobile.common.logging.api.LoggerFactory;
import com.android.alibaba.ip.runtime.IpChange;
import com.flybird.FBDocument;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class MspContext implements MspContextLifecycleCallbacks {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static String CONTEXT_TYPE_BNFRAME = "bnFrame";
    public static String CONTEXT_TYPE_PAY = "pay";
    public static String CONTEXT_TYPE_RENDER = "render";
    public static final int FRAME_BUILD_NULL = 101;
    private static boolean K = false;
    private static boolean L = false;
    private static boolean M = false;
    public static final String MQP_EXP_JS_PLUGIN_REGISTER_ASYNC_10556 = "MQP_exp_js_plugin_register_async_10556";
    private boolean B;
    private boolean C;
    private boolean D;
    private String E;
    private MspDialogHelper G;
    private Throwable H;

    /* renamed from: a  reason: collision with root package name */
    public int f4533a;
    public Context b;
    public boolean c;
    public MspNetHandler d;
    public StoreCenter e;
    public volatile boolean f;
    public int g;
    public String h;
    public String i;
    public DynDataWrapper<JSONArray> k;
    public String l;
    public int m;
    private boolean n;
    private String o;
    public boolean p;
    private String q;
    private String r;
    private boolean s;
    private boolean t;
    private String u;
    private StatisticInfo x;
    @Deprecated
    private FBDocument z;
    private boolean v = false;
    private String w = "";
    private JSONObject y = new JSONObject();
    @Deprecated
    private boolean A = false;
    public boolean isBizAppCollectMoneyPage = false;
    private boolean F = true;
    public boolean j = false;
    private String I = Grammar.ATTR_DEFAULT_VALUE;
    private boolean J = false;

    public abstract void exit(int i);

    public abstract String getApLinkToken();

    public long getDelayDisposeTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c107c87a", new Object[]{this})).longValue();
        }
        return 0L;
    }

    public boolean getGrayJsPluginBnRegisterAsync() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e89c0a3", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public boolean getGrayJsPluginRegisterBeforeViewLoad() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("70e34d0d", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public boolean getGrayJsPluginRegisterRenderInvoke() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1feb64f1", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public boolean getGrayJsPluginRepeatRegister() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e0f2e79e", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public abstract boolean getGrayOnPadAdaptMode();

    public abstract boolean getGrayUnifiedReadPadConfig();

    public abstract MspBasePresenter getMspBasePresenter();

    public abstract MspExtSceneManager getMspExtSceneManager();

    public abstract MspLogicClient getMspLogicClient();

    public abstract MspUIClient getMspUIClient();

    public abstract StoreCenter getStoreCenter();

    public abstract String getTradeNo();

    public abstract MspWindowFrameStack getWindowStack();

    public void onCompensating(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3f8e789", new Object[]{this, new Integer(i)});
        }
    }

    public void onRendFrameSuccess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20e9d25", new Object[]{this});
        }
    }

    public void onRendResultPage(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab2d3ba5", new Object[]{this, str});
        }
    }

    @Override // com.alipay.android.msp.content.MspContextLifecycleCallbacks
    public void onRestart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c630bb7", new Object[]{this});
        }
    }

    @Override // com.alipay.android.msp.content.MspContextLifecycleCallbacks
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
        }
    }

    @Override // com.alipay.android.msp.content.MspContextLifecycleCallbacks
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
        }
    }

    public abstract void reportExtPaySuccessOnlyOnce();

    public void updateResult(String str, String str2, String str3, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6973a65", new Object[]{this, str, str2, str3, jSONObject});
        }
    }

    public abstract void updateTradeNo(String str);

    public static /* synthetic */ void a(MspContext mspContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70ab45de", new Object[]{mspContext});
        } else {
            mspContext.c();
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        Context context = getContext();
        if (context == null) {
            return;
        }
        K = FastStartActivityHelper.getBoolConfig(context, DrmKey.GRAY_SPM_REPORT_USE_PAYIMP);
        L = !FastStartActivityHelper.getBoolConfig(context, DrmKey.DEGRADE_USE_SAFE_JS_EXECUTE_10560);
        this.J = MspExperimentHelper.isGray("MQP_upgrade_prerender_exp");
        M = !FastStartActivityHelper.getBoolConfig(context, DrmKey.DEGRADE_JS_PLUGIN_REGISTER_ASYNC_10560);
        try {
            PhoneCashierMspEngine.getMspWallet().initConfigManger(context);
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
    }

    public String getBizCodeForKeySpm() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b797aa49", new Object[]{this}) : K ? "payimp" : "pay";
    }

    public int getBizId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("14dc0c52", new Object[]{this})).intValue() : this.g;
    }

    public void setContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a164154", new Object[]{this, context});
        } else {
            this.b = context;
        }
    }

    public Context getContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        if (this.b == null) {
            this.b = GlobalHelper.getInstance().getContext();
        }
        return this.b;
    }

    public void uploadLogForPayImp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe679d71", new Object[]{this});
            return;
        }
        LoggerFactory.getLogContext().flush("payimp", false);
        LoggerFactory.getLogContext().uploadAfterSync("payimp");
    }

    public String getAlertIntelligenceId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("47512979", new Object[]{this});
        }
        if (StringUtils.isEmpty(this.h)) {
            this.h = getServerFoundUserId() + System.currentTimeMillis();
            this.h += "_-";
        }
        return this.h;
    }

    public void setAlertIntelligenceToken(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41097211", new Object[]{this, str});
        } else {
            this.i = str;
        }
    }

    public String getAlertIntelligenceToken() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("91d6405", new Object[]{this}) : this.i;
    }

    public String getApLinkTokenOrLogTraceId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4f770260", new Object[]{this});
        }
        String apLinkToken = getApLinkToken();
        if (StringUtils.isEmpty(apLinkToken)) {
            apLinkToken = getStatisticInfo().getAttr(Vector.Time, "traceId");
        }
        return (StringUtils.isEmpty(apLinkToken) || StringUtils.equals(apLinkToken, "-")) ? "" : apLinkToken;
    }

    public MspNetHandler getMspNetHandler() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MspNetHandler) ipChange.ipc$dispatch("75207156", new Object[]{this}) : this.d;
    }

    public void setMetaSessionData(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78bcd390", new Object[]{this, jSONObject});
        } else if (jSONObject == null) {
        } else {
            JSONObject jSONObject2 = this.y;
            if (jSONObject2 == null || jSONObject2.isEmpty()) {
                this.y = jSONObject;
            } else {
                this.y = JsonUtil.merge(this.y, jSONObject);
            }
        }
    }

    public JSONObject getMetaSessionDataByKeys(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("450317c8", new Object[]{this, list});
        }
        JSONObject jSONObject = new JSONObject();
        if (list != null && list.size() > 0) {
            for (String str : list) {
                if (!StringUtils.isEmpty(str) && this.y.containsKey(str)) {
                    jSONObject.put(str, (Object) this.y.getString(str));
                }
            }
        }
        return jSONObject;
    }

    public void exit(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5910996", new Object[]{this, new Integer(i), new Boolean(z)});
            return;
        }
        LogUtil.i("MspContext", "exit", "delay=" + i + " forceExit=" + z);
        if (!TaskHelper.isMainThread()) {
            NativeDynFunManager.processWithFallbackSync(this.g, DynConstants.DynFunNames.F_CTX_WILL_EXIT, new Object[0], NativeDynFunManager.FallbackFunction.noop, 1000L);
        } else {
            LogUtil.printExceptionStackTrace("MspContext", "exit in main thread", new RuntimeException("for log only"));
            NativeDynFunManager.processWithFallbackAsync(this.g, DynConstants.DynFunNames.F_CTX_WILL_EXIT, new Object[0], NativeDynFunManager.FallbackFunction.noop, NativeDynFunManager.ResultCallbackFunction.noop);
        }
        MqpBehavior.getInstance().onServiceOut(this);
        BroadcastUtil.resetNotifications(this, this.b);
        EventBusUtil.resetNotifications(this, this.b);
        this.G = null;
        if (!NativeTplRuntimeManager.drmEnabled()) {
            return;
        }
        MonitorRunnable monitorRunnable = new MonitorRunnable(new Runnable() { // from class: com.alipay.android.msp.core.context.MspContext.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                NativeTplRuntimeManager.garbageRemoval(MspContext.this.g);
                NativeDynFunManager.garbageRemoval(MspContext.this.g);
            }
        }, 8000L);
        Context context = this.b;
        if (context != null && DrmManager.getInstance(context).isGray(DrmKey.GRAY_DELAY_THREAD_RUNNABLE, false, this.b)) {
            TaskHelper.getInstance().executeDelayed(monitorRunnable, 8000L, TaskHelper.ThreadName.UI_CONTEXT);
        } else {
            TaskHelper.execute(monitorRunnable, 8000L);
        }
    }

    public JSONObject uploadChanges(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("c4af45b3", new Object[]{this, str});
        }
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray b = b();
            if (b == null) {
                b = new JSONArray();
            }
            jSONObject.put(DynConstants.DynDataNames.D_CHANGE_TOKENS, (Object) b);
            Pair exit = ConfigChangeMonitor.getInstance().exit();
            Pair exit2 = TemplateChangeMonitor.getInstance().exit();
            jSONObject.put("changed", (Object) Boolean.FALSE);
            jSONObject.put("configChanged", (Object) Boolean.FALSE);
            jSONObject.put("templateChanged", (Object) Boolean.FALSE);
            LogUtil.i("MspContext", "configChange", ((JSONArray) exit.second).toString());
            jSONObject.put("recentlyChange", (Object) ((JSONArray) exit.second).toString());
            jSONObject.put("recentlyConfigChange", exit.second);
            jSONObject.put("configChanged", exit.first);
            if (((Boolean) exit.first).booleanValue()) {
                jSONObject.put("changed", (Object) Boolean.TRUE);
            }
            LogUtil.i("MspContext", "templateChange", ((JSONArray) exit2.second).toString());
            jSONObject.put("recentlyTemplateChange", exit2.second);
            jSONObject.put("templateChanged", exit2.first);
            if (((Boolean) exit2.first).booleanValue()) {
                jSONObject.put("changed", (Object) Boolean.TRUE);
            }
            jSONObject.put("ap_link_token", (Object) getAlertIntelligenceId());
            jSONObject.put("biz_type", (Object) str);
            HashMap hashMap = new HashMap();
            for (Map.Entry<String, Object> entry : jSONObject.getInnerMap().entrySet()) {
                hashMap.put(entry.getKey(), String.valueOf(entry.getValue()));
            }
            EventLogUtil.logPayEvent("1010971", hashMap);
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
        return jSONObject;
    }

    public JSONArray b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("505e5935", new Object[]{this});
        }
        DynDataWrapper<JSONArray> dynDataWrapper = this.k;
        if (dynDataWrapper == null) {
            return null;
        }
        return dynDataWrapper.read();
    }

    public void clearWorkerFbDoc() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("749e8578", new Object[]{this});
        } else if (MspDbManager.getDbManager().isEnableBehaviorManager()) {
            TaskHelper.runOnUIThread(new Runnable() { // from class: com.alipay.android.msp.core.context.MspContext.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        MspContext.a(MspContext.this);
                    }
                }
            }, 10000L);
        } else {
            c();
        }
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        FBDocument fBDocument = this.z;
        if (fBDocument == null) {
            return;
        }
        try {
            fBDocument.destroy(null);
            LogUtil.record(4, "MspContext:exit", "mFbDocumentCount destroy, mspContext=".concat(String.valueOf(this)));
            this.z = null;
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace(e);
        }
    }

    public boolean isGrayNative2Dyapi() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("83fd3b82", new Object[]{this})).booleanValue() : this.A;
    }

    public void setGrayNative2Dyapi(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e1d6ade", new Object[]{this, new Boolean(z)});
        } else {
            this.A = z;
        }
    }

    public boolean isExit() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("521f25f3", new Object[]{this})).booleanValue() : this.f;
    }

    public boolean isFromWallet() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a09ea318", new Object[]{this})).booleanValue() : this.n;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.n = z;
        }
    }

    public FBDocument getWorkerServiceDoc() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FBDocument) ipChange.ipc$dispatch("ef9dfa5f", new Object[]{this}) : this.z;
    }

    public void setWorkerServiceDoc(FBDocument fBDocument) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6a9df11", new Object[]{this, fBDocument});
        } else {
            this.z = fBDocument;
        }
    }

    public IAlipayCallback getAlipayCallback() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IAlipayCallback) ipChange.ipc$dispatch("2848e44c", new Object[]{this});
        }
        if (this instanceof MspTradeContext) {
            MspTradeContext mspTradeContext = (MspTradeContext) this;
            if (mspTradeContext.getOrderInfo() != null && mspTradeContext.getOrderInfo() != null) {
                return MspContextManager.getInstance().a(mspTradeContext.getOrderInfo().hashCode(), this.f4533a);
            }
        }
        return MspContextManager.getInstance().a(-1, this.f4533a);
    }

    public String getCurrentWinTpName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("cb185ed9", new Object[]{this}) : this.o;
    }

    public void updateCurrentWinTpName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8adb01e4", new Object[]{this, str});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            if (str.equals("null")) {
                this.o = "";
            } else {
                this.o = str;
            }
        }
    }

    public int getCallingPid() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("aa45a017", new Object[]{this})).intValue() : this.f4533a;
    }

    public void setCallingPid(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d54570d3", new Object[]{this, new Integer(i)});
        } else {
            this.f4533a = i;
        }
    }

    public void setSpmDpToken(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43223050", new Object[]{this, str});
        } else if (!StringUtils.isEmpty(str)) {
            for (String str2 : str.split(";")) {
                String[] split = str2.split("=");
                if (split.length == 2) {
                    String str3 = split[0];
                    String str4 = split[1];
                    if (StringUtils.equals(str3, "ndpt")) {
                        this.r = str4;
                    }
                }
            }
        }
    }

    public String getSpmDpToken() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b401d3e6", new Object[]{this}) : this.r;
    }

    public String getSpmSessionId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8dc1a662", new Object[]{this});
        }
        if (StringUtils.isEmpty(this.q)) {
            this.q = this.g + GlobalHelper.getInstance().getUtdid(this.b);
        }
        if (StringUtils.isEmpty(this.r)) {
            this.r = "null";
        }
        return "dpCheck_" + this.q + "_" + this.r;
    }

    public void setSpmUniqueId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81b5cbeb", new Object[]{this, str});
        } else {
            this.q = str;
        }
    }

    public String getSpmUniqueId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e2630d53", new Object[]{this}) : this.q;
    }

    public String getServerFoundUserId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c157a9ea", new Object[]{this}) : this.u;
    }

    public void setServerFoundUserId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("671c9b34", new Object[]{this, str});
        } else {
            this.u = str;
        }
    }

    public boolean isFingerPay() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ea9f1480", new Object[]{this})).booleanValue() : this.t;
    }

    public void setFingerPay(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7926db10", new Object[]{this, new Boolean(z)});
        } else {
            this.t = z;
        }
    }

    public String getGlobalSession() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1ba5115c", new Object[]{this}) : this.w;
    }

    public void setGlobalSession(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d9cfc02", new Object[]{this, str});
        } else {
            this.w = str;
        }
    }

    public String getContextType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("afbba086", new Object[]{this}) : this.l;
    }

    public void setTaskId(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4073381a", new Object[]{this, new Integer(i)});
        } else {
            this.m = i;
        }
    }

    public int getTaskId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("16006df0", new Object[]{this})).intValue() : this.m;
    }

    public boolean isHasShowResultPage() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("be78c64", new Object[]{this})).booleanValue() : this.v;
    }

    public void setHasShowResultPage(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ce8a7ac", new Object[]{this, new Boolean(z)});
        } else {
            this.v = z;
        }
    }

    public boolean isSchemePay() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("cee1a6c4", new Object[]{this})).booleanValue() : this.c;
    }

    public String getCallbackUrlForOpenWeb() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a83205a4", new Object[]{this}) : this.E;
    }

    public void setCallbackUrlForOpenWeb(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b469dcba", new Object[]{this, str});
        } else {
            this.E = str;
        }
    }

    public StatisticInfo getStatisticInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StatisticInfo) ipChange.ipc$dispatch("a01255e5", new Object[]{this});
        }
        if (this.x == null) {
            this.x = new StatisticInfo(this.g);
        }
        return this.x;
    }

    public boolean isFromEntranceActivity() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("84db7c04", new Object[]{this})).booleanValue() : this.C;
    }

    public void setFromEntranceActivity(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6110169c", new Object[]{this, new Boolean(z)});
            return;
        }
        this.C = z;
        LogUtil.record(2, "MspContext:setFromEntranceActivity", "v=" + this.C);
    }

    public boolean isMspBgTransparent() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4e747b8", new Object[]{this})).booleanValue() : this.F;
    }

    public void setMspBgTransparent(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a74e568", new Object[]{this, new Boolean(z)});
        } else {
            this.F = z;
        }
    }

    public boolean isFromOutScheme() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3ddfea0a", new Object[]{this})).booleanValue() : this.s;
    }

    public void setFromOutScheme(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55f75ac6", new Object[]{this, new Boolean(z)});
        } else {
            this.s = z;
        }
    }

    public MspDialogHelper getMspDialogHelper() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MspDialogHelper) ipChange.ipc$dispatch("543a1500", new Object[]{this}) : this.G;
    }

    public void setMspDialogHelper(MspDialogHelper mspDialogHelper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e295420", new Object[]{this, mspDialogHelper});
        } else {
            this.G = mspDialogHelper;
        }
    }

    public void setObscuredTouch(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("931e368f", new Object[]{this, new Boolean(z)});
            return;
        }
        if (this.B != z) {
            StatisticInfo statisticInfo = getStatisticInfo();
            statisticInfo.addError(ErrorType.WARNING, "ObscuredTouch", z + "|" + this.B);
        }
        this.B = z;
    }

    public boolean isTranslucentBg() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("25bb16ff", new Object[]{this})).booleanValue() : this.D;
    }

    public void setTranslucentBg(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6981cc71", new Object[]{this, new Boolean(z)});
        } else {
            this.D = z;
        }
    }

    public boolean isObscuredTouch() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c3f9f121", new Object[]{this})).booleanValue() : this.B;
    }

    public Throwable getThrowableWhenNoPresenter() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Throwable) ipChange.ipc$dispatch("4899314f", new Object[]{this}) : this.H;
    }

    public void setThrowableWhenNoPresenter(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("244fe13f", new Object[]{this, th});
        } else {
            this.H = th;
        }
    }

    @Override // com.alipay.android.msp.content.MspContextLifecycleCallbacks
    public void onContextCreated() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8adf5e7f", new Object[]{this});
            return;
        }
        MqpBehavior.getInstance().onServiceIn(this);
        MspExperimentHelper.reportEvent(this, "MQP_upgrade_prerender_exp");
    }

    @Override // com.alipay.android.msp.content.MspContextLifecycleCallbacks
    public void didEnterBackground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c051a8ae", new Object[]{this});
            return;
        }
        LogUtil.record(2, "MspContext:didEnterBackground", "this=".concat(String.valueOf(this)));
        this.I = getStatisticInfo().getAttr(Vector.Result, "clientEndCode");
        String currentWinTpName = getCurrentWinTpName();
        getStatisticInfo().addEvent(new StEvent(currentWinTpName, "native", "resign_active"));
        StatisticInfo statisticInfo = getStatisticInfo();
        Vector vector = Vector.Result;
        StringBuilder sb = new StringBuilder();
        sb.append(ClientEndCode.USEREXITAPP);
        statisticInfo.updateAttr(vector, "clientEndCode", sb.toString());
        getStatisticInfo().updateAttr(Vector.Result, "lastPage", currentWinTpName);
        getStatisticInfo().persistSave();
        MqpBehavior.getInstance().didEnterBackground(this);
    }

    @Override // com.alipay.android.msp.content.MspContextLifecycleCallbacks
    public void willEnterForeground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9842010", new Object[]{this});
            return;
        }
        LogUtil.record(2, "MspContext:willEnterForeground", "this=".concat(String.valueOf(this)));
        String currentWinTpName = getCurrentWinTpName();
        getStatisticInfo().updateAttr(Vector.Result, "clientEndCode", this.I);
        getStatisticInfo().updateAttr(Vector.Result, "lastPage", Grammar.ATTR_DEFAULT_VALUE);
        getStatisticInfo().addEvent(new StEvent(currentWinTpName, "native", "become_active"));
        getStatisticInfo().persistDelete();
        MqpBehavior.getInstance().willEnterForeground(this);
        PhoneCashierMspEngine.getMspWallet().getWalletConfig("willEnterForeground");
    }

    public boolean isFromAidl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1807f4f", new Object[]{this})).booleanValue() : this.p;
    }

    public boolean isUseSafeJsExecute() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e74b9b6d", new Object[]{this})).booleanValue() : L;
    }

    public boolean isUpgradePreRendTpl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1c76a221", new Object[]{this})).booleanValue() : this.J;
    }

    public static boolean isJsPluginRegisterAsync() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5120dd1e", new Object[0])).booleanValue() : M;
    }
}
