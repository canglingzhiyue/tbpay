package com.alipay.android.app.render.api.ext;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import com.alipay.android.app.cctemplate.DynResResourceClient;
import com.alipay.android.app.cctemplate.api.ITplProvider;
import com.alipay.android.app.cctemplate.api.ITplTransport;
import com.alipay.android.app.cctemplate.api.TemplateService;
import com.alipay.android.app.cctemplate.model.Template;
import com.alipay.android.app.cctemplate.transport.TemplateManager;
import com.alipay.android.app.cctemplate.utils.DrmUtil;
import com.alipay.android.app.render.api.ICashierProvider;
import com.alipay.android.app.render.api.ICashierRender;
import com.alipay.android.app.render.api.callback.ICashierRenderCallback;
import com.alipay.android.app.render.api.callback.ICashierRenderCallback3;
import com.alipay.android.app.render.api.result.MspPrepareResult;
import com.alipay.android.app.render.api.result.PreparedResult;
import com.alipay.android.app.render.birdnest.BirdNestBuilder;
import com.alipay.android.app.render.birdnest.RenderCallbackProxy;
import com.alipay.android.app.render.birdnest.service.BirdNestManager;
import com.alipay.android.app.render.birdnest.service.BirdNestService;
import com.alipay.android.app.render.birdnest.utils.Compatibility;
import com.alipay.android.app.safepaybase.util.ResUtils;
import com.alipay.android.app.safepaylog.api.LogItem;
import com.alipay.android.app.safepaylog.utils.LogUtils;
import com.alipay.android.app.safepaylogv2.api.StatisticCollector;
import com.alipay.android.app.template.FBContext;
import com.alipay.android.app.template.FBFocusable;
import com.alipay.android.app.template.FBPluginFactory;
import com.alipay.android.app.template.ITemplateClickCallback;
import com.alipay.android.app.template.TemplateKeyboardService;
import com.alipay.android.app.utils.SpOuterUtil;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.alipay.android.msp.framework.drm.DrmKey;
import com.alipay.birdnest.api.BirdNestEngine;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import com.flybird.session.LegacySupport;
import com.flybird.session.standalone.model.CreateEngineOptions;
import com.flybird.session.standalone.model.PrepareResult;
import com.flybird.session.standalone.model.PrerenderOptions;
import com.taobao.umipublish.draft.DraftMediaHelper;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;
import tb.riy;

