package tb;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.support.v4.content.LocalBroadcastManager;
import android.taobao.windvane.jsbridge.q;
import com.alibaba.evo.EVO;
import com.alibaba.evo.internal.windvane.EVOApiPlugin;
import com.alibaba.ut.abtest.UTABMethod;
import com.alibaba.ut.abtest.UTABTest;
import com.alibaba.ut.abtest.VariationSet;
import com.alibaba.ut.abtest.event.EventType;
import com.alibaba.ut.abtest.internal.bucketing.c;
import com.alibaba.ut.abtest.internal.util.h;
import com.alibaba.ut.abtest.internal.util.j;
import com.alibaba.ut.abtest.internal.util.l;
import com.alibaba.ut.abtest.internal.util.p;
import com.alibaba.ut.abtest.internal.windvane.ABConfigDebuggerPlugin;
import com.alibaba.ut.abtest.internal.windvane.UTABTestApiPlugin;
import com.alibaba.ut.abtest.internal.windvane.UTABTestApiPluginV2;
import com.alibaba.ut.abtest.pipeline.accs.EvoAccsService;
import com.alibaba.ut.abtest.track.d;
import com.alibaba.ut.abtest.track.e;
import com.alipay.mobile.common.logging.util.perf.Constants;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.client.GlobalClientInfo;
import java.io.File;
import java.lang.reflect.Method;
import mtopsdk.mtop.stat.MtopMonitor;

/* loaded from: classes.dex */
public class bws {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private boolean f26150a = false;
    private volatile boolean b = false;
    private volatile boolean c = false;

    static {
        kge.a(-353521136);
    }

