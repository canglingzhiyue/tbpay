package com.taobao.themis.kernel.extension.page;

import com.alipay.android.msp.constants.MspGlobalDefine;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.extension.page.d;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.kernel.solution.TMSSolutionType;
import tb.kge;
import tb.qpm;
import tb.qpu;
import tb.qqc;
import tb.tei;

/* loaded from: classes9.dex */
public final class a implements d {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final C0943a Companion;

    /* renamed from: a  reason: collision with root package name */
    private final kotlin.d f22512a;
    private final ITMSPage b;

    static {
        kge.a(1288768031);
        kge.a(-174109849);
        Companion = new C0943a(null);
    }

    private final com.taobao.monitor.procedure.g e() {
        IpChange ipChange = $ipChange;
        return (com.taobao.monitor.procedure.g) (ipChange instanceof IpChange ? ipChange.ipc$dispatch("256f8016", new Object[]{this}) : this.f22512a.getValue());
    }

    @Override // com.taobao.themis.kernel.extension.page.g
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        }
    }

    @Override // com.taobao.themis.kernel.extension.page.g
    public void c_(ITMSPage page) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f4ed18e", new Object[]{this, page});
        } else {
            kotlin.jvm.internal.q.d(page, "page");
        }
    }

    public a(ITMSPage page) {
        kotlin.jvm.internal.q.d(page, "page");
        this.b = page;
        this.f22512a = kotlin.e.a(new AppAPMPageExtension$mProcedure$2(this));
    }

    public final ITMSPage d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ITMSPage) ipChange.ipc$dispatch("7f0e0b36", new Object[]{this}) : this.b;
    }

    @Override // com.taobao.themis.kernel.extension.page.g
    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
        } else {
            d.a.a(this);
        }
    }

    @Override // com.taobao.themis.kernel.extension.page.d
    public void a() {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        com.taobao.monitor.procedure.g e = e();
        if (e == null) {
            return;
        }
        com.taobao.monitor.procedure.s sVar = com.taobao.monitor.procedure.s.f18233a;
        kotlin.jvm.internal.q.b(sVar, "ProcedureManagerProxy.PROXY");
        com.taobao.monitor.procedure.g d = sVar.d();
        kotlin.jvm.internal.q.b(d, "ProcedureManagerProxy.PROXY.launcherProcedure");
        try {
            qpm f = this.b.f();
            String str3 = null;
            if ((f != null ? f.getCurrentActivity() : null) != null) {
                qpm f2 = this.b.f();
                a(e, "enableAsyncInitTask", com.taobao.themis.kernel.utils.t.b(f2 != null ? f2.getCurrentActivity() : null, "enableAsyncInitTask").a());
                qpm f3 = this.b.f();
                a(e, "enableAsyncExecuteTask", com.taobao.themis.kernel.utils.t.b(f3 != null ? f3.getCurrentActivity() : null, "enableAsyncExecuteTask").a());
                qpm f4 = this.b.f();
                a(e, "pauseAndRestartInitTask", com.taobao.themis.kernel.utils.t.b(f4 != null ? f4.getCurrentActivity() : null, "pauseAndRestartInitTask").a());
                qpm f5 = this.b.f();
                a(e, "postDelayInitWeexV2", com.taobao.themis.kernel.utils.t.c(f5 != null ? f5.getCurrentActivity() : null, "postDelayInitWeexV2").a());
                qpm f6 = this.b.f();
                a(e, "initTaskExecutorV2", com.taobao.themis.kernel.utils.t.b(f6 != null ? f6.getCurrentActivity() : null, "initTaskExecutorV2").a());
                a(e, "enablePreCreateWebview", com.taobao.themis.kernel.utils.t.f(this.b.b().o()).a());
                String valueOf = String.valueOf(com.taobao.themis.kernel.utils.c.a(this.b.b().o()));
                a(e, "TMS_globalContainerOptimization", valueOf);
                a(d, "TMS_globalContainerOptimization", valueOf);
            }
            e.a("isThemis", "true");
            e.a("tmsSDKVersion", "1.1");
            e.a("tmsAppId", this.b.b().h());
            e.a("uniAppId", this.b.b().e());
            if (!com.taobao.themis.kernel.utils.o.f(this.b.b())) {
                e.a("tmsBizType", "default");
            } else {
                e.a("tmsBizType", MspGlobalDefine.TINY_APP);
            }
            TMSSolutionType type = TMSSolutionType.getType(this.b.b());
            if (type != null) {
                str3 = type.name();
            }
            e.a("tmsSolutionType", str3);
            e.a("tmsHomePage", Boolean.valueOf(qqc.a(this.b)));
            e.a("tmsRenderType", this.b.o());
            String c = this.b.b().k().c("isTMSTBFragmentContainer");
            if (c != null) {
                if (c.length() > 0) {
                    e.a("isTMSTBFragmentContainer", "true");
                }
            }
            qpu k = this.b.b().k();
            kotlin.jvm.internal.q.b(k, "page.getInstance().launchMonitorData");
            if (qqc.a(this.b)) {
                a(e, "tmsEarlyInitTime", String.valueOf(com.taobao.themis.utils.f.a(com.taobao.themis.kernel.utils.t.b.get())));
                a(e, "tmsNecessaryInitTime", String.valueOf(com.taobao.themis.utils.f.a(com.taobao.themis.kernel.utils.t.c.get())));
                a(e, "tmsIDLInitTime", String.valueOf(com.taobao.themis.utils.f.a(com.taobao.themis.kernel.utils.t.d.get())));
                a(e, "tmsForegroundTime", String.valueOf(com.taobao.themis.utils.f.a(com.taobao.themis.kernel.utils.t.e.get())));
                a(e, "tmsResumedTime", String.valueOf(com.taobao.themis.utils.f.a(com.taobao.themis.kernel.utils.t.f.get())));
            }
            if (k.f("recycledActivity") != null) {
                e.a("recycledActivity", Boolean.valueOf(com.taobao.themis.utils.f.g(k.f("recycledActivity"))));
            }
            if (qqc.a(this.b)) {
                long j = -1;
                long j2 = -1;
                if (k.b("containerOnCreate")) {
                    j = com.taobao.themis.utils.f.c(k.c("containerOnCreate"));
                }
                if (k.b("containerStart")) {
                    j2 = com.taobao.themis.utils.f.c(k.c("containerStart"));
                }
                str2 = "ProcedureManagerProxy.PROXY";
                long j3 = j2;
                str = "Canvas_FirstFrameTime";
                if (j3 - j > 10) {
                    e.a("tmsInitCompleted", (Object) false);
                } else {
                    e.a("tmsInitCompleted", (Object) true);
                }
                if (k.b("containerStart")) {
                    e.a("TINYAPP_pageStart", j3);
                    e.a("TMS_appStart", j3);
                }
                if (k.b("firstPageRenderStart")) {
                    e.a("TMS_renderStart", com.taobao.themis.utils.f.c(k.c("firstPageRenderStart")));
                }
                if (k.b("appInfoStepStart")) {
                    e.a("TMS_appInfoStart", com.taobao.themis.utils.f.c(k.c("appInfoStepStart")));
                }
                if (k.b("appInfoStepFinish")) {
                    e.a("TMS_appInfoFinish", com.taobao.themis.utils.f.c(k.c("appInfoStepFinish")));
                }
                if (k.f("appInfoStrategy") != null) {
                    e.a("tmsAppInfoStrategy", k.f("appInfoStrategy"));
                }
                if (k.b("containerOnCreate")) {
                    e.a("TINYAPP_containerOnCreate", com.taobao.themis.utils.f.c(k.c("containerOnCreate")));
                    e.a("TMS_containerOnCreate", com.taobao.themis.utils.f.c(k.c("containerOnCreate")));
                }
            } else {
                str = "Canvas_FirstFrameTime";
                str2 = "ProcedureManagerProxy.PROXY";
            }
            if (k.b("remoteGfxFromNetwork")) {
                e.a("TMS_gfxLoadFromNetwork", k.c("remoteGfxFromNetwork"));
                com.taobao.monitor.procedure.s sVar2 = com.taobao.monitor.procedure.s.f18233a;
                kotlin.jvm.internal.q.b(sVar2, str2);
                sVar2.d().a("TMS_gfxLoadFromNetwork", k.c("remoteGfxFromNetwork"));
            }
            if (k.b("remoteGfxLoadTime")) {
                e.a("TMS_gfxLoadSpeedTime", k.c("remoteGfxLoadTime"));
                com.taobao.monitor.procedure.s sVar3 = com.taobao.monitor.procedure.s.f18233a;
                kotlin.jvm.internal.q.b(sVar3, str2);
                sVar3.d().a("TMS_gfxLoadSpeedTime", k.c("remoteGfxLoadTime"));
            }
            if (k.b("Canvas_finishLoad")) {
                long c2 = com.taobao.themis.utils.f.c(k.c("Canvas_finishLoad"));
                a(e, "Canvas_finishLoad", c2);
                a(d, "Canvas_finishLoad", c2);
            }
            String str4 = str;
            if (k.b(str4)) {
                long c3 = com.taobao.themis.utils.f.c(k.c(str4));
                a(e, str4, c3);
                a(d, str4, c3);
            }
            if (!com.taobao.themis.kernel.utils.n.aU()) {
                return;
            }
            tei D = this.b.b().D();
            D.a(new AppAPMPageExtension$commitPageAPM$$inlined$apply$lambda$1(e));
            D.b(new AppAPMPageExtension$commitPageAPM$$inlined$apply$lambda$2(D, e));
        } catch (Exception e2) {
            TMSLogger.b("APMPageExtension", e2.getMessage(), e2);
        }
    }

    private final void a(com.taobao.monitor.procedure.g gVar, String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45c5db66", new Object[]{this, gVar, str, new Long(j)});
        } else {
            gVar.a(str, j);
        }
    }

    private final void a(com.taobao.monitor.procedure.g gVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40455d68", new Object[]{this, gVar, str, str2});
        } else {
            gVar.a(str, str2);
        }
    }

    @Override // com.taobao.themis.kernel.extension.page.d
    public com.taobao.monitor.procedure.g b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.monitor.procedure.g) ipChange.ipc$dispatch("c8b1d6f9", new Object[]{this}) : e();
    }

    /* renamed from: com.taobao.themis.kernel.extension.page.a$a  reason: collision with other inner class name */
    /* loaded from: classes9.dex */
    public static final class C0943a {
        static {
            kge.a(-1345447257);
        }

        private C0943a() {
        }

        public /* synthetic */ C0943a(kotlin.jvm.internal.o oVar) {
            this();
        }
    }
}
