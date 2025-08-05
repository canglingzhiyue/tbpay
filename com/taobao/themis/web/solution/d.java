package com.taobao.themis.web.solution;

import android.os.SystemClock;
import android.taobao.windvane.extra.core.WVCore;
import android.taobao.windvane.extra.uc.WVUCWebView;
import android.webkit.ValueCallback;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.f;
import com.taobao.themis.kernel.launcher.step.TMSBaseLaunchStep;
import com.taobao.themis.kernel.utils.n;
import com.taobao.themis.kernel.utils.t;
import com.taobao.themis.kernel.utils.v;
import com.uc.webview.export.extension.U4Engine;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.kge;
import tb.qpp;
import tb.qpr;
import tb.ruk;

/* loaded from: classes9.dex */
public final class d extends TMSBaseLaunchStep {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;
    private static final AtomicBoolean d;

    /* loaded from: classes9.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ AtomicBoolean b;

        public b(AtomicBoolean atomicBoolean) {
            this.b = atomicBoolean;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Long mTraceId = d.this.o;
            q.b(mTraceId, "mTraceId");
            com.taobao.themis.kernel.utils.d.b("TMSWaitUCReadyStep#initUCCoreAsync", mTraceId.longValue(), null, 4, null);
            if (!this.b.compareAndSet(false, true)) {
                return;
            }
            d.a(d.this);
        }
    }

    @Override // com.taobao.themis.kernel.launcher.step.TMSBaseLaunchStep
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "TMSWaitUCReadyStep";
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

    public static final /* synthetic */ void a(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb289378", new Object[]{dVar});
        } else {
            dVar.c();
        }
    }

    /* loaded from: classes9.dex */
    public static final class a {
        static {
            kge.a(-1522919425);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    public d(f fVar, qpr qprVar, qpp qppVar) {
        super(fVar, qprVar, qppVar);
    }

    static {
        kge.a(1598117239);
        Companion = new a(null);
        d = new AtomicBoolean(false);
    }

    @Override // com.taobao.themis.kernel.launcher.step.TMSBaseLaunchStep
    public void d() {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        f mInstance = this.f22538a;
        q.b(mInstance, "mInstance");
        mInstance.D().a("TMS_waitUCReadyStep");
        WVCore wVCore = WVCore.getInstance();
        q.b(wVCore, "WVCore.getInstance()");
        boolean isUCStartInit = wVCore.isUCStartInit();
        Long mTraceId = this.o;
        q.b(mTraceId, "mTraceId");
        com.taobao.themis.kernel.utils.d.a("TMSWaitUCReadyStep#initUCCoreAsync", mTraceId.longValue(), (Pair) null, 4, (Object) null);
        if (!isUCStartInit && d.compareAndSet(false, true)) {
            long uptimeMillis = SystemClock.uptimeMillis();
            TMSLogger.a("TMSWaitUCReadyStep", " UC init compensation start");
            com.taobao.themis.kernel.utils.d dVar = com.taobao.themis.kernel.utils.d.INSTANCE;
            WVUCWebView.initUCCore();
            TMSLogger.a("TMSWaitUCReadyStep", " UC init compensation end, cost " + (SystemClock.uptimeMillis() - uptimeMillis) + "ms");
            WVCore wVCore2 = WVCore.getInstance();
            q.b(wVCore2, "WVCore.getInstance()");
            isUCStartInit = wVCore2.isUCStartInit();
        }
        f mInstance2 = this.f22538a;
        q.b(mInstance2, "mInstance");
        v a2 = t.a(mInstance2.o(), "enableAsyncLoadV2", "[0,19],[20,39]");
        q.b(a2, "TMSABTestUtils.getExperi…[0,19],[20,39]\"\n        )");
        if (!n.aS() || !a2.b()) {
            z = false;
        }
        f mInstance3 = this.f22538a;
        q.b(mInstance3, "mInstance");
        mInstance3.D().a("enableAsyncLoadGroup", a2.a());
        long aT = n.aT();
        TMSLogger.a("TMSWaitUCReadyStep", "isUCStartInit: " + isUCStartInit + ", enableAsyncLoad: " + z + ", timeout: " + aT);
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        final b bVar = new b(atomicBoolean);
        if (z && isUCStartInit) {
            U4Engine.addInitProcessCallback(new ValueCallback<Integer>() { // from class: com.taobao.themis.web.solution.TMSWaitUCReadyStep$onExecuting$2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* renamed from: com.taobao.themis.web.solution.TMSWaitUCReadyStep$onExecuting$2$1  reason: invalid class name */
                /* loaded from: classes9.dex */
                public static final class AnonymousClass1 extends Lambda implements ruk<kotlin.t> {
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    public AnonymousClass1() {
                        super(0);
                    }

                    @Override // tb.ruk
                    /* renamed from: invoke */
                    public /* bridge */ /* synthetic */ kotlin.t mo2427invoke() {
                        mo2427invoke();
                        return kotlin.t.INSTANCE;
                    }

                    @Override // tb.ruk
                    /* renamed from: invoke  reason: collision with other method in class */
                    public final void mo2427invoke() {
                        IpChange ipChange = $ipChange;
                        if (ipChange instanceof IpChange) {
                            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
                        } else {
                            bVar.run();
                        }
                    }
                }

                @Override // android.webkit.ValueCallback
                public final void onReceiveValue(Integer num) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("49891c23", new Object[]{this, num});
                    } else if (num == null) {
                    } else {
                        TMSLogger.a("TMSWaitUCReadyStep", "addInitProcessCallback " + num);
                        if (num.intValue() != 32 && num.intValue() != 64) {
                            return;
                        }
                        com.taobao.themis.kernel.utils.a.a(new AnonymousClass1());
                    }
                }
            });
            com.taobao.themis.kernel.utils.a.a(new TMSWaitUCReadyStep$onExecuting$3(atomicBoolean, bVar), aT);
            return;
        }
        bVar.run();
    }
}