    public static /* synthetic */ void a(bws bwsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2920f5a", new Object[]{bwsVar});
        } else {
            bwsVar.d();
        }
    }

    public static /* synthetic */ boolean a(bws bwsVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6fb08ebe", new Object[]{bwsVar, new Boolean(z)})).booleanValue();
        }
        bwsVar.c = z;
        return z;
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.f26150a;
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.b;
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : b() && this.c;
    }

    public void a(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("258fda74", new Object[]{this, context, new Boolean(z)});
        } else if (this.f26150a) {
        } else {
            long uptimeMillis = SystemClock.uptimeMillis();
            h.e("EVOInitiator", "SDK第一阶段初始化开始。");
            cex a2 = cex.a();
            a2.a(context);
            a2.b();
            a(context);
            a2.j().a(context);
            boolean a3 = l.a(context);
            a2.b(z);
            a2.q().a(a3);
            c.a().b();
            this.f26150a = true;
            h.e("EVOInitiator", "一休启动第一阶段耗时（所有实验之前的初始化）: " + (SystemClock.uptimeMillis() - uptimeMillis) + "ms，是否是主进程：" + a3);
        }
    }

    private void a(Context context) {
        if (!new File("/data/local/tmp/.yixiu_test_sdk_open").exists()) {
            return;
        }
        try {
            if (!(context instanceof Application)) {
                return;
            }
            Method declaredMethod = Class.forName("com.alibaba.abtest_android_test.TestUTABTest").getDeclaredMethod("init", Application.class);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(null, (Application) context);
        } catch (Throwable unused) {
        }
    }

    public void a(Context context, com.alibaba.ut.abtest.c cVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e3de2c9", new Object[]{this, context, cVar, new Boolean(z)});
        } else if (this.b) {
            h.c("EVOInitiator", "SDK已初始化或正在进行中。");
        } else {
            long uptimeMillis = SystemClock.uptimeMillis();
            StringBuilder sb = new StringBuilder();
            sb.append("SDK第二阶段初始化开始。是否同步初始化：");
            sb.append(z ? "是" : "否");
            h.e("EVOInitiator", sb.toString());
            j.a(context, "context is null");
            j.a(cVar, "configuration is null");
            boolean a2 = l.a(context);
            if (!cex.a().g() && !a2) {
                h.e("EVOInitiator", "未开启多进程支持，只允许主进程初始化SDK。主进程：否，配置开启多进程支持：否");
                return;
            }
            cex.a().a(cVar.b());
            cex.a().a(cVar.a());
            cex.a().j().b(context);
            if (a2 || !cex.a().g()) {
                cex.a().o().a(EventType.ExperimentV5Data, new com.alibaba.evo.internal.event.c());
                cex.a().o().a(EventType.BetaExperimentV5Data, new com.alibaba.evo.internal.event.a());
                cex.a().o().a(EventType.User, new cev());
            }
            h.a("EVOInitiator", "当前环境：" + cex.a().t());
            try {
                com.alibaba.ut.abtest.internal.database.b.a();
                if (cVar.c() != null) {
                    cex.a().j().a(cVar.c());
                }
                cex.a().q().a(a2);
                if (a2 || !cex.a().g()) {
                    cex.a().a(cex.a().j().a());
                    if (!e.c()) {
                        d.b();
                    }
                    try {
                        com.ut.mini.module.trackerlistener.b.getInstance().registerListener(new bwu());
                    } catch (Throwable th) {
                        h.c("EVOInitiator", "UT页面生命周期监听注册失败，请升级ut-analytics>=6.5.8.26。", th);
                        com.alibaba.ut.abtest.internal.util.b.a("EVO.UTTrackerListenerRegister", th);
                    }
                    cep.a();
                    cex.a().h();
                }
                try {
                    MtopMonitor.addHeaderMonitor(new com.alibaba.ut.abtest.track.a());
                } catch (Throwable th2) {
                    if (a2) {
                        h.f("EVOInitiator", "初始化MTOP监听失败，不依赖无痕埋点功能请忽略。" + th2.getMessage());
                    } else {
                        h.e("EVOInitiator", "初始化MTOP监听失败，不依赖无痕埋点功能请忽略。" + th2.getMessage());
                    }
                }
                this.b = true;
                a(cVar, z, a2);
                h.e("EVOInitiator", "SDK第二阶段初始化耗时：" + (SystemClock.uptimeMillis() - uptimeMillis) + "ms");
            } catch (Throwable th3) {
                com.alibaba.ut.abtest.internal.util.b.a("EVO.ABDatabaseInit", th3);
                cex.a().j().a(true);
            }
        }
    }

    private void a(com.alibaba.ut.abtest.c cVar, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7935c23", new Object[]{this, cVar, new Boolean(z), new Boolean(z2)});
        } else if (z) {
            new b(cVar, z2).run();
        } else {
            p.a(new b(cVar, z2));
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final com.alibaba.ut.abtest.c b;
        private final boolean c;

        static {
            kge.a(2131267730);
            kge.a(-1390502639);
        }

        public b(com.alibaba.ut.abtest.c cVar, boolean z) {
            this.b = cVar;
            this.c = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            VariationSet activate;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            h.a("EVOInitiator", "开始后台初始化任务");
            cex.a().q().b(this.c);
            try {
                if (this.c || !cex.a().g()) {
                    cex.a().i().a();
                }
                if (!cex.a().m().a()) {
                    cex.a().a(UTABMethod.Pull);
                }
                q.a(UTABTestApiPlugin.API_NAME, (Class<? extends android.taobao.windvane.jsbridge.e>) UTABTestApiPlugin.class);
                q.a(UTABTestApiPluginV2.API_NAME, (Class<? extends android.taobao.windvane.jsbridge.e>) UTABTestApiPluginV2.class);
                q.a(EVOApiPlugin.API_NAME, (Class<? extends android.taobao.windvane.jsbridge.e>) EVOApiPlugin.class);
                q.a(ABConfigDebuggerPlugin.API_NAME, (Class<? extends android.taobao.windvane.jsbridge.e>) ABConfigDebuggerPlugin.class);
                bws.a(bws.this);
                bws.a(bws.this, true);
                a();
                if (this.c || !cex.a().g()) {
                    cex.a().i().a(true, "initialize");
                }
                h.e("EVOInitiator", "结束后台初始化任务");
                if (cex.a().j().j() && (activate = UTABTest.activate("Yixiu", "StabilityExperiment1")) != null) {
                    activate.size();
                }
                p.a(new a(), Constants.STARTUP_TIME_LEVEL_1);
            } catch (Throwable th) {
                try {
                    com.alibaba.ut.abtest.internal.util.b.a("EVO.BackgroundInit.run", th);
                } finally {
                    bws.a(bws.this, true);
                    p.a();
                }
            }
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            try {
                LocalBroadcastManager.getInstance(cex.a().c()).sendBroadcast(new Intent(EVO.ACTION_INITIALIZE_COMPLETE));
            } catch (Throwable th) {
                com.alibaba.ut.abtest.internal.util.b.a("EVO.BackgroundInit.notifyInitializeComplete", th);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(712706000);
            kge.a(-1390502639);
        }

        private a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            if (cex.a().d()) {
                h.a(cex.a().d());
            }
            cex.a().n();
            com.alibaba.ut.abtest.internal.util.b.b();
            com.alibaba.ut.abtest.internal.util.b.d();
            com.alibaba.ut.abtest.internal.util.b.a();
        }
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        try {
            h.e("EVOInitiator", "accs: registerDataListener");
            GlobalClientInfo.getInstance(cex.a().c()).registerService(EvoAccsService.SERVICE_ID, EvoAccsService.class.getName());
        } catch (Exception e) {
            com.alibaba.ut.abtest.internal.util.b.a("EVO.listenAccs", e);
        }
    }
}
