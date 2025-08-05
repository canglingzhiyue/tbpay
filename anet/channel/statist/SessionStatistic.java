package anet.channel.statist;

import anet.channel.AwcnConfig;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.entity.ConnInfo;
import anet.channel.monitor.BandWidthSampler;
import anet.channel.quic.Http3ConnectionDetector;
import anet.channel.util.Inet64Util;
import anet.channel.util.Utils;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.android.alibaba.ip.runtime.IpChange;
import org.json.JSONException;
import org.json.JSONObject;
import tb.kge;
import tb.mto;

@Monitor(module = "networkPrefer", monitorPoint = MspGlobalDefine.SESSION)
/* loaded from: classes.dex */
public class SessionStatistic extends StatObject {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @Measure
    public long ackTime;
    @Measure(max = 15000.0d)
    public long authTime;
    @Measure
    public long cfRCount;
    @Dimension
    public String closeReason;
    @Dimension
    public int congControlKind;
    @Measure
    public long connRecvSize;
    @Measure
    public long connSendSize;
    @Measure(max = 15000.0d, name = "connTime")
    public long connectionTime;
    @Dimension(name = "protocolType")
    public String conntype;
    @Dimension
    public String dcid;
    @Dimension
    public long errorCode;
    @Measure
    public int fecSendCount;
    @Measure
    public int handshakeStat;
    @Dimension
    public String harmonyVersion;
    @Dimension
    public String host;
    @Measure
    public long inceptCount;
    @Dimension
    public String ip;
    @Dimension
    public int ipRefer;
    @Dimension
    public int ipStackType;
    @Dimension
    public int ipType;
    @Dimension
    public boolean isBackground;
    @Dimension
    public String isBg;
    @Dimension
    public boolean isComplex;
    @Dimension
    public boolean isComplexEnable;
    @Dimension
    public int isHarmonyOS;
    @Dimension
    public int isHitTicket;
    @Dimension
    public long isKL;
    @Dimension
    public boolean isTicketStore;
    @Dimension
    public boolean isTunnel;
    @Measure
    public int lastPingInterval;
    @Measure
    public double lossRate;
    public int maxRetryTime;
    @Dimension
    public String mpquicPathInfo;
    @Measure
    public double mpquicRecvWeight;
    @Measure
    public double mpquicSendWeight;
    @Dimension
    public int mpquicStatus;
    @Dimension
    public int mss;
    @Dimension
    public int netSpeed;
    @Dimension
    public String netType;
    @Measure
    public long pRate;
    @Dimension
    public int port;
    @Measure
    public long ppkgCount;
    @Measure
    public int pubkeyRetry;
    @Measure
    public long recvSizeCount;
    @Measure
    public long reliableChannelCount;
    @Dimension
    public int ret;
    @Measure
    public double retransmissionRate;
    @Dimension
    public long retryTimes;
    @Measure
    public int rtoCount;
    @Dimension
    public String scid;
    @Dimension
    public int sdkv;
    @Measure
    public long sendSizeCount;
    @Measure
    public long srtt;
    @Measure(max = 15000.0d)
    public long sslCalTime;
    @Measure(max = 15000.0d)
    public long sslTime;
    @Measure
    public double standbyPathWeight;
    @Dimension
    public long ticketTime;
    @Measure
    public int tlpCount;
    @Dimension
    public String tunnelInfo;
    @Measure
    public long unreliableChannelCount;
    @Dimension
    public int xqc0RttStatus;
    @Dimension
    public String xqcConnEnv;
    @Dimension
    public int isProxy = 0;
    @Dimension
    public JSONObject extra = null;
    @Dimension
    public int selectSessionType = 0;
    @Dimension
    public int mpquicOpened = 0;
    @Dimension
    public int forceCellular = 0;
    @Dimension
    public int multiNetworkStatus = 0;
    @Dimension
    public boolean isMPQuic = false;
    @Measure(max = 86400.0d)
    public long liveTime = 0;
    @Measure(constantValue = 1.0d)
    public long requestCount = 1;
    @Measure(constantValue = mto.a.GEO_NOT_SUPPORT)
    public long stdRCount = 1;
    @Measure
    public long sinceInitTime = -1;
    @Measure
    public long bgForbiddenTime = 0;
    public boolean isCommitted = false;
    public boolean isReported = true;

