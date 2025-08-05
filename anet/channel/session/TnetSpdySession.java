package anet.channel.session;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.SystemClock;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import anet.channel.AwcnConfig;
import anet.channel.Config;
import anet.channel.CustomDataFrameCb;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.IAuth;
import anet.channel.RequestCb;
import anet.channel.Session;
import anet.channel.SessionInfo;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.assist.ICapability;
import anet.channel.assist.ISocketBoostCapability;
import anet.channel.assist.NetworkAssist;
import anet.channel.bytes.ByteArray;
import anet.channel.bytes.ByteArrayPool;
import anet.channel.encode.EncodingHelper;
import anet.channel.encode.ZstdDictHelper;
import anet.channel.encode.ZstdResponseHelper;
import anet.channel.entity.ConnInfo;
import anet.channel.entity.ConnType;
import anet.channel.entity.Event;
import anet.channel.flow.FlowStat;
import anet.channel.flow.NetworkAnalysis;
import anet.channel.fulltrace.AnalysisFactory;
import anet.channel.heartbeat.HeartbeatManager;
import anet.channel.heartbeat.IHeartbeat;
import anet.channel.heartbeat.SelfKillHeartbeatImpl;
import anet.channel.monitor.SRttMonitor;
import anet.channel.quic.Http3ConnectionDetector;
import anet.channel.request.Request;
import anet.channel.security.ISecurity;
import anet.channel.security.SecurityHelper;
import anet.channel.statist.CustomFrameStat;
import anet.channel.statist.ExceptionStatistic;
import anet.channel.statist.Md5Statistic;
import anet.channel.statist.RequestStatistic;
import anet.channel.statist.SessionMonitor;
import anet.channel.statist.ZstdErrorStatistic;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.strategy.ConnEvent;
import anet.channel.strategy.IConnStrategy;
import anet.channel.strategy.StrategyCenter;
import anet.channel.strategy.dispatch.DispatchZstdDictEvent;
import anet.channel.strategy.utils.Utils;
import anet.channel.thread.ThreadPoolExecutorFactory;
import anet.channel.util.ALog;
import anet.channel.util.ErrorConstant;
import anet.channel.util.HttpConstant;
import anet.channel.util.HttpHelper;
import anet.channel.util.StringUtils;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.alipay.android.phone.mobilesdk.socketcraft.monitor.MonitorItemConstants;
import com.alipay.mobile.verifyidentity.ui.fb.plugin.BaseFBPlugin;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.taobao.zstd.ZstdStreamInflater;
import com.android.taobao.zstd.dict.ZstdDecompressDict;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.io.ByteArrayOutputStream;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.android.spdy.AccsSSLCallback;
import org.android.spdy.SessionCb;
import org.android.spdy.SessionExtraCb;
import org.android.spdy.SpdyAgent;
import org.android.spdy.SpdyByteArray;
import org.android.spdy.SpdyErrorException;
import org.android.spdy.SpdyProtocol;
import org.android.spdy.SpdySession;
import org.android.spdy.SpdySessionKind;
import org.android.spdy.SpdyVersion;
import org.android.spdy.StrategyInfo;
import org.android.spdy.SuperviseConnectInfo;
import org.android.spdy.SuperviseData;
import org.json.JSONObject;
import tb.kge;

