package com.taobao.analysis.fulltrace;

import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.util.ALog;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.fulltrace.NWFullTracePlugin;
import com.taobao.analysis.monitor.JankContinuousMonitor;
import com.taobao.analysis.scene.SceneIdentifier;
import com.taobao.analysis.stat.FullTraceMonitor;
import com.taobao.analysis.stat.FullTraceSSRMonitor;
import com.taobao.analysis.stat.FullTraceStatistic;
import com.taobao.analysis.v3.FalcoGlobalTracer;
import com.taobao.analysis.v3.r;
import com.taobao.falco.FalcoEnvironment;
import com.taobao.tlog.adapter.AdapterForTLog;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import tb.dis;
import tb.dit;
import tb.mzq;
import tb.shc;

/* loaded from: classes.dex */
public class FullTraceAnalysis implements com.taobao.analysis.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String FALCO_LOG_TAG = "FalcoEye";
    private static final long MAX_HISTORY_SIZE = 512;
    private static final long MAX_TIME_OUT = 60000;
    public static final String SEPARATOR = "|";
    public static final String TAG = "falco.FullTraceV2";
    private Map<String, Object> extraInfos;
    private long falcoExtendTimeout;
    private List<String> importantApis;
    private List<String> importantNetworkUrls;
    private volatile boolean isFalcoExtendEnable;
    private volatile boolean isFalcoSSRMonitorEnable;
    private volatile boolean isImportantUser;
    private volatile boolean isTimeoutFix;
    private boolean mIsTLogTraceEnable;
    private boolean mIsTlogTraceError;
    private ConcurrentHashMap<String, FullTraceStatistic> requestMap;

    /* loaded from: classes4.dex */
    public interface RequestType {
        public static final String MTOP = "mtop";
        public static final String MTOP_SSR = "mtop_ssr";
        public static final String NETWORK = "network";
        public static final String PICTURE = "picture";

        @Retention(RetentionPolicy.SOURCE)
        /* loaded from: classes4.dex */
        public @interface Definition {
        }
    }

    /* loaded from: classes.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final FullTraceAnalysis f8564a = new FullTraceAnalysis();

        public static /* synthetic */ FullTraceAnalysis a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (FullTraceAnalysis) ipChange.ipc$dispatch("eb7ee0a0", new Object[0]) : f8564a;
        }
    }

    public static /* synthetic */ ConcurrentHashMap access$200(FullTraceAnalysis fullTraceAnalysis) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ConcurrentHashMap) ipChange.ipc$dispatch("f91069d7", new Object[]{fullTraceAnalysis}) : fullTraceAnalysis.requestMap;
    }

    public static /* synthetic */ void access$300(FullTraceAnalysis fullTraceAnalysis, FullTraceStatistic fullTraceStatistic) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14de511e", new Object[]{fullTraceAnalysis, fullTraceStatistic});
        } else {
            fullTraceAnalysis.checkAndCommit(fullTraceStatistic);
        }
    }

    public static /* synthetic */ void access$400(FullTraceAnalysis fullTraceAnalysis, String str, FullTraceStatistic fullTraceStatistic) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35644c55", new Object[]{fullTraceAnalysis, str, fullTraceStatistic});
        } else {
            fullTraceAnalysis.handlerTimeoutClean(str, fullTraceStatistic);
        }
    }

    public static /* synthetic */ Map access$500(FullTraceAnalysis fullTraceAnalysis) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("b8e95501", new Object[]{fullTraceAnalysis}) : fullTraceAnalysis.extraInfos;
    }

    public static /* synthetic */ boolean access$600(FullTraceAnalysis fullTraceAnalysis) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e6d92aaf", new Object[]{fullTraceAnalysis})).booleanValue() : fullTraceAnalysis.isFalcoExtendEnable;
    }

    public static /* synthetic */ void access$700(FullTraceAnalysis fullTraceAnalysis, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34a818d4", new Object[]{fullTraceAnalysis, str});
        } else {
            fullTraceAnalysis.delayCommit(str);
        }
    }

    private FullTraceAnalysis() {
        this.requestMap = new ConcurrentHashMap<>();
        this.extraInfos = new ConcurrentHashMap();
        this.importantApis = new CopyOnWriteArrayList();
        this.importantNetworkUrls = new CopyOnWriteArrayList();
        this.isImportantUser = false;
        this.mIsTLogTraceEnable = false;
        this.mIsTlogTraceError = false;
        this.isFalcoExtendEnable = false;
        this.falcoExtendTimeout = 3000L;
        this.isFalcoSSRMonitorEnable = true;
        this.isTimeoutFix = true;
    }

    public static FullTraceAnalysis getInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FullTraceAnalysis) ipChange.ipc$dispatch("a453114a", new Object[0]) : a.a();
    }

    @Deprecated
    public String getTraceId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9afc202f", new Object[]{this}) : getFalcoId();
    }

    @Override // com.taobao.analysis.a
    public String getFalcoId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8d91c337", new Object[]{this}) : createRequest("mtop");
    }

    @Override // com.taobao.analysis.a
    public void registerStages(final String str, final List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccd6d3a", new Object[]{this, str, list});
        } else {
            dit.a(new Runnable() { // from class: com.taobao.analysis.fulltrace.FullTraceAnalysis.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    List list2;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    ALog.i(FullTraceAnalysis.TAG, "[registerStages]", null, "module", str, NWFullTracePlugin.FullTraceJSParam.STAGES, list.toString());
                    if (TextUtils.isEmpty(str) || (list2 = list) == null || list2.size() <= 0) {
                        return;
                    }
                    com.taobao.analysis.fulltrace.a.a(str, list);
                }
            });
        }
    }

    @Override // com.taobao.analysis.a
    public void start(final String str, final String str2, final String str3, final String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6015f711", new Object[]{this, str, str2, str3, str4});
            return;
        }
        final long currentTimeMillis = System.currentTimeMillis();
        dit.a(new Runnable() { // from class: com.taobao.analysis.fulltrace.FullTraceAnalysis.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                FullTraceStatistic fullTraceStatistic;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                ALog.i(FullTraceAnalysis.TAG, "[start]", str, "module", str2, "tag", str3, "stage", str4, "time", Long.valueOf(currentTimeMillis));
                if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str4) || (fullTraceStatistic = (FullTraceStatistic) FullTraceAnalysis.access$200(FullTraceAnalysis.this).get(str)) == null) {
                    return;
                }
                com.taobao.analysis.fulltrace.a aVar = fullTraceStatistic.modules.get(str2);
                if (aVar == null) {
                    aVar = new com.taobao.analysis.fulltrace.a(str2);
                    fullTraceStatistic.modules.put(str2, aVar);
                }
                if (!TextUtils.isEmpty(str3)) {
                    aVar.b = str3;
                }
                if (!aVar.a(str4)) {
                    return;
                }
                aVar.c.put(str4, new Pair<>(Long.valueOf(currentTimeMillis), 0L));
            }
        });
    }

    @Override // com.taobao.analysis.a
    public void end(final String str, final String str2, final String str3, final String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a300860a", new Object[]{this, str, str2, str3, str4});
            return;
        }
        final long currentTimeMillis = System.currentTimeMillis();
        dit.a(new Runnable() { // from class: com.taobao.analysis.fulltrace.FullTraceAnalysis.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                FullTraceStatistic fullTraceStatistic;
                com.taobao.analysis.fulltrace.a aVar;
                Pair<Long, Long> pair;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                ALog.i(FullTraceAnalysis.TAG, "[end]", str, "module", str2, "tag", str3, "stage", str4, "time", Long.valueOf(currentTimeMillis));
                if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str4) || (fullTraceStatistic = (FullTraceStatistic) FullTraceAnalysis.access$200(FullTraceAnalysis.this).get(str)) == null || (aVar = fullTraceStatistic.modules.get(str2)) == null || (pair = aVar.c.get(str4)) == null || ((Long) pair.first).longValue() <= 0) {
                    return;
                }
                if (aVar.a(str4)) {
                    aVar.c.put(str4, new Pair<>(pair.first, Long.valueOf(currentTimeMillis)));
                }
                FullTraceAnalysis.access$300(FullTraceAnalysis.this, fullTraceStatistic);
            }
        });
    }

    @Override // com.taobao.analysis.a
    public void forceCommit(final String str, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2f21c1d", new Object[]{this, str, str2});
        } else {
            dit.a(new Runnable() { // from class: com.taobao.analysis.fulltrace.FullTraceAnalysis.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    com.taobao.analysis.fulltrace.a aVar;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    ALog.i(FullTraceAnalysis.TAG, "[forceCommit]", str, "module", str2);
                    FullTraceStatistic fullTraceStatistic = (FullTraceStatistic) FullTraceAnalysis.access$200(FullTraceAnalysis.this).get(str);
                    if (fullTraceStatistic == null || (aVar = fullTraceStatistic.modules.get(str2)) == null) {
                        return;
                    }
                    aVar.d = true;
                    FullTraceAnalysis.access$300(FullTraceAnalysis.this, fullTraceStatistic);
                }
            });
        }
    }

    public void commitModuleTrace(final String str, final String str2, final String str3, final Map<String, Pair<Long, Long>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26126f7e", new Object[]{this, str, str2, str3, map});
        } else {
            dit.a(new Runnable() { // from class: com.taobao.analysis.fulltrace.FullTraceAnalysis.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    Map map2;
                    FullTraceStatistic fullTraceStatistic;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    ALog.i(FullTraceAnalysis.TAG, "[commitModuleTrace]", str, "module", str2, "tag", str3, NWFullTracePlugin.FullTraceJSParam.STAGES, map);
                    if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || (map2 = map) == null || map2.size() <= 0 || (fullTraceStatistic = (FullTraceStatistic) FullTraceAnalysis.access$200(FullTraceAnalysis.this).get(str)) == null) {
                        return;
                    }
                    com.taobao.analysis.fulltrace.a aVar = fullTraceStatistic.modules.get(str2);
                    if (aVar == null) {
                        aVar = new com.taobao.analysis.fulltrace.a(str2);
                        fullTraceStatistic.modules.put(str2, aVar);
                    }
                    if (!TextUtils.isEmpty(str3)) {
                        aVar.b = str3;
                    }
                    aVar.c.putAll(map);
                    aVar.d = true;
                    FullTraceAnalysis.access$300(FullTraceAnalysis.this, fullTraceStatistic);
                }
            });
        }
    }

    private void checkAndCommit(FullTraceStatistic fullTraceStatistic) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b23563f", new Object[]{this, fullTraceStatistic});
        } else if (fullTraceStatistic.isTargetFinished) {
            for (com.taobao.analysis.fulltrace.a aVar : fullTraceStatistic.modules.values()) {
                if (!aVar.a()) {
                    return;
                }
            }
            fullTraceStatistic.moduleTrace = fullTraceStatistic.buildModuleTrace();
            if (TextUtils.isEmpty(fullTraceStatistic.url)) {
                return;
            }
            if (dis.a()) {
                Log.e(TAG, fullTraceStatistic.toString());
            } else {
                ALog.e(TAG, fullTraceStatistic.toString(), null, new Object[0]);
            }
            reportTraceLog(fullTraceStatistic.falcoId, fullTraceStatistic.pTraceId, fullTraceStatistic.ret, fullTraceStatistic.netErrorCode, fullTraceStatistic.bizErrorCode, fullTraceStatistic.toTraceLog());
            AppMonitor.getInstance().commitStat(fullTraceStatistic);
            JankContinuousMonitor.a().b(fullTraceStatistic.falcoId, fullTraceStatistic);
            if (isImportantMtopUrl(fullTraceStatistic.url) || isImportantUser() || isImportantNetworkUrl(fullTraceStatistic.url)) {
                AppMonitor.getInstance().commitStat(new FullTraceMonitor(fullTraceStatistic));
            }
            if (this.isFalcoSSRMonitorEnable && "mtop_ssr".equals(fullTraceStatistic.reqType)) {
                AppMonitor.getInstance().commitStat(new FullTraceSSRMonitor(fullTraceStatistic));
            }
            this.requestMap.remove(fullTraceStatistic.falcoId);
            if (fullTraceStatistic.timeoutRunnable == null) {
                return;
            }
            dit.f(fullTraceStatistic.timeoutRunnable);
        }
    }

    public String createRequest(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("55d2fcdc", new Object[]{this, str});
        }
        final String generateFalcoId = generateFalcoId();
        if (!GlobalAppRuntimeInfo.isTargetProcess()) {
            return generateFalcoId;
        }
        dit.a(new Runnable() { // from class: com.taobao.analysis.fulltrace.FullTraceAnalysis.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                FullTraceStatistic fullTraceStatistic = new FullTraceStatistic(str);
                FullTraceAnalysis.access$200(FullTraceAnalysis.this).put(generateFalcoId, fullTraceStatistic);
                FullTraceAnalysis.access$400(FullTraceAnalysis.this, generateFalcoId, fullTraceStatistic);
                JankContinuousMonitor.a().a(generateFalcoId, fullTraceStatistic);
            }
        });
        return generateFalcoId;
    }

    private void handlerTimeoutClean(final String str, FullTraceStatistic fullTraceStatistic) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a806e69", new Object[]{this, str, fullTraceStatistic});
        } else if (this.isTimeoutFix) {
            fullTraceStatistic.timeoutRunnable = new Runnable() { // from class: com.taobao.analysis.fulltrace.FullTraceAnalysis.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        FullTraceAnalysis.access$200(FullTraceAnalysis.this).remove(str);
                    }
                }
            };
            dit.a(fullTraceStatistic.timeoutRunnable, 60000L, TimeUnit.MILLISECONDS);
        } else if (this.requestMap.size() <= 512) {
        } else {
            ALog.e(TAG, "requestMap record check.", null, "size", Integer.valueOf(this.requestMap.size()));
            Iterator<Map.Entry<String, FullTraceStatistic>> it = this.requestMap.entrySet().iterator();
            while (it.hasNext()) {
                if (System.currentTimeMillis() - it.next().getValue().createTimestamp > 60000) {
                    it.remove();
                }
            }
        }
    }

    public void commitRequest(final String str, final String str2, final b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("debacd65", new Object[]{this, str, str2, bVar});
        } else if (!GlobalAppRuntimeInfo.isTargetProcess() || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
        } else {
            dit.a(new Runnable() { // from class: com.taobao.analysis.fulltrace.FullTraceAnalysis.8
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    shc h;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    FullTraceStatistic fullTraceStatistic = (FullTraceStatistic) FullTraceAnalysis.access$200(FullTraceAnalysis.this).get(str);
                    if (fullTraceStatistic == null) {
                        return;
                    }
                    boolean equals = str2.equals(fullTraceStatistic.reqType);
                    b bVar2 = bVar;
                    if (bVar2 == null) {
                        return;
                    }
                    if (equals) {
                        fullTraceStatistic.falcoId = str;
                        fullTraceStatistic.bizId = bVar2.d;
                        fullTraceStatistic.ret = bVar.g;
                        fullTraceStatistic.topic = bVar.N;
                        fullTraceStatistic.pageIndex = bVar.O;
                        fullTraceStatistic.isReqMain = bVar.J ? 1 : 0;
                        fullTraceStatistic.isReqSync = bVar.I ? 1 : 0;
                        fullTraceStatistic.isStreamMode = bVar.S ? 1 : 0;
                    }
                    if (str2.equals("network")) {
                        fullTraceStatistic.url = bVar.f8567a;
                        fullTraceStatistic.host = bVar.b;
                        fullTraceStatistic.protocolType = bVar.f;
                        fullTraceStatistic.retryTimes = bVar.c;
                        fullTraceStatistic.netType = bVar.e;
                        fullTraceStatistic.netReqStart = bVar.j;
                        fullTraceStatistic.netReqServiceBindEnd = bVar.k;
                        fullTraceStatistic.netReqProcessStart = bVar.l;
                        fullTraceStatistic.netReqSendStart = bVar.m;
                        fullTraceStatistic.netRspRecvEnd = bVar.n;
                        fullTraceStatistic.netRspCbDispatch = bVar.o;
                        fullTraceStatistic.netRspCbStart = bVar.p;
                        fullTraceStatistic.netRspCbEnd = bVar.q;
                        fullTraceStatistic.reqInflateSize = bVar.v;
                        fullTraceStatistic.reqDeflateSize = bVar.w;
                        fullTraceStatistic.rspDeflateSize = bVar.x;
                        fullTraceStatistic.rspInflateSize = bVar.y;
                        fullTraceStatistic.serverRT = bVar.z;
                        fullTraceStatistic.sendDataTime = bVar.C;
                        fullTraceStatistic.firstDataTime = bVar.D;
                        fullTraceStatistic.recvDataTime = bVar.E;
                        fullTraceStatistic.isCbMain = 0;
                        fullTraceStatistic.netErrorCode = bVar.K;
                        fullTraceStatistic.multiNetworkStatus = bVar.P;
                        fullTraceStatistic.useMultiPath = bVar.Q;
                        fullTraceStatistic.pageReferer = bVar.R;
                    } else {
                        if ("cache".equalsIgnoreCase(bVar.f)) {
                            fullTraceStatistic.url = bVar.f8567a;
                            fullTraceStatistic.host = bVar.b;
                            fullTraceStatistic.protocolType = bVar.f;
                            fullTraceStatistic.rspInflateSize = bVar.y;
                        }
                        if (str2.equals("mtop") || str2.equals("mtop_ssr")) {
                            fullTraceStatistic.isCbMain = bVar.H ? 1 : 0;
                            fullTraceStatistic.serverRT = bVar.z;
                            fullTraceStatistic.serverBizRT = bVar.A;
                            fullTraceStatistic.serverCrossUnit = bVar.B;
                            fullTraceStatistic.reqFrom = bVar.T ? 1 : 0;
                            fullTraceStatistic.signTime = bVar.U;
                            fullTraceStatistic.bizFirstChunkInflateSize = bVar.X;
                            fullTraceStatistic.bizFirstChunkTime = bVar.W;
                            fullTraceStatistic.isLoginRedo = bVar.Z ? 1 : 0;
                        } else if (str2.equals("picture")) {
                            fullTraceStatistic.isCbMain = 1;
                        }
                        if (str2.equals("picture")) {
                            fullTraceStatistic.format = bVar.V;
                            fullTraceStatistic.hitServerCache = bVar.Y;
                        }
                        fullTraceStatistic.serverTraceId = bVar.G;
                        fullTraceStatistic.bizReqStart = bVar.h;
                        fullTraceStatistic.bizReqProcessStart = bVar.i;
                        fullTraceStatistic.bizRspProcessStart = bVar.r;
                        fullTraceStatistic.bizRspCbDispatch = bVar.s;
                        fullTraceStatistic.bizRspCbStart = bVar.t;
                        fullTraceStatistic.bizRspCbEnd = bVar.u;
                        fullTraceStatistic.deserializeTime = bVar.F;
                        fullTraceStatistic.bizErrorCode = bVar.L;
                    }
                    if (!equals) {
                        return;
                    }
                    fullTraceStatistic.startType = SceneIdentifier.getStartType();
                    fullTraceStatistic.isFromExternal = SceneIdentifier.isUrlLaunch() ? 1 : 0;
                    fullTraceStatistic.appLaunch = SceneIdentifier.getAppLaunchTime();
                    fullTraceStatistic.lastAppLaunch = SceneIdentifier.getLastLaunchTime();
                    fullTraceStatistic.homeCreate = SceneIdentifier.getHomeCreateTime();
                    fullTraceStatistic.deviceLevel = SceneIdentifier.getDeviceLevel();
                    fullTraceStatistic.pageName = SceneIdentifier.getCurrentPageNameWithFragment();
                    fullTraceStatistic.pageUrl = SceneIdentifier.getCurrentPageUrl();
                    fullTraceStatistic.isBg = SceneIdentifier.isAppBackground() ? 1 : 0;
                    fullTraceStatistic.pageResumeTime = SceneIdentifier.getPageResumeTime();
                    fullTraceStatistic.pageCreateTime = SceneIdentifier.getPageCreateTime();
                    fullTraceStatistic.speedBucket = SceneIdentifier.getBucketInfo();
                    fullTraceStatistic.userType = SceneIdentifier.getUserType();
                    fullTraceStatistic.processId = SceneIdentifier.getProcessId();
                    fullTraceStatistic.processStart = SceneIdentifier.getProcessStartTime();
                    fullTraceStatistic.processType = SceneIdentifier.getProcessName();
                    r rVar = FalcoGlobalTracer.get();
                    if (rVar != null && (h = rVar.h()) != null) {
                        fullTraceStatistic.pFalcoId = h.a();
                    }
                    FalcoEnvironment a2 = FalcoEnvironment.a();
                    if (a2 != null) {
                        fullTraceStatistic.envFalcoId = a2.b();
                    }
                    String str3 = null;
                    if (fullTraceStatistic.isFromExternal == 1) {
                        fullTraceStatistic.landingUrl = SceneIdentifier.getLandingUrl();
                        fullTraceStatistic.landingCreate = SceneIdentifier.getLandingCreateTime();
                        fullTraceStatistic.landingCompletion = SceneIdentifier.getLandingCompletionTime();
                        str3 = SceneIdentifier.getJumpUrl();
                    }
                    JSONObject jSONObject = new JSONObject();
                    try {
                        if (!TextUtils.isEmpty(str3)) {
                            jSONObject.put("jumpUrl", str3);
                        }
                        for (Map.Entry entry : FullTraceAnalysis.access$500(FullTraceAnalysis.this).entrySet()) {
                            jSONObject.put((String) entry.getKey(), entry.getValue());
                        }
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    fullTraceStatistic.extra = jSONObject.toString();
                    fullTraceStatistic.pTraceId = bVar.M;
                    fullTraceStatistic.isTargetFinished = true;
                    if (!FullTraceAnalysis.access$600(FullTraceAnalysis.this) || fullTraceStatistic.reqFrom != 1 || fullTraceStatistic.isFalcoExtendCommit) {
                        FullTraceAnalysis.access$300(FullTraceAnalysis.this, fullTraceStatistic);
                    } else {
                        FullTraceAnalysis.access$700(FullTraceAnalysis.this, str);
                    }
                }
            });
        }
    }

    private void delayCommit(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("429fcbab", new Object[]{this, str});
        } else {
            dit.a(new Runnable() { // from class: com.taobao.analysis.fulltrace.FullTraceAnalysis.9
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    ALog.i(FullTraceAnalysis.TAG, "[delayCommit]", null, "falcoId", str);
                    FullTraceStatistic fullTraceStatistic = (FullTraceStatistic) FullTraceAnalysis.access$200(FullTraceAnalysis.this).get(str);
                    if (fullTraceStatistic == null) {
                        ALog.i(FullTraceAnalysis.TAG, "[delayCommit] commit already, return.", null, new Object[0]);
                        return;
                    }
                    fullTraceStatistic.isFalcoExtendCommit = true;
                    FullTraceAnalysis.access$300(FullTraceAnalysis.this, fullTraceStatistic);
                }
            }, this.falcoExtendTimeout, TimeUnit.MILLISECONDS);
        }
    }

    private void reportTraceLog(String str, String str2, int i, String str3, String str4, String str5) {
        String valueOf;
        String str6;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33b228b3", new Object[]{this, str, str2, new Integer(i), str3, str4, str5});
        } else if (!this.mIsTLogTraceEnable || this.mIsTlogTraceError) {
        } else {
            try {
                String str7 = TextUtils.isEmpty(str2) ? "empty" : str2;
                long currentTimeMillis = System.currentTimeMillis();
                if (i == 0) {
                    valueOf = "1";
                } else {
                    valueOf = i == 1 ? "0" : String.valueOf(i);
                }
                String str8 = valueOf;
                String str9 = "";
                if (i != 1) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(TextUtils.isEmpty(str3) ? str9 : str3);
                    sb.append("_");
                    if (!TextUtils.isEmpty(str4)) {
                        str9 = str4;
                    }
                    sb.append(str9);
                    str6 = sb.toString();
                } else {
                    str6 = str9;
                }
                com.taobao.tlog.adapter.a.a(str, str7, "AliFulltraceSDK", currentTimeMillis, "request_finish", str8, str6, str5);
            } catch (Throwable unused) {
                ALog.e(TAG, "[reportTraceLog]error.", null, new Object[0]);
                this.mIsTlogTraceError = true;
            }
        }
    }

    private String generateFalcoId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("96bff4d6", new Object[]{this}) : mzq.a();
    }

    public void addExtraInfo(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce94f86a", new Object[]{this, str, obj});
        } else if (TextUtils.isEmpty(str) || obj == null) {
        } else {
            this.extraInfos.put(str, obj);
        }
    }

    public void setTLogTraceEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c969f2d7", new Object[]{this, new Boolean(z)});
        } else {
            this.mIsTLogTraceEnable = z;
        }
    }

    public void setImportantMtopApi(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f6c4a43", new Object[]{this, str});
            return;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i = 0; i < jSONArray.length(); i++) {
                copyOnWriteArrayList.add(jSONArray.getString(i));
            }
        } catch (Exception unused) {
            ALog.e(TAG, "parse important mtop apis error", null, new Object[0]);
        }
        this.importantApis = copyOnWriteArrayList;
    }

    public boolean isImportantMtopUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("314db2a4", new Object[]{this, str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        for (int i = 0; i < this.importantApis.size(); i++) {
            String str2 = this.importantApis.get(i);
            if (!TextUtils.isEmpty(str2) && str.contains(str2)) {
                return true;
            }
        }
        return false;
    }

    public void setImportantNetworkUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9873c632", new Object[]{this, str});
            return;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i = 0; i < jSONArray.length(); i++) {
                copyOnWriteArrayList.add(jSONArray.getString(i));
            }
        } catch (Exception unused) {
            ALog.e(TAG, "parse important network urls error", null, new Object[0]);
        }
        this.importantNetworkUrls = copyOnWriteArrayList;
    }

    public boolean isImportantNetworkUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("95e0f66e", new Object[]{this, str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        for (int i = 0; i < this.importantNetworkUrls.size(); i++) {
            try {
                String str2 = this.importantNetworkUrls.get(i);
                if (!TextUtils.isEmpty(str2) && str.toLowerCase().contains(str2)) {
                    return true;
                }
            } catch (Exception unused) {
                ALog.e(TAG, "[isImportantNetworkUrl]error", null, new Object[0]);
            }
        }
        return false;
    }

    public boolean isImportantUser() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2b15c90e", new Object[]{this})).booleanValue() : this.isImportantUser || SceneIdentifier.getUserType() == 2 || SceneIdentifier.getUserType() == 1;
    }

    public boolean isImportantMtopApi(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6efc50f", new Object[]{this, str})).booleanValue();
        }
        if (!TextUtils.isEmpty(str)) {
            return this.importantApis.contains(str);
        }
        return false;
    }

    public void log(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f08b82f3", new Object[]{this, str, str2, str3, str4});
            return;
        }
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("|");
            sb.append(str2);
            sb.append("|");
            sb.append(str3);
            sb.append("|");
            if (!TextUtils.isEmpty(str4)) {
                sb.append(str4);
            }
            AdapterForTLog.loge(FALCO_LOG_TAG, sb.toString());
        } catch (Throwable unused) {
            ALog.e(TAG, "log error.", null, new Object[0]);
        }
    }

    public void setImportantUser(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7d5c42", new Object[]{this, new Boolean(z)});
        } else {
            this.isImportantUser = z;
        }
    }

    public void falcoExtend(final String str, final Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1542627d", new Object[]{this, str, map});
        } else {
            dit.a(new Runnable() { // from class: com.taobao.analysis.fulltrace.FullTraceAnalysis.10
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (!FullTraceAnalysis.access$600(FullTraceAnalysis.this)) {
                    } else {
                        ALog.i(FullTraceAnalysis.TAG, "[falcoExtend]", null, "falcoId", str, "params", map);
                        FullTraceStatistic fullTraceStatistic = (FullTraceStatistic) FullTraceAnalysis.access$200(FullTraceAnalysis.this).get(str);
                        if (fullTraceStatistic == null) {
                            return;
                        }
                        try {
                            long longValue = ((Long) map.get("preProcessStart")).longValue();
                            long longValue2 = ((Long) map.get("postProcessEnd")).longValue();
                            fullTraceStatistic.preProcessStart = longValue;
                            fullTraceStatistic.postProcessEnd = longValue2;
                            fullTraceStatistic.isFalcoExtendCommit = true;
                            FullTraceAnalysis.access$300(FullTraceAnalysis.this, fullTraceStatistic);
                        } catch (Exception unused) {
                            ALog.e(FullTraceAnalysis.TAG, "[falcoExtend]params error", null, new Object[0]);
                        }
                    }
                }
            });
        }
    }

    public void setFalcoExtendEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4eebe555", new Object[]{this, new Boolean(z)});
        } else {
            this.isFalcoExtendEnable = z;
        }
    }

    public void setFalcoExtendTimeout(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("477951f1", new Object[]{this, new Long(j)});
        } else if (j < 0) {
        } else {
            this.falcoExtendTimeout = j;
        }
    }

    public void setFalcoSSRMonitorEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4502a47", new Object[]{this, new Boolean(z)});
        } else {
            this.isFalcoSSRMonitorEnable = z;
        }
    }

    public void setTimeoutFix(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a9aa3f7", new Object[]{this, new Boolean(z)});
        } else {
            this.isTimeoutFix = z;
        }
    }
}
