package tb;

import android.text.TextUtils;
import com.alibaba.ariver.resource.api.models.AppInfoScene;
import com.alibaba.ariver.resource.api.models.AppModel;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.e;
import com.taobao.themis.kernel.executor.ExecutorType;
import com.taobao.themis.kernel.executor.IExecutorService;
import com.taobao.themis.kernel.f;
import com.taobao.themis.kernel.launcher.step.TMSBaseLaunchStep;
import com.taobao.themis.kernel.logger.a;
import com.taobao.themis.kernel.metaInfo.TMSMetaInfoWrapper;
import com.taobao.themis.kernel.metaInfo.appinfo.AppInfoPrefetchJob;
import com.taobao.themis.kernel.metaInfo.appinfo.core.AppInfoStrategy;
import com.taobao.themis.kernel.metaInfo.appinfo.core.requestConfig.AbsAppInfoRequestConfig;
import com.taobao.themis.kernel.metaInfo.appinfo.core.requestConfig.b;
import kotlin.Pair;
import mtopsdk.mtop.util.ErrorConstant;

/* loaded from: classes9.dex */
public class tlm extends TMSBaseLaunchStep {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private volatile boolean d;
    private volatile boolean e;

    static {
        kge.a(-2117069657);
    }

    public static /* synthetic */ Object ipc$super(tlm tlmVar, String str, Object... objArr) {
        if (str.hashCode() == 92838762) {
            super.c();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.themis.kernel.launcher.step.TMSBaseLaunchStep
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "AppInfo";
    }

    @Override // com.taobao.themis.kernel.launcher.step.TMSBaseLaunchStep
    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
        }
    }

    @Override // com.taobao.themis.kernel.launcher.step.TMSBaseLaunchStep
    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
        }
    }

    public static /* synthetic */ e a(tlm tlmVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("414d5bc5", new Object[]{tlmVar, str, str2}) : tlmVar.a(str, str2);
    }

    public static /* synthetic */ void a(tlm tlmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8dc3", new Object[]{tlmVar});
        } else {
            tlmVar.h();
        }
    }

    public static /* synthetic */ void a(tlm tlmVar, AppModel appModel, AppInfoStrategy appInfoStrategy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75564a1", new Object[]{tlmVar, appModel, appInfoStrategy});
        } else {
            tlmVar.a(appModel, appInfoStrategy);
        }
    }

    public static /* synthetic */ void a(tlm tlmVar, e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a364f0a9", new Object[]{tlmVar, eVar});
        } else {
            tlmVar.a(eVar);
        }
    }

    public static /* synthetic */ void b(tlm tlmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef2e9444", new Object[]{tlmVar});
        } else {
            tlmVar.l();
        }
    }

    public static /* synthetic */ void b(tlm tlmVar, e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30051baa", new Object[]{tlmVar, eVar});
        } else {
            tlmVar.a(eVar);
        }
    }

    public static /* synthetic */ void c(tlm tlmVar, e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bca546ab", new Object[]{tlmVar, eVar});
        } else {
            tlmVar.a(eVar);
        }
    }

    public static /* synthetic */ void d(tlm tlmVar, e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("494571ac", new Object[]{tlmVar, eVar});
        } else {
            tlmVar.a(eVar);
        }
    }

    public tlm(f fVar, qpr qprVar, qpp qppVar) {
        super(fVar, qprVar, qppVar);
        this.d = false;
        this.e = false;
    }

    @Override // com.taobao.themis.kernel.launcher.step.TMSBaseLaunchStep
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (this.f22538a == null || this.f22538a.s()) {
        } else {
            f();
            g();
        }
    }

    private e a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("3a703c80", new Object[]{this, str, str2});
        }
        if (TextUtils.equals(str, ErrorConstant.ERRCODE_MTOP_APICALL_ASYNC_TIMEOUT)) {
            return new e("TMS_ERR_AI_TIMEOUT", "appInfo请求超时", "");
        }
        return new e(e.TMS_ERR_APPINFO_PREFIX + str, "appInfo mtop请求错误", "", str2, "居然偷偷跑掉了，咱以后不要理它了啦");
    }

    private void f() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        this.f22538a.k().a("appInfoStepStart");
        if (TextUtils.isEmpty(this.f22538a.h())) {
            TMSLogger.d("TMSAppInfoStep", "Don't need instance appInfo");
            h();
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("tag", (Object) "app|bundle");
        String str = this.c;
        a.a(a.MODULE_LAUNCH_APPINFO, a.EVENT_REQUEST, str, this.c + "_app", jSONObject);
        if (AppInfoPrefetchJob.hasPrefetchAppInfo(this.f22538a.h())) {
            TMSLogger.d("TMSAppInfoStep", "hasPrefetchAppInfo:" + this.f22538a.h());
            sfv appInfoSync = AppInfoPrefetchJob.getAppInfoSync(this.f22538a.h());
            if (appInfoSync != null && appInfoSync.c()) {
                AppModel a2 = appInfoSync.a();
                if (a2 != null) {
                    TMSLogger.d("TMSAppInfoStep", "命中极简链路预请求 appInfo 缓存:" + a2.getAppId());
                    TMSLogger.d("TMSAppInfoStep", "AppInfo success:[" + a2 + riy.ARRAY_END_STR);
                    this.f22538a.a(new TMSMetaInfoWrapper(a2));
                }
                a(a2, appInfoSync.b());
                h();
                return;
            }
        }
        if (AppInfoPrefetchJob.isNeedPrefetch(this.f22538a.h())) {
            TMSLogger.d("TMSAppInfoStep", "isNeedPrefetch:" + this.f22538a.h());
            ((IExecutorService) qpt.a(IExecutorService.class)).getExecutor(ExecutorType.URGENT).execute(new Runnable() { // from class: tb.tlm.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    sfv appInfoSync2 = AppInfoPrefetchJob.getAppInfoSync(tlm.this.f22538a.h());
                    if (appInfoSync2 == null) {
                        TMSLogger.d("TMSAppInfoStep", "AppInfo onError：null");
                        tlm.a(tlm.this, e.b);
                    } else if (!appInfoSync2.c()) {
                        TMSLogger.d("TMSAppInfoStep", "AppInfo onError, errorCode: " + appInfoSync2.d() + " ,errorMsg: " + appInfoSync2.e() + " ,errorInfo: " + appInfoSync2.f());
                        tlm tlmVar = tlm.this;
                        tlm.c(tlmVar, tlm.a(tlmVar, appInfoSync2.d(), appInfoSync2.e()));
                    } else {
                        AppModel a3 = appInfoSync2.a();
                        if (a3 != null) {
                            TMSLogger.d("TMSAppInfoStep", "命中极简链路预请求 appInfo 非缓存:" + a3.getAppId());
                            TMSLogger.d("TMSAppInfoStep", "AppInfo success:[" + a3 + riy.ARRAY_END_STR);
                            tlm.this.f22538a.a(new TMSMetaInfoWrapper(a3));
                        }
                        tlm.a(tlm.this, a3, appInfoSync2.b());
                        tlm.a(tlm.this);
                    }
                }
            });
            return;
        }
        AbsAppInfoRequestConfig.BasicRequestParam basicRequestParam = new AbsAppInfoRequestConfig.BasicRequestParam();
        basicRequestParam.appId = this.f22538a.h();
        if (!TextUtils.isEmpty(this.f22538a.q().getNBSVersion())) {
            basicRequestParam.version = this.f22538a.q().getNBSVersion();
        } else {
            basicRequestParam.version = "*";
        }
        basicRequestParam.url = this.f22538a.g();
        b bVar = new b(basicRequestParam);
        bVar.e = this.f22538a.q();
        bVar.f22551a = this.f22538a.q().getNBScene();
        if (bVar.f22551a != AppInfoScene.DEBUG && bVar.f22551a != AppInfoScene.TRIAL) {
            z = true;
        }
        bVar.b = z;
        com.taobao.themis.kernel.metaInfo.appinfo.a.a().a(bVar, z, new rne() { // from class: tb.tlm.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.rne
            public void a(AppModel appModel, AppInfoStrategy appInfoStrategy) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("c49f009c", new Object[]{this, appModel, appInfoStrategy});
                    return;
                }
                if (appModel != null) {
                    TMSLogger.d("TMSAppInfoStep", "AppInfo success:[" + appModel + riy.ARRAY_END_STR);
                }
                tlm.a(tlm.this, appModel, appInfoStrategy);
            }

            @Override // tb.rne
            public void a(String str2, String str3, JSONObject jSONObject2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f2bf4cf4", new Object[]{this, str2, str3, jSONObject2});
                    return;
                }
                TMSLogger.d("TMSAppInfoStep", "AppInfo onError：" + str2 + "_" + str3);
                tlm tlmVar = tlm.this;
                tlm.d(tlmVar, tlm.a(tlmVar, str2, str3));
            }
        });
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        com.taobao.themis.open.extension.a aVar = (com.taobao.themis.open.extension.a) this.f22538a.b(com.taobao.themis.open.extension.a.class);
        if (aVar == null) {
            TMSLogger.d("TMSAppInfoStep", "Don't need framework");
            l();
            return;
        }
        String a2 = aVar.a();
        if (TextUtils.isEmpty(a2)) {
            TMSLogger.d("TMSAppInfoStep", "Don't need framework");
            l();
            return;
        }
        a.a("Themis/Launch/" + a(), a.EVENT_REQUEST, this.c, this.c + "_framework", new JSONObject());
        AbsAppInfoRequestConfig.BasicRequestParam basicRequestParam = new AbsAppInfoRequestConfig.BasicRequestParam();
        basicRequestParam.appId = a2;
        b bVar = new b(basicRequestParam);
        bVar.e = null;
        bVar.f22551a = AppInfoScene.ONLINE;
        bVar.c = AbsAppInfoRequestConfig.AppInfoRequestScene.ASYNCLOAD;
        com.taobao.themis.kernel.metaInfo.appinfo.a.a().a(bVar, true, new rne() { // from class: tb.tlm.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.rne
            public void a(AppModel appModel, AppInfoStrategy appInfoStrategy) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("c49f009c", new Object[]{this, appModel, appInfoStrategy});
                    return;
                }
                TMSLogger.d("TMSAppInfoStep", "Framework AppInfo success");
                tlm.this.f22538a.b(new TMSMetaInfoWrapper(appModel));
                tlm.b(tlm.this);
            }

            @Override // tb.rne
            public void a(String str, String str2, JSONObject jSONObject) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f2bf4cf4", new Object[]{this, str, str2, jSONObject});
                    return;
                }
                TMSLogger.d("TMSAppInfoStep", "Framework AppInfo onError：" + str + "_" + str2);
                tlm tlmVar = tlm.this;
                tlm.b(tlmVar, tlm.a(tlmVar, str, str2));
            }
        });
    }

    private void a(AppModel appModel, AppInfoStrategy appInfoStrategy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c49f009c", new Object[]{this, appModel, appInfoStrategy});
            return;
        }
        this.f22538a.a(new TMSMetaInfoWrapper(appModel));
        this.f22538a.k().b("appInfoStrategy", appInfoStrategy.getName());
        String str = this.c;
        a.a(a.MODULE_LAUNCH_APPINFO, a.EVENT_RESPONSE, str, this.c + "_app", com.taobao.themis.kernel.utils.f.a(new Pair("expiredType", appInfoStrategy.getName()), new Pair("mainApp", new TMSMetaInfoWrapper(appModel).o())));
        h();
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        this.d = true;
        m();
    }

    private void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
            return;
        }
        this.e = true;
        m();
    }

    private void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
        } else if (!this.d || !this.e) {
        } else {
            c();
        }
    }

    @Override // com.taobao.themis.kernel.launcher.step.TMSBaseLaunchStep
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        this.f22538a.k().a("appInfoStepFinish");
        super.c();
        if (this.b == null) {
            return;
        }
        this.b.a();
    }
}