/* loaded from: classes.dex */
public class TnetSpdySession extends Session implements SessionCb, SessionExtraCb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String SSL_TIKET_KEY2 = "accs_ssl_key2_";
    private static final String TAG = "awcn.TnetSpdySession";
    private static final String TUNNEL_0RTT_STATUS = "0RTTStatus";
    private static final String TUNNEL_CID = "cid";
    private static final String TUNNEL_CONNECT_TIME = "connectTime";
    private static final String TUNNEL_DEGRADED = "degraded";
    private static final String TUNNEL_ERROR_CODE = "errorCode";
    private static final String TUNNEL_IP = "ip";
    private static final String TUNNEL_LOSS_RATE = "lossRate";
    private static final String TUNNEL_PORT = "port";
    private static final String TUNNEL_RETRANSMISSION_RATE = "retransmissionRate";
    private static final String TUNNEL_RETRY_TIMES = "retryTimes";
    private static final String TUNNEL_SRTT = "srtt";
    private static final String TUNNEL_TYPE = "tunnelType";
    private static Map<String, SessionSslTicket> mSslTicketMap;
    private static SharedPreferences sp;
    public IAuth auth;
    public CustomDataFrameCb dataFrameCb;
    private AtomicBoolean eagainStatus;
    private int errorCode;
    private boolean forceCellular;
    public IHeartbeat heartbeat;
    public ISecurity iSecurity;
    private boolean isAccs;
    private boolean isQuicTry0RTT;
    private volatile boolean isRequestSuccess;
    private boolean isSecondRefreshEnable;
    private boolean isSslSpOptEnable;
    private boolean isUseMPQuic;
    public SpdyAgent mAgent;
    public String mAppkey;
    private Config mConfig;
    public long mConnectedTime;
    public volatile boolean mHasUnrevPing;
    public long mLastPingTime;
    public SpdySession mSession;
    private int requestTimeoutCount;
    private String tnetExternStatMsg;
    public int tnetPublicKey;
    private JSONObject tunnelInfo;
    private List<WaitingFrameData> waitingFrameDataList;

    /* loaded from: classes2.dex */
    public static class SessionSslTicket {
        public String secretKey;
        public String ticket;

        static {
            kge.a(1782114787);
        }

        public SessionSslTicket(String str, String str2) {
            this.secretKey = null;
            this.ticket = null;
            this.ticket = str2;
            this.secretKey = str;
        }
    }

    public static /* synthetic */ Object ipc$super(TnetSpdySession tnetSpdySession, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // org.android.spdy.SessionCb
    public void bioPingRecvCallback(SpdySession spdySession, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b6dabda", new Object[]{this, spdySession, new Integer(i)});
        }
    }

    public static /* synthetic */ List access$000(TnetSpdySession tnetSpdySession) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("668da24", new Object[]{tnetSpdySession}) : tnetSpdySession.waitingFrameDataList;
    }

    public static /* synthetic */ AtomicBoolean access$100(TnetSpdySession tnetSpdySession) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicBoolean) ipChange.ipc$dispatch("bca27c84", new Object[]{tnetSpdySession}) : tnetSpdySession.eagainStatus;
    }

    public static /* synthetic */ Context access$1000(TnetSpdySession tnetSpdySession) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("a1e554aa", new Object[]{tnetSpdySession}) : tnetSpdySession.mContext;
    }

    public static /* synthetic */ Context access$1100(TnetSpdySession tnetSpdySession) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("9336e42b", new Object[]{tnetSpdySession}) : tnetSpdySession.mContext;
    }

    public static /* synthetic */ ConnType access$1200(TnetSpdySession tnetSpdySession) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ConnType) ipChange.ipc$dispatch("2492995e", new Object[]{tnetSpdySession}) : tnetSpdySession.mConnType;
    }

    public static /* synthetic */ boolean access$1300(TnetSpdySession tnetSpdySession, Context context, String str, String str2, byte[] bArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("48c4e4d2", new Object[]{tnetSpdySession, context, str, str2, bArr})).booleanValue() : tnetSpdySession.putSSLMetaVal(context, str, str2, bArr);
    }

    public static /* synthetic */ void access$1400(TnetSpdySession tnetSpdySession, int i, Event event) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0616dc7", new Object[]{tnetSpdySession, new Integer(i), event});
        } else {
            tnetSpdySession.handleCallbacks(i, event);
        }
    }

    public static /* synthetic */ int access$1502(TnetSpdySession tnetSpdySession, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3a8145d", new Object[]{tnetSpdySession, new Integer(i)})).intValue();
        }
        tnetSpdySession.requestTimeoutCount = i;
        return i;
    }

    public static /* synthetic */ int access$1504(TnetSpdySession tnetSpdySession) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3e3df32e", new Object[]{tnetSpdySession})).intValue();
        }
        int i = tnetSpdySession.requestTimeoutCount + 1;
        tnetSpdySession.requestTimeoutCount = i;
        return i;
    }

    public static /* synthetic */ String access$1600(TnetSpdySession tnetSpdySession) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f00ec0e8", new Object[]{tnetSpdySession}) : tnetSpdySession.mRealHost;
    }

    public static /* synthetic */ IConnStrategy access$1700(TnetSpdySession tnetSpdySession) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IConnStrategy) ipChange.ipc$dispatch("108921df", new Object[]{tnetSpdySession}) : tnetSpdySession.mConnStrategy;
    }

    public static /* synthetic */ boolean access$1802(TnetSpdySession tnetSpdySession, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("300efd1c", new Object[]{tnetSpdySession, new Boolean(z)})).booleanValue();
        }
        tnetSpdySession.isRequestSuccess = z;
        return z;
    }

    public static /* synthetic */ ConnType access$1900(TnetSpdySession tnetSpdySession) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ConnType) ipChange.ipc$dispatch("dda96937", new Object[]{tnetSpdySession}) : tnetSpdySession.mConnType;
    }

    public static /* synthetic */ void access$200(TnetSpdySession tnetSpdySession, int i, Event event) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f61e3a56", new Object[]{tnetSpdySession, new Integer(i), event});
        } else {
            tnetSpdySession.handleCallbacks(i, event);
        }
    }

    public static /* synthetic */ JSONObject access$2000(TnetSpdySession tnetSpdySession) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("992b97bf", new Object[]{tnetSpdySession}) : tnetSpdySession.tunnelInfo;
    }

    public static /* synthetic */ ConnType access$2100(TnetSpdySession tnetSpdySession) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ConnType) ipChange.ipc$dispatch("3dcfcb00", new Object[]{tnetSpdySession}) : tnetSpdySession.mConnType;
    }

    public static /* synthetic */ boolean access$2200(TnetSpdySession tnetSpdySession) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("92cd7e57", new Object[]{tnetSpdySession})).booleanValue() : tnetSpdySession.isUseMPQuic;
    }

    public static /* synthetic */ boolean access$2202(TnetSpdySession tnetSpdySession, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4cbbd1a3", new Object[]{tnetSpdySession, new Boolean(z)})).booleanValue();
        }
        tnetSpdySession.isUseMPQuic = z;
        return z;
    }

    public static /* synthetic */ void access$2300(TnetSpdySession tnetSpdySession, int i, Event event) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43c67fe5", new Object[]{tnetSpdySession, new Integer(i), event});
        } else {
            tnetSpdySession.handleCallbacks(i, event);
        }
    }

    public static /* synthetic */ void access$2400(TnetSpdySession tnetSpdySession, Request request, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f639b8ef", new Object[]{tnetSpdySession, request, new Integer(i)});
        } else {
            tnetSpdySession.handleResponseCode(request, i);
        }
    }

    public static /* synthetic */ void access$2500(TnetSpdySession tnetSpdySession, Request request, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88a52f90", new Object[]{tnetSpdySession, request, map});
        } else {
            tnetSpdySession.handleResponseHeaders(request, map);
        }
    }

    public static /* synthetic */ boolean access$300(TnetSpdySession tnetSpdySession) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8dce214a", new Object[]{tnetSpdySession})).booleanValue() : tnetSpdySession.isAccs;
    }

    public static /* synthetic */ boolean access$400(TnetSpdySession tnetSpdySession) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("286ee3cb", new Object[]{tnetSpdySession})).booleanValue() : tnetSpdySession.forceCellular;
    }

    public static /* synthetic */ String access$500(TnetSpdySession tnetSpdySession) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7b2a758", new Object[]{tnetSpdySession}) : tnetSpdySession.mRealHost;
    }

    public static /* synthetic */ IConnStrategy access$600(TnetSpdySession tnetSpdySession) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IConnStrategy) ipChange.ipc$dispatch("d56d456f", new Object[]{tnetSpdySession}) : tnetSpdySession.mConnStrategy;
    }

    public static /* synthetic */ void access$700(TnetSpdySession tnetSpdySession, int i, Event event) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d959bd5b", new Object[]{tnetSpdySession, new Integer(i), event});
        } else {
            tnetSpdySession.notifyStatus(i, event);
        }
    }

    public static /* synthetic */ void access$800(TnetSpdySession tnetSpdySession, int i, Event event) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a065a45c", new Object[]{tnetSpdySession, new Integer(i), event});
        } else {
            tnetSpdySession.notifyStatus(i, event);
        }
    }

    public static /* synthetic */ Config access$900(TnetSpdySession tnetSpdySession) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Config) ipChange.ipc$dispatch("86ed44dc", new Object[]{tnetSpdySession}) : tnetSpdySession.mConfig;
    }

    static {
        kge.a(747444995);
        kge.a(-1245751677);
        kge.a(1071662315);
        mSslTicketMap = new ConcurrentHashMap();
        sp = null;
    }

    public TnetSpdySession(Context context, ConnInfo connInfo) {
        super(context, connInfo);
        this.mHasUnrevPing = false;
        this.mConnectedTime = 0L;
        this.requestTimeoutCount = 0;
        this.forceCellular = false;
        this.tnetPublicKey = -1;
        this.dataFrameCb = null;
        this.heartbeat = null;
        this.auth = null;
        this.mAppkey = null;
        this.iSecurity = null;
        this.isAccs = false;
        this.isRequestSuccess = false;
        this.isUseMPQuic = false;
        this.waitingFrameDataList = new ArrayList();
        this.eagainStatus = new AtomicBoolean(false);
        this.errorCode = -1;
        this.tnetExternStatMsg = null;
        this.mConfig = null;
        this.isSecondRefreshEnable = false;
        this.isSslSpOptEnable = false;
    }

    @Override // anet.channel.Session
    public void setForceCellular(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11d16da", new Object[]{this, new Boolean(z)});
        } else {
            this.forceCellular = z;
        }
    }

    @Override // anet.channel.Session
    public boolean getForceCellular() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8fcdf6ca", new Object[]{this})).booleanValue() : this.forceCellular;
    }

    public int getErrorCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5461de59", new Object[]{this})).intValue() : this.errorCode;
    }

    public String getTnetExternStatMsg() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f743c5cb", new Object[]{this}) : this.tnetExternStatMsg;
    }

    public void initConfig(Config config) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("181b3487", new Object[]{this, config});
        } else if (config != null) {
            this.mAppkey = config.getAppkey();
            this.isSecondRefreshEnable = AwcnConfig.isSecondRefreshABEnable() && AwcnConfig.isTnetLazyLoadSecEnable();
            if (this.isSecondRefreshEnable) {
                this.mConfig = config;
                this.isSslSpOptEnable = AwcnConfig.isSslSpOptEnable();
                ALog.e(TAG, "[lazyLoadTnetSec] initConfig, lazyLoadTnetSec true", this.mSeq, "isSslSpOptEnable", Boolean.valueOf(this.isSslSpOptEnable));
                return;
            }
            this.iSecurity = config.getSecurity();
            ALog.e(TAG, "[initConfig] initConfig, lazyLoadTnetSec false!", this.mSeq, new Object[0]);
        } else {
            ALog.e(TAG, "[initConfig] initConfig, config is null!", this.mSeq, new Object[0]);
        }
    }

    public void initSessionInfo(SessionInfo sessionInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e1a9585", new Object[]{this, sessionInfo});
            return;
        }
        if (sessionInfo != null) {
            this.dataFrameCb = sessionInfo.customDataFrameCb;
            this.auth = sessionInfo.auth;
            if (sessionInfo.isKeepAlive) {
                this.mSessionStat.isKL = 1L;
                this.autoReCreate = true;
                this.heartbeat = sessionInfo.heartbeat;
                this.isAccs = sessionInfo.isAccs;
                if (this.heartbeat == null) {
                    if (sessionInfo.isAccs && !AwcnConfig.isAccsSessionCreateForbiddenInBg()) {
                        this.heartbeat = HeartbeatManager.getDefaultBackgroundAccsHeartbeat();
                    } else {
                        this.heartbeat = HeartbeatManager.getDefaultHeartbeat();
                    }
                }
            }
        }
        if (this.heartbeat != null) {
            return;
        }
        this.heartbeat = new SelfKillHeartbeatImpl();
    }

    public void setTnetPublicKey(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cbfdaf1", new Object[]{this, new Integer(i)});
        } else {
            this.tnetPublicKey = i;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b9, code lost:
        if (r29.mStatus == 4) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 16, insn: 0x0401: MOVE  (r7 I:??[OBJECT, ARRAY]) = (r16 I:??[OBJECT, ARRAY]), block:B:121:0x0400 */
    /* JADX WARN: Not initialized variable reg: 16, insn: 0x0406: MOVE  (r7 I:??[OBJECT, ARRAY]) = (r16 I:??[OBJECT, ARRAY]), block:B:123:0x0405 */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02f0 A[Catch: Exception -> 0x00bc, SpdyErrorException -> 0x00c2, TRY_LEAVE, TryCatch #7 {SpdyErrorException -> 0x00c2, Exception -> 0x00bc, blocks: (B:27:0x00b7, B:36:0x00cd, B:40:0x00e9, B:43:0x014d, B:46:0x0152, B:52:0x019e, B:54:0x01a5, B:56:0x01ac, B:64:0x01cf, B:67:0x0201, B:70:0x0258, B:72:0x0260, B:75:0x0271, B:77:0x027b, B:81:0x0283, B:85:0x0290, B:88:0x0298, B:92:0x02a4, B:96:0x02ae, B:100:0x02b8, B:102:0x02f0, B:55:0x01a8, B:60:0x01c3), top: B:144:0x00b7 }] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0369 A[Catch: Exception -> 0x03ff, SpdyErrorException -> 0x0404, TryCatch #8 {SpdyErrorException -> 0x0404, Exception -> 0x03ff, blocks: (B:105:0x0352, B:107:0x0369, B:108:0x038a, B:118:0x03c1), top: B:143:0x00b1 }] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x03b1 A[Catch: Exception -> 0x03b8, SpdyErrorException -> 0x03ba, TRY_LEAVE, TryCatch #5 {SpdyErrorException -> 0x03ba, Exception -> 0x03b8, blocks: (B:109:0x0395, B:111:0x03b1), top: B:148:0x0395 }] */
    /* JADX WARN: Removed duplicated region for block: B:150:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x019e A[Catch: Exception -> 0x00bc, SpdyErrorException -> 0x00c2, TRY_ENTER, TryCatch #7 {SpdyErrorException -> 0x00c2, Exception -> 0x00bc, blocks: (B:27:0x00b7, B:36:0x00cd, B:40:0x00e9, B:43:0x014d, B:46:0x0152, B:52:0x019e, B:54:0x01a5, B:56:0x01ac, B:64:0x01cf, B:67:0x0201, B:70:0x0258, B:72:0x0260, B:75:0x0271, B:77:0x027b, B:81:0x0283, B:85:0x0290, B:88:0x0298, B:92:0x02a4, B:96:0x02ae, B:100:0x02b8, B:102:0x02f0, B:55:0x01a8, B:60:0x01c3), top: B:144:0x00b7 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01b0 A[Catch: Exception -> 0x040b, SpdyErrorException -> 0x0432, TRY_ENTER, TRY_LEAVE, TryCatch #6 {SpdyErrorException -> 0x0432, Exception -> 0x040b, blocks: (B:23:0x00ae, B:25:0x00b3, B:34:0x00c5, B:37:0x00d4, B:41:0x0145, B:49:0x018b, B:62:0x01cb, B:65:0x01fb, B:68:0x024e, B:103:0x031a, B:58:0x01b0, B:61:0x01c5, B:48:0x0178), top: B:146:0x00ae }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01cf A[Catch: Exception -> 0x00bc, SpdyErrorException -> 0x00c2, TRY_ENTER, TRY_LEAVE, TryCatch #7 {SpdyErrorException -> 0x00c2, Exception -> 0x00bc, blocks: (B:27:0x00b7, B:36:0x00cd, B:40:0x00e9, B:43:0x014d, B:46:0x0152, B:52:0x019e, B:54:0x01a5, B:56:0x01ac, B:64:0x01cf, B:67:0x0201, B:70:0x0258, B:72:0x0260, B:75:0x0271, B:77:0x027b, B:81:0x0283, B:85:0x0290, B:88:0x0298, B:92:0x02a4, B:96:0x02ae, B:100:0x02b8, B:102:0x02f0, B:55:0x01a8, B:60:0x01c3), top: B:144:0x00b7 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0201 A[Catch: Exception -> 0x00bc, SpdyErrorException -> 0x00c2, TRY_ENTER, TRY_LEAVE, TryCatch #7 {SpdyErrorException -> 0x00c2, Exception -> 0x00bc, blocks: (B:27:0x00b7, B:36:0x00cd, B:40:0x00e9, B:43:0x014d, B:46:0x0152, B:52:0x019e, B:54:0x01a5, B:56:0x01ac, B:64:0x01cf, B:67:0x0201, B:70:0x0258, B:72:0x0260, B:75:0x0271, B:77:0x027b, B:81:0x0283, B:85:0x0290, B:88:0x0298, B:92:0x02a4, B:96:0x02ae, B:100:0x02b8, B:102:0x02f0, B:55:0x01a8, B:60:0x01c3), top: B:144:0x00b7 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x027b A[Catch: Exception -> 0x00bc, SpdyErrorException -> 0x00c2, TryCatch #7 {SpdyErrorException -> 0x00c2, Exception -> 0x00bc, blocks: (B:27:0x00b7, B:36:0x00cd, B:40:0x00e9, B:43:0x014d, B:46:0x0152, B:52:0x019e, B:54:0x01a5, B:56:0x01ac, B:64:0x01cf, B:67:0x0201, B:70:0x0258, B:72:0x0260, B:75:0x0271, B:77:0x027b, B:81:0x0283, B:85:0x0290, B:88:0x0298, B:92:0x02a4, B:96:0x02ae, B:100:0x02b8, B:102:0x02f0, B:55:0x01a8, B:60:0x01c3), top: B:144:0x00b7 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02b6  */
    @Override // anet.channel.Session
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public anet.channel.request.Cancelable request(anet.channel.request.Request r30, anet.channel.RequestCb r31) {
        /*
            Method dump skipped, instructions count: 1155
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: anet.channel.session.TnetSpdySession.request(anet.channel.request.Request, anet.channel.RequestCb):anet.channel.request.Cancelable");
    }

    @Override // anet.channel.Session
    public void sendCustomFrame(int i, byte[] bArr, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c377614", new Object[]{this, new Integer(i), bArr, new Integer(i2)});
        } else {
            sendCustomFrame(i, bArr, i2, 1, 4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0207  */
    /* JADX WARN: Type inference failed for: r0v16, types: [anet.channel.appmonitor.IAppMonitor] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.util.concurrent.atomic.AtomicBoolean] */
    /* JADX WARN: Type inference failed for: r0v23, types: [anet.channel.appmonitor.IAppMonitor] */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v12, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r1v4, types: [anet.channel.appmonitor.IAppMonitor] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v4, types: [anet.channel.statist.StatObject] */
    /* JADX WARN: Type inference failed for: r9v6, types: [anet.channel.statist.CustomFrameStat, anet.channel.statist.StatObject] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    @Override // anet.channel.Session
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void sendCustomFrame(int r22, byte[] r23, int r24, int r25, int r26) {
        /*
            Method dump skipped, instructions count: 748
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: anet.channel.session.TnetSpdySession.sendCustomFrame(int, byte[], int, int, int):void");
    }

    private void commitFlow(String str, long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea915ed6", new Object[]{this, str, new Long(j), new Long(j2)});
            return;
        }
        try {
            FlowStat flowStat = new FlowStat();
            flowStat.refer = "accs";
            flowStat.protocoltype = this.mConnType.toString();
            flowStat.req_identifier = str;
            flowStat.upstream = j;
            flowStat.downstream = j2;
            NetworkAnalysis.getInstance().commitFlow(flowStat);
        } catch (Exception e) {
            ALog.e(TAG, "accs commit flow info failed!", null, e, new Object[0]);
        }
    }

    private void addWaitingFrameData(final WaitingFrameData waitingFrameData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d03b1fa4", new Object[]{this, waitingFrameData});
        } else {
            ThreadPoolExecutorFactory.submitPriorityTask(new Runnable() { // from class: anet.channel.session.TnetSpdySession.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    synchronized (TnetSpdySession.access$000(TnetSpdySession.this)) {
                        for (WaitingFrameData waitingFrameData2 : TnetSpdySession.access$000(TnetSpdySession.this)) {
                            if (waitingFrameData.equals(waitingFrameData2)) {
                                ALog.e(TnetSpdySession.TAG, "[addWaitingFrameData]frame in waiting list.", TnetSpdySession.this.mSeq, new Object[0]);
                                return;
                            }
                        }
                        TnetSpdySession.access$000(TnetSpdySession.this).add(waitingFrameData);
                    }
                }
            }, ThreadPoolExecutorFactory.Priority.NORMAL);
        }
    }

    private void flushWaitingFrameData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44c4a395", new Object[]{this});
        } else {
            ThreadPoolExecutorFactory.submitPriorityTask(new Runnable() { // from class: anet.channel.session.TnetSpdySession.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    synchronized (TnetSpdySession.access$000(TnetSpdySession.this)) {
                        Iterator it = TnetSpdySession.access$000(TnetSpdySession.this).iterator();
                        while (it.hasNext()) {
                            WaitingFrameData waitingFrameData = (WaitingFrameData) it.next();
                            if (TnetSpdySession.access$100(TnetSpdySession.this).get()) {
                                return;
                            }
                            TnetSpdySession.this.sendCustomFrame(waitingFrameData.dataId, waitingFrameData.data, waitingFrameData.type, waitingFrameData.channel, waitingFrameData.qos);
                            it.remove();
                        }
                    }
                }
            }, ThreadPoolExecutorFactory.Priority.NORMAL);
        }
    }

    @Override // org.android.spdy.SessionExtraCb
    public void spdySessionOnWritable(SpdySession spdySession, Object obj, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f5c8a40", new Object[]{this, spdySession, obj, new Integer(i)});
        } else if (!this.eagainStatus.compareAndSet(true, false)) {
        } else {
            ALog.e(TAG, "[spdySessionOnWritable] session writable", this.mSeq, "size", Integer.valueOf(i));
            flushWaitingFrameData();
        }
    }

    /* loaded from: classes2.dex */
    public static class WaitingFrameData {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public int channel;
        public byte[] data;
        public int dataId;
        public int qos;
        public int type;

        static {
            kge.a(1462257291);
        }

        public WaitingFrameData(int i, byte[] bArr, int i2, int i3, int i4) {
            this.dataId = i;
            this.data = bArr;
            this.type = i2;
            this.channel = i3;
            this.qos = i4;
        }

        public boolean equals(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
            }
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof WaitingFrameData)) {
                return false;
            }
            WaitingFrameData waitingFrameData = (WaitingFrameData) obj;
            return this.dataId == waitingFrameData.dataId && this.type == waitingFrameData.type && this.channel == waitingFrameData.channel && this.qos == waitingFrameData.qos && Arrays.equals(this.data, waitingFrameData.data);
        }
    }

    private void onDataFrameException(int i, int i2, boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a31c1b8c", new Object[]{this, new Integer(i), new Integer(i2), new Boolean(z), str});
            return;
        }
        CustomDataFrameCb customDataFrameCb = this.dataFrameCb;
        if (customDataFrameCb == null) {
            return;
        }
        customDataFrameCb.onException(i, i2, z, str, null);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(18:(3:67|68|(22:70|71|72|73|74|75|76|(1:83)|85|86|87|(3:131|132|(8:137|(1:139)(3:140|(1:142)(5:144|(3:146|(1:148)(1:150)|149)|151|(6:156|(1:158)(1:170)|(1:160)(1:169)|161|(1:163)(2:165|(1:167)(1:168))|164)|171)|143)|94|(3:96|(1:98)|(1:102))|108|109|110|(2:112|113)(4:114|(1:116)(1:122)|117|(2:119|120)(1:121))))|89|90|(1:92)(1:130)|93|94|(0)|108|109|110|(0)(0)))|75|76|(3:79|81|83)|85|86|87|(0)|89|90|(0)(0)|93|94|(0)|108|109|110|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(38:12|13|14|(2:225|226)|16|(2:22|23)|26|27|(1:223)(4:34|(2:36|(2:38|(1:40)))(3:205|(4:208|(2:216|217)|218|206)|222)|41|(2:43|44)(4:201|202|203|204))|45|46|(2:52|53)|54|(1:58)|59|(3:67|68|(22:70|71|72|73|74|75|76|(1:83)|85|86|87|(3:131|132|(8:137|(1:139)(3:140|(1:142)(5:144|(3:146|(1:148)(1:150)|149)|151|(6:156|(1:158)(1:170)|(1:160)(1:169)|161|(1:163)(2:165|(1:167)(1:168))|164)|171)|143)|94|(3:96|(1:98)|(1:102))|108|109|110|(2:112|113)(4:114|(1:116)(1:122)|117|(2:119|120)(1:121))))|89|90|(1:92)(1:130)|93|94|(0)|108|109|110|(0)(0)))|189|71|72|73|74|75|76|(3:79|81|83)|85|86|87|(0)|89|90|(0)(0)|93|94|(0)|108|109|110|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(9:12|(8:13|14|(2:225|226)|16|(2:22|23)|26|27|(1:223)(4:34|(2:36|(2:38|(1:40)))(3:205|(4:208|(2:216|217)|218|206)|222)|41|(2:43|44)(4:201|202|203|204)))|(6:45|46|(2:52|53)|54|(1:58)|59)|(18:(3:67|68|(22:70|71|72|73|74|75|76|(1:83)|85|86|87|(3:131|132|(8:137|(1:139)(3:140|(1:142)(5:144|(3:146|(1:148)(1:150)|149)|151|(6:156|(1:158)(1:170)|(1:160)(1:169)|161|(1:163)(2:165|(1:167)(1:168))|164)|171)|143)|94|(3:96|(1:98)|(1:102))|108|109|110|(2:112|113)(4:114|(1:116)(1:122)|117|(2:119|120)(1:121))))|89|90|(1:92)(1:130)|93|94|(0)|108|109|110|(0)(0)))|75|76|(3:79|81|83)|85|86|87|(0)|89|90|(0)(0)|93|94|(0)|108|109|110|(0)(0))|189|71|72|73|74) */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x02a9, code lost:
        anet.channel.util.ALog.e(anet.channel.session.TnetSpdySession.TAG, "SessionInfo setMultiPath error.", r22.mSeq, new java.lang.Object[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x0439, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x043a, code lost:
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x043c, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x043d, code lost:
        r1 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0395 A[Catch: Throwable -> 0x028f, SpdyErrorException -> 0x0294, TRY_ENTER, TRY_LEAVE, TryCatch #9 {Throwable -> 0x028f, blocks: (B:97:0x025d, B:102:0x0269, B:104:0x0273, B:115:0x02bb, B:117:0x02c3, B:120:0x02cd, B:122:0x02d1, B:165:0x03b8, B:167:0x03be, B:169:0x03c3, B:171:0x03c9, B:123:0x02db, B:125:0x02df, B:154:0x038a, B:126:0x02ff, B:128:0x0305, B:130:0x0309, B:132:0x0311, B:133:0x0313, B:135:0x0319, B:138:0x0323, B:140:0x0327, B:145:0x0334, B:152:0x0363, B:148:0x0358, B:153:0x036e, B:159:0x0395), top: B:215:0x025d }] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0398 A[Catch: Throwable -> 0x0439, SpdyErrorException -> 0x043c, TRY_ENTER, TryCatch #15 {SpdyErrorException -> 0x043c, Throwable -> 0x0439, blocks: (B:96:0x0240, B:112:0x02a9, B:113:0x02b3, B:163:0x03b0, B:157:0x0391, B:162:0x039a, B:161:0x0398), top: B:225:0x0240 }] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x03b8 A[Catch: Throwable -> 0x028f, SpdyErrorException -> 0x0294, TRY_ENTER, TryCatch #9 {Throwable -> 0x028f, blocks: (B:97:0x025d, B:102:0x0269, B:104:0x0273, B:115:0x02bb, B:117:0x02c3, B:120:0x02cd, B:122:0x02d1, B:165:0x03b8, B:167:0x03be, B:169:0x03c3, B:171:0x03c9, B:123:0x02db, B:125:0x02df, B:154:0x038a, B:126:0x02ff, B:128:0x0305, B:130:0x0309, B:132:0x0311, B:133:0x0313, B:135:0x0319, B:138:0x0323, B:140:0x0327, B:145:0x0334, B:152:0x0363, B:148:0x0358, B:153:0x036e, B:159:0x0395), top: B:215:0x025d }] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x03e9 A[Catch: Throwable -> 0x0435, SpdyErrorException -> 0x0437, TryCatch #13 {SpdyErrorException -> 0x0437, Throwable -> 0x0435, blocks: (B:173:0x03ce, B:175:0x03e9, B:177:0x0402, B:181:0x0414, B:183:0x042c), top: B:229:0x03ce }] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0402 A[Catch: Throwable -> 0x0435, SpdyErrorException -> 0x0437, TryCatch #13 {SpdyErrorException -> 0x0437, Throwable -> 0x0435, blocks: (B:173:0x03ce, B:175:0x03e9, B:177:0x0402, B:181:0x0414, B:183:0x042c), top: B:229:0x03ce }] */
    /* JADX WARN: Removed duplicated region for block: B:217:0x02bb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // anet.channel.Session
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void connect() {
        /*
            Method dump skipped, instructions count: 1152
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: anet.channel.session.TnetSpdySession.connect():void");
    }

    @Override // anet.channel.Session
    public void close(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9419ce89", new Object[]{this, str});
            return;
        }
        updateCloseReason(str);
        ALog.e(TAG, "force close! closeReason=" + str, this.mSeq, MspGlobalDefine.SESSION, this);
        notifyStatus(7, null);
        try {
            if (this.heartbeat != null) {
                this.heartbeat.stop();
                this.heartbeat = null;
            }
            if (this.mSession == null) {
                return;
            }
            this.mSession.closeSession();
        } catch (Exception unused) {
        }
    }

    @Override // anet.channel.Session
    public void close() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
        } else {
            close((String) null);
        }
    }

    @Override // anet.channel.Session
    public void onDisconnect() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18aad6e2", new Object[]{this});
        } else {
            this.mHasUnrevPing = false;
        }
    }

    @Override // anet.channel.Session
    public Runnable getRecvTimeOutRunnable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Runnable) ipChange.ipc$dispatch("4a74edeb", new Object[]{this}) : new Runnable() { // from class: anet.channel.session.TnetSpdySession.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (!TnetSpdySession.this.mHasUnrevPing) {
                } else {
                    ALog.e(TnetSpdySession.TAG, "send msg time out!", TnetSpdySession.this.mSeq, "pingUnRcv:", Boolean.valueOf(TnetSpdySession.this.mHasUnrevPing));
                    try {
                        TnetSpdySession.access$200(TnetSpdySession.this, 2048, null);
                        ConnEvent connEvent = new ConnEvent();
                        connEvent.isSuccess = false;
                        connEvent.isAccs = TnetSpdySession.access$300(TnetSpdySession.this);
                        connEvent.isTunnel = TnetSpdySession.this.isTunnel;
                        connEvent.isForceCell = TnetSpdySession.access$400(TnetSpdySession.this);
                        connEvent.useProxyStrategy = TnetSpdySession.this.useProxyStrategy;
                        StrategyCenter.getInstance().notifyConnEvent(TnetSpdySession.access$500(TnetSpdySession.this), TnetSpdySession.access$600(TnetSpdySession.this), connEvent);
                        TnetSpdySession.this.close(true, "ping time out");
                    } catch (Exception unused) {
                    }
                }
            }
        };
    }

    @Override // anet.channel.Session
    public void ping(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e69854fb", new Object[]{this, new Boolean(z)});
        } else {
            ping(z, this.mReadTimeout);
        }
    }

    @Override // anet.channel.Session
    public void ping(boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec72bd68", new Object[]{this, new Boolean(z), new Integer(i)});
            return;
        }
        if (ALog.isPrintLog(1)) {
            ALog.d(TAG, "ping", this.mSeq, "host", this.mHost, "thread", Thread.currentThread().getName());
        }
        if (!z) {
            return;
        }
        try {
            if (this.mSession != null) {
                if (this.mStatus != 0 && this.mStatus != 4) {
                    return;
                }
                handleCallbacks(64, null);
                if (this.mHasUnrevPing) {
                    return;
                }
                this.mHasUnrevPing = true;
                this.mSessionStat.ppkgCount++;
                this.mSession.submitPing();
                if (ALog.isPrintLog(1)) {
                    ALog.d(TAG, this.mHost + " submit ping ms:" + (System.currentTimeMillis() - this.mLastPingTime) + " force:" + z, this.mSeq, new Object[0]);
                }
                setPingTimeout(i);
                this.mLastPingTime = System.currentTimeMillis();
                if (this.heartbeat == null) {
                    return;
                }
                this.heartbeat.reSchedule();
                return;
            }
            ALog.e(TAG, this.mHost + " session null", this.mSeq, new Object[0]);
            close("session null");
        } catch (SpdyErrorException e) {
            if (e.SpdyErrorGetCode() == -1104 || e.SpdyErrorGetCode() == -1103) {
                ALog.e(TAG, "Send request on closed session!!!", this.mSeq, new Object[0]);
                notifyStatus(6, new Event(2));
            }
            ALog.e(TAG, "ping", this.mSeq, e, new Object[0]);
        } catch (Exception e2) {
            ALog.e(TAG, "ping", this.mSeq, e2, new Object[0]);
        }
    }

    public void auth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("554c4e2f", new Object[]{this});
            return;
        }
        IAuth iAuth = this.auth;
        if (iAuth != null) {
            iAuth.auth(this, new IAuth.AuthCallback() { // from class: anet.channel.session.TnetSpdySession.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // anet.channel.IAuth.AuthCallback
                public void onAuthSuccess() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3cb08c63", new Object[]{this});
                        return;
                    }
                    TnetSpdySession.this.mSessionStat.ret = 1;
                    ALog.d(TnetSpdySession.TAG, "spdyOnStreamResponse", TnetSpdySession.this.mSeq, "authTime", Long.valueOf(TnetSpdySession.this.mSessionStat.authTime));
                    if (TnetSpdySession.this.mConnectedTime > 0) {
                        TnetSpdySession.this.mSessionStat.authTime = System.currentTimeMillis() - TnetSpdySession.this.mConnectedTime;
                    }
                    TnetSpdySession.access$700(TnetSpdySession.this, 4, null);
                    TnetSpdySession.this.mLastPingTime = System.currentTimeMillis();
                    if (TnetSpdySession.this.heartbeat == null) {
                        return;
                    }
                    TnetSpdySession.this.heartbeat.start(TnetSpdySession.this);
                }

                @Override // anet.channel.IAuth.AuthCallback
                public void onAuthFail(int i, String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ccbec0a1", new Object[]{this, new Integer(i), str});
                        return;
                    }
                    TnetSpdySession.access$800(TnetSpdySession.this, 5, null);
                    if (TnetSpdySession.this.mSessionStat != null) {
                        TnetSpdySession.this.mSessionStat.errorCode = i;
                    }
                    TnetSpdySession tnetSpdySession = TnetSpdySession.this;
                    tnetSpdySession.close("Accs_Auth_Fail:" + i);
                }
            });
            return;
        }
        notifyStatus(4, null);
        this.mSessionStat.ret = 1;
        IHeartbeat iHeartbeat = this.heartbeat;
        if (iHeartbeat == null) {
            return;
        }
        iHeartbeat.start(this);
    }

    @Override // anet.channel.Session
    public boolean isAvailable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f0d1d9ca", new Object[]{this})).booleanValue() : this.mStatus == 4;
    }

    @Override // anet.channel.Session
    public boolean isSupportSmoothReconnect() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9c04e9cf", new Object[]{this})).booleanValue() : !this.isAccs;
    }

    @Override // anet.channel.Session
    public boolean isReuse(Session session) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4949e94d", new Object[]{this, session})).booleanValue();
        }
        if (session != null) {
            try {
                if (getConnType().equals(session.getConnType())) {
                    boolean z = this.isCreated && this.mSession.equals(((TnetSpdySession) session).mSession);
                    ALog.e(TAG, "reuse session.", this.mSeq, "result", Boolean.valueOf(z), MspGlobalDefine.SESSION, session.mSeq);
                    return z;
                }
            } catch (Exception unused) {
                ALog.e(TAG, "[isReuse]error.", null, new Object[0]);
            }
        }
        return false;
    }

    private void initSpdyAgent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a12f24a", new Object[]{this});
            return;
        }
        SpdyAgent.enableDebug = false;
        this.mAgent = SpdyAgent.getInstance(this.mContext, SpdyVersion.SPDY3, SpdySessionKind.NONE_SESSION);
        ALog.e(TAG, "[initSpdyAgent] setAccsSslCallback start!", this.mSeq, new Object[0]);
        if (this.isSecondRefreshEnable) {
            ALog.e(TAG, "[initSpdyAgent] 0 isSecondRefreshEnable true!", this.mSeq, new Object[0]);
            this.mAgent.setAccsSslCallback(new AccsSSLCallback() { // from class: anet.channel.session.TnetSpdySession.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // org.android.spdy.AccsSSLCallback
                public byte[] getSSLPublicKey(int i, byte[] bArr) {
                    IpChange ipChange2 = $ipChange;
                    int i2 = 2;
                    if (ipChange2 instanceof IpChange) {
                        return (byte[]) ipChange2.ipc$dispatch("13408d1a", new Object[]{this, new Integer(i), bArr});
                    }
                    byte[] bArr2 = null;
                    try {
                        if (TnetSpdySession.this.iSecurity == null) {
                            TnetSpdySession.this.iSecurity = TnetSpdySession.access$900(TnetSpdySession.this) != null ? TnetSpdySession.access$900(TnetSpdySession.this).getSecurity() : null;
                        }
                        if (TnetSpdySession.this.iSecurity == null || TnetSpdySession.this.iSecurity.isSecOff()) {
                            String str = TnetSpdySession.this.mSeq;
                            Object[] objArr = new Object[2];
                            objArr[0] = "type";
                            if (TnetSpdySession.this.iSecurity == null) {
                                i2 = 0;
                            } else if (TnetSpdySession.this.iSecurity.isSecOff()) {
                                i2 = 1;
                            }
                            objArr[1] = Integer.valueOf(i2);
                            ALog.e(TnetSpdySession.TAG, "[initSpdyAgent] 0 getSSLPublicKey", str, objArr);
                        } else {
                            bArr2 = TnetSpdySession.this.iSecurity.decrypt(TnetSpdySession.access$1000(TnetSpdySession.this), ISecurity.CIPHER_ALGORITHM_AES128, SpdyProtocol.TNET_PUBKEY_SG_KEY, bArr);
                            if (bArr2 != null && ALog.isPrintLog(2)) {
                                ALog.i(TnetSpdySession.TAG, "[initSpdyAgent] 0 getSSLPublicKey", TnetSpdySession.this.mSeq, "decrypt", new String(bArr2));
                            }
                        }
                    } catch (Throwable th) {
                        ALog.e(TnetSpdySession.TAG, "[initSpdyAgent] 0 getSSLPublicKey fail! ", TnetSpdySession.this.mSeq, th, new Object[0]);
                    }
                    return bArr2;
                }
            });
        } else {
            ALog.e(TAG, "[initSpdyAgent] 1 isSecondRefreshEnable false!", this.mSeq, new Object[0]);
            ISecurity iSecurity = this.iSecurity;
            if (iSecurity != null && !iSecurity.isSecOff()) {
                this.mAgent.setAccsSslCallback(new AccsSSLCallback() { // from class: anet.channel.session.TnetSpdySession.6
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // org.android.spdy.AccsSSLCallback
                    public byte[] getSSLPublicKey(int i, byte[] bArr) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return (byte[]) ipChange2.ipc$dispatch("13408d1a", new Object[]{this, new Integer(i), bArr});
                        }
                        byte[] bArr2 = null;
                        try {
                            bArr2 = TnetSpdySession.this.iSecurity.decrypt(TnetSpdySession.access$1100(TnetSpdySession.this), ISecurity.CIPHER_ALGORITHM_AES128, SpdyProtocol.TNET_PUBKEY_SG_KEY, bArr);
                            if (bArr2 != null && ALog.isPrintLog(2)) {
                                ALog.i(TnetSpdySession.TAG, "[initSpdyAgent] 1 getSSLPublicKey", TnetSpdySession.this.mSeq, "decrypt", new String(bArr2));
                            }
                        } catch (Throwable th) {
                            ALog.e(TnetSpdySession.TAG, "[initSpdyAgent] 1 getSSLPublicKey fail! ", TnetSpdySession.this.mSeq, th, new Object[0]);
                        }
                        return bArr2;
                    }
                });
            } else {
                String str = this.mSeq;
                int i = 2;
                Object[] objArr = new Object[2];
                objArr[0] = "type";
                ISecurity iSecurity2 = this.iSecurity;
                if (iSecurity2 == null) {
                    i = 0;
                } else if (iSecurity2.isSecOff()) {
                    i = 1;
                }
                objArr[1] = Integer.valueOf(i);
                ALog.e(TAG, "[initSpdyAgent] 1 getSSLPublicKey", str, objArr);
            }
        }
        ALog.e(TAG, "[initSpdyAgent] setAccsSslCallback end!", this.mSeq, new Object[0]);
    }

    @Override // org.android.spdy.SessionCb
    public void spdySessionConnectCB(SpdySession spdySession, SuperviseConnectInfo superviseConnectInfo) {
        ICapability capability;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d2bcf0e", new Object[]{this, spdySession, superviseConnectInfo});
            return;
        }
        this.mSessionStat.connectionTime = superviseConnectInfo.connectTime;
        this.mSessionStat.sslTime = superviseConnectInfo.handshakeTime;
        this.mSessionStat.sslCalTime = superviseConnectInfo.doHandshakeTime;
        this.mSessionStat.netType = NetworkStatusHelper.getNetworkSubType();
        this.mConnectedTime = System.currentTimeMillis();
        try {
            this.mSessionStat.forceCellular = superviseConnectInfo.isForceCellular;
            this.isActualCellular = superviseConnectInfo.isForceCellular > 0;
        } catch (Exception unused) {
        }
        if (this.mConnType.isHTTP3()) {
            this.mSessionStat.scid = superviseConnectInfo.scid;
            this.mSessionStat.dcid = superviseConnectInfo.dcid;
            this.mSessionStat.congControlKind = superviseConnectInfo.congControlKind;
            this.isQuicTry0RTT = spdySession.isQuicTry0RTT();
            http3ConnectionDetectorUpdate();
            if (this.isTunnel) {
                try {
                    StrategyInfo currStrategyInfo = superviseConnectInfo.getCurrStrategyInfo();
                    if (this.tunnelInfo == null) {
                        this.tunnelInfo = new JSONObject();
                    }
                    if (currStrategyInfo != null) {
                        this.tunnelInfo.put("ip", currStrategyInfo.getTunnelStrategyHost());
                        this.tunnelInfo.put(TUNNEL_PORT, currStrategyInfo.getTunnelStrategyPort());
                    }
                    this.tunnelInfo.put(TUNNEL_CONNECT_TIME, superviseConnectInfo.tunnelConnectTime);
                    JSONObject jSONObject = this.tunnelInfo;
                    jSONObject.put(TUNNEL_CID, superviseConnectInfo.tunnelScid + "|" + superviseConnectInfo.tunnelDcid);
                    this.tunnelInfo.put(TUNNEL_TYPE, superviseConnectInfo.tunnelType);
                } catch (Exception e) {
                    ALog.e(TAG, "[Tunnel Info Error]", this.mSeq, e, new Object[0]);
                }
            }
            ALog.e(TAG, "[HTTP3 spdySessionConnectCB]", this.mSeq, "connectInfo", spdySession.getConnectInfoOnConnected());
        }
        notifyStatus(0, new Event(1));
        auth();
        ALog.e(TAG, "spdySessionConnectCB connect", this.mSeq, TUNNEL_CONNECT_TIME, Integer.valueOf(superviseConnectInfo.connectTime), "sslTime", Integer.valueOf(superviseConnectInfo.handshakeTime));
        if (!AwcnConfig.isSocketBoostHost(this.mRealHost) || (capability = NetworkAssist.getAssistManager().getCapability(1)) == null || !capability.isEnable()) {
            return;
        }
        ((ISocketBoostCapability) capability).set(this.mIp, this.mPort, this.mConnType.isHTTP3() ? 1 : 0, 0);
    }

    private void http3ConnectionDetectorUpdate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("827ee2ff", new Object[]{this});
        } else {
            ThreadPoolExecutorFactory.submitPriorityTask(new Runnable() { // from class: anet.channel.session.TnetSpdySession.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (!TnetSpdySession.access$1200(TnetSpdySession.this).is1RttHTTP3()) {
                    } else {
                        Http3ConnectionDetector.updateHttp3Status(true);
                    }
                }
            }, ThreadPoolExecutorFactory.Priority.NORMAL);
        }
    }

    @Override // org.android.spdy.SessionCb
    public void spdyPingRecvCallback(SpdySession spdySession, long j, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1c4fe4d", new Object[]{this, spdySession, new Long(j), obj});
            return;
        }
        if (ALog.isPrintLog(2)) {
            ALog.i(TAG, "ping receive", this.mSeq, HttpConstant.HOST, this.mHost, "id", Long.valueOf(j));
        }
        if (j < 0) {
            return;
        }
        this.mHasUnrevPing = false;
        this.requestTimeoutCount = 0;
        IHeartbeat iHeartbeat = this.heartbeat;
        if (iHeartbeat != null) {
            iHeartbeat.reSchedule();
        }
        handleCallbacks(128, null);
    }

    @Override // org.android.spdy.SessionCb
    public void spdyCustomControlFrameRecvCallback(SpdySession spdySession, Object obj, int i, int i2, int i3, int i4, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1cc5fc5", new Object[]{this, spdySession, obj, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), bArr});
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        HashMap hashMap = new HashMap();
        hashMap.put("frameRecvTime", Long.valueOf(elapsedRealtime));
        ALog.e(TAG, "[spdyCustomControlFrameRecvCallback]", this.mSeq, "dataId", Integer.valueOf(i), "type", Integer.valueOf(i2), "len", Integer.valueOf(i4), "frameCb", this.dataFrameCb);
        if (ALog.isPrintLog(1) && i4 < 512) {
            String str = "";
            for (int i5 = 0; i5 < bArr.length; i5++) {
                str = str + Integer.toHexString(bArr[i5] & 255) + " ";
            }
            ALog.e(TAG, null, this.mSeq, "str", str);
        }
        CustomDataFrameCb customDataFrameCb = this.dataFrameCb;
        if (customDataFrameCb != null) {
            customDataFrameCb.onDataReceive(this, bArr, i, i2, i4, hashMap);
        } else {
            ALog.e(TAG, "AccsFrameCb is null", this.mSeq, new Object[0]);
            AppMonitor.getInstance().commitStat(new ExceptionStatistic(-105, null, "rt"));
        }
        this.mSessionStat.inceptCount++;
        if (i2 == 201) {
            this.mSessionStat.reliableChannelCount++;
        } else if (i2 == 202) {
            this.mSessionStat.unreliableChannelCount++;
        }
        IHeartbeat iHeartbeat = this.heartbeat;
        if (iHeartbeat != null) {
            iHeartbeat.reSchedule();
        }
        commitFlow(this.mHost, 0L, bArr == null ? 0L : bArr.length);
    }

    @Override // org.android.spdy.SessionCb
    public void spdySessionFailedError(SpdySession spdySession, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30d5bd4", new Object[]{this, spdySession, new Integer(i), obj});
            return;
        }
        if (spdySession != null) {
            try {
                this.mSessionStat.putExtra("tnetExternStat", spdySession.getExternStat());
                spdySession.cleanUp();
            } catch (Exception e) {
                ALog.e(TAG, "[spdySessionFailedError]session clean up failed!", null, e, new Object[0]);
            }
        }
        notifyStatus(2, new Event(256, i, "tnet connect fail"));
        ALog.e(TAG, null, this.mSeq, " errorId:", Integer.valueOf(i));
        this.mSessionStat.errorCode = i;
        this.mSessionStat.ret = 0;
        if (!this.mSessionStat.isReported) {
            this.mSessionStat.ret = 2;
        }
        this.mSessionStat.netType = NetworkStatusHelper.getNetworkSubType();
        AppMonitor.getInstance().commitStat(this.mSessionStat);
        if (Utils.isIPV6Address(this.mSessionStat.ip)) {
            AppMonitor.getInstance().commitStat(new SessionMonitor(this.mSessionStat));
        }
        AppMonitor.getInstance().commitAlarm(this.mSessionStat.getAlarmObject());
    }

    @Override // org.android.spdy.SessionCb
    public void spdySessionCloseCallback(SpdySession spdySession, Object obj, SuperviseConnectInfo superviseConnectInfo, int i) {
        ICapability capability;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f76348e5", new Object[]{this, spdySession, obj, superviseConnectInfo, new Integer(i)});
            return;
        }
        ALog.e(TAG, "spdySessionCloseCallback", this.mSeq, " errorCode:", Integer.valueOf(i));
        IHeartbeat iHeartbeat = this.heartbeat;
        if (iHeartbeat != null) {
            iHeartbeat.stop();
            this.heartbeat = null;
        }
        if (spdySession != null) {
            try {
                spdySession.cleanUp();
            } catch (Exception e) {
                ALog.e(TAG, "session clean up failed!", null, e, new Object[0]);
            }
        }
        if (i == -3516 || i == -5004) {
            ConnEvent connEvent = new ConnEvent();
            connEvent.isSuccess = false;
            connEvent.isTunnel = this.isTunnel;
            connEvent.isForceCell = this.forceCellular;
            connEvent.useProxyStrategy = this.useProxyStrategy;
            StrategyCenter.getInstance().notifyConnEvent(this.mRealHost, this.mConnStrategy, connEvent);
        }
        notifyStatus(6, new Event(2));
        if (superviseConnectInfo != null) {
            this.mSessionStat.requestCount = superviseConnectInfo.reused_counter;
            this.mSessionStat.liveTime = superviseConnectInfo.keepalive_period_second;
            this.mSessionStat.fecSendCount = superviseConnectInfo.fecSendCount;
            ALog.e(TAG, "[fec] fecSendCount = " + this.mSessionStat.fecSendCount, this.mSeq, new Object[0]);
            this.mSessionStat.bgForbiddenTime = superviseConnectInfo.bgForbiddenTime;
            this.mSessionStat.pubkeyRetry = superviseConnectInfo.pubkeyRetry;
            this.mSessionStat.connSendSize = superviseConnectInfo.connSendSize;
            this.mSessionStat.connRecvSize = superviseConnectInfo.connRecvSize;
            this.mSessionStat.handshakeStat = superviseConnectInfo.handshakeStat;
            this.mSessionStat.putExtra("tnetExternStat", spdySession.getExternStat());
            try {
                if (this.mConnType.isHTTP3()) {
                    this.mSessionStat.xqc0RttStatus = superviseConnectInfo.xqc0RttStatus;
                    this.mSessionStat.retransmissionRate = superviseConnectInfo.retransmissionRate;
                    this.mSessionStat.lossRate = superviseConnectInfo.lossRate;
                    this.mSessionStat.tlpCount = superviseConnectInfo.tlpCount;
                    this.mSessionStat.rtoCount = superviseConnectInfo.rtoCount;
                    this.mSessionStat.srtt = superviseConnectInfo.srtt;
                    this.mSessionStat.standbyPathWeight = superviseConnectInfo.standbyPathWeight;
                    if (superviseConnectInfo.standbyPathWeight > 0.1d) {
                        GlobalAppRuntimeInfo.showUserToast();
                    }
                    if (this.isTunnel) {
                        try {
                            if (this.tunnelInfo == null) {
                                this.tunnelInfo = new JSONObject();
                            }
                            this.tunnelInfo.put(TUNNEL_0RTT_STATUS, superviseConnectInfo.tunnel0RTTStatus);
                            this.tunnelInfo.put("errorCode", superviseConnectInfo.tunnelErrorCode);
                            this.tunnelInfo.put(TUNNEL_DEGRADED, superviseConnectInfo.tunnelDegraded);
                            this.tunnelInfo.put(TUNNEL_RETRY_TIMES, superviseConnectInfo.tunnelRetryTimes);
                            this.tunnelInfo.put(TUNNEL_SRTT, superviseConnectInfo.tunnelSrtt);
                            this.tunnelInfo.put(TUNNEL_RETRANSMISSION_RATE, superviseConnectInfo.tunnelRetransmissionRate);
                            this.tunnelInfo.put(TUNNEL_LOSS_RATE, superviseConnectInfo.tunnelLossRate);
                            String jSONObject = this.tunnelInfo.toString();
                            ALog.e(TAG, "[spdySessionCloseCallback]", this.mSeq, "tunnelInfo", jSONObject);
                            this.mSessionStat.tunnelInfo = jSONObject;
                        } catch (Exception e2) {
                            ALog.e(TAG, "[Tunnel Info Error]", this.mSeq, e2, new Object[0]);
                        }
                    }
                    try {
                        this.mSessionStat.mpquicStatus = superviseConnectInfo.mpquicStatus;
                        this.mSessionStat.mpquicSendWeight = superviseConnectInfo.defaultPathSendWeight;
                        this.mSessionStat.mpquicRecvWeight = superviseConnectInfo.defaultPathRecvWeight;
                        this.mSessionStat.multiNetworkStatus = superviseConnectInfo.multiNetStatus;
                        this.mSessionStat.mpquicPathInfo = superviseConnectInfo.mpquicPathInfo;
                        this.mSessionStat.mpquicOpened = AwcnConfig.isMPQuicEnable() ? 1 : 0;
                    } catch (Exception e3) {
                        ALog.e(TAG, "[MPQUIC stat error]", this.mSeq, e3, new Object[0]);
                    }
                }
                if (spdySession != null) {
                    ALog.e(TAG, "[spdySessionCloseCallback]", this.mSeq, "connectInfo", spdySession.getConnectInfoOnDisConnected());
                }
            } catch (Exception unused) {
            }
        }
        if (this.mSessionStat.errorCode == 0) {
            this.mSessionStat.errorCode = i;
        }
        this.mSessionStat.lastPingInterval = (int) (System.currentTimeMillis() - this.mLastPingTime);
        AppMonitor.getInstance().commitStat(this.mSessionStat);
        if (Utils.isIPV6Address(this.mSessionStat.ip)) {
            AppMonitor.getInstance().commitStat(new SessionMonitor(this.mSessionStat));
        }
        AppMonitor.getInstance().commitAlarm(this.mSessionStat.getAlarmObject());
        if (!AwcnConfig.isSocketBoostHost(this.mRealHost) || (capability = NetworkAssist.getAssistManager().getCapability(1)) == null || !capability.isEnable()) {
            return;
        }
        ((ISocketBoostCapability) capability).clear(this.mIp, this.mPort, this.mConnType.isHTTP3() ? 1 : 0);
    }

    @Override // org.android.spdy.SessionCb
    public void spdyCustomControlFrameFailCallback(SpdySession spdySession, Object obj, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7576ccd6", new Object[]{this, spdySession, obj, new Integer(i), new Integer(i2)});
            return;
        }
        ALog.e(TAG, "spdyCustomControlFrameFailCallback", this.mSeq, "dataId", Integer.valueOf(i));
        onDataFrameException(i, i2, true, "tnet error");
        CustomFrameStat customFrameStat = new CustomFrameStat();
        customFrameStat.host = this.mRealHost;
        customFrameStat.isAccs = this.isAccs;
        customFrameStat.errCode = i2;
        customFrameStat.ret = 0;
        AppMonitor.getInstance().commitStat(customFrameStat);
    }

    @Override // org.android.spdy.SessionCb
    public byte[] getSSLMeta(SpdySession spdySession) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("c9362ffe", new Object[]{this, spdySession});
        }
        long currentTimeMillis = System.currentTimeMillis();
        String domain = spdySession.getDomain();
        byte[] bArr = null;
        if (this.secondRefreshOpt == 1) {
            if (this.isSslSpOptEnable) {
                byte[] sslTicket = getSslTicket(SSL_TIKET_KEY2 + domain);
                if (sslTicket != null && sslTicket.length > 0) {
                    this.mSessionStat.isHitTicket = 1;
                }
                this.mSessionStat.ticketTime = System.currentTimeMillis() - currentTimeMillis;
                return sslTicket;
            }
            ALog.e(TAG, "[lazyLoadTnetSec] secondRefreshOpt=1, getSSLMeta return null", this.mSeq, "host", this.mRealHost);
            return null;
        } else if (TextUtils.isEmpty(domain)) {
            ALog.i(TAG, "get sslticket host is null", null, new Object[0]);
            return null;
        } else {
            try {
                if (this.iSecurity == null) {
                    this.iSecurity = this.mConfig != null ? this.mConfig.getSecurity() : null;
                }
                if (this.iSecurity != null) {
                    ISecurity iSecurity = this.iSecurity;
                    Context context = this.mContext;
                    bArr = iSecurity.getBytes(context, SSL_TIKET_KEY2 + domain);
                }
            } catch (Throwable th) {
                ALog.e(TAG, "getSSLMeta", null, th, new Object[0]);
            }
            if (bArr != null && bArr.length > 0) {
                this.mSessionStat.isHitTicket = 1;
            }
            this.mSessionStat.ticketTime = System.currentTimeMillis() - currentTimeMillis;
            return bArr;
        }
    }

    @Override // org.android.spdy.SessionCb
    public int putSSLMeta(SpdySession spdySession, byte[] bArr) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8ce64c60", new Object[]{this, spdySession, bArr})).intValue();
        }
        String domain = spdySession.getDomain();
        if (this.secondRefreshOpt == 1) {
            if (this.isSslSpOptEnable) {
                putAsyncSSLMetaVal(this.mContext, SSL_TIKET_KEY2 + domain, SSL_TIKET_KEY2 + domain, bArr);
                return 0;
            }
            ALog.e(TAG, "[lazyLoadTnetSec] secondRefreshOpt=1, putSSLMeta return -1", this.mSeq, "host", this.mRealHost);
            return -1;
        } else if (TextUtils.isEmpty(domain)) {
            return -1;
        } else {
            try {
                if (this.iSecurity == null) {
                    this.iSecurity = this.mConfig != null ? this.mConfig.getSecurity() : null;
                }
                if (this.iSecurity == null) {
                    return -1;
                }
                if (!this.iSecurity.saveBytes(this.mContext, SSL_TIKET_KEY2 + domain, bArr)) {
                    i = -1;
                }
                return i;
            } catch (Throwable th) {
                ALog.e(TAG, "putSSLMeta", null, th, new Object[0]);
                return -1;
            }
        }
    }

    private byte[] getSslTicket(String str) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("f9ff38aa", new Object[]{this, str});
        }
        Context context = GlobalAppRuntimeInfo.getContext();
        byte[] bArr = null;
        try {
            SessionSslTicket sessionSslTicket = mSslTicketMap.get(str);
            if (sessionSslTicket != null && sessionSslTicket.ticket != null && !sessionSslTicket.ticket.isEmpty()) {
                byte[] bytes = sessionSslTicket.ticket.getBytes();
                try {
                    ALog.e(TAG, "[ticket_opt] getSslTicket get map!!", this.mSeq, "key", str, "sk", sessionSslTicket.secretKey);
                    return bytes;
                } catch (Throwable th) {
                    th = th;
                    bArr = bytes;
                    ALog.e(TAG, "[ticket_opt] getSslTicket error", this.mSeq, th, new Object[0]);
                    return bArr;
                }
            }
            if (context != null && sp == null) {
                sp = PreferenceManager.getDefaultSharedPreferences(context);
            }
            if (context != null && sp != null) {
                String string = sp.getString(str, null);
                if (string != null && !string.isEmpty()) {
                    JSONObject jSONObject = new JSONObject(string);
                    String optString = jSONObject.optString("sk");
                    String optString2 = jSONObject.optString(PushConstants.PUSH_NOTIFICATION_CREATE_TIMES_TAMP);
                    if (optString2 == null || optString2.isEmpty() || optString == null || optString.isEmpty()) {
                        return null;
                    }
                    String decryptNoDeps = SecurityHelper.decryptNoDeps(optString, optString2, this.mSeq, "[ticket_opt]");
                    String str2 = this.mSeq;
                    Object[] objArr = new Object[8];
                    objArr[0] = "key";
                    objArr[1] = str;
                    objArr[2] = "isTicketStrNull";
                    if (decryptNoDeps != null) {
                        z = false;
                    }
                    objArr[3] = Boolean.valueOf(z);
                    objArr[4] = "tStr";
                    objArr[5] = optString2;
                    objArr[6] = "tsk";
                    objArr[7] = optString;
                    ALog.e(TAG, "[ticket_opt] getSslTicket get sp!!", str2, objArr);
                    if (decryptNoDeps != null && !decryptNoDeps.isEmpty()) {
                        mSslTicketMap.put(str, new SessionSslTicket(optString, optString2));
                        return decryptNoDeps.getBytes();
                    }
                    sp.edit().remove(str).apply();
                    return null;
                }
                ALog.e(TAG, "[ticket_opt] getSslTicket, sp not find!!", this.mSeq, new Object[0]);
                return null;
            }
            String str3 = this.mSeq;
            Object[] objArr2 = new Object[2];
            objArr2[0] = BaseFBPlugin.VERIFY_TYPE.sp;
            objArr2[1] = Boolean.valueOf(sp == null);
            ALog.e(TAG, "[ticket_opt] getSslTicket not need try get sp!!", str3, objArr2);
            return null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public void putAsyncSSLMetaVal(final Context context, final String str, final String str2, final byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2704145f", new Object[]{this, context, str, str2, bArr});
        } else {
            ThreadPoolExecutorFactory.submitBackupTask(new Runnable() { // from class: anet.channel.session.TnetSpdySession.8
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        TnetSpdySession.access$1300(TnetSpdySession.this, context, str, str2, bArr);
                    }
                }
            });
        }
    }

    private boolean putSSLMetaVal(Context context, String str, String str2, byte[] bArr) {
        String str3;
        SessionSslTicket sessionSslTicket;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fd7d141", new Object[]{this, context, str, str2, bArr})).booleanValue();
        }
        try {
            String str4 = new String(bArr);
            str3 = null;
            if (str == null || str.isEmpty() || str2 == null || str2.isEmpty() || str4.isEmpty()) {
                sessionSslTicket = null;
            } else {
                SessionSslTicket sessionSslTicket2 = new SessionSslTicket(str2, str4);
                mSslTicketMap.put(str, sessionSslTicket2);
                String encryptNoDeps = SecurityHelper.encryptNoDeps(str2, str4, this.mSeq, "[ticket_opt]");
                ALog.e(TAG, "[ticket_opt] putSSLMetaVal", this.mSeq, "key", str, "sk", str2, "encryptTicket", encryptNoDeps);
                str3 = encryptNoDeps;
                sessionSslTicket = sessionSslTicket2;
            }
        } catch (Throwable th) {
            ALog.e(TAG, "[ticket_opt] putSSLMetaVal error", this.mSeq, th, new Object[0]);
        }
        if (str != null && !str.isEmpty() && str2 != null && !str2.isEmpty() && str3 != null && !str3.isEmpty()) {
            if (context != null && sp == null) {
                sp = PreferenceManager.getDefaultSharedPreferences(context);
            }
            if (sp != null && sessionSslTicket != null && str3 != null && !str3.isEmpty()) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("sk", sessionSslTicket.secretKey);
                jSONObject.put(PushConstants.PUSH_NOTIFICATION_CREATE_TIMES_TAMP, str3);
                sp.edit().putString(str, jSONObject.toString()).apply();
                ALog.e(TAG, "[ticket_opt] putSSLMetaVal sp put", this.mSeq, "key", str, "sslTicket", str3);
            }
            return true;
        }
        ALog.e(TAG, "[ticket_opt] putSSLMetaVal null", this.mSeq, "key", str, "secretKey", str2, "encryptTicket", str3);
        return false;
    }

    /* loaded from: classes.dex */
    public class RequestCallback extends DftSpdyCb {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private RequestCb callback;
        private Request request;
        private int statusCode = 0;
        private long recDataCount = 0;
        private long rspBodyInflateSize = 0;
        private long recvCallCount = 0;
        private long responseStart = 0;
        private ZstdStreamInflater zstdStreamInflater = null;
        private ZstdDecompressDict zstdDecompressDict = null;
        private ByteArrayOutputStream recData = null;
        private MessageDigest messageDigest = null;
        private String contentEncoding = null;
        private String md5ExpectedStr = null;
        private String referer = null;
        private boolean isMd5Open = false;
        private boolean isZstd = false;
        private boolean isZstdDict = false;
        private String useAsDictionaryStr = null;
        private String LatestDictionaryStr = null;
        private String urlKey = null;
        private ZstdResponseHelper zstdResponseHelper = null;
        private boolean isGzip = false;
        private boolean isGzipDecompressOpend = AwcnConfig.isGzipDecompressOpend();
        private boolean isDecompressOpend = AwcnConfig.isDecompressOpend();
        private boolean isZstdStreamDecompressOpened = AwcnConfig.isZstdStreamDecompressOpened();
        private boolean isZstdDictDecompressOpened = AwcnConfig.isZstdDictDecompressMtopEnable();
        private boolean isSetZstdDictFinish = false;
        private long recDataStart = 0;

        static {
            kge.a(1545082931);
        }

        public static /* synthetic */ Object ipc$super(RequestCallback requestCallback, String str, Object... objArr) {
            str.hashCode();
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        public RequestCallback(Request request, RequestCb requestCb) {
            this.request = request;
            this.callback = requestCb;
        }

        @Override // anet.channel.session.DftSpdyCb, org.android.spdy.Spdycb
        public void spdyDataChunkRecvCB(SpdySession spdySession, boolean z, long j, SpdyByteArray spdyByteArray, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e9cc7148", new Object[]{this, spdySession, new Boolean(z), new Long(j), spdyByteArray, obj});
                return;
            }
            int dataLength = spdyByteArray.getDataLength();
            if (spdyByteArray.isUseDirectBuffer()) {
                if (spdyByteArray.getByteBuffer() == null) {
                    ALog.e(TnetSpdySession.TAG, "spdyDataChunkRecvCB, isTnetRecvUpdate=true, data.getByteBuffer() is null, return", this.request.getSeq(), "len", Integer.valueOf(dataLength), "fin", Boolean.valueOf(z), " bizReqId", this.request.rs.bizReqId);
                    return;
                } else {
                    dataLength = spdyByteArray.getByteBuffer().limit();
                    ALog.d(TnetSpdySession.TAG, "spdyDataChunkRecvCB, isTnetRecvUpdate=true", this.request.getSeq(), "len", Integer.valueOf(dataLength), "fin", Boolean.valueOf(z), " bizReqId", this.request.rs.bizReqId);
                }
            }
            if (ALog.isPrintLog(1)) {
                ALog.d(TnetSpdySession.TAG, "spdyDataChunkRecvCB", this.request.getSeq(), "len", Integer.valueOf(dataLength), "fin", Boolean.valueOf(z), " bizReqId", this.request.rs.bizReqId);
            }
            long j2 = dataLength;
            this.request.rs.oneRecMaxDataSize = Math.max(j2, this.request.rs.oneRecMaxDataSize);
            this.recvCallCount++;
            if (z) {
                this.request.rs.putExtra("recvCallCount", Long.valueOf(this.recvCallCount));
                this.request.rs.putExtra("isUseDirectBuffer", Boolean.valueOf(spdyByteArray.isUseDirectBuffer()));
            }
            this.request.rs.recDataSize += j2;
            this.request.rs.lastRecvDataTime = System.currentTimeMillis() - this.request.rs.sendStart;
            if (TnetSpdySession.this.heartbeat != null) {
                TnetSpdySession.this.heartbeat.reSchedule();
            }
            this.recDataCount += j2;
            if (this.messageDigest == null) {
                this.messageDigest = StringUtils.getMd5Digest();
            }
            this.recDataStart = System.currentTimeMillis();
            if (this.callback == null) {
                return;
            }
            ByteArray create = ByteArray.create(0);
            if (this.isDecompressOpend && ((this.isGzipDecompressOpend && this.isGzip) || this.isZstd || this.isZstdDict)) {
                try {
                    if ((this.isZstdStreamDecompressOpened && this.isZstd) || this.isZstdDict) {
                        zstdStreamDecompress("finDataChunkRecvCB", spdyByteArray, z, dataLength);
                    } else {
                        if (this.recData == null) {
                            this.recData = new ByteArrayOutputStream((int) (this.request.rs.contentLength <= 0 ? 1024L : this.request.rs.contentLength << 1));
                        }
                        if (spdyByteArray.isUseDirectBuffer()) {
                            this.recData.write(ByteArrayPool.getInstance().retrieveAndCopy(spdyByteArray.getByteBuffer(), dataLength).getBuffer(), 0, dataLength);
                        } else {
                            this.recData.write(spdyByteArray.getByteArray(), 0, spdyByteArray.getDataLength());
                        }
                        spdyByteArray.recycle();
                        if (z) {
                            this.request.rs.bodyDeflatedRefer = 0;
                            this.recDataStart = System.currentTimeMillis();
                            byte[] decompress = EncodingHelper.decompress(this.contentEncoding, this.recData.toByteArray());
                            this.request.rs.rspDecompressionTime = System.currentTimeMillis() - this.recDataStart;
                            this.rspBodyInflateSize += Math.max(decompress.length, 0);
                            ByteArray retrieveAndCopy = ByteArrayPool.getInstance().retrieveAndCopy(decompress, decompress.length);
                            commitCalculateMd5Stream("finDataChunkRecvCB", retrieveAndCopy.getBuffer(), z);
                            this.request.rs.bodyDeflatedRet = 1;
                            this.callback.onDataReceive(retrieveAndCopy, z);
                            this.recData = null;
                        }
                    }
                } catch (Error | Exception e) {
                    this.request.rs.bodyDeflatedRet = 0;
                    this.request.rs.rspDecompressionTime = System.currentTimeMillis() - this.recDataStart;
                    this.callback.onFinish(EncodingHelper.encodingFail, "finDataChunkRecvCB error", this.request.rs);
                    ALog.e(TnetSpdySession.TAG, "finDataChunkRecvCB error=" + e.toString(), this.request.getSeq(), " bizReqId", this.request.rs.bizReqId);
                }
            } else {
                if (dataLength != 0) {
                    if (spdyByteArray.isUseDirectBuffer()) {
                        create = ByteArrayPool.getInstance().retrieveAndCopy(spdyByteArray.getByteBuffer(), dataLength);
                    } else {
                        create = ByteArrayPool.getInstance().retrieveAndCopy(spdyByteArray.getByteArray(), spdyByteArray.getDataLength());
                    }
                }
                this.request.rs.bodyDeflatedRefer = 1;
                this.request.rs.bodyDeflatedRet = 1;
                this.callback.onDataReceive(create, z);
                commitCalculateMd5Stream("finDataChunkRecvCB", create.getBuffer(), z);
                spdyByteArray.recycle();
            }
            TnetSpdySession.access$1400(TnetSpdySession.this, 32, null);
        }

        private void zstdStreamDecompress(String str, SpdyByteArray spdyByteArray, boolean z, int i) {
            int decompress;
            ByteArray retrieveAndCopy;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("76b4d78e", new Object[]{this, str, spdyByteArray, new Boolean(z), new Integer(i)});
                return;
            }
            if (this.zstdStreamInflater == null) {
                this.zstdStreamInflater = new ZstdStreamInflater();
            }
            try {
                if (this.isZstdDictDecompressOpened && EncodingHelper.isZstdValid() && this.zstdResponseHelper != null && this.isZstdDict && !this.isSetZstdDictFinish) {
                    byte[] dictionary = this.zstdResponseHelper.getDictionary(this.urlKey, this.request.getSeq());
                    if (this.zstdDecompressDict == null && dictionary != null) {
                        this.zstdDecompressDict = new ZstdDecompressDict(dictionary, 0, dictionary.length);
                        this.zstdStreamInflater.setDict(this.zstdDecompressDict);
                        ALog.e(TnetSpdySession.TAG, "[zstd-d] zstdStreamDecompress zstd dict decompress setDict success!", this.request.getSeq(), new Object[0]);
                    }
                    this.isSetZstdDictFinish = true;
                }
            } catch (Throwable th) {
                ALog.e(TnetSpdySession.TAG, "[zstd-d] zstd dict decompress error=" + th.toString(), this.request.getSeq(), new Object[0]);
            }
            if (z && i == 0) {
                if (spdyByteArray.isUseDirectBuffer()) {
                    retrieveAndCopy = ByteArrayPool.getInstance().retrieveAndCopy(spdyByteArray.getByteBuffer(), i);
                } else {
                    retrieveAndCopy = ByteArrayPool.getInstance().retrieveAndCopy(spdyByteArray.getByteArray(), spdyByteArray.getDataLength());
                }
                zstdStreamFinish("zstdStreamDecompress_0", retrieveAndCopy);
                return;
            }
            if (spdyByteArray.isUseDirectBuffer()) {
                ByteArray retrieveAndCopy2 = ByteArrayPool.getInstance().retrieveAndCopy(spdyByteArray.getByteBuffer(), i);
                spdyByteArray.recycle();
                this.zstdStreamInflater.setInput(retrieveAndCopy2.getBuffer(), 0, retrieveAndCopy2.getDataLength());
            } else {
                byte[] copyOf = Arrays.copyOf(spdyByteArray.getByteArray(), spdyByteArray.getDataLength());
                spdyByteArray.recycle();
                this.zstdStreamInflater.setInput(copyOf, 0, copyOf.length);
            }
            byte[] bArr = new byte[131072];
            while (true) {
                try {
                    decompress = this.zstdStreamInflater.decompress(bArr);
                    this.rspBodyInflateSize += Math.max(decompress, 0);
                    if (decompress <= 0) {
                        break;
                    }
                    ByteArray retrieveAndCopy3 = ByteArrayPool.getInstance().retrieveAndCopy(bArr, decompress);
                    this.request.rs.bodyDeflatedRefer = 2;
                    this.request.rs.bodyDeflatedRet = 1;
                    this.callback.onDataReceive(retrieveAndCopy3, z && this.zstdStreamInflater.frameFinished());
                } catch (Exception e) {
                    this.request.rs.bodyDeflatedRefer = 2;
                    this.request.rs.bodyDeflatedRet = 0;
                    this.request.rs.rspDecompressionTime = System.currentTimeMillis() - this.recDataStart;
                    this.callback.onFinish(ErrorConstant.ERROR_ZSTD_STREAM_CATCH_EXCEPTION, str + " zstd stream catch error", this.request.rs);
                    String exc = e.toString();
                    ALog.e(TnetSpdySession.TAG, str + " zstd stream catch error=" + exc, this.request.getSeq(), " bizReqId", this.request.rs.bizReqId);
                    try {
                        ZstdErrorStatistic zstdErrorStatistic = new ZstdErrorStatistic(this.request.getHost(), this.request.getUrlString(), "nw_zstd_error");
                        int indexOf = exc.indexOf("errCode=");
                        String str2 = "";
                        if (indexOf != -1) {
                            str2 = exc.substring(indexOf + 8);
                        }
                        zstdErrorStatistic.errorCode = str2;
                        AppMonitor.getInstance().commitStat(zstdErrorStatistic);
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
            }
            if (!z) {
                return;
            }
            zstdStreamFinish("zstdStreamDecompress_2", ByteArrayPool.getInstance().retrieveAndCopy(bArr, decompress));
        }

        private void zstdStreamFinish(String str, ByteArray byteArray) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("26fe07ce", new Object[]{this, str, byteArray});
            } else if (this.zstdStreamInflater.frameFinished()) {
                this.zstdStreamInflater.close();
                ZstdDecompressDict zstdDecompressDict = this.zstdDecompressDict;
                if (zstdDecompressDict != null) {
                    zstdDecompressDict.a();
                }
                this.request.rs.bodyDeflatedRefer = 2;
                this.request.rs.bodyDeflatedRet = 1;
                this.request.rs.rspDecompressionTime = System.currentTimeMillis() - this.recDataStart;
                this.callback.onDataReceive(byteArray, true);
                ALog.e(TnetSpdySession.TAG, str + " zstd stream close ", this.request.getSeq(), new Object[0]);
            } else {
                this.request.rs.bodyDeflatedRefer = 2;
                this.request.rs.bodyDeflatedRet = 0;
                this.request.rs.rspDecompressionTime = System.currentTimeMillis() - this.recDataStart;
                RequestCb requestCb = this.callback;
                requestCb.onFinish(ErrorConstant.ERROR_ZSTD_STREAM_EXCEPTION, str + " zstd stream error", this.request.rs);
                ALog.e(TnetSpdySession.TAG, str + " zstd stream  error ", this.request.getSeq(), " bizReqId", this.request.rs.bizReqId);
                try {
                    AppMonitor.getInstance().commitStat(new ZstdErrorStatistic(this.request.getHost(), this.request.getUrlString(), "nw_zstd_error"));
                } catch (Exception unused) {
                }
            }
        }

        private void commitCalculateMd5Stream(String str, byte[] bArr, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("de26b22d", new Object[]{this, str, bArr, new Boolean(z)});
            } else if (!this.isMd5Open) {
            } else {
                if (bArr != null && bArr.length != 0) {
                    this.messageDigest.update(bArr, 0, bArr.length);
                }
                if (!z) {
                    return;
                }
                Md5Statistic md5Statistic = new Md5Statistic(this.request.rs.retryTimes, this.referer, this.request.rs.url);
                if (!StringUtils.calculateMD5(this.md5ExpectedStr, this.messageDigest)) {
                    md5Statistic.md5Ret = 0;
                    RequestCb requestCb = this.callback;
                    requestCb.onFinish(ErrorConstant.ERROR_MD5_EXCEPTION, str + "md5 error", this.request.rs);
                } else {
                    md5Statistic.md5Ret = 1;
                }
                this.messageDigest = null;
                this.request.rs.md5Ret = md5Statistic.md5Ret;
                ALog.e(TnetSpdySession.TAG, md5Statistic.toString(), this.request.getSeq(), new Object[0]);
                AppMonitor.getInstance().commitStat(md5Statistic);
            }
        }

        @Override // anet.channel.session.DftSpdyCb, org.android.spdy.Spdycb
        public void spdyStreamCloseCallback(SpdySession spdySession, long j, int i, Object obj, SuperviseData superviseData) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3bce1581", new Object[]{this, spdySession, new Long(j), new Integer(i), obj, superviseData});
                return;
            }
            if (ALog.isPrintLog(1)) {
                ALog.d(TnetSpdySession.TAG, "spdyStreamCloseCallback", this.request.getSeq(), "streamId", Long.valueOf(j), "errorCode", Integer.valueOf(i), " bizReqId", this.request.rs.bizReqId);
            }
            if (this.isZstdDictDecompressOpened && EncodingHelper.isZstdValid() && this.zstdResponseHelper != null) {
                ALog.e(TnetSpdySession.TAG, "[zstd-d] dueToZstdLinkDictionary!", this.request.getSeq(), new Object[0]);
                this.zstdResponseHelper.dueToLinkDictionary(this.urlKey, this.request.getSeq());
            }
            if (i != 0) {
                this.statusCode = ErrorConstant.ERROR_TNET_REQUEST_FAIL;
                str = ErrorConstant.formatMsg(ErrorConstant.ERROR_TNET_REQUEST_FAIL, String.valueOf(i));
                if (i != -2005) {
                    AppMonitor.getInstance().commitStat(new ExceptionStatistic(-300, str, this.request.rs, null));
                }
                ALog.e(TnetSpdySession.TAG, "spdyStreamCloseCallback error", this.request.getSeq(), MspGlobalDefine.SESSION, TnetSpdySession.this.mSeq, "status code", Integer.valueOf(i), MonitorItemConstants.KEY_URL, this.request.getHttpUrl().simpleUrlString(), " bizReqId", this.request.rs.bizReqId);
            } else {
                str = "SUCCESS";
            }
            if (this.request.rs.bodyDeflatedRefer == 0 || this.request.rs.bodyDeflatedRefer == 2) {
                this.request.rs.bodyDeflatedType = EncodingHelper.getBodyDeflatedType(this.contentEncoding);
            }
            this.request.rs.tnetErrorCode = i;
            setStatisticData(superviseData, this.statusCode, str);
            RequestCb requestCb = this.callback;
            if (requestCb != null) {
                requestCb.onFinish(this.statusCode, str, this.request.rs);
            }
            if (AwcnConfig.isZstdDictDecompressMtopEnable() && EncodingHelper.isZstdValid() && this.request.rs.bodyDeflatedRet == 0 && this.request.rs.bodyDeflatedType == 4) {
                ZstdDictHelper.updateZstdDictFail(this.urlKey, this.request.getSeq());
            }
            if (i != -2004) {
                return;
            }
            if (!TnetSpdySession.this.mHasUnrevPing) {
                TnetSpdySession.this.ping(true);
            }
            if (TnetSpdySession.access$1504(TnetSpdySession.this) < 2) {
                return;
            }
            ConnEvent connEvent = new ConnEvent();
            connEvent.isSuccess = false;
            connEvent.isAccs = TnetSpdySession.access$300(TnetSpdySession.this);
            connEvent.isTunnel = TnetSpdySession.this.isTunnel;
            connEvent.isForceCell = TnetSpdySession.access$400(TnetSpdySession.this);
            connEvent.useProxyStrategy = TnetSpdySession.this.useProxyStrategy;
            StrategyCenter.getInstance().notifyConnEvent(TnetSpdySession.access$1600(TnetSpdySession.this), TnetSpdySession.access$1700(TnetSpdySession.this), connEvent);
            TnetSpdySession.this.close(true, "continuous -2004");
        }

        private void setStatisticData(SuperviseData superviseData, int i, String str) {
            String str2;
            boolean z;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f0723e37", new Object[]{this, superviseData, new Integer(i), str});
                return;
            }
            try {
                this.request.rs.rspEnd = System.currentTimeMillis();
                AnalysisFactory.getV3Instance().log(this.request.rs.span, "netRspRecvEnd", null);
                if (this.request.rs.isDone.get()) {
                    return;
                }
                this.request.rs.sessionCloseReason = TnetSpdySession.this.mSessionStat.closeReason;
                if (i > 0) {
                    this.request.rs.ret = 1;
                    TnetSpdySession.access$1802(TnetSpdySession.this, true);
                }
                this.request.rs.statusCode = i;
                this.request.rs.msg = str;
                if (superviseData == null) {
                    return;
                }
                if (this.request.rs.bodyDeflatedRefer == 1) {
                    this.request.rs.bodyDeflatedType = superviseData.bodyDeflatedType;
                }
                this.request.rs.fecRecoverCnt = superviseData.fecRecoverCnt;
                this.request.rs.fecProtected = superviseData.fecProtected;
                this.request.rs.streamId = superviseData.streamId;
                this.request.rs.rspEnd = superviseData.responseEnd;
                this.request.rs.rspDecompressionTime = superviseData.rspDecompressionTime;
                if (this.request.rs.waitConnectStat == -1) {
                    this.request.rs.waitConnectStat = superviseData.waitConnectStat;
                }
                this.request.rs.tnetSendStart = superviseData.sendStart;
                this.request.rs.tnetStreamPktSendStart = superviseData.streamPktSendStart;
                this.request.rs.tnetStreamPktRecvStart = superviseData.streamPktRecvStart;
                this.request.rs.tnetStreamRecvStart = superviseData.streamRecvStart;
                this.request.rs.tnetResponseStart = superviseData.responseStart;
                this.request.rs.sendBeforeTime = superviseData.sendStart - superviseData.requestStart;
                this.request.rs.sendDataTime = superviseData.sendEnd - this.request.rs.sendStart;
                if (superviseData.responseStart - superviseData.sendEnd > 0) {
                    this.request.rs.firstDataTime = superviseData.responseStart - superviseData.sendEnd;
                    RequestStatistic requestStatistic = this.request.rs;
                    long j = this.request.rs.firstChunkTime;
                    str2 = TnetSpdySession.TUNNEL_CID;
                    requestStatistic.putExtra("firstDataChunkTime", Long.valueOf(j - superviseData.responseStart));
                    this.request.rs.putExtra("streamH2bTime", Long.valueOf(superviseData.streamRecvBodyStart - superviseData.streamRecvStart));
                    this.request.rs.putExtra("rspH2bTime", Long.valueOf(superviseData.responseBodyStart - superviseData.responseStart));
                    this.request.rs.putExtra("rspCbH2bTime", Long.valueOf(this.request.rs.firstChunkTime - this.responseStart));
                    this.request.rs.putExtra("fbTimeTrace", superviseData.streamRecvStart + "-" + superviseData.responseStart + "-" + this.responseStart + "-" + superviseData.streamRecvBodyStart + "-" + superviseData.responseBodyStart + "-" + this.request.rs.firstChunkTime + "|" + this.request.rs.responseCbStart);
                } else {
                    str2 = TnetSpdySession.TUNNEL_CID;
                }
                if (superviseData.responseEnd - superviseData.responseStart > 0) {
                    this.request.rs.recDataTime = superviseData.responseEnd - superviseData.responseStart;
                } else if (this.responseStart != 0) {
                    this.request.rs.recDataTime = System.currentTimeMillis() - this.responseStart;
                }
                this.request.rs.putExtra("tnetExternStat", superviseData.getExternStat());
                this.request.rs.putExtra("recvBodyTime", Long.valueOf(superviseData.responseEnd - superviseData.responseBodyStart));
                this.request.rs.tnetTotalTime = superviseData.responseEnd - superviseData.requestStart;
                this.request.rs.streamTotalTime = superviseData.responseEnd - superviseData.sendStart;
                this.request.rs.streamRecvTime = superviseData.streamRecvTime;
                this.request.rs.sendDataSize = superviseData.bodySize + superviseData.compressSize;
                this.request.rs.recDataSize = this.recDataCount + superviseData.recvUncompressSize;
                this.request.rs.reqHeadInflateSize = superviseData.uncompressSize;
                this.request.rs.reqHeadDeflateSize = superviseData.compressSize;
                this.request.rs.reqBodyInflateSize = superviseData.bodySize;
                this.request.rs.reqBodyDeflateSize = superviseData.bodySize;
                this.request.rs.rspHeadDeflateSize = superviseData.recvCompressSize;
                this.request.rs.rspHeadInflateSize = superviseData.recvUncompressSize;
                if (this.request.rs.bodyDeflatedRefer != 1) {
                    this.request.rs.rspBodyDeflateSize = this.recDataCount;
                    this.request.rs.rspBodyInflateSize = this.rspBodyInflateSize;
                } else {
                    this.request.rs.rspBodyDeflateSize = superviseData.recvBodySize;
                    this.request.rs.rspBodyInflateSize = this.recDataCount;
                }
                if (this.request.rs.contentLength == 0) {
                    this.request.rs.contentLength = superviseData.originContentLength;
                }
                TnetSpdySession.this.mSessionStat.recvSizeCount += superviseData.recvBodySize + superviseData.recvCompressSize;
                TnetSpdySession.this.mSessionStat.sendSizeCount += superviseData.bodySize + superviseData.compressSize;
                this.request.rs.srtt = superviseData.srtt;
                this.request.rs.minRtt = superviseData.minRtt;
                this.request.rs.connInFlight = superviseData.connInFlight;
                this.request.rs.recvLimitBps = superviseData.rateLimit;
                this.request.rs.pktRetransRate = superviseData.streamPktRetrans / superviseData.streamPktSend;
                SRttMonitor.putDomainSRtt(this.request.getHost(), superviseData.srtt);
                if (TnetSpdySession.access$1900(TnetSpdySession.this).isHTTP3() && TnetSpdySession.this.isTunnel) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put(TnetSpdySession.TUNNEL_0RTT_STATUS, superviseData.tunnel0RTTStatus);
                        jSONObject.put(TnetSpdySession.TUNNEL_DEGRADED, superviseData.tunnelDegraded);
                        jSONObject.put("errorCode", superviseData.tunnelErrorCode);
                        jSONObject.put(TnetSpdySession.TUNNEL_RETRY_TIMES, superviseData.tunnelRetryTimes);
                        jSONObject.put(TnetSpdySession.TUNNEL_TYPE, superviseData.tunnelType);
                        if (TnetSpdySession.access$2000(TnetSpdySession.this) != null) {
                            jSONObject.put("ip", TnetSpdySession.access$2000(TnetSpdySession.this).get("ip"));
                            jSONObject.put(str2, TnetSpdySession.access$2000(TnetSpdySession.this).get(str2));
                        }
                        this.request.rs.tunnelInfo = jSONObject.toString();
                    } catch (Exception e) {
                        ALog.e(TnetSpdySession.TAG, "[Tunnel Info Error]", TnetSpdySession.this.mSeq, e, " bizReqId", this.request.rs.bizReqId);
                    }
                }
                if (TnetSpdySession.access$2100(TnetSpdySession.this).isHTTP3()) {
                    TnetSpdySession tnetSpdySession = TnetSpdySession.this;
                    if (superviseData.reqMultipathStatus != 1 && superviseData.reqMultipathStatus != 2) {
                        z = false;
                        TnetSpdySession.access$2202(tnetSpdySession, z);
                        this.request.rs.isUseMPQuic = TnetSpdySession.access$2200(TnetSpdySession.this);
                        this.request.rs.isMPQuic = TnetSpdySession.this.mSessionStat.isMPQuic;
                        this.request.rs.mpquicStatus = superviseData.reqMultipathStatus;
                        this.request.rs.mpquicSendWeight = superviseData.defaultPathSendWeight;
                        this.request.rs.mpquicRecvWeight = superviseData.defaultPathRecvWeight;
                        if (TnetSpdySession.access$2200(TnetSpdySession.this) && GlobalAppRuntimeInfo.isAppBackground()) {
                            ALog.e(TnetSpdySession.TAG, "[setStatisticData]mpquic use in background.", TnetSpdySession.this.mSeq, " bizReqId", this.request.rs.bizReqId);
                        }
                    }
                    z = true;
                    TnetSpdySession.access$2202(tnetSpdySession, z);
                    this.request.rs.isUseMPQuic = TnetSpdySession.access$2200(TnetSpdySession.this);
                    this.request.rs.isMPQuic = TnetSpdySession.this.mSessionStat.isMPQuic;
                    this.request.rs.mpquicStatus = superviseData.reqMultipathStatus;
                    this.request.rs.mpquicSendWeight = superviseData.defaultPathSendWeight;
                    this.request.rs.mpquicRecvWeight = superviseData.defaultPathRecvWeight;
                    if (TnetSpdySession.access$2200(TnetSpdySession.this)) {
                        ALog.e(TnetSpdySession.TAG, "[setStatisticData]mpquic use in background.", TnetSpdySession.this.mSeq, " bizReqId", this.request.rs.bizReqId);
                    }
                }
                ALog.e(TnetSpdySession.TAG, "[falcoId:" + this.request.rs.falcoId + "] [setStatisticData]", this.request.getSeq(), "tnetStat", superviseData.superviseDataToString(), MspGlobalDefine.SESSION, TnetSpdySession.this.mSeq, " bizReqId", this.request.rs.bizReqId);
            } catch (Exception unused) {
            }
        }

        @Override // anet.channel.session.DftSpdyCb, org.android.spdy.Spdycb
        public void spdyOnStreamResponse(SpdySession spdySession, long j, Map<String, List<String>> map, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9fdf60d3", new Object[]{this, spdySession, new Long(j), map, obj});
                return;
            }
            this.responseStart = System.currentTimeMillis();
            this.request.rs.rspStart = this.responseStart;
            this.request.rs.firstDataTime = this.responseStart - this.request.rs.sendStart;
            this.statusCode = HttpHelper.parseStatusCode(map);
            TnetSpdySession.access$1502(TnetSpdySession.this, 0);
            ALog.i(TnetSpdySession.TAG, "", this.request.getSeq(), "statusCode", Integer.valueOf(this.statusCode), " bizReqId", this.request.rs.bizReqId);
            ALog.i(TnetSpdySession.TAG, "", this.request.getSeq(), "response headers", map, " bizReqId", this.request.rs.bizReqId);
            this.contentEncoding = HttpHelper.getSingleHeaderFieldByKey(map, HttpConstant.CONTENT_ENCODING);
            this.md5ExpectedStr = HttpHelper.getSingleHeaderFieldByKey(map, HttpConstant.Content_MD52);
            this.referer = this.request.getHeaders().get(HttpConstant.REFERER);
            this.isMd5Open = AwcnConfig.isMd5Open(this.request.getUrlString(), this.referer) && this.md5ExpectedStr != null;
            this.request.rs.contentEncoding = this.contentEncoding;
            this.request.rs.contentLength = HttpHelper.parseContentLength(map);
            this.isZstd = "zstd".equalsIgnoreCase(this.contentEncoding);
            this.request.rs.isZstdNotReadyUse = !EncodingHelper.isZstdValid() && this.isZstd;
            this.isGzip = "gzip".equalsIgnoreCase(this.contentEncoding);
            this.isZstdDict = "zstd-d".equalsIgnoreCase(this.contentEncoding);
            this.useAsDictionaryStr = HttpHelper.getSingleHeaderFieldByKey(map, "Use-As-Dictionary");
            this.LatestDictionaryStr = HttpHelper.getSingleHeaderFieldByKey(map, "Latest-Dictionary");
            this.urlKey = this.request.getHttpUrl().host() + this.request.getHttpUrl().path();
            DispatchZstdDictEvent dispatchZstdDictEvent = ZstdDictHelper.getDispatchZstdDictEvent(this.urlKey, this.request.rs.isZstdDictFlag == 1, this.request.rs.contentEncoding, this.useAsDictionaryStr, this.LatestDictionaryStr, this.request.getSeq());
            if (dispatchZstdDictEvent != null) {
                this.zstdResponseHelper = new ZstdResponseHelper().parseZstdResponseHeader(dispatchZstdDictEvent.urlKey, dispatchZstdDictEvent.contentEncodeStr, dispatchZstdDictEvent.useAsDictionaryStr, dispatchZstdDictEvent.LatestDictionaryStr, this.request.getSeq());
            }
            if (this.contentEncoding != null && (this.isZstd || this.isGzip || this.isZstdDict)) {
                ALog.e(TnetSpdySession.TAG, "spdyOnStreamResponse contentEncoding=" + this.contentEncoding + " ,contentLength=" + this.request.rs.contentLength, this.request.getSeq(), " bizReqId", this.request.rs.bizReqId);
                HttpHelper.removeHeaderFiledByKey(map, HttpConstant.CONTENT_ENCODING);
                HttpHelper.removeHeaderFiledByKey(map, "Content-Length");
                if (this.isZstd || this.isZstdDict) {
                    this.zstdStreamInflater = new ZstdStreamInflater();
                }
            }
            RequestCb requestCb = this.callback;
            if (requestCb != null) {
                requestCb.onResponseCode(this.statusCode, HttpHelper.cloneMap(map));
            }
            TnetSpdySession.access$2300(TnetSpdySession.this, 16, null);
            this.request.rs.server_cc = HttpHelper.getSingleHeaderFieldByKey(map, HttpConstant.QUIC_CO_TAGS);
            this.request.rs.contentType = HttpHelper.getSingleHeaderFieldByKey(map, "Content-Type");
            this.request.rs.serverRT = HttpHelper.parseServerRT(map, 1);
            this.request.rs.serverBRT = HttpHelper.parseServerRT(map, 2);
            this.request.rs.eagleEyeId = HttpHelper.parseEagleId(map);
            this.request.rs.isHitCache = HttpHelper.parseCache(map);
            this.request.rs.hitCache = HttpHelper.parseXCache(map);
            this.request.rs.via = HttpHelper.parseVia(map);
            TnetSpdySession.access$2400(TnetSpdySession.this, this.request, this.statusCode);
            TnetSpdySession.access$2500(TnetSpdySession.this, this.request, map);
            if (TnetSpdySession.this.heartbeat == null) {
                return;
            }
            TnetSpdySession.this.heartbeat.reSchedule();
        }
    }
}