    static {
        kge.a(-1219875758);
    }

    public SessionStatistic(ConnInfo connInfo) {
        this.ipRefer = 0;
        this.ipType = 1;
        this.isHarmonyOS = 0;
        if (connInfo == null) {
            return;
        }
        this.ip = connInfo.getIp();
        this.port = connInfo.getPort();
        if (connInfo.strategy != null) {
            this.ipRefer = connInfo.strategy.getIpSource();
            this.ipType = connInfo.strategy.getIpType();
        }
        this.pRate = connInfo.getHeartbeat();
        this.conntype = connInfo.getConnType().toString();
        this.retryTimes = connInfo.retryTime;
        this.maxRetryTime = connInfo.maxRetryTime;
        int detectHttp3Status = Http3ConnectionDetector.detectHttp3Status();
        boolean isHttp3Enable = AwcnConfig.isHttp3Enable();
        this.xqcConnEnv = "Orange=" + isHttp3Enable + "-Detect=" + detectHttp3Status + "-AB=" + AwcnConfig.isDetectCenterEnable() + "-Ready=" + Http3ConnectionDetector.isQuicReady();
        this.isBg = GlobalAppRuntimeInfo.isAppBackground() ? "bg" : "fg";
        this.ipStackType = Inet64Util.getStackType();
        this.netSpeed = BandWidthSampler.getInstance().getNetworkSpeed();
        this.isComplexEnable = AwcnConfig.isComplexConnectEnable();
        this.isTicketStore = AwcnConfig.isTicketStoreUpgrade();
        if (!Utils.isHarmonyOS()) {
            return;
        }
        this.isHarmonyOS = 1;
        this.harmonyVersion = Utils.getHarmonyVersion();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:
        if (r0 != (-2601)) goto L18;
     */
    @Override // anet.channel.statist.StatObject
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean beforeCommit() {
        /*
            r7 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = anet.channel.statist.SessionStatistic.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L19
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r1[r2] = r7
            java.lang.String r2 = "155d4321"
            java.lang.Object r0 = r0.ipc$dispatch(r2, r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L19:
            int r0 = r7.ret
            if (r0 != 0) goto L6c
            long r0 = r7.retryTimes
            int r4 = r7.maxRetryTime
            long r4 = (long) r4
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 != 0) goto L34
            long r0 = r7.errorCode
            r4 = -2613(0xfffffffffffff5cb, double:NaN)
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 == 0) goto L34
            r4 = -2601(0xfffffffffffff5d7, double:NaN)
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 != 0) goto L6c
        L34:
            boolean r0 = anet.channel.util.ALog.isPrintLog(r3)
            if (r0 == 0) goto L6b
            r0 = 0
            r1 = 5
            java.lang.Object[] r1 = new java.lang.Object[r1]
            long r4 = r7.retryTimes
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r1[r2] = r4
            java.lang.String r4 = "maxRetryTime"
            r1[r3] = r4
            r3 = 2
            int r4 = r7.maxRetryTime
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r1[r3] = r4
            r3 = 3
            java.lang.String r4 = "errorCode"
            r1[r3] = r4
            r3 = 4
            long r4 = r7.errorCode
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r1[r3] = r4
            java.lang.String r3 = "SessionStat no need commit"
            java.lang.String r4 = "retry:"
            anet.channel.util.ALog.d(r3, r0, r4, r1)
        L6b:
            return r2
        L6c:
            boolean r0 = r7.isCommitted
            if (r0 == 0) goto L71
            return r2
        L71:
            r7.isCommitted = r3
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: anet.channel.statist.SessionStatistic.beforeCommit():boolean");
    }

    public AlarmObject getAlarmObject() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (AlarmObject) ipChange.ipc$dispatch("bfd3f9ec", new Object[]{this});
        }
        AlarmObject alarmObject = new AlarmObject();
        alarmObject.module = "networkPrefer";
        alarmObject.modulePoint = "connect_succ_rate";
        if (this.ret != 0) {
            z = true;
        }
        alarmObject.isSuccess = z;
        if (alarmObject.isSuccess) {
            alarmObject.arg = this.closeReason;
        } else {
            alarmObject.errorCode = String.valueOf(this.errorCode);
        }
        return alarmObject;
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
}
