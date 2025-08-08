package anet.channel.statist;

import mtopsdk.common.util.StringUtils;
import anet.channel.AwcnConfig;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.entity.ConnType;
import anet.channel.fulltrace.IFullTraceAnalysisV3;
import anet.channel.session.okhttp.OkHttpConnector;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.util.AppLifecycle;
import anet.channel.util.Inet64Util;
import anet.channel.util.Utils;
import com.alipay.android.phone.mobilecommon.verifyidentity.BuildConfig;
import com.alipay.android.phone.mobilesdk.socketcraft.monitor.MonitorItemConstants;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
import tb.kge;
import tb.mto;

@Monitor(module = "networkPrefer", monitorPoint = "network")
/* loaded from: classes.dex */
public class RequestStatistic extends StatObject {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @Dimension
    public String abTestBucket;
    @Dimension
    public volatile String batteryLevel;
    @Dimension
    public volatile String bizId;
    @Dimension
    public String bizReqId;
    @Dimension
    public int bodyDeflatedRet;
    @Dimension
    public volatile String bssid;
    @Dimension
    public String cid;
    public long connTimeoutInterval;
    @Dimension
    public int deviceLevel;
    @Dimension
    public String eagleEyeId;
    @Dimension
    public volatile String f_refer;
    @Dimension
    public String falcoId;
    @Dimension
    public int firstBodyDeflatedRet;
    @Dimension
    public int firstErrorCode;
    @Dimension
    public String firstProtocol;
    @Dimension
    public volatile int globalNetworkQuality;
    @Dimension
    public String harmonyVersion;
    @Dimension
    public String hitCache;
    @Dimension
    public volatile String host;
    public String httpMethod;
    @Dimension
    public volatile String ip;
    @Dimension
    public int ipStackType;
    @Dimension
    public boolean is0RttOptimize;
    @Dimension
    public volatile String isBg;
    @Dimension
    public boolean isComplex;
    @Dimension
    public boolean isComplexEnable;
    @Dimension
    public boolean isFastDegrade;
    @Dimension
    public int isHarmonyOS;
    @Dimension
    public boolean isHitCache;
    @Dimension
    public boolean isHttpDetectEnable;
    @Dimension
    public int isInternalAddr;
    @Dimension
    public boolean isIpv4Degrade;
    @Dimension
    public boolean isMPQuic;
    @Dimension
    public boolean isMultiConnectOpened;
    @Dimension
    public int isOkhttpAvailable;
    @Dimension
    public volatile boolean isProxy;
    public boolean isReqMain;
    public boolean isReqSync;
    @Dimension
    public volatile boolean isSSL;
    @Dimension
    public volatile boolean isSecondRefreshABEnable;
    @Dimension
    public boolean isTunnel;
    @Dimension
    public boolean isUseMPQuic;
    @Dimension
    public volatile boolean isWifi;
    public String locationUrl;
    @Dimension
    public volatile int lowPowerMode;
    @Dimension
    public volatile int maxRetryTime;
    @Dimension
    public String mnc;
    @Dimension
    public int multiNetworkStatus;
    public volatile long netReqStart;
    @Dimension
    public volatile String netType;
    public String pTraceId;
    @Dimension
    public String pageReferer;
    @Dimension
    public volatile int port;
    @Dimension
    public String process;
    @Dimension
    public volatile String protocolType;
    @Dimension
    public volatile String proxyType;
    @Deprecated
    public volatile String quicConnectionID;
    public volatile long reqServiceTransmissionEnd;
    @Dimension
    public volatile int ret;
    @Dimension
    public volatile int retryTimes;
    @Dimension
    public int roaming;
    public volatile long rspCbDispatch;
    public volatile long rspCbEnd;
    public volatile long rspCbStart;
    @Dimension
    public String sessionCloseReason;
    @Dimension
    public long sinceBgTime;
    @Dimension
    public long sinceInitTime;
    @Dimension
    public long sinceLastLaunchTime;
    public long socketTimeoutInterval;
    public IFullTraceAnalysisV3.ISpan span;
    @Dimension
    public String speedBucket;
    @Deprecated
    public String traceId;
    @Dimension
    public String tunnelInfo;
    @Dimension
    public String unit;
    @Dimension(name = MonitorItemConstants.KEY_URL)
    public volatile String url;
    @Dimension
    public int useOkHttp;
    @Dimension
    public String userId;
    public String userInfo;
    @Dimension
    public String via;
    @Dimension
    public String xqcConnEnv;
    @Dimension
    public volatile int ipRefer = 0;
    @Dimension
    public volatile int ipType = 1;
    @Dimension
    public volatile boolean useWifiFgForceCell = false;
    @Dimension
    public volatile boolean isDNS = false;
    @Dimension(name = "errorCode")
    public volatile int statusCode = 0;
    @Dimension(name = "errorMsg")
    public volatile String msg = "";
    @Dimension
    public volatile String contentEncoding = null;
    @Dimension
    public int bodyDeflatedType = -1;
    @Dimension
    public int firstBodyDeflatedType = -1;
    @Dimension
    public long streamId = -1;
    @Dimension
    public int bodyDeflatedRefer = -1;
    @Dimension
    public int md5Ret = -1;
    @Dimension
    public volatile String contentType = null;
    @Dimension
    public volatile String server_cc = null;
    @Dimension
    public volatile String reqContentEncode = "";
    @Dimension
    public volatile int degraded = 0;
    @Dimension
    public volatile StringBuilder errorTrace = null;
    @Dimension
    public double lng = 90000.0d;
    @Dimension
    public double lat = 90000.0d;
    @Dimension
    public float accuracy = -1.0f;
    @Dimension
    public JSONObject extra = null;
    @Dimension
    public int startType = 0;
    @Dimension
    public long sinceNetworkInitTime = 0;
    @Dimension
    public int isFromExternal = 0;
    @Dimension
    public boolean fragmented = false;
    @Dimension
    public int useMultiPath = 0;
    @Dimension
    public int allowMultiPath = 0;
    @Dimension
    public int multiPathOpened = 0;
    @Dimension
    public int mpquicOpened = 0;
    @Dimension
    public volatile int isZstdDictFlag = 0;
    @Dimension
    public volatile int zstdDictABFlag = -1;
    @Dimension
    public volatile int useZstdDict = 0;
    @Dimension
    public String zstddFlag = "";
    @Dimension
    public int useVpnFastDegrade = 0;
    @Dimension
    public int allowVpnFastDegrade = 0;
    @Dimension
    public int deprecatedSessionType = 0;
    @Dimension
    public boolean isNetworkChangeThresholdTime = false;
    @Dimension
    public int isNetworkChangeRequest = GlobalAppRuntimeInfo.NetworkChangeRequestStatus.NONE.ordinal();
    @Dimension
    public int waitConnectStat = -1;
    @Dimension
    public boolean isPreSession = false;
    @Dimension
    public int secondRefreshOpt = -1;
    @Dimension
    public boolean isZstdNotReadyUse = false;
    @Dimension
    public boolean isDetectReq = false;
    @Dimension
    public boolean isSetForceCell = false;
    @Dimension
    public int mpquicStatus = 0;
    @Dimension
    public int forceCellular = 0;
    @Dimension
    public int detectHttp3Status = -1;
    @Dimension
    public int requestBodyCompressRet = -1;
    @Dimension
    public String requestBodyCompressType = BuildConfig.RPC_TYPE_DEF;
    @Dimension
    public String sessionSeq = "";
    public long minRtt = -1;
    public long connInFlight = -1;
    public long recvLimitBps = -1;
    @Dimension
    public int bodyTimeout = 0;
    @Dimension
    public String envinfo4QoS = "";
    @Dimension
    public String envinfo4AsyncDownload = "";
    @Measure
    public volatile int fecRecoverCnt = 0;
    @Measure
    public volatile int fecProtected = 0;
    @Measure
    public volatile long reqHeadInflateSize = 0;
    @Measure
    public volatile long reqBodyInflateSize = 0;
    @Measure
    public volatile long reqHeadDeflateSize = 0;
    @Measure
    public volatile long reqBodyDeflateSize = 0;
    @Measure
    public volatile long rspHeadDeflateSize = 0;
    @Measure
    public volatile long rspBodyDeflateSize = 0;
    @Measure
    public volatile long rspHeadInflateSize = 0;
    @Measure
    public volatile long rspBodyInflateSize = 0;
    @Measure
    public volatile long tnetTotalTime = 0;
    @Measure
    public volatile long streamTotalTime = 0;
    @Measure
    public volatile long streamRecvTime = 0;
    @Measure
    public volatile long retryCostTime = 0;
    @Measure
    public volatile long reqPreProcessTime = 0;
    @Measure
    public volatile long cookieTime = 0;
    @Measure
    public volatile long otherProcessTime = 0;
    @Measure
    public volatile long acceptEncodeTime = 0;
    @Measure
    public volatile long reqPriorityTime = 0;
    @Measure
    public volatile long connWaitTime = 0;
    @Measure
    public volatile long sessionSyncTime = 0;
    @Measure
    public volatile long sessionThreadWaitTime = 0;
    @Measure
    public volatile long httpSessionTime = 0;
    @Measure
    public volatile long sendBeforeTime = 0;
    @Measure
    public volatile long requestTime = 0;
    @Measure
    public volatile long processTime = 0;
    @Measure
    public volatile long sendDataTime = 0;
    @Measure
    public volatile long firstDataTime = 0;
    @Measure
    public volatile long recDataTime = 0;
    @Measure
    public volatile long serverRT = 0;
    @Measure
    public volatile long serverBRT = 0;
    @Measure
    public volatile long cacheTime = 0;
    @Measure
    public volatile long lastProcessTime = 0;
    @Measure
    public volatile long callbackTime = 0;
    @Measure(max = 60000.0d)
    public volatile long oneWayTime = 0;
    @Measure
    public volatile long sendDataSize = 0;
    @Measure
    public volatile long recDataSize = 0;
    @Measure
    public volatile long oneRecMaxDataSize = 0;
    @Deprecated
    public volatile long waitingTime = 0;
    @Measure
    public volatile long serializeTransferTime = 0;
    @Measure
    public volatile long lastRecvDataTime = 0;
    @Measure
    public volatile long rspDecompressionTime = 0;
    @Measure
    public long requestBodyCompressCostTime = 0;
    @Measure
    public volatile long threadStartWaitTime = 0;
    @Measure
    public volatile long interceptorTime = 0;
    @Measure
    public volatile long secInterceptorTime = 0;
    @Measure
    public volatile long privacyInterceptorTime = 0;
    @Measure
    public volatile long responseCbTime = 0;
    @Measure
    public volatile long cbTime = 0;
    @Dimension
    public String timeTrace = "";
    @Dimension
    public String topic = "";
    public long firstChunkTime = 0;
    @Dimension
    public boolean isAddHighThreadCount = false;
    @Dimension
    public boolean isAddRepeatThreadCount = false;
    @Dimension
    public String priority = "";
    @Measure
    public double mpquicSendWeight = 1.0d;
    @Measure
    public double mpquicRecvWeight = 1.0d;
    @Measure
    public long srtt = -1;
    @Measure
    public double pktRetransRate = mto.a.GEO_NOT_SUPPORT;
    @Measure
    public volatile double gaw = mto.a.GEO_NOT_SUPPORT;
    @Measure
    public volatile double gpw = mto.a.GEO_NOT_SUPPORT;
    @Measure
    public volatile double haw = mto.a.GEO_NOT_SUPPORT;
    @Measure
    public volatile double hpw = mto.a.GEO_NOT_SUPPORT;
    public final AtomicBoolean isDone = new AtomicBoolean(false);
    public volatile boolean spdyRequestSend = false;
    public volatile long start = 0;
    public volatile long fisrtStart = 0;
    public volatile long reqStart = 0;
    public volatile long sendStart = 0;
    public volatile long sendEnd = 0;
    public volatile long rspStart = 0;
    public volatile long rspEnd = 0;
    public volatile long contentLength = 0;
    public volatile int tnetErrorCode = 0;
    public volatile long tnetSendStart = 0;
    public volatile long tnetStreamPktSendStart = 0;
    public volatile long tnetStreamPktRecvStart = 0;
    public volatile long tnetStreamRecvStart = 0;
    public volatile long tnetResponseStart = 0;
    public volatile long responseCbStart = 0;
    public volatile int addSecAvailableDict = 0;
    public volatile int mtopZstdDictEnable = 0;
    public String lastInterceptor = null;
    public long lastInterceptorStartTime = -1;
    public boolean isBlockingScene = false;
    @Dimension
    public volatile boolean isVpn = NetworkStatusHelper.isVpn();

