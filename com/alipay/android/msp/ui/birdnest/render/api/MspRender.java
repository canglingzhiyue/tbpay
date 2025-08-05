package com.alipay.android.msp.ui.birdnest.render.api;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.support.v4.util.Pair;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.ali.user.mobile.app.constant.UTConstant;
import com.alibaba.fastjson.JSON;
import com.alipay.android.app.cctemplate.api.ITplProvider;
import com.alipay.android.app.cctemplate.api.TemplateService;
import com.alipay.android.app.cctemplate.model.Template;
import com.alipay.android.app.render.api.CashierRenderFactory;
import com.alipay.android.app.render.api.ICashierRender;
import com.alipay.android.app.render.api.ITemplateLoadStatusCallback;
import com.alipay.android.app.render.api.ext.BirdNestRender;
import com.alipay.android.app.render.api.result.MspPrepareResult;
import com.alipay.android.app.render.api.result.PreparedResult;
import com.alipay.android.app.render.api.result.RenderStatistic;
import com.alipay.android.app.safepaylog.api.LogItem;
import com.alipay.android.app.safepaylogv2.api.StatisticCollector;
import com.alipay.android.app.template.EventHandler;
import com.alipay.android.app.template.FBContext;
import com.alipay.android.app.template.FBPluginFactory;
import com.alipay.android.app.template.ITemplateClickCallback;
import com.alipay.android.app.template.JSPlugin;
import com.alipay.android.msp.constants.MspFlybirdDefine;
import com.alipay.android.msp.core.callback.IRenderCallback;
import com.alipay.android.msp.core.context.MspContext;
import com.alipay.android.msp.core.context.MspContextManager;
import com.alipay.android.msp.core.context.MspTradeContext;
import com.alipay.android.msp.framework.drm.DrmKey;
import com.alipay.android.msp.framework.drm.DrmManager;
import com.alipay.android.msp.framework.dynfun.DynConstants;
import com.alipay.android.msp.framework.dynfun.NativeTplRuntimeManager;
import com.alipay.android.msp.framework.dynfun.TplIdentity;
import com.alipay.android.msp.framework.ext.MspExtSceneManager;
import com.alipay.android.msp.framework.lowdevice.MspLowDeviceManager;
import com.alipay.android.msp.framework.statisticsv2.StatisticInfo;
import com.alipay.android.msp.framework.statisticsv2.collector.TradeCollector;
import com.alipay.android.msp.framework.statisticsv2.model.StEvent;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.alipay.android.msp.framework.taskscheduler.TaskHelper;
import com.alipay.android.msp.plugin.IRender;
import com.alipay.android.msp.plugin.RenderConfig;
import com.alipay.android.msp.plugin.RenderTime;
import com.alipay.android.msp.plugin.birdnest.MspPluginFactory;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.alipay.android.msp.plugin.manager.PluginManager;
import com.alipay.android.msp.ui.base.keyboard.MspKeyboardService;
import com.alipay.android.msp.ui.birdnest.render.ext.TplProvider;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.android.msp.utils.MspContextUtil;
import com.android.alibaba.ip.runtime.IpChange;
import com.flybird.FBDocument;
import com.flybird.deploy.model.d;
import com.flybird.session.standalone.StandaloneTemplateService;
import com.flybird.session.standalone.model.CreateEngineOptions;
import com.flybird.session.standalone.model.TriggerPrerenderOptions;
import com.taobao.tao.alipay.callservice.AlipayCallServiceActivity;
import com.taobao.taobao.R;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import tb.cun;
import tb.gkl;

/* loaded from: classes3.dex */
public class MspRender implements IRender {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String AGEDNESS_VERSION_SCALE = "1.35";
    private static final String TAG = "MspRender";
    private static final FBContext.JsExecOptions callJsOpt = FBContext.JsExecOptions.create().setAsyncMode(0).setCallbackMode(0).setBlockTimeoutMs(60000);
    private static CreateEngineOptions preRendEngineOptions;
    private ITplProvider mTplProvider;
    private FBPluginFactory mPluginFactory = null;
    public MspKeyboardService mMspKeyboardService = null;
    public BirdNestRender mRender = CashierRenderFactory.create();

