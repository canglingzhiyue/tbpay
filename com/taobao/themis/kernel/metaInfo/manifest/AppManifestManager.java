package com.taobao.themis.kernel.metaInfo.manifest;

import android.app.Application;
import android.net.Uri;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.adapter.IEnvironmentService;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.executor.ExecutorType;
import com.taobao.themis.kernel.executor.IExecutorService;
import com.taobao.themis.kernel.metaInfo.TMSMetaInfoWrapper;
import com.taobao.themis.kernel.metaInfo.manifest.AppManifest;
import com.taobao.themis.kernel.metaInfo.manifest.storage.AppManifestDao;
import com.taobao.themis.kernel.utils.i;
import com.taobao.themis.kernel.utils.n;
import com.taobao.themis.utils.j;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.Executor;
import kotlin.Result;
import kotlin.collections.ai;
import kotlin.collections.p;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.kge;
import tb.qpt;
import tb.rwf;
import tb.sgt;
import tb.tnh;
import tb.tni;

/* loaded from: classes9.dex */
public final class AppManifestManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final AppManifestManager INSTANCE;
    public static final String TAG = "AppManifestManager";

    /* loaded from: classes9.dex */
    public enum RequestMode {
        LAUNCH,
        UPDATE
    }

    /* loaded from: classes9.dex */
    public interface a {
        void a(sgt.b bVar);
    }

    /* loaded from: classes9.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f22553a;
        public final /* synthetic */ JSONObject b;
        public final /* synthetic */ RequestMode c;
        public final /* synthetic */ a d;

        public b(String str, JSONObject jSONObject, RequestMode requestMode, a aVar) {
            this.f22553a = str;
            this.b = jSONObject;
            this.c = requestMode;
            this.d = aVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.d.a(AppManifestManager.INSTANCE.a(this.f22553a, this.b, this.c));
            }
        }
    }

    static {
        kge.a(669967389);
        INSTANCE = new AppManifestManager();
    }

    private AppManifestManager() {
    }

    public final AppManifestDao a(i.a aVar) {
        String d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AppManifestDao) ipChange.ipc$dispatch("bbe98c66", new Object[]{this, aVar});
        }
        if (aVar == null || aVar.h() || aVar.i()) {
            return null;
        }
        if (n.bx() && (d = aVar.d()) != null && kotlin.text.n.b((CharSequence) d, (CharSequence) "manifest_preset", false, 2, (Object) null)) {
            try {
                Result.a aVar2 = Result.Companion;
                String queryParameter = Uri.parse(d).getQueryParameter("manifest_preset");
                if (queryParameter != null) {
                    q.b(queryParameter, "uri.getQueryParameter(\"m…st_preset\") ?: return@let");
                    tnh tnhVar = tnh.INSTANCE;
                    String b2 = aVar.b();
                    q.a((Object) b2);
                    String d2 = aVar.d();
                    q.a((Object) d2);
                    AppManifest a2 = tnhVar.a(new tni(queryParameter, b2, d2));
                    if (a2 == null) {
                        Result.m2371constructorimpl(t.INSTANCE);
                    } else {
                        TMSMetaInfoWrapper tMSMetaInfoWrapper = new TMSMetaInfoWrapper(a2, aVar);
                        AppManifestDao appManifestDao = new AppManifestDao();
                        appManifestDao.setAppId(tMSMetaInfoWrapper.a());
                        appManifestDao.setVersion(tMSMetaInfoWrapper.b());
                        appManifestDao.setAppManifest(a2);
                        appManifestDao.setLastRequestTimeStamp(System.currentTimeMillis());
                        appManifestDao.setLastUsedTimeStamp(System.currentTimeMillis());
                        TMSLogger.a(TAG, "loadLocalManifest success, preset: " + queryParameter);
                        return appManifestDao;
                    }
                }
            } catch (Throwable th) {
                Result.a aVar3 = Result.Companion;
                Result.m2371constructorimpl(kotlin.i.a(th));
            }
        }
        String b3 = aVar.b();
        if (b3 == null) {
            return null;
        }
        return INSTANCE.a(b3, RequestMode.LAUNCH);
    }

    public final AppManifestDao a(String id, RequestMode requestMode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AppManifestDao) ipChange.ipc$dispatch("d2cb24df", new Object[]{this, id, requestMode});
        }
        q.d(id, "id");
        q.d(requestMode, "requestMode");
        AppManifestDao a2 = com.taobao.themis.kernel.metaInfo.manifest.storage.a.INSTANCE.a(id);
        AppManifestDao appManifestDao = null;
        if (a2 != null && INSTANCE.c(a2)) {
            appManifestDao = a2;
        }
        if (appManifestDao != null && requestMode == RequestMode.LAUNCH) {
            appManifestDao.setLastUsedTimeStamp(System.currentTimeMillis());
            INSTANCE.b(appManifestDao);
        }
        return appManifestDao;
    }

    public final void a(AppManifestDao manifest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2004a43", new Object[]{this, manifest});
            return;
        }
        q.d(manifest, "manifest");
        manifest.setLastRequestTimeStamp(System.currentTimeMillis());
        b(manifest);
    }

    private final boolean c(AppManifestDao appManifestDao) {
        Date b2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("695b405", new Object[]{this, appManifestDao})).booleanValue();
        }
        if ((appManifestDao != null ? appManifestDao.getAppManifest() : null) == null) {
            return false;
        }
        AppManifest appManifest = appManifestDao.getAppManifest();
        q.a(appManifest);
        Cache cache = appManifest.getCache();
        if (cache == null) {
            return true;
        }
        String expires = cache.getExpires();
        return (expires == null || (b2 = INSTANCE.b(expires)) == null || !new Date().after(b2)) && System.currentTimeMillis() - appManifestDao.getLastRequestTimeStamp() < cache.getMaxAge() * ((long) 1000);
    }

    public final long d(AppManifestDao manifestDao) {
        Cache cache;
        Date b2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("88e068d4", new Object[]{this, manifestDao})).longValue();
        }
        q.d(manifestDao, "manifestDao");
        long j = Long.MAX_VALUE;
        AppManifest appManifest = manifestDao.getAppManifest();
        if (appManifest == null || (cache = appManifest.getCache()) == null) {
            return Long.MAX_VALUE;
        }
        String expires = cache.getExpires();
        if (expires != null && (b2 = INSTANCE.b(expires)) != null) {
            j = b2.getTime() - new Date().getTime();
        }
        return rwf.b(j, (cache.getMaxAge() * 1000) - (System.currentTimeMillis() - manifestDao.getLastRequestTimeStamp()));
    }

    private final Date b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Date) ipChange.ipc$dispatch("89599b64", new Object[]{this, str});
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss z", Locale.ENGLISH);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        try {
            Result.a aVar = Result.Companion;
            return simpleDateFormat.parse(str);
        } catch (Throwable th) {
            Result.a aVar2 = Result.Companion;
            Throwable m2374exceptionOrNullimpl = Result.m2374exceptionOrNullimpl(Result.m2371constructorimpl(kotlin.i.a(th)));
            if (m2374exceptionOrNullimpl == null) {
                return null;
            }
            TMSLogger.a(TAG, m2374exceptionOrNullimpl);
            return null;
        }
    }

    public final sgt.b a(String url, JSONObject jSONObject, RequestMode requestMode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sgt.b) ipChange.ipc$dispatch("13b116f0", new Object[]{this, url, jSONObject, requestMode});
        }
        q.d(url, "url");
        q.d(requestMode, "requestMode");
        TMSLogger.b(TAG, "request manifest with url: " + url);
        sgt.b b2 = new sgt().b(url, jSONObject);
        if (b2.a() && b2.b() != null && !kotlin.text.n.b(url, i.MANIFEST_PRE_URL, false, 2, (Object) null)) {
            AppManifest b3 = b2.b();
            AppManifestDao appManifestDao = new AppManifestDao();
            q.a(b3);
            AppManifest.AppInfo appInfo = b3.getAppInfo();
            q.a(appInfo);
            appManifestDao.setAppId(appInfo.getAppId());
            AppManifest.AppInfo appInfo2 = b3.getAppInfo();
            q.a(appInfo2);
            appManifestDao.setVersion(appInfo2.getVersion());
            appManifestDao.setAppManifest(b3);
            appManifestDao.setLastRequestTimeStamp(System.currentTimeMillis());
            if (requestMode == RequestMode.LAUNCH) {
                appManifestDao.setLastUsedTimeStamp(System.currentTimeMillis());
            }
            b(appManifestDao);
        }
        return b2;
    }

    public final void a(String url, JSONObject jSONObject, RequestMode requestMode, a callback) {
        Executor executor;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("732bcaf", new Object[]{this, url, jSONObject, requestMode, callback});
            return;
        }
        q.d(url, "url");
        q.d(requestMode, "requestMode");
        q.d(callback, "callback");
        IExecutorService iExecutorService = (IExecutorService) qpt.b(IExecutorService.class);
        if (iExecutorService == null || (executor = iExecutorService.getExecutor(ExecutorType.NETWORK)) == null) {
            return;
        }
        executor.execute(new b(url, jSONObject, requestMode, callback));
    }

    public final sgt.b a(String id, JSONObject jSONObject, RequestMode requestMode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sgt.b) ipChange.ipc$dispatch("7a1ec20c", new Object[]{this, id, jSONObject, requestMode, new Boolean(z)});
        }
        q.d(id, "id");
        q.d(requestMode, "requestMode");
        TMSLogger.b(TAG, "request manifest with id: " + id);
        sgt.b a2 = new sgt().a(id, jSONObject, z);
        if (a2.a() && a2.b() != null) {
            AppManifest b2 = a2.b();
            AppManifestDao appManifestDao = new AppManifestDao();
            q.a(b2);
            AppManifest.AppInfo appInfo = b2.getAppInfo();
            q.a(appInfo);
            appManifestDao.setAppId(appInfo.getAppId());
            AppManifest.AppInfo appInfo2 = b2.getAppInfo();
            q.a(appInfo2);
            appManifestDao.setVersion(appInfo2.getVersion());
            appManifestDao.setAppManifest(b2);
            appManifestDao.setLastRequestTimeStamp(System.currentTimeMillis());
            if (requestMode == RequestMode.LAUNCH) {
                appManifestDao.setLastUsedTimeStamp(System.currentTimeMillis());
            }
            b(appManifestDao);
        }
        return a2;
    }

    public final void b(AppManifestDao manifest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("844aff22", new Object[]{this, manifest});
            return;
        }
        q.d(manifest, "manifest");
        com.taobao.themis.kernel.metaInfo.manifest.storage.a.INSTANCE.a(manifest);
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            com.taobao.themis.kernel.metaInfo.manifest.storage.a.INSTANCE.a(p.a());
        }
    }

    public final void a(String id) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, id});
            return;
        }
        q.d(id, "id");
        com.taobao.themis.kernel.metaInfo.manifest.storage.a.INSTANCE.b(id);
    }

    public final Map<String, AppManifestDao> a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("35efba90", new Object[]{this, new Integer(i)});
        }
        try {
            Result.a aVar = Result.Companion;
            List<AppManifestDao> a2 = com.taobao.themis.kernel.metaInfo.manifest.storage.a.INSTANCE.a(System.currentTimeMillis() - (i * 1000));
            if (a2 == null) {
                return null;
            }
            List<AppManifestDao> list = a2;
            LinkedHashMap linkedHashMap = new LinkedHashMap(rwf.c(ai.a(p.a((Iterable) list, 10)), 16));
            for (Object obj : list) {
                String appId = ((AppManifestDao) obj).getAppId();
                q.a((Object) appId);
                linkedHashMap.put(appId, obj);
            }
            return linkedHashMap;
        } catch (Throwable th) {
            Result.a aVar2 = Result.Companion;
            Throwable m2374exceptionOrNullimpl = Result.m2374exceptionOrNullimpl(Result.m2371constructorimpl(kotlin.i.a(th)));
            if (m2374exceptionOrNullimpl != null) {
                TMSLogger.a("tag", m2374exceptionOrNullimpl);
            }
            return null;
        }
    }

    public final void a(String appId, String str) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, appId, str});
            return;
        }
        q.d(appId, "appId");
        IEnvironmentService iEnvironmentService = (IEnvironmentService) qpt.b(IEnvironmentService.class);
        Application applicationContext = iEnvironmentService != null ? iEnvironmentService.getApplicationContext() : null;
        String str2 = str;
        if (str2 == null || kotlin.text.n.a((CharSequence) str2)) {
            z = true;
        }
        if (z) {
            if (!(!kotlin.text.n.a((CharSequence) c(appId)))) {
                return;
            }
            j.a(applicationContext, d(appId));
            return;
        }
        j.a(applicationContext, d(appId), str);
    }

    public final String c(String appId) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b82f346c", new Object[]{this, appId});
        }
        q.d(appId, "appId");
        IEnvironmentService iEnvironmentService = (IEnvironmentService) qpt.b(IEnvironmentService.class);
        String b2 = j.b(iEnvironmentService != null ? iEnvironmentService.getApplicationContext() : null, d(appId), "");
        q.b(b2, "TMSSPUtils.readString(co…catedCacheKey(appId), \"\")");
        return b2;
    }

    private final String d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f4d254b", new Object[]{this, str});
        }
        return "deprecated_ver_" + str;
    }

    public final boolean a(AppManifest manifest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("21ae1eab", new Object[]{this, manifest})).booleanValue();
        }
        q.d(manifest, "manifest");
        AppManifest.AppInfo appInfo = manifest.getAppInfo();
        String str = null;
        String appId = appInfo != null ? appInfo.getAppId() : null;
        if (!(appId == null || kotlin.text.n.a((CharSequence) appId))) {
            AppManifest.AppInfo appInfo2 = manifest.getAppInfo();
            String version = appInfo2 != null ? appInfo2.getVersion() : null;
            if (!(version == null || kotlin.text.n.a((CharSequence) version))) {
                AppManifest.AppInfo appInfo3 = manifest.getAppInfo();
                if (appInfo3 != null) {
                    str = appInfo3.getName();
                }
                String str2 = str;
                return !(str2 == null || kotlin.text.n.a((CharSequence) str2)) && manifest.getContainer() != null;
            }
        }
        return false;
    }
}