    static {
        kge.a(-578313095);
    }

    public RequestStatistic(String str, String str2) {
        int i = 0;
        this.lowPowerMode = -1;
        this.batteryLevel = "";
        this.proxyType = "";
        this.netType = "";
        this.isWifi = false;
        this.bssid = null;
        this.isBg = "";
        this.globalNetworkQuality = -1;
        this.roaming = 0;
        this.mnc = "0";
        this.sinceBgTime = 0L;
        this.isOkhttpAvailable = 0;
        this.multiNetworkStatus = 0;
        this.isHarmonyOS = 0;
        this.userId = "";
        this.isInternalAddr = -1;
        this.host = str;
        this.proxyType = NetworkStatusHelper.getProxyType();
        this.isProxy = !this.proxyType.isEmpty();
        this.netType = NetworkStatusHelper.getNetworkSubType();
        this.isWifi = NetworkStatusHelper.getStatus().isWifi();
        this.bssid = NetworkStatusHelper.getWifiBSSID();
        this.isBg = GlobalAppRuntimeInfo.isAppBackground() ? "bg" : "fg";
        this.globalNetworkQuality = GlobalAppRuntimeInfo.getGlobalNetworkQuality();
        if ("fg".equals(this.isBg)) {
            this.batteryLevel = NetworkStatusHelper.getLowPowerMode();
            this.lowPowerMode = NetworkStatusHelper.isSavePower() ? 1 : 0;
        }
        if ("bg".equals(this.isBg) && AppLifecycle.lastEnterBackgroundTime > 0) {
            this.sinceBgTime = System.currentTimeMillis() - AppLifecycle.lastEnterBackgroundTime;
        }
        this.roaming = NetworkStatusHelper.isRoaming() ? 1 : 0;
        this.mnc = NetworkStatusHelper.getSimOp();
        this.bizId = str2;
        this.ipStackType = Inet64Util.getStackType();
        this.isHttpDetectEnable = AwcnConfig.isHttpDetectEnable();
        this.multiNetworkStatus = NetworkStatusHelper.getCellularNetwork() != null ? 1 : i;
        if (Utils.isHarmonyOS()) {
            this.isHarmonyOS = 1;
            this.harmonyVersion = Utils.getHarmonyVersion();
        }
        this.isComplexEnable = AwcnConfig.isComplexConnectEnable();
        this.isMultiConnectOpened = AwcnConfig.isMultiConnectOpened();
        this.isOkhttpAvailable = OkHttpConnector.checkEnvAvailable() ? 1 : 0;
        this.userId = GlobalAppRuntimeInfo.getUserId();
        this.isInternalAddr = NetworkStatusHelper.isInternalAddr() ? 1 : 0;
        this.isSecondRefreshABEnable = AwcnConfig.isSecondRefreshABEnable();
    }

