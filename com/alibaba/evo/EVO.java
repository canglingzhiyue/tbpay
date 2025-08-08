package com.alibaba.evo;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.support.v4.content.LocalBroadcastManager;
import android.taobao.windvane.jsbridge.q;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.alibaba.evo.internal.windvane.EVOApiPlugin;
import com.alibaba.ut.abtest.UTABMethod;
import com.alibaba.ut.abtest.UTABTest;
import com.alibaba.ut.abtest.Variation;
import com.alibaba.ut.abtest.VariationSet;
import com.alibaba.ut.abtest.c;
import com.alibaba.ut.abtest.event.EventType;
import com.alibaba.ut.abtest.internal.bucketing.DefaultVariationSet;
import com.alibaba.ut.abtest.internal.util.h;
import com.alibaba.ut.abtest.internal.util.j;
import com.alibaba.ut.abtest.internal.util.l;
import com.alibaba.ut.abtest.internal.util.p;
import com.alibaba.ut.abtest.internal.windvane.UTABTestApiPlugin;
import com.alibaba.ut.abtest.internal.windvane.UTABTestApiPluginV2;
import com.alibaba.ut.abtest.pipeline.accs.EvoAccsService;
import com.alibaba.ut.abtest.track.d;
import com.alibaba.ut.abtest.track.e;
import com.alipay.mobile.common.logging.util.perf.Constants;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.NotificationStyle;
import com.taobao.accs.client.GlobalClientInfo;
import java.util.Map;
import mtopsdk.mtop.stat.MtopMonitor;
import tb.bws;
import tb.bwu;
import tb.cep;
import tb.cev;
import tb.cex;
import tb.kge;

/* loaded from: classes.dex */
public final class EVO {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_INITIALIZE_COMPLETE = "evo.intent.action.INITIALIZE_COMPLETE";
    private static final VariationSet EMPTY_VARIATION_SET;
    private static final String TAG = "EVO";
    public static bws sInitiator;