    public void initializeKeyboard() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d173f49e", new Object[]{this});
        }
    }

    public void setKeyboardService(MspContext mspContext, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc46eddf", new Object[]{this, mspContext, context});
        }
    }

    public static /* synthetic */ void access$000(String str, String str2, Context context) throws RuntimeException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bd8b11d", new Object[]{str, str2, context});
        } else {
            triggerPreRender(str, str2, context);
        }
    }

    public MspRender() {
        this.mRender.setTplProvider(getTplProvider());
    }

    private ITplProvider getTplProvider() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITplProvider) ipChange.ipc$dispatch("46322b6", new Object[]{this});
        }
        if (this.mTplProvider == null) {
            this.mTplProvider = new TplProvider();
        }
        return this.mTplProvider;
    }

    @Override // com.alipay.android.msp.plugin.IRender
    public Object preloadViewNew(Context context, int i, String str, String str2, String str3, JSONObject jSONObject, JSONObject jSONObject2, IRenderCallback iRenderCallback, RenderConfig renderConfig) throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("3f8ed288", new Object[]{this, context, new Integer(i), str, str2, str3, jSONObject, jSONObject2, iRenderCallback, renderConfig});
        }
        LogUtil.record(1, "MspRender:preloadViewNew", "bizId= ".concat(String.valueOf(i)));
        initializePlugin(i);
        initializeKeyboard();
        this.mRender.setFBPluginFactory(this.mPluginFactory);
        MspContext mspContextByBizId = MspContextManager.getInstance().getMspContextByBizId(i);
        setKeyboardService(mspContextByBizId, context);
        JSONObject buildLoadData = buildLoadData(jSONObject, jSONObject2, i, str, context);
        Map<String, String> createBirdNestAppParams = createBirdNestAppParams(context, i, str);
        MspRenderCallback mspRenderCallback = new MspRenderCallback(i, context, iRenderCallback);
        ICashierRender.RenderParams createRenderParams = createRenderParams(mspContextByBizId, context, str, renderConfig);
        if (preRendEngineOptions == null) {
            preRendEngineOptions = createPreRendEngineOptions(context.getApplicationContext());
        }
        return this.mRender.preloadViewNew(context, str, str2, str3, buildLoadData, mspRenderCallback, createRenderParams, createBirdNestAppParams, preRendEngineOptions);
    }

    private ICashierRender.RenderParams createRenderParams(MspContext mspContext, Context context, String str, final RenderConfig renderConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ICashierRender.RenderParams) ipChange.ipc$dispatch("de852b3e", new Object[]{this, mspContext, context, str, renderConfig});
        }
        ITemplateLoadStatusCallback iTemplateLoadStatusCallback = new ITemplateLoadStatusCallback() { // from class: com.alipay.android.msp.ui.birdnest.render.api.MspRender.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alipay.android.app.render.api.ITemplateLoadStatusCallback
            public void onTemplateLoadResult(ICashierRender.TemplateLoadStatus templateLoadStatus) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f31a0b21", new Object[]{this, templateLoadStatus});
                } else if (renderConfig.mTemplateLoadedCallback == null) {
                } else {
                    renderConfig.mTemplateLoadedCallback.onTemplateLoaded();
                }
            }

            @Override // com.alipay.android.app.render.api.ITemplateLoadStatusCallback
            public boolean onNewBnDeployAskingUserShouldContinue() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("761ff92d", new Object[]{this})).booleanValue();
                }
                if (renderConfig.mTemplateLoadedCallback == null) {
                    return false;
                }
                return renderConfig.mTemplateLoadedCallback.onNewBnDeployAskingUserShouldContinue();
            }
        };
        RenderTime renderTime = renderConfig.mRenderTime;
        ICashierRender.RenderParams templateLoadStatusCallback = new ICashierRender.RenderParams(renderConfig.isPreRend).setTemplateLoadStatusCallback(iTemplateLoadStatusCallback);
        templateLoadStatusCallback.setRenderStatistic(renderTime == null ? null : renderTime.getInnerStatistic());
        if (mspContext != null) {
            if (mspContext.getGrayUnifiedReadPadConfig()) {
                MspExtSceneManager mspExtSceneManager = mspContext.getMspExtSceneManager();
                if (mspExtSceneManager != null) {
                    templateLoadStatusCallback.setOnPadAdaptMode(mspExtSceneManager.onPadAdaptMode(context, str, mspContext.getGrayOnPadAdaptMode()));
                    templateLoadStatusCallback.setDisplayHeight(mspExtSceneManager.getDisplayHeight());
                    templateLoadStatusCallback.setDisplayWidth(mspExtSceneManager.getDisplayWidth(context));
                }
            } else {
                MspExtSceneManager mspExtSceneManager2 = new MspExtSceneManager(context);
                templateLoadStatusCallback.setOnPadAdaptMode(MspExtSceneManager.onPadAdaptMode(context, mspExtSceneManager2, str, mspContext.getGrayOnPadAdaptMode()));
                templateLoadStatusCallback.setDisplayHeight(mspExtSceneManager2.getDisplayHeight());
                templateLoadStatusCallback.setDisplayWidth(mspExtSceneManager2.getDisplayWidth(context));
            }
        }
        return templateLoadStatusCallback;
    }

    private Map<String, String> createBirdNestAppParams(Context context, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("76ca8cbb", new Object[]{this, context, new Integer(i), str});
        }
        HashMap hashMap = new HashMap();
        if (needEnableAgedVersion(str, context)) {
            hashMap.put("pixelToRem", "true");
            hashMap.put("scale", "1");
            if (PhoneCashierMspEngine.getMspWallet().isUserAgednessVersion(i)) {
                hashMap.put("scale", AGEDNESS_VERSION_SCALE);
            }
        }
        return hashMap;
    }

    @Override // com.alipay.android.msp.plugin.IRender
    @Deprecated
    public Object preloadView(Context context, int i, String str, String str2, String str3, JSONObject jSONObject, IRenderCallback iRenderCallback) throws Throwable {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("e4765d01", new Object[]{this, context, new Integer(i), str, str2, str3, jSONObject, iRenderCallback}) : preloadView(context, i, str, str2, str3, jSONObject, null, iRenderCallback, new RenderConfig(false));
    }

    @Override // com.alipay.android.msp.plugin.IRender
    @Deprecated
    public Object preloadView(Context context, int i, String str, String str2, String str3, JSONObject jSONObject, JSONObject jSONObject2, IRenderCallback iRenderCallback, final RenderConfig renderConfig) throws Throwable {
        TplIdentity tplIdentity;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("bb8e1c2c", new Object[]{this, context, new Integer(i), str, str2, str3, jSONObject, jSONObject2, iRenderCallback, renderConfig});
        }
        initializePlugin(i);
        initializeKeyboard();
        this.mRender.setFBPluginFactory(this.mPluginFactory);
        MspContext mspContextByBizId = MspContextManager.getInstance().getMspContextByBizId(i);
        setKeyboardService(mspContextByBizId, context);
        HashMap hashMap = new HashMap();
        boolean z = mspContextByBizId instanceof MspTradeContext;
        String tradeNo = z ? ((MspTradeContext) mspContextByBizId).getTradeNo() : "";
        String userId = MspContextUtil.getUserId();
        LogUtil.record(1, "MspRender:preloadView", "tplId= " + str + " tradeNo= " + tradeNo + " uid= " + userId);
        hashMap.put("tplId", str);
        hashMap.put("tradeNo", tradeNo);
        hashMap.put("uid", userId);
        hashMap.put("bizId", String.valueOf(i));
        hashMap.put("serviceId", String.valueOf(i));
        hashMap.put("bp", PluginManager.getRender().getEngineParams());
        hashMap.put("startupParams", jSONObject);
        hashMap.put("serverApiVer", "5.7.2");
        hashMap.put("sceneParams", jSONObject2);
        hashMap.put("osVersion", Integer.valueOf(Build.VERSION.SDK_INT));
        hashMap.put("osVersionRelease", Build.VERSION.RELEASE);
        hashMap.put("apLinkToken", z ? ((MspTradeContext) mspContextByBizId).getApLinkToken() : "");
        hashMap.put("clientBizType", TradeCollector.getBizType(i));
        RenderStatistic renderStatistic = null;
        if (TplIdentity.drmEnabled()) {
            com.alibaba.fastjson.JSONObject jSONObject3 = new com.alibaba.fastjson.JSONObject();
            jSONObject3.put("tplId", (Object) str);
            TplIdentity generateTplIdentity = TplIdentity.generateTplIdentity(i, jSONObject3, TextUtils.equals(str, MspFlybirdDefine.FLYBIRD_MAIN_SERVICE_TPL));
            hashMap.put("tplIdentity", generateTplIdentity.toJSON().toString());
            tplIdentity = generateTplIdentity;
        } else {
            tplIdentity = null;
        }
        if (mspContextByBizId != null) {
            hashMap.put("degradeUnifyResAutoAdapt", Boolean.valueOf(DrmManager.getInstance(context).isDegrade(DrmKey.DEGRADE_UNIFY_RESULT_AUTOADAPT, false, context)));
            if (z) {
                hashMap.put(DynConstants.DynDataNames.D_CLIENT_LOG_DATA, JSON.toJSONString(((MspTradeContext) mspContextByBizId).getClientLogData()));
            }
        }
        Map<String, String> authUserInfo = PhoneCashierMspEngine.getMspWallet().getAuthUserInfo();
        if (authUserInfo != null) {
            String str4 = authUserInfo.get(AlipayCallServiceActivity.ALIPAY_EXTERN_TOKEN);
            String str5 = authUserInfo.get("logonId");
            if (str4 != null && str4.length() > 0) {
                hashMap.put(AlipayCallServiceActivity.ALIPAY_EXTERN_TOKEN, str4);
            }
            if (str5 != null && str5.length() > 0) {
                hashMap.put("logonId", str5);
            }
        }
        MspTradeContext tradeContextByBizId = MspContextManager.getInstance().getTradeContextByBizId(i);
        if (tradeContextByBizId != null && tradeContextByBizId.getBizContext() != null) {
            hashMap.put(gkl.DP_BIZ_CONTEXT, tradeContextByBizId.getBizContext());
            LogUtil.record(1, "MspRender:preloadView", "bizContext= " + tradeContextByBizId.getBizContext());
        }
        if (tradeContextByBizId != null) {
            hashMap.putAll(tradeContextByBizId.getMetaSessionDataByKeys(Arrays.asList("expectedDocHeight")));
            hashMap.put("sourcePackage", tradeContextByBizId.getOutPackageName());
        }
        MspRenderCallback mspRenderCallback = new MspRenderCallback(i, context, iRenderCallback);
        ITemplateLoadStatusCallback iTemplateLoadStatusCallback = new ITemplateLoadStatusCallback() { // from class: com.alipay.android.msp.ui.birdnest.render.api.MspRender.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alipay.android.app.render.api.ITemplateLoadStatusCallback
            public void onTemplateLoadResult(ICashierRender.TemplateLoadStatus templateLoadStatus) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f31a0b21", new Object[]{this, templateLoadStatus});
                } else if (renderConfig.mTemplateLoadedCallback == null) {
                } else {
                    renderConfig.mTemplateLoadedCallback.onTemplateLoaded();
                }
            }

            @Override // com.alipay.android.app.render.api.ITemplateLoadStatusCallback
            public boolean onNewBnDeployAskingUserShouldContinue() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("761ff92d", new Object[]{this})).booleanValue();
                }
                if (renderConfig.mTemplateLoadedCallback == null) {
                    return false;
                }
                return renderConfig.mTemplateLoadedCallback.onNewBnDeployAskingUserShouldContinue();
            }
        };
        RenderTime renderTime = renderConfig.mRenderTime;
        ICashierRender.RenderParams templateLoadStatusCallback = new ICashierRender.RenderParams(renderConfig.isPreRend).setTemplateLoadStatusCallback(iTemplateLoadStatusCallback);
        if (renderTime != null) {
            renderStatistic = renderTime.getInnerStatistic();
        }
        templateLoadStatusCallback.setRenderStatistic(renderStatistic);
        if (mspContextByBizId != null) {
            if (mspContextByBizId.getGrayUnifiedReadPadConfig()) {
                MspExtSceneManager mspExtSceneManager = mspContextByBizId.getMspExtSceneManager();
                if (mspExtSceneManager != null) {
                    templateLoadStatusCallback.setOnPadAdaptMode(mspExtSceneManager.onPadAdaptMode(context, str, mspContextByBizId.getGrayOnPadAdaptMode()));
                    templateLoadStatusCallback.setDisplayHeight(mspExtSceneManager.getDisplayHeight());
                    templateLoadStatusCallback.setDisplayWidth(mspExtSceneManager.getDisplayWidth(context));
                }
            } else {
                MspExtSceneManager mspExtSceneManager2 = new MspExtSceneManager(context);
                templateLoadStatusCallback.setOnPadAdaptMode(MspExtSceneManager.onPadAdaptMode(context, mspExtSceneManager2, str, mspContextByBizId.getGrayOnPadAdaptMode()));
                templateLoadStatusCallback.setDisplayHeight(mspExtSceneManager2.getDisplayHeight());
                templateLoadStatusCallback.setDisplayWidth(mspExtSceneManager2.getDisplayWidth(context));
            }
        }
        HashMap hashMap2 = new HashMap();
        if (needEnableAgedVersion(str, context)) {
            hashMap.put("pixelToRem", "true");
            hashMap.put("scale", "1");
            hashMap2.put("pixelToRem", "true");
            hashMap2.put("scale", "1");
            boolean isUserAgednessVersion = PhoneCashierMspEngine.getMspWallet().isUserAgednessVersion(i);
            if (isUserAgednessVersion) {
                hashMap2.put("scale", AGEDNESS_VERSION_SCALE);
                hashMap.put("agednessVersion", Boolean.TRUE);
                hashMap.put("scale", AGEDNESS_VERSION_SCALE);
            }
            if (mspContextByBizId != null) {
                mspContextByBizId.getStatisticInfo().addEvent(new StEvent(str.startsWith("QUICKPAY@") ? str.substring(9) : str, "aged", isUserAgednessVersion ? "T" : UTConstant.Args.UT_SUCCESS_F));
            }
        }
        if (MspLowDeviceManager.getInstance().isLowDevice()) {
            hashMap.put("isLowDevice", Boolean.TRUE);
        }
        PreparedResult preloadView = this.mRender.preloadView(context, str, str2, str3, hashMap, mspRenderCallback, templateLoadStatusCallback, hashMap2);
        if (NativeTplRuntimeManager.drmEnabled() && tplIdentity != null && (preloadView.mResult instanceof FBDocument)) {
            NativeTplRuntimeManager.registerTpl(tplIdentity, new WeakReference((FBDocument) preloadView.mResult));
        }
        if (preloadView.mResult instanceof FBDocument) {
            setCancelTplClickInterval(context, str, (FBDocument) preloadView.mResult);
        }
        return preloadView;
    }

    private void setCancelTplClickInterval(Context context, String str, FBDocument fBDocument) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("682b9e39", new Object[]{this, context, str, fBDocument});
        } else if (context == null || fBDocument == null || str == null) {
        } else {
            try {
                com.alibaba.fastjson.JSONObject drmValueFromKey = DrmManager.getInstance(context).getDrmValueFromKey(DrmKey.GRAY_CANCEL_CLICK_INTERVAL);
                if (drmValueFromKey == null) {
                    return;
                }
                LogUtil.record(1, "MspRender:setCancelTplClickInterval", "json=" + drmValueFromKey.toString());
                if (!str.startsWith("QUICKPAY@") || !TextUtils.equals(drmValueFromKey.getString(str.substring(9)), "true")) {
                    return;
                }
                LogUtil.record(1, "MspRender:setCancelTplClickInterval", "cancelClickInterval");
                fBDocument.setClickMode("none");
            } catch (Throwable th) {
                LogUtil.printExceptionStackTrace(th);
            }
        }
    }

    public static boolean needEnableAgedVersion(String str, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eae350c1", new Object[]{str, context})).booleanValue();
        }
        if (context != null && !TextUtils.isEmpty(str)) {
            try {
                com.alibaba.fastjson.JSONObject drmValueFromKey = DrmManager.getInstance(context).getDrmValueFromKey(DrmKey.ENABLE_AGEDNESS_VERSION_TPL);
                if (drmValueFromKey != null && str.startsWith("QUICKPAY@")) {
                    String substring = str.substring(9);
                    String string = drmValueFromKey.getString(substring);
                    if (!TextUtils.isEmpty(string)) {
                        boolean procGraySwitchWithRate = DrmManager.getInstance(context).procGraySwitchWithRate(context, Integer.parseInt(string));
                        LogUtil.record(2, "MspRender:needEnableAgedVersion", "tplId=" + substring + " need=" + procGraySwitchWithRate);
                        return procGraySwitchWithRate;
                    }
                }
            } catch (Exception e) {
                LogUtil.printExceptionStackTrace(e);
            }
        }
        return false;
    }

    public static Pair<String, TplIdentity> buildRpcData(JSONObject jSONObject, JSONObject jSONObject2, String str, int i, String str2, String str3, Context context) {
        Context context2;
        TplIdentity tplIdentity;
        JSONObject jSONObject3;
        JSONObject jSONObject4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("9e0dd62c", new Object[]{jSONObject, jSONObject2, str, new Integer(i), str2, str3, context});
        }
        try {
            JSONObject jSONObject5 = new JSONObject();
            MspContext mspContextByBizId = MspContextManager.getInstance().getMspContextByBizId(i);
            String tradeNo = mspContextByBizId instanceof MspTradeContext ? ((MspTradeContext) mspContextByBizId).getTradeNo() : "";
            String userId = MspContextUtil.getUserId();
            LogUtil.record(1, "MspRender:buildRpcData", "tplId= " + str2 + " tradeNo= " + tradeNo + " uid= " + userId);
            jSONObject5.put("tplId", str2);
            jSONObject5.put("tradeNo", tradeNo);
            jSONObject5.put("uid", userId);
            Map<String, String> authUserInfo = PhoneCashierMspEngine.getMspWallet().getAuthUserInfo();
            if (authUserInfo != null) {
                String str4 = authUserInfo.get(AlipayCallServiceActivity.ALIPAY_EXTERN_TOKEN);
                String str5 = authUserInfo.get("logonId");
                if (!TextUtils.isEmpty(str4)) {
                    jSONObject5.put(AlipayCallServiceActivity.ALIPAY_EXTERN_TOKEN, str4);
                }
                if (!TextUtils.isEmpty(str5)) {
                    jSONObject5.put("logonId", str5);
                }
            }
            jSONObject5.put("bizId", String.valueOf(i));
            jSONObject5.put("serviceId", String.valueOf(i));
            try {
                JSONObject jSONObject6 = new JSONObject(str3);
                if (jSONObject6.has("expInfo") && (jSONObject4 = jSONObject6.getJSONObject("expInfo")) != null) {
                    jSONObject5.put("expInfo", jSONObject4);
                }
                if (jSONObject6.has("expLog") && (jSONObject3 = jSONObject6.getJSONObject("expLog")) != null) {
                    jSONObject5.put("expLog", jSONObject3);
                }
                if (jSONObject6.has("expId")) {
                    String string = jSONObject6.getString("expId");
                    if (!TextUtils.isEmpty(string)) {
                        jSONObject5.put("expId", string);
                    }
                }
                if (!TextUtils.isEmpty(str3)) {
                    jSONObject5.put("tplInfo", str3);
                }
            } catch (Exception e) {
                LogUtil.printExceptionStackTrace(e);
            }
            if (mspContextByBizId != null) {
                jSONObject5.put("degradeUnifyResAutoAdapt", DrmManager.getInstance(mspContextByBizId.getContext()).isDegrade(DrmKey.DEGRADE_UNIFY_RESULT_AUTOADAPT, false, mspContextByBizId.getContext()));
                if (mspContextByBizId instanceof MspTradeContext) {
                    jSONObject5.put(DynConstants.DynDataNames.D_CLIENT_LOG_DATA, JSON.toJSONString(((MspTradeContext) mspContextByBizId).getClientLogData()));
                }
            }
            MspTradeContext tradeContextByBizId = MspContextManager.getInstance().getTradeContextByBizId(i);
            if (tradeContextByBizId != null) {
                jSONObject5.put("expectedDocHeight", tradeContextByBizId.getMetaSessionDataByKeys(Arrays.asList("expectedDocHeight")).getString("expectedDocHeight"));
                jSONObject5.put("sourcePackage", tradeContextByBizId.getOutPackageName());
            }
            if (tradeContextByBizId != null && tradeContextByBizId.getBizContext() != null) {
                jSONObject5.put(gkl.DP_BIZ_CONTEXT, tradeContextByBizId.getBizContext());
                LogUtil.record(1, "MspRender:preloadView", "bizContext= " + tradeContextByBizId.getBizContext());
            }
            jSONObject5.put("bp", PluginManager.getRender().getEngineParams());
            jSONObject5.put("startupParams", jSONObject);
            jSONObject5.put("sceneParams", jSONObject2);
            jSONObject5.put("osVersion", Build.VERSION.SDK_INT);
            jSONObject5.put("birdNestVer", TemplateService.getBirdNestVersion());
            jSONObject5.put("serverApiVer", "5.7.2");
            jSONObject5.put("apLinkToken", mspContextByBizId instanceof MspTradeContext ? ((MspTradeContext) mspContextByBizId).getApLinkToken() : "");
            jSONObject5.put("clientBizType", TradeCollector.getBizType(i));
            if (TplIdentity.drmEnabled()) {
                com.alibaba.fastjson.JSONObject jSONObject7 = new com.alibaba.fastjson.JSONObject();
                jSONObject7.put("tplId", (Object) str2);
                tplIdentity = TplIdentity.generateTplIdentity(i, jSONObject7, TextUtils.equals(str2, MspFlybirdDefine.FLYBIRD_MAIN_SERVICE_TPL));
                jSONObject5.put("tplIdentity", tplIdentity.toJSON().toString());
                context2 = context;
            } else {
                context2 = context;
                tplIdentity = null;
            }
            if (needEnableAgedVersion(str2, context2)) {
                jSONObject5.put("scale", "1");
                jSONObject5.put("pixelToRem", "true");
                if (PhoneCashierMspEngine.getMspWallet().isUserAgednessVersion(i)) {
                    jSONObject5.put("agednessVersion", true);
                    jSONObject5.put("scale", AGEDNESS_VERSION_SCALE);
                }
            }
            if (MspLowDeviceManager.getInstance().isLowDevice()) {
                jSONObject5.put("isLowDevice", true);
            }
            JSONObject jSONObject8 = new JSONObject();
            jSONObject8.put("rpcData", new JSONObject(str));
            jSONObject8.put("local", jSONObject5);
            return new Pair<>(jSONObject8.toString(), tplIdentity);
        } catch (Exception unused) {
            return new Pair<>("", null);
        }
    }

    private JSONObject buildLoadData(JSONObject jSONObject, JSONObject jSONObject2, int i, String str, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("3cd040e", new Object[]{this, jSONObject, jSONObject2, new Integer(i), str, context});
        }
        JSONObject jSONObject3 = new JSONObject();
        try {
            MspContext mspContextByBizId = MspContextManager.getInstance().getMspContextByBizId(i);
            String tradeNo = mspContextByBizId instanceof MspTradeContext ? ((MspTradeContext) mspContextByBizId).getTradeNo() : "";
            String userId = MspContextUtil.getUserId();
            LogUtil.record(1, "MspRender:buildLoadData", "tplId= " + str + " tradeNo= " + tradeNo + " uid= " + userId);
            jSONObject3.put("tplId", str);
            jSONObject3.put("tradeNo", tradeNo);
            jSONObject3.put("uid", userId);
            Map<String, String> authUserInfo = PhoneCashierMspEngine.getMspWallet().getAuthUserInfo();
            if (authUserInfo != null) {
                String str2 = authUserInfo.get(AlipayCallServiceActivity.ALIPAY_EXTERN_TOKEN);
                String str3 = authUserInfo.get("logonId");
                if (!TextUtils.isEmpty(str2)) {
                    jSONObject3.put(AlipayCallServiceActivity.ALIPAY_EXTERN_TOKEN, str2);
                }
                if (!TextUtils.isEmpty(str3)) {
                    jSONObject3.put("logonId", str3);
                }
            }
            jSONObject3.put("bizId", String.valueOf(i));
            jSONObject3.put("serviceId", String.valueOf(i));
            if (mspContextByBizId != null) {
                jSONObject3.put("degradeUnifyResAutoAdapt", DrmManager.getInstance(mspContextByBizId.getContext()).isDegrade(DrmKey.DEGRADE_UNIFY_RESULT_AUTOADAPT, false, mspContextByBizId.getContext()));
                if (mspContextByBizId instanceof MspTradeContext) {
                    jSONObject3.put(DynConstants.DynDataNames.D_CLIENT_LOG_DATA, JSON.toJSONString(((MspTradeContext) mspContextByBizId).getClientLogData()));
                }
            }
            MspTradeContext tradeContextByBizId = MspContextManager.getInstance().getTradeContextByBizId(i);
            if (tradeContextByBizId != null) {
                jSONObject3.put("expectedDocHeight", tradeContextByBizId.getMetaSessionDataByKeys(Arrays.asList("expectedDocHeight")).getString("expectedDocHeight"));
                jSONObject3.put("sourcePackage", tradeContextByBizId.getOutPackageName());
            }
            if (tradeContextByBizId != null && tradeContextByBizId.getBizContext() != null) {
                jSONObject3.put(gkl.DP_BIZ_CONTEXT, tradeContextByBizId.getBizContext());
                LogUtil.record(1, "MspRender:buildLoadData", "bizContext= " + tradeContextByBizId.getBizContext());
            }
            jSONObject3.put("bp", PluginManager.getRender().getEngineParams());
            jSONObject3.put("startupParams", jSONObject);
            jSONObject3.put("sceneParams", jSONObject2);
            jSONObject3.put("osVersion", Build.VERSION.SDK_INT);
            jSONObject3.put("birdNestVer", TemplateService.getBirdNestVersion());
            jSONObject3.put("serverApiVer", "5.7.2");
            jSONObject3.put("apLinkToken", mspContextByBizId instanceof MspTradeContext ? ((MspTradeContext) mspContextByBizId).getApLinkToken() : "");
            jSONObject3.put("clientBizType", TradeCollector.getBizType(i));
            if (TplIdentity.drmEnabled()) {
                com.alibaba.fastjson.JSONObject jSONObject4 = new com.alibaba.fastjson.JSONObject();
                jSONObject4.put("tplId", (Object) str);
                jSONObject3.put("tplIdentity", TplIdentity.generateTplIdentity(i, jSONObject4, TextUtils.equals(str, MspFlybirdDefine.FLYBIRD_MAIN_SERVICE_TPL)).toJSON().toString());
            }
            if (needEnableAgedVersion(str, context)) {
                jSONObject3.put("scale", "1");
                jSONObject3.put("pixelToRem", "true");
                if (PhoneCashierMspEngine.getMspWallet().isUserAgednessVersion(i)) {
                    jSONObject3.put("agednessVersion", true);
                    jSONObject3.put("scale", AGEDNESS_VERSION_SCALE);
                }
            }
            if (MspLowDeviceManager.getInstance().isLowDevice()) {
                jSONObject3.put("isLowDevice", true);
            }
            return jSONObject3;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.alipay.android.msp.plugin.IRender
    public View generateViewWithPrepareResult(Context context, int i, Object obj) throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("4ca14364", new Object[]{this, context, new Integer(i), obj});
        }
        View generateViewWithPrepareResult = this.mRender.generateViewWithPrepareResult((MspPrepareResult) obj);
        FBContext fBContext = this.mRender.getFBContext(generateViewWithPrepareResult);
        LogUtil.record(2, "MspRender:generateViewWithPrepareResult", "fbContext=" + fBContext + ", contentView=" + generateViewWithPrepareResult);
        String str = null;
        if (fBContext == null) {
            return null;
        }
        if (generateViewWithPrepareResult == null && context != null && !DrmManager.getInstance(context).isDegrade(DrmKey.DEGRADE_RENDER_GEN_FAIL_NOISE, false, context)) {
            return null;
        }
        try {
            View queryView = fBContext.queryView("#navTxtM");
            if (queryView == null) {
                queryView = fBContext.queryView("#iNavTxtM");
            }
            if (queryView instanceof TextView) {
                str = ((TextView) queryView).getText().toString();
            }
            generateViewWithPrepareResult.setTag(R.id.view_title_id, str);
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
        try {
            generateViewWithPrepareResult.setTag(R.id.tag_view_fullscreen, fBContext);
        } catch (Throwable th2) {
            LogUtil.printExceptionStackTrace(th2);
            StatisticCollector.addError(StatisticCollector.GLOBAL_AGENT, ErrorType.DEFAULT, "setTag", th2);
        }
        return generateViewWithPrepareResult;
    }

    @Override // com.alipay.android.msp.plugin.IRender
    @Deprecated
    public View generateView(Context context, int i, Object obj) throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("fc45d55a", new Object[]{this, context, new Integer(i), obj});
        }
        View generateView = this.mRender.generateView((PreparedResult) obj);
        FBContext fBContext = this.mRender.getFBContext(generateView);
        LogUtil.record(2, "MspRender:generateView", "fbContext=" + fBContext + ", contentView=" + generateView);
        String str = null;
        if (fBContext == null) {
            return null;
        }
        if (generateView == null && context != null && !DrmManager.getInstance(context).isDegrade(DrmKey.DEGRADE_RENDER_GEN_FAIL_NOISE, false, context)) {
            return null;
        }
        try {
            View queryView = fBContext.queryView("#navTxtM");
            if (queryView == null) {
                queryView = fBContext.queryView("#iNavTxtM");
            }
            if (queryView instanceof TextView) {
                str = ((TextView) queryView).getText().toString();
            }
            generateView.setTag(R.id.view_title_id, str);
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
        try {
            generateView.setTag(R.id.tag_view_fullscreen, fBContext);
        } catch (Throwable th2) {
            LogUtil.printExceptionStackTrace(th2);
            StatisticCollector.addError(StatisticCollector.GLOBAL_AGENT, ErrorType.DEFAULT, "setTag", th2);
        }
        return generateView;
    }

    @Override // com.alipay.android.msp.plugin.IRender
    public FBContext getFbContextFromView(View view) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FBContext) ipChange.ipc$dispatch("98f113ed", new Object[]{this, view}) : this.mRender.getFBContext(view);
    }

    @Override // com.alipay.android.msp.plugin.IRender
    public void destroyView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e93784c", new Object[]{this, view});
            return;
        }
        try {
            FBContext fBContext = this.mRender.getFBContext(view);
            if (NativeTplRuntimeManager.drmEnabled() && (fBContext instanceof FBDocument)) {
                NativeTplRuntimeManager.unregisterTpl((FBDocument) fBContext);
            }
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace(e);
        }
        try {
            this.mRender.destroyView(view);
        } catch (Exception e2) {
            LogUtil.printExceptionStackTrace(e2);
        }
    }

    @Override // com.alipay.android.msp.plugin.IRender
    public void destroy(int i, int i2, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f751747", new Object[]{this, new Integer(i), new Integer(i2), context});
            return;
        }
        try {
            this.mRender.destroy(context, i2);
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
    }

    @Override // com.alipay.android.msp.plugin.IRender
    public boolean onBackPressed(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("53902393", new Object[]{this, view})).booleanValue();
        }
        try {
            return this.mRender.onBackPressed(view);
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace(e);
            return false;
        }
    }

    @Override // com.alipay.android.msp.plugin.IRender
    public void callRender(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c927fd25", new Object[]{this, str});
        } else if (str == null) {
        } else {
            try {
                this.mRender.callRender(str);
            } catch (Exception e) {
                LogUtil.printExceptionStackTrace(e);
            }
        }
    }

    @Override // com.alipay.android.msp.plugin.IRender
    public void callRenderReload(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3eb02b1e", new Object[]{this, str});
        } else if (str == null) {
        } else {
            try {
                this.mRender.callRender(str);
            } catch (Exception e) {
                LogUtil.printExceptionStackTrace(e);
            }
        }
    }

    @Override // com.alipay.android.msp.plugin.IRender
    public void callOnreload(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b0ec775", new Object[]{this, view});
            return;
        }
        try {
            this.mRender.callOnreload(view);
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace(e);
        }
    }

    @Override // com.alipay.android.msp.plugin.IRender
    public String getEngineParams() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a1c3ccdb", new Object[]{this}) : this.mRender.getEngineParams();
    }

    @Override // com.alipay.android.msp.plugin.IRender
    public String getEngineVersion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a61fb679", new Object[]{this}) : this.mRender.getEngineVersion();
    }

    @Override // com.alipay.android.msp.plugin.IRender
    @Deprecated
    public int callExecuteJs(View view, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("94e37b08", new Object[]{this, view, str})).intValue();
        }
        try {
            LogUtil.d(TAG, "callExecuteJs", str);
            return this.mRender.callExecuteJs(view, str);
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace(e);
            return -1;
        }
    }

    @Override // com.alipay.android.msp.plugin.IRender
    public boolean safeCallExecuteJs(View view, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a6f71b06", new Object[]{this, view, str})).booleanValue();
        }
        try {
            LogUtil.d(TAG, "safeCallExecuteJs", str);
            return this.mRender.safeCallExecuteJs(view, str);
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace(e);
            return false;
        }
    }

    @Override // com.alipay.android.msp.plugin.IRender
    @Deprecated
    public String callExecuteJsWithResult(View view, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2380c10e", new Object[]{this, view, str});
        }
        try {
            return this.mRender.executeJsWithResult(view, str);
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace(e);
            return null;
        }
    }

    @Override // com.alipay.android.msp.plugin.IRender
    public void safeCallExecuteJsWithResult(View view, String str, FBContext.JsExecCallback jsExecCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6542788e", new Object[]{this, view, str, jsExecCallback});
            return;
        }
        try {
            this.mRender.safeCallExecuteJsWithResult(view, str, jsExecCallback);
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace(e);
        }
    }

    @Override // com.alipay.android.msp.plugin.IRender
    public Template getLocalTemplate(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Template) ipChange.ipc$dispatch("24a01415", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return this.mRender.getLocalTemplate(str);
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace(e);
            return null;
        }
    }

    @Override // com.alipay.android.msp.plugin.IRender
    public boolean needUpdateLocalTpl(Template template, Template template2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("51d0d0ad", new Object[]{this, template, template2})).booleanValue();
        }
        try {
            return this.mRender.needUpdateLocalTpl(template, template2);
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace(e);
            return false;
        }
    }

    @Override // com.alipay.android.msp.plugin.IRender
    public Template getServerTemplate(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Template) ipChange.ipc$dispatch("7be17b87", new Object[]{this, str, str2});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return this.mRender.getServerTemplate(str, str2);
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace(e);
            return null;
        }
    }

    @Override // com.alipay.android.msp.plugin.IRender
    public Template notifyTplUpdate(String str, String str2) throws Throwable {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Template) ipChange.ipc$dispatch("15e8eea", new Object[]{this, str, str2}) : notifyTplUpdate(str, str2, false, LogItem.TemplateUpdateScene.Unset);
    }

    @Override // com.alipay.android.msp.plugin.IRender
    public Template notifyTplUpdate(String str, String str2, boolean z, LogItem.TemplateUpdateScene templateUpdateScene) throws Throwable {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Template) ipChange.ipc$dispatch("6d9a27e3", new Object[]{this, str, str2, new Boolean(z), templateUpdateScene}) : this.mRender.notifyTplUpdate(str, str2, z, templateUpdateScene);
    }

    private void initializePlugin(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83569a59", new Object[]{this, new Integer(i)});
            return;
        }
        if (this.mPluginFactory == null) {
            this.mPluginFactory = new MspPluginFactory();
        }
        ((MspPluginFactory) this.mPluginFactory).setmBusinessId(i);
    }

    @Override // com.alipay.android.msp.plugin.IRender
    public void registerPreRenderResultClearHandler(ICashierRender.PreRenderResultClearHandler preRenderResultClearHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e499d7e", new Object[]{this, preRenderResultClearHandler});
        } else {
            this.mRender.registerPreRenderResultClearHandler(preRenderResultClearHandler);
        }
    }

    public static void triggerPreRenderQUICKPAY(final String str, final Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d2b88fb", new Object[]{str, context});
        } else if (TaskHelper.isMainThread()) {
            TaskHelper.execute(new Runnable() { // from class: com.alipay.android.msp.ui.birdnest.render.api.MspRender.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        MspRender.access$000("QUICKPAY", str, context);
                    }
                }
            });
        } else {
            triggerPreRender("QUICKPAY", str, context);
        }
    }

    private static void triggerPreRender(String str, String str2, Context context) throws RuntimeException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42f16aec", new Object[]{str, str2, context});
            return;
        }
        LogUtil.record(2, "MspRender::triggerPrerender", "identifier:" + str + ",tplId:" + str2);
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            cun.a("must NOT called on main thread");
        }
        try {
            if (preRendEngineOptions == null) {
                preRendEngineOptions = createPreRendEngineOptions(context);
            }
            StandaloneTemplateService.triggerPrerender(str, d.a(str2), context, preRendEngineOptions, new TriggerPrerenderOptions());
        } catch (Throwable th) {
            LogUtil.record(2, "MspRender::triggerPreRender", "throwableMessage:" + th.getMessage());
            LogUtil.printExceptionStackTrace(th);
        }
    }

    private static CreateEngineOptions createPreRendEngineOptions(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CreateEngineOptions) ipChange.ipc$dispatch("955ebb16", new Object[]{context}) : new CreateEngineOptions.Builder().setPrerenderOptions(BirdNestRender.getPrerenderOptions(context)).setSubmitAndAsyncSubmitHandler(new EventHandler() { // from class: com.alipay.android.msp.ui.birdnest.render.api.MspRender.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alipay.android.app.template.EventHandler
            public boolean onAsyncEvent(EventHandler.EventType eventType, String str, ITemplateClickCallback iTemplateClickCallback) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("9cefa926", new Object[]{this, eventType, str, iTemplateClickCallback})).booleanValue();
                }
                return false;
            }

            @Override // com.alipay.android.app.template.EventHandler
            public boolean onEvent(EventHandler.EventType eventType, String str, Object obj, Object obj2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("5e9c8627", new Object[]{this, eventType, str, obj, obj2})).booleanValue();
                }
                return false;
            }

            @Override // com.alipay.android.app.template.EventHandler
            public String onGetCustomAttr(Object obj, String str) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("8229915a", new Object[]{this, obj, str}) : MspRenderCallback.onGetGlobalCustomAttr(obj, str);
            }
        }).build();
    }

    public static void safeSendNativeResult(FBDocument fBDocument, long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a72dcc97", new Object[]{fBDocument, new Long(j), str});
        } else {
            JSPlugin.safeSendNativeResult(fBDocument, j, str, callJsOpt);
        }
    }

    public static void appendPreloadStat(String str, MspContext mspContext, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc1743ca", new Object[]{str, mspContext, new Boolean(z)});
        } else if (mspContext == null) {
        } else {
            StatisticInfo statisticInfo = mspContext.getStatisticInfo();
            StringBuilder sb = new StringBuilder("T|");
            sb.append(z ? "T" : UTConstant.Args.UT_SUCCESS_F);
            statisticInfo.addEvent(new StEvent(str, "preRend", sb.toString()));
        }
    }

    @Override // com.alipay.android.msp.plugin.IRender
    public MspKeyboardService getMspKeyboardService() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MspKeyboardService) ipChange.ipc$dispatch("168c1237", new Object[]{this}) : this.mMspKeyboardService;
    }
}
