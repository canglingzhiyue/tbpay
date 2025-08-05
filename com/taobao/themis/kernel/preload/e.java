package com.taobao.themis.kernel.preload;

import android.app.Application;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.adapter.IConfigAdapter;
import com.taobao.themis.kernel.adapter.IEnvironmentService;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.executor.ExecutorType;
import com.taobao.themis.kernel.executor.IExecutorService;
import com.taobao.themis.kernel.metaInfo.manifest.AppManifestManager;
import com.taobao.themis.kernel.metaInfo.manifest.storage.AppManifestDao;
import com.taobao.themis.kernel.utils.n;
import com.taobao.themis.utils.j;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.Result;
import kotlin.i;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.kge;
import tb.qpt;
import tb.qpv;
import tb.sgt;

/* loaded from: classes9.dex */
public final class e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final e INSTANCE;
    public static final String TAG = "TopAppManifestListener";

    /* loaded from: classes9.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f22565a;

        public b(String str) {
            this.f22565a = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Object m2371constructorimpl;
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            TMSLogger.d(e.TAG, "start execute");
            try {
                Result.a aVar = Result.Companion;
            } catch (Throwable th) {
                Result.a aVar2 = Result.Companion;
                m2371constructorimpl = Result.m2371constructorimpl(i.a(th));
            }
            if (!e.a(e.INSTANCE, this.f22565a)) {
                return;
            }
            IConfigAdapter iConfigAdapter = (IConfigAdapter) qpt.b(IConfigAdapter.class);
            List<ManifestPushInfo> parseArray = JSON.parseArray(iConfigAdapter != null ? iConfigAdapter.getCustomConfig("uniapp_manifest_push_info", "{}") : null, ManifestPushInfo.class);
            if (parseArray == null) {
                e eVar = e.INSTANCE;
                TMSLogger.d(e.TAG, "parse file failed");
                return;
            }
            TMSLogger.b(e.TAG, "get push info successfully. size:" + parseArray.size());
            Map<String, AppManifestDao> a2 = AppManifestManager.INSTANCE.a(n.al());
            for (ManifestPushInfo manifestPushInfo : parseArray) {
                if (manifestPushInfo.getAppId() != null && manifestPushInfo.getVersion() != null) {
                    if (e.a(e.INSTANCE, manifestPushInfo, a2)) {
                        TMSLogger.b(e.TAG, "try update manifest. id:" + manifestPushInfo.getAppId());
                        boolean cd = n.INSTANCE.cd();
                        TMSLogger.d(e.TAG, "is usePreloadUrl " + cd);
                        AppManifestManager appManifestManager = AppManifestManager.INSTANCE;
                        String appId = manifestPushInfo.getAppId();
                        q.a((Object) appId);
                        sgt.b a3 = appManifestManager.a(appId, (JSONObject) null, AppManifestManager.RequestMode.UPDATE, cd);
                        if (!a3.a() || a3.b() == null) {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put((JSONObject) "id", manifestPushInfo.getAppId());
                            jSONObject.put((JSONObject) "msg", a3.d());
                            t tVar = t.INSTANCE;
                            qpv.a("ManifestPushError", "update error", jSONObject);
                            str = "update manifest failed. id:" + manifestPushInfo.getAppId() + ", message: " + a3.d();
                        } else {
                            str = "update manifest success. id:" + manifestPushInfo.getAppId();
                        }
                        TMSLogger.b(e.TAG, str);
                    }
                }
                qpv.a("ManifestPushError", "empty info", (JSONObject) null, 4, (Object) null);
            }
            e.c(e.INSTANCE, this.f22565a);
            m2371constructorimpl = Result.m2371constructorimpl(t.INSTANCE);
            Throwable m2374exceptionOrNullimpl = Result.m2374exceptionOrNullimpl(m2371constructorimpl);
            if (m2374exceptionOrNullimpl == null) {
                return;
            }
            String message = m2374exceptionOrNullimpl.getMessage();
            if (message == null) {
                message = "unknownError";
            }
            qpv.a("ManifestPushError", message, (JSONObject) null, 4, (Object) null);
            TMSLogger.a(e.TAG, m2374exceptionOrNullimpl);
        }
    }

    static {
        kge.a(-1656704431);
        INSTANCE = new e();
    }

    private e() {
    }

    public static final /* synthetic */ boolean a(e eVar, ManifestPushInfo manifestPushInfo, Map map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("18f20915", new Object[]{eVar, manifestPushInfo, map})).booleanValue() : eVar.a(manifestPushInfo, map);
    }

    public static final /* synthetic */ boolean a(e eVar, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e460a7e2", new Object[]{eVar, str})).booleanValue() : eVar.a(str);
    }

    public static final /* synthetic */ void b(e eVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f516749f", new Object[]{eVar, str});
        } else {
            eVar.c(str);
        }
    }

    public static final /* synthetic */ void c(e eVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cc4160", new Object[]{eVar, str});
        } else {
            eVar.b(str);
        }
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        TMSLogger.b(TAG, "register TopAppManifestListener");
        IConfigAdapter iConfigAdapter = (IConfigAdapter) qpt.b(IConfigAdapter.class);
        if (iConfigAdapter == null) {
            return;
        }
        iConfigAdapter.registerListener("uniapp_manifest_push_info", a.INSTANCE);
    }

    /* loaded from: classes9.dex */
    public static final class a implements IConfigAdapter.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final a INSTANCE = new a();

        @Override // com.taobao.themis.kernel.adapter.IConfigAdapter.a
        public final void a(Map<String, String> map) {
            Object m2371constructorimpl;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
                return;
            }
            TMSLogger.b(e.TAG, "on uniapp_manifest_push_info update");
            try {
                Result.a aVar = Result.Companion;
            } catch (Throwable th) {
                Result.a aVar2 = Result.Companion;
                m2371constructorimpl = Result.m2371constructorimpl(i.a(th));
            }
            if (!n.INSTANCE.s()) {
                return;
            }
            e.b(e.INSTANCE, map.get("configVersion"));
            m2371constructorimpl = Result.m2371constructorimpl(t.INSTANCE);
            Throwable m2374exceptionOrNullimpl = Result.m2374exceptionOrNullimpl(m2371constructorimpl);
            if (m2374exceptionOrNullimpl == null) {
                return;
            }
            TMSLogger.a(e.TAG, m2374exceptionOrNullimpl);
        }
    }

    private final boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        TMSLogger.b(TAG, "try check config update");
        String str2 = str;
        if (str2 == null || kotlin.text.n.a((CharSequence) str2)) {
            TMSLogger.d(TAG, "newConfigVersion is null, skip update");
            return false;
        }
        Object a2 = qpt.a(IEnvironmentService.class);
        q.b(a2, "TMSAdapterManager.getNot…nmentService::class.java)");
        Application applicationContext = ((IEnvironmentService) a2).getApplicationContext();
        q.b(applicationContext, "TMSAdapterManager.getNot….java).applicationContext");
        String b2 = j.b(applicationContext, "uniapp_manifest_push_info_config_version", "");
        TMSLogger.b(TAG, "localConfigVersion: " + b2 + ", newConfigVersion : " + str);
        String str3 = b2;
        if (!(str3 == null || kotlin.text.n.a((CharSequence) str3)) && !(!q.a((Object) str, (Object) b2))) {
            return false;
        }
        TMSLogger.b(TAG, "config need update");
        return true;
    }

    private final void b(String str) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        String str2 = str;
        if (str2 != null && !kotlin.text.n.a((CharSequence) str2)) {
            z = false;
        }
        if (z) {
            return;
        }
        Object a2 = qpt.a(IEnvironmentService.class);
        q.b(a2, "TMSAdapterManager.getNot…nmentService::class.java)");
        Application applicationContext = ((IEnvironmentService) a2).getApplicationContext();
        q.b(applicationContext, "TMSAdapterManager.getNot….java).applicationContext");
        j.a(applicationContext, "uniapp_manifest_push_info_config_version", str);
    }

    private final void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
            return;
        }
        TMSLogger.b(TAG, "try updateManifest");
        IExecutorService iExecutorService = (IExecutorService) qpt.b(IExecutorService.class);
        Executor executor = iExecutorService != null ? iExecutorService.getExecutor(ExecutorType.MANIFEST) : null;
        int bY = n.INSTANCE.bY();
        TMSLogger.d(TAG, "get shuffle time config：" + bY + ' ');
        int nextInt = new Random().nextInt(bY + 1);
        TMSLogger.d(TAG, "get this scheduleTime：" + nextInt + " , do schedule");
        if (executor instanceof ScheduledExecutorService) {
            ((ScheduledExecutorService) executor).schedule(new b(str), nextInt, TimeUnit.SECONDS);
        } else {
            TMSLogger.d(TAG, "cannot find executor");
        }
    }

    private final boolean a(ManifestPushInfo manifestPushInfo, Map<String, AppManifestDao> map) {
        AppManifestDao a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aa063569", new Object[]{this, manifestPushInfo, map})).booleanValue();
        }
        TMSLogger.b(TAG, "check need update. id:" + manifestPushInfo.getAppId() + ", version:" + manifestPushInfo.getVersion() + ", priority:" + manifestPushInfo.getPriority());
        if (manifestPushInfo.getPriority() == 0 || (map != null && map.containsKey(manifestPushInfo.getAppId()))) {
            if (map == null || (a2 = map.get(manifestPushInfo.getAppId())) == null || a2 == null) {
                AppManifestManager appManifestManager = AppManifestManager.INSTANCE;
                String appId = manifestPushInfo.getAppId();
                q.a((Object) appId);
                a2 = appManifestManager.a(appId, AppManifestManager.RequestMode.UPDATE);
            }
            if (a2 == null) {
                return true;
            }
            if (com.taobao.themis.utils.f.a(manifestPushInfo.getVersion(), a2.getVersion()) > 0) {
                TMSLogger.b(TAG, "local manifest version : " + a2.getVersion());
                return true;
            }
            TMSLogger.b(TAG, "don't need update. id:" + manifestPushInfo.getAppId());
            AppManifestManager.INSTANCE.a(a2);
        }
        return false;
    }
}
