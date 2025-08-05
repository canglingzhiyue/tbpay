package com.alipay.android.app.cctemplate.api;

import android.content.Context;
import android.os.ConditionVariable;
import android.os.Looper;
import android.text.TextUtils;
import com.ali.user.mobile.app.constant.UTConstant;
import com.alipay.android.app.base.SPTaskHelper;
import com.alipay.android.app.cctemplate.model.Template;
import com.alipay.android.app.cctemplate.preload.DynamicTemplateQuickPayCache;
import com.alipay.android.app.cctemplate.storage.TemplateAssetsStorage;
import com.alipay.android.app.cctemplate.transport.TemplateManager;
import com.alipay.android.app.render.api.ICashierRender;
import com.alipay.android.app.render.api.ITemplateLoadStatusCallback;
import com.alipay.android.app.safepaylog.api.LogItem;
import com.alipay.android.app.safepaylog.utils.LogUtils;
import com.alipay.android.app.safepaylogv2.api.StatisticCollector;
import com.alipay.android.app.safepaylogv2.api.TemplateInfo;
import com.alipay.birdnest.api.BirdNestEngine;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import com.flybird.deploy.FBTemplateDecider;
import com.flybird.deploy.a;
import com.flybird.deploy.callback.a;
import com.flybird.deploy.callback.b;
import com.flybird.deploy.callback.c;
import com.flybird.deploy.callback.d;
import com.flybird.deploy.model.FBFullTplInfo;
import com.flybird.deploy.model.FBTemplateContent;
import com.flybird.deploy.model.FBUpdatePolicy;
import com.flybird.deploy.model.b;
import com.flybird.deploy.model.c;
import com.flybird.deploy.model.e;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.taobao.umipublish.draft.DraftMediaHelper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import org.json.JSONObject;
import tb.cum;