    public void setConnType(ConnType connType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("140df20b", new Object[]{this, connType});
            return;
        }
        this.isSSL = connType.isSSL();
        this.protocolType = connType.toString();
    }

    public String getTimeTrace() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("975e2477", new Object[]{this});
        }
        return this.start + "-" + this.sendStart + "-" + this.tnetSendStart + "-" + this.tnetStreamPktSendStart + "-" + this.tnetStreamPktRecvStart + "-" + this.tnetStreamRecvStart + "-" + this.tnetResponseStart + "-" + this.rspStart + "-" + this.responseCbStart + "-" + this.rspEnd;
    }

    public void setIPAndPort(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c4efc03", new Object[]{this, str, new Integer(i)});
            return;
        }
        this.ip = str;
        this.port = i;
        if (str != null) {
            this.isDNS = true;
        }
        if (this.retryTimes != 0 || str == null) {
            return;
        }
        putExtra("firstIp", str);
    }

    public void setIpInfo(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5dffb5e", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.ipRefer = i;
        this.ipType = i2;
    }

    public void appendErrorTrace(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15ceb628", new Object[]{this, str});
            return;
        }
        if (this.errorTrace == null) {
            this.errorTrace = new StringBuilder();
        }
        if (this.errorTrace.length() != 0) {
            this.errorTrace.append(",");
        }
        StringBuilder sb = this.errorTrace;
        sb.append(str);
        sb.append("=");
        sb.append(System.currentTimeMillis() - this.reqStart);
    }

    public void recordRedirect(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35653c39", new Object[]{this, new Integer(i), str});
            return;
        }
        this.url = str;
        appendErrorTrace(String.valueOf(i));
        long currentTimeMillis = System.currentTimeMillis();
        this.retryCostTime += currentTimeMillis - this.start;
        this.start = currentTimeMillis;
    }

    public void putExtra(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c83a756e", new Object[]{this, str, obj});
            return;
        }
        try {
            if (this.extra == null) {
                this.extra = new JSONObject();
            }
            this.extra.put(str, obj);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public synchronized void setNetworkChangeRequest(long j, long j2, GlobalAppRuntimeInfo.NetworkChangeRequestStatus networkChangeRequestStatus) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("971c9cc9", new Object[]{this, new Long(j), new Long(j2), networkChangeRequestStatus});
            return;
        }
        if (this.isNetworkChangeRequest == GlobalAppRuntimeInfo.NetworkChangeRequestStatus.NONE.ordinal() || this.isNetworkChangeRequest == GlobalAppRuntimeInfo.NetworkChangeRequestStatus.NO.ordinal()) {
            long networkStatusChangedTime = GlobalAppRuntimeInfo.getNetworkStatusChangedTime();
            if (networkStatusChangedTime != 0 && j != 0 && j2 != 0 && networkStatusChangedTime >= j && networkStatusChangedTime <= j2) {
                this.isNetworkChangeRequest = networkChangeRequestStatus.ordinal();
                return;
            }
            this.isNetworkChangeRequest = GlobalAppRuntimeInfo.NetworkChangeRequestStatus.NO.ordinal();
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder(256);
        sb.append("[RequestStatistic]ret=");
        sb.append(this.ret);
        sb.append(",statusCode=");
        sb.append(this.statusCode);
        sb.append(",msg=");
        sb.append(this.msg);
        sb.append(",bizId=");
        sb.append(this.bizId);
        sb.append(",bizReqId=");
        sb.append(this.bizReqId);
        sb.append(",host=");
        sb.append(this.host);
        sb.append(",ipRefer=");
        sb.append(this.ipRefer);
        sb.append(",ip=");
        sb.append(this.ip);
        sb.append(",port=");
        sb.append(this.port);
        sb.append(",protocolType=");
        sb.append(this.protocolType);
        sb.append(",retryTime=");
        sb.append(this.retryTimes);
        sb.append(",retryCostTime=");
        sb.append(this.retryCostTime);
        sb.append(",threadStartWaitTime=");
        sb.append(this.threadStartWaitTime);
        sb.append(",interceptorTime=");
        sb.append(this.interceptorTime);
        sb.append(",processTime=");
        sb.append(this.processTime);
        sb.append(",connWaitTime=");
        sb.append(this.connWaitTime);
        sb.append(",cacheTime=");
        sb.append(this.cacheTime);
        sb.append(",sendDataTime=");
        sb.append(this.sendDataTime);
        sb.append(",firstDataTime=");
        sb.append(this.firstDataTime);
        sb.append(",recDataTime=");
        sb.append(this.recDataTime);
        sb.append(",lastProcessTime=");
        sb.append(this.lastProcessTime);
        sb.append(",lastRecvDataTime=");
        sb.append(this.lastRecvDataTime);
        sb.append(",oneWayTime=");
        sb.append(this.oneWayTime);
        sb.append(",callbackTime=");
        sb.append(this.callbackTime);
        sb.append(",tnetTotalTime=");
        sb.append(this.tnetTotalTime);
        sb.append(",streamTotalTime=");
        sb.append(this.streamTotalTime);
        sb.append(",srtt=");
        sb.append(this.srtt);
        sb.append(",serverRT=");
        sb.append(this.serverRT);
        sb.append(",serverBRT=");
        sb.append(this.serverBRT);
        sb.append(",transTime=");
        sb.append(this.oneWayTime - this.serverRT);
        sb.append(",sendSize=");
        sb.append(this.sendDataSize);
        sb.append(",recDataSize=");
        sb.append(this.recDataSize);
        sb.append(",originalDataSize=");
        sb.append(this.rspBodyDeflateSize);
        sb.append(",bodyDeflatedRefer=");
        sb.append(this.bodyDeflatedRefer);
        sb.append(",bodyDeflatedType=");
        sb.append(this.bodyDeflatedType);
        sb.append(",bodyDeflatedRet=");
        sb.append(this.bodyDeflatedRet);
        sb.append(",waitConnectStat=");
        sb.append(this.waitConnectStat);
        sb.append(",rspDecompressionTime=");
        sb.append(this.rspDecompressionTime);
        sb.append(",server_cc=");
        sb.append(this.server_cc);
        if (this.recvLimitBps > 0) {
            sb.append(",limitBps");
            sb.append(this.recvLimitBps);
        }
        if (this.extra != null) {
            sb.append(",extra=");
            sb.append(this.extra.toString());
        }
        if (this.retryTimes > 0) {
            sb.append(",firstProtocol=");
            sb.append(this.firstProtocol);
            sb.append(",firstErrorCode=");
            sb.append(this.firstErrorCode);
        }
        if (this.statusCode == -304) {
            sb.append(",tnetErrorCode=");
            sb.append(this.tnetErrorCode);
        }
        sb.append(",lastInterceptor=");
        sb.append(this.lastInterceptor);
        sb.append(",isReqSync=");
        sb.append(this.isReqSync);
        sb.append(",isReqMain=");
        sb.append(this.isReqMain);
        sb.append(",process=");
        sb.append(this.process);
        if (!StringUtils.isEmpty(this.speedBucket)) {
            sb.append(", speedBucket=");
            sb.append(this.speedBucket);
        }
        sb.append(",cid=");
        sb.append(this.cid);
        sb.append(",xqcConnEnv=");
        sb.append(this.xqcConnEnv);
        sb.append(",ipStackType=");
        sb.append(this.ipStackType);
        sb.append(",multiPathOpened=");
        sb.append(this.multiPathOpened);
        sb.append(",useMultiPath=");
        sb.append(this.useMultiPath);
        sb.append(",isHttpDetectEnable=");
        sb.append(this.isHttpDetectEnable);
        sb.append(",isHarmonyOS=");
        sb.append(this.isHarmonyOS);
        sb.append(",multiNetworkStatus=");
        sb.append(this.multiNetworkStatus);
        sb.append(",isComplex=");
        sb.append(this.isComplex);
        sb.append(",isComplexEnable=");
        sb.append(this.isComplexEnable);
        sb.append(",fragmented=");
        sb.append(this.fragmented);
        sb.append(",isFastDegrade=");
        sb.append(this.isFastDegrade);
        sb.append(",isIpv4Degrade=");
        sb.append(this.isIpv4Degrade);
        sb.append(",forceCellular=");
        sb.append(this.forceCellular);
        sb.append(",isOkhttpAvailable=");
        sb.append(this.isOkhttpAvailable);
        sb.append(",isVpn=");
        sb.append(this.isVpn);
        sb.append(",batteryLevel=");
        sb.append(this.batteryLevel);
        sb.append(",lowPowerMode=");
        sb.append(this.lowPowerMode);
        sb.append(",globalNetworkQuality=");
        sb.append(this.globalNetworkQuality);
        sb.append(",reqContentEncode=");
        sb.append(this.reqContentEncode);
        if (ConnType.HTTP3.equalsIgnoreCase(this.protocolType) || ConnType.HTTP3_PLAIN.equalsIgnoreCase(this.protocolType)) {
            sb.append(",isTunnel=");
            sb.append(this.isTunnel);
            sb.append(",isUseMPQuic=");
            sb.append(this.isUseMPQuic);
            if (this.isTunnel) {
                sb.append(",tunnelInfo=");
                sb.append(this.tunnelInfo);
            }
            if (this.isUseMPQuic) {
                sb.append(",mpquicStatus=");
                sb.append(this.mpquicStatus);
            }
        }
        sb.append(",isSetForceCell=");
        sb.append(this.isSetForceCell);
        sb.append(",bodyTimeout=");
        sb.append(this.bodyTimeout);
        sb.append(",useOkhttp=");
        sb.append(this.useOkHttp);
        sb.append(",deprecatedSessionType=");
        sb.append(this.deprecatedSessionType);
        sb.append(",isNetworkChangeThresholdTime=");
        sb.append(this.isNetworkChangeThresholdTime);
        sb.append(",isNetworkChangeRequest=");
        sb.append(this.isNetworkChangeRequest);
        sb.append(",useVpnFastDegrade=");
        sb.append(this.useVpnFastDegrade);
        sb.append(",allowVpnFastDegrade=");
        sb.append(this.allowVpnFastDegrade);
        sb.append(",detectHttp3Status=");
        sb.append(this.detectHttp3Status);
        sb.append(",oneRecMaxDataSize=");
        sb.append(this.oneRecMaxDataSize);
        sb.append(",requestBodyCompressRet=");
        sb.append(this.requestBodyCompressRet);
        sb.append(",requestBodyCompressType=");
        sb.append(this.requestBodyCompressType);
        sb.append(",requestBodyCompressCostTime=");
        sb.append(this.requestBodyCompressCostTime);
        sb.append(",responseCbTime=");
        sb.append(this.responseCbTime);
        sb.append(",sessionSeq=");
        sb.append(this.sessionSeq);
        sb.append(",url=");
        sb.append(this.url);
        sb.append(",cbTime=");
        sb.append(this.cbTime);
        sb.append(",cookieTime=");
        sb.append(this.cookieTime);
        sb.append(",isAddHighThreadCount=");
        sb.append(this.isAddHighThreadCount);
        sb.append(",isAddRepeatThreadCount=");
        sb.append(this.isAddRepeatThreadCount);
        sb.append(",eagleEyeId=");
        sb.append(this.eagleEyeId);
        sb.append(",topic=");
        sb.append(this.topic);
        sb.append(",secondRefreshOpt=");
        sb.append(this.secondRefreshOpt);
        sb.append(",reqHeadInflate=");
        sb.append(this.reqHeadInflateSize);
        sb.append(",reqBodyInflate=");
        sb.append(this.reqBodyInflateSize);
        sb.append(",reqHeadDeflate=");
        sb.append(this.reqHeadDeflateSize);
        sb.append(",reqBodyDeflate=");
        sb.append(this.reqBodyDeflateSize);
        sb.append(",rspHeadDeflate=");
        sb.append(this.rspHeadDeflateSize);
        sb.append(",rspBodyDeflate=");
        sb.append(this.rspBodyDeflateSize);
        sb.append(",rspHeadInflate=");
        sb.append(this.rspHeadInflateSize);
        sb.append(",rspBodyInflate=");
        sb.append(this.rspBodyInflateSize);
        sb.append(",netType=");
        sb.append(this.netType);
        sb.append(",zstddFlag=");
        sb.append(this.zstddFlag);
        sb.append(",otherProcessTime=");
        sb.append(this.otherProcessTime);
        sb.append(",acceptEncodeTime=");
        sb.append(this.acceptEncodeTime);
        sb.append(",reqPriorityTime=");
        sb.append(this.reqPriorityTime);
        sb.append(",sessionSyncTime=");
        sb.append(this.sessionSyncTime);
        sb.append(",sessionThreadWaitTime=");
        sb.append(this.sessionThreadWaitTime);
        sb.append(",httpSessionTime=");
        sb.append(this.httpSessionTime);
        sb.append(",sinceNetworkInitTime=");
        sb.append(this.sinceNetworkInitTime);
        sb.append(",[fec] fecRecoverCnt=");
        sb.append(this.fecRecoverCnt);
        sb.append(",fecProtected=");
        sb.append(this.fecProtected);
        return sb.toString();
    }

    @Override // anet.channel.statist.StatObject
    public boolean beforeCommit() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("155d4321", new Object[]{this})).booleanValue() : this.statusCode != -200;
    }
}
