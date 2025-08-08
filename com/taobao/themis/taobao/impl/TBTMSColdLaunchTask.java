package com.taobao.themis.taobao.impl;

import android.app.Application;
import android.net.Uri;
import android.taobao.windvane.export.network.Request;
import android.taobao.windvane.extra.launch.WVOptimizedStartup;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.alibaba.ariver.resource.api.models.AppInfoModel;
import com.alibaba.ariver.resource.api.models.AppModel;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.ABGlobal;
import com.taobao.android.festival.jsbridge.AliFestivalWVPlugin;
import com.taobao.android.themis.graphics.TMSGraphicsLibraryInit;
import com.taobao.pha.core.controller.AppController;
import com.taobao.pha.core.model.ManifestModel;
import com.taobao.pha.core.model.PageModel;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.executor.ExecutorType;
import com.taobao.themis.kernel.executor.IExecutorService;
import com.taobao.themis.kernel.i;
import com.taobao.themis.kernel.metaInfo.TMSMetaInfoWrapper;
import com.taobao.themis.kernel.metaInfo.appinfo.AppInfoPrefetchJob;
import com.taobao.themis.kernel.solution.TMSSolutionType;
import com.taobao.themis.kernel.utils.n;
import com.taobao.themis.kernel.utils.t;
import com.taobao.themis.kernel.utils.v;
import com.taobao.themis.mix.utils.MixPageInfo;
import com.taobao.themis.open.ability.calendar.TMSCalendarBridge;
import com.taobao.themis.open.packages.downloader.a;
import com.taobao.themis.utils.o;
import com.taobao.themis.web.utils.HTMLPrefetchJob;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.q;
import tb.kge;
import tb.oqc;
import tb.qpo;
import tb.qpt;
import tb.sfv;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J4\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\"\u0010\t\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b0\nj\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b`\fH\u0007J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0003J4\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\"\u0010\t\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b0\nj\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b`\fH\u0003J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u0004H\u0002J \u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0004H\u0003J\u0018\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0004H\u0003J \u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0003J*\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00042\b\b\u0002\u0010\u001c\u001a\u00020\u001dH\u0007J\u0018\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u00102\u0006\u0010 \u001a\u00020!H\u0002J\u0010\u0010\"\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/taobao/themis/taobao/impl/TBTMSColdLaunchTask;", "Ljava/io/Serializable;", "()V", RPCDataItems.SWITCH_TAG_LOG, "", "init", "", "application", "Landroid/app/Application;", "params", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "initHomePageGateway", "initV2", "parseObject", "Lcom/taobao/pha/core/model/ManifestModel;", "manifestStr", "preFetchAppInfo", "appId", "type", "Lcom/taobao/themis/kernel/solution/TMSSolutionType;", "url", "preFetchFrameworkInfo", "preloadEngine", "preloadHTMLResource", "metaInfo", "Lcom/taobao/themis/kernel/metaInfo/TMSMetaInfoWrapper;", "ssrPrerender", "", "processEntryActivePage", "manifestModel", "manifestUri", "Landroid/net/Uri;", "webSinglePageSolutionPreload", "themis_taobao_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class TBTMSColdLaunchTask implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final TBTMSColdLaunchTask INSTANCE;
    private static final String TAG = "TMS 极简链路";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Application f22832a;

        public a(Application application) {
            this.f22832a = application;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                oqc.a().a(this.f22832a, oqc.j(), true);
                com.taobao.tao.topmultitab.c.a();
                TMSLogger.d(TBTMSColdLaunchTask.TAG, "TBTMSColdLaunchTask init homepage");
            } catch (Exception e) {
                TMSLogger.d(TBTMSColdLaunchTask.TAG, "TBTMSColdLaunchTask init homepage error: " + e.getMessage());
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TMSSolutionType f22837a;
        public final /* synthetic */ Application b;

        public d(TMSSolutionType tMSSolutionType, Application application) {
            this.f22837a = tMSSolutionType;
            this.b = application;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            TMSLogger.d(TBTMSColdLaunchTask.TAG, "start preload engine: " + this.f22837a);
            int i = com.taobao.themis.taobao.impl.a.$EnumSwitchMapping$0[this.f22837a.ordinal()];
            if (i == 1) {
                com.taobao.android.weex.e.a().a(this.b);
                TMSGraphicsLibraryInit.b();
            } else if (i != 2 && i != 3) {
            } else {
                com.taobao.themis.web.utils.a.b();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "run", "com/taobao/themis/taobao/impl/TBTMSColdLaunchTask$init$1$1"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class f implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Application f22838a;
        public final /* synthetic */ HashMap b;

        public f(Application application, HashMap hashMap) {
            this.f22838a = application;
            this.b = hashMap;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                TBTMSColdLaunchTask.access$initV2(this.f22838a, this.b);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class g implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f22839a;
        public final /* synthetic */ long b;

        public g(String str, long j) {
            this.f22839a = str;
            this.b = j;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            String url = this.f22839a;
            q.b(url, "url");
            TBTMSColdLaunchTask.webSinglePageSolutionPreload(url);
            TMSLogger.d(TBTMSColdLaunchTask.TAG, "prefetch end, cost: " + (System.currentTimeMillis() - this.b));
        }
    }

    static {
        kge.a(-792934844);
        kge.a(1028243835);
        INSTANCE = new TBTMSColdLaunchTask();
    }

    private TBTMSColdLaunchTask() {
    }

    public static final /* synthetic */ void access$initV2(Application application, HashMap hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d30f967", new Object[]{application, hashMap});
        } else {
            initV2(application, hashMap);
        }
    }

    @JvmStatic
    public static final void init(Application application, HashMap<String, Object> params) {
        Executor executor;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{application, params});
            return;
        }
        q.d(application, "application");
        q.d(params, "params");
        com.taobao.themis.kernel.utils.d dVar = com.taobao.themis.kernel.utils.d.INSTANCE;
        long currentTimeMillis = System.currentTimeMillis();
        qpo.d(application.getApplicationContext());
        long currentTimeMillis2 = System.currentTimeMillis();
        boolean isFeatureOpened = ABGlobal.isFeatureOpened(application, "enableWvPreStartup");
        long currentTimeMillis3 = System.currentTimeMillis();
        if (isFeatureOpened) {
            WVOptimizedStartup.startup(new WVOptimizedStartup.Params(application));
        }
        long currentTimeMillis4 = System.currentTimeMillis();
        v b2 = t.b(application.getApplicationContext(), "enableAsyncExecuteTask");
        q.b(b2, "TMSABTestUtils.getExperi…\"enableAsyncExecuteTask\")");
        if (b2.b()) {
            IExecutorService iExecutorService = (IExecutorService) qpt.b(IExecutorService.class);
            if (iExecutorService != null && (executor = iExecutorService.getExecutor(ExecutorType.NORMAL)) != null) {
                executor.execute(new f(application, params));
            }
        } else {
            initV2(application, params);
        }
        TMSLogger.d(TAG, "TBTMSColdLaunchTask end, enableWvPreStartup=" + isFeatureOpened + " cost: " + (System.currentTimeMillis() - currentTimeMillis) + ", readSwitch: " + (currentTimeMillis3 - currentTimeMillis2) + ", startup: " + (currentTimeMillis4 - currentTimeMillis3));
    }

    @JvmStatic
    private static final void initV2(Application application, HashMap<String, Object> hashMap) {
        Executor executor;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68bf227", new Object[]{application, hashMap});
            return;
        }
        com.taobao.themis.kernel.utils.d dVar = com.taobao.themis.kernel.utils.d.INSTANCE;
        long currentTimeMillis = System.currentTimeMillis();
        com.taobao.themis.kernel.utils.d dVar2 = com.taobao.themis.kernel.utils.d.INSTANCE;
        TBTMSSDK.initTBTMS(application, false);
        Object obj = hashMap.get("uriString");
        String str = null;
        String obj2 = obj != null ? obj.toString() : null;
        Object obj3 = hashMap.get(AliFestivalWVPlugin.PARAMS_MODULE_NAME);
        String obj4 = obj3 != null ? obj3.toString() : null;
        String a2 = o.a(obj2, "h5Url");
        if (a2 != null) {
            str = a2.toString();
        }
        if (StringUtils.isEmpty(obj2) || StringUtils.isEmpty(obj4) || (!q.a((Object) obj4, (Object) TMSCalendarBridge.namespace)) || StringUtils.isEmpty(str)) {
            TMSLogger.d(TAG, "参数有误,启动失败: " + hashMap);
            return;
        }
        String url = Uri.decode(o.a(obj2, "h5Url"));
        TMSSolutionType type = TMSSolutionType.getType(o.b(url));
        if (type == null) {
            return;
        }
        TMSLogger.d(TAG, "type: " + type.name());
        String str2 = o.a(url, true).get(i.APP_ID);
        String str3 = str2;
        if (str3 == null || str3.length() == 0) {
            if (TMSSolutionType.WEB_SINGLE_PAGE != type || !n.K()) {
                return;
            }
            IExecutorService iExecutorService = (IExecutorService) qpt.b(IExecutorService.class);
            if (iExecutorService != null && (executor = iExecutorService.getExecutor(ExecutorType.URGENT)) != null) {
                executor.execute(new g(url, currentTimeMillis));
            }
            com.taobao.themis.web.utils.a.b();
            TMSLogger.d(TAG, "preload uc core end, cost: " + (System.currentTimeMillis() - currentTimeMillis));
            return;
        }
        com.taobao.themis.kernel.utils.d dVar3 = com.taobao.themis.kernel.utils.d.INSTANCE;
        if (str3.length() > 0) {
            z = true;
        }
        if (z) {
            initHomePageGateway(application);
        }
        com.taobao.themis.kernel.utils.d dVar4 = com.taobao.themis.kernel.utils.d.INSTANCE;
        q.b(url, "url");
        preFetchAppInfo(str2, type, url);
        com.taobao.themis.kernel.utils.d dVar5 = com.taobao.themis.kernel.utils.d.INSTANCE;
        preFetchFrameworkInfo(type, url);
        com.taobao.themis.kernel.utils.d dVar6 = com.taobao.themis.kernel.utils.d.INSTANCE;
        preloadEngine(type, url, application);
    }

    @JvmStatic
    private static final void preFetchAppInfo(String str, TMSSolutionType tMSSolutionType, String str2) {
        Executor executor;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11c83bcf", new Object[]{str, tMSSolutionType, str2});
            return;
        }
        TMSLogger.d(TAG, "预加载 appInfo : " + str + ", timestamp: " + System.currentTimeMillis());
        AppInfoPrefetchJob.prefetchAppInfo$default(str, str2, false, 4, null);
        com.taobao.themis.open.packages.downloader.g gVar = new com.taobao.themis.open.packages.downloader.g();
        IExecutorService iExecutorService = (IExecutorService) qpt.b(IExecutorService.class);
        if (iExecutorService == null || (executor = iExecutorService.getExecutor(ExecutorType.URGENT)) == null) {
            return;
        }
        executor.execute(new b(str, tMSSolutionType, str2, gVar));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f22833a;
        public final /* synthetic */ TMSSolutionType b;
        public final /* synthetic */ String c;
        public final /* synthetic */ com.taobao.themis.open.packages.downloader.g d;

        public b(String str, TMSSolutionType tMSSolutionType, String str2, com.taobao.themis.open.packages.downloader.g gVar) {
            this.f22833a = str;
            this.b = tMSSolutionType;
            this.c = str2;
            this.d = gVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            sfv appInfoSync = AppInfoPrefetchJob.getAppInfoSync(this.f22833a);
            if (appInfoSync == null || !appInfoSync.c() || appInfoSync.a() == null) {
                return;
            }
            AppModel appInfo = appInfoSync.a();
            TMSSolutionType tMSSolutionType = this.b;
            q.b(appInfo, "appInfo");
            TBTMSColdLaunchTask.preloadHTMLResource$default(tMSSolutionType, new TMSMetaInfoWrapper(appInfo), this.c, false, 8, null);
            com.taobao.themis.taobao.utils.a.a();
            AppInfoModel appInfoModel = appInfo.getAppInfoModel();
            q.b(appInfoModel, "appInfo.appInfoModel");
            String name = appInfoModel.getName();
            q.b(name, "appInfo.appInfoModel.name");
            String appId = appInfo.getAppId();
            q.b(appId, "appInfo.appId");
            String appVersion = appInfo.getAppVersion();
            q.b(appVersion, "appInfo.appVersion");
            AppInfoModel appInfoModel2 = appInfo.getAppInfoModel();
            String bytePackageUrl = appInfoModel2 != null ? appInfoModel2.getBytePackageUrl() : null;
            JSONObject extendInfos = appInfo.getExtendInfos();
            com.taobao.themis.open.packages.downloader.b bVar = new com.taobao.themis.open.packages.downloader.b(name, appId, appVersion, bytePackageUrl, extendInfos != null ? extendInfos.getJSONObject("byteCacheInfo") : null);
            TMSLogger.d(TBTMSColdLaunchTask.TAG, "预加载主包 " + this.f22833a + " start: " + System.currentTimeMillis());
            this.d.a(bVar, new a(bVar));
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"com/taobao/themis/taobao/impl/TBTMSColdLaunchTask$preFetchAppInfo$1$1$1", "Lcom/taobao/themis/open/packages/downloader/IPackageDownloader$PackageDownloadCallback;", "onDownloadError", "", "error", "Lcom/taobao/themis/open/packages/downloader/IPackageDownloader$Error;", "onDownloadFinish", "filePath", "", "onDownloadProgress", "progress", "", "themis_taobao_release"}, k = 1, mv = {1, 4, 1})
        /* loaded from: classes9.dex */
        public static final class a implements a.b {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ com.taobao.themis.open.packages.downloader.b f22834a;

            @Override // com.taobao.themis.open.packages.downloader.a.b
            public void a(int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
                }
            }

            public a(com.taobao.themis.open.packages.downloader.b bVar) {
                this.f22834a = bVar;
            }

            @Override // com.taobao.themis.open.packages.downloader.a.b
            public void a(String filePath) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("f3a64c32", new Object[]{this, filePath});
                    return;
                }
                q.d(filePath, "filePath");
                TMSLogger.d(TBTMSColdLaunchTask.TAG, "主包预加载成功: " + this.f22834a.b() + ", " + System.currentTimeMillis());
                Log.e(TBTMSColdLaunchTask.TAG, "主包预加载成功: " + this.f22834a.b() + ", " + System.currentTimeMillis());
            }

            @Override // com.taobao.themis.open.packages.downloader.a.b
            public void a(a.C0963a error) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("70e0ec00", new Object[]{this, error});
                    return;
                }
                q.d(error, "error");
                TMSLogger.d(TBTMSColdLaunchTask.TAG, "主包预加载失败:" + this.f22834a.b() + " error: " + error.a() + ", msg: " + error.b());
                Log.e(TBTMSColdLaunchTask.TAG, "主包预加载失败:" + this.f22834a.b() + " error: " + error.a() + ", msg: " + error.b());
            }
        }
    }

    @JvmStatic
    private static final void preFetchFrameworkInfo(TMSSolutionType tMSSolutionType, String str) {
        Executor executor;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83ef7f9c", new Object[]{tMSSolutionType, str});
        } else if (TMSSolutionType.MINIGAME != tMSSolutionType) {
        } else {
            TMSLogger.d(TAG, "预加载 frameworkInfo frameworkId: " + i.CANVAS_FRAMEWORK_ID + ", timestamp: " + System.currentTimeMillis());
            Log.e(TAG, "预加载 frameworkInfo frameworkId: " + i.CANVAS_FRAMEWORK_ID + ", timestamp: " + System.currentTimeMillis());
            AppInfoPrefetchJob.prefetchAppInfo(i.CANVAS_FRAMEWORK_ID, str, true);
            com.taobao.themis.open.packages.downloader.g gVar = new com.taobao.themis.open.packages.downloader.g();
            IExecutorService iExecutorService = (IExecutorService) qpt.b(IExecutorService.class);
            if (iExecutorService == null || (executor = iExecutorService.getExecutor(ExecutorType.URGENT)) == null) {
                return;
            }
            executor.execute(new c(i.CANVAS_FRAMEWORK_ID, gVar));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f22835a;
        public final /* synthetic */ com.taobao.themis.open.packages.downloader.g b;

        public c(String str, com.taobao.themis.open.packages.downloader.g gVar) {
            this.f22835a = str;
            this.b = gVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            com.taobao.themis.taobao.utils.a.a();
            sfv appInfoSync = AppInfoPrefetchJob.getAppInfoSync(this.f22835a);
            if (appInfoSync == null || !appInfoSync.c() || appInfoSync.a() == null) {
                return;
            }
            AppModel frameworkInfo = appInfoSync.a();
            q.b(frameworkInfo, "frameworkInfo");
            AppInfoModel appInfoModel = frameworkInfo.getAppInfoModel();
            q.b(appInfoModel, "frameworkInfo.appInfoModel");
            String name = appInfoModel.getName();
            q.b(name, "frameworkInfo.appInfoModel.name");
            String appId = frameworkInfo.getAppId();
            q.b(appId, "frameworkInfo.appId");
            String appVersion = frameworkInfo.getAppVersion();
            q.b(appVersion, "frameworkInfo.appVersion");
            AppInfoModel appInfoModel2 = frameworkInfo.getAppInfoModel();
            String packageUrl = appInfoModel2 != null ? appInfoModel2.getPackageUrl() : null;
            JSONObject extendInfos = frameworkInfo.getExtendInfos();
            com.taobao.themis.open.packages.downloader.b bVar = new com.taobao.themis.open.packages.downloader.b(name, appId, appVersion, packageUrl, extendInfos != null ? extendInfos.getJSONObject("cacheInfo") : null);
            TMSLogger.d(TBTMSColdLaunchTask.TAG, "预加载框架包 start: " + this.f22835a);
            this.b.a(bVar, new a(bVar));
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"com/taobao/themis/taobao/impl/TBTMSColdLaunchTask$preFetchFrameworkInfo$1$1$1", "Lcom/taobao/themis/open/packages/downloader/IPackageDownloader$PackageDownloadCallback;", "onDownloadError", "", "error", "Lcom/taobao/themis/open/packages/downloader/IPackageDownloader$Error;", "onDownloadFinish", "filePath", "", "onDownloadProgress", "progress", "", "themis_taobao_release"}, k = 1, mv = {1, 4, 1})
        /* loaded from: classes9.dex */
        public static final class a implements a.b {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ com.taobao.themis.open.packages.downloader.b f22836a;

            @Override // com.taobao.themis.open.packages.downloader.a.b
            public void a(int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
                }
            }

            public a(com.taobao.themis.open.packages.downloader.b bVar) {
                this.f22836a = bVar;
            }

            @Override // com.taobao.themis.open.packages.downloader.a.b
            public void a(String filePath) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("f3a64c32", new Object[]{this, filePath});
                    return;
                }
                q.d(filePath, "filePath");
                TMSLogger.d(TBTMSColdLaunchTask.TAG, "框架包预加载成功： " + this.f22836a.b() + ", " + System.currentTimeMillis());
            }

            @Override // com.taobao.themis.open.packages.downloader.a.b
            public void a(a.C0963a error) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("70e0ec00", new Object[]{this, error});
                    return;
                }
                q.d(error, "error");
                TMSLogger.d(TBTMSColdLaunchTask.TAG, "框架包预加载失败: " + this.f22836a.b() + " error: " + error.a() + ", msg: " + error.b());
            }
        }
    }

    @JvmStatic
    private static final void preloadEngine(TMSSolutionType tMSSolutionType, String str, Application application) {
        Executor executor;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85838bb9", new Object[]{tMSSolutionType, str, application});
            return;
        }
        IExecutorService iExecutorService = (IExecutorService) qpt.b(IExecutorService.class);
        if (iExecutorService != null && (executor = iExecutorService.getExecutor(ExecutorType.URGENT)) != null) {
            executor.execute(new d(tMSSolutionType, application));
        }
        TMSLogger.d(TAG, "finish preload engine: " + tMSSolutionType);
    }

    @JvmStatic
    private static final void initHomePageGateway(Application application) {
        IExecutorService iExecutorService;
        Executor executor;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c78e22d2", new Object[]{application});
        } else if (!n.C() || (iExecutorService = (IExecutorService) qpt.b(IExecutorService.class)) == null || (executor = iExecutorService.getExecutor(ExecutorType.URGENT)) == null) {
        } else {
            executor.execute(new a(application));
        }
    }

    public static /* synthetic */ void preloadHTMLResource$default(TMSSolutionType tMSSolutionType, TMSMetaInfoWrapper tMSMetaInfoWrapper, String str, boolean z, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d950ab66", new Object[]{tMSSolutionType, tMSMetaInfoWrapper, str, new Boolean(z), new Integer(i), obj});
            return;
        }
        if ((i & 8) != 0) {
            z = false;
        }
        preloadHTMLResource(tMSSolutionType, tMSMetaInfoWrapper, str, z);
    }

    @JvmStatic
    public static final void preloadHTMLResource(TMSSolutionType type, TMSMetaInfoWrapper metaInfo, String url, boolean z) {
        JSONObject a2;
        PageModel pageModel;
        ArrayList<PageModel> arrayList;
        String pageUrl;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4311b87c", new Object[]{type, metaInfo, url, new Boolean(z)});
            return;
        }
        q.d(type, "type");
        q.d(metaInfo, "metaInfo");
        q.d(url, "url");
        if (type != TMSSolutionType.MIX) {
            return;
        }
        MixPageInfo a3 = com.taobao.themis.mix.utils.a.a(url, com.taobao.themis.mix.utils.a.b(metaInfo));
        String str = null;
        if (StringUtils.equals("h5", a3 != null ? a3.getPageType() : null)) {
            if (a3 == null || (pageUrl = a3.getPageUrl()) == null) {
                return;
            }
            HTMLPrefetchJob.preloadHTMLResource(pageUrl, z);
        } else if (!n.ah() || (a2 = com.taobao.themis.mix.utils.a.a(metaInfo)) == null) {
        } else {
            TBTMSColdLaunchTask tBTMSColdLaunchTask = INSTANCE;
            String jSONString = a2.toJSONString();
            q.b(jSONString, "manifestModel.toJSONString()");
            ManifestModel parseObject = tBTMSColdLaunchTask.parseObject(jSONString);
            if (parseObject == null) {
                return;
            }
            Uri manifestUri = Uri.parse(url);
            TBTMSColdLaunchTask tBTMSColdLaunchTask2 = INSTANCE;
            q.b(manifestUri, "manifestUri");
            tBTMSColdLaunchTask2.processEntryActivePage(parseObject, manifestUri);
            AppController.a(parseObject, manifestUri);
            int i = parseObject.tabBar.selectedIndex;
            ArrayList<PageModel> arrayList2 = parseObject.pages;
            q.b(arrayList2, "parsedManifestModel.pages");
            if (!(!arrayList2.isEmpty()) || i >= arrayList2.size() || (pageModel = arrayList2.get(i)) == null) {
                return;
            }
            String str2 = null;
            q.b(pageModel.frames, "pageModel.frames");
            if (!arrayList.isEmpty()) {
                q.b(pageModel, "pageModel");
                int activeIndex = pageModel.getActiveIndex();
                if (activeIndex >= 0 && activeIndex < pageModel.frames.size()) {
                    PageModel pageModel2 = pageModel.frames.get(activeIndex);
                    if (pageModel2 != null) {
                        str = pageModel2.getUrl();
                    }
                    str2 = str;
                }
            } else {
                str2 = pageModel.getUrl();
            }
            if (str2 != null) {
                TMSLogger.a(TAG, "Triver PHA html prefetch, url=" + url + ", isPrerender=" + z);
                HTMLPrefetchJob.preloadHTMLResource(str2, z);
                return;
            }
            TMSLogger.a(TAG, "Triver PHA html prefetch: page url is null");
        }
    }

    private final ManifestModel parseObject(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ManifestModel) ipChange.ipc$dispatch("411dfad7", new Object[]{this, str});
        }
        try {
            return (ManifestModel) JSONObject.parseObject(str, ManifestModel.class);
        } catch (Exception unused) {
            return null;
        }
    }

    private final void processEntryActivePage(ManifestModel manifestModel, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21d74f22", new Object[]{this, manifestModel, uri});
            return;
        }
        String queryParameter = uri.getQueryParameter("pha_active_page_key");
        if (StringUtils.isEmpty(queryParameter) || manifestModel.tabBar == null) {
            return;
        }
        ArrayList<PageModel> arrayList = manifestModel.pages;
        q.b(arrayList, "manifestModel.pages");
        int size = arrayList.size();
        int i = 0;
        int i2 = -1;
        loop0: while (true) {
            if (i >= size) {
                i = -1;
                break;
            }
            PageModel pageModel = arrayList.get(i);
            if (pageModel != null) {
                q.b(pageModel, "pageModels[i] ?: continue");
                i2 = pageModel.getDefaultFrameIndex();
                if (StringUtils.equals(pageModel.key, queryParameter)) {
                    break;
                } else if (pageModel.frames != null) {
                    ArrayList<PageModel> arrayList2 = pageModel.frames;
                    q.b(arrayList2, "pageModel.frames");
                    int size2 = arrayList2.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        PageModel pageModel2 = pageModel.frames.get(i3);
                        if (pageModel2 != null) {
                            q.b(pageModel2, "pageModel.frames[j] ?: continue");
                            if (StringUtils.equals(pageModel2.key, queryParameter)) {
                                i2 = i3;
                                break loop0;
                            }
                        }
                    }
                    continue;
                } else {
                    continue;
                }
            }
            i++;
        }
        if (i < 0) {
            return;
        }
        manifestModel.tabBar.selectedIndex = i;
        PageModel pageModel3 = arrayList.get(i);
        if (pageModel3 == null || i2 < 0 || pageModel3.getPageHeader() == null) {
            return;
        }
        pageModel3.setActiveIndex(i2);
    }

    @JvmStatic
    public static final void webSinglePageSolutionPreload(String url) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa668e36", new Object[]{url});
            return;
        }
        q.d(url, "url");
        TMSLogger.d(TAG, "H5 文档预请求");
        android.taobao.windvane.export.network.f.a(new Request.a().a(url).b("GET").a(e.INSTANCE).a());
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "requestUrl", "", "kotlin.jvm.PlatformType", "prefetchUrl", com.taobao.android.weex_framework.util.a.ATOM_EXT_match}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class e implements android.taobao.windvane.export.network.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final e INSTANCE = new e();

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0042, code lost:
            if (kotlin.text.n.b((java.lang.CharSequence) r0, (java.lang.CharSequence) r1, false, 2, (java.lang.Object) null) != false) goto L12;
         */
        @Override // android.taobao.windvane.export.network.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean a(java.lang.String r7, java.lang.String r8) {
            /*
                r6 = this;
                com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.themis.taobao.impl.TBTMSColdLaunchTask.e.$ipChange
                boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
                r2 = 2
                r3 = 1
                r4 = 0
                if (r1 == 0) goto L1f
                r1 = 3
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r1[r4] = r6
                r1[r3] = r7
                r1[r2] = r8
                java.lang.String r7 = "d9378d80"
                java.lang.Object r7 = r0.ipc$dispatch(r7, r1)
                java.lang.Boolean r7 = (java.lang.Boolean) r7
                boolean r7 = r7.booleanValue()
                return r7
            L1f:
                r0 = r7
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                boolean r1 = android.text.StringUtils.isEmpty(r0)
                if (r1 != 0) goto L45
                r1 = r8
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                boolean r5 = android.text.StringUtils.isEmpty(r1)
                if (r5 != 0) goto L45
                java.lang.String r5 = "requestUrl"
                kotlin.jvm.internal.q.b(r7, r5)
                java.lang.String r7 = "prefetchUrl"
                kotlin.jvm.internal.q.b(r8, r7)
                r7 = 0
                boolean r7 = kotlin.text.n.b(r0, r1, r4, r2, r7)
                if (r7 == 0) goto L45
                goto L46
            L45:
                r3 = 0
            L46:
                if (r3 == 0) goto L4f
                java.lang.String r7 = "TMS 极简链路"
                java.lang.String r8 = "H5 文档预请求成功"
                com.taobao.themis.kernel.basic.TMSLogger.d(r7, r8)
            L4f:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.themis.taobao.impl.TBTMSColdLaunchTask.e.a(java.lang.String, java.lang.String):boolean");
        }
    }
}