@MpaasClassInfo(ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-safepaybase")
/* loaded from: classes3.dex */
public class TemplateService {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ITplProvider f4335a;
    private ICashierRender.PreRenderResultClearHandler c;
    private volatile FBTemplateDecider e;
    private final ConditionVariable d = new ConditionVariable();
    private final TemplateManager b = new TemplateManager();

    public static /* synthetic */ ICashierRender.PreRenderResultClearHandler a(TemplateService templateService) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ICashierRender.PreRenderResultClearHandler) ipChange.ipc$dispatch("d9514cba", new Object[]{templateService}) : templateService.c;
    }

    public static /* synthetic */ FBTemplateDecider a(TemplateService templateService, long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FBTemplateDecider) ipChange.ipc$dispatch("f31b2147", new Object[]{templateService, new Long(j)}) : templateService.a(j);
    }

    public static /* synthetic */ Object a(TemplateService templateService, Object obj, ICashierRender.RenderParams renderParams) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("e18e2b57", new Object[]{templateService, obj, renderParams}) : a(obj, renderParams);
    }

    private FBTemplateDecider a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FBTemplateDecider) ipChange.ipc$dispatch("9a9d874c", new Object[]{this, new Long(j)});
        }
        if (Looper.myLooper() != Looper.getMainLooper() && j > 0) {
            this.d.block(j);
        }
        if (this.e == null) {
            StatisticCollector.addError(StatisticCollector.GLOBAL_AGENT, "np", "decider-create-timeout", Thread.currentThread().getName());
        }
        return this.e;
    }

    public TemplateService(ITplProvider iTplProvider) {
        this.f4335a = iTplProvider;
        try {
            a.a("QUICKPAY", new e.a().a(this.f4335a.getContext().getApplicationContext()).a("").a(FBUpdatePolicy.DeploymentType.EnhancedDeployment).a(new d() { // from class: com.alipay.android.app.cctemplate.api.TemplateService.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.flybird.deploy.callback.d
                public void onStatusNotify(String str, String str2, int i, int i2) {
                    ICashierRender.PreRenderResultClearHandler a2;
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("897ed895", new Object[]{this, str, str2, new Integer(i), new Integer(i2)});
                        return;
                    }
                    LogUtils.record(2, "TemplateService", "fb_v2:收银台：监听到模板更新任务状态变更, tplId=" + str + " status=" + i + " downloadMode=" + i2);
                    if (i != 7 || (a2 = TemplateService.a(TemplateService.this)) == null) {
                        return;
                    }
                    LogUtils.record(2, "TemplateService", "fb_v2:收银台：尝试清空预渲染结果, tplId=" + str + " status=" + i + " downloadMode=" + i2);
                    a2.clearResultsWithTplId(str);
                }
            }).a(new com.flybird.deploy.callback.e() { // from class: com.alipay.android.app.cctemplate.api.TemplateService.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.flybird.deploy.callback.e
                public void askUserShouldRetry(cum<Boolean, Void, Void> cumVar, a.C0256a c0256a) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("a681cd29", new Object[]{this, cumVar, c0256a});
                        return;
                    }
                    LogUtils.record(2, "TemplateService", "fb_v2:收银台：问问用户是否还要继续？" + c0256a);
                    if (c0256a == null || c0256a.customToken == null) {
                        LogUtils.record(2, "TemplateService", "fb_v2:收银台：问问用户是否还要继续？ -> 异常，false");
                        cumVar.apply(false);
                        return;
                    }
                    ICashierRender.RenderParams b = TemplateService.b(TemplateService.this, c0256a.customToken);
                    if (b == null) {
                        LogUtils.record(2, "TemplateService", "fb_v2:收银台：问问用户是否还要继续？ -> 异常，false");
                        cumVar.apply(false);
                        return;
                    }
                    ITemplateLoadStatusCallback iTemplateLoadStatusCallback = b.mStatusCallback;
                    if (iTemplateLoadStatusCallback == null) {
                        LogUtils.record(2, "TemplateService", "fb_v2:收银台：问问用户是否还要继续？ -> 异常，false");
                        cumVar.apply(false);
                        return;
                    }
                    LogUtils.record(2, "TemplateService", "fb_v2:收银台：正在咨询用户是否需要继续强制更新");
                    boolean onNewBnDeployAskingUserShouldContinue = iTemplateLoadStatusCallback.onNewBnDeployAskingUserShouldContinue();
                    LogUtils.record(2, "TemplateService", "fb_v2:收银台：强制更新咨询返回了 " + onNewBnDeployAskingUserShouldContinue);
                    cumVar.apply(Boolean.valueOf(onNewBnDeployAskingUserShouldContinue));
                }
            }).a(new b() { // from class: com.alipay.android.app.cctemplate.api.TemplateService.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.flybird.deploy.callback.b
                public void handleLogMap(HashMap<String, String> hashMap, a.C0256a c0256a) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("8aad9d8a", new Object[]{this, hashMap, c0256a});
                    } else if (hashMap == null || c0256a == null) {
                    } else {
                        Object obj = c0256a.customToken;
                        Object a2 = TemplateService.a(TemplateService.this, obj);
                        TemplateService.b(TemplateService.this, obj);
                        if (a2 == null) {
                            return;
                        }
                        TemplateInfo templateInfo = new TemplateInfo(hashMap.get("tpl_id") + "-" + hashMap.get("local_version") + "-" + hashMap.get("version"), hashMap.get("netType"), hashMap.get(HiAnalyticsConstant.BI_KEY_UPDATE_TYPE), hashMap.get(UTConstant.Args.UT_PROPERTY_SUCCESS), hashMap.get(HiAnalyticsConstant.BI_KEY_COST_TIME), "");
                        boolean equals = "T".equals(hashMap.get(UTConstant.Args.UT_PROPERTY_SUCCESS));
                        String optPreDefEntry = c0256a.customInfo.optPreDefEntry("fb::deploy::log_need_render", "");
                        templateInfo.setDownloadUsage((!"Y".equals(optPreDefEntry) || !equals) ? (!"Y".equals(optPreDefEntry) || equals) ? "N".equals(optPreDefEntry) ? LogItem.TemplateDownloadUsage.DownloadFromExit : LogItem.TemplateDownloadUsage.Unset : LogItem.TemplateDownloadUsage.DownloadFromRenderButNotRendered : LogItem.TemplateDownloadUsage.DownloadFromRenderAndRendered);
                        LogItem.TemplateUpdateScene templateUpdateScene = LogItem.TemplateUpdateScene.Unset;
                        try {
                            templateUpdateScene = LogItem.TemplateUpdateScene.valueOf(c0256a.customInfo.optPreDefEntry("fb::deploy::log_update_source", LogItem.TemplateUpdateScene.Unset.logValue));
                        } catch (Throwable unused) {
                        }
                        templateInfo.setUpdateScene(templateUpdateScene);
                        String str = hashMap.get("flow_type");
                        if (str == null) {
                            str = "";
                        }
                        char c = 65535;
                        int hashCode = str.hashCode();
                        if (hashCode != 67) {
                            if (hashCode != 84) {
                                if (hashCode == 2161 && str.equals("CT")) {
                                    c = 2;
                                }
                            } else if (str.equals("T")) {
                                c = 1;
                            }
                        } else if (str.equals("C")) {
                            c = 0;
                        }
                        templateInfo.setUpdateSource(c != 0 ? c != 1 ? c != 2 ? LogItem.TemplateUpdateSource.Unset : LogItem.TemplateUpdateSource.CDNFailedThenTMS : LogItem.TemplateUpdateSource.TMS : LogItem.TemplateUpdateSource.CDN);
                        StatisticCollector.addWindow(a2, templateInfo);
                    }
                }
            }).a(new c() { // from class: com.alipay.android.app.cctemplate.api.TemplateService.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.flybird.deploy.callback.c
                public void onError(String str, String str2) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("97d08c84", new Object[]{this, str, str2});
                        return;
                    }
                    LogUtils.record(2, "TemplateService", "fb_v2:收银台：监听到模板部署异常, errCode=" + str + ", errDesc=" + str2);
                }
            }).a(), new cum<FBTemplateDecider, Void, Void>() { // from class: com.alipay.android.app.cctemplate.api.TemplateService.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.cum
                public void error(Void r4) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("387cab6", new Object[]{this, r4});
                    }
                }

                @Override // tb.cum
                public Void apply(FBTemplateDecider fBTemplateDecider) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        return (Void) ipChange.ipc$dispatch("96146916", new Object[]{this, fBTemplateDecider});
                    }
                    TemplateService.a(TemplateService.this, fBTemplateDecider);
                    return null;
                }
            });
        } catch (Throwable th) {
            LogUtils.record(8, "TemplateService", "fb_v2:收银台：模板更新部署创建异常");
            LogUtils.printExceptionStackTrace(th);
        }
    }

    public Template loadTemplate(String str, String str2, String str3, Object obj, ICashierRender.RenderParams renderParams) {
        FBFullTplInfo asFullTplInfo;
        FBFullTplInfo fBFullTplInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Template) ipChange.ipc$dispatch("dff39e5c", new Object[]{this, str, str2, str3, obj, renderParams});
        }
        FBTemplateDecider a2 = a(1000L);
        if (a2 == null) {
            throw new RuntimeException("Failed to acquire decider");
        }
        if (renderParams.isPreRender) {
            LogUtils.record(2, "TemplateService", "fb_v2:收银台：本次预渲染，尝试取出本地模板触发更新, tplId=" + str);
            FBTemplateContent a3 = a2.a(com.flybird.deploy.model.d.a(str));
            LogUtils.record(2, "TemplateService", "fb_v2:收银台：本次预渲染，已经取出了本地模板来触发更新, tplToPrerender=" + a3);
            fBFullTplInfo = FBTemplateContent.asFullTplInfo(a3);
        } else {
            if (!TextUtils.isEmpty(str2) && str2.charAt(0) == '{') {
                asFullTplInfo = FBFullTplInfo.fromJSONString(str2);
            } else {
                LogUtils.record(2, "TemplateService", "fb_v2:收银台：Desc 是空的，特殊处理");
                asFullTplInfo = FBTemplateContent.asFullTplInfo(a2.a(com.flybird.deploy.model.d.a(str)));
            }
            LogUtils.record(2, "TemplateService", "fb_v2:收银台：本次真实渲染，提交给鸟巢的 tplDesc = " + str2 + " info=" + asFullTplInfo);
            fBFullTplInfo = asFullTplInfo;
        }
        if (!TextUtils.isEmpty(str) && fBFullTplInfo != null && !TextUtils.equals(fBFullTplInfo.getTplId(), str)) {
            LogUtils.record(2, "TemplateService", "fb_v2:收银台：本次渲染发现 tplId 不同，兼容处理");
            try {
                JSONObject jSONObject = FBFullTplInfo.toJSONObject(fBFullTplInfo);
                jSONObject.put("tplId", str);
                fBFullTplInfo = FBFullTplInfo.fromJSONObject(jSONObject);
            } catch (Throwable th) {
                LogUtils.record(2, "TemplateService", "fb_v2:收银台：兼容处理过程中发生异常");
                a2.b(str, "cashier:comp:err", "", "error: " + th.getMessage());
            }
        }
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final ArrayList arrayList = new ArrayList();
        LogUtils.record(2, "TemplateService", "fb_v2:收银台：提交更新任务给鸟巢，更新单个模板");
        LogItem.TemplateUpdateScene templateUpdateScene = renderParams.updateScene;
        final Throwable[] thArr = new Throwable[1];
        a2.a(fBFullTplInfo, new c.a().a("fb::deploy::log_update_source", templateUpdateScene.logValue).a("fb::deploy::log_need_render", templateUpdateScene == LogItem.TemplateUpdateScene.Unset ? "Y" : "N").a(a(obj, renderParams)).a(), new com.flybird.deploy.callback.a() { // from class: com.alipay.android.app.cctemplate.api.TemplateService.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.flybird.deploy.callback.a
            public void onSuccess(List<FBTemplateContent> list, a.C0256a c0256a) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("238cb6fa", new Object[]{this, list, c0256a});
                    return;
                }
                LogUtils.record(2, "TemplateService", "fb_v2:收银台：鸟巢告知更新成功，结果 " + list + ", 上下文 " + c0256a);
                arrayList.addAll(list);
                countDownLatch.countDown();
            }

            @Override // com.flybird.deploy.callback.a
            public void onFailure(a.C0256a c0256a) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("c8ee72a4", new Object[]{this, c0256a});
                    return;
                }
                LogUtils.record(2, "TemplateService", "fb_v2:收银台：鸟巢告知更新失败, 上下文 " + c0256a);
                thArr[0] = !c0256a.errors.isEmpty() ? c0256a.errors.get(0) : null;
                countDownLatch.countDown();
            }
        });
        countDownLatch.await();
        if (!arrayList.isEmpty()) {
            LogUtils.record(2, "TemplateService", "fb_v2:收银台：鸟巢模板更新全部完成, 成功更新了 " + arrayList);
            renderParams.mStatusCallback.onTemplateLoadResult(ICashierRender.TemplateLoadStatus.SUCCESS);
            return Template.fromFBTemplateContent((FBTemplateContent) arrayList.get(0));
        }
        LogUtils.record(2, "TemplateService", "fb_v2:收银台：鸟巢模板更新全部失败 " + arrayList);
        renderParams.mStatusCallback.onTemplateLoadResult(ICashierRender.TemplateLoadStatus.FAILED);
        a2.a(str, (FBTemplateContent) null, false);
        throw new RuntimeException("Failed to update tpl " + str, thArr[0]);
    }

    public void triggerTemplateUpdate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae071cc2", new Object[]{this});
        } else {
            SPTaskHelper.execute(new Runnable() { // from class: com.alipay.android.app.cctemplate.api.TemplateService.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    com.flybird.deploy.model.b a2 = new b.a().a(TemplateService.a(TemplateService.this, StatisticCollector.GLOBAL_AGENT, null)).a("fb::deploy::log_need_render", "N").a("fb::deploy::log_update_source", LogItem.TemplateUpdateScene.Unset.logValue).a();
                    FBTemplateDecider a3 = TemplateService.a(TemplateService.this, 1000L);
                    if (a3 == null) {
                        return;
                    }
                    a3.a(a2, new com.flybird.deploy.callback.a() { // from class: com.alipay.android.app.cctemplate.api.TemplateService.7.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.flybird.deploy.callback.a
                        public void onSuccess(List<FBTemplateContent> list, a.C0256a c0256a) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("238cb6fa", new Object[]{this, list, c0256a});
                                return;
                            }
                            LogUtils.record(2, "TemplateService", "fb_v2:收银台：鸟巢告知延迟更新成功，结果 " + list + ", 上下文 " + c0256a);
                        }

                        @Override // com.flybird.deploy.callback.a
                        public void onFailure(a.C0256a c0256a) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("c8ee72a4", new Object[]{this, c0256a});
                                return;
                            }
                            LogUtils.record(2, "TemplateService", "fb_v2:收银台：鸟巢告知更新失败, 上下文 " + c0256a);
                        }
                    });
                }
            });
        }
    }

    public boolean needUpdateLocalTpl(Template template, Template template2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("51d0d0ad", new Object[]{this, template, template2})).booleanValue() : TemplateManager.whetherNeedUpdate(template2, template);
    }

    public Template getServerTemplate(String str, String str2) {
        String str3;
        Template localTemplate;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Template) ipChange.ipc$dispatch("7be17b87", new Object[]{this, str, str2});
        }
        Template template = null;
        if (str2 != null) {
            template = this.b.getTemplateItem(str2.trim());
        }
        if (template != null) {
            return template;
        }
        TemplateManager templateManager = this.b;
        LogUtils.record(2, "CdynamicTemplateEngine:birdParams", "id=" + str);
        if (!TextUtils.isEmpty(str) && (localTemplate = getLocalTemplate(str)) != null) {
            str3 = this.b.createBirdParamsFromTemplate(localTemplate);
        } else {
            str3 = "{\"tplVersion\":\"" + getBirdNestVersion() + "\", \"platform\":\"android\"}";
        }
        return templateManager.getTemplateItem(str3);
    }

    public Template getLocalTemplate(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Template) ipChange.ipc$dispatch("24a01415", new Object[]{this, str});
        }
        FBTemplateDecider a2 = a(1000L);
        if (a2 != null) {
            return Template.fromFBTemplateContent(a2.a(com.flybird.deploy.model.d.a(str)));
        }
        LogUtils.record(8, "getLocalTemplate", "missing decider, id=" + str);
        return null;
    }

    public String readAssets(String str, Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("87964fe2", new Object[]{this, str, context}) : TemplateAssetsStorage.readAssetsFile(str, this.f4335a.getResources().getAssets(), context);
    }

    public static String getBirdNestVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3d8848e8", new Object[0]);
        }
        String version = BirdNestEngine.getVersion();
        LogUtils.record(2, "TemplateService::getBirdNestVersion", "bv:" + version);
        return version;
    }

    public void preLoad() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd8c2a30", new Object[]{this});
        } else {
            preLoad(null);
        }
    }

    public void preLoad(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb053798", new Object[]{this, context});
        } else {
            DynamicTemplateQuickPayCache.getInstance().preLoad(this.f4335a);
        }
    }

    public void registerPreRenderResultClearHandler(ICashierRender.PreRenderResultClearHandler preRenderResultClearHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e499d7e", new Object[]{this, preRenderResultClearHandler});
        } else {
            this.c = preRenderResultClearHandler;
        }
    }

    public void sendRenderEventReportForDecider(Template template, boolean z, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788fb8c7", new Object[]{this, template, new Boolean(z), new Long(j)});
            return;
        }
        FBTemplateDecider a2 = a(1000L);
        if (a2 != null && template != null) {
            a2.b(template.tplId, template.getAttachedFBTemplateContent(), z, j);
        } else {
            LogUtils.record(8, "sendRenderEventReport", "missing decider");
        }
    }

    private static Object a(Object obj, ICashierRender.RenderParams renderParams) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c4fb3dc", new Object[]{obj, renderParams}) : new Object[]{obj, renderParams};
    }

    public static /* synthetic */ Object a(TemplateService templateService, Object obj) {
        Object obj2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("be5a7553", new Object[]{templateService, obj});
        }
        if (!(obj instanceof Object[])) {
            return null;
        }
        Object[] objArr = (Object[]) obj;
        if (objArr.length == 2 && (obj2 = objArr[0]) != null) {
            return obj2;
        }
        return null;
    }

    public static /* synthetic */ ICashierRender.RenderParams b(TemplateService templateService, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ICashierRender.RenderParams) ipChange.ipc$dispatch("482e6fa8", new Object[]{templateService, obj});
        }
        if (!(obj instanceof Object[])) {
            return null;
        }
        Object[] objArr = (Object[]) obj;
        if (objArr.length != 2) {
            return null;
        }
        Object obj2 = objArr[1];
        if (!(obj2 instanceof ICashierRender.RenderParams)) {
            return null;
        }
        return (ICashierRender.RenderParams) obj2;
    }

    public static /* synthetic */ void a(TemplateService templateService, FBTemplateDecider fBTemplateDecider) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4519035", new Object[]{templateService, fBTemplateDecider});
            return;
        }
        templateService.e = fBTemplateDecider;
        templateService.d.open();
    }
}
