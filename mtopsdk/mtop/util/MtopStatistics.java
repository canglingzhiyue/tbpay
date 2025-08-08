package mtopsdk.mtop.util;

import mtopsdk.common.util.StringUtils;
import anetwork.channel.statist.StatisticData;
import com.alipay.android.msp.framework.statisticsv2.model.StEvent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.abtest.ABTestCenter;
import com.taobao.analysis.scene.SceneIdentifier;
import com.taobao.android.detail.core.debug.b;
import com.taobao.android.layoutmanager.module.MtopModule;
import com.taobao.mtop.wvplugin.a;
import com.taobao.tao.remotebusiness.js.MtopJSBridge;
import com.taobao.themis.kernel.i;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import mtopsdk.common.util.HeaderHandlerUtil;
import mtopsdk.common.util.HttpHeaderConstant;
import mtopsdk.common.util.MtopUtils;
import mtopsdk.common.util.RemoteConfig;
import mtopsdk.common.util.StringUtils;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.common.MtopNetworkProp;
import mtopsdk.mtop.common.MtopStatsListener;
import mtopsdk.mtop.global.SwitchConfig;
import mtopsdk.mtop.intf.Mtop;
import mtopsdk.mtop.stat.IUploadStats;
import mtopsdk.network.domain.NetworkStats;
import tb.arz;
import tb.kge;
import tb.tms;

