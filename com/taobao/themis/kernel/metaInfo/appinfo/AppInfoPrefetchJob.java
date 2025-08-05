package com.taobao.themis.kernel.metaInfo.appinfo;

import com.alibaba.ariver.resource.api.models.AppInfoScene;
import com.alibaba.ariver.resource.api.models.AppModel;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.metaInfo.appinfo.core.AppInfoStrategy;
import com.taobao.themis.kernel.metaInfo.appinfo.core.requestConfig.AbsAppInfoRequestConfig;
import com.taobao.themis.utils.o;
import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.q;
import kotlin.t;
import kotlin.text.n;
import tb.kge;
import tb.rne;
import tb.sfv;

/* loaded from: classes9.dex */
public final class AppInfoPrefetchJob implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final AppInfoPrefetchJob INSTANCE;
    private static final String TAG = "AppInfoPrefetchJob";
    private static final Map<String, sfv> sAppInfoMap;
    private static final Map<String, CountDownLatch> sAppInfoSyncLockMap;

    static {
        kge.a(-1160986057);
        kge.a(1028243835);
        INSTANCE = new AppInfoPrefetchJob();
        sAppInfoMap = new ConcurrentHashMap(2);
        sAppInfoSyncLockMap = new ConcurrentHashMap(2);
    }

    private AppInfoPrefetchJob() {
    }

    public static final /* synthetic */ Map access$getSAppInfoMap$p(AppInfoPrefetchJob appInfoPrefetchJob) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("e927eaaa", new Object[]{appInfoPrefetchJob}) : sAppInfoMap;
    }

    public static final /* synthetic */ Map access$getSAppInfoSyncLockMap$p(AppInfoPrefetchJob appInfoPrefetchJob) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("a627a9e4", new Object[]{appInfoPrefetchJob}) : sAppInfoSyncLockMap;
    }

    public static /* synthetic */ void prefetchAppInfo$default(String str, String str2, boolean z, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("738577fb", new Object[]{str, str2, new Boolean(z), new Integer(i), obj});
            return;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        prefetchAppInfo(str, str2, z);
    }

    @JvmStatic
    public static final void prefetchAppInfo(String appId, String url, boolean z) {
        com.taobao.themis.kernel.metaInfo.appinfo.core.requestConfig.b prepareAppInfoRequestConfig;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94827ea1", new Object[]{appId, url, new Boolean(z)});
            return;
        }
        q.d(appId, "appId");
        q.d(url, "url");
        Map<String, String> a2 = o.a(url);
        if (a2 == null) {
            TMSLogger.d(TAG, "url解析失败");
            return;
        }
        sAppInfoSyncLockMap.put(appId, new CountDownLatch(1));
        sAppInfoMap.remove(appId);
        if (z) {
            prepareAppInfoRequestConfig = INSTANCE.prepareFrameworkRequestConfig(appId);
        } else {
            prepareAppInfoRequestConfig = INSTANCE.prepareAppInfoRequestConfig(appId, url, a2);
        }
        com.taobao.themis.kernel.metaInfo.appinfo.a.a().a(prepareAppInfoRequestConfig, true, new a(appId));
    }

    /* loaded from: classes9.dex */
    public static final class a implements rne {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public final /* synthetic */ String f22543a;

        public a(String str) {
            this.f22543a = str;
        }

        @Override // tb.rne
        public void a(AppModel appModel, AppInfoStrategy appInfoStrategy) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c49f009c", new Object[]{this, appModel, appInfoStrategy});
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("appInfo load success, strategy: ");
            sb.append(appInfoStrategy != null ? appInfoStrategy.name() : null);
            TMSLogger.d(AppInfoPrefetchJob.TAG, sb.toString());
            Map access$getSAppInfoMap$p = AppInfoPrefetchJob.access$getSAppInfoMap$p(AppInfoPrefetchJob.INSTANCE);
            String str = this.f22543a;
            sfv sfvVar = new sfv(true);
            sfvVar.a(appModel);
            sfvVar.a(appInfoStrategy);
            t tVar = t.INSTANCE;
            access$getSAppInfoMap$p.put(str, sfvVar);
            CountDownLatch countDownLatch = (CountDownLatch) AppInfoPrefetchJob.access$getSAppInfoSyncLockMap$p(AppInfoPrefetchJob.INSTANCE).get(this.f22543a);
            if (countDownLatch != null) {
                countDownLatch.countDown();
            }
            AppInfoPrefetchJob.access$getSAppInfoSyncLockMap$p(AppInfoPrefetchJob.INSTANCE).remove(this.f22543a);
        }

        @Override // tb.rne
        public void a(String str, String str2, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f2bf4cf4", new Object[]{this, str, str2, jSONObject});
                return;
            }
            Map access$getSAppInfoMap$p = AppInfoPrefetchJob.access$getSAppInfoMap$p(AppInfoPrefetchJob.INSTANCE);
            String str3 = this.f22543a;
            sfv sfvVar = new sfv(false);
            sfvVar.a(str);
            sfvVar.b(str2);
            sfvVar.a(jSONObject);
            t tVar = t.INSTANCE;
            access$getSAppInfoMap$p.put(str3, sfvVar);
            TMSLogger.d(AppInfoPrefetchJob.TAG, "appInfo on Error, timestamp: " + System.currentTimeMillis() + " \n errorCode: " + str + ", errorMsg: " + str2 + ", extInfo: " + jSONObject);
            CountDownLatch countDownLatch = (CountDownLatch) AppInfoPrefetchJob.access$getSAppInfoSyncLockMap$p(AppInfoPrefetchJob.INSTANCE).get(this.f22543a);
            if (countDownLatch != null) {
                countDownLatch.countDown();
            }
            AppInfoPrefetchJob.access$getSAppInfoSyncLockMap$p(AppInfoPrefetchJob.INSTANCE).remove(this.f22543a);
        }
    }

    @JvmStatic
    public static final sfv getAppInfoSync(String appId) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sfv) ipChange.ipc$dispatch("32bc7ebe", new Object[]{appId});
        }
        q.d(appId, "appId");
        TMSLogger.a(TAG, "getAppInfoSync " + appId + " start");
        String str = "getAppInfoSync " + appId + " start";
        if (sAppInfoMap.get(appId) != null) {
            TMSLogger.a(TAG, "getAppInfoSync " + appId + " finish");
            String str2 = "getAppInfoSync " + appId + " finish";
            return sAppInfoMap.get(appId);
        }
        try {
            CountDownLatch countDownLatch = sAppInfoSyncLockMap.get(appId);
            if (countDownLatch != null) {
                countDownLatch.await();
            }
        } catch (Throwable th) {
            TMSLogger.b(TAG, "getAppInfoSync error: " + th.getMessage(), th);
        }
        TMSLogger.a(TAG, "getAppInfoSync finish");
        return sAppInfoMap.get(appId);
    }

    @JvmStatic
    public static final boolean isNeedPrefetch(String appId) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9199024c", new Object[]{appId})).booleanValue();
        }
        q.d(appId, "appId");
        return sAppInfoSyncLockMap.containsKey(appId);
    }

    @JvmStatic
    public static final boolean hasPrefetchAppInfo(String appId) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7f772293", new Object[]{appId})).booleanValue();
        }
        q.d(appId, "appId");
        return sAppInfoMap.get(appId) != null;
    }

    private final com.taobao.themis.kernel.metaInfo.appinfo.core.requestConfig.b prepareAppInfoRequestConfig(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (com.taobao.themis.kernel.metaInfo.appinfo.core.requestConfig.b) ipChange.ipc$dispatch("49e71e50", new Object[]{this, str, str2, map});
        }
        AbsAppInfoRequestConfig.BasicRequestParam basicRequestParam = new AbsAppInfoRequestConfig.BasicRequestParam();
        basicRequestParam.appId = str;
        String nBSVersion = INSTANCE.getNBSVersion(map);
        if (nBSVersion == null) {
            nBSVersion = "*";
        }
        basicRequestParam.version = nBSVersion;
        basicRequestParam.url = str2;
        com.taobao.themis.kernel.metaInfo.appinfo.core.requestConfig.b bVar = new com.taobao.themis.kernel.metaInfo.appinfo.core.requestConfig.b(basicRequestParam);
        bVar.c = AbsAppInfoRequestConfig.AppInfoRequestScene.SYNCLOAD;
        bVar.f22551a = INSTANCE.getNBScene(map);
        if (bVar.f22551a == AppInfoScene.DEBUG || bVar.f22551a == AppInfoScene.TRIAL) {
            z = false;
        }
        bVar.b = z;
        return bVar;
    }

    private final com.taobao.themis.kernel.metaInfo.appinfo.core.requestConfig.b prepareFrameworkRequestConfig(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.themis.kernel.metaInfo.appinfo.core.requestConfig.b) ipChange.ipc$dispatch("d340486", new Object[]{this, str});
        }
        AbsAppInfoRequestConfig.BasicRequestParam basicRequestParam = new AbsAppInfoRequestConfig.BasicRequestParam();
        basicRequestParam.appId = str;
        com.taobao.themis.kernel.metaInfo.appinfo.core.requestConfig.b bVar = new com.taobao.themis.kernel.metaInfo.appinfo.core.requestConfig.b(basicRequestParam);
        bVar.b = true;
        bVar.c = AbsAppInfoRequestConfig.AppInfoRequestScene.SYNCLOAD;
        bVar.f22551a = AppInfoScene.ONLINE;
        return bVar;
    }

    private final AppInfoScene getNBScene(Map<String, String> map) {
        AppInfoScene[] values;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AppInfoScene) ipChange.ipc$dispatch("2b1f233e", new Object[]{this, map});
        }
        String str = map.get("nbsn");
        String str2 = str;
        if (str2 == null || str2.length() == 0) {
            return AppInfoScene.ONLINE;
        }
        for (AppInfoScene appInfoScene : AppInfoScene.values()) {
            if (n.a(appInfoScene.name(), str, true)) {
                return appInfoScene;
            }
        }
        return AppInfoScene.DEBUG;
    }

    private final String getNBSVersion(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c13ef351", new Object[]{this, map}) : map.get("nbsv");
    }
}
