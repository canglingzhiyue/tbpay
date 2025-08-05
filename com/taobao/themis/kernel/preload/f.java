package com.taobao.themis.kernel.preload;

import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.executor.ExecutorType;
import com.taobao.themis.kernel.executor.IExecutorService;
import com.taobao.themis.kernel.metaInfo.manifest.AppManifest;
import com.taobao.themis.kernel.metaInfo.manifest.AppManifestManager;
import com.taobao.themis.kernel.metaInfo.manifest.storage.AppManifestDao;
import com.taobao.themis.kernel.utils.i;
import com.taobao.themis.kernel.utils.n;
import com.taobao.zcache.Error;
import com.taobao.zcache.PackUpdateFinishedCallback;
import com.taobao.zcache.ResourceRequest;
import com.taobao.zcache.ResourceResponse;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Result;
import kotlin.jvm.internal.q;
import kotlin.t;
import kotlin.text.d;
import tb.kge;
import tb.qpt;

/* loaded from: classes9.dex */
public final class f {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final f INSTANCE;
    public static final String TAG = "UniAppZCacheListener";

    /* loaded from: classes9.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f22566a;

        public b(String str) {
            this.f22566a = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Object m2371constructorimpl;
            String bC;
            String str;
            ResourceResponse a2;
            Error error;
            Error error2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                Result.a aVar = Result.Companion;
                bC = n.INSTANCE.bC();
                str = null;
                if (!(!kotlin.text.n.a((CharSequence) bC))) {
                    bC = null;
                }
                if (bC == null) {
                    bC = i.a(i.INSTANCE, this.f22566a, false, 2, null);
                }
                a2 = com.taobao.zcache.n.a(new ResourceRequest(bC));
            } catch (Throwable th) {
                Result.a aVar2 = Result.Companion;
                m2371constructorimpl = Result.m2371constructorimpl(kotlin.i.a(th));
            }
            if (a2 != null && a2.getError() == null) {
                byte[] data = a2.getData();
                q.b(data, "response.data");
                AppManifest appManifest = (AppManifest) JSON.parseObject(new String(data, d.UTF_8), AppManifest.class);
                if (appManifest == null) {
                    f fVar = f.INSTANCE;
                    TMSLogger.d(f.TAG, "parse manifest failed");
                    return;
                } else if (!AppManifestManager.INSTANCE.a(appManifest)) {
                    TMSLogger.d(f.TAG, "manifest is not valid");
                    return;
                } else {
                    if (f.a(f.INSTANCE, appManifest)) {
                        AppManifestDao appManifestDao = new AppManifestDao();
                        AppManifest.AppInfo appInfo = appManifest.getAppInfo();
                        q.a(appInfo);
                        appManifestDao.setAppId(appInfo.getAppId());
                        AppManifest.AppInfo appInfo2 = appManifest.getAppInfo();
                        q.a(appInfo2);
                        appManifestDao.setVersion(appInfo2.getVersion());
                        appManifestDao.setAppManifest(appManifest);
                        appManifestDao.setLastRequestTimeStamp(System.currentTimeMillis());
                        TMSLogger.b(f.TAG, "save manifest id[" + appManifestDao.getAppId() + "], version[" + appManifestDao.getVersion() + ']');
                        AppManifestManager.INSTANCE.b(appManifestDao);
                    }
                    m2371constructorimpl = Result.m2371constructorimpl(t.INSTANCE);
                    Throwable m2374exceptionOrNullimpl = Result.m2374exceptionOrNullimpl(m2371constructorimpl);
                    if (m2374exceptionOrNullimpl == null) {
                        return;
                    }
                    TMSLogger.a(f.TAG, m2374exceptionOrNullimpl);
                    return;
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("get zCache failed, url:[");
            sb.append(bC);
            sb.append("],errorCode:[");
            sb.append((a2 == null || (error2 = a2.getError()) == null) ? null : Integer.valueOf(error2.getCode()));
            sb.append("],errorMsg:[");
            if (a2 != null && (error = a2.getError()) != null) {
                str = error.getMessage();
            }
            sb.append(str);
            sb.append(']');
            TMSLogger.d(f.TAG, sb.toString());
        }
    }

    static {
        kge.a(599324559);
        INSTANCE = new f();
    }

    private f() {
    }

    public static final /* synthetic */ void a(f fVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ae6627d", new Object[]{fVar, str});
        } else {
            fVar.a(str);
        }
    }

    public static final /* synthetic */ boolean a(f fVar, AppManifest appManifest) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("217624b6", new Object[]{fVar, appManifest})).booleanValue() : fVar.a(appManifest);
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            com.taobao.zcache.n.a("uniapp_*", a.INSTANCE);
        }
    }

    /* loaded from: classes9.dex */
    public static final class a implements PackUpdateFinishedCallback {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final a INSTANCE = new a();

        @Override // com.taobao.zcache.PackUpdateFinishedCallback
        public final void finish(String packName, Error error) {
            Object m2371constructorimpl;
            String b;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("abd8ffc9", new Object[]{this, packName, error});
            } else if (error != null) {
            } else {
                try {
                    Result.a aVar = Result.Companion;
                    q.b(packName, "packName");
                    b = kotlin.text.n.b(packName, "uniapp_", "");
                    if (!(!kotlin.text.n.a((CharSequence) b))) {
                        b = null;
                    }
                } catch (Throwable th) {
                    Result.a aVar2 = Result.Companion;
                    m2371constructorimpl = Result.m2371constructorimpl(kotlin.i.a(th));
                }
                if (b == null) {
                    return;
                }
                f.a(f.INSTANCE, b);
                m2371constructorimpl = Result.m2371constructorimpl(t.INSTANCE);
                Throwable m2374exceptionOrNullimpl = Result.m2374exceptionOrNullimpl(m2371constructorimpl);
                if (m2374exceptionOrNullimpl == null) {
                    return;
                }
                TMSLogger.a(f.TAG, m2374exceptionOrNullimpl);
            }
        }
    }

    private final void a(String str) {
        Executor executor;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (!n.INSTANCE.am()) {
        } else {
            TMSLogger.b(TAG, "try updateManifestFromZCache appId[" + str + ']');
            IExecutorService iExecutorService = (IExecutorService) qpt.b(IExecutorService.class);
            if (iExecutorService == null || (executor = iExecutorService.getExecutor(ExecutorType.MANIFEST)) == null) {
                return;
            }
            executor.execute(new b(str));
        }
    }

    private final boolean a(AppManifest appManifest) {
        String version;
        AppManifest.AppInfo appInfo;
        String appId;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("21ae1eab", new Object[]{this, appManifest})).booleanValue();
        }
        AppManifest.AppInfo appInfo2 = appManifest.getAppInfo();
        if (appInfo2 != null && (version = appInfo2.getVersion()) != null && (appInfo = appManifest.getAppInfo()) != null && (appId = appInfo.getAppId()) != null) {
            List b2 = kotlin.text.n.b((CharSequence) AppManifestManager.INSTANCE.c(appId), new String[]{","}, false, 0, 6, (Object) null);
            if (b2.contains(version)) {
                TMSLogger.d(TAG, "version[" + version + "] hit deprecatedVersion[" + b2 + "], skip save");
                return false;
            }
            AppManifestDao a2 = AppManifestManager.INSTANCE.a(appId, AppManifestManager.RequestMode.UPDATE);
            if (a2 == null) {
                return true;
            }
            if (com.taobao.themis.utils.f.a(version, a2.getVersion()) == 0) {
                AppManifestManager.INSTANCE.a(a2);
            }
            if (com.taobao.themis.utils.f.a(version, a2.getVersion()) > 0) {
                return true;
            }
        }
        return false;
    }
}