/* loaded from: classes.dex */
public class MtopStatistics implements Cloneable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String MTOP_BX_ACTION_POINT = "baxiaAction";
    private static final String MTOP_EXCEPTIONS_MONITOR_POINT = "mtopExceptions";
    private static final String MTOP_H5_SITE_MONITOR_POINT = "mtopH5Site";
    private static final String MTOP_JSON_MONITOR_POINT = "mtopJsonStat";
    private static final String MTOP_SITE_MONITOR_POINT = "mtopSiteType";
    private static final String MTOP_STATS_MODULE = "mtopsdk";
    private static final String MTOP_STATS_MONITOR_POINT = "mtopStats";
    private static final String TAG = "mtopsdk.MtopStatistics";
    private static volatile AtomicBoolean isH5SiteRegistered;
    private static volatile AtomicBoolean isJsonRegistered;
    private static volatile AtomicBoolean isRegistered;
    private static volatile AtomicBoolean isSiteTypeRegistered;
    public String accountSite;
    public long allTime;
    public String apiKey;
    public boolean backGround;
    public long bizFirstChunkTime;
    @Deprecated
    public int bizId;
    public String bizIdStr;
    public long bizReqProcessStart;
    public long bizReqStart;
    public long bizRspProcessStart;
    public String bizTopic;
    public long buildParams2NetworkTime;
    public long buildParamsEndTime;
    public long buildParamsStartTime;
    public long buildParamsTime;
    public String bxAction;
    public int bxMainAction;
    public int bxRetry;
    public String bxSessionId;
    public long bxSleep;
    public long bxSubAction;
    public boolean bxUI;
    public long cacheCostTime;
    public int cacheHitType;
    public long cacheResponseParseEndTime;
    public long cacheResponseParseStartTime;
    public long cacheResponseParseTime;
    public long cacheReturnTime;
    public int cacheSwitch;
    public long callbackPocTime;
    public boolean cancelRequest;
    public String clientTraceId;
    public boolean commitStat;
    public long computeMiniWuaTime;
    public long computeSignTime;
    public long computeWuaTime;
    public String configReqDomain;
    public long configReqFinishTime;
    public long configReqStartTime;
    public int configRequestType;
    public int configReturnType;
    public boolean cookieDisable;
    public long copyDataDuration;
    public String domain;
    public String eagleEyeTraceId;
    public long endTime;
    public int expansionCount;
    public String falcoId;
    public long fcProcessCallbackTime;
    public long fcProcessCheckEndTime;
    public long fcProcessCheckStartTime;
    public long fcProcessStartTime;
    public long findEndDuration;
    @Deprecated
    public String fullTraceId;
    public long h5LoginTime;
    public boolean h5LoginTimeout;
    public boolean handler;
    public boolean hasSwitchToPost;
    public String instanceId;
    public int intSeqNo;
    public boolean isJsTimeoutEnable;
    public boolean isLoginRedo;
    public boolean isMain;
    public boolean isNoNetwork;
    public boolean isPrefetch;
    public boolean isReqMain;
    public boolean isReqSync;
    public boolean isSignDegraded;
    public boolean isSignDegradedRetry;
    public String location;
    public String mappingCode;
    private MtopStatsListener mtopStatsListener;
    public long netSendEndTime;
    public long netSendStartTime;
    public NetworkStats netStats;
    public long netTotalTime;
    public int oldFCType;
    public Map<String, String> openTraceContext;
    public Object openTraceSpan;
    public String pTraceId;
    public int pageIndex;
    public String pageName;
    public String pageUrl;
    public long parseSSEDataDuration;
    public long parseStreamFirstDataDuration;
    public boolean prefetchLocalMode;
    private RbStatisticData rbStatData;
    public int receivedCount;
    public long receivedNetDuration;
    public long receivedResponseCodeTime;
    public int reqSource;
    public long requestPocTime;
    public int responseCount;
    public int responseValidCount;
    public String retCode;
    public int retType;
    public long rspCbDispatch;
    public long rspCbEnd;
    public long rspCbStart;
    public final String seqNo;
    private long serverBizRT;
    private int serverCrossUnit;
    private long serverRT;
    public String serverTraceId;
    public long startCallBack2EndTime;
    public long startCallbackDuration;
    public long startCallbackTime;
    public long startExecuteTime;
    public long startResponseCodeDuration;
    public long startTime;
    public String statSum;
    public int statusCode;
    public long streamFirstDataCallbackDuration;
    public long streamFirstDataCallbackTime;
    public long streamFirstResCallbackDuration;
    public long streamFirstResponseSize;
    public boolean streamRequest;
    public boolean streamResponse;
    public boolean supportStreamJson;
    public boolean supportZstdDictionary;
    public long totalTime;
    public String ttid;
    public boolean unitCalibration;
    private IUploadStats uploadStats;
    public boolean upstreamCompress;
    public String url;
    public long waitCallbackTime;
    public long waitExecute2BuildParamTime;
    public long waitExecuteTime;

    /* loaded from: classes9.dex */
    public interface CustomType {
        public static final int H5_SITE = 0;

        @Retention(RetentionPolicy.SOURCE)
        /* loaded from: classes9.dex */
        public @interface Definition {
        }
    }

    /* loaded from: classes9.dex */
    public interface RetType {
        public static final int BIZ_ERROR = 3;
        public static final int NETWORK_ERROR = 1;
        public static final int SUCCESS = 0;
        public static final int SYSTEM_ERROR = 2;

        @Retention(RetentionPolicy.SOURCE)
        /* loaded from: classes9.dex */
        public @interface Definition {
        }
    }

    public static /* synthetic */ void access$000(MtopStatistics mtopStatistics) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b41ed5d8", new Object[]{mtopStatistics});
        } else {
            mtopStatistics.doCommitStatsTask();
        }
    }

    static {
        kge.a(1991073294);
        kge.a(-723128125);
        isRegistered = new AtomicBoolean(false);
        isH5SiteRegistered = new AtomicBoolean(false);
        isSiteTypeRegistered = new AtomicBoolean(false);
        isJsonRegistered = new AtomicBoolean(false);
    }

    public MtopStatistics(IUploadStats iUploadStats, MtopStatsListener mtopStatsListener) {
        this.commitStat = true;
        this.cacheHitType = 0;
        this.retType = 0;
        this.statSum = "";
        this.streamFirstResponseSize = 0L;
        this.apiKey = "";
        this.instanceId = "";
        this.ttid = "";
        this.isMain = true;
        this.bizTopic = "";
        this.pTraceId = "";
        this.bxSessionId = "";
        this.bxUI = false;
        this.bxRetry = 0;
        this.bxSleep = -1L;
        this.isPrefetch = false;
        this.prefetchLocalMode = false;
        this.hasSwitchToPost = false;
        this.isSignDegraded = false;
        this.isSignDegradedRetry = false;
        this.cookieDisable = false;
        this.isJsTimeoutEnable = false;
        this.h5LoginTimeout = false;
        this.supportStreamJson = false;
        this.upstreamCompress = false;
        this.supportZstdDictionary = false;
        this.h5LoginTime = 0L;
        this.isLoginRedo = false;
        this.oldFCType = 0;
        this.serverRT = -1L;
        this.serverBizRT = -1L;
        this.serverCrossUnit = -1;
        this.unitCalibration = false;
        this.uploadStats = iUploadStats;
        this.mtopStatsListener = mtopStatsListener;
        this.intSeqNo = MtopUtils.createIntSeqNo();
        this.seqNo = "MTOP" + this.intSeqNo;
    }

    public MtopStatistics(IUploadStats iUploadStats, MtopStatsListener mtopStatsListener, MtopNetworkProp mtopNetworkProp) {
        this(iUploadStats, mtopStatsListener);
        if (mtopNetworkProp != null) {
            this.pageName = mtopNetworkProp.pageName;
            this.pageUrl = MtopUtils.convertUrl(mtopNetworkProp.pageUrl);
            this.backGround = mtopNetworkProp.backGround;
        }
    }

    public long currentTimeMillis() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6f536047", new Object[]{this})).longValue() : System.nanoTime() / 1000000;
    }

    public String launchInfoValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a5ee7609", new Object[]{this});
        }
        if (!Mtop.mIsFullTrackValid) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(SceneIdentifier.getStartType());
        sb.append(",");
        sb.append(SceneIdentifier.isUrlLaunch() ? "1" : "0");
        sb.append(",");
        sb.append(this.bizReqStart);
        sb.append(",");
        sb.append(SceneIdentifier.getAppLaunchTime());
        sb.append(",");
        sb.append(SceneIdentifier.getDeviceLevel());
        return sb.toString();
    }

    public void onEndAndCommit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41da4659", new Object[]{this});
            return;
        }
        this.endTime = currentTimeMillis();
        long j = this.endTime;
        long j2 = this.startTime;
        this.totalTime = j - j2;
        long j3 = this.startExecuteTime;
        this.waitExecuteTime = j3 > j2 ? j3 - j2 : 0L;
        long j4 = this.cacheReturnTime;
        this.cacheCostTime = j4 > 0 ? j4 - this.startTime : 0L;
        this.cacheResponseParseTime = this.cacheResponseParseEndTime - this.cacheResponseParseStartTime;
        if (this.netSendEndTime == 0) {
            this.netSendEndTime = currentTimeMillis();
        }
        long j5 = this.netSendEndTime;
        this.netTotalTime = j5 - this.netSendStartTime;
        long j6 = this.startCallbackTime;
        this.waitCallbackTime = j6 > j5 ? j6 - j5 : 0L;
        this.waitExecute2BuildParamTime = this.buildParamsStartTime - this.startExecuteTime;
        long j7 = this.netSendStartTime;
        this.buildParams2NetworkTime = j7 - this.buildParamsEndTime;
        long j8 = this.endTime;
        long j9 = this.startCallbackTime;
        this.startCallBack2EndTime = j8 - j9;
        long j10 = this.startTime;
        this.requestPocTime = j7 - j10;
        if (j9 > 0) {
            this.startCallbackDuration = j9 - j10;
        }
        long j11 = this.receivedResponseCodeTime;
        if (j11 > 0) {
            this.startResponseCodeDuration = j11 - this.startTime;
        }
        long j12 = this.streamFirstDataCallbackTime;
        if (j12 > 0) {
            this.streamFirstDataCallbackDuration = j12 - this.startTime;
        }
        StringBuilder sb = new StringBuilder(128);
        sb.append("apiKey=");
        sb.append(this.apiKey);
        sb.append(",httpResponseStatus=");
        sb.append(this.statusCode);
        sb.append(",retCode=");
        sb.append(this.retCode);
        sb.append(",retType=");
        sb.append(this.retType);
        sb.append(",reqSource=");
        sb.append(this.reqSource);
        sb.append(",mappingCode=");
        sb.append(this.mappingCode);
        sb.append(",eagleEyeTraceId=");
        sb.append(this.eagleEyeTraceId);
        sb.append(",isCbMain=");
        sb.append(this.isMain);
        sb.append(",isReqMain=");
        sb.append(this.isReqMain);
        sb.append(",isReqSync=");
        sb.append(this.isReqSync);
        sb.append(",mtopTotalTime=");
        sb.append(this.totalTime);
        sb.append(",waitExecuteTime=");
        sb.append(this.waitExecuteTime);
        sb.append(",waitExecute2BuildParamTime=");
        sb.append(this.waitExecute2BuildParamTime);
        sb.append(",buildParamsTime=");
        sb.append(this.buildParamsTime);
        sb.append(",buildParams2NetworkTime=");
        sb.append(this.buildParams2NetworkTime);
        sb.append(",networkTotalTime=");
        sb.append(this.netTotalTime);
        sb.append(",waitCallbackTime=");
        sb.append(this.waitCallbackTime);
        sb.append(",startCallBack2EndTime=");
        sb.append(this.startCallBack2EndTime);
        sb.append(",computeSignTime=");
        sb.append(this.computeSignTime);
        sb.append(",computeMiniWuaTime=");
        sb.append(this.computeMiniWuaTime);
        sb.append(",computeWuaTime=");
        sb.append(this.computeWuaTime);
        sb.append(",cacheSwitch=");
        sb.append(this.cacheSwitch);
        sb.append(",cacheHitType=");
        sb.append(this.cacheHitType);
        sb.append(",cacheCostTime=");
        sb.append(this.cacheCostTime);
        sb.append(",cacheResponseParseTime=");
        sb.append(this.cacheResponseParseTime);
        sb.append(",useSecurityAdapter=");
        sb.append(SwitchConfig.getInstance().getUseSecurityAdapter());
        sb.append(",isPrefetch=");
        sb.append(this.isPrefetch);
        sb.append(",prefetchLocalMode=");
        sb.append(this.prefetchLocalMode);
        sb.append(",pTraceId=");
        sb.append(this.pTraceId);
        sb.append(",isSignDegraded=");
        sb.append(this.isSignDegraded);
        sb.append(",supportStreamJson=");
        sb.append(this.supportStreamJson);
        sb.append(",upstreamCompress=");
        sb.append(this.upstreamCompress);
        sb.append(",supportZstdDictionary=");
        sb.append(this.supportZstdDictionary);
        sb.append(",streamJsonEnable=");
        sb.append(SwitchConfig.getInstance().isStreamJsonEnable());
        sb.append(",streamJsonParseObjectEnable=");
        sb.append(SwitchConfig.getInstance().isStreamJsonParseObjectEnable());
        sb.append(",isJsTimeoutEnable=");
        sb.append(this.isJsTimeoutEnable);
        sb.append(",streamRequest=");
        sb.append(this.streamRequest);
        sb.append(",streamResponse=");
        sb.append(this.streamResponse);
        sb.append(",streamFirstResponseSize=");
        sb.append(this.streamFirstResponseSize);
        sb.append(",responseCount=");
        sb.append(this.responseCount);
        sb.append(",responseValidCount=");
        sb.append(this.responseValidCount);
        sb.append(",ttid=");
        sb.append(this.ttid);
        sb.append(",startResponseCodeDuration=");
        sb.append(this.startResponseCodeDuration);
        sb.append(",startCallbackDuration=");
        sb.append(this.startCallbackDuration);
        sb.append(",streamFirstDataCallbackDuration=");
        sb.append(this.streamFirstDataCallbackDuration);
        sb.append(",streamFirstResCallbackDuration=");
        sb.append(this.streamFirstResCallbackDuration);
        sb.append(",parseStreamFirstDataDuration=");
        sb.append(this.parseStreamFirstDataDuration);
        sb.append(",parseSSEDataDuration=");
        sb.append(this.parseSSEDataDuration);
        sb.append(",copyDataDuration=");
        sb.append(this.copyDataDuration);
        sb.append(",expansionCount=");
        sb.append(this.expansionCount);
        sb.append(",receivedCount=");
        sb.append(this.receivedCount);
        sb.append(",findEndDuration=");
        sb.append(this.findEndDuration);
        sb.append(",receivedNetDuration=");
        sb.append(this.receivedNetDuration);
        sb.append(",h5LoginTimeout=");
        sb.append(this.h5LoginTimeout);
        sb.append(",h5LoginTime=");
        sb.append(this.h5LoginTime);
        sb.append(",unitCalibration=");
        sb.append(this.unitCalibration);
        sb.append(",isLoginRedo=");
        sb.append(this.isLoginRedo);
        if (this.netStats != null) {
            sb.append(",");
            if (StringUtils.isBlank(this.netStats.netStatSum)) {
                sb.append(this.netStats.sumNetStat());
            } else {
                sb.append(this.netStats.netStatSum);
            }
        }
        this.statSum = sb.toString();
        if (this.commitStat && !this.isNoNetwork) {
            if (MtopUtils.isMainThread()) {
                MtopSDKThreadPoolExecutorFactory.submit(new Runnable() { // from class: mtopsdk.mtop.util.MtopStatistics.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            MtopStatistics.access$000(MtopStatistics.this);
                        }
                    }
                });
            } else {
                doCommitStatsTask();
            }
        }
        TBSdkLog.logTraceId(this.clientTraceId, this.serverTraceId);
        if (!TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
            return;
        }
        TBSdkLog.i(TAG, this.seqNo, toString());
    }

    public NetworkStats getNetworkStats() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (NetworkStats) ipChange.ipc$dispatch("9e7f9661", new Object[]{this}) : this.netStats;
    }

    @Deprecated
    public StatisticData getNetStat() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StatisticData) ipChange.ipc$dispatch("d95b02d0", new Object[]{this});
        }
        if (this.netStats == null) {
            return null;
        }
        StatisticData statisticData = new StatisticData();
        statisticData.isRequestSuccess = this.netStats.isRequestSuccess;
        statisticData.connectionType = this.netStats.connectionType;
        statisticData.oneWayTime_ANet = this.netStats.oneWayTime_ANet;
        statisticData.serverRT = this.netStats.serverRT;
        statisticData.totalSize = this.netStats.recvSize;
        return statisticData;
    }

    public long getTotalTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("430f2076", new Object[]{this})).longValue() : this.totalTime;
    }

    public String getStatSum() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a7203278", new Object[]{this});
        }
        if (this.rbStatData != null) {
            if ("".equals(this.statSum)) {
                return this.rbStatData.getStatSum();
            }
            return this.statSum + "," + this.rbStatData.getStatSum();
        }
        return this.statSum;
    }

    public void commitStatData(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6eef9d8", new Object[]{this, new Boolean(z)});
            return;
        }
        this.commitStat = z;
        if (!this.commitStat || this.isNoNetwork) {
            return;
        }
        if (MtopUtils.isMainThread()) {
            MtopSDKThreadPoolExecutorFactory.submit(new Runnable() { // from class: mtopsdk.mtop.util.MtopStatistics.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        MtopStatistics.access$000(MtopStatistics.this);
                    }
                }
            });
        } else {
            doCommitStatsTask();
        }
    }

    private void doCommitStatsTask() {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73ae22c9", new Object[]{this});
        } else if (this.uploadStats == null) {
        } else {
            if (isRegistered.compareAndSet(false, true)) {
                registerMtopStats();
            }
            try {
                HashMap hashMap = new HashMap();
                hashMap.put("api", this.apiKey);
                hashMap.put(a.RESULT_KEY, this.retCode);
                hashMap.put("retType", String.valueOf(this.retType));
                hashMap.put("httpResponseStatus", String.valueOf(this.statusCode));
                hashMap.put("domain", this.domain);
                hashMap.put("reqSource", String.valueOf(this.reqSource));
                hashMap.put("cacheSwitch", String.valueOf(this.cacheSwitch));
                hashMap.put("cacheHitType", String.valueOf(this.cacheHitType));
                hashMap.put("clientTraceId", this.clientTraceId);
                hashMap.put("serverTraceId", this.serverTraceId);
                hashMap.put("pageName", this.pageName);
                hashMap.put("pageUrl", this.pageUrl);
                hashMap.put("backGround", String.valueOf(this.backGround ? 1 : 0));
                hashMap.put("isMain", String.valueOf(this.isMain ? 1 : 0));
                hashMap.put("securityFeature", String.valueOf(RemoteConfig.getInstance().useSecurityAdapter));
                hashMap.put("isPrefetch", String.valueOf(this.isPrefetch ? 1 : 0));
                hashMap.put("prefetchLocalMode", String.valueOf(this.prefetchLocalMode ? 1 : 0));
                hashMap.put("handler", String.valueOf(this.handler ? 1 : 0));
                hashMap.put("instanceId", this.instanceId);
                hashMap.put("switchToPost", String.valueOf(this.hasSwitchToPost ? 1 : 0));
                hashMap.put("isSignDegraded", String.valueOf(this.isSignDegraded ? 1 : 0));
                hashMap.put("cookieDisable", String.valueOf(this.cookieDisable ? 1 : 0));
                hashMap.put(MtopModule.KEY_MTOP_BIZ_TOPIC, this.bizTopic);
                hashMap.put(MtopModule.KEY_PAGE_INDEX, String.valueOf(this.pageIndex));
                hashMap.put("isJsTimeoutEnable", String.valueOf(this.isJsTimeoutEnable ? 1 : 0));
                hashMap.put("bizId", !StringUtils.isEmpty(this.bizIdStr) ? this.bizIdStr : String.valueOf(this.bizId));
                hashMap.put(b.REQUEST_TYPE_STREAM, this.streamRequest ? "1" : "0");
                hashMap.put("streamResponse", this.streamResponse ? "1" : "0");
                hashMap.put("supportStreamJson", this.supportStreamJson ? "1" : "0");
                hashMap.put("upstreamCompress", this.upstreamCompress ? "1" : "0");
                hashMap.put("supportZstdDictionary", this.supportZstdDictionary ? "1" : "0");
                hashMap.put("streamJsonEnable", SwitchConfig.getInstance().isStreamJsonEnable() ? "1" : "0");
                hashMap.put("streamJsonParseObjectEnable", SwitchConfig.getInstance().isStreamJsonParseObjectEnable() ? "1" : "0");
                hashMap.put("ttid", this.ttid);
                hashMap.put("eagleEyeTraceId", this.eagleEyeTraceId);
                hashMap.put("h5LoginTimeout", String.valueOf(this.h5LoginTimeout));
                hashMap.put("oldFCType", String.valueOf(this.oldFCType));
                hashMap.put("bxAction", this.bxAction);
                hashMap.put("location", this.location);
                hashMap.put("unitCalibration", this.unitCalibration ? "1" : "0");
                hashMap.put("isLoginRedo", this.isLoginRedo ? "1" : "0");
                NetworkStats networkStats = getNetworkStats();
                if (networkStats != null) {
                    hashMap.put("connType", networkStats.connectionType);
                    hashMap.put("isSSL", networkStats.isSSL ? "1" : "0");
                    hashMap.put("retryTimes", String.valueOf(networkStats.retryTimes));
                    hashMap.put("ip_port", networkStats.ip_port);
                    hashMap.put("streamParseException", networkStats.streamParseException ? "1" : "0");
                }
                if (Mtop.mIsFullTrackValid) {
                    obj = "instanceId";
                    hashMap.put("launchType", String.valueOf(SceneIdentifier.getStartType()));
                    hashMap.put("appLaunchExternal", SceneIdentifier.isUrlLaunch() ? "1" : "0");
                    obj2 = "pageUrl";
                    obj3 = "pageName";
                    hashMap.put("sinceAppLaunchInterval", String.valueOf(this.bizReqStart - SceneIdentifier.getAppLaunchTime()));
                    hashMap.put("deviceLevel", String.valueOf(SceneIdentifier.getDeviceLevel()));
                    if (SceneIdentifier.getStartType() != 1) {
                        hashMap.put("sinceLastLaunchInternal", String.valueOf((int) (SceneIdentifier.getAppLaunchTime() - SceneIdentifier.getLastLaunchTime())));
                    }
                    String tBSpeedBucket = ABTestCenter.getTBSpeedBucket();
                    if (StringUtils.isEmpty(tBSpeedBucket)) {
                        tBSpeedBucket = "0";
                    }
                    hashMap.put("speedBucket", tBSpeedBucket);
                    String uTABTestBucketId = ABTestCenter.getUTABTestBucketId("mtopsdk");
                    if (StringUtils.isEmpty(uTABTestBucketId)) {
                        uTABTestBucketId = "0";
                    }
                    hashMap.put("speedBucketId", uTABTestBucketId);
                } else {
                    obj = "instanceId";
                    obj2 = "pageUrl";
                    obj3 = "pageName";
                }
                HashMap hashMap2 = new HashMap();
                hashMap2.put("totalTime", Double.valueOf(this.totalTime));
                hashMap2.put("networkExeTime", Double.valueOf(this.netTotalTime));
                hashMap2.put("cacheCostTime", Double.valueOf(this.cacheCostTime));
                hashMap2.put("cacheResponseParseTime", Double.valueOf(this.cacheResponseParseTime));
                hashMap2.put("waitExecuteTime", Double.valueOf(this.waitExecuteTime));
                hashMap2.put("waitCallbackTime", Double.valueOf(this.waitCallbackTime));
                hashMap2.put("waitExecute2BuildParamTime", Double.valueOf(this.waitExecute2BuildParamTime));
                hashMap2.put("buildParamsTime", Double.valueOf(this.buildParamsTime));
                hashMap2.put("buildParams2NetworkTime", Double.valueOf(this.buildParams2NetworkTime));
                hashMap2.put("startCallBack2EndTime", Double.valueOf(this.startCallBack2EndTime));
                hashMap2.put("signTime", Double.valueOf(this.computeSignTime));
                hashMap2.put("wuaTime", Double.valueOf(this.computeWuaTime));
                hashMap2.put("miniWuaTime", Double.valueOf(this.computeMiniWuaTime));
                hashMap2.put("callbackPocTime", Double.valueOf(this.callbackPocTime));
                hashMap2.put("allTime", Double.valueOf(this.allTime));
                hashMap2.put("requestPocTime", Double.valueOf(this.requestPocTime));
                hashMap2.put("responseCount", Double.valueOf(this.responseCount));
                hashMap2.put("responseValidCount", Double.valueOf(this.responseValidCount));
                hashMap2.put("streamFirstResponseSize", Double.valueOf(this.streamFirstResponseSize));
                hashMap2.put("startCallbackDuration", Double.valueOf(this.startCallbackDuration));
                hashMap2.put("streamFirstDataCallbackDuration", Double.valueOf(this.streamFirstDataCallbackDuration));
                hashMap2.put("startResponseCodeDuration", Double.valueOf(this.startResponseCodeDuration));
                hashMap2.put("streamFirstResCallbackDuration", Double.valueOf(this.streamFirstResCallbackDuration));
                hashMap2.put("parseStreamFirstDataDuration", Double.valueOf(this.parseStreamFirstDataDuration));
                hashMap2.put("parseSSEDataDuration", Double.valueOf(this.parseSSEDataDuration));
                hashMap2.put("copyDataDuration", Double.valueOf(this.copyDataDuration));
                hashMap2.put("expansionCount", Double.valueOf(this.expansionCount));
                hashMap2.put("receivedCount", Double.valueOf(this.receivedCount));
                hashMap2.put("findEndDuration", Double.valueOf(this.findEndDuration));
                hashMap2.put("receivedNetDuration", Double.valueOf(this.receivedNetDuration));
                hashMap2.put("h5LoginTime", Double.valueOf(this.h5LoginTime));
                if (networkStats != null) {
                    hashMap2.put("processTime", Double.valueOf(networkStats.processTime));
                    hashMap2.put("firstDataTime", Double.valueOf(networkStats.firstDataTime));
                    hashMap2.put("recDataTime", Double.valueOf(networkStats.recDataTime));
                    hashMap2.put("oneWayTime_ANet", Double.valueOf(networkStats.oneWayTime_ANet));
                    hashMap2.put("serverRT", Double.valueOf(networkStats.serverRT));
                    hashMap2.put("revSize", Double.valueOf(networkStats.recvSize));
                    hashMap2.put("dataSpeed", Double.valueOf(networkStats.dataSpeed));
                    hashMap2.put("streamParseTime", Double.valueOf(networkStats.streamParseTime));
                    hashMap2.put("streamParseSize", Double.valueOf(networkStats.streamParseSize));
                }
                if (this.rbStatData != null) {
                    hashMap2.put("rbReqTime", Double.valueOf(this.rbStatData.rbReqTime));
                    hashMap2.put("toMainThTime", Double.valueOf(this.rbStatData.toMainThTime));
                    hashMap2.put("mtopDispatchTime", Double.valueOf(this.rbStatData.mtopDispatchTime));
                    hashMap2.put("bizCallbackTime", Double.valueOf(this.rbStatData.bizCallbackTime));
                    hashMap2.put("mtopJsonParseTime", Double.valueOf(this.rbStatData.jsonParseTime));
                    hashMap2.put("mtopReqTime", Double.valueOf(this.rbStatData.mtopReqTime));
                    hashMap2.put("streamFirstResToMainThTime", Double.valueOf(this.rbStatData.streamFirstResToMainThTime));
                }
                if (this.uploadStats != null) {
                    this.uploadStats.onCommit("mtopsdk", MTOP_STATS_MONITOR_POINT, hashMap, hashMap2);
                }
                if (!ErrorConstant.isSuccess(this.retCode)) {
                    HashMap hashMap3 = new HashMap();
                    hashMap3.put("api", this.apiKey);
                    hashMap3.put(a.RESULT_KEY, this.retCode);
                    hashMap3.put("retType", String.valueOf(this.retType));
                    hashMap3.put("reqSource", String.valueOf(this.reqSource));
                    hashMap3.put(arz.KEY_MAPPING_CODE, this.mappingCode);
                    hashMap3.put("httpResponseStatus", String.valueOf(this.statusCode));
                    obj5 = "domain";
                    hashMap3.put(obj5, this.domain);
                    hashMap3.put("refer", this.pageUrl);
                    hashMap3.put("clientTraceId", this.clientTraceId);
                    hashMap3.put("serverTraceId", this.serverTraceId);
                    obj4 = obj3;
                    hashMap3.put(obj4, this.pageName);
                    hashMap3.put(obj2, this.pageUrl);
                    hashMap3.put("backGround", String.valueOf(this.backGround ? 1 : 0));
                    hashMap3.put("isMain", String.valueOf(this.isMain ? 1 : 0));
                    hashMap3.put("securityFeature", String.valueOf(RemoteConfig.getInstance().useSecurityAdapter));
                    hashMap3.put("isPrefetch", String.valueOf(this.isPrefetch ? 1 : 0));
                    hashMap3.put("prefetchLocalMode", String.valueOf(this.prefetchLocalMode ? 1 : 0));
                    obj6 = obj;
                    hashMap3.put(obj6, this.instanceId);
                    hashMap3.put("switchToPost", String.valueOf(this.hasSwitchToPost ? 1 : 0));
                    hashMap3.put("isSignDegraded", String.valueOf(this.isSignDegraded ? 1 : 0));
                    hashMap3.put("isJsTimeoutEnable", String.valueOf(this.isJsTimeoutEnable ? 1 : 0));
                    if (this.uploadStats != null) {
                        this.uploadStats.onCommit("mtopsdk", MTOP_EXCEPTIONS_MONITOR_POINT, hashMap3, null);
                    }
                    if (this.retType != 0 && this.mtopStatsListener != null) {
                        hashMap3.put("seqNo", this.seqNo);
                        try {
                            this.mtopStatsListener.onStats(hashMap3);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                } else {
                    obj4 = obj3;
                    obj5 = "domain";
                    obj6 = obj;
                }
                if (this.statusCode == 419 || this.statusCode == 420) {
                    HashMap hashMap4 = new HashMap();
                    hashMap4.put("bizId", !StringUtils.isEmpty(this.bizIdStr) ? this.bizIdStr : String.valueOf(this.bizId));
                    hashMap4.put("pTraceId", this.pTraceId);
                    hashMap4.put("api", this.apiKey);
                    hashMap4.put("version", this.apiKey);
                    hashMap4.put(obj5, this.domain);
                    hashMap4.put("httpResponseStatus", String.valueOf(this.statusCode));
                    hashMap4.put(a.RESULT_KEY, this.retCode);
                    hashMap4.put("bxSessionId", this.bxSessionId);
                    hashMap4.put("bxUI", String.valueOf(this.bxUI));
                    hashMap4.put("bxMainAction", String.valueOf(this.bxMainAction));
                    hashMap4.put("bxSubAction", String.valueOf(this.bxSubAction));
                    hashMap4.put("bxRetry", String.valueOf(this.bxRetry));
                    hashMap4.put(obj6, this.instanceId);
                    hashMap4.put(obj4, this.pageName);
                    hashMap4.put(obj2, this.pageUrl);
                    HashMap hashMap5 = new HashMap();
                    hashMap5.put("bxSleep", Double.valueOf(this.bxSleep));
                    hashMap5.put("checkTime", Double.valueOf(this.fcProcessCheckEndTime - this.fcProcessCheckStartTime));
                    hashMap5.put("processTime", Double.valueOf(this.fcProcessCallbackTime - this.fcProcessStartTime));
                    if (this.uploadStats != null) {
                        this.uploadStats.onCommit("mtopsdk", MTOP_BX_ACTION_POINT, hashMap4, hashMap5);
                    }
                }
                commitJsonStat();
                this.commitStat = false;
            } catch (Throwable th) {
                this.commitStat = false;
                throw th;
            }
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder(128);
        sb.append("MtopStatistics ");
        sb.append(hashCode());
        sb.append("[SumStat(ms)]:");
        sb.append(this.statSum);
        if (this.rbStatData != null) {
            sb.append(" [rbStatData]:");
            sb.append(this.rbStatData);
        }
        return sb.toString();
    }

    public synchronized RbStatisticData getRbStatData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RbStatisticData) ipChange.ipc$dispatch("4c3525e6", new Object[]{this});
        }
        if (this.rbStatData == null) {
            this.rbStatData = new RbStatisticData();
        }
        return this.rbStatData;
    }

    public Object clone() throws CloneNotSupportedException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("78b3604e", new Object[]{this}) : super.clone();
    }

    private void registerMtopStats() {
        String str;
        String str2;
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e19d6db", new Object[]{this});
            return;
        }
        try {
            if (this.uploadStats == null) {
                TBSdkLog.e(TAG, this.seqNo, "[registerMtopStats]register MtopStats error, uploadStats=null");
                return;
            }
            HashSet hashSet = new HashSet();
            hashSet.add("api");
            hashSet.add("domain");
            hashSet.add("httpResponseStatus");
            hashSet.add(a.RESULT_KEY);
            hashSet.add("retType");
            hashSet.add("reqSource");
            hashSet.add("cacheSwitch");
            hashSet.add("cacheHitType");
            hashSet.add("clientTraceId");
            hashSet.add("serverTraceId");
            hashSet.add("connType");
            hashSet.add("isSSL");
            hashSet.add("retryTimes");
            hashSet.add("ip_port");
            hashSet.add("pageName");
            hashSet.add("pageUrl");
            hashSet.add("backGround");
            hashSet.add("isMain");
            hashSet.add("isPrefetch");
            hashSet.add("prefetchLocalMode");
            hashSet.add("handler");
            hashSet.add("instanceId");
            hashSet.add("switchToPost");
            try {
                hashSet.add("isSignDegraded");
                hashSet.add("cookieDisable");
                hashSet.add(MtopModule.KEY_MTOP_BIZ_TOPIC);
                hashSet.add(MtopModule.KEY_PAGE_INDEX);
                hashSet.add("isJsTimeoutEnable");
                hashSet.add("bizId");
                hashSet.add(b.REQUEST_TYPE_STREAM);
                hashSet.add("streamResponse");
                hashSet.add("supportStreamJson");
                hashSet.add("upstreamCompress");
                hashSet.add("supportZstdDictionary");
                hashSet.add("streamJsonEnable");
                hashSet.add("streamJsonParseObjectEnable");
                hashSet.add("streamParseException");
                hashSet.add("ttid");
                hashSet.add("eagleEyeTraceId");
                hashSet.add("h5LoginTimeout");
                hashSet.add("oldFCType");
                hashSet.add("bxAction");
                hashSet.add("location");
                hashSet.add("unitCalibration");
                hashSet.add("isLoginRedo");
                hashSet.add("launchType");
                hashSet.add("appLaunchExternal");
                hashSet.add("sinceAppLaunchInterval");
                hashSet.add("deviceLevel");
                hashSet.add("sinceLastLaunchInternal");
                hashSet.add("securityFeature");
                hashSet.add("speedBucket");
                hashSet.add("speedBucketId");
                HashSet hashSet2 = new HashSet();
                hashSet2.add("totalTime");
                hashSet2.add("waitExecuteTime");
                hashSet2.add("waitExecute2BuildParamTime");
                hashSet2.add("buildParamsTime");
                hashSet2.add("buildParams2NetworkTime");
                hashSet2.add("networkExeTime");
                hashSet2.add("waitCallbackTime");
                hashSet2.add("startCallBack2EndTime");
                hashSet2.add("cacheCostTime");
                hashSet2.add("cacheResponseParseTime");
                hashSet2.add("signTime");
                hashSet2.add("wuaTime");
                hashSet2.add("miniWuaTime");
                hashSet2.add("requestPocTime");
                hashSet2.add("callbackPocTime");
                hashSet2.add("allTime");
                hashSet2.add("responseCount");
                hashSet2.add("responseValidCount");
                hashSet2.add("streamFirstResponseSize");
                hashSet2.add("startCallbackDuration");
                hashSet2.add("streamFirstDataCallbackDuration");
                hashSet2.add("startResponseCodeDuration");
                hashSet2.add("streamFirstResCallbackDuration");
                hashSet2.add("parseStreamFirstDataDuration");
                hashSet2.add("parseSSEDataDuration");
                hashSet2.add("copyDataDuration");
                hashSet2.add("expansionCount");
                hashSet2.add("receivedCount");
                hashSet2.add("findEndDuration");
                hashSet2.add("receivedNetDuration");
                hashSet2.add("h5LoginTime");
                hashSet2.add("rbReqTime");
                hashSet2.add("toMainThTime");
                hashSet2.add("mtopDispatchTime");
                hashSet2.add("bizCallbackTime");
                hashSet2.add("mtopJsonParseTime");
                hashSet2.add("mtopReqTime");
                hashSet2.add("streamFirstResToMainThTime");
                hashSet2.add("processTime");
                hashSet2.add("firstDataTime");
                hashSet2.add("recDataTime");
                hashSet2.add("revSize");
                hashSet2.add("dataSpeed");
                hashSet2.add("oneWayTime_ANet");
                hashSet2.add("serverRT");
                hashSet2.add("streamParseTime");
                hashSet2.add("streamParseSize");
                if (this.uploadStats != null) {
                    this.uploadStats.onRegister("mtopsdk", MTOP_STATS_MONITOR_POINT, hashSet, hashSet2, false);
                }
                HashSet hashSet3 = new HashSet();
                hashSet3.add("api");
                hashSet3.add("domain");
                hashSet3.add(a.RESULT_KEY);
                hashSet3.add("retType");
                hashSet3.add("reqSource");
                hashSet3.add(arz.KEY_MAPPING_CODE);
                hashSet3.add("httpResponseStatus");
                hashSet3.add("refer");
                hashSet3.add("clientTraceId");
                hashSet3.add("serverTraceId");
                hashSet3.add("pageName");
                hashSet3.add("pageUrl");
                hashSet3.add("backGround");
                hashSet3.add("securityFeature");
                hashSet3.add("instanceId");
                hashSet3.add("switchToPost");
                if (this.uploadStats != null) {
                    this.uploadStats.onRegister("mtopsdk", MTOP_EXCEPTIONS_MONITOR_POINT, hashSet3, null, false);
                }
                HashSet hashSet4 = new HashSet();
                hashSet4.add("bizId");
                hashSet4.add("pTraceId");
                hashSet4.add("api");
                hashSet4.add("version");
                hashSet4.add("domain");
                hashSet4.add("httpResponseStatus");
                hashSet4.add(a.RESULT_KEY);
                hashSet4.add("bxSessionId");
                hashSet4.add("bxUI");
                hashSet4.add("bxMainAction");
                hashSet4.add("bxSubAction");
                hashSet4.add("bxRetry");
                hashSet4.add("instanceId");
                hashSet4.add("pageName");
                hashSet4.add("pageUrl");
                HashSet hashSet5 = new HashSet();
                hashSet5.add("bxSleep");
                hashSet5.add("checkTime");
                hashSet5.add("processTime");
                if (this.uploadStats != null) {
                    this.uploadStats.onRegister("mtopsdk", MTOP_BX_ACTION_POINT, hashSet4, hashSet5, false);
                }
                str2 = this.seqNo;
                str3 = "[registerMtopStats]register MtopStats executed.uploadStats=" + this.uploadStats;
                str = TAG;
            } catch (Throwable th) {
                th = th;
                str = TAG;
            }
            try {
                TBSdkLog.i(str, str2, str3);
            } catch (Throwable th2) {
                th = th2;
                TBSdkLog.e(str, this.seqNo, "[registerMtopStats] register MtopStats error ---" + th.toString());
            }
        } catch (Throwable th3) {
            th = th3;
            str = TAG;
        }
    }

    /* loaded from: classes.dex */
    public class RbStatisticData implements Cloneable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public long afterReqTime;
        public long beforeReqTime;
        public long bizCallbackTime;
        public int isCache;
        public long jsonParseTime;
        @Deprecated
        public long jsonTime;
        public long mtopDispatchTime;
        public long mtopReqTime;
        public long parseTime;
        public long rbReqTime;
        public long streamFirstResToMainThTime;
        public long toMainThTime;
        @Deprecated
        public long totalTime;

        static {
            kge.a(1432539668);
            kge.a(-723128125);
        }

        private RbStatisticData() {
            this.isCache = 0;
        }

        public String getStatSum() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("a7203278", new Object[]{this});
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("rbReqTime=");
            sb.append(this.rbReqTime);
            sb.append(",mtopReqTime=");
            sb.append(this.mtopReqTime);
            sb.append(",mtopJsonParseTime=");
            sb.append(this.jsonParseTime);
            sb.append(",toMainThTime=");
            sb.append(this.toMainThTime);
            sb.append(",mtopDispatchTime=");
            sb.append(this.mtopDispatchTime);
            sb.append(",bizCallbackTime=");
            sb.append(this.bizCallbackTime);
            sb.append(",isCache=");
            sb.append(this.isCache);
            sb.append(",streamFirstResToMainThTime=");
            sb.append(this.streamFirstResToMainThTime);
            return sb.toString();
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            StringBuilder sb = new StringBuilder(64);
            sb.append("rbReqTime=");
            sb.append(this.rbReqTime);
            sb.append(",mtopReqTime=");
            sb.append(this.mtopReqTime);
            sb.append(",mtopJsonParseTime=");
            sb.append(this.jsonParseTime);
            sb.append(",toMainThTime=");
            sb.append(this.toMainThTime);
            sb.append(",mtopDispatchTime=");
            sb.append(this.mtopDispatchTime);
            sb.append(",bizCallbackTime=");
            sb.append(this.bizCallbackTime);
            sb.append(",isCache=");
            sb.append(this.isCache);
            sb.append(",beforeReqTime=");
            sb.append(this.beforeReqTime);
            sb.append(",afterReqTime=");
            sb.append(this.afterReqTime);
            sb.append(",parseTime=");
            sb.append(this.parseTime);
            sb.append(",streamFirstResToMainThTime=");
            sb.append(this.streamFirstResToMainThTime);
            return sb.toString();
        }

        public Object clone() throws CloneNotSupportedException {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("78b3604e", new Object[]{this}) : super.clone();
        }
    }

    public void formatStartLog() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfa478a0", new Object[]{this});
        } else if (this.seqNo == null) {
        } else {
            TBSdkLog.e("mtopsdk", this.seqNo, "[falcoId:" + this.falcoId + "] |start");
            tms.a("mtop", this.apiKey, this.intSeqNo);
        }
    }

    public void formatEndLog() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f36ce3c7", new Object[]{this});
        } else if (this.seqNo == null) {
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("[falcoId:");
            sb.append(this.falcoId);
            sb.append("] ");
            sb.append("|");
            sb.append("MtopStatistics,");
            sb.append(this.statSum);
            TBSdkLog.e("mtopsdk", this.seqNo, sb.toString());
            FullTraceHelper.recordFinish(this.openTraceSpan, sb.toString());
            tms.b("mtop", this.apiKey, this.intSeqNo);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0042 A[Catch: Throwable -> 0x024d, TryCatch #0 {Throwable -> 0x024d, blocks: (B:10:0x001a, B:12:0x0028, B:15:0x002d, B:19:0x0034, B:21:0x003a, B:23:0x0042, B:25:0x004b, B:27:0x0089, B:31:0x0090, B:34:0x0098, B:35:0x009a, B:37:0x00a0, B:38:0x00a8, B:40:0x00ac, B:42:0x00b6, B:44:0x00bd, B:48:0x00ce, B:50:0x00d8, B:52:0x00dc, B:53:0x00e4, B:55:0x00f8, B:57:0x00fe, B:59:0x0118, B:60:0x011f, B:62:0x014f, B:63:0x016e, B:67:0x0197, B:71:0x01a7, B:74:0x01b5, B:76:0x01fa, B:78:0x01fe, B:79:0x0214, B:81:0x0218, B:82:0x021d, B:84:0x0223, B:85:0x0232, B:87:0x0236, B:90:0x023b, B:95:0x0249, B:43:0x00bb, B:24:0x0045, B:20:0x0037), top: B:99:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0045 A[Catch: Throwable -> 0x024d, TryCatch #0 {Throwable -> 0x024d, blocks: (B:10:0x001a, B:12:0x0028, B:15:0x002d, B:19:0x0034, B:21:0x003a, B:23:0x0042, B:25:0x004b, B:27:0x0089, B:31:0x0090, B:34:0x0098, B:35:0x009a, B:37:0x00a0, B:38:0x00a8, B:40:0x00ac, B:42:0x00b6, B:44:0x00bd, B:48:0x00ce, B:50:0x00d8, B:52:0x00dc, B:53:0x00e4, B:55:0x00f8, B:57:0x00fe, B:59:0x0118, B:60:0x011f, B:62:0x014f, B:63:0x016e, B:67:0x0197, B:71:0x01a7, B:74:0x01b5, B:76:0x01fa, B:78:0x01fe, B:79:0x0214, B:81:0x0218, B:82:0x021d, B:84:0x0223, B:85:0x0232, B:87:0x0236, B:90:0x023b, B:95:0x0249, B:43:0x00bb, B:24:0x0045, B:20:0x0037), top: B:99:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0098 A[Catch: Throwable -> 0x024d, TRY_ENTER, TryCatch #0 {Throwable -> 0x024d, blocks: (B:10:0x001a, B:12:0x0028, B:15:0x002d, B:19:0x0034, B:21:0x003a, B:23:0x0042, B:25:0x004b, B:27:0x0089, B:31:0x0090, B:34:0x0098, B:35:0x009a, B:37:0x00a0, B:38:0x00a8, B:40:0x00ac, B:42:0x00b6, B:44:0x00bd, B:48:0x00ce, B:50:0x00d8, B:52:0x00dc, B:53:0x00e4, B:55:0x00f8, B:57:0x00fe, B:59:0x0118, B:60:0x011f, B:62:0x014f, B:63:0x016e, B:67:0x0197, B:71:0x01a7, B:74:0x01b5, B:76:0x01fa, B:78:0x01fe, B:79:0x0214, B:81:0x0218, B:82:0x021d, B:84:0x0223, B:85:0x0232, B:87:0x0236, B:90:0x023b, B:95:0x0249, B:43:0x00bb, B:24:0x0045, B:20:0x0037), top: B:99:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a0 A[Catch: Throwable -> 0x024d, TryCatch #0 {Throwable -> 0x024d, blocks: (B:10:0x001a, B:12:0x0028, B:15:0x002d, B:19:0x0034, B:21:0x003a, B:23:0x0042, B:25:0x004b, B:27:0x0089, B:31:0x0090, B:34:0x0098, B:35:0x009a, B:37:0x00a0, B:38:0x00a8, B:40:0x00ac, B:42:0x00b6, B:44:0x00bd, B:48:0x00ce, B:50:0x00d8, B:52:0x00dc, B:53:0x00e4, B:55:0x00f8, B:57:0x00fe, B:59:0x0118, B:60:0x011f, B:62:0x014f, B:63:0x016e, B:67:0x0197, B:71:0x01a7, B:74:0x01b5, B:76:0x01fa, B:78:0x01fe, B:79:0x0214, B:81:0x0218, B:82:0x021d, B:84:0x0223, B:85:0x0232, B:87:0x0236, B:90:0x023b, B:95:0x0249, B:43:0x00bb, B:24:0x0045, B:20:0x0037), top: B:99:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void commitFullTrace() {
        /*
            Method dump skipped, instructions count: 600
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: mtopsdk.mtop.util.MtopStatistics.commitFullTrace():void");
    }

    private void registerH5SiteStats() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44c6892f", new Object[]{this});
            return;
        }
        HashSet hashSet = new HashSet();
        hashSet.add("instanceId");
        hashSet.add(MtopJSBridge.MtopJSParam.ACCOUNT_SITE);
        hashSet.add("requestDomain");
        hashSet.add(i.CDN_REQUEST_TYPE);
        hashSet.add("returnType");
        hashSet.add("allTime");
        IUploadStats iUploadStats = this.uploadStats;
        if (iUploadStats == null) {
            return;
        }
        iUploadStats.onRegister("mtopsdk", MTOP_H5_SITE_MONITOR_POINT, hashSet, null, false);
    }

    private void commitH5SiteStats(MtopStatistics mtopStatistics) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86a5397c", new Object[]{this, mtopStatistics});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("instanceId", mtopStatistics.instanceId);
        hashMap.put(MtopJSBridge.MtopJSParam.ACCOUNT_SITE, mtopStatistics.accountSite);
        hashMap.put("requestDomain", mtopStatistics.configReqDomain);
        hashMap.put(i.CDN_REQUEST_TYPE, String.valueOf(mtopStatistics.configRequestType));
        hashMap.put("returnType", String.valueOf(mtopStatistics.configReturnType));
        hashMap.put("allTime", String.valueOf(mtopStatistics.configReqFinishTime - mtopStatistics.configReqStartTime));
        IUploadStats iUploadStats = this.uploadStats;
        if (iUploadStats == null) {
            return;
        }
        iUploadStats.onCommit("mtopsdk", MTOP_H5_SITE_MONITOR_POINT, hashMap, null);
    }

    private void registerJsonStat() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e51cd026", new Object[]{this});
            return;
        }
        HashSet hashSet = new HashSet();
        hashSet.add("api");
        hashSet.add("topic");
        hashSet.add("parseType");
        hashSet.add("deviceLevel");
        HashSet hashSet2 = new HashSet();
        hashSet2.add(StEvent.PARSE_TIME);
        hashSet2.add("parseSize");
        hashSet2.add("recDataTime");
        IUploadStats iUploadStats = this.uploadStats;
        if (iUploadStats == null) {
            return;
        }
        iUploadStats.onRegister("mtopsdk", MTOP_JSON_MONITOR_POINT, hashSet, hashSet2, false);
    }

    private void commitJsonStat() {
        long j;
        long j2;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12988cba", new Object[]{this});
            return;
        }
        if (isJsonRegistered.compareAndSet(false, true)) {
            registerJsonStat();
        }
        if (!this.supportStreamJson) {
            return;
        }
        NetworkStats networkStats = this.netStats;
        long j3 = -1;
        if (networkStats != null) {
            j3 = networkStats.streamParseTime;
            if (j3 < 0) {
                return;
            }
            j = this.netStats.streamParseSize;
            j2 = this.netStats.recDataTime;
        } else {
            j = -1;
            j2 = -1;
        }
        if (SwitchConfig.getInstance().isStreamJsonEnable()) {
            str = "stream-json";
        } else if (SwitchConfig.getInstance().isFastJson2Enable()) {
            str = "fast-json2";
        } else if (!SwitchConfig.getInstance().isFastJson1Enable()) {
            return;
        } else {
            str = "fast-json1";
        }
        HashMap hashMap = new HashMap();
        hashMap.put("api", this.apiKey);
        hashMap.put("topic", this.bizTopic);
        hashMap.put("parseType", str);
        hashMap.put("deviceLevel", String.valueOf(SceneIdentifier.getDeviceLevel()));
        HashMap hashMap2 = new HashMap();
        if (this.netStats != null) {
            hashMap2.put(StEvent.PARSE_TIME, Double.valueOf(j3));
            hashMap2.put("parseSize", Double.valueOf(j));
            hashMap2.put("recDataTime", Double.valueOf(j2));
        }
        IUploadStats iUploadStats = this.uploadStats;
        if (iUploadStats == null) {
            return;
        }
        iUploadStats.onCommit("mtopsdk", MTOP_JSON_MONITOR_POINT, hashMap, hashMap2);
    }

    public void commitCustomStatData(int i, MtopStatistics mtopStatistics) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a1a69f7", new Object[]{this, new Integer(i), mtopStatistics});
        } else if (i != 0) {
        } else {
            if (isH5SiteRegistered.compareAndSet(false, true)) {
                registerH5SiteStats();
            }
            commitH5SiteStats(mtopStatistics);
        }
    }

    public void commitSiteTypeMonitorPoint(Map<String, String> map, Set<String> set) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62ac694f", new Object[]{this, map, set});
            return;
        }
        if (isSiteTypeRegistered.compareAndSet(false, true)) {
            registerMtopSiteType(set);
        }
        IUploadStats iUploadStats = this.uploadStats;
        if (iUploadStats == null) {
            return;
        }
        iUploadStats.onCommit("mtopsdk", MTOP_SITE_MONITOR_POINT, map, null);
    }

    private void registerMtopSiteType(Set<String> set) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aac3688c", new Object[]{this, set});
            return;
        }
        try {
            if (this.uploadStats == null) {
                TBSdkLog.e(TAG, this.seqNo, "[registerMtopSite]register MtopSite error, uploadStats=null");
            } else if (this.uploadStats == null) {
            } else {
                this.uploadStats.onRegister("mtopsdk", MTOP_SITE_MONITOR_POINT, set, null, false);
            }
        } catch (Throwable th) {
            String str = this.seqNo;
            TBSdkLog.e(TAG, str, "[registerMtopSite] register MtopSite error ---" + th.toString());
        }
    }

    public void parseServerStat(Map<String, List<String>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("361e2c94", new Object[]{this, map});
            return;
        }
        try {
            String singleHeaderFieldByKey = HeaderHandlerUtil.getSingleHeaderFieldByKey(map, "s-rt");
            if (!StringUtils.isBlank(singleHeaderFieldByKey)) {
                this.serverRT = Long.parseLong(singleHeaderFieldByKey);
            }
            String singleHeaderFieldByKey2 = HeaderHandlerUtil.getSingleHeaderFieldByKey(map, "s-brt");
            if (!StringUtils.isBlank(singleHeaderFieldByKey2)) {
                this.serverBizRT = Long.parseLong(singleHeaderFieldByKey2);
            }
            String singleHeaderFieldByKey3 = HeaderHandlerUtil.getSingleHeaderFieldByKey(map, HttpHeaderConstant.SERVER_CUNIT);
            if (StringUtils.isBlank(singleHeaderFieldByKey3)) {
                return;
            }
            this.serverCrossUnit = Integer.parseInt(singleHeaderFieldByKey3);
        } catch (Exception e) {
            String str = this.seqNo;
            TBSdkLog.e(TAG, str, "[parseServerStat]error ---" + e.toString());
        }
    }
}