@MpaasClassInfo(ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-safepaybase")
/* loaded from: classes3.dex */
public class BirdNestRender implements ICashierRender {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final FBContext.JsExecOptions k = FBContext.JsExecOptions.create().setAsyncMode(0).setCallbackMode(0).setBlockTimeoutMs(60000);
    private static final FBContext.JsExecOptions l = FBContext.JsExecOptions.create().setAsyncMode(0).setCallbackMode(1).setBlockTimeoutMs(60000);
    private TemplateService b;
    private TemplateKeyboardService c;
    private FBPluginFactory d;
    private ITplTransport e;
    private ITemplateClickCallback f;
    private ICashierProvider g;
    private ITplProvider h;
    private String j;

    /* renamed from: a  reason: collision with root package name */
    private final Map<View, FBContext> f4358a = new ConcurrentHashMap();
    private boolean i = false;

    public static /* synthetic */ ITemplateClickCallback a(BirdNestRender birdNestRender) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ITemplateClickCallback) ipChange.ipc$dispatch("61aa8472", new Object[]{birdNestRender}) : birdNestRender.f;
    }

    public static /* synthetic */ ITemplateClickCallback a(BirdNestRender birdNestRender, ITemplateClickCallback iTemplateClickCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITemplateClickCallback) ipChange.ipc$dispatch("97ae37dd", new Object[]{birdNestRender, iTemplateClickCallback});
        }
        birdNestRender.f = iTemplateClickCallback;
        return iTemplateClickCallback;
    }

    public static /* synthetic */ String b(BirdNestRender birdNestRender) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("738d7866", new Object[]{birdNestRender}) : birdNestRender.j;
    }

    public BirdNestRender() {
        LogUtils.record(2, "BirdNestRender::BirdNestRender", "this:" + this);
    }

    @Override // com.alipay.android.app.render.api.ICashierRender
    public void setIsGenContextDelay(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6852d875", new Object[]{this, new Boolean(z)});
            return;
        }
        LogUtils.record(2, "BirdNestRender::setIsGenContextDelay", "delay:" + z);
        this.i = z;
    }

    @Override // com.alipay.android.app.render.api.ICashierRender
    public ITplProvider getTplProvider() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ITplProvider) ipChange.ipc$dispatch("46322b6", new Object[]{this}) : this.h;
    }

    @Override // com.alipay.android.app.render.api.ICashierRender
    public void setTplProvider(ITplProvider iTplProvider) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2fa78f8", new Object[]{this, iTplProvider});
        } else {
            this.h = iTplProvider;
        }
    }

    public ICashierProvider getProvider() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ICashierProvider) ipChange.ipc$dispatch("2dde5263", new Object[]{this}) : this.g;
    }

    public void setProvider(ICashierProvider iCashierProvider) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34b28db5", new Object[]{this, iCashierProvider});
        } else {
            this.g = iCashierProvider;
        }
    }

    public ITplTransport getTplTransport() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ITplTransport) ipChange.ipc$dispatch("e48f352a", new Object[]{this}) : this.e;
    }

    public void setTplTransport(ITplTransport iTplTransport) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3895d82", new Object[]{this, iTplTransport});
        } else {
            this.e = iTplTransport;
        }
    }

    @Override // com.alipay.android.app.render.api.ICashierRender
    public FBContext getFBContext(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FBContext) ipChange.ipc$dispatch("2819827c", new Object[]{this, view});
        }
        if (view != null) {
            return this.f4358a.get(view);
        }
        return null;
    }

    @Override // com.alipay.android.app.render.api.ICashierRender
    public FBPluginFactory getFBPluginFactory() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FBPluginFactory) ipChange.ipc$dispatch("4890f832", new Object[]{this}) : this.d;
    }

    @Override // com.alipay.android.app.render.api.ICashierRender
    public void setFBPluginFactory(FBPluginFactory fBPluginFactory) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28ff736", new Object[]{this, fBPluginFactory});
        } else {
            this.d = fBPluginFactory;
        }
    }

    @Override // com.alipay.android.app.render.api.ICashierRender
    public TemplateKeyboardService getKeyBoardService() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TemplateKeyboardService) ipChange.ipc$dispatch("308cd6cc", new Object[]{this}) : this.c;
    }

    @Override // com.alipay.android.app.render.api.ICashierRender
    public void setKeyBoardService(TemplateKeyboardService templateKeyboardService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82d0ecca", new Object[]{this, templateKeyboardService});
        } else {
            this.c = templateKeyboardService;
        }
    }

    @Override // com.alipay.android.app.render.api.ICashierRender
    public MspPrepareResult preloadViewNew(Context context, String str, String str2, String str3, JSONObject jSONObject, ICashierRenderCallback iCashierRenderCallback, ICashierRender.RenderParams renderParams, Map<String, String> map, CreateEngineOptions createEngineOptions) {
        Integer num;
        Object obj;
        BirdNestBuilder createEngineOptions2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspPrepareResult) ipChange.ipc$dispatch("3ba285c8", new Object[]{this, context, str, str2, str3, jSONObject, iCashierRenderCallback, renderParams, map, createEngineOptions});
        }
        LogUtils.record(2, "BirdNestRender:preloadViewNew", "tplId:" + str);
        SpOuterUtil.startSection(MspGlobalDefine.SPIDER_MSP_CASHIER_BIZ_TYPE, "LOAD_TEMPLATE");
        this.j = str;
        BirdNestManager.initFBGlobalConfig(this.g);
        TemplateService b = b();
        Object obj2 = StatisticCollector.GLOBAL_AGENT;
        if (iCashierRenderCallback instanceof ICashierRenderCallback3) {
            obj2 = ((ICashierRenderCallback3) iCashierRenderCallback).getStatisticAgent();
        }
        Template loadTemplate = b.loadTemplate(str, str2, str3, obj2, renderParams);
        SpOuterUtil.endSection(MspGlobalDefine.SPIDER_MSP_CASHIER_BIZ_TYPE, "LOAD_TEMPLATE");
        ICashierRender.RenderParams renderParams2 = renderParams == null ? new ICashierRender.RenderParams(false) : renderParams;
        if (loadTemplate == null) {
            throw new IllegalArgumentException("missing template, expected model");
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean a2 = a(context, str);
        if (a2) {
            LogUtils.record(2, "BirdNestRender:isAsyncLayout", "tplId:" + str);
        }
        boolean z = renderParams2.onPadAdaptMode;
        int i = renderParams2.displayHeight;
        int i2 = renderParams2.displayWidth;
        if (jSONObject != null) {
            num = -1;
            if (jSONObject.has("bizId")) {
                obj = jSONObject.get("bizId");
                ICashierRender.RenderParams renderParams3 = renderParams2;
                SpOuterUtil.startSection(MspGlobalDefine.SPIDER_MSP_CASHIER_BIZ_TYPE, "BUILD_RPC_JS");
                JSONObject a3 = a(str3, jSONObject, loadTemplate);
                SpOuterUtil.endSection(MspGlobalDefine.SPIDER_MSP_CASHIER_BIZ_TYPE, "BUILD_RPC_JS");
                ResUtils.setUiContext(context);
                createEngineOptions2 = new BirdNestBuilder(context).setPluginFactory(this.d).setTemplateId(str).setDataContent(a3.toString()).setmKeyboardService(this.c).setTemplateJson(loadTemplate.getAttachedFBTemplateContent()).setUseQuickPayTemplateManager(true).setCashierProvider(this.g).setAsyncLayout(a2).setResourceClient(new DynResResourceClient()).setCallbackProxy(a(iCashierRenderCallback)).setAppParams(map).setBizId(obj).setCreateEngineOptions(createEngineOptions);
                if (z && i > 0 && i2 > 0) {
                    createEngineOptions2.setDisplayHeight(i);
                    createEngineOptions2.setDisplayWidth(i2);
                }
                SpOuterUtil.startSection(MspGlobalDefine.SPIDER_MSP_CASHIER_BIZ_TYPE, "BUILD_FBCONTEXT");
                PrepareResult createResult = createEngineOptions2.createResult();
                SpOuterUtil.endSection(MspGlobalDefine.SPIDER_MSP_CASHIER_BIZ_TYPE, "BUILD_FBCONTEXT");
                long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                renderParams3.getRenderStatistic().setRenderTime(elapsedRealtime2);
                b().sendRenderEventReportForDecider(loadTemplate, true, elapsedRealtime2);
                return new MspPrepareResult(createResult, a2);
            }
        } else {
            num = -1;
        }
        obj = num;
        ICashierRender.RenderParams renderParams32 = renderParams2;
        SpOuterUtil.startSection(MspGlobalDefine.SPIDER_MSP_CASHIER_BIZ_TYPE, "BUILD_RPC_JS");
        JSONObject a32 = a(str3, jSONObject, loadTemplate);
        SpOuterUtil.endSection(MspGlobalDefine.SPIDER_MSP_CASHIER_BIZ_TYPE, "BUILD_RPC_JS");
        ResUtils.setUiContext(context);
        createEngineOptions2 = new BirdNestBuilder(context).setPluginFactory(this.d).setTemplateId(str).setDataContent(a32.toString()).setmKeyboardService(this.c).setTemplateJson(loadTemplate.getAttachedFBTemplateContent()).setUseQuickPayTemplateManager(true).setCashierProvider(this.g).setAsyncLayout(a2).setResourceClient(new DynResResourceClient()).setCallbackProxy(a(iCashierRenderCallback)).setAppParams(map).setBizId(obj).setCreateEngineOptions(createEngineOptions);
        if (z) {
            createEngineOptions2.setDisplayHeight(i);
            createEngineOptions2.setDisplayWidth(i2);
        }
        SpOuterUtil.startSection(MspGlobalDefine.SPIDER_MSP_CASHIER_BIZ_TYPE, "BUILD_FBCONTEXT");
        PrepareResult createResult2 = createEngineOptions2.createResult();
        SpOuterUtil.endSection(MspGlobalDefine.SPIDER_MSP_CASHIER_BIZ_TYPE, "BUILD_FBCONTEXT");
        long elapsedRealtime22 = SystemClock.elapsedRealtime() - elapsedRealtime;
        renderParams32.getRenderStatistic().setRenderTime(elapsedRealtime22);
        b().sendRenderEventReportForDecider(loadTemplate, true, elapsedRealtime22);
        return new MspPrepareResult(createResult2, a2);
    }

    @Override // com.alipay.android.app.render.api.ICashierRender
    @Deprecated
    public PreparedResult preloadView(Context context, String str, String str2, String str3, Map<String, Object> map, ICashierRenderCallback iCashierRenderCallback) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PreparedResult) ipChange.ipc$dispatch("7061df85", new Object[]{this, context, str, str2, str3, map, iCashierRenderCallback}) : preloadView(context, str, str2, str3, map, iCashierRenderCallback, new ICashierRender.RenderParams(false), null);
    }

    @Override // com.alipay.android.app.render.api.ICashierRender
    public PreparedResult preloadView(Context context, String str, String str2, String str3, Map<String, Object> map, ICashierRenderCallback iCashierRenderCallback, ICashierRender.RenderParams renderParams, Map<String, String> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PreparedResult) ipChange.ipc$dispatch("c8183db0", new Object[]{this, context, str, str2, str3, map, iCashierRenderCallback, renderParams, map2});
        }
        SpOuterUtil.startSection(MspGlobalDefine.SPIDER_MSP_CASHIER_BIZ_TYPE, "LOAD_TEMPLATE");
        this.j = str;
        BirdNestManager.initFBGlobalConfig(this.g);
        TemplateService b = b();
        Object obj = StatisticCollector.GLOBAL_AGENT;
        if (iCashierRenderCallback instanceof ICashierRenderCallback3) {
            obj = ((ICashierRenderCallback3) iCashierRenderCallback).getStatisticAgent();
        }
        Template loadTemplate = b.loadTemplate(str, str2, str3, obj, renderParams);
        SpOuterUtil.endSection(MspGlobalDefine.SPIDER_MSP_CASHIER_BIZ_TYPE, "LOAD_TEMPLATE");
        return getPreparedResultUsingDeployedModel(context, str, str3, map, iCashierRenderCallback, renderParams, map2, loadTemplate);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.alipay.android.app.render.api.result.PreparedResult getPreparedResultUsingDeployedModel(android.content.Context r20, java.lang.String r21, java.lang.String r22, java.util.Map<java.lang.String, java.lang.Object> r23, com.alipay.android.app.render.api.callback.ICashierRenderCallback r24, com.alipay.android.app.render.api.ICashierRender.RenderParams r25, java.util.Map<java.lang.String, java.lang.String> r26, com.alipay.android.app.cctemplate.model.Template r27) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.app.render.api.ext.BirdNestRender.getPreparedResultUsingDeployedModel(android.content.Context, java.lang.String, java.lang.String, java.util.Map, com.alipay.android.app.render.api.callback.ICashierRenderCallback, com.alipay.android.app.render.api.ICashierRender$RenderParams, java.util.Map, com.alipay.android.app.cctemplate.model.Template):com.alipay.android.app.render.api.result.PreparedResult");
    }

    private RenderCallbackProxy a(ICashierRenderCallback iCashierRenderCallback) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RenderCallbackProxy) ipChange.ipc$dispatch("54b61699", new Object[]{this, iCashierRenderCallback}) : new RenderCallbackProxy(iCashierRenderCallback) { // from class: com.alipay.android.app.render.api.ext.BirdNestRender.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alipay.android.app.render.birdnest.RenderCallbackProxy
            public void onTemplateCallbackChanged(ITemplateClickCallback iTemplateClickCallback) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("67e55472", new Object[]{this, iTemplateClickCallback});
                    return;
                }
                LogUtils.record(2, "BirdNestRender:onTemplateCallbackChanged", "callback=" + iTemplateClickCallback + " mCallback=" + BirdNestRender.a(BirdNestRender.this) + " tplId=" + BirdNestRender.b(BirdNestRender.this) + ", this:" + this);
                BirdNestRender.a(BirdNestRender.this, iTemplateClickCallback);
            }
        };
    }

    @Override // com.alipay.android.app.render.api.ICashierRender
    public View generateViewWithPrepareResult(MspPrepareResult mspPrepareResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bd1de855", new Object[]{this, mspPrepareResult});
        }
        final FBContext fbContext = mspPrepareResult.getPrepareResult().getFbContext();
        ICashierProvider iCashierProvider = this.g;
        if (iCashierProvider != null) {
            Context context = iCashierProvider.getContext();
            if (fbContext == null && context != null && !DrmUtil.isDrmDegraded(context, DrmKey.DEGRADE_RENDER_GEN_FAIL_NOISE, false, false)) {
                return null;
            }
        }
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.alipay.android.app.render.api.ext.BirdNestRender.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                FBFocusable autoFocusable;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                FBContext fBContext = fbContext;
                if (fBContext == null || (autoFocusable = fBContext.getAutoFocusable()) == null) {
                    return;
                }
                autoFocusable.requestFocus();
            }
        }, 700L);
        if (!mspPrepareResult.isAsyncLayout()) {
            Compatibility.adapter(fbContext);
        }
        View contentView = LegacySupport.unsafeRenderPageForCashier(mspPrepareResult.getPrepareResult()).getFbContext().getContentView();
        LogUtils.record(2, "BirdNestRender::generateViewWithPrepareResult", "contentView=" + contentView + ", fbContext" + fbContext);
        if (contentView != null) {
            this.f4358a.put(contentView, fbContext);
        }
        return contentView;
    }

    @Override // com.alipay.android.app.render.api.ICashierRender
    public View generateView(Context context, String str, String str2, String str3, Map<String, Object> map, ICashierRenderCallback iCashierRenderCallback) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("f00b90d", new Object[]{this, context, str, str2, str3, map, iCashierRenderCallback}) : generateView(preloadView(context, str, str2, str3, map, iCashierRenderCallback));
    }

    private String a(String str, Map<String, Object> map, boolean z, Template template) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("218cf820", new Object[]{this, str, map, new Boolean(z), template});
        }
        String str2 = "var flybird = flybird || {};flybird.rpcData=" + str + ";";
        JSONObject jSONObject = new JSONObject();
        if (z) {
            try {
                jSONObject.put("isPrerender", true);
            } catch (Throwable th) {
                LogUtils.printExceptionStackTrace(th);
            }
        }
        if (template != null) {
            if (template.expInfo != null) {
                jSONObject.put("expInfo", template.expInfo);
            }
            if (template.expLog != null) {
                jSONObject.put("expLog", template.expLog);
            }
            if (!StringUtils.isEmpty(template.expId)) {
                jSONObject.put("expId", template.expId);
            }
            String template2 = template.toString();
            if (!StringUtils.isEmpty(template2)) {
                jSONObject.put("tplInfo", template2);
            }
        }
        if (map != null) {
            for (String str3 : map.keySet()) {
                jSONObject.put(str3, map.get(str3));
            }
        }
        jSONObject.put("birdNestVer", TemplateService.getBirdNestVersion());
        return str2 + "flybird.local=" + jSONObject.toString() + ";";
    }

    private JSONObject a(String str, JSONObject jSONObject, Template template) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("a05461d9", new Object[]{this, str, jSONObject, template});
        }
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject3 = new JSONObject(str);
        } catch (Throwable th) {
            LogUtils.printExceptionStackTrace(th);
        }
        if (template != null) {
            try {
                String template2 = template.toString();
                if (!StringUtils.isEmpty(template2)) {
                    jSONObject.put("tplInfo", template2);
                }
            } catch (Throwable th2) {
                LogUtils.printExceptionStackTrace(th2);
            }
        }
        try {
            jSONObject2.put("rpcData", jSONObject3);
            jSONObject2.put("local", jSONObject);
        } catch (Throwable th3) {
            LogUtils.printExceptionStackTrace(th3);
        }
        return jSONObject2;
    }

    @Override // com.alipay.android.app.render.api.ICashierRender
    public void destroyView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e93784c", new Object[]{this, view});
        } else if (view == null) {
        } else {
            try {
                FBContext fBContext = this.f4358a.get(view);
                LogUtils.record(2, "BirdNestRender::destroyView", String.valueOf(fBContext));
                if (fBContext == null) {
                    return;
                }
                HashMap hashMap = new HashMap();
                hashMap.put(FBContext.OPTION_DEFER_DOWNLOAD, true);
                hashMap.put(FBContext.OPTION_DEFER_DOWNLOAD_FILTER, new BirdNestEngine.TemplateFilter() { // from class: com.alipay.android.app.render.api.ext.BirdNestRender.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.alipay.birdnest.api.BirdNestEngine.TemplateFilter
                    public boolean accept(String str, String str2) {
                        IpChange ipChange2 = $ipChange;
                        return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("6c174f27", new Object[]{this, str, str2})).booleanValue() : str != null && str.contains("QUICKPAY");
                    }
                });
                fBContext.destroy(hashMap);
                this.f4358a.remove(view);
            } catch (Exception e) {
                LogUtils.printExceptionStackTrace(e);
            }
        }
    }

    private BirdNestService a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BirdNestService) ipChange.ipc$dispatch("b6aa487d", new Object[]{this}) : BirdNestManager.create(this.g);
    }

    private TemplateService b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TemplateService) ipChange.ipc$dispatch("75bfc664", new Object[]{this});
        }
        if (this.b == null) {
            this.b = new TemplateService(this.h);
        }
        return this.b;
    }

    @Override // com.alipay.android.app.render.api.ICashierRender
    public boolean onBackPressed(View view) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("53902393", new Object[]{this, view})).booleanValue();
        }
        try {
            BirdNestService a2 = a();
            z = a2.onBackPressed(view);
            LogUtils.record(2, "BirdNestRender::onBackPressed", "service: " + a2);
            return z;
        } catch (Throwable th) {
            LogUtils.printExceptionStackTrace(th);
            return z;
        }
    }

    @Override // com.alipay.android.app.render.api.ICashierRender
    public void destroy(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2a2a87c", new Object[]{this, context, new Integer(i)});
            return;
        }
        try {
            if (ResUtils.getContext() == null) {
                ResUtils.setUiContext(context);
            }
            List<JSONObject> releaseResource = a().releaseResource(i);
            if (releaseResource != null) {
                for (int i2 = 0; i2 < releaseResource.size(); i2++) {
                    JSONObject jSONObject = releaseResource.get(i2);
                    if (jSONObject.has("exception")) {
                        StatisticCollector.addError(StatisticCollector.GLOBAL_AGENT, "flybird", "BirdNestEx", jSONObject.optString("exception"));
                    }
                }
            }
        } catch (Throwable th) {
            LogUtils.printExceptionStackTrace(th);
        }
        try {
            b().triggerTemplateUpdate();
        } catch (Throwable th2) {
            LogUtils.printExceptionStackTrace(th2);
        }
        this.f = null;
        LogUtils.record(2, "BirdNestRender:destroy", "context=" + context + " hashcode=" + i + ", this:" + this);
    }

    @Override // com.alipay.android.app.render.api.ICashierRender
    public void callRender(String str) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c927fd25", new Object[]{this, str});
            return;
        }
        LogUtils.record(2, "BirdNestRender::callRender", "result:" + str);
        if (this.f != null && str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                LogUtils.record(2, "BirdNestRender::callRender", "resultJson 001:" + jSONObject.toString());
                this.f.onClickCallback(jSONObject.toString());
                return;
            } catch (Exception e) {
                JSONObject jSONObject2 = new JSONObject();
                for (String str2 : str.split(",")) {
                    String[] split2 = str2.substring(1, str2.length() - 1).split("=");
                    if (split2.length >= 2) {
                        try {
                            jSONObject2.put(split2[0], split2[1]);
                        } catch (Throwable unused) {
                            LogUtils.printExceptionStackTrace(e);
                        }
                    }
                }
                LogUtils.record(2, "BirdNestRender::callRender", "resultJson 002:" + jSONObject2.toString());
                this.f.onClickCallback(jSONObject2.toString());
                return;
            }
        }
        LogUtils.record(2, "BirdNestRender::callRender", "callRenderFail: result=" + str + " callback=" + this.f + " tpl=" + this.j + ", this:" + this);
    }

    @Override // com.alipay.android.app.render.api.ICashierRender
    public void callOnreload(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b0ec775", new Object[]{this, view});
        } else if (view == null) {
        } else {
            try {
                FBContext fBContext = this.f4358a.get(view);
                if (fBContext == null) {
                    return;
                }
                fBContext.reloadData("{}");
            } catch (Exception e) {
                LogUtils.printExceptionStackTrace(e);
            }
        }
    }

    @Override // com.alipay.android.app.render.api.ICashierRender
    public View generateView(PreparedResult preparedResult) {
        final FBContext fBContext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("dba2413f", new Object[]{this, preparedResult});
        }
        if (this.i) {
            fBContext = ((BirdNestBuilder) preparedResult.mResult).create();
        } else {
            fBContext = (FBContext) preparedResult.mResult;
        }
        ICashierProvider iCashierProvider = this.g;
        if (iCashierProvider != null) {
            Context context = iCashierProvider.getContext();
            if (fBContext == null && context != null && !DrmUtil.isDrmDegraded(context, DrmKey.DEGRADE_RENDER_GEN_FAIL_NOISE, false, false)) {
                return null;
            }
        }
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.alipay.android.app.render.api.ext.BirdNestRender.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                FBFocusable autoFocusable;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                FBContext fBContext2 = fBContext;
                if (fBContext2 == null || (autoFocusable = fBContext2.getAutoFocusable()) == null) {
                    return;
                }
                autoFocusable.requestFocus();
            }
        }, 700L);
        if (!preparedResult.mIsAsyncLayout) {
            Compatibility.adapter(fBContext);
        }
        View contentView = fBContext.getContentView();
        LogUtils.record(2, "BirdNestRender::generateView", "contentView=" + contentView + ", fbContext" + fBContext);
        if (contentView != null) {
            this.f4358a.put(contentView, fBContext);
        }
        return contentView;
    }

    @Override // com.alipay.android.app.render.api.ICashierRender
    public String getEngineParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a1c3ccdb", new Object[]{this});
        }
        String engineVersion = getEngineVersion();
        String str = "(a" + engineVersion.replace(".", "") + riy.BRACKET_END_STR;
        LogUtils.record(2, "BirdNestRender::getBirdParamsVersion", "birdParamsVer:" + str);
        return str;
    }

    @Override // com.alipay.android.app.render.api.ICashierRender
    public String getEngineVersion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a61fb679", new Object[]{this}) : TemplateService.getBirdNestVersion();
    }

    @Override // com.alipay.android.app.render.api.ICashierRender
    @Deprecated
    public int callExecuteJs(View view, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("94e37b08", new Object[]{this, view, str})).intValue();
        }
        if (view == null) {
            return -1;
        }
        try {
            FBContext fBContext = this.f4358a.get(view);
            if (fBContext == null) {
                return -1;
            }
            return fBContext.executeJs(str);
        } catch (Exception e) {
            LogUtils.printExceptionStackTrace(e);
            return -1;
        }
    }

    @Override // com.alipay.android.app.render.api.ICashierRender
    public boolean safeCallExecuteJs(View view, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a6f71b06", new Object[]{this, view, str})).booleanValue();
        }
        if (view != null) {
            try {
                FBContext fBContext = this.f4358a.get(view);
                if (fBContext != null) {
                    fBContext.safeExecuteJs(str, k, null);
                    return true;
                }
            } catch (Exception e) {
                LogUtils.printExceptionStackTrace(e);
            }
        }
        return false;
    }

    @Override // com.alipay.android.app.render.api.ICashierRender
    @Deprecated
    public String executeJsWithResult(View view, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c35cd2cc", new Object[]{this, view, str});
        }
        if (view == null) {
            return null;
        }
        try {
            FBContext fBContext = this.f4358a.get(view);
            if (fBContext == null) {
                return null;
            }
            return fBContext.executeJsWithResult(str);
        } catch (Exception e) {
            LogUtils.printExceptionStackTrace(e);
            return null;
        }
    }

    @Override // com.alipay.android.app.render.api.ICashierRender
    public void safeCallExecuteJsWithResult(View view, String str, FBContext.JsExecCallback jsExecCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6542788e", new Object[]{this, view, str, jsExecCallback});
            return;
        }
        if (view != null) {
            try {
                FBContext fBContext = this.f4358a.get(view);
                if (fBContext != null) {
                    fBContext.safeExecuteJs(str, l, jsExecCallback);
                    return;
                }
            } catch (Exception e) {
                LogUtils.printExceptionStackTrace(e);
            }
        }
        if (jsExecCallback == null) {
            return;
        }
        jsExecCallback.onJsExecuted(100, null);
    }

    @Override // com.alipay.android.app.render.api.ICashierRender
    public Template getLocalTemplate(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Template) ipChange.ipc$dispatch("24a01415", new Object[]{this, str});
        }
        TemplateService b = b();
        if (b == null) {
            return null;
        }
        return b.getLocalTemplate(str);
    }

    @Override // com.alipay.android.app.render.api.ICashierRender
    public boolean needUpdateLocalTpl(Template template, Template template2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("51d0d0ad", new Object[]{this, template, template2})).booleanValue();
        }
        if (template2 == null) {
            return false;
        }
        if ((StringUtils.isEmpty(template2.expId) || template2.expId.toLowerCase().equals("null")) && template2.expInfo == null && template2.expLog == null) {
            boolean needRollback = TemplateManager.needRollback(template2, template);
            TemplateService b = b();
            if (!needRollback && (b == null || !b.needUpdateLocalTpl(template, template2))) {
                return false;
            }
        }
        return true;
    }

    @Override // com.alipay.android.app.render.api.ICashierRender
    public Template notifyTplUpdate(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Template) ipChange.ipc$dispatch("15e8eea", new Object[]{this, str, str2}) : notifyTplUpdate(str, str2, false, LogItem.TemplateUpdateScene.Unset);
    }

    @Override // com.alipay.android.app.render.api.ICashierRender
    public Template notifyTplUpdate(String str, String str2, boolean z, LogItem.TemplateUpdateScene templateUpdateScene) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Template) ipChange.ipc$dispatch("6d9a27e3", new Object[]{this, str, str2, new Boolean(z), templateUpdateScene}) : b().loadTemplate(str, str2, "{}", StatisticCollector.GLOBAL_AGENT, new ICashierRender.RenderParams(false, z, templateUpdateScene));
    }

    @Override // com.alipay.android.app.render.api.ICashierRender
    public Template getServerTemplate(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Template) ipChange.ipc$dispatch("7be17b87", new Object[]{this, str, str2});
        }
        TemplateService b = b();
        if (b == null) {
            return null;
        }
        return b.getServerTemplate(str, str2);
    }

    private boolean a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("61b6362e", new Object[]{this, context, str})).booleanValue();
        }
        com.alibaba.fastjson.JSONObject drmValueFromKey = DrmUtil.getDrmValueFromKey(context, "asyncLayoutTpl", null);
        if (drmValueFromKey == null) {
            return false;
        }
        try {
            if (!str.startsWith("QUICKPAY@")) {
                return false;
            }
            String string = drmValueFromKey.getString(str.substring(9));
            if (StringUtils.isEmpty(string)) {
                return false;
            }
            return DrmUtil.procGraySwitchWithRate(context, Integer.parseInt(string), false);
        } catch (Throwable th) {
            LogUtils.printExceptionStackTrace(th);
            return false;
        }
    }

    @Override // com.alipay.android.app.render.api.ICashierRender
    public void registerPreRenderResultClearHandler(ICashierRender.PreRenderResultClearHandler preRenderResultClearHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e499d7e", new Object[]{this, preRenderResultClearHandler});
        } else {
            b().registerPreRenderResultClearHandler(preRenderResultClearHandler);
        }
    }

    @Override // com.alipay.android.app.render.api.ICashierRender
    public void sendRenderEventReportForDecider(Template template, boolean z, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788fb8c7", new Object[]{this, template, new Boolean(z), new Long(j)});
        } else {
            b().sendRenderEventReportForDecider(template, z, j);
        }
    }

    public static PrerenderOptions getPrerenderOptions(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PrerenderOptions) ipChange.ipc$dispatch("efa8f8ec", new Object[]{context}) : BirdNestService.getPrerenderOptions(context);
    }
}
