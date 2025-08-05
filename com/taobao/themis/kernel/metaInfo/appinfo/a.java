package com.taobao.themis.kernel.metaInfo.appinfo;

import android.text.TextUtils;
import com.alibaba.ariver.resource.api.models.AppInfoRequestModel;
import com.alibaba.ariver.resource.api.models.AppInfoScene;
import com.alibaba.ariver.resource.api.models.AppModel;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.executor.ExecutorType;
import com.taobao.themis.kernel.executor.IExecutorService;
import com.taobao.themis.kernel.metaInfo.appinfo.cacheConfig.AppInfoCacheConfig;
import com.taobao.themis.kernel.metaInfo.appinfo.core.AppInfoStrategy;
import com.taobao.themis.kernel.metaInfo.appinfo.request.IAppInfoRequestClient;
import com.taobao.themis.kernel.metaInfo.appinfo.storage.AppInfoDao;
import com.taobao.themis.kernel.network.c;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.kge;
import tb.qpt;
import tb.riy;
import tb.rne;
import tb.sfs;
import tb.sfu;
import tb.sfv;
import tb.tlh;

/* loaded from: classes9.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "AppInfoManager";

    /* renamed from: a  reason: collision with root package name */
    private static volatile a f22544a;
    private List<InterfaceC0946a> b = new CopyOnWriteArrayList();

    /* renamed from: com.taobao.themis.kernel.metaInfo.appinfo.a$4  reason: invalid class name */
    /* loaded from: classes9.dex */
    public static /* synthetic */ class AnonymousClass4 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f22548a = new int[AppInfoStrategy.values().length];

        static {
            try {
                f22548a[AppInfoStrategy.LOCAL_LOAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22548a[AppInfoStrategy.ASYNC_LOAD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22548a[AppInfoStrategy.SYNC_LOAD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22548a[AppInfoStrategy.FORCE_SYNC_LOAD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: com.taobao.themis.kernel.metaInfo.appinfo.a$a  reason: collision with other inner class name */
    /* loaded from: classes9.dex */
    public interface InterfaceC0946a {
        void a(AppModel appModel);
    }

    static {
        kge.a(-1882970082);
    }

    public static synchronized a a() {
        synchronized (a.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("78655d18", new Object[0]);
            }
            if (f22544a == null) {
                f22544a = new a();
            }
            return f22544a;
        }
    }

    public void a(AppModel appModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f6e15f", new Object[]{this, appModel});
        } else if (appModel == null) {
        } else {
            b(appModel);
            com.taobao.themis.kernel.metaInfo.appinfo.cacheConfig.a.a().b(appModel.getAppId());
        }
    }

    public void a(List<AppModel> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (AppModel appModel : list) {
            if (appModel != null) {
                b(appModel);
                arrayList.add(appModel.getAppId());
            }
        }
        com.taobao.themis.kernel.metaInfo.appinfo.cacheConfig.a.a().b(arrayList);
    }

    private void b(AppModel appModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23125ffe", new Object[]{this, appModel});
            return;
        }
        AppInfoDao appInfoDao = new AppInfoDao();
        appInfoDao.appId = appModel.getAppId();
        appInfoDao.appInfo = appModel;
        appInfoDao.lastRequestTimeStamp = System.currentTimeMillis();
        appInfoDao.lastUsedTimeStamp = appInfoDao.lastRequestTimeStamp;
        appInfoDao.version = appModel.getAppVersion();
        if (appModel.getAppInfoModel() != null) {
            appInfoDao.version = appModel.getAppInfoModel().getDeveloperVersion();
            if (appModel.getAppInfoModel().getTemplateConfig() != null && appModel.getAppInfoModel().getTemplateConfig().getTemplateId() != null) {
                appInfoDao.templateId = appModel.getAppInfoModel().getTemplateConfig().getTemplateId();
            }
        }
        com.taobao.themis.kernel.metaInfo.appinfo.storage.a.a().a(appInfoDao);
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            com.taobao.themis.kernel.metaInfo.appinfo.storage.a.a().a((List<String>) null);
        }
    }

    public AppInfoStrategy a(AppInfoScene appInfoScene, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AppInfoStrategy) ipChange.ipc$dispatch("d806464b", new Object[]{this, appInfoScene, str, str2, str3});
        }
        AppInfoDao a2 = com.taobao.themis.kernel.metaInfo.appinfo.storage.a.a().a(str, str2, str3);
        if (a2 == null || (!TextUtils.isEmpty(a2.type) && !TextUtils.equals(a2.type, appInfoScene.name()))) {
            return AppInfoStrategy.SYNC_LOAD;
        }
        return a(a2);
    }

    public AppInfoStrategy a(AppInfoScene appInfoScene, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AppInfoStrategy) ipChange.ipc$dispatch("b05803df", new Object[]{this, appInfoScene, str}) : a(appInfoScene, str, "*", "");
    }

    public AppInfoStrategy a(AppInfoDao appInfoDao) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AppInfoStrategy) ipChange.ipc$dispatch("667a6ab3", new Object[]{this, appInfoDao});
        }
        if (appInfoDao == null) {
            return AppInfoStrategy.SYNC_LOAD;
        }
        if (tlh.a(appInfoDao)) {
            return AppInfoStrategy.FORCE_SYNC_LOAD;
        }
        String str = appInfoDao.appId;
        AppInfoCacheConfig.CacheTime a2 = com.taobao.themis.kernel.metaInfo.appinfo.cacheConfig.a.a().a(str, b.a(appInfoDao.appInfo), b.b(appInfoDao.appInfo));
        AppInfoCacheConfig.ExpireConfig a3 = com.taobao.themis.kernel.metaInfo.appinfo.cacheConfig.a.a().a(str);
        if (a3 != null && a3.expired) {
            if (TextUtils.equals(a3.strategy, AppInfoStrategy.SYNC_LOAD.getName())) {
                TMSLogger.b(TAG, str + " important app local cache expired, strategy syncLoad!");
                return AppInfoStrategy.SYNC_LOAD;
            }
            TMSLogger.b(TAG, str + " important app local cache expired, strategy asyncLoad.");
            return AppInfoStrategy.ASYNC_LOAD;
        } else if (appInfoDao.lastRequestTimeStamp <= System.currentTimeMillis() - (a2.maxSyncTime * 1000)) {
            TMSLogger.b(TAG, str + " local cache over maxSyncTime, syncLoad strategy.");
            return AppInfoStrategy.SYNC_LOAD;
        } else if (appInfoDao.lastRequestTimeStamp > System.currentTimeMillis() - (a2.maxAsyncTime * 1000)) {
            TMSLogger.b(TAG, str + " local cache can be used.");
            return AppInfoStrategy.LOCAL_LOAD;
        } else {
            TMSLogger.b(TAG, str + " local cache over maxASyncTime, asyncLoad strategy!");
            return AppInfoStrategy.ASYNC_LOAD;
        }
    }

    public void a(final com.taobao.themis.kernel.metaInfo.appinfo.core.requestConfig.b bVar, final boolean z, final rne rneVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45fd8398", new Object[]{this, bVar, new Boolean(z), rneVar});
            return;
        }
        TMSLogger.b(TAG, "enter prepareAppInfoAsync id[" + bVar.b() + riy.ARRAY_END_STR);
        ((IExecutorService) qpt.a(IExecutorService.class)).getExecutor(ExecutorType.URGENT).execute(new Runnable() { // from class: com.taobao.themis.kernel.metaInfo.appinfo.a.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Code restructure failed: missing block: B:23:0x00a6, code lost:
                if (r6 != 4) goto L24;
             */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void run() {
                /*
                    Method dump skipped, instructions count: 360
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.taobao.themis.kernel.metaInfo.appinfo.a.AnonymousClass1.run():void");
            }
        });
    }

    public void a(final com.taobao.themis.kernel.metaInfo.appinfo.core.requestConfig.b bVar, final rne rneVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7395dbea", new Object[]{this, bVar, rneVar});
        } else {
            ((IExecutorService) qpt.a(IExecutorService.class)).getExecutor(ExecutorType.NETWORK).execute(new Runnable() { // from class: com.taobao.themis.kernel.metaInfo.appinfo.a.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    sfv a2 = a.this.a(bVar);
                    if (rneVar == null) {
                        return;
                    }
                    if (!a2.c() || a2.a() == null) {
                        rneVar.a(a2.d(), a2.e(), a2.f());
                    } else {
                        rneVar.a(a2.a(), AppInfoStrategy.ASYNC_LOAD);
                    }
                }
            });
        }
    }

    public sfv a(com.taobao.themis.kernel.metaInfo.appinfo.core.requestConfig.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sfv) ipChange.ipc$dispatch("7e35ae40", new Object[]{this, bVar});
        }
        IAppInfoRequestClient iAppInfoRequestClient = (IAppInfoRequestClient) qpt.b(IAppInfoRequestClient.class);
        if (iAppInfoRequestClient == null) {
            return new sfv(false).a("APPINFO_EMPTY_CLIENT").b("empty IAppInfoRequestClient");
        }
        c<List<AppInfoRequestModel>, JSONObject> requestAppInfo = iAppInfoRequestClient.requestAppInfo(bVar);
        if (!requestAppInfo.f22556a || requestAppInfo.d.isEmpty()) {
            return new sfv(false).a(requestAppInfo.b).b(requestAppInfo.c).a(requestAppInfo.e);
        }
        AppInfoRequestModel appInfoRequestModel = requestAppInfo.d.get(0);
        if (!TextUtils.isEmpty(appInfoRequestModel.errorCode)) {
            return new sfv(false).a(appInfoRequestModel.errorCode).b(appInfoRequestModel.errorMsg).a(a(appInfoRequestModel));
        }
        if (bVar.b) {
            a((AppModel) requestAppInfo.d.get(0));
        }
        for (InterfaceC0946a interfaceC0946a : this.b) {
            interfaceC0946a.a(appInfoRequestModel);
        }
        return new sfv(true).a(requestAppInfo.d.get(0)).a(AppInfoStrategy.SYNC_LOAD);
    }

    public void a(final com.taobao.themis.kernel.metaInfo.appinfo.core.requestConfig.a aVar, final sfs sfsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d2eb054", new Object[]{this, aVar, sfsVar});
        } else {
            ((IExecutorService) qpt.a(IExecutorService.class)).getExecutor(ExecutorType.NETWORK).execute(new Runnable() { // from class: com.taobao.themis.kernel.metaInfo.appinfo.a.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    sfu a2 = a.this.a(aVar);
                    if (sfsVar == null) {
                        return;
                    }
                    if (a2.b()) {
                        a2.a();
                        return;
                    }
                    a2.c();
                    a2.d();
                    a2.e();
                }
            });
        }
    }

    private JSONObject a(AppInfoRequestModel appInfoRequestModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("96075ce0", new Object[]{this, appInfoRequestModel});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorInfo", (Object) appInfoRequestModel.errorInfo);
        jSONObject.put("buttonText", (Object) appInfoRequestModel.buttonText);
        jSONObject.put("buttonUrl", (Object) appInfoRequestModel.buttonUrl);
        jSONObject.put("errorLogo", (Object) appInfoRequestModel.errorLogo);
        jSONObject.put("errorSubInfo", (Object) appInfoRequestModel.errorSubInfo);
        String str = appInfoRequestModel.downgradeUrl;
        if (appInfoRequestModel.getExtendInfos() != null && !TextUtils.isEmpty(appInfoRequestModel.getExtendInfos().getString("downgradeUrl"))) {
            str = appInfoRequestModel.getExtendInfos().getString("downgradeUrl");
        }
        jSONObject.put("downgradeUrl", (Object) str);
        jSONObject.put("guideTip", (Object) appInfoRequestModel.guideTip);
        jSONObject.put("guideTipUrl", (Object) appInfoRequestModel.guideTipUrl);
        jSONObject.put("buttonType", (Object) appInfoRequestModel.buttonType);
        return jSONObject;
    }

    public void a(InterfaceC0946a interfaceC0946a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f2c7abb", new Object[]{this, interfaceC0946a});
        } else {
            this.b.add(interfaceC0946a);
        }
    }

    public void b(InterfaceC0946a interfaceC0946a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d05151a", new Object[]{this, interfaceC0946a});
        } else {
            this.b.remove(interfaceC0946a);
        }
    }

    public sfu a(com.taobao.themis.kernel.metaInfo.appinfo.core.requestConfig.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sfu) ipChange.ipc$dispatch("e950fb60", new Object[]{this, aVar});
        }
        IAppInfoRequestClient iAppInfoRequestClient = (IAppInfoRequestClient) qpt.b(IAppInfoRequestClient.class);
        if (iAppInfoRequestClient == null) {
            return new sfu(false).a("AI_CLIENT_EMPTY").b("AppInfoRequest client is empty!");
        }
        c<List<AppInfoRequestModel>, JSONObject> requestAppInfo = iAppInfoRequestClient.requestAppInfo(aVar);
        if (!requestAppInfo.f22556a || requestAppInfo.d.isEmpty()) {
            return new sfu(false).a(requestAppInfo.b).b(requestAppInfo.c).a(requestAppInfo.e);
        }
        ArrayList arrayList = new ArrayList();
        for (AppInfoRequestModel appInfoRequestModel : requestAppInfo.d) {
            if (TextUtils.isEmpty(appInfoRequestModel.errorCode)) {
                arrayList.add(appInfoRequestModel);
            }
        }
        if (aVar.b) {
            a(arrayList);
        }
        return new sfu(true).a(arrayList);
    }

    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        try {
            AppModel appModel = (AppModel) JSONObject.parseObject(str2, AppModel.class);
            if (appModel != null && str == appModel.getAppId()) {
                a().a(appModel);
            }
        } catch (Throwable th) {
            TMSLogger.a(TAG, th);
        }
    }
}
