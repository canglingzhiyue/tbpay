package com.taobao.analysis;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import mtopsdk.common.util.StringUtils;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.util.ALog;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.flow.DayFlowReport;
import com.taobao.analysis.flow.c;
import com.taobao.analysis.flow.e;
import com.taobao.analysis.flow.f;
import com.taobao.analysis.fulltrace.FullTraceAnalysis;
import com.taobao.analysis.fulltrace.NWFullTracePlugin;
import com.taobao.analysis.monitor.JankContinuousMonitor;
import com.taobao.analysis.scene.SceneIdentifier;
import com.taobao.analysis.v3.i;
import com.taobao.analysis.v3.v;
import com.taobao.android.behavir.config.BHRTaskConfigBase;
import com.taobao.application.common.a;
import com.taobao.application.common.d;
import com.taobao.orange.OrangeConfig;
import com.taobao.orange.g;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import tb.dir;

/* loaded from: classes.dex */
public class FlowCenter {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final long DEFAULT_REPORT_INTERVAL = 300000;
    private static final int DEFAULT_THREAD_NUM = 2;
    private static final String FALCO_GROUP = "falco";
    private static final String TAG = "falco.FlowCenter";
    private static final String WEBVIEW_URL_EXTRA = "URL_REFERER_ORIGIN";
    private static volatile FlowCenter flowCenter;
    private static final AtomicInteger integer = new AtomicInteger(0);
    public static volatile boolean isMainProcess;
    private String curPageActivityName;
    private String curPageWebviewUrl;
    private boolean isBackground = false;
    public final a innerListener = new a();
    private AtomicBoolean isApmInited = new AtomicBoolean(false);
    private ScheduledThreadPoolExecutor scheduleThreadPoolExecutor = new ScheduledThreadPoolExecutor(2, new ThreadFactory() { // from class: com.taobao.analysis.FlowCenter.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
            }
            int andIncrement = FlowCenter.access$100().getAndIncrement();
            return new Thread(runnable, "FLOWCENTER:" + andIncrement);
        }
    });

    public static /* synthetic */ AtomicInteger access$100() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicInteger) ipChange.ipc$dispatch("64f15fa2", new Object[0]) : integer;
    }

    public static /* synthetic */ void access$200(FlowCenter flowCenter2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e8fde85", new Object[]{flowCenter2});
        } else {
            flowCenter2.tryCommitStatFlow();
        }
    }

    public static /* synthetic */ boolean access$300(FlowCenter flowCenter2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4790d5ca", new Object[]{flowCenter2})).booleanValue() : flowCenter2.checkApmInitStatus();
    }

    public static /* synthetic */ String access$400(FlowCenter flowCenter2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7ed8f679", new Object[]{flowCenter2}) : flowCenter2.curPageActivityName;
    }

    public static /* synthetic */ String access$402(FlowCenter flowCenter2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("31ab5f6d", new Object[]{flowCenter2, str});
        }
        flowCenter2.curPageActivityName = str;
        return str;
    }

    public static /* synthetic */ boolean access$500(FlowCenter flowCenter2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d992c44c", new Object[]{flowCenter2})).booleanValue() : flowCenter2.isBackground;
    }

    public static /* synthetic */ void access$600(FlowCenter flowCenter2, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9880ac5f", new Object[]{flowCenter2, context});
        } else {
            flowCenter2.initWithContext(context);
        }
    }

    public static /* synthetic */ void access$700(FlowCenter flowCenter2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b94b2ca", new Object[]{flowCenter2});
        } else {
            flowCenter2.enterBackground();
        }
    }

    public static /* synthetic */ void access$800(FlowCenter flowCenter2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3495aa0b", new Object[]{flowCenter2});
        } else {
            flowCenter2.enterForeground();
        }
    }

    public static /* synthetic */ String access$902(FlowCenter flowCenter2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5e03d08", new Object[]{flowCenter2, str});
        }
        flowCenter2.curPageWebviewUrl = str;
        return str;
    }

    private FlowCenter() {
        this.scheduleThreadPoolExecutor.setKeepAliveTime(120L, TimeUnit.SECONDS);
        this.scheduleThreadPoolExecutor.allowCoreThreadTimeOut(true);
        checkApmInitStatus();
        UemAnalysis.setAnalysisDelegate(FullTraceAnalysis.getInstance());
        i.a(GlobalAppRuntimeInfo.getContext());
        v.b().d();
        NWFullTracePlugin.register();
        com.taobao.analysis.monitor.a.b().a();
        try {
            com.taobao.analysis.monitor.a.a(FALCO_GROUP);
            OrangeConfig.getInstance().registerListener(new String[]{FALCO_GROUP}, new g() { // from class: com.taobao.analysis.FlowCenter.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.orange.g
                public void onConfigUpdate(String str, boolean z) {
                    IpChange ipChange = $ipChange;
                    boolean z2 = true;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("9458c0f9", new Object[]{this, str, new Boolean(z)});
                        return;
                    }
                    com.taobao.analysis.flow.a.a(FlowCenter.FALCO_GROUP);
                    try {
                        String config = OrangeConfig.getInstance().getConfig(FlowCenter.FALCO_GROUP, "full_trace_tlog_enable", null);
                        if (!StringUtils.isEmpty(config)) {
                            FullTraceAnalysis.getInstance().setTLogTraceEnable(Boolean.valueOf(config).booleanValue());
                        }
                    } catch (Exception e) {
                        ALog.e(FlowCenter.TAG, "[onConfigUpdate]error", null, e, new Object[0]);
                    }
                    try {
                        String config2 = OrangeConfig.getInstance().getConfig(FlowCenter.FALCO_GROUP, "important_mtop_apis", null);
                        if (!StringUtils.isEmpty(config2)) {
                            FullTraceAnalysis.getInstance().setImportantMtopApi(config2);
                        }
                    } catch (Exception e2) {
                        ALog.e(FlowCenter.TAG, "[onConfigUpdate]error", null, e2, new Object[0]);
                    }
                    try {
                        String config3 = OrangeConfig.getInstance().getConfig(FlowCenter.FALCO_GROUP, "background_flow_max_minute_value", null);
                        if (!StringUtils.isEmpty(config3)) {
                            c.a(Integer.valueOf(config3).intValue());
                        }
                    } catch (Exception e3) {
                        ALog.e(FlowCenter.TAG, "[onConfigUpdate]error", null, e3, new Object[0]);
                    }
                    try {
                        String config4 = OrangeConfig.getInstance().getConfig(FlowCenter.FALCO_GROUP, "background_flow_monitor", null);
                        if (!StringUtils.isEmpty(config4)) {
                            c.a(Boolean.valueOf(config4).booleanValue());
                        }
                    } catch (Exception e4) {
                        ALog.e(FlowCenter.TAG, "[onConfigUpdate]error", null, e4, new Object[0]);
                    }
                    try {
                        String config5 = OrangeConfig.getInstance().getConfig(FlowCenter.FALCO_GROUP, "important_network_urls", null);
                        if (!StringUtils.isEmpty(config5)) {
                            FullTraceAnalysis.getInstance().setImportantNetworkUrl(config5);
                        }
                    } catch (Exception e5) {
                        ALog.e(FlowCenter.TAG, "[onConfigUpdate]error", null, e5, new Object[0]);
                    }
                    try {
                        String config6 = OrangeConfig.getInstance().getConfig(FlowCenter.FALCO_GROUP, v.KEY_V3_ENABLE, null);
                        if (!StringUtils.isEmpty(config6)) {
                            v.b().a(Boolean.valueOf(config6).booleanValue());
                        } else {
                            v.b().c();
                        }
                    } catch (Exception e6) {
                        ALog.e(FlowCenter.TAG, "[onConfigUpdate]error", null, e6, new Object[0]);
                    }
                    try {
                        String config7 = OrangeConfig.getInstance().getConfig(FlowCenter.FALCO_GROUP, v.KEY_LOAD_ENABLE, null);
                        if (!StringUtils.isEmpty(config7)) {
                            v.b().b(Boolean.valueOf(config7).booleanValue());
                        } else {
                            v.b().i();
                        }
                    } catch (Exception e7) {
                        ALog.e(FlowCenter.TAG, "[onConfigUpdate]error", null, e7, new Object[0]);
                    }
                    try {
                        String config8 = OrangeConfig.getInstance().getConfig(FlowCenter.FALCO_GROUP, v.KEY_LOAD_HOOK_ACTIVITY_ENABLE, null);
                        if (!StringUtils.isEmpty(config8)) {
                            v.b().c(Boolean.valueOf(config8).booleanValue());
                        } else {
                            v.b().j();
                        }
                    } catch (Exception e8) {
                        ALog.e(FlowCenter.TAG, "[onConfigUpdate]error", null, e8, new Object[0]);
                    }
                    try {
                        String config9 = OrangeConfig.getInstance().getConfig(FlowCenter.FALCO_GROUP, v.KEY_LOAD_HOOK_WINDOW_ENABLE, null);
                        if (!StringUtils.isEmpty(config9)) {
                            v.b().g(Boolean.valueOf(config9).booleanValue());
                        } else {
                            v.b().p();
                        }
                    } catch (Exception e9) {
                        ALog.e(FlowCenter.TAG, "[onConfigUpdate]error", null, e9, new Object[0]);
                    }
                    try {
                        String config10 = OrangeConfig.getInstance().getConfig(FlowCenter.FALCO_GROUP, v.KEY_ENV_ENABLE, null);
                        if (!StringUtils.isEmpty(config10)) {
                            v.b().f(Boolean.valueOf(config10).booleanValue());
                        } else {
                            v.b().n();
                        }
                    } catch (Exception e10) {
                        ALog.e(FlowCenter.TAG, "[onConfigUpdate]error", null, e10, new Object[0]);
                    }
                    try {
                        String config11 = OrangeConfig.getInstance().getConfig(FlowCenter.FALCO_GROUP, v.KEY_ENV_REPORT_LIST, null);
                        if (!StringUtils.isEmpty(config11)) {
                            v.b().h(config11);
                        }
                        v.b().b(v.KEY_ENV_REPORT_LIST, config11);
                    } catch (Exception e11) {
                        ALog.e(FlowCenter.TAG, "[onConfigUpdate]error", null, e11, new Object[0]);
                    }
                    try {
                        String config12 = OrangeConfig.getInstance().getConfig(FlowCenter.FALCO_GROUP, v.KEY_ENV_INJECT_ENABLE, null);
                        if (!StringUtils.isEmpty(config12)) {
                            v.b().d(Boolean.valueOf(config12).booleanValue());
                        } else {
                            v.b().k();
                        }
                    } catch (Exception e12) {
                        ALog.e(FlowCenter.TAG, "[onConfigUpdate]error", null, e12, new Object[0]);
                    }
                    try {
                        String config13 = OrangeConfig.getInstance().getConfig(FlowCenter.FALCO_GROUP, v.KEY_ENV_CPU_REPORT_ENABLE, null);
                        if (!StringUtils.isEmpty(config13)) {
                            v.b().h(Boolean.valueOf(config13).booleanValue());
                        } else {
                            v.b().q();
                        }
                    } catch (Exception e13) {
                        ALog.e(FlowCenter.TAG, "[onConfigUpdate]error", null, e13, new Object[0]);
                    }
                    try {
                        String config14 = OrangeConfig.getInstance().getConfig(FlowCenter.FALCO_GROUP, v.KEY_EXCEPTION_REPORTER_ENABLE, null);
                        if (!StringUtils.isEmpty(config14)) {
                            v.b().i(Boolean.valueOf(config14).booleanValue());
                        } else {
                            v.b().r();
                        }
                    } catch (Exception e14) {
                        ALog.e(FlowCenter.TAG, "[onConfigUpdate]error", null, e14, new Object[0]);
                    }
                    try {
                        String config15 = OrangeConfig.getInstance().getConfig(FlowCenter.FALCO_GROUP, v.KEY_GC_MONITOR_ENABLE, null);
                        if (!StringUtils.isEmpty(config15)) {
                            v.b().j(Boolean.valueOf(config15).booleanValue());
                        } else {
                            v.b().s();
                        }
                    } catch (Exception e15) {
                        ALog.e(FlowCenter.TAG, "[onConfigUpdate]error", null, e15, new Object[0]);
                    }
                    try {
                        String config16 = OrangeConfig.getInstance().getConfig(FlowCenter.FALCO_GROUP, v.KEY_SCROLL_GC_MONITOR_ENABLE, null);
                        if (!StringUtils.isEmpty(config16)) {
                            v.b().k(Boolean.valueOf(config16).booleanValue());
                        } else {
                            v.b().t();
                        }
                    } catch (Exception e16) {
                        ALog.e(FlowCenter.TAG, "[onConfigUpdate]error", null, e16, new Object[0]);
                    }
                    try {
                        String config17 = OrangeConfig.getInstance().getConfig(FlowCenter.FALCO_GROUP, v.KEY_WEAK_GC_MONITOR_ENABLE, null);
                        if (!StringUtils.isEmpty(config17)) {
                            v.b().l(Boolean.valueOf(config17).booleanValue());
                        } else {
                            v.b().u();
                        }
                    } catch (Exception e17) {
                        ALog.e(FlowCenter.TAG, "[onConfigUpdate]error", null, e17, new Object[0]);
                    }
                    try {
                        String config18 = OrangeConfig.getInstance().getConfig(FlowCenter.FALCO_GROUP, v.KEY_SCREEN_SHOT_ENABLE, null);
                        if (!StringUtils.isEmpty(config18)) {
                            v.b().e(Boolean.valueOf(config18).booleanValue());
                        } else {
                            v.b().m();
                        }
                    } catch (Exception e18) {
                        ALog.e(FlowCenter.TAG, "[onConfigUpdate]error", null, e18, new Object[0]);
                    }
                    try {
                        String config19 = OrangeConfig.getInstance().getConfig(FlowCenter.FALCO_GROUP, v.KEY_MODULE_LIST, null);
                        if (!StringUtils.isEmpty(config19)) {
                            v.b().a(config19);
                        }
                        v.b().b(v.KEY_MODULE_LIST, config19);
                    } catch (Exception e19) {
                        ALog.e(FlowCenter.TAG, "[onConfigUpdate]error", null, e19, new Object[0]);
                    }
                    try {
                        String config20 = OrangeConfig.getInstance().getConfig(FlowCenter.FALCO_GROUP, v.KEY_SCENE_LIST, null);
                        if (!StringUtils.isEmpty(config20)) {
                            v.b().b(config20);
                        }
                        v.b().b(v.KEY_SCENE_LIST, config20);
                    } catch (Exception e20) {
                        ALog.e(FlowCenter.TAG, "[onConfigUpdate]error", null, e20, new Object[0]);
                    }
                    try {
                        String config21 = OrangeConfig.getInstance().getConfig(FlowCenter.FALCO_GROUP, v.KEY_METRICS_SCENE_LIST, null);
                        if (!StringUtils.isEmpty(config21)) {
                            v.b().c(config21);
                        }
                        v.b().b(v.KEY_METRICS_SCENE_LIST, config21);
                    } catch (Exception e21) {
                        ALog.e(FlowCenter.TAG, "[onConfigUpdate]error", null, e21, new Object[0]);
                    }
                    try {
                        String config22 = OrangeConfig.getInstance().getConfig(FlowCenter.FALCO_GROUP, "important_utdids", null);
                        if (!StringUtils.isEmpty(config22)) {
                            JSONArray jSONArray = new JSONArray(config22);
                            int i = 0;
                            while (true) {
                                if (i >= jSONArray.length()) {
                                    z2 = false;
                                    break;
                                } else if (GlobalAppRuntimeInfo.getUtdid().equals(jSONArray.getString(i))) {
                                    break;
                                } else {
                                    i++;
                                }
                            }
                            FullTraceAnalysis.getInstance().setImportantUser(z2);
                        }
                    } catch (Exception unused) {
                    }
                    try {
                        String config23 = OrangeConfig.getInstance().getConfig(FlowCenter.FALCO_GROUP, "falco_extend_enable", null);
                        if (!StringUtils.isEmpty(config23)) {
                            FullTraceAnalysis.getInstance().setFalcoExtendEnable(Boolean.valueOf(config23).booleanValue());
                        }
                    } catch (Exception unused2) {
                    }
                    try {
                        String config24 = OrangeConfig.getInstance().getConfig(FlowCenter.FALCO_GROUP, "mtop_ssr_ut_enable", null);
                        if (!StringUtils.isEmpty(config24)) {
                            FullTraceAnalysis.getInstance().setFalcoSSRMonitorEnable(Boolean.valueOf(config24).booleanValue());
                        }
                    } catch (Exception unused3) {
                    }
                    try {
                        String config25 = OrangeConfig.getInstance().getConfig(FlowCenter.FALCO_GROUP, "falco_extend_timeout", null);
                        if (!StringUtils.isEmpty(config25)) {
                            FullTraceAnalysis.getInstance().setFalcoExtendTimeout(Long.valueOf(config25).longValue());
                        }
                    } catch (Exception unused4) {
                    }
                    try {
                        String config26 = OrangeConfig.getInstance().getConfig(FlowCenter.FALCO_GROUP, "fix_timeout_clean", null);
                        if (!StringUtils.isEmpty(config26)) {
                            FullTraceAnalysis.getInstance().setTimeoutFix(Boolean.valueOf(config26).booleanValue());
                        }
                    } catch (Exception unused5) {
                    }
                    try {
                        String config27 = OrangeConfig.getInstance().getConfig(FlowCenter.FALCO_GROUP, f.CHANNEL_MONITOR_SWITCH_KEY, null);
                        if (!StringUtils.isEmpty(config27)) {
                            f.a().a(Boolean.valueOf(config27).booleanValue());
                        }
                    } catch (Exception e22) {
                        ALog.e(FlowCenter.TAG, "[onConfigUpdate]error", null, e22, new Object[0]);
                    }
                    try {
                        String config28 = OrangeConfig.getInstance().getConfig(FlowCenter.FALCO_GROUP, JankContinuousMonitor.KEY_WHITE_LIST, null);
                        if (!StringUtils.isEmpty(config28)) {
                            JankContinuousMonitor.a().a(config28);
                        }
                    } catch (Exception unused6) {
                    }
                    try {
                        String config29 = OrangeConfig.getInstance().getConfig(FlowCenter.FALCO_GROUP, JankContinuousMonitor.KEY_EXCLUDE_BIZ_CODES, null);
                        if (!StringUtils.isEmpty(config29)) {
                            JankContinuousMonitor.a().b(config29);
                        }
                    } catch (Exception unused7) {
                    }
                    try {
                        String config30 = OrangeConfig.getInstance().getConfig(FlowCenter.FALCO_GROUP, JankContinuousMonitor.KEY_JANK_THRESHOLD, null);
                        if (!StringUtils.isEmpty(config30)) {
                            JankContinuousMonitor.a().a(Float.valueOf(config30).floatValue());
                        }
                    } catch (Exception unused8) {
                    }
                    try {
                        String config31 = OrangeConfig.getInstance().getConfig(FlowCenter.FALCO_GROUP, JankContinuousMonitor.KEY_JANK_CHECK_INTERVAL, null);
                        if (!StringUtils.isEmpty(config31)) {
                            JankContinuousMonitor.a().a(Long.valueOf(config31).longValue());
                        }
                    } catch (Exception unused9) {
                    }
                    com.taobao.analysis.monitor.a.a(FlowCenter.FALCO_GROUP);
                }
            });
            com.taobao.analysis.flow.a.a(FALCO_GROUP);
        } catch (Exception unused) {
        }
    }

    public static FlowCenter getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FlowCenter) ipChange.ipc$dispatch("52b95350", new Object[0]);
        }
        if (flowCenter == null) {
            synchronized (FlowCenter.class) {
                if (flowCenter == null) {
                    flowCenter = new FlowCenter();
                }
            }
        }
        return flowCenter;
    }

    private void initWithContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d95dcce8", new Object[]{this, context});
            return;
        }
        synchronized (FlowCenter.class) {
            if (dir.b == null) {
                dir.b = context.getApplicationContext();
                this.innerListener.a();
                ALog.d(TAG, "initWithContext: innerListener.register", null, new Object[0]);
                boolean b = dir.b();
                isMainProcess = b;
                if (!b) {
                    this.scheduleThreadPoolExecutor.scheduleAtFixedRate(new Runnable() { // from class: com.taobao.analysis.FlowCenter.3
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                FlowCenter.access$200(FlowCenter.this);
                            }
                        }
                    }, 300000L, 300000L, TimeUnit.MILLISECONDS);
                }
                SceneIdentifier.setContext(dir.b);
            }
        }
    }

    /* loaded from: classes.dex */
    public class a implements NetworkStatusHelper.INetworkStatusChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private a() {
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else {
                NetworkStatusHelper.addStatusChangeListener(this);
            }
        }

        @Override // anet.channel.status.NetworkStatusHelper.INetworkStatusChangeListener
        public void onNetworkStatusChanged(NetworkStatusHelper.NetworkStatus networkStatus) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4275ba3b", new Object[]{this, networkStatus});
                return;
            }
            ALog.d(FlowCenter.TAG, "onNetworkStatusChanged", null, new Object[0]);
            dir.a();
        }
    }

    public void commitFlow(Context context, String str, String str2, long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf1a77d0", new Object[]{this, context, str, str2, new Long(j), new Long(j2)});
        } else {
            commitFlow(context, str, null, str2, null, null, j, j2);
        }
    }

    public void commitFlow(Context context, String str, boolean z, String str2, long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3ddf958", new Object[]{this, context, str, new Boolean(z), str2, new Long(j), new Long(j2)});
        } else {
            commitFlow(context, str, null, null, null, null, j, j2);
        }
    }

    public void commitFlow(Context context, String str, String str2, String str3, long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3071231a", new Object[]{this, context, str, str2, str3, new Long(j), new Long(j2)});
        } else {
            commitFlow(context, str, str2, str3, this.curPageActivityName, this.curPageWebviewUrl, j, j2);
        }
    }

    public void commitFlow(final int i, final String str, final String str2, final long j, final long j2, final long j3, final long j4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2678888b", new Object[]{this, new Integer(i), str, str2, new Long(j), new Long(j2), new Long(j3), new Long(j4)});
        } else if (j == 0 && j2 == 0) {
        } else {
            this.scheduleThreadPoolExecutor.execute(new Runnable() { // from class: com.taobao.analysis.FlowCenter.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    FlowCenter.access$300(FlowCenter.this);
                    int i2 = i;
                    if (i2 == 1 || i2 == 2) {
                        ALog.d("NetworkAnalysis", "start AbnormalFlowMonitor", null, new Object[0]);
                        com.taobao.analysis.monitor.a.b().a(str, FlowCenter.access$400(FlowCenter.this), str2, FlowCenter.access$500(FlowCenter.this), j, j2, i);
                    } else if (!c.c()) {
                    } else {
                        ALog.d("NetworkAnalysis", "start BgFlowMonitor", null, new Object[0]);
                        c.a().a(FlowCenter.access$500(FlowCenter.this), str2, j, j2, j3, j4);
                    }
                }
            });
        }
    }

    private void commitFlow(final Context context, final String str, final String str2, final String str3, final String str4, final String str5, final long j, final long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41f39e2e", new Object[]{this, context, str, str2, str3, str4, str5, new Long(j), new Long(j2)});
        } else if (j == 0 && j2 == 0) {
        } else {
            this.scheduleThreadPoolExecutor.execute(new Runnable() { // from class: com.taobao.analysis.FlowCenter.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (context == null) {
                    } else {
                        if (dir.b == null) {
                            FlowCenter.access$600(FlowCenter.this, context);
                        }
                        FlowCenter.access$300(FlowCenter.this);
                        if (BHRTaskConfigBase.TYPE_CONFIG_UT.equals(str)) {
                            com.taobao.analysis.flow.g.a().a(j, j2);
                        } else {
                            f.a().a(str, FlowCenter.access$500(FlowCenter.this), str2, str3, str4, str5, j, j2);
                        }
                        DayFlowReport.a().a(str, FlowCenter.access$500(FlowCenter.this), str3, j, j2);
                        if (!FlowCenter.isMainProcess) {
                            return;
                        }
                        e.a().a(str4, j, j2);
                        com.taobao.analysis.flow.a.a().a(str, str4, str3, FlowCenter.access$500(FlowCenter.this), j, j2);
                    }
                }
            });
        }
    }

    private void enterBackground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("436c8bad", new Object[]{this});
            return;
        }
        boolean z = dir.c;
        this.isBackground = true;
        this.curPageActivityName = "";
        this.curPageWebviewUrl = "";
        this.scheduleThreadPoolExecutor.execute(new Runnable() { // from class: com.taobao.analysis.FlowCenter.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    FlowCenter.access$200(FlowCenter.this);
                }
            }
        });
    }

    private void enterForeground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc1a8d42", new Object[]{this});
            return;
        }
        boolean z = dir.c;
        this.isBackground = false;
        com.taobao.analysis.flow.a.a().b();
        com.taobao.analysis.monitor.a.b().c();
    }

    private void tryCommitStatFlow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b36c1d1b", new Object[]{this});
            return;
        }
        com.taobao.analysis.flow.g.a().b();
        DayFlowReport.a().a(true);
        if (!isMainProcess) {
            return;
        }
        e.a().b();
        com.taobao.analysis.flow.a.a().a(true);
    }

    public void createConnectCount(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d0ed546", new Object[]{this, str, str2, str3});
        } else if (!this.isBackground) {
        } else {
            c.a().a(str, str2, str3);
        }
    }

    private boolean checkApmInitStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("af817e43", new Object[]{this})).booleanValue();
        }
        if (com.taobao.application.common.c.a() == d.DEFAULT) {
            return false;
        }
        if (this.isApmInited.compareAndSet(false, true)) {
            com.taobao.application.common.c.a(new a.b() { // from class: com.taobao.analysis.FlowCenter.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.application.common.IApmEventListener
                public void onEvent(int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("fef3fc41", new Object[]{this, new Integer(i)});
                    } else if (i == 1) {
                        FlowCenter.access$700(FlowCenter.this);
                    } else if (i != 2) {
                    } else {
                        FlowCenter.access$800(FlowCenter.this);
                        c.a().b();
                    }
                }
            });
            com.taobao.application.common.c.a(new b() { // from class: com.taobao.analysis.FlowCenter.8
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.analysis.b, android.app.Application.ActivityLifecycleCallbacks
                public void onActivityResumed(Activity activity) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3e8abf42", new Object[]{this, activity});
                    } else if (activity == null) {
                    } else {
                        FlowCenter.access$402(FlowCenter.this, activity.getLocalClassName());
                        e.a().a(FlowCenter.access$400(FlowCenter.this));
                        Intent intent = activity.getIntent();
                        if (intent == null) {
                            return;
                        }
                        FlowCenter.access$902(FlowCenter.this, dir.b(intent.getStringExtra("URL_REFERER_ORIGIN")));
                    }
                }

                @Override // com.taobao.analysis.b, android.app.Application.ActivityLifecycleCallbacks
                public void onActivityPaused(Activity activity) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a4658a75", new Object[]{this, activity});
                    } else if (activity == null) {
                    } else {
                        FlowCenter.access$402(FlowCenter.this, activity.getLocalClassName());
                        e.a().b(FlowCenter.access$400(FlowCenter.this));
                    }
                }
            }, false);
        }
        return true;
    }
}