    public static /* synthetic */ void access$000(c cVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eae94720", new Object[]{cVar, new Boolean(z)});
        } else {
            preInit(cVar, z);
        }
    }

    static {
        kge.a(2132906444);
        sInitiator = new bws();
        EMPTY_VARIATION_SET = new DefaultVariationSet(new com.alibaba.ut.abtest.internal.bucketing.model.a());
    }

    public static bws getInitiator() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bws) ipChange.ipc$dispatch("21466c08", new Object[0]) : sInitiator;
    }

    @Deprecated
    public static c.a newConfigurationBuilder() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c.a) ipChange.ipc$dispatch("bc2b832a", new Object[0]) : new c.a();
    }

    public static boolean isPreInitialized() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6b513f06", new Object[0])).booleanValue() : sInitiator.b();
    }

    public static boolean isInitialized() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("18d112d5", new Object[0])).booleanValue() : sInitiator.c();
    }

    public static void initBeforeExperimentTask(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21917510", new Object[]{context});
            return;
        }
        try {
            initBeforeExperimentTask(context, false);
        } catch (Throwable th) {
            com.alibaba.ut.abtest.internal.util.b.a("EVO.initBeforeExperimentTask", th);
        }
    }

    public static void initBeforeExperimentTask(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("109ddfc4", new Object[]{context, new Boolean(z)});
        } else {
            sInitiator.a(context, z);
        }
    }

    @Deprecated
    public static synchronized void initializeSync(Context context, c cVar) {
        synchronized (EVO.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("47b4bbd5", new Object[]{context, cVar});
            } else {
                sInitiator.a(context, cVar, true);
            }
        }
    }

    public static synchronized void initializeAsync(Context context, c cVar) {
        synchronized (EVO.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2d511f96", new Object[]{context, cVar});
            } else {
                sInitiator.a(context, cVar, false);
            }
        }
    }

    private static void initializeInternal(Context context, c cVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca659f3d", new Object[]{context, cVar, new Boolean(z)});
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("SDK开始初始化。是否同步初始化：");
        sb.append(z ? "是" : "否");
        h.a(TAG, sb.toString());
        long nanoTime = System.nanoTime();
        j.a(context, "context is null");
        j.a(cVar, "configuration is null");
        boolean a2 = l.a(context);
        if (!cex.a().g() && !a2) {
            h.c(TAG, "未开启多进程支持，只允许主进程初始化SDK。主进程：否，配置开启多进程支持：否");
            return;
        }
        cex.a().a(context);
        cex.a().b();
        cex.a().a(cVar.b());
        cex.a().a(cVar.a());
        cex.a().j().b(context);
        if (a2 || !cex.a().g()) {
            cex.a().o().a(EventType.ExperimentV5Data, new com.alibaba.evo.internal.event.c());
            cex.a().o().a(EventType.BetaExperimentV5Data, new com.alibaba.evo.internal.event.a());
            cex.a().o().a(EventType.User, new cev());
        }
        h.a(TAG, "当前环境：" + cex.a().t());
        long currentTimeMillis = System.currentTimeMillis();
        if (cex.a().j().q()) {
            preInit(cVar, a2);
        }
        h.e("preInit", "preInit cost: " + (System.currentTimeMillis() - currentTimeMillis) + "ms");
        if (z) {
            new b(cVar, a2).run();
        } else {
            p.a(new b(cVar, a2));
        }
        h.e(TAG, "SDK初始化耗时：" + (System.nanoTime() - nanoTime) + NotificationStyle.NOTIFICATION_STYLE);
    }

    @Deprecated
    private static void preInit(c cVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ec57f43", new Object[]{cVar, new Boolean(z)});
            return;
        }
        try {
            com.alibaba.ut.abtest.internal.database.b.a();
            if (cVar.c() != null) {
                cex.a().j().a(cVar.c());
            }
            cex.a().q().a(z);
            if (z || !cex.a().g()) {
                cex.a().a(cex.a().j().a());
                if (!e.c()) {
                    d.b();
                }
                try {
                    com.ut.mini.module.trackerlistener.b.getInstance().registerListener(new bwu());
                } catch (Throwable th) {
                    h.c(TAG, "UT页面生命周期监听注册失败，请升级ut-analytics>=6.5.8.26。", th);
                    com.alibaba.ut.abtest.internal.util.b.a("EVO.UTTrackerListenerRegister", th);
                }
                cep.a();
                cex.a().h();
            }
            try {
                MtopMonitor.addHeaderMonitor(new com.alibaba.ut.abtest.track.a());
            } catch (Throwable th2) {
                if (z) {
                    h.f(TAG, "初始化MTOP监听失败，不依赖无痕埋点功能请忽略。" + th2.getMessage());
                    return;
                }
                h.e(TAG, "初始化MTOP监听失败，不依赖无痕埋点功能请忽略。" + th2.getMessage());
            }
        } catch (Throwable th3) {
            com.alibaba.ut.abtest.internal.util.b.a("EVO.ABDatabaseInit", th3);
            cex.a().j().a(true);
        }
    }

    /* loaded from: classes2.dex */
    public static class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final c f2920a;
        private final boolean b;

        static {
            kge.a(1440334166);
            kge.a(-1390502639);
        }

        public b(c cVar, boolean z) {
            this.f2920a = cVar;
            this.b = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            VariationSet activate;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            h.a(EVO.TAG, "开始后台初始化任务");
            if (!cex.a().j().q()) {
                EVO.access$000(this.f2920a, this.b);
            }
            cex.a().q().b(this.b);
            try {
                if (this.b || !cex.a().g()) {
                    cex.a().i().a();
                }
                if (!cex.a().m().a()) {
                    cex.a().a(UTABMethod.Pull);
                }
                q.a(UTABTestApiPlugin.API_NAME, (Class<? extends android.taobao.windvane.jsbridge.e>) UTABTestApiPlugin.class);
                q.a(UTABTestApiPluginV2.API_NAME, (Class<? extends android.taobao.windvane.jsbridge.e>) UTABTestApiPluginV2.class);
                q.a(EVOApiPlugin.API_NAME, (Class<? extends android.taobao.windvane.jsbridge.e>) EVOApiPlugin.class);
                GlobalClientInfo.getInstance(cex.a().c()).registerService(EvoAccsService.SERVICE_ID, EvoAccsService.class.getName());
                a();
                if (this.b || !cex.a().g()) {
                    cex.a().i().a(true, "initialize");
                }
                h.a(EVO.TAG, "结束后台初始化任务");
                if (cex.a().j().j() && (activate = UTABTest.activate("Yixiu", "StabilityExperiment1")) != null) {
                    activate.size();
                }
                p.a(new a(), Constants.STARTUP_TIME_LEVEL_1);
            } catch (Throwable th) {
                com.alibaba.ut.abtest.internal.util.b.a("EVO.BackgroundInit.run", th);
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
            kge.a(-145083764);
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

    /* JADX WARN: Removed duplicated region for block: B:51:0x0128 A[Catch: Throwable -> 0x01f9, TryCatch #0 {Throwable -> 0x01f9, blocks: (B:6:0x0020, B:9:0x002e, B:11:0x0036, B:13:0x0044, B:15:0x004f, B:17:0x005d, B:19:0x0066, B:21:0x006c, B:24:0x0074, B:26:0x007a, B:28:0x0088, B:30:0x0091, B:33:0x009c, B:35:0x00aa, B:37:0x00c2, B:43:0x0112, B:45:0x0118, B:51:0x0128, B:52:0x012a, B:56:0x0136, B:58:0x0140, B:60:0x0146, B:63:0x014d, B:74:0x01ea, B:64:0x016a, B:65:0x0180, B:67:0x018b, B:69:0x0191, B:72:0x0198, B:73:0x01c1, B:38:0x00cf, B:40:0x00d5, B:42:0x0106, B:41:0x00eb, B:76:0x01f0), top: B:81:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0140 A[Catch: Throwable -> 0x01f9, TryCatch #0 {Throwable -> 0x01f9, blocks: (B:6:0x0020, B:9:0x002e, B:11:0x0036, B:13:0x0044, B:15:0x004f, B:17:0x005d, B:19:0x0066, B:21:0x006c, B:24:0x0074, B:26:0x007a, B:28:0x0088, B:30:0x0091, B:33:0x009c, B:35:0x00aa, B:37:0x00c2, B:43:0x0112, B:45:0x0118, B:51:0x0128, B:52:0x012a, B:56:0x0136, B:58:0x0140, B:60:0x0146, B:63:0x014d, B:74:0x01ea, B:64:0x016a, B:65:0x0180, B:67:0x018b, B:69:0x0191, B:72:0x0198, B:73:0x01c1, B:38:0x00cf, B:40:0x00d5, B:42:0x0106, B:41:0x00eb, B:76:0x01f0), top: B:81:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0180 A[Catch: Throwable -> 0x01f9, TryCatch #0 {Throwable -> 0x01f9, blocks: (B:6:0x0020, B:9:0x002e, B:11:0x0036, B:13:0x0044, B:15:0x004f, B:17:0x005d, B:19:0x0066, B:21:0x006c, B:24:0x0074, B:26:0x007a, B:28:0x0088, B:30:0x0091, B:33:0x009c, B:35:0x00aa, B:37:0x00c2, B:43:0x0112, B:45:0x0118, B:51:0x0128, B:52:0x012a, B:56:0x0136, B:58:0x0140, B:60:0x0146, B:63:0x014d, B:74:0x01ea, B:64:0x016a, B:65:0x0180, B:67:0x018b, B:69:0x0191, B:72:0x0198, B:73:0x01c1, B:38:0x00cf, B:40:0x00d5, B:42:0x0106, B:41:0x00eb, B:76:0x01f0), top: B:81:0x0020 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.alibaba.ut.abtest.VariationSet activateSync(java.lang.String r11, java.lang.String r12, java.util.Map<java.lang.String, java.lang.Object> r13, java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 514
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.evo.EVO.activateSync(java.lang.String, java.lang.String, java.util.Map, java.lang.Object):com.alibaba.ut.abtest.VariationSet");
    }

    public static VariationSet activateSync(Context context, String str) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (VariationSet) ipChange.ipc$dispatch("b13b4d6c", new Object[]{context, str});
        }
        try {
            long nanoTime = System.nanoTime();
            if (!sInitiator.a()) {
                h.c(TAG, "activateSync方法调用，需要先调用 UTABTest.initBeforeExperimentTask(context, isMultiProcessEnable) 方法初始化SDK。");
                return EMPTY_VARIATION_SET;
            } else if (!cex.a().j().c()) {
                h.d(TAG, "【运行实验】一休已禁止使用。");
                return EMPTY_VARIATION_SET;
            } else if (StringUtils.isEmpty(str)) {
                h.d(TAG, "【运行实验】开关名传入为空！");
                return EMPTY_VARIATION_SET;
            } else {
                long uptimeMillis = SystemClock.uptimeMillis();
                VariationSet a2 = cex.a().q().a(str);
                h.a(TAG, "开关 " + str + " 分流耗时: " + (SystemClock.uptimeMillis() - uptimeMillis));
                if (a2 == null) {
                    a2 = EMPTY_VARIATION_SET;
                }
                if (a2.size() <= 0) {
                    z = false;
                }
                com.alibaba.ut.abtest.internal.util.b.a("switch", z, System.nanoTime() - nanoTime);
                h.g(TAG, "【运行实验】featureName=" + str + " cost=" + ((System.nanoTime() - nanoTime) / 1000000) + "ms Result=" + a2.toString());
                com.alibaba.ut.abtest.internal.util.b.b(com.alibaba.ut.abtest.internal.util.b.EXPERIMENT_ACTIVATE_COUNTER, "switch");
                return a2;
            }
        } catch (Throwable th) {
            com.alibaba.ut.abtest.internal.util.b.a("EVO.activateSync.Switch", th);
            return EMPTY_VARIATION_SET;
        }
    }

    public static boolean isSwitchOpened(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a94046c8", new Object[]{context, str})).booleanValue();
        }
        try {
            Variation variation = activateSync(context, str).getVariation(str);
            boolean equals = variation != null ? "true".equals(variation.getValueAsString(null)) : false;
            h.g(TAG, "【运行实验】开关 " + str + " 运行结果：" + equals);
            return equals;
        } catch (Throwable th) {
            com.alibaba.ut.abtest.internal.util.b.a("EVO.isSwitchOpened", th);
            return false;
        }
    }

    public static void activateServerAsync(String str, Map<String, Object> map, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56bc5eea", new Object[]{str, map, obj});
        } else if (cex.a().j().l()) {
            activateServerInternal(str, map, obj, false);
        } else {
            h.d(TAG, "【服务端实验】EVO.activateServerAsync已禁止使用，调用旧方法执行。");
            UTABTest.activateServer(str, obj);
        }
    }

    public static void activateServerSync(String str, Map<String, Object> map, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("431bb6bf", new Object[]{str, map, obj});
        } else if (cex.a().j().l()) {
            activateServerInternal(str, map, obj, true);
        } else {
            h.d(TAG, "【服务端实验】EVO.activateServerSync已禁止使用，调用旧方法执行。");
            UTABTest.activateServerSync(str, obj);
        }
    }

    private static void activateServerInternal(final String str, final Map<String, Object> map, final Object obj, boolean z) {
        IpChange ipChange = $ipChange;
        boolean z2 = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71452717", new Object[]{str, map, obj, new Boolean(z)});
            return;
        }
        try {
            long nanoTime = System.nanoTime();
            if (!cex.a().j().c()) {
                h.d(TAG, "【服务端实验】一休已禁止使用。");
            } else if (StringUtils.isEmpty(str)) {
                h.d(TAG, "【服务端实验】添加埋点规则失败，埋点规则不合法。");
            } else {
                if (z) {
                    cex.a().q().a(str, map, obj);
                } else {
                    p.a(new Runnable() { // from class: com.alibaba.evo.EVO.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            try {
                                cex.a().q().a(str, map, obj);
                            } catch (Throwable th) {
                                com.alibaba.ut.abtest.internal.util.b.a("EVO.activateServerInternal.Async", th);
                            }
                        }
                    });
                }
                long nanoTime2 = System.nanoTime();
                if (z) {
                    if (StringUtils.isEmpty(str)) {
                        z2 = false;
                    }
                    com.alibaba.ut.abtest.internal.util.b.a(com.alibaba.ut.abtest.internal.util.b.EXPERIMENT_ACTIVATE_STAT_TYPE_ACTIVATE_SERVER_SYNC, z2, nanoTime2 - nanoTime);
                } else {
                    if (StringUtils.isEmpty(str)) {
                        z2 = false;
                    }
                    com.alibaba.ut.abtest.internal.util.b.a(com.alibaba.ut.abtest.internal.util.b.EXPERIMENT_ACTIVATE_STAT_TYPE_ACTIVATE_SERVER, z2, nanoTime2 - nanoTime);
                }
                com.alibaba.ut.abtest.internal.util.b.b(com.alibaba.ut.abtest.internal.util.b.EXPERIMENT_ACTIVATE_COUNTER, com.alibaba.ut.abtest.internal.util.b.EXPERIMENT_ACTIVATE_STAT_TYPE_ACTIVATE_SERVER);
            }
        } catch (Throwable th) {
            com.alibaba.ut.abtest.internal.util.b.a("EVO.activateServerInternal", th);
        }
    }

    public static synchronized void updateUserAccount(String str, String str2) {
        synchronized (EVO.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("782de874", new Object[]{str, str2});
            } else if (!isPreInitialized()) {
                h.c(TAG, "updateUserAccount方法调用，需要先调用 initialize() 方法初始化SDK。");
            } else if (!StringUtils.equals(cex.a().r(), str2)) {
                h.b(TAG, "【登录信息】用户登录信息发生变化。用户ID: " + str2 + "，用户昵称: " + str + "，原用户ID：" + cex.a().r() + "，原用户昵称：" + cex.a().s());
                cex.a().a(str2);
                cex.a().b(str);
                com.alibaba.ut.abtest.event.e eVar = new com.alibaba.ut.abtest.event.e();
                eVar.a(str2);
                eVar.b(str);
                cex.a().o().a(new com.alibaba.ut.abtest.event.a(EventType.User, eVar));
            } else {
                h.b(TAG, "【登录信息】用户登录信息未发生变化。用户ID：" + str2 + ", 用户昵称：" + str);
            }
        }
    }

    public static void getExperimentsByDomainAsync(final String str, final Map<String, Object> map, final com.alibaba.evo.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76fd157e", new Object[]{str, map, bVar});
        } else {
            p.a(new Runnable() { // from class: com.alibaba.evo.EVO.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        if (StringUtils.isEmpty(str)) {
                            if (bVar == null) {
                                return;
                            }
                            new com.alibaba.evo.a(2001);
                        } else if (!EVO.isPreInitialized()) {
                            if (bVar != null) {
                                new com.alibaba.evo.a(2002);
                            }
                            h.c(EVO.TAG, "getExperimentsByDomainAsync方法调用，需要先调用 initialize() 方法初始化SDK。");
                        } else {
                            cex.a().q().a(str, map);
                            if (bVar == null) {
                            }
                        }
                    } catch (Throwable th) {
                        if (bVar != null) {
                            try {
                                new com.alibaba.evo.a(2000, Log.getStackTraceString(th));
                            } catch (Throwable unused) {
                                com.alibaba.ut.abtest.internal.util.b.a("EVO.getExperimentsByDomainAsync.onError", th);
                            }
                        }
                        com.alibaba.ut.abtest.internal.util.b.a("EVO.getExperimentsByDomainAsync", th);
                    }
                }
            });
        }
    }

    public static String getPageActivateTrackIds() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e23bd774", new Object[0]);
        }
        try {
            if (!isPreInitialized()) {
                h.c(TAG, "getPageActivateTrackIds方法调用，需要先调用 initialize() 方法初始化SDK。");
                return null;
            }
            return cex.a().k().a();
        } catch (Throwable th) {
            com.alibaba.ut.abtest.internal.util.b.a("EVO.getPageActivateTrackIds", th);
            return null;
        }
    }
}
